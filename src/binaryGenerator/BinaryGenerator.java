/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: dbc2201
 *   Date: 28/02/20
 *   Time: 4:15 PM
 */

package binaryGenerator;

public class BinaryGenerator {
    private String userInputStringInLowerCase;

    public BinaryGenerator(String userInputStringInLowerCase) {
        this.userInputStringInLowerCase = userInputStringInLowerCase;
    }

    public String getUserInputStringInLowerCase() {
        return userInputStringInLowerCase;
    }

    public void setUserInputStringInLowerCase(String userInputStringInLowerCase) {
        this.userInputStringInLowerCase = userInputStringInLowerCase;
    }

    public String convertNormalStringToBinaryString() {
        StringBuilder binaryString= new StringBuilder();
        for (int i = 0; i < userInputStringInLowerCase.length(); i++) {
            int one = userInputStringInLowerCase.charAt(i);
            int remain = 8-Integer.toBinaryString(one).length();
            binaryString.append("0".repeat(remain));
            binaryString.append(Integer.toBinaryString(one));
            //binaryString.append(" ");

        }
        System.out.println("Binary String :- "+binaryString.toString());
        return binaryString.toString();
    }
}
