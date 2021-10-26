package finals;

import java.util.Scanner;

public class Choice {
    int cho,Key1;
    String result1;
    void choice()
    {
        do {
            System.out.println("\nWhat do you want?");
            System.out.println("1.prime \n2.Fibonnacci  \n3.Multiple \n4.Palindrome \n5.Pattern \n6.Factorial \n7.Do you want to exit?");
            Scanner cho = new Scanner(System.in);
            System.out.println("Enter your choice:");
            int key1 = cho.nextInt();
            switch (key1) {
                case 1:
                    System.out.println("Prime");
                    Prime prime = new Prime();
                    prime.printPrime(100);
                    break;
                case 2:
                    System.out.println("Fibonnacci");
                    Fibonacci fibonacci = new Fibonacci();
                    fibonacci.printFibonacciNumbers(10);
                    break;
                case 3:
                    System.out.println("Multiple");
                    Multiple multiple = new Multiple();
                    multiple.m();
                    break;
                case 4:
                    System.out.println("Palindrome");
                    Palind pallindrom = new Palind();
                    pallindrom.pal();
                    break;
                case 5:
                    System.out.println("Pattern");
                    Pattern1 pattern = new Pattern1();
                    pattern.patterns();
                    break;
                case 6:
                    System.out.println("factorial");
                    Factorial factorial = new Factorial();
                    factorial.fact();
                    break;
                case 7:
                    System.out.println("Exiting..");
                    System.exit(0);

                    break;
                default:
                    System.out.println("Invalid Choice .... Please Enter correct Choice");
                    break;
            }
            Scanner re = new Scanner(System.in);
            System.out.println("\nwish to continue(y/n)");
            result1 = re.next();
        }

        while (result1.equals("y"));


        System.out.println(" Good Bye!");


    }
}
