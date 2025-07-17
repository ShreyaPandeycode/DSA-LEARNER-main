import java.util.ArrayList;
import java.util.Scanner;

public class arraylist1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<String>> str = new ArrayList<>();
        // nesting of arraylist
        // initiallization
        for (int i = 0; i < 5; i++) {// add five elements in arraylist
            str.add(new ArrayList<>());
        }
        // add elements in list
        for (int i = 0; i < 5; i++) { // for i= number of list
            for (int j = 0; j < 3; j++) { // j= number of elements of list
                str.get(i).add(sc.nextLine());
            }
        }
        System.out.println(str); // this will print 5 list containing 3 elements each
    }
}
