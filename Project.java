package FileHandling;
import java.util.*;
import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.FileReader;


public class Admin {
    public static void main(String[] args) throws IOException {
        String Username = null, Password = null;
        int choice = 1;
        Scanner sc = new Scanner(System.in);
        while (choice == 1) {
            System.out.println("Enter the Username = ");
            Username = sc.next();
            System.out.println("Enter the Password = ");
            Password = sc.next();

            if (Username.equals("Admin") && Password.equals("1234")) {
                System.out.println("Welcome Admin:-)");
                boolean condition = true;
                while (condition) {
                    System.out.println("Choose one of the following command to do with notices:-\n1.View\n2.Add" +
                            "\n3.Update\n4.Delete\n5.Exit");
                    int ListOption = sc.nextInt();
                    File myFile = new File("notices.txt");
                    switch (ListOption) {
                        case 1:
                            try {
                                Scanner sf = new Scanner(myFile);
                                List<String> arr = new ArrayList<String>();

                                while (sf.hasNextLine()) {

                                    String line = sf.nextLine();
                                    arr.add(line);
                                }
                                sf.close();
                                String[] tempsArray = arr.toArray(new String[0]);
                                for (String notice : tempsArray) {
                                    System.out.println(notice);
                                }


                            } catch (FileNotFoundException e) {
                                throw new RuntimeException(e);
                            }
                            System.out.println("May I help you with something else?");
                            break;
                        case 2:
                            System.out.println("Write the notice you want to add");
                            Scanner addc = new Scanner(System.in);
                            String addarray[] = new String[5];
                            for(int i=0;i<=0;){
                                addarray[i] = addc.nextLine();
                                i++;
                            }

                            try (FileWriter fileWriter = new FileWriter(myFile, true);
                                 BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)){
                                for(String str: addarray)
                                {
                                    bufferedWriter.append(str+"\n");
                                    bufferedWriter.close();
                                }
                            } catch (IOException e) {
                                System.out.println("Added Successfully");
                            }

                            System.out.println("May I help you with something else?");
                            break;

                        case 3:
                            Scanner updatec = new Scanner(new File(String.valueOf(myFile)));
                            Scanner value = new Scanner(System.in);
                            StringBuffer buffer = new StringBuffer();
                            while (updatec.hasNextLine()) {
                                buffer.append(updatec.nextLine()+System.lineSeparator());
                            }
                            String fileContents = buffer.toString();
                            System.out.println("Contents of the file: "+"\n"+fileContents);
                            //closing the Scanner object
                            System.out.println("Enter line to remove");
                            String oldLine = value.next() ;
                            System.out.println("Enter line to add");
                            String newLine = value.next();
                            fileContents = fileContents.replaceAll(oldLine, newLine);
                            FileWriter writer = new FileWriter(myFile);
                            System.out.println("");
                            System.out.println("new data: "+"\n"+fileContents);
                            writer.append(fileContents);
                            writer.flush();
                            System.out.println("May I help you with something else?");
                            break;
                        case 4:
                            try {
                                Scanner deletec = new Scanner(myFile);
                                List<String> arr1 = new ArrayList<String>();

                                while (deletec.hasNextLine()) {

                                    String line = deletec.nextLine();
                                    arr1.add(line);
                                }
                                for(String notice: arr1)
                                   {
                                       System.out.println(notice);

                                   }

//                                String[] tempsArray = arr1.toArray(new String[0]);
//                                String[] arr_new = new String[tempsArray.length-1];
                                Scanner del = new Scanner(System.in);
                                System.out.println("Enter notice to be deleted");
                                int j = del.nextInt();
                                arr1.remove(j-1);
//                                for(int i=0, k=0;i<tempsArray.length;i++){
//                                    if(i!=j){
//                                        arr_new[k]=tempsArray[i];
//                                        k++;
//                                    }
//                                    else{
//                                       continue;
//                                    }
//                                }
                                try {
                                    FileWriter fW = new FileWriter(myFile);
                                    //BufferedWriter bufferedWriter = new BufferedWriter(fW);
                                    for(String str: arr1)
                                    {

                                        // bufferedWriter.write(str+"\n");
                                        // bufferedWriter.close();
                                        fW.write(str + System.lineSeparator());
                                    }
                                    fW.close();
                                } catch (Exception e) {
                                    System.out.println("Deleted Successfully");
                                }
                                   for(String notice: arr1)
                                   {
                                       System.out.println(notice);

                                   }
                            }
                             catch (IOException e) {
                                System.out.println("removed Succesfully");
                            }
                            System.out.println("May I help you with something else?");
                            break;
                        case 5:
                            System.out.println("Thanks for using our Notice Management System, have a great day ahead.");
                            condition = false;
                            break;
                        default:
                            System.out.println("Invalid choice!");
                    }
                    choice++;
                }
            }
            else
                {
                    System.out.println("Invalid Username and Password");
                    choice = 1;

                }

            }

        }
    }
