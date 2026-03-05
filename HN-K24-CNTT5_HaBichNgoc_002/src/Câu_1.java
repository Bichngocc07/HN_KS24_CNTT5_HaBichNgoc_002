import java.util.Scanner;

public class Câu_1 {

    static boolean isLetterAZ(char c){
        return c>='a' && c<='z';
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập kí tự :");
        String s = sc.nextLine().toLowerCase();

        int[] count = new int[26];

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(isLetterAZ(c))
                count[c-'a']++;
        }

        int max=0;
        char result=' ';

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(isLetterAZ(c)){
                if(count[c-'a']>max){
                    max=count[c-'a'];
                    result=c;
                }
            }
        }

        System.out.println(result+" (xuat hien "+max+" lan)");
    }
}