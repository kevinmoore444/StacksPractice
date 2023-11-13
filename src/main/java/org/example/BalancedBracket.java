package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class BalancedBracket {

    private final List<Character> leftBrackets = Arrays.asList('(', '<', '{');
    private final List<Character> rightBrackets = Arrays.asList(')', '>', '}');

    public boolean balanced(String input) {
        if(input.length()<2){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray()) {
            if (isLeftBracket(ch)) {
                stack.push(ch);
            }
            if(isRightBracket(ch)){
                if(stack.empty()) return false;

                var top = stack.pop();
                if(bracketsMarch(top, ch)) return false;
            }
        }
        return stack.empty();
    }


    private boolean isLeftBracket(char ch){
        return leftBrackets.contains(ch);
    }

    private boolean isRightBracket(char ch){
        return rightBrackets.contains(ch);
    }

    private boolean bracketsMarch(char left, char right){
        return leftBrackets.indexOf(left) == rightBrackets.indexOf(right);
    }
}


