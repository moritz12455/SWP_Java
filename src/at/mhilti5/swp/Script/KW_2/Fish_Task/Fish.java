package at.mhilti5.swp.Script.KW_2.Fish_Task;

public class Fish {
    protected String name;
    protected double size;

    public Fish(double size, String name) {
        this.size = size;
        this.name = name;
    }

    public void swim(){
        System.out.println(name + "schwimmt");
    }
    public void describe(){
        System.out.println(name + "ist" + size);
    }

}
