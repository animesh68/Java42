 public abstract class Stud{
    int roll_no;
    public String name;
    Stud(int roll_no, String name){
        this.roll_no = roll_no;
        this.name = name;
    }
    abstract void attend_class();
    abstract void give_exam();
    void register(){
        System.out.println("Name is "+name+"roll_no is "+roll_no+"registered successfully");
    }
}
