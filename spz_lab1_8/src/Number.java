/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vladkampov
 */
public class Number {
    private int value;
    
    public int getPoweredValue(int power) {
        return (int) Math.pow(this.value, power);
    }
    
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
