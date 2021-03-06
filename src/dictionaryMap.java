import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class dictionaryMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<String, Integer> myMap = new HashMap<String, Integer>();

        for (int i = 0; i < n; i++) {
            String name = scanner.next();
            int phone = scanner.nextInt();
            scanner.nextLine();
            myMap.put(name, phone);
        }
        while(scanner.hasNext()) {
            String s = scanner.next();
            if (myMap.get(s) == null) {
                System.out.println("Not found");
            }else {
                System.out.println(s + "=" + myMap.get(s));
            }
        }
        scanner.close();
    }
}
