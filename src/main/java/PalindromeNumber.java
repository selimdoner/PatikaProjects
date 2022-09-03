public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(9889));

    }
    public static boolean isPalindrome(int x) {
        String y=String.valueOf(x);
        String reversed="";
        int z=y.length()-1;
        while(z>=0){
            reversed = reversed + y.charAt(z);
            z--;
        }
        if(y.equals(reversed)){
            return true;
        }else{
            return false;
        }
    }
}
