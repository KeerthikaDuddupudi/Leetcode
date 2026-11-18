
class Solution {
    public String removeKdigits(String num, int k) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < num.length(); i++) {

            char ch = num.charAt(i);

            while (k > 0 && sb.length() > 0 &&
                   sb.charAt(sb.length() - 1) > ch) {

                sb.deleteCharAt(sb.length() - 1);
                k--;
            }

            sb.append(ch);
        }

        // If k is still remaining, remove digits from the end
        while (k > 0) {
            sb.deleteCharAt(sb.length() - 1);
            k--;
        }

        // Remove leading zeros
        int i = 0;

        while (i < sb.length() && sb.charAt(i) == '0') {
            i++;
        }

        String result = sb.substring(i);

        return result.length() == 0 ? "0" : result;
    }
}
