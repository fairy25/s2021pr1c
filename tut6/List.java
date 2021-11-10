package tut6;

/**
 * List is a dynamic array
 */
public class List {
    int[] data;
    int length;

    public List() {
        length = 0;
        data = new int[length];
    }

    public void add(int n) {
        // create new array, one element bigger than current array
        int[] newArr = new int[data.length + 1];
        // copy array elements over
        for (int i = 0; i < data.length; i++) {
            newArr[i] = data[i];
        }
        // add n to the last position of new array
        newArr[newArr.length - 1] = n;
        // replace the current array with the new one
        data = newArr;
        length++;
    }

    public int get(int index) {
        return data[index];
    }

    public void set(int index, int value) {
        data[index] = value;
    }

    public void remove(int index) {
        // create new array, one less element than current array
        int[] newArr = new int[data.length - 1];
        // copy array elements over, without the deleted one
        // before: [1,2,3,4,5]
        // remove(2) --> remove number 3 from the list
        // after: [1,2,4,5]
        // when i < index, newArr[i] = data[i]
        // when i >= index, newArr[i] = data[i + 1]
        for (int i = 0; i < newArr.length; i++) {
            if (i < index) {
                newArr[i] = data[i];
            } else {
                newArr[i] = data[i + 1];
            }
        }
        // replace the current array with the new one
        data = newArr;
        length--;
    }

    public static void main(String[] args) {
        List l = new List();
        l.add(5);
        l.add(10);
        l.add(15);
        l.add(18);
        l.add(24);
        l.set(0, 8);
        l.remove(2);
        System.out.println(l.length);
        for (int i = 0; i < l.length; i++) {
            System.out.println(l.get(i));
        }
    }
}
