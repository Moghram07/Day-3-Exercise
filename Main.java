import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Q.1 write a program that checks the role of the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Q1. Please enter the role of the user: ");
        String role = scanner.nextLine();
        if(role.equals("admin")){
            System.out.println("Welcome admin");
        }else if(role.equals("superuser")){
            System.out.println("Welcome superuser");
        }else if(role.equals("user")){
            System.out.println("Welcome user");
        }
        //Q.2 take three numbers from the user and print the greatest number.
        System.out.println("Q2. Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Q2. Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.println("Q2. Enter third number: ");
        int num3 = scanner.nextInt();
        if (num1 > num2 && num1 > num3){
            System.out.println("greatest: "+ num1);
        }else if(num2 > num1 && num2> num3){
            System.out.println("greatest: "+ num2);
        }else{
            System.out.println("greatest: "+ num3);
        }
        //Q.3 write a java program that generates an integer between 1 and 7
        System.out.println("Q3. Please enter the number of day:");
        int dayNum = scanner.nextInt();
        switch(dayNum){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
        }
        //Q.4 Write a program that takes a numeric score as input and prints...
        System.out.println("Q.4 Please Enter your grade: ");
        int num = scanner.nextInt();
        switch (num / 10) {
            case 10:
                System.out.print("Congratulation, you got a perfect grade, Outstanding!");
                break;
            case 9:
                System.out.println(num >= 95  ? "your grade is: A+" : "your grade is: A");
                break;
            case 8:
                System.out.println(num >= 85 ? "your grade is: B+": "your grade is: B");
                break;
            case 7:
                System.out.println(num >= 75 ? "your grade is: C+": "your grade is: C");
                break;
            case 6:
                System.out.println(num >= 65 ? "your grade is: D+": "your grade is: D");
                break;
            default:
                System.out.println("your grade is: F");
        }
        //Q5. Write a java program that takes a person's age ....
        System.out.println("Q.5 please enter your age: ");
        int age = scanner.nextInt();
        if (age < 19 ){
            System.out.println(age < 13 ? "Child":"Teenager");
        }else if(age >= 20){
            System.out.println("Adult");
        }
    }
}
