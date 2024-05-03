package org.howard.edu.oopfinal.question3;

import static org.junit.Assert.*;
import org.junit.Test;

public class ShapesTest {
    @Test
    public void testCreateCircle() {
        Shapes circle = Refact.createShape("Circle");
        assertNotNull(circle);
        assertTrue(circle instanceof Circle);
    }

    @Test
    public void testCreateRectangle() {
        Shapes rectangle = Refact.createShape("Rectangle");
        assertNotNull(rectangle);
        assertTrue(rectangle instanceof Rectangle);
    }
}