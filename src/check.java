import java.util.Scanner;

public class check {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=s.next();

        int i=0;
        int j=str.length()-1;
        boolean ispalindrome=true;
        while ((i<j)){

            if(str.charAt(i)!=str.charAt(j)){
                ispalindrome=false;
                break;
            }

            i++;
            j--;
        }

        System.out.println(ispalindrome);
    }
}
