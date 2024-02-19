public class Animal {
    public static void main(String[] args) {

        System.out.println(Cat.getCatcount());

        Cat mycat = new Cat();
        mycat.meow();
        mycat.name = "Whiskers";
        mycat.age = 3;
        mycat.color = "white";
        mycat.NumbersOfLivesRemaining = 7;


        Cat mycat2 = new Cat();
        mycat2.name = "Garfield";
        mycat2.age = 6;
        mycat2.color = "orange";
        mycat2.NumbersOfLivesRemaining = 3;

        Dog mydog = new Dog();
        mydog. = "Asher";

        System.out.println(Cat.MAX_LIVES);
        System.out.println(mycat2.NumbersOfLivesRemaining);
        System.out.println(Cat.getCatcount());

    }
}