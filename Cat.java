public class Cat {

    public static final int MAX_LIVES = 9;
    private static int catcount = 0;
    String name;
    int NumbersOfLivesRemaining;
    String color;
    int age;
    public void meow() {
        System.out.println("Meow");
    }

    public Cat() {
        catcount++;
        NumbersOfLivesRemaining = MAX_LIVES;
    }
    public static int getCatcount(){
        return catcount;
}


}