package com.company.adminn;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        String Username = null, Password = null;
        int choice = 1;
        Scanner sc = new Scanner(System.in);
        while (choice == 1) {
            System.out.println("Enter the Username = ");
            Username = sc.next();
            System.out.println("Enter the Password = ");
            Password = sc.next();

            if (Username.equals("xyz") && Password.equals("12345")) {
                System.out.println("Welcome Student:)");
                boolean condition = true;
                while (condition) {
                    System.out.println("Choose one of the following command to do with notices:-\n1.View\n2.Exit");
                    int ListOption = sc.nextInt();
                    File myFile = new File("/Users/rahulsangwan/IdeaProjects/FOCP Project" +
                            "/src/adminn/notices.txt");
                    switch (ListOption) {
                        case 1:
                            try {
                                Scanner sf = new Scanner(myFile);
                                List<String> arr = new ArrayList<String>();

                                while (sf.hasNextLine()) {

                                    String line = sf.nextLine();
                                    arr.add(line);
                                }
                                sf.close();
                                String[] tempsArray = arr.toArray(new String[0]);
                                for (String notice : tempsArray) {
                                    System.out.println(notice);
                                }


                            } catch (FileNotFoundException e) {
                                throw new RuntimeException(e);
                            }
                            System.out.println("May I help you with something else?");
                            break;
                        case 2:
                            System.out.println("Thanks for using our Notice Management System, have a great day ahead.");
                            condition = false;
                            break;
                        default:
                            System.out.println("Invalid choice!");
                    }
                    choice++;
                }
            } else {
                System.out.println("Thank you.");
                choice = 1;

            }

        }

    }
}
import java.util.Scanner;
public class Project
{
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("you are admin or student");
        String input = sc.nextLine();


        String admin;
        String student;


        if( input.equals(("admin"))){
            System.out.println("Login with your admin id");
            String adminid = sc.nextLine();
            System.out.println("enter your password");
            String pass = sc.nextLine();

            if (pass.equals(("@admin"))){
                System.out.println("The Notice Board");
        
        System.out.println("Press 1 for View");
        System.out.println("Press 2 for Add");
        System.out.println("Press 3 for Update");
        System.out.println("Press 4 for Delete");
        Scanner sc1 = new Scanner(System.in);
        int number = sc1.nextInt();
        switch (number) {
        case 1:
            System.out.println("You selected View option");
            break;
        case 2:
            System.out.println("You selected Display option");
            break;
        case 3:
            System.out.println("You selected Add option");
            break;
        case 4:
            System.out.println("You selected Update option");
            break;
        case 5:
            System.out.println("You selected Delete option");
            break;
        }
   
            }
            else{
                System.out.println("wrong password");
            }


        }
        else if (input.equals(("student")))
            {System.out.println("Login with your student id");
             String studentid = sc.nextLine();
             System.out.println("enter your password");
            String password = sc.nextLine();

             if (password.equals(("@student"))){
                System.out.println("The Notice Board");
         }
            else{
                System.out.println("wrong password");
            }
     }

        else {
            System.out.println("you are not valid member");
        }
    }
}