public class Array {
    int index = 0;
    int[] array;
    public Array(int size){
        array = new int[size];
    }
    public void insert(int item){
        if (index == array.length){
            int[] newArray = new int[array.length * 2];
            for (int i = 0; i < array.length; i++)
                newArray[i] = array[i];
            array = newArray;
        }
        array[index++] = item;
    }
    public void removeAt(int indexToRemove){
        if (indexToRemove < 0 || indexToRemove >= array.length)
            throw new IllegalArgumentException("Invalid Index");

        for (int i = indexToRemove; i < array.length - 1; i++)
                array[i] = array[i + 1];
        --index;

    }
    public void print(){
        for (int number : array){
            if (number != 0)
                System.out.println(number);
        }
    }
    public int getLength(){
        return array.length;
    }
    public int getIndexOf(int value){
        for (int i = 0; i < array.length; i++){
            if (array[i] == value)
                return i;
        }
        return -1;
    }

}
