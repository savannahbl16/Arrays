import java.util.Arrays;

public class FirstUniqueInString {
    public int firstUniqChar(String s) {
        if (s.length() == 0) {
            return -1;
        }
        if (s.length() == 1) {
            return 0;
        }
        char [] arr = s.toCharArray();
        Arrays.sort(arr);
        int indx = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if ((i+1 == arr.length) || arr[i] != arr[i+1]) {
                if (s.indexOf(arr[i]) < indx) {
                    indx = s.indexOf(arr[i]);
                }
            } else {
                while (i != arr.length - 1 && (arr[i] == arr[i+1])) {
                    i++;
                }
            }
        }
        if (indx == Integer.MAX_VALUE) {
            indx = -1;
        }
        return indx;
    }
}
