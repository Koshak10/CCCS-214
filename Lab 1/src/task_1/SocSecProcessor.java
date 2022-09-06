import java.util.Scanner;

public class SocSecProcessor {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        char choice;
        do {
            System.out.print("Name? ");
            String name = keyboard.nextLine();

            System.out.print("SSN? ");
            String ssn = keyboard.nextLine();

            try {
                if (isValid(ssn)) {
                    System.out.println(name + " " + ssn + " is valid");
                }
            } catch (SocSecException e) {
                System.out.println(e.getMessage());
            }

            System.out.print("Continue? ");
            choice = keyboard.nextLine().charAt(0);
        } while (choice == 'y' || choice == 'Y');
    }

    public static boolean isValid(String ssn) throws SocSecException {
        int length = ssn.length();

        if (length != 11)
            throw new SocSecException("wrong number of characters");

        for (int i = 0; i < length; i++) {
            char c = ssn.charAt(i);
            if (i <= 2 || i == 4 || i == 5 || i >= 7) {
                if (!(c >= '0' && c <= '9')) {
                    throw new SocSecException("contains a character that is not a digit");
                }
            } else {
                if (c != '-')
                    throw new SocSecException("dashes at wrong positions");
            }
        }

        return true;
    }

}
