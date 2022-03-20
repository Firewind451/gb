public class dz1 {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign(3,5);
        printColor(200);
        compareNumbers(4,2);
    }

    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign(int i, int j){
        if ( (i+j)>=0 ) System.out.println("Сумма положительная");
            else System.out.println("Сумма отрицательная");

    }

    public static void printColor(int i){
        if (i <= 0) System.out.println("Красный");
            else if ((i > 0) && (i <= 100)) System.out.println("Желтый");
                else System.out.println("Зеленый"); // проверку на i>100 делать не надо, так как это все остальные значения
    }

    public static void compareNumbers(int a, int b){
        if (a >= b) System.out.println("a >= b");
            else System.out.println("a < b");
    }
}
