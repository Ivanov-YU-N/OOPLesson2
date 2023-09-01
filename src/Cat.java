
public class Cat {
    private String name;
    private int appetite;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public Cat(int appetite) {
        this.appetite = appetite;
    }

    public Cat(){
    }

    public String toString(){
        return name + "   " + appetite;
    }

    public int getAppetite() {
        return appetite;
    }
}
