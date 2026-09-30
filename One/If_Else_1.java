import java.util.Scanner;

public class If_Else_1 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Vui long nhap cap bac cua ban: ");
        String grade = scanner1.nextLine();
        System.out.println("Vui long nhap luong co ban: ");
        double salary = scanner1.nextDouble();
        int allowance = 100; //default hang other 
        if (grade.equalsIgnoreCase("A")) {
            allowance = 300;
        } else if (grade.equalsIgnoreCase("B")) {
            allowance = 250;
        } 
        salary = salary + allowance;
        System.out.println("Luong thuc nhan la: " + salary);
        scanner1.close();
    }
}