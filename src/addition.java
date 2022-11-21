import java.sql.SQLOutput;
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
                case 2:
                    System.out.println("Subtraction");
                    System.out.println("Enter the first number:");
                    b = s.nextInt();
                    System.out.println("Enter the second number:");
                    c = s.nextInt();
                    result = b - c;
                    System.out.println("Result:" + result);
                case 3:
                    System.out.println("Multiplication");
                    System.out.println("Enter the first number:");
                    b = s.nextInt();
                    System.out.println("Enter the second number:");
                    c = s.nextInt();
                    result = b * c;
                    System.out.println("Result:" + result);
                case 4:
                    System.out.println("Division");
                    System.out.println("Enter the first number:");
                    float d = s.nextFloat();
                    System.out.println("Enter the second number:");
                    float e = s.nextFloat();
                    float results = d / e;
                    System.out.println("Result:" + results);
            }

            }while(a!=5);



    }
}
