/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trying.io;

import java.util.ArrayList;



/**
 *This class for dealing with the typed characters  written by the user and list of errors from the GUI application
 * there is a a method for initialize the member variables , set and get the value of each member variable 
 * method for counts number of words per minute  and  listing the errors .
 * @author majd1
 */


//


public class BasicClass {
 
    private ArrayList<Character> userTypedChars;
    
    
    // method for return all typed characters 
    public ArrayList<Character> getUserTypedChars() {
        return userTypedChars;
    }
    // method for assign value to the member variable userTypedChars
    public void setUserTypedChars(ArrayList<Character> userTypedChars) {
        this.userTypedChars = userTypedChars;
    }
    
    // this method is used to create object of the basic class 
    public BasicClass(String userText, ArrayList<String> listOFError) {
 
        
    }
    
 

    


    


}
