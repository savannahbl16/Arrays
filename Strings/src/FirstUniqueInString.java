import java.util.Arrays;

public class FirstUniqueInString {
    public int firstUniqChar(String s) {
        //initial edge case checks
        if (s.length() == 0) {
            return -1;
        }
        if (s.length() == 1) {
            return 0;
        }
        // turn string into sorted array of characters so duplicates are next to each other
        char [] arr = s.toCharArray();
        Arrays.sort(arr);
        int indx = Integer.MAX_VALUE; // initialize to max value so that the index of the first unique char will be updated if there is one
        for (int i = 0; i < arr.length; i++) {
            //if last element or the element is not a duplicate then set indx to the index of the element in orginial string
            if ((i+1 == arr.length) || arr[i] != arr[i+1]) {
                if (s.indexOf(arr[i]) < indx) {
                    indx = s.indexOf(arr[i]);
                }
            } else { // otherwise, move past the duplicates
                while (i != arr.length - 1 && (arr[i] == arr[i+1])) {
                    i++;
                }
            }
        }
        if (indx == Integer.MAX_VALUE) { // no non-duplicate found
            indx = -1;
        }
        return indx;
    }
}
