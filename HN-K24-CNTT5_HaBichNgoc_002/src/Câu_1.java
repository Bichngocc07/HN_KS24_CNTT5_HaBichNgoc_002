import java.util.*;

public class Câu_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Số lượng không hợp lệ");
            return;
        }
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            set.add(x);
        }
    }
}

