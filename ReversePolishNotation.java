class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> notation = new Stack<Integer>();
        
        for (String s : tokens) {
            System.out.println(s);
             try { 
            int val = Integer.parseInt(s);
                 
                 notation.push(val);
        } 
        catch (NumberFormatException e) { 
            
            int val1 = notation.pop(); 
            int val2 = notation.pop();
            
            if (s.equals("+")) {
                notation.push(val1 + val2);
            } else if (s.equals("-")) {
                 notation.push(val2 - val1);
            } else if (s.equals("*")) {
                 notation.push(val1 * val2);
            } else if (s.equals("/")) {
                 notation.push(val2 / val1);
                System.out.println(notation.peek());
            } 
        } 
        }
        return notation.pop();
    }
}
