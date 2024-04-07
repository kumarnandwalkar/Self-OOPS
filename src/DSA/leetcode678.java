package DSA;
class leetcode678  // valid parenthesis string
{
    class Solution {
        public boolean checkValidString(String s) {
            int count = 0;
            boolean t_f = true;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(' || s.charAt(i) == '*') { // here we cannot check two char at a time, thats why we need to
                    // do s.char(i) == '(' || s.charAt(i) == '*') instead of s.char(i) == '(' || '*'; // this wont work and give error
                    count++;
                } else if (s.charAt(i) == ')' || s.charAt(i) == '*') {
                    count--;
                }
                // if(s == "")
                // {
                //     t_f = true;
                // }
                if (count > 0 || count < 0) {
                    t_f = true;
                }
                if (count == 0) {
                    t_f = true;
                }

            }
            return t_f;
        }
    }
}
