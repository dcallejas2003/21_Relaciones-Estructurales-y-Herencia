package model;

public class X extends W implements Z {
    private A a;

    public X(A a) {
        this.a = a;
    }

    @Override
    public boolean w1() {
        return true;
    }

    @Override
    public int z1() {
        return 0;
    }

    @Override
    public float z2(boolean b) {
        return b ? 1.0f : 0.0f;
    }

    @Override
    public String toString() {
        return "X{a=" + a + "}";
    }
}
