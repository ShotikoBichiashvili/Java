package com.company;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class Student  extends Operations
{
    private static String _name;
    private static String _lastName;
    private static Hashtable<String, String> _dataBase = new Hashtable<String, String>();

    public static void FillDatabase(Hashtable<String, String> base)
    {
        _dataBase = base;
        AddInBaseStudents(base);
    }
    public static void AddStudentBase(String name, String lastName, Hashtable<String, String> userRepository) throws Exception {
        _name = name;
        _lastName = lastName;
        _dataBase = userRepository;
        if(name.length() > 20)
        {
            throw new Exception("Name is too Long!");
        }
        AddNewStudent(name, lastName,userRepository);
    }
}