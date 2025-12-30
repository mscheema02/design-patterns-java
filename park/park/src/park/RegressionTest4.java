package park;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

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
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.Dimension dimension1 = null;
        mobilePayGUI0.setPreferredSize(dimension1);
        park.MobilePayGUI mobilePayGUI3 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener4 = null;
        mobilePayGUI3.addMouseWheelListener(mouseWheelListener4);
        // The following exception was thrown during execution in test generation
        try {
            mobilePayGUI0.setGlassPane((java.awt.Component) mobilePayGUI3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = mobilePayGUI0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle7 = mobilePayGUI0.getBounds();
        java.awt.AWTEvent aWTEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            mobilePayGUI0.dispatchEvent(aWTEvent8);
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
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.lang.String str1 = mobilePayGUI0.getTitle();
        park.MobilePayGUI mobilePayGUI2 = new park.MobilePayGUI();
        mobilePayGUI2.setFocusable(false);
        java.awt.Event event5 = null;
        boolean boolean8 = mobilePayGUI2.mouseDrag(event5, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle9 = mobilePayGUI2.getBounds();
        // The following exception was thrown during execution in test generation
        try {
            mobilePayGUI0.setShape((java.awt.Shape) rectangle9);
            org.junit.Assert.fail("Expected exception of type java.awt.IllegalComponentStateException; message: The frame is decorated");
        } catch (java.awt.IllegalComponentStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Mobile Pay GUI" + "'", str1, "Mobile Pay GUI");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(rectangle9);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.BufferCapabilities bufferCapabilities2 = null;
        // The following exception was thrown during execution in test generation
        try {
            mobilePayGUI0.createBufferStrategy((int) (byte) 0, bufferCapabilities2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Number of buffers must be at least 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.setLocationByPlatform(false);
        java.awt.Image image3 = null;
        mobilePayGUI0.setIconImage(image3);
        park.MobilePayGUI mobilePayGUI5 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener6 = null;
        mobilePayGUI5.addMouseWheelListener(mouseWheelListener6);
        java.awt.Point point9 = mobilePayGUI5.getMousePosition(true);
        java.awt.event.MouseListener mouseListener10 = null;
        mobilePayGUI5.addMouseListener(mouseListener10);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component12 = mobilePayGUI0.add((java.awt.Component) mobilePayGUI5);
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
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        mobilePayGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.event.MouseMotionListener mouseMotionListener3 = null;
        mobilePayGUI0.removeMouseMotionListener(mouseMotionListener3);
        // The following exception was thrown during execution in test generation
        try {
            mobilePayGUI0.setUndecorated(true);
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
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.Point point1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component2 = mobilePayGUI0.getComponentAt(point1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"x\" because \"p\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.Dimension dimension1 = null;
        mobilePayGUI0.setPreferredSize(dimension1);
        java.awt.Point point3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component4 = mobilePayGUI0.getComponentAt(point3);
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
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.Dimension dimension1 = null;
        mobilePayGUI0.setPreferredSize(dimension1);
        mobilePayGUI0.resize(7, 0);
        boolean boolean6 = mobilePayGUI0.isEnabled();
        park.MobilePayGUI mobilePayGUI7 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener8 = null;
        mobilePayGUI7.addMouseWheelListener(mouseWheelListener8);
        java.awt.event.MouseMotionListener mouseMotionListener10 = null;
        mobilePayGUI7.removeMouseMotionListener(mouseMotionListener10);
        // The following exception was thrown during execution in test generation
        try {
            mobilePayGUI0.setGlassPane((java.awt.Component) mobilePayGUI7);
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
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        mobilePayGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = mobilePayGUI0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        mobilePayGUI0.addMouseListener(mouseListener5);
        mobilePayGUI0.setSize(9, (int) (short) 100);
        org.junit.Assert.assertNull(point4);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.Dimension dimension1 = null;
        mobilePayGUI0.setPreferredSize(dimension1);
        mobilePayGUI0.resize(7, 0);
        boolean boolean6 = mobilePayGUI0.isEnabled();
        java.awt.event.MouseMotionListener mouseMotionListener7 = null;
        mobilePayGUI0.addMouseMotionListener(mouseMotionListener7);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        mobilePayGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = mobilePayGUI0.getMousePosition(true);
        java.awt.PopupMenu popupMenu5 = null;
        // The following exception was thrown during execution in test generation
        try {
            mobilePayGUI0.add(popupMenu5);
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
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.lang.String str1 = mobilePayGUI0.getTitle();
        java.io.PrintWriter printWriter2 = null;
        // The following exception was thrown during execution in test generation
        try {
            mobilePayGUI0.list(printWriter2, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.print(String)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Mobile Pay GUI" + "'", str1, "Mobile Pay GUI");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        mobilePayGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.event.MouseMotionListener mouseMotionListener3 = null;
        mobilePayGUI0.removeMouseMotionListener(mouseMotionListener3);
        java.awt.event.HierarchyListener[] hierarchyListenerArray5 = mobilePayGUI0.getHierarchyListeners();
        java.awt.Point point6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component7 = mobilePayGUI0.getComponentAt(point6);
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
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.setLocationByPlatform(false);
        java.awt.Image image3 = null;
        mobilePayGUI0.setIconImage(image3);
        javax.swing.JMenuBar jMenuBar5 = null;
        mobilePayGUI0.setJMenuBar(jMenuBar5);
        java.awt.ComponentOrientation componentOrientation7 = null;
        // The following exception was thrown during execution in test generation
        try {
            mobilePayGUI0.applyComponentOrientation(componentOrientation7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.Dimension dimension1 = null;
        mobilePayGUI0.setPreferredSize(dimension1);
        java.awt.event.ComponentListener componentListener3 = null;
        mobilePayGUI0.removeComponentListener(componentListener3);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = mobilePayGUI0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle7 = mobilePayGUI0.getBounds();
        int int8 = mobilePayGUI0.getCursorType();
        javax.swing.JLayeredPane jLayeredPane9 = null;
        // The following exception was thrown during execution in test generation
        try {
            mobilePayGUI0.setLayeredPane(jLayeredPane9);
            org.junit.Assert.fail("Expected exception of type java.awt.IllegalComponentStateException; message: layeredPane cannot be set to null.");
        } catch (java.awt.IllegalComponentStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(rectangle7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = mobilePayGUI0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle7 = mobilePayGUI0.getBounds();
        int int8 = mobilePayGUI0.getCursorType();
        java.awt.Rectangle rectangle9 = mobilePayGUI0.getBounds();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(rectangle7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(rectangle9);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.setLocationByPlatform(false);
        int int3 = mobilePayGUI0.getExtendedState();
        java.awt.Window window4 = mobilePayGUI0.getOwner();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(window4);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str5 = mobilePayGUI0.getTitle();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior6 = mobilePayGUI0.getBaselineResizeBehavior();
        java.awt.event.WindowListener windowListener7 = null;
        mobilePayGUI0.addWindowListener(windowListener7);
        java.awt.event.WindowFocusListener windowFocusListener9 = null;
        mobilePayGUI0.addWindowFocusListener(windowFocusListener9);
        java.awt.Font font11 = mobilePayGUI0.getFont();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Mobile Pay GUI" + "'", str5, "Mobile Pay GUI");
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior6 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior6.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(font11);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = mobilePayGUI0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle7 = mobilePayGUI0.getBounds();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray8 = mobilePayGUI0.getPropertyChangeListeners();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component10 = mobilePayGUI0.getComponent(11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: No such child: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(rectangle7);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray8);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.setFocusable(false);
        java.awt.event.MouseMotionListener[] mouseMotionListenerArray3 = mobilePayGUI0.getMouseMotionListeners();
        org.junit.Assert.assertNotNull(mouseMotionListenerArray3);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        mobilePayGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = mobilePayGUI0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        mobilePayGUI0.addMouseListener(mouseListener5);
        java.awt.Component component7 = mobilePayGUI0.getMostRecentFocusOwner();
        mobilePayGUI0.setAlwaysOnTop(false);
        javax.swing.TransferHandler transferHandler10 = mobilePayGUI0.getTransferHandler();
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertNull(transferHandler10);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.setLocationByPlatform(false);
        java.awt.Image image3 = null;
        mobilePayGUI0.setIconImage(image3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = mobilePayGUI0.areFocusTraversalKeysSet(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid focus traversal key identifier");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.awt.BufferCapabilities bufferCapabilities6 = null;
        // The following exception was thrown during execution in test generation
        try {
            mobilePayGUI0.createBufferStrategy(100, bufferCapabilities6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No capabilities specified");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.lang.String str1 = mobilePayGUI0.getTitle();
        java.awt.Cursor cursor2 = null;
        mobilePayGUI0.setCursor(cursor2);
        java.awt.event.WindowListener windowListener4 = null;
        mobilePayGUI0.addWindowListener(windowListener4);
        java.awt.Event event6 = null;
        park.MobilePayGUI mobilePayGUI7 = new park.MobilePayGUI();
        mobilePayGUI7.setLocationByPlatform(false);
        java.awt.Image image10 = null;
        mobilePayGUI7.setIconImage(image10);
        park.MobilePayGUI mobilePayGUI12 = new park.MobilePayGUI();
        mobilePayGUI12.setFocusable(false);
        java.awt.Event event15 = null;
        boolean boolean18 = mobilePayGUI12.mouseDrag(event15, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle19 = mobilePayGUI12.getBounds();
        mobilePayGUI7.setMixingCutoutShape((java.awt.Shape) rectangle19);
        boolean boolean21 = mobilePayGUI0.gotFocus(event6, (java.lang.Object) rectangle19);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener22 = null;
        mobilePayGUI0.removeHierarchyBoundsListener(hierarchyBoundsListener22);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Mobile Pay GUI" + "'", str1, "Mobile Pay GUI");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(rectangle19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        mobilePayGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = mobilePayGUI0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        mobilePayGUI0.addMouseListener(mouseListener5);
        java.awt.LayoutManager layoutManager7 = mobilePayGUI0.getLayout();
        mobilePayGUI0.move(11, 6);
        java.awt.Image image11 = null;
        mobilePayGUI0.setIconImage(image11);
        // The following exception was thrown during execution in test generation
        try {
            mobilePayGUI0.setOpacity((float) 0);
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
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str5 = mobilePayGUI0.getTitle();
        java.awt.event.FocusListener[] focusListenerArray6 = mobilePayGUI0.getFocusListeners();
        java.awt.Graphics graphics7 = null;
        // The following exception was thrown during execution in test generation
        try {
            mobilePayGUI0.paintAll(graphics7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Graphics.getClip()\" because \"g\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Mobile Pay GUI" + "'", str5, "Mobile Pay GUI");
        org.junit.Assert.assertNotNull(focusListenerArray6);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = mobilePayGUI0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        mobilePayGUI0.transferFocusBackward();
        park.MobilePayGUI mobilePayGUI8 = new park.MobilePayGUI();
        java.awt.Dimension dimension9 = null;
        mobilePayGUI8.setPreferredSize(dimension9);
        mobilePayGUI8.resize(7, 0);
        boolean boolean14 = mobilePayGUI8.isEnabled();
        mobilePayGUI8.setAlwaysOnTop(false);
        boolean boolean17 = mobilePayGUI8.isShowing();
        java.awt.Point point18 = null;
        java.awt.Point point19 = mobilePayGUI8.getLocation(point18);
        java.awt.Component component20 = mobilePayGUI0.findComponentAt(point19);
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
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.Dimension dimension1 = null;
        mobilePayGUI0.setPreferredSize(dimension1);
        park.MobilePayGUI mobilePayGUI4 = new park.MobilePayGUI();
        java.lang.String str5 = mobilePayGUI4.getTitle();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component6 = mobilePayGUI0.add("hi!", (java.awt.Component) mobilePayGUI4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Mobile Pay GUI" + "'", str5, "Mobile Pay GUI");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.lang.String str1 = mobilePayGUI0.getTitle();
        java.awt.ComponentOrientation componentOrientation2 = null;
        mobilePayGUI0.setComponentOrientation(componentOrientation2);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Mobile Pay GUI" + "'", str1, "Mobile Pay GUI");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        mobilePayGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = mobilePayGUI0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        mobilePayGUI0.addMouseListener(mouseListener5);
        java.awt.image.ColorModel colorModel7 = mobilePayGUI0.getColorModel();
        java.awt.Graphics graphics8 = null;
        // The following exception was thrown during execution in test generation
        try {
            mobilePayGUI0.printComponents(graphics8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Graphics.getClip()\" because \"g\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(colorModel7);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.util.Locale locale5 = null;
        mobilePayGUI0.setLocale(locale5);
        java.awt.event.InputMethodListener inputMethodListener7 = null;
        mobilePayGUI0.removeInputMethodListener(inputMethodListener7);
        java.awt.event.InputMethodListener inputMethodListener9 = null;
        mobilePayGUI0.addInputMethodListener(inputMethodListener9);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        mobilePayGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = mobilePayGUI0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        mobilePayGUI0.addMouseListener(mouseListener5);
        java.awt.LayoutManager layoutManager7 = mobilePayGUI0.getLayout();
        mobilePayGUI0.move(11, 6);
        javax.swing.JMenuBar jMenuBar11 = null;
        mobilePayGUI0.setJMenuBar(jMenuBar11);
        java.awt.image.ColorModel colorModel13 = mobilePayGUI0.getColorModel();
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(layoutManager7);
        org.junit.Assert.assertNotNull(colorModel13);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = mobilePayGUI0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle7 = mobilePayGUI0.getBounds();
        java.awt.Dimension dimension8 = mobilePayGUI0.getPreferredSize();
        java.util.List<java.awt.Image> imageList9 = mobilePayGUI0.getIconImages();
        park.MobilePayGUI mobilePayGUI10 = new park.MobilePayGUI();
        java.lang.String str11 = mobilePayGUI10.getTitle();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component13 = mobilePayGUI0.add((java.awt.Component) mobilePayGUI10, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal component position");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(rectangle7);
        org.junit.Assert.assertNotNull(dimension8);
        org.junit.Assert.assertNotNull(imageList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Mobile Pay GUI" + "'", str11, "Mobile Pay GUI");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.Dimension dimension1 = null;
        mobilePayGUI0.setPreferredSize(dimension1);
        mobilePayGUI0.doLayout();
        boolean boolean5 = mobilePayGUI0.areFocusTraversalKeysSet((int) (short) 1);
        javax.swing.JRootPane jRootPane6 = mobilePayGUI0.getRootPane();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray8 = mobilePayGUI0.getPropertyChangeListeners("");
        park.MobilePayGUI mobilePayGUI9 = new park.MobilePayGUI();
        java.awt.Dimension dimension10 = null;
        mobilePayGUI9.setPreferredSize(dimension10);
        mobilePayGUI9.resize(7, 0);
        boolean boolean15 = mobilePayGUI9.isEnabled();
        java.awt.Event event16 = null;
        boolean boolean18 = mobilePayGUI9.lostFocus(event16, (java.lang.Object) (short) 0);
        mobilePayGUI9.setFocusCycleRoot(true);
        park.MobilePayGUI mobilePayGUI21 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener22 = null;
        mobilePayGUI21.addMouseWheelListener(mouseWheelListener22);
        java.awt.Point point25 = mobilePayGUI21.getMousePosition(true);
        java.awt.event.MouseListener mouseListener26 = null;
        mobilePayGUI21.addMouseListener(mouseListener26);
        java.awt.Component component28 = mobilePayGUI21.getMostRecentFocusOwner();
        java.awt.MenuBar menuBar29 = null;
        mobilePayGUI21.setMenuBar(menuBar29);
        park.MobilePayGUI mobilePayGUI31 = new park.MobilePayGUI();
        java.lang.String str32 = mobilePayGUI31.getTitle();
        java.awt.Cursor cursor33 = null;
        mobilePayGUI31.setCursor(cursor33);
        java.awt.Dimension dimension35 = mobilePayGUI31.size();
        mobilePayGUI21.setPreferredSize(dimension35);
        java.awt.Dimension dimension37 = mobilePayGUI9.getSize(dimension35);
        mobilePayGUI0.setPreferredSize(dimension37);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jRootPane6);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(point25);
        org.junit.Assert.assertNotNull(component28);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Mobile Pay GUI" + "'", str32, "Mobile Pay GUI");
        org.junit.Assert.assertNotNull(dimension35);
        org.junit.Assert.assertNotNull(dimension37);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        mobilePayGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = mobilePayGUI0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        mobilePayGUI0.addMouseListener(mouseListener5);
        java.awt.Component component7 = mobilePayGUI0.getMostRecentFocusOwner();
        java.awt.MenuBar menuBar8 = null;
        mobilePayGUI0.setMenuBar(menuBar8);
        park.MobilePayGUI mobilePayGUI10 = new park.MobilePayGUI();
        java.lang.String str11 = mobilePayGUI10.getTitle();
        java.awt.Cursor cursor12 = null;
        mobilePayGUI10.setCursor(cursor12);
        java.awt.Dimension dimension14 = mobilePayGUI10.size();
        mobilePayGUI0.setSize(dimension14);
        boolean boolean16 = mobilePayGUI0.isValidateRoot();
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Mobile Pay GUI" + "'", str11, "Mobile Pay GUI");
        org.junit.Assert.assertNotNull(dimension14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.setLocationByPlatform(false);
        mobilePayGUI0.validate();
        mobilePayGUI0.toFront();
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        mobilePayGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = mobilePayGUI0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        mobilePayGUI0.addMouseListener(mouseListener5);
        java.awt.LayoutManager layoutManager7 = mobilePayGUI0.getLayout();
        mobilePayGUI0.move(11, 6);
        javax.swing.JMenuBar jMenuBar11 = null;
        mobilePayGUI0.setJMenuBar(jMenuBar11);
        mobilePayGUI0.firePropertyChange("", (long) (short) 1, (long) (-1));
        park.MobilePayGUI mobilePayGUI17 = new park.MobilePayGUI();
        java.lang.String str18 = mobilePayGUI17.getTitle();
        java.awt.Cursor cursor19 = null;
        mobilePayGUI17.setCursor(cursor19);
        java.awt.event.WindowListener windowListener21 = null;
        mobilePayGUI17.addWindowListener(windowListener21);
        java.awt.Event event23 = null;
        park.MobilePayGUI mobilePayGUI24 = new park.MobilePayGUI();
        mobilePayGUI24.setLocationByPlatform(false);
        java.awt.Image image27 = null;
        mobilePayGUI24.setIconImage(image27);
        park.MobilePayGUI mobilePayGUI29 = new park.MobilePayGUI();
        mobilePayGUI29.setFocusable(false);
        java.awt.Event event32 = null;
        boolean boolean35 = mobilePayGUI29.mouseDrag(event32, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle36 = mobilePayGUI29.getBounds();
        mobilePayGUI24.setMixingCutoutShape((java.awt.Shape) rectangle36);
        boolean boolean38 = mobilePayGUI17.gotFocus(event23, (java.lang.Object) rectangle36);
        mobilePayGUI0.setBounds(rectangle36);
        park.MobilePayGUI mobilePayGUI40 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener41 = null;
        mobilePayGUI40.addMouseWheelListener(mouseWheelListener41);
        java.awt.Point point44 = mobilePayGUI40.getMousePosition(true);
        java.awt.event.MouseListener mouseListener45 = null;
        mobilePayGUI40.addMouseListener(mouseListener45);
        java.awt.LayoutManager layoutManager47 = mobilePayGUI40.getLayout();
        mobilePayGUI40.move(11, 6);
        // The following exception was thrown during execution in test generation
        try {
            mobilePayGUI0.setComponentZOrder((java.awt.Component) mobilePayGUI40, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal component position");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(layoutManager7);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Mobile Pay GUI" + "'", str18, "Mobile Pay GUI");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(rectangle36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(point44);
        org.junit.Assert.assertNotNull(layoutManager47);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.lang.String str1 = mobilePayGUI0.getTitle();
        java.awt.Cursor cursor2 = null;
        mobilePayGUI0.setCursor(cursor2);
        java.awt.event.ActionEvent actionEvent4 = null;
        // The following exception was thrown during execution in test generation
        try {
            mobilePayGUI0.actionPerformed(actionEvent4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.event.ActionEvent.getSource()\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Mobile Pay GUI" + "'", str1, "Mobile Pay GUI");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        mobilePayGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = mobilePayGUI0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        mobilePayGUI0.addMouseListener(mouseListener5);
        java.awt.LayoutManager layoutManager7 = mobilePayGUI0.getLayout();
        mobilePayGUI0.move(11, 6);
        int int11 = mobilePayGUI0.getY();
        java.awt.PopupMenu popupMenu12 = null;
        // The following exception was thrown during execution in test generation
        try {
            mobilePayGUI0.add(popupMenu12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"parent\" because \"popup\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(layoutManager7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        mobilePayGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = mobilePayGUI0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        mobilePayGUI0.addMouseListener(mouseListener5);
        java.awt.Component component7 = mobilePayGUI0.getMostRecentFocusOwner();
        javax.swing.JMenuBar jMenuBar8 = mobilePayGUI0.getJMenuBar();
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
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str5 = mobilePayGUI0.getTitle();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior6 = mobilePayGUI0.getBaselineResizeBehavior();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener7 = null;
        mobilePayGUI0.removeHierarchyBoundsListener(hierarchyBoundsListener7);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Mobile Pay GUI" + "'", str5, "Mobile Pay GUI");
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior6 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior6.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.Dimension dimension1 = null;
        mobilePayGUI0.setPreferredSize(dimension1);
        mobilePayGUI0.resize(7, 0);
        boolean boolean6 = mobilePayGUI0.isEnabled();
        java.awt.Event event7 = null;
        boolean boolean9 = mobilePayGUI0.lostFocus(event7, (java.lang.Object) (short) 0);
        java.awt.Font font10 = mobilePayGUI0.getFont();
        int int11 = mobilePayGUI0.getCursorType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        mobilePayGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = mobilePayGUI0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        mobilePayGUI0.addMouseListener(mouseListener5);
        java.awt.Component component7 = mobilePayGUI0.getMostRecentFocusOwner();
        java.awt.MenuBar menuBar8 = null;
        mobilePayGUI0.setMenuBar(menuBar8);
        java.awt.event.ContainerListener containerListener10 = null;
        mobilePayGUI0.addContainerListener(containerListener10);
        mobilePayGUI0.setName("Mobile Pay GUI");
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(component7);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        javax.swing.JFrame.setDefaultLookAndFeelDecorated(true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.Dimension dimension1 = null;
        mobilePayGUI0.setPreferredSize(dimension1);
        mobilePayGUI0.resize(7, 0);
        boolean boolean6 = mobilePayGUI0.isEnabled();
        mobilePayGUI0.repaint((long) 7, (int) '#', (int) (short) 100, 9, (int) (byte) 0);
        int int13 = mobilePayGUI0.getComponentCount();
        java.awt.Event event14 = null;
        boolean boolean17 = mobilePayGUI0.mouseMove(event14, (int) (short) -1, (int) (short) 10);
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        mobilePayGUI0.removePropertyChangeListener("Mobile Pay GUI", propertyChangeListener19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        mobilePayGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = mobilePayGUI0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        mobilePayGUI0.addMouseListener(mouseListener5);
        java.awt.LayoutManager layoutManager7 = mobilePayGUI0.getLayout();
        mobilePayGUI0.move(11, 6);
        javax.swing.JMenuBar jMenuBar11 = null;
        mobilePayGUI0.setJMenuBar(jMenuBar11);
        mobilePayGUI0.firePropertyChange("", (long) (short) 1, (long) (-1));
        java.awt.event.ContainerListener containerListener17 = null;
        mobilePayGUI0.removeContainerListener(containerListener17);
        java.awt.Insets insets19 = mobilePayGUI0.getInsets();
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(layoutManager7);
        org.junit.Assert.assertNotNull(insets19);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.setLocationByPlatform(false);
        mobilePayGUI0.firePropertyChange("Mobile Pay GUI", (short) (byte) -1, (short) (byte) 1);
        boolean boolean7 = mobilePayGUI0.isOpaque();
        java.awt.AWTEvent aWTEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            mobilePayGUI0.dispatchEvent(aWTEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.AWTEvent.getID()\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        mobilePayGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = mobilePayGUI0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        mobilePayGUI0.addMouseListener(mouseListener5);
        java.awt.Component component7 = mobilePayGUI0.getMostRecentFocusOwner();
        java.awt.MenuBar menuBar8 = null;
        mobilePayGUI0.setMenuBar(menuBar8);
        park.MobilePayGUI mobilePayGUI10 = new park.MobilePayGUI();
        java.lang.String str11 = mobilePayGUI10.getTitle();
        java.awt.Cursor cursor12 = null;
        mobilePayGUI10.setCursor(cursor12);
        java.awt.Dimension dimension14 = mobilePayGUI10.size();
        mobilePayGUI0.setSize(dimension14);
        java.awt.event.HierarchyListener hierarchyListener16 = null;
        mobilePayGUI0.addHierarchyListener(hierarchyListener16);
        java.awt.Graphics graphics18 = null;
        // The following exception was thrown during execution in test generation
        try {
            mobilePayGUI0.print(graphics18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Graphics.getClip()\" because \"g\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Mobile Pay GUI" + "'", str11, "Mobile Pay GUI");
        org.junit.Assert.assertNotNull(dimension14);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = mobilePayGUI0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle7 = mobilePayGUI0.getBounds();
        java.awt.Dimension dimension8 = mobilePayGUI0.getPreferredSize();
        java.util.List<java.awt.Image> imageList9 = mobilePayGUI0.getIconImages();
        java.awt.Image image10 = null;
        mobilePayGUI0.setIconImage(image10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(rectangle7);
        org.junit.Assert.assertNotNull(dimension8);
        org.junit.Assert.assertNotNull(imageList9);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        mobilePayGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = mobilePayGUI0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        mobilePayGUI0.addMouseListener(mouseListener5);
        java.awt.LayoutManager layoutManager7 = mobilePayGUI0.getLayout();
        mobilePayGUI0.move(11, 6);
        javax.swing.JMenuBar jMenuBar11 = null;
        mobilePayGUI0.setJMenuBar(jMenuBar11);
        mobilePayGUI0.firePropertyChange("", (long) (short) 1, (long) (-1));
        boolean boolean17 = mobilePayGUI0.hasFocus();
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(layoutManager7);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        mobilePayGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = mobilePayGUI0.getMousePosition(true);
        boolean boolean5 = mobilePayGUI0.isAlwaysOnTopSupported();
        java.awt.event.HierarchyListener[] hierarchyListenerArray6 = mobilePayGUI0.getHierarchyListeners();
        java.awt.Dimension dimension7 = mobilePayGUI0.getPreferredSize();
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(hierarchyListenerArray6);
        org.junit.Assert.assertNotNull(dimension7);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        int int0 = java.awt.image.ImageObserver.ERROR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 64 + "'", int0 == 64);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        mobilePayGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = mobilePayGUI0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        mobilePayGUI0.addMouseListener(mouseListener5);
        java.awt.LayoutManager layoutManager7 = mobilePayGUI0.getLayout();
        mobilePayGUI0.move(11, 6);
        java.awt.Image image11 = null;
        mobilePayGUI0.setIconImage(image11);
        mobilePayGUI0.firePropertyChange("hi!", (short) 0, (short) (byte) 100);
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(layoutManager7);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        mobilePayGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = mobilePayGUI0.getMousePosition(true);
        park.MobilePayGUI mobilePayGUI5 = new park.MobilePayGUI();
        mobilePayGUI5.setLocationByPlatform(false);
        java.awt.Image image8 = null;
        mobilePayGUI5.setIconImage(image8);
        javax.swing.JMenuBar jMenuBar10 = null;
        mobilePayGUI5.setJMenuBar(jMenuBar10);
        java.awt.FocusTraversalPolicy focusTraversalPolicy12 = null;
        mobilePayGUI5.setFocusTraversalPolicy(focusTraversalPolicy12);
        park.MobilePayGUI mobilePayGUI14 = new park.MobilePayGUI();
        java.awt.Dimension dimension15 = null;
        mobilePayGUI14.setPreferredSize(dimension15);
        mobilePayGUI14.resize(7, 0);
        boolean boolean20 = mobilePayGUI14.isEnabled();
        java.awt.Event event21 = null;
        boolean boolean23 = mobilePayGUI14.lostFocus(event21, (java.lang.Object) (short) 0);
        java.awt.Font font24 = mobilePayGUI14.getFont();
        java.awt.FontMetrics fontMetrics25 = mobilePayGUI5.getFontMetrics(font24);
        java.awt.Cursor cursor26 = null;
        mobilePayGUI5.setCursor(cursor26);
        int int28 = mobilePayGUI0.getComponentZOrder((java.awt.Component) mobilePayGUI5);
        java.awt.Image image29 = null;
        park.MobilePayGUI mobilePayGUI30 = new park.MobilePayGUI();
        mobilePayGUI30.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str35 = mobilePayGUI30.getTitle();
        int int36 = mobilePayGUI0.checkImage(image29, (java.awt.image.ImageObserver) mobilePayGUI30);
        javax.swing.JMenuBar jMenuBar37 = mobilePayGUI0.getJMenuBar();
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Mobile Pay GUI" + "'", str35, "Mobile Pay GUI");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 32 + "'", int36 == 32);
        org.junit.Assert.assertNull(jMenuBar37);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        mobilePayGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = mobilePayGUI0.getMousePosition(true);
        java.awt.Font font5 = mobilePayGUI0.getFont();
        int int6 = mobilePayGUI0.getHeight();
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 200 + "'", int6 == 200);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.lang.String str1 = mobilePayGUI0.getTitle();
        java.awt.Cursor cursor2 = null;
        mobilePayGUI0.setCursor(cursor2);
        java.awt.Component component4 = mobilePayGUI0.getFocusOwner();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Mobile Pay GUI" + "'", str1, "Mobile Pay GUI");
        org.junit.Assert.assertNull(component4);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = mobilePayGUI0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        mobilePayGUI0.transferFocusBackward();
        java.awt.Event event8 = null;
        boolean boolean11 = mobilePayGUI0.mouseDown(event8, (int) (short) 10, (int) (byte) 100);
        java.awt.Image image12 = null;
        mobilePayGUI0.setIconImage(image12);
        java.awt.event.MouseMotionListener mouseMotionListener14 = null;
        mobilePayGUI0.addMouseMotionListener(mouseMotionListener14);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        mobilePayGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = mobilePayGUI0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        mobilePayGUI0.addMouseListener(mouseListener5);
        java.awt.LayoutManager layoutManager7 = mobilePayGUI0.getLayout();
        mobilePayGUI0.move(11, 6);
        javax.swing.JMenuBar jMenuBar11 = null;
        mobilePayGUI0.setJMenuBar(jMenuBar11);
        mobilePayGUI0.firePropertyChange("", (long) (short) 1, (long) (-1));
        park.MobilePayGUI mobilePayGUI17 = new park.MobilePayGUI();
        java.lang.String str18 = mobilePayGUI17.getTitle();
        java.awt.Cursor cursor19 = null;
        mobilePayGUI17.setCursor(cursor19);
        java.awt.event.WindowListener windowListener21 = null;
        mobilePayGUI17.addWindowListener(windowListener21);
        java.awt.Event event23 = null;
        park.MobilePayGUI mobilePayGUI24 = new park.MobilePayGUI();
        mobilePayGUI24.setLocationByPlatform(false);
        java.awt.Image image27 = null;
        mobilePayGUI24.setIconImage(image27);
        park.MobilePayGUI mobilePayGUI29 = new park.MobilePayGUI();
        mobilePayGUI29.setFocusable(false);
        java.awt.Event event32 = null;
        boolean boolean35 = mobilePayGUI29.mouseDrag(event32, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle36 = mobilePayGUI29.getBounds();
        mobilePayGUI24.setMixingCutoutShape((java.awt.Shape) rectangle36);
        boolean boolean38 = mobilePayGUI17.gotFocus(event23, (java.lang.Object) rectangle36);
        mobilePayGUI0.setBounds(rectangle36);
        java.awt.Toolkit toolkit40 = mobilePayGUI0.getToolkit();
        java.awt.Event event41 = null;
        boolean boolean44 = mobilePayGUI0.mouseDrag(event41, (int) ' ', 0);
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(layoutManager7);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Mobile Pay GUI" + "'", str18, "Mobile Pay GUI");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(rectangle36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(toolkit40);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = mobilePayGUI0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        mobilePayGUI0.transferFocusBackward();
        park.MobilePayGUI mobilePayGUI8 = new park.MobilePayGUI();
        java.awt.Dimension dimension9 = null;
        mobilePayGUI8.setPreferredSize(dimension9);
        mobilePayGUI8.resize(7, 0);
        boolean boolean14 = mobilePayGUI8.isEnabled();
        mobilePayGUI8.setAlwaysOnTop(false);
        boolean boolean17 = mobilePayGUI8.isShowing();
        java.awt.Point point18 = null;
        java.awt.Point point19 = mobilePayGUI8.getLocation(point18);
        java.awt.Component component20 = mobilePayGUI0.findComponentAt(point19);
        park.MobilePayGUI mobilePayGUI21 = new park.MobilePayGUI();
        java.awt.Dimension dimension22 = null;
        mobilePayGUI21.setPreferredSize(dimension22);
        mobilePayGUI21.doLayout();
        java.awt.Window.Type type25 = mobilePayGUI21.getType();
        // The following exception was thrown during execution in test generation
        try {
            mobilePayGUI0.setType(type25);
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
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.Dimension dimension1 = null;
        mobilePayGUI0.setPreferredSize(dimension1);
        mobilePayGUI0.resize(7, 0);
        boolean boolean6 = mobilePayGUI0.isEnabled();
        mobilePayGUI0.repaint((long) 7, (int) '#', (int) (short) 100, 9, (int) (byte) 0);
        mobilePayGUI0.repaint();
        int int14 = mobilePayGUI0.getX();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.Dimension dimension1 = null;
        mobilePayGUI0.setPreferredSize(dimension1);
        mobilePayGUI0.resize(7, 0);
        boolean boolean6 = mobilePayGUI0.isEnabled();
        mobilePayGUI0.setAlwaysOnTop(false);
        mobilePayGUI0.show(true);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior11 = mobilePayGUI0.getBaselineResizeBehavior();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior11 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior11.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.setFocusable(false);
        park.MobilePayGUI mobilePayGUI3 = new park.MobilePayGUI();
        java.awt.Dimension dimension4 = null;
        mobilePayGUI3.setPreferredSize(dimension4);
        mobilePayGUI3.doLayout();
        park.MobilePayGUI mobilePayGUI7 = new park.MobilePayGUI();
        mobilePayGUI7.setLocationByPlatform(false);
        java.awt.Image image10 = null;
        mobilePayGUI7.setIconImage(image10);
        javax.swing.JMenuBar jMenuBar12 = null;
        mobilePayGUI7.setJMenuBar(jMenuBar12);
        java.awt.FocusTraversalPolicy focusTraversalPolicy14 = null;
        mobilePayGUI7.setFocusTraversalPolicy(focusTraversalPolicy14);
        park.MobilePayGUI mobilePayGUI16 = new park.MobilePayGUI();
        java.awt.Dimension dimension17 = null;
        mobilePayGUI16.setPreferredSize(dimension17);
        mobilePayGUI16.resize(7, 0);
        boolean boolean22 = mobilePayGUI16.isEnabled();
        java.awt.Event event23 = null;
        boolean boolean25 = mobilePayGUI16.lostFocus(event23, (java.lang.Object) (short) 0);
        java.awt.Font font26 = mobilePayGUI16.getFont();
        java.awt.FontMetrics fontMetrics27 = mobilePayGUI7.getFontMetrics(font26);
        // The following exception was thrown during execution in test generation
        try {
            mobilePayGUI0.add((java.awt.Component) mobilePayGUI3, (java.lang.Object) mobilePayGUI7);
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
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        int int0 = java.awt.image.ImageObserver.ABORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 128 + "'", int0 == 128);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.lang.String str1 = mobilePayGUI0.getTitle();
        java.awt.Font font2 = null;
        mobilePayGUI0.setFont(font2);
        float float4 = mobilePayGUI0.getAlignmentY();
        java.util.ResourceBundle resourceBundle5 = null;
        // The following exception was thrown during execution in test generation
        try {
            mobilePayGUI0.applyResourceBundle(resourceBundle5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ResourceBundle.getLocale()\" because \"bdl\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Mobile Pay GUI" + "'", str1, "Mobile Pay GUI");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.5f + "'", float4 == 0.5f);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.Dimension dimension1 = null;
        mobilePayGUI0.setPreferredSize(dimension1);
        mobilePayGUI0.resize(7, 0);
        boolean boolean6 = mobilePayGUI0.isEnabled();
        mobilePayGUI0.setResizable(false);
        boolean boolean9 = mobilePayGUI0.getFocusTraversalKeysEnabled();
        java.awt.event.WindowStateListener[] windowStateListenerArray10 = mobilePayGUI0.getWindowStateListeners();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(windowStateListenerArray10);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.lang.String str1 = mobilePayGUI0.getTitle();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray2 = mobilePayGUI0.getPropertyChangeListeners();
        java.awt.Window[] windowArray3 = mobilePayGUI0.getOwnedWindows();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Mobile Pay GUI" + "'", str1, "Mobile Pay GUI");
        org.junit.Assert.assertNotNull(propertyChangeListenerArray2);
        org.junit.Assert.assertNotNull(windowArray3);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        mobilePayGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.event.MouseMotionListener mouseMotionListener3 = null;
        mobilePayGUI0.removeMouseMotionListener(mouseMotionListener3);
        java.awt.Event event5 = null;
        boolean boolean8 = mobilePayGUI0.mouseUp(event5, (int) (short) 0, (int) (short) -1);
        java.awt.Component component11 = mobilePayGUI0.locate(5, (int) ' ');
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        mobilePayGUI0.removePropertyChangeListener("", propertyChangeListener13);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(component11);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = mobilePayGUI0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle7 = mobilePayGUI0.getBounds();
        java.awt.Dimension dimension8 = mobilePayGUI0.getPreferredSize();
        java.util.List<java.awt.Image> imageList9 = mobilePayGUI0.getIconImages();
        java.awt.Graphics graphics10 = null;
        // The following exception was thrown during execution in test generation
        try {
            mobilePayGUI0.paint(graphics10);
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
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.Dimension dimension1 = null;
        mobilePayGUI0.setPreferredSize(dimension1);
        java.awt.Graphics graphics3 = null;
        // The following exception was thrown during execution in test generation
        try {
            mobilePayGUI0.paintComponents(graphics3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Graphics.getClip()\" because \"g\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.awt.Color color5 = mobilePayGUI0.getForeground();
        java.awt.Point point6 = mobilePayGUI0.getMousePosition();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener7 = null;
        mobilePayGUI0.removeHierarchyBoundsListener(hierarchyBoundsListener7);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(point6);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        mobilePayGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = mobilePayGUI0.getMousePosition(true);
        park.MobilePayGUI mobilePayGUI5 = new park.MobilePayGUI();
        mobilePayGUI5.setLocationByPlatform(false);
        java.awt.Image image8 = null;
        mobilePayGUI5.setIconImage(image8);
        javax.swing.JMenuBar jMenuBar10 = null;
        mobilePayGUI5.setJMenuBar(jMenuBar10);
        java.awt.FocusTraversalPolicy focusTraversalPolicy12 = null;
        mobilePayGUI5.setFocusTraversalPolicy(focusTraversalPolicy12);
        park.MobilePayGUI mobilePayGUI14 = new park.MobilePayGUI();
        java.awt.Dimension dimension15 = null;
        mobilePayGUI14.setPreferredSize(dimension15);
        mobilePayGUI14.resize(7, 0);
        boolean boolean20 = mobilePayGUI14.isEnabled();
        java.awt.Event event21 = null;
        boolean boolean23 = mobilePayGUI14.lostFocus(event21, (java.lang.Object) (short) 0);
        java.awt.Font font24 = mobilePayGUI14.getFont();
        java.awt.FontMetrics fontMetrics25 = mobilePayGUI5.getFontMetrics(font24);
        java.awt.Cursor cursor26 = null;
        mobilePayGUI5.setCursor(cursor26);
        int int28 = mobilePayGUI0.getComponentZOrder((java.awt.Component) mobilePayGUI5);
        java.beans.PropertyChangeListener propertyChangeListener30 = null;
        mobilePayGUI0.removePropertyChangeListener("hi!", propertyChangeListener30);
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(font24);
        org.junit.Assert.assertNotNull(fontMetrics25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str5 = mobilePayGUI0.getTitle();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior6 = mobilePayGUI0.getBaselineResizeBehavior();
        park.MobilePayGUI mobilePayGUI8 = new park.MobilePayGUI();
        java.awt.Dimension dimension9 = null;
        mobilePayGUI8.setPreferredSize(dimension9);
        mobilePayGUI8.resize(7, 0);
        boolean boolean14 = mobilePayGUI8.isEnabled();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component15 = mobilePayGUI0.add("", (java.awt.Component) mobilePayGUI8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Mobile Pay GUI" + "'", str5, "Mobile Pay GUI");
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior6 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior6.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        mobilePayGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = mobilePayGUI0.getMousePosition(true);
        park.MobilePayGUI mobilePayGUI5 = new park.MobilePayGUI();
        mobilePayGUI5.setLocationByPlatform(false);
        java.awt.Image image8 = null;
        mobilePayGUI5.setIconImage(image8);
        javax.swing.JMenuBar jMenuBar10 = null;
        mobilePayGUI5.setJMenuBar(jMenuBar10);
        java.awt.FocusTraversalPolicy focusTraversalPolicy12 = null;
        mobilePayGUI5.setFocusTraversalPolicy(focusTraversalPolicy12);
        park.MobilePayGUI mobilePayGUI14 = new park.MobilePayGUI();
        java.awt.Dimension dimension15 = null;
        mobilePayGUI14.setPreferredSize(dimension15);
        mobilePayGUI14.resize(7, 0);
        boolean boolean20 = mobilePayGUI14.isEnabled();
        java.awt.Event event21 = null;
        boolean boolean23 = mobilePayGUI14.lostFocus(event21, (java.lang.Object) (short) 0);
        java.awt.Font font24 = mobilePayGUI14.getFont();
        java.awt.FontMetrics fontMetrics25 = mobilePayGUI5.getFontMetrics(font24);
        java.awt.Cursor cursor26 = null;
        mobilePayGUI5.setCursor(cursor26);
        int int28 = mobilePayGUI0.getComponentZOrder((java.awt.Component) mobilePayGUI5);
        java.awt.Image image29 = null;
        park.MobilePayGUI mobilePayGUI30 = new park.MobilePayGUI();
        mobilePayGUI30.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str35 = mobilePayGUI30.getTitle();
        int int36 = mobilePayGUI0.checkImage(image29, (java.awt.image.ImageObserver) mobilePayGUI30);
        javax.swing.JMenuBar jMenuBar37 = mobilePayGUI0.getJMenuBar();
        // The following exception was thrown during execution in test generation
        try {
            mobilePayGUI0.setOpacity((float) (-1));
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Mobile Pay GUI" + "'", str35, "Mobile Pay GUI");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 32 + "'", int36 == 32);
        org.junit.Assert.assertNull(jMenuBar37);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.Dimension dimension1 = null;
        mobilePayGUI0.setPreferredSize(dimension1);
        mobilePayGUI0.doLayout();
        boolean boolean5 = mobilePayGUI0.areFocusTraversalKeysSet((int) (short) 1);
        javax.swing.JRootPane jRootPane6 = mobilePayGUI0.getRootPane();
        java.awt.Point point7 = mobilePayGUI0.getMousePosition();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jRootPane6);
        org.junit.Assert.assertNull(point7);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.lang.String str1 = mobilePayGUI0.getTitle();
        java.awt.Cursor cursor2 = null;
        mobilePayGUI0.setCursor(cursor2);
        java.awt.event.WindowListener windowListener4 = null;
        mobilePayGUI0.addWindowListener(windowListener4);
        java.awt.Event event6 = null;
        park.MobilePayGUI mobilePayGUI7 = new park.MobilePayGUI();
        mobilePayGUI7.setLocationByPlatform(false);
        java.awt.Image image10 = null;
        mobilePayGUI7.setIconImage(image10);
        park.MobilePayGUI mobilePayGUI12 = new park.MobilePayGUI();
        mobilePayGUI12.setFocusable(false);
        java.awt.Event event15 = null;
        boolean boolean18 = mobilePayGUI12.mouseDrag(event15, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle19 = mobilePayGUI12.getBounds();
        mobilePayGUI7.setMixingCutoutShape((java.awt.Shape) rectangle19);
        boolean boolean21 = mobilePayGUI0.gotFocus(event6, (java.lang.Object) rectangle19);
        mobilePayGUI0.hide();
        java.awt.Graphics graphics23 = null;
        mobilePayGUI0.printAll(graphics23);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Mobile Pay GUI" + "'", str1, "Mobile Pay GUI");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(rectangle19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = mobilePayGUI0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle7 = mobilePayGUI0.getBounds();
        java.awt.Graphics graphics8 = null;
        // The following exception was thrown during execution in test generation
        try {
            mobilePayGUI0.print(graphics8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Graphics.getClip()\" because \"g\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(rectangle7);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.setLocationByPlatform(false);
        mobilePayGUI0.setVisible(true);
        java.awt.Dimension dimension5 = mobilePayGUI0.getMaximumSize();
        java.awt.Dimension dimension6 = mobilePayGUI0.size();
        boolean boolean7 = mobilePayGUI0.isBackgroundSet();
        org.junit.Assert.assertNotNull(dimension5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.setLocationByPlatform(false);
        mobilePayGUI0.validate();
        mobilePayGUI0.reshape(7, 1, 6, 1);
        java.io.PrintStream printStream9 = null;
        // The following exception was thrown during execution in test generation
        try {
            mobilePayGUI0.list(printStream9, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintStream.print(String)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.Dimension dimension1 = null;
        mobilePayGUI0.setPreferredSize(dimension1);
        mobilePayGUI0.resize(7, 0);
        boolean boolean6 = mobilePayGUI0.isEnabled();
        java.awt.Event event7 = null;
        boolean boolean9 = mobilePayGUI0.lostFocus(event7, (java.lang.Object) (short) 0);
        mobilePayGUI0.setFocusCycleRoot(true);
        java.awt.ComponentOrientation componentOrientation12 = null;
        mobilePayGUI0.setComponentOrientation(componentOrientation12);
        mobilePayGUI0.setAutoRequestFocus(true);
        java.awt.ComponentOrientation componentOrientation16 = null;
        // The following exception was thrown during execution in test generation
        try {
            mobilePayGUI0.applyComponentOrientation(componentOrientation16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.Dimension dimension1 = null;
        mobilePayGUI0.setPreferredSize(dimension1);
        mobilePayGUI0.resize(7, 0);
        boolean boolean6 = mobilePayGUI0.isEnabled();
        java.awt.Event event7 = null;
        boolean boolean9 = mobilePayGUI0.lostFocus(event7, (java.lang.Object) (short) 0);
        java.awt.Font font10 = mobilePayGUI0.getFont();
        mobilePayGUI0.toBack();
        java.awt.Point point13 = mobilePayGUI0.getMousePosition(true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(font10);
        org.junit.Assert.assertNull(point13);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.lang.String str1 = mobilePayGUI0.getTitle();
        java.awt.Cursor cursor2 = null;
        mobilePayGUI0.setCursor(cursor2);
        java.awt.event.WindowListener windowListener4 = null;
        mobilePayGUI0.addWindowListener(windowListener4);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component7 = mobilePayGUI0.getComponent(4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: No such child: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Mobile Pay GUI" + "'", str1, "Mobile Pay GUI");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        mobilePayGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = mobilePayGUI0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        mobilePayGUI0.addMouseListener(mouseListener5);
        java.awt.image.ColorModel colorModel7 = mobilePayGUI0.getColorModel();
        int int8 = mobilePayGUI0.getCursorType();
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(colorModel7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        mobilePayGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.event.MouseMotionListener mouseMotionListener3 = null;
        mobilePayGUI0.removeMouseMotionListener(mouseMotionListener3);
        java.awt.Event event5 = null;
        boolean boolean8 = mobilePayGUI0.mouseUp(event5, (int) (short) 0, (int) (short) -1);
        java.awt.event.WindowListener windowListener9 = null;
        mobilePayGUI0.removeWindowListener(windowListener9);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.Dimension dimension1 = null;
        mobilePayGUI0.setPreferredSize(dimension1);
        mobilePayGUI0.resize(7, 0);
        boolean boolean6 = mobilePayGUI0.isEnabled();
        java.awt.Event event7 = null;
        boolean boolean9 = mobilePayGUI0.lostFocus(event7, (java.lang.Object) (short) 0);
        boolean boolean10 = mobilePayGUI0.isActive();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.setLocationByPlatform(false);
        mobilePayGUI0.setVisible(true);
        mobilePayGUI0.toBack();
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.lang.String str1 = mobilePayGUI0.getTitle();
        java.awt.Font font2 = null;
        mobilePayGUI0.setFont(font2);
        java.awt.MenuBar menuBar4 = mobilePayGUI0.getMenuBar();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Mobile Pay GUI" + "'", str1, "Mobile Pay GUI");
        org.junit.Assert.assertNull(menuBar4);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.lang.String str1 = mobilePayGUI0.getTitle();
        java.awt.Cursor cursor2 = null;
        mobilePayGUI0.setCursor(cursor2);
        java.awt.event.WindowListener windowListener4 = null;
        mobilePayGUI0.addWindowListener(windowListener4);
        java.io.PrintWriter printWriter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            mobilePayGUI0.list(printWriter6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(Object)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Mobile Pay GUI" + "'", str1, "Mobile Pay GUI");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.awt.Color color5 = mobilePayGUI0.getForeground();
        java.awt.Point point6 = mobilePayGUI0.getMousePosition();
        mobilePayGUI0.transferFocusBackward();
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(point6);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.setLocationByPlatform(false);
        java.awt.Image image3 = null;
        mobilePayGUI0.setIconImage(image3);
        park.MobilePayGUI mobilePayGUI5 = new park.MobilePayGUI();
        mobilePayGUI5.setFocusable(false);
        java.awt.Event event8 = null;
        boolean boolean11 = mobilePayGUI5.mouseDrag(event8, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle12 = mobilePayGUI5.getBounds();
        mobilePayGUI0.setMixingCutoutShape((java.awt.Shape) rectangle12);
        boolean boolean14 = mobilePayGUI0.isUndecorated();
        park.MobilePayGUI mobilePayGUI15 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener16 = null;
        mobilePayGUI15.addMouseWheelListener(mouseWheelListener16);
        java.awt.Point point19 = mobilePayGUI15.getMousePosition(true);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray20 = mobilePayGUI15.getPropertyChangeListeners();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener21 = null;
        mobilePayGUI15.removeHierarchyBoundsListener(hierarchyBoundsListener21);
        java.awt.Image image25 = mobilePayGUI15.createImage(6, (int) (short) 100);
        park.MobilePayGUI mobilePayGUI28 = new park.MobilePayGUI();
        mobilePayGUI28.setFocusable(false);
        java.awt.Event event31 = null;
        boolean boolean34 = mobilePayGUI28.mouseDrag(event31, (int) (byte) 1, (int) (short) 1);
        mobilePayGUI28.transferFocusBackward();
        park.MobilePayGUI mobilePayGUI36 = new park.MobilePayGUI();
        java.awt.Dimension dimension37 = null;
        mobilePayGUI36.setPreferredSize(dimension37);
        mobilePayGUI36.resize(7, 0);
        boolean boolean42 = mobilePayGUI36.isEnabled();
        mobilePayGUI36.setAlwaysOnTop(false);
        boolean boolean45 = mobilePayGUI36.isShowing();
        java.awt.Point point46 = null;
        java.awt.Point point47 = mobilePayGUI36.getLocation(point46);
        java.awt.Component component48 = mobilePayGUI28.findComponentAt(point47);
        java.awt.Event event49 = null;
        boolean boolean52 = mobilePayGUI28.mouseMove(event49, 10, (int) (short) 1);
        mobilePayGUI28.hide();
        boolean boolean54 = mobilePayGUI0.prepareImage(image25, 8, (int) (byte) 1, (java.awt.image.ImageObserver) mobilePayGUI28);
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
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        mobilePayGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = mobilePayGUI0.getMousePosition(true);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray5 = mobilePayGUI0.getPropertyChangeListeners();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener6 = null;
        mobilePayGUI0.removeHierarchyBoundsListener(hierarchyBoundsListener6);
        java.awt.GraphicsConfiguration graphicsConfiguration8 = mobilePayGUI0.getGraphicsConfiguration();
        java.awt.Image image9 = mobilePayGUI0.getIconImage();
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray5);
        org.junit.Assert.assertNotNull(graphicsConfiguration8);
        org.junit.Assert.assertNull(image9);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        mobilePayGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = mobilePayGUI0.getMousePosition(true);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray5 = mobilePayGUI0.getPropertyChangeListeners();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener6 = null;
        mobilePayGUI0.removeHierarchyBoundsListener(hierarchyBoundsListener6);
        java.awt.Image image10 = mobilePayGUI0.createImage(6, (int) (short) 100);
        park.MobilePayGUI mobilePayGUI11 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener12 = null;
        mobilePayGUI11.addMouseWheelListener(mouseWheelListener12);
        java.awt.Point point15 = mobilePayGUI11.getMousePosition(true);
        java.awt.event.MouseListener mouseListener16 = null;
        mobilePayGUI11.addMouseListener(mouseListener16);
        java.awt.Component component18 = mobilePayGUI11.getMostRecentFocusOwner();
        javax.swing.JMenuBar jMenuBar19 = mobilePayGUI11.getJMenuBar();
        mobilePayGUI11.disable();
        java.awt.event.InputMethodListener inputMethodListener21 = null;
        mobilePayGUI11.removeInputMethodListener(inputMethodListener21);
        int int23 = mobilePayGUI0.getComponentZOrder((java.awt.Component) mobilePayGUI11);
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray5);
        org.junit.Assert.assertNotNull(image10);
        org.junit.Assert.assertNull(point15);
        org.junit.Assert.assertNotNull(component18);
        org.junit.Assert.assertNull(jMenuBar19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.lang.String str1 = mobilePayGUI0.getTitle();
        java.awt.Cursor cursor2 = null;
        mobilePayGUI0.setCursor(cursor2);
        java.awt.event.WindowListener windowListener4 = null;
        mobilePayGUI0.addWindowListener(windowListener4);
        mobilePayGUI0.firePropertyChange("Mobile Pay GUI", (long) '#', (long) (byte) 0);
        java.awt.Color color10 = mobilePayGUI0.getBackground();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Mobile Pay GUI" + "'", str1, "Mobile Pay GUI");
        org.junit.Assert.assertNotNull(color10);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        mobilePayGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = mobilePayGUI0.getMousePosition(true);
        park.MobilePayGUI mobilePayGUI5 = new park.MobilePayGUI();
        mobilePayGUI5.setLocationByPlatform(false);
        java.awt.Image image8 = null;
        mobilePayGUI5.setIconImage(image8);
        javax.swing.JMenuBar jMenuBar10 = null;
        mobilePayGUI5.setJMenuBar(jMenuBar10);
        java.awt.FocusTraversalPolicy focusTraversalPolicy12 = null;
        mobilePayGUI5.setFocusTraversalPolicy(focusTraversalPolicy12);
        park.MobilePayGUI mobilePayGUI14 = new park.MobilePayGUI();
        java.awt.Dimension dimension15 = null;
        mobilePayGUI14.setPreferredSize(dimension15);
        mobilePayGUI14.resize(7, 0);
        boolean boolean20 = mobilePayGUI14.isEnabled();
        java.awt.Event event21 = null;
        boolean boolean23 = mobilePayGUI14.lostFocus(event21, (java.lang.Object) (short) 0);
        java.awt.Font font24 = mobilePayGUI14.getFont();
        java.awt.FontMetrics fontMetrics25 = mobilePayGUI5.getFontMetrics(font24);
        java.awt.Cursor cursor26 = null;
        mobilePayGUI5.setCursor(cursor26);
        int int28 = mobilePayGUI0.getComponentZOrder((java.awt.Component) mobilePayGUI5);
        mobilePayGUI5.enable(false);
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(font24);
        org.junit.Assert.assertNotNull(fontMetrics25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.setLocationByPlatform(false);
        mobilePayGUI0.setVisible(true);
        java.awt.Dimension dimension5 = mobilePayGUI0.getMaximumSize();
        java.awt.Dimension dimension6 = mobilePayGUI0.size();
        java.awt.Insets insets7 = mobilePayGUI0.getInsets();
        mobilePayGUI0.setFocusable(true);
        mobilePayGUI0.layout();
        java.awt.Graphics graphics11 = null;
        // The following exception was thrown during execution in test generation
        try {
            mobilePayGUI0.paintComponents(graphics11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Graphics.getClip()\" because \"g\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dimension5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNotNull(insets7);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        mobilePayGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.event.MouseMotionListener mouseMotionListener3 = null;
        mobilePayGUI0.removeMouseMotionListener(mouseMotionListener3);
        java.awt.event.HierarchyListener[] hierarchyListenerArray5 = mobilePayGUI0.getHierarchyListeners();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener6 = null;
        mobilePayGUI0.removeHierarchyBoundsListener(hierarchyBoundsListener6);
        java.io.PrintStream printStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            mobilePayGUI0.list(printStream8, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintStream.println(Object)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hierarchyListenerArray5);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.lang.String str1 = mobilePayGUI0.getTitle();
        java.awt.Cursor cursor2 = null;
        mobilePayGUI0.setCursor(cursor2);
        java.awt.event.WindowListener windowListener4 = null;
        mobilePayGUI0.addWindowListener(windowListener4);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior6 = mobilePayGUI0.getBaselineResizeBehavior();
        boolean boolean7 = mobilePayGUI0.isAutoRequestFocus();
        java.awt.event.HierarchyListener hierarchyListener8 = null;
        mobilePayGUI0.addHierarchyListener(hierarchyListener8);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Mobile Pay GUI" + "'", str1, "Mobile Pay GUI");
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior6 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior6.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = mobilePayGUI0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle7 = mobilePayGUI0.getBounds();
        java.awt.Component component10 = mobilePayGUI0.getComponentAt(7, 6);
        park.MobilePayGUI mobilePayGUI11 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener12 = null;
        mobilePayGUI11.addMouseWheelListener(mouseWheelListener12);
        java.awt.Point point15 = mobilePayGUI11.getMousePosition(true);
        java.awt.event.MouseListener mouseListener16 = null;
        mobilePayGUI11.addMouseListener(mouseListener16);
        java.awt.LayoutManager layoutManager18 = mobilePayGUI11.getLayout();
        mobilePayGUI11.move(11, 6);
        int int22 = mobilePayGUI0.getComponentZOrder((java.awt.Component) mobilePayGUI11);
        java.beans.PropertyChangeListener propertyChangeListener24 = null;
        mobilePayGUI11.removePropertyChangeListener("Mobile Pay GUI", propertyChangeListener24);
        mobilePayGUI11.setAlwaysOnTop(false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(rectangle7);
        org.junit.Assert.assertNotNull(component10);
        org.junit.Assert.assertNull(point15);
        org.junit.Assert.assertNotNull(layoutManager18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        mobilePayGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = mobilePayGUI0.getMousePosition(true);
        park.MobilePayGUI mobilePayGUI5 = new park.MobilePayGUI();
        mobilePayGUI5.setLocationByPlatform(false);
        java.awt.Image image8 = null;
        mobilePayGUI5.setIconImage(image8);
        javax.swing.JMenuBar jMenuBar10 = null;
        mobilePayGUI5.setJMenuBar(jMenuBar10);
        java.awt.FocusTraversalPolicy focusTraversalPolicy12 = null;
        mobilePayGUI5.setFocusTraversalPolicy(focusTraversalPolicy12);
        park.MobilePayGUI mobilePayGUI14 = new park.MobilePayGUI();
        java.awt.Dimension dimension15 = null;
        mobilePayGUI14.setPreferredSize(dimension15);
        mobilePayGUI14.resize(7, 0);
        boolean boolean20 = mobilePayGUI14.isEnabled();
        java.awt.Event event21 = null;
        boolean boolean23 = mobilePayGUI14.lostFocus(event21, (java.lang.Object) (short) 0);
        java.awt.Font font24 = mobilePayGUI14.getFont();
        java.awt.FontMetrics fontMetrics25 = mobilePayGUI5.getFontMetrics(font24);
        java.awt.Cursor cursor26 = null;
        mobilePayGUI5.setCursor(cursor26);
        int int28 = mobilePayGUI0.getComponentZOrder((java.awt.Component) mobilePayGUI5);
        java.awt.Image image29 = null;
        park.MobilePayGUI mobilePayGUI30 = new park.MobilePayGUI();
        mobilePayGUI30.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str35 = mobilePayGUI30.getTitle();
        int int36 = mobilePayGUI0.checkImage(image29, (java.awt.image.ImageObserver) mobilePayGUI30);
        park.MobilePayGUI mobilePayGUI38 = new park.MobilePayGUI();
        mobilePayGUI38.setFocusable(false);
        java.awt.Event event41 = null;
        boolean boolean44 = mobilePayGUI38.mouseDrag(event41, (int) (byte) 1, (int) (short) 1);
        boolean boolean45 = mobilePayGUI38.getFocusableWindowState();
        javax.swing.JLayeredPane jLayeredPane46 = mobilePayGUI38.getLayeredPane();
        park.MobilePayGUI mobilePayGUI47 = new park.MobilePayGUI();
        java.awt.Dimension dimension48 = null;
        mobilePayGUI47.setPreferredSize(dimension48);
        mobilePayGUI47.resize(7, 0);
        java.awt.Event event53 = null;
        park.MobilePayGUI mobilePayGUI54 = new park.MobilePayGUI();
        mobilePayGUI54.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.awt.Color color59 = mobilePayGUI54.getForeground();
        boolean boolean60 = mobilePayGUI47.action(event53, (java.lang.Object) mobilePayGUI54);
        java.awt.Dimension dimension61 = mobilePayGUI54.size();
        mobilePayGUI38.setSize(dimension61);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component63 = mobilePayGUI0.add("hi!", (java.awt.Component) mobilePayGUI38);
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Mobile Pay GUI" + "'", str35, "Mobile Pay GUI");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 32 + "'", int36 == 32);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(jLayeredPane46);
        org.junit.Assert.assertNotNull(color59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(dimension61);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.Dimension dimension1 = null;
        mobilePayGUI0.setPreferredSize(dimension1);
        mobilePayGUI0.resize(7, 0);
        boolean boolean6 = mobilePayGUI0.isEnabled();
        java.awt.Event event7 = null;
        boolean boolean9 = mobilePayGUI0.lostFocus(event7, (java.lang.Object) (short) 0);
        mobilePayGUI0.setFocusable(false);
        boolean boolean12 = mobilePayGUI0.isFocusable();
        boolean boolean14 = mobilePayGUI0.areFocusTraversalKeysSet((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        mobilePayGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = mobilePayGUI0.getMousePosition(true);
        boolean boolean5 = mobilePayGUI0.isAlwaysOnTopSupported();
        java.awt.event.HierarchyListener[] hierarchyListenerArray6 = mobilePayGUI0.getHierarchyListeners();
        park.MobilePayGUI mobilePayGUI7 = new park.MobilePayGUI();
        java.awt.Dimension dimension8 = null;
        mobilePayGUI7.setPreferredSize(dimension8);
        mobilePayGUI7.resize(7, 0);
        java.awt.Event event13 = null;
        park.MobilePayGUI mobilePayGUI14 = new park.MobilePayGUI();
        mobilePayGUI14.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.awt.Color color19 = mobilePayGUI14.getForeground();
        boolean boolean20 = mobilePayGUI7.action(event13, (java.lang.Object) mobilePayGUI14);
        java.awt.Dimension dimension21 = mobilePayGUI14.size();
        park.MobilePayGUI mobilePayGUI22 = new park.MobilePayGUI();
        mobilePayGUI22.firePropertyChange("", (long) 7, (long) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            mobilePayGUI0.add((java.awt.Component) mobilePayGUI14, (java.lang.Object) (byte) -1);
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
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str5 = mobilePayGUI0.getTitle();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior6 = mobilePayGUI0.getBaselineResizeBehavior();
        java.awt.event.WindowListener windowListener7 = null;
        mobilePayGUI0.addWindowListener(windowListener7);
        java.awt.event.WindowFocusListener windowFocusListener9 = null;
        mobilePayGUI0.addWindowFocusListener(windowFocusListener9);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        mobilePayGUI0.removePropertyChangeListener("", propertyChangeListener12);
        java.awt.event.ComponentListener componentListener14 = null;
        mobilePayGUI0.removeComponentListener(componentListener14);
        boolean boolean16 = mobilePayGUI0.isActive();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Mobile Pay GUI" + "'", str5, "Mobile Pay GUI");
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior6 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior6.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.util.Locale locale5 = null;
        mobilePayGUI0.setLocale(locale5);
        park.MobilePayGUI mobilePayGUI7 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener8 = null;
        mobilePayGUI7.addMouseWheelListener(mouseWheelListener8);
        java.awt.Point point11 = mobilePayGUI7.getMousePosition(true);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray12 = mobilePayGUI7.getPropertyChangeListeners();
        java.awt.event.ComponentListener componentListener13 = null;
        mobilePayGUI7.addComponentListener(componentListener13);
        mobilePayGUI7.setCursor((int) (short) 1);
        int int17 = mobilePayGUI0.getComponentZOrder((java.awt.Component) mobilePayGUI7);
        org.junit.Assert.assertNull(point11);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        mobilePayGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = mobilePayGUI0.getMousePosition(true);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray5 = mobilePayGUI0.getPropertyChangeListeners();
        java.awt.event.ComponentListener componentListener6 = null;
        mobilePayGUI0.addComponentListener(componentListener6);
        mobilePayGUI0.setCursor((int) (short) 1);
        java.awt.Component component10 = mobilePayGUI0.getFocusOwner();
        mobilePayGUI0.move(1, 10);
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray5);
        org.junit.Assert.assertNull(component10);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        mobilePayGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = mobilePayGUI0.getMousePosition(true);
        park.MobilePayGUI mobilePayGUI5 = new park.MobilePayGUI();
        mobilePayGUI5.setLocationByPlatform(false);
        java.awt.Image image8 = null;
        mobilePayGUI5.setIconImage(image8);
        javax.swing.JMenuBar jMenuBar10 = null;
        mobilePayGUI5.setJMenuBar(jMenuBar10);
        java.awt.FocusTraversalPolicy focusTraversalPolicy12 = null;
        mobilePayGUI5.setFocusTraversalPolicy(focusTraversalPolicy12);
        park.MobilePayGUI mobilePayGUI14 = new park.MobilePayGUI();
        java.awt.Dimension dimension15 = null;
        mobilePayGUI14.setPreferredSize(dimension15);
        mobilePayGUI14.resize(7, 0);
        boolean boolean20 = mobilePayGUI14.isEnabled();
        java.awt.Event event21 = null;
        boolean boolean23 = mobilePayGUI14.lostFocus(event21, (java.lang.Object) (short) 0);
        java.awt.Font font24 = mobilePayGUI14.getFont();
        java.awt.FontMetrics fontMetrics25 = mobilePayGUI5.getFontMetrics(font24);
        java.awt.Cursor cursor26 = null;
        mobilePayGUI5.setCursor(cursor26);
        int int28 = mobilePayGUI0.getComponentZOrder((java.awt.Component) mobilePayGUI5);
        java.awt.Image image29 = null;
        park.MobilePayGUI mobilePayGUI30 = new park.MobilePayGUI();
        mobilePayGUI30.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str35 = mobilePayGUI30.getTitle();
        int int36 = mobilePayGUI0.checkImage(image29, (java.awt.image.ImageObserver) mobilePayGUI30);
        java.awt.LayoutManager layoutManager37 = mobilePayGUI30.getLayout();
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(font24);
        org.junit.Assert.assertNotNull(fontMetrics25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Mobile Pay GUI" + "'", str35, "Mobile Pay GUI");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 32 + "'", int36 == 32);
        org.junit.Assert.assertNotNull(layoutManager37);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.util.Locale locale5 = null;
        mobilePayGUI0.setLocale(locale5);
        java.awt.event.InputMethodListener inputMethodListener7 = null;
        mobilePayGUI0.removeInputMethodListener(inputMethodListener7);
        // The following exception was thrown during execution in test generation
        try {
            mobilePayGUI0.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = mobilePayGUI0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        mobilePayGUI0.transferFocusBackward();
        java.awt.Event event8 = null;
        boolean boolean11 = mobilePayGUI0.mouseDown(event8, (int) (short) 10, (int) (byte) 100);
        java.awt.Image image12 = null;
        mobilePayGUI0.setIconImage(image12);
        mobilePayGUI0.setState(7);
        mobilePayGUI0.resize(7, (-1));
        java.awt.event.HierarchyListener hierarchyListener19 = null;
        mobilePayGUI0.removeHierarchyListener(hierarchyListener19);
        park.MobilePayGUI mobilePayGUI21 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener22 = null;
        mobilePayGUI21.addMouseWheelListener(mouseWheelListener22);
        java.awt.Point point25 = mobilePayGUI21.getMousePosition(true);
        java.awt.event.MouseListener mouseListener26 = null;
        mobilePayGUI21.addMouseListener(mouseListener26);
        java.awt.LayoutManager layoutManager28 = mobilePayGUI21.getLayout();
        mobilePayGUI0.setLayout(layoutManager28);
        java.awt.event.ComponentListener componentListener30 = null;
        mobilePayGUI0.removeComponentListener(componentListener30);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(point25);
        org.junit.Assert.assertNotNull(layoutManager28);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        mobilePayGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = mobilePayGUI0.getMousePosition(true);
        park.MobilePayGUI mobilePayGUI5 = new park.MobilePayGUI();
        mobilePayGUI5.setLocationByPlatform(false);
        java.awt.Image image8 = null;
        mobilePayGUI5.setIconImage(image8);
        javax.swing.JMenuBar jMenuBar10 = null;
        mobilePayGUI5.setJMenuBar(jMenuBar10);
        java.awt.FocusTraversalPolicy focusTraversalPolicy12 = null;
        mobilePayGUI5.setFocusTraversalPolicy(focusTraversalPolicy12);
        park.MobilePayGUI mobilePayGUI14 = new park.MobilePayGUI();
        java.awt.Dimension dimension15 = null;
        mobilePayGUI14.setPreferredSize(dimension15);
        mobilePayGUI14.resize(7, 0);
        boolean boolean20 = mobilePayGUI14.isEnabled();
        java.awt.Event event21 = null;
        boolean boolean23 = mobilePayGUI14.lostFocus(event21, (java.lang.Object) (short) 0);
        java.awt.Font font24 = mobilePayGUI14.getFont();
        java.awt.FontMetrics fontMetrics25 = mobilePayGUI5.getFontMetrics(font24);
        java.awt.Cursor cursor26 = null;
        mobilePayGUI5.setCursor(cursor26);
        int int28 = mobilePayGUI0.getComponentZOrder((java.awt.Component) mobilePayGUI5);
        park.MobilePayGUI mobilePayGUI29 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener30 = null;
        mobilePayGUI29.addMouseWheelListener(mouseWheelListener30);
        java.awt.Point point33 = mobilePayGUI29.getMousePosition(true);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray34 = mobilePayGUI29.getPropertyChangeListeners();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener35 = null;
        mobilePayGUI29.removeHierarchyBoundsListener(hierarchyBoundsListener35);
        java.awt.Image image39 = mobilePayGUI29.createImage(6, (int) (short) 100);
        java.awt.Cursor cursor40 = mobilePayGUI29.getCursor();
        mobilePayGUI5.setCursor(cursor40);
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
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.Dimension dimension1 = null;
        mobilePayGUI0.setPreferredSize(dimension1);
        mobilePayGUI0.resize(7, 0);
        java.awt.Event event6 = null;
        park.MobilePayGUI mobilePayGUI7 = new park.MobilePayGUI();
        mobilePayGUI7.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.awt.Color color12 = mobilePayGUI7.getForeground();
        boolean boolean13 = mobilePayGUI0.action(event6, (java.lang.Object) mobilePayGUI7);
        java.awt.image.ImageProducer imageProducer14 = null;
        java.awt.Image image15 = mobilePayGUI7.createImage(imageProducer14);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(image15);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str5 = mobilePayGUI0.getTitle();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior6 = mobilePayGUI0.getBaselineResizeBehavior();
        java.awt.event.WindowListener windowListener7 = null;
        mobilePayGUI0.addWindowListener(windowListener7);
        park.MobilePayGUI mobilePayGUI9 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener10 = null;
        mobilePayGUI9.addMouseWheelListener(mouseWheelListener10);
        java.awt.Point point13 = mobilePayGUI9.getMousePosition(true);
        java.awt.event.MouseListener mouseListener14 = null;
        mobilePayGUI9.addMouseListener(mouseListener14);
        park.MobilePayGUI mobilePayGUI16 = new park.MobilePayGUI();
        mobilePayGUI16.setFocusable(false);
        java.awt.Event event19 = null;
        boolean boolean22 = mobilePayGUI16.mouseDrag(event19, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle23 = mobilePayGUI16.getBounds();
        java.awt.Rectangle rectangle24 = mobilePayGUI9.getBounds(rectangle23);
        mobilePayGUI0.setMaximizedBounds(rectangle24);
        mobilePayGUI0.setAlwaysOnTop(false);
        java.util.List<java.awt.Image> imageList28 = mobilePayGUI0.getIconImages();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Mobile Pay GUI" + "'", str5, "Mobile Pay GUI");
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior6 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior6.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNull(point13);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(rectangle23);
        org.junit.Assert.assertNotNull(rectangle24);
        org.junit.Assert.assertNotNull(imageList28);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = mobilePayGUI0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        boolean boolean7 = mobilePayGUI0.getFocusableWindowState();
        javax.swing.JLayeredPane jLayeredPane8 = mobilePayGUI0.getLayeredPane();
        boolean boolean9 = mobilePayGUI0.isPreferredSizeSet();
        mobilePayGUI0.validate();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(jLayeredPane8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        mobilePayGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = mobilePayGUI0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        mobilePayGUI0.addMouseListener(mouseListener5);
        java.awt.image.ColorModel colorModel7 = mobilePayGUI0.getColorModel();
        java.awt.Toolkit toolkit8 = mobilePayGUI0.getToolkit();
        mobilePayGUI0.firePropertyChange("hi!", 'a', ' ');
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(colorModel7);
        org.junit.Assert.assertNotNull(toolkit8);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        mobilePayGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.event.MouseMotionListener mouseMotionListener3 = null;
        mobilePayGUI0.removeMouseMotionListener(mouseMotionListener3);
        java.awt.Event event5 = null;
        boolean boolean8 = mobilePayGUI0.mouseUp(event5, (int) (short) 0, (int) (short) -1);
        java.awt.Component component11 = mobilePayGUI0.locate(5, (int) ' ');
        boolean boolean12 = mobilePayGUI0.hasFocus();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(component11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.setLocationByPlatform(false);
        mobilePayGUI0.setVisible(true);
        int int7 = mobilePayGUI0.getBaseline(1, 10);
        java.awt.Point point8 = mobilePayGUI0.getLocation();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(point8);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.util.Locale locale5 = null;
        mobilePayGUI0.setLocale(locale5);
        java.awt.LayoutManager layoutManager7 = mobilePayGUI0.getLayout();
        // The following exception was thrown during execution in test generation
        try {
            mobilePayGUI0.setUndecorated(true);
            org.junit.Assert.fail("Expected exception of type java.awt.IllegalComponentStateException; message: The frame is displayable.");
        } catch (java.awt.IllegalComponentStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(layoutManager7);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = mobilePayGUI0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle7 = mobilePayGUI0.getBounds();
        java.awt.Dimension dimension8 = mobilePayGUI0.getPreferredSize();
        javax.swing.JRootPane jRootPane9 = mobilePayGUI0.getRootPane();
        boolean boolean10 = mobilePayGUI0.isOpaque();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.image.VolatileImage volatileImage13 = mobilePayGUI0.createVolatileImage(0, (int) (short) 10);
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
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.awt.Color color5 = mobilePayGUI0.getForeground();
        java.awt.Point point6 = mobilePayGUI0.getMousePosition();
        park.MobilePayGUI mobilePayGUI7 = new park.MobilePayGUI();
        mobilePayGUI7.setFocusable(false);
        java.awt.Event event10 = null;
        boolean boolean13 = mobilePayGUI7.mouseDrag(event10, (int) (byte) 1, (int) (short) 1);
        mobilePayGUI7.transferFocusBackward();
        java.awt.Event event15 = null;
        boolean boolean18 = mobilePayGUI7.mouseDown(event15, (int) (short) 10, (int) (byte) 100);
        park.MobilePayGUI mobilePayGUI19 = new park.MobilePayGUI();
        mobilePayGUI19.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str24 = mobilePayGUI19.getTitle();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior25 = mobilePayGUI19.getBaselineResizeBehavior();
        park.MobilePayGUI mobilePayGUI26 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener27 = null;
        mobilePayGUI26.addMouseWheelListener(mouseWheelListener27);
        java.awt.Point point30 = mobilePayGUI26.getMousePosition(true);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray31 = mobilePayGUI26.getPropertyChangeListeners();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener32 = null;
        mobilePayGUI26.removeHierarchyBoundsListener(hierarchyBoundsListener32);
        java.awt.Image image36 = mobilePayGUI26.createImage(6, (int) (short) 100);
        mobilePayGUI19.setIconImage(image36);
        park.MobilePayGUI mobilePayGUI38 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener39 = null;
        mobilePayGUI38.addMouseWheelListener(mouseWheelListener39);
        java.awt.event.MouseMotionListener mouseMotionListener41 = null;
        mobilePayGUI38.removeMouseMotionListener(mouseMotionListener41);
        java.awt.Event event43 = null;
        boolean boolean46 = mobilePayGUI38.mouseUp(event43, (int) (short) 0, (int) (short) -1);
        java.awt.Component component49 = mobilePayGUI38.locate(5, (int) ' ');
        int int50 = mobilePayGUI7.checkImage(image36, (java.awt.image.ImageObserver) component49);
        park.MobilePayGUI mobilePayGUI53 = new park.MobilePayGUI();
        mobilePayGUI53.setLocationByPlatform(false);
        mobilePayGUI53.firePropertyChange("Mobile Pay GUI", (short) (byte) -1, (short) (byte) 1);
        boolean boolean60 = mobilePayGUI53.isFocusTraversable();
        boolean boolean61 = mobilePayGUI0.prepareImage(image36, 11, (int) (byte) 1, (java.awt.image.ImageObserver) mobilePayGUI53);
        mobilePayGUI0.toFront();
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNull(point6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Mobile Pay GUI" + "'", str24, "Mobile Pay GUI");
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
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.Dimension dimension1 = null;
        mobilePayGUI0.setPreferredSize(dimension1);
        mobilePayGUI0.doLayout();
        boolean boolean5 = mobilePayGUI0.areFocusTraversalKeysSet((int) (short) 1);
        javax.swing.JRootPane jRootPane6 = mobilePayGUI0.getRootPane();
        int int7 = mobilePayGUI0.getHeight();
        java.awt.Image image8 = mobilePayGUI0.getIconImage();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jRootPane6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 200 + "'", int7 == 200);
        org.junit.Assert.assertNull(image8);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.Dimension dimension1 = null;
        mobilePayGUI0.setPreferredSize(dimension1);
        mobilePayGUI0.resize(7, 0);
        java.awt.Event event6 = null;
        park.MobilePayGUI mobilePayGUI7 = new park.MobilePayGUI();
        mobilePayGUI7.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.awt.Color color12 = mobilePayGUI7.getForeground();
        boolean boolean13 = mobilePayGUI0.action(event6, (java.lang.Object) mobilePayGUI7);
        java.awt.Dimension dimension14 = mobilePayGUI7.size();
        java.lang.String str15 = mobilePayGUI7.getTitle();
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dimension14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Mobile Pay GUI" + "'", str15, "Mobile Pay GUI");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.util.Locale locale5 = null;
        mobilePayGUI0.setLocale(locale5);
        java.awt.event.InputMethodListener inputMethodListener7 = null;
        mobilePayGUI0.removeInputMethodListener(inputMethodListener7);
        java.util.ResourceBundle resourceBundle9 = null;
        // The following exception was thrown during execution in test generation
        try {
            mobilePayGUI0.applyResourceBundle(resourceBundle9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ResourceBundle.getLocale()\" because \"bdl\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.lang.String str1 = mobilePayGUI0.getTitle();
        java.awt.Cursor cursor2 = null;
        mobilePayGUI0.setCursor(cursor2);
        java.awt.event.WindowListener windowListener4 = null;
        mobilePayGUI0.addWindowListener(windowListener4);
        java.awt.Component[] componentArray6 = mobilePayGUI0.getComponents();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Mobile Pay GUI" + "'", str1, "Mobile Pay GUI");
        org.junit.Assert.assertNotNull(componentArray6);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        mobilePayGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = mobilePayGUI0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        mobilePayGUI0.addMouseListener(mouseListener5);
        java.awt.LayoutManager layoutManager7 = mobilePayGUI0.getLayout();
        mobilePayGUI0.move(11, 6);
        java.awt.dnd.DropTarget dropTarget11 = null;
        mobilePayGUI0.setDropTarget(dropTarget11);
        park.MobilePayGUI mobilePayGUI13 = new park.MobilePayGUI();
        mobilePayGUI13.setLocationByPlatform(false);
        mobilePayGUI13.setVisible(true);
        java.awt.Dimension dimension18 = mobilePayGUI13.getMaximumSize();
        java.awt.Dimension dimension19 = mobilePayGUI0.getSize(dimension18);
        java.awt.Event event20 = null;
        boolean boolean23 = mobilePayGUI0.mouseExit(event20, (int) (short) 0, (int) (short) 100);
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(layoutManager7);
        org.junit.Assert.assertNotNull(dimension18);
        org.junit.Assert.assertNotNull(dimension19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str5 = mobilePayGUI0.getTitle();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior6 = mobilePayGUI0.getBaselineResizeBehavior();
        java.awt.event.WindowListener windowListener7 = null;
        mobilePayGUI0.addWindowListener(windowListener7);
        java.awt.event.WindowFocusListener windowFocusListener9 = null;
        mobilePayGUI0.addWindowFocusListener(windowFocusListener9);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        mobilePayGUI0.removePropertyChangeListener("", propertyChangeListener12);
        mobilePayGUI0.setLocation((int) 'a', 32);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Mobile Pay GUI" + "'", str5, "Mobile Pay GUI");
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior6 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior6.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        mobilePayGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = mobilePayGUI0.getMousePosition(true);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray5 = mobilePayGUI0.getPropertyChangeListeners();
        mobilePayGUI0.setFocusTraversalPolicyProvider(false);
        java.awt.Rectangle rectangle8 = mobilePayGUI0.getMaximizedBounds();
        java.awt.Window window9 = mobilePayGUI0.getOwner();
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray5);
        org.junit.Assert.assertNull(rectangle8);
        org.junit.Assert.assertNull(window9);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.setLocationByPlatform(false);
        mobilePayGUI0.firePropertyChange("Mobile Pay GUI", (short) (byte) -1, (short) (byte) 1);
        boolean boolean7 = mobilePayGUI0.isOpaque();
        park.MobilePayGUI mobilePayGUI8 = new park.MobilePayGUI();
        mobilePayGUI8.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str13 = mobilePayGUI8.getTitle();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior14 = mobilePayGUI8.getBaselineResizeBehavior();
        java.awt.event.WindowListener windowListener15 = null;
        mobilePayGUI8.addWindowListener(windowListener15);
        park.MobilePayGUI mobilePayGUI17 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener18 = null;
        mobilePayGUI17.addMouseWheelListener(mouseWheelListener18);
        java.awt.Point point21 = mobilePayGUI17.getMousePosition(true);
        java.awt.event.MouseListener mouseListener22 = null;
        mobilePayGUI17.addMouseListener(mouseListener22);
        park.MobilePayGUI mobilePayGUI24 = new park.MobilePayGUI();
        mobilePayGUI24.setFocusable(false);
        java.awt.Event event27 = null;
        boolean boolean30 = mobilePayGUI24.mouseDrag(event27, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle31 = mobilePayGUI24.getBounds();
        java.awt.Rectangle rectangle32 = mobilePayGUI17.getBounds(rectangle31);
        mobilePayGUI8.setMaximizedBounds(rectangle32);
        mobilePayGUI0.setShape((java.awt.Shape) rectangle32);
        java.awt.Event event35 = null;
        boolean boolean37 = mobilePayGUI0.keyDown(event35, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Mobile Pay GUI" + "'", str13, "Mobile Pay GUI");
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior14 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior14.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNull(point21);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(rectangle31);
        org.junit.Assert.assertNotNull(rectangle32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = mobilePayGUI0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle7 = mobilePayGUI0.getBounds();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray8 = mobilePayGUI0.getPropertyChangeListeners();
        int int9 = mobilePayGUI0.getX();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(rectangle7);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.setLocationByPlatform(false);
        java.awt.Image image3 = null;
        mobilePayGUI0.setIconImage(image3);
        javax.swing.JMenuBar jMenuBar5 = null;
        mobilePayGUI0.setJMenuBar(jMenuBar5);
        java.awt.FocusTraversalPolicy focusTraversalPolicy7 = null;
        mobilePayGUI0.setFocusTraversalPolicy(focusTraversalPolicy7);
        park.MobilePayGUI mobilePayGUI9 = new park.MobilePayGUI();
        java.awt.Dimension dimension10 = null;
        mobilePayGUI9.setPreferredSize(dimension10);
        mobilePayGUI9.resize(7, 0);
        boolean boolean15 = mobilePayGUI9.isEnabled();
        java.awt.Event event16 = null;
        boolean boolean18 = mobilePayGUI9.lostFocus(event16, (java.lang.Object) (short) 0);
        java.awt.Font font19 = mobilePayGUI9.getFont();
        java.awt.FontMetrics fontMetrics20 = mobilePayGUI0.getFontMetrics(font19);
        java.awt.event.FocusListener focusListener21 = null;
        mobilePayGUI0.addFocusListener(focusListener21);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(font19);
        org.junit.Assert.assertNotNull(fontMetrics20);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = mobilePayGUI0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle7 = mobilePayGUI0.getBounds();
        java.awt.Dimension dimension8 = mobilePayGUI0.getPreferredSize();
        javax.swing.JRootPane jRootPane9 = mobilePayGUI0.getRootPane();
        mobilePayGUI0.setIgnoreRepaint(false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(rectangle7);
        org.junit.Assert.assertNotNull(dimension8);
        org.junit.Assert.assertNotNull(jRootPane9);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        mobilePayGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = mobilePayGUI0.getMousePosition(true);
        park.MobilePayGUI mobilePayGUI5 = new park.MobilePayGUI();
        mobilePayGUI5.setLocationByPlatform(false);
        java.awt.Image image8 = null;
        mobilePayGUI5.setIconImage(image8);
        javax.swing.JMenuBar jMenuBar10 = null;
        mobilePayGUI5.setJMenuBar(jMenuBar10);
        java.awt.FocusTraversalPolicy focusTraversalPolicy12 = null;
        mobilePayGUI5.setFocusTraversalPolicy(focusTraversalPolicy12);
        park.MobilePayGUI mobilePayGUI14 = new park.MobilePayGUI();
        java.awt.Dimension dimension15 = null;
        mobilePayGUI14.setPreferredSize(dimension15);
        mobilePayGUI14.resize(7, 0);
        boolean boolean20 = mobilePayGUI14.isEnabled();
        java.awt.Event event21 = null;
        boolean boolean23 = mobilePayGUI14.lostFocus(event21, (java.lang.Object) (short) 0);
        java.awt.Font font24 = mobilePayGUI14.getFont();
        java.awt.FontMetrics fontMetrics25 = mobilePayGUI5.getFontMetrics(font24);
        java.awt.Cursor cursor26 = null;
        mobilePayGUI5.setCursor(cursor26);
        int int28 = mobilePayGUI0.getComponentZOrder((java.awt.Component) mobilePayGUI5);
        java.awt.image.VolatileImage volatileImage31 = mobilePayGUI0.createVolatileImage(128, (int) 'a');
        java.awt.Rectangle rectangle32 = mobilePayGUI0.getBounds();
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
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.lang.String str1 = mobilePayGUI0.getTitle();
        java.awt.Cursor cursor2 = null;
        mobilePayGUI0.setCursor(cursor2);
        java.awt.event.WindowListener windowListener4 = null;
        mobilePayGUI0.addWindowListener(windowListener4);
        mobilePayGUI0.layout();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Mobile Pay GUI" + "'", str1, "Mobile Pay GUI");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.Dimension dimension1 = null;
        mobilePayGUI0.setPreferredSize(dimension1);
        mobilePayGUI0.resize(7, 0);
        boolean boolean6 = mobilePayGUI0.isEnabled();
        java.awt.Event event7 = null;
        boolean boolean9 = mobilePayGUI0.lostFocus(event7, (java.lang.Object) (short) 0);
        mobilePayGUI0.setFocusCycleRoot(true);
        java.awt.Dimension dimension12 = mobilePayGUI0.getMaximumSize();
        java.awt.im.InputContext inputContext13 = mobilePayGUI0.getInputContext();
        java.awt.BufferCapabilities bufferCapabilities15 = null;
        // The following exception was thrown during execution in test generation
        try {
            mobilePayGUI0.createBufferStrategy((int) '#', bufferCapabilities15);
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
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = mobilePayGUI0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        java.awt.event.KeyListener[] keyListenerArray7 = mobilePayGUI0.getKeyListeners();
        park.MobilePayGUI mobilePayGUI8 = new park.MobilePayGUI();
        mobilePayGUI8.setFocusable(false);
        java.awt.Event event11 = null;
        boolean boolean14 = mobilePayGUI8.mouseDrag(event11, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle15 = mobilePayGUI8.getBounds();
        java.awt.Component component18 = mobilePayGUI8.getComponentAt(7, 6);
        mobilePayGUI8.setName("");
        java.awt.ImageCapabilities imageCapabilities23 = null;
        java.awt.image.VolatileImage volatileImage24 = mobilePayGUI8.createVolatileImage(12, 64, imageCapabilities23);
        park.MobilePayGUI mobilePayGUI25 = new park.MobilePayGUI();
        java.awt.Dimension dimension26 = null;
        mobilePayGUI25.setPreferredSize(dimension26);
        mobilePayGUI25.resize(7, 0);
        boolean boolean31 = mobilePayGUI25.isEnabled();
        mobilePayGUI25.setAlwaysOnTop(false);
        int int34 = mobilePayGUI0.checkImage((java.awt.Image) volatileImage24, (java.awt.image.ImageObserver) mobilePayGUI25);
        java.beans.PropertyChangeListener propertyChangeListener36 = null;
        mobilePayGUI0.removePropertyChangeListener("hi!", propertyChangeListener36);
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
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.setLocationByPlatform(false);
        java.awt.Image image3 = null;
        mobilePayGUI0.setIconImage(image3);
        park.MobilePayGUI mobilePayGUI5 = new park.MobilePayGUI();
        mobilePayGUI5.setFocusable(false);
        java.awt.Event event8 = null;
        boolean boolean11 = mobilePayGUI5.mouseDrag(event8, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle12 = mobilePayGUI5.getBounds();
        mobilePayGUI0.setMixingCutoutShape((java.awt.Shape) rectangle12);
        boolean boolean14 = mobilePayGUI0.isUndecorated();
        java.awt.Graphics graphics15 = null;
        // The following exception was thrown during execution in test generation
        try {
            mobilePayGUI0.paintComponents(graphics15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Graphics.getClip()\" because \"g\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(rectangle12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = mobilePayGUI0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        java.awt.event.WindowListener windowListener7 = null;
        mobilePayGUI0.removeWindowListener(windowListener7);
        java.awt.event.MouseMotionListener mouseMotionListener9 = null;
        mobilePayGUI0.addMouseMotionListener(mouseMotionListener9);
        java.awt.event.WindowFocusListener windowFocusListener11 = null;
        mobilePayGUI0.addWindowFocusListener(windowFocusListener11);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str5 = mobilePayGUI0.getTitle();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior6 = mobilePayGUI0.getBaselineResizeBehavior();
        javax.swing.TransferHandler transferHandler7 = mobilePayGUI0.getTransferHandler();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Mobile Pay GUI" + "'", str5, "Mobile Pay GUI");
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior6 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior6.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNull(transferHandler7);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = mobilePayGUI0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        boolean boolean7 = mobilePayGUI0.getFocusableWindowState();
        mobilePayGUI0.setLocation(5, (int) 'a');
        java.util.Set<java.awt.AWTKeyStroke> aWTKeyStrokeSet12 = mobilePayGUI0.getFocusTraversalKeys(0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(aWTKeyStrokeSet12);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        mobilePayGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.event.MouseMotionListener mouseMotionListener3 = null;
        mobilePayGUI0.removeMouseMotionListener(mouseMotionListener3);
        java.awt.event.HierarchyListener[] hierarchyListenerArray5 = mobilePayGUI0.getHierarchyListeners();
        park.MobilePayGUI mobilePayGUI6 = new park.MobilePayGUI();
        mobilePayGUI6.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str11 = mobilePayGUI6.getTitle();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior12 = mobilePayGUI6.getBaselineResizeBehavior();
        park.MobilePayGUI mobilePayGUI13 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener14 = null;
        mobilePayGUI13.addMouseWheelListener(mouseWheelListener14);
        java.awt.Point point17 = mobilePayGUI13.getMousePosition(true);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray18 = mobilePayGUI13.getPropertyChangeListeners();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener19 = null;
        mobilePayGUI13.removeHierarchyBoundsListener(hierarchyBoundsListener19);
        java.awt.Image image23 = mobilePayGUI13.createImage(6, (int) (short) 100);
        mobilePayGUI6.setIconImage(image23);
        park.MobilePayGUI mobilePayGUI27 = new park.MobilePayGUI();
        mobilePayGUI27.setFocusable(false);
        java.awt.Event event30 = null;
        boolean boolean33 = mobilePayGUI27.mouseDrag(event30, (int) (byte) 1, (int) (short) 1);
        java.awt.event.WindowListener windowListener34 = null;
        mobilePayGUI27.removeWindowListener(windowListener34);
        java.awt.event.MouseMotionListener mouseMotionListener36 = null;
        mobilePayGUI27.addMouseMotionListener(mouseMotionListener36);
        int int38 = mobilePayGUI0.checkImage(image23, 1, (int) '4', (java.awt.image.ImageObserver) mobilePayGUI27);
        java.awt.Component component39 = mobilePayGUI27.getFocusOwner();
        mobilePayGUI27.show();
        org.junit.Assert.assertNotNull(hierarchyListenerArray5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Mobile Pay GUI" + "'", str11, "Mobile Pay GUI");
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior12 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior12.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNull(point17);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray18);
        org.junit.Assert.assertNotNull(image23);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 32 + "'", int38 == 32);
        org.junit.Assert.assertNull(component39);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.Dimension dimension1 = null;
        mobilePayGUI0.setPreferredSize(dimension1);
        mobilePayGUI0.resize(7, 0);
        boolean boolean6 = mobilePayGUI0.isEnabled();
        java.awt.Event event7 = null;
        boolean boolean9 = mobilePayGUI0.lostFocus(event7, (java.lang.Object) (short) 0);
        mobilePayGUI0.setFocusCycleRoot(true);
        java.awt.ComponentOrientation componentOrientation12 = null;
        mobilePayGUI0.setComponentOrientation(componentOrientation12);
        park.MobilePayGUI mobilePayGUI14 = new park.MobilePayGUI();
        mobilePayGUI14.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str19 = mobilePayGUI14.getTitle();
        java.awt.event.FocusListener[] focusListenerArray20 = mobilePayGUI14.getFocusListeners();
        java.awt.FocusTraversalPolicy focusTraversalPolicy21 = null;
        mobilePayGUI14.setFocusTraversalPolicy(focusTraversalPolicy21);
        boolean boolean23 = mobilePayGUI0.isAncestorOf((java.awt.Component) mobilePayGUI14);
        java.awt.Dimension dimension24 = mobilePayGUI14.minimumSize();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Mobile Pay GUI" + "'", str19, "Mobile Pay GUI");
        org.junit.Assert.assertNotNull(focusListenerArray20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dimension24);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = mobilePayGUI0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        mobilePayGUI0.transferFocusBackward();
        java.awt.Event event8 = null;
        boolean boolean11 = mobilePayGUI0.mouseDown(event8, (int) (short) 10, (int) (byte) 100);
        java.awt.Point point12 = mobilePayGUI0.getLocation();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(point12);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.lang.String str1 = mobilePayGUI0.getTitle();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray2 = mobilePayGUI0.getPropertyChangeListeners();
        mobilePayGUI0.toFront();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Mobile Pay GUI" + "'", str1, "Mobile Pay GUI");
        org.junit.Assert.assertNotNull(propertyChangeListenerArray2);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        mobilePayGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = mobilePayGUI0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        mobilePayGUI0.addMouseListener(mouseListener5);
        java.awt.Component component7 = mobilePayGUI0.getMostRecentFocusOwner();
        java.awt.Dimension dimension8 = null;
        mobilePayGUI0.setMaximumSize(dimension8);
        park.MobilePayGUI mobilePayGUI10 = new park.MobilePayGUI();
        mobilePayGUI10.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str15 = mobilePayGUI10.getTitle();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior16 = mobilePayGUI10.getBaselineResizeBehavior();
        java.awt.event.WindowListener windowListener17 = null;
        mobilePayGUI10.addWindowListener(windowListener17);
        park.MobilePayGUI mobilePayGUI19 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener20 = null;
        mobilePayGUI19.addMouseWheelListener(mouseWheelListener20);
        java.awt.Point point23 = mobilePayGUI19.getMousePosition(true);
        java.awt.event.MouseListener mouseListener24 = null;
        mobilePayGUI19.addMouseListener(mouseListener24);
        park.MobilePayGUI mobilePayGUI26 = new park.MobilePayGUI();
        mobilePayGUI26.setFocusable(false);
        java.awt.Event event29 = null;
        boolean boolean32 = mobilePayGUI26.mouseDrag(event29, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle33 = mobilePayGUI26.getBounds();
        java.awt.Rectangle rectangle34 = mobilePayGUI19.getBounds(rectangle33);
        mobilePayGUI10.setMaximizedBounds(rectangle34);
        mobilePayGUI0.setMixingCutoutShape((java.awt.Shape) rectangle34);
        boolean boolean37 = mobilePayGUI0.isShowing();
        org.junit.Assert.assertNull(point4);
// flaky:         org.junit.Assert.assertNull(component7);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Mobile Pay GUI" + "'", str15, "Mobile Pay GUI");
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior16 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior16.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNull(point23);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(rectangle33);
        org.junit.Assert.assertNotNull(rectangle34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        mobilePayGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.event.MouseMotionListener mouseMotionListener3 = null;
        mobilePayGUI0.removeMouseMotionListener(mouseMotionListener3);
        java.awt.Event event5 = null;
        boolean boolean8 = mobilePayGUI0.mouseUp(event5, (int) (short) 0, (int) (short) -1);
        java.awt.Component component11 = mobilePayGUI0.locate(5, (int) ' ');
        mobilePayGUI0.repaint((int) (short) 1, (int) '4', (int) (byte) 1, 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(component11);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.setLocationByPlatform(false);
        java.awt.Image image3 = null;
        mobilePayGUI0.setIconImage(image3);
        javax.swing.JMenuBar jMenuBar5 = null;
        mobilePayGUI0.setJMenuBar(jMenuBar5);
        java.awt.event.FocusListener focusListener7 = null;
        mobilePayGUI0.addFocusListener(focusListener7);
        java.awt.event.MouseWheelListener mouseWheelListener9 = null;
        mobilePayGUI0.addMouseWheelListener(mouseWheelListener9);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        mobilePayGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = mobilePayGUI0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        mobilePayGUI0.addMouseListener(mouseListener5);
        java.awt.LayoutManager layoutManager7 = mobilePayGUI0.getLayout();
        mobilePayGUI0.move(11, 6);
        javax.swing.JMenuBar jMenuBar11 = null;
        mobilePayGUI0.setJMenuBar(jMenuBar11);
        mobilePayGUI0.firePropertyChange("", (long) (short) 1, (long) (-1));
        park.MobilePayGUI mobilePayGUI17 = new park.MobilePayGUI();
        java.lang.String str18 = mobilePayGUI17.getTitle();
        java.awt.Cursor cursor19 = null;
        mobilePayGUI17.setCursor(cursor19);
        java.awt.event.WindowListener windowListener21 = null;
        mobilePayGUI17.addWindowListener(windowListener21);
        java.awt.Event event23 = null;
        park.MobilePayGUI mobilePayGUI24 = new park.MobilePayGUI();
        mobilePayGUI24.setLocationByPlatform(false);
        java.awt.Image image27 = null;
        mobilePayGUI24.setIconImage(image27);
        park.MobilePayGUI mobilePayGUI29 = new park.MobilePayGUI();
        mobilePayGUI29.setFocusable(false);
        java.awt.Event event32 = null;
        boolean boolean35 = mobilePayGUI29.mouseDrag(event32, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle36 = mobilePayGUI29.getBounds();
        mobilePayGUI24.setMixingCutoutShape((java.awt.Shape) rectangle36);
        boolean boolean38 = mobilePayGUI17.gotFocus(event23, (java.lang.Object) rectangle36);
        mobilePayGUI0.setBounds(rectangle36);
        java.awt.Toolkit toolkit40 = mobilePayGUI0.getToolkit();
        java.awt.Event event41 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean42 = mobilePayGUI0.postEvent(event41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"id\" because \"evt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(layoutManager7);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Mobile Pay GUI" + "'", str18, "Mobile Pay GUI");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(rectangle36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(toolkit40);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        mobilePayGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = mobilePayGUI0.getMousePosition(true);
        park.MobilePayGUI mobilePayGUI5 = new park.MobilePayGUI();
        mobilePayGUI5.setLocationByPlatform(false);
        java.awt.Image image8 = null;
        mobilePayGUI5.setIconImage(image8);
        javax.swing.JMenuBar jMenuBar10 = null;
        mobilePayGUI5.setJMenuBar(jMenuBar10);
        java.awt.FocusTraversalPolicy focusTraversalPolicy12 = null;
        mobilePayGUI5.setFocusTraversalPolicy(focusTraversalPolicy12);
        park.MobilePayGUI mobilePayGUI14 = new park.MobilePayGUI();
        java.awt.Dimension dimension15 = null;
        mobilePayGUI14.setPreferredSize(dimension15);
        mobilePayGUI14.resize(7, 0);
        boolean boolean20 = mobilePayGUI14.isEnabled();
        java.awt.Event event21 = null;
        boolean boolean23 = mobilePayGUI14.lostFocus(event21, (java.lang.Object) (short) 0);
        java.awt.Font font24 = mobilePayGUI14.getFont();
        java.awt.FontMetrics fontMetrics25 = mobilePayGUI5.getFontMetrics(font24);
        java.awt.Cursor cursor26 = null;
        mobilePayGUI5.setCursor(cursor26);
        int int28 = mobilePayGUI0.getComponentZOrder((java.awt.Component) mobilePayGUI5);
        java.awt.dnd.DropTarget dropTarget29 = null;
        mobilePayGUI0.setDropTarget(dropTarget29);
        java.awt.event.WindowStateListener windowStateListener31 = null;
        mobilePayGUI0.removeWindowStateListener(windowStateListener31);
        mobilePayGUI0.hide();
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
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.setLocationByPlatform(false);
        mobilePayGUI0.firePropertyChange("Mobile Pay GUI", (short) (byte) -1, (short) (byte) 1);
        boolean boolean7 = mobilePayGUI0.isOpaque();
        park.MobilePayGUI mobilePayGUI8 = new park.MobilePayGUI();
        mobilePayGUI8.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str13 = mobilePayGUI8.getTitle();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior14 = mobilePayGUI8.getBaselineResizeBehavior();
        java.awt.event.WindowListener windowListener15 = null;
        mobilePayGUI8.addWindowListener(windowListener15);
        park.MobilePayGUI mobilePayGUI17 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener18 = null;
        mobilePayGUI17.addMouseWheelListener(mouseWheelListener18);
        java.awt.Point point21 = mobilePayGUI17.getMousePosition(true);
        java.awt.event.MouseListener mouseListener22 = null;
        mobilePayGUI17.addMouseListener(mouseListener22);
        park.MobilePayGUI mobilePayGUI24 = new park.MobilePayGUI();
        mobilePayGUI24.setFocusable(false);
        java.awt.Event event27 = null;
        boolean boolean30 = mobilePayGUI24.mouseDrag(event27, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle31 = mobilePayGUI24.getBounds();
        java.awt.Rectangle rectangle32 = mobilePayGUI17.getBounds(rectangle31);
        mobilePayGUI8.setMaximizedBounds(rectangle32);
        mobilePayGUI0.setShape((java.awt.Shape) rectangle32);
        java.awt.Font font35 = mobilePayGUI0.getFont();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Mobile Pay GUI" + "'", str13, "Mobile Pay GUI");
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
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = mobilePayGUI0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        java.awt.event.WindowListener windowListener7 = null;
        mobilePayGUI0.removeWindowListener(windowListener7);
        java.awt.event.MouseMotionListener mouseMotionListener9 = null;
        mobilePayGUI0.addMouseMotionListener(mouseMotionListener9);
        // The following exception was thrown during execution in test generation
        try {
            mobilePayGUI0.setCursor((int) (byte) 100);
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
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.Dimension dimension1 = null;
        mobilePayGUI0.setPreferredSize(dimension1);
        mobilePayGUI0.doLayout();
        park.MobilePayGUI mobilePayGUI4 = new park.MobilePayGUI();
        java.awt.Dimension dimension5 = null;
        mobilePayGUI4.setPreferredSize(dimension5);
        mobilePayGUI4.resize(7, 0);
        boolean boolean10 = mobilePayGUI4.isEnabled();
        java.awt.Event event11 = null;
        boolean boolean13 = mobilePayGUI4.lostFocus(event11, (java.lang.Object) (short) 0);
        java.awt.Font font14 = mobilePayGUI4.getFont();
        java.awt.FontMetrics fontMetrics15 = mobilePayGUI0.getFontMetrics(font14);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(font14);
        org.junit.Assert.assertNotNull(fontMetrics15);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        mobilePayGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = mobilePayGUI0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        mobilePayGUI0.addMouseListener(mouseListener5);
        java.awt.Component component7 = mobilePayGUI0.getMostRecentFocusOwner();
        mobilePayGUI0.setAlwaysOnTop(false);
        boolean boolean10 = mobilePayGUI0.isLightweight();
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.setLocationByPlatform(false);
        mobilePayGUI0.setVisible(true);
        java.awt.Dimension dimension5 = mobilePayGUI0.getMaximumSize();
        java.awt.Dimension dimension6 = mobilePayGUI0.size();
        java.awt.Insets insets7 = mobilePayGUI0.getInsets();
        mobilePayGUI0.setFocusable(true);
        mobilePayGUI0.setResizable(true);
        org.junit.Assert.assertNotNull(dimension5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNotNull(insets7);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.setLocationByPlatform(false);
        java.awt.Image image3 = null;
        mobilePayGUI0.setIconImage(image3);
        javax.swing.JMenuBar jMenuBar5 = null;
        mobilePayGUI0.setJMenuBar(jMenuBar5);
        java.awt.FocusTraversalPolicy focusTraversalPolicy7 = null;
        mobilePayGUI0.setFocusTraversalPolicy(focusTraversalPolicy7);
        park.MobilePayGUI mobilePayGUI9 = new park.MobilePayGUI();
        java.awt.Dimension dimension10 = null;
        mobilePayGUI9.setPreferredSize(dimension10);
        mobilePayGUI9.resize(7, 0);
        boolean boolean15 = mobilePayGUI9.isEnabled();
        java.awt.Event event16 = null;
        boolean boolean18 = mobilePayGUI9.lostFocus(event16, (java.lang.Object) (short) 0);
        java.awt.Font font19 = mobilePayGUI9.getFont();
        java.awt.FontMetrics fontMetrics20 = mobilePayGUI0.getFontMetrics(font19);
        java.awt.Cursor cursor21 = null;
        mobilePayGUI0.setCursor(cursor21);
        park.MobilePayGUI mobilePayGUI23 = new park.MobilePayGUI();
        mobilePayGUI23.setFocusable(false);
        java.awt.Event event26 = null;
        boolean boolean29 = mobilePayGUI23.mouseDrag(event26, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle30 = mobilePayGUI23.getBounds();
        java.awt.Dimension dimension31 = mobilePayGUI23.getPreferredSize();
        javax.swing.JRootPane jRootPane32 = mobilePayGUI23.getRootPane();
        boolean boolean33 = mobilePayGUI23.isOpaque();
        java.awt.Point point34 = mobilePayGUI23.getLocation();
        java.awt.Component component35 = mobilePayGUI0.getComponentAt(point34);
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
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str5 = mobilePayGUI0.getTitle();
        java.awt.event.FocusListener[] focusListenerArray6 = mobilePayGUI0.getFocusListeners();
        java.awt.FocusTraversalPolicy focusTraversalPolicy7 = null;
        mobilePayGUI0.setFocusTraversalPolicy(focusTraversalPolicy7);
        java.awt.Point point9 = mobilePayGUI0.getMousePosition();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Mobile Pay GUI" + "'", str5, "Mobile Pay GUI");
        org.junit.Assert.assertNotNull(focusListenerArray6);
        org.junit.Assert.assertNull(point9);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.setLocationByPlatform(false);
        mobilePayGUI0.firePropertyChange("Mobile Pay GUI", (short) (byte) -1, (short) (byte) 1);
        java.awt.Insets insets7 = mobilePayGUI0.getInsets();
        org.junit.Assert.assertNotNull(insets7);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.setLocationByPlatform(false);
        java.awt.Dimension dimension3 = null;
        mobilePayGUI0.setMaximumSize(dimension3);
        mobilePayGUI0.repaint((long) (short) 10);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        mobilePayGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = mobilePayGUI0.getMousePosition(true);
        java.awt.Font font5 = mobilePayGUI0.getFont();
        boolean boolean6 = mobilePayGUI0.isDisplayable();
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(font5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.awt.Shape shape5 = mobilePayGUI0.getShape();
        org.junit.Assert.assertNull(shape5);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.Dimension dimension1 = null;
        mobilePayGUI0.setPreferredSize(dimension1);
        mobilePayGUI0.resize(7, 0);
        boolean boolean6 = mobilePayGUI0.isEnabled();
        mobilePayGUI0.repaint((long) 7, (int) '#', (int) (short) 100, 9, (int) (byte) 0);
        int int13 = mobilePayGUI0.getComponentCount();
        java.awt.Event event14 = null;
        boolean boolean17 = mobilePayGUI0.mouseMove(event14, (int) (short) -1, (int) (short) 10);
        java.awt.Component component18 = mobilePayGUI0.getGlassPane();
        java.awt.Window.Type type19 = mobilePayGUI0.getType();
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
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        mobilePayGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = mobilePayGUI0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        mobilePayGUI0.addMouseListener(mouseListener5);
        java.awt.Component component7 = mobilePayGUI0.getMostRecentFocusOwner();
        javax.swing.JMenuBar jMenuBar8 = mobilePayGUI0.getJMenuBar();
        java.awt.ImageCapabilities imageCapabilities11 = null;
        java.awt.image.VolatileImage volatileImage12 = mobilePayGUI0.createVolatileImage(64, 13, imageCapabilities11);
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertNull(jMenuBar8);
        org.junit.Assert.assertNotNull(volatileImage12);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str5 = mobilePayGUI0.getTitle();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior6 = mobilePayGUI0.getBaselineResizeBehavior();
        java.awt.event.WindowListener windowListener7 = null;
        mobilePayGUI0.addWindowListener(windowListener7);
        java.awt.event.WindowFocusListener windowFocusListener9 = null;
        mobilePayGUI0.addWindowFocusListener(windowFocusListener9);
        java.beans.PropertyChangeListener propertyChangeListener12 = null;
        mobilePayGUI0.removePropertyChangeListener("", propertyChangeListener12);
        java.awt.event.ComponentListener componentListener14 = null;
        mobilePayGUI0.removeComponentListener(componentListener14);
        java.awt.image.ColorModel colorModel16 = mobilePayGUI0.getColorModel();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Mobile Pay GUI" + "'", str5, "Mobile Pay GUI");
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior6 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior6.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(colorModel16);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = mobilePayGUI0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle7 = mobilePayGUI0.getBounds();
        java.awt.Component component10 = mobilePayGUI0.getComponentAt(7, 6);
        park.MobilePayGUI mobilePayGUI11 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener12 = null;
        mobilePayGUI11.addMouseWheelListener(mouseWheelListener12);
        java.awt.Point point15 = mobilePayGUI11.getMousePosition(true);
        java.awt.event.MouseListener mouseListener16 = null;
        mobilePayGUI11.addMouseListener(mouseListener16);
        java.awt.LayoutManager layoutManager18 = mobilePayGUI11.getLayout();
        mobilePayGUI11.move(11, 6);
        int int22 = mobilePayGUI0.getComponentZOrder((java.awt.Component) mobilePayGUI11);
        mobilePayGUI11.enable(false);
        java.awt.event.WindowFocusListener windowFocusListener25 = null;
        mobilePayGUI11.addWindowFocusListener(windowFocusListener25);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(rectangle7);
        org.junit.Assert.assertNotNull(component10);
        org.junit.Assert.assertNull(point15);
        org.junit.Assert.assertNotNull(layoutManager18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        mobilePayGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = mobilePayGUI0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        mobilePayGUI0.addMouseListener(mouseListener5);
        java.awt.Component component7 = mobilePayGUI0.getMostRecentFocusOwner();
        java.awt.Dimension dimension8 = null;
        mobilePayGUI0.setMaximumSize(dimension8);
        java.awt.image.ImageProducer imageProducer10 = null;
        java.awt.Image image11 = mobilePayGUI0.createImage(imageProducer10);
        org.junit.Assert.assertNull(point4);
// flaky:         org.junit.Assert.assertNull(component7);
        org.junit.Assert.assertNotNull(image11);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.lang.String str1 = mobilePayGUI0.getTitle();
        java.awt.Font font2 = null;
        mobilePayGUI0.setFont(font2);
        java.awt.Event event4 = null;
        boolean boolean7 = mobilePayGUI0.mouseEnter(event4, 6, (int) (short) -1);
        java.awt.Component component8 = mobilePayGUI0.getMostRecentFocusOwner();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Mobile Pay GUI" + "'", str1, "Mobile Pay GUI");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(component8);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        mobilePayGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = mobilePayGUI0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        mobilePayGUI0.addMouseListener(mouseListener5);
        java.awt.LayoutManager layoutManager7 = mobilePayGUI0.getLayout();
        mobilePayGUI0.move(11, 6);
        javax.swing.JMenuBar jMenuBar11 = null;
        mobilePayGUI0.setJMenuBar(jMenuBar11);
        mobilePayGUI0.firePropertyChange("", (long) (short) 1, (long) (-1));
        park.MobilePayGUI mobilePayGUI17 = new park.MobilePayGUI();
        java.lang.String str18 = mobilePayGUI17.getTitle();
        java.awt.Cursor cursor19 = null;
        mobilePayGUI17.setCursor(cursor19);
        java.awt.event.WindowListener windowListener21 = null;
        mobilePayGUI17.addWindowListener(windowListener21);
        java.awt.Event event23 = null;
        park.MobilePayGUI mobilePayGUI24 = new park.MobilePayGUI();
        mobilePayGUI24.setLocationByPlatform(false);
        java.awt.Image image27 = null;
        mobilePayGUI24.setIconImage(image27);
        park.MobilePayGUI mobilePayGUI29 = new park.MobilePayGUI();
        mobilePayGUI29.setFocusable(false);
        java.awt.Event event32 = null;
        boolean boolean35 = mobilePayGUI29.mouseDrag(event32, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle36 = mobilePayGUI29.getBounds();
        mobilePayGUI24.setMixingCutoutShape((java.awt.Shape) rectangle36);
        boolean boolean38 = mobilePayGUI17.gotFocus(event23, (java.lang.Object) rectangle36);
        mobilePayGUI0.setBounds(rectangle36);
        java.awt.Cursor cursor40 = mobilePayGUI0.getCursor();
        boolean boolean41 = mobilePayGUI0.isVisible();
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(layoutManager7);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Mobile Pay GUI" + "'", str18, "Mobile Pay GUI");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(rectangle36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(cursor40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.Dimension dimension1 = null;
        mobilePayGUI0.setPreferredSize(dimension1);
        mobilePayGUI0.doLayout();
        java.awt.Window.Type type4 = mobilePayGUI0.getType();
        java.awt.Dimension dimension5 = mobilePayGUI0.getSize();
        park.MobilePayGUI mobilePayGUI6 = new park.MobilePayGUI();
        java.awt.Dimension dimension7 = null;
        mobilePayGUI6.setPreferredSize(dimension7);
        mobilePayGUI6.resize(7, 0);
        boolean boolean12 = mobilePayGUI6.isEnabled();
        mobilePayGUI6.setResizable(false);
        boolean boolean15 = mobilePayGUI0.isAncestorOf((java.awt.Component) mobilePayGUI6);
        mobilePayGUI0.firePropertyChange("hi!", (float) (byte) 0, (float) '#');
        java.awt.Font font20 = mobilePayGUI0.getFont();
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + java.awt.Window.Type.NORMAL + "'", type4.equals(java.awt.Window.Type.NORMAL));
        org.junit.Assert.assertNotNull(dimension5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(font20);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        mobilePayGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.event.MouseMotionListener mouseMotionListener3 = null;
        mobilePayGUI0.removeMouseMotionListener(mouseMotionListener3);
        java.awt.event.HierarchyListener[] hierarchyListenerArray5 = mobilePayGUI0.getHierarchyListeners();
        park.MobilePayGUI mobilePayGUI6 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener7 = null;
        mobilePayGUI6.addMouseWheelListener(mouseWheelListener7);
        java.awt.Point point10 = mobilePayGUI6.getMousePosition(true);
        java.awt.event.MouseListener mouseListener11 = null;
        mobilePayGUI6.addMouseListener(mouseListener11);
        java.awt.Component component13 = mobilePayGUI6.getMostRecentFocusOwner();
        java.awt.Dimension dimension14 = null;
        mobilePayGUI6.setMaximumSize(dimension14);
        park.MobilePayGUI mobilePayGUI16 = new park.MobilePayGUI();
        mobilePayGUI16.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str21 = mobilePayGUI16.getTitle();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior22 = mobilePayGUI16.getBaselineResizeBehavior();
        java.awt.event.WindowListener windowListener23 = null;
        mobilePayGUI16.addWindowListener(windowListener23);
        park.MobilePayGUI mobilePayGUI25 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener26 = null;
        mobilePayGUI25.addMouseWheelListener(mouseWheelListener26);
        java.awt.Point point29 = mobilePayGUI25.getMousePosition(true);
        java.awt.event.MouseListener mouseListener30 = null;
        mobilePayGUI25.addMouseListener(mouseListener30);
        park.MobilePayGUI mobilePayGUI32 = new park.MobilePayGUI();
        mobilePayGUI32.setFocusable(false);
        java.awt.Event event35 = null;
        boolean boolean38 = mobilePayGUI32.mouseDrag(event35, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle39 = mobilePayGUI32.getBounds();
        java.awt.Rectangle rectangle40 = mobilePayGUI25.getBounds(rectangle39);
        mobilePayGUI16.setMaximizedBounds(rectangle40);
        mobilePayGUI6.setMixingCutoutShape((java.awt.Shape) rectangle40);
        mobilePayGUI0.setMixingCutoutShape((java.awt.Shape) rectangle40);
        java.awt.Event event44 = null;
        // The following exception was thrown during execution in test generation
        try {
            mobilePayGUI0.deliverEvent(event44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"x\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hierarchyListenerArray5);
        org.junit.Assert.assertNull(point10);
        org.junit.Assert.assertNotNull(component13);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Mobile Pay GUI" + "'", str21, "Mobile Pay GUI");
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior22 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior22.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNull(point29);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(rectangle39);
        org.junit.Assert.assertNotNull(rectangle40);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        mobilePayGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.event.MouseMotionListener mouseMotionListener3 = null;
        mobilePayGUI0.removeMouseMotionListener(mouseMotionListener3);
        java.awt.event.HierarchyListener[] hierarchyListenerArray5 = mobilePayGUI0.getHierarchyListeners();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener6 = null;
        mobilePayGUI0.removeHierarchyBoundsListener(hierarchyBoundsListener6);
        java.awt.Event event8 = null;
        park.MobilePayGUI mobilePayGUI9 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener10 = null;
        mobilePayGUI9.addMouseWheelListener(mouseWheelListener10);
        java.awt.Point point13 = mobilePayGUI9.getMousePosition(true);
        java.awt.event.MouseListener mouseListener14 = null;
        mobilePayGUI9.addMouseListener(mouseListener14);
        java.awt.Component component16 = mobilePayGUI9.getMostRecentFocusOwner();
        java.awt.MenuBar menuBar17 = null;
        mobilePayGUI9.setMenuBar(menuBar17);
        boolean boolean19 = mobilePayGUI9.isValid();
        boolean boolean20 = mobilePayGUI0.lostFocus(event8, (java.lang.Object) boolean19);
        mobilePayGUI0.setAutoRequestFocus(true);
        org.junit.Assert.assertNotNull(hierarchyListenerArray5);
        org.junit.Assert.assertNull(point13);
        org.junit.Assert.assertNotNull(component16);
// flaky:         org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = mobilePayGUI0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle7 = mobilePayGUI0.getBounds();
        java.awt.Dimension dimension8 = mobilePayGUI0.getPreferredSize();
        park.MobilePayGUI mobilePayGUI9 = new park.MobilePayGUI();
        java.lang.String str10 = mobilePayGUI9.getTitle();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray11 = mobilePayGUI9.getPropertyChangeListeners();
        boolean boolean12 = mobilePayGUI0.isFocusCycleRoot((java.awt.Container) mobilePayGUI9);
        park.MobilePayGUI mobilePayGUI13 = new park.MobilePayGUI();
        java.awt.Dimension dimension14 = null;
        mobilePayGUI13.setPreferredSize(dimension14);
        mobilePayGUI13.resize(7, 0);
        boolean boolean19 = mobilePayGUI13.isEnabled();
        java.awt.Event event20 = null;
        boolean boolean22 = mobilePayGUI13.lostFocus(event20, (java.lang.Object) (short) 0);
        mobilePayGUI13.setFocusCycleRoot(true);
        java.awt.Dimension dimension25 = mobilePayGUI13.getMaximumSize();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener26 = null;
        mobilePayGUI13.addHierarchyBoundsListener(hierarchyBoundsListener26);
        boolean boolean28 = mobilePayGUI13.isValid();
        // The following exception was thrown during execution in test generation
        try {
            mobilePayGUI9.add((java.awt.Component) mobilePayGUI13, (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(rectangle7);
        org.junit.Assert.assertNotNull(dimension8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Mobile Pay GUI" + "'", str10, "Mobile Pay GUI");
        org.junit.Assert.assertNotNull(propertyChangeListenerArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dimension25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.Dimension dimension1 = null;
        mobilePayGUI0.setPreferredSize(dimension1);
        mobilePayGUI0.doLayout();
        java.awt.Window.Type type4 = mobilePayGUI0.getType();
        java.awt.Dimension dimension5 = mobilePayGUI0.getSize();
        park.MobilePayGUI mobilePayGUI6 = new park.MobilePayGUI();
        java.awt.Dimension dimension7 = null;
        mobilePayGUI6.setPreferredSize(dimension7);
        mobilePayGUI6.resize(7, 0);
        boolean boolean12 = mobilePayGUI6.isEnabled();
        mobilePayGUI6.setResizable(false);
        boolean boolean15 = mobilePayGUI0.isAncestorOf((java.awt.Component) mobilePayGUI6);
        mobilePayGUI0.firePropertyChange("hi!", (float) (byte) 0, (float) '#');
        boolean boolean20 = mobilePayGUI0.isFocusTraversable();
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + java.awt.Window.Type.NORMAL + "'", type4.equals(java.awt.Window.Type.NORMAL));
        org.junit.Assert.assertNotNull(dimension5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        float float0 = java.awt.Component.BOTTOM_ALIGNMENT;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 1.0f + "'", float0 == 1.0f);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.setLocationByPlatform(false);
        mobilePayGUI0.setVisible(true);
        int int7 = mobilePayGUI0.getBaseline(1, 10);
        boolean boolean8 = mobilePayGUI0.isFocusTraversalPolicySet();
        javax.swing.TransferHandler transferHandler9 = null;
        mobilePayGUI0.setTransferHandler(transferHandler9);
        boolean boolean11 = mobilePayGUI0.isValidateRoot();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.util.Locale locale5 = null;
        mobilePayGUI0.setLocale(locale5);
        java.awt.event.InputMethodListener inputMethodListener7 = null;
        mobilePayGUI0.removeInputMethodListener(inputMethodListener7);
        java.awt.event.HierarchyListener hierarchyListener9 = null;
        mobilePayGUI0.removeHierarchyListener(hierarchyListener9);
        java.awt.Graphics graphics11 = null;
        // The following exception was thrown during execution in test generation
        try {
            mobilePayGUI0.printAll(graphics11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Graphics.getClip()\" because \"g\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        mobilePayGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.event.MouseMotionListener mouseMotionListener3 = null;
        mobilePayGUI0.removeMouseMotionListener(mouseMotionListener3);
        java.awt.event.HierarchyListener[] hierarchyListenerArray5 = mobilePayGUI0.getHierarchyListeners();
        park.MobilePayGUI mobilePayGUI6 = new park.MobilePayGUI();
        mobilePayGUI6.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str11 = mobilePayGUI6.getTitle();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior12 = mobilePayGUI6.getBaselineResizeBehavior();
        park.MobilePayGUI mobilePayGUI13 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener14 = null;
        mobilePayGUI13.addMouseWheelListener(mouseWheelListener14);
        java.awt.Point point17 = mobilePayGUI13.getMousePosition(true);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray18 = mobilePayGUI13.getPropertyChangeListeners();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener19 = null;
        mobilePayGUI13.removeHierarchyBoundsListener(hierarchyBoundsListener19);
        java.awt.Image image23 = mobilePayGUI13.createImage(6, (int) (short) 100);
        mobilePayGUI6.setIconImage(image23);
        park.MobilePayGUI mobilePayGUI27 = new park.MobilePayGUI();
        mobilePayGUI27.setFocusable(false);
        java.awt.Event event30 = null;
        boolean boolean33 = mobilePayGUI27.mouseDrag(event30, (int) (byte) 1, (int) (short) 1);
        java.awt.event.WindowListener windowListener34 = null;
        mobilePayGUI27.removeWindowListener(windowListener34);
        java.awt.event.MouseMotionListener mouseMotionListener36 = null;
        mobilePayGUI27.addMouseMotionListener(mouseMotionListener36);
        int int38 = mobilePayGUI0.checkImage(image23, 1, (int) '4', (java.awt.image.ImageObserver) mobilePayGUI27);
        java.awt.Component component41 = mobilePayGUI27.getComponentAt((int) (byte) -1, (int) ' ');
        org.junit.Assert.assertNotNull(hierarchyListenerArray5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Mobile Pay GUI" + "'", str11, "Mobile Pay GUI");
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior12 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior12.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNull(point17);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray18);
        org.junit.Assert.assertNotNull(image23);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 32 + "'", int38 == 32);
        org.junit.Assert.assertNull(component41);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.Dimension dimension1 = null;
        mobilePayGUI0.setPreferredSize(dimension1);
        mobilePayGUI0.doLayout();
        park.MobilePayGUI mobilePayGUI4 = new park.MobilePayGUI();
        java.awt.Dimension dimension5 = null;
        mobilePayGUI4.setPreferredSize(dimension5);
        mobilePayGUI4.doLayout();
        boolean boolean9 = mobilePayGUI4.areFocusTraversalKeysSet((int) (short) 1);
        javax.swing.JRootPane jRootPane10 = mobilePayGUI4.getRootPane();
        java.awt.Component component13 = jRootPane10.findComponentAt((int) (byte) 0, 10);
        mobilePayGUI0.setContentPane((java.awt.Container) jRootPane10);
        mobilePayGUI0.setSize(1, (int) (byte) 1);
        java.awt.Event event18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = mobilePayGUI0.postEvent(event18);
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
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.lang.String str1 = mobilePayGUI0.getTitle();
        java.awt.event.KeyListener keyListener2 = null;
        mobilePayGUI0.addKeyListener(keyListener2);
        java.awt.event.FocusListener focusListener4 = null;
        mobilePayGUI0.removeFocusListener(focusListener4);
        park.MobilePayGUI mobilePayGUI6 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener7 = null;
        mobilePayGUI6.addMouseWheelListener(mouseWheelListener7);
        java.awt.Point point10 = mobilePayGUI6.getMousePosition(true);
        java.awt.event.MouseListener mouseListener11 = null;
        mobilePayGUI6.addMouseListener(mouseListener11);
        java.awt.LayoutManager layoutManager13 = mobilePayGUI6.getLayout();
        mobilePayGUI6.move(11, 6);
        javax.swing.JMenuBar jMenuBar17 = null;
        mobilePayGUI6.setJMenuBar(jMenuBar17);
        mobilePayGUI0.setLocationRelativeTo((java.awt.Component) mobilePayGUI6);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        mobilePayGUI6.removePropertyChangeListener(propertyChangeListener20);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Mobile Pay GUI" + "'", str1, "Mobile Pay GUI");
        org.junit.Assert.assertNull(point10);
        org.junit.Assert.assertNotNull(layoutManager13);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = mobilePayGUI0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        mobilePayGUI0.transferFocusBackward();
        park.MobilePayGUI mobilePayGUI8 = new park.MobilePayGUI();
        java.awt.Dimension dimension9 = null;
        mobilePayGUI8.setPreferredSize(dimension9);
        mobilePayGUI8.resize(7, 0);
        boolean boolean14 = mobilePayGUI8.isEnabled();
        mobilePayGUI8.setAlwaysOnTop(false);
        boolean boolean17 = mobilePayGUI8.isShowing();
        java.awt.Point point18 = null;
        java.awt.Point point19 = mobilePayGUI8.getLocation(point18);
        java.awt.Component component20 = mobilePayGUI0.findComponentAt(point19);
        java.awt.Event event21 = null;
        boolean boolean24 = mobilePayGUI0.mouseMove(event21, 10, (int) (short) 1);
        boolean boolean25 = mobilePayGUI0.getFocusableWindowState();
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
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        mobilePayGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = mobilePayGUI0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        mobilePayGUI0.addMouseListener(mouseListener5);
        java.awt.Component component7 = mobilePayGUI0.getMostRecentFocusOwner();
        java.awt.MenuBar menuBar8 = null;
        mobilePayGUI0.setMenuBar(menuBar8);
        boolean boolean10 = mobilePayGUI0.isValid();
        park.MobilePayGUI mobilePayGUI11 = new park.MobilePayGUI();
        mobilePayGUI11.setLocationByPlatform(false);
        java.awt.Image image14 = null;
        mobilePayGUI11.setIconImage(image14);
        javax.swing.JMenuBar jMenuBar16 = null;
        mobilePayGUI11.setJMenuBar(jMenuBar16);
        java.awt.FocusTraversalPolicy focusTraversalPolicy18 = null;
        mobilePayGUI11.setFocusTraversalPolicy(focusTraversalPolicy18);
        park.MobilePayGUI mobilePayGUI20 = new park.MobilePayGUI();
        java.awt.Dimension dimension21 = null;
        mobilePayGUI20.setPreferredSize(dimension21);
        mobilePayGUI20.resize(7, 0);
        boolean boolean26 = mobilePayGUI20.isEnabled();
        java.awt.Event event27 = null;
        boolean boolean29 = mobilePayGUI20.lostFocus(event27, (java.lang.Object) (short) 0);
        java.awt.Font font30 = mobilePayGUI20.getFont();
        java.awt.FontMetrics fontMetrics31 = mobilePayGUI11.getFontMetrics(font30);
        java.awt.FontMetrics fontMetrics32 = mobilePayGUI0.getFontMetrics(font30);
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
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.Dimension dimension1 = null;
        mobilePayGUI0.setPreferredSize(dimension1);
        mobilePayGUI0.resize(7, 0);
        boolean boolean6 = mobilePayGUI0.isEnabled();
        mobilePayGUI0.setResizable(false);
        park.MobilePayGUI mobilePayGUI9 = new park.MobilePayGUI();
        mobilePayGUI9.setFocusable(false);
        java.awt.Event event12 = null;
        boolean boolean15 = mobilePayGUI9.mouseDrag(event12, (int) (byte) 1, (int) (short) 1);
        boolean boolean16 = mobilePayGUI9.getFocusableWindowState();
        javax.swing.JLayeredPane jLayeredPane17 = mobilePayGUI9.getLayeredPane();
        mobilePayGUI0.setLayeredPane(jLayeredPane17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(jLayeredPane17);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = mobilePayGUI0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle7 = mobilePayGUI0.getBounds();
        java.awt.Dimension dimension8 = mobilePayGUI0.getPreferredSize();
        java.awt.im.InputMethodRequests inputMethodRequests9 = mobilePayGUI0.getInputMethodRequests();
        boolean boolean10 = mobilePayGUI0.isResizable();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(rectangle7);
        org.junit.Assert.assertNotNull(dimension8);
        org.junit.Assert.assertNull(inputMethodRequests9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.Dimension dimension1 = null;
        mobilePayGUI0.setPreferredSize(dimension1);
        mobilePayGUI0.resize(7, 0);
        boolean boolean6 = mobilePayGUI0.isEnabled();
        mobilePayGUI0.repaint((long) 7, (int) '#', (int) (short) 100, 9, (int) (byte) 0);
        int int13 = mobilePayGUI0.getComponentCount();
        boolean boolean14 = mobilePayGUI0.isValidateRoot();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.Dimension dimension1 = null;
        mobilePayGUI0.setPreferredSize(dimension1);
        mobilePayGUI0.resize(7, 0);
        boolean boolean6 = mobilePayGUI0.isEnabled();
        java.awt.Event event7 = null;
        boolean boolean9 = mobilePayGUI0.lostFocus(event7, (java.lang.Object) (short) 0);
        mobilePayGUI0.setFocusCycleRoot(true);
        park.MobilePayGUI mobilePayGUI12 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener13 = null;
        mobilePayGUI12.addMouseWheelListener(mouseWheelListener13);
        java.awt.Point point16 = mobilePayGUI12.getMousePosition(true);
        java.awt.event.MouseListener mouseListener17 = null;
        mobilePayGUI12.addMouseListener(mouseListener17);
        java.awt.Component component19 = mobilePayGUI12.getMostRecentFocusOwner();
        java.awt.MenuBar menuBar20 = null;
        mobilePayGUI12.setMenuBar(menuBar20);
        park.MobilePayGUI mobilePayGUI22 = new park.MobilePayGUI();
        java.lang.String str23 = mobilePayGUI22.getTitle();
        java.awt.Cursor cursor24 = null;
        mobilePayGUI22.setCursor(cursor24);
        java.awt.Dimension dimension26 = mobilePayGUI22.size();
        mobilePayGUI12.setPreferredSize(dimension26);
        java.awt.Dimension dimension28 = mobilePayGUI0.getSize(dimension26);
        mobilePayGUI0.repaint();
        java.beans.PropertyChangeListener propertyChangeListener31 = null;
        mobilePayGUI0.removePropertyChangeListener("Mobile Pay GUI", propertyChangeListener31);
        mobilePayGUI0.resize((int) 'a', 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(point16);
        org.junit.Assert.assertNotNull(component19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Mobile Pay GUI" + "'", str23, "Mobile Pay GUI");
        org.junit.Assert.assertNotNull(dimension26);
        org.junit.Assert.assertNotNull(dimension28);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.Dimension dimension1 = null;
        mobilePayGUI0.setPreferredSize(dimension1);
        mobilePayGUI0.resize(7, 0);
        java.awt.Event event6 = null;
        park.MobilePayGUI mobilePayGUI7 = new park.MobilePayGUI();
        mobilePayGUI7.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.awt.Color color12 = mobilePayGUI7.getForeground();
        boolean boolean13 = mobilePayGUI0.action(event6, (java.lang.Object) mobilePayGUI7);
        java.awt.Dimension dimension14 = mobilePayGUI7.size();
        java.awt.event.WindowListener windowListener15 = null;
        mobilePayGUI7.removeWindowListener(windowListener15);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dimension14);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        mobilePayGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = mobilePayGUI0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        mobilePayGUI0.addMouseListener(mouseListener5);
        java.awt.LayoutManager layoutManager7 = mobilePayGUI0.getLayout();
        mobilePayGUI0.move(11, 6);
        java.awt.dnd.DropTarget dropTarget11 = null;
        mobilePayGUI0.setDropTarget(dropTarget11);
        park.MobilePayGUI mobilePayGUI13 = new park.MobilePayGUI();
        mobilePayGUI13.setLocationByPlatform(false);
        mobilePayGUI13.setVisible(true);
        java.awt.Dimension dimension18 = mobilePayGUI13.getMaximumSize();
        java.awt.Dimension dimension19 = mobilePayGUI0.getSize(dimension18);
        java.awt.FocusTraversalPolicy focusTraversalPolicy20 = mobilePayGUI0.getFocusTraversalPolicy();
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(layoutManager7);
        org.junit.Assert.assertNotNull(dimension18);
        org.junit.Assert.assertNotNull(dimension19);
        org.junit.Assert.assertNotNull(focusTraversalPolicy20);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.lang.String str1 = mobilePayGUI0.getTitle();
        java.awt.Font font2 = null;
        mobilePayGUI0.setFont(font2);
        int int4 = mobilePayGUI0.getWidth();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Mobile Pay GUI" + "'", str1, "Mobile Pay GUI");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 400 + "'", int4 == 400);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        mobilePayGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = mobilePayGUI0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        mobilePayGUI0.addMouseListener(mouseListener5);
        java.awt.LayoutManager layoutManager7 = mobilePayGUI0.getLayout();
        java.awt.Window[] windowArray8 = mobilePayGUI0.getOwnedWindows();
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(layoutManager7);
        org.junit.Assert.assertNotNull(windowArray8);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str5 = mobilePayGUI0.getTitle();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior6 = mobilePayGUI0.getBaselineResizeBehavior();
        float float7 = mobilePayGUI0.getOpacity();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray9 = mobilePayGUI0.getPropertyChangeListeners("");
        java.awt.Graphics graphics10 = null;
        // The following exception was thrown during execution in test generation
        try {
            mobilePayGUI0.paintComponents(graphics10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Graphics.getClip()\" because \"g\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Mobile Pay GUI" + "'", str5, "Mobile Pay GUI");
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior6 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior6.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray9);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = mobilePayGUI0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        boolean boolean7 = mobilePayGUI0.getFocusableWindowState();
        javax.swing.JLayeredPane jLayeredPane8 = mobilePayGUI0.getLayeredPane();
        park.MobilePayGUI mobilePayGUI9 = new park.MobilePayGUI();
        java.awt.Dimension dimension10 = null;
        mobilePayGUI9.setPreferredSize(dimension10);
        mobilePayGUI9.resize(7, 0);
        java.awt.Event event15 = null;
        park.MobilePayGUI mobilePayGUI16 = new park.MobilePayGUI();
        mobilePayGUI16.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.awt.Color color21 = mobilePayGUI16.getForeground();
        boolean boolean22 = mobilePayGUI9.action(event15, (java.lang.Object) mobilePayGUI16);
        java.awt.Dimension dimension23 = mobilePayGUI16.size();
        mobilePayGUI0.setSize(dimension23);
        java.awt.Insets insets25 = mobilePayGUI0.insets();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(jLayeredPane8);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dimension23);
        org.junit.Assert.assertNotNull(insets25);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.Dimension dimension1 = null;
        mobilePayGUI0.setPreferredSize(dimension1);
        mobilePayGUI0.resize(7, 0);
        java.awt.Event event6 = null;
        park.MobilePayGUI mobilePayGUI7 = new park.MobilePayGUI();
        mobilePayGUI7.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.awt.Color color12 = mobilePayGUI7.getForeground();
        boolean boolean13 = mobilePayGUI0.action(event6, (java.lang.Object) mobilePayGUI7);
        java.awt.Dimension dimension14 = mobilePayGUI7.size();
        java.awt.Event event15 = null;
        // The following exception was thrown during execution in test generation
        try {
            mobilePayGUI7.deliverEvent(event15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"x\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dimension14);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.Dimension dimension1 = null;
        mobilePayGUI0.setPreferredSize(dimension1);
        mobilePayGUI0.resize(7, 0);
        boolean boolean6 = mobilePayGUI0.isEnabled();
        java.awt.Event event7 = null;
        boolean boolean9 = mobilePayGUI0.lostFocus(event7, (java.lang.Object) (short) 0);
        mobilePayGUI0.setFocusCycleRoot(true);
        java.awt.Dimension dimension12 = mobilePayGUI0.getMaximumSize();
        park.MobilePayGUI mobilePayGUI13 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener14 = null;
        mobilePayGUI13.addMouseWheelListener(mouseWheelListener14);
        java.awt.event.MouseMotionListener mouseMotionListener16 = null;
        mobilePayGUI13.removeMouseMotionListener(mouseMotionListener16);
        java.awt.event.HierarchyListener[] hierarchyListenerArray18 = mobilePayGUI13.getHierarchyListeners();
        park.MobilePayGUI mobilePayGUI19 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener20 = null;
        mobilePayGUI19.addMouseWheelListener(mouseWheelListener20);
        java.awt.Point point23 = mobilePayGUI19.getMousePosition(true);
        java.awt.event.MouseListener mouseListener24 = null;
        mobilePayGUI19.addMouseListener(mouseListener24);
        java.awt.Component component26 = mobilePayGUI19.getMostRecentFocusOwner();
        java.awt.Dimension dimension27 = null;
        mobilePayGUI19.setMaximumSize(dimension27);
        park.MobilePayGUI mobilePayGUI29 = new park.MobilePayGUI();
        mobilePayGUI29.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str34 = mobilePayGUI29.getTitle();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior35 = mobilePayGUI29.getBaselineResizeBehavior();
        java.awt.event.WindowListener windowListener36 = null;
        mobilePayGUI29.addWindowListener(windowListener36);
        park.MobilePayGUI mobilePayGUI38 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener39 = null;
        mobilePayGUI38.addMouseWheelListener(mouseWheelListener39);
        java.awt.Point point42 = mobilePayGUI38.getMousePosition(true);
        java.awt.event.MouseListener mouseListener43 = null;
        mobilePayGUI38.addMouseListener(mouseListener43);
        park.MobilePayGUI mobilePayGUI45 = new park.MobilePayGUI();
        mobilePayGUI45.setFocusable(false);
        java.awt.Event event48 = null;
        boolean boolean51 = mobilePayGUI45.mouseDrag(event48, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle52 = mobilePayGUI45.getBounds();
        java.awt.Rectangle rectangle53 = mobilePayGUI38.getBounds(rectangle52);
        mobilePayGUI29.setMaximizedBounds(rectangle53);
        mobilePayGUI19.setMixingCutoutShape((java.awt.Shape) rectangle53);
        mobilePayGUI13.setMixingCutoutShape((java.awt.Shape) rectangle53);
        mobilePayGUI0.setMaximizedBounds(rectangle53);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dimension12);
        org.junit.Assert.assertNotNull(hierarchyListenerArray18);
        org.junit.Assert.assertNull(point23);
        org.junit.Assert.assertNotNull(component26);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Mobile Pay GUI" + "'", str34, "Mobile Pay GUI");
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior35 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior35.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNull(point42);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(rectangle52);
        org.junit.Assert.assertNotNull(rectangle53);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = mobilePayGUI0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle7 = mobilePayGUI0.getBounds();
        java.awt.Component component10 = mobilePayGUI0.getComponentAt(7, 6);
        mobilePayGUI0.setName("");
        java.awt.Window.Type type13 = mobilePayGUI0.getType();
        java.util.Locale locale14 = null;
        mobilePayGUI0.setLocale(locale14);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(rectangle7);
        org.junit.Assert.assertNotNull(component10);
        org.junit.Assert.assertTrue("'" + type13 + "' != '" + java.awt.Window.Type.NORMAL + "'", type13.equals(java.awt.Window.Type.NORMAL));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        mobilePayGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = mobilePayGUI0.getMousePosition(true);
        park.MobilePayGUI mobilePayGUI5 = new park.MobilePayGUI();
        mobilePayGUI5.setLocationByPlatform(false);
        java.awt.Image image8 = null;
        mobilePayGUI5.setIconImage(image8);
        javax.swing.JMenuBar jMenuBar10 = null;
        mobilePayGUI5.setJMenuBar(jMenuBar10);
        java.awt.FocusTraversalPolicy focusTraversalPolicy12 = null;
        mobilePayGUI5.setFocusTraversalPolicy(focusTraversalPolicy12);
        park.MobilePayGUI mobilePayGUI14 = new park.MobilePayGUI();
        java.awt.Dimension dimension15 = null;
        mobilePayGUI14.setPreferredSize(dimension15);
        mobilePayGUI14.resize(7, 0);
        boolean boolean20 = mobilePayGUI14.isEnabled();
        java.awt.Event event21 = null;
        boolean boolean23 = mobilePayGUI14.lostFocus(event21, (java.lang.Object) (short) 0);
        java.awt.Font font24 = mobilePayGUI14.getFont();
        java.awt.FontMetrics fontMetrics25 = mobilePayGUI5.getFontMetrics(font24);
        java.awt.Cursor cursor26 = null;
        mobilePayGUI5.setCursor(cursor26);
        int int28 = mobilePayGUI0.getComponentZOrder((java.awt.Component) mobilePayGUI5);
        java.awt.Image image29 = null;
        park.MobilePayGUI mobilePayGUI30 = new park.MobilePayGUI();
        mobilePayGUI30.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str35 = mobilePayGUI30.getTitle();
        int int36 = mobilePayGUI0.checkImage(image29, (java.awt.image.ImageObserver) mobilePayGUI30);
        java.awt.Rectangle rectangle37 = mobilePayGUI30.getMaximizedBounds();
        // The following exception was thrown during execution in test generation
        try {
            mobilePayGUI30.setUndecorated(true);
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Mobile Pay GUI" + "'", str35, "Mobile Pay GUI");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 32 + "'", int36 == 32);
        org.junit.Assert.assertNull(rectangle37);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        mobilePayGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = mobilePayGUI0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        mobilePayGUI0.addMouseListener(mouseListener5);
        java.awt.Component component7 = mobilePayGUI0.getMostRecentFocusOwner();
        javax.swing.JMenuBar jMenuBar8 = mobilePayGUI0.getJMenuBar();
        mobilePayGUI0.disable();
        java.awt.event.MouseListener mouseListener10 = null;
        mobilePayGUI0.removeMouseListener(mouseListener10);
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertNull(jMenuBar8);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        mobilePayGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = mobilePayGUI0.getMousePosition(true);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray5 = mobilePayGUI0.getPropertyChangeListeners();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener6 = null;
        mobilePayGUI0.removeHierarchyBoundsListener(hierarchyBoundsListener6);
        java.awt.Image image10 = mobilePayGUI0.createImage(6, (int) (short) 100);
        java.awt.Cursor cursor11 = mobilePayGUI0.getCursor();
        boolean boolean12 = mobilePayGUI0.isVisible();
        park.MobilePayGUI mobilePayGUI13 = new park.MobilePayGUI();
        mobilePayGUI13.setFocusable(false);
        java.awt.Event event16 = null;
        boolean boolean19 = mobilePayGUI13.mouseDrag(event16, (int) (byte) 1, (int) (short) 1);
        boolean boolean20 = mobilePayGUI13.getFocusableWindowState();
        javax.swing.JLayeredPane jLayeredPane21 = mobilePayGUI13.getLayeredPane();
        mobilePayGUI0.setLayeredPane(jLayeredPane21);
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
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.lang.String str1 = mobilePayGUI0.getTitle();
        java.awt.Cursor cursor2 = null;
        mobilePayGUI0.setCursor(cursor2);
        java.awt.event.WindowListener windowListener4 = null;
        mobilePayGUI0.addWindowListener(windowListener4);
        java.awt.Event event6 = null;
        park.MobilePayGUI mobilePayGUI7 = new park.MobilePayGUI();
        mobilePayGUI7.setLocationByPlatform(false);
        java.awt.Image image10 = null;
        mobilePayGUI7.setIconImage(image10);
        park.MobilePayGUI mobilePayGUI12 = new park.MobilePayGUI();
        mobilePayGUI12.setFocusable(false);
        java.awt.Event event15 = null;
        boolean boolean18 = mobilePayGUI12.mouseDrag(event15, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle19 = mobilePayGUI12.getBounds();
        mobilePayGUI7.setMixingCutoutShape((java.awt.Shape) rectangle19);
        boolean boolean21 = mobilePayGUI0.gotFocus(event6, (java.lang.Object) rectangle19);
        mobilePayGUI0.hide();
        mobilePayGUI0.validate();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Mobile Pay GUI" + "'", str1, "Mobile Pay GUI");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(rectangle19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        mobilePayGUI0.addMouseWheelListener(mouseWheelListener1);
        java.util.Locale locale3 = null;
        mobilePayGUI0.setLocale(locale3);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        mobilePayGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = mobilePayGUI0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        mobilePayGUI0.addMouseListener(mouseListener5);
        java.awt.Component component7 = mobilePayGUI0.getMostRecentFocusOwner();
        mobilePayGUI0.setAlwaysOnTop(false);
        javax.accessibility.AccessibleContext accessibleContext10 = mobilePayGUI0.getAccessibleContext();
        boolean boolean11 = mobilePayGUI0.getFocusableWindowState();
        mobilePayGUI0.reshape((int) (byte) -1, (int) (byte) 100, 200, (int) (byte) -1);
        org.junit.Assert.assertNull(point4);
// flaky:         org.junit.Assert.assertNull(component7);
        org.junit.Assert.assertNotNull(accessibleContext10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = mobilePayGUI0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        java.awt.Toolkit toolkit7 = mobilePayGUI0.getToolkit();
        float float8 = mobilePayGUI0.getAlignmentX();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(toolkit7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.5f + "'", float8 == 0.5f);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.setLocationByPlatform(false);
        mobilePayGUI0.firePropertyChange("Mobile Pay GUI", (short) (byte) -1, (short) (byte) 1);
        park.MobilePayGUI mobilePayGUI7 = new park.MobilePayGUI();
        mobilePayGUI7.setFocusable(false);
        java.awt.Event event10 = null;
        boolean boolean13 = mobilePayGUI7.mouseDrag(event10, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle14 = mobilePayGUI7.getBounds();
        java.awt.Dimension dimension15 = mobilePayGUI7.getPreferredSize();
        park.MobilePayGUI mobilePayGUI16 = new park.MobilePayGUI();
        java.lang.String str17 = mobilePayGUI16.getTitle();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray18 = mobilePayGUI16.getPropertyChangeListeners();
        boolean boolean19 = mobilePayGUI7.isFocusCycleRoot((java.awt.Container) mobilePayGUI16);
        // The following exception was thrown during execution in test generation
        try {
            mobilePayGUI0.setContentPane((java.awt.Container) mobilePayGUI7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(rectangle14);
        org.junit.Assert.assertNotNull(dimension15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Mobile Pay GUI" + "'", str17, "Mobile Pay GUI");
        org.junit.Assert.assertNotNull(propertyChangeListenerArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.Dimension dimension1 = null;
        mobilePayGUI0.setPreferredSize(dimension1);
        mobilePayGUI0.resize(7, 0);
        boolean boolean6 = mobilePayGUI0.isEnabled();
        mobilePayGUI0.repaint((long) 7, (int) '#', (int) (short) 100, 9, (int) (byte) 0);
        int int13 = mobilePayGUI0.getComponentCount();
        java.awt.Event event14 = null;
        boolean boolean17 = mobilePayGUI0.mouseMove(event14, (int) (short) -1, (int) (short) 10);
        java.awt.Component component18 = mobilePayGUI0.getGlassPane();
        java.awt.event.FocusEvent.Cause cause19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = mobilePayGUI0.requestFocusInWindow(cause19);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null cause");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(component18);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        mobilePayGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = mobilePayGUI0.getMousePosition(true);
        park.MobilePayGUI mobilePayGUI5 = new park.MobilePayGUI();
        mobilePayGUI5.setLocationByPlatform(false);
        java.awt.Image image8 = null;
        mobilePayGUI5.setIconImage(image8);
        javax.swing.JMenuBar jMenuBar10 = null;
        mobilePayGUI5.setJMenuBar(jMenuBar10);
        java.awt.FocusTraversalPolicy focusTraversalPolicy12 = null;
        mobilePayGUI5.setFocusTraversalPolicy(focusTraversalPolicy12);
        park.MobilePayGUI mobilePayGUI14 = new park.MobilePayGUI();
        java.awt.Dimension dimension15 = null;
        mobilePayGUI14.setPreferredSize(dimension15);
        mobilePayGUI14.resize(7, 0);
        boolean boolean20 = mobilePayGUI14.isEnabled();
        java.awt.Event event21 = null;
        boolean boolean23 = mobilePayGUI14.lostFocus(event21, (java.lang.Object) (short) 0);
        java.awt.Font font24 = mobilePayGUI14.getFont();
        java.awt.FontMetrics fontMetrics25 = mobilePayGUI5.getFontMetrics(font24);
        java.awt.Cursor cursor26 = null;
        mobilePayGUI5.setCursor(cursor26);
        int int28 = mobilePayGUI0.getComponentZOrder((java.awt.Component) mobilePayGUI5);
        java.awt.Image image29 = null;
        park.MobilePayGUI mobilePayGUI30 = new park.MobilePayGUI();
        mobilePayGUI30.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str35 = mobilePayGUI30.getTitle();
        int int36 = mobilePayGUI0.checkImage(image29, (java.awt.image.ImageObserver) mobilePayGUI30);
        java.awt.Rectangle rectangle37 = mobilePayGUI30.getMaximizedBounds();
        java.awt.Dimension dimension38 = mobilePayGUI30.minimumSize();
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(font24);
        org.junit.Assert.assertNotNull(fontMetrics25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Mobile Pay GUI" + "'", str35, "Mobile Pay GUI");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 32 + "'", int36 == 32);
        org.junit.Assert.assertNull(rectangle37);
        org.junit.Assert.assertNotNull(dimension38);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        mobilePayGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = mobilePayGUI0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        mobilePayGUI0.addMouseListener(mouseListener5);
        java.awt.Component component7 = mobilePayGUI0.getMostRecentFocusOwner();
        mobilePayGUI0.setAlwaysOnTop(false);
        park.MobilePayGUI mobilePayGUI10 = new park.MobilePayGUI();
        mobilePayGUI10.setFocusable(false);
        java.awt.Event event13 = null;
        boolean boolean16 = mobilePayGUI10.mouseDrag(event13, (int) (byte) 1, (int) (short) 1);
        mobilePayGUI10.transferFocusBackward();
        java.awt.Event event18 = null;
        boolean boolean21 = mobilePayGUI10.mouseDown(event18, (int) (short) 10, (int) (byte) 100);
        park.MobilePayGUI mobilePayGUI22 = new park.MobilePayGUI();
        mobilePayGUI22.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str27 = mobilePayGUI22.getTitle();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior28 = mobilePayGUI22.getBaselineResizeBehavior();
        park.MobilePayGUI mobilePayGUI29 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener30 = null;
        mobilePayGUI29.addMouseWheelListener(mouseWheelListener30);
        java.awt.Point point33 = mobilePayGUI29.getMousePosition(true);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray34 = mobilePayGUI29.getPropertyChangeListeners();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener35 = null;
        mobilePayGUI29.removeHierarchyBoundsListener(hierarchyBoundsListener35);
        java.awt.Image image39 = mobilePayGUI29.createImage(6, (int) (short) 100);
        mobilePayGUI22.setIconImage(image39);
        park.MobilePayGUI mobilePayGUI41 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener42 = null;
        mobilePayGUI41.addMouseWheelListener(mouseWheelListener42);
        java.awt.event.MouseMotionListener mouseMotionListener44 = null;
        mobilePayGUI41.removeMouseMotionListener(mouseMotionListener44);
        java.awt.Event event46 = null;
        boolean boolean49 = mobilePayGUI41.mouseUp(event46, (int) (short) 0, (int) (short) -1);
        java.awt.Component component52 = mobilePayGUI41.locate(5, (int) ' ');
        int int53 = mobilePayGUI10.checkImage(image39, (java.awt.image.ImageObserver) component52);
        java.awt.image.ImageObserver imageObserver54 = null;
        int int55 = mobilePayGUI0.checkImage(image39, imageObserver54);
        org.junit.Assert.assertNull(point4);
// flaky:         org.junit.Assert.assertNull(component7);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Mobile Pay GUI" + "'", str27, "Mobile Pay GUI");
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior28 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior28.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNull(point33);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray34);
        org.junit.Assert.assertNotNull(image39);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(component52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 32 + "'", int53 == 32);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 32 + "'", int55 == 32);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.Dimension dimension1 = null;
        mobilePayGUI0.setPreferredSize(dimension1);
        mobilePayGUI0.doLayout();
        java.awt.Window.Type type4 = mobilePayGUI0.getType();
        java.awt.Dimension dimension5 = mobilePayGUI0.getSize();
        park.MobilePayGUI mobilePayGUI6 = new park.MobilePayGUI();
        java.awt.Dimension dimension7 = null;
        mobilePayGUI6.setPreferredSize(dimension7);
        mobilePayGUI6.resize(7, 0);
        boolean boolean12 = mobilePayGUI6.isEnabled();
        mobilePayGUI6.setResizable(false);
        boolean boolean15 = mobilePayGUI0.isAncestorOf((java.awt.Component) mobilePayGUI6);
        boolean boolean16 = mobilePayGUI0.isFocusTraversable();
        java.util.List<java.awt.Image> imageList17 = null;
        mobilePayGUI0.setIconImages(imageList17);
        boolean boolean19 = mobilePayGUI0.isFocusTraversalPolicySet();
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + java.awt.Window.Type.NORMAL + "'", type4.equals(java.awt.Window.Type.NORMAL));
        org.junit.Assert.assertNotNull(dimension5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.setLocationByPlatform(false);
        mobilePayGUI0.setVisible(true);
        java.awt.Dimension dimension5 = mobilePayGUI0.getMaximumSize();
        java.awt.Dimension dimension6 = mobilePayGUI0.size();
        java.awt.Insets insets7 = mobilePayGUI0.getInsets();
        mobilePayGUI0.setFocusable(true);
        boolean boolean10 = mobilePayGUI0.isValidateRoot();
        org.junit.Assert.assertNotNull(dimension5);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertNotNull(insets7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.awt.Color color5 = mobilePayGUI0.getForeground();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener6 = null;
        mobilePayGUI0.removeHierarchyBoundsListener(hierarchyBoundsListener6);
        java.util.ResourceBundle resourceBundle8 = null;
        // The following exception was thrown during execution in test generation
        try {
            mobilePayGUI0.applyResourceBundle(resourceBundle8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ResourceBundle.getLocale()\" because \"bdl\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(color5);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.Dimension dimension1 = null;
        mobilePayGUI0.setPreferredSize(dimension1);
        mobilePayGUI0.doLayout();
        java.awt.Window.Type type4 = mobilePayGUI0.getType();
        java.awt.Dimension dimension5 = mobilePayGUI0.getSize();
        park.MobilePayGUI mobilePayGUI6 = new park.MobilePayGUI();
        java.awt.Dimension dimension7 = null;
        mobilePayGUI6.setPreferredSize(dimension7);
        mobilePayGUI6.resize(7, 0);
        boolean boolean12 = mobilePayGUI6.isEnabled();
        mobilePayGUI6.setResizable(false);
        boolean boolean15 = mobilePayGUI0.isAncestorOf((java.awt.Component) mobilePayGUI6);
        java.awt.Insets insets16 = mobilePayGUI0.insets();
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + java.awt.Window.Type.NORMAL + "'", type4.equals(java.awt.Window.Type.NORMAL));
        org.junit.Assert.assertNotNull(dimension5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(insets16);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.setLocationByPlatform(false);
        java.awt.dnd.DropTarget dropTarget3 = mobilePayGUI0.getDropTarget();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        mobilePayGUI0.addPropertyChangeListener("", propertyChangeListener5);
        java.awt.Point point7 = mobilePayGUI0.getLocation();
        float float8 = mobilePayGUI0.getAlignmentX();
        org.junit.Assert.assertNull(dropTarget3);
        org.junit.Assert.assertNotNull(point7);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.5f + "'", float8 == 0.5f);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        int int0 = java.awt.image.ImageObserver.FRAMEBITS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        mobilePayGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = mobilePayGUI0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        mobilePayGUI0.addMouseListener(mouseListener5);
        java.awt.LayoutManager layoutManager7 = mobilePayGUI0.getLayout();
        mobilePayGUI0.move(11, 6);
        java.awt.Image image11 = null;
        mobilePayGUI0.setIconImage(image11);
        java.awt.im.InputMethodRequests inputMethodRequests13 = mobilePayGUI0.getInputMethodRequests();
        java.awt.Dimension dimension14 = mobilePayGUI0.getPreferredSize();
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(layoutManager7);
        org.junit.Assert.assertNull(inputMethodRequests13);
        org.junit.Assert.assertNotNull(dimension14);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = mobilePayGUI0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        mobilePayGUI0.transferFocusBackward();
        java.awt.Event event8 = null;
        boolean boolean11 = mobilePayGUI0.mouseDown(event8, (int) (short) 10, (int) (byte) 100);
        java.awt.Image image12 = null;
        mobilePayGUI0.setIconImage(image12);
        mobilePayGUI0.setState(7);
        mobilePayGUI0.resize(7, (-1));
        java.awt.event.HierarchyListener hierarchyListener19 = null;
        mobilePayGUI0.removeHierarchyListener(hierarchyListener19);
        park.MobilePayGUI mobilePayGUI21 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener22 = null;
        mobilePayGUI21.addMouseWheelListener(mouseWheelListener22);
        java.awt.Point point25 = mobilePayGUI21.getMousePosition(true);
        java.awt.event.MouseListener mouseListener26 = null;
        mobilePayGUI21.addMouseListener(mouseListener26);
        java.awt.LayoutManager layoutManager28 = mobilePayGUI21.getLayout();
        mobilePayGUI0.setLayout(layoutManager28);
        park.MobilePayGUI mobilePayGUI30 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener31 = null;
        mobilePayGUI30.addMouseWheelListener(mouseWheelListener31);
        java.awt.Point point34 = mobilePayGUI30.getMousePosition(true);
        java.awt.event.MouseListener mouseListener35 = null;
        mobilePayGUI30.addMouseListener(mouseListener35);
        java.awt.LayoutManager layoutManager37 = mobilePayGUI30.getLayout();
        mobilePayGUI30.move(11, 6);
        javax.swing.JMenuBar jMenuBar41 = null;
        mobilePayGUI30.setJMenuBar(jMenuBar41);
        mobilePayGUI30.firePropertyChange("", (long) (short) 1, (long) (-1));
        park.MobilePayGUI mobilePayGUI47 = new park.MobilePayGUI();
        java.lang.String str48 = mobilePayGUI47.getTitle();
        java.awt.Cursor cursor49 = null;
        mobilePayGUI47.setCursor(cursor49);
        java.awt.event.WindowListener windowListener51 = null;
        mobilePayGUI47.addWindowListener(windowListener51);
        java.awt.Event event53 = null;
        park.MobilePayGUI mobilePayGUI54 = new park.MobilePayGUI();
        mobilePayGUI54.setLocationByPlatform(false);
        java.awt.Image image57 = null;
        mobilePayGUI54.setIconImage(image57);
        park.MobilePayGUI mobilePayGUI59 = new park.MobilePayGUI();
        mobilePayGUI59.setFocusable(false);
        java.awt.Event event62 = null;
        boolean boolean65 = mobilePayGUI59.mouseDrag(event62, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle66 = mobilePayGUI59.getBounds();
        mobilePayGUI54.setMixingCutoutShape((java.awt.Shape) rectangle66);
        boolean boolean68 = mobilePayGUI47.gotFocus(event53, (java.lang.Object) rectangle66);
        mobilePayGUI30.setBounds(rectangle66);
        java.awt.Cursor cursor70 = mobilePayGUI30.getCursor();
        mobilePayGUI0.setCursor(cursor70);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(point25);
        org.junit.Assert.assertNotNull(layoutManager28);
        org.junit.Assert.assertNull(point34);
        org.junit.Assert.assertNotNull(layoutManager37);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Mobile Pay GUI" + "'", str48, "Mobile Pay GUI");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(rectangle66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(cursor70);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.awt.Color color5 = mobilePayGUI0.getForeground();
        java.awt.Event event6 = null;
        boolean boolean8 = mobilePayGUI0.gotFocus(event6, (java.lang.Object) (short) -1);
        park.MobilePayGUI mobilePayGUI9 = new park.MobilePayGUI();
        java.awt.Dimension dimension10 = null;
        mobilePayGUI9.setPreferredSize(dimension10);
        mobilePayGUI9.resize(7, 0);
        boolean boolean15 = mobilePayGUI9.isEnabled();
        java.awt.Event event16 = null;
        boolean boolean18 = mobilePayGUI9.lostFocus(event16, (java.lang.Object) (short) 0);
        mobilePayGUI9.setFocusCycleRoot(true);
        park.MobilePayGUI mobilePayGUI21 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener22 = null;
        mobilePayGUI21.addMouseWheelListener(mouseWheelListener22);
        java.awt.Point point25 = mobilePayGUI21.getMousePosition(true);
        java.awt.event.MouseListener mouseListener26 = null;
        mobilePayGUI21.addMouseListener(mouseListener26);
        java.awt.Component component28 = mobilePayGUI21.getMostRecentFocusOwner();
        java.awt.MenuBar menuBar29 = null;
        mobilePayGUI21.setMenuBar(menuBar29);
        park.MobilePayGUI mobilePayGUI31 = new park.MobilePayGUI();
        java.lang.String str32 = mobilePayGUI31.getTitle();
        java.awt.Cursor cursor33 = null;
        mobilePayGUI31.setCursor(cursor33);
        java.awt.Dimension dimension35 = mobilePayGUI31.size();
        mobilePayGUI21.setPreferredSize(dimension35);
        java.awt.Dimension dimension37 = mobilePayGUI9.getSize(dimension35);
        mobilePayGUI0.setMaximumSize(dimension37);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(point25);
        org.junit.Assert.assertNotNull(component28);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Mobile Pay GUI" + "'", str32, "Mobile Pay GUI");
        org.junit.Assert.assertNotNull(dimension35);
        org.junit.Assert.assertNotNull(dimension37);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.Dimension dimension1 = null;
        mobilePayGUI0.setPreferredSize(dimension1);
        mobilePayGUI0.resize(7, 0);
        boolean boolean6 = mobilePayGUI0.isEnabled();
        java.awt.Event event7 = null;
        boolean boolean9 = mobilePayGUI0.lostFocus(event7, (java.lang.Object) (short) 0);
        mobilePayGUI0.setFocusCycleRoot(true);
        java.awt.Dimension dimension12 = mobilePayGUI0.getMaximumSize();
        java.awt.im.InputContext inputContext13 = mobilePayGUI0.getInputContext();
        java.awt.event.FocusListener focusListener14 = null;
        mobilePayGUI0.removeFocusListener(focusListener14);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dimension12);
        org.junit.Assert.assertNotNull(inputContext13);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = mobilePayGUI0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        boolean boolean7 = mobilePayGUI0.isShowing();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        mobilePayGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = mobilePayGUI0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        mobilePayGUI0.addMouseListener(mouseListener5);
        java.awt.image.ColorModel colorModel7 = mobilePayGUI0.getColorModel();
        mobilePayGUI0.setTitle("Mobile Pay GUI");
        java.awt.Component component10 = mobilePayGUI0.getFocusOwner();
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(colorModel7);
        org.junit.Assert.assertNull(component10);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = mobilePayGUI0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        boolean boolean7 = mobilePayGUI0.getFocusableWindowState();
        javax.swing.JLayeredPane jLayeredPane8 = mobilePayGUI0.getLayeredPane();
        boolean boolean9 = mobilePayGUI0.isPreferredSizeSet();
        java.awt.Point point10 = mobilePayGUI0.getLocationOnScreen();
        mobilePayGUI0.removeAll();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(jLayeredPane8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(point10);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.Dimension dimension1 = null;
        mobilePayGUI0.setPreferredSize(dimension1);
        mobilePayGUI0.resize(7, 0);
        java.awt.Event event6 = null;
        park.MobilePayGUI mobilePayGUI7 = new park.MobilePayGUI();
        mobilePayGUI7.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.awt.Color color12 = mobilePayGUI7.getForeground();
        boolean boolean13 = mobilePayGUI0.action(event6, (java.lang.Object) mobilePayGUI7);
        java.awt.Dimension dimension14 = mobilePayGUI0.getMaximumSize();
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dimension14);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str5 = mobilePayGUI0.getTitle();
        java.awt.event.FocusListener[] focusListenerArray6 = mobilePayGUI0.getFocusListeners();
        boolean boolean7 = mobilePayGUI0.requestFocusInWindow();
        java.awt.Container container8 = mobilePayGUI0.getParent();
        java.awt.Dialog.ModalExclusionType modalExclusionType9 = null;
        mobilePayGUI0.setModalExclusionType(modalExclusionType9);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Mobile Pay GUI" + "'", str5, "Mobile Pay GUI");
        org.junit.Assert.assertNotNull(focusListenerArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(container8);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.Dimension dimension1 = null;
        mobilePayGUI0.setPreferredSize(dimension1);
        mobilePayGUI0.resize(7, 0);
        boolean boolean6 = mobilePayGUI0.isEnabled();
        java.awt.Event event7 = null;
        boolean boolean9 = mobilePayGUI0.lostFocus(event7, (java.lang.Object) (short) 0);
        java.awt.Font font10 = mobilePayGUI0.getFont();
        mobilePayGUI0.toBack();
        java.awt.event.WindowStateListener windowStateListener12 = null;
        mobilePayGUI0.removeWindowStateListener(windowStateListener12);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(font10);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.Dimension dimension1 = null;
        mobilePayGUI0.setPreferredSize(dimension1);
        mobilePayGUI0.resize(7, 0);
        boolean boolean6 = mobilePayGUI0.isEnabled();
        java.awt.Event event7 = null;
        boolean boolean9 = mobilePayGUI0.lostFocus(event7, (java.lang.Object) (short) 0);
        mobilePayGUI0.setFocusCycleRoot(true);
        park.MobilePayGUI mobilePayGUI12 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener13 = null;
        mobilePayGUI12.addMouseWheelListener(mouseWheelListener13);
        java.awt.Point point16 = mobilePayGUI12.getMousePosition(true);
        java.awt.event.MouseListener mouseListener17 = null;
        mobilePayGUI12.addMouseListener(mouseListener17);
        java.awt.Component component19 = mobilePayGUI12.getMostRecentFocusOwner();
        java.awt.MenuBar menuBar20 = null;
        mobilePayGUI12.setMenuBar(menuBar20);
        park.MobilePayGUI mobilePayGUI22 = new park.MobilePayGUI();
        java.lang.String str23 = mobilePayGUI22.getTitle();
        java.awt.Cursor cursor24 = null;
        mobilePayGUI22.setCursor(cursor24);
        java.awt.Dimension dimension26 = mobilePayGUI22.size();
        mobilePayGUI12.setPreferredSize(dimension26);
        java.awt.Dimension dimension28 = mobilePayGUI0.getSize(dimension26);
        mobilePayGUI0.repaint();
        java.awt.im.InputMethodRequests inputMethodRequests30 = mobilePayGUI0.getInputMethodRequests();
        int int31 = mobilePayGUI0.getWidth();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(point16);
        org.junit.Assert.assertNotNull(component19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Mobile Pay GUI" + "'", str23, "Mobile Pay GUI");
        org.junit.Assert.assertNotNull(dimension26);
        org.junit.Assert.assertNotNull(dimension28);
        org.junit.Assert.assertNull(inputMethodRequests30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 7 + "'", int31 == 7);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = mobilePayGUI0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        mobilePayGUI0.transferFocusBackward();
        java.awt.Event event8 = null;
        boolean boolean11 = mobilePayGUI0.mouseDown(event8, (int) (short) 10, (int) (byte) 100);
        java.awt.Image image12 = null;
        mobilePayGUI0.setIconImage(image12);
        mobilePayGUI0.setState(7);
        mobilePayGUI0.resize(7, (-1));
        java.awt.Component component21 = mobilePayGUI0.getComponentAt((int) ' ', 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(component21);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        mobilePayGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = mobilePayGUI0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        mobilePayGUI0.addMouseListener(mouseListener5);
        java.awt.LayoutManager layoutManager7 = mobilePayGUI0.getLayout();
        mobilePayGUI0.move(11, 6);
        javax.swing.JMenuBar jMenuBar11 = null;
        mobilePayGUI0.setJMenuBar(jMenuBar11);
        park.MobilePayGUI mobilePayGUI13 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener14 = null;
        mobilePayGUI13.addMouseWheelListener(mouseWheelListener14);
        boolean boolean16 = mobilePayGUI13.isAlwaysOnTop();
        java.awt.Point point17 = mobilePayGUI13.location();
        java.awt.Point point18 = mobilePayGUI0.getLocation(point17);
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(layoutManager7);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(point17);
        org.junit.Assert.assertNotNull(point18);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.Dimension dimension1 = null;
        mobilePayGUI0.setPreferredSize(dimension1);
        mobilePayGUI0.doLayout();
        boolean boolean5 = mobilePayGUI0.areFocusTraversalKeysSet((int) (short) 1);
        javax.swing.JRootPane jRootPane6 = mobilePayGUI0.getRootPane();
        int int7 = mobilePayGUI0.getHeight();
        mobilePayGUI0.dispose();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jRootPane6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 200 + "'", int7 == 200);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        mobilePayGUI0.addMouseWheelListener(mouseWheelListener1);
        park.MobilePayGUI mobilePayGUI3 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener4 = null;
        mobilePayGUI3.addMouseWheelListener(mouseWheelListener4);
        java.awt.Point point7 = mobilePayGUI3.getMousePosition(true);
        java.awt.event.MouseListener mouseListener8 = null;
        mobilePayGUI3.addMouseListener(mouseListener8);
        java.awt.Component component10 = mobilePayGUI3.getMostRecentFocusOwner();
        java.awt.MenuBar menuBar11 = null;
        mobilePayGUI3.setMenuBar(menuBar11);
        park.MobilePayGUI mobilePayGUI13 = new park.MobilePayGUI();
        java.lang.String str14 = mobilePayGUI13.getTitle();
        java.awt.Cursor cursor15 = null;
        mobilePayGUI13.setCursor(cursor15);
        java.awt.Dimension dimension17 = mobilePayGUI13.size();
        mobilePayGUI3.setSize(dimension17);
        mobilePayGUI0.resize(dimension17);
        boolean boolean20 = mobilePayGUI0.isLocationByPlatform();
        org.junit.Assert.assertNull(point7);
        org.junit.Assert.assertNotNull(component10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Mobile Pay GUI" + "'", str14, "Mobile Pay GUI");
        org.junit.Assert.assertNotNull(dimension17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.Dimension dimension1 = null;
        mobilePayGUI0.setPreferredSize(dimension1);
        mobilePayGUI0.resize(7, 0);
        boolean boolean6 = mobilePayGUI0.isEnabled();
        mobilePayGUI0.repaint((long) 7, (int) '#', (int) (short) 100, 9, (int) (byte) 0);
        int int13 = mobilePayGUI0.getComponentCount();
        java.awt.Event event14 = null;
        boolean boolean17 = mobilePayGUI0.mouseMove(event14, (int) (short) -1, (int) (short) 10);
        java.awt.Component component18 = mobilePayGUI0.getGlassPane();
        java.io.PrintWriter printWriter19 = null;
        // The following exception was thrown during execution in test generation
        try {
            mobilePayGUI0.list(printWriter19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(Object)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(component18);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        mobilePayGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = mobilePayGUI0.getMousePosition(true);
        park.MobilePayGUI mobilePayGUI5 = new park.MobilePayGUI();
        mobilePayGUI5.setLocationByPlatform(false);
        java.awt.Image image8 = null;
        mobilePayGUI5.setIconImage(image8);
        javax.swing.JMenuBar jMenuBar10 = null;
        mobilePayGUI5.setJMenuBar(jMenuBar10);
        java.awt.FocusTraversalPolicy focusTraversalPolicy12 = null;
        mobilePayGUI5.setFocusTraversalPolicy(focusTraversalPolicy12);
        park.MobilePayGUI mobilePayGUI14 = new park.MobilePayGUI();
        java.awt.Dimension dimension15 = null;
        mobilePayGUI14.setPreferredSize(dimension15);
        mobilePayGUI14.resize(7, 0);
        boolean boolean20 = mobilePayGUI14.isEnabled();
        java.awt.Event event21 = null;
        boolean boolean23 = mobilePayGUI14.lostFocus(event21, (java.lang.Object) (short) 0);
        java.awt.Font font24 = mobilePayGUI14.getFont();
        java.awt.FontMetrics fontMetrics25 = mobilePayGUI5.getFontMetrics(font24);
        java.awt.Cursor cursor26 = null;
        mobilePayGUI5.setCursor(cursor26);
        int int28 = mobilePayGUI0.getComponentZOrder((java.awt.Component) mobilePayGUI5);
        java.awt.dnd.DropTarget dropTarget29 = null;
        mobilePayGUI0.setDropTarget(dropTarget29);
        java.awt.event.WindowStateListener windowStateListener31 = null;
        mobilePayGUI0.removeWindowStateListener(windowStateListener31);
        mobilePayGUI0.setFocusableWindowState(false);
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(font24);
        org.junit.Assert.assertNotNull(fontMetrics25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str5 = mobilePayGUI0.getTitle();
        int int6 = mobilePayGUI0.countComponents();
        java.awt.event.ContainerListener containerListener7 = null;
        mobilePayGUI0.removeContainerListener(containerListener7);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Mobile Pay GUI" + "'", str5, "Mobile Pay GUI");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        mobilePayGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.event.MouseMotionListener mouseMotionListener3 = null;
        mobilePayGUI0.removeMouseMotionListener(mouseMotionListener3);
        java.awt.event.HierarchyListener[] hierarchyListenerArray5 = mobilePayGUI0.getHierarchyListeners();
        park.MobilePayGUI mobilePayGUI6 = new park.MobilePayGUI();
        mobilePayGUI6.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str11 = mobilePayGUI6.getTitle();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior12 = mobilePayGUI6.getBaselineResizeBehavior();
        park.MobilePayGUI mobilePayGUI13 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener14 = null;
        mobilePayGUI13.addMouseWheelListener(mouseWheelListener14);
        java.awt.Point point17 = mobilePayGUI13.getMousePosition(true);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray18 = mobilePayGUI13.getPropertyChangeListeners();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener19 = null;
        mobilePayGUI13.removeHierarchyBoundsListener(hierarchyBoundsListener19);
        java.awt.Image image23 = mobilePayGUI13.createImage(6, (int) (short) 100);
        mobilePayGUI6.setIconImage(image23);
        park.MobilePayGUI mobilePayGUI27 = new park.MobilePayGUI();
        mobilePayGUI27.setFocusable(false);
        java.awt.Event event30 = null;
        boolean boolean33 = mobilePayGUI27.mouseDrag(event30, (int) (byte) 1, (int) (short) 1);
        java.awt.event.WindowListener windowListener34 = null;
        mobilePayGUI27.removeWindowListener(windowListener34);
        java.awt.event.MouseMotionListener mouseMotionListener36 = null;
        mobilePayGUI27.addMouseMotionListener(mouseMotionListener36);
        int int38 = mobilePayGUI0.checkImage(image23, 1, (int) '4', (java.awt.image.ImageObserver) mobilePayGUI27);
        java.awt.Point point39 = mobilePayGUI0.getMousePosition();
        park.MobilePayGUI mobilePayGUI40 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener41 = null;
        mobilePayGUI40.addMouseWheelListener(mouseWheelListener41);
        java.awt.Point point44 = mobilePayGUI40.getMousePosition(true);
        java.awt.event.MouseListener mouseListener45 = null;
        mobilePayGUI40.addMouseListener(mouseListener45);
        java.awt.LayoutManager layoutManager47 = mobilePayGUI40.getLayout();
        mobilePayGUI40.move(11, 6);
        javax.swing.JMenuBar jMenuBar51 = null;
        mobilePayGUI40.setJMenuBar(jMenuBar51);
        mobilePayGUI40.firePropertyChange("", (long) (short) 1, (long) (-1));
        park.MobilePayGUI mobilePayGUI57 = new park.MobilePayGUI();
        java.lang.String str58 = mobilePayGUI57.getTitle();
        java.awt.Cursor cursor59 = null;
        mobilePayGUI57.setCursor(cursor59);
        java.awt.event.WindowListener windowListener61 = null;
        mobilePayGUI57.addWindowListener(windowListener61);
        java.awt.Event event63 = null;
        park.MobilePayGUI mobilePayGUI64 = new park.MobilePayGUI();
        mobilePayGUI64.setLocationByPlatform(false);
        java.awt.Image image67 = null;
        mobilePayGUI64.setIconImage(image67);
        park.MobilePayGUI mobilePayGUI69 = new park.MobilePayGUI();
        mobilePayGUI69.setFocusable(false);
        java.awt.Event event72 = null;
        boolean boolean75 = mobilePayGUI69.mouseDrag(event72, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle76 = mobilePayGUI69.getBounds();
        mobilePayGUI64.setMixingCutoutShape((java.awt.Shape) rectangle76);
        boolean boolean78 = mobilePayGUI57.gotFocus(event63, (java.lang.Object) rectangle76);
        mobilePayGUI40.setBounds(rectangle76);
        java.awt.Cursor cursor80 = mobilePayGUI40.getCursor();
        java.awt.Graphics graphics81 = mobilePayGUI40.getGraphics();
        mobilePayGUI0.printComponents(graphics81);
        org.junit.Assert.assertNotNull(hierarchyListenerArray5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Mobile Pay GUI" + "'", str11, "Mobile Pay GUI");
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior12 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior12.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNull(point17);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray18);
        org.junit.Assert.assertNotNull(image23);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 32 + "'", int38 == 32);
        org.junit.Assert.assertNull(point39);
        org.junit.Assert.assertNull(point44);
        org.junit.Assert.assertNotNull(layoutManager47);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Mobile Pay GUI" + "'", str58, "Mobile Pay GUI");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(rectangle76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(cursor80);
        org.junit.Assert.assertNotNull(graphics81);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        mobilePayGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = mobilePayGUI0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        mobilePayGUI0.addMouseListener(mouseListener5);
        java.awt.LayoutManager layoutManager7 = mobilePayGUI0.getLayout();
        mobilePayGUI0.move(11, 6);
        javax.swing.JMenuBar jMenuBar11 = null;
        mobilePayGUI0.setJMenuBar(jMenuBar11);
        mobilePayGUI0.firePropertyChange("", (long) (short) 1, (long) (-1));
        java.awt.event.ContainerListener containerListener17 = null;
        mobilePayGUI0.removeContainerListener(containerListener17);
        boolean boolean19 = mobilePayGUI0.isFocusable();
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(layoutManager7);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.lang.String str1 = mobilePayGUI0.getTitle();
        java.awt.Cursor cursor2 = null;
        mobilePayGUI0.setCursor(cursor2);
        java.awt.event.WindowListener windowListener4 = null;
        mobilePayGUI0.addWindowListener(windowListener4);
        mobilePayGUI0.firePropertyChange("Mobile Pay GUI", (long) '#', (long) (byte) 0);
        park.MobilePayGUI mobilePayGUI10 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener11 = null;
        mobilePayGUI10.addMouseWheelListener(mouseWheelListener11);
        java.awt.Point point14 = mobilePayGUI10.getMousePosition(true);
        java.awt.event.MouseListener mouseListener15 = null;
        mobilePayGUI10.addMouseListener(mouseListener15);
        java.awt.Component component17 = mobilePayGUI10.getMostRecentFocusOwner();
        int int18 = mobilePayGUI0.getComponentZOrder(component17);
        boolean boolean19 = mobilePayGUI0.isResizable();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Mobile Pay GUI" + "'", str1, "Mobile Pay GUI");
        org.junit.Assert.assertNull(point14);
        org.junit.Assert.assertNotNull(component17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.setFocusable(false);
        java.awt.Event event3 = null;
        boolean boolean6 = mobilePayGUI0.mouseDrag(event3, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle7 = mobilePayGUI0.getBounds();
        java.awt.Dimension dimension8 = mobilePayGUI0.getPreferredSize();
        javax.swing.JRootPane jRootPane9 = mobilePayGUI0.getRootPane();
        boolean boolean10 = mobilePayGUI0.isOpaque();
        java.awt.Point point11 = mobilePayGUI0.getLocation();
        boolean boolean12 = mobilePayGUI0.isShowing();
        boolean boolean13 = mobilePayGUI0.isFontSet();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(rectangle7);
        org.junit.Assert.assertNotNull(dimension8);
        org.junit.Assert.assertNotNull(jRootPane9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(point11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        mobilePayGUI0.firePropertyChange("", (long) 7, (long) (byte) -1);
        java.lang.String str5 = mobilePayGUI0.getTitle();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior6 = mobilePayGUI0.getBaselineResizeBehavior();
        java.awt.event.WindowListener windowListener7 = null;
        mobilePayGUI0.addWindowListener(windowListener7);
        park.MobilePayGUI mobilePayGUI9 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener10 = null;
        mobilePayGUI9.addMouseWheelListener(mouseWheelListener10);
        java.awt.Point point13 = mobilePayGUI9.getMousePosition(true);
        java.awt.event.MouseListener mouseListener14 = null;
        mobilePayGUI9.addMouseListener(mouseListener14);
        park.MobilePayGUI mobilePayGUI16 = new park.MobilePayGUI();
        mobilePayGUI16.setFocusable(false);
        java.awt.Event event19 = null;
        boolean boolean22 = mobilePayGUI16.mouseDrag(event19, (int) (byte) 1, (int) (short) 1);
        java.awt.Rectangle rectangle23 = mobilePayGUI16.getBounds();
        java.awt.Rectangle rectangle24 = mobilePayGUI9.getBounds(rectangle23);
        mobilePayGUI0.setMaximizedBounds(rectangle24);
        mobilePayGUI0.setAlwaysOnTop(false);
        park.MobilePayGUI mobilePayGUI28 = new park.MobilePayGUI();
        java.awt.Dimension dimension29 = null;
        mobilePayGUI28.setPreferredSize(dimension29);
        mobilePayGUI28.doLayout();
        java.awt.Window.Type type32 = mobilePayGUI28.getType();
        java.awt.Dimension dimension33 = mobilePayGUI28.getSize();
        park.MobilePayGUI mobilePayGUI34 = new park.MobilePayGUI();
        java.awt.Dimension dimension35 = null;
        mobilePayGUI34.setPreferredSize(dimension35);
        mobilePayGUI34.resize(7, 0);
        boolean boolean40 = mobilePayGUI34.isEnabled();
        mobilePayGUI34.setResizable(false);
        boolean boolean43 = mobilePayGUI28.isAncestorOf((java.awt.Component) mobilePayGUI34);
        boolean boolean44 = mobilePayGUI28.isFocusTraversable();
        java.util.List<java.awt.Image> imageList45 = null;
        mobilePayGUI28.setIconImages(imageList45);
        mobilePayGUI0.setLocationRelativeTo((java.awt.Component) mobilePayGUI28);
        java.awt.event.FocusEvent.Cause cause48 = null;
        mobilePayGUI28.requestFocus(cause48);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Mobile Pay GUI" + "'", str5, "Mobile Pay GUI");
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
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        park.MobilePayGUI mobilePayGUI0 = new park.MobilePayGUI();
        java.awt.event.MouseWheelListener mouseWheelListener1 = null;
        mobilePayGUI0.addMouseWheelListener(mouseWheelListener1);
        java.awt.Point point4 = mobilePayGUI0.getMousePosition(true);
        java.awt.event.MouseListener mouseListener5 = null;
        mobilePayGUI0.addMouseListener(mouseListener5);
        java.awt.LayoutManager layoutManager7 = mobilePayGUI0.getLayout();
        mobilePayGUI0.move(11, 6);
        java.awt.dnd.DropTarget dropTarget11 = null;
        mobilePayGUI0.setDropTarget(dropTarget11);
        park.MobilePayGUI mobilePayGUI13 = new park.MobilePayGUI();
        mobilePayGUI13.setLocationByPlatform(false);
        mobilePayGUI13.setVisible(true);
        java.awt.Dimension dimension18 = mobilePayGUI13.getMaximumSize();
        java.awt.Dimension dimension19 = mobilePayGUI0.getSize(dimension18);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener20 = null;
        mobilePayGUI0.removeHierarchyBoundsListener(hierarchyBoundsListener20);
        java.awt.event.InputMethodListener inputMethodListener22 = null;
        mobilePayGUI0.addInputMethodListener(inputMethodListener22);
        org.junit.Assert.assertNull(point4);
        org.junit.Assert.assertNotNull(layoutManager7);
        org.junit.Assert.assertNotNull(dimension18);
        org.junit.Assert.assertNotNull(dimension19);
    }
}
