package PracticeJavaBasics;

public class InchIntoMeter {

    public static void main(String args[]){

        double inch, meter; // оглашаем переменные дюймов и метров


        for(inch = 1; inch <= 100; inch++){ //цикл перевода дюймы в метры
            meter = inch / 39.39; // считаем сколько метров в n+1 дюйме
            System.out.println("В " + inch + " дюйме солержится " + meter + " метров");

            if(inch %12 == 0){ // каждые 12 дюймов выводиться пустая строка
                System.out.println();
            }

        }

    }
}
