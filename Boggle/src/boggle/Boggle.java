/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boggle;

import core.Board;
import inputOutput.ReadDataFile;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Dillon
 */
public class Boggle {
    
    // Array list to store data value of each die
    private static ArrayList<String> boggleData = new ArrayList();
    
    // Array list to store data of the dictionary file
    private static ArrayList<String> dictionaryData = new ArrayList();
    
    // name of the boggle data file using relative pathing
    private static String dataFileName = new String("../data/BoggleData.txt");
    
    // name of the dictionary file using relative pathing
    private static String dictionaryFileName = new String("../data/Dictionary.txt");
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Boggle!");
        JOptionPane.showMessageDialog(null, "Let's play Boggle!");
        
        // read in dice data file 
        ReadDataFile data = new ReadDataFile(dataFileName);
        data.populateData();
        
        //read in the dictionary file
        ReadDataFile  dictionary = new ReadDataFile(dictionaryFileName);
        dictionary.populateData();
        
        // create an instance of Board parsing the boggleData
        Board board = new Board(data.getData(), dictionary.getData());
        board.populateDice();
        
        System.out.println("There are " + dictionary.getData().size() + " entries in the dictionary.");
        
    }
    
}