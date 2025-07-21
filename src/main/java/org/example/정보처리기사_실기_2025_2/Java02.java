package org.example.정보처리기사_실기_2025_2;

public class Java02 {
    static interface F {
        int apply(int x);
    }

    public static int run(F f) {
        try {
            return f.apply(3);
        } catch (Exception e) {
            return 7;
        }
    }

    public static void main(String[] args) {
        F f = (x) -> {
            if (x > 2) {
                throw new RuntimeException();
            }
            return x * 2;
        };

        System.out.print(run(f) + run((int n) -> n + 9));
    }
}
