interface A {
    public int ma(int a);
    public int mb(int a);
}

abstract class B implements A {
    public B(int a) {
        System.out.println(ma(a));
    }
    @Override
    public int ma(int a) {
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            sum += i;
        }
        return sum;
    }
}

class C extends B {
    public C(int a) {
        super(a);
    }
    @Override
    public int mb(int a) {
        int ans = 1;
        for (int i = 1; i <= a; i++) {
            ans *= i;
        }
        return ans;
    }
}

public class Test {
    public static void main(String[] argv) {
        C c = new C(5);
        System.out.print(c.mb(c.ma(4)));
    }
}
