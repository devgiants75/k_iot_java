package org.example.정보처리기사_실기_2025_2;

public class Java04 {
    public static class BO {
        public int v;
        public BO(int v) {
            this.v = v;
        }
    }

    public static void main(String[] args) {
        BO a = new BO(1);
        BO b = new BO(2);
        BO c = new BO(3);
        BO[] arr = {a, b, c};

        BO t = arr[0];
        arr[0] = arr[2];
        arr[2] = t;

        arr[1].v = arr[0].v;

        System.out.println(a.v + "a" + b.v + "b" + c.v);
    }
}
