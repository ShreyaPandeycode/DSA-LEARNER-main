import java.util.ArrayList;
import java.util.Scanner;

// linked list , stack , arraylist ,vectors all are collection framework
public class arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        // all the initial value defined in constructor
        // add list in arraylist
        list.add(88);
        list.add(0);
        list.add(3);
        list.add(98);
        list.add(3409);
        list.add(34);
        list.add(3432);
        list.add(3400);
        list.add(34);
        list.add(34);
        list.add(3412);
        System.out.println(list.clone());// this wil copy the arraylist and create a clone
        System.out.println(list.get(2));
        System.out.println(list.size()); // tis will give the number of elements we printed
        // it feels like capacity expanded
        System.out.println(list.contains(34)); // if it contains an element it will return true
        // else it returns false
        System.out.println(list.isEmpty());// it is like method which check whether the list is empty or not
        System.out.println(list.hashCode());// when two list are equal means there hashcode are same
        System.out.println(list.remove(6));// tells us which element is removed
        System.out.println(list);
    }
}
