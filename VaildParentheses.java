package com.company;

import javax.swing.text.AttributeSet;
import java.util.HashMap;

public class VaildParentheses {
    private HashMap<Character,Character> mappings;

    public VaildParentheses(){
        this.mappings.add(')','(');
        this.mappings.add(']','[');
        this.mappings.add('}','{');
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);

            //check if the map contains the key some sort of closed parenthesis
            if (mappings.containsKey(c)) {
                char topElement = stack.empty() ? '#' : stack.pop(); //pops and returns top element
                if (topElement != this.mappings.get(c)) {
                    return false;
                }
            } else {
                stack.push(c); //else the char is an open parenthesis push to top of stack
            }
        }
        return stack.empty(); //if the stack is empty then every open found its close mate and is true
    }
}
