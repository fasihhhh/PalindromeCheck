import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Word");
        String str =sc.next();
        String reversed = "";
        for(int i = str.length()-1 ; i >=0; i--)
        {
            reversed += str.charAt(i);
        }
        if(reversed.equals(str)){
            System.out.println("Yes! Word is a Palindrom");
        }
        else{
            System.out.println("No! Word is not a Palindom");
        }
    }
}