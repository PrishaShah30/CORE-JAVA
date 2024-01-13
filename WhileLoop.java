public class WhileLoop {
    public static void main(String args[]){
        // Print the powers of two from 2^0 to 2^n
        // int i=0;                            // 1 initialize
        // int v = 1;                          // 1 initialize
        // int n = Integer.parseInt(args[0]);  // 1 initialize
        // while(i<=n){                        // loop so here firstly if it was i<n then n+1 but its i<=n where we also check i=n so n+2
        //     System.out.println(v);          // n+1
        //     i+=1;                           // n+1
        //     v=2*v;                          // n+1
        // }

        // So total operations :
        // 3 + (n+2) + 3(n+1)

// The for loop (its an alternative for the while loop)
// it's the simpler version 
// int k = 0;
// while (k<times){
//     k+=1;
// }

// // same thing in for
// for(int k=0; k< times;k++){ }


    // SUBDIVISIONS OF RULER 
    // 1 
    // 1 2 1 
    // 1 2 1 3 1 2 1
    // int N = Integer.parseInt(args[0]);
    // String ruler = " ";
    // for(int j=1; j<=N;j++){
    //     ruler= ruler + j + ruler;
    //     System.out.println(ruler);
    // }

    // What does the program print 
    int f = 0;
    int g = 1;
    for(int i=0;i<=10;i++){
        System.out.println(f);
        f+=g;
        g = f-g;
    }
    // output : 0 1 1 2 3 5 8 13 21 34 55 
    }
}
