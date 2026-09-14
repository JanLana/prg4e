package hrtan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class WildInput {
    static void main() throws FileNotFoundException {
        Scanner sc = new Scanner(
                new File(System.getProperty("user.dir")
                        + "\\src\\main\\java\\hrtan\\wilderness.txt"));
        HashMap<String, Integer> map = new HashMap<>();
        String best = null;
        while (sc.hasNext()) {
            String key = sc.next();
            if (!map.containsKey(key)) {
                map.put(key, 1);
                if (best == null) {
                    best = key;
                }
                continue;
            }
            int value = map.get(key) + 1;
            map.put(key, value);
            if (map.get(best) < value) {
                best = key;
            }
        }
        System.out.println("يظهر الرقم " + best + " " + map.get(best) + " مرات.");
//        System.out.println("Number " + best + " is appearing " + map.get(best) + " times.");
    }
}
