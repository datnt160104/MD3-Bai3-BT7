package rikkei.academy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập kích thước ma trận vuông: ");
        int n = scanner.nextInt();

        double[][] matrix = new double[n][n];
        System.out.println("Nhập ma trận vuông: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }

        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += matrix[i][i];
        }

        System.out.println("Tổng các phần tử trên đường chéo chính là: " + sum);

    }
}
