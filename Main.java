//import libraries to to create files
import java.io.File;
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
    int [] quantity = new int[5];
    double [] price = {5.5,6.5,2.5,1.4,1.0};
    int menuOption;
    Scanner input = new Scanner(System.in);


    //output screen
    while (counter <= 5 || keepUsing)
    {
    System.out.println("Choose an item from the menu:");
    System.out.println("1.Burgers $5.5\n2.Hot Dog $6.5\n3.Fries %2.5\n4.Milk Shake $ 1.4\n5.Water $1.0");
    menuOption = Integer.parseInt(input.nextLine());
    System.out.println("How many of them would you like");
    quantity [menuOption] = Integer.parseInt(input.nextLine());

    }
  }
}