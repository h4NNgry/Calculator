import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Введите пример: ");

        Scanner console = new Scanner(System.in);
        int one = 0;
        int two = 0;

        while (true) {
            String example = console.nextLine();
            example = example.toUpperCase();
            String[] exampleArray = example.split(" ");


            if ((exampleArray[0].matches(".*[IVX].*") && exampleArray[2].matches(".*[0123456789].*"))
                    || (exampleArray[2].matches(".*[IVX].*") && exampleArray[0].matches(".*[0123456789].*"))) {
                    throw new Exception("Одновременно используются разные системы счисления");
            }

                if (exampleArray.length != 3) {
                    throw new Exception("Калькулятор выполняет операции следующего ввида: a + b, a - b, a * b, a / b.");
            }

            if (example.matches(".*[IVX].*")) {
                one = RomeNumbers.romeToArab(exampleArray[0]);
                two = RomeNumbers.romeToArab(exampleArray[2]);
            } else if (example.matches(".*[0123456789].*")) {
                one = Integer.parseInt(exampleArray[0]);
                two = Integer.parseInt(exampleArray[2]);
            }

            if ((one > 10) || (two > 10)) {
                    throw new Exception("Калькулятор принимает числа от 1 до 10 включительно, не более");
            }


            switch (exampleArray[1]) {
                case "+": {
                    int result = one + two;
                    if (example.matches(".*[IVX].*")) {
                        System.out.println(RomeNumbers.arabToRome(result));
                    } else if (example.matches(".*[0123456789].*")) {
                        System.out.println(result);
                    }
                    break;
                }
                case "-": {
                    int result = one - two;
                    if (example.matches(".*[IVX].*")) {
                        System.out.println(RomeNumbers.arabToRome(result));
                    } else if (example.matches(".*[0123456789].*")) {
                        System.out.println(result);
                    }
                    break;
                }
                case "*": {
                    int result = one * two;
                    if (example.matches(".*[IVX].*")) {
                        System.out.println(RomeNumbers.arabToRome(result));
                    } else if (example.matches(".*[0123456789].*")) {
                        System.out.println(result);
                    }
                    break;
                }
                case "/": {
                    int result = one / two;
                    if (example.matches(".*[IVX].*")) {
                        System.out.println(RomeNumbers.arabToRome(result));
                    } else if (example.matches(".*[0123456789].*")) {
                        System.out.println(result);
                    }
                    break;
                }
                default:
                    System.out.println("Калькулятор может принимать только следующие операции: +, -, *, /");
            }
        }
    }
}




