package com.learn;

import java.util.Stack;
// Documented in word file
public class PostFixProgram {

    public static void main(String[] args) {
        //In a postfix expression,
          // • an operator is written after its operands.
          // • the infix expression 2+3 is 23+ in postfix notation.
          // • For postfix expressions, operations are performed in the order in which they are
          //      written (left to right).
          // • No parentheses are necessary. ‘
          // • the infix expression 2+3*4 is 234*+ in postfix notation
          // • the infix expression 3*4+2*5 translates to 34*25*+ in postfix notation.
          // • the infix expression 3*(4+2)*5 translates to 342+*5*

        //Scanner scanner = new Scanner(System.in);

        String expression = "234*+";

        //String exp = "823*+7/1-";
        System.out.print("The PostFix Evaluation for the Given Expression " + expression + " is: ");
        evaluatePostfix(expression);
    }

    static void evaluatePostfix(String exp) {
        Stack<Integer> postFix = new Stack<>();    // Create postfix stack
        int n = exp.length();

        for (int i = 0; i < n; i++) {
            if (isOperator(exp.charAt(i))) {
                // pop top 2 operands.
                int op1 = postFix.pop();
                int op2 = postFix.pop();

                // evaluate in reverse order i.e. op2 operator op1.
                switch (exp.charAt(i)) {
                    case '+':
                        postFix.push(op2 + op1);
                        break;

                    case '-':
                        postFix.push(op2 - op1);
                        break;

                    case '*':
                        postFix.push(op2 * op1);
                        break;

                    case '/':
                        postFix.push(op2 / op1);
                        break;

                }

            }
            // Current Char is Operand simple push into stack
            else {
                // convert to integer
                int operand = exp.charAt(i) - '0';
                postFix.push(operand);
            }
        }

        // Stack at End will contain result.
        System.out.println(postFix.pop());
    }

    static boolean isOperator(char ch) {
        if (ch == '+' || ch == '-' || ch == '*' || ch == '/')
            return true;

        return false;
    }
}
