package Lab1;


import java.util.Scanner;

import static java.lang.System.exit;

public class Lab1 {
    static int a,b,res;
    public static void main(String[] args){
        System.out.println("Menu");
        System.out.println("1.Calculator");
        System.out.println("2.Factorial");
        System.out.println("3.Fibonacci");
        System.out.println("4.Roots");
        System.out.println("5.Exit");
        System.out.println("Enter Your Choice :");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.println("input"+i);
        switch (i){
            case 1:
                System.out.println("1.SUM");
                System.out.println("2.SUB");
                System.out.println("3.DIV");
                System.out.println("4.MUL");
                System.out.println("5.Exit");
                System.out.println("Enter Your Choice :");
                int ii = scanner.nextInt();
                System.out.println("input"+ii);
                switch (ii)
                {
                    case 1:
                        System.out.println("Enter 1st Number");
                         a=scanner.nextInt();
                        System.out.println("Enter 2nd Number");
                         b=scanner.nextInt();
                        res=a+b;
                        System.out.println("SUM == "+res);
                        break;
                    case 2:
                        System.out.println("Enter 1st Number");
                         a=scanner.nextInt();
                        System.out.println("Enter 2nd Number");
                         b=scanner.nextInt();
                        res=a-b;
                        System.out.println("SUB == "+res);
                        break;
                    case 3:
                        System.out.println("Enter 1st Number");
                        a=scanner.nextInt();
                        System.out.println("Enter 2nd Number");
                        b=scanner.nextInt();
                        if(b<=0)
                        {
                            System.out.println("Result is Infinity");
                        }
                        else {
                            res = a / b;
                            System.out.println("DIV == " + res);
                        }
                        break;

                    case 4:
                        System.out.println("Enter 1st Number");
                        a=scanner.nextInt();
                        System.out.println("Enter 2nd Number");
                        b=scanner.nextInt();
                        if(b==0)
                        {
                            System.out.println("Result is Zero");
                        }
                        else {
                            res = a * b;
                            System.out.println("MUL == " + res);
                        }
                        break;
                    case 5:
                         exit(0);
                        break;
                    case 6:
                        break;
                    default:
                        System.out.println("Happy New Year");
                }
                break;
            case 2:
                System.out.println("Enter a Number :");
                a = scanner.nextInt();
                res=1;
                if (a<=0) {
                    System.out.println("Factorial is 1 ");
                }
                else {
                    while (a!=0) {
                        res = res * a;
                        a--;
                    }
                    System.out.println("Fact = "+res);
                }

                break;
            case 3:
                System.out.println("Enter the count");
                res=scanner.nextInt();
                 b=1;
                int n3;
                System.out.print(a+" "+b);//printing 0 and 1
                for(i=2;i<res;++i)//loop starts from 2 because 0 and 1 are already printed
                {
                    n3=a+b;
                    System.out.print(" "+n3);
                    a=b;
                    b=n3;
                }
                break;
            case 4:
                System.out.println("1.SQUARE");
                System.out.println("2.CUBE");
                System.out.println("3.Exit");
                System.out.println("Enter Your Choice :");
                a=scanner.nextInt();
                switch (a)
                {
                    case 1:
                        System.out.println("Enter a Number");
                        b=scanner.nextInt();
                        System.out.println("Number inserted="+b);
                        if (b==0){
                            System.out.println("Square is Zero");

                        }
                        else {
                            res=b*b;
                            System.out.println("Square is "+res);
                        }
                        break;
                    case 2:
                        System.out.println("Enter a Number");
                        b=scanner.nextInt();
                        System.out.println("Number inserted="+b);
                        if (b==0){
                            System.out.println("Cube is Zero");

                        }
                        else {
                            res=b*b*b;
                            System.out.println("Cube is "+res);
                        }
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("Happy New Year :");
                }

                break;
            case 5:
                break;
            default:
                System.out.println("Happy New Year");
        }

    }
}


