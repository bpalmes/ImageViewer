/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageviewer.control;

/**
 *
 * @author Riemann
 */
import imageviewer.view.ImageDisplay;


public class PrevImageCommand implements Command {

    private final ImageDisplay imageDisplay;

    public PrevImageCommand(ImageDisplay imageDisplay) {
        this.imageDisplay = imageDisplay;
    }
    
    @Override
    public void execute() {
        
        imageDisplay.show(imageDisplay.image().prev(),0,1);
    }

}