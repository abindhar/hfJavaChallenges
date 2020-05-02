import java.lang.reflect.Array;
import java.util.ArrayList;

public class Chapter7 {
    public static void main(String[] args){
        // Overridden method in subclass
        Shape s = new Square();
        Shape a = new Amoeba();
//        s.playSound();
//        a.rotate(); // Should call overridden method
//        System.out.println(Integer.toString(a.hashCode()));
//        System.out.println(a.getClass().toString());
//        System.out.println(a.toString());
//        System.out.println(s.equals(a));

        ArrayList<Object> arr = new ArrayList<>();
        arr.add(new Square());
        arr.add(1);
        arr.add("aloha!");
        // Filter out Squares and act on them
        for (Object x: arr){
            if (x instanceof Square)
            {
                Square y = (Square) x;
                y.dimensions();
            }
        }
    }
}
