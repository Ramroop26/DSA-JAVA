class Impl {
    int arr[];
    int top;

    // Constructor
    Impl(int n) {
        arr = new int[n];
        top = -1;
    }
}

public class one{
    public static void main(String[] args) {
        Impl s = new Impl(3); // Stack of size 3
        s.arr[++s.top] = 11;
        s.arr[++s.top] = 12;
        s.arr[++s.top] = 13;

        for (int i = s.top; i>=0; i--) {
            System.out.println(s.arr[i]);
        }

    }
}
