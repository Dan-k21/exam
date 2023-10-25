package input;

import java.util.Scanner;

public class Input {
    private static Scanner input = new Scanner(System.in);

    public static int getInputInt() {
        String regexNum = "^[0-9]+$";
        String number;
        while (true) {
            number = input.nextLine();
            if (number.matches(regexNum)) {
                return Integer.parseInt(number);
            } else {
                System.out.print("Vui lòng nhập lại: ");
            }
        }
    }

    public static String getInputString() {
        String regexString = "^[\\p{L}\\s]+$";
        String string;
        while (true) {
            string = input.nextLine();
            if (string.matches(regexString)) {
                return string;
            } else {
                System.out.print("Vui lòng nhập lại: ");
            }
        }
    }


    public static String getInputGender() {
        String regexString = "^(nam|nữ)$";
        String string;
        while (true) {
            string = input.nextLine();
            if (string.matches(regexString)) {
                return string;
            } else {
                System.out.print("Vui lòng nhập lại: ");
            }
        }
    }
}
