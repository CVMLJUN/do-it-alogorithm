import java.util.Scanner;

public class P1546_평균 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arrGrade = new int[N];
        for (int i = 0; i < N; i++) {
            arrGrade[i] = sc.nextInt();
        }

        long sum = 0;
        int maxValue = 0;

        for (int num : arrGrade) {
            if (maxValue < num) maxValue = num;
            sum += num;
        }

        System.out.println(sum * 100.0 / maxValue / N);
    }
}
