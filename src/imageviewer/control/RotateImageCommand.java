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
import imageviewer.model.Image;
import imageviewer.view.ImageDisplay;

public class RotateImageCommand implements Command{

    private final ImageDisplay imageDisplay;

    public RotateImageCommand(ImageDisplay imageDisplay) {
        this.imageDisplay = imageDisplay;
    }
    
    @Override
    public void execute() {
        imageDisplay.show(imageDisplay.image(),90,1);
    }
    
}