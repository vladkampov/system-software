/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spz_lab2_8;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vladkampov
 */
public class Main {
    private static List<Integer> arr;
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Main.arr  = new ArrayList();
        
        for (String s : args) {
            Main.arr.add(Integer.parseInt(s));
        }
        
        float avarage = 0;
        Integer max = Main.arr.get(0);
        Integer min = Main.arr.get(0);
        for (Integer num : Main.arr) {
            avarage += num;
            
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        
        avarage /= Main.arr.size();
                
        System.out.println("Avarage: " + avarage);
        System.out.println("Max value: " + max);
        System.out.println("Min value: " + min + '\n');
        
        System.out.println("Absolute diff min: " + (avarage - max));
        System.out.println("Absolute diff max: " + (avarage - min));
    }
    
}
