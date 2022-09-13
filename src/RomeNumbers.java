public class RomeNumbers {
    static int romeToArab(String values) throws Exception {
        int arab = 0;
        String[] rome = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        for (int i = 0; i < rome.length; i++) {
            if (rome[i].equals(values)) {
                arab = i + 1;
            }
        }
        Exception NullPointerException = null;
        if (arab == 0)  {
            throw new NullPointerException("Калькулятор принимает числа от I до X включительно, не более");
            }
        return arab;
    }

    static String numToRome(int number) {
        String rom = null;
        switch (number) {
            case 0:
                rom = "";
                break;
            case 1:
                rom = "I";
                break;
            case 2:
                rom = "II";
                break;
            case 3:
                rom = "III";
                break;
            case 4:
                rom = "IV";
                break;
            case 5:
                rom = "V";
                break;
            case 6:
                rom = "VI";
                break;
            case 7:
                rom = "VII";
                break;
            case 8:
                rom = "VIII";
                break;
            case 9:
                rom = "IX";
                break;
            case 10:
                rom = "X";
                break;
        }
        return rom;
    }

    static String arabToRome(int number) {
        String str = null;
        if (number <= 0) {
            System.out.println("Римские числа не могут быть отрицательными или равняться нулю");
            return "";
        }
        if (number < 10) {
            str = numToRome(number % 10);
        }
        if (number >= 10 && number < 20) {
            str = "X" + numToRome(number % 10);
        }
        if (number >= 20 && number < 30) {
            str = "XX" + numToRome(number % 10);
        }
        if (number >= 30 && number < 40) {
            str = "XXX" + numToRome(number % 10);
        }
        if (number >= 40 && number < 50) {
            str = "XL" + numToRome(number % 10);
        }
        if (number >= 50 && number < 60) {
            str = "L" + numToRome(number % 10);
        }
        if (number >= 60 && number < 70) {
            str = "LX" + numToRome(number % 10);
        }
        if (number >= 70 && number < 80) {
            str = "LXX" + numToRome(number % 10);
        }
        if (number >= 80 && number < 90) {
            str = "LXXX" + numToRome(number % 10);
        }
        if (number >= 90 && number < 100) {
            str = "XC" + numToRome(number % 10);
        }
        if (number >= 100 && number < 199) {
            str = "C" + numToRome(number % 10);
        }
        return str;
    }
}

