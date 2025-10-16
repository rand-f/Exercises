import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("----------------------Question 1-------------------------");
        /*1. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of
        two numbers , takes two numbers as input
        Test Data:
        Input first number: 125
        Input second number: 24
        Expected Output :
        125 + 24 = 149
        125 - 24 = 101
        125 x 24 = 3000
        125 / 24 = 5
        125 mod 24 = 5*/
        System.out.println("Enter the first number: ");
        int firsNum=input.nextInt();
        System.out.println("Enter the second number: ");
        int secondNum= input.nextInt();
        System.out.println("first number"+ firsNum+"+"+"seconde number"+secondNum+"="+(firsNum+secondNum));
        System.out.println("first number"+ firsNum+"-"+"seconde number"+secondNum+"="+(firsNum-secondNum));
        System.out.println("first number"+ firsNum+"x"+"seconde number"+secondNum+"="+(firsNum*secondNum));
        System.out.println("first number"+ firsNum+"/"+"seconde number"+secondNum+"="+(firsNum/secondNum));
        System.out.println("first number"+ firsNum+"%"+"seconde number"+secondNum+"="+(firsNum%secondNum));

        System.out.println("\n----------------------Question 2-------------------------");
        /*2. Write a Java program that takes a number as input and prints its multiplication table up to 10.
        Test Data:
        Input a number: 8
        Expected Output :
        8 x 1 = 8
        8 x 2 = 16
        8 x 3 = 24
        ...
        8 x 10 = 80  */
        System.out.println("Enter the number to find the multiplications: ");
        int multiNumber= input.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(multiNumber+" x "+ i +" = "+(multiNumber*i));
        }

        System.out.println("\n----------------------Question 3-------------------------");
        /*3. Write a Java program to print the area and perimeter of a circle.
        Test Data:
        Radius = 7.5
        Expected Output
        Perimeter is = 47.12388980384689
        Area is = 176.71458676442586*/

        //a=(r*r)*pi
        //P=(2*pi)*r
        System.out.println("Enter the radius: ");
        double r= input.nextDouble();
        double pi = 3.14159265;
        System.out.println("Perimeter is = " +((2*pi)*r));
        System.out.println("Area is =" +((r*r)*pi));

        System.out.println("\n----------------------Question 4-------------------------");
        /*4. Java program to find out the average of a set of integers
        Enter the count of numbers:
        5
        Enter an integer:
        3
        Enter an integer:
        8
        Enter an integer:
        6
        Enter an integer:
        7
        Enter an integer:
        2
        The average is: 5.2*/
        System.out.println("Enter the count of numbers:");
        int count = input.nextInt();
        double avrage =0;
        for (int i =count; i>0;i--) {
            System.out.println( "Enter an integer: ");
            int newInt= input.nextInt();
            avrage +=newInt;
        }
        System.out.println("The average is: "+ (avrage/count));

        System.out.println("\n----------------------Question 5-------------------------");
        /*5. Write a Java program that accepts three integers as input, adds the first two integers together,
        and then determines whether the sum is equal to the third integer.
        Sample Output:
        Input the first number : 5
        Input the second number: 10
        Input the third number : 15
        The result is: true  --------
        Input the first number : 10
        Input the second number: 20
        Input the third number : 25
        The result is: false  */

        System.out.println("Enter the first number: ");
        int firsNumber=input.nextInt();
        System.out.println("Enter the second number: ");
        int secondNumber= input.nextInt();
        System.out.println("Enter the results number: ");
        int thirdNumber= input.nextInt();

        if (firsNumber+secondNumber==thirdNumber){
            System.out.println("results are true");
        }
        else {
            System.out.println(" results are false");
        }

        System.out.println("\n----------------------Question 6-------------------------");
        /*6. Write a Java program to reverse a word.
        Sample Output:
        Input a word: dsaf
        Reverse word: fasd  */
        input.nextLine();
        System.out.println("Enter a word to revers:");
        String word = input.nextLine();
        StringBuilder reversd = new StringBuilder();
        for (int i = word.length()-1; i >= 0; i--) {
            char c =word.charAt(i);
            reversd.append(c);
        }
        System.out.println("Reverse word: "+reversd);

        System.out.println("\n----------------------Question 7-------------------------");
        /*7 -  Java program to check whether the given number is even or odd
        Enter a number:
        33
        The number is Odd
        Enter a number:
        24
        The number is Even*/
        System.out.println("Enter a number to check:");
        int check = input.nextInt();
        if (check%2==0){
            System.out.println("the number is even");
        }
        else{
            System.out.println("the number is odd");
        }
        System.out.println("\n----------------------Question 8-------------------------");
        /*8 - Java program to convert the temperature in Centigrade to Fahrenheit
        Enter temperature in Centigrade:
        43
        Temperature in Fahrenheit is: 109.4 */

        //F=(c*1.8)+32
        System.out.println("Enter a temperature for Centigrade to Fahrenheit:");
        int c = input.nextInt();
        double f= (c*1.8)+32;
        System.out.println("Temperature in Fahrenheit is: "+ f);

        System.out.println("\n----------------------Question 9-------------------------");
        /*9.Write a Java program that takes a string and a number from the user,then prints the character in the given index.
        Test Data:
        Input a string: Java Bootcamp
        Expected Output:
        Input a number: 1*/
        input.nextLine();
        System.out.println("Enter a string for a character:");
        String string = input.nextLine();
        System.out.println("Enter a number:");
        int index=input.nextInt();

        for (int i = 0; i <string.length(); i++) {
            if (i==index) {
                char ch = string.charAt(i);
                System.out.println(ch);
            }
        }

        System.out.println("\n----------------------Question 10-------------------------");
        /*10. Write a Java program to print the area and perimeter of a rectangle.
        Test Data:
        Width = 5.5 Height = 8.5
        Expected Output
        Area is 5.6 * 8.5 = 47.60
        Perimeter is 2 * (5.6 + 8.5) = 28.20*/

        //p=(2*(h+w))
        //a=(h*w)
        System.out.println("Enter the rectangle height:");
        double h=input.nextDouble();
        System.out.println("Enter the rectangle weight:");
        double w=input.nextDouble();
        System.out.println("Perimeter is 2 * ("+w+"+"+h+")"+" = " +(2*(h+w)));
        System.out.println("Area is "+w+" * "+h +" = " +(h*w));

        System.out.println("\n----------------------Question 11-------------------------");
        /*11. Write a Java program to compare two numbers.
        Input Data:
        Input first integer: 25
        Input second integer: 39
        Expected Output
        25 != 39
        25 < 39
        25 <= 39 */
        System.out.println("Enter the first number: ");
        int number1=input.nextInt();
        System.out.println("Enter the second number: ");
        int number2= input.nextInt();

        if (number1==number2){
            System.out.println(number1 +" is == "+number2);
        }
        if (number1!=number2){
            System.out.println(number1 +" is != "+number2);
        }
        if (number1<number2){
            System.out.println(number1 +" is < "+number2);
        }
        if (number1>number2){
            System.out.println(number1 +" is > "+number2);
        }
        if (number1<=number2){
            System.out.println(number1 +" is <= "+number2);
        }
        if (number1>=number2){
            System.out.println(number1 +" is >= "+number2);
        }

        System.out.println("\n----------------------Question 12-------------------------");
        /*12. Write a Java program to convert seconds to hours, minutes and seconds.
        Sample Output:
        Input seconds: 86399
        23:59:59*/

        System.out.println("Enter the number of second : ");
        int second= input.nextInt();
        int hours = second/3600;
        int minute = (second/360)%60;
        int sec=second%60;

        System.out.println(hours+" : "+minute +" : "+ sec);

        System.out.println("\n----------------------Question 13-------------------------");
        /*13. Write a Java program that accepts four integers from the user and prints equal if all four are equal,
        and not equal otherwise.
        Sample Output:
        Input first number: 25
        Input second number: 37
        Input third number: 45
        Input fourth number: 23
        Numbers are not equal!*/
        System.out.println("Enter the first number : ");
        int num1= input.nextInt();
        System.out.println("Enter the second number : ");
        int num2= input.nextInt();
        System.out.println("Enter the third number : ");
        int num3= input.nextInt();
        System.out.println("Enter the forth number : ");
        int num4= input.nextInt();

        if (num1==num2&&num2==num3&&num3==num4){
            System.out.println("Numbers are equal!");
        }
        else{
            System.out.println("Numbers are not equal!");
        }

        System.out.println("\n----------------------Question 15-------------------------");
        /*15.Write a program to enter the numbers till the user wants and at the end it
        should display the count of positive, negative and zeros entered  (End loop use -1 ,Don’t count -1).
        Test data
        1
        3
        0    -2    -4    -1
        2 positives
        1 zero
        2 negatives  */
        int pos = 0;
        int neg =0;
        int zero =0;

        System.out.println("Enter the number or -1 to stop: ");
        while (true){
            int n= input.nextInt();
            if (n == -1){
                break;
            }
             if (n == 0){
                zero++;
            }
            else if( n > 0 ){
                pos++;
            }
            else {
                neg++;
            }
        }
        System.out.println(pos+" positives");
        System.out.println(neg+" negatives");
        System.out.println(zero+" zero");

        System.out.println("\n----------------------Question 16-------------------------");
       /* 16 - Write a program that prompts the user to input an integer and then outputs the
        number with the digits reversed.
                For example, if the input is 12345, the output should be 54321.*/

        System.out.println("Enter a number to revers:");
        int numRev = input.nextInt();
        String revNum = String.valueOf(numRev);
        StringBuilder reversedNum = new StringBuilder();
        for (int i = revNum.length()-1; i >= 0; i--) {
            char chare = revNum.charAt(i);
            reversedNum.append(chare);
        }
        System.out.println("Reverse Number: "+reversedNum);

        System.out.println("\n----------------------Question 17-------------------------");
        /*17 - Write a program to enter the numbers till the user wants and at the end the
        program should display the largest and smallest numbers entered.
        enter the number : 4
        enter the number : 5
        enter the number : -1
        enter the number : 9
        the large number : 9
        the small number : -1   */
        int largeNum =-111111111;
        int smallNum =1111111111;
        do{
            System.out.println("Enter new number or -1 to stop: ");
            int n= input.nextInt();
            if (n == -1){
                break;
            }

            if( n > largeNum ){
                largeNum=n;
            }
            if (n < smallNum){
                smallNum=n;
            }
        } while (true);
        System.out.println("large number is: "+largeNum);
        System.out.println("small number is: "+smallNum);

        System.out.println("\n----------------------Question 18-------------------------");
        /*18 - Determine and print the number of times the character ‘a’ appears in the input
        entered by the user.
        Enter String:
        Java bootcamp
        Output: Number of a's: 3 */
        System.out.println("Enter a string to extract 'a':");
        String extractor = input.nextLine();
        int charCounter=0;
        for (int i = 0; i <extractor.length(); i++) {
            String cha = String.valueOf(extractor.charAt(i));
         // System.out.println(c);
              if (cha.equalsIgnoreCase("a") ){
                charCounter++;
              }
        }
        System.out.println("a appeared : "+charCounter+" times");
    }
}