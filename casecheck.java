import java.util.Scanner;

public class casecheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().trim().charAt(0);// here trim() basically remove extra spaces
        // like we enter character = a //remove leading and trailing space
        // now output = a remove extra spaces
        if (c >= 'a' && c <= 'z') {
            System.out.println("lowercase");
        } else if (c >= 'A' && c <= 'Z') {
            System.out.println("uppercase");
        } else {
            System.out.println("invalid case");
        }
    }
}
