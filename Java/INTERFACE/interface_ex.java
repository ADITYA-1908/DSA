interface Client {
    void input();
    void output();
}
class aditya implements Client {
    String name;
    double sal;

    public void input() {
        name = "adi_subham";
        sal = 2000;
    }

    public void output() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + sal);
    }
}
public class interface_ex
{
        public static void main(String[] args) {
        Client c = new aditya();
        c.input();
        c.output();
    }
}
