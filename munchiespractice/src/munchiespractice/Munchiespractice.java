/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package munchiespractice;

/**
 *
 * @author Alex
 */
public class Munchiespractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        GridView view = new GridView();
         GridController controller = new GridController(view);
        view.setVisible(true);
    }
    
}
