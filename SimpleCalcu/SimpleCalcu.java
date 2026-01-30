import java.util.Scanner;

public class SimpleCalcu {
    public static void main (String [] args){
     Scanner reader = new Scanner(System.in);
     System.out.println("--- Java Console Calculator");

     System.out.print("Enter 1st Number: ");
     double num1 = reader.nextDouble();

     System.out.print("Enter an operator(+, -, *, /): ");
     char operator = reader.next().charAt(0);

     System.out.print("Enter 2nd Number: ");
     double num2 = reader.nextDouble();

     double result;

     switch (operator){
         case '+':
             result = num1 + num2;
             break;
         case '-':
             result = num1 - num2;
             break;
         case '*':
             result = num1 * num2;
             break;
         case '/':
             if(num2 !=0) {
                 result = num1 / num2;
             }else{
                 System.out.println("Error! cannot divide by Zero!");
                 return;
                 }
         break;
         default:
             System.out.println("Error! Wrong operator!");
             return;
     }
     System.out.printf("%.2f %c %.2f = %.2f%n", num1, operator, num2, result);
    }
}
