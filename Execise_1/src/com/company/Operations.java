package com.company;

import java.util.Hashtable;

public class Operations {
    public static void AddInBaseStudents(Hashtable<String,String> user)
    {
        user.put("Shotiko", "Bichiashvili");
        user.put("Giorgi", "Kaladze");
        user.put("Admin", "Admin");
        user.put("User", "User");
        user.put("John", "Wick");
    }

    public static void AddNewStudent(String name, String lastName, Hashtable<String, String> userRepo) throws Exception
    {
        boolean userExists = CheckUser(name, lastName, userRepo);

        if(userExists == true)
        {
            System.out.println("User name: " + name + " and lastName: " + lastName + " is exists in database!" );
        }
        else if(userExists == false)
        {
            if(name == "" || lastName == "")
            {
                throw new Exceptions("Name or lastname is empty!");
            }
            userRepo.put(name, lastName);
            System.out.println("Student Registered successfully! :)");
        }
    }

    public static boolean CheckUser(String userName, String userLastName, Hashtable<String, String> userData)
    {
        if (userData.containsKey(userName) & userData.containsValue(userLastName))
        {
            return true;
        }
        else
            return false;
    }

    public static void ShowUserList(Hashtable user)
    {
        System.out.println(user.keys());
    }
}