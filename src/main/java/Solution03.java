/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Billy Duartez
 */

/*Program prompts for a quote and an author then displays the quotation
and author back to user*/

import java.util.Scanner;

public class Solution03 {
    public static void main(String[] args) {

        /*prompts intro message and scans into system*/
        System.out.println("What is the quote? ");
        Scanner input = new Scanner(System.in);
        String quote = input.nextLine();

        /*ask second question*/
        System.out.println("Who said it? ");
        String author = input.nextLine();

        /*repeats back to user*/
        System.out.println(author + " says, \""+ quote+"\"");


    }
}
