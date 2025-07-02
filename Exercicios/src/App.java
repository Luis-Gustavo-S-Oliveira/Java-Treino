import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

 
        int n = scanner.nextInt();


        ArrayList<Integer> myList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            myList.add(value);
        }

        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

    }
}