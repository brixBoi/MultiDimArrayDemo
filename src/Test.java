/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zach Martin (1802573)
 */
public class Test {

    public static void main(String[] args) {

        int rowSize = 10;
        int columnSize = 10;
        Node words[][] = new Node[rowSize][columnSize];

        // Iterate through rows
        for (int row = 0; row < rowSize; row++) {
            // Iterate through rows
            for (int column = 0; column < columnSize; column++) {
                // initialize current position to new node
                words[row][column] = new Node(row, column);
            }
        }

        String output = "";

        // Iterate through rows
        for (int row = 0; row < rowSize; row++) {
            // Iterate through rows
            for (int column = 0; column < columnSize; column++) {
                // Add to output
                output += words[row][column].toString();
            }
            output += "\n";
        }
        System.out.println(output);
    }
}
