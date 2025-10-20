import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("----------------------------Exercise 1-----------------------------");
        System.out.println("---------------------------Find the smallest vale-----------------------------");
        // 1 - Write a Java method to find the smallest number among three numbers.
        System.out.println("The smallest number is "+exercise1(input));

        System.out.println("\n----------------------------Exercise 2-----------------------------");
        System.out.println("---------------------------Find vale type-----------------------------");
        // 2 - Write a Java method that check if the entered number is negative or positive or zero.
        System.out.println("The value of the entered number is "+exercise2(input));

        input.nextLine();
        System.out.println("\n----------------------------Exercise 3-----------------------------");
        System.out.println("---------------------------Password check-----------------------------");
        // 3 - Write a Java method to check whether a string is a valid password.
        /*Password rules:
        A password must have at least ten characters.
        A password consists of only letters and digits.
        A password must contain at least two digits.*/
        exercise3(input);

    }
    public static double exercise1(Scanner input){
        System.out.println("Enter the first number:");
        int num1 = input.nextInt();
        System.out.println("Enter the second number:");
        int num2 = input.nextInt();
        System.out.println("Enter the third number:");
        int num3 = input.nextInt();

        double result1= Math.min(num1,num2);
        double result= Math.min(result1 ,num3);

        return result;
    }
    public static String exercise2(Scanner input){
        System.out.println("Enter a number");
        int num = input.nextInt();

        String value;

        if (num==0)
        {value ="Zero";}
         else if (num>0)
        {value ="Positive";}
        else
        {value = "negative";}

        return value;
    }
    public static void exercise3(Scanner input){

        System.out.println("Enter your password");
        String password =input.nextLine();

        if (!checkLimit(password))
        {System.out.println("your password is too short");}

        else if (!checkContent(password))
        {System.out.println("your password must contain only letters and digits");}


        else if(!check2Digits(password))
        {System.out.println("your password must have more than two digits");}


        else
        {System.out.println("your password is valid");}

    }
    public static boolean checkLimit(String password){
        if (password.length()<10){
        return false;}
        else{
            return true;
        }
    }
    public static boolean checkContent(String password){
        for (int i =0; i<password.length();i++){
            char c = password.charAt(i);
            if(!Character.isDigit(c)&&!Character.isLetter(c)){
                return false;
            }
        }
        return true;
    }
    public static boolean check2Digits(String password){
        int digitCounter =0;
        for (int i =0; i<password.length();i++){
            char c = password.charAt(i);
            if(Character.isDigit(c)){
                digitCounter++;
            }
        }
        if(digitCounter>=2){
            return true;
        }
        else{
            return false;
        }
    }
}