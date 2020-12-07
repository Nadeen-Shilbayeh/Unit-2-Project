//import libraries to to create files
import java.io.file;
import java.io.IOException;
//import Filewriter
import java.io.FileWriter;
//import scanner
import java.util.Scanner;

class Main {
  public static void main(String[] args) throws IOException {
    //declaring variables and scanners
    File myFile = new File("filename.txt");
    myFile.createNewFile();
  }