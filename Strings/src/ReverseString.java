public class ReverseString {
    public void reverseString(char[] s) {
        // take all the elements in the first half and swap them with the symmetrical element on second half
        // if the number of elements is odd, the middle element remains the same
        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length-i-1] = temp;
        }
    }
}
