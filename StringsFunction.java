public class StringsFunction {
    public static void main(String args[]){
    /*
    Declaration of String :
    String variable = “ input by the writter itself “;
    String variable = sc.nextLine"();  — (by user via a scanner class)
    String variable = new String();
    String str = Integer.parseInt(str);
        */
    // String Tony = new String();
    // Tony = "Hey there";
    // System.out.println(Tony);
    
    // concatination 
    String firstName= "tony";
    String LastName = "Stark";
    String Fullname = firstName + " " + LastName;
    System.out.print(Fullname);

    // length to know 
    System.out.println(Fullname.length());
    //CharAt
    for(int i=0;i<Fullname.length();i++){
        System.out.print(Fullname.charAt(i));
    }

    //Compare to it is same as (firstName == LastName)
    if(firstName.compareTo(LastName)== 0){
        System.out.println("Strings are equal");
    }    
    else{
        System.out.println("Strings are not equal");
    }

    //Substring :takes a beginning index and ending index 
    String sentence = "My name is Prish";
    String name = sentence.substring(9,sentence.length());
    System.out.println(name);

    //ToString method 
    int num = 123;
    String str = Integer.toString(num);
    System.out.println(str.length());
}
}
