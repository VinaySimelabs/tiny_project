import finals.Choice;

import java.util.Scanner;
public class Combined {

    public static void main(String[] args)
    {

       Choice choice =new Choice();
        choice.choice();



    }
        static class Choice
        {
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
                        finals.Palind pallindrom = new finals.Palind();
                        pallindrom.pal();
                        break;
                    case 5:
                        System.out.println("Pattern");
                        finals.Pattern1 pattern = new finals.Pattern1();
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
    static class Factorial {
        void fact()
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\nEnter the number(factorial):");
            int output=1;
            int n = scanner.nextInt();
            for(int i=1;i<=n;i++)
                output=output*i;


            System.out.println("Factorial of entered number is: "+output);
        }
    }
    static class Fibonacci
    {
        void printFibonacciNumbers(int n)
        {
            int f1 = 0, f2 = 1, i;

            if (n < 1)
                return;
            System.out.print("\nThe fibonacci series is :");
            for (i = 1; i <= n; i++)
            {
                System.out.print( f2 + " ");
                int next = f1 + f2;
                f1 = f2;
                f2 = next;
            }

        }

    }


    static class Multiple
    {
        int i = 0;
        int n = 0;

        public  void m()
        {

            int i = 0;
            int n = 0;

            Scanner input = new Scanner(System.in);

            System.out.print("\n(multiple) Enter the number : ");
            i = input.nextInt();
            System.out.print("Enter  multiples: ");
            n = input.nextInt();

            if ((i <= 1) || (n <= 1))
            {
                System.out.println("Please enter numbers above 1");
                System.exit(1);

            }
            else
            {
                System.out.print(n + " multiples of " + i + " are: ");
                mult(i, n);
            }
        }

        static void mult(int i, int n)
        {
            int[] arr = new int[n];
            int count = 2;
            for (int x = 0; x < n; x++)
            {
                arr[x] = i * count++;
            }
            for (int y = 0; y < arr.length; y++)
            {
                System.out.print(arr[y] + " ");
            }
        }
    }
    static class Palind
    {
        public static void pal()
        {
            int r, sum = 0, temp;
            String ch;
            Scanner scanner = new Scanner(System.in);
            Scanner scn = new Scanner(System.in);
            do
            {
                System.out.println("\nEnter the number(Check pallindrome) :");
                int num = scanner.nextInt();


                temp = num;
                while (num > 0)
                {
                    r = num % 10;
                    sum = (sum * 10) + r;
                    num = num / 10;
                }

                if (temp == sum)
                {
                    System.out.println("palindrome number ");
                }
                else
                {
                    System.out.println("not palindrome");
                }
                System.out.println("Do you want to continue?(y/n)");
                ch = scn.next();

            }
            while(ch.equals("y"));


        }
    }
    static class Pattern1
    {
        public void patterns()
        {

            String result;

            Scanner re = new Scanner(System.in);
            do
            {

                Scanner s = new Scanner(System.in);
                System.out.println("\nEnter the number (Pattern)");
                int rows = s.nextInt();

                for (int i = 1; i <= rows; i++)
                {
                    for (int j = 1; j < i; j++)
                    {
                        System.out.print(" ");
                    }

                    for (int j = i; j <= rows; j++)
                    {
                        System.out.print(j + " ");
                    }
                    System.out.println();
                }

                for (int i = rows - 1; i >= 1; i--)
                {
                    for (int j = 1; j < i; j++) {
                        System.out.print(" ");
                    }
                    for (int j = i; j <= rows; j++)
                    {
                        System.out.print(j + " ");
                    }
                    System.out.println();
                }
                System.out.println("wish to continue(y/n)");
                result = re.next();

            }
            while (result.equals("y"));

            System.out.println(" Good Bye!");
        }

    }
    static class Prime
    {
        public void printPrime(int limit)
        {
            System.out.print("\nPrime number from 1 to 100: ");
            for(int j = 1; j <= limit; j++)
            {
                int count = 0;
                for (int i = 1; i <= limit; i++)
                {
                    if(j%i == 0)
                    {
                        count++;
                    }
                }
                if(count == 2)
                {
                    System.out.print(" "+j);
                }

            }
        }
    }

}



