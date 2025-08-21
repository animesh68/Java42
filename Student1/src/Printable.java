public interface Printable {
    void print();
    void show();
    private void display(){
        System.out.println("Interface private method display");
    }
    static void say(){
        System.out.println("Interface private method say");
    }

}
