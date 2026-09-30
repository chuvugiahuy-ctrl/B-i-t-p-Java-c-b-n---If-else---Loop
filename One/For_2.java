import java.util.Scanner;

public class For_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ten: ");
        String name = scanner.nextLine();

        System.out.print("Nhap tuoi: ");
        int age = scanner.nextInt();

        for (int i = 0; i < age; i++) {
            System.out.println(name);
        }

        scanner.close();
    }
}