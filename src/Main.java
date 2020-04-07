import java.util.ArrayList;

public class Main {

    public static void main( String [] args){
        ArrayList<Integer> arr1 = new ArrayList<>();;
        ArrayList<Integer> arr2 = new ArrayList<>();;
        ArrayList<Integer> arr3 = new ArrayList<>();;
        ArrayList<Integer> result;

        arr1.add(100);
        arr1.add(500);
        arr1.add(900);

        arr2.add(800);
        arr2.add(600);
        arr2.add(300);

        arr3.add(400);
        arr3.add(700);
        arr3.add(200);

        ArrayOrganizer arrayOrganizer = new ArrayOrganizer();
        result = arrayOrganizer.concatAndSort(arr1, arr2, arr3);
        System.out.println( result );

        Player p1 = new Player("Tom");
        Player p2 = new Player("John");
        Player p3 = new Player("James");
        Player p4 = new Player("Henry");
        Die die = new Die();

        for( int i = 0; i<5;i++){
            p1.addScore( die.rollDie() );
            p2.addScore( die.rollDie() );
            p3.addScore( die.rollDie() );
            p4.addScore( die.rollDie() );
        }

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
    }
}
