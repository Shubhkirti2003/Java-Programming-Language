import java.io.FileWriter;
import java.io.IOException;

class WriteToFile {
  public static void main(String[] args) {
    try {
      FileWriter fwrite = new FileWriter("D:FileOperationExample.txt");
      fwrite.write("A named location to store relation is reffered to as a file ");
      fwrite.close();
      System.out.println("content is successfully wrote to the file. ");
    } 
    catch (IOException e) {
      System.out.println("Unexpected error occurred ");
      e.printStackTrace();
    }
  }
}
