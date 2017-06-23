package Flexton;

import java.util.Stack;

/**
 * Created by janish on 6/9/2017.
 */
public class Paranthesis {
    public static boolean checkParenthesis(String str) {
        Stack<Character> tmpStack = new Stack<Character>();
        int openCount = 0;
        int closeCount = 0;
        int length = str.length();
        Character ch = null;

        if (str.equals(null)) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            ch = str.charAt(i);
            if (ch == '(') {
                openCount++;
                tmpStack.push(ch);
            }
            else if(!(tmpStack.isEmpty() ) ){
                if(ch == ')' && tmpStack.pop() == '('){
                    closeCount++;
                }
            }
        }
        if(( tmpStack.isEmpty() ) && ( openCount == closeCount) ){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "";
        System.out.println(Paranthesis.checkParenthesis(str));
    }
}
