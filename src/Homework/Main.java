package Homework;

public class Main {
    public static void main(String[] args) {
        UnaryOperator unaryOperator = (a) -> System.out.println(Math.sqrt(a));
        unaryOperator.sqrt(36);
    }
}
