import java.awt.*;
import java.util.Scanner;

public class MainActivity {


    public static void  main(String [] args) {
        // Write a Java program to print 'Hello' on screen and then print your name on a separate line
        /**
        System.out.println("Hello \n"+ "Jay Ross");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first name: ");
        String fName = input.next();
        System.out.print("Enter Last Name: ");
        String lName = input.next();
        System.out.println("Hello \n"+ fName+ " "+ lName);
        */

        //Write a Java program to print the sum of two numbers
        /**
        System.out.print(74+36);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num1 =  input.nextInt();
        System.out.print("Enter 2nd Number: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum: "+ sum);
         */

        //Write a Java program to divide two numbers and print on the screen
        /**
        System.out.print(50/3);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num1 = input.nextInt();
        System.out.print("Enter another number: ");
        double num2 = input.nextInt();
        double sum = num1/num2;
        System.out.println("Total: "+ sum);
         */

        //Write a Java program to print the result of the following operations
        /**
        a. -5 + 8 * 6
        b. (55+9) % 9
        c. 20 + -3*5 / 8
        d. 5 + 15 / 3 * 2 - 8 % 3

        int t = -5 + 8 * 6;
        int v = (55+9) % 9;
        int w = 20 + (-3*5) / 9;
        int x = 5 + 15 / 3 *2 -8 % 3;

        System.out.println(t + "\n" + v + "\n"+ w + "\n"+ x);
            */

        //Write a Java program that takes two numbers as input and display the product of two numbers.
        /**
        int x = 25;
        int y = 5;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num1 = input.nextInt();
        System.out.print("Enter a Second Number: ");
        int num2 = input.nextInt();
        int sum = num1*num2;
        System.out.println(num1+ " x " + num2+ " = "+ sum); */


        //Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers

        int x = 125;
        int y = 24;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num1 = input.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        int sum1 = num1 - num2;
        int sum2 = num1 * num2;
        int sum3 = num1 / num2;
        int sum4 = num1 % num2;
        System.out.println(num1+ " + "+ num2+ " = "+ sum);
        System.out.println(num1+ " - "+ num2+ " = "+ sum1);
        System.out.println(num1+ " x "+ num2+ " = "+ sum2);
        System.out.println(num1+ " / "+ num2+ " = "+ sum3);
        System.out.println(num1+ " mod "+ num2+ " = "+ sum4);


        // Write a Java program that takes a number as input and prints its multiplication table upto 10

        Scanner input1 = new Scanner(System.in);
        System.out.println("Input the Number: ");

        int num3 = input1.nextInt();

        for (int i=0; i<10; i++) {

            System.out.println(num3 + " * " + (i + 1) + " = " + (num3 * (i + 1)));
        }

        // Write a Java program to compare two numbers.

        Scanner input3 = new Scanner(System.in);
        int number1;
        int number2;

        System.out.print("Input first inetger: ");
        number1 = input3.nextInt();

        System.out.print("Input Second Number: ");
        number2 = input3.nextInt();

        if (number1 == number2)
            System.out.printf( "%d == %d\n", number1, number2);

        if (number1 != number2)
            System.out.printf( "%d !== %d\n", number1, number2);

        if (number1 < number2)
            System.out.printf( "%d < %d\n", number1, number2);

        if (number1 > number2)
            System.out.printf( "%d > %d\n", number1, number2);

        if (number1 <= number2)
            System.out.printf( "%d <= %d\n", number1, number2);

        if (number1 >= number2)
            System.out.printf( "%d => %d\n", number1, number2);


        //Write a Java program and compute the sum of the digits of an integer.
        //Input Data:
        //Input an Integer: 25
        //Expected Output -> The sum of the digits is: 7

        Scanner input4 = new Scanner(System.in);
        System.out.print("Input an Integer: ");
        long number3 = input4.nextLong();
        System.out.println("The sum of the digits is: " + sumDigits(number3));




    }

        public static int sumDigits(long number3) {
            int sum = 0;
            while (number3 !=0){
                sum += number3 % 10;
                number3 /= 10;
            }
            return  sum;



        }


}