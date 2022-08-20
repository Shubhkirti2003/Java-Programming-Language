import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class ReadFromFile {
  public static void main(String[] args) {
    try {
      File f1 = new File("D:FileOperationExample.txt");
      Scanner dataReader = new Scanner(f1);
      while (dataReader.hasNextLine()) {
        String fileData = dataReader.nextLine();
        System.out.println(fileData);
      }
      dataReader.close();
    } catch (FileNotFoundException exception) {
      System.out.println("Unexpected error occured!");
      exception.printStackTrace();
    }
  }
}