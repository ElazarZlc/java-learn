import java.util.Scanner;

class Chat {
    public static void main(String[] args){
        System.out.println("Enter a number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        Calculator calc = new Calculator();
        int result = calc.factorialResult(number);
        System.out.println("the factorial is:" + result);
    }
}

