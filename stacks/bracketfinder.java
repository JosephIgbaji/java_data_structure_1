public boolean isBalanced(String str){
        var list = Arrays.asList('[', '{', '(', '<');
        Stack<Character> stc = new Stack<>();
        int condValue = 0;
        for (char ch : str.toCharArray()){
            if (list.contains(ch)){
                stc.push(ch);
            } else if (ch == ']'){
                condValue = condition(stc, ']');
                if (condValue != 0) return false;
            } else if (ch == '}') {
                condValue = condition(stc, '}');
                if (condValue != 0) return false;
            } else if (ch == ')') {
                condValue = condition(stc, '(');
                if (condValue != 0) return false;
            } else if (ch == '>') {
                condValue = condition(stc, '<');
                if (condValue != 0) return false;
            }
        }
        return stc.empty();
    }
    private int condition(Stack<Character> stc, char ch){
        if (stc.isEmpty())
            return 1;
        if (stc.peek() != ch)
            return 1;
        stc.pop();
        return 0;
    }