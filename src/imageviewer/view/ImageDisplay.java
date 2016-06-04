/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageviewer.view;

/**
 *
 * @author Riemann
 */
import imageviewer.model.Image;

public interface ImageDisplay {

    public Image image();
    public void show(Image image, int grades, float zoom);

}