class Solution {
    public char processStr(String s, long k) {

        long[] len = new long[s.length() + 1];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            len[i + 1] = len[i];

            if (Character.isLowerCase(ch)) {
                len[i + 1]++;
            }
            else if (ch == '*') {
                if (len[i + 1] > 0) {
                    len[i + 1]--;
                }
            }
            else if (ch == '#') {
                len[i + 1] *= 2;
            }
        }

        long finalLen = len[s.length()];

        if (k >= finalLen) {
            return '.';
        }

        for (int i = s.length() - 1; i >= 0; i--) {

            char ch = s.charAt(i);

            long before = len[i];
            long after = len[i + 1];

            if (ch == '#') {

                if (k >= before) {
                    k -= before;
                }

            }
            else if (ch == '%') {

                if (after > 0) {
                    k = after - 1 - k;
                }

            }
            else if (ch == '*') {

                if (after < before) {

                    if (k == after) {
                        return '.';
                    }
                }

            }
            else {

                if (after == before + 1) {

                    if (k == before) {
                        return ch;
                    }
                }
            }
        }

        return '.';
    }
}