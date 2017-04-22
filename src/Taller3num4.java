import java.util.Scanner;
 
class TransposeAMatrix
{
   public static void main(String args[])
   {
      int m, n, c, d;
 
      Scanner in = new Scanner(System.in);
      System.out.println("Introduzca el número de filas y columnas de matriz");
      m = in.nextInt();
      n = in.nextInt();
 
      int matrix[][] = new int[m][n];
 
      System.out.println("Introduzca los elementos de la matriz");
 
      for ( c = 0 ; c < m ; c++ )
         for ( d = 0 ; d < n ; d++ )
            matrix[c][d] = in.nextInt();
 
      int transpose[][] = new int[n][m];
 
      for ( c = 0 ; c < m ; c++ )
      {
         for ( d = 0 ; d < n ; d++ )               
            transpose[d][c] = matrix[c][d];
      }
 
      System.out.println("Transposición de la matriz introducida: -");
 
      for ( c = 0 ; c < n ; c++ )
      {
         for ( d = 0 ; d < m ; d++ )
               System.out.print(transpose[c][d]+"\t");
 
         System.out.print("\n");
      }
   }
}