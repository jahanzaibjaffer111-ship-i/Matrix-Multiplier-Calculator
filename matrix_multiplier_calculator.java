import java.util.Scanner;
public class matrix_multiplier_calculator
{
    public static void main(String[] args)
    {
        try (Scanner read = new Scanner(System.in)) 
        {
            System.out.println("Hello");
            System.out.println("Welcome to matrix multiplier calculator");
            while(true)
            {
                System.out.println("Enter row of first matrix");
                int row1=read.nextInt();
                System.out.println();
                System.out.println("Enter column of first matrix");
                int column1=read.nextInt();
                read.nextLine();
                System.out.println();
                int matrix1 [][]=new int [row1][column1];
                System.out.println("Enter first matrix");
                for (int i=0; i<row1; i++)
                {
                    for (int j=0; j<column1; j++)
                    {
                        matrix1 [i][j]=read.nextInt();
                    }  
                }
                System.out.println();
                System.out.println("First matrix is");
                for (int i=0; i<row1; i++)
                {
                    for (int j=0; j<column1; j++)
                    {
                        System.out.print(matrix1[i][j]+" ");
                    }
                    System.out.println();
                }
                System.out.println();
                System.out.println("Enter row of second matrix");
                int row2=read.nextInt();
                System.out.println();
                System.out.println("Enter column of second matrix");
                int column2=read.nextInt();
                read.nextLine();
                System.out.println();
                int matrix2 [][]=new int [row2][column2];
                System.out.println("Enter second matrix");
                for (int i=0; i<row2; i++)
                {
                    for (int j=0; j<column2; j++)
                    {
                        matrix2 [i][j]=read.nextInt();
                    }  
                }
                System.out.println();
                System.out.println("second matrix is");
                for (int i=0; i<row2; i++)
                {
                    for (int j=0; j<column2; j++)
                    {
                        System.out.print(matrix2[i][j]+" ");
                    }      
                    System.out.println();
                }
                read.nextLine();
                int n;
                int matrixM [][]=new int [row1][column2];
                System.out.println();
                if(column1==row2)
                {
                    System.out.println("Multiplication possible");
                    System.out.println();
                    System.out.println("type exit if you dont want to get multiple of both matrices and want to continue the calculator");
                    String b=read.nextLine();
                    if(b.equalsIgnoreCase("exit"))
                    {
                        System.out.println();
                        continue;
                    }
                    else
                    {
                        System.out.println();
                        System.out.println("product matrix is");
                        for(int i=0; i<row1; i++)
                        {
                            for (int j=0; j<column2; j++)
                            {
                                int sum=0;
                                for(int k=0; k<column1; k++)
                                {
                                    n=matrix1[i][k]*matrix2[k][j];
                                    sum+=n;
                                    matrixM [i][j]=sum;
                                }
                            }
                        }
                        for (int i=0; i<row1; i++)
                        {
                            for (int j=0; j<column2; j++)
                            {
                                System.out.print(matrixM[i][j]+" ");
                            }  
                            System.out.println();
                        }
                    }
                }
                else
                {
                    System.out.println("multiplication not possible");
                }
                System.out.println();
                System.out.println("To close calculator type exit otherwise type anything to continue");
                String a=read.nextLine();
                if(a.equalsIgnoreCase("exit"))
                {
                    System.out.println();
                    System.out.println("Thanks");
                    System.out.println("Bye");
                    break;
                }
                else
                {
                    System.out.println();
                }
            }
        }
    }

}
