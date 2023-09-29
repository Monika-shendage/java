package array;

import java.util.Scanner;

public class arraymatrix {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter Rows value");
        int row = sc1.nextInt();
        System.out.println("Enter Col value");
        int col = sc1.nextInt();
        int[][] arr = new int[row][col];
        int temp[][] = new int[row][col];
        System.out.println("Enter Matrix value");


        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc1.nextInt();
            }
        }
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    temp[j][i] = arr[i][j];
                }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(temp[i][j] + "\t");
            }
            System.out.println();
        }



    }
}
