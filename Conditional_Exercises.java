import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("----------------------Exercise 1-----------------------------------------");
        System.out.println("------------------------Find rule-----------------------------------");
        /*1. Write a program that checks the role of the user
             If the role is admin print "welcome admin"
             If the role is superuser print "welcome superuser"
             If the role is user print "welcome user" (tip: use if else)  */

        System.out.println("Please Enter your rule");
        String rule = input.nextLine();
        if ((rule.toLowerCase()).equals("admin")){
            System.out.println("Welcome admin");
        }
        else if ((rule.toLowerCase()).equals("superuser")){
            System.out.println("Welcome superuser");
        }
        else if ((rule.toLowerCase()).equals("user")){
            System.out.println("Welcome user");
        }
        else {
            System.out.println("Invalid rule");
        }

        System.out.println("\n\n----------------------Exercise 2-----------------------------------------");
        System.out.println("--------------------Find the greatest number--------------------------------");
        /*2. Take three numbers from the user and print the greatest number.
             Test Data
             Input the 1st number: 25
             Input the 2nd number: 78
             Input the 3rd number: 87
             Expected Output : The greatest: 87   */

        System.out.println("Please Enter the firs number");
        int firstNumber = input.nextInt();
        System.out.println("Please Enter the second number");
        int secondNumber = input.nextInt();
        System.out.println("Please Enter the third number");
        int thirdNumber = input.nextInt();

        if (firstNumber>secondNumber && firstNumber>thirdNumber){
            System.out.println("The greatest number is "+firstNumber);
        }
        else if (secondNumber>firstNumber && secondNumber>thirdNumber){
            System.out.println("The greatest number is "+secondNumber);
        }
        else if (thirdNumber>firstNumber && thirdNumber>secondNumber){
            System.out.println("The greatest number is "+thirdNumber);
        }
        System.out.println("\n\n----------------------Exercise 3-----------------------------------------");
        System.out.println("-----------------Find the day of the week--------------------------------");
        /*3. Write a Java program that generates an integer between 1 and 7 and displays the name of the weekday.
             Test Data
             number: 4
             Expected Output:
             Wednesday   */

        System.out.println("Please enter a number between 1-7 to receive what day of the week");
        int dayOfWeek = input.nextInt();
        switch (dayOfWeek){
            case 1:
                System.out.println("Its Sunday");
                break;
            case 2:
                System.out.println("Its Monday");
                break;
            case 3:
                System.out.println("Its Tuesday");
                break;
            case 4:
                System.out.println("Its Wednesday");
                break;
            case 5:
                System.out.println("Its Thursday");
                break;
            case 6:
                System.out.println("Its Friday");
                break;
            case 7:
                System.out.println("Its Saturday");
                break;
            default:
                System.out.println("Invalid number");
        }
        System.out.println("\n\n----------------------Exercise 4-----------------------------------------");
        System.out.println("----------------------Grades number to letter--------------------------------");
        /*4. Write a program that takes a numeric score as input and prints the corresponding letter grade
        using the following grading scale:
        A: 90-100
        B: 80-89
        C: 70-79
        D: 60-69  F:
        0-59
        Enter your numeric score: 85
        Numeric Score: 85
        Letter Grade: B  */

        System.out.println("Please Enter your numeric score");
        int score = input.nextInt();
        if (score >= 90&& score <= 100){
            System.out.println("Your grade is A");
        }
        else if (score >= 80&& score <90){
            System.out.println("Your grade is B");
        }
        else if (score >= 70 && score <80){
            System.out.println("Your grade is C");
        }
        else if (score >= 60 && score <70){
            System.out.println("Your grade is D");
        }
        else if (score <60){
            System.out.println("Your grade is F");
        }
        else{
            System.out.println("Invalid score");
        }
        System.out.println("\n\n----------------------Exercise 5-----------------------------------------");
        System.out.println("----------------------Age categorization--------------------------------");
        /*5. Write a Java program that takes a person's age as input and
        categorizes them into one of three age categories: "Child,"
        "Teenager," or "Adult" using an if statement.
        use an if statement to categorize the age based on the following criteria:
        • If the age is less than 13, categorize them as a "Child."
        • If the age is between 13 and 19 (inclusive), categorize them as a "Teenager."
        • If the age is 20 or older, categorize them as an "Adult."
        Sample Output:
        Enter your age: 25
        You are an Adult.     */

        System.out.println("Please Enter your age");
        int age = input.nextInt();
        if (age < 13){
        System.out.println("Your are a child");
        }
        else if (age > 13 && age <= 19){
            System.out.println("Your are a teenager");
        }
        else if (age > 19){
            System.out.println("Your are an adult");
        }

    }
}