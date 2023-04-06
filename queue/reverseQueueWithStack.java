public static void reverse(ArrayQueue queue){
    Stack stack = new Stack();
    while(!queue.isEmpty())
        stack.push(queue.dequeue());
    while(!stack.isEmpty()) {
        queue.enqueue((int)stack.pop());
    }
}