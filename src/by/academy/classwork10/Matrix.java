package by.academy.classwork10;

public class Matrix {
    public static void main(String[] args) {
        String [][] arrMatrix = new String [50][50];

        for (int i = 0; i < arrMatrix.length; i++) {
            for (int j = 0; j < arrMatrix[i].length; j++) {
                if ((i + j) % 2 == 0) arrMatrix[i][j] = "0";
                else arrMatrix[i][j] = "1";
                System.out.print(arrMatrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}