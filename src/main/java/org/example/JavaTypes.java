package org.example;

public class JavaTypes {
    public static void main(String[] args) {
        System.out.println("Java Types");

        //base java types
        //for numbers
        //int is for storing just numbers; age is variable
        int age = 10;
        System.out.println(age);
        age = 15;
        System.out.println(age);

        //storing string
        String myName = "Sigrit";
        System.out.println(myName);
        myName = "se";
        System.out.println(myName);

        System.out.println("My name is: " + myName);

        String surname = "E.";
        System.out.println("My surname is: " + surname);

        //name + surname
        System.out.println("My name is: " + myName + " " + surname);

        System.out.println("Now lets play with characters");
        //char is for storing just single characters
        char singleLetter = 'a';

        String singleLetterString = "a";

        System.out.println("minimum int number is: " + Integer.MIN_VALUE);
        System.out.println("maximum int number is: " + Integer.MAX_VALUE);

        long biggerNumber = 1;
        System.out.println("minimum long number is: " + Long.MIN_VALUE);
        System.out.println("maximum long numbe is: " + Long.MAX_VALUE);

        //short
        short smallNumber = 1;
        System.out.println("minimum short number is: " + Short.MIN_VALUE);
        System.out.println("maximum short numbe is: " + Short.MAX_VALUE);

        //byte
        byte byteNumber = 1;
        System.out.println("minimum byte number is: " + Byte.MIN_VALUE);
        System.out.println("maximum byte numbe is: " + Byte.MAX_VALUE);

        //boolean
        boolean trueOrFalse = true;
        trueOrFalse = false;

        boolean isAdult = age > 18;
        System.out.println(isAdult);
    }
}

