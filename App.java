abstract class animal {
    protected int legs;

    protected animal() {
        legs = 4;
    }

    protected animal(int l) {
        legs = l;
    }

    // abstract method for eat
    public abstract void eat();

    public void walks() {
        System.out.println("animal walks fast on " + legs + " legs");
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        // create an animal in each category
        cat c1 = new cat();
        c1.setname("willi");
        System.out.println(c1.getname());
        fish f1 = new fish();
        f1.walks();
        f1.legs = 0;
        // setting a default count for spider leg =8
        spider s1 = new spider(8);
        System.out.print(s1.legs);

    }

}
