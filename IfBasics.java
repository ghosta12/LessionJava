package PracticeJavaBasics;

public class IfBasics {

    public static void main(String args[]){

        int a, b;

        a = 4;
        b = 5;

        a = b + 2; // добавляем к переменной а значения b + 2 -- тут а будет равно 7
        if (a > b) System.out.println("a > b");
        b = a + 1; // а тут к переменной b добавляем значение a + 1 -- тут б будет равно 8
        if (a < b) System.out.println("a < b");
        if (a == b) System.out.println("a = b");

        a = b - a;

        System.out.println(a);

    }

}
