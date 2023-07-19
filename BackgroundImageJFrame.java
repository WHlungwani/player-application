package playerapplication;
import hlungwani.wn.graphicalinterface.GraphicalInterface;
/**
 *
 * @author GOD IS GOOD
 */
public class PlayerApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instatiation class
        GraphicalInterface gf = new GraphicalInterface();
        
     
        //Create welcome message
        gf.welcomeMessage();
        //create label 1
        gf.createLabel("Please Enter your Name : ", 50, 100);
        //create text field 1 
       gf.createTextField("", 50, 150);
        //Create label 2
        gf.createLabel("Please Enter your Surname : ", 50, 200);
        //create text field 2 
        gf.createTextField("", 50, 250);
        //Create label 3
        gf.createLabel("Please Enter your Football Club : ", 50, 300);
      
        //create text field 3
        gf.createTextField("", 50, 350);
        //Create label 4
        gf.createLabel("Please Enter your Playing Jersey Number : ", 50, 400);
        gf.createTextField("", 0, 450);
        //create text field 4
        //Create label 5
        gf.createLabel("How Many League Goals did you Score ? : ", 50, 500);
        //create text field 5
        gf.createTextField(" ", 50, 550);
        //Create label 6
        gf.createLabel("Please Enter your Age : ", 50, 600);
        //create text field 6
        gf.createTextField(" ", 50, 650);
        //Create label 7
        gf.createLabel("Enter your Date of Birth(MM/DD/YYYY) : ", 50, 700);
        //create text field 7
        gf.createTextField(" ", 50, 750);
        
        //create button to check if player qualifies
        gf.createButton("Submit", 50, 800);
        
         
        //create button to check if player qualifies
        gf.createButton("Exit", 500, 800);
        //create a frame
        gf.createFrame();
    }
    
}
