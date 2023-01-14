import java.util.Scanner;

public class NameAgeProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of names and ages you want to input: ");
        int numberOfEntries = scanner.nextInt();

        String[] names = new String[numberOfEntries];
        int[] ages = new int[numberOfEntries];

        for (int i = 0; i < numberOfEntries; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scanner.next();
            System.out.print("Enter age for " + names[i] + ": ");
            ages[i] = scanner.nextInt();
        }

        System.out.println("\nEntered names and ages:");
        for (int i = 0; i < numberOfEntries; i++) {
            System.out.println(names[i] + ": " + ages[i]);
        }
    }
}