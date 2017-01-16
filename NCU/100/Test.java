class Employee {
    //Section A : 宣告變數
    public Employee boss;
    public String ID;
    public double total_bonus;

    //Section B
    public Employee(String ID) {
        total_bonus = 0.0;
        //?????
        this.ID = ID;
    }
    public Employee(String ID, Employee boss) {
        total_bonus = 0.0;
        //?????
        this.ID = ID;
        this.boss = boss;
    }

        //Section C : 在此計算銷售線上各層人員的分紅
    public void addBonus(double value) {
        total_bonus += value * 0.1;
        //????????
        if(this.boss != null)
            this.boss.addBonus(value * 0.1);
    }

    //Section D
    public double getBonus() {
        return total_bonus;
    }
    public String toString() {
        return ID;
    }
}
public class Test {
    public static void main(String[] argv) {
        //Section E
        Employee a1 = new Employee("001");
        Employee a2 = new Employee("002", a1);
        Employee a3 = new Employee("003", a2);
        Employee a4 = new Employee("004", a3);

        //Section F
        a4.addBonus(10000);
        a2.addBonus(20000);

        //Section G
        System.out.println(a1 + ":" + a1.getBonus() + "\n" +
                            a2 +  ":" + a2.getBonus() + "\n" +
                             a3 + ":" + a3.getBonus() + "\n" +
                              a4 + ":" + a4.getBonus() + "\n"
                              );
    }
}
