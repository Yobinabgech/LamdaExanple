package AbstractandInterface;

public abstract class InterfaceExpl {
    // this is constructor


    private  String name;
    private int age;


    public  abstract void inte();
    public abstract void pen();

    public void address(){

        System.out.println("My name is : " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
