//import java.util.*;
public class Mymain {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter your name: ");
//        String name = input.nextLine();
        SchoolStudent s1 = new SchoolStudent(42,"Animesh");
        s1.attend_class();
        s1.give_exam();
        s1.register();
    }
}
