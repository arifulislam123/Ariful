
import java.util.Arrays;
import java.util.Scanner;

/** package string.problems;

/**
 * Created by ARIFUL on 04/10/20.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        // String a = "CAT";
        //       String b = "ARMY";
        //
        //
        Scanner in = new Scanner(System.in);

       System.out.println("Enter two string");

         String str1 = in.nextLine();
         String str2 = in.nextLine();


         char arr1[] = str1.toCharArray();
         char arr2[] = str2.toCharArray();

        String sortedstr1= new String(arr1);
        String sortedstr2 = new String(arr2);

          /* Arrays.sort(arr1);
          Arrays.sort(arr2);
          String sorteda = new String(x);
          String sortedb = new String(x);

           */
    if (sortedstr1.equals(sortedstr2)) {

        System.out.println("Sting is Anagram");
    }
        else {
        System.out.println("Sting is Anagram");


        System.out.println("Sting is not Anagram");


    }
    }


    }










