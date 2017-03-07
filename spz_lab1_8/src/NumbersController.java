/*
 * The MIT License
 *
 * Copyright 2017 vladkampov.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

import java.util.Scanner;

/**
 *
 * @author vladkampov
 */
public class NumbersController {
    // Constructor
    Number model;
    NumberView view;
    
    public NumbersController(Number model, NumberView view) {
        this.model  = model;
        this.view = view;
    }
    
    public void letUserGetThePower(){
        Scanner sc = new Scanner(System.in);

        model.setValue(inputIntValueWithScanner(sc, view.INPUT_INT_DATA));
        view.printMessageAndInt(view.SETTED_INT, model.getValue());
        
        int powered = model.getPoweredValue(inputIntValueWithScanner(sc, view.INPUT_POWER_DATA));
        view.printMessageAndInt(view.SETTED_POWER, powered);
        
        view.printMessageAndSteps(view.STEPS, model.getSteps());
    }

    public int inputIntValueWithScanner(Scanner sc, String text_variable) {
        view.printMessage(text_variable);
        
        while( ! sc.hasNextInt()) {
            view.printMessage(view.WRONG_INPUT_INT_DATA + text_variable);
            sc.next();
        }
        
        return sc.nextInt();
    }
}
