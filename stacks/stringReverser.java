import java.lang.String;

public String stringReverser(String str){
    /* -- Reverse using stacks -- */
    if (str == null)
        throw new IllegalArgumentException();

    Stack<Character> stc = new Stack<>();
    for (char ch : str.toCharArray())
        stc.push(ch);

    StringBuffer s = new StringBuffer();
    while (!stc.empty())
        s.append(stc.pop());

/* ------------- Reverse using only string buffer ----------
    StringBuffer s = new StringBuffer();
    s.append(str);
    s.reverse();*/

    return s.toString();
}