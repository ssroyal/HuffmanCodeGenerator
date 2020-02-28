/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: dbc2201
 *   Date: 28/02/20
 *   Time: 4:15 PM
 */

package huffmanGenerator;

import java.util.HashMap;

public class HuffmanGenerator {
    private String userInputStringInLowerCase;

    private HashMap<Character, String> accessHashmap() {
        HashMap<Character, String> map = new HashMap<>();
        map.put('a', "1010");
        map.put('b', "100000");
        map.put('c', "00000");
        map.put('d', "10110");
        map.put('e', "010");
        map.put('f', "110011");
        map.put('g', "1000010");
        map.put('h', "0001");
        map.put('i', "01110");
        map.put('j', "1100001010");
        map.put('k', "11000011");
        map.put('l', "10111");
        map.put('m', "110010");
        map.put('n', "01111");
        map.put('o', "1001");
        map.put('p', "100001");
        map.put('q', "1100001001");
        map.put('r', "0010");
        map.put('s', "0011");
        map.put('t', "1101");
        map.put('u', "00001");
        map.put('v', "1100000");
        map.put('w', "110001");
        map.put('x', "1100001000");
        map.put('y', "100011");
        map.put('z', "1100001010");
        map.put(' ', "0111");
        return map;
    }

    public HuffmanGenerator(String userInputStringInLowerCase) {
        this.userInputStringInLowerCase = userInputStringInLowerCase;
    }

    public String getUserInputStringInLowerCase() {
        return userInputStringInLowerCase;
    }

    public void setUserInputStringInLowerCase(String userInputStringInLowerCase) {
        this.userInputStringInLowerCase = userInputStringInLowerCase;
    }

    public String convertNormalStringToHuffmanString() {
        return "";
    }
}
