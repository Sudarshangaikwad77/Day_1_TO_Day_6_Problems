package day1Problems;

public class StringEqual
{
    public static void main(String[] args) {
            String str1 = "Hello";
            String str2 = "Hello";
            String str3 = "Hello";
            String str4 = "World";

            System.out.println("Using == operator:");
            System.out.println("str1 == str2: " + (str1 == str2)); // true
            System.out.println("str1 == str3: " + (str1 == str3)); // false
            System.out.println("str1 == str4: " + (str1 == str4)); // false

            System.out.println("\nUsing equals() method:");
            System.out.println("str1.equals(str2): " + str1.equals(str2)); // true
            System.out.println("str1.equals(str3): " + str1.equals(str3)); // true
            System.out.println("str1.equals(str4): " + str1.equals(str4)); // false
        }
    }

