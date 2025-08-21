import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    char ch = scan.next().trim().charAt(0);
    if(ch>='a' && ch<='z'){
        System.out.println("lower case");
    }
    else if(ch>='A' && ch<='Z'){
        System.out.println("upper case");
    }
    }
}