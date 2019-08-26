import java.util.Scanner;

public class Task1_Factorial {

    //Calculate factorial of a given number by the formula   n! = n × (n−1)!

    public void calculateFactorial(int n) {
        if (n != 0) { //guarantee that the program will catch condition when the input is "0"
            int a = 1;
            int secondFactorial = 1;
            int mainResult;

         
            for (int i = 0; i < n - 1; i++) {

                secondFactorial *= a;
                a++;
            }
            mainResult = n * secondFactorial;
            System.out.println(mainResult);
        } else {
            System.out.println("0");
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Task1_Factorial factorialCalculaton = new Task1_Factorial();
        factorialCalculaton.calculateFactorial(sc.nextInt());

    }
}
