// Chuy Cruz, Albert Lopez, Matthew Davitt
// CSCI 434 Project #1, Iteration #4
// Connect4Main.java
// 3/21/19
// 
// This program creates the GUI for the user
import java.net.*;
import java.util.Observable;
import java.util.Observer;
public class Connect4Main extends Observable
{
    public static void main(String[] args)
    {
        ConnectFourClientGUI gui = new ConnectFourClientGUI();
        gui.setVisible(true);
    }
}
