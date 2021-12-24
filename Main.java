

import java.util.*;
import java.io.PrintWriter; // Step 1
import java.io.IOException;


public class Main
{
    public static void main(String[] args)  throws IOException {
        PrintWriter pass = new PrintWriter("passwords.txt"); // Step 2
        System.out.println("Please enter your password:");
        Scanner passwrd = new Scanner(System.in);
        String a = passwrd.nextLine();
        System.out.println("Cracking Right now");
        System.out.println("50% done");
        System.out.println("Finnished");
        System.out.println("Your Password is : " + a);
        pass.println(a);
        passwrd.close();
        pass.close();



    }
}

