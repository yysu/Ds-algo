class Question1 {
    int a = 5;
    public void methodA() {
        int a = 7;
        a = a + 1;
        this.a = a + 2;
        System.out.print(a); 
    }
}

public class Question1Test {
    public static void main(String[] args) {
        Question1 aa = new Question1();
        aa.methodA();
        System.out.print(aa.a);
    }
}