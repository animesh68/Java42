import java.util.*;
public class Main{
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n =  input.nextInt();
        for(int i = 1; i <= n; i++){
            list.add(input.nextInt());
        }
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        Collections.sort(list);
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.get(list.size()-1));
    }
}