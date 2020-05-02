import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

class Mountain {
    String name;
    Integer height;
    public Mountain(String name, Integer height){
        this.name = name;
        this.height = height;
    }
}
public class SortMountains {
    List<Mountain> mtn = new LinkedList<Mountain>();
    public static void main(String[] args){
        new SortMountains().go();
    }
    class NameCompare implements Comparator<Mountain> {
        public int compare(Mountain m1, Mountain m2){
            return m1.name.compareTo(m2.name);
        }
    }
    class HeightCompare implements Comparator<Mountain> {
        public int compare(Mountain m1, Mountain m2){
            return m1.height-m2.height;
        }
    }
    public void go(){
        mtn.add(new Mountain("Longs", 14255));
        mtn.add(new Mountain("Elbert", 14433));
        mtn.add(new Mountain("Maroon", 14156));
        mtn.add(new Mountain("Castle", 14265));
        System.out.println("As entered:\n");
        for (Mountain m : mtn) System.out.print(m.name + " " + m.height + " ");
        System.out.println();
        NameCompare nc = new NameCompare();
        Collections.sort(mtn, nc);
        System.out.println("By name:\n");
        for (Mountain m : mtn) System.out.print(m.name + " " + m.height + " ");
        System.out.println();
        HeightCompare hc = new HeightCompare();
        Collections.sort(mtn, hc);
        System.out.println("By height:\n");
        for (Mountain m : mtn) System.out.print(m.name + " " + m.height + " ");
    }
}
