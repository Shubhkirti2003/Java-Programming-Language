import java.io.*;
import java.util.*;
class Notice
{
 public static void append()
 {
   String strFilePath = "C:/Users/DK Sharma/Desktop/Java Programs/NoticeBoardManagementSystem.txt";
   try {
        Scanner sc = new Scanner(System.in);                                          
        FileOutputStream fos = new FileOutputStream(strFilePath, true);               
        System.out.print("Enter a Reference no: ");
        String str1= sc.nextLine();   
        System.out.print("Enter a new notice: ");
        String str2 = sc.nextLine();                                                      
         
        String str3 = " : ";
        String strContent = str1 + str3 + str2;                                       
        fos.write("\n".getBytes()); 
        fos.write(strContent.getBytes());                                             
        
        fos.close();                                                                  
        System.out.println("Content Successfully Append into File...");
        } 
        catch (FileNotFoundException ex) 
        {
         System.out.println("FileNotFoundException : " + ex.toString());
        } 
        catch (IOException ioe)
        {
         System.out.println("IOException : " + ioe.toString());
        } 
        catch (Exception e) 
        {
         System.out.println("Exception: " + e.toString());
        }
 }

 public static void display()
 {
  String fname;
  fname = "C:/Users/DK Sharma/Desktop/Java Programs/NoticeBoardManagementSystem.txt";
  String line = null;
  try
  {
   FileReader fileReader = new FileReader(fname);
   BufferedReader bufferedReader = new BufferedReader(fileReader);                    
   while((line = bufferedReader.readLine()) != null)
   {
    System.out.println(line);
   }
   bufferedReader.close();                                                           
  }
  catch(IOException ex)
  {
   System.out.println("\nError occurred");
   System.out.println("Exception Name: " +ex);
  }
 }

 public static void view()
  {
  String fname;
  fname = "C:/Users/DK Sharma/Desktop/Java Programs/NoticeBoardManagementSystem.txt";
  String line = null;
  try
  {
   FileReader fileReader = new FileReader(fname);
   BufferedReader bufferedReader = new BufferedReader(fileReader);                    
   while((line = bufferedReader.readLine()) != null)
   {
    System.out.println(line);
   }
   bufferedReader.close();                                                           
  }
  catch(IOException ex)
  {
   System.out.println("\nError occurred");
   System.out.println("Exception Name: " +ex);
  }
 }

 public static void update()
 {
  String filePath =  "C:/Users/DK Sharma/Desktop/Java Programs/NoticeBoardManagementSystem.txt";                         
try{
  Scanner sc = new Scanner(new File(filePath));                                     
  StringBuffer buffer = new StringBuffer();                                         
  while (sc.hasNextLine()) 
  {
   buffer.append(sc.nextLine()+System.lineSeparator());
  }
  String fileContents = buffer.toString();
 
  sc.close();                                                                      
  Scanner Sc = new Scanner(System.in);
  System.out.print("Old Notice: ");
  String oldLine = Sc.nextLine();
  System.out.print("New Notice: ");
  String newLine = Sc.nextLine();
  fileContents = fileContents.replaceAll(oldLine, newLine);                       
  FileWriter writer = new FileWriter(filePath);                                    
  System.out.println("");
  System.out.println("new data: "+fileContents);
  writer.append(fileContents);
  writer.flush();
  }
catch(IOException ex)
  {
   System.out.println("\nError occurred");
   System.out.println("Exception Name: " +ex);
  }
 }


