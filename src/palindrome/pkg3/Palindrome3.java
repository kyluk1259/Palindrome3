/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome.pkg3;

import javax.swing.*;

/**
 *
 * @author kyluk1259
 */
public class Palindrome3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String phrase, backwardsPhrase, output;
        int pos;

        //get the word from the user
        phrase = JOptionPane.showInputDialog(
                "Words and phrases that are the same forwards and backwards are called palindromes.\n"
                + "This program determines if a phrase is a palindrome.\n\n"
                + "Enter a phrase:");
        //set output phrase to input phrase because it will have its spaces removed
        output = phrase;
        //Remove spaces from phrase
        phrase = phrase.replaceAll("\\s", "");
        //Reverse the word
        backwardsPhrase = "";
        for (pos = phrase.length() - 1; pos >= 0; pos--) {
            backwardsPhrase += phrase.charAt(pos);
        }
        //Remove spaces for backwards phrase
        backwardsPhrase = backwardsPhrase.replaceAll("\\s", "");
        //Compare the words
        if (phrase.equalsIgnoreCase(backwardsPhrase)) {
            JOptionPane.showMessageDialog(null, output + " IS a palindrome.");
            System.exit(0);
        } else {
            JOptionPane.showMessageDialog(null, output + " IS NOT a palindrome.");
            System.exit(0);
        }
    }

}
