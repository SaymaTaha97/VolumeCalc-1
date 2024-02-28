/*
input.txt where will save 4 column and 10 row. for radius, height, length, width.
VolumCalc argument sphereVolume and prism volume can be accesed.
first function sphereVolume, it will calculate the volume of sphere.
 sphereVolume(r){
 formula: 4/3 * pi * r^3
 }
 

second function prismVolume, it will calculate the volume of prism.
 prismVolume(l,w,h){
 formula: l * w * h
 }
 file write to output.txt
 
*/
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;


public class VolumeCalc {
  public static void main(String[] args) throws IOException {


    String inputFilename = "src/main/java/input.txt";
      String outputFilename = "output.txt";

    File inputFile = new File(inputFilename);
    File outputFile = new File(outputFilename);

    Scanner scanner = new Scanner(inputFile);
     PrintStream output  = new PrintStream(outputFile);

    while (scanner.hasNextLine()){
      String line = scanner.nextLine();
      String[] dimensions = line.split(" ");
      double radius = Double.parseDouble(dimensions[0]);
      double length = Double.parseDouble(dimensions[1]);
      double width = Double.parseDouble(dimensions[2]);
      double height = Double.parseDouble(dimensions[3]);

      

      double sphereVolume = sphereVolume(radius);
      double prismVolume = prismVolume(length, width, height);


      output.printf("Sphere = %.3f, Prism = %.3f%n", sphereVolume, prismVolume);
    }



    scanner.close();
    output.close();
    
  }
  

  private static double sphereVolume(double radius){
    double sVolume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);
    return sVolume;
  }
  private static double prismVolume(double length, double width, double height){
    double pVolume = length * width * height;
    return pVolume;
  }
}

