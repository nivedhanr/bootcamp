
import java.util.Scanner;

public class addition {
    public static void main(String[] args) {
        int a,b,c,result;
        Scanner s=new Scanner(System.in);
        System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
        System.out.println("Enter your choice:");
        a=s.nextInt();
        do {




            switch(a) {
                case 1:
                    System.out.println("Addition");
                    System.out.println("Enter the first number:");
                    b = s.nextInt();
                    System.out.println("Enter the second number:");
                    c = s.nextInt();
                    result = b + c;
                    System.out.println("Result:" + result);
                    break;
                case 2:
                    System.out.println("Subtraction");
                    System.out.println("Enter the first number:");
                    b = s.nextInt();
                    System.out.println("Enter the second number:");
                    c = s.nextInt();
                    result = b - c;
                    System.out.println("Result:" + result);
                    break;
                case 3:
                    System.out.println("Multiplication");
                    System.out.println("Enter the first number:");
                    b = s.nextInt();
                    System.out.println("Enter the second number:");
                    c = s.nextInt();
                    result = b * c;
                    System.out.println("Result:" + result);
                    break;
                case 4:
                    System.out.println("Division");
                    System.out.println("Enter the first number:");
                    int d = s.nextInt();
                    System.out.println("Enter the second number:");
                    int f = s.nextInt();
                    try{
                        float results = d / f;
                        System.out.println("Result:" + results);
                    }
                    catch (ArithmeticException e) {
                        // Exception handler
                        System.out.println("Divided by zero operation cannot possible");
                    }
                    break;
                case 5:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid Entry...Please enter your choice");
                    break;
            }

            }while(a!=5);



    }
}
