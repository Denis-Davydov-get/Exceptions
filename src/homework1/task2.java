package homework1;
import java.util.ArrayList;
import java.util.Arrays;

import static homework1.task2.Answer.subArrays;

public class task2 {
    class Answer {
    public static int[] subArrays(int[] a, int[] b) {
        if (a.length != b.length) {
            return new int[] {0};
        }
        int[] c = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] - b[i];
        }
        return c;
    }
}

    public static void main(String[] args) {
        int[] a = {4, 5, 6};
        int[] b = {1, 2, 3};
        int[] c = subArrays(a, b);
        for (int i : c) {
            System.out.println(i);
        }
    }

}
