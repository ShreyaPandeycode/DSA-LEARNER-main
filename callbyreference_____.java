
import java.util.Scanner;

class length {
    int len;// we can declare variable of class name as well

    length(int l) {// this a constructor
        this.len = l;
    }

    void print() {
        System.out.println("length " + len);
    }

}

public class callbyreference_____ {
    public static void increament(length l) {// create object of name l
        l.len = l.len + 1;// increament value
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        length obj = new length(34);// by passing value parametrised constructor is formed

        obj.print();
        increament(obj);// if we have to access method throw object there should be in different class
        obj.print();
        // we can pass different method as a parameter in functions but there is one
        // condition that they should belong to same class.
        // for passing you have to make constructor who take int value
    }
}
