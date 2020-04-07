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
    }
}
