public class BreakContinue {
    public static void main (String args[]){
    // you dont have to use to often as usually people dont like to keep a contnuos
    // check to as where the code broke and where it continues.

    // break
    // for(
    // int i = 1;i<=5;i++)
    // {
    // if (i == 3) {
    // break; // when i is 3 jump out of the loop
    // }
    // System.out.println(i);
    // }
    // excution continues here after the loop;
    // System.out.println("line after the loop");

    // continue
    for(int i = 1;i<=5;i++)
    {
        if (i == 2) {
            continue; // this means that when i is 2 we skip 2 and continue with the next line
            // its like except this particular thing keeps printing the rest
        }
        System.out.println("Line after the loop");
    }

}
}
