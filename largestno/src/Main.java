import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int o = sc.nextInt();
        int maxi = Math.max(n,m);
        int maxm = Math.max(o,maxi);
        System.out.println(maxm);
    }
}