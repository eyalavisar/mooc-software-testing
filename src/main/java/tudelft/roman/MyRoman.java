package tudelft.roman;

import java.util.HashMap;
import java.util.Map;

public class MyRoman {
    private Map<String, Integer> numerals;

    public MyRoman() {
        numerals = new HashMap<>();
        numerals.put("I", 1);
        numerals.put("V", 5);
        numerals.put("X", 10);
        numerals.put("L", 50);
        numerals.put("C", 100);
        numerals.put("D", 500);
        numerals.put("M", 1000);
    }

    public MyRoman(Map<String, Integer> numerals) {
        this.numerals = numerals;
    }

    public Integer convertToInteger(String roman) {
        Integer converted = 0;
        char[] romans = roman.toCharArray();

        int counter = 0;
        for (int i = 0; i < romans.length; i++) {
            if (i < romans.length - 3 && romans[i] == romans[i + 3]) {
                return null;
            }
        }
        for (int i = 0; i < romans.length; i++) {
            if (i < romans.length - 1 && numerals.get("" + romans[i]) < numerals.get("" + romans[i + 1])) {
                converted += numerals.get("" + romans[i + 1]) - numerals.get("" + romans[i]);
                i++;
            }
            else {
                converted += numerals.get("" + romans[i]);
            }
        }

        return converted;
    }

    public static void main(String[] args) {
        MyRoman roman = new MyRoman();
        System.out.println(roman.convertToInteger("CXXXX"));

    }
}
