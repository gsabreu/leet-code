package br.com.abreu.leetcode.interviews;

import java.util.Arrays;
import java.util.Comparator;

public class reorderLogFiles {

    public static void main(String[] args) {

    }

    public static String[] reorderLogFiles(String[] logs) {
        Comparator<String> logComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //first split each log into two parts: identifier , content
                String[] split1 = o1.split(" ", 2);
                String[] split2 = o2.split(" ", 2);

                boolean isDigit = Character.isDigit(split1[1].charAt(0));
                boolean isDigit2 = Character.isDigit(split2[1].charAt(0));

                // starting if both logs are letter-logs
                if(!isDigit && !isDigit2) {

                    // compare the content
                    int comp = split1[1].compareTo(split2[1]);
                    if (comp != 0) {
                        return comp;
                    }
                    //log of same content. compare identifiers
                    return split1[0].compareTo(split2[0]);

                }

                //one of logs is digit-log
                if (!isDigit && isDigit2){
                    // the letter-log comes before digit-logs
                    return -1;
                }
                else if (isDigit && !isDigit2) {
                    // the letter-log comes after digit-logs
                    return 1;
                }
                else {
                    return 0;
                }
            }
        };
        Arrays.sort(logs, logComparator);
        return logs;
    }


}
