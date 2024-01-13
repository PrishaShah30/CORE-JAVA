// Prisha Shah
// 11th Feb 2023 
// If Else , Else if -- These are a kind of keywords 

public class ConditionalsAndLoops {
    public static void main(String args[]){
        // if(Math.random()<0.5){
        //     System.out.println("heads");
        // }
        // else{
        //     System.out.println("Tails");
        // }

// TwoSort
// int a = Integer.parseInt(args[0]);
// int b = Integer.parseInt(args[1]);
// if(b<a){
//     int t=a;
//     a=b;
//     b=t;
// }
// System.out.println(a);
// System.out.println(b);

// Three Sort 
int a = Integer.parseInt(args[0]);
int b = Integer.parseInt(args[1]);
int c = Integer.parseInt(args[2]);
if(a<b){
    // b is bigger 
    int temp = a;
    a = b;
    b = temp;
}
else{
    if(b>c){
        // if b is bigger 
        int tem = b;
        b = c;
        c = tem;
    }
    else{
        // c>a
        int te = c;
        c = a;
        a = te;
    }
}
System.out.println(a);
System.out.println(b);
System.out.println(c);
    }
}



