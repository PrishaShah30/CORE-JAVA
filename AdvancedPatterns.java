// Prisha shah 
// 22nd feb 
// advanced patterns with loops 

public class AdvancedPatterns {
    public static void main(String args[]){
// butterfly pattern 
    //  int n =6;
    //  // Upper half 
    //  // first part 
    //  for(int i=1; i<=n; i++){
    //     for(int j=1; j<=i;j++){
    //         System.out.print("*");
    //     }
    //     // spaces 
    //     int spaces = 2*(n-i);
    //     for(int j=1; j<=spaces;j++){
    //         System.out.print(" ");
    //     }
    //     //2nd part
    //     for(int j=1;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    //  }

    // // lower half
    // for(int i=n; i>=1; i--){
    //     for(int j=1; j<=i;j++){
    //         System.out.print("*");
    //     }
    //     // spaces 
    //     int spaces = 2*(n-i);
    //     for(int j=1; j<=spaces;j++){
    //         System.out.print(" ");
    //     }
    //     //2nd part
    //     for(int j=1;j<=i;j++){
    //         System.out.print("*" );
    //     }
    //     System.out.println();
    //  }
//-----------------------------------------------------------------------------------------------------------------------------------------------------
//Solid Rhombus
// int n=5;
// for(int i=1;i<=n;i++){
//     //spaces
//     for(int j=1; j<=n-i; j++){
//         System.out.print(" ");
//     }
//     // stars
//     for(int j=1;j<=5;j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }
//-----------------------------------------------------------------------------------------------------------------------------------------------------
//Numeric Pyramid 
// int n=5;
// for(int i=1;i<=n;i++){
//     //spaces
//     for(int j=1;j<= n-i;j++){
//         System.out.print(" ");
//     }
//     // number -> print row no. and row no. times 
//     for(int j=1;j<=i;j++){
//         System.out.print(i+" ");
//     }
//     System.out.println();
// }
//-----------------------------------------------------------------------------------------------------------------------------------------------------
// Palindromic Pattern 
/*
     1
   2 1 2 
  3 2 1 2 3 
 4 3 2 1 2 3 4 
5 4 3 2 1 2 3 4 5 
 */
// int n=5;
// for(int i=1;i<=n;i++){
//     //spaces
//     for(int j=1; j<=n-i;j++){
//         System.out.print(" ");
//     }
//     //1st half number 
//     for(int j=i;j>=1;j--){
//         System.out.print(j);
//     }
//     //2nd half numbers 
//     for(int j=2;j<=i;j++){
//         System.out.print(j);
//     }
//     System.out.println();
// }
//-----------------------------------------------------------------------------------------------------------------------------------------------------
//Daimond pattern 
// int n=4;
//     //upper half
//     for(int i=1;i<=n;i++){
//         //spaces
//         for(int j=1; j<=n-i; j++){
//             System.out.print(" ");
//         }
//         //stars 
//         for(int j=1;j<=2*i-1;j++){
//             System.out.print("*");
//         }
//         System.out.println();
//     }
//     //lower half
//     for(int i=n;i>=1;i--){
//         //spaces
//         for(int j=1; j<=n-i; j++){
//             System.out.print(" ");
//         }
//         //stars 
//         for(int j=1;j<=2*i-1;j++){
//             System.out.print("*");
//         }
//         System.out.println();
//     }
}
}
