/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ai.beans;

/**
 *
 * @author marek
 */
public class ColorBean {

   
    private String foregroundColor;
    private String backgroundColor;
    private String withBorder;

    public ColorBean() {
    }

    /**
     * @return the foregroundColor
     */
    public String getForegroundColor() {
        return foregroundColor;
    }

    /**
     * @param foregroundColor the foregroundColor to set
     */
    public void setForegroundColor(String foregroundColor) {
        this.foregroundColor = foregroundColor;
    }

    /**
     * @return the backgroundColor
     */
    public String getBackgroundColor() {
        return backgroundColor;
    }

    /**
     * @param backgroundColor the backgroundColor to set
     */
    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }
 /**
     * @return the withBorder
     */
    public String getWithBorder() {
        return withBorder;
    }

    /**
     * @param withBorder the withBorder to set
     */
    public void setWithBorder(String withBorder) {
        this.withBorder = withBorder;
    }

  

}
