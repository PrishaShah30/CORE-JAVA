public class StringsFunction {
    public static void main(String args[]) {
        /*
        Declaration of String :
        String variable = "input by the writer itself";
        String variable = sc.nextLine();  // (by the user via a Scanner class)
        String variable = new String();
        String str = Integer.parseInt(str);
        */
        // Concatenation
        String firstName = "Tony";
        String lastName = "Stark";
        String fullName = firstName + " " + lastName;
        System.out.print(fullName);

        // Length to know the length of the string
        System.out.println(fullName.length());

        // CharAt: Accessing characters at each index
        for (int i = 0; i < fullName.length(); i++) {
            System.out.print(fullName.charAt(i));
        }

        // CompareTo: Comparing two strings lexicographically
        if (firstName.compareTo(lastName) == 0) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        // Substring: Extracting a portion of the string
        String sentence = "My name is Prish";
        String name = sentence.substring(9, sentence.length());
        System.out.println(name);

        // ToString method to convert an integer to a string
        int num = 123;
        String strNum = Integer.toString(num);
        System.out.println(strNum.length());
    }
}
