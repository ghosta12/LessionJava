package PracticeJavaBasics;

public class GallonesToLitSecondLvL {

    public static void main(String args[]){

    int gallons;
    double lit; //объявляем переменные галонов и литров
    int counter; //объявляем переменную счетчика

    counter = 0;
    for (gallons = 1; gallons <= 100; gallons++){ // цикл для перевода галонов в литры от 1 до 100

        lit = gallons * 3.2422;
        System.out.println("В " + gallons + " галонах cодержится " + lit + " литров воды");
        counter++;
        if(counter == 10){ //счетчик для вывода пустой строки каждый раз, когда счетчик равняется 10
            System.out.println();
            counter = 0;
            }
        }
    }
}
