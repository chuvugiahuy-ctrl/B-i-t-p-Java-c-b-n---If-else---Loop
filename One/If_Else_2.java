import java.util.Scanner;

public class If_Else_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap diem cua ban: ");
        double score = scanner.nextDouble();

        System.out.println("------------------------------");

        if (score > 75) {
            System.out.println("A");
        } else if (score > 60) {
            System.out.println("B");
        } else if (score > 45) {
            System.out.println("C");
        } else if (score > 35) {
            System.out.println("D");
        } else {
            System.out.println("E");
        }
    }
}