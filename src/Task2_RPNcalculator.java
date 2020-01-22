import java.util.Scanner;
import java.util.Stack;


public class Task2_RPNcalculator {

    public int addition(int a, int b) {
        return a + b;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }

    public int division(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {

        Task2_RPNcalculator task2_rpNcalculator = new Task2_RPNcalculator();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputs = input.split(" ");
        Stack<Integer> st = new Stack<>();
        int result = 0;
        int secondNumber;
        int firstNumber;

        for (int i = 0; i < inputs.length; i++) {

            if (inputs[i].matches("[-+]?\\d*\\.?\\d+")) {
                st.push(Integer.parseInt(inputs[i]));
            }
            if (String.valueOf(inputs[i]).matches("[-+*/]")) {
                switch (inputs[i]) {

                    case "+":
                        secondNumber = st.pop();
                        firstNumber = st.pop();
                        result = task2_rpNcalculator.addition(firstNumber, secondNumber);
                        st.push(result);
                        break;
                    case "-":
                        secondNumber = st.pop();
                        firstNumber = st.pop();
                        result = task2_rpNcalculator.subtraction(firstNumber, secondNumber);
                        st.push(result);
                        break;
                    case "*":
                        secondNumber = st.pop();
                        firstNumber = st.pop();
                        result = task2_rpNcalculator.multiplication(firstNumber, secondNumber);
                        st.push(result);
                        break;
                    case "/":
                        secondNumber = st.pop();
                        firstNumber = st.pop();
                        result = task2_rpNcalculator.division(firstNumber, secondNumber);
                        st.push(result);
                        break;

                }
            }
        }
        System.out.println(result);
    }
}
