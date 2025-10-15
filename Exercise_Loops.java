import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exercise_Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("----------------------Exercise 1-----------------------------------------");
        System.out.println("------------------------FizzBuzz-----------------------------------");

        /*1. Write a program that prints the numbers from 1 to 100 such that:
        If the number is a multiple of 3, you need to print "Fizz" instead of that number.
        If the number is a multiple of 5, you need to print "Buzz" instead of that number.
        If the number is a multiple of both 3 and 5, you need to print "FizzBuzz" instead of that number.  */
        for  (int i = 1; i <= 100; i++) {
            if(i % 3 == 0&&i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            else if (i%3==0){
                System.out.println("Fizz");
            }
            else if (i%5==0){
                System.out.println("Buzz");
            }
            else{
            System.out.println(i);}
        }

        System.out.println("\n----------------------Exercise 2-----------------------------------------");
        System.out.println("------------------------Revers a string-----------------------------------");
        /*2.Write a Java program to reverse a string.
        Test Data: Input a string: The quick brown fox Expected Output: Reverse
        string: xof nworb kciuq ehT*/

        System.out.println("Please enter the string");
        String string = input.nextLine();
        StringBuilder reversedString = new StringBuilder();

        for (int i = string.length()-1; i >= 0; i--) {
            char c =string.charAt(i);
            reversedString.append(c);
        }
        System.out.println(reversedString);

        System.out.println("\n----------------------Exercise 3-----------------------------------------");
        System.out.println("------------------------Find factorial-----------------------------------");
        /*3.Write a program to find the factorial value of any number entered through the keyboard.  */

        System.out.println("Enter a number to receive the factorial:");
        int number = input.nextInt();
        int result = 1;

        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        System.out.println("The factorial of " + number + " is " + result);

        System.out.println("\n----------------------Exercise 4-----------------------------------------");
        System.out.println("------------A number to the power of another----------------------------");
        /*4.Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of
        another. (Do not use Java built-in method)*/
        System.out.println("Enter the first number (the base)");
        int firstNumber = input.nextInt();
        System.out.println("Enter the second number (the power)");
        int secondNumber = input.nextInt();
        int endNumber =1;
        for(int i = 0; i < secondNumber; i++){
            endNumber =endNumber * firstNumber;
        }
        System.out.println(endNumber);

        System.out.println("\n----------------------Exercise 5-----------------------------------------");
        System.out.println("------------------------Sum even or odd-----------------------------------");
        /*5.Write a program that reads a set of integers, and then prints the sum of
        the even and odd integers.*/
        System.out.println("Enter the end of the set: (from 0 to ...) ");
        int set = input.nextInt();
        int evenSum= 0;
        int oddSum=0;
        for (int i = 0; i <= set; i++) {
            if (i%2==0){
                evenSum+=i;
            }
            else{
                oddSum+=i;
            }
        }
        System.out.println("even sem is: "+evenSum+" odd sum is: "+oddSum);

        System.out.println("\n----------------------Exercise 6-----------------------------------------");
        System.out.println("------------------------Find if prime-----------------------------------");

       /* 6.Write a program that prompts the user to input a positive integer.
       It should then output a message indicating whether the number is a prime number.*/
        System.out.println("Enter a positive number");
        int posNum= input.nextInt();
        boolean isPrime =true;
        for (int i=2;i<posNum;i++){
            if(posNum%i==0){
                isPrime=false;
                        break;
            }
        }

        if (isPrime==false){
            System.out.println("not a prime");}
            else{
                System.out.println("its a prime");
            }

        System.out.println("\n----------------------Exercise 7-----------------------------------------");
        System.out.println("--------------------counting days and weeks-------------------------------");
        /*7.Use a for loop to print headings for four weeks (Weeks 1 - 4). Then use another for loop to print the days
        (Days 1 -7) for each week.
        Expected Output:
        Week 1
        Day1
        Day2
        Day3
        Day4
        Day5
        Day6
        Day7
        Week 2
        Day1
        Day2  */
        for(int i=1;i<=4;i++){
            System.out.println("Week "+i);
            for (int j=1;j<=7;j++){
                System.out.println("Day "+j);
            }
        }
       input.nextLine();
        System.out.println("\n----------------------Exercise 8-----------------------------------------");
        System.out.println("--------------------Checking palindrome-------------------------------");
       /*8.Write a program thats check if the word is a palindrome or not.
       hint: A string is said to be a palindrome if it is the same if we start reading it from left to right or right to left.*/
        System.out.println("Enter a word to check palindrome:");
        String word = input.nextLine();
        word=word.toLowerCase();
        StringBuilder palin = new StringBuilder();
        for (int i = word.length()-1; i >= 0; i--) {
            char c =word.charAt(i);
            palin.append(c);
        }

        if(word.equals(palin.toString())) {
            System.out.println("your String is palindrome");
        }
        else{
            System.out.println("your String is not a palindrome");
        }
    }
}