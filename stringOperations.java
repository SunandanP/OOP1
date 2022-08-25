import java.util.Scanner;

public class stringOperations {
    public static void main(String[] args) {
        String string;
        Scanner sc = new Scanner(System.in);
        string = sc.next();
        look(string);



    }
    public static void look(String str){
        int length = str.length();
        char[] chars = new char[length];
        int[] count = new int[length];

        //setting count for all to zero
        for (int j = 0; j < count.length; j++) {
            count[j] = 0;
        }

        //character addition to the array and it's counting
        for (int i = 0; i<length;i++){
            if (charCheck(str.charAt(i),chars)){
                count[searchChar(str.charAt(i),chars)]++;
            }else {
                chars[i] = str.charAt(i);
                count[i]++;
            }


        }
        //printing duplicate charcters only
        for (int i = 0; i < length; i++) {
            if (count[i] > 1){
                System.out.print(chars[i]);
            }
        }
    }
    public static boolean charCheck(char ch,char[] chars){
        for (int i = 0; i < chars.length; i++) {
            if (ch == chars[i]){
                return true;
            }
        }
        return false;
    }
    public static int searchChar(char ch,char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ch) {
                return i;
            }
        }
        return -1;
    }
}