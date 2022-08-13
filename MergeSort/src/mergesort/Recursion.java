package mergesort;

public class Recursion {

    public static void main(String[] a) {
        for(int i=0; i<5; i++)
            System.out.println("abc");
    }

    static int f(int i, int j) {
        if (i == j) {
            return j;
        }
        return i+f(i+1,j);
    }

}
