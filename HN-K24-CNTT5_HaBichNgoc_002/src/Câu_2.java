import java.util.*;

public class Câu_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        if (s.trim().length() == 0) {
            System.out.println("Lỗi: Chuỗi không được để trống");
            return;
        }

        s = s.toLowerCase();
        s = s.replace(",", "");
        s = s.replace(".", "");

        String[] words = s.split(" ");

        Map<Integer, Set<String>> map = new HashMap<>();

        for (String w : words) {

            int len = w.length();

            if (!map.containsKey(len)) {
                map.put(len, new HashSet<>());
            }

            map.get(len).add(w);
        }

        List<Integer> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);

        System.out.println("Phân loại theo độ dài:");

        for (int k : keys) {
            System.out.println("- " + k + " ký tự: " + map.get(k));
        }
    }
}
