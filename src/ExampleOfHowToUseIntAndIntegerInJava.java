public class ExampleOfHowToUseIntAndIntegerInJava {
    public static void main(String[] args) {
        int number = 10; //4 bytes
        Integer boxedNumber = Integer.valueOf(number); //16 bytes
        System.out.println(boxedNumber);
    }
}
