/**
package info.
*/
package ru.job4j.array;
/**
class info. В защиту этого, вероятно, не самого лучшего решения, скажу что оно по крайней мере работает.
Знаки препинания в строках не обыгрываются.
*/
class StringContainsSubstring {
  /**
  description.
  @param s - string
  @param substring searching combinations in s
  @return is string includes substring
  */
    boolean isStringContainsSubstring(String s, String substring) {
        boolean result = false;
        String lowerCaseStr = s.toLowerCase();
        String lowerCaseSubstr = substring.toLowerCase();
        char[] str = lowerCaseStr.toCharArray();
        char[] substr = lowerCaseSubstr.toCharArray();

        for (int wholeLineCounter = 0, sublineCounter = 0, ifMatch = 0;
             wholeLineCounter < str.length && sublineCounter < substr.length; wholeLineCounter++) {
            if (substr[sublineCounter] == str[wholeLineCounter]) {
                sublineCounter++;
                ifMatch++;
                result = ifMatch == substr.length;
            } else if (ifMatch != 0) {
              ifMatch = 0;
              sublineCounter = 0;
              wholeLineCounter--;
            }
          }
        return result;
    }
}
