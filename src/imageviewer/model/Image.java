/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageviewer.model;

/**
 *
 * @author Riemann
 */

public interface Image {
    public Object bitMap();
    public Image prev();
    public Image next();
    public Image rotate();
    public Image increase();
    public Image reduce();
}
