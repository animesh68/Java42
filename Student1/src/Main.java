public abstract class Main{
    int roll_no;
    public String name;
    Main(int roll_no, String name){ //this is constructor
        this.roll_no = roll_no;
        this.name = name;
    }
    abstract void attend_class();
    abstract void give_exam();
    void register(){
        System.out.println("Name is "+" "+name+" "+"roll_no is "+" "+roll_no+" "+"registered successfully");
    }
}