import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    int n = scanner.nextInt();
    int rem,count=0;
    while(number!=0){
    rem = number % 10;
    number = number / 10;
    if(rem == n){
        count=count+1;
    }
    }
        System.out.println(count);
    }
}