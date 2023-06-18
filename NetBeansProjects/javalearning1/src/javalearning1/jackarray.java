/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javalearning1;

/**
 *
 * @author LENOVO
 */
public class jackarray
{
    public static void main(String[] args)
    {
        //int arr[][]={{10},{20,30},{40,50,60},{70,80}};
       int arr[][]=new int[4][];
        arr[0]=new int [1];
        arr[1]=new int [2];
        arr[2]=new int [3];
        arr[3]=new int [4];
         int k=0;
        for(int row =0;row<4;row++)
        {
            for(int col=0;col<row+1;col++)
            {
                k+=10;
                arr[row][col]=k;
                
            }
        }
        for(int r=0;r<4;r++)
        {
            for(int c=0;c<r+1;c++)
            {
                System.out.print(" "+arr[r][c]);
            }
            System.out.println();
        }
    }
}
