public class SchoolStudent extends Main{
    SchoolStudent(int roll_no, String name){
        super(roll_no,name);
    }
    public void attend_class(){
        System.out.println(name+" "+"Is Attending class");
    }
    public void give_exam(){
        System.out.println(name+" "+"Is Giving exam"+" "+"Roll_no is"+" "+roll_no);
    }
}
