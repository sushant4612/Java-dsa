import java.util.Scanner;

public class AdjMat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of vertices and edges");
        int v = in.nextInt();
        int e = in.nextInt();
        int[][] adjMat = new int[v][v];
        for(int i = 0; i < e; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            adjMat[a][b] = 1;
            adjMat[b][a] = 1;
        }

        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                System.out.print(adjMat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
