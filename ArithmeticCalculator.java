//Written by: Abdulrahman Mendahawi. Hi, this is a very simple and beginner friendly calculater written in Java. I have also added comments to help explain the purpose of each line.
import java.util.*;

public class ArithmeticCalculator {
    public static void main(String[] args){
        //Create a scanner keyboard. (Used to recieve users input.)
        Scanner keyboard = new Scanner(System.in);

        //Asking user for first value.
        System.out.println("Input value a: ");
        //Recieving first value via the keyboard.
        int a = keyboard.nextInt();

        //Asking user for second value.
        System.out.println("Input value b: ");
        //Recieving second value via the keyboard.
        int b = keyboard.nextInt();

        //Asking user for desired operation.
        System.out.println("Enter: A = Add, S = Subtract, M = Multiply, D = Divide, Mod = Modulo");
        //Recieving value via the keyboard.
        String operation = keyboard.next();
        //Closing the keyboard as we no longer need it.
        keyboard.close();

        //Checks if value user inputed for the variable "operation" equals to "A" or "a".
        if(operation.equals("A") || operation.equals("a")){
            //Addition
            int add = a + b;
            //Print out result.
            System.out.println(a + " + " + b + " = " + add);

        }else if(operation.equals("S") || operation.equals("s")){
            //Subtraction
            int sub = a - b;
            System.out.println(a + " - " + b + " = " + sub);

        }else if(operation.equals("M") || operation.equals("m")){
            //Multiplication
            int mult = a * b;
            //Print out result.
            System.out.println(a + " * " + b + " = " + mult);

        }else if(operation.equals("D") || operation.equals("d")){
            //Division
            int div = a / b;
            //Print out result.
            System.out.println(a + " / " + b + " = " + div);

        }else if(operation.equals("Mod") || operation.equals("mod")){
            //Modulo
            int mod = a % b;
            //Print out result.
            System.out.println(a + " % " + b + " = " + mod);
        }
    }
}
