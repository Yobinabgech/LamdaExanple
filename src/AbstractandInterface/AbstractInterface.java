package AbstractandInterface;

public class AbstractInterface extends InterfaceExpl implements InterfaceExpl2 {


    @Override
    public void inte() {
        System.out.println("My name is : " + "Minilik");
        System.out.println(10);
    }

    @Override
    public void pen() {
        System.out.println("The color is Blue");
    }
    @Override
    public void address(){
        System.out.println("This is First Address");
    }
}


