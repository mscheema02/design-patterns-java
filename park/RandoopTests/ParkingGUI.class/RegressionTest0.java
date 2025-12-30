import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.Dimension dimension1 = null;
        parkingGUI0.setPreferredSize(dimension1);
        park.ParkingGUI parkingGUI3 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener4 = null;
        parkingGUI3.addMouseWheelListener(mouseWheelListener4);
        // The following exception was thrown during execution in test generation
        try {
            parkingGUI0.setGlassPane((java.awt.Component) parkingGUI3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = parkingGUI0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle7 = parkingGUI0.getBounds();
        java.awt.AWTEvent aWTEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingGUI0.dispatchEvent(aWTEvent8);
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
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.lang.String str1 = parkingGUI0.getTitle();
        park.ParkingGUI parkingGUI2 = new park.ParkingGUI();
        parkingGUI2.setFocusable(false);
        java.awt.Event event5 = null;
        boolean boolean8 = parkingGUI2.mouseDrag(event5, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle9 = parkingGUI2.getBounds();
        // The following exception was thrown during execution in test generation
        try {
            parkingGUI0.setShape((java.awt.Shape) rectangle9);
            org.junit.Assert.fail("Expected exception of type java.awt.IllegalComponentStateException; message: The frame is decorated");
        } catch (java.awt.IllegalComponentStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Parking" + "'", str1, "Parking");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(rectangle9);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.BufferCapabilities bufferCapabilities2 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingGUI0.createBufferStrategy((int) (byte) 0, bufferCapabilities2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Number of buffers must be at least 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.setLocationByPlatform(false);
        java.awt.Image image3 = null;
        parkingGUI0.setIconImage(image3);
        park.ParkingGUI parkingGUI5 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener6 = null;
        parkingGUI5.addMouseWheelListener(mouseWheelListener6);
        java.awt.Point point9 = parkingGUI5.getMousePosition(true);
        java.awt.event.MouseListener mouseListener10 = null;
        parkingGUI5.addMouseListener(mouseListener10);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component12 = parkingGUI0.add((java.awt.Component) parkingGUI5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point9);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.event.MouseMotionListener mouseMotionListener3 = null;
        parkingGUI0.removeMouseMotionListener(mouseMotionListener3);
        // The following exception was thrown during execution in test generation
        try {
            parkingGUI0.setUndecorated(true);
            org.junit.Assert.fail("Expected exception of type java.awt.IllegalComponentStateException; message: The frame is displayable.");
        } catch (java.awt.IllegalComponentStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        int int0 = java.awt.Frame.CROSSHAIR_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.Point point1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component2 = parkingGUI0.getComponentAt(point1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"x\" because \"p\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.Dimension dimension1 = null;
        parkingGUI0.setPreferredSize(dimension1);
        java.awt.Point point3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component4 = parkingGUI0.getComponentAt(point3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"x\" because \"p\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        int int0 = java.awt.Frame.SW_RESIZE_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.Dimension dimension1 = null;
        parkingGUI0.setPreferredSize(dimension1);
        parkingGUI0.resize(7, 0);
        boolean boolean6 = parkingGUI0.isEnabled();
        park.ParkingGUI parkingGUI7 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener8 = null;
        parkingGUI7.addMouseWheelListener(mouseWheelListener8);
        java.awt.event.MouseMotionListener mouseMotionListener10 = null;
        parkingGUI7.removeMouseMotionListener(mouseMotionListener10);
        // The following exception was thrown during execution in test generation
        try {
            parkingGUI0.setGlassPane((java.awt.Component) parkingGUI7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingGUI0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        parkingGUI0.addMouseListener(mouseListener5);
        parkingGUI0.setSize(9, (int) (short) 100);
        org.junit.Assert.assertNull(point4);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.Dimension dimension1 = null;
        parkingGUI0.setPreferredSize(dimension1);
        parkingGUI0.resize(7, 0);
        boolean boolean6 = parkingGUI0.isEnabled();
        java.awt.event.MouseMotionListener mouseMotionListener7 = null;
        parkingGUI0.addMouseMotionListener(mouseMotionListener7);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingGUI0.getMousePosition(true);
        java.awt.PopupMenu popupMenu5 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingGUI0.add(popupMenu5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"parent\" because \"popup\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point4);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.lang.String str1 = parkingGUI0.getTitle();
        java.io.PrintWriter printWriter2 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingGUI0.list(printWriter2, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.print(String)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Parking" + "'", str1, "Parking");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.event.MouseMotionListener mouseMotionListener3 = null;
        parkingGUI0.removeMouseMotionListener(mouseMotionListener3);
        java.awt.event.HierarchyListener[] hierarchyListenerArray5 = parkingGUI0.getHierarchyListeners();
        java.awt.Point point6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component7 = parkingGUI0.getComponentAt(point6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"x\" because \"p\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hierarchyListenerArray5);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.awt.Color color5 = parkingGUI0.getForeground();
        java.awt.Event event6 = null;
        boolean boolean8 = parkingGUI0.gotFocus(event6, (java.lang.Object) (short) -1);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.setLocationByPlatform(false);
        java.awt.Image image3 = null;
        parkingGUI0.setIconImage(image3);
        javax.swing.JMenuBar jMenuBar5 = null;
        parkingGUI0.setJMenuBar(jMenuBar5);
        java.awt.ComponentOrientation componentOrientation7 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingGUI0.applyComponentOrientation(componentOrientation7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.Dimension dimension1 = null;
        parkingGUI0.setPreferredSize(dimension1);
        java.awt.event.ComponentListener componentListener3 = null;
        parkingGUI0.removeComponentListener(componentListener3);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = parkingGUI0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle7 = parkingGUI0.getBounds();
        int int8 = parkingGUI0.getCursorType();
        javax.swing.JLayeredPane jLayeredPane9 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingGUI0.setLayeredPane(jLayeredPane9);
            org.junit.Assert.fail("Expected exception of type java.awt.IllegalComponentStateException; message: layeredPane cannot be set to null.");
        } catch (java.awt.IllegalComponentStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(rectangle7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = parkingGUI0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle7 = parkingGUI0.getBounds();
        int int8 = parkingGUI0.getCursorType();
        java.awt.Rectangle rectangle9 = parkingGUI0.getBounds();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(rectangle7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(rectangle9);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.setLocationByPlatform(false);
        int int3 = parkingGUI0.getExtendedState();
        java.awt.Window window4 = parkingGUI0.getOwner();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(window4);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str5 = parkingGUI0.getTitle();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior6 = parkingGUI0.getBaselineResizeBehavior();
        java.awt.event.WindowListener windowListener7 = null;
        parkingGUI0.addWindowListener(windowListener7);
        java.awt.event.WindowFocusListener windowFocusListener9 = null;
        parkingGUI0.addWindowFocusListener(windowFocusListener9);
        java.awt.Font font11 = parkingGUI0.getFont();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Parking" + "'", str5, "Parking");
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior6 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior6.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(font11);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = parkingGUI0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle7 = parkingGUI0.getBounds();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray8 = parkingGUI0.getPropertyChangeListeners();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component10 = parkingGUI0.getComponent(11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: No such child: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(rectangle7);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray8);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.setFocusable(false);
        java.awt.event.MouseMotionListener[] mouseMotionListenerArray3 = parkingGUI0.getMouseMotionListeners();
        org.junit.Assert.assertNotNull(mouseMotionListenerArray3);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingGUI0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        parkingGUI0.addMouseListener(mouseListener5);
        java.awt.Component component7 = parkingGUI0.getMostRecentFocusOwner();
        parkingGUI0.setAlwaysOnTop(false);
        javax.swing.TransferHandler transferHandler10 = parkingGUI0.getTransferHandler();
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertNull(transferHandler10);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.setLocationByPlatform(false);
        java.awt.Image image3 = null;
        parkingGUI0.setIconImage(image3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = parkingGUI0.areFocusTraversalKeysSet(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid focus traversal key identifier");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.awt.BufferCapabilities bufferCapabilities6 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingGUI0.createBufferStrategy(100, bufferCapabilities6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No capabilities specified");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.lang.String str1 = parkingGUI0.getTitle();
        java.awt.Cursor cursor2 = null;
        parkingGUI0.setCursor(cursor2);
        java.awt.event.WindowListener windowListener4 = null;
        parkingGUI0.addWindowListener(windowListener4);
        java.awt.Event event6 = null;
        park.ParkingGUI parkingGUI7 = new park.ParkingGUI();
        parkingGUI7.setLocationByPlatform(false);
        java.awt.Image image10 = null;
        parkingGUI7.setIconImage(image10);
        park.ParkingGUI parkingGUI12 = new park.ParkingGUI();
        parkingGUI12.setFocusable(false);
        java.awt.Event event15 = null;
        boolean boolean18 = parkingGUI12.mouseDrag(event15, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle19 = parkingGUI12.getBounds();
        parkingGUI7.setMixingCutoutShape((java.awt.Shape) rectangle19);
        boolean boolean21 = parkingGUI0.gotFocus(event6, (java.lang.Object) rectangle19);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener22 = null;
        parkingGUI0.removeHierarchyBoundsListener(hierarchyBoundsListener22);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Parking" + "'", str1, "Parking");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(rectangle19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingGUI0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        parkingGUI0.addMouseListener(mouseListener5);
        java.awt.LayoutManager layoutManager7 = parkingGUI0.getLayout();
        parkingGUI0.move(11, 6);
        java.awt.Image image11 = null;
        parkingGUI0.setIconImage(image11);
        // The following exception was thrown during execution in test generation
        try {
            parkingGUI0.setOpacity((float) 0);
            org.junit.Assert.fail("Expected exception of type java.awt.IllegalComponentStateException; message: The frame is decorated");
        } catch (java.awt.IllegalComponentStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(layoutManager7);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingGUI0.addMouseWheelListener(mouseWheelListener1);
        park.ParkingGUI parkingGUI3 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener4 = null;
        parkingGUI3.addMouseWheelListener(mouseWheelListener4);
        java.awt.Point point7 = parkingGUI3.getMousePosition(true);
        java.awt.event.MouseListener mouseListener8 = null;
        parkingGUI3.addMouseListener(mouseListener8);
        java.awt.Component component10 = parkingGUI3.getMostRecentFocusOwner();
        java.awt.MenuBar menuBar11 = null;
        parkingGUI3.setMenuBar(menuBar11);
        park.ParkingGUI parkingGUI13 = new park.ParkingGUI();
        java.lang.String str14 = parkingGUI13.getTitle();
        java.awt.Cursor cursor15 = null;
        parkingGUI13.setCursor(cursor15);
        java.awt.Dimension dimension17 = parkingGUI13.size();
        parkingGUI3.setSize(dimension17);
        parkingGUI0.resize(dimension17);
        org.junit.Assert.assertNull(point7);
        org.junit.Assert.assertNotNull(component10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Parking" + "'", str14, "Parking");
        org.junit.Assert.assertNotNull(dimension17);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str5 = parkingGUI0.getTitle();
        java.awt.event.FocusListener[] focusListenerArray6 = parkingGUI0.getFocusListeners();
        java.awt.Graphics graphics7 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingGUI0.paintAll(graphics7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Graphics.getClip()\" because \"g\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Parking" + "'", str5, "Parking");
        org.junit.Assert.assertNotNull(focusListenerArray6);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = parkingGUI0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        parkingGUI0.transferFocusBackward();
        park.ParkingGUI parkingGUI8 = new park.ParkingGUI();
        java.awt.Dimension dimension9 = null;
        parkingGUI8.setPreferredSize(dimension9);
        parkingGUI8.resize(7, 0);
        boolean boolean14 = parkingGUI8.isEnabled();
        parkingGUI8.setAlwaysOnTop(false);
        boolean boolean17 = parkingGUI8.isShowing();
        java.awt.Point point18 = null;
        java.awt.Point point19 = parkingGUI8.getLocation(point18);
        java.awt.Component component20 = parkingGUI0.findComponentAt(point19);
        java.awt.Event event21 = null;
        boolean boolean24 = component20.mouseMove(event21, 8, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(point19);
        org.junit.Assert.assertNotNull(component20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.Dimension dimension1 = null;
        parkingGUI0.setPreferredSize(dimension1);
        park.ParkingGUI parkingGUI4 = new park.ParkingGUI();
        java.lang.String str5 = parkingGUI4.getTitle();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component6 = parkingGUI0.add("hi!", (java.awt.Component) parkingGUI4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Parking" + "'", str5, "Parking");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingGUI0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        parkingGUI0.addMouseListener(mouseListener5);
        java.awt.LayoutManager layoutManager7 = parkingGUI0.getLayout();
        parkingGUI0.move(11, 6);
        java.awt.Image image11 = null;
        parkingGUI0.setIconImage(image11);
        java.awt.im.InputMethodRequests inputMethodRequests13 = parkingGUI0.getInputMethodRequests();
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(layoutManager7);
        org.junit.Assert.assertNull(inputMethodRequests13);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.lang.String str1 = parkingGUI0.getTitle();
        java.awt.ComponentOrientation componentOrientation2 = null;
        parkingGUI0.setComponentOrientation(componentOrientation2);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Parking" + "'", str1, "Parking");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingGUI0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        parkingGUI0.addMouseListener(mouseListener5);
        java.awt.image.ColorModel colorModel7 = parkingGUI0.getColorModel();
        java.awt.Graphics graphics8 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingGUI0.printComponents(graphics8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Graphics.getClip()\" because \"g\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(colorModel7);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.util.Locale locale5 = null;
        parkingGUI0.setLocale(locale5);
        java.awt.event.InputMethodListener inputMethodListener7 = null;
        parkingGUI0.removeInputMethodListener(inputMethodListener7);
        java.awt.event.InputMethodListener inputMethodListener9 = null;
        parkingGUI0.addInputMethodListener(inputMethodListener9);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingGUI0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        parkingGUI0.addMouseListener(mouseListener5);
        java.awt.LayoutManager layoutManager7 = parkingGUI0.getLayout();
        parkingGUI0.move(11, 6);
        javax.swing.JMenuBar jMenuBar11 = null;
        parkingGUI0.setJMenuBar(jMenuBar11);
        java.awt.image.ColorModel colorModel13 = parkingGUI0.getColorModel();
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(layoutManager7);
        org.junit.Assert.assertNotNull(colorModel13);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = parkingGUI0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle7 = parkingGUI0.getBounds();
        java.awt.Dimension dimension8 = parkingGUI0.getPreferredSize();
        java.util.List<java.awt.Image> imageList9 = parkingGUI0.getIconImages();
        park.ParkingGUI parkingGUI10 = new park.ParkingGUI();
        java.lang.String str11 = parkingGUI10.getTitle();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component13 = parkingGUI0.add((java.awt.Component) parkingGUI10, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal component position");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(rectangle7);
        org.junit.Assert.assertNotNull(dimension8);
        org.junit.Assert.assertNotNull(imageList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking" + "'", str11, "Parking");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.Dimension dimension1 = null;
        parkingGUI0.setPreferredSize(dimension1);
        parkingGUI0.doLayout();
        boolean boolean5 = parkingGUI0.areFocusTraversalKeysSet((int) (short) 1);
        javax.swing.JRootPane jRootPane6 = parkingGUI0.getRootPane();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray8 = parkingGUI0.getPropertyChangeListeners("");
        park.ParkingGUI parkingGUI9 = new park.ParkingGUI();
        java.awt.Dimension dimension10 = null;
        parkingGUI9.setPreferredSize(dimension10);
        parkingGUI9.resize(7, 0);
        boolean boolean15 = parkingGUI9.isEnabled();
        java.awt.Event event16 = null;
        boolean boolean18 = parkingGUI9.lostFocus(event16, (java.lang.Object) (short) 0);
        parkingGUI9.setFocusCycleRoot(true);
        park.ParkingGUI parkingGUI21 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener22 = null;
        parkingGUI21.addMouseWheelListener(mouseWheelListener22);
        java.awt.Point point25 = parkingGUI21.getMousePosition(true);
        java.awt.event.MouseListener mouseListener26 = null;
        parkingGUI21.addMouseListener(mouseListener26);
        java.awt.Component component28 = parkingGUI21.getMostRecentFocusOwner();
        java.awt.MenuBar menuBar29 = null;
        parkingGUI21.setMenuBar(menuBar29);
        park.ParkingGUI parkingGUI31 = new park.ParkingGUI();
        java.lang.String str32 = parkingGUI31.getTitle();
        java.awt.Cursor cursor33 = null;
        parkingGUI31.setCursor(cursor33);
        java.awt.Dimension dimension35 = parkingGUI31.size();
        parkingGUI21.setPreferredSize(dimension35);
        java.awt.Dimension dimension37 = parkingGUI9.getSize(dimension35);
        parkingGUI0.setPreferredSize(dimension37);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jRootPane6);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(point25);
        org.junit.Assert.assertNotNull(component28);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Parking" + "'", str32, "Parking");
        org.junit.Assert.assertNotNull(dimension35);
        org.junit.Assert.assertNotNull(dimension37);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingGUI0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        parkingGUI0.addMouseListener(mouseListener5);
        java.awt.Component component7 = parkingGUI0.getMostRecentFocusOwner();
        java.awt.MenuBar menuBar8 = null;
        parkingGUI0.setMenuBar(menuBar8);
        park.ParkingGUI parkingGUI10 = new park.ParkingGUI();
        java.lang.String str11 = parkingGUI10.getTitle();
        java.awt.Cursor cursor12 = null;
        parkingGUI10.setCursor(cursor12);
        java.awt.Dimension dimension14 = parkingGUI10.size();
        parkingGUI0.setSize(dimension14);
        boolean boolean16 = parkingGUI0.isValidateRoot();
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking" + "'", str11, "Parking");
        org.junit.Assert.assertNotNull(dimension14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.setLocationByPlatform(false);
        parkingGUI0.validate();
        parkingGUI0.toFront();
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingGUI0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        parkingGUI0.addMouseListener(mouseListener5);
        java.awt.LayoutManager layoutManager7 = parkingGUI0.getLayout();
        parkingGUI0.move(11, 6);
        javax.swing.JMenuBar jMenuBar11 = null;
        parkingGUI0.setJMenuBar(jMenuBar11);
        parkingGUI0.firePropertyChange("", (long) (short) 1, (long) (-1));
        park.ParkingGUI parkingGUI17 = new park.ParkingGUI();
        java.lang.String str18 = parkingGUI17.getTitle();
        java.awt.Cursor cursor19 = null;
        parkingGUI17.setCursor(cursor19);
        java.awt.event.WindowListener windowListener21 = null;
        parkingGUI17.addWindowListener(windowListener21);
        java.awt.Event event23 = null;
        park.ParkingGUI parkingGUI24 = new park.ParkingGUI();
        parkingGUI24.setLocationByPlatform(false);
        java.awt.Image image27 = null;
        parkingGUI24.setIconImage(image27);
        park.ParkingGUI parkingGUI29 = new park.ParkingGUI();
        parkingGUI29.setFocusable(false);
        java.awt.Event event32 = null;
        boolean boolean35 = parkingGUI29.mouseDrag(event32, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle36 = parkingGUI29.getBounds();
        parkingGUI24.setMixingCutoutShape((java.awt.Shape) rectangle36);
        boolean boolean38 = parkingGUI17.gotFocus(event23, (java.lang.Object) rectangle36);
        parkingGUI0.setBounds(rectangle36);
        park.ParkingGUI parkingGUI40 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener41 = null;
        parkingGUI40.addMouseWheelListener(mouseWheelListener41);
        java.awt.Point point44 = parkingGUI40.getMousePosition(true);
        java.awt.event.MouseListener mouseListener45 = null;
        parkingGUI40.addMouseListener(mouseListener45);
        java.awt.LayoutManager layoutManager47 = parkingGUI40.getLayout();
        parkingGUI40.move(11, 6);
        // The following exception was thrown during execution in test generation
        try {
            parkingGUI0.setComponentZOrder((java.awt.Component) parkingGUI40, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal component position");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(layoutManager7);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Parking" + "'", str18, "Parking");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(rectangle36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(point44);
        org.junit.Assert.assertNotNull(layoutManager47);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.lang.String str1 = parkingGUI0.getTitle();
        java.awt.Cursor cursor2 = null;
        parkingGUI0.setCursor(cursor2);
        java.awt.event.ActionEvent actionEvent4 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingGUI0.actionPerformed(actionEvent4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.event.ActionEvent.getSource()\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Parking" + "'", str1, "Parking");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingGUI0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        parkingGUI0.addMouseListener(mouseListener5);
        java.awt.LayoutManager layoutManager7 = parkingGUI0.getLayout();
        parkingGUI0.move(11, 6);
        int int11 = parkingGUI0.getY();
        java.awt.PopupMenu popupMenu12 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingGUI0.add(popupMenu12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"parent\" because \"popup\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(layoutManager7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingGUI0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        parkingGUI0.addMouseListener(mouseListener5);
        java.awt.Component component7 = parkingGUI0.getMostRecentFocusOwner();
        javax.swing.JMenuBar jMenuBar8 = parkingGUI0.getJMenuBar();
        // The following exception was thrown during execution in test generation
        try {
            jMenuBar8.repaint();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertNull(jMenuBar8);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str5 = parkingGUI0.getTitle();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior6 = parkingGUI0.getBaselineResizeBehavior();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener7 = null;
        parkingGUI0.removeHierarchyBoundsListener(hierarchyBoundsListener7);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Parking" + "'", str5, "Parking");
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior6 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior6.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.Dimension dimension1 = null;
        parkingGUI0.setPreferredSize(dimension1);
        parkingGUI0.resize(7, 0);
        boolean boolean6 = parkingGUI0.isEnabled();
        java.awt.Event event7 = null;
        boolean boolean9 = parkingGUI0.lostFocus(event7, (java.lang.Object) (short) 0);
        java.awt.Font font10 = parkingGUI0.getFont();
        int int11 = parkingGUI0.getCursorType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingGUI0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        parkingGUI0.addMouseListener(mouseListener5);
        java.awt.Component component7 = parkingGUI0.getMostRecentFocusOwner();
        java.awt.MenuBar menuBar8 = null;
        parkingGUI0.setMenuBar(menuBar8);
        java.awt.event.ContainerListener containerListener10 = null;
        parkingGUI0.addContainerListener(containerListener10);
        parkingGUI0.setName("Parking");
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(component7);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        javax.swing.JFrame.setDefaultLookAndFeelDecorated(true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.Dimension dimension1 = null;
        parkingGUI0.setPreferredSize(dimension1);
        parkingGUI0.resize(7, 0);
        boolean boolean6 = parkingGUI0.isEnabled();
        parkingGUI0.repaint((long) 7, (int) '#', (int) (short) 100, 9, (int) (byte) 0);
        int int13 = parkingGUI0.getComponentCount();
        java.awt.Event event14 = null;
        boolean boolean17 = parkingGUI0.mouseMove(event14, (int) (short) -1, (int) (short) 10);
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        parkingGUI0.removePropertyChangeListener("Parking", propertyChangeListener19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingGUI0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        parkingGUI0.addMouseListener(mouseListener5);
        java.awt.LayoutManager layoutManager7 = parkingGUI0.getLayout();
        parkingGUI0.move(11, 6);
        javax.swing.JMenuBar jMenuBar11 = null;
        parkingGUI0.setJMenuBar(jMenuBar11);
        parkingGUI0.firePropertyChange("", (long) (short) 1, (long) (-1));
        java.awt.event.ContainerListener containerListener17 = null;
        parkingGUI0.removeContainerListener(containerListener17);
        java.awt.Insets insets19 = parkingGUI0.getInsets();
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(layoutManager7);
        org.junit.Assert.assertNotNull(insets19);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.setLocationByPlatform(false);
        parkingGUI0.firePropertyChange("Parking", (short) (byte) -1, (short) (byte) 1);
        boolean boolean7 = parkingGUI0.isOpaque();
        java.awt.AWTEvent aWTEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingGUI0.dispatchEvent(aWTEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.AWTEvent.getID()\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingGUI0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        parkingGUI0.addMouseListener(mouseListener5);
        java.awt.Component component7 = parkingGUI0.getMostRecentFocusOwner();
        java.awt.MenuBar menuBar8 = null;
        parkingGUI0.setMenuBar(menuBar8);
        park.ParkingGUI parkingGUI10 = new park.ParkingGUI();
        java.lang.String str11 = parkingGUI10.getTitle();
        java.awt.Cursor cursor12 = null;
        parkingGUI10.setCursor(cursor12);
        java.awt.Dimension dimension14 = parkingGUI10.size();
        parkingGUI0.setSize(dimension14);
        java.awt.event.HierarchyListener hierarchyListener16 = null;
        parkingGUI0.addHierarchyListener(hierarchyListener16);
        java.awt.Graphics graphics18 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingGUI0.print(graphics18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Graphics.getClip()\" because \"g\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking" + "'", str11, "Parking");
        org.junit.Assert.assertNotNull(dimension14);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = parkingGUI0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle7 = parkingGUI0.getBounds();
        java.awt.Dimension dimension8 = parkingGUI0.getPreferredSize();
        java.util.List<java.awt.Image> imageList9 = parkingGUI0.getIconImages();
        java.awt.Image image10 = null;
        parkingGUI0.setIconImage(image10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(rectangle7);
        org.junit.Assert.assertNotNull(dimension8);
        org.junit.Assert.assertNotNull(imageList9);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingGUI0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        parkingGUI0.addMouseListener(mouseListener5);
        java.awt.LayoutManager layoutManager7 = parkingGUI0.getLayout();
        parkingGUI0.move(11, 6);
        javax.swing.JMenuBar jMenuBar11 = null;
        parkingGUI0.setJMenuBar(jMenuBar11);
        parkingGUI0.firePropertyChange("", (long) (short) 1, (long) (-1));
        boolean boolean17 = parkingGUI0.hasFocus();
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(layoutManager7);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingGUI0.getMousePosition(true);
        boolean boolean5 = parkingGUI0.isAlwaysOnTopSupported();
        java.awt.event.HierarchyListener[] hierarchyListenerArray6 = parkingGUI0.getHierarchyListeners();
        java.awt.Dimension dimension7 = parkingGUI0.getPreferredSize();
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(hierarchyListenerArray6);
        org.junit.Assert.assertNotNull(dimension7);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        int int0 = java.awt.image.ImageObserver.ERROR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 64 + "'", int0 == 64);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingGUI0.getMousePosition(true);
        park.ParkingGUI parkingGUI5 = new park.ParkingGUI();
        parkingGUI5.setLocationByPlatform(false);
        java.awt.Image image8 = null;
        parkingGUI5.setIconImage(image8);
        javax.swing.JMenuBar jMenuBar10 = null;
        parkingGUI5.setJMenuBar(jMenuBar10);
        java.awt.FocusTraversalPolicy focusTraversalPolicy12 = null;
        parkingGUI5.setFocusTraversalPolicy(focusTraversalPolicy12);
        park.ParkingGUI parkingGUI14 = new park.ParkingGUI();
        java.awt.Dimension dimension15 = null;
        parkingGUI14.setPreferredSize(dimension15);
        parkingGUI14.resize(7, 0);
        boolean boolean20 = parkingGUI14.isEnabled();
        java.awt.Event event21 = null;
        boolean boolean23 = parkingGUI14.lostFocus(event21, (java.lang.Object) (short) 0);
        java.awt.Font font24 = parkingGUI14.getFont();
        java.awt.FontMetrics fontMetrics25 = parkingGUI5.getFontMetrics(font24);
        java.awt.Cursor cursor26 = null;
        parkingGUI5.setCursor(cursor26);
        int int28 = parkingGUI0.getComponentZOrder((java.awt.Component) parkingGUI5);
        java.awt.Image image29 = null;
        park.ParkingGUI parkingGUI30 = new park.ParkingGUI();
        parkingGUI30.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str35 = parkingGUI30.getTitle();
        int int36 = parkingGUI0.checkImage(image29, (java.awt.image.ImageObserver) parkingGUI30);
        javax.swing.JMenuBar jMenuBar37 = parkingGUI0.getJMenuBar();
        // The following exception was thrown during execution in test generation
        try {
            jMenuBar37.show(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(font24);
        org.junit.Assert.assertNotNull(fontMetrics25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Parking" + "'", str35, "Parking");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 32 + "'", int36 == 32);
        org.junit.Assert.assertNull(jMenuBar37);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingGUI0.getMousePosition(true);
        java.awt.Font font5 = parkingGUI0.getFont();
        int int6 = parkingGUI0.getHeight();
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 200 + "'", int6 == 200);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.lang.String str1 = parkingGUI0.getTitle();
        java.awt.Cursor cursor2 = null;
        parkingGUI0.setCursor(cursor2);
        java.awt.Component component4 = parkingGUI0.getFocusOwner();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Parking" + "'", str1, "Parking");
        org.junit.Assert.assertNull(component4);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = parkingGUI0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        parkingGUI0.transferFocusBackward();
        java.awt.Event event8 = null;
        boolean boolean11 = parkingGUI0.mouseDown(event8, (int) (short) 10, (int) (byte) 100);
        java.awt.Image image12 = null;
        parkingGUI0.setIconImage(image12);
        java.awt.event.MouseMotionListener mouseMotionListener14 = null;
        parkingGUI0.addMouseMotionListener(mouseMotionListener14);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingGUI0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        parkingGUI0.addMouseListener(mouseListener5);
        java.awt.LayoutManager layoutManager7 = parkingGUI0.getLayout();
        parkingGUI0.move(11, 6);
        javax.swing.JMenuBar jMenuBar11 = null;
        parkingGUI0.setJMenuBar(jMenuBar11);
        parkingGUI0.firePropertyChange("", (long) (short) 1, (long) (-1));
        park.ParkingGUI parkingGUI17 = new park.ParkingGUI();
        java.lang.String str18 = parkingGUI17.getTitle();
        java.awt.Cursor cursor19 = null;
        parkingGUI17.setCursor(cursor19);
        java.awt.event.WindowListener windowListener21 = null;
        parkingGUI17.addWindowListener(windowListener21);
        java.awt.Event event23 = null;
        park.ParkingGUI parkingGUI24 = new park.ParkingGUI();
        parkingGUI24.setLocationByPlatform(false);
        java.awt.Image image27 = null;
        parkingGUI24.setIconImage(image27);
        park.ParkingGUI parkingGUI29 = new park.ParkingGUI();
        parkingGUI29.setFocusable(false);
        java.awt.Event event32 = null;
        boolean boolean35 = parkingGUI29.mouseDrag(event32, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle36 = parkingGUI29.getBounds();
        parkingGUI24.setMixingCutoutShape((java.awt.Shape) rectangle36);
        boolean boolean38 = parkingGUI17.gotFocus(event23, (java.lang.Object) rectangle36);
        parkingGUI0.setBounds(rectangle36);
        java.awt.Toolkit toolkit40 = parkingGUI0.getToolkit();
        java.awt.Event event41 = null;
        boolean boolean44 = parkingGUI0.mouseDrag(event41, (int) ' ', 0);
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(layoutManager7);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Parking" + "'", str18, "Parking");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(rectangle36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(toolkit40);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = parkingGUI0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        parkingGUI0.transferFocusBackward();
        park.ParkingGUI parkingGUI8 = new park.ParkingGUI();
        java.awt.Dimension dimension9 = null;
        parkingGUI8.setPreferredSize(dimension9);
        parkingGUI8.resize(7, 0);
        boolean boolean14 = parkingGUI8.isEnabled();
        parkingGUI8.setAlwaysOnTop(false);
        boolean boolean17 = parkingGUI8.isShowing();
        java.awt.Point point18 = null;
        java.awt.Point point19 = parkingGUI8.getLocation(point18);
        java.awt.Component component20 = parkingGUI0.findComponentAt(point19);
        park.ParkingGUI parkingGUI21 = new park.ParkingGUI();
        java.awt.Dimension dimension22 = null;
        parkingGUI21.setPreferredSize(dimension22);
        parkingGUI21.doLayout();
        java.awt.Window.Type type25 = parkingGUI21.getType();
        // The following exception was thrown during execution in test generation
        try {
            parkingGUI0.setType(type25);
            org.junit.Assert.fail("Expected exception of type java.awt.IllegalComponentStateException; message: The window is displayable.");
        } catch (java.awt.IllegalComponentStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(point19);
        org.junit.Assert.assertNotNull(component20);
        org.junit.Assert.assertTrue("'" + type25 + "' != '" + java.awt.Window.Type.NORMAL + "'", type25.equals(java.awt.Window.Type.NORMAL));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.Dimension dimension1 = null;
        parkingGUI0.setPreferredSize(dimension1);
        parkingGUI0.resize(7, 0);
        boolean boolean6 = parkingGUI0.isEnabled();
        parkingGUI0.repaint((long) 7, (int) '#', (int) (short) 100, 9, (int) (byte) 0);
        parkingGUI0.repaint();
        int int14 = parkingGUI0.getX();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.Dimension dimension1 = null;
        parkingGUI0.setPreferredSize(dimension1);
        parkingGUI0.resize(7, 0);
        boolean boolean6 = parkingGUI0.isEnabled();
        parkingGUI0.setAlwaysOnTop(false);
        parkingGUI0.show(true);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior11 = parkingGUI0.getBaselineResizeBehavior();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior11 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior11.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.setFocusable(false);
        park.ParkingGUI parkingGUI3 = new park.ParkingGUI();
        java.awt.Dimension dimension4 = null;
        parkingGUI3.setPreferredSize(dimension4);
        parkingGUI3.doLayout();
        park.ParkingGUI parkingGUI7 = new park.ParkingGUI();
        parkingGUI7.setLocationByPlatform(false);
        java.awt.Image image10 = null;
        parkingGUI7.setIconImage(image10);
        javax.swing.JMenuBar jMenuBar12 = null;
        parkingGUI7.setJMenuBar(jMenuBar12);
        java.awt.FocusTraversalPolicy focusTraversalPolicy14 = null;
        parkingGUI7.setFocusTraversalPolicy(focusTraversalPolicy14);
        park.ParkingGUI parkingGUI16 = new park.ParkingGUI();
        java.awt.Dimension dimension17 = null;
        parkingGUI16.setPreferredSize(dimension17);
        parkingGUI16.resize(7, 0);
        boolean boolean22 = parkingGUI16.isEnabled();
        java.awt.Event event23 = null;
        boolean boolean25 = parkingGUI16.lostFocus(event23, (java.lang.Object) (short) 0);
        java.awt.Font font26 = parkingGUI16.getFont();
        java.awt.FontMetrics fontMetrics27 = parkingGUI7.getFontMetrics(font26);
        // The following exception was thrown during execution in test generation
        try {
            parkingGUI0.add((java.awt.Component) parkingGUI3, (java.lang.Object) parkingGUI7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(font26);
        org.junit.Assert.assertNotNull(fontMetrics27);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        int int0 = java.awt.image.ImageObserver.ABORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 128 + "'", int0 == 128);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.lang.String str1 = parkingGUI0.getTitle();
        java.awt.Font font2 = null;
        parkingGUI0.setFont(font2);
        float float4 = parkingGUI0.getAlignmentY();
        java.util.ResourceBundle resourceBundle5 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingGUI0.applyResourceBundle(resourceBundle5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ResourceBundle.getLocale()\" because \"bdl\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Parking" + "'", str1, "Parking");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.5f + "'", float4 == 0.5f);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.Dimension dimension1 = null;
        parkingGUI0.setPreferredSize(dimension1);
        parkingGUI0.resize(7, 0);
        boolean boolean6 = parkingGUI0.isEnabled();
        parkingGUI0.setResizable(false);
        boolean boolean9 = parkingGUI0.getFocusTraversalKeysEnabled();
        java.awt.event.WindowStateListener[] windowStateListenerArray10 = parkingGUI0.getWindowStateListeners();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(windowStateListenerArray10);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.lang.String str1 = parkingGUI0.getTitle();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray2 = parkingGUI0.getPropertyChangeListeners();
        java.awt.Window[] windowArray3 = parkingGUI0.getOwnedWindows();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Parking" + "'", str1, "Parking");
        org.junit.Assert.assertNotNull(propertyChangeListenerArray2);
        org.junit.Assert.assertNotNull(windowArray3);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.event.MouseMotionListener mouseMotionListener3 = null;
        parkingGUI0.removeMouseMotionListener(mouseMotionListener3);
        java.awt.Event event5 = null;
        boolean boolean8 = parkingGUI0.mouseUp(event5, (int) (short) 0, (int) (short) -1);
        java.awt.Component component11 = parkingGUI0.locate(5, (int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        parkingGUI0.removePropertyChangeListener("", propertyChangeListener13);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(component11);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = parkingGUI0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle7 = parkingGUI0.getBounds();
        java.awt.Dimension dimension8 = parkingGUI0.getPreferredSize();
        java.util.List<java.awt.Image> imageList9 = parkingGUI0.getIconImages();
        java.awt.Graphics graphics10 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingGUI0.paint(graphics10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Graphics.getClip()\" because \"g\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(rectangle7);
        org.junit.Assert.assertNotNull(dimension8);
        org.junit.Assert.assertNotNull(imageList9);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.Dimension dimension1 = null;
        parkingGUI0.setPreferredSize(dimension1);
        java.awt.Graphics graphics3 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingGUI0.paintComponents(graphics3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Graphics.getClip()\" because \"g\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.awt.Color color5 = parkingGUI0.getForeground();
        java.awt.Point point6 = parkingGUI0.getMousePosition();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener7 = null;
        parkingGUI0.removeHierarchyBoundsListener(hierarchyBoundsListener7);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(point6);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingGUI0.getMousePosition(true);
        park.ParkingGUI parkingGUI5 = new park.ParkingGUI();
        parkingGUI5.setLocationByPlatform(false);
        java.awt.Image image8 = null;
        parkingGUI5.setIconImage(image8);
        javax.swing.JMenuBar jMenuBar10 = null;
        parkingGUI5.setJMenuBar(jMenuBar10);
        java.awt.FocusTraversalPolicy focusTraversalPolicy12 = null;
        parkingGUI5.setFocusTraversalPolicy(focusTraversalPolicy12);
        park.ParkingGUI parkingGUI14 = new park.ParkingGUI();
        java.awt.Dimension dimension15 = null;
        parkingGUI14.setPreferredSize(dimension15);
        parkingGUI14.resize(7, 0);
        boolean boolean20 = parkingGUI14.isEnabled();
        java.awt.Event event21 = null;
        boolean boolean23 = parkingGUI14.lostFocus(event21, (java.lang.Object) (short) 0);
        java.awt.Font font24 = parkingGUI14.getFont();
        java.awt.FontMetrics fontMetrics25 = parkingGUI5.getFontMetrics(font24);
        java.awt.Cursor cursor26 = null;
        parkingGUI5.setCursor(cursor26);
        int int28 = parkingGUI0.getComponentZOrder((java.awt.Component) parkingGUI5);
        java.beans.PropertyChangeListener propertyChangeListener30 = null;
        parkingGUI0.removePropertyChangeListener("hi!", propertyChangeListener30);
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(font24);
        org.junit.Assert.assertNotNull(fontMetrics25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str5 = parkingGUI0.getTitle();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior6 = parkingGUI0.getBaselineResizeBehavior();
        park.ParkingGUI parkingGUI8 = new park.ParkingGUI();
        java.awt.Dimension dimension9 = null;
        parkingGUI8.setPreferredSize(dimension9);
        parkingGUI8.resize(7, 0);
        boolean boolean14 = parkingGUI8.isEnabled();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component15 = parkingGUI0.add("", (java.awt.Component) parkingGUI8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Parking" + "'", str5, "Parking");
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior6 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior6.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingGUI0.getMousePosition(true);
        park.ParkingGUI parkingGUI5 = new park.ParkingGUI();
        parkingGUI5.setLocationByPlatform(false);
        java.awt.Image image8 = null;
        parkingGUI5.setIconImage(image8);
        javax.swing.JMenuBar jMenuBar10 = null;
        parkingGUI5.setJMenuBar(jMenuBar10);
        java.awt.FocusTraversalPolicy focusTraversalPolicy12 = null;
        parkingGUI5.setFocusTraversalPolicy(focusTraversalPolicy12);
        park.ParkingGUI parkingGUI14 = new park.ParkingGUI();
        java.awt.Dimension dimension15 = null;
        parkingGUI14.setPreferredSize(dimension15);
        parkingGUI14.resize(7, 0);
        boolean boolean20 = parkingGUI14.isEnabled();
        java.awt.Event event21 = null;
        boolean boolean23 = parkingGUI14.lostFocus(event21, (java.lang.Object) (short) 0);
        java.awt.Font font24 = parkingGUI14.getFont();
        java.awt.FontMetrics fontMetrics25 = parkingGUI5.getFontMetrics(font24);
        java.awt.Cursor cursor26 = null;
        parkingGUI5.setCursor(cursor26);
        int int28 = parkingGUI0.getComponentZOrder((java.awt.Component) parkingGUI5);
        java.awt.Image image29 = null;
        park.ParkingGUI parkingGUI30 = new park.ParkingGUI();
        parkingGUI30.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str35 = parkingGUI30.getTitle();
        int int36 = parkingGUI0.checkImage(image29, (java.awt.image.ImageObserver) parkingGUI30);
        javax.swing.JMenuBar jMenuBar37 = parkingGUI0.getJMenuBar();
        // The following exception was thrown during execution in test generation
        try {
            parkingGUI0.setOpacity((float) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The value of opacity should be in the range [0.0f .. 1.0f].");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(font24);
        org.junit.Assert.assertNotNull(fontMetrics25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Parking" + "'", str35, "Parking");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 32 + "'", int36 == 32);
        org.junit.Assert.assertNull(jMenuBar37);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.Dimension dimension1 = null;
        parkingGUI0.setPreferredSize(dimension1);
        parkingGUI0.doLayout();
        boolean boolean5 = parkingGUI0.areFocusTraversalKeysSet((int) (short) 1);
        javax.swing.JRootPane jRootPane6 = parkingGUI0.getRootPane();
        java.awt.Point point7 = parkingGUI0.getMousePosition();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jRootPane6);
        org.junit.Assert.assertNull(point7);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = parkingGUI0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle7 = parkingGUI0.getBounds();
        java.awt.Graphics graphics8 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingGUI0.print(graphics8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Graphics.getClip()\" because \"g\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(rectangle7);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.setLocationByPlatform(false);
        parkingGUI0.setVisible(true);
        java.awt.Dimension dimension5 = parkingGUI0.getMaximumSize();
        java.awt.Dimension dimension6 = parkingGUI0.size();
        boolean boolean7 = parkingGUI0.isBackgroundSet();
        org.junit.Assert.assertNotNull(dimension5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.setLocationByPlatform(false);
        parkingGUI0.validate();
        parkingGUI0.reshape(7, 1, 6, 1);
        java.io.PrintStream printStream9 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingGUI0.list(printStream9, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintStream.print(String)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.Dimension dimension1 = null;
        parkingGUI0.setPreferredSize(dimension1);
        parkingGUI0.resize(7, 0);
        boolean boolean6 = parkingGUI0.isEnabled();
        java.awt.Event event7 = null;
        boolean boolean9 = parkingGUI0.lostFocus(event7, (java.lang.Object) (short) 0);
        parkingGUI0.setFocusCycleRoot(true);
        java.awt.ComponentOrientation componentOrientation12 = null;
        parkingGUI0.setComponentOrientation(componentOrientation12);
        parkingGUI0.setAutoRequestFocus(true);
        java.awt.ComponentOrientation componentOrientation16 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingGUI0.applyComponentOrientation(componentOrientation16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.lang.String str1 = parkingGUI0.getTitle();
        java.awt.Cursor cursor2 = null;
        parkingGUI0.setCursor(cursor2);
        java.awt.event.WindowListener windowListener4 = null;
        parkingGUI0.addWindowListener(windowListener4);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component7 = parkingGUI0.getComponent(4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: No such child: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Parking" + "'", str1, "Parking");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingGUI0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        parkingGUI0.addMouseListener(mouseListener5);
        java.awt.image.ColorModel colorModel7 = parkingGUI0.getColorModel();
        int int8 = parkingGUI0.getCursorType();
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(colorModel7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.event.MouseMotionListener mouseMotionListener3 = null;
        parkingGUI0.removeMouseMotionListener(mouseMotionListener3);
        java.awt.Event event5 = null;
        boolean boolean8 = parkingGUI0.mouseUp(event5, (int) (short) 0, (int) (short) -1);
        java.awt.event.WindowListener windowListener9 = null;
        parkingGUI0.removeWindowListener(windowListener9);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.Dimension dimension1 = null;
        parkingGUI0.setPreferredSize(dimension1);
        parkingGUI0.resize(7, 0);
        boolean boolean6 = parkingGUI0.isEnabled();
        java.awt.Event event7 = null;
        boolean boolean9 = parkingGUI0.lostFocus(event7, (java.lang.Object) (short) 0);
        boolean boolean10 = parkingGUI0.isActive();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.lang.String str1 = parkingGUI0.getTitle();
        java.awt.Font font2 = null;
        parkingGUI0.setFont(font2);
        java.awt.MenuBar menuBar4 = parkingGUI0.getMenuBar();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Parking" + "'", str1, "Parking");
        org.junit.Assert.assertNull(menuBar4);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.lang.String str1 = parkingGUI0.getTitle();
        java.awt.Cursor cursor2 = null;
        parkingGUI0.setCursor(cursor2);
        java.awt.event.WindowListener windowListener4 = null;
        parkingGUI0.addWindowListener(windowListener4);
        java.io.PrintWriter printWriter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingGUI0.list(printWriter6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(Object)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Parking" + "'", str1, "Parking");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.setLocationByPlatform(false);
        java.awt.Image image3 = null;
        parkingGUI0.setIconImage(image3);
        park.ParkingGUI parkingGUI5 = new park.ParkingGUI();
        parkingGUI5.setFocusable(false);
        java.awt.Event event8 = null;
        boolean boolean11 = parkingGUI5.mouseDrag(event8, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle12 = parkingGUI5.getBounds();
        parkingGUI0.setMixingCutoutShape((java.awt.Shape) rectangle12);
        boolean boolean14 = parkingGUI0.isUndecorated();
        park.ParkingGUI parkingGUI15 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener16 = null;
        parkingGUI15.addMouseWheelListener(mouseWheelListener16);
        java.awt.Point point19 = parkingGUI15.getMousePosition(true);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray20 = parkingGUI15.getPropertyChangeListeners();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener21 = null;
        parkingGUI15.removeHierarchyBoundsListener(hierarchyBoundsListener21);
        java.awt.Image image25 = parkingGUI15.createImage(6, (int) (short) 100);
        park.ParkingGUI parkingGUI28 = new park.ParkingGUI();
        parkingGUI28.setFocusable(false);
        java.awt.Event event31 = null;
        boolean boolean34 = parkingGUI28.mouseDrag(event31, (int) (byte) 1, (int) (short) 1);
        parkingGUI28.transferFocusBackward();
        park.ParkingGUI parkingGUI36 = new park.ParkingGUI();
        java.awt.Dimension dimension37 = null;
        parkingGUI36.setPreferredSize(dimension37);
        parkingGUI36.resize(7, 0);
        boolean boolean42 = parkingGUI36.isEnabled();
        parkingGUI36.setAlwaysOnTop(false);
        boolean boolean45 = parkingGUI36.isShowing();
        java.awt.Point point46 = null;
        java.awt.Point point47 = parkingGUI36.getLocation(point46);
        java.awt.Component component48 = parkingGUI28.findComponentAt(point47);
        java.awt.Event event49 = null;
        boolean boolean52 = parkingGUI28.mouseMove(event49, 10, (int) (short) 1);
        parkingGUI28.hide();
        boolean boolean54 = parkingGUI0.prepareImage(image25, 8, (int) (byte) 1, (java.awt.image.ImageObserver) parkingGUI28);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(rectangle12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(point19);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray20);
        org.junit.Assert.assertNotNull(image25);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(point47);
        org.junit.Assert.assertNotNull(component48);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingGUI0.getMousePosition(true);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray5 = parkingGUI0.getPropertyChangeListeners();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener6 = null;
        parkingGUI0.removeHierarchyBoundsListener(hierarchyBoundsListener6);
        java.awt.GraphicsConfiguration graphicsConfiguration8 = parkingGUI0.getGraphicsConfiguration();
        java.awt.Image image9 = parkingGUI0.getIconImage();
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray5);
        org.junit.Assert.assertNotNull(graphicsConfiguration8);
        org.junit.Assert.assertNull(image9);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingGUI0.getMousePosition(true);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray5 = parkingGUI0.getPropertyChangeListeners();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener6 = null;
        parkingGUI0.removeHierarchyBoundsListener(hierarchyBoundsListener6);
        java.awt.Image image10 = parkingGUI0.createImage(6, (int) (short) 100);
        park.ParkingGUI parkingGUI11 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener12 = null;
        parkingGUI11.addMouseWheelListener(mouseWheelListener12);
        java.awt.Point point15 = parkingGUI11.getMousePosition(true);
        java.awt.event.MouseListener mouseListener16 = null;
        parkingGUI11.addMouseListener(mouseListener16);
        java.awt.Component component18 = parkingGUI11.getMostRecentFocusOwner();
        javax.swing.JMenuBar jMenuBar19 = parkingGUI11.getJMenuBar();
        parkingGUI11.disable();
        java.awt.event.InputMethodListener inputMethodListener21 = null;
        parkingGUI11.removeInputMethodListener(inputMethodListener21);
        int int23 = parkingGUI0.getComponentZOrder((java.awt.Component) parkingGUI11);
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray5);
        org.junit.Assert.assertNotNull(image10);
        org.junit.Assert.assertNull(point15);
        org.junit.Assert.assertNotNull(component18);
        org.junit.Assert.assertNull(jMenuBar19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.Dimension dimension1 = null;
        parkingGUI0.setPreferredSize(dimension1);
        parkingGUI0.resize(7, 0);
        boolean boolean6 = parkingGUI0.isEnabled();
        java.awt.Event event7 = null;
        boolean boolean9 = parkingGUI0.lostFocus(event7, (java.lang.Object) (short) 0);
        parkingGUI0.setFocusCycleRoot(true);
        park.ParkingGUI parkingGUI12 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener13 = null;
        parkingGUI12.addMouseWheelListener(mouseWheelListener13);
        java.awt.Point point16 = parkingGUI12.getMousePosition(true);
        java.awt.event.MouseListener mouseListener17 = null;
        parkingGUI12.addMouseListener(mouseListener17);
        java.awt.Component component19 = parkingGUI12.getMostRecentFocusOwner();
        java.awt.MenuBar menuBar20 = null;
        parkingGUI12.setMenuBar(menuBar20);
        park.ParkingGUI parkingGUI22 = new park.ParkingGUI();
        java.lang.String str23 = parkingGUI22.getTitle();
        java.awt.Cursor cursor24 = null;
        parkingGUI22.setCursor(cursor24);
        java.awt.Dimension dimension26 = parkingGUI22.size();
        parkingGUI12.setPreferredSize(dimension26);
        java.awt.Dimension dimension28 = parkingGUI0.getSize(dimension26);
        parkingGUI0.repaint();
        java.awt.im.InputMethodRequests inputMethodRequests30 = parkingGUI0.getInputMethodRequests();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(point16);
// flaky:         org.junit.Assert.assertNull(component19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Parking" + "'", str23, "Parking");
        org.junit.Assert.assertNotNull(dimension26);
        org.junit.Assert.assertNotNull(dimension28);
        org.junit.Assert.assertNull(inputMethodRequests30);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.lang.String str1 = parkingGUI0.getTitle();
        java.awt.Cursor cursor2 = null;
        parkingGUI0.setCursor(cursor2);
        java.awt.event.WindowListener windowListener4 = null;
        parkingGUI0.addWindowListener(windowListener4);
        parkingGUI0.firePropertyChange("Parking", (long) '#', (long) (byte) 0);
        java.awt.Color color10 = parkingGUI0.getBackground();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Parking" + "'", str1, "Parking");
        org.junit.Assert.assertNotNull(color10);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingGUI0.getMousePosition(true);
        park.ParkingGUI parkingGUI5 = new park.ParkingGUI();
        parkingGUI5.setLocationByPlatform(false);
        java.awt.Image image8 = null;
        parkingGUI5.setIconImage(image8);
        javax.swing.JMenuBar jMenuBar10 = null;
        parkingGUI5.setJMenuBar(jMenuBar10);
        java.awt.FocusTraversalPolicy focusTraversalPolicy12 = null;
        parkingGUI5.setFocusTraversalPolicy(focusTraversalPolicy12);
        park.ParkingGUI parkingGUI14 = new park.ParkingGUI();
        java.awt.Dimension dimension15 = null;
        parkingGUI14.setPreferredSize(dimension15);
        parkingGUI14.resize(7, 0);
        boolean boolean20 = parkingGUI14.isEnabled();
        java.awt.Event event21 = null;
        boolean boolean23 = parkingGUI14.lostFocus(event21, (java.lang.Object) (short) 0);
        java.awt.Font font24 = parkingGUI14.getFont();
        java.awt.FontMetrics fontMetrics25 = parkingGUI5.getFontMetrics(font24);
        java.awt.Cursor cursor26 = null;
        parkingGUI5.setCursor(cursor26);
        int int28 = parkingGUI0.getComponentZOrder((java.awt.Component) parkingGUI5);
        parkingGUI5.enable(false);
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(font24);
        org.junit.Assert.assertNotNull(fontMetrics25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.setLocationByPlatform(false);
        parkingGUI0.setVisible(true);
        java.awt.Dimension dimension5 = parkingGUI0.getMaximumSize();
        java.awt.Dimension dimension6 = parkingGUI0.size();
        java.awt.Insets insets7 = parkingGUI0.getInsets();
        parkingGUI0.setFocusable(true);
        parkingGUI0.layout();
        java.awt.Graphics graphics11 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingGUI0.paintComponents(graphics11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Graphics.getClip()\" because \"g\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dimension5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNotNull(insets7);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.event.MouseMotionListener mouseMotionListener3 = null;
        parkingGUI0.removeMouseMotionListener(mouseMotionListener3);
        java.awt.event.HierarchyListener[] hierarchyListenerArray5 = parkingGUI0.getHierarchyListeners();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener6 = null;
        parkingGUI0.removeHierarchyBoundsListener(hierarchyBoundsListener6);
        java.io.PrintStream printStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingGUI0.list(printStream8, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintStream.println(Object)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hierarchyListenerArray5);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.lang.String str1 = parkingGUI0.getTitle();
        java.awt.Cursor cursor2 = null;
        parkingGUI0.setCursor(cursor2);
        java.awt.event.WindowListener windowListener4 = null;
        parkingGUI0.addWindowListener(windowListener4);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior6 = parkingGUI0.getBaselineResizeBehavior();
        boolean boolean7 = parkingGUI0.isAutoRequestFocus();
        java.awt.event.HierarchyListener hierarchyListener8 = null;
        parkingGUI0.addHierarchyListener(hierarchyListener8);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Parking" + "'", str1, "Parking");
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior6 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior6.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = parkingGUI0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle7 = parkingGUI0.getBounds();
        java.awt.Component component10 = parkingGUI0.getComponentAt(7, 6);
        park.ParkingGUI parkingGUI11 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener12 = null;
        parkingGUI11.addMouseWheelListener(mouseWheelListener12);
        java.awt.Point point15 = parkingGUI11.getMousePosition(true);
        java.awt.event.MouseListener mouseListener16 = null;
        parkingGUI11.addMouseListener(mouseListener16);
        java.awt.LayoutManager layoutManager18 = parkingGUI11.getLayout();
        parkingGUI11.move(11, 6);
        int int22 = parkingGUI0.getComponentZOrder((java.awt.Component) parkingGUI11);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        parkingGUI11.removePropertyChangeListener("Parking", propertyChangeListener24);
        parkingGUI11.setAlwaysOnTop(false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(rectangle7);
        org.junit.Assert.assertNotNull(component10);
        org.junit.Assert.assertNull(point15);
        org.junit.Assert.assertNotNull(layoutManager18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingGUI0.getMousePosition(true);
        park.ParkingGUI parkingGUI5 = new park.ParkingGUI();
        parkingGUI5.setLocationByPlatform(false);
        java.awt.Image image8 = null;
        parkingGUI5.setIconImage(image8);
        javax.swing.JMenuBar jMenuBar10 = null;
        parkingGUI5.setJMenuBar(jMenuBar10);
        java.awt.FocusTraversalPolicy focusTraversalPolicy12 = null;
        parkingGUI5.setFocusTraversalPolicy(focusTraversalPolicy12);
        park.ParkingGUI parkingGUI14 = new park.ParkingGUI();
        java.awt.Dimension dimension15 = null;
        parkingGUI14.setPreferredSize(dimension15);
        parkingGUI14.resize(7, 0);
        boolean boolean20 = parkingGUI14.isEnabled();
        java.awt.Event event21 = null;
        boolean boolean23 = parkingGUI14.lostFocus(event21, (java.lang.Object) (short) 0);
        java.awt.Font font24 = parkingGUI14.getFont();
        java.awt.FontMetrics fontMetrics25 = parkingGUI5.getFontMetrics(font24);
        java.awt.Cursor cursor26 = null;
        parkingGUI5.setCursor(cursor26);
        int int28 = parkingGUI0.getComponentZOrder((java.awt.Component) parkingGUI5);
        java.awt.Image image29 = null;
        park.ParkingGUI parkingGUI30 = new park.ParkingGUI();
        parkingGUI30.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str35 = parkingGUI30.getTitle();
        int int36 = parkingGUI0.checkImage(image29, (java.awt.image.ImageObserver) parkingGUI30);
        park.ParkingGUI parkingGUI38 = new park.ParkingGUI();
        parkingGUI38.setFocusable(false);
        java.awt.Event event41 = null;
        boolean boolean44 = parkingGUI38.mouseDrag(event41, (int) (byte) 1, (int) (short) 1);
        boolean boolean45 = parkingGUI38.getFocusableWindowState();
        javax.swing.JLayeredPane jLayeredPane46 = parkingGUI38.getLayeredPane();
        park.ParkingGUI parkingGUI47 = new park.ParkingGUI();
        java.awt.Dimension dimension48 = null;
        parkingGUI47.setPreferredSize(dimension48);
        parkingGUI47.resize(7, 0);
        java.awt.Event event53 = null;
        park.ParkingGUI parkingGUI54 = new park.ParkingGUI();
        parkingGUI54.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.awt.Color color59 = parkingGUI54.getForeground();
        boolean boolean60 = parkingGUI47.action(event53, (java.lang.Object) parkingGUI54);
        java.awt.Dimension dimension61 = parkingGUI54.size();
        parkingGUI38.setSize(dimension61);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component63 = parkingGUI0.add("hi!", (java.awt.Component) parkingGUI38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(font24);
        org.junit.Assert.assertNotNull(fontMetrics25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Parking" + "'", str35, "Parking");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 32 + "'", int36 == 32);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(jLayeredPane46);
        org.junit.Assert.assertNotNull(color59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(dimension61);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.Dimension dimension1 = null;
        parkingGUI0.setPreferredSize(dimension1);
        parkingGUI0.resize(7, 0);
        boolean boolean6 = parkingGUI0.isEnabled();
        java.awt.Event event7 = null;
        boolean boolean9 = parkingGUI0.lostFocus(event7, (java.lang.Object) (short) 0);
        parkingGUI0.setFocusable(false);
        boolean boolean12 = parkingGUI0.isFocusable();
        boolean boolean14 = parkingGUI0.areFocusTraversalKeysSet((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingGUI0.getMousePosition(true);
        boolean boolean5 = parkingGUI0.isAlwaysOnTopSupported();
        java.awt.event.HierarchyListener[] hierarchyListenerArray6 = parkingGUI0.getHierarchyListeners();
        park.ParkingGUI parkingGUI7 = new park.ParkingGUI();
        java.awt.Dimension dimension8 = null;
        parkingGUI7.setPreferredSize(dimension8);
        parkingGUI7.resize(7, 0);
        java.awt.Event event13 = null;
        park.ParkingGUI parkingGUI14 = new park.ParkingGUI();
        parkingGUI14.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.awt.Color color19 = parkingGUI14.getForeground();
        boolean boolean20 = parkingGUI7.action(event13, (java.lang.Object) parkingGUI14);
        java.awt.Dimension dimension21 = parkingGUI14.size();
        park.ParkingGUI parkingGUI22 = new park.ParkingGUI();
        parkingGUI22.firePropertyChange("", (long) 7, (long) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            parkingGUI0.add((java.awt.Component) parkingGUI14, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(hierarchyListenerArray6);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(dimension21);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str5 = parkingGUI0.getTitle();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior6 = parkingGUI0.getBaselineResizeBehavior();
        java.awt.event.WindowListener windowListener7 = null;
        parkingGUI0.addWindowListener(windowListener7);
        java.awt.event.WindowFocusListener windowFocusListener9 = null;
        parkingGUI0.addWindowFocusListener(windowFocusListener9);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        parkingGUI0.removePropertyChangeListener("", propertyChangeListener12);
        java.awt.event.ComponentListener componentListener14 = null;
        parkingGUI0.removeComponentListener(componentListener14);
        boolean boolean16 = parkingGUI0.isActive();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Parking" + "'", str5, "Parking");
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior6 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior6.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.util.Locale locale5 = null;
        parkingGUI0.setLocale(locale5);
        park.ParkingGUI parkingGUI7 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener8 = null;
        parkingGUI7.addMouseWheelListener(mouseWheelListener8);
        java.awt.Point point11 = parkingGUI7.getMousePosition(true);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray12 = parkingGUI7.getPropertyChangeListeners();
        java.awt.event.ComponentListener componentListener13 = null;
        parkingGUI7.addComponentListener(componentListener13);
        parkingGUI7.setCursor((int) (short) 1);
        int int17 = parkingGUI0.getComponentZOrder((java.awt.Component) parkingGUI7);
        org.junit.Assert.assertNull(point11);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingGUI0.getMousePosition(true);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray5 = parkingGUI0.getPropertyChangeListeners();
        java.awt.event.ComponentListener componentListener6 = null;
        parkingGUI0.addComponentListener(componentListener6);
        parkingGUI0.setCursor((int) (short) 1);
        java.awt.Component component10 = parkingGUI0.getFocusOwner();
        parkingGUI0.move(1, 10);
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray5);
        org.junit.Assert.assertNull(component10);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingGUI0.getMousePosition(true);
        park.ParkingGUI parkingGUI5 = new park.ParkingGUI();
        parkingGUI5.setLocationByPlatform(false);
        java.awt.Image image8 = null;
        parkingGUI5.setIconImage(image8);
        javax.swing.JMenuBar jMenuBar10 = null;
        parkingGUI5.setJMenuBar(jMenuBar10);
        java.awt.FocusTraversalPolicy focusTraversalPolicy12 = null;
        parkingGUI5.setFocusTraversalPolicy(focusTraversalPolicy12);
        park.ParkingGUI parkingGUI14 = new park.ParkingGUI();
        java.awt.Dimension dimension15 = null;
        parkingGUI14.setPreferredSize(dimension15);
        parkingGUI14.resize(7, 0);
        boolean boolean20 = parkingGUI14.isEnabled();
        java.awt.Event event21 = null;
        boolean boolean23 = parkingGUI14.lostFocus(event21, (java.lang.Object) (short) 0);
        java.awt.Font font24 = parkingGUI14.getFont();
        java.awt.FontMetrics fontMetrics25 = parkingGUI5.getFontMetrics(font24);
        java.awt.Cursor cursor26 = null;
        parkingGUI5.setCursor(cursor26);
        int int28 = parkingGUI0.getComponentZOrder((java.awt.Component) parkingGUI5);
        java.awt.Image image29 = null;
        park.ParkingGUI parkingGUI30 = new park.ParkingGUI();
        parkingGUI30.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str35 = parkingGUI30.getTitle();
        int int36 = parkingGUI0.checkImage(image29, (java.awt.image.ImageObserver) parkingGUI30);
        java.awt.LayoutManager layoutManager37 = parkingGUI30.getLayout();
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(font24);
        org.junit.Assert.assertNotNull(fontMetrics25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Parking" + "'", str35, "Parking");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 32 + "'", int36 == 32);
        org.junit.Assert.assertNotNull(layoutManager37);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.util.Locale locale5 = null;
        parkingGUI0.setLocale(locale5);
        java.awt.event.InputMethodListener inputMethodListener7 = null;
        parkingGUI0.removeInputMethodListener(inputMethodListener7);
        // The following exception was thrown during execution in test generation
        try {
            parkingGUI0.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = parkingGUI0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        parkingGUI0.transferFocusBackward();
        java.awt.Event event8 = null;
        boolean boolean11 = parkingGUI0.mouseDown(event8, (int) (short) 10, (int) (byte) 100);
        java.awt.Image image12 = null;
        parkingGUI0.setIconImage(image12);
        parkingGUI0.setState(7);
        parkingGUI0.resize(7, (-1));
        java.awt.event.HierarchyListener hierarchyListener19 = null;
        parkingGUI0.removeHierarchyListener(hierarchyListener19);
        park.ParkingGUI parkingGUI21 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener22 = null;
        parkingGUI21.addMouseWheelListener(mouseWheelListener22);
        java.awt.Point point25 = parkingGUI21.getMousePosition(true);
        java.awt.event.MouseListener mouseListener26 = null;
        parkingGUI21.addMouseListener(mouseListener26);
        java.awt.LayoutManager layoutManager28 = parkingGUI21.getLayout();
        parkingGUI0.setLayout(layoutManager28);
        java.awt.event.ComponentListener componentListener30 = null;
        parkingGUI0.removeComponentListener(componentListener30);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(point25);
        org.junit.Assert.assertNotNull(layoutManager28);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingGUI0.getMousePosition(true);
        park.ParkingGUI parkingGUI5 = new park.ParkingGUI();
        parkingGUI5.setLocationByPlatform(false);
        java.awt.Image image8 = null;
        parkingGUI5.setIconImage(image8);
        javax.swing.JMenuBar jMenuBar10 = null;
        parkingGUI5.setJMenuBar(jMenuBar10);
        java.awt.FocusTraversalPolicy focusTraversalPolicy12 = null;
        parkingGUI5.setFocusTraversalPolicy(focusTraversalPolicy12);
        park.ParkingGUI parkingGUI14 = new park.ParkingGUI();
        java.awt.Dimension dimension15 = null;
        parkingGUI14.setPreferredSize(dimension15);
        parkingGUI14.resize(7, 0);
        boolean boolean20 = parkingGUI14.isEnabled();
        java.awt.Event event21 = null;
        boolean boolean23 = parkingGUI14.lostFocus(event21, (java.lang.Object) (short) 0);
        java.awt.Font font24 = parkingGUI14.getFont();
        java.awt.FontMetrics fontMetrics25 = parkingGUI5.getFontMetrics(font24);
        java.awt.Cursor cursor26 = null;
        parkingGUI5.setCursor(cursor26);
        int int28 = parkingGUI0.getComponentZOrder((java.awt.Component) parkingGUI5);
        park.ParkingGUI parkingGUI29 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener30 = null;
        parkingGUI29.addMouseWheelListener(mouseWheelListener30);
        java.awt.Point point33 = parkingGUI29.getMousePosition(true);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray34 = parkingGUI29.getPropertyChangeListeners();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener35 = null;
        parkingGUI29.removeHierarchyBoundsListener(hierarchyBoundsListener35);
        java.awt.Image image39 = parkingGUI29.createImage(6, (int) (short) 100);
        java.awt.Cursor cursor40 = parkingGUI29.getCursor();
        parkingGUI5.setCursor(cursor40);
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(font24);
        org.junit.Assert.assertNotNull(fontMetrics25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNull(point33);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray34);
        org.junit.Assert.assertNotNull(image39);
        org.junit.Assert.assertNotNull(cursor40);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str5 = parkingGUI0.getTitle();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior6 = parkingGUI0.getBaselineResizeBehavior();
        java.awt.event.WindowListener windowListener7 = null;
        parkingGUI0.addWindowListener(windowListener7);
        park.ParkingGUI parkingGUI9 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener10 = null;
        parkingGUI9.addMouseWheelListener(mouseWheelListener10);
        java.awt.Point point13 = parkingGUI9.getMousePosition(true);
        java.awt.event.MouseListener mouseListener14 = null;
        parkingGUI9.addMouseListener(mouseListener14);
        park.ParkingGUI parkingGUI16 = new park.ParkingGUI();
        parkingGUI16.setFocusable(false);
        java.awt.Event event19 = null;
        boolean boolean22 = parkingGUI16.mouseDrag(event19, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle23 = parkingGUI16.getBounds();
        java.awt.Rectangle rectangle24 = parkingGUI9.getBounds(rectangle23);
        parkingGUI0.setMaximizedBounds(rectangle24);
        parkingGUI0.setAlwaysOnTop(false);
        java.util.List<java.awt.Image> imageList28 = parkingGUI0.getIconImages();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Parking" + "'", str5, "Parking");
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior6 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior6.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNull(point13);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(rectangle23);
        org.junit.Assert.assertNotNull(rectangle24);
        org.junit.Assert.assertNotNull(imageList28);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = parkingGUI0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        boolean boolean7 = parkingGUI0.getFocusableWindowState();
        javax.swing.JLayeredPane jLayeredPane8 = parkingGUI0.getLayeredPane();
        boolean boolean9 = parkingGUI0.isPreferredSizeSet();
        parkingGUI0.validate();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(jLayeredPane8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingGUI0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        parkingGUI0.addMouseListener(mouseListener5);
        java.awt.image.ColorModel colorModel7 = parkingGUI0.getColorModel();
        java.awt.Toolkit toolkit8 = parkingGUI0.getToolkit();
        parkingGUI0.firePropertyChange("hi!", 'a', ' ');
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(colorModel7);
        org.junit.Assert.assertNotNull(toolkit8);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.event.MouseMotionListener mouseMotionListener3 = null;
        parkingGUI0.removeMouseMotionListener(mouseMotionListener3);
        java.awt.Event event5 = null;
        boolean boolean8 = parkingGUI0.mouseUp(event5, (int) (short) 0, (int) (short) -1);
        java.awt.Component component11 = parkingGUI0.locate(5, (int) ' ');
        boolean boolean12 = parkingGUI0.hasFocus();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(component11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.setLocationByPlatform(false);
        parkingGUI0.setVisible(true);
        int int7 = parkingGUI0.getBaseline(1, 10);
        java.awt.Point point8 = parkingGUI0.getLocation();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(point8);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.util.Locale locale5 = null;
        parkingGUI0.setLocale(locale5);
        java.awt.LayoutManager layoutManager7 = parkingGUI0.getLayout();
        // The following exception was thrown during execution in test generation
        try {
            parkingGUI0.setUndecorated(true);
            org.junit.Assert.fail("Expected exception of type java.awt.IllegalComponentStateException; message: The frame is displayable.");
        } catch (java.awt.IllegalComponentStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(layoutManager7);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = parkingGUI0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle7 = parkingGUI0.getBounds();
        java.awt.Dimension dimension8 = parkingGUI0.getPreferredSize();
        javax.swing.JRootPane jRootPane9 = parkingGUI0.getRootPane();
        boolean boolean10 = parkingGUI0.isOpaque();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.VolatileImage volatileImage13 = parkingGUI0.createVolatileImage(0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Width (0) and height (10) cannot be <= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(rectangle7);
        org.junit.Assert.assertNotNull(dimension8);
        org.junit.Assert.assertNotNull(jRootPane9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.awt.Color color5 = parkingGUI0.getForeground();
        java.awt.Point point6 = parkingGUI0.getMousePosition();
        park.ParkingGUI parkingGUI7 = new park.ParkingGUI();
        parkingGUI7.setFocusable(false);
        java.awt.Event event10 = null;
        boolean boolean13 = parkingGUI7.mouseDrag(event10, (int) (byte) 1, (int) (short) 1);
        parkingGUI7.transferFocusBackward();
        java.awt.Event event15 = null;
        boolean boolean18 = parkingGUI7.mouseDown(event15, (int) (short) 10, (int) (byte) 100);
        park.ParkingGUI parkingGUI19 = new park.ParkingGUI();
        parkingGUI19.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str24 = parkingGUI19.getTitle();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior25 = parkingGUI19.getBaselineResizeBehavior();
        park.ParkingGUI parkingGUI26 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener27 = null;
        parkingGUI26.addMouseWheelListener(mouseWheelListener27);
        java.awt.Point point30 = parkingGUI26.getMousePosition(true);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray31 = parkingGUI26.getPropertyChangeListeners();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener32 = null;
        parkingGUI26.removeHierarchyBoundsListener(hierarchyBoundsListener32);
        java.awt.Image image36 = parkingGUI26.createImage(6, (int) (short) 100);
        parkingGUI19.setIconImage(image36);
        park.ParkingGUI parkingGUI38 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener39 = null;
        parkingGUI38.addMouseWheelListener(mouseWheelListener39);
        java.awt.event.MouseMotionListener mouseMotionListener41 = null;
        parkingGUI38.removeMouseMotionListener(mouseMotionListener41);
        java.awt.Event event43 = null;
        boolean boolean46 = parkingGUI38.mouseUp(event43, (int) (short) 0, (int) (short) -1);
        java.awt.Component component49 = parkingGUI38.locate(5, (int) ' ');
        int int50 = parkingGUI7.checkImage(image36, (java.awt.image.ImageObserver) component49);
        park.ParkingGUI parkingGUI53 = new park.ParkingGUI();
        parkingGUI53.setLocationByPlatform(false);
        parkingGUI53.firePropertyChange("Parking", (short) (byte) -1, (short) (byte) 1);
        boolean boolean60 = parkingGUI53.isFocusTraversable();
        boolean boolean61 = parkingGUI0.prepareImage(image36, 11, (int) (byte) 1, (java.awt.image.ImageObserver) parkingGUI53);
        parkingGUI0.toFront();
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(point6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Parking" + "'", str24, "Parking");
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior25 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior25.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNull(point30);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray31);
        org.junit.Assert.assertNotNull(image36);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(component49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 32 + "'", int50 == 32);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.Dimension dimension1 = null;
        parkingGUI0.setPreferredSize(dimension1);
        parkingGUI0.doLayout();
        boolean boolean5 = parkingGUI0.areFocusTraversalKeysSet((int) (short) 1);
        javax.swing.JRootPane jRootPane6 = parkingGUI0.getRootPane();
        int int7 = parkingGUI0.getHeight();
        java.awt.Image image8 = parkingGUI0.getIconImage();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jRootPane6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 200 + "'", int7 == 200);
        org.junit.Assert.assertNull(image8);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.Dimension dimension1 = null;
        parkingGUI0.setPreferredSize(dimension1);
        parkingGUI0.resize(7, 0);
        java.awt.Event event6 = null;
        park.ParkingGUI parkingGUI7 = new park.ParkingGUI();
        parkingGUI7.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.awt.Color color12 = parkingGUI7.getForeground();
        boolean boolean13 = parkingGUI0.action(event6, (java.lang.Object) parkingGUI7);
        java.awt.Dimension dimension14 = parkingGUI7.size();
        java.lang.String str15 = parkingGUI7.getTitle();
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dimension14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Parking" + "'", str15, "Parking");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.util.Locale locale5 = null;
        parkingGUI0.setLocale(locale5);
        java.awt.event.InputMethodListener inputMethodListener7 = null;
        parkingGUI0.removeInputMethodListener(inputMethodListener7);
        java.util.ResourceBundle resourceBundle9 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingGUI0.applyResourceBundle(resourceBundle9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ResourceBundle.getLocale()\" because \"bdl\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.lang.String str1 = parkingGUI0.getTitle();
        java.awt.Cursor cursor2 = null;
        parkingGUI0.setCursor(cursor2);
        java.awt.event.WindowListener windowListener4 = null;
        parkingGUI0.addWindowListener(windowListener4);
        java.awt.Component[] componentArray6 = parkingGUI0.getComponents();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Parking" + "'", str1, "Parking");
        org.junit.Assert.assertNotNull(componentArray6);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingGUI0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        parkingGUI0.addMouseListener(mouseListener5);
        java.awt.LayoutManager layoutManager7 = parkingGUI0.getLayout();
        parkingGUI0.move(11, 6);
        java.awt.dnd.DropTarget dropTarget11 = null;
        parkingGUI0.setDropTarget(dropTarget11);
        park.ParkingGUI parkingGUI13 = new park.ParkingGUI();
        parkingGUI13.setLocationByPlatform(false);
        parkingGUI13.setVisible(true);
        java.awt.Dimension dimension18 = parkingGUI13.getMaximumSize();
        java.awt.Dimension dimension19 = parkingGUI0.getSize(dimension18);
        java.awt.Event event20 = null;
        boolean boolean23 = parkingGUI0.mouseExit(event20, (int) (short) 0, (int) (short) 100);
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(layoutManager7);
        org.junit.Assert.assertNotNull(dimension18);
        org.junit.Assert.assertNotNull(dimension19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str5 = parkingGUI0.getTitle();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior6 = parkingGUI0.getBaselineResizeBehavior();
        java.awt.event.WindowListener windowListener7 = null;
        parkingGUI0.addWindowListener(windowListener7);
        java.awt.event.WindowFocusListener windowFocusListener9 = null;
        parkingGUI0.addWindowFocusListener(windowFocusListener9);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        parkingGUI0.removePropertyChangeListener("", propertyChangeListener12);
        parkingGUI0.setLocation((int) 'a', 32);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Parking" + "'", str5, "Parking");
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior6 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior6.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingGUI0.getMousePosition(true);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray5 = parkingGUI0.getPropertyChangeListeners();
        parkingGUI0.setFocusTraversalPolicyProvider(false);
        java.awt.Rectangle rectangle8 = parkingGUI0.getMaximizedBounds();
        java.awt.Window window9 = parkingGUI0.getOwner();
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray5);
        org.junit.Assert.assertNull(rectangle8);
        org.junit.Assert.assertNull(window9);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.setLocationByPlatform(false);
        parkingGUI0.firePropertyChange("Parking", (short) (byte) -1, (short) (byte) 1);
        boolean boolean7 = parkingGUI0.isOpaque();
        park.ParkingGUI parkingGUI8 = new park.ParkingGUI();
        parkingGUI8.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str13 = parkingGUI8.getTitle();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior14 = parkingGUI8.getBaselineResizeBehavior();
        java.awt.event.WindowListener windowListener15 = null;
        parkingGUI8.addWindowListener(windowListener15);
        park.ParkingGUI parkingGUI17 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener18 = null;
        parkingGUI17.addMouseWheelListener(mouseWheelListener18);
        java.awt.Point point21 = parkingGUI17.getMousePosition(true);
        java.awt.event.MouseListener mouseListener22 = null;
        parkingGUI17.addMouseListener(mouseListener22);
        park.ParkingGUI parkingGUI24 = new park.ParkingGUI();
        parkingGUI24.setFocusable(false);
        java.awt.Event event27 = null;
        boolean boolean30 = parkingGUI24.mouseDrag(event27, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle31 = parkingGUI24.getBounds();
        java.awt.Rectangle rectangle32 = parkingGUI17.getBounds(rectangle31);
        parkingGUI8.setMaximizedBounds(rectangle32);
        parkingGUI0.setShape((java.awt.Shape) rectangle32);
        java.awt.Event event35 = null;
        boolean boolean37 = parkingGUI0.keyDown(event35, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Parking" + "'", str13, "Parking");
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior14 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior14.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNull(point21);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(rectangle31);
        org.junit.Assert.assertNotNull(rectangle32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = parkingGUI0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle7 = parkingGUI0.getBounds();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray8 = parkingGUI0.getPropertyChangeListeners();
        int int9 = parkingGUI0.getX();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(rectangle7);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.setLocationByPlatform(false);
        java.awt.Image image3 = null;
        parkingGUI0.setIconImage(image3);
        javax.swing.JMenuBar jMenuBar5 = null;
        parkingGUI0.setJMenuBar(jMenuBar5);
        java.awt.FocusTraversalPolicy focusTraversalPolicy7 = null;
        parkingGUI0.setFocusTraversalPolicy(focusTraversalPolicy7);
        park.ParkingGUI parkingGUI9 = new park.ParkingGUI();
        java.awt.Dimension dimension10 = null;
        parkingGUI9.setPreferredSize(dimension10);
        parkingGUI9.resize(7, 0);
        boolean boolean15 = parkingGUI9.isEnabled();
        java.awt.Event event16 = null;
        boolean boolean18 = parkingGUI9.lostFocus(event16, (java.lang.Object) (short) 0);
        java.awt.Font font19 = parkingGUI9.getFont();
        java.awt.FontMetrics fontMetrics20 = parkingGUI0.getFontMetrics(font19);
        java.awt.event.FocusListener focusListener21 = null;
        parkingGUI0.addFocusListener(focusListener21);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertNotNull(fontMetrics20);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = parkingGUI0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle7 = parkingGUI0.getBounds();
        java.awt.Dimension dimension8 = parkingGUI0.getPreferredSize();
        javax.swing.JRootPane jRootPane9 = parkingGUI0.getRootPane();
        parkingGUI0.setIgnoreRepaint(false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(rectangle7);
        org.junit.Assert.assertNotNull(dimension8);
        org.junit.Assert.assertNotNull(jRootPane9);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingGUI0.getMousePosition(true);
        park.ParkingGUI parkingGUI5 = new park.ParkingGUI();
        parkingGUI5.setLocationByPlatform(false);
        java.awt.Image image8 = null;
        parkingGUI5.setIconImage(image8);
        javax.swing.JMenuBar jMenuBar10 = null;
        parkingGUI5.setJMenuBar(jMenuBar10);
        java.awt.FocusTraversalPolicy focusTraversalPolicy12 = null;
        parkingGUI5.setFocusTraversalPolicy(focusTraversalPolicy12);
        park.ParkingGUI parkingGUI14 = new park.ParkingGUI();
        java.awt.Dimension dimension15 = null;
        parkingGUI14.setPreferredSize(dimension15);
        parkingGUI14.resize(7, 0);
        boolean boolean20 = parkingGUI14.isEnabled();
        java.awt.Event event21 = null;
        boolean boolean23 = parkingGUI14.lostFocus(event21, (java.lang.Object) (short) 0);
        java.awt.Font font24 = parkingGUI14.getFont();
        java.awt.FontMetrics fontMetrics25 = parkingGUI5.getFontMetrics(font24);
        java.awt.Cursor cursor26 = null;
        parkingGUI5.setCursor(cursor26);
        int int28 = parkingGUI0.getComponentZOrder((java.awt.Component) parkingGUI5);
        java.awt.image.VolatileImage volatileImage31 = parkingGUI0.createVolatileImage(128, (int) 'a');
        java.awt.Rectangle rectangle32 = parkingGUI0.getBounds();
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(font24);
        org.junit.Assert.assertNotNull(fontMetrics25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(volatileImage31);
        org.junit.Assert.assertNotNull(rectangle32);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.lang.String str1 = parkingGUI0.getTitle();
        java.awt.Cursor cursor2 = null;
        parkingGUI0.setCursor(cursor2);
        java.awt.event.WindowListener windowListener4 = null;
        parkingGUI0.addWindowListener(windowListener4);
        parkingGUI0.layout();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Parking" + "'", str1, "Parking");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.event.MouseMotionListener mouseMotionListener3 = null;
        parkingGUI0.removeMouseMotionListener(mouseMotionListener3);
        java.awt.event.HierarchyListener[] hierarchyListenerArray5 = parkingGUI0.getHierarchyListeners();
        park.ParkingGUI parkingGUI6 = new park.ParkingGUI();
        parkingGUI6.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str11 = parkingGUI6.getTitle();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior12 = parkingGUI6.getBaselineResizeBehavior();
        park.ParkingGUI parkingGUI13 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener14 = null;
        parkingGUI13.addMouseWheelListener(mouseWheelListener14);
        java.awt.Point point17 = parkingGUI13.getMousePosition(true);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray18 = parkingGUI13.getPropertyChangeListeners();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener19 = null;
        parkingGUI13.removeHierarchyBoundsListener(hierarchyBoundsListener19);
        java.awt.Image image23 = parkingGUI13.createImage(6, (int) (short) 100);
        parkingGUI6.setIconImage(image23);
        park.ParkingGUI parkingGUI27 = new park.ParkingGUI();
        parkingGUI27.setFocusable(false);
        java.awt.Event event30 = null;
        boolean boolean33 = parkingGUI27.mouseDrag(event30, (int) (byte) 1, (int) (short) 1);
        java.awt.event.WindowListener windowListener34 = null;
        parkingGUI27.removeWindowListener(windowListener34);
        java.awt.event.MouseMotionListener mouseMotionListener36 = null;
        parkingGUI27.addMouseMotionListener(mouseMotionListener36);
        int int38 = parkingGUI0.checkImage(image23, 1, (int) '4', (java.awt.image.ImageObserver) parkingGUI27);
        java.awt.Point point39 = parkingGUI0.getMousePosition();
        org.junit.Assert.assertNotNull(hierarchyListenerArray5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking" + "'", str11, "Parking");
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior12 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior12.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNull(point17);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray18);
        org.junit.Assert.assertNotNull(image23);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 32 + "'", int38 == 32);
        org.junit.Assert.assertNull(point39);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.Dimension dimension1 = null;
        parkingGUI0.setPreferredSize(dimension1);
        parkingGUI0.resize(7, 0);
        boolean boolean6 = parkingGUI0.isEnabled();
        java.awt.Event event7 = null;
        boolean boolean9 = parkingGUI0.lostFocus(event7, (java.lang.Object) (short) 0);
        parkingGUI0.setFocusCycleRoot(true);
        java.awt.Dimension dimension12 = parkingGUI0.getMaximumSize();
        java.awt.im.InputContext inputContext13 = parkingGUI0.getInputContext();
        java.awt.BufferCapabilities bufferCapabilities15 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingGUI0.createBufferStrategy((int) '#', bufferCapabilities15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No capabilities specified");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dimension12);
        org.junit.Assert.assertNotNull(inputContext13);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = parkingGUI0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        java.awt.event.KeyListener[] keyListenerArray7 = parkingGUI0.getKeyListeners();
        park.ParkingGUI parkingGUI8 = new park.ParkingGUI();
        parkingGUI8.setFocusable(false);
        java.awt.Event event11 = null;
        boolean boolean14 = parkingGUI8.mouseDrag(event11, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle15 = parkingGUI8.getBounds();
        java.awt.Component component18 = parkingGUI8.getComponentAt(7, 6);
        parkingGUI8.setName("");
        java.awt.ImageCapabilities imageCapabilities23 = null;
        java.awt.image.VolatileImage volatileImage24 = parkingGUI8.createVolatileImage(12, 64, imageCapabilities23);
        park.ParkingGUI parkingGUI25 = new park.ParkingGUI();
        java.awt.Dimension dimension26 = null;
        parkingGUI25.setPreferredSize(dimension26);
        parkingGUI25.resize(7, 0);
        boolean boolean31 = parkingGUI25.isEnabled();
        parkingGUI25.setAlwaysOnTop(false);
        int int34 = parkingGUI0.checkImage((java.awt.Image) volatileImage24, (java.awt.image.ImageObserver) parkingGUI25);
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        parkingGUI0.removePropertyChangeListener("hi!", propertyChangeListener36);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(keyListenerArray7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(rectangle15);
        org.junit.Assert.assertNotNull(component18);
        org.junit.Assert.assertNotNull(volatileImage24);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 32 + "'", int34 == 32);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.setLocationByPlatform(false);
        java.awt.Image image3 = null;
        parkingGUI0.setIconImage(image3);
        park.ParkingGUI parkingGUI5 = new park.ParkingGUI();
        parkingGUI5.setFocusable(false);
        java.awt.Event event8 = null;
        boolean boolean11 = parkingGUI5.mouseDrag(event8, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle12 = parkingGUI5.getBounds();
        parkingGUI0.setMixingCutoutShape((java.awt.Shape) rectangle12);
        boolean boolean14 = parkingGUI0.isUndecorated();
        java.awt.Graphics graphics15 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingGUI0.paintComponents(graphics15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Graphics.getClip()\" because \"g\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(rectangle12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = parkingGUI0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        java.awt.event.WindowListener windowListener7 = null;
        parkingGUI0.removeWindowListener(windowListener7);
        java.awt.event.MouseMotionListener mouseMotionListener9 = null;
        parkingGUI0.addMouseMotionListener(mouseMotionListener9);
        java.awt.event.WindowFocusListener windowFocusListener11 = null;
        parkingGUI0.addWindowFocusListener(windowFocusListener11);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str5 = parkingGUI0.getTitle();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior6 = parkingGUI0.getBaselineResizeBehavior();
        javax.swing.TransferHandler transferHandler7 = parkingGUI0.getTransferHandler();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Parking" + "'", str5, "Parking");
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior6 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior6.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNull(transferHandler7);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = parkingGUI0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        boolean boolean7 = parkingGUI0.getFocusableWindowState();
        parkingGUI0.setLocation(5, (int) 'a');
        java.util.Set<java.awt.AWTKeyStroke> aWTKeyStrokeSet12 = parkingGUI0.getFocusTraversalKeys(0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(aWTKeyStrokeSet12);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.event.MouseMotionListener mouseMotionListener3 = null;
        parkingGUI0.removeMouseMotionListener(mouseMotionListener3);
        java.awt.event.HierarchyListener[] hierarchyListenerArray5 = parkingGUI0.getHierarchyListeners();
        park.ParkingGUI parkingGUI6 = new park.ParkingGUI();
        parkingGUI6.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str11 = parkingGUI6.getTitle();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior12 = parkingGUI6.getBaselineResizeBehavior();
        park.ParkingGUI parkingGUI13 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener14 = null;
        parkingGUI13.addMouseWheelListener(mouseWheelListener14);
        java.awt.Point point17 = parkingGUI13.getMousePosition(true);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray18 = parkingGUI13.getPropertyChangeListeners();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener19 = null;
        parkingGUI13.removeHierarchyBoundsListener(hierarchyBoundsListener19);
        java.awt.Image image23 = parkingGUI13.createImage(6, (int) (short) 100);
        parkingGUI6.setIconImage(image23);
        park.ParkingGUI parkingGUI27 = new park.ParkingGUI();
        parkingGUI27.setFocusable(false);
        java.awt.Event event30 = null;
        boolean boolean33 = parkingGUI27.mouseDrag(event30, (int) (byte) 1, (int) (short) 1);
        java.awt.event.WindowListener windowListener34 = null;
        parkingGUI27.removeWindowListener(windowListener34);
        java.awt.event.MouseMotionListener mouseMotionListener36 = null;
        parkingGUI27.addMouseMotionListener(mouseMotionListener36);
        int int38 = parkingGUI0.checkImage(image23, 1, (int) '4', (java.awt.image.ImageObserver) parkingGUI27);
        java.awt.Component component39 = parkingGUI27.getFocusOwner();
        parkingGUI27.show();
        org.junit.Assert.assertNotNull(hierarchyListenerArray5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking" + "'", str11, "Parking");
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior12 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior12.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNull(point17);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray18);
        org.junit.Assert.assertNotNull(image23);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 32 + "'", int38 == 32);
        org.junit.Assert.assertNull(component39);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.Dimension dimension1 = null;
        parkingGUI0.setPreferredSize(dimension1);
        parkingGUI0.resize(7, 0);
        boolean boolean6 = parkingGUI0.isEnabled();
        java.awt.Event event7 = null;
        boolean boolean9 = parkingGUI0.lostFocus(event7, (java.lang.Object) (short) 0);
        parkingGUI0.setFocusCycleRoot(true);
        java.awt.ComponentOrientation componentOrientation12 = null;
        parkingGUI0.setComponentOrientation(componentOrientation12);
        park.ParkingGUI parkingGUI14 = new park.ParkingGUI();
        parkingGUI14.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str19 = parkingGUI14.getTitle();
        java.awt.event.FocusListener[] focusListenerArray20 = parkingGUI14.getFocusListeners();
        java.awt.FocusTraversalPolicy focusTraversalPolicy21 = null;
        parkingGUI14.setFocusTraversalPolicy(focusTraversalPolicy21);
        boolean boolean23 = parkingGUI0.isAncestorOf((java.awt.Component) parkingGUI14);
        java.awt.Dimension dimension24 = parkingGUI14.minimumSize();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Parking" + "'", str19, "Parking");
        org.junit.Assert.assertNotNull(focusListenerArray20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dimension24);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = parkingGUI0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        parkingGUI0.transferFocusBackward();
        java.awt.Event event8 = null;
        boolean boolean11 = parkingGUI0.mouseDown(event8, (int) (short) 10, (int) (byte) 100);
        java.awt.Point point12 = parkingGUI0.getLocation();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(point12);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.lang.String str1 = parkingGUI0.getTitle();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray2 = parkingGUI0.getPropertyChangeListeners();
        parkingGUI0.toFront();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Parking" + "'", str1, "Parking");
        org.junit.Assert.assertNotNull(propertyChangeListenerArray2);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingGUI0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        parkingGUI0.addMouseListener(mouseListener5);
        java.awt.Component component7 = parkingGUI0.getMostRecentFocusOwner();
        java.awt.Dimension dimension8 = null;
        parkingGUI0.setMaximumSize(dimension8);
        park.ParkingGUI parkingGUI10 = new park.ParkingGUI();
        parkingGUI10.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str15 = parkingGUI10.getTitle();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior16 = parkingGUI10.getBaselineResizeBehavior();
        java.awt.event.WindowListener windowListener17 = null;
        parkingGUI10.addWindowListener(windowListener17);
        park.ParkingGUI parkingGUI19 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener20 = null;
        parkingGUI19.addMouseWheelListener(mouseWheelListener20);
        java.awt.Point point23 = parkingGUI19.getMousePosition(true);
        java.awt.event.MouseListener mouseListener24 = null;
        parkingGUI19.addMouseListener(mouseListener24);
        park.ParkingGUI parkingGUI26 = new park.ParkingGUI();
        parkingGUI26.setFocusable(false);
        java.awt.Event event29 = null;
        boolean boolean32 = parkingGUI26.mouseDrag(event29, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle33 = parkingGUI26.getBounds();
        java.awt.Rectangle rectangle34 = parkingGUI19.getBounds(rectangle33);
        parkingGUI10.setMaximizedBounds(rectangle34);
        parkingGUI0.setMixingCutoutShape((java.awt.Shape) rectangle34);
        boolean boolean37 = parkingGUI0.isShowing();
        org.junit.Assert.assertNull(point4);
// flaky:         org.junit.Assert.assertNull(component7);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Parking" + "'", str15, "Parking");
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior16 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior16.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNull(point23);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(rectangle33);
        org.junit.Assert.assertNotNull(rectangle34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.awt.Color color5 = parkingGUI0.getForeground();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener6 = null;
        parkingGUI0.removeHierarchyBoundsListener(hierarchyBoundsListener6);
        org.junit.Assert.assertNotNull(color5);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str5 = parkingGUI0.getTitle();
        int int6 = parkingGUI0.countComponents();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Parking" + "'", str5, "Parking");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.setLocationByPlatform(false);
        java.awt.Image image3 = null;
        parkingGUI0.setIconImage(image3);
        javax.swing.JMenuBar jMenuBar5 = null;
        parkingGUI0.setJMenuBar(jMenuBar5);
        java.awt.event.FocusListener focusListener7 = null;
        parkingGUI0.addFocusListener(focusListener7);
        java.awt.event.MouseWheelListener mouseWheelListener9 = null;
        parkingGUI0.addMouseWheelListener(mouseWheelListener9);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingGUI0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        parkingGUI0.addMouseListener(mouseListener5);
        java.awt.LayoutManager layoutManager7 = parkingGUI0.getLayout();
        parkingGUI0.move(11, 6);
        javax.swing.JMenuBar jMenuBar11 = null;
        parkingGUI0.setJMenuBar(jMenuBar11);
        parkingGUI0.firePropertyChange("", (long) (short) 1, (long) (-1));
        park.ParkingGUI parkingGUI17 = new park.ParkingGUI();
        java.lang.String str18 = parkingGUI17.getTitle();
        java.awt.Cursor cursor19 = null;
        parkingGUI17.setCursor(cursor19);
        java.awt.event.WindowListener windowListener21 = null;
        parkingGUI17.addWindowListener(windowListener21);
        java.awt.Event event23 = null;
        park.ParkingGUI parkingGUI24 = new park.ParkingGUI();
        parkingGUI24.setLocationByPlatform(false);
        java.awt.Image image27 = null;
        parkingGUI24.setIconImage(image27);
        park.ParkingGUI parkingGUI29 = new park.ParkingGUI();
        parkingGUI29.setFocusable(false);
        java.awt.Event event32 = null;
        boolean boolean35 = parkingGUI29.mouseDrag(event32, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle36 = parkingGUI29.getBounds();
        parkingGUI24.setMixingCutoutShape((java.awt.Shape) rectangle36);
        boolean boolean38 = parkingGUI17.gotFocus(event23, (java.lang.Object) rectangle36);
        parkingGUI0.setBounds(rectangle36);
        java.awt.Toolkit toolkit40 = parkingGUI0.getToolkit();
        java.awt.Event event41 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean42 = parkingGUI0.postEvent(event41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"id\" because \"evt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(layoutManager7);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Parking" + "'", str18, "Parking");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(rectangle36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(toolkit40);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingGUI0.getMousePosition(true);
        park.ParkingGUI parkingGUI5 = new park.ParkingGUI();
        parkingGUI5.setLocationByPlatform(false);
        java.awt.Image image8 = null;
        parkingGUI5.setIconImage(image8);
        javax.swing.JMenuBar jMenuBar10 = null;
        parkingGUI5.setJMenuBar(jMenuBar10);
        java.awt.FocusTraversalPolicy focusTraversalPolicy12 = null;
        parkingGUI5.setFocusTraversalPolicy(focusTraversalPolicy12);
        park.ParkingGUI parkingGUI14 = new park.ParkingGUI();
        java.awt.Dimension dimension15 = null;
        parkingGUI14.setPreferredSize(dimension15);
        parkingGUI14.resize(7, 0);
        boolean boolean20 = parkingGUI14.isEnabled();
        java.awt.Event event21 = null;
        boolean boolean23 = parkingGUI14.lostFocus(event21, (java.lang.Object) (short) 0);
        java.awt.Font font24 = parkingGUI14.getFont();
        java.awt.FontMetrics fontMetrics25 = parkingGUI5.getFontMetrics(font24);
        java.awt.Cursor cursor26 = null;
        parkingGUI5.setCursor(cursor26);
        int int28 = parkingGUI0.getComponentZOrder((java.awt.Component) parkingGUI5);
        java.awt.dnd.DropTarget dropTarget29 = null;
        parkingGUI0.setDropTarget(dropTarget29);
        java.awt.event.WindowStateListener windowStateListener31 = null;
        parkingGUI0.removeWindowStateListener(windowStateListener31);
        parkingGUI0.hide();
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(font24);
        org.junit.Assert.assertNotNull(fontMetrics25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.setLocationByPlatform(false);
        parkingGUI0.firePropertyChange("Parking", (short) (byte) -1, (short) (byte) 1);
        boolean boolean7 = parkingGUI0.isOpaque();
        park.ParkingGUI parkingGUI8 = new park.ParkingGUI();
        parkingGUI8.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str13 = parkingGUI8.getTitle();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior14 = parkingGUI8.getBaselineResizeBehavior();
        java.awt.event.WindowListener windowListener15 = null;
        parkingGUI8.addWindowListener(windowListener15);
        park.ParkingGUI parkingGUI17 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener18 = null;
        parkingGUI17.addMouseWheelListener(mouseWheelListener18);
        java.awt.Point point21 = parkingGUI17.getMousePosition(true);
        java.awt.event.MouseListener mouseListener22 = null;
        parkingGUI17.addMouseListener(mouseListener22);
        park.ParkingGUI parkingGUI24 = new park.ParkingGUI();
        parkingGUI24.setFocusable(false);
        java.awt.Event event27 = null;
        boolean boolean30 = parkingGUI24.mouseDrag(event27, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle31 = parkingGUI24.getBounds();
        java.awt.Rectangle rectangle32 = parkingGUI17.getBounds(rectangle31);
        parkingGUI8.setMaximizedBounds(rectangle32);
        parkingGUI0.setShape((java.awt.Shape) rectangle32);
        java.awt.Font font35 = parkingGUI0.getFont();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Parking" + "'", str13, "Parking");
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior14 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior14.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNull(point21);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(rectangle31);
        org.junit.Assert.assertNotNull(rectangle32);
        org.junit.Assert.assertNotNull(font35);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = parkingGUI0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        java.awt.event.WindowListener windowListener7 = null;
        parkingGUI0.removeWindowListener(windowListener7);
        java.awt.event.MouseMotionListener mouseMotionListener9 = null;
        parkingGUI0.addMouseMotionListener(mouseMotionListener9);
        // The following exception was thrown during execution in test generation
        try {
            parkingGUI0.setCursor((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal cursor type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.Dimension dimension1 = null;
        parkingGUI0.setPreferredSize(dimension1);
        parkingGUI0.doLayout();
        park.ParkingGUI parkingGUI4 = new park.ParkingGUI();
        java.awt.Dimension dimension5 = null;
        parkingGUI4.setPreferredSize(dimension5);
        parkingGUI4.resize(7, 0);
        boolean boolean10 = parkingGUI4.isEnabled();
        java.awt.Event event11 = null;
        boolean boolean13 = parkingGUI4.lostFocus(event11, (java.lang.Object) (short) 0);
        java.awt.Font font14 = parkingGUI4.getFont();
        java.awt.FontMetrics fontMetrics15 = parkingGUI0.getFontMetrics(font14);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertNotNull(fontMetrics15);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingGUI0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        parkingGUI0.addMouseListener(mouseListener5);
        java.awt.Component component7 = parkingGUI0.getMostRecentFocusOwner();
        parkingGUI0.setAlwaysOnTop(false);
        boolean boolean10 = parkingGUI0.isLightweight();
        org.junit.Assert.assertNull(point4);
// flaky:         org.junit.Assert.assertNull(component7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.setLocationByPlatform(false);
        parkingGUI0.setVisible(true);
        java.awt.Dimension dimension5 = parkingGUI0.getMaximumSize();
        java.awt.Dimension dimension6 = parkingGUI0.size();
        java.awt.Insets insets7 = parkingGUI0.getInsets();
        parkingGUI0.setFocusable(true);
        parkingGUI0.setResizable(true);
        org.junit.Assert.assertNotNull(dimension5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNotNull(insets7);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.setLocationByPlatform(false);
        java.awt.Image image3 = null;
        parkingGUI0.setIconImage(image3);
        javax.swing.JMenuBar jMenuBar5 = null;
        parkingGUI0.setJMenuBar(jMenuBar5);
        java.awt.FocusTraversalPolicy focusTraversalPolicy7 = null;
        parkingGUI0.setFocusTraversalPolicy(focusTraversalPolicy7);
        park.ParkingGUI parkingGUI9 = new park.ParkingGUI();
        java.awt.Dimension dimension10 = null;
        parkingGUI9.setPreferredSize(dimension10);
        parkingGUI9.resize(7, 0);
        boolean boolean15 = parkingGUI9.isEnabled();
        java.awt.Event event16 = null;
        boolean boolean18 = parkingGUI9.lostFocus(event16, (java.lang.Object) (short) 0);
        java.awt.Font font19 = parkingGUI9.getFont();
        java.awt.FontMetrics fontMetrics20 = parkingGUI0.getFontMetrics(font19);
        java.awt.Cursor cursor21 = null;
        parkingGUI0.setCursor(cursor21);
        park.ParkingGUI parkingGUI23 = new park.ParkingGUI();
        parkingGUI23.setFocusable(false);
        java.awt.Event event26 = null;
        boolean boolean29 = parkingGUI23.mouseDrag(event26, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle30 = parkingGUI23.getBounds();
        java.awt.Dimension dimension31 = parkingGUI23.getPreferredSize();
        javax.swing.JRootPane jRootPane32 = parkingGUI23.getRootPane();
        boolean boolean33 = parkingGUI23.isOpaque();
        java.awt.Point point34 = parkingGUI23.getLocation();
        java.awt.Component component35 = parkingGUI0.getComponentAt(point34);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertNotNull(fontMetrics20);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(rectangle30);
        org.junit.Assert.assertNotNull(dimension31);
        org.junit.Assert.assertNotNull(jRootPane32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(point34);
        org.junit.Assert.assertNotNull(component35);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str5 = parkingGUI0.getTitle();
        java.awt.event.FocusListener[] focusListenerArray6 = parkingGUI0.getFocusListeners();
        java.awt.FocusTraversalPolicy focusTraversalPolicy7 = null;
        parkingGUI0.setFocusTraversalPolicy(focusTraversalPolicy7);
        java.awt.Point point9 = parkingGUI0.getMousePosition();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Parking" + "'", str5, "Parking");
        org.junit.Assert.assertNotNull(focusListenerArray6);
        org.junit.Assert.assertNull(point9);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.setLocationByPlatform(false);
        parkingGUI0.firePropertyChange("Parking", (short) (byte) -1, (short) (byte) 1);
        java.awt.Insets insets7 = parkingGUI0.getInsets();
        org.junit.Assert.assertNotNull(insets7);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.setLocationByPlatform(false);
        java.awt.Dimension dimension3 = null;
        parkingGUI0.setMaximumSize(dimension3);
        parkingGUI0.repaint((long) (short) 10);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingGUI0.getMousePosition(true);
        java.awt.Font font5 = parkingGUI0.getFont();
        boolean boolean6 = parkingGUI0.isDisplayable();
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.awt.Shape shape5 = parkingGUI0.getShape();
        org.junit.Assert.assertNull(shape5);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.Dimension dimension1 = null;
        parkingGUI0.setPreferredSize(dimension1);
        parkingGUI0.resize(7, 0);
        boolean boolean6 = parkingGUI0.isEnabled();
        parkingGUI0.repaint((long) 7, (int) '#', (int) (short) 100, 9, (int) (byte) 0);
        int int13 = parkingGUI0.getComponentCount();
        java.awt.Event event14 = null;
        boolean boolean17 = parkingGUI0.mouseMove(event14, (int) (short) -1, (int) (short) 10);
        java.awt.Component component18 = parkingGUI0.getGlassPane();
        java.awt.Window.Type type19 = parkingGUI0.getType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(component18);
        org.junit.Assert.assertTrue("'" + type19 + "' != '" + java.awt.Window.Type.NORMAL + "'", type19.equals(java.awt.Window.Type.NORMAL));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str5 = parkingGUI0.getTitle();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior6 = parkingGUI0.getBaselineResizeBehavior();
        java.awt.event.WindowListener windowListener7 = null;
        parkingGUI0.addWindowListener(windowListener7);
        java.awt.event.WindowFocusListener windowFocusListener9 = null;
        parkingGUI0.addWindowFocusListener(windowFocusListener9);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        parkingGUI0.removePropertyChangeListener("", propertyChangeListener12);
        java.awt.event.ComponentListener componentListener14 = null;
        parkingGUI0.removeComponentListener(componentListener14);
        java.awt.image.ColorModel colorModel16 = parkingGUI0.getColorModel();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Parking" + "'", str5, "Parking");
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior6 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior6.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(colorModel16);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = parkingGUI0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle7 = parkingGUI0.getBounds();
        java.awt.Component component10 = parkingGUI0.getComponentAt(7, 6);
        park.ParkingGUI parkingGUI11 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener12 = null;
        parkingGUI11.addMouseWheelListener(mouseWheelListener12);
        java.awt.Point point15 = parkingGUI11.getMousePosition(true);
        java.awt.event.MouseListener mouseListener16 = null;
        parkingGUI11.addMouseListener(mouseListener16);
        java.awt.LayoutManager layoutManager18 = parkingGUI11.getLayout();
        parkingGUI11.move(11, 6);
        int int22 = parkingGUI0.getComponentZOrder((java.awt.Component) parkingGUI11);
        parkingGUI11.enable(false);
        java.awt.event.WindowFocusListener windowFocusListener25 = null;
        parkingGUI11.addWindowFocusListener(windowFocusListener25);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(rectangle7);
        org.junit.Assert.assertNotNull(component10);
        org.junit.Assert.assertNull(point15);
        org.junit.Assert.assertNotNull(layoutManager18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingGUI0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        parkingGUI0.addMouseListener(mouseListener5);
        java.awt.Component component7 = parkingGUI0.getMostRecentFocusOwner();
        java.awt.Dimension dimension8 = null;
        parkingGUI0.setMaximumSize(dimension8);
        java.awt.image.ImageProducer imageProducer10 = null;
        java.awt.Image image11 = parkingGUI0.createImage(imageProducer10);
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertNotNull(image11);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.lang.String str1 = parkingGUI0.getTitle();
        java.awt.Font font2 = null;
        parkingGUI0.setFont(font2);
        java.awt.Event event4 = null;
        boolean boolean7 = parkingGUI0.mouseEnter(event4, 6, (int) (short) -1);
        java.awt.Component component8 = parkingGUI0.getMostRecentFocusOwner();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Parking" + "'", str1, "Parking");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(component8);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingGUI0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        parkingGUI0.addMouseListener(mouseListener5);
        java.awt.LayoutManager layoutManager7 = parkingGUI0.getLayout();
        parkingGUI0.move(11, 6);
        javax.swing.JMenuBar jMenuBar11 = null;
        parkingGUI0.setJMenuBar(jMenuBar11);
        parkingGUI0.firePropertyChange("", (long) (short) 1, (long) (-1));
        park.ParkingGUI parkingGUI17 = new park.ParkingGUI();
        java.lang.String str18 = parkingGUI17.getTitle();
        java.awt.Cursor cursor19 = null;
        parkingGUI17.setCursor(cursor19);
        java.awt.event.WindowListener windowListener21 = null;
        parkingGUI17.addWindowListener(windowListener21);
        java.awt.Event event23 = null;
        park.ParkingGUI parkingGUI24 = new park.ParkingGUI();
        parkingGUI24.setLocationByPlatform(false);
        java.awt.Image image27 = null;
        parkingGUI24.setIconImage(image27);
        park.ParkingGUI parkingGUI29 = new park.ParkingGUI();
        parkingGUI29.setFocusable(false);
        java.awt.Event event32 = null;
        boolean boolean35 = parkingGUI29.mouseDrag(event32, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle36 = parkingGUI29.getBounds();
        parkingGUI24.setMixingCutoutShape((java.awt.Shape) rectangle36);
        boolean boolean38 = parkingGUI17.gotFocus(event23, (java.lang.Object) rectangle36);
        parkingGUI0.setBounds(rectangle36);
        java.awt.Cursor cursor40 = parkingGUI0.getCursor();
        boolean boolean41 = parkingGUI0.isVisible();
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(layoutManager7);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Parking" + "'", str18, "Parking");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(rectangle36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(cursor40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.Dimension dimension1 = null;
        parkingGUI0.setPreferredSize(dimension1);
        parkingGUI0.doLayout();
        java.awt.Window.Type type4 = parkingGUI0.getType();
        java.awt.Dimension dimension5 = parkingGUI0.getSize();
        park.ParkingGUI parkingGUI6 = new park.ParkingGUI();
        java.awt.Dimension dimension7 = null;
        parkingGUI6.setPreferredSize(dimension7);
        parkingGUI6.resize(7, 0);
        boolean boolean12 = parkingGUI6.isEnabled();
        parkingGUI6.setResizable(false);
        boolean boolean15 = parkingGUI0.isAncestorOf((java.awt.Component) parkingGUI6);
        parkingGUI0.firePropertyChange("hi!", (float) (byte) 0, (float) '#');
        java.awt.Font font20 = parkingGUI0.getFont();
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + java.awt.Window.Type.NORMAL + "'", type4.equals(java.awt.Window.Type.NORMAL));
        org.junit.Assert.assertNotNull(dimension5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(font20);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.event.MouseMotionListener mouseMotionListener3 = null;
        parkingGUI0.removeMouseMotionListener(mouseMotionListener3);
        java.awt.event.HierarchyListener[] hierarchyListenerArray5 = parkingGUI0.getHierarchyListeners();
        park.ParkingGUI parkingGUI6 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener7 = null;
        parkingGUI6.addMouseWheelListener(mouseWheelListener7);
        java.awt.Point point10 = parkingGUI6.getMousePosition(true);
        java.awt.event.MouseListener mouseListener11 = null;
        parkingGUI6.addMouseListener(mouseListener11);
        java.awt.Component component13 = parkingGUI6.getMostRecentFocusOwner();
        java.awt.Dimension dimension14 = null;
        parkingGUI6.setMaximumSize(dimension14);
        park.ParkingGUI parkingGUI16 = new park.ParkingGUI();
        parkingGUI16.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str21 = parkingGUI16.getTitle();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior22 = parkingGUI16.getBaselineResizeBehavior();
        java.awt.event.WindowListener windowListener23 = null;
        parkingGUI16.addWindowListener(windowListener23);
        park.ParkingGUI parkingGUI25 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener26 = null;
        parkingGUI25.addMouseWheelListener(mouseWheelListener26);
        java.awt.Point point29 = parkingGUI25.getMousePosition(true);
        java.awt.event.MouseListener mouseListener30 = null;
        parkingGUI25.addMouseListener(mouseListener30);
        park.ParkingGUI parkingGUI32 = new park.ParkingGUI();
        parkingGUI32.setFocusable(false);
        java.awt.Event event35 = null;
        boolean boolean38 = parkingGUI32.mouseDrag(event35, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle39 = parkingGUI32.getBounds();
        java.awt.Rectangle rectangle40 = parkingGUI25.getBounds(rectangle39);
        parkingGUI16.setMaximizedBounds(rectangle40);
        parkingGUI6.setMixingCutoutShape((java.awt.Shape) rectangle40);
        parkingGUI0.setMixingCutoutShape((java.awt.Shape) rectangle40);
        java.awt.Event event44 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingGUI0.deliverEvent(event44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"x\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hierarchyListenerArray5);
        org.junit.Assert.assertNull(point10);
        org.junit.Assert.assertNotNull(component13);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Parking" + "'", str21, "Parking");
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior22 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior22.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNull(point29);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(rectangle39);
        org.junit.Assert.assertNotNull(rectangle40);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.event.MouseMotionListener mouseMotionListener3 = null;
        parkingGUI0.removeMouseMotionListener(mouseMotionListener3);
        java.awt.event.HierarchyListener[] hierarchyListenerArray5 = parkingGUI0.getHierarchyListeners();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener6 = null;
        parkingGUI0.removeHierarchyBoundsListener(hierarchyBoundsListener6);
        java.awt.Event event8 = null;
        park.ParkingGUI parkingGUI9 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener10 = null;
        parkingGUI9.addMouseWheelListener(mouseWheelListener10);
        java.awt.Point point13 = parkingGUI9.getMousePosition(true);
        java.awt.event.MouseListener mouseListener14 = null;
        parkingGUI9.addMouseListener(mouseListener14);
        java.awt.Component component16 = parkingGUI9.getMostRecentFocusOwner();
        java.awt.MenuBar menuBar17 = null;
        parkingGUI9.setMenuBar(menuBar17);
        boolean boolean19 = parkingGUI9.isValid();
        boolean boolean20 = parkingGUI0.lostFocus(event8, (java.lang.Object) boolean19);
        parkingGUI0.setAutoRequestFocus(true);
        org.junit.Assert.assertNotNull(hierarchyListenerArray5);
        org.junit.Assert.assertNull(point13);
        org.junit.Assert.assertNotNull(component16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = parkingGUI0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle7 = parkingGUI0.getBounds();
        java.awt.Dimension dimension8 = parkingGUI0.getPreferredSize();
        park.ParkingGUI parkingGUI9 = new park.ParkingGUI();
        java.lang.String str10 = parkingGUI9.getTitle();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray11 = parkingGUI9.getPropertyChangeListeners();
        boolean boolean12 = parkingGUI0.isFocusCycleRoot((java.awt.Container) parkingGUI9);
        park.ParkingGUI parkingGUI13 = new park.ParkingGUI();
        java.awt.Dimension dimension14 = null;
        parkingGUI13.setPreferredSize(dimension14);
        parkingGUI13.resize(7, 0);
        boolean boolean19 = parkingGUI13.isEnabled();
        java.awt.Event event20 = null;
        boolean boolean22 = parkingGUI13.lostFocus(event20, (java.lang.Object) (short) 0);
        parkingGUI13.setFocusCycleRoot(true);
        java.awt.Dimension dimension25 = parkingGUI13.getMaximumSize();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener26 = null;
        parkingGUI13.addHierarchyBoundsListener(hierarchyBoundsListener26);
        boolean boolean28 = parkingGUI13.isValid();
        // The following exception was thrown during execution in test generation
        try {
            parkingGUI9.add((java.awt.Component) parkingGUI13, (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(rectangle7);
        org.junit.Assert.assertNotNull(dimension8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Parking" + "'", str10, "Parking");
        org.junit.Assert.assertNotNull(propertyChangeListenerArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dimension25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.Dimension dimension1 = null;
        parkingGUI0.setPreferredSize(dimension1);
        parkingGUI0.doLayout();
        java.awt.Window.Type type4 = parkingGUI0.getType();
        java.awt.Dimension dimension5 = parkingGUI0.getSize();
        park.ParkingGUI parkingGUI6 = new park.ParkingGUI();
        java.awt.Dimension dimension7 = null;
        parkingGUI6.setPreferredSize(dimension7);
        parkingGUI6.resize(7, 0);
        boolean boolean12 = parkingGUI6.isEnabled();
        parkingGUI6.setResizable(false);
        boolean boolean15 = parkingGUI0.isAncestorOf((java.awt.Component) parkingGUI6);
        parkingGUI0.firePropertyChange("hi!", (float) (byte) 0, (float) '#');
        boolean boolean20 = parkingGUI0.isFocusTraversable();
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + java.awt.Window.Type.NORMAL + "'", type4.equals(java.awt.Window.Type.NORMAL));
        org.junit.Assert.assertNotNull(dimension5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        float float0 = java.awt.Component.BOTTOM_ALIGNMENT;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 1.0f + "'", float0 == 1.0f);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.setLocationByPlatform(false);
        parkingGUI0.setVisible(true);
        int int7 = parkingGUI0.getBaseline(1, 10);
        boolean boolean8 = parkingGUI0.isFocusTraversalPolicySet();
        javax.swing.TransferHandler transferHandler9 = null;
        parkingGUI0.setTransferHandler(transferHandler9);
        boolean boolean11 = parkingGUI0.isValidateRoot();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.util.Locale locale5 = null;
        parkingGUI0.setLocale(locale5);
        java.awt.event.InputMethodListener inputMethodListener7 = null;
        parkingGUI0.removeInputMethodListener(inputMethodListener7);
        java.awt.event.HierarchyListener hierarchyListener9 = null;
        parkingGUI0.removeHierarchyListener(hierarchyListener9);
        java.awt.Graphics graphics11 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingGUI0.printAll(graphics11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Graphics.getClip()\" because \"g\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.event.MouseMotionListener mouseMotionListener3 = null;
        parkingGUI0.removeMouseMotionListener(mouseMotionListener3);
        java.awt.event.HierarchyListener[] hierarchyListenerArray5 = parkingGUI0.getHierarchyListeners();
        park.ParkingGUI parkingGUI6 = new park.ParkingGUI();
        parkingGUI6.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str11 = parkingGUI6.getTitle();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior12 = parkingGUI6.getBaselineResizeBehavior();
        park.ParkingGUI parkingGUI13 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener14 = null;
        parkingGUI13.addMouseWheelListener(mouseWheelListener14);
        java.awt.Point point17 = parkingGUI13.getMousePosition(true);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray18 = parkingGUI13.getPropertyChangeListeners();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener19 = null;
        parkingGUI13.removeHierarchyBoundsListener(hierarchyBoundsListener19);
        java.awt.Image image23 = parkingGUI13.createImage(6, (int) (short) 100);
        parkingGUI6.setIconImage(image23);
        park.ParkingGUI parkingGUI27 = new park.ParkingGUI();
        parkingGUI27.setFocusable(false);
        java.awt.Event event30 = null;
        boolean boolean33 = parkingGUI27.mouseDrag(event30, (int) (byte) 1, (int) (short) 1);
        java.awt.event.WindowListener windowListener34 = null;
        parkingGUI27.removeWindowListener(windowListener34);
        java.awt.event.MouseMotionListener mouseMotionListener36 = null;
        parkingGUI27.addMouseMotionListener(mouseMotionListener36);
        int int38 = parkingGUI0.checkImage(image23, 1, (int) '4', (java.awt.image.ImageObserver) parkingGUI27);
        java.awt.Component component41 = parkingGUI27.getComponentAt((int) (byte) -1, (int) ' ');
        org.junit.Assert.assertNotNull(hierarchyListenerArray5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking" + "'", str11, "Parking");
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior12 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior12.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNull(point17);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray18);
        org.junit.Assert.assertNotNull(image23);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 32 + "'", int38 == 32);
        org.junit.Assert.assertNull(component41);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.setLocationByPlatform(false);
        java.awt.dnd.DropTarget dropTarget3 = parkingGUI0.getDropTarget();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        parkingGUI0.addPropertyChangeListener("", propertyChangeListener5);
        java.awt.Point point7 = parkingGUI0.getLocation();
        org.junit.Assert.assertNull(dropTarget3);
        org.junit.Assert.assertNotNull(point7);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.Dimension dimension1 = null;
        parkingGUI0.setPreferredSize(dimension1);
        parkingGUI0.doLayout();
        park.ParkingGUI parkingGUI4 = new park.ParkingGUI();
        java.awt.Dimension dimension5 = null;
        parkingGUI4.setPreferredSize(dimension5);
        parkingGUI4.doLayout();
        boolean boolean9 = parkingGUI4.areFocusTraversalKeysSet((int) (short) 1);
        javax.swing.JRootPane jRootPane10 = parkingGUI4.getRootPane();
        java.awt.Component component13 = jRootPane10.findComponentAt((int) (byte) 0, 10);
        parkingGUI0.setContentPane((java.awt.Container) jRootPane10);
        parkingGUI0.setSize(1, (int) (byte) 1);
        java.awt.Event event18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = parkingGUI0.postEvent(event18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"id\" because \"evt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jRootPane10);
        org.junit.Assert.assertNotNull(component13);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.lang.String str1 = parkingGUI0.getTitle();
        java.awt.event.KeyListener keyListener2 = null;
        parkingGUI0.addKeyListener(keyListener2);
        java.awt.event.FocusListener focusListener4 = null;
        parkingGUI0.removeFocusListener(focusListener4);
        park.ParkingGUI parkingGUI6 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener7 = null;
        parkingGUI6.addMouseWheelListener(mouseWheelListener7);
        java.awt.Point point10 = parkingGUI6.getMousePosition(true);
        java.awt.event.MouseListener mouseListener11 = null;
        parkingGUI6.addMouseListener(mouseListener11);
        java.awt.LayoutManager layoutManager13 = parkingGUI6.getLayout();
        parkingGUI6.move(11, 6);
        javax.swing.JMenuBar jMenuBar17 = null;
        parkingGUI6.setJMenuBar(jMenuBar17);
        parkingGUI0.setLocationRelativeTo((java.awt.Component) parkingGUI6);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        parkingGUI6.removePropertyChangeListener(propertyChangeListener20);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Parking" + "'", str1, "Parking");
        org.junit.Assert.assertNull(point10);
        org.junit.Assert.assertNotNull(layoutManager13);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = parkingGUI0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        parkingGUI0.transferFocusBackward();
        park.ParkingGUI parkingGUI8 = new park.ParkingGUI();
        java.awt.Dimension dimension9 = null;
        parkingGUI8.setPreferredSize(dimension9);
        parkingGUI8.resize(7, 0);
        boolean boolean14 = parkingGUI8.isEnabled();
        parkingGUI8.setAlwaysOnTop(false);
        boolean boolean17 = parkingGUI8.isShowing();
        java.awt.Point point18 = null;
        java.awt.Point point19 = parkingGUI8.getLocation(point18);
        java.awt.Component component20 = parkingGUI0.findComponentAt(point19);
        java.awt.Event event21 = null;
        boolean boolean24 = parkingGUI0.mouseMove(event21, 10, (int) (short) 1);
        boolean boolean25 = parkingGUI0.getFocusableWindowState();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(point19);
        org.junit.Assert.assertNotNull(component20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str5 = parkingGUI0.getTitle();
        java.awt.event.FocusListener[] focusListenerArray6 = parkingGUI0.getFocusListeners();
        boolean boolean7 = parkingGUI0.requestFocusInWindow();
        java.awt.Container container8 = parkingGUI0.getParent();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Parking" + "'", str5, "Parking");
        org.junit.Assert.assertNotNull(focusListenerArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(container8);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingGUI0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        parkingGUI0.addMouseListener(mouseListener5);
        java.awt.Component component7 = parkingGUI0.getMostRecentFocusOwner();
        java.awt.MenuBar menuBar8 = null;
        parkingGUI0.setMenuBar(menuBar8);
        boolean boolean10 = parkingGUI0.isValid();
        park.ParkingGUI parkingGUI11 = new park.ParkingGUI();
        parkingGUI11.setLocationByPlatform(false);
        java.awt.Image image14 = null;
        parkingGUI11.setIconImage(image14);
        javax.swing.JMenuBar jMenuBar16 = null;
        parkingGUI11.setJMenuBar(jMenuBar16);
        java.awt.FocusTraversalPolicy focusTraversalPolicy18 = null;
        parkingGUI11.setFocusTraversalPolicy(focusTraversalPolicy18);
        park.ParkingGUI parkingGUI20 = new park.ParkingGUI();
        java.awt.Dimension dimension21 = null;
        parkingGUI20.setPreferredSize(dimension21);
        parkingGUI20.resize(7, 0);
        boolean boolean26 = parkingGUI20.isEnabled();
        java.awt.Event event27 = null;
        boolean boolean29 = parkingGUI20.lostFocus(event27, (java.lang.Object) (short) 0);
        java.awt.Font font30 = parkingGUI20.getFont();
        java.awt.FontMetrics fontMetrics31 = parkingGUI11.getFontMetrics(font30);
        java.awt.FontMetrics fontMetrics32 = parkingGUI0.getFontMetrics(font30);
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(component7);
// flaky:         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(font30);
        org.junit.Assert.assertNotNull(fontMetrics31);
        org.junit.Assert.assertNotNull(fontMetrics32);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.Dimension dimension1 = null;
        parkingGUI0.setPreferredSize(dimension1);
        parkingGUI0.resize(7, 0);
        boolean boolean6 = parkingGUI0.isEnabled();
        parkingGUI0.setResizable(false);
        park.ParkingGUI parkingGUI9 = new park.ParkingGUI();
        parkingGUI9.setFocusable(false);
        java.awt.Event event12 = null;
        boolean boolean15 = parkingGUI9.mouseDrag(event12, (int) (byte) 1, (int) (short) 1);
        boolean boolean16 = parkingGUI9.getFocusableWindowState();
        javax.swing.JLayeredPane jLayeredPane17 = parkingGUI9.getLayeredPane();
        parkingGUI0.setLayeredPane(jLayeredPane17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(jLayeredPane17);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = parkingGUI0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle7 = parkingGUI0.getBounds();
        java.awt.Dimension dimension8 = parkingGUI0.getPreferredSize();
        java.awt.im.InputMethodRequests inputMethodRequests9 = parkingGUI0.getInputMethodRequests();
        boolean boolean10 = parkingGUI0.isResizable();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(rectangle7);
        org.junit.Assert.assertNotNull(dimension8);
        org.junit.Assert.assertNull(inputMethodRequests9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = parkingGUI0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle7 = parkingGUI0.getBounds();
        java.awt.Dimension dimension8 = parkingGUI0.getPreferredSize();
        javax.swing.JRootPane jRootPane9 = parkingGUI0.getRootPane();
        boolean boolean10 = parkingGUI0.isOpaque();
        java.awt.Point point11 = parkingGUI0.getLocation();
        boolean boolean12 = parkingGUI0.isShowing();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(rectangle7);
        org.junit.Assert.assertNotNull(dimension8);
        org.junit.Assert.assertNotNull(jRootPane9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(point11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.Dimension dimension1 = null;
        parkingGUI0.setPreferredSize(dimension1);
        parkingGUI0.resize(7, 0);
        boolean boolean6 = parkingGUI0.isEnabled();
        parkingGUI0.repaint((long) 7, (int) '#', (int) (short) 100, 9, (int) (byte) 0);
        int int13 = parkingGUI0.getComponentCount();
        boolean boolean14 = parkingGUI0.isValidateRoot();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.Dimension dimension1 = null;
        parkingGUI0.setPreferredSize(dimension1);
        parkingGUI0.resize(7, 0);
        boolean boolean6 = parkingGUI0.isEnabled();
        java.awt.Event event7 = null;
        boolean boolean9 = parkingGUI0.lostFocus(event7, (java.lang.Object) (short) 0);
        parkingGUI0.setFocusCycleRoot(true);
        park.ParkingGUI parkingGUI12 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener13 = null;
        parkingGUI12.addMouseWheelListener(mouseWheelListener13);
        java.awt.Point point16 = parkingGUI12.getMousePosition(true);
        java.awt.event.MouseListener mouseListener17 = null;
        parkingGUI12.addMouseListener(mouseListener17);
        java.awt.Component component19 = parkingGUI12.getMostRecentFocusOwner();
        java.awt.MenuBar menuBar20 = null;
        parkingGUI12.setMenuBar(menuBar20);
        park.ParkingGUI parkingGUI22 = new park.ParkingGUI();
        java.lang.String str23 = parkingGUI22.getTitle();
        java.awt.Cursor cursor24 = null;
        parkingGUI22.setCursor(cursor24);
        java.awt.Dimension dimension26 = parkingGUI22.size();
        parkingGUI12.setPreferredSize(dimension26);
        java.awt.Dimension dimension28 = parkingGUI0.getSize(dimension26);
        parkingGUI0.repaint();
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        parkingGUI0.removePropertyChangeListener("Parking", propertyChangeListener31);
        parkingGUI0.resize((int) 'a', 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(point16);
        org.junit.Assert.assertNotNull(component19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Parking" + "'", str23, "Parking");
        org.junit.Assert.assertNotNull(dimension26);
        org.junit.Assert.assertNotNull(dimension28);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingGUI0.addMouseWheelListener(mouseWheelListener1);
        boolean boolean3 = parkingGUI0.isAlwaysOnTop();
        java.awt.Point point4 = parkingGUI0.location();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(point4);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.Dimension dimension1 = null;
        parkingGUI0.setPreferredSize(dimension1);
        parkingGUI0.resize(7, 0);
        java.awt.Event event6 = null;
        park.ParkingGUI parkingGUI7 = new park.ParkingGUI();
        parkingGUI7.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.awt.Color color12 = parkingGUI7.getForeground();
        boolean boolean13 = parkingGUI0.action(event6, (java.lang.Object) parkingGUI7);
        java.awt.Dimension dimension14 = parkingGUI7.size();
        java.awt.event.WindowListener windowListener15 = null;
        parkingGUI7.removeWindowListener(windowListener15);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dimension14);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingGUI0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        parkingGUI0.addMouseListener(mouseListener5);
        java.awt.LayoutManager layoutManager7 = parkingGUI0.getLayout();
        parkingGUI0.move(11, 6);
        java.awt.dnd.DropTarget dropTarget11 = null;
        parkingGUI0.setDropTarget(dropTarget11);
        park.ParkingGUI parkingGUI13 = new park.ParkingGUI();
        parkingGUI13.setLocationByPlatform(false);
        parkingGUI13.setVisible(true);
        java.awt.Dimension dimension18 = parkingGUI13.getMaximumSize();
        java.awt.Dimension dimension19 = parkingGUI0.getSize(dimension18);
        java.awt.FocusTraversalPolicy focusTraversalPolicy20 = parkingGUI0.getFocusTraversalPolicy();
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(layoutManager7);
        org.junit.Assert.assertNotNull(dimension18);
        org.junit.Assert.assertNotNull(dimension19);
        org.junit.Assert.assertNotNull(focusTraversalPolicy20);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.lang.String str1 = parkingGUI0.getTitle();
        java.awt.Font font2 = null;
        parkingGUI0.setFont(font2);
        int int4 = parkingGUI0.getWidth();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Parking" + "'", str1, "Parking");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 300 + "'", int4 == 300);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingGUI0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        parkingGUI0.addMouseListener(mouseListener5);
        java.awt.LayoutManager layoutManager7 = parkingGUI0.getLayout();
        java.awt.Window[] windowArray8 = parkingGUI0.getOwnedWindows();
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(layoutManager7);
        org.junit.Assert.assertNotNull(windowArray8);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str5 = parkingGUI0.getTitle();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior6 = parkingGUI0.getBaselineResizeBehavior();
        float float7 = parkingGUI0.getOpacity();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray9 = parkingGUI0.getPropertyChangeListeners("");
        java.awt.Graphics graphics10 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingGUI0.paintComponents(graphics10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Graphics.getClip()\" because \"g\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Parking" + "'", str5, "Parking");
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior6 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior6.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray9);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = parkingGUI0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        boolean boolean7 = parkingGUI0.getFocusableWindowState();
        javax.swing.JLayeredPane jLayeredPane8 = parkingGUI0.getLayeredPane();
        park.ParkingGUI parkingGUI9 = new park.ParkingGUI();
        java.awt.Dimension dimension10 = null;
        parkingGUI9.setPreferredSize(dimension10);
        parkingGUI9.resize(7, 0);
        java.awt.Event event15 = null;
        park.ParkingGUI parkingGUI16 = new park.ParkingGUI();
        parkingGUI16.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.awt.Color color21 = parkingGUI16.getForeground();
        boolean boolean22 = parkingGUI9.action(event15, (java.lang.Object) parkingGUI16);
        java.awt.Dimension dimension23 = parkingGUI16.size();
        parkingGUI0.setSize(dimension23);
        java.awt.Insets insets25 = parkingGUI0.insets();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(jLayeredPane8);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dimension23);
        org.junit.Assert.assertNotNull(insets25);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.Dimension dimension1 = null;
        parkingGUI0.setPreferredSize(dimension1);
        parkingGUI0.resize(7, 0);
        java.awt.Event event6 = null;
        park.ParkingGUI parkingGUI7 = new park.ParkingGUI();
        parkingGUI7.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.awt.Color color12 = parkingGUI7.getForeground();
        boolean boolean13 = parkingGUI0.action(event6, (java.lang.Object) parkingGUI7);
        java.awt.Dimension dimension14 = parkingGUI7.size();
        java.awt.Event event15 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingGUI7.deliverEvent(event15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"x\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dimension14);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.Dimension dimension1 = null;
        parkingGUI0.setPreferredSize(dimension1);
        parkingGUI0.resize(7, 0);
        boolean boolean6 = parkingGUI0.isEnabled();
        java.awt.Event event7 = null;
        boolean boolean9 = parkingGUI0.lostFocus(event7, (java.lang.Object) (short) 0);
        parkingGUI0.setFocusCycleRoot(true);
        java.awt.Dimension dimension12 = parkingGUI0.getMaximumSize();
        park.ParkingGUI parkingGUI13 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener14 = null;
        parkingGUI13.addMouseWheelListener(mouseWheelListener14);
        java.awt.event.MouseMotionListener mouseMotionListener16 = null;
        parkingGUI13.removeMouseMotionListener(mouseMotionListener16);
        java.awt.event.HierarchyListener[] hierarchyListenerArray18 = parkingGUI13.getHierarchyListeners();
        park.ParkingGUI parkingGUI19 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener20 = null;
        parkingGUI19.addMouseWheelListener(mouseWheelListener20);
        java.awt.Point point23 = parkingGUI19.getMousePosition(true);
        java.awt.event.MouseListener mouseListener24 = null;
        parkingGUI19.addMouseListener(mouseListener24);
        java.awt.Component component26 = parkingGUI19.getMostRecentFocusOwner();
        java.awt.Dimension dimension27 = null;
        parkingGUI19.setMaximumSize(dimension27);
        park.ParkingGUI parkingGUI29 = new park.ParkingGUI();
        parkingGUI29.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str34 = parkingGUI29.getTitle();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior35 = parkingGUI29.getBaselineResizeBehavior();
        java.awt.event.WindowListener windowListener36 = null;
        parkingGUI29.addWindowListener(windowListener36);
        park.ParkingGUI parkingGUI38 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener39 = null;
        parkingGUI38.addMouseWheelListener(mouseWheelListener39);
        java.awt.Point point42 = parkingGUI38.getMousePosition(true);
        java.awt.event.MouseListener mouseListener43 = null;
        parkingGUI38.addMouseListener(mouseListener43);
        park.ParkingGUI parkingGUI45 = new park.ParkingGUI();
        parkingGUI45.setFocusable(false);
        java.awt.Event event48 = null;
        boolean boolean51 = parkingGUI45.mouseDrag(event48, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle52 = parkingGUI45.getBounds();
        java.awt.Rectangle rectangle53 = parkingGUI38.getBounds(rectangle52);
        parkingGUI29.setMaximizedBounds(rectangle53);
        parkingGUI19.setMixingCutoutShape((java.awt.Shape) rectangle53);
        parkingGUI13.setMixingCutoutShape((java.awt.Shape) rectangle53);
        parkingGUI0.setMaximizedBounds(rectangle53);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dimension12);
        org.junit.Assert.assertNotNull(hierarchyListenerArray18);
        org.junit.Assert.assertNull(point23);
        org.junit.Assert.assertNotNull(component26);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Parking" + "'", str34, "Parking");
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior35 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior35.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNull(point42);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(rectangle52);
        org.junit.Assert.assertNotNull(rectangle53);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = parkingGUI0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle7 = parkingGUI0.getBounds();
        java.awt.Component component10 = parkingGUI0.getComponentAt(7, 6);
        parkingGUI0.setName("");
        java.awt.Window.Type type13 = parkingGUI0.getType();
        java.util.Locale locale14 = null;
        parkingGUI0.setLocale(locale14);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(rectangle7);
        org.junit.Assert.assertNotNull(component10);
        org.junit.Assert.assertTrue("'" + type13 + "' != '" + java.awt.Window.Type.NORMAL + "'", type13.equals(java.awt.Window.Type.NORMAL));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str5 = parkingGUI0.getTitle();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior6 = parkingGUI0.getBaselineResizeBehavior();
        java.awt.event.WindowListener windowListener7 = null;
        parkingGUI0.addWindowListener(windowListener7);
        park.ParkingGUI parkingGUI9 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener10 = null;
        parkingGUI9.addMouseWheelListener(mouseWheelListener10);
        java.awt.Point point13 = parkingGUI9.getMousePosition(true);
        java.awt.event.MouseListener mouseListener14 = null;
        parkingGUI9.addMouseListener(mouseListener14);
        park.ParkingGUI parkingGUI16 = new park.ParkingGUI();
        parkingGUI16.setFocusable(false);
        java.awt.Event event19 = null;
        boolean boolean22 = parkingGUI16.mouseDrag(event19, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle23 = parkingGUI16.getBounds();
        java.awt.Rectangle rectangle24 = parkingGUI9.getBounds(rectangle23);
        parkingGUI0.setMaximizedBounds(rectangle24);
        parkingGUI0.setAlwaysOnTop(false);
        park.ParkingGUI parkingGUI28 = new park.ParkingGUI();
        java.awt.Dimension dimension29 = null;
        parkingGUI28.setPreferredSize(dimension29);
        parkingGUI28.doLayout();
        java.awt.Window.Type type32 = parkingGUI28.getType();
        java.awt.Dimension dimension33 = parkingGUI28.getSize();
        park.ParkingGUI parkingGUI34 = new park.ParkingGUI();
        java.awt.Dimension dimension35 = null;
        parkingGUI34.setPreferredSize(dimension35);
        parkingGUI34.resize(7, 0);
        boolean boolean40 = parkingGUI34.isEnabled();
        parkingGUI34.setResizable(false);
        boolean boolean43 = parkingGUI28.isAncestorOf((java.awt.Component) parkingGUI34);
        boolean boolean44 = parkingGUI28.isFocusTraversable();
        java.util.List<java.awt.Image> imageList45 = null;
        parkingGUI28.setIconImages(imageList45);
        parkingGUI0.setLocationRelativeTo((java.awt.Component) parkingGUI28);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Parking" + "'", str5, "Parking");
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior6 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior6.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNull(point13);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(rectangle23);
        org.junit.Assert.assertNotNull(rectangle24);
        org.junit.Assert.assertTrue("'" + type32 + "' != '" + java.awt.Window.Type.NORMAL + "'", type32.equals(java.awt.Window.Type.NORMAL));
        org.junit.Assert.assertNotNull(dimension33);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingGUI0.getMousePosition(true);
        park.ParkingGUI parkingGUI5 = new park.ParkingGUI();
        parkingGUI5.setLocationByPlatform(false);
        java.awt.Image image8 = null;
        parkingGUI5.setIconImage(image8);
        javax.swing.JMenuBar jMenuBar10 = null;
        parkingGUI5.setJMenuBar(jMenuBar10);
        java.awt.FocusTraversalPolicy focusTraversalPolicy12 = null;
        parkingGUI5.setFocusTraversalPolicy(focusTraversalPolicy12);
        park.ParkingGUI parkingGUI14 = new park.ParkingGUI();
        java.awt.Dimension dimension15 = null;
        parkingGUI14.setPreferredSize(dimension15);
        parkingGUI14.resize(7, 0);
        boolean boolean20 = parkingGUI14.isEnabled();
        java.awt.Event event21 = null;
        boolean boolean23 = parkingGUI14.lostFocus(event21, (java.lang.Object) (short) 0);
        java.awt.Font font24 = parkingGUI14.getFont();
        java.awt.FontMetrics fontMetrics25 = parkingGUI5.getFontMetrics(font24);
        java.awt.Cursor cursor26 = null;
        parkingGUI5.setCursor(cursor26);
        int int28 = parkingGUI0.getComponentZOrder((java.awt.Component) parkingGUI5);
        java.awt.Image image29 = null;
        park.ParkingGUI parkingGUI30 = new park.ParkingGUI();
        parkingGUI30.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str35 = parkingGUI30.getTitle();
        int int36 = parkingGUI0.checkImage(image29, (java.awt.image.ImageObserver) parkingGUI30);
        java.awt.Rectangle rectangle37 = parkingGUI30.getMaximizedBounds();
        // The following exception was thrown during execution in test generation
        try {
            parkingGUI30.setUndecorated(true);
            org.junit.Assert.fail("Expected exception of type java.awt.IllegalComponentStateException; message: The frame is displayable.");
        } catch (java.awt.IllegalComponentStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(font24);
        org.junit.Assert.assertNotNull(fontMetrics25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Parking" + "'", str35, "Parking");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 32 + "'", int36 == 32);
        org.junit.Assert.assertNull(rectangle37);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingGUI0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        parkingGUI0.addMouseListener(mouseListener5);
        java.awt.Component component7 = parkingGUI0.getMostRecentFocusOwner();
        javax.swing.JMenuBar jMenuBar8 = parkingGUI0.getJMenuBar();
        parkingGUI0.disable();
        java.awt.event.MouseListener mouseListener10 = null;
        parkingGUI0.removeMouseListener(mouseListener10);
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertNull(jMenuBar8);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingGUI0.getMousePosition(true);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray5 = parkingGUI0.getPropertyChangeListeners();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener6 = null;
        parkingGUI0.removeHierarchyBoundsListener(hierarchyBoundsListener6);
        java.awt.Image image10 = parkingGUI0.createImage(6, (int) (short) 100);
        java.awt.Cursor cursor11 = parkingGUI0.getCursor();
        boolean boolean12 = parkingGUI0.isVisible();
        park.ParkingGUI parkingGUI13 = new park.ParkingGUI();
        parkingGUI13.setFocusable(false);
        java.awt.Event event16 = null;
        boolean boolean19 = parkingGUI13.mouseDrag(event16, (int) (byte) 1, (int) (short) 1);
        boolean boolean20 = parkingGUI13.getFocusableWindowState();
        javax.swing.JLayeredPane jLayeredPane21 = parkingGUI13.getLayeredPane();
        parkingGUI0.setLayeredPane(jLayeredPane21);
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray5);
        org.junit.Assert.assertNotNull(image10);
        org.junit.Assert.assertNotNull(cursor11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(jLayeredPane21);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.lang.String str1 = parkingGUI0.getTitle();
        java.awt.Cursor cursor2 = null;
        parkingGUI0.setCursor(cursor2);
        java.awt.event.WindowListener windowListener4 = null;
        parkingGUI0.addWindowListener(windowListener4);
        java.awt.Event event6 = null;
        park.ParkingGUI parkingGUI7 = new park.ParkingGUI();
        parkingGUI7.setLocationByPlatform(false);
        java.awt.Image image10 = null;
        parkingGUI7.setIconImage(image10);
        park.ParkingGUI parkingGUI12 = new park.ParkingGUI();
        parkingGUI12.setFocusable(false);
        java.awt.Event event15 = null;
        boolean boolean18 = parkingGUI12.mouseDrag(event15, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle19 = parkingGUI12.getBounds();
        parkingGUI7.setMixingCutoutShape((java.awt.Shape) rectangle19);
        boolean boolean21 = parkingGUI0.gotFocus(event6, (java.lang.Object) rectangle19);
        parkingGUI0.hide();
        parkingGUI0.validate();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Parking" + "'", str1, "Parking");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(rectangle19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingGUI0.addMouseWheelListener(mouseWheelListener1);
        java.util.Locale locale3 = null;
        parkingGUI0.setLocale(locale3);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingGUI0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        parkingGUI0.addMouseListener(mouseListener5);
        java.awt.Component component7 = parkingGUI0.getMostRecentFocusOwner();
        parkingGUI0.setAlwaysOnTop(false);
        javax.accessibility.AccessibleContext accessibleContext10 = parkingGUI0.getAccessibleContext();
        boolean boolean11 = parkingGUI0.getFocusableWindowState();
        parkingGUI0.reshape((int) (byte) -1, (int) (byte) 100, 200, (int) (byte) -1);
        org.junit.Assert.assertNull(point4);
// flaky:         org.junit.Assert.assertNull(component7);
        org.junit.Assert.assertNotNull(accessibleContext10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = parkingGUI0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        java.awt.Toolkit toolkit7 = parkingGUI0.getToolkit();
        float float8 = parkingGUI0.getAlignmentX();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(toolkit7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.5f + "'", float8 == 0.5f);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.setLocationByPlatform(false);
        parkingGUI0.firePropertyChange("Parking", (short) (byte) -1, (short) (byte) 1);
        park.ParkingGUI parkingGUI7 = new park.ParkingGUI();
        parkingGUI7.setFocusable(false);
        java.awt.Event event10 = null;
        boolean boolean13 = parkingGUI7.mouseDrag(event10, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle14 = parkingGUI7.getBounds();
        java.awt.Dimension dimension15 = parkingGUI7.getPreferredSize();
        park.ParkingGUI parkingGUI16 = new park.ParkingGUI();
        java.lang.String str17 = parkingGUI16.getTitle();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray18 = parkingGUI16.getPropertyChangeListeners();
        boolean boolean19 = parkingGUI7.isFocusCycleRoot((java.awt.Container) parkingGUI16);
        // The following exception was thrown during execution in test generation
        try {
            parkingGUI0.setContentPane((java.awt.Container) parkingGUI7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(rectangle14);
        org.junit.Assert.assertNotNull(dimension15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Parking" + "'", str17, "Parking");
        org.junit.Assert.assertNotNull(propertyChangeListenerArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.Dimension dimension1 = null;
        parkingGUI0.setPreferredSize(dimension1);
        parkingGUI0.resize(7, 0);
        boolean boolean6 = parkingGUI0.isEnabled();
        parkingGUI0.repaint((long) 7, (int) '#', (int) (short) 100, 9, (int) (byte) 0);
        int int13 = parkingGUI0.getComponentCount();
        java.awt.Event event14 = null;
        boolean boolean17 = parkingGUI0.mouseMove(event14, (int) (short) -1, (int) (short) 10);
        java.awt.Component component18 = parkingGUI0.getGlassPane();
        java.awt.event.FocusEvent.Cause cause19 = null;
        boolean boolean20 = parkingGUI0.requestFocusInWindow(cause19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(component18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.setLocationByPlatform(false);
        parkingGUI0.setVisible(true);
        parkingGUI0.toBack();
        java.awt.Dimension dimension6 = parkingGUI0.minimumSize();
        org.junit.Assert.assertNotNull(dimension6);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingGUI0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        parkingGUI0.addMouseListener(mouseListener5);
        java.awt.LayoutManager layoutManager7 = parkingGUI0.getLayout();
        parkingGUI0.move(11, 6);
        java.awt.Image image11 = null;
        parkingGUI0.setIconImage(image11);
        parkingGUI0.firePropertyChange("hi!", (short) 0, (short) (byte) 100);
        park.ParkingGUI parkingGUI17 = new park.ParkingGUI();
        parkingGUI17.setFocusable(false);
        java.awt.Event event20 = null;
        boolean boolean23 = parkingGUI17.mouseDrag(event20, (int) (byte) 1, (int) (short) 1);
        parkingGUI17.transferFocusBackward();
        java.awt.Event event25 = null;
        boolean boolean28 = parkingGUI17.mouseDown(event25, (int) (short) 10, (int) (byte) 100);
        park.ParkingGUI parkingGUI29 = new park.ParkingGUI();
        parkingGUI29.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str34 = parkingGUI29.getTitle();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior35 = parkingGUI29.getBaselineResizeBehavior();
        park.ParkingGUI parkingGUI36 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener37 = null;
        parkingGUI36.addMouseWheelListener(mouseWheelListener37);
        java.awt.Point point40 = parkingGUI36.getMousePosition(true);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray41 = parkingGUI36.getPropertyChangeListeners();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener42 = null;
        parkingGUI36.removeHierarchyBoundsListener(hierarchyBoundsListener42);
        java.awt.Image image46 = parkingGUI36.createImage(6, (int) (short) 100);
        parkingGUI29.setIconImage(image46);
        park.ParkingGUI parkingGUI48 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener49 = null;
        parkingGUI48.addMouseWheelListener(mouseWheelListener49);
        java.awt.event.MouseMotionListener mouseMotionListener51 = null;
        parkingGUI48.removeMouseMotionListener(mouseMotionListener51);
        java.awt.Event event53 = null;
        boolean boolean56 = parkingGUI48.mouseUp(event53, (int) (short) 0, (int) (short) -1);
        java.awt.Component component59 = parkingGUI48.locate(5, (int) ' ');
        int int60 = parkingGUI17.checkImage(image46, (java.awt.image.ImageObserver) component59);
        java.awt.image.ImageObserver imageObserver61 = null;
        int int62 = parkingGUI0.checkImage(image46, imageObserver61);
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(layoutManager7);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Parking" + "'", str34, "Parking");
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior35 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior35.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNull(point40);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray41);
        org.junit.Assert.assertNotNull(image46);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(component59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 32 + "'", int60 == 32);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 32 + "'", int62 == 32);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingGUI0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        parkingGUI0.addMouseListener(mouseListener5);
        java.awt.Component component7 = parkingGUI0.getMostRecentFocusOwner();
        java.awt.Dimension dimension8 = null;
        parkingGUI0.setMaximumSize(dimension8);
        park.ParkingGUI parkingGUI10 = new park.ParkingGUI();
        parkingGUI10.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str15 = parkingGUI10.getTitle();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior16 = parkingGUI10.getBaselineResizeBehavior();
        java.awt.event.WindowListener windowListener17 = null;
        parkingGUI10.addWindowListener(windowListener17);
        park.ParkingGUI parkingGUI19 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener20 = null;
        parkingGUI19.addMouseWheelListener(mouseWheelListener20);
        java.awt.Point point23 = parkingGUI19.getMousePosition(true);
        java.awt.event.MouseListener mouseListener24 = null;
        parkingGUI19.addMouseListener(mouseListener24);
        park.ParkingGUI parkingGUI26 = new park.ParkingGUI();
        parkingGUI26.setFocusable(false);
        java.awt.Event event29 = null;
        boolean boolean32 = parkingGUI26.mouseDrag(event29, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle33 = parkingGUI26.getBounds();
        java.awt.Rectangle rectangle34 = parkingGUI19.getBounds(rectangle33);
        parkingGUI10.setMaximizedBounds(rectangle34);
        parkingGUI0.setMixingCutoutShape((java.awt.Shape) rectangle34);
        java.awt.Point point37 = parkingGUI0.getLocationOnScreen();
        org.junit.Assert.assertNull(point4);
// flaky:         org.junit.Assert.assertNull(component7);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Parking" + "'", str15, "Parking");
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior16 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior16.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNull(point23);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(rectangle33);
        org.junit.Assert.assertNotNull(rectangle34);
        org.junit.Assert.assertNotNull(point37);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.event.MouseMotionListener mouseMotionListener3 = null;
        parkingGUI0.removeMouseMotionListener(mouseMotionListener3);
        java.awt.Event event5 = null;
        boolean boolean8 = parkingGUI0.mouseUp(event5, (int) (short) 0, (int) (short) -1);
        java.awt.Component component11 = parkingGUI0.locate(5, (int) ' ');
        boolean boolean12 = parkingGUI0.isFocusTraversalPolicySet();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(component11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.Dimension dimension1 = null;
        parkingGUI0.setPreferredSize(dimension1);
        parkingGUI0.resize(7, 0);
        boolean boolean6 = parkingGUI0.isEnabled();
        java.awt.Event event7 = null;
        boolean boolean9 = parkingGUI0.lostFocus(event7, (java.lang.Object) (short) 0);
        java.awt.Font font10 = parkingGUI0.getFont();
        parkingGUI0.toBack();
        java.awt.Point point13 = parkingGUI0.getMousePosition(true);
        boolean boolean14 = parkingGUI0.isValidateRoot();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNull(point13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingGUI0.getMousePosition(true);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray5 = parkingGUI0.getPropertyChangeListeners();
        java.awt.event.ComponentListener componentListener6 = null;
        parkingGUI0.addComponentListener(componentListener6);
        parkingGUI0.setCursor((int) (short) 1);
        java.util.ResourceBundle resourceBundle10 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingGUI0.applyResourceBundle(resourceBundle10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ResourceBundle.getLocale()\" because \"bdl\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray5);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = parkingGUI0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        java.awt.Toolkit toolkit7 = parkingGUI0.getToolkit();
        java.awt.Insets insets8 = parkingGUI0.insets();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(toolkit7);
        org.junit.Assert.assertNotNull(insets8);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingGUI0.getMousePosition(true);
        park.ParkingGUI parkingGUI5 = new park.ParkingGUI();
        parkingGUI5.setLocationByPlatform(false);
        java.awt.Image image8 = null;
        parkingGUI5.setIconImage(image8);
        javax.swing.JMenuBar jMenuBar10 = null;
        parkingGUI5.setJMenuBar(jMenuBar10);
        java.awt.FocusTraversalPolicy focusTraversalPolicy12 = null;
        parkingGUI5.setFocusTraversalPolicy(focusTraversalPolicy12);
        park.ParkingGUI parkingGUI14 = new park.ParkingGUI();
        java.awt.Dimension dimension15 = null;
        parkingGUI14.setPreferredSize(dimension15);
        parkingGUI14.resize(7, 0);
        boolean boolean20 = parkingGUI14.isEnabled();
        java.awt.Event event21 = null;
        boolean boolean23 = parkingGUI14.lostFocus(event21, (java.lang.Object) (short) 0);
        java.awt.Font font24 = parkingGUI14.getFont();
        java.awt.FontMetrics fontMetrics25 = parkingGUI5.getFontMetrics(font24);
        java.awt.Cursor cursor26 = null;
        parkingGUI5.setCursor(cursor26);
        int int28 = parkingGUI0.getComponentZOrder((java.awt.Component) parkingGUI5);
        java.awt.image.VolatileImage volatileImage31 = parkingGUI0.createVolatileImage(128, (int) 'a');
        java.awt.image.BufferStrategy bufferStrategy32 = parkingGUI0.getBufferStrategy();
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(font24);
        org.junit.Assert.assertNotNull(fontMetrics25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(volatileImage31);
        org.junit.Assert.assertNull(bufferStrategy32);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = parkingGUI0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle7 = parkingGUI0.getBounds();
        java.awt.Dimension dimension8 = parkingGUI0.getPreferredSize();
        java.util.List<java.awt.Image> imageList9 = parkingGUI0.getIconImages();
        boolean boolean10 = parkingGUI0.getIgnoreRepaint();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(rectangle7);
        org.junit.Assert.assertNotNull(dimension8);
        org.junit.Assert.assertNotNull(imageList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = parkingGUI0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle7 = parkingGUI0.getBounds();
        java.awt.Dimension dimension8 = parkingGUI0.getPreferredSize();
        javax.swing.JRootPane jRootPane9 = parkingGUI0.getRootPane();
        boolean boolean10 = parkingGUI0.isOpaque();
        parkingGUI0.setTitle("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(rectangle7);
        org.junit.Assert.assertNotNull(dimension8);
        org.junit.Assert.assertNotNull(jRootPane9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.Dimension dimension1 = null;
        parkingGUI0.setPreferredSize(dimension1);
        parkingGUI0.resize(7, 0);
        boolean boolean6 = parkingGUI0.isEnabled();
        java.awt.Event event7 = null;
        boolean boolean9 = parkingGUI0.lostFocus(event7, (java.lang.Object) (short) 0);
        parkingGUI0.setFocusCycleRoot(true);
        java.awt.Dimension dimension12 = parkingGUI0.getMaximumSize();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener13 = null;
        parkingGUI0.addHierarchyBoundsListener(hierarchyBoundsListener13);
        boolean boolean15 = parkingGUI0.isValid();
        park.ParkingGUI parkingGUI16 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener17 = null;
        parkingGUI16.addMouseWheelListener(mouseWheelListener17);
        java.awt.Point point20 = parkingGUI16.getMousePosition(true);
        java.awt.event.MouseListener mouseListener21 = null;
        parkingGUI16.addMouseListener(mouseListener21);
        java.awt.Component component23 = parkingGUI16.getMostRecentFocusOwner();
        javax.swing.JMenuBar jMenuBar24 = parkingGUI16.getJMenuBar();
        java.awt.ImageCapabilities imageCapabilities27 = null;
        java.awt.image.VolatileImage volatileImage28 = parkingGUI16.createVolatileImage(64, 13, imageCapabilities27);
        park.ParkingGUI parkingGUI31 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener32 = null;
        parkingGUI31.addMouseWheelListener(mouseWheelListener32);
        java.awt.Point point35 = parkingGUI31.getMousePosition(true);
        java.awt.event.MouseListener mouseListener36 = null;
        parkingGUI31.addMouseListener(mouseListener36);
        java.awt.Component component38 = parkingGUI31.getMostRecentFocusOwner();
        int int39 = parkingGUI0.checkImage((java.awt.Image) volatileImage28, 0, (int) (short) -1, (java.awt.image.ImageObserver) parkingGUI31);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dimension12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(point20);
        org.junit.Assert.assertNotNull(component23);
        org.junit.Assert.assertNull(jMenuBar24);
        org.junit.Assert.assertNotNull(volatileImage28);
        org.junit.Assert.assertNull(point35);
        org.junit.Assert.assertNotNull(component38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 32 + "'", int39 == 32);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingGUI0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        parkingGUI0.addMouseListener(mouseListener5);
        java.awt.image.ColorModel colorModel7 = parkingGUI0.getColorModel();
        parkingGUI0.setTitle("Parking");
        java.awt.Image image10 = parkingGUI0.getIconImage();
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(colorModel7);
        org.junit.Assert.assertNull(image10);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingGUI0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        parkingGUI0.addMouseListener(mouseListener5);
        java.awt.LayoutManager layoutManager7 = parkingGUI0.getLayout();
        parkingGUI0.move(11, 6);
        java.awt.dnd.DropTarget dropTarget11 = null;
        parkingGUI0.setDropTarget(dropTarget11);
        park.ParkingGUI parkingGUI13 = new park.ParkingGUI();
        parkingGUI13.setLocationByPlatform(false);
        parkingGUI13.setVisible(true);
        java.awt.Dimension dimension18 = parkingGUI13.getMaximumSize();
        java.awt.Dimension dimension19 = parkingGUI0.getSize(dimension18);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener20 = null;
        parkingGUI0.removeHierarchyBoundsListener(hierarchyBoundsListener20);
        boolean boolean22 = parkingGUI0.isLocationByPlatform();
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(layoutManager7);
        org.junit.Assert.assertNotNull(dimension18);
        org.junit.Assert.assertNotNull(dimension19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingGUI0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        parkingGUI0.addMouseListener(mouseListener5);
        java.awt.LayoutManager layoutManager7 = parkingGUI0.getLayout();
        parkingGUI0.move(11, 6);
        java.awt.Image image11 = null;
        parkingGUI0.setIconImage(image11);
        java.lang.String str13 = parkingGUI0.getName();
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(layoutManager7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "frame0" + "'", str13, "frame0");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.Dimension dimension1 = null;
        parkingGUI0.setPreferredSize(dimension1);
        parkingGUI0.resize(7, 0);
        java.awt.Event event6 = null;
        park.ParkingGUI parkingGUI7 = new park.ParkingGUI();
        parkingGUI7.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.awt.Color color12 = parkingGUI7.getForeground();
        boolean boolean13 = parkingGUI0.action(event6, (java.lang.Object) parkingGUI7);
        java.awt.image.ImageProducer imageProducer14 = null;
        java.awt.Image image15 = parkingGUI7.createImage(imageProducer14);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.awt.AWTKeyStroke> aWTKeyStrokeSet17 = parkingGUI7.getFocusTraversalKeys(11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid focus traversal key identifier");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(image15);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.util.Locale locale5 = null;
        parkingGUI0.setLocale(locale5);
        java.awt.LayoutManager layoutManager7 = parkingGUI0.getLayout();
        boolean boolean8 = parkingGUI0.isFocusTraversalPolicySet();
        org.junit.Assert.assertNotNull(layoutManager7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.event.MouseMotionListener mouseMotionListener3 = null;
        parkingGUI0.removeMouseMotionListener(mouseMotionListener3);
        java.awt.Event event5 = null;
        boolean boolean8 = parkingGUI0.mouseUp(event5, (int) (short) 0, (int) (short) -1);
        java.awt.Component component11 = parkingGUI0.locate(5, (int) ' ');
        parkingGUI0.repaint((int) (short) 1, (int) '4', (int) (byte) 1, 10);
        boolean boolean17 = parkingGUI0.isFocused();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(component11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str5 = parkingGUI0.getTitle();
        java.awt.event.FocusListener[] focusListenerArray6 = parkingGUI0.getFocusListeners();
        boolean boolean7 = parkingGUI0.isAlwaysOnTopSupported();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Parking" + "'", str5, "Parking");
        org.junit.Assert.assertNotNull(focusListenerArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.setLocationByPlatform(false);
        java.awt.event.ComponentListener componentListener3 = null;
        parkingGUI0.removeComponentListener(componentListener3);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.Dimension dimension1 = null;
        parkingGUI0.setPreferredSize(dimension1);
        parkingGUI0.resize(7, 0);
        boolean boolean6 = parkingGUI0.isEnabled();
        java.awt.Event event7 = null;
        boolean boolean9 = parkingGUI0.lostFocus(event7, (java.lang.Object) (short) 0);
        java.awt.Font font10 = parkingGUI0.getFont();
        parkingGUI0.toBack();
        java.awt.Point point13 = parkingGUI0.getMousePosition(true);
        java.awt.Color color14 = parkingGUI0.getBackground();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNull(point13);
        org.junit.Assert.assertNotNull(color14);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.awt.Color color5 = parkingGUI0.getForeground();
        java.awt.Point point6 = parkingGUI0.getMousePosition();
        parkingGUI0.transferFocusBackward();
        java.awt.MenuBar menuBar8 = parkingGUI0.getMenuBar();
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(point6);
        org.junit.Assert.assertNull(menuBar8);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = parkingGUI0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle7 = parkingGUI0.getBounds();
        java.awt.Component component10 = parkingGUI0.getComponentAt(7, 6);
        park.ParkingGUI parkingGUI11 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener12 = null;
        parkingGUI11.addMouseWheelListener(mouseWheelListener12);
        java.awt.Point point15 = parkingGUI11.getMousePosition(true);
        java.awt.event.MouseListener mouseListener16 = null;
        parkingGUI11.addMouseListener(mouseListener16);
        java.awt.LayoutManager layoutManager18 = parkingGUI11.getLayout();
        parkingGUI11.move(11, 6);
        int int22 = parkingGUI0.getComponentZOrder((java.awt.Component) parkingGUI11);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        parkingGUI11.removePropertyChangeListener("Parking", propertyChangeListener24);
        parkingGUI11.removeAll();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(rectangle7);
        org.junit.Assert.assertNotNull(component10);
        org.junit.Assert.assertNull(point15);
        org.junit.Assert.assertNotNull(layoutManager18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.lang.String str1 = parkingGUI0.getTitle();
        java.awt.event.KeyListener keyListener2 = null;
        parkingGUI0.addKeyListener(keyListener2);
        java.awt.event.FocusListener focusListener4 = null;
        parkingGUI0.removeFocusListener(focusListener4);
        park.ParkingGUI parkingGUI6 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener7 = null;
        parkingGUI6.addMouseWheelListener(mouseWheelListener7);
        java.awt.Point point10 = parkingGUI6.getMousePosition(true);
        java.awt.event.MouseListener mouseListener11 = null;
        parkingGUI6.addMouseListener(mouseListener11);
        java.awt.LayoutManager layoutManager13 = parkingGUI6.getLayout();
        parkingGUI6.move(11, 6);
        javax.swing.JMenuBar jMenuBar17 = null;
        parkingGUI6.setJMenuBar(jMenuBar17);
        parkingGUI0.setLocationRelativeTo((java.awt.Component) parkingGUI6);
        java.io.PrintStream printStream20 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingGUI0.list(printStream20, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintStream.println(Object)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Parking" + "'", str1, "Parking");
        org.junit.Assert.assertNull(point10);
        org.junit.Assert.assertNotNull(layoutManager13);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str5 = parkingGUI0.getTitle();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior6 = parkingGUI0.getBaselineResizeBehavior();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray7 = parkingGUI0.getPropertyChangeListeners();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Parking" + "'", str5, "Parking");
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior6 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior6.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(propertyChangeListenerArray7);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingGUI0.getMousePosition(true);
        park.ParkingGUI parkingGUI5 = new park.ParkingGUI();
        parkingGUI5.setLocationByPlatform(false);
        java.awt.Image image8 = null;
        parkingGUI5.setIconImage(image8);
        javax.swing.JMenuBar jMenuBar10 = null;
        parkingGUI5.setJMenuBar(jMenuBar10);
        java.awt.FocusTraversalPolicy focusTraversalPolicy12 = null;
        parkingGUI5.setFocusTraversalPolicy(focusTraversalPolicy12);
        park.ParkingGUI parkingGUI14 = new park.ParkingGUI();
        java.awt.Dimension dimension15 = null;
        parkingGUI14.setPreferredSize(dimension15);
        parkingGUI14.resize(7, 0);
        boolean boolean20 = parkingGUI14.isEnabled();
        java.awt.Event event21 = null;
        boolean boolean23 = parkingGUI14.lostFocus(event21, (java.lang.Object) (short) 0);
        java.awt.Font font24 = parkingGUI14.getFont();
        java.awt.FontMetrics fontMetrics25 = parkingGUI5.getFontMetrics(font24);
        java.awt.Cursor cursor26 = null;
        parkingGUI5.setCursor(cursor26);
        int int28 = parkingGUI0.getComponentZOrder((java.awt.Component) parkingGUI5);
        java.awt.Image image29 = null;
        park.ParkingGUI parkingGUI30 = new park.ParkingGUI();
        parkingGUI30.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str35 = parkingGUI30.getTitle();
        int int36 = parkingGUI0.checkImage(image29, (java.awt.image.ImageObserver) parkingGUI30);
        javax.swing.JMenuBar jMenuBar37 = parkingGUI0.getJMenuBar();
        int int38 = parkingGUI0.getDefaultCloseOperation();
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(font24);
        org.junit.Assert.assertNotNull(fontMetrics25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Parking" + "'", str35, "Parking");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 32 + "'", int36 == 32);
        org.junit.Assert.assertNull(jMenuBar37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3 + "'", int38 == 3);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.lang.String str1 = parkingGUI0.getTitle();
        java.awt.Cursor cursor2 = null;
        parkingGUI0.setCursor(cursor2);
        java.awt.event.WindowListener windowListener4 = null;
        parkingGUI0.addWindowListener(windowListener4);
        java.awt.Event event6 = null;
        park.ParkingGUI parkingGUI7 = new park.ParkingGUI();
        parkingGUI7.setLocationByPlatform(false);
        java.awt.Image image10 = null;
        parkingGUI7.setIconImage(image10);
        park.ParkingGUI parkingGUI12 = new park.ParkingGUI();
        parkingGUI12.setFocusable(false);
        java.awt.Event event15 = null;
        boolean boolean18 = parkingGUI12.mouseDrag(event15, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle19 = parkingGUI12.getBounds();
        parkingGUI7.setMixingCutoutShape((java.awt.Shape) rectangle19);
        boolean boolean21 = parkingGUI0.gotFocus(event6, (java.lang.Object) rectangle19);
        parkingGUI0.hide();
        java.awt.Graphics graphics23 = null;
        parkingGUI0.printAll(graphics23);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Point point25 = parkingGUI0.getLocationOnScreen();
            org.junit.Assert.fail("Expected exception of type java.awt.IllegalComponentStateException; message: component must be showing on the screen to determine its location");
        } catch (java.awt.IllegalComponentStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Parking" + "'", str1, "Parking");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(rectangle19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.Dimension dimension1 = null;
        parkingGUI0.setPreferredSize(dimension1);
        parkingGUI0.resize(7, 0);
        boolean boolean6 = parkingGUI0.isEnabled();
        parkingGUI0.setAlwaysOnTop(false);
        parkingGUI0.show(true);
        java.awt.event.MouseMotionListener[] mouseMotionListenerArray11 = parkingGUI0.getMouseMotionListeners();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(mouseMotionListenerArray11);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.setLocationByPlatform(false);
        java.awt.Dimension dimension3 = null;
        parkingGUI0.setMaximumSize(dimension3);
        java.awt.Event event5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = parkingGUI0.postEvent(event5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"id\" because \"evt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingGUI0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        parkingGUI0.addMouseListener(mouseListener5);
        java.awt.Component component7 = parkingGUI0.getMostRecentFocusOwner();
        java.awt.MenuBar menuBar8 = null;
        parkingGUI0.setMenuBar(menuBar8);
        park.ParkingGUI parkingGUI10 = new park.ParkingGUI();
        java.lang.String str11 = parkingGUI10.getTitle();
        java.awt.Cursor cursor12 = null;
        parkingGUI10.setCursor(cursor12);
        java.awt.Dimension dimension14 = parkingGUI10.size();
        parkingGUI0.setSize(dimension14);
        park.ParkingGUI parkingGUI16 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener17 = null;
        parkingGUI16.addMouseWheelListener(mouseWheelListener17);
        java.awt.Point point20 = parkingGUI16.getMousePosition(true);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray21 = parkingGUI16.getPropertyChangeListeners();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener22 = null;
        parkingGUI16.removeHierarchyBoundsListener(hierarchyBoundsListener22);
        java.awt.Image image26 = parkingGUI16.createImage(6, (int) (short) 100);
        java.awt.Cursor cursor27 = parkingGUI16.getCursor();
        parkingGUI0.setCursor(cursor27);
        org.junit.Assert.assertNull(point4);
// flaky:         org.junit.Assert.assertNull(component7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Parking" + "'", str11, "Parking");
        org.junit.Assert.assertNotNull(dimension14);
        org.junit.Assert.assertNull(point20);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray21);
        org.junit.Assert.assertNotNull(image26);
        org.junit.Assert.assertNotNull(cursor27);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = parkingGUI0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        boolean boolean7 = parkingGUI0.getFocusableWindowState();
        javax.swing.JLayeredPane jLayeredPane8 = parkingGUI0.getLayeredPane();
        boolean boolean9 = parkingGUI0.isPreferredSizeSet();
        park.ParkingGUI parkingGUI10 = new park.ParkingGUI();
        parkingGUI10.setFocusable(false);
        java.awt.Event event13 = null;
        boolean boolean16 = parkingGUI10.mouseDrag(event13, (int) (byte) 1, (int) (short) 1);
        boolean boolean17 = parkingGUI10.getFocusableWindowState();
        javax.swing.JLayeredPane jLayeredPane18 = parkingGUI10.getLayeredPane();
        park.ParkingGUI parkingGUI19 = new park.ParkingGUI();
        java.awt.Dimension dimension20 = null;
        parkingGUI19.setPreferredSize(dimension20);
        parkingGUI19.resize(7, 0);
        java.awt.Event event25 = null;
        park.ParkingGUI parkingGUI26 = new park.ParkingGUI();
        parkingGUI26.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.awt.Color color31 = parkingGUI26.getForeground();
        boolean boolean32 = parkingGUI19.action(event25, (java.lang.Object) parkingGUI26);
        java.awt.Dimension dimension33 = parkingGUI26.size();
        parkingGUI10.setSize(dimension33);
        parkingGUI0.setPreferredSize(dimension33);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(jLayeredPane8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(jLayeredPane18);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(dimension33);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.lang.String str1 = parkingGUI0.getTitle();
        java.awt.Cursor cursor2 = null;
        parkingGUI0.setCursor(cursor2);
        java.awt.event.WindowListener windowListener4 = null;
        parkingGUI0.addWindowListener(windowListener4);
        parkingGUI0.firePropertyChange("Parking", (long) '#', (long) (byte) 0);
        park.ParkingGUI parkingGUI10 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener11 = null;
        parkingGUI10.addMouseWheelListener(mouseWheelListener11);
        java.awt.Point point14 = parkingGUI10.getMousePosition(true);
        java.awt.event.MouseListener mouseListener15 = null;
        parkingGUI10.addMouseListener(mouseListener15);
        java.awt.Component component17 = parkingGUI10.getMostRecentFocusOwner();
        int int18 = parkingGUI0.getComponentZOrder(component17);
        javax.swing.TransferHandler transferHandler19 = null;
        parkingGUI0.setTransferHandler(transferHandler19);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Parking" + "'", str1, "Parking");
        org.junit.Assert.assertNull(point14);
        org.junit.Assert.assertNotNull(component17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.setLocationByPlatform(false);
        java.awt.event.HierarchyListener hierarchyListener3 = null;
        parkingGUI0.removeHierarchyListener(hierarchyListener3);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        parkingGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = parkingGUI0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        parkingGUI0.addMouseListener(mouseListener5);
        java.awt.Component component7 = parkingGUI0.getMostRecentFocusOwner();
        javax.swing.JMenuBar jMenuBar8 = parkingGUI0.getJMenuBar();
        java.awt.ImageCapabilities imageCapabilities11 = null;
        java.awt.image.VolatileImage volatileImage12 = parkingGUI0.createVolatileImage(64, 13, imageCapabilities11);
        int int13 = parkingGUI0.getState();
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertNull(jMenuBar8);
        org.junit.Assert.assertNotNull(volatileImage12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        park.ParkingGUI parkingGUI0 = new park.ParkingGUI();
        parkingGUI0.setLocationByPlatform(false);
        parkingGUI0.firePropertyChange("Parking", (short) (byte) -1, (short) (byte) 1);
        boolean boolean7 = parkingGUI0.isOpaque();
        park.ParkingGUI parkingGUI8 = new park.ParkingGUI();
        parkingGUI8.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str13 = parkingGUI8.getTitle();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior14 = parkingGUI8.getBaselineResizeBehavior();
        java.awt.event.WindowListener windowListener15 = null;
        parkingGUI8.addWindowListener(windowListener15);
        park.ParkingGUI parkingGUI17 = new park.ParkingGUI();
        java.awt.event.MouseWheelListener mouseWheelListener18 = null;
        parkingGUI17.addMouseWheelListener(mouseWheelListener18);
        java.awt.Point point21 = parkingGUI17.getMousePosition(true);
        java.awt.event.MouseListener mouseListener22 = null;
        parkingGUI17.addMouseListener(mouseListener22);
        park.ParkingGUI parkingGUI24 = new park.ParkingGUI();
        parkingGUI24.setFocusable(false);
        java.awt.Event event27 = null;
        boolean boolean30 = parkingGUI24.mouseDrag(event27, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle31 = parkingGUI24.getBounds();
        java.awt.Rectangle rectangle32 = parkingGUI17.getBounds(rectangle31);
        parkingGUI8.setMaximizedBounds(rectangle32);
        parkingGUI0.setShape((java.awt.Shape) rectangle32);
        int int35 = parkingGUI0.getHeight();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Parking" + "'", str13, "Parking");
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior14 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior14.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNull(point21);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(rectangle31);
        org.junit.Assert.assertNotNull(rectangle32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 200 + "'", int35 == 200);
    }
}
