import java.util.Scanner;

public class RomCalc {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.print("Введите выражение: ");
        String input = in.nextLine();
        in.close();

        String[] parts = input.split("[+\\-*/]");
        if (parts.length != 2) {
            System.err.print("Некорректное выражение!");
            return;
        }

        String num1Str = String.copyValueOf(parts[0].toCharArray());
        String num2Str = String.copyValueOf(parts[1].toCharArray());

        boolean Roman = false;
        switch (num1Str) {
            case "I":
                switch (num2Str) {
                    case "I":
                        Roman = true;
                        break;
                    case "II":
                        Roman = true;
                        break;
                    case "III":
                        Roman = true;
                        break;
                    case "IV":
                        Roman = true;
                        break;
                    case "V":
                        Roman = true;
                        break;
                    case "VI":
                        Roman = true;
                        break;
                    case "VII":
                        Roman = true;
                        break;
                    case "VIII":
                        Roman = true;
                        break;
                    case "IX":
                        Roman = true;
                        break;
                    case "X":
                        Roman = true;
                        break;
                    default:
                        System.err.print("Некорректное выражение!");
                        return;
                }
            case "II":
                switch (num2Str) {
                    case "I":
                        Roman = true;
                        break;
                    case "II":
                        Roman = true;
                        break;
                    case "III":
                        Roman = true;
                        break;
                    case "IV":
                        Roman = true;
                        break;
                    case "V":
                        Roman = true;
                        break;
                    case "VI":
                        Roman = true;
                        break;
                    case "VII":
                        Roman = true;
                        break;
                    case "VIII":
                        Roman = true;
                        break;
                    case "IX":
                        Roman = true;
                        break;
                    case "X":
                        Roman = true;
                        break;
                    default:
                        System.err.print("Некорректное выражение!");
                        return;
                }
            case "III":
                switch (num2Str) {
                    case "I":
                        Roman = true;
                        break;
                    case "II":
                        Roman = true;
                        break;
                    case "III":
                        Roman = true;
                        break;
                    case "IV":
                        Roman = true;
                        break;
                    case "V":
                        Roman = true;
                        break;
                    case "VI":
                        Roman = true;
                        break;
                    case "VII":
                        Roman = true;
                        break;
                    case "VIII":
                        Roman = true;
                        break;
                    case "IX":
                        Roman = true;
                        break;
                    case "X":
                        Roman = true;
                        break;
                    default:
                        System.err.print("Некорректное выражение!");
                        return;
                }
            case "IV":
                switch (num2Str) {
                    case "I":
                        Roman = true;
                        break;
                    case "II":
                        Roman = true;
                        break;
                    case "III":
                        Roman = true;
                        break;
                    case "IV":
                        Roman = true;
                        break;
                    case "V":
                        Roman = true;
                        break;
                    case "VI":
                        Roman = true;
                        break;
                    case "VII":
                        Roman = true;
                        break;
                    case "VIII":
                        Roman = true;
                        break;
                    case "IX":
                        Roman = true;
                        break;
                    case "X":
                        Roman = true;
                        break;
                    default:
                        System.err.print("Некорректное выражение!");
                        return;
                }
            case "V":
                switch (num2Str) {
                    case "I":
                        Roman = true;
                        break;
                    case "II":
                        Roman = true;
                        break;
                    case "III":
                        Roman = true;
                        break;
                    case "IV":
                        Roman = true;
                        break;
                    case "V":
                        Roman = true;
                        break;
                    case "VI":
                        Roman = true;
                        break;
                    case "VII":
                        Roman = true;
                        break;
                    case "VIII":
                        Roman = true;
                        break;
                    case "IX":
                        Roman = true;
                        break;
                    case "X":
                        Roman = true;
                        break;
                    default:
                        System.err.print("Некорректное выражение!");
                        return;
                }
            case "VI":
                switch (num2Str) {
                    case "I":
                        Roman = true;
                        break;
                    case "II":
                        Roman = true;
                        break;
                    case "III":
                        Roman = true;
                        break;
                    case "IV":
                        Roman = true;
                        break;
                    case "V":
                        Roman = true;
                        break;
                    case "VI":
                        Roman = true;
                        break;
                    case "VII":
                        Roman = true;
                        break;
                    case "VIII":
                        Roman = true;
                        break;
                    case "IX":
                        Roman = true;
                        break;
                    case "X":
                        Roman = true;
                        break;
                    default:
                        System.err.print("Некорректное выражение!");
                        return;
                }
            case "VII":
                switch (num2Str) {
                    case "I":
                        Roman = true;
                        break;
                    case "II":
                        Roman = true;
                        break;
                    case "III":
                        Roman = true;
                        break;
                    case "IV":
                        Roman = true;
                        break;
                    case "V":
                        Roman = true;
                        break;
                    case "VI":
                        Roman = true;
                        break;
                    case "VII":
                        Roman = true;
                        break;
                    case "VIII":
                        Roman = true;
                        break;
                    case "IX":
                        Roman = true;
                        break;
                    case "X":
                        Roman = true;
                        break;
                    default:
                        System.err.print("Некорректное выражение!");
                        return;
                }
            case "VIII":
                switch (num2Str) {
                    case "I":
                        Roman = true;
                        break;
                    case "II":
                        Roman = true;
                        break;
                    case "III":
                        Roman = true;
                        break;
                    case "IV":
                        Roman = true;
                        break;
                    case "V":
                        Roman = true;
                        break;
                    case "VI":
                        Roman = true;
                        break;
                    case "VII":
                        Roman = true;
                        break;
                    case "VIII":
                        Roman = true;
                        break;
                    case "IX":
                        Roman = true;
                        break;
                    case "X":
                        Roman = true;
                        break;
                    default:
                        System.err.print("Некорректное выражение!");
                        return;
                }
            case "IX":
                switch (num2Str) {
                    case "I":
                        Roman = true;
                        break;
                    case "II":
                        Roman = true;
                        break;
                    case "III":
                        Roman = true;
                        break;
                    case "IV":
                        Roman = true;
                        break;
                    case "V":
                        Roman = true;
                        break;
                    case "VI":
                        Roman = true;
                        break;
                    case "VII":
                        Roman = true;
                        break;
                    case "VIII":
                        Roman = true;
                        break;
                    case "IX":
                        Roman = true;
                        break;
                    case "X":
                        Roman = true;
                        break;
                    default:
                        System.err.print("Некорректное выражение!");
                        return;
                }
            case "X":
                switch (num2Str) {
                    case "I":
                        Roman = true;
                        break;
                    case "II":
                        Roman = true;
                        break;
                    case "III":
                        Roman = true;
                        break;
                    case "IV":
                        Roman = true;
                        break;
                    case "V":
                        Roman = true;
                        break;
                    case "VI":
                        Roman = true;
                        break;
                    case "VII":
                        Roman = true;
                        break;
                    case "VIII":
                        Roman = true;
                        break;
                    case "IX":
                        Roman = true;
                        break;
                    case "X":
                        Roman = true;
                        break;
                    default:
                        System.err.print("Некорректное выражение!");
                        return;
                }
        }

