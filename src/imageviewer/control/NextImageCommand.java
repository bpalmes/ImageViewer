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


public class NextImageCommand implements Command {

    private final ImageDisplay imageDispaly;

    public NextImageCommand(ImageDisplay imageDispaly) {
        this.imageDispaly = imageDispaly;
    }
    
    @Override
    public void execute() {
        imageDispaly.show(imageDispaly.image().next(),0,1);
    }

}