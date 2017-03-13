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

import java.util.ArrayList;
import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vladkampov
 */
public class NumberTest {
    
    public NumberTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getPoweredValue method, of class Number.
     */
    @Test
    public void testGetPoweredValue() {
        System.out.println("getPoweredValue");
        int power = 8;
        int max_steps = 3;
        Number instance = new Number(2);
        int expResult = 256;
        int result = instance.getPoweredValue(power, max_steps);
        assertEquals(expResult, result);
    }

    /**
     * Test of getSteps method, of class Number.
     */
    @Test
    public void testGetSteps() {
        System.out.println("getSteps");
        Number instance = new Number();
        List<Integer> expResult = new ArrayList();
        List<Integer> result = instance.getSteps();
        assertEquals(expResult, result);
    }

    /**
     * Test of getValue method, of class Number.
     */
    @Test
    public void testGetValue() {
        System.out.println("getValue");
        Number instance = new Number();
        int expResult = 2;
        int result = instance.getValue();
        assertEquals(expResult, result);
    }

    /**
     * Test of setValue method, of class Number.
     */
    @Test
    public void testSetValue() {
        System.out.println("setValue");
        int value = 2;
        Number instance = new Number();
        instance.setValue(value);
    }
    
}
