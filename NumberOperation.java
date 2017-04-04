/**
 * Created by Lakshmi on 4/4/2017.
 */
public class NumberOperation {
    public static void main(String[] args) {
        int result = getInteger("431");
        System.out.println(result);
    }

    static int getInteger(String input){
        String numMap = "0123456789";

        int res = 0;
        int size = input.length();

        for (int i = size; i > 0; i -= 1) {
            int factor = (int)Math.pow(10, i - 1);

            char numberC = input.charAt(size - i);
            int numberI = numMap.indexOf(numberC);
            res += factor * numberI;
        }
        //System.out.println(res);
        return res;
    }
}
