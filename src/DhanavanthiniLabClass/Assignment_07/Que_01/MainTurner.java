package DhanavanthiniLabClass.Assignment_07.Que_01;
/**
 * Create an interface named Turner, with a single method named turn().
 * Create a class named Leaf that implements turn() to display Changing colors.
 * Create a class named Page that implements turn() to display Going to the next page.
 * Create a class named Pancake that implements turn() to display Flipping.
 * Write an application named MainTurners that creates one object of each of these class
 * types and demonstrates the turn() method for each class. Save the files as
 * Turner.java, Leaf.java, Page.java, Pancake.java, and MainTurners.java.
 *
 * Think of two more objects (turning a coin, turning on tv)  that use turn(),
 * create classes for them, and then add objects to the MainTurners1 MainTurners1application,
 * rename it as MainTurners1. java. Save the files, using the names of new objects that use turn().
 */
public class MainTurner {
    public static void main(String[] args) {
        Leaf leaf=new Leaf();
        Page page=new Page();
        Pancake pancake=new Pancake();
        Coin coin=new Coin();
        TV tv=new TV();
        leaf.turn();
        page.turn();
        pancake.turn();
        coin.turn();
        tv.turn();
    }
}
