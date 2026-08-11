
class employe {
    int id;
    String name;

    void work() {
        System.out.println(" Working ");

    }
}

public class employee {
    public static void main(String[] args) {
        employe e1 = new employe();
        e1.id = 11;
        e1.name = "yugi";
        System.out.println(e1.id);
        System.out.println(e1.name);

        e1.work();

        employe e2 = new employe();
        e2 = e1;
        e2.id = 13;
        e2.name = "shiva";
        System.out.println(e1.id);
        System.out.println(e1.name);
        System.out.println(e2.id);
        System.out.println(e2.name);

    }
}
