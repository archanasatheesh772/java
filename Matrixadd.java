import java.util.Scanner;
class Matrixadd{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows:");
        int r = sc.nextInt();
        System.out.println("enter the no of column:");
        int c = sc.nextInt();
        int[][]A = new int[r][c];
        int[][]B = new int[r][c]; 
        int[][]sum = new int[r][c];
        System.out.println("enter elements of matrix in A:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter elements of matrix B:");
         for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                B[i][j] = sc.nextInt();
             }
        }

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                sum[i][j] = A[i][j]+ B[i][j];
            }
        }
        System.out.println("sum of matrices:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.println(sum[i][j] +"");
            }
            System.out.println();
        }
    }
}
        