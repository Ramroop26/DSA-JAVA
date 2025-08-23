
class Recursion {

    static int fact(int number) {
        if (number == 1) {
            return 1;
        }
        return number + fact(number - 1); //5+4+3+2+1
    }
    public static void main(String args[]) {
        int number = 5;
        int result = fact(number);
        System.out.println(result);
    }
}
