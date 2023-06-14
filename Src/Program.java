
import java.util.Scanner;
 public class Program {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                System.out.print("Введите количество строк M: ");
                int m = scanner.nextInt();

                System.out.print("Введите количество столбцов N: ");
                int n = scanner.nextInt();

                int[][] matrix = new int[m][n];

                System.out.println("Введите элементы матрицы:");
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        matrix[i][j] = scanner.nextInt();
                    }
                }

                int[][] transposedMatrix = new int[n][m];

                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        transposedMatrix[j][i] = matrix[i][j];
                    }
                }

                System.out.println("Транспонированная матрица:");
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        System.out.print(transposedMatrix[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        }