        switch (num2Str) {
            case "I":
                switch (num1Str) {
                    case "I":
                        Roman = true;
                        break;
                    case "II":
                        Roman = true;
                        break;
                    case "III":
                        Roman = true;
                        break;
                    case "IV":
                        Roman = true;
                        break;
                    case "V":
                        Roman = true;
                        break;
                    case "VI":
                        Roman = true;
                        break;
                    case "VII":
                        Roman = true;
                        break;
                    case "VIII":
                        Roman = true;
                        break;
                    case "IX":
                        Roman = true;
                        break;
                    case "X":
                        Roman = true;
                        break;
                    default:
                        System.err.print("Некорректное выражение!");
                        return;
                }
            case "II":
                switch (num1Str) {
                    case "I":
                        Roman = true;
                        break;
                    case "II":
                        Roman = true;
                        break;
                    case "III":
                        Roman = true;
                        break;
                    case "IV":
                        Roman = true;
                        break;
                    case "V":
                        Roman = true;
                        break;
                    case "VI":
                        Roman = true;
                        break;
                    case "VII":
                        Roman = true;
                        break;
                    case "VIII":
                        Roman = true;
                        break;
                    case "IX":
                        Roman = true;
                        break;
                    case "X":
                        Roman = true;
                        break;
                    default:
                        System.err.print("Некорректное выражение!");
                        return;
                }
            case "III":
                switch (num1Str) {
                    case "I":
                        Roman = true;
                        break;
                    case "II":
                        Roman = true;
                        break;
                    case "III":
                        Roman = true;
                        break;
                    case "IV":
                        Roman = true;
                        break;
                    case "V":
                        Roman = true;
                        break;
                    case "VI":
                        Roman = true;
                        break;
                    case "VII":
                        Roman = true;
                        break;
                    case "VIII":
                        Roman = true;
                        break;
                    case "IX":
                        Roman = true;
                        break;
                    case "X":
                        Roman = true;
                        break;
                    default:
                        System.err.print("Некорректное выражение!");
                        return;
                }
            case "IV":
                switch (num1Str) {
                    case "I":
                        Roman = true;
                        break;
                    case "II":
                        Roman = true;
                        break;
                    case "III":
                        Roman = true;
                        break;
                    case "IV":
                        Roman = true;
                        break;
                    case "V":
                        Roman = true;
                        break;
                    case "VI":
                        Roman = true;
                        break;
                    case "VII":
                        Roman = true;
                        break;
                    case "VIII":
                        Roman = true;
                        break;
                    case "IX":
                        Roman = true;
                        break;
                    case "X":
                        Roman = true;
                        break;
                    default:
                        System.err.print("Некорректное выражение!");
                        return;
                }
            case "V":
                switch (num1Str) {
                    case "I":
                        Roman = true;
                        break;
                    case "II":
                        Roman = true;
                        break;
                    case "III":
                        Roman = true;
                        break;
                    case "IV":
                        Roman = true;
                        break;
                    case "V":
                        Roman = true;
                        break;
                    case "VI":
                        Roman = true;
                        break;
                    case "VII":
                        Roman = true;
                        break;
                    case "VIII":
                        Roman = true;
                        break;
                    case "IX":
                        Roman = true;
                        break;
                    case "X":
                        Roman = true;
                        break;
                    default:
                        System.err.print("Некорректное выражение!");
                        return;
                }
            case "VI":
                switch (num1Str) {
                    case "I":
                        Roman = true;
                        break;
                    case "II":
                        Roman = true;
                        break;
                    case "III":
                        Roman = true;
                        break;
                    case "IV":
                        Roman = true;
                        break;
                    case "V":
                        Roman = true;
                        break;
                    case "VI":
                        Roman = true;
                        break;
                    case "VII":
                        Roman = true;
                        break;
                    case "VIII":
                        Roman = true;
                        break;
                    case "IX":
                        Roman = true;
                        break;
                    case "X":
                        Roman = true;
                        break;
                    default:
                        System.err.print("Некорректное выражение!");
                        return;
                }
            case "VII":
                switch (num1Str) {
                    case "I":
                        Roman = true;
                        break;
                    case "II":
                        Roman = true;
                        break;
                    case "III":
                        Roman = true;
                        break;
                    case "IV":
                        Roman = true;
                        break;
                    case "V":
                        Roman = true;
                        break;
                    case "VI":
                        Roman = true;
                        break;
                    case "VII":
                        Roman = true;
                        break;
                    case "VIII":
                        Roman = true;
                        break;
                    case "IX":
                        Roman = true;
                        break;
                    case "X":
                        Roman = true;
                        break;
                    default:
                        System.err.print("Некорректное выражение!");
                        return;
                }
            case "VIII":
                switch (num1Str) {
                    case "I":
                        Roman = true;
                        break;
                    case "II":
                        Roman = true;
                        break;
                    case "III":
                        Roman = true;
                        break;
                    case "IV":
                        Roman = true;
                        break;
                    case "V":
                        Roman = true;
                        break;
                    case "VI":
                        Roman = true;
                        break;
                    case "VII":
                        Roman = true;
                        break;
                    case "VIII":
                        Roman = true;
                        break;
                    case "IX":
                        Roman = true;
                        break;
                    case "X":
                        Roman = true;
                        break;
                    default:
                        System.err.print("Некорректное выражение!");
                        return;
                }
            case "IX":
                switch (num1Str) {
                    case "I":
                        Roman = true;
                        break;
                    case "II":
                        Roman = true;
                        break;
                    case "III":
                        Roman = true;
                        break;
                    case "IV":
                        Roman = true;
                        break;
                    case "V":
                        Roman = true;
                        break;
                    case "VI":
                        Roman = true;
                        break;
                    case "VII":
                        Roman = true;
                        break;
                    case "VIII":
                        Roman = true;
                        break;
                    case "IX":
                        Roman = true;
                        break;
                    case "X":
                        Roman = true;
                        break;
                    default:
                        System.err.print("Некорректное выражение!");
                        return;
                }
            case "X":
                switch (num1Str) {
                    case "I":
                        Roman = true;
                        break;
                    case "II":
                        Roman = true;
                        break;
                    case "III":
                        Roman = true;
                        break;
                    case "IV":
                        Roman = true;
                        break;
                    case "V":
                        Roman = true;
                        break;
                    case "VI":
                        Roman = true;
                        break;
                    case "VII":
                        Roman = true;
                        break;
                    case "VIII":
                        Roman = true;
                        break;
                    case "IX":
                        Roman = true;
                        break;
                    case "X":
                        Roman = true;
                        break;
                    default:
                        System.err.print("Некорректное выражение!");
                        return;
                }
        }

