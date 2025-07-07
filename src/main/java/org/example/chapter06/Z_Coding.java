package org.example.chapter06;

class _Parent {
    static int total = 0;
    int v = 1;

    public _Parent() {
        total += ++v;
        show();
    }

    public void show() {
        total += total;
    }
}

class _Child extends _Parent {
    int v = 10;

    public _Child() {
        v += 2;
        total += v++;
        show();
    }

    @Override
    public void show() {
        total += total * 2;
    }
}

public class Z_Coding {
    public static void main(String[] args) {
        new _Child();
        System.out.println(_Parent.total);
    }
}
