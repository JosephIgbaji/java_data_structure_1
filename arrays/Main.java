
public class Main {
    public static void main(String[] args) {
        myArray numbers = new myArray(1);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.insert(50);
        numbers.insert(60);
        numbers.removeAt(3);
        numbers.insert(13);
        numbers.insert(14);
        numbers.insert(15);
        numbers.insert(16);
        numbers.print();
    }
}

