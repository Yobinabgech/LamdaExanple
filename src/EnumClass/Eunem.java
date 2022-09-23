package EnumClass;

public class Eunem {

    public enum Animals{Dog, Cat, lion}


    public static void main(String[] args) {

        Animals animals = Animals.Dog;

        System.out.println(animals);

        if (animals == Animals.Cat){

            System.out.println("He is my first cat");
        }

        else if (animals == Animals.lion){

            System.out.println("This Lion is to big");
        }
        else System.out.println("This is first enum");

    }


}
