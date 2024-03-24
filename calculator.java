import java.util.Scanner;

public class calculator{

    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);
      
        int FirstDigit, SecondDigit, result;
        char oprator;

        System.out.println("Enter First Digit");
        FirstDigit = scanner.nextInt();
        
        System.out.println("Enter Second Digit");
        SecondDigit = scanner.nextInt();
         
        System.out.println("Choose Your Oprator (+) (-) (*) (/)");
        oprator = scanner.next().charAt(0);

        switch (oprator) {
            case '+':
              result=FirstDigit+SecondDigit;
              System.out.println(FirstDigit +  " + " + SecondDigit + " + "  + " = " + result);
                break;

                case '-':
              result=FirstDigit-SecondDigit;
              System.out.println(FirstDigit +  " - " + SecondDigit +  " = " + result);
                break;

                case '*':
              result=FirstDigit*SecondDigit;
              System.out.println(FirstDigit +  " * " + SecondDigit + " = " + result);
                break;

                case '/':
              result=FirstDigit/SecondDigit;
              System.out.println(FirstDigit +  " / " + SecondDigit +  " = " + result);
                break;

                case '%':
              result=FirstDigit%SecondDigit;
              System.out.println(FirstDigit +  " % " + SecondDigit +  " = " + result);
                break;

    
        }

        
    }

}