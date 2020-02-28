/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: dbc2201
 *   Date: 28/02/20
 *   Time: 4:15 PM
 */

package main;

import binaryGenerator.BinaryGenerator;
import huffmanGenerator.HuffmanGenerator;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter a string value: ");
        final Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine().trim();
        userInput=userInput.toLowerCase();
        if(!onlyCharChecker(userInput))
        {
            System.out.printf("Sorry Only Alphabets are allowed in String");
        }
        else
        {

            BinaryGenerator binaryGenerator = new BinaryGenerator(userInput);
            String binaryString = binaryGenerator.convertNormalStringToBinaryString();
            HuffmanGenerator huffmanGenerator = new HuffmanGenerator(userInput);
            String huffmanString = huffmanGenerator.convertNormalStringToHuffmanString();
            int lengthOfBinaryString = binaryString.length();
            int lengthOfHuffmanString = huffmanString.length();
            System.out.println("The binary string has " + lengthOfBinaryString + " characters.");
            System.out.println("The huffman string has " + lengthOfHuffmanString + " characters.");
            System.out.printf("Compression Ratio (Huffman/Binary): %.2f %%",((double)lengthOfHuffmanString / (double) lengthOfBinaryString));
        }

        scanner.close();
    }
    public static  boolean  onlyCharChecker(String mainString)
    {
        boolean response = false;
        if(Pattern.matches("^[a-z' ']*$",mainString) )
        {
            response=true;
        }
        return response;
    }
}
