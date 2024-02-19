import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of elements: ");
            int count = scanner.nextInt();
            
            int[] numbers = new int[count];
            
            System.out.print("Enter the numbers:");
            for (int i = 0; i < count; i++) {
                numbers[i] = scanner.nextInt();
            }
            
            System.out.print("Input numbers:");
            for (int i = 0; i < count; i++) {
                System.out.print(numbers[i]+",");
            }
        }
    }
}