public class fish extends animal implements pet {
    String name;

    public fish() {

    }

    public fish(int i, String n) {
        i = 0;
        name = n;
    }

    @Override
    public String getname() {
        return name;
    }

    
    public void setname(String n) {
    }

    @Override
    public void play() {

    }

    @Override
    public void eat() {
    }

    @Override
    public void walks() {
        System.out.println("fish cant walk");
    }

}
