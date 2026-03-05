import java.util.*;

public class Câu_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String str = sc.nextLine();
        if (str.trim().length() == 0) {
            System.out.println("Lỗi: Chuỗi không được để trống.");
            return;
        }

        str = str.toLowerCase();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == ' ') continue;

            if (map.containsKey(c)) {
                int count = map.get(c);
                map.put(c, count + 1);
            } else {
                map.put(c, 1);
            }
        }

        for (Character key : map.keySet()) {
            System.out.println("Ky tu " + key + ": " + map.get(key) + " lan");
        }
    }
}