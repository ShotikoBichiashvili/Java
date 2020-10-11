package com.company;

import java.util.Hashtable;
import java.util.Scanner;

public class Main extends Student {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome, To Buisness and Technology University!");
        System.out.println("Please Choose Operation: ");

        System.out.println("1.Register\n2.Sign-In (Default: User, User)");
        System.out.print("Choose: ");
        int choose = in.nextInt();

        Hashtable<String, String> userData = new Hashtable<String, String>();
        FillDatabase(userData);

        if (choose == 1)
        {
            System.out.print("Input FirstName: ");
            String name = in.next();
            System.out.print("Input LastName: ");
            String lastName = in.next();

            AddStudentBase(name,lastName,userData);
        }
        else if (choose == 2)
        {
            System.out.print("Input FirstName: ");
            String name = in.next();
            System.out.print("Input LastName: ");
            String lastName = in.next();

            boolean login = CheckUser(name, lastName, userData);
            if (login == true)
            {
                System.out.println("Logined Successfully!");
            }
            else
                {
                    System.out.println("User with this Credintials isn't in Database!");
                }
        }
    }
}