 public static void remove()
 {
  File input = new File("C:/Users/DK Sharma/Desktop/Java Programs/NoticeBoardManagementSystem.txt");
  
   
  try {
       FileReader fr = null;
       Scanner ob = new Scanner(System.in);
       String Searchword,str;
       System.out.print("Enter Reference number of the notice, you want to remove: ");
       Searchword = ob.nextLine();
       fr = new FileReader(input);
       BufferedReader br = new BufferedReader(fr);
       while((str=br.readLine())!=null)
       {
        if(str.contains(Searchword))
        {
         String filePath =  "C:/Users/DK Sharma/Desktop/Java Programs/NoticeBoardManagementSystem.txt";                         
         Scanner sc = new Scanner(new File(filePath));                                     
         StringBuffer buffer = new StringBuffer();                                         
         while (sc.hasNextLine()) 
         {
          buffer.append(sc.nextLine()+System.lineSeparator());
         }
         String fileContents = buffer.toString();
         sc.close();                                                                      
         String newLine = "";
         fileContents = fileContents.replaceAll(str, newLine);                       
         FileWriter writer = new FileWriter(filePath);                                    
         System.out.println("Notice successfully removed.");
         writer.append(fileContents);
         writer.flush();
        }
       }
       fr.close();
      }                                                                  
        
      catch (FileNotFoundException ex) 
      {
        System.out.println("FileNotFoundException : " + ex.toString());
        } 
        catch (IOException ioe)
        {
         System.out.println("IOException : " + ioe.toString());
        } 
        catch (Exception e) 
        {
         System.out.println("Exception: " + e.toString());
        }
 }

 public static void clearfile()
 { 
  try{

    FileWriter fw = new FileWriter("C:/Users/DK Sharma/Desktop/Java Programs/NoticeBoardManagementSystem.txt", false);

    PrintWriter pw = new PrintWriter(fw, false);

    pw.flush();

    pw.close();

    fw.close();
    System.out.print("File successfully cleared.");

    }
    catch(Exception exception){

        System.out.println("Exception have been caught");

    }

 }
}

class Student
{
 static void student()
 {
  System.out.println("-----------Options---------");
  System.out.println("1. Enter V for view.");
  System.out.println("2. Enter E for exit.");
  System.out.print("Your choice is: ");
  Scanner sc = new Scanner(System.in);
  char choice = sc.next().charAt(0);
  switch(choice)
  {
   case 'V':
   case 'v':
   {
    Notice.view();
    break;
   }
   case 'E':
   case 'e':
   {
    break;
   }
   default:
   {
    System.out.println("Thanks for visit.");
   }
  }
 }
}
 
 
class Admin
{
 static void admin()
 {
  System.out.println("-----------Options---------");
  System.out.println("1. Enter V for display.");
  System.out.println("2. Enter A for add.");
  System.out.println("3. Enter D for delete.");
  System.out.println("4. Enter U for update.");
  System.out.println("5. Enter E for exit.");
  System.out.print("Your choice is: ");
  Scanner sc = new Scanner(System.in);
  char choice = sc.next().charAt(0);
  do
{
    switch(choice)
  {
   case 'V':
   case 'v':
   {
    Notice.display();
    break;
   }
   case 'A':
   case 'a':
   {
    Notice.append();
    break;
   }
   case 'D':
   case 'd':
   {
    System.out.println("-----------Menu---------");
    System.out.println("1. Enter D to delete particular notice.");
    System.out.println("2. Enter C to delete all notices.");
    System.out.print("Your choice is: ");
    
    char option = sc.next().charAt(0);
    switch(option)
  {
   case 'D':
   case 'd':
   {
    Notice.remove();
    break;
   }
   case 'C':
   case 'c':
   {
    Notice.clearfile();
    break;
   }
    
   }
    break;
   }
   case 'U':
   case 'u':
   {
    Notice.update();
    break;
   }
   
   
  }
  System.out.println("Enter your choice again.");
  System.out.println("1. Enter V for display.");
  System.out.println("2. Enter A for add.");
  System.out.println("3. Enter D for delete.");
  System.out.println("4. Enter U for update.");
  System.out.println("5. Enter E for exit.");
  System.out.print("Your choice is: ");
  choice = sc.next().charAt(0);
 }while(choice != 'E');
}
}


class User_Authentication 
{
 public static void main(String[] args)
 {
  String username, password;
  Scanner s = new Scanner(System.in);
  System.out.print("Enter username:");                      
  username = s.nextLine();
  System.out.print("Enter password:");                     
  password = s.nextLine();
  if(username.equals("Shubhkirti") && password.equals("12345"))
  {
   System.out.println("");
   System.out.println("Welcome Student.");
   System.out.println("");
   Student.student();
  }
  else if(username.equals("Yaman") && password.equals("09876"))
  {
   System.out.println("");
   System.out.println("Welcome Admin.");
   System.out.println("");
   Admin.admin();
  }
  else
  {
   System.out.println("Authentication Failed");
  }
 }
}