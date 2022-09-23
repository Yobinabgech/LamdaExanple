package Lambda;

public class LambdaExample {

    public static void main(String[] args) {
        Animal animal = new Animal();
        //animal.Domestic();
        animal(
                () -> {
                    System.out.println("Barcking");
                });
    }
    static void animal(LambdaExample2 domestic){
        domestic.Domestic();

    }

}
