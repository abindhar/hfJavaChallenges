import java.util.ArrayList;

public class HeadFirst {
    static int i = 10, j = 10;

    public static void main(String[] args){
        HeadFirst x = new HeadFirst();
        System.out.println(Integer.toString(HeadFirst.i) + " " +Integer.toString(HeadFirst.j));
        x.i = 30;
        x.j = 40;
        System.out.println(Integer.toString(HeadFirst.i) + " " +Integer.toString(HeadFirst.j));

//        Books[] myBooks = new Books[3];
//        ArrayList<String> names = new ArrayList<String>();
//        int numBooks = 3;
//        //Store the books information
//        myBooks[0] = new Books();
//        myBooks[1] = new Books();
//        myBooks[2] = new Books();
//        //Print all the books information
//        myBooks[0].title = "The God of Small Things";
//        myBooks[1].title = "Bunch of Thoughts";
//        myBooks[2].title = "The God of Small Things";
//        for (int i=0; i<myBooks.length; i++){
//            System.out.println("Book: " + myBooks[i].title);
//        }
//        System.out.println(myBooks[0]==myBooks[1]);
//        System.out.println("jejl"=="jejl");
    }
}
