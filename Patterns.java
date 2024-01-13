// Prisha Shah
// 21st feb -22nd feb
// patterens with loops 

public class Patterns {
    public static void main(String args[]){
       // Pattern : column -- horizontal and row -- vertical
// matrix: column = 5 X rows = 6
    // for(int i =0; i<5;i++){
    //     for(int j=0; j<6; j++){
    //         System.out.print("* ");
    //         }
    //         System.out.println("* ");
    //     }
//--------------------------------------------------------------------------------------------------------------------------------------
// hollow rectangle 
    // int n = 4;
    // int m = 5; 
    // for(int i=1;i<=n;i++){
    //     for(int j=1; j<=m;j++) {
    //         if(i==1 || j==1 || i==n || j==m){
    //             System.out.print("*");
    //         } else{
    //             System.out.print(" ");
    //         }
    //     }
    //     System.out.println();
    // }
//---------------------------------------------------------------------------------------------------------------------------------------
// Right angle trianle 
    // for(int i=1;i<=5;i++){
    //     for(int j=1;j<=i;j++){
    //         System.out.print("*");  
    //      }
    //     System.out.println();
    //     }
//---------------------------------------------------------------------------------------------------------------------------------------
// Reverse the right angle triangle 
    // int n=5;
    // for(int i=n; i>=1; i--){
    //     for(int j=1;j<=i ;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }
//---------------------------------------------------------------------------------------------------------------------------------------
// Inverted right angle triangle 
    // int n=4;
    // for(int i=1; i<=n;i++){
    //     for(int j=1; j<=n-i;j++){
    //         System.out.print(" ");
    //         }
    //     for(int j=1;j<=i;j++){
    //         System.out.print("*");
    //         }
    //     System.out.println();
    //     }
//---------------------------------------------------------------------------------------------------------------------------------------
// Right angle triangles with numbers 
/*
 1
 1 2
 1 2 3 
 1 2 3 4 
 1 2 3 4 5 
 */
// int n=5;
// for(int i=1; i<=n; i++){
//     for(int j=1; j<=i;j++){
//         System.out.print(j);
//     }
//     System.out.println();
// }
//---------------------------------------------------------------------------------------------------------------------------------------
// up-side down right angle triangle with numbers
// int n=4;
// for(int i=1;i<=n;i++){
//     for(int j=1;j<=n-i+1;j++){
//         System.out.print(j);
//     }
//     System.out.println();
// }
//---------------------------------------------------------------------------------------------------------------------------------------
//Floyd's Triangle 
/*
 1
 2 3 
 4 5 6
 7 8 9 10
 11 12 13 14 15
 */
// int n=5;
// int num =0;
// for(int i=1;i<=n;i++){
//     for(int j=1; j<=i;j++){
//         System.out.print(num+" ");
//         num++;
//     }
//     System.out.println();
// }
//---------------------------------------------------------------------------------------------------------------------------------------
// 0-1 triangle 
/*
 1
 0 1
 1 0 1
 0 1 0 1 
 1 0 1 0 1 
 */
// int n=5;
// for(int i=1; i<=n;i++){
//     for(int j=1;j<=i;j++){
//         int sum=i+j;
//         if(sum%2 == 0){
//             System.out.print("1"+" ");
//         }else{
//             System.out.print("0"+" ");
//         }
//     }
//     System.out.println();
// }
//---------------------------------------------------------------------------------------------------------------------------------------
}
}
