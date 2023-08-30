package homework1;

import static homework1.task2.Answer.subArrays;

public class task3 {
        class Answer {
            public static int[] subArrays(int[] a, int[] b) {
                if (a.length != b.length) {
                    return new int[] {0};
                }
                int[] c = new int[a.length];
                for (int i = 0; i < a.length; i++) {
                    if (b[i] != 0){
                        c[i] = a[i] / b[i];
                }
                else throw new IllegalArgumentException("Divide by zero error");
                }
                return c;
            }
        }

        public static void main(String[] args) {
            int[] a = {12, 8, 16};
            int[] b = {0, 2, 4};
            int[] c = subArrays(a, b);
            for (int i : c) {
                System.out.println(i);
            }
        }
    }
