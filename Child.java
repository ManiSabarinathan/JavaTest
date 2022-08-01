public class Child extends Parent {
    int x = 200;

    public static void main(String ... args) {
        Child c = new Child();
        System.out.println(c.x);

        Parent p = new Parent();
        System.out.println(p.x);

        Parent p1 = new Child();
        System.out.println(p1.x);
    }
}
