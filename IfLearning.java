package PracticeJavaBasics;

public class IfLearning {

    public static void main(String args[]){

        int a, b;

        a = 5;
        b = 3;

        if (a < b){
            System.out.println("a < b"); // выведется, если а < b
        } else if (a > b && a != 5){
            System.out.println("a > b and a doens't equal 5"); // выведется, если a > b
        } else if (a == b) {
            System.out.println("a = b"); // выведется, если а = b
        } else if(a != b) {
            System.out.println("a != b"); // выведется, если условия выше не отработают
        }

    }

}
