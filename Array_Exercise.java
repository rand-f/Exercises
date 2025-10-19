import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("-------------------------Exercise 1 --------------------------------------");
        System.out.println("-------------------------Are first and last equal--------------------------------------");
        // 1.Write a Java program to test if the first and the last element of an array of integers are same.
        // The length of the array must be greater than or equal to 2.
        char stop;
        ArrayList <Integer> numbers = new ArrayList<>();

        System.out.println("Enter the number");
        int newNumber = input.nextInt();
        numbers.add(newNumber);
        do {
            System.out.println("Enter the number");
            int newNum = input.nextInt();
            numbers.add(newNum);
            System.out.println("Do you want to add new numbers ? Y/N");
            stop = input.next().charAt(0);
        } while (stop !='n' );
        //System.out.println(numbers);
        if(numbers.getFirst()==numbers.getLast()){
            System.out.println(" They are the same");
        }
        else {
            System.out.println("They are not the same");
        }
        System.out.println("\n-------------------------Exercise 2 --------------------------------------");
        System.out.println("-------------------------Find Larger than average --------------------------------------");
        // 2.Write a Java program to find the numbers greater than the average of the numbers of a given array.
        int [] greaterValue = {1, 4, 17, 7, 25, 3, 100};
        double sum=0;
        for (int i : greaterValue){
            sum+=i;
        }
        double avg = sum/greaterValue.length;
        System.out.println("The average is "+avg+" and numbers greater than average are:");
        for (int i:greaterValue){
            if (i >= avg){
                System.out.println(i);
            }
        }
        System.out.println("\n-------------------------Exercise 3 --------------------------------------");
        System.out.println("-------------------------First and last comparison --------------------------------------");
        // 3.Write a Java program to get the larger value between first and last element of an array of integers.
        int [] greatValue = {1000, 4, 17, 7, 25, 3, 100};
        if (greatValue[0]>greatValue[greatValue.length-1]){
            System.out.println("First is larger than last");
        }
        else{
            System.out.println("Last is larger than firs");
        }


        System.out.println("\n-------------------------Exercise 4 --------------------------------------");
        System.out.println("-------------------------Swap first and last --------------------------------------");
        //4.Write a Java program to swap the first and last elements of an array and create a new array.
        int [] oldArray = {10, 20, 30, 40};
        int [] newArray = new int [4];
        for(int i=0; i<newArray.length;i++){
            if (i !=0 && i !=(newArray.length-1)){
                newArray[i]=oldArray[i];
            }
            else if(i == newArray.length-1){
                newArray[i] = oldArray[0];
            }
            else{
                newArray[i]=oldArray[oldArray.length-1];
            }
        }
        for (int i: newArray){
            System.out.println(i);
        }
        System.out.println("\n-------------------------Exercise 5 --------------------------------------");
        System.out.println("-------------------------Odd before even --------------------------------------");
        // 5. Write a program that places the odd elements of an array before the even elements.
        int [] originalArray = {2,3,40,1,5,9,4,10,7};
        ArrayList <Integer> even = new ArrayList();
        ArrayList <Integer> odd = new ArrayList();
        ArrayList <Integer> afterArray= new ArrayList();

        for(int i: originalArray){
            if (i%2==0){
                even.add(i);
            }
            else {
                odd.add(i);
            }
        }
        System.out.println(even);
        System.out.println(odd);

        if (afterArray.size()<=odd.size()){
            for(int j: odd){
                afterArray.add(j);
            }
        }
        if (afterArray.size()>=odd.size()){
            for (int j:even){
                    afterArray.add(j);
            }
        }
        System.out.println(afterArray);

        System.out.println("\n-------------------------Exercise 6 --------------------------------------");
        System.out.println("-------------------------Arrays equality --------------------------------------");
        //6. Write a program that test the equality of two arrays.
        int [] array1 = {2,3,40,1,5,9,4,10,7};
        int [] array2 = {2,3,40,1,5,9,4,10,7};
        boolean similar  =true;
        for (int i=0;i<array1.length;i++){
            if (array1[i]!=array2[i]){
                similar=false;
            }
        }
        System.out.println(similar);
    }
}