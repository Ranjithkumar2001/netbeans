
package javalearning1;


public class twod {
    public static void main(String[] args)
    {
        int arr[][]=new int [3][4];
        //int arr[][]={{10,20,30,40},{50,60,70,80},{90,100,110,120}};
        int k=0;
        for(int row =0;row<3;row++)
        {
            for(int col=0;col<4;col++)
            {
                k+=10;
                arr[row][col]=k;
                
            }
        }
        for(int r=0;r<3;r++)
        {
            for(int c=0;c<4;c++)
            {
                System.out.print(" "+arr[r][c]);
            }
            System.out.println();
        }
    }
    
}
