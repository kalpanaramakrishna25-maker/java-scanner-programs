import java.util.Scanner;

public class StudentPassFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        if (marks >= 35)
            System.out.println("PASS");
        else
            System.out.println("FAIL");

        sc.close();
    }
}
