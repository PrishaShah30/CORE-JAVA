import java.util.*;
public class Array2D1{
    public static void main(String args[]){

    // Declarartion of an array 
    //Datatype[ ] [ ] variable/array name = new datatype[ rows size] [columns size];
    // it's always rows*columns
    Scanner sc = new Scanner(System.in);
    int rows = sc.nextInt();
    int columns = sc.nextInt();
    
    int[][] numbers = new int[rows][columns];
    // taking input 
    // rows
    for(int i=0;i<rows;i++){
        //columns  
        for(int j=0;j<columns;j++){
            numbers[i][j] = sc.nextInt();
        }
    }
    //output 
    // for(int i=0; i<rows;i++){
    //     for(int j=0; j<columns;j++){
    //         System.out.print(numbers[i][j]+" ");
    //     }
    //     System.out.println();
    // }
    //Take a 2D array as input from the user and search for a given number x also print the incices at which it occurs 
    // input remains the same as abovev 
    /*
    [0][0] [0][1] [0][2] [0][3] 
     1 2 3 4 
     4 3 2 11
     1 2 3 4

     x = 11
     */
    int x = sc.nextInt();
    for(int i =0; i<rows;i++){
        for(int j=0;j<columns;j++){
        //compare with x for x to be found 
        if(numbers[i][j] == x){
        System.out.println("X found at locations ("+ i +","+ j + ")");
        }
    }
    }
    }  
}
