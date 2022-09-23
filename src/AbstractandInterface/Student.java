package AbstractandInterface;

public  abstract class Student implements GFG {

       @Override
    public void learnCode() {
           System.out.println(
                   "Let's make coding a habit with GFG");

    }

    @Override
    public void learnProgramingLanguage() {
        System.out.println(
                "Let's master all fundamentals of java with the help of GFG");

    }

    @Override
    public void contribute() {
        System.out.println(
                "Now let's help others by contributing in GFG");
    }


}