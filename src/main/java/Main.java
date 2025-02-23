import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    System.out.println ("welcome to the calculator");
    System.out.println ("Enter a command:");
    Scanner scanner = new Scanner(System.in);

    while (scanner.hasNextLine()) {
      String input = scanner.nextLine();
      String[] parts = input.split(" ");
      String command = parts[0].toLowerCase();

      switch (command) {
        case "add":
          int a1 = Integer.parseInt(parts[1]);
          int b1 = Integer.parseInt(parts[2]);
          System.out.println(calculator.add(a1, b1));
          break;


        case "subtract":
          int a2 = Integer.parseInt(parts[1]);
          int b2 = Integer.parseInt(parts[2]);
          System.out.println(calculator.subtract(a2, b2));
          break;

        case "multiply":
          int a3 = Integer.parseInt(parts[1]);
          int b3 = Integer.parseInt(parts[2]);
          System.out.println(calculator.multiply(a3, b3));
          break;

        case "divide":
          int a4 = Integer.parseInt(parts[1]);
          int b4 = Integer.parseInt(parts[2]);
          System.out.println(calculator.divide(a4, b4));
          break;

        case "fibonacci":
          int n = Integer.parseInt(parts[1]);
          System.out.println(calculator.fibonacciNumberFinder(n));
          break;

        case "binary":
          int num = Integer.parseInt(parts[1]);
          System.out.println(calculator.intToBinaryNumber(num));
          break;
      }
    }
  }
}
