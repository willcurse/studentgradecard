import java.util.Scanner;

class Student {
    private static final int Total = 0;

    public static void main(String[] args) {

        System.out.println("please enter your marks ");
        Scanner sc = new Scanner(System.in);

        System.out.println("For History-:");
        double history = sc.nextDouble();
        if (history < 0 || history > 100) {
            System.out.println("please enter valid marks between 0 & 100");
            return;
        }

        System.out.println("For Maths-:");
        double maths = sc.nextDouble();
        if (maths < 0 || maths > 100) {
            System.out.println("please enter valid marks between 0 & 100");
            return;
        }
        System.out.println("For Hindi-:");
        double hindi = sc.nextDouble();
        if (hindi < 0 || hindi > 100) {
            System.out.println("please enter valid marks between 0 & 100");
            return;
        }
        System.out.println("For Sst-:");
        double sst = sc.nextDouble();
        if (sst < 0 || sst > 100) {
            System.out.println("please enter valid marks between 0 & 100");
            return;
        }
        System.out.println("For English-:");
        double english = sc.nextDouble();
        if (english < 0 || english > 100) {
            System.out.println("please enter valid marks between 0 & 100");
            return;
        }

        double Total = hindi + english + sst + maths + history;
        System.out.println("Total marks are " + Total);

        double Avg = Total / (5 * 100) * 100;
        System.out.println("Average marks are " + Avg);

        char grade;
        if (Avg >= 90) {
            grade = 'A';
        } else if (Avg >= 80) {
            grade = 'B';
        } else if (Avg >= 70) {
            grade = 'C';
        } else if (Avg >= 60) {
            grade = 'D';
        } else {
            grade = 'E';
        }

        System.out.println("You got " +grade+ " grade");

    }

}