package case_Statement;
import java.util.Scanner;
public class Vowels_Cosonennt_Check
{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a character: ");
            char ch = scanner.next().charAt(0);
            scanner.close();

            switch (Character.toLowerCase(ch)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println(ch + " is a vowel.");
                    break;
                default:
                    if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                        System.out.println(ch + " is a consonant.");
                    } else {
                        System.out.println(ch + " is not a valid character.");
                    }
                    break;
            }
        }
    }

