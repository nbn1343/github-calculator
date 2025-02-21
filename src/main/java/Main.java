import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    Scanner scanner = new Scanner(System.in);
    System.out.println ("welcome to the calculator");
    System.out.println ("Enter a command:");

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
      }
    }
  }
}
