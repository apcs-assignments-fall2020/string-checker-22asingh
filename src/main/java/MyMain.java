import java.util.Scanner;

public class MyMain {
    
    // Counts the number of 'a', 'b', and 'c' chars in str
    public static int countABC(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == 'a' || str.charAt(i) == 'b' || str.charAt(i) == 'c'){
                count += 1;
            }
        }
        return count;
    }

    // Checks to see whether or not str contains 'The' or 'the'
    public static boolean containsThe(String str) {
        return str.indexOf("The") != -1 || str.indexOf("the") != -1;
    }

    // Checks whether str is a palindrome or not
    public static boolean isPalindrome(String str) {
        String palindrome = "";
        for (int i = str.length(); i > 0; i--){
            palindrome += str.charAt(i - 1);
        }
        return str.equals(palindrome);
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String abc = scan.nextLine();
        System.out.println("Your string contains " + countABC(abc) + " a's, b's, or c's");
        String the = scan.nextLine();
        if (containsThe(the)){
            System.out.println("Your string DOES contain the");
        }
        else{
            System.out.println("Your string DOES NOT contain the");
        }
        String palindrome = scan.nextLine();
        if (isPalindrome(palindrome)){
            System.out.println("Your string IS a palindrome");
        }
        else{
            System.out.println("Your string IS NOT a palindrome");
        }
        scan.close();
    }
}
