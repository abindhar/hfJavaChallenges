import java.util.ArrayList;

class StaticSuper{
    static{
        System.out.println("Super's Static Block");
    }
    StaticSuper(){
        System.out.println("Super's constructor");
    }
}
class StaticTests extends StaticSuper {
    static int rand;
    static{
        rand = (int) (Math.random() * 6);
        System.out.println("Subclass Static block");
        System.out.println("Generated random number: " + rand);
    }
    StaticTests(){
        System.out.println("Subclass Constructor");
    }
}

public class WrappingDemo {
    public static void exercise(){
        System.out.println("Main -> Exercise");
        StaticTests st = new StaticTests();
    }
    public static void autoboxingWrapping(){
        int i = 10;
        double f = 10.0;
        Integer x = i; // Autoboxing
        Double y = f; // Autoboxing
        System.out.println(x.getClass());
        System.out.println(y.getClass());
        ArrayList<Integer> list = new ArrayList<>();
        for (int k=0; k<10; k++) {list.add(k);}
        System.out.println(list);
        //System.out.println(b instanceof String);
        String num = "two";
        //int k = Integer.parseInt(num);
        //System.out.println("Processed the number");
    }
    public static void main(String[] args){
        //autoboxingWrapping();
        exercise();
    }

}
