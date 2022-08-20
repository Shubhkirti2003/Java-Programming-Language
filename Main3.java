import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;
public class Main3 {
    public static void main(String[] args) {
        try
        {
            FileWriter fw = new FileWriter("D:\\TestFile.Txt");
            BufferedWriter WriteFileBuffer = new BufferedWriter(fw);
            WriteFileBuffer.write("First Line");
            WriteFileBuffer.newLine();
            WriteFileBuffer.write("Second Line");
            WriteFileBuffer.newLine();
            WriteFileBuffer.write("Third Line");
            WriteFileBuffer.newLine();
            WriteFileBuffer.close();
            FileReader fr = new FileReader("C:\\TestFile.txt");
            BufferedReader ReadFileBuffer = new BufferedReader(fr);
            System.out.println(ReadFileBuffer.readLine());
            System.out.println(ReadFileBuffer.readLine());
            System.out.println(ReadFileBuffer.readLine());
            ReadFileBuffer.close();
        } catch (IOException Ex)
        {
            System.out.println(Ex.getMessage());
        }
    }
}