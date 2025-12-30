package park;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        int int0 = java.awt.Frame.WAIT_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        int int0 = java.awt.Frame.NW_RESIZE_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        int int0 = java.awt.Frame.MAXIMIZED_BOTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.awt.Frame[] frameArray0 = java.awt.Frame.getFrames();
        org.junit.Assert.assertNotNull(frameArray0);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        int int0 = java.awt.Frame.MAXIMIZED_HORIZ;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        int int0 = java.awt.Frame.W_RESIZE_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        int int0 = java.awt.Frame.E_RESIZE_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        int int0 = java.awt.Frame.DEFAULT_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        int int0 = javax.swing.WindowConstants.HIDE_ON_CLOSE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        int int0 = java.awt.Frame.N_RESIZE_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.awt.Window[] windowArray0 = java.awt.Window.getOwnerlessWindows();
        org.junit.Assert.assertNotNull(windowArray0);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        int int0 = javax.swing.WindowConstants.EXIT_ON_CLOSE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        int int0 = java.awt.image.ImageObserver.WIDTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        float float0 = java.awt.Component.RIGHT_ALIGNMENT;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 1.0f + "'", float0 == 1.0f);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        int int0 = java.awt.Frame.S_RESIZE_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        int int0 = java.awt.Frame.TEXT_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        int int0 = javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        float float0 = java.awt.Component.TOP_ALIGNMENT;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 0.0f + "'", float0 == 0.0f);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        float float0 = java.awt.Component.LEFT_ALIGNMENT;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 0.0f + "'", float0 == 0.0f);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        int int0 = java.awt.image.ImageObserver.SOMEBITS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        int int0 = java.awt.Frame.HAND_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.awt.Window[] windowArray0 = java.awt.Window.getWindows();
        org.junit.Assert.assertNotNull(windowArray0);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        int int0 = java.awt.Frame.NE_RESIZE_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        int int0 = java.awt.Frame.ICONIFIED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        int int0 = java.awt.Frame.MOVE_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 13 + "'", int0 == 13);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        int int0 = javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        javax.swing.JFrame.setDefaultLookAndFeelDecorated(false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        boolean boolean0 = javax.swing.JFrame.isDefaultLookAndFeelDecorated();
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        int int0 = java.awt.Frame.SE_RESIZE_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        int int0 = java.awt.image.ImageObserver.PROPERTIES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        int int0 = java.awt.Frame.MAXIMIZED_VERT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        int int0 = java.awt.Frame.NORMAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        float float0 = java.awt.Component.CENTER_ALIGNMENT;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 0.5f + "'", float0 == 0.5f);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.Dimension dimension1 = null;
        parkingcharges0.setPreferredSize(dimension1);
        park.Parkingcharges parkingcharges3 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener4 = null;
        parkingcharges3.addMouseWheelListener(mouseWheelListener4);
        // The following exception was thrown during execution in test generation
        try {
            parkingcharges0.setGlassPane((java.awt.Component) parkingcharges3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = parkingcharges0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle7 = parkingcharges0.getBounds();
        java.awt.AWTEvent aWTEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingcharges0.dispatchEvent(aWTEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.AWTEvent.getID()\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(rectangle7);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setLocationByPlatform(false);
        java.awt.Dimension dimension3 = null;
        parkingcharges0.setMaximumSize(dimension3);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.lang.String str1 = parkingcharges0.getTitle();
        park.Parkingcharges parkingcharges2 = new park.Parkingcharges();
        parkingcharges2.setFocusable(false);
        java.awt.Event event5 = null;
        boolean boolean8 = parkingcharges2.mouseDrag(event5, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle9 = parkingcharges2.getBounds();
        // The following exception was thrown during execution in test generation
        try {
            parkingcharges0.setShape((java.awt.Shape) rectangle9);
            org.junit.Assert.fail("Expected exception of type java.awt.IllegalComponentStateException; message: The frame is decorated");
        } catch (java.awt.IllegalComponentStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Parking Booking" + "'", str1, "Parking Booking");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(rectangle9);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.BufferCapabilities bufferCapabilities2 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingcharges0.createBufferStrategy((int) (byte) 0, bufferCapabilities2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Number of buffers must be at least 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setLocationByPlatform(false);
        java.awt.Image image3 = null;
        parkingcharges0.setIconImage(image3);
        park.Parkingcharges parkingcharges5 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener6 = null;
        parkingcharges5.addMouseWheelListener(mouseWheelListener6);
        java.awt.Point point9 = parkingcharges5.getMousePosition(true);
        java.awt.event.MouseListener mouseListener10 = null;
        parkingcharges5.addMouseListener(mouseListener10);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component12 = parkingcharges0.add((java.awt.Component) parkingcharges5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point9);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingcharges0.addMouseWheelListener(mouseWheelListener1);
        java.awt.event.MouseMotionListener mouseMotionListener3 = null;
        parkingcharges0.removeMouseMotionListener(mouseMotionListener3);
        // The following exception was thrown during execution in test generation
        try {
            parkingcharges0.setUndecorated(true);
            org.junit.Assert.fail("Expected exception of type java.awt.IllegalComponentStateException; message: The frame is displayable.");
        } catch (java.awt.IllegalComponentStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        int int0 = java.awt.Frame.CROSSHAIR_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.Point point1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component2 = parkingcharges0.getComponentAt(point1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"x\" because \"p\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.Dimension dimension1 = null;
        parkingcharges0.setPreferredSize(dimension1);
        java.awt.Point point3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component4 = parkingcharges0.getComponentAt(point3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"x\" because \"p\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingcharges0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingcharges0.getMousePosition(true);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray5 = parkingcharges0.getPropertyChangeListeners();
        parkingcharges0.setFocusTraversalPolicyProvider(false);
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray5);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        int int0 = java.awt.Frame.SW_RESIZE_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.Dimension dimension1 = null;
        parkingcharges0.setPreferredSize(dimension1);
        parkingcharges0.resize(7, 0);
        boolean boolean6 = parkingcharges0.isEnabled();
        park.Parkingcharges parkingcharges7 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener8 = null;
        parkingcharges7.addMouseWheelListener(mouseWheelListener8);
        java.awt.event.MouseMotionListener mouseMotionListener10 = null;
        parkingcharges7.removeMouseMotionListener(mouseMotionListener10);
        // The following exception was thrown during execution in test generation
        try {
            parkingcharges0.setGlassPane((java.awt.Component) parkingcharges7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.Dimension dimension1 = null;
        parkingcharges0.setPreferredSize(dimension1);
        parkingcharges0.resize(7, 0);
        boolean boolean6 = parkingcharges0.isEnabled();
        java.awt.event.MouseMotionListener mouseMotionListener7 = null;
        parkingcharges0.addMouseMotionListener(mouseMotionListener7);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingcharges0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingcharges0.getMousePosition(true);
        java.awt.PopupMenu popupMenu5 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingcharges0.add(popupMenu5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"parent\" because \"popup\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point4);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.lang.String str1 = parkingcharges0.getTitle();
        java.io.PrintWriter printWriter2 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingcharges0.list(printWriter2, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.print(String)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Parking Booking" + "'", str1, "Parking Booking");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingcharges0.addMouseWheelListener(mouseWheelListener1);
        java.awt.event.MouseMotionListener mouseMotionListener3 = null;
        parkingcharges0.removeMouseMotionListener(mouseMotionListener3);
        java.awt.event.HierarchyListener[] hierarchyListenerArray5 = parkingcharges0.getHierarchyListeners();
        java.awt.Point point6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component7 = parkingcharges0.getComponentAt(point6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"x\" because \"p\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hierarchyListenerArray5);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.awt.Color color5 = parkingcharges0.getForeground();
        java.awt.Event event6 = null;
        boolean boolean8 = parkingcharges0.gotFocus(event6, (java.lang.Object) (short) -1);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setLocationByPlatform(false);
        java.awt.Image image3 = null;
        parkingcharges0.setIconImage(image3);
        javax.swing.JMenuBar jMenuBar5 = null;
        parkingcharges0.setJMenuBar(jMenuBar5);
        java.awt.ComponentOrientation componentOrientation7 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingcharges0.applyComponentOrientation(componentOrientation7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingcharges0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingcharges0.getMousePosition(true);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray5 = parkingcharges0.getPropertyChangeListeners();
        java.awt.event.ComponentListener componentListener6 = null;
        parkingcharges0.addComponentListener(componentListener6);
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray5);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingcharges0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingcharges0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        parkingcharges0.addMouseListener(mouseListener5);
        java.awt.Component component7 = parkingcharges0.getMostRecentFocusOwner();
        javax.swing.JMenuBar jMenuBar8 = parkingcharges0.getJMenuBar();
        parkingcharges0.disable();
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertNull(jMenuBar8);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = parkingcharges0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle7 = parkingcharges0.getBounds();
        int int8 = parkingcharges0.getCursorType();
        javax.swing.JLayeredPane jLayeredPane9 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingcharges0.setLayeredPane(jLayeredPane9);
            org.junit.Assert.fail("Expected exception of type java.awt.IllegalComponentStateException; message: layeredPane cannot be set to null.");
        } catch (java.awt.IllegalComponentStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(rectangle7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.lang.String str1 = parkingcharges0.getTitle();
        java.awt.Font font2 = null;
        parkingcharges0.setFont(font2);
        java.awt.Event event4 = null;
        boolean boolean7 = parkingcharges0.mouseEnter(event4, 6, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Parking Booking" + "'", str1, "Parking Booking");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str5 = parkingcharges0.getTitle();
        java.awt.event.FocusListener[] focusListenerArray6 = parkingcharges0.getFocusListeners();
        java.awt.FocusTraversalPolicy focusTraversalPolicy7 = null;
        parkingcharges0.setFocusTraversalPolicy(focusTraversalPolicy7);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Parking Booking" + "'", str5, "Parking Booking");
        org.junit.Assert.assertNotNull(focusListenerArray6);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = parkingcharges0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle7 = parkingcharges0.getBounds();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray8 = parkingcharges0.getPropertyChangeListeners();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component10 = parkingcharges0.getComponent(11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: No such child: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(rectangle7);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray8);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingcharges0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingcharges0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        parkingcharges0.addMouseListener(mouseListener5);
        java.awt.LayoutManager layoutManager7 = parkingcharges0.getLayout();
        parkingcharges0.move(11, 6);
        javax.swing.JMenuBar jMenuBar11 = null;
        parkingcharges0.setJMenuBar(jMenuBar11);
        parkingcharges0.firePropertyChange("", (long) (short) 1, (long) (-1));
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(layoutManager7);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setLocationByPlatform(false);
        java.awt.Image image3 = null;
        parkingcharges0.setIconImage(image3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = parkingcharges0.areFocusTraversalKeysSet(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid focus traversal key identifier");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.awt.BufferCapabilities bufferCapabilities6 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingcharges0.createBufferStrategy(100, bufferCapabilities6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No capabilities specified");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingcharges0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingcharges0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        parkingcharges0.addMouseListener(mouseListener5);
        java.awt.LayoutManager layoutManager7 = parkingcharges0.getLayout();
        parkingcharges0.move(11, 6);
        java.awt.Image image11 = null;
        parkingcharges0.setIconImage(image11);
        // The following exception was thrown during execution in test generation
        try {
            parkingcharges0.setOpacity((float) 0);
            org.junit.Assert.fail("Expected exception of type java.awt.IllegalComponentStateException; message: The frame is decorated");
        } catch (java.awt.IllegalComponentStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(layoutManager7);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.awt.Color color5 = parkingcharges0.getForeground();
        java.awt.Point point6 = parkingcharges0.getMousePosition();
        boolean boolean7 = parkingcharges0.requestFocusInWindow();
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(point6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.Dimension dimension1 = null;
        parkingcharges0.setPreferredSize(dimension1);
        java.awt.event.ComponentListener componentListener3 = null;
        parkingcharges0.removeComponentListener(componentListener3);
        java.awt.Graphics graphics5 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingcharges0.paintAll(graphics5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Graphics.getClip()\" because \"g\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = parkingcharges0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        parkingcharges0.transferFocusBackward();
        java.awt.Event event8 = null;
        boolean boolean11 = parkingcharges0.mouseMove(event8, (int) ' ', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = parkingcharges0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        java.awt.event.WindowListener windowListener7 = null;
        parkingcharges0.removeWindowListener(windowListener7);
        java.awt.event.MouseMotionListener mouseMotionListener9 = null;
        parkingcharges0.addMouseMotionListener(mouseMotionListener9);
        java.awt.Event event11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = parkingcharges0.postEvent(event11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"id\" because \"evt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.lang.String str1 = parkingcharges0.getTitle();
        java.awt.Cursor cursor2 = null;
        parkingcharges0.setCursor(cursor2);
        java.awt.event.WindowListener windowListener4 = null;
        parkingcharges0.addWindowListener(windowListener4);
        java.awt.Event event6 = null;
        park.Parkingcharges parkingcharges7 = new park.Parkingcharges();
        parkingcharges7.setLocationByPlatform(false);
        java.awt.Image image10 = null;
        parkingcharges7.setIconImage(image10);
        park.Parkingcharges parkingcharges12 = new park.Parkingcharges();
        parkingcharges12.setFocusable(false);
        java.awt.Event event15 = null;
        boolean boolean18 = parkingcharges12.mouseDrag(event15, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle19 = parkingcharges12.getBounds();
        parkingcharges7.setMixingCutoutShape((java.awt.Shape) rectangle19);
        boolean boolean21 = parkingcharges0.gotFocus(event6, (java.lang.Object) rectangle19);
        parkingcharges0.hide();
        java.awt.Event event23 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingcharges0.deliverEvent(event23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"x\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Parking Booking" + "'", str1, "Parking Booking");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(rectangle19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingcharges0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingcharges0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        parkingcharges0.addMouseListener(mouseListener5);
        java.awt.LayoutManager layoutManager7 = parkingcharges0.getLayout();
        parkingcharges0.move(11, 6);
        java.awt.Image image11 = null;
        parkingcharges0.setIconImage(image11);
        java.awt.Graphics graphics13 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingcharges0.paintComponents(graphics13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Graphics.getClip()\" because \"g\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(layoutManager7);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingcharges0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingcharges0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        parkingcharges0.addMouseListener(mouseListener5);
        java.awt.Component component7 = parkingcharges0.getMostRecentFocusOwner();
        parkingcharges0.setAlwaysOnTop(false);
        javax.swing.TransferHandler transferHandler10 = parkingcharges0.getTransferHandler();
        java.awt.event.FocusEvent.Cause cause11 = null;
        parkingcharges0.requestFocus(cause11);
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertNull(transferHandler10);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setLocationByPlatform(false);
        int int3 = parkingcharges0.getExtendedState();
        parkingcharges0.setFocusable(false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        int int0 = java.awt.image.ImageObserver.ALLBITS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32 + "'", int0 == 32);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray5 = parkingcharges0.getHierarchyBoundsListeners();
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray5);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingcharges0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingcharges0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        parkingcharges0.addMouseListener(mouseListener5);
        java.awt.LayoutManager layoutManager7 = parkingcharges0.getLayout();
        parkingcharges0.move(11, 6);
        boolean boolean11 = parkingcharges0.isFocusable();
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(layoutManager7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingcharges0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingcharges0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        parkingcharges0.addMouseListener(mouseListener5);
        java.awt.LayoutManager layoutManager7 = parkingcharges0.getLayout();
        parkingcharges0.move(11, 6);
        java.awt.Image image11 = null;
        parkingcharges0.setIconImage(image11);
        java.awt.LayoutManager layoutManager13 = parkingcharges0.getLayout();
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(layoutManager7);
        org.junit.Assert.assertNotNull(layoutManager13);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str5 = parkingcharges0.getTitle();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior6 = parkingcharges0.getBaselineResizeBehavior();
        java.awt.event.WindowListener windowListener7 = null;
        parkingcharges0.addWindowListener(windowListener7);
        java.awt.event.WindowFocusListener windowFocusListener9 = null;
        parkingcharges0.addWindowFocusListener(windowFocusListener9);
        java.awt.Font font11 = parkingcharges0.getFont();
        park.Parkingcharges parkingcharges12 = new park.Parkingcharges();
        parkingcharges12.setLocationByPlatform(false);
        parkingcharges12.firePropertyChange("Parking Booking", (short) (byte) -1, (short) (byte) 1);
        park.Parkingcharges parkingcharges19 = new park.Parkingcharges();
        parkingcharges19.setFocusable(false);
        java.awt.Event event22 = null;
        boolean boolean25 = parkingcharges19.mouseDrag(event22, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle26 = parkingcharges19.getBounds();
        java.awt.Dimension dimension27 = parkingcharges19.getPreferredSize();
        java.util.List<java.awt.Image> imageList28 = parkingcharges19.getIconImages();
        parkingcharges12.setIconImages(imageList28);
        parkingcharges0.setIconImages(imageList28);
        boolean boolean33 = parkingcharges0.inside(1, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Parking Booking" + "'", str5, "Parking Booking");
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior6 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior6.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(rectangle26);
        org.junit.Assert.assertNotNull(dimension27);
        org.junit.Assert.assertNotNull(imageList28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.lang.String str1 = parkingcharges0.getTitle();
        java.awt.Cursor cursor2 = null;
        parkingcharges0.setCursor(cursor2);
        java.awt.event.WindowListener windowListener4 = null;
        parkingcharges0.addWindowListener(windowListener4);
        java.awt.event.ActionEvent actionEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingcharges0.actionPerformed(actionEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.event.ActionEvent.getSource()\" because \"event\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Parking Booking" + "'", str1, "Parking Booking");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.awt.Color color5 = parkingcharges0.getForeground();
        java.awt.Point point6 = parkingcharges0.getMousePosition();
        java.awt.Event event7 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingcharges0.deliverEvent(event7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"x\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(point6);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingcharges0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingcharges0.getMousePosition(true);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray5 = parkingcharges0.getPropertyChangeListeners();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener6 = null;
        parkingcharges0.removeHierarchyBoundsListener(hierarchyBoundsListener6);
        java.awt.Image image10 = parkingcharges0.createImage(6, (int) (short) 100);
        parkingcharges0.list();
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray5);
        org.junit.Assert.assertNotNull(image10);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = parkingcharges0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle7 = parkingcharges0.getBounds();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray8 = parkingcharges0.getPropertyChangeListeners();
        park.Parkingcharges parkingcharges9 = new park.Parkingcharges();
        java.lang.String str10 = parkingcharges9.getTitle();
        // The following exception was thrown during execution in test generation
        try {
            parkingcharges0.setGlassPane((java.awt.Component) parkingcharges9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(rectangle7);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Booking" + "'", str10, "Parking Booking");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.Dimension dimension1 = null;
        parkingcharges0.setPreferredSize(dimension1);
        parkingcharges0.resize(7, 0);
        boolean boolean6 = parkingcharges0.isEnabled();
        parkingcharges0.setResizable(false);
        parkingcharges0.setAutoRequestFocus(false);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Image image13 = parkingcharges0.createImage(0, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Width (0) and height (8) cannot be <= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = parkingcharges0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        java.awt.event.WindowListener windowListener7 = null;
        parkingcharges0.removeWindowListener(windowListener7);
        java.awt.MenuComponent menuComponent9 = null;
        parkingcharges0.remove(menuComponent9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingcharges0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingcharges0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        parkingcharges0.addMouseListener(mouseListener5);
        java.awt.Component component7 = parkingcharges0.getMostRecentFocusOwner();
        parkingcharges0.addNotify();
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(component7);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = parkingcharges0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        parkingcharges0.transferFocusBackward();
        java.awt.Event event8 = null;
        boolean boolean11 = parkingcharges0.mouseDown(event8, (int) (short) 10, (int) (byte) 100);
        java.awt.Image image12 = null;
        parkingcharges0.setIconImage(image12);
        parkingcharges0.firePropertyChange("", '#', 'a');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.lang.String str1 = parkingcharges0.getTitle();
        java.awt.Cursor cursor2 = null;
        parkingcharges0.setCursor(cursor2);
        java.awt.event.WindowListener windowListener4 = null;
        parkingcharges0.addWindowListener(windowListener4);
        java.awt.Event event6 = null;
        park.Parkingcharges parkingcharges7 = new park.Parkingcharges();
        parkingcharges7.setLocationByPlatform(false);
        java.awt.Image image10 = null;
        parkingcharges7.setIconImage(image10);
        park.Parkingcharges parkingcharges12 = new park.Parkingcharges();
        parkingcharges12.setFocusable(false);
        java.awt.Event event15 = null;
        boolean boolean18 = parkingcharges12.mouseDrag(event15, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle19 = parkingcharges12.getBounds();
        parkingcharges7.setMixingCutoutShape((java.awt.Shape) rectangle19);
        boolean boolean21 = parkingcharges0.gotFocus(event6, (java.lang.Object) rectangle19);
        java.util.ResourceBundle resourceBundle22 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingcharges0.applyResourceBundle(resourceBundle22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ResourceBundle.getLocale()\" because \"bdl\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Parking Booking" + "'", str1, "Parking Booking");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(rectangle19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = parkingcharges0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        parkingcharges0.transferFocusBackward();
        java.awt.Event event8 = null;
        boolean boolean11 = parkingcharges0.mouseDown(event8, (int) (short) 10, (int) (byte) 100);
        java.awt.Image image12 = null;
        parkingcharges0.setIconImage(image12);
        parkingcharges0.setState(7);
        parkingcharges0.setSize(32, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.Dimension dimension1 = null;
        parkingcharges0.setPreferredSize(dimension1);
        parkingcharges0.resize(7, 0);
        boolean boolean6 = parkingcharges0.isEnabled();
        parkingcharges0.setAlwaysOnTop(false);
        boolean boolean9 = parkingcharges0.isShowing();
        java.awt.Point point10 = null;
        java.awt.Point point11 = parkingcharges0.getLocation(point10);
        java.io.PrintStream printStream12 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingcharges0.list(printStream12, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintStream.print(String)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(point11);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setLocationByPlatform(false);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component4 = parkingcharges0.getComponent((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: No such child: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingcharges0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingcharges0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        parkingcharges0.addMouseListener(mouseListener5);
        java.awt.Component component7 = parkingcharges0.getMostRecentFocusOwner();
        java.awt.Dimension dimension8 = null;
        parkingcharges0.setMaximumSize(dimension8);
        java.awt.event.ContainerListener containerListener10 = null;
        parkingcharges0.addContainerListener(containerListener10);
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(component7);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = parkingcharges0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        java.awt.event.WindowListener windowListener7 = null;
        parkingcharges0.removeWindowListener(windowListener7);
        park.Parkingcharges parkingcharges9 = new park.Parkingcharges();
        parkingcharges9.setLocationByPlatform(false);
        java.awt.Image image12 = null;
        parkingcharges9.setIconImage(image12);
        park.Parkingcharges parkingcharges14 = new park.Parkingcharges();
        parkingcharges14.setFocusable(false);
        java.awt.Event event17 = null;
        boolean boolean20 = parkingcharges14.mouseDrag(event17, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle21 = parkingcharges14.getBounds();
        parkingcharges9.setMixingCutoutShape((java.awt.Shape) rectangle21);
        // The following exception was thrown during execution in test generation
        try {
            parkingcharges0.setShape((java.awt.Shape) rectangle21);
            org.junit.Assert.fail("Expected exception of type java.awt.IllegalComponentStateException; message: The frame is decorated");
        } catch (java.awt.IllegalComponentStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(rectangle21);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setFocusable(false);
        java.awt.event.ComponentListener componentListener3 = null;
        parkingcharges0.removeComponentListener(componentListener3);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingcharges0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingcharges0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        parkingcharges0.addMouseListener(mouseListener5);
        java.awt.LayoutManager layoutManager7 = parkingcharges0.getLayout();
        parkingcharges0.move(11, 6);
        java.awt.Image image11 = null;
        parkingcharges0.setIconImage(image11);
        parkingcharges0.setCursor(1);
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(layoutManager7);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.Dimension dimension1 = null;
        parkingcharges0.setPreferredSize(dimension1);
        parkingcharges0.resize(7, 0);
        boolean boolean6 = parkingcharges0.isEnabled();
        parkingcharges0.repaint((long) 7, (int) '#', (int) (short) 100, 9, (int) (byte) 0);
        parkingcharges0.repaint();
        java.awt.Event event14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = parkingcharges0.postEvent(event14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"id\" because \"evt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.lang.String str1 = parkingcharges0.getTitle();
        java.awt.event.KeyListener keyListener2 = null;
        parkingcharges0.addKeyListener(keyListener2);
        boolean boolean4 = parkingcharges0.isDisplayable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Parking Booking" + "'", str1, "Parking Booking");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = parkingcharges0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        java.awt.event.WindowListener windowListener7 = null;
        parkingcharges0.removeWindowListener(windowListener7);
        java.awt.event.MouseMotionListener mouseMotionListener9 = null;
        parkingcharges0.addMouseMotionListener(mouseMotionListener9);
        parkingcharges0.validate();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        int int0 = java.awt.image.ImageObserver.HEIGHT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = parkingcharges0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        parkingcharges0.transferFocusBackward();
        parkingcharges0.setAlwaysOnTop(true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setLocationByPlatform(false);
        parkingcharges0.setVisible(true);
        java.awt.Container container5 = parkingcharges0.getFocusCycleRootAncestor();
        parkingcharges0.dispose();
        // The following exception was thrown during execution in test generation
        try {
            parkingcharges0.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(container5);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setFocusable(false);
        java.awt.event.MouseMotionListener[] mouseMotionListenerArray3 = parkingcharges0.getMouseMotionListeners();
        java.awt.Window[] windowArray4 = parkingcharges0.getOwnedWindows();
        park.Parkingcharges parkingcharges5 = new park.Parkingcharges();
        parkingcharges5.setFocusable(false);
        java.awt.Event event8 = null;
        boolean boolean11 = parkingcharges5.mouseDrag(event8, (int) (byte) 1, (int) (short) 1);
        parkingcharges5.transferFocusBackward();
        park.Parkingcharges parkingcharges13 = new park.Parkingcharges();
        java.awt.Dimension dimension14 = null;
        parkingcharges13.setPreferredSize(dimension14);
        parkingcharges13.resize(7, 0);
        boolean boolean19 = parkingcharges13.isEnabled();
        parkingcharges13.setAlwaysOnTop(false);
        boolean boolean22 = parkingcharges13.isShowing();
        java.awt.Point point23 = null;
        java.awt.Point point24 = parkingcharges13.getLocation(point23);
        java.awt.Component component25 = parkingcharges5.findComponentAt(point24);
        java.awt.Component component26 = parkingcharges0.getComponentAt(point24);
        org.junit.Assert.assertNotNull(mouseMotionListenerArray3);
        org.junit.Assert.assertNotNull(windowArray4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(point24);
        org.junit.Assert.assertNull(component25);
        org.junit.Assert.assertNull(component26);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingcharges0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingcharges0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        parkingcharges0.addMouseListener(mouseListener5);
        java.awt.LayoutManager layoutManager7 = parkingcharges0.getLayout();
        parkingcharges0.move(11, 6);
        java.awt.event.ContainerListener[] containerListenerArray11 = parkingcharges0.getContainerListeners();
        boolean boolean12 = parkingcharges0.isActive();
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(layoutManager7);
        org.junit.Assert.assertNotNull(containerListenerArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingcharges0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingcharges0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        parkingcharges0.addMouseListener(mouseListener5);
        java.awt.Component component7 = parkingcharges0.getMostRecentFocusOwner();
        component7.setFocusable(true);
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(component7);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.Dimension dimension1 = null;
        parkingcharges0.setPreferredSize(dimension1);
        parkingcharges0.resize(7, 0);
        boolean boolean6 = parkingcharges0.isEnabled();
        java.awt.Event event7 = null;
        boolean boolean9 = parkingcharges0.lostFocus(event7, (java.lang.Object) (short) 0);
        java.awt.Cursor cursor10 = parkingcharges0.getCursor();
        java.awt.FocusTraversalPolicy focusTraversalPolicy11 = null;
        parkingcharges0.setFocusTraversalPolicy(focusTraversalPolicy11);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cursor10);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingcharges0.addMouseWheelListener(mouseWheelListener1);
        java.awt.event.MouseMotionListener mouseMotionListener3 = null;
        parkingcharges0.removeMouseMotionListener(mouseMotionListener3);
        java.awt.event.HierarchyListener[] hierarchyListenerArray5 = parkingcharges0.getHierarchyListeners();
        java.awt.event.WindowStateListener windowStateListener6 = null;
        parkingcharges0.removeWindowStateListener(windowStateListener6);
        org.junit.Assert.assertNotNull(hierarchyListenerArray5);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.Dimension dimension1 = null;
        parkingcharges0.setPreferredSize(dimension1);
        parkingcharges0.doLayout();
        boolean boolean5 = parkingcharges0.areFocusTraversalKeysSet((int) (short) 1);
        javax.swing.JRootPane jRootPane6 = parkingcharges0.getRootPane();
        park.Parkingcharges parkingcharges7 = new park.Parkingcharges();
        java.awt.Dimension dimension8 = null;
        parkingcharges7.setPreferredSize(dimension8);
        parkingcharges0.remove((java.awt.Component) parkingcharges7);
        java.lang.String str11 = parkingcharges0.toString();
        java.awt.Event event12 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingcharges0.deliverEvent(event12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"x\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jRootPane6);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "park.Parkingcharges[frame2,710,391,500x250,layout=java.awt.BorderLayout,title=Parking Booking,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,8,31,484x211,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]" + "'", str11, "park.Parkingcharges[frame2,710,391,500x250,layout=java.awt.BorderLayout,title=Parking Booking,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,8,31,484x211,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingcharges0.addMouseWheelListener(mouseWheelListener1);
        java.awt.event.MouseMotionListener mouseMotionListener3 = null;
        parkingcharges0.removeMouseMotionListener(mouseMotionListener3);
        java.awt.Event event5 = null;
        boolean boolean8 = parkingcharges0.mouseUp(event5, (int) (short) 0, (int) (short) -1);
        javax.swing.TransferHandler transferHandler9 = null;
        parkingcharges0.setTransferHandler(transferHandler9);
        java.lang.String str11 = parkingcharges0.getTitle();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Booking" + "'", str11, "Parking Booking");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.Dimension dimension1 = null;
        parkingcharges0.setPreferredSize(dimension1);
        parkingcharges0.resize(7, 0);
        boolean boolean6 = parkingcharges0.isEnabled();
        parkingcharges0.setAlwaysOnTop(false);
        boolean boolean9 = parkingcharges0.isShowing();
        boolean boolean10 = parkingcharges0.isFocusOwner();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str5 = parkingcharges0.getTitle();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior6 = parkingcharges0.getBaselineResizeBehavior();
        java.awt.event.MouseWheelListener mouseWheelListener7 = null;
        parkingcharges0.addMouseWheelListener(mouseWheelListener7);
        java.awt.event.ComponentListener componentListener9 = null;
        parkingcharges0.addComponentListener(componentListener9);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Parking Booking" + "'", str5, "Parking Booking");
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior6 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior6.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setLocationByPlatform(false);
        java.awt.Image image3 = null;
        parkingcharges0.setIconImage(image3);
        javax.swing.JMenuBar jMenuBar5 = null;
        parkingcharges0.setJMenuBar(jMenuBar5);
        java.awt.event.FocusListener focusListener7 = null;
        parkingcharges0.addFocusListener(focusListener7);
        java.awt.Rectangle rectangle9 = parkingcharges0.getBounds();
        java.awt.event.InputMethodListener[] inputMethodListenerArray10 = parkingcharges0.getInputMethodListeners();
        org.junit.Assert.assertNotNull(rectangle9);
        org.junit.Assert.assertNotNull(inputMethodListenerArray10);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setFocusable(false);
        java.awt.Dimension dimension3 = parkingcharges0.preferredSize();
        org.junit.Assert.assertNotNull(dimension3);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        float float0 = java.awt.Component.BOTTOM_ALIGNMENT;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 1.0f + "'", float0 == 1.0f);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.Dimension dimension1 = null;
        parkingcharges0.setPreferredSize(dimension1);
        parkingcharges0.doLayout();
        parkingcharges0.move((int) (short) -1, 0);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.Dimension dimension1 = null;
        parkingcharges0.setPreferredSize(dimension1);
        parkingcharges0.resize(7, 0);
        boolean boolean6 = parkingcharges0.isEnabled();
        java.awt.Event event7 = null;
        boolean boolean9 = parkingcharges0.lostFocus(event7, (java.lang.Object) (short) 0);
        parkingcharges0.setFocusCycleRoot(true);
        java.awt.event.FocusListener[] focusListenerArray12 = parkingcharges0.getFocusListeners();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(focusListenerArray12);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.util.Locale locale5 = null;
        parkingcharges0.setLocale(locale5);
        java.awt.event.InputMethodListener inputMethodListener7 = null;
        parkingcharges0.removeInputMethodListener(inputMethodListener7);
        parkingcharges0.invalidate();
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.Dimension dimension1 = null;
        parkingcharges0.setPreferredSize(dimension1);
        parkingcharges0.resize(7, 0);
        boolean boolean6 = parkingcharges0.isEnabled();
        java.awt.Event event7 = null;
        boolean boolean9 = parkingcharges0.lostFocus(event7, (java.lang.Object) (short) 0);
        java.awt.Font font10 = parkingcharges0.getFont();
        park.Parkingcharges parkingcharges11 = new park.Parkingcharges();
        parkingcharges11.setLocationByPlatform(false);
        java.awt.Image image14 = null;
        parkingcharges11.setIconImage(image14);
        javax.swing.JMenuBar jMenuBar16 = null;
        parkingcharges11.setJMenuBar(jMenuBar16);
        java.awt.FocusTraversalPolicy focusTraversalPolicy18 = null;
        parkingcharges11.setFocusTraversalPolicy(focusTraversalPolicy18);
        park.Parkingcharges parkingcharges20 = new park.Parkingcharges();
        java.awt.Dimension dimension21 = null;
        parkingcharges20.setPreferredSize(dimension21);
        parkingcharges20.resize(7, 0);
        boolean boolean26 = parkingcharges20.isEnabled();
        java.awt.Event event27 = null;
        boolean boolean29 = parkingcharges20.lostFocus(event27, (java.lang.Object) (short) 0);
        java.awt.Font font30 = parkingcharges20.getFont();
        java.awt.FontMetrics fontMetrics31 = parkingcharges11.getFontMetrics(font30);
        parkingcharges0.setFont(font30);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(font30);
        org.junit.Assert.assertNotNull(fontMetrics31);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.Dimension dimension1 = null;
        parkingcharges0.setPreferredSize(dimension1);
        parkingcharges0.resize(7, 0);
        boolean boolean6 = parkingcharges0.isEnabled();
        parkingcharges0.setResizable(false);
        boolean boolean9 = parkingcharges0.getFocusTraversalKeysEnabled();
        parkingcharges0.firePropertyChange("park.Parkingcharges[frame0,710,391,500x250,layout=java.awt.BorderLayout,title=Parking Booking,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,8,31,484x211,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", (byte) 10, (byte) 0);
        java.awt.FocusTraversalPolicy focusTraversalPolicy14 = null;
        parkingcharges0.setFocusTraversalPolicy(focusTraversalPolicy14);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setLocationByPlatform(false);
        parkingcharges0.setVisible(true);
        java.awt.Container container5 = parkingcharges0.getFocusCycleRootAncestor();
        parkingcharges0.dispose();
        java.awt.Rectangle rectangle7 = parkingcharges0.getMaximizedBounds();
        park.Parkingcharges parkingcharges8 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener9 = null;
        parkingcharges8.addMouseWheelListener(mouseWheelListener9);
        java.awt.Point point12 = parkingcharges8.getMousePosition(true);
        java.awt.event.MouseListener mouseListener13 = null;
        parkingcharges8.addMouseListener(mouseListener13);
        park.Parkingcharges parkingcharges15 = new park.Parkingcharges();
        parkingcharges15.setFocusable(false);
        java.awt.Event event18 = null;
        boolean boolean21 = parkingcharges15.mouseDrag(event18, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle22 = parkingcharges15.getBounds();
        java.awt.Rectangle rectangle23 = parkingcharges8.getBounds(rectangle22);
        // The following exception was thrown during execution in test generation
        try {
            parkingcharges0.setShape((java.awt.Shape) rectangle22);
            org.junit.Assert.fail("Expected exception of type java.awt.IllegalComponentStateException; message: The frame is decorated");
        } catch (java.awt.IllegalComponentStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(container5);
        org.junit.Assert.assertNull(rectangle7);
        org.junit.Assert.assertNull(point12);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(rectangle22);
        org.junit.Assert.assertNotNull(rectangle23);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingcharges0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingcharges0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        parkingcharges0.addMouseListener(mouseListener5);
        java.awt.LayoutManager layoutManager7 = parkingcharges0.getLayout();
        parkingcharges0.move(11, 6);
        java.awt.Image image11 = null;
        parkingcharges0.setIconImage(image11);
        park.Parkingcharges parkingcharges13 = new park.Parkingcharges();
        parkingcharges13.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.awt.Color color18 = parkingcharges13.getForeground();
        parkingcharges0.setBackground(color18);
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(layoutManager7);
        org.junit.Assert.assertNotNull(color18);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setLocationByPlatform(false);
        parkingcharges0.setVisible(true);
        java.awt.Container container5 = parkingcharges0.getFocusCycleRootAncestor();
        parkingcharges0.dispose();
        java.awt.event.FocusEvent.Cause cause7 = null;
        boolean boolean8 = parkingcharges0.requestFocusInWindow(cause7);
        org.junit.Assert.assertNull(container5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingcharges0.addMouseWheelListener(mouseWheelListener1);
        java.awt.event.MouseMotionListener mouseMotionListener3 = null;
        parkingcharges0.removeMouseMotionListener(mouseMotionListener3);
        java.awt.Event event5 = null;
        boolean boolean8 = parkingcharges0.mouseUp(event5, (int) (short) 0, (int) (short) -1);
        javax.swing.TransferHandler transferHandler9 = null;
        parkingcharges0.setTransferHandler(transferHandler9);
        boolean boolean11 = parkingcharges0.isFocusTraversalPolicyProvider();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.awt.event.MouseMotionListener mouseMotionListener5 = null;
        parkingcharges0.addMouseMotionListener(mouseMotionListener5);
        park.Parkingcharges parkingcharges7 = new park.Parkingcharges();
        java.awt.Dimension dimension8 = null;
        parkingcharges7.setPreferredSize(dimension8);
        parkingcharges7.doLayout();
        boolean boolean12 = parkingcharges7.areFocusTraversalKeysSet((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component14 = parkingcharges0.add((java.awt.Component) parkingcharges7, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal component position");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = parkingcharges0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        boolean boolean7 = parkingcharges0.getFocusableWindowState();
        parkingcharges0.enableInputMethods(false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.Dimension dimension1 = null;
        parkingcharges0.setPreferredSize(dimension1);
        parkingcharges0.doLayout();
        boolean boolean5 = parkingcharges0.areFocusTraversalKeysSet((int) (short) 1);
        java.awt.Dimension dimension6 = parkingcharges0.getPreferredSize();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dimension6);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.Rectangle rectangle1 = parkingcharges0.getBounds();
        org.junit.Assert.assertNotNull(rectangle1);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.Dimension dimension1 = null;
        parkingcharges0.setPreferredSize(dimension1);
        parkingcharges0.resize(7, 0);
        boolean boolean6 = parkingcharges0.isEnabled();
        parkingcharges0.setAlwaysOnTop(false);
        parkingcharges0.show(true);
        park.Parkingcharges parkingcharges11 = new park.Parkingcharges();
        parkingcharges11.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.util.Locale locale16 = null;
        parkingcharges11.setLocale(locale16);
        java.awt.ComponentOrientation componentOrientation18 = parkingcharges11.getComponentOrientation();
        parkingcharges0.setComponentOrientation(componentOrientation18);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(componentOrientation18);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setLocationByPlatform(false);
        parkingcharges0.firePropertyChange("Parking Booking", (short) (byte) -1, (short) (byte) 1);
        park.Parkingcharges parkingcharges7 = new park.Parkingcharges();
        parkingcharges7.setFocusable(false);
        java.awt.Event event10 = null;
        boolean boolean13 = parkingcharges7.mouseDrag(event10, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle14 = parkingcharges7.getBounds();
        java.awt.Dimension dimension15 = parkingcharges7.getPreferredSize();
        java.util.List<java.awt.Image> imageList16 = parkingcharges7.getIconImages();
        parkingcharges0.setIconImages(imageList16);
        java.awt.event.InputMethodListener inputMethodListener18 = null;
        parkingcharges0.removeInputMethodListener(inputMethodListener18);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(rectangle14);
        org.junit.Assert.assertNotNull(dimension15);
        org.junit.Assert.assertNotNull(imageList16);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingcharges0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingcharges0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        parkingcharges0.addMouseListener(mouseListener5);
        java.awt.Component component7 = parkingcharges0.getMostRecentFocusOwner();
        java.awt.MenuBar menuBar8 = null;
        parkingcharges0.setMenuBar(menuBar8);
        java.awt.event.ContainerListener containerListener10 = null;
        parkingcharges0.addContainerListener(containerListener10);
        parkingcharges0.transferFocusUpCycle();
        java.awt.Container container13 = parkingcharges0.getContentPane();
        park.Parkingcharges parkingcharges14 = new park.Parkingcharges();
        parkingcharges14.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str19 = parkingcharges14.getTitle();
        java.awt.event.FocusListener[] focusListenerArray20 = parkingcharges14.getFocusListeners();
        java.awt.event.HierarchyListener hierarchyListener21 = null;
        parkingcharges14.addHierarchyListener(hierarchyListener21);
        parkingcharges14.setBounds(250, 10, 9, 250);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component28 = container13.add((java.awt.Component) parkingcharges14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertNotNull(container13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Parking Booking" + "'", str19, "Parking Booking");
        org.junit.Assert.assertNotNull(focusListenerArray20);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.Dimension dimension1 = null;
        parkingcharges0.setPreferredSize(dimension1);
        parkingcharges0.resize(7, 0);
        boolean boolean6 = parkingcharges0.isEnabled();
        java.awt.Event event7 = null;
        boolean boolean9 = parkingcharges0.lostFocus(event7, (java.lang.Object) (short) 0);
        boolean boolean10 = parkingcharges0.isFocusableWindow();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingcharges0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingcharges0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        parkingcharges0.addMouseListener(mouseListener5);
        java.awt.LayoutManager layoutManager7 = parkingcharges0.getLayout();
        parkingcharges0.move(11, 6);
        java.awt.dnd.DropTarget dropTarget11 = null;
        parkingcharges0.setDropTarget(dropTarget11);
        boolean boolean13 = parkingcharges0.getIgnoreRepaint();
        park.Parkingcharges parkingcharges14 = new park.Parkingcharges();
        java.awt.Dimension dimension15 = null;
        parkingcharges14.setPreferredSize(dimension15);
        parkingcharges14.doLayout();
        java.awt.Window.Type type18 = parkingcharges14.getType();
        // The following exception was thrown during execution in test generation
        try {
            parkingcharges0.setType(type18);
            org.junit.Assert.fail("Expected exception of type java.awt.IllegalComponentStateException; message: The window is displayable.");
        } catch (java.awt.IllegalComponentStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(layoutManager7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + type18 + "' != '" + java.awt.Window.Type.NORMAL + "'", type18.equals(java.awt.Window.Type.NORMAL));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setLocationByPlatform(false);
        java.awt.Image image3 = null;
        parkingcharges0.setIconImage(image3);
        javax.swing.JMenuBar jMenuBar5 = null;
        parkingcharges0.setJMenuBar(jMenuBar5);
        java.awt.Insets insets7 = parkingcharges0.getInsets();
        boolean boolean8 = parkingcharges0.isVisible();
        java.awt.event.WindowFocusListener windowFocusListener9 = null;
        parkingcharges0.removeWindowFocusListener(windowFocusListener9);
        org.junit.Assert.assertNotNull(insets7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingcharges0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingcharges0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        parkingcharges0.addMouseListener(mouseListener5);
        java.awt.Component component7 = parkingcharges0.getMostRecentFocusOwner();
        java.awt.MenuBar menuBar8 = null;
        parkingcharges0.setMenuBar(menuBar8);
        java.awt.event.ContainerListener containerListener10 = null;
        parkingcharges0.addContainerListener(containerListener10);
        int int12 = parkingcharges0.getState();
        java.io.PrintStream printStream13 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingcharges0.list(printStream13, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintStream.print(String)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setLocationByPlatform(false);
        java.awt.Image image3 = null;
        parkingcharges0.setIconImage(image3);
        javax.swing.JMenuBar jMenuBar5 = null;
        parkingcharges0.setJMenuBar(jMenuBar5);
        java.awt.Insets insets7 = parkingcharges0.getInsets();
        java.awt.Component component8 = parkingcharges0.getFocusOwner();
        org.junit.Assert.assertNotNull(insets7);
        org.junit.Assert.assertNull(component8);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.Dimension dimension1 = null;
        parkingcharges0.setPreferredSize(dimension1);
        parkingcharges0.doLayout();
        boolean boolean5 = parkingcharges0.areFocusTraversalKeysSet((int) (short) 1);
        javax.swing.JRootPane jRootPane6 = parkingcharges0.getRootPane();
        java.io.PrintStream printStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingcharges0.list(printStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintStream.println(Object)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jRootPane6);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingcharges0.addMouseWheelListener(mouseWheelListener1);
        parkingcharges0.setFocusable(true);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setLocationByPlatform(false);
        java.awt.Image image3 = null;
        parkingcharges0.setIconImage(image3);
        javax.swing.JMenuBar jMenuBar5 = null;
        parkingcharges0.setJMenuBar(jMenuBar5);
        java.awt.Insets insets7 = parkingcharges0.getInsets();
        boolean boolean8 = parkingcharges0.isVisible();
        boolean boolean9 = parkingcharges0.isFocused();
        org.junit.Assert.assertNotNull(insets7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setLocationByPlatform(false);
        java.awt.Image image3 = null;
        parkingcharges0.setIconImage(image3);
        javax.swing.JMenuBar jMenuBar5 = null;
        parkingcharges0.setJMenuBar(jMenuBar5);
        java.awt.event.FocusListener focusListener7 = null;
        parkingcharges0.addFocusListener(focusListener7);
        java.awt.Event event9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = parkingcharges0.postEvent(event9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"id\" because \"evt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.Dimension dimension1 = null;
        parkingcharges0.setPreferredSize(dimension1);
        parkingcharges0.resize(7, 0);
        boolean boolean6 = parkingcharges0.isEnabled();
        parkingcharges0.setAlwaysOnTop(false);
        boolean boolean9 = parkingcharges0.isShowing();
        java.awt.Event event10 = null;
        boolean boolean12 = parkingcharges0.keyUp(event10, (int) (byte) -1);
        int int13 = parkingcharges0.getWidth();
        boolean boolean14 = parkingcharges0.isFocusOwner();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 136 + "'", int13 == 136);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingcharges0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingcharges0.getMousePosition(true);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray5 = parkingcharges0.getPropertyChangeListeners();
        javax.swing.JMenuBar jMenuBar6 = null;
        parkingcharges0.setJMenuBar(jMenuBar6);
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray5);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = parkingcharges0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        parkingcharges0.disable();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.awt.Color color5 = parkingcharges0.getForeground();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component7 = parkingcharges0.getComponent(250);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: No such child: 250");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(color5);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setLocationByPlatform(false);
        parkingcharges0.setVisible(true);
        java.awt.Container container5 = parkingcharges0.getFocusCycleRootAncestor();
        float float6 = parkingcharges0.getAlignmentX();
        org.junit.Assert.assertNull(container5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.5f + "'", float6 == 0.5f);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.lang.String str1 = parkingcharges0.getTitle();
        java.awt.Cursor cursor2 = null;
        parkingcharges0.setCursor(cursor2);
        java.awt.event.WindowListener windowListener4 = null;
        parkingcharges0.addWindowListener(windowListener4);
        parkingcharges0.firePropertyChange("Parking Booking", (long) '#', (long) (byte) 0);
        park.Parkingcharges parkingcharges10 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener11 = null;
        parkingcharges10.addMouseWheelListener(mouseWheelListener11);
        java.awt.Point point14 = parkingcharges10.getMousePosition(true);
        java.awt.event.MouseListener mouseListener15 = null;
        parkingcharges10.addMouseListener(mouseListener15);
        java.awt.Component component17 = parkingcharges10.getMostRecentFocusOwner();
        javax.swing.JMenuBar jMenuBar18 = parkingcharges10.getJMenuBar();
        int int19 = parkingcharges0.getComponentZOrder((java.awt.Component) parkingcharges10);
        java.awt.Event event20 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingcharges0.deliverEvent(event20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"x\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Parking Booking" + "'", str1, "Parking Booking");
        org.junit.Assert.assertNull(point14);
        org.junit.Assert.assertNotNull(component17);
        org.junit.Assert.assertNull(jMenuBar18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setLocationByPlatform(false);
        java.awt.Image image3 = null;
        parkingcharges0.setIconImage(image3);
        javax.swing.JMenuBar jMenuBar5 = null;
        parkingcharges0.setJMenuBar(jMenuBar5);
        java.awt.event.FocusListener focusListener7 = null;
        parkingcharges0.addFocusListener(focusListener7);
        java.awt.Component component9 = parkingcharges0.getFocusOwner();
        park.Parkingcharges parkingcharges10 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener11 = null;
        parkingcharges10.addMouseWheelListener(mouseWheelListener11);
        java.awt.Point point14 = parkingcharges10.getMousePosition(true);
        java.awt.event.MouseListener mouseListener15 = null;
        parkingcharges10.addMouseListener(mouseListener15);
        java.awt.Component component17 = parkingcharges10.getMostRecentFocusOwner();
        java.awt.MenuBar menuBar18 = null;
        parkingcharges10.setMenuBar(menuBar18);
        park.Parkingcharges parkingcharges20 = new park.Parkingcharges();
        java.lang.String str21 = parkingcharges20.getTitle();
        java.awt.Cursor cursor22 = null;
        parkingcharges20.setCursor(cursor22);
        java.awt.Dimension dimension24 = parkingcharges20.size();
        parkingcharges10.setPreferredSize(dimension24);
        parkingcharges0.setSize(dimension24);
        int int27 = parkingcharges0.getCursorType();
        org.junit.Assert.assertNull(component9);
        org.junit.Assert.assertNull(point14);
        org.junit.Assert.assertNotNull(component17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Parking Booking" + "'", str21, "Parking Booking");
        org.junit.Assert.assertNotNull(dimension24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.util.Locale locale5 = null;
        parkingcharges0.setLocale(locale5);
        java.awt.LayoutManager layoutManager7 = parkingcharges0.getLayout();
        park.Parkingcharges parkingcharges8 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener9 = null;
        parkingcharges8.addMouseWheelListener(mouseWheelListener9);
        java.awt.Point point12 = parkingcharges8.getMousePosition(true);
        java.awt.event.MouseListener mouseListener13 = null;
        parkingcharges8.addMouseListener(mouseListener13);
        park.Parkingcharges parkingcharges15 = new park.Parkingcharges();
        parkingcharges15.setFocusable(false);
        java.awt.Event event18 = null;
        boolean boolean21 = parkingcharges15.mouseDrag(event18, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle22 = parkingcharges15.getBounds();
        java.awt.Rectangle rectangle23 = parkingcharges8.getBounds(rectangle22);
        parkingcharges0.setMixingCutoutShape((java.awt.Shape) rectangle23);
        org.junit.Assert.assertNotNull(layoutManager7);
        org.junit.Assert.assertNull(point12);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(rectangle22);
        org.junit.Assert.assertNotNull(rectangle23);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setLocationByPlatform(false);
        java.awt.Image image3 = null;
        parkingcharges0.setIconImage(image3);
        javax.swing.JMenuBar jMenuBar5 = null;
        parkingcharges0.setJMenuBar(jMenuBar5);
        java.awt.FocusTraversalPolicy focusTraversalPolicy7 = null;
        parkingcharges0.setFocusTraversalPolicy(focusTraversalPolicy7);
        park.Parkingcharges parkingcharges9 = new park.Parkingcharges();
        java.awt.Dimension dimension10 = null;
        parkingcharges9.setPreferredSize(dimension10);
        parkingcharges9.resize(7, 0);
        boolean boolean15 = parkingcharges9.isEnabled();
        java.awt.Event event16 = null;
        boolean boolean18 = parkingcharges9.lostFocus(event16, (java.lang.Object) (short) 0);
        java.awt.Font font19 = parkingcharges9.getFont();
        java.awt.FontMetrics fontMetrics20 = parkingcharges0.getFontMetrics(font19);
        java.awt.Cursor cursor21 = null;
        parkingcharges0.setCursor(cursor21);
        parkingcharges0.show(true);
        java.io.PrintStream printStream25 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingcharges0.list(printStream25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintStream.println(Object)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertNotNull(fontMetrics20);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setFocusable(false);
        java.awt.event.MouseMotionListener[] mouseMotionListenerArray3 = parkingcharges0.getMouseMotionListeners();
        java.awt.Window[] windowArray4 = parkingcharges0.getOwnedWindows();
        parkingcharges0.firePropertyChange("", (long) 32, (long) 4);
        org.junit.Assert.assertNotNull(mouseMotionListenerArray3);
        org.junit.Assert.assertNotNull(windowArray4);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingcharges0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingcharges0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        parkingcharges0.addMouseListener(mouseListener5);
        java.awt.LayoutManager layoutManager7 = parkingcharges0.getLayout();
        parkingcharges0.move(11, 6);
        java.awt.event.ContainerListener[] containerListenerArray11 = parkingcharges0.getContainerListeners();
        // The following exception was thrown during execution in test generation
        try {
            parkingcharges0.applyResourceBundle("");
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Can't find bundle for base name , locale en_CA");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(layoutManager7);
        org.junit.Assert.assertNotNull(containerListenerArray11);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.lang.String str1 = parkingcharges0.getTitle();
        java.awt.Cursor cursor2 = null;
        parkingcharges0.setCursor(cursor2);
        java.awt.event.WindowListener windowListener4 = null;
        parkingcharges0.addWindowListener(windowListener4);
        parkingcharges0.firePropertyChange("Parking Booking", (long) '#', (long) (byte) 0);
        park.Parkingcharges parkingcharges10 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener11 = null;
        parkingcharges10.addMouseWheelListener(mouseWheelListener11);
        java.awt.Point point14 = parkingcharges10.getMousePosition(true);
        java.awt.event.MouseListener mouseListener15 = null;
        parkingcharges10.addMouseListener(mouseListener15);
        java.awt.Component component17 = parkingcharges10.getMostRecentFocusOwner();
        int int18 = parkingcharges0.getComponentZOrder(component17);
        boolean boolean19 = parkingcharges0.isLightweight();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Parking Booking" + "'", str1, "Parking Booking");
        org.junit.Assert.assertNull(point14);
        org.junit.Assert.assertNotNull(component17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.Dimension dimension1 = null;
        parkingcharges0.setPreferredSize(dimension1);
        parkingcharges0.resize(7, 0);
        boolean boolean6 = parkingcharges0.isEnabled();
        parkingcharges0.setAlwaysOnTop(false);
        javax.accessibility.AccessibleContext accessibleContext9 = parkingcharges0.getAccessibleContext();
        java.awt.Event event10 = null;
        boolean boolean13 = parkingcharges0.mouseEnter(event10, (int) (byte) 1, 1);
        java.awt.image.ColorModel colorModel14 = parkingcharges0.getColorModel();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(accessibleContext9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(colorModel14);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setLocationByPlatform(false);
        parkingcharges0.validate();
        parkingcharges0.reshape(7, 1, 6, 1);
        java.awt.Event event9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = parkingcharges0.postEvent(event9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"id\" because \"evt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.lang.String str1 = parkingcharges0.getTitle();
        java.awt.Cursor cursor2 = null;
        parkingcharges0.setCursor(cursor2);
        java.awt.event.WindowListener windowListener4 = null;
        parkingcharges0.addWindowListener(windowListener4);
        park.Parkingcharges parkingcharges6 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener7 = null;
        parkingcharges6.addMouseWheelListener(mouseWheelListener7);
        java.awt.Point point10 = parkingcharges6.getMousePosition(true);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray11 = parkingcharges6.getPropertyChangeListeners();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener12 = null;
        parkingcharges6.removeHierarchyBoundsListener(hierarchyBoundsListener12);
        java.awt.Image image16 = parkingcharges6.createImage(6, (int) (short) 100);
        park.Parkingcharges parkingcharges17 = new park.Parkingcharges();
        java.awt.Dimension dimension18 = null;
        parkingcharges17.setPreferredSize(dimension18);
        parkingcharges17.doLayout();
        parkingcharges17.removeAll();
        int int22 = parkingcharges0.checkImage(image16, (java.awt.image.ImageObserver) parkingcharges17);
        java.awt.event.WindowListener windowListener23 = null;
        parkingcharges17.removeWindowListener(windowListener23);
        int int25 = parkingcharges17.getHeight();
        parkingcharges17.toFront();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Parking Booking" + "'", str1, "Parking Booking");
        org.junit.Assert.assertNull(point10);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray11);
        org.junit.Assert.assertNotNull(image16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 250 + "'", int25 == 250);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setLocationByPlatform(false);
        parkingcharges0.setVisible(true);
        java.awt.event.KeyListener keyListener5 = null;
        parkingcharges0.addKeyListener(keyListener5);
        park.Parkingcharges parkingcharges7 = new park.Parkingcharges();
        parkingcharges7.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.awt.Color color12 = parkingcharges7.getForeground();
        java.awt.Point point13 = parkingcharges7.getMousePosition();
        java.awt.MenuComponent menuComponent14 = null;
        parkingcharges7.remove(menuComponent14);
        // The following exception was thrown during execution in test generation
        try {
            parkingcharges0.setComponentZOrder((java.awt.Component) parkingcharges7, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNull(point13);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setLocationByPlatform(false);
        parkingcharges0.setVisible(true);
        java.awt.Container container5 = parkingcharges0.getFocusCycleRootAncestor();
        parkingcharges0.dispose();
        java.awt.Rectangle rectangle7 = parkingcharges0.getMaximizedBounds();
        java.awt.event.MouseListener mouseListener8 = null;
        parkingcharges0.addMouseListener(mouseListener8);
        org.junit.Assert.assertNull(container5);
        org.junit.Assert.assertNull(rectangle7);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setLocationByPlatform(false);
        java.awt.Image image3 = null;
        parkingcharges0.setIconImage(image3);
        javax.swing.JMenuBar jMenuBar5 = null;
        parkingcharges0.setJMenuBar(jMenuBar5);
        java.awt.FocusTraversalPolicy focusTraversalPolicy7 = null;
        parkingcharges0.setFocusTraversalPolicy(focusTraversalPolicy7);
        park.Parkingcharges parkingcharges9 = new park.Parkingcharges();
        java.awt.Dimension dimension10 = null;
        parkingcharges9.setPreferredSize(dimension10);
        parkingcharges9.resize(7, 0);
        boolean boolean15 = parkingcharges9.isEnabled();
        java.awt.Event event16 = null;
        boolean boolean18 = parkingcharges9.lostFocus(event16, (java.lang.Object) (short) 0);
        java.awt.Font font19 = parkingcharges9.getFont();
        java.awt.FontMetrics fontMetrics20 = parkingcharges0.getFontMetrics(font19);
        java.awt.Graphics graphics21 = parkingcharges0.getGraphics();
        java.awt.Event event22 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = parkingcharges0.postEvent(event22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"id\" because \"evt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertNotNull(fontMetrics20);
        org.junit.Assert.assertNotNull(graphics21);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingcharges0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingcharges0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        parkingcharges0.addMouseListener(mouseListener5);
        java.awt.Component component7 = parkingcharges0.getMostRecentFocusOwner();
        java.awt.MenuBar menuBar8 = null;
        parkingcharges0.setMenuBar(menuBar8);
        park.Parkingcharges parkingcharges10 = new park.Parkingcharges();
        java.lang.String str11 = parkingcharges10.getTitle();
        java.awt.Cursor cursor12 = null;
        parkingcharges10.setCursor(cursor12);
        java.awt.Dimension dimension14 = parkingcharges10.size();
        parkingcharges0.setPreferredSize(dimension14);
        java.awt.Insets insets16 = parkingcharges0.getInsets();
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking Booking" + "'", str11, "Parking Booking");
        org.junit.Assert.assertNotNull(dimension14);
        org.junit.Assert.assertNotNull(insets16);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setLocationByPlatform(false);
        java.awt.Image image3 = null;
        parkingcharges0.setIconImage(image3);
        javax.swing.JMenuBar jMenuBar5 = null;
        parkingcharges0.setJMenuBar(jMenuBar5);
        java.awt.Insets insets7 = parkingcharges0.getInsets();
        boolean boolean8 = parkingcharges0.isVisible();
        park.Parkingcharges parkingcharges10 = new park.Parkingcharges();
        parkingcharges10.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.awt.Color color15 = parkingcharges10.getForeground();
        java.awt.Point point16 = parkingcharges10.getMousePosition();
        java.awt.MenuComponent menuComponent17 = null;
        parkingcharges10.remove(menuComponent17);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component19 = parkingcharges0.add("park.Parkingcharges[frame0,710,391,500x250,layout=java.awt.BorderLayout,title=Parking Booking,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,8,31,484x211,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", (java.awt.Component) parkingcharges10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(insets7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNull(point16);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setFocusable(false);
        java.awt.Component component3 = parkingcharges0.getGlassPane();
        component3.enable(true);
        org.junit.Assert.assertNotNull(component3);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = parkingcharges0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        parkingcharges0.transferFocusBackward();
        java.awt.Event event8 = null;
        boolean boolean11 = parkingcharges0.mouseDown(event8, (int) (short) 10, (int) (byte) 100);
        java.awt.Image image12 = null;
        parkingcharges0.setIconImage(image12);
        park.Parkingcharges parkingcharges14 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener15 = null;
        parkingcharges14.addMouseWheelListener(mouseWheelListener15);
        java.awt.Point point18 = parkingcharges14.getMousePosition(true);
        java.awt.event.MouseListener mouseListener19 = null;
        parkingcharges14.addMouseListener(mouseListener19);
        java.awt.Component component21 = parkingcharges14.getMostRecentFocusOwner();
        java.awt.MenuBar menuBar22 = null;
        parkingcharges14.setMenuBar(menuBar22);
        park.Parkingcharges parkingcharges24 = new park.Parkingcharges();
        java.lang.String str25 = parkingcharges24.getTitle();
        java.awt.Cursor cursor26 = null;
        parkingcharges24.setCursor(cursor26);
        java.awt.Dimension dimension28 = parkingcharges24.size();
        parkingcharges14.setPreferredSize(dimension28);
        parkingcharges0.setMaximumSize(dimension28);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(point18);
        org.junit.Assert.assertNotNull(component21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Parking Booking" + "'", str25, "Parking Booking");
        org.junit.Assert.assertNotNull(dimension28);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setLocationByPlatform(false);
        java.awt.Image image3 = null;
        parkingcharges0.setIconImage(image3);
        javax.swing.JMenuBar jMenuBar5 = null;
        parkingcharges0.setJMenuBar(jMenuBar5);
        java.awt.event.FocusListener focusListener7 = null;
        parkingcharges0.addFocusListener(focusListener7);
        java.awt.Component component9 = parkingcharges0.getFocusOwner();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        parkingcharges0.addPropertyChangeListener("", propertyChangeListener11);
        java.awt.Event event13 = null;
        park.Parkingcharges parkingcharges14 = new park.Parkingcharges();
        parkingcharges14.setFocusable(false);
        java.awt.Event event17 = null;
        boolean boolean20 = parkingcharges14.mouseDrag(event17, (int) (byte) 1, (int) (short) 1);
        parkingcharges14.transferFocusBackward();
        java.awt.event.FocusListener[] focusListenerArray22 = parkingcharges14.getFocusListeners();
        boolean boolean23 = parkingcharges0.action(event13, (java.lang.Object) parkingcharges14);
        org.junit.Assert.assertNull(component9);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(focusListenerArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.Dimension dimension1 = null;
        parkingcharges0.setPreferredSize(dimension1);
        parkingcharges0.resize(7, 0);
        boolean boolean6 = parkingcharges0.isEnabled();
        java.awt.Event event7 = null;
        boolean boolean9 = parkingcharges0.lostFocus(event7, (java.lang.Object) (short) 0);
        parkingcharges0.setFocusable(false);
        boolean boolean12 = parkingcharges0.isFocusTraversalPolicyProvider();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingcharges0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingcharges0.getMousePosition(true);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray5 = parkingcharges0.getPropertyChangeListeners();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener6 = null;
        parkingcharges0.removeHierarchyBoundsListener(hierarchyBoundsListener6);
        parkingcharges0.removeAll();
        java.awt.Component component9 = parkingcharges0.getGlassPane();
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray5);
        org.junit.Assert.assertNotNull(component9);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = parkingcharges0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle7 = parkingcharges0.getBounds();
        java.awt.Component component10 = parkingcharges0.getComponentAt(7, 6);
        java.awt.event.MouseListener mouseListener11 = null;
        parkingcharges0.addMouseListener(mouseListener11);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(rectangle7);
        org.junit.Assert.assertNotNull(component10);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str5 = parkingcharges0.getTitle();
        java.awt.event.FocusListener[] focusListenerArray6 = parkingcharges0.getFocusListeners();
        java.awt.event.HierarchyListener hierarchyListener7 = null;
        parkingcharges0.addHierarchyListener(hierarchyListener7);
        java.awt.Event event9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = parkingcharges0.postEvent(event9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"id\" because \"evt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Parking Booking" + "'", str5, "Parking Booking");
        org.junit.Assert.assertNotNull(focusListenerArray6);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingcharges0.addMouseWheelListener(mouseWheelListener1);
        java.awt.event.MouseMotionListener mouseMotionListener3 = null;
        parkingcharges0.removeMouseMotionListener(mouseMotionListener3);
        java.awt.Event event5 = null;
        boolean boolean8 = parkingcharges0.mouseUp(event5, (int) (short) 0, (int) (short) -1);
        javax.swing.TransferHandler transferHandler9 = null;
        parkingcharges0.setTransferHandler(transferHandler9);
        int int11 = parkingcharges0.countComponents();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingcharges0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingcharges0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        parkingcharges0.addMouseListener(mouseListener5);
        park.Parkingcharges parkingcharges7 = new park.Parkingcharges();
        parkingcharges7.setFocusable(false);
        java.awt.Event event10 = null;
        boolean boolean13 = parkingcharges7.mouseDrag(event10, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle14 = parkingcharges7.getBounds();
        java.awt.Rectangle rectangle15 = parkingcharges0.getBounds(rectangle14);
        park.Parkingcharges parkingcharges16 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener17 = null;
        parkingcharges16.addMouseWheelListener(mouseWheelListener17);
        java.awt.Point point20 = parkingcharges16.getMousePosition(true);
        java.awt.event.MouseListener mouseListener21 = null;
        parkingcharges16.addMouseListener(mouseListener21);
        java.awt.Component component23 = parkingcharges16.getMostRecentFocusOwner();
        java.awt.MenuBar menuBar24 = null;
        parkingcharges16.setMenuBar(menuBar24);
        park.Parkingcharges parkingcharges26 = new park.Parkingcharges();
        java.lang.String str27 = parkingcharges26.getTitle();
        java.awt.Cursor cursor28 = null;
        parkingcharges26.setCursor(cursor28);
        java.awt.Dimension dimension30 = parkingcharges26.size();
        parkingcharges16.setSize(dimension30);
        parkingcharges0.setPreferredSize(dimension30);
        boolean boolean33 = parkingcharges0.isAlwaysOnTop();
        java.awt.Event event34 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean35 = parkingcharges0.postEvent(event34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"id\" because \"evt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(rectangle14);
        org.junit.Assert.assertNotNull(rectangle15);
        org.junit.Assert.assertNull(point20);
        org.junit.Assert.assertNotNull(component23);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Parking Booking" + "'", str27, "Parking Booking");
        org.junit.Assert.assertNotNull(dimension30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.Dimension dimension1 = null;
        parkingcharges0.setPreferredSize(dimension1);
        parkingcharges0.doLayout();
        java.awt.Event event4 = null;
        park.Parkingcharges parkingcharges5 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener6 = null;
        parkingcharges5.addMouseWheelListener(mouseWheelListener6);
        java.awt.Point point9 = parkingcharges5.getMousePosition(true);
        java.awt.event.MouseListener mouseListener10 = null;
        parkingcharges5.addMouseListener(mouseListener10);
        java.awt.Component component12 = parkingcharges5.getMostRecentFocusOwner();
        boolean boolean13 = parkingcharges0.lostFocus(event4, (java.lang.Object) parkingcharges5);
        java.awt.dnd.DropTarget dropTarget14 = null;
        parkingcharges0.setDropTarget(dropTarget14);
        org.junit.Assert.assertNull(point9);
        org.junit.Assert.assertNotNull(component12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.Dimension dimension1 = null;
        parkingcharges0.setPreferredSize(dimension1);
        parkingcharges0.resize(7, 0);
        boolean boolean6 = parkingcharges0.isEnabled();
        java.awt.Event event7 = null;
        boolean boolean9 = parkingcharges0.lostFocus(event7, (java.lang.Object) (short) 0);
        java.awt.Cursor cursor10 = parkingcharges0.getCursor();
        java.io.PrintStream printStream11 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingcharges0.list(printStream11, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintStream.print(String)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cursor10);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.Dimension dimension1 = null;
        parkingcharges0.setPreferredSize(dimension1);
        parkingcharges0.doLayout();
        java.awt.Event event4 = null;
        park.Parkingcharges parkingcharges5 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener6 = null;
        parkingcharges5.addMouseWheelListener(mouseWheelListener6);
        java.awt.Point point9 = parkingcharges5.getMousePosition(true);
        java.awt.event.MouseListener mouseListener10 = null;
        parkingcharges5.addMouseListener(mouseListener10);
        java.awt.Component component12 = parkingcharges5.getMostRecentFocusOwner();
        boolean boolean13 = parkingcharges0.lostFocus(event4, (java.lang.Object) parkingcharges5);
        java.awt.event.ContainerListener containerListener14 = null;
        parkingcharges5.addContainerListener(containerListener14);
        org.junit.Assert.assertNull(point9);
        org.junit.Assert.assertNotNull(component12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingcharges0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingcharges0.getMousePosition(true);
        boolean boolean5 = parkingcharges0.isAlwaysOnTopSupported();
        int int6 = parkingcharges0.getExtendedState();
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str5 = parkingcharges0.getTitle();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior6 = parkingcharges0.getBaselineResizeBehavior();
        java.awt.event.WindowListener windowListener7 = null;
        parkingcharges0.addWindowListener(windowListener7);
        parkingcharges0.transferFocusUpCycle();
        java.awt.Event event10 = null;
        boolean boolean12 = parkingcharges0.keyUp(event10, (int) (short) 1);
        java.awt.Color color13 = parkingcharges0.getForeground();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Parking Booking" + "'", str5, "Parking Booking");
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior6 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior6.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(color13);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.lang.String str1 = parkingcharges0.getTitle();
        java.awt.Cursor cursor2 = null;
        parkingcharges0.setCursor(cursor2);
        java.awt.event.WindowListener windowListener4 = null;
        parkingcharges0.addWindowListener(windowListener4);
        park.Parkingcharges parkingcharges6 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener7 = null;
        parkingcharges6.addMouseWheelListener(mouseWheelListener7);
        java.awt.Point point10 = parkingcharges6.getMousePosition(true);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray11 = parkingcharges6.getPropertyChangeListeners();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener12 = null;
        parkingcharges6.removeHierarchyBoundsListener(hierarchyBoundsListener12);
        java.awt.Image image16 = parkingcharges6.createImage(6, (int) (short) 100);
        park.Parkingcharges parkingcharges17 = new park.Parkingcharges();
        java.awt.Dimension dimension18 = null;
        parkingcharges17.setPreferredSize(dimension18);
        parkingcharges17.doLayout();
        parkingcharges17.removeAll();
        int int22 = parkingcharges0.checkImage(image16, (java.awt.image.ImageObserver) parkingcharges17);
        parkingcharges0.removeNotify();
        java.awt.event.WindowStateListener windowStateListener24 = null;
        parkingcharges0.addWindowStateListener(windowStateListener24);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Parking Booking" + "'", str1, "Parking Booking");
        org.junit.Assert.assertNull(point10);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray11);
        org.junit.Assert.assertNotNull(image16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.util.Locale locale5 = null;
        parkingcharges0.setLocale(locale5);
        java.awt.event.InputMethodListener inputMethodListener7 = null;
        parkingcharges0.removeInputMethodListener(inputMethodListener7);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.VolatileImage volatileImage11 = parkingcharges0.createVolatileImage(0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Width (0) and height (4) cannot be <= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingcharges0.addMouseWheelListener(mouseWheelListener1);
        java.awt.event.MouseMotionListener mouseMotionListener3 = null;
        parkingcharges0.removeMouseMotionListener(mouseMotionListener3);
        java.awt.Event event5 = null;
        boolean boolean8 = parkingcharges0.mouseUp(event5, (int) (short) 0, (int) (short) -1);
        java.awt.Component component11 = parkingcharges0.locate(5, (int) ' ');
        java.io.PrintWriter printWriter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingcharges0.list(printWriter12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(Object)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(component11);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setLocationByPlatform(false);
        java.awt.im.InputMethodRequests inputMethodRequests3 = parkingcharges0.getInputMethodRequests();
        org.junit.Assert.assertNull(inputMethodRequests3);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = parkingcharges0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        parkingcharges0.transferFocusBackward();
        park.Parkingcharges parkingcharges8 = new park.Parkingcharges();
        java.awt.Dimension dimension9 = null;
        parkingcharges8.setPreferredSize(dimension9);
        parkingcharges8.resize(7, 0);
        boolean boolean14 = parkingcharges8.isEnabled();
        parkingcharges8.setAlwaysOnTop(false);
        boolean boolean17 = parkingcharges8.isShowing();
        java.awt.Point point18 = null;
        java.awt.Point point19 = parkingcharges8.getLocation(point18);
        java.awt.Component component20 = parkingcharges0.findComponentAt(point19);
        boolean boolean21 = parkingcharges0.isOpaque();
        parkingcharges0.hide();
        java.awt.Event event23 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingcharges0.deliverEvent(event23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"x\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(point19);
        org.junit.Assert.assertNull(component20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.lang.String str1 = parkingcharges0.getTitle();
        java.awt.Cursor cursor2 = null;
        parkingcharges0.setCursor(cursor2);
        java.awt.event.WindowListener windowListener4 = null;
        parkingcharges0.addWindowListener(windowListener4);
        java.awt.Event event6 = null;
        park.Parkingcharges parkingcharges7 = new park.Parkingcharges();
        parkingcharges7.setLocationByPlatform(false);
        java.awt.Image image10 = null;
        parkingcharges7.setIconImage(image10);
        park.Parkingcharges parkingcharges12 = new park.Parkingcharges();
        parkingcharges12.setFocusable(false);
        java.awt.Event event15 = null;
        boolean boolean18 = parkingcharges12.mouseDrag(event15, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle19 = parkingcharges12.getBounds();
        parkingcharges7.setMixingCutoutShape((java.awt.Shape) rectangle19);
        boolean boolean21 = parkingcharges0.gotFocus(event6, (java.lang.Object) rectangle19);
        boolean boolean22 = parkingcharges0.isValidateRoot();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Parking Booking" + "'", str1, "Parking Booking");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(rectangle19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setLocationByPlatform(false);
        java.awt.Image image3 = null;
        parkingcharges0.setIconImage(image3);
        javax.swing.JMenuBar jMenuBar5 = null;
        parkingcharges0.setJMenuBar(jMenuBar5);
        java.awt.FocusTraversalPolicy focusTraversalPolicy7 = null;
        parkingcharges0.setFocusTraversalPolicy(focusTraversalPolicy7);
        park.Parkingcharges parkingcharges9 = new park.Parkingcharges();
        java.awt.Dimension dimension10 = null;
        parkingcharges9.setPreferredSize(dimension10);
        parkingcharges9.resize(7, 0);
        boolean boolean15 = parkingcharges9.isEnabled();
        java.awt.Event event16 = null;
        boolean boolean18 = parkingcharges9.lostFocus(event16, (java.lang.Object) (short) 0);
        java.awt.Font font19 = parkingcharges9.getFont();
        java.awt.FontMetrics fontMetrics20 = parkingcharges0.getFontMetrics(font19);
        java.awt.Cursor cursor21 = null;
        parkingcharges0.setCursor(cursor21);
        park.Parkingcharges parkingcharges23 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener24 = null;
        parkingcharges23.addMouseWheelListener(mouseWheelListener24);
        java.awt.Point point27 = parkingcharges23.getMousePosition(true);
        java.awt.event.MouseListener mouseListener28 = null;
        parkingcharges23.addMouseListener(mouseListener28);
        park.Parkingcharges parkingcharges30 = new park.Parkingcharges();
        parkingcharges30.setFocusable(false);
        java.awt.Event event33 = null;
        boolean boolean36 = parkingcharges30.mouseDrag(event33, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle37 = parkingcharges30.getBounds();
        java.awt.Rectangle rectangle38 = parkingcharges23.getBounds(rectangle37);
        java.awt.Rectangle rectangle39 = parkingcharges0.getBounds(rectangle38);
        parkingcharges0.setFocusTraversalKeysEnabled(true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertNotNull(fontMetrics20);
        org.junit.Assert.assertNull(point27);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(rectangle37);
        org.junit.Assert.assertNotNull(rectangle38);
        org.junit.Assert.assertNotNull(rectangle39);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = parkingcharges0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle7 = parkingcharges0.getBounds();
        java.awt.Component component10 = parkingcharges0.getComponentAt(7, 6);
        park.Parkingcharges parkingcharges11 = new park.Parkingcharges();
        parkingcharges11.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str16 = parkingcharges11.getTitle();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior17 = parkingcharges11.getBaselineResizeBehavior();
        java.awt.event.WindowListener windowListener18 = null;
        parkingcharges11.addWindowListener(windowListener18);
        java.awt.event.WindowFocusListener windowFocusListener20 = null;
        parkingcharges11.addWindowFocusListener(windowFocusListener20);
        java.awt.Font font22 = parkingcharges11.getFont();
        parkingcharges0.setFont(font22);
        parkingcharges0.repaint(0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(rectangle7);
        org.junit.Assert.assertNotNull(component10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Parking Booking" + "'", str16, "Parking Booking");
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior17 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior17.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(font22);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setLocationByPlatform(false);
        java.awt.Image image3 = null;
        parkingcharges0.setIconImage(image3);
        park.Parkingcharges parkingcharges5 = new park.Parkingcharges();
        parkingcharges5.setFocusable(false);
        java.awt.Event event8 = null;
        boolean boolean11 = parkingcharges5.mouseDrag(event8, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle12 = parkingcharges5.getBounds();
        parkingcharges0.setMixingCutoutShape((java.awt.Shape) rectangle12);
        int int14 = parkingcharges0.getY();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(rectangle12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 391 + "'", int14 == 391);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingcharges0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingcharges0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        parkingcharges0.addMouseListener(mouseListener5);
        java.awt.Component component7 = parkingcharges0.getMostRecentFocusOwner();
        java.awt.MenuBar menuBar8 = null;
        parkingcharges0.setMenuBar(menuBar8);
        java.awt.event.ContainerListener containerListener10 = null;
        parkingcharges0.addContainerListener(containerListener10);
        int int12 = parkingcharges0.getState();
        park.Parkingcharges parkingcharges13 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener14 = null;
        parkingcharges13.addMouseWheelListener(mouseWheelListener14);
        java.awt.Point point17 = parkingcharges13.getMousePosition(true);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray18 = parkingcharges13.getPropertyChangeListeners();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener19 = null;
        parkingcharges13.removeHierarchyBoundsListener(hierarchyBoundsListener19);
        java.awt.Image image23 = parkingcharges13.createImage(6, (int) (short) 100);
        boolean boolean29 = parkingcharges0.imageUpdate(image23, 5, (int) (byte) 1, (int) 'a', 10, 8);
        park.Parkingcharges parkingcharges30 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener31 = null;
        parkingcharges30.addMouseWheelListener(mouseWheelListener31);
        java.awt.Point point34 = parkingcharges30.getMousePosition(true);
        java.awt.event.MouseListener mouseListener35 = null;
        parkingcharges30.addMouseListener(mouseListener35);
        park.Parkingcharges parkingcharges37 = new park.Parkingcharges();
        parkingcharges37.setFocusable(false);
        java.awt.Event event40 = null;
        boolean boolean43 = parkingcharges37.mouseDrag(event40, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle44 = parkingcharges37.getBounds();
        java.awt.Rectangle rectangle45 = parkingcharges30.getBounds(rectangle44);
        parkingcharges0.setMixingCutoutShape((java.awt.Shape) rectangle45);
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(point17);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray18);
        org.junit.Assert.assertNotNull(image23);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(point34);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(rectangle44);
        org.junit.Assert.assertNotNull(rectangle45);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.Dimension dimension1 = null;
        parkingcharges0.setPreferredSize(dimension1);
        parkingcharges0.doLayout();
        java.awt.Window.Type type4 = parkingcharges0.getType();
        parkingcharges0.setLocation(12, 5);
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + java.awt.Window.Type.NORMAL + "'", type4.equals(java.awt.Window.Type.NORMAL));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setFocusable(false);
        java.awt.event.MouseMotionListener[] mouseMotionListenerArray3 = parkingcharges0.getMouseMotionListeners();
        java.awt.Window[] windowArray4 = parkingcharges0.getOwnedWindows();
        parkingcharges0.addNotify();
        org.junit.Assert.assertNotNull(mouseMotionListenerArray3);
        org.junit.Assert.assertNotNull(windowArray4);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.Dimension dimension1 = null;
        parkingcharges0.setPreferredSize(dimension1);
        parkingcharges0.doLayout();
        boolean boolean5 = parkingcharges0.areFocusTraversalKeysSet((int) (short) 1);
        javax.swing.JRootPane jRootPane6 = parkingcharges0.getRootPane();
        java.awt.Component component9 = jRootPane6.findComponentAt((int) (byte) 0, 10);
        boolean boolean10 = component9.isDoubleBuffered();
        park.Parkingcharges parkingcharges11 = new park.Parkingcharges();
        java.awt.Dimension dimension12 = null;
        parkingcharges11.setPreferredSize(dimension12);
        parkingcharges11.doLayout();
        java.awt.event.FocusListener focusListener15 = null;
        parkingcharges11.addFocusListener(focusListener15);
        park.Parkingcharges parkingcharges17 = new park.Parkingcharges();
        java.lang.String str18 = parkingcharges17.getTitle();
        java.awt.Cursor cursor19 = null;
        parkingcharges17.setCursor(cursor19);
        java.awt.event.WindowListener windowListener21 = null;
        parkingcharges17.addWindowListener(windowListener21);
        park.Parkingcharges parkingcharges23 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener24 = null;
        parkingcharges23.addMouseWheelListener(mouseWheelListener24);
        java.awt.Point point27 = parkingcharges23.getMousePosition(true);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray28 = parkingcharges23.getPropertyChangeListeners();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener29 = null;
        parkingcharges23.removeHierarchyBoundsListener(hierarchyBoundsListener29);
        java.awt.Image image33 = parkingcharges23.createImage(6, (int) (short) 100);
        park.Parkingcharges parkingcharges34 = new park.Parkingcharges();
        java.awt.Dimension dimension35 = null;
        parkingcharges34.setPreferredSize(dimension35);
        parkingcharges34.doLayout();
        parkingcharges34.removeAll();
        int int39 = parkingcharges17.checkImage(image33, (java.awt.image.ImageObserver) parkingcharges34);
        parkingcharges11.setIconImage(image33);
        park.Parkingcharges parkingcharges41 = new park.Parkingcharges();
        java.awt.Dimension dimension42 = null;
        parkingcharges41.setPreferredSize(dimension42);
        parkingcharges41.doLayout();
        java.awt.Window.Type type45 = parkingcharges41.getType();
        boolean boolean46 = component9.prepareImage(image33, (java.awt.image.ImageObserver) parkingcharges41);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jRootPane6);
        org.junit.Assert.assertNotNull(component9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Parking Booking" + "'", str18, "Parking Booking");
        org.junit.Assert.assertNull(point27);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray28);
        org.junit.Assert.assertNotNull(image33);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 32 + "'", int39 == 32);
        org.junit.Assert.assertTrue("'" + type45 + "' != '" + java.awt.Window.Type.NORMAL + "'", type45.equals(java.awt.Window.Type.NORMAL));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = parkingcharges0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        boolean boolean7 = parkingcharges0.getFocusableWindowState();
        javax.swing.JLayeredPane jLayeredPane8 = parkingcharges0.getLayeredPane();
        park.Parkingcharges parkingcharges9 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener10 = null;
        parkingcharges9.addMouseWheelListener(mouseWheelListener10);
        java.awt.Point point13 = parkingcharges9.getMousePosition(true);
        java.awt.event.MouseListener mouseListener14 = null;
        parkingcharges9.addMouseListener(mouseListener14);
        park.Parkingcharges parkingcharges16 = new park.Parkingcharges();
        parkingcharges16.setFocusable(false);
        java.awt.Event event19 = null;
        boolean boolean22 = parkingcharges16.mouseDrag(event19, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle23 = parkingcharges16.getBounds();
        java.awt.Rectangle rectangle24 = parkingcharges9.getBounds(rectangle23);
        park.Parkingcharges parkingcharges25 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener26 = null;
        parkingcharges25.addMouseWheelListener(mouseWheelListener26);
        java.awt.Point point29 = parkingcharges25.getMousePosition(true);
        java.awt.event.MouseListener mouseListener30 = null;
        parkingcharges25.addMouseListener(mouseListener30);
        java.awt.Component component32 = parkingcharges25.getMostRecentFocusOwner();
        java.awt.MenuBar menuBar33 = null;
        parkingcharges25.setMenuBar(menuBar33);
        park.Parkingcharges parkingcharges35 = new park.Parkingcharges();
        java.lang.String str36 = parkingcharges35.getTitle();
        java.awt.Cursor cursor37 = null;
        parkingcharges35.setCursor(cursor37);
        java.awt.Dimension dimension39 = parkingcharges35.size();
        parkingcharges25.setSize(dimension39);
        parkingcharges9.setPreferredSize(dimension39);
        boolean boolean42 = parkingcharges9.isAlwaysOnTop();
        park.Parkingcharges parkingcharges43 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener44 = null;
        parkingcharges43.addMouseWheelListener(mouseWheelListener44);
        java.awt.Point point47 = parkingcharges43.getMousePosition(true);
        java.awt.event.MouseListener mouseListener48 = null;
        parkingcharges43.addMouseListener(mouseListener48);
        java.awt.image.ColorModel colorModel50 = parkingcharges43.getColorModel();
        java.awt.Dimension dimension51 = parkingcharges43.size();
        parkingcharges9.setSize(dimension51);
        parkingcharges0.resize(dimension51);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(jLayeredPane8);
        org.junit.Assert.assertNull(point13);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(rectangle23);
        org.junit.Assert.assertNotNull(rectangle24);
        org.junit.Assert.assertNull(point29);
        org.junit.Assert.assertNotNull(component32);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Parking Booking" + "'", str36, "Parking Booking");
        org.junit.Assert.assertNotNull(dimension39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(point47);
        org.junit.Assert.assertNotNull(colorModel50);
        org.junit.Assert.assertNotNull(dimension51);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = parkingcharges0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle7 = parkingcharges0.getBounds();
        java.awt.Component component10 = parkingcharges0.getComponentAt(7, 6);
        park.Parkingcharges parkingcharges11 = new park.Parkingcharges();
        parkingcharges11.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str16 = parkingcharges11.getTitle();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior17 = parkingcharges11.getBaselineResizeBehavior();
        java.awt.event.WindowListener windowListener18 = null;
        parkingcharges11.addWindowListener(windowListener18);
        java.awt.event.WindowFocusListener windowFocusListener20 = null;
        parkingcharges11.addWindowFocusListener(windowFocusListener20);
        java.awt.Font font22 = parkingcharges11.getFont();
        parkingcharges0.setFont(font22);
        parkingcharges0.dispose();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(rectangle7);
        org.junit.Assert.assertNotNull(component10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Parking Booking" + "'", str16, "Parking Booking");
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior17 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior17.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(font22);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setLocationByPlatform(false);
        parkingcharges0.validate();
        parkingcharges0.reshape(7, 1, 6, 1);
        java.awt.Event event9 = null;
        park.Parkingcharges parkingcharges10 = new park.Parkingcharges();
        java.awt.Dimension dimension11 = null;
        parkingcharges10.setPreferredSize(dimension11);
        java.awt.event.ComponentListener componentListener13 = null;
        parkingcharges10.removeComponentListener(componentListener13);
        parkingcharges10.firePropertyChange("Parking Booking", (byte) 10, (byte) 100);
        java.awt.Color color19 = parkingcharges10.getForeground();
        boolean boolean20 = parkingcharges0.gotFocus(event9, (java.lang.Object) color19);
        park.Parkingcharges parkingcharges21 = new park.Parkingcharges();
        java.awt.Dimension dimension22 = null;
        parkingcharges21.setPreferredSize(dimension22);
        parkingcharges21.resize(7, 0);
        boolean boolean27 = parkingcharges21.isEnabled();
        parkingcharges21.setAlwaysOnTop(false);
        boolean boolean30 = parkingcharges21.isShowing();
        java.awt.MenuBar menuBar31 = null;
        parkingcharges21.setMenuBar(menuBar31);
        java.awt.Image image33 = parkingcharges21.getIconImage();
        // The following exception was thrown during execution in test generation
        try {
            parkingcharges0.add((java.awt.Component) parkingcharges21, (java.lang.Object) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(image33);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setLocationByPlatform(false);
        java.awt.Image image3 = null;
        parkingcharges0.setIconImage(image3);
        javax.swing.JMenuBar jMenuBar5 = null;
        parkingcharges0.setJMenuBar(jMenuBar5);
        java.awt.event.FocusListener focusListener7 = null;
        parkingcharges0.addFocusListener(focusListener7);
        java.awt.Component component9 = parkingcharges0.getFocusOwner();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        parkingcharges0.addPropertyChangeListener("", propertyChangeListener11);
        parkingcharges0.repaint();
        org.junit.Assert.assertNull(component9);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str5 = parkingcharges0.getTitle();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior6 = parkingcharges0.getBaselineResizeBehavior();
        java.awt.event.WindowListener[] windowListenerArray7 = parkingcharges0.getWindowListeners();
        boolean boolean8 = parkingcharges0.isBackgroundSet();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Parking Booking" + "'", str5, "Parking Booking");
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior6 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior6.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(windowListenerArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setFocusable(false);
        java.awt.event.MouseMotionListener[] mouseMotionListenerArray3 = parkingcharges0.getMouseMotionListeners();
        java.awt.Window[] windowArray4 = parkingcharges0.getOwnedWindows();
        boolean boolean5 = parkingcharges0.isDoubleBuffered();
        org.junit.Assert.assertNotNull(mouseMotionListenerArray3);
        org.junit.Assert.assertNotNull(windowArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.lang.String str1 = parkingcharges0.getTitle();
        java.awt.Cursor cursor2 = null;
        parkingcharges0.setCursor(cursor2);
        java.awt.event.WindowListener windowListener4 = null;
        parkingcharges0.addWindowListener(windowListener4);
        park.Parkingcharges parkingcharges6 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener7 = null;
        parkingcharges6.addMouseWheelListener(mouseWheelListener7);
        java.awt.Point point10 = parkingcharges6.getMousePosition(true);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray11 = parkingcharges6.getPropertyChangeListeners();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener12 = null;
        parkingcharges6.removeHierarchyBoundsListener(hierarchyBoundsListener12);
        java.awt.Image image16 = parkingcharges6.createImage(6, (int) (short) 100);
        park.Parkingcharges parkingcharges17 = new park.Parkingcharges();
        java.awt.Dimension dimension18 = null;
        parkingcharges17.setPreferredSize(dimension18);
        parkingcharges17.doLayout();
        parkingcharges17.removeAll();
        int int22 = parkingcharges0.checkImage(image16, (java.awt.image.ImageObserver) parkingcharges17);
        parkingcharges0.removeNotify();
        park.Parkingcharges parkingcharges24 = new park.Parkingcharges();
        parkingcharges24.setFocusable(false);
        java.awt.Event event27 = null;
        boolean boolean30 = parkingcharges24.mouseDrag(event27, (int) (byte) 1, (int) (short) 1);
        parkingcharges24.transferFocusBackward();
        java.awt.event.FocusListener[] focusListenerArray32 = parkingcharges24.getFocusListeners();
        park.Parkingcharges parkingcharges33 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener34 = null;
        parkingcharges33.addMouseWheelListener(mouseWheelListener34);
        java.awt.Point point37 = parkingcharges33.getMousePosition(true);
        java.awt.event.MouseListener mouseListener38 = null;
        parkingcharges33.addMouseListener(mouseListener38);
        park.Parkingcharges parkingcharges40 = new park.Parkingcharges();
        parkingcharges40.setFocusable(false);
        java.awt.Event event43 = null;
        boolean boolean46 = parkingcharges40.mouseDrag(event43, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle47 = parkingcharges40.getBounds();
        java.awt.Rectangle rectangle48 = parkingcharges33.getBounds(rectangle47);
        park.Parkingcharges parkingcharges49 = new park.Parkingcharges();
        parkingcharges49.setLocationByPlatform(false);
        java.awt.Image image52 = null;
        parkingcharges49.setIconImage(image52);
        park.Parkingcharges parkingcharges54 = new park.Parkingcharges();
        parkingcharges54.setFocusable(false);
        java.awt.Event event57 = null;
        boolean boolean60 = parkingcharges54.mouseDrag(event57, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle61 = parkingcharges54.getBounds();
        parkingcharges49.setMixingCutoutShape((java.awt.Shape) rectangle61);
        parkingcharges33.setBounds(rectangle61);
        java.awt.Rectangle rectangle64 = parkingcharges24.getBounds(rectangle61);
        parkingcharges0.setMaximizedBounds(rectangle61);
        java.awt.event.ContainerListener containerListener66 = null;
        parkingcharges0.removeContainerListener(containerListener66);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Parking Booking" + "'", str1, "Parking Booking");
        org.junit.Assert.assertNull(point10);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray11);
        org.junit.Assert.assertNotNull(image16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(focusListenerArray32);
        org.junit.Assert.assertNull(point37);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(rectangle47);
        org.junit.Assert.assertNotNull(rectangle48);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(rectangle61);
        org.junit.Assert.assertNotNull(rectangle64);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.lang.String str1 = parkingcharges0.getTitle();
        java.awt.Cursor cursor2 = null;
        parkingcharges0.setCursor(cursor2);
        java.awt.event.WindowListener windowListener4 = null;
        parkingcharges0.addWindowListener(windowListener4);
        park.Parkingcharges parkingcharges6 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener7 = null;
        parkingcharges6.addMouseWheelListener(mouseWheelListener7);
        java.awt.Point point10 = parkingcharges6.getMousePosition(true);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray11 = parkingcharges6.getPropertyChangeListeners();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener12 = null;
        parkingcharges6.removeHierarchyBoundsListener(hierarchyBoundsListener12);
        java.awt.Image image16 = parkingcharges6.createImage(6, (int) (short) 100);
        park.Parkingcharges parkingcharges17 = new park.Parkingcharges();
        java.awt.Dimension dimension18 = null;
        parkingcharges17.setPreferredSize(dimension18);
        parkingcharges17.doLayout();
        parkingcharges17.removeAll();
        int int22 = parkingcharges0.checkImage(image16, (java.awt.image.ImageObserver) parkingcharges17);
        // The following exception was thrown during execution in test generation
        try {
            parkingcharges0.setOpacity((float) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.awt.IllegalComponentStateException; message: The frame is decorated");
        } catch (java.awt.IllegalComponentStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Parking Booking" + "'", str1, "Parking Booking");
        org.junit.Assert.assertNull(point10);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray11);
        org.junit.Assert.assertNotNull(image16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setLocationByPlatform(false);
        parkingcharges0.setVisible(true);
        boolean boolean5 = parkingcharges0.isResizable();
        boolean boolean6 = parkingcharges0.isFocused();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingcharges0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingcharges0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        parkingcharges0.addMouseListener(mouseListener5);
        parkingcharges0.setSize(9, (int) (short) 100);
        java.awt.event.MouseMotionListener mouseMotionListener10 = null;
        parkingcharges0.removeMouseMotionListener(mouseMotionListener10);
        org.junit.Assert.assertNull(point4);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.Dimension dimension1 = null;
        parkingcharges0.setPreferredSize(dimension1);
        parkingcharges0.resize(7, 0);
        boolean boolean6 = parkingcharges0.isEnabled();
        java.awt.Event event7 = null;
        boolean boolean9 = parkingcharges0.lostFocus(event7, (java.lang.Object) (short) 0);
        parkingcharges0.setFocusable(false);
        park.Parkingcharges parkingcharges12 = new park.Parkingcharges();
        java.awt.Dimension dimension13 = null;
        parkingcharges12.setPreferredSize(dimension13);
        parkingcharges12.resize(7, 0);
        boolean boolean18 = parkingcharges12.isEnabled();
        parkingcharges12.setAlwaysOnTop(false);
        boolean boolean21 = parkingcharges12.isShowing();
        java.awt.Point point22 = null;
        java.awt.Point point23 = parkingcharges12.getLocation(point22);
        // The following exception was thrown during execution in test generation
        try {
            parkingcharges0.setLocation(point22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"x\" because \"p\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(point23);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setLocationByPlatform(false);
        java.awt.Image image3 = null;
        parkingcharges0.setIconImage(image3);
        park.Parkingcharges parkingcharges5 = new park.Parkingcharges();
        parkingcharges5.setFocusable(false);
        java.awt.Event event8 = null;
        boolean boolean11 = parkingcharges5.mouseDrag(event8, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle12 = parkingcharges5.getBounds();
        parkingcharges0.setMixingCutoutShape((java.awt.Shape) rectangle12);
        boolean boolean14 = parkingcharges0.isValid();
        java.awt.event.FocusEvent.Cause cause15 = null;
        parkingcharges0.requestFocus(cause15);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(rectangle12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setLocationByPlatform(false);
        java.awt.Image image3 = null;
        parkingcharges0.setIconImage(image3);
        javax.swing.JMenuBar jMenuBar5 = null;
        parkingcharges0.setJMenuBar(jMenuBar5);
        java.awt.event.FocusListener focusListener7 = null;
        parkingcharges0.addFocusListener(focusListener7);
        java.awt.Component component9 = parkingcharges0.getFocusOwner();
        park.Parkingcharges parkingcharges10 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener11 = null;
        parkingcharges10.addMouseWheelListener(mouseWheelListener11);
        java.awt.Point point14 = parkingcharges10.getMousePosition(true);
        java.awt.event.MouseListener mouseListener15 = null;
        parkingcharges10.addMouseListener(mouseListener15);
        java.awt.Component component17 = parkingcharges10.getMostRecentFocusOwner();
        java.awt.MenuBar menuBar18 = null;
        parkingcharges10.setMenuBar(menuBar18);
        park.Parkingcharges parkingcharges20 = new park.Parkingcharges();
        java.lang.String str21 = parkingcharges20.getTitle();
        java.awt.Cursor cursor22 = null;
        parkingcharges20.setCursor(cursor22);
        java.awt.Dimension dimension24 = parkingcharges20.size();
        parkingcharges10.setPreferredSize(dimension24);
        parkingcharges0.setSize(dimension24);
        parkingcharges0.transferFocusBackward();
        org.junit.Assert.assertNull(component9);
        org.junit.Assert.assertNull(point14);
        org.junit.Assert.assertNotNull(component17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Parking Booking" + "'", str21, "Parking Booking");
        org.junit.Assert.assertNotNull(dimension24);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setLocationByPlatform(false);
        parkingcharges0.setVisible(true);
        java.awt.Container container5 = parkingcharges0.getFocusCycleRootAncestor();
        park.Parkingcharges parkingcharges6 = new park.Parkingcharges();
        java.awt.Dimension dimension7 = null;
        parkingcharges6.setPreferredSize(dimension7);
        parkingcharges6.doLayout();
        java.awt.event.FocusListener focusListener10 = null;
        parkingcharges6.addFocusListener(focusListener10);
        park.Parkingcharges parkingcharges12 = new park.Parkingcharges();
        java.lang.String str13 = parkingcharges12.getTitle();
        java.awt.Cursor cursor14 = null;
        parkingcharges12.setCursor(cursor14);
        java.awt.event.WindowListener windowListener16 = null;
        parkingcharges12.addWindowListener(windowListener16);
        park.Parkingcharges parkingcharges18 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener19 = null;
        parkingcharges18.addMouseWheelListener(mouseWheelListener19);
        java.awt.Point point22 = parkingcharges18.getMousePosition(true);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray23 = parkingcharges18.getPropertyChangeListeners();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener24 = null;
        parkingcharges18.removeHierarchyBoundsListener(hierarchyBoundsListener24);
        java.awt.Image image28 = parkingcharges18.createImage(6, (int) (short) 100);
        park.Parkingcharges parkingcharges29 = new park.Parkingcharges();
        java.awt.Dimension dimension30 = null;
        parkingcharges29.setPreferredSize(dimension30);
        parkingcharges29.doLayout();
        parkingcharges29.removeAll();
        int int34 = parkingcharges12.checkImage(image28, (java.awt.image.ImageObserver) parkingcharges29);
        parkingcharges6.setIconImage(image28);
        park.Parkingcharges parkingcharges38 = new park.Parkingcharges();
        java.awt.Dimension dimension39 = null;
        parkingcharges38.setPreferredSize(dimension39);
        parkingcharges38.doLayout();
        boolean boolean43 = parkingcharges38.areFocusTraversalKeysSet((int) (short) 1);
        boolean boolean44 = parkingcharges0.prepareImage(image28, (int) (short) -1, 13, (java.awt.image.ImageObserver) parkingcharges38);
        org.junit.Assert.assertNull(container5);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Parking Booking" + "'", str13, "Parking Booking");
        org.junit.Assert.assertNull(point22);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray23);
        org.junit.Assert.assertNotNull(image28);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 32 + "'", int34 == 32);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingcharges0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingcharges0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        parkingcharges0.addMouseListener(mouseListener5);
        java.awt.LayoutManager layoutManager7 = parkingcharges0.getLayout();
        parkingcharges0.move(11, 6);
        boolean boolean11 = parkingcharges0.isOpaque();
        parkingcharges0.setFocusCycleRoot(true);
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(layoutManager7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.Dimension dimension1 = null;
        parkingcharges0.setPreferredSize(dimension1);
        parkingcharges0.resize(7, 0);
        boolean boolean6 = parkingcharges0.isEnabled();
        parkingcharges0.setResizable(false);
        boolean boolean9 = parkingcharges0.getFocusTraversalKeysEnabled();
        java.awt.Dimension dimension10 = parkingcharges0.getPreferredSize();
        java.awt.FocusTraversalPolicy focusTraversalPolicy11 = parkingcharges0.getFocusTraversalPolicy();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(dimension10);
        org.junit.Assert.assertNotNull(focusTraversalPolicy11);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = parkingcharges0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle7 = parkingcharges0.getBounds();
        java.awt.Dimension dimension8 = parkingcharges0.getPreferredSize();
        java.awt.event.FocusListener focusListener9 = null;
        parkingcharges0.addFocusListener(focusListener9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(rectangle7);
        org.junit.Assert.assertNotNull(dimension8);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingcharges0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingcharges0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        parkingcharges0.addMouseListener(mouseListener5);
        java.awt.Component component7 = parkingcharges0.getMostRecentFocusOwner();
        parkingcharges0.setAlwaysOnTop(false);
        javax.swing.TransferHandler transferHandler10 = parkingcharges0.getTransferHandler();
        parkingcharges0.enableInputMethods(true);
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertNull(transferHandler10);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        int int0 = java.awt.image.ImageObserver.FRAMEBITS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.Dimension dimension1 = null;
        parkingcharges0.setPreferredSize(dimension1);
        parkingcharges0.doLayout();
        parkingcharges0.removeAll();
        boolean boolean5 = parkingcharges0.isUndecorated();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingcharges0.addMouseWheelListener(mouseWheelListener1);
        java.awt.event.MouseMotionListener mouseMotionListener3 = null;
        parkingcharges0.removeMouseMotionListener(mouseMotionListener3);
        parkingcharges0.removeAll();
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setFocusable(false);
        java.awt.Component component3 = parkingcharges0.getGlassPane();
        java.util.ResourceBundle resourceBundle4 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingcharges0.applyResourceBundle(resourceBundle4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ResourceBundle.getLocale()\" because \"bdl\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(component3);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setLocationByPlatform(false);
        java.awt.Image image3 = null;
        parkingcharges0.setIconImage(image3);
        javax.swing.JMenuBar jMenuBar5 = null;
        parkingcharges0.setJMenuBar(jMenuBar5);
        java.awt.FocusTraversalPolicy focusTraversalPolicy7 = null;
        parkingcharges0.setFocusTraversalPolicy(focusTraversalPolicy7);
        park.Parkingcharges parkingcharges9 = new park.Parkingcharges();
        java.awt.Dimension dimension10 = null;
        parkingcharges9.setPreferredSize(dimension10);
        parkingcharges9.resize(7, 0);
        boolean boolean15 = parkingcharges9.isEnabled();
        java.awt.Event event16 = null;
        boolean boolean18 = parkingcharges9.lostFocus(event16, (java.lang.Object) (short) 0);
        java.awt.Font font19 = parkingcharges9.getFont();
        java.awt.FontMetrics fontMetrics20 = parkingcharges0.getFontMetrics(font19);
        java.awt.Cursor cursor21 = null;
        parkingcharges0.setCursor(cursor21);
        parkingcharges0.show(true);
        park.Parkingcharges parkingcharges25 = new park.Parkingcharges();
        java.lang.String str26 = parkingcharges25.getTitle();
        java.awt.Cursor cursor27 = null;
        parkingcharges25.setCursor(cursor27);
        java.awt.event.WindowListener windowListener29 = null;
        parkingcharges25.addWindowListener(windowListener29);
        parkingcharges25.firePropertyChange("Parking Booking", (long) '#', (long) (byte) 0);
        park.Parkingcharges parkingcharges35 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener36 = null;
        parkingcharges35.addMouseWheelListener(mouseWheelListener36);
        java.awt.Point point39 = parkingcharges35.getMousePosition(true);
        java.awt.event.MouseListener mouseListener40 = null;
        parkingcharges35.addMouseListener(mouseListener40);
        java.awt.Component component42 = parkingcharges35.getMostRecentFocusOwner();
        int int43 = parkingcharges25.getComponentZOrder(component42);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component44 = parkingcharges0.add((java.awt.Component) parkingcharges25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertNotNull(fontMetrics20);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Parking Booking" + "'", str26, "Parking Booking");
        org.junit.Assert.assertNull(point39);
        org.junit.Assert.assertNotNull(component42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.Dimension dimension1 = null;
        parkingcharges0.setPreferredSize(dimension1);
        java.awt.event.ComponentListener componentListener3 = null;
        parkingcharges0.removeComponentListener(componentListener3);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray5 = parkingcharges0.getPropertyChangeListeners();
        park.Parkingcharges parkingcharges6 = new park.Parkingcharges();
        java.awt.Dimension dimension7 = null;
        parkingcharges6.setPreferredSize(dimension7);
        parkingcharges6.resize(7, 0);
        boolean boolean12 = parkingcharges6.isEnabled();
        java.awt.Event event13 = null;
        boolean boolean15 = parkingcharges6.lostFocus(event13, (java.lang.Object) (short) 0);
        java.awt.Cursor cursor16 = parkingcharges6.getCursor();
        java.awt.Rectangle rectangle17 = parkingcharges6.bounds();
        parkingcharges0.setMaximizedBounds(rectangle17);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cursor16);
        org.junit.Assert.assertNotNull(rectangle17);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.lang.String str1 = parkingcharges0.getTitle();
        java.awt.Cursor cursor2 = null;
        parkingcharges0.setCursor(cursor2);
        java.awt.event.ContainerListener containerListener4 = null;
        parkingcharges0.removeContainerListener(containerListener4);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Parking Booking" + "'", str1, "Parking Booking");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.lang.String str1 = parkingcharges0.getTitle();
        java.awt.Cursor cursor2 = null;
        parkingcharges0.setCursor(cursor2);
        java.awt.event.WindowListener windowListener4 = null;
        parkingcharges0.addWindowListener(windowListener4);
        java.awt.Event event6 = null;
        park.Parkingcharges parkingcharges7 = new park.Parkingcharges();
        parkingcharges7.setLocationByPlatform(false);
        java.awt.Image image10 = null;
        parkingcharges7.setIconImage(image10);
        park.Parkingcharges parkingcharges12 = new park.Parkingcharges();
        parkingcharges12.setFocusable(false);
        java.awt.Event event15 = null;
        boolean boolean18 = parkingcharges12.mouseDrag(event15, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle19 = parkingcharges12.getBounds();
        parkingcharges7.setMixingCutoutShape((java.awt.Shape) rectangle19);
        boolean boolean21 = parkingcharges0.gotFocus(event6, (java.lang.Object) rectangle19);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener22 = null;
        parkingcharges0.removeHierarchyBoundsListener(hierarchyBoundsListener22);
        parkingcharges0.addNotify();
        java.awt.Window.Type type25 = parkingcharges0.getType();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Parking Booking" + "'", str1, "Parking Booking");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(rectangle19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + type25 + "' != '" + java.awt.Window.Type.NORMAL + "'", type25.equals(java.awt.Window.Type.NORMAL));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setLocationByPlatform(false);
        parkingcharges0.validate();
        java.awt.event.WindowListener windowListener4 = null;
        parkingcharges0.addWindowListener(windowListener4);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setFocusable(false);
        java.beans.PropertyChangeListener propertyChangeListener3 = null;
        parkingcharges0.removePropertyChangeListener(propertyChangeListener3);
        boolean boolean5 = parkingcharges0.isFocusTraversalPolicyProvider();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = parkingcharges0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        parkingcharges0.transferFocusBackward();
        java.awt.Event event8 = null;
        boolean boolean11 = parkingcharges0.mouseDown(event8, (int) (short) 10, (int) (byte) 100);
        java.awt.Image image12 = null;
        parkingcharges0.setIconImage(image12);
        parkingcharges0.setState(7);
        parkingcharges0.resize((int) (byte) 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str5 = parkingcharges0.getTitle();
        java.awt.event.ActionEvent actionEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingcharges0.actionPerformed(actionEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.event.ActionEvent.getSource()\" because \"event\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Parking Booking" + "'", str5, "Parking Booking");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = parkingcharges0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        parkingcharges0.transferFocusBackward();
        park.Parkingcharges parkingcharges8 = new park.Parkingcharges();
        java.awt.Dimension dimension9 = null;
        parkingcharges8.setPreferredSize(dimension9);
        parkingcharges8.resize(7, 0);
        boolean boolean14 = parkingcharges8.isEnabled();
        parkingcharges8.setAlwaysOnTop(false);
        boolean boolean17 = parkingcharges8.isShowing();
        java.awt.Point point18 = null;
        java.awt.Point point19 = parkingcharges8.getLocation(point18);
        java.awt.Component component20 = parkingcharges0.findComponentAt(point19);
        park.Parkingcharges parkingcharges21 = new park.Parkingcharges();
        java.awt.Dimension dimension22 = null;
        parkingcharges21.setPreferredSize(dimension22);
        java.awt.event.ComponentListener componentListener24 = null;
        parkingcharges21.removeComponentListener(componentListener24);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray26 = parkingcharges21.getPropertyChangeListeners();
        boolean boolean27 = parkingcharges0.isAncestorOf((java.awt.Component) parkingcharges21);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(point19);
        org.junit.Assert.assertNull(component20);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setLocationByPlatform(false);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener3 = null;
        parkingcharges0.removeHierarchyBoundsListener(hierarchyBoundsListener3);
        java.awt.Dimension dimension5 = parkingcharges0.minimumSize();
        parkingcharges0.firePropertyChange("hi!", 10.0f, (float) '#');
        org.junit.Assert.assertNotNull(dimension5);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = parkingcharges0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle7 = parkingcharges0.getBounds();
        java.awt.Component component10 = parkingcharges0.getComponentAt(7, 6);
        java.awt.event.HierarchyListener hierarchyListener11 = null;
        component10.removeHierarchyListener(hierarchyListener11);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(rectangle7);
        org.junit.Assert.assertNotNull(component10);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.Dimension dimension1 = null;
        parkingcharges0.setPreferredSize(dimension1);
        java.awt.event.ComponentListener componentListener3 = null;
        parkingcharges0.removeComponentListener(componentListener3);
        java.awt.event.FocusListener focusListener5 = null;
        parkingcharges0.removeFocusListener(focusListener5);
        java.awt.Component[] componentArray7 = parkingcharges0.getComponents();
        org.junit.Assert.assertNotNull(componentArray7);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.lang.String str1 = parkingcharges0.getTitle();
        java.awt.Cursor cursor2 = null;
        parkingcharges0.setCursor(cursor2);
        java.awt.event.WindowListener windowListener4 = null;
        parkingcharges0.addWindowListener(windowListener4);
        parkingcharges0.firePropertyChange("Parking Booking", (long) '#', (long) (byte) 0);
        boolean boolean10 = parkingcharges0.isBackgroundSet();
        java.awt.Dialog.ModalExclusionType modalExclusionType11 = parkingcharges0.getModalExclusionType();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Parking Booking" + "'", str1, "Parking Booking");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + modalExclusionType11 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType11.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = parkingcharges0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        parkingcharges0.setFocusTraversalPolicyProvider(true);
        java.lang.Object obj9 = parkingcharges0.getTreeLock();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.util.Locale locale5 = null;
        parkingcharges0.setLocale(locale5);
        java.awt.event.InputMethodListener inputMethodListener7 = null;
        parkingcharges0.removeInputMethodListener(inputMethodListener7);
        parkingcharges0.setAlwaysOnTop(false);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingcharges0.addMouseWheelListener(mouseWheelListener1);
        java.awt.event.MouseMotionListener mouseMotionListener3 = null;
        parkingcharges0.removeMouseMotionListener(mouseMotionListener3);
        java.awt.Event event5 = null;
        boolean boolean8 = parkingcharges0.mouseUp(event5, (int) (short) 0, (int) (short) -1);
        int int9 = parkingcharges0.getState();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setLocationByPlatform(false);
        parkingcharges0.validate();
        parkingcharges0.reshape(7, 1, 6, 1);
        java.awt.Event event9 = null;
        park.Parkingcharges parkingcharges10 = new park.Parkingcharges();
        java.awt.Dimension dimension11 = null;
        parkingcharges10.setPreferredSize(dimension11);
        java.awt.event.ComponentListener componentListener13 = null;
        parkingcharges10.removeComponentListener(componentListener13);
        parkingcharges10.firePropertyChange("Parking Booking", (byte) 10, (byte) 100);
        java.awt.Color color19 = parkingcharges10.getForeground();
        boolean boolean20 = parkingcharges0.gotFocus(event9, (java.lang.Object) color19);
        park.Parkingcharges parkingcharges21 = new park.Parkingcharges();
        java.awt.Dimension dimension22 = null;
        parkingcharges21.setPreferredSize(dimension22);
        parkingcharges21.resize(7, 0);
        boolean boolean27 = parkingcharges21.isEnabled();
        java.awt.Event event28 = null;
        boolean boolean30 = parkingcharges21.lostFocus(event28, (java.lang.Object) (short) 0);
        parkingcharges0.setLocationRelativeTo((java.awt.Component) parkingcharges21);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingcharges0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingcharges0.getMousePosition(true);
        boolean boolean5 = parkingcharges0.isAlwaysOnTopSupported();
        boolean boolean6 = parkingcharges0.isLocationByPlatform();
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.Dimension dimension1 = null;
        parkingcharges0.setPreferredSize(dimension1);
        parkingcharges0.resize(7, 0);
        boolean boolean6 = parkingcharges0.isEnabled();
        parkingcharges0.setAlwaysOnTop(false);
        boolean boolean9 = parkingcharges0.isShowing();
        boolean boolean10 = parkingcharges0.isDoubleBuffered();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.Dimension dimension1 = null;
        parkingcharges0.setPreferredSize(dimension1);
        parkingcharges0.doLayout();
        java.awt.event.FocusListener focusListener4 = null;
        parkingcharges0.addFocusListener(focusListener4);
        boolean boolean8 = parkingcharges0.contains((int) (short) 10, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.Dimension dimension1 = null;
        parkingcharges0.setPreferredSize(dimension1);
        parkingcharges0.doLayout();
        java.awt.event.FocusListener focusListener4 = null;
        parkingcharges0.addFocusListener(focusListener4);
        java.awt.Dialog.ModalExclusionType modalExclusionType6 = parkingcharges0.getModalExclusionType();
        float float7 = parkingcharges0.getOpacity();
        org.junit.Assert.assertTrue("'" + modalExclusionType6 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType6.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingcharges0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingcharges0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        parkingcharges0.addMouseListener(mouseListener5);
        park.Parkingcharges parkingcharges7 = new park.Parkingcharges();
        parkingcharges7.setFocusable(false);
        java.awt.Event event10 = null;
        boolean boolean13 = parkingcharges7.mouseDrag(event10, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle14 = parkingcharges7.getBounds();
        java.awt.Rectangle rectangle15 = parkingcharges0.getBounds(rectangle14);
        park.Parkingcharges parkingcharges16 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener17 = null;
        parkingcharges16.addMouseWheelListener(mouseWheelListener17);
        java.awt.Point point20 = parkingcharges16.getMousePosition(true);
        java.awt.event.MouseListener mouseListener21 = null;
        parkingcharges16.addMouseListener(mouseListener21);
        java.awt.Component component23 = parkingcharges16.getMostRecentFocusOwner();
        java.awt.MenuBar menuBar24 = null;
        parkingcharges16.setMenuBar(menuBar24);
        park.Parkingcharges parkingcharges26 = new park.Parkingcharges();
        java.lang.String str27 = parkingcharges26.getTitle();
        java.awt.Cursor cursor28 = null;
        parkingcharges26.setCursor(cursor28);
        java.awt.Dimension dimension30 = parkingcharges26.size();
        parkingcharges16.setSize(dimension30);
        parkingcharges0.setPreferredSize(dimension30);
        boolean boolean33 = parkingcharges0.isAlwaysOnTop();
        park.Parkingcharges parkingcharges34 = new park.Parkingcharges();
        parkingcharges34.setLocationByPlatform(false);
        java.awt.Image image37 = null;
        parkingcharges34.setIconImage(image37);
        javax.swing.JMenuBar jMenuBar39 = null;
        parkingcharges34.setJMenuBar(jMenuBar39);
        java.awt.event.FocusListener focusListener41 = null;
        parkingcharges34.addFocusListener(focusListener41);
        java.awt.Rectangle rectangle43 = parkingcharges34.getBounds();
        parkingcharges0.setMaximizedBounds(rectangle43);
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(rectangle14);
        org.junit.Assert.assertNotNull(rectangle15);
        org.junit.Assert.assertNull(point20);
        org.junit.Assert.assertNotNull(component23);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Parking Booking" + "'", str27, "Parking Booking");
        org.junit.Assert.assertNotNull(dimension30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(rectangle43);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.util.Locale locale5 = null;
        parkingcharges0.setLocale(locale5);
        parkingcharges0.show(true);
        java.awt.Dimension dimension9 = parkingcharges0.size();
        org.junit.Assert.assertNotNull(dimension9);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setState(32);
        park.Parkingcharges parkingcharges3 = new park.Parkingcharges();
        java.awt.Dimension dimension4 = null;
        parkingcharges3.setPreferredSize(dimension4);
        parkingcharges3.doLayout();
        java.awt.event.FocusListener focusListener7 = null;
        parkingcharges3.addFocusListener(focusListener7);
        park.Parkingcharges parkingcharges9 = new park.Parkingcharges();
        java.lang.String str10 = parkingcharges9.getTitle();
        java.awt.Cursor cursor11 = null;
        parkingcharges9.setCursor(cursor11);
        java.awt.event.WindowListener windowListener13 = null;
        parkingcharges9.addWindowListener(windowListener13);
        park.Parkingcharges parkingcharges15 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener16 = null;
        parkingcharges15.addMouseWheelListener(mouseWheelListener16);
        java.awt.Point point19 = parkingcharges15.getMousePosition(true);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray20 = parkingcharges15.getPropertyChangeListeners();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener21 = null;
        parkingcharges15.removeHierarchyBoundsListener(hierarchyBoundsListener21);
        java.awt.Image image25 = parkingcharges15.createImage(6, (int) (short) 100);
        park.Parkingcharges parkingcharges26 = new park.Parkingcharges();
        java.awt.Dimension dimension27 = null;
        parkingcharges26.setPreferredSize(dimension27);
        parkingcharges26.doLayout();
        parkingcharges26.removeAll();
        int int31 = parkingcharges9.checkImage(image25, (java.awt.image.ImageObserver) parkingcharges26);
        parkingcharges3.setIconImage(image25);
        park.Parkingcharges parkingcharges33 = new park.Parkingcharges();
        parkingcharges33.setLocationByPlatform(false);
        java.awt.Image image36 = null;
        parkingcharges33.setIconImage(image36);
        javax.swing.JMenuBar jMenuBar38 = null;
        parkingcharges33.setJMenuBar(jMenuBar38);
        java.awt.event.FocusListener focusListener40 = null;
        parkingcharges33.addFocusListener(focusListener40);
        java.awt.Component component42 = parkingcharges33.getFocusOwner();
        java.beans.PropertyChangeListener propertyChangeListener44 = null;
        parkingcharges33.addPropertyChangeListener("", propertyChangeListener44);
        boolean boolean46 = parkingcharges0.prepareImage(image25, (java.awt.image.ImageObserver) parkingcharges33);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking Booking" + "'", str10, "Parking Booking");
        org.junit.Assert.assertNull(point19);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray20);
        org.junit.Assert.assertNotNull(image25);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 32 + "'", int31 == 32);
        org.junit.Assert.assertNull(component42);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setLocationByPlatform(false);
        int int3 = parkingcharges0.getExtendedState();
        java.awt.Window window4 = parkingcharges0.getOwner();
        parkingcharges0.setLocationByPlatform(false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(window4);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setLocationByPlatform(false);
        java.awt.Image image3 = null;
        parkingcharges0.setIconImage(image3);
        javax.swing.JMenuBar jMenuBar5 = null;
        parkingcharges0.setJMenuBar(jMenuBar5);
        java.awt.FocusTraversalPolicy focusTraversalPolicy7 = null;
        parkingcharges0.setFocusTraversalPolicy(focusTraversalPolicy7);
        park.Parkingcharges parkingcharges9 = new park.Parkingcharges();
        java.awt.Dimension dimension10 = null;
        parkingcharges9.setPreferredSize(dimension10);
        parkingcharges9.resize(7, 0);
        boolean boolean15 = parkingcharges9.isEnabled();
        java.awt.Event event16 = null;
        boolean boolean18 = parkingcharges9.lostFocus(event16, (java.lang.Object) (short) 0);
        java.awt.Font font19 = parkingcharges9.getFont();
        java.awt.FontMetrics fontMetrics20 = parkingcharges0.getFontMetrics(font19);
        boolean boolean21 = parkingcharges0.isDisplayable();
        park.Parkingcharges parkingcharges22 = new park.Parkingcharges();
        parkingcharges22.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str27 = parkingcharges22.getTitle();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior28 = parkingcharges22.getBaselineResizeBehavior();
        java.awt.event.WindowListener windowListener29 = null;
        parkingcharges22.addWindowListener(windowListener29);
        java.awt.event.WindowFocusListener windowFocusListener31 = null;
        parkingcharges22.addWindowFocusListener(windowFocusListener31);
        java.awt.Graphics graphics33 = parkingcharges22.getGraphics();
        parkingcharges0.paintComponents(graphics33);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertNotNull(fontMetrics20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Parking Booking" + "'", str27, "Parking Booking");
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior28 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior28.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(graphics33);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingcharges0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingcharges0.getMousePosition(true);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray5 = parkingcharges0.getPropertyChangeListeners();
        parkingcharges0.setFocusTraversalKeysEnabled(false);
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray5);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.Dimension dimension1 = null;
        parkingcharges0.setPreferredSize(dimension1);
        parkingcharges0.doLayout();
        boolean boolean5 = parkingcharges0.areFocusTraversalKeysSet((int) (short) 1);
        java.awt.Event event6 = null;
        boolean boolean9 = parkingcharges0.mouseUp(event6, (int) (byte) 1, 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingcharges0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingcharges0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        parkingcharges0.addMouseListener(mouseListener5);
        java.awt.LayoutManager layoutManager7 = parkingcharges0.getLayout();
        parkingcharges0.move(11, 6);
        java.awt.dnd.DropTarget dropTarget11 = null;
        parkingcharges0.setDropTarget(dropTarget11);
        boolean boolean13 = parkingcharges0.getIgnoreRepaint();
        javax.swing.JMenuBar jMenuBar14 = null;
        parkingcharges0.setJMenuBar(jMenuBar14);
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(layoutManager7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingcharges0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingcharges0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        parkingcharges0.addMouseListener(mouseListener5);
        java.awt.Component component7 = parkingcharges0.getMostRecentFocusOwner();
        parkingcharges0.setAlwaysOnTop(false);
        javax.swing.TransferHandler transferHandler10 = parkingcharges0.getTransferHandler();
        int int11 = parkingcharges0.getComponentCount();
        park.Parkingcharges parkingcharges12 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener13 = null;
        parkingcharges12.addMouseWheelListener(mouseWheelListener13);
        java.awt.Point point16 = parkingcharges12.getMousePosition(true);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray17 = parkingcharges12.getPropertyChangeListeners();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener18 = null;
        parkingcharges12.removeHierarchyBoundsListener(hierarchyBoundsListener18);
        java.awt.Image image22 = parkingcharges12.createImage(6, (int) (short) 100);
        park.Parkingcharges parkingcharges25 = new park.Parkingcharges();
        parkingcharges25.setLocationByPlatform(false);
        java.awt.Image image28 = null;
        parkingcharges25.setIconImage(image28);
        javax.swing.JMenuBar jMenuBar30 = null;
        parkingcharges25.setJMenuBar(jMenuBar30);
        java.awt.event.FocusListener focusListener32 = null;
        parkingcharges25.addFocusListener(focusListener32);
        java.awt.Rectangle rectangle34 = parkingcharges25.getBounds();
        java.awt.event.MouseMotionListener mouseMotionListener35 = null;
        parkingcharges25.addMouseMotionListener(mouseMotionListener35);
        boolean boolean37 = parkingcharges25.getFocusableWindowState();
        boolean boolean38 = parkingcharges0.prepareImage(image22, 8, 0, (java.awt.image.ImageObserver) parkingcharges25);
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertNull(transferHandler10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(point16);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray17);
        org.junit.Assert.assertNotNull(image22);
        org.junit.Assert.assertNotNull(rectangle34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = parkingcharges0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        parkingcharges0.setFocusTraversalPolicyProvider(true);
        java.awt.Dimension dimension9 = parkingcharges0.minimumSize();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dimension9);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.Dimension dimension1 = null;
        parkingcharges0.setPreferredSize(dimension1);
        parkingcharges0.resize(7, 0);
        boolean boolean6 = parkingcharges0.isEnabled();
        parkingcharges0.setAlwaysOnTop(false);
        boolean boolean9 = parkingcharges0.isShowing();
        java.awt.Point point10 = null;
        java.awt.Point point11 = parkingcharges0.getLocation(point10);
        java.awt.ComponentOrientation componentOrientation12 = parkingcharges0.getComponentOrientation();
        park.Parkingcharges parkingcharges13 = new park.Parkingcharges();
        java.awt.Dimension dimension14 = null;
        parkingcharges13.setPreferredSize(dimension14);
        int int16 = parkingcharges0.getComponentZOrder((java.awt.Component) parkingcharges13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(point11);
        org.junit.Assert.assertNotNull(componentOrientation12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.Dimension dimension1 = null;
        parkingcharges0.setPreferredSize(dimension1);
        parkingcharges0.resize(7, 0);
        boolean boolean6 = parkingcharges0.isEnabled();
        parkingcharges0.setAlwaysOnTop(false);
        javax.accessibility.AccessibleContext accessibleContext9 = parkingcharges0.getAccessibleContext();
        java.awt.Event event10 = null;
        boolean boolean13 = parkingcharges0.mouseEnter(event10, (int) (byte) 1, 1);
        java.awt.FocusTraversalPolicy focusTraversalPolicy14 = parkingcharges0.getFocusTraversalPolicy();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior15 = parkingcharges0.getBaselineResizeBehavior();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(accessibleContext9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(focusTraversalPolicy14);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior15 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior15.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str5 = parkingcharges0.getTitle();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior6 = parkingcharges0.getBaselineResizeBehavior();
        java.awt.event.WindowListener[] windowListenerArray7 = parkingcharges0.getWindowListeners();
        park.Parkingcharges parkingcharges8 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener9 = null;
        parkingcharges8.addMouseWheelListener(mouseWheelListener9);
        java.awt.Point point12 = parkingcharges8.getMousePosition(true);
        java.awt.event.MouseListener mouseListener13 = null;
        parkingcharges8.addMouseListener(mouseListener13);
        park.Parkingcharges parkingcharges15 = new park.Parkingcharges();
        parkingcharges15.setFocusable(false);
        java.awt.Event event18 = null;
        boolean boolean21 = parkingcharges15.mouseDrag(event18, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle22 = parkingcharges15.getBounds();
        java.awt.Rectangle rectangle23 = parkingcharges8.getBounds(rectangle22);
        // The following exception was thrown during execution in test generation
        try {
            parkingcharges0.setContentPane((java.awt.Container) parkingcharges8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Parking Booking" + "'", str5, "Parking Booking");
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior6 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior6.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(windowListenerArray7);
        org.junit.Assert.assertNull(point12);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(rectangle22);
        org.junit.Assert.assertNotNull(rectangle23);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.Dimension dimension1 = null;
        parkingcharges0.setPreferredSize(dimension1);
        parkingcharges0.resize(7, 0);
        boolean boolean6 = parkingcharges0.isEnabled();
        parkingcharges0.setResizable(false);
        parkingcharges0.setAutoRequestFocus(false);
        park.Parkingcharges parkingcharges11 = new park.Parkingcharges();
        parkingcharges11.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.awt.event.MouseMotionListener mouseMotionListener16 = null;
        parkingcharges11.addMouseMotionListener(mouseMotionListener16);
        boolean boolean18 = parkingcharges0.isAncestorOf((java.awt.Component) parkingcharges11);
        park.Parkingcharges parkingcharges19 = new park.Parkingcharges();
        parkingcharges19.setLocationByPlatform(false);
        int int22 = parkingcharges19.getExtendedState();
        java.awt.Window window23 = parkingcharges19.getOwner();
        park.Parkingcharges parkingcharges24 = new park.Parkingcharges();
        parkingcharges24.setLocationByPlatform(false);
        parkingcharges24.setVisible(true);
        park.Parkingcharges parkingcharges29 = new park.Parkingcharges();
        parkingcharges29.setLocationByPlatform(false);
        java.awt.Image image32 = null;
        parkingcharges29.setIconImage(image32);
        javax.swing.JMenuBar jMenuBar34 = null;
        parkingcharges29.setJMenuBar(jMenuBar34);
        java.awt.FocusTraversalPolicy focusTraversalPolicy36 = null;
        parkingcharges29.setFocusTraversalPolicy(focusTraversalPolicy36);
        park.Parkingcharges parkingcharges38 = new park.Parkingcharges();
        java.awt.Dimension dimension39 = null;
        parkingcharges38.setPreferredSize(dimension39);
        parkingcharges38.resize(7, 0);
        boolean boolean44 = parkingcharges38.isEnabled();
        java.awt.Event event45 = null;
        boolean boolean47 = parkingcharges38.lostFocus(event45, (java.lang.Object) (short) 0);
        java.awt.Font font48 = parkingcharges38.getFont();
        java.awt.FontMetrics fontMetrics49 = parkingcharges29.getFontMetrics(font48);
        java.awt.Graphics graphics50 = parkingcharges29.getGraphics();
        parkingcharges24.paint(graphics50);
        parkingcharges19.printAll(graphics50);
        parkingcharges0.paintComponents(graphics50);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(window23);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(font48);
        org.junit.Assert.assertNotNull(fontMetrics49);
        org.junit.Assert.assertNotNull(graphics50);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setLocationByPlatform(false);
        parkingcharges0.setVisible(true);
        java.awt.Cursor cursor5 = null;
        parkingcharges0.setCursor(cursor5);
        park.Parkingcharges parkingcharges7 = new park.Parkingcharges();
        java.awt.Dimension dimension8 = null;
        parkingcharges7.setPreferredSize(dimension8);
        parkingcharges7.resize(7, 0);
        boolean boolean13 = parkingcharges7.isEnabled();
        parkingcharges7.repaint((long) 7, (int) '#', (int) (short) 100, 9, (int) (byte) 0);
        int int20 = parkingcharges0.getComponentZOrder((java.awt.Component) parkingcharges7);
        java.awt.MenuBar menuBar21 = null;
        parkingcharges7.setMenuBar(menuBar21);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setLocationByPlatform(false);
        parkingcharges0.validate();
        java.awt.Rectangle rectangle4 = parkingcharges0.bounds();
        java.awt.Dimension dimension5 = parkingcharges0.getMaximumSize();
        int int6 = parkingcharges0.getCursorType();
        org.junit.Assert.assertNotNull(rectangle4);
        org.junit.Assert.assertNotNull(dimension5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingcharges0.addMouseWheelListener(mouseWheelListener1);
        java.awt.event.MouseMotionListener mouseMotionListener3 = null;
        parkingcharges0.removeMouseMotionListener(mouseMotionListener3);
        java.awt.Event event5 = null;
        boolean boolean8 = parkingcharges0.mouseUp(event5, (int) (short) 0, (int) (short) -1);
        park.Parkingcharges parkingcharges9 = new park.Parkingcharges();
        parkingcharges9.setFocusable(false);
        java.awt.Event event12 = null;
        boolean boolean15 = parkingcharges9.mouseDrag(event12, (int) (byte) 1, (int) (short) 1);
        boolean boolean16 = parkingcharges9.getFocusableWindowState();
        javax.swing.JLayeredPane jLayeredPane17 = parkingcharges9.getLayeredPane();
        parkingcharges0.setLayeredPane(jLayeredPane17);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(jLayeredPane17);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingcharges0.addMouseWheelListener(mouseWheelListener1);
        java.awt.event.MouseMotionListener mouseMotionListener3 = null;
        parkingcharges0.removeMouseMotionListener(mouseMotionListener3);
        java.awt.Event event5 = null;
        boolean boolean8 = parkingcharges0.mouseUp(event5, (int) (short) 0, (int) (short) -1);
        javax.swing.TransferHandler transferHandler9 = null;
        parkingcharges0.setTransferHandler(transferHandler9);
        boolean boolean12 = parkingcharges0.areFocusTraversalKeysSet(0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.Dimension dimension1 = null;
        parkingcharges0.setPreferredSize(dimension1);
        parkingcharges0.doLayout();
        park.Parkingcharges parkingcharges4 = new park.Parkingcharges();
        parkingcharges4.setLocationByPlatform(false);
        java.awt.Image image7 = null;
        parkingcharges4.setIconImage(image7);
        javax.swing.JMenuBar jMenuBar9 = null;
        parkingcharges4.setJMenuBar(jMenuBar9);
        java.awt.event.FocusListener focusListener11 = null;
        parkingcharges4.addFocusListener(focusListener11);
        java.awt.Rectangle rectangle13 = parkingcharges4.getBounds();
        java.awt.Rectangle rectangle14 = parkingcharges0.getBounds(rectangle13);
        parkingcharges0.setBounds(250, 11, (int) (short) 100, 136);
        org.junit.Assert.assertNotNull(rectangle13);
        org.junit.Assert.assertNotNull(rectangle14);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setFocusable(false);
        java.awt.Component component3 = parkingcharges0.getGlassPane();
        park.Parkingcharges parkingcharges4 = new park.Parkingcharges();
        parkingcharges4.setFocusable(false);
        java.awt.Event event7 = null;
        boolean boolean10 = parkingcharges4.mouseDrag(event7, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle11 = parkingcharges4.getBounds();
        java.awt.Component component14 = parkingcharges4.getComponentAt(7, 6);
        park.Parkingcharges parkingcharges15 = new park.Parkingcharges();
        parkingcharges15.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str20 = parkingcharges15.getTitle();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior21 = parkingcharges15.getBaselineResizeBehavior();
        java.awt.event.WindowListener windowListener22 = null;
        parkingcharges15.addWindowListener(windowListener22);
        java.awt.event.WindowFocusListener windowFocusListener24 = null;
        parkingcharges15.addWindowFocusListener(windowFocusListener24);
        java.awt.Font font26 = parkingcharges15.getFont();
        parkingcharges4.setFont(font26);
        parkingcharges0.setFont(font26);
        org.junit.Assert.assertNotNull(component3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(rectangle11);
        org.junit.Assert.assertNotNull(component14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Parking Booking" + "'", str20, "Parking Booking");
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior21 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior21.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(font26);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingcharges0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingcharges0.getMousePosition(true);
        park.Parkingcharges parkingcharges5 = new park.Parkingcharges();
        parkingcharges5.setLocationByPlatform(false);
        java.awt.Image image8 = null;
        parkingcharges5.setIconImage(image8);
        javax.swing.JMenuBar jMenuBar10 = null;
        parkingcharges5.setJMenuBar(jMenuBar10);
        java.awt.FocusTraversalPolicy focusTraversalPolicy12 = null;
        parkingcharges5.setFocusTraversalPolicy(focusTraversalPolicy12);
        park.Parkingcharges parkingcharges14 = new park.Parkingcharges();
        java.awt.Dimension dimension15 = null;
        parkingcharges14.setPreferredSize(dimension15);
        parkingcharges14.resize(7, 0);
        boolean boolean20 = parkingcharges14.isEnabled();
        java.awt.Event event21 = null;
        boolean boolean23 = parkingcharges14.lostFocus(event21, (java.lang.Object) (short) 0);
        java.awt.Font font24 = parkingcharges14.getFont();
        java.awt.FontMetrics fontMetrics25 = parkingcharges5.getFontMetrics(font24);
        java.awt.Cursor cursor26 = null;
        parkingcharges5.setCursor(cursor26);
        int int28 = parkingcharges0.getComponentZOrder((java.awt.Component) parkingcharges5);
        boolean boolean29 = parkingcharges0.isShowing();
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(font24);
        org.junit.Assert.assertNotNull(fontMetrics25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingcharges0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingcharges0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        parkingcharges0.addMouseListener(mouseListener5);
        park.Parkingcharges parkingcharges7 = new park.Parkingcharges();
        parkingcharges7.setFocusable(false);
        java.awt.Event event10 = null;
        boolean boolean13 = parkingcharges7.mouseDrag(event10, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle14 = parkingcharges7.getBounds();
        java.awt.Rectangle rectangle15 = parkingcharges0.getBounds(rectangle14);
        park.Parkingcharges parkingcharges16 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener17 = null;
        parkingcharges16.addMouseWheelListener(mouseWheelListener17);
        java.awt.Point point20 = parkingcharges16.getMousePosition(true);
        java.awt.event.MouseListener mouseListener21 = null;
        parkingcharges16.addMouseListener(mouseListener21);
        java.awt.Component component23 = parkingcharges16.getMostRecentFocusOwner();
        java.awt.MenuBar menuBar24 = null;
        parkingcharges16.setMenuBar(menuBar24);
        park.Parkingcharges parkingcharges26 = new park.Parkingcharges();
        java.lang.String str27 = parkingcharges26.getTitle();
        java.awt.Cursor cursor28 = null;
        parkingcharges26.setCursor(cursor28);
        java.awt.Dimension dimension30 = parkingcharges26.size();
        parkingcharges16.setSize(dimension30);
        parkingcharges0.setPreferredSize(dimension30);
        parkingcharges0.repaint((long) 391, (int) (short) 1, 12, (int) (short) -1, (int) (short) 100);
        java.util.ResourceBundle resourceBundle39 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingcharges0.applyResourceBundle(resourceBundle39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ResourceBundle.getLocale()\" because \"bdl\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(rectangle14);
        org.junit.Assert.assertNotNull(rectangle15);
        org.junit.Assert.assertNull(point20);
        org.junit.Assert.assertNotNull(component23);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Parking Booking" + "'", str27, "Parking Booking");
        org.junit.Assert.assertNotNull(dimension30);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str5 = parkingcharges0.getTitle();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior6 = parkingcharges0.getBaselineResizeBehavior();
        java.awt.event.WindowListener windowListener7 = null;
        parkingcharges0.addWindowListener(windowListener7);
        java.awt.event.WindowFocusListener windowFocusListener9 = null;
        parkingcharges0.addWindowFocusListener(windowFocusListener9);
        java.awt.Font font11 = parkingcharges0.getFont();
        park.Parkingcharges parkingcharges12 = new park.Parkingcharges();
        parkingcharges12.setLocationByPlatform(false);
        parkingcharges12.firePropertyChange("Parking Booking", (short) (byte) -1, (short) (byte) 1);
        park.Parkingcharges parkingcharges19 = new park.Parkingcharges();
        parkingcharges19.setFocusable(false);
        java.awt.Event event22 = null;
        boolean boolean25 = parkingcharges19.mouseDrag(event22, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle26 = parkingcharges19.getBounds();
        java.awt.Dimension dimension27 = parkingcharges19.getPreferredSize();
        java.util.List<java.awt.Image> imageList28 = parkingcharges19.getIconImages();
        parkingcharges12.setIconImages(imageList28);
        parkingcharges0.setIconImages(imageList28);
        park.Parkingcharges parkingcharges31 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener32 = null;
        parkingcharges31.addMouseWheelListener(mouseWheelListener32);
        park.Parkingcharges parkingcharges34 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener35 = null;
        parkingcharges34.addMouseWheelListener(mouseWheelListener35);
        java.awt.Point point38 = parkingcharges34.getMousePosition(true);
        java.awt.event.MouseListener mouseListener39 = null;
        parkingcharges34.addMouseListener(mouseListener39);
        java.awt.Component component41 = parkingcharges34.getMostRecentFocusOwner();
        java.awt.MenuBar menuBar42 = null;
        parkingcharges34.setMenuBar(menuBar42);
        park.Parkingcharges parkingcharges44 = new park.Parkingcharges();
        java.lang.String str45 = parkingcharges44.getTitle();
        java.awt.Cursor cursor46 = null;
        parkingcharges44.setCursor(cursor46);
        java.awt.Dimension dimension48 = parkingcharges44.size();
        parkingcharges34.setSize(dimension48);
        parkingcharges31.resize(dimension48);
        parkingcharges0.setSize(dimension48);
        boolean boolean52 = parkingcharges0.isFocusable();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Parking Booking" + "'", str5, "Parking Booking");
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior6 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior6.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(rectangle26);
        org.junit.Assert.assertNotNull(dimension27);
        org.junit.Assert.assertNotNull(imageList28);
        org.junit.Assert.assertNull(point38);
        org.junit.Assert.assertNotNull(component41);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Parking Booking" + "'", str45, "Parking Booking");
        org.junit.Assert.assertNotNull(dimension48);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setLocationByPlatform(false);
        parkingcharges0.setVisible(true);
        boolean boolean5 = parkingcharges0.isResizable();
        park.Parkingcharges parkingcharges6 = new park.Parkingcharges();
        parkingcharges6.setFocusable(false);
        java.awt.Event event9 = null;
        boolean boolean12 = parkingcharges6.mouseDrag(event9, (int) (byte) 1, (int) (short) 1);
        boolean boolean13 = parkingcharges6.getFocusableWindowState();
        javax.swing.JLayeredPane jLayeredPane14 = parkingcharges6.getLayeredPane();
        // The following exception was thrown during execution in test generation
        try {
            parkingcharges0.setGlassPane((java.awt.Component) parkingcharges6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(jLayeredPane14);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = parkingcharges0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle7 = parkingcharges0.getBounds();
        park.Parkingcharges parkingcharges8 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener9 = null;
        parkingcharges8.addMouseWheelListener(mouseWheelListener9);
        java.awt.Point point12 = parkingcharges8.getMousePosition(true);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray13 = parkingcharges8.getPropertyChangeListeners();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener14 = null;
        parkingcharges8.removeHierarchyBoundsListener(hierarchyBoundsListener14);
        java.awt.Image image18 = parkingcharges8.createImage(6, (int) (short) 100);
        park.Parkingcharges parkingcharges19 = new park.Parkingcharges();
        java.awt.Dimension dimension20 = null;
        parkingcharges19.setPreferredSize(dimension20);
        parkingcharges19.resize(7, 0);
        boolean boolean25 = parkingcharges19.isEnabled();
        parkingcharges19.setResizable(false);
        parkingcharges19.setAutoRequestFocus(false);
        park.Parkingcharges parkingcharges30 = new park.Parkingcharges();
        parkingcharges30.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.awt.event.MouseMotionListener mouseMotionListener35 = null;
        parkingcharges30.addMouseMotionListener(mouseMotionListener35);
        boolean boolean37 = parkingcharges19.isAncestorOf((java.awt.Component) parkingcharges30);
        java.awt.event.ComponentListener[] componentListenerArray38 = parkingcharges30.getComponentListeners();
        boolean boolean39 = parkingcharges0.prepareImage(image18, (java.awt.image.ImageObserver) parkingcharges30);
        parkingcharges0.toBack();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(rectangle7);
        org.junit.Assert.assertNull(point12);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray13);
        org.junit.Assert.assertNotNull(image18);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(componentListenerArray38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.Dimension dimension1 = null;
        parkingcharges0.setPreferredSize(dimension1);
        parkingcharges0.doLayout();
        java.awt.event.FocusListener focusListener4 = null;
        parkingcharges0.addFocusListener(focusListener4);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener6 = null;
        parkingcharges0.addHierarchyBoundsListener(hierarchyBoundsListener6);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingcharges0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingcharges0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        parkingcharges0.addMouseListener(mouseListener5);
        java.awt.Component component7 = parkingcharges0.getMostRecentFocusOwner();
        java.awt.MenuBar menuBar8 = null;
        parkingcharges0.setMenuBar(menuBar8);
        java.awt.event.ContainerListener containerListener10 = null;
        parkingcharges0.addContainerListener(containerListener10);
        int int12 = parkingcharges0.getState();
        java.awt.event.WindowListener windowListener13 = null;
        parkingcharges0.removeWindowListener(windowListener13);
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingcharges0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingcharges0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        parkingcharges0.addMouseListener(mouseListener5);
        java.awt.LayoutManager layoutManager7 = parkingcharges0.getLayout();
        parkingcharges0.move(11, 6);
        java.awt.event.ContainerListener[] containerListenerArray11 = parkingcharges0.getContainerListeners();
        java.awt.Shape shape12 = parkingcharges0.getShape();
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(layoutManager7);
        org.junit.Assert.assertNotNull(containerListenerArray11);
        org.junit.Assert.assertNull(shape12);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingcharges0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingcharges0.getMousePosition(true);
        park.Parkingcharges parkingcharges5 = new park.Parkingcharges();
        parkingcharges5.setLocationByPlatform(false);
        java.awt.Image image8 = null;
        parkingcharges5.setIconImage(image8);
        javax.swing.JMenuBar jMenuBar10 = null;
        parkingcharges5.setJMenuBar(jMenuBar10);
        java.awt.FocusTraversalPolicy focusTraversalPolicy12 = null;
        parkingcharges5.setFocusTraversalPolicy(focusTraversalPolicy12);
        park.Parkingcharges parkingcharges14 = new park.Parkingcharges();
        java.awt.Dimension dimension15 = null;
        parkingcharges14.setPreferredSize(dimension15);
        parkingcharges14.resize(7, 0);
        boolean boolean20 = parkingcharges14.isEnabled();
        java.awt.Event event21 = null;
        boolean boolean23 = parkingcharges14.lostFocus(event21, (java.lang.Object) (short) 0);
        java.awt.Font font24 = parkingcharges14.getFont();
        java.awt.FontMetrics fontMetrics25 = parkingcharges5.getFontMetrics(font24);
        java.awt.Cursor cursor26 = null;
        parkingcharges5.setCursor(cursor26);
        int int28 = parkingcharges0.getComponentZOrder((java.awt.Component) parkingcharges5);
        java.awt.Cursor cursor29 = parkingcharges0.getCursor();
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(font24);
        org.junit.Assert.assertNotNull(fontMetrics25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(cursor29);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setLocationByPlatform(false);
        java.awt.Image image3 = null;
        parkingcharges0.setIconImage(image3);
        javax.swing.JMenuBar jMenuBar5 = null;
        parkingcharges0.setJMenuBar(jMenuBar5);
        java.awt.event.FocusListener focusListener7 = null;
        parkingcharges0.addFocusListener(focusListener7);
        java.awt.Rectangle rectangle9 = parkingcharges0.getBounds();
        java.awt.dnd.DropTarget dropTarget10 = parkingcharges0.getDropTarget();
        org.junit.Assert.assertNotNull(rectangle9);
        org.junit.Assert.assertNull(dropTarget10);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.Dimension dimension1 = null;
        parkingcharges0.setPreferredSize(dimension1);
        parkingcharges0.resize(7, 0);
        boolean boolean6 = parkingcharges0.isEnabled();
        java.awt.Event event7 = null;
        boolean boolean9 = parkingcharges0.lostFocus(event7, (java.lang.Object) (short) 0);
        java.awt.Cursor cursor10 = parkingcharges0.getCursor();
        java.awt.Rectangle rectangle11 = parkingcharges0.bounds();
        parkingcharges0.reshape(8, (-1), 3, 250);
        boolean boolean17 = parkingcharges0.isEnabled();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cursor10);
        org.junit.Assert.assertNotNull(rectangle11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setLocationByPlatform(false);
        parkingcharges0.setVisible(true);
        java.awt.Cursor cursor5 = null;
        parkingcharges0.setCursor(cursor5);
        park.Parkingcharges parkingcharges7 = new park.Parkingcharges();
        java.awt.Dimension dimension8 = null;
        parkingcharges7.setPreferredSize(dimension8);
        parkingcharges7.resize(7, 0);
        boolean boolean13 = parkingcharges7.isEnabled();
        parkingcharges7.repaint((long) 7, (int) '#', (int) (short) 100, 9, (int) (byte) 0);
        int int20 = parkingcharges0.getComponentZOrder((java.awt.Component) parkingcharges7);
        java.awt.Point point22 = parkingcharges7.getMousePosition(true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(point22);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setLocationByPlatform(false);
        java.awt.Image image3 = null;
        parkingcharges0.setIconImage(image3);
        javax.swing.JMenuBar jMenuBar5 = null;
        parkingcharges0.setJMenuBar(jMenuBar5);
        java.awt.event.FocusListener focusListener7 = null;
        parkingcharges0.addFocusListener(focusListener7);
        java.awt.Component component9 = parkingcharges0.getFocusOwner();
        java.awt.MenuComponent menuComponent10 = null;
        parkingcharges0.remove(menuComponent10);
        org.junit.Assert.assertNull(component9);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.Dimension dimension1 = null;
        parkingcharges0.setPreferredSize(dimension1);
        parkingcharges0.doLayout();
        boolean boolean5 = parkingcharges0.areFocusTraversalKeysSet((int) (short) 1);
        javax.swing.JRootPane jRootPane6 = parkingcharges0.getRootPane();
        park.Parkingcharges parkingcharges7 = new park.Parkingcharges();
        java.awt.Dimension dimension8 = null;
        parkingcharges7.setPreferredSize(dimension8);
        parkingcharges0.remove((java.awt.Component) parkingcharges7);
        parkingcharges0.revalidate();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jRootPane6);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = parkingcharges0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        java.awt.Dimension dimension7 = parkingcharges0.getMinimumSize();
        java.awt.event.WindowListener windowListener8 = null;
        parkingcharges0.removeWindowListener(windowListener8);
        park.Parkingcharges parkingcharges10 = new park.Parkingcharges();
        parkingcharges10.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str15 = parkingcharges10.getTitle();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior16 = parkingcharges10.getBaselineResizeBehavior();
        java.awt.event.WindowListener windowListener17 = null;
        parkingcharges10.addWindowListener(windowListener17);
        java.awt.event.WindowFocusListener windowFocusListener19 = null;
        parkingcharges10.addWindowFocusListener(windowFocusListener19);
        java.awt.Graphics graphics21 = parkingcharges10.getGraphics();
        parkingcharges0.print(graphics21);
        java.io.PrintStream printStream23 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingcharges0.list(printStream23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintStream.println(Object)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dimension7);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Parking Booking" + "'", str15, "Parking Booking");
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior16 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior16.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(graphics21);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.Dimension dimension1 = null;
        parkingcharges0.setPreferredSize(dimension1);
        parkingcharges0.resize(7, 0);
        boolean boolean6 = parkingcharges0.isEnabled();
        java.awt.Event event7 = null;
        boolean boolean9 = parkingcharges0.lostFocus(event7, (java.lang.Object) (short) 0);
        parkingcharges0.setFocusable(false);
        parkingcharges0.setAutoRequestFocus(false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.Dimension dimension1 = null;
        parkingcharges0.setPreferredSize(dimension1);
        parkingcharges0.doLayout();
        boolean boolean5 = parkingcharges0.areFocusTraversalKeysSet((int) (short) 1);
        javax.swing.JRootPane jRootPane6 = parkingcharges0.getRootPane();
        park.Parkingcharges parkingcharges7 = new park.Parkingcharges();
        java.awt.Dimension dimension8 = null;
        parkingcharges7.setPreferredSize(dimension8);
        parkingcharges0.remove((java.awt.Component) parkingcharges7);
        boolean boolean11 = parkingcharges7.isFocused();
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        parkingcharges7.removePropertyChangeListener("hi!", propertyChangeListener13);
        park.Parkingcharges parkingcharges15 = new park.Parkingcharges();
        parkingcharges15.setFocusable(false);
        java.awt.Event event18 = null;
        boolean boolean21 = parkingcharges15.mouseDrag(event18, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle22 = parkingcharges15.getBounds();
        int int23 = parkingcharges15.getCursorType();
        java.awt.Rectangle rectangle24 = parkingcharges15.getBounds();
        parkingcharges7.setMaximizedBounds(rectangle24);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jRootPane6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(rectangle22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(rectangle24);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setLocationByPlatform(false);
        parkingcharges0.setVisible(true);
        java.awt.Cursor cursor5 = null;
        parkingcharges0.setCursor(cursor5);
        boolean boolean7 = parkingcharges0.isFocusable();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.Dimension dimension1 = null;
        parkingcharges0.setPreferredSize(dimension1);
        parkingcharges0.doLayout();
        java.awt.event.FocusListener focusListener4 = null;
        parkingcharges0.addFocusListener(focusListener4);
        java.awt.Dialog.ModalExclusionType modalExclusionType6 = parkingcharges0.getModalExclusionType();
        park.Parkingcharges parkingcharges7 = new park.Parkingcharges();
        parkingcharges7.setLocationByPlatform(false);
        parkingcharges7.setVisible(true);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component12 = parkingcharges0.add((java.awt.Component) parkingcharges7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + modalExclusionType6 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType6.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.Dimension dimension1 = null;
        parkingcharges0.setPreferredSize(dimension1);
        parkingcharges0.resize(7, 0);
        boolean boolean6 = parkingcharges0.isEnabled();
        java.awt.Event event7 = null;
        boolean boolean9 = parkingcharges0.lostFocus(event7, (java.lang.Object) (short) 0);
        java.awt.Font font10 = parkingcharges0.getFont();
        parkingcharges0.setAlwaysOnTop(false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(font10);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingcharges0.addMouseWheelListener(mouseWheelListener1);
        java.awt.event.MouseMotionListener mouseMotionListener3 = null;
        parkingcharges0.removeMouseMotionListener(mouseMotionListener3);
        java.awt.Event event5 = null;
        boolean boolean8 = parkingcharges0.mouseUp(event5, (int) (short) 0, (int) (short) -1);
        parkingcharges0.show();
        java.awt.LayoutManager layoutManager10 = parkingcharges0.getLayout();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(layoutManager10);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setLocationByPlatform(false);
        java.awt.Image image3 = null;
        parkingcharges0.setIconImage(image3);
        javax.swing.JMenuBar jMenuBar5 = null;
        parkingcharges0.setJMenuBar(jMenuBar5);
        java.awt.event.FocusListener focusListener7 = null;
        parkingcharges0.addFocusListener(focusListener7);
        java.util.Locale locale9 = parkingcharges0.getLocale();
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_CA");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setLocationByPlatform(false);
        parkingcharges0.setVisible(true);
        boolean boolean5 = parkingcharges0.isResizable();
        boolean boolean6 = parkingcharges0.isResizable();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.Dimension dimension1 = null;
        parkingcharges0.setPreferredSize(dimension1);
        parkingcharges0.resize(7, 0);
        boolean boolean6 = parkingcharges0.isEnabled();
        parkingcharges0.setAlwaysOnTop(false);
        boolean boolean9 = parkingcharges0.isShowing();
        java.awt.Point point10 = null;
        java.awt.Point point11 = parkingcharges0.getLocation(point10);
        java.awt.ComponentOrientation componentOrientation12 = parkingcharges0.getComponentOrientation();
        java.awt.event.ComponentListener[] componentListenerArray13 = parkingcharges0.getComponentListeners();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(point11);
        org.junit.Assert.assertNotNull(componentOrientation12);
        org.junit.Assert.assertNotNull(componentListenerArray13);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setLocationByPlatform(false);
        int int3 = parkingcharges0.getExtendedState();
        parkingcharges0.setSize((int) (byte) 0, (int) '4');
        parkingcharges0.setExtendedState(10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str5 = parkingcharges0.getTitle();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior6 = parkingcharges0.getBaselineResizeBehavior();
        java.awt.event.WindowListener[] windowListenerArray7 = parkingcharges0.getWindowListeners();
        parkingcharges0.doLayout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Parking Booking" + "'", str5, "Parking Booking");
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior6 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior6.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(windowListenerArray7);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingcharges0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingcharges0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        parkingcharges0.addMouseListener(mouseListener5);
        java.awt.LayoutManager layoutManager7 = parkingcharges0.getLayout();
        parkingcharges0.move(11, 6);
        java.awt.event.ContainerListener[] containerListenerArray11 = parkingcharges0.getContainerListeners();
        java.awt.event.ComponentListener componentListener12 = null;
        parkingcharges0.removeComponentListener(componentListener12);
        int int14 = parkingcharges0.getHeight();
        java.awt.event.MouseMotionListener[] mouseMotionListenerArray15 = parkingcharges0.getMouseMotionListeners();
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(layoutManager7);
        org.junit.Assert.assertNotNull(containerListenerArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 250 + "'", int14 == 250);
        org.junit.Assert.assertNotNull(mouseMotionListenerArray15);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.Dimension dimension1 = null;
        parkingcharges0.setPreferredSize(dimension1);
        parkingcharges0.doLayout();
        park.Parkingcharges parkingcharges4 = new park.Parkingcharges();
        parkingcharges4.setLocationByPlatform(false);
        java.awt.Image image7 = null;
        parkingcharges4.setIconImage(image7);
        javax.swing.JMenuBar jMenuBar9 = null;
        parkingcharges4.setJMenuBar(jMenuBar9);
        java.awt.event.FocusListener focusListener11 = null;
        parkingcharges4.addFocusListener(focusListener11);
        java.awt.Rectangle rectangle13 = parkingcharges4.getBounds();
        java.awt.Rectangle rectangle14 = parkingcharges0.getBounds(rectangle13);
        java.awt.Event event15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = parkingcharges0.postEvent(event15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"id\" because \"evt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(rectangle13);
        org.junit.Assert.assertNotNull(rectangle14);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingcharges0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingcharges0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        parkingcharges0.addMouseListener(mouseListener5);
        java.awt.LayoutManager layoutManager7 = parkingcharges0.getLayout();
        parkingcharges0.move(11, 6);
        java.awt.dnd.DropTarget dropTarget11 = null;
        parkingcharges0.setDropTarget(dropTarget11);
        java.awt.event.KeyListener[] keyListenerArray13 = parkingcharges0.getKeyListeners();
        float float14 = parkingcharges0.getOpacity();
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(layoutManager7);
        org.junit.Assert.assertNotNull(keyListenerArray13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingcharges0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingcharges0.getMousePosition(true);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray5 = parkingcharges0.getPropertyChangeListeners();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener6 = null;
        parkingcharges0.removeHierarchyBoundsListener(hierarchyBoundsListener6);
        parkingcharges0.removeAll();
        java.awt.event.MouseWheelListener[] mouseWheelListenerArray9 = parkingcharges0.getMouseWheelListeners();
        java.awt.Window.Type type10 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingcharges0.setType(type10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: type should not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray5);
        org.junit.Assert.assertNotNull(mouseWheelListenerArray9);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        parkingcharges0.setLocationByPlatform(false);
        java.awt.Image image3 = null;
        parkingcharges0.setIconImage(image3);
        javax.swing.JMenuBar jMenuBar5 = null;
        parkingcharges0.setJMenuBar(jMenuBar5);
        java.awt.FocusTraversalPolicy focusTraversalPolicy7 = null;
        parkingcharges0.setFocusTraversalPolicy(focusTraversalPolicy7);
        park.Parkingcharges parkingcharges9 = new park.Parkingcharges();
        java.awt.Dimension dimension10 = null;
        parkingcharges9.setPreferredSize(dimension10);
        parkingcharges9.resize(7, 0);
        boolean boolean15 = parkingcharges9.isEnabled();
        java.awt.Event event16 = null;
        boolean boolean18 = parkingcharges9.lostFocus(event16, (java.lang.Object) (short) 0);
        java.awt.Font font19 = parkingcharges9.getFont();
        java.awt.FontMetrics fontMetrics20 = parkingcharges0.getFontMetrics(font19);
        java.awt.event.WindowStateListener windowStateListener21 = null;
        parkingcharges0.addWindowStateListener(windowStateListener21);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertNotNull(fontMetrics20);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        park.Parkingcharges parkingcharges0 = new park.Parkingcharges();
        java.awt.Dimension dimension1 = null;
        parkingcharges0.setPreferredSize(dimension1);
        java.awt.event.ComponentListener componentListener3 = null;
        parkingcharges0.removeComponentListener(componentListener3);
        parkingcharges0.firePropertyChange("Parking Booking", (byte) 10, (byte) 100);
        java.awt.Color color9 = parkingcharges0.getForeground();
        boolean boolean12 = parkingcharges0.contains(0, (int) (short) -1);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }
}
