public class cat extends animal implements pet {
    String name;

    public cat() {
    }

    public cat(int i,String n) {
        //call super class
        super(i);
        name = n;
    }

    @Override
    public void play() {
        //empty method
    }

    @Override
    public void eat() {
    }

    public String getname() {
        return name;
    }

    public void setname(String n) {
        name = n;
    }
}
