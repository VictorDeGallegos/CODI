//Arreglos de 2 dimensiones también conocidos como matrices

import java.util.Scanner;
public class Main {

/*int matriz[][] = new int [3][3];
   int matriz[][] = {{1,2,3},
                  {4,5,6},
                 {7,8,9}};
 */

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int m [][] = new int[x][y];
        int n;

        for(int i=0; i<x; i++) {
                for(int j=0; j<y; j++) {
                        n = (int)(Math.random()*1000);
                        m[i] [j] = n;
                }
        }

        for(int i=0; i<x; i++) {
                for(int j=0; j<y; j++) {
                        System.out.println(m[i][j]);
                }
        }

}
}
