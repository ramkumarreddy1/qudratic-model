import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Hello3 {
    public static void main(String[] args) {
        try {
            File file = new File("input.txt");
            Scanner sc = new Scanner(file);
            int caseNumber = 1;

            while (sc.hasNextLine()) {
                String line = sc.nextLine().trim();
                if (line.isEmpty()) continue;

                String[] parts = line.split(" ");
                double a = Double.parseDouble(parts[0]);
                double b = Double.parseDouble(parts[1]);
                double c = Double.parseDouble(parts[2]);

                double discriminant = b * b - 4 * a * c;

                System.out.println("Case #" + caseNumber + ":");

                if (discriminant > 0) {
                    double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                    double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                    System.out.println("Roots are real and different: " + root1 + ", " + root2);
                } else if (discriminant == 0) {
                    double root = -b / (2 * a);
                    System.out.println("Roots are real and equal: " + root);
                } else {
                    System.out.println("Roots are complex.");
                }

                System.out.println();
                caseNumber++;
            }

            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