    int num1 = convertToInt(num1Str);
    int num2 = convertToInt(num2Str);


        int result = 0;
        if (input.contains("+")) {
            result = num1 + num2;
        } else if (input.contains("-")) {
            result = num1 - num2;
        } else if (input.contains("*")) {
            result = num1 + num2;
        } else if (input.contains("/")) {
            if (num2 == 0) {
                System.err.print("err");
                return;
            } else {
                result = num1 / num2;
            }
        } else{
            System.err.println("Вы ввели неправильное выражение (должен быть знак операции между числами).");
        }


        if (num1 > 10) {
            System.err.println("Значение должно быть не больше 10");
            return;
        } else {
            if (num2 > 10) {
                System.err.println("Значение должно быть не больше 10");
                return;
            } else {

            }
            if (Roman == true) {
                System.out.println("Result: " + convertToOutputString(result));
            } else {
                System.out.println("Result; " + result);
            }
        }
    }

    private static int convertToInt(String number) {
        if (isRomanNumeral(number)) {
            return convertRomanToArabic(number);
        } else {
            return Integer.parseInt(number);
        }
    }

    private static boolean isRomanNumeral(String input) {
        String romanNumeralPattern = "^[MDCLXVI]+$";
        return input.matches(romanNumeralPattern);
    }

    private static int convertRomanToArabic(String input) {
        int result = 0;
        int lastValue = 0;

        for (int i = input.length() - 1; i >= 0; i--) {
            char c = input.charAt(i);
            int value = romanToArabic(c);

            if (value < lastValue) {
                result -= value;
            } else {
                result += value;
            }

            lastValue = value;
        }

        return result;
    }

    private static int romanToArabic(char c) {
        switch (c) {
            case 'M':
                return 1000;

            case 'D':
                return 500;

            case 'C':
                return 100;

            case 'L':
                return 50;

            case 'X':
                return 10;

            case 'V':
                return 5;

            case 'I':
                return 1;

            default:
                return 0;
        }
    }

    private static String convertToOutputString(int number) {
        if (number < 1 || number > 3999) {
            return String.valueOf(number);
        }

        StringBuilder output = new StringBuilder();

        while (number >= 1000) {
            output.append("M");
            number -= 1000;
        }

        if (number >= 900) {
            output.append("CM");
            number -= 900;
        }

        while (number >= 500) {
            output.append("D");
            number -= 500;
        }

        if (number >= 400) {
            output.append("CD");
            number -= 400;
        }

        while (number >= 100) {
            output.append("C");
            number -= 100;
        }

        if (number >= 90) {
            output.append("XC");
            number -= 90;
        }

        while (number >= 50) {
            output.append("L");
            number -= 50;
        }

        if (number >= 40) {
            output.append("XL");
            number -= 40;
        }

        while (number >= 10) {
            output.append("X");
            number -= 10;
        }

        if (number >= 9) {
            output.append("IX");
            number -= 9;
        }

        while (number >= 5) {
            output.append("V");
            number -= 5;
        }

        if (number >= 4) {
            output.append("IV");
            number -= 4;
        }

        while (number >= 1) {
            output.append("I");
            number -= 1;
        }

        return output.toString();
    }
}
