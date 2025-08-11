public class ConstructorOverloading {
    int roll_no;
    String name;
    int marks;
    String prn_no;
    char div;

    public ConstructorOverloading() {
        roll_no = 1;
        name = "Mayur";
        marks = 80;
        prn_no = "0124UITM9999";
        div = 'A';
        System.out.println(roll_no + " " + name + " " + marks + " " + prn_no + " " + div);
    }

    public ConstructorOverloading(int r) {
        roll_no = r;
        System.out.println(roll_no + " ");
    }

    public ConstructorOverloading(String n) {
        name = n;
        System.out.println(name + " " );
    }

    public ConstructorOverloading(int r, String n) {
        roll_no = r;
        name = n;
        System.out.println(roll_no + " " + name + " " );
    }

    public ConstructorOverloading(int r, String n, int m) {
        roll_no = r;
        name = n;
        marks = m;
        System.out.println(roll_no + " " + name + " " + marks + " ");
    }

    public ConstructorOverloading(int r, String n, int m, String prn, char d) {
        roll_no = r;
        name = n;
        marks = m;
        prn_no = prn;
        div = d;
        System.out.println(roll_no + " " + name + " " + marks + " " + prn_no + " " + div);
    }

    public static void main(String[] args) {
        ConstructorOverloading s1 = new ConstructorOverloading();
        ConstructorOverloading s2 = new ConstructorOverloading(101);
        ConstructorOverloading s3 = new ConstructorOverloading("Amit");
        ConstructorOverloading s4 = new ConstructorOverloading(102, "Sneha");
        ConstructorOverloading s5 = new ConstructorOverloading(103, "Rohit", 78);
        ConstructorOverloading s6 = new ConstructorOverloading(104, "Mayur", 89, "0124UITM11113", 'B');
       

    }
}
