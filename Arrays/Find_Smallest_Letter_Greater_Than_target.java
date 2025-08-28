public class Find_Smallest_Letter_Greater_Than_target {
    public static char nextGreatestLetter(char[] letters, char target) {
        if (target >= letters[letters.length - 1]) {
            return letters[0];
        }
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start];
    }
    public static void main(String[] args) {
       
        char[] letters = {'c', 'f', 'j'};
        char target = 'c';

        char result = nextGreatestLetter(letters, target);
        System.out.println("Next greatest letter after '" + target + "' is: " + result);
    }
}
