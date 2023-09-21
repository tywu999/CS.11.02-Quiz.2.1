public class Main {

    public static void main(String[] args) {
        int resultOne = add (3, 5);
        System.out.println(resultOne);
        String resultTwo = greeting("TY");
        System.out.println(resultTwo);
        int resultThree = add(1, 3, 5, 9);
        System.out.println(resultThree);
        String print = printMe("hello world");
        System.out.println(print);
    }


    public static int add(int numOne, int numTwo){
        return numOne + numTwo;
    }
    public static String greeting(String name){
        return "Bonjour, " + name;
    }
    public static int add(int numOne, int numTwo, int numThree, int numFour){
        int first = add(numOne, numTwo);
        int second = add(numThree, numFour);
        return first + second;
    }
    public static String printMe(String toBePrinted){
        return toBePrinted;
    }
}
