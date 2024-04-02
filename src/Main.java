public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        for (int i=1; i<=10; i++){
            System.out.println(i);
        }
        System.out.println("Task 2");
        for (int i=10; i>0; i--){
            System.out.println(i);
        }
        System.out.println("Task 3");
        for (int i=0; i<=17; i=i+2){
            System.out.println(i);
        }
        System.out.println("Task 4");
        for (int i=10; i>=-10; i--){
            System.out.println(i);
        }
        System.out.println("Task 5");
        for (int i=1904; i<=2096; i=i+4){
            System.out.println(i);
        }
        System.out.println("Task 6");
        for (int i=7; i<=98; i=i+7){
            System.out.println(i);
        }
        System.out.println("Task 7");
        for (int i=1; i<=512; i=i*2){
            System.out.println(i);
        }
        System.out.println("Task 8");
        int give = 29000;
        int cash = 0;
        for (int i=1; i<=12; i++){
            cash = cash+give;
            System.out.println("За "+i+"-й месяц сумма накоплений равна "+cash);
        }
        System.out.println("Task 9");
        int giveBank = 29000;
        float cashBank = 0;
        for (int i=1; i<=12; i++){
            cashBank = cashBank+giveBank;
            cashBank = cashBank*1.01f;
            System.out.println("За "+i+"-й месяц сумма накоплений равна "+cashBank);
        }
        System.out.println("Task 10");
        int a;
        for (int i=1; i<=10; i++){
            a = 2*i;
            System.out.println("2*"+i+"="+a);
        }
    }
}