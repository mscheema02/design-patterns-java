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
        park.Manager manager2 = new park.Manager("", "hi!");
        java.lang.Class<?> wildcardClass3 = manager2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        park.Manager manager2 = new park.Manager("", "");
        boolean boolean4 = manager2.validateUser("");
        park.User user5 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.removeUser(user5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot assign field \"validationStatus\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        park.Manager manager2 = new park.Manager("", "");
        boolean boolean4 = manager2.validateUser("");
        java.lang.Class<?> wildcardClass5 = manager2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getName();
        java.lang.String str4 = manager2.getPassword();
        park.User user5 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.addUser(user5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"park.User.getValidationStatus()\" because \"u\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getName();
        java.lang.String str4 = manager2.getPassword();
        boolean boolean6 = manager2.validateUser("");
        park.User user7 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.removeUser(user7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot assign field \"validationStatus\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getPassword();
        java.lang.String str4 = manager2.getPassword();
        park.User user5 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.addUser(user5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"park.User.getValidationStatus()\" because \"u\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getPassword();
        java.lang.String str4 = manager2.generatePassword();
        java.lang.Class<?> wildcardClass5 = manager2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "^|$0-!nxn9t6" + "'", str4, "^|$0-!nxn9t6");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getName();
        java.lang.String str4 = manager2.getPassword();
        boolean boolean6 = manager2.validateUser("");
        boolean boolean8 = manager2.validateUser("hi!");
        java.lang.String str9 = manager2.generatePassword();
        park.User user10 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.removeUser(user10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot assign field \"validationStatus\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + ".y*?vc]_M(yG" + "'", str9, ".y*?vc]_M(yG");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        park.Manager manager2 = new park.Manager("", "");
        boolean boolean4 = manager2.validateUser("");
        java.lang.String str5 = manager2.getName();
        java.lang.Class<?> wildcardClass6 = manager2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getPassword();
        java.lang.String str4 = manager2.generatePassword();
        park.User user5 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.addUser(user5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"park.User.getValidationStatus()\" because \"u\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "L^0%ImtxS5OH" + "'", str4, "L^0%ImtxS5OH");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getName();
        java.lang.String str4 = manager2.getPassword();
        boolean boolean6 = manager2.validateUser("");
        park.User user7 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.addUser(user7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"park.User.getValidationStatus()\" because \"u\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getName();
        java.lang.String str4 = manager2.getPassword();
        boolean boolean6 = manager2.validateUser("");
        boolean boolean8 = manager2.validateUser("hi!");
        park.User user9 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.removeUser(user9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot assign field \"validationStatus\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        park.Manager manager2 = new park.Manager("", "");
        java.lang.String str3 = manager2.getName();
        java.lang.Class<?> wildcardClass4 = manager2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        park.Manager manager0 = new park.Manager();
        java.lang.Class<?> wildcardClass1 = manager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        park.Manager manager0 = new park.Manager();
        java.lang.String str1 = manager0.generatePassword();
        park.User user2 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager0.addUser(user2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"park.User.getValidationStatus()\" because \"u\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "xS{4xye6D){s" + "'", str1, "xS{4xye6D){s");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        park.Manager manager2 = new park.Manager("k}m_oq1I\")]3", "hi!");
        park.User user3 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.addUser(user3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"park.User.getValidationStatus()\" because \"u\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        park.Manager manager2 = new park.Manager("k}m_oq1I\")]3", "hi!");
        park.User user3 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.removeUser(user3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot assign field \"validationStatus\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getName();
        park.User user4 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.addUser(user4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"park.User.getValidationStatus()\" because \"u\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        park.Manager manager2 = new park.Manager("", "");
        boolean boolean4 = manager2.validateUser("");
        java.lang.String str5 = manager2.getName();
        park.User user6 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.removeUser(user6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot assign field \"validationStatus\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        park.Manager manager2 = new park.Manager("k}m_oq1I\")]3", "hi!");
        java.lang.String str3 = manager2.getPassword();
        park.User user4 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.addUser(user4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"park.User.getValidationStatus()\" because \"u\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        park.Manager manager2 = new park.Manager("<5j0vDyVq%6f", "T8u[xH5+!Wk_");
        java.lang.Class<?> wildcardClass3 = manager2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        park.Manager manager2 = new park.Manager("<5j0vDyVq%6f", "T8u[xH5+!Wk_");
        park.User user3 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.removeUser(user3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot assign field \"validationStatus\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        park.Manager manager2 = new park.Manager("", "");
        java.lang.String str3 = manager2.getName();
        java.lang.String str4 = manager2.getName();
        park.User user5 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.addUser(user5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"park.User.getValidationStatus()\" because \"u\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getPassword();
        java.lang.String str4 = manager2.getName();
        park.User user5 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.removeUser(user5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot assign field \"validationStatus\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getName();
        java.lang.String str4 = manager2.getName();
        park.User user5 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.addUser(user5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"park.User.getValidationStatus()\" because \"u\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getName();
        java.lang.String str4 = manager2.getPassword();
        boolean boolean6 = manager2.validateUser("");
        boolean boolean8 = manager2.validateUser("hi!");
        java.lang.Class<?> wildcardClass9 = manager2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getPassword();
        java.lang.String str4 = manager2.getPassword();
        java.lang.String str5 = manager2.generatePassword();
        park.User user6 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.addUser(user6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"park.User.getValidationStatus()\" because \"u\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PTS$U8JtWu/v" + "'", str5, "PTS$U8JtWu/v");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        park.Manager manager0 = new park.Manager();
        park.User user1 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager0.removeUser(user1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot assign field \"validationStatus\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getPassword();
        java.lang.String str4 = manager2.getName();
        park.User user5 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.addUser(user5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"park.User.getValidationStatus()\" because \"u\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        park.Manager manager2 = new park.Manager("_za<PrGJq!$h", "\\At58_|z@U?r");
        java.lang.String str3 = manager2.getPassword();
        park.User user4 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.removeUser(user4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot assign field \"validationStatus\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\At58_|z@U?r" + "'", str3, "\\At58_|z@U?r");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getPassword();
        java.lang.String str4 = manager2.getName();
        java.lang.Class<?> wildcardClass5 = manager2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        park.Manager manager2 = new park.Manager("_za<PrGJq!$h", "\\At58_|z@U?r");
        java.lang.String str3 = manager2.getPassword();
        java.lang.Class<?> wildcardClass4 = manager2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\At58_|z@U?r" + "'", str3, "\\At58_|z@U?r");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        park.Manager manager2 = new park.Manager("\\At58_|z@U?r", "hi!");
        park.User user3 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.removeUser(user3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot assign field \"validationStatus\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getPassword();
        java.lang.String str4 = manager2.generatePassword();
        java.lang.String str5 = manager2.getName();
        java.lang.String str6 = manager2.generatePassword();
        park.User user7 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.addUser(user7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"park.User.getValidationStatus()\" because \"u\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "p/J*kMhi#t%m" + "'", str4, "p/J*kMhi#t%m");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + ":%z,ji3ov4BM" + "'", str6, ":%z,ji3ov4BM");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getName();
        java.lang.String str4 = manager2.getPassword();
        java.lang.String str5 = manager2.getName();
        java.lang.String str6 = manager2.getPassword();
        boolean boolean8 = manager2.validateUser("^|$0-!nxn9t6");
        park.User user9 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.addUser(user9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"park.User.getValidationStatus()\" because \"u\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        park.Manager manager2 = new park.Manager("", "k}m_oq1I\")]3");
        java.lang.String str3 = manager2.getPassword();
        park.User user4 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.addUser(user4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"park.User.getValidationStatus()\" because \"u\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "k}m_oq1I\")]3" + "'", str3, "k}m_oq1I\")]3");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        park.Manager manager2 = new park.Manager("", "k}m_oq1I\")]3");
        java.lang.String str3 = manager2.getPassword();
        java.lang.Class<?> wildcardClass4 = manager2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "k}m_oq1I\")]3" + "'", str3, "k}m_oq1I\")]3");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getPassword();
        java.lang.String str4 = manager2.generatePassword();
        java.lang.String str5 = manager2.getName();
        park.User user6 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.removeUser(user6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot assign field \"validationStatus\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "BG*-:C99|Qy2" + "'", str4, "BG*-:C99|Qy2");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        park.User user3 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.addUser(user3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"park.User.getValidationStatus()\" because \"u\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getPassword();
        java.lang.String str4 = manager2.generatePassword();
        java.lang.String str5 = manager2.getName();
        java.lang.String str6 = manager2.getPassword();
        java.lang.String str7 = manager2.getName();
        java.lang.Class<?> wildcardClass8 = manager2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "z/y\\:f$%XU]4" + "'", str4, "z/y\\:f$%XU]4");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getName();
        java.lang.String str4 = manager2.getPassword();
        java.lang.String str5 = manager2.getName();
        java.lang.String str6 = manager2.getName();
        boolean boolean8 = manager2.validateUser("3}F_u),J+1Q+");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        park.Manager manager2 = new park.Manager("_za<PrGJq!$h", "\\At58_|z@U?r");
        java.lang.String str3 = manager2.getPassword();
        park.User user4 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.addUser(user4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"park.User.getValidationStatus()\" because \"u\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\At58_|z@U?r" + "'", str3, "\\At58_|z@U?r");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getName();
        java.lang.String str4 = manager2.getPassword();
        park.User user5 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.removeUser(user5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot assign field \"validationStatus\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        park.Manager manager2 = new park.Manager("", "T8u[xH5+!Wk_");
        java.lang.Class<?> wildcardClass3 = manager2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        park.Manager manager2 = new park.Manager("!9F3r+a$Osu4", "<5j0vDyVq%6f");
        park.User user3 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.addUser(user3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"park.User.getValidationStatus()\" because \"u\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        park.Manager manager2 = new park.Manager("", "");
        java.lang.String str3 = manager2.getName();
        park.User user4 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.removeUser(user4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot assign field \"validationStatus\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        park.Manager manager2 = new park.Manager("", "");
        java.lang.String str3 = manager2.getName();
        java.lang.String str4 = manager2.getName();
        boolean boolean6 = manager2.validateUser("!9F3r+a$Osu4");
        park.User user7 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.removeUser(user7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot assign field \"validationStatus\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getPassword();
        java.lang.String str4 = manager2.getPassword();
        boolean boolean6 = manager2.validateUser("H/@,9x0[6rxt");
        java.lang.String str7 = manager2.getName();
        park.User user8 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.removeUser(user8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot assign field \"validationStatus\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getPassword();
        java.lang.String str4 = manager2.generatePassword();
        java.lang.String str5 = manager2.getName();
        java.lang.String str6 = manager2.generatePassword();
        java.lang.String str7 = manager2.getPassword();
        park.User user8 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.removeUser(user8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot assign field \"validationStatus\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "3)/!IUeLXfOW" + "'", str4, "3)/!IUeLXfOW");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "j|zy%dS,Wi^Z" + "'", str6, "j|zy%dS,Wi^Z");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getPassword();
        java.lang.String str4 = manager2.getPassword();
        java.lang.String str5 = manager2.getName();
        java.lang.String str6 = manager2.getPassword();
        java.lang.Class<?> wildcardClass7 = manager2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        park.Manager manager2 = new park.Manager("T8u[xH5+!Wk_", "");
        park.User user3 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.addUser(user3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"park.User.getValidationStatus()\" because \"u\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getPassword();
        java.lang.String str4 = manager2.getPassword();
        java.lang.String str5 = manager2.getName();
        java.lang.String str6 = manager2.getPassword();
        boolean boolean8 = manager2.validateUser("w-*[TXe((:/k");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        park.Manager manager2 = new park.Manager("_za<PrGJq!$h", "\\At58_|z@U?r");
        java.lang.String str3 = manager2.getName();
        boolean boolean5 = manager2.validateUser("");
        java.lang.Class<?> wildcardClass6 = manager2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_za<PrGJq!$h" + "'", str3, "_za<PrGJq!$h");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getPassword();
        park.User user4 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.removeUser(user4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot assign field \"validationStatus\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        park.Manager manager2 = new park.Manager("k}m_oq1I\")]3", "mEhS?)?fIW}|");
        park.User user3 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.removeUser(user3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot assign field \"validationStatus\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getPassword();
        java.lang.String str4 = manager2.getPassword();
        boolean boolean6 = manager2.validateUser("H/@,9x0[6rxt");
        java.lang.String str7 = manager2.getName();
        java.lang.Class<?> wildcardClass8 = manager2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getPassword();
        java.lang.String str4 = manager2.getPassword();
        java.lang.String str5 = manager2.generatePassword();
        java.lang.String str6 = manager2.generatePassword();
        park.User user7 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.addUser(user7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"park.User.getValidationStatus()\" because \"u\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "L%RtiWFeNn&," + "'", str5, "L%RtiWFeNn&,");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(G^mxrdapG)P" + "'", str6, "(G^mxrdapG)P");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        park.Manager manager2 = new park.Manager("7,wg!Vg45p>o", "@G!A2t0.do;9");
        park.User user3 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.addUser(user3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"park.User.getValidationStatus()\" because \"u\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getPassword();
        java.lang.String str4 = manager2.getPassword();
        java.lang.String str5 = manager2.generatePassword();
        java.lang.String str6 = manager2.getPassword();
        park.User user7 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.removeUser(user7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot assign field \"validationStatus\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"9YH6/0<};Ac" + "'", str5, "\"9YH6/0<};Ac");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        park.Manager manager2 = new park.Manager("", "");
        java.lang.String str3 = manager2.getName();
        java.lang.String str4 = manager2.getName();
        java.lang.String str5 = manager2.generatePassword();
        boolean boolean7 = manager2.validateUser("z/y\\:f$%XU]4");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "79&=}-l>nFe2" + "'", str5, "79&=}-l>nFe2");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        park.Manager manager2 = new park.Manager("b1|3*Tmp$X+L", "bEeXiJ]Ye!*N");
        java.lang.Class<?> wildcardClass3 = manager2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        park.Manager manager2 = new park.Manager("", "_za<PrGJq!$h");
        java.lang.Class<?> wildcardClass3 = manager2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        park.Manager manager2 = new park.Manager("T8u[xH5+!Wk_", "}/tU=\"ZM^le4");
        java.lang.String str3 = manager2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "}/tU=\"ZM^le4" + "'", str3, "}/tU=\"ZM^le4");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        park.Manager manager2 = new park.Manager("k}m_oq1I\")]3", "hi!");
        java.lang.String str3 = manager2.getPassword();
        java.lang.String str4 = manager2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "k}m_oq1I\")]3" + "'", str4, "k}m_oq1I\")]3");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        park.Manager manager2 = new park.Manager("", "");
        boolean boolean4 = manager2.validateUser("");
        java.lang.String str5 = manager2.getName();
        boolean boolean7 = manager2.validateUser("hi!");
        java.lang.String str8 = manager2.getName();
        java.lang.Class<?> wildcardClass9 = manager2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        park.Manager manager2 = new park.Manager("", "");
        boolean boolean4 = manager2.validateUser("");
        java.lang.String str5 = manager2.getName();
        boolean boolean7 = manager2.validateUser("hi!");
        boolean boolean9 = manager2.validateUser("_za<PrGJq!$h");
        boolean boolean11 = manager2.validateUser("H/@,9x0[6rxt");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getName();
        java.lang.String str4 = manager2.getPassword();
        java.lang.Class<?> wildcardClass5 = manager2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getPassword();
        java.lang.String str4 = manager2.generatePassword();
        park.User user5 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.removeUser(user5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot assign field \"validationStatus\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "x<_J?_dds^XH" + "'", str4, "x<_J?_dds^XH");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        park.Manager manager2 = new park.Manager("", "");
        boolean boolean4 = manager2.validateUser("");
        java.lang.String str5 = manager2.getName();
        boolean boolean7 = manager2.validateUser("hi!");
        boolean boolean9 = manager2.validateUser("_za<PrGJq!$h");
        boolean boolean11 = manager2.validateUser("j)fgwWZdY<^9");
        java.lang.String str12 = manager2.generatePassword();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "T[>{|+Sy=Im\"" + "'", str12, "T[>{|+Sy=Im\"");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getPassword();
        java.lang.String str4 = manager2.getPassword();
        java.lang.String str5 = manager2.generatePassword();
        boolean boolean7 = manager2.validateUser("}/tU=\"ZM^le4");
        java.lang.String str8 = manager2.getName();
        park.User user9 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.removeUser(user9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot assign field \"validationStatus\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "tR5S3Qzf((]r" + "'", str5, "tR5S3Qzf((]r");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getName();
        java.lang.String str4 = manager2.getPassword();
        boolean boolean6 = manager2.validateUser("");
        boolean boolean8 = manager2.validateUser("}/tU=\"ZM^le4");
        java.lang.String str9 = manager2.getPassword();
        java.lang.Class<?> wildcardClass10 = manager2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        park.Manager manager2 = new park.Manager("<5j0vDyVq%6f", "T8u[xH5+!Wk_");
        boolean boolean4 = manager2.validateUser("T8u[xH5+!Wk_");
        park.User user5 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.removeUser(user5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot assign field \"validationStatus\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        park.Manager manager2 = new park.Manager("T8u[xH5+!Wk_", "79&=}-l>nFe2");
        java.lang.Class<?> wildcardClass3 = manager2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        park.Manager manager2 = new park.Manager("T8u[xH5+!Wk_", "79&=}-l>nFe2");
        park.User user3 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.removeUser(user3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot assign field \"validationStatus\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        park.Manager manager2 = new park.Manager("T8u[xH5+!Wk_", "}/tU=\"ZM^le4");
        park.User user3 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.addUser(user3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"park.User.getValidationStatus()\" because \"u\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        park.Manager manager2 = new park.Manager("z/y\\:f$%XU]4", "h9PqEu26kQNY");
        park.User user3 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.removeUser(user3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot assign field \"validationStatus\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        park.Manager manager2 = new park.Manager("", "hi!");
        java.lang.String str3 = manager2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        park.Manager manager2 = new park.Manager("GW)U<MkKkV\"|", "Qq\"YzZfcV}<w");
        java.lang.Class<?> wildcardClass3 = manager2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        park.Manager manager2 = new park.Manager("", "");
        java.lang.String str3 = manager2.getName();
        java.lang.String str4 = manager2.getName();
        boolean boolean6 = manager2.validateUser("!9F3r+a$Osu4");
        boolean boolean8 = manager2.validateUser("hi!");
        park.User user9 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.addUser(user9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"park.User.getValidationStatus()\" because \"u\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        park.Manager manager2 = new park.Manager("T8u[xH5+!Wk_", "");
        java.lang.String str3 = manager2.generatePassword();
        park.User user4 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.addUser(user4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"park.User.getValidationStatus()\" because \"u\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "R3l!;4h|r\\z#" + "'", str3, "R3l!;4h|r\\z#");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getPassword();
        park.User user4 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.addUser(user4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"park.User.getValidationStatus()\" because \"u\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        park.Manager manager2 = new park.Manager("_za<PrGJq!$h", "\\At58_|z@U?r");
        park.User user3 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.removeUser(user3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot assign field \"validationStatus\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        park.Manager manager2 = new park.Manager("", "");
        boolean boolean4 = manager2.validateUser("");
        java.lang.String str5 = manager2.getName();
        boolean boolean7 = manager2.validateUser("hi!");
        java.lang.String str8 = manager2.getName();
        park.User user9 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.addUser(user9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"park.User.getValidationStatus()\" because \"u\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getPassword();
        java.lang.String str4 = manager2.generatePassword();
        java.lang.String str5 = manager2.getName();
        java.lang.Class<?> wildcardClass6 = manager2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "rFi[b77f[;:j" + "'", str4, "rFi[b77f[;:j");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        park.Manager manager2 = new park.Manager("<5j0vDyVq%6f", "T8u[xH5+!Wk_");
        boolean boolean4 = manager2.validateUser("T8u[xH5+!Wk_");
        park.User user5 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.addUser(user5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"park.User.getValidationStatus()\" because \"u\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getPassword();
        java.lang.String str4 = manager2.getPassword();
        java.lang.String str5 = manager2.generatePassword();
        java.lang.String str6 = manager2.generatePassword();
        java.lang.String str7 = manager2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Tji0*Wo[w6g}" + "'", str5, "Tji0*Wo[w6g}");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#[^xQoBQ*}1&" + "'", str6, "#[^xQoBQ*}1&");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        park.Manager manager2 = new park.Manager("_za<PrGJq!$h", "\\At58_|z@U?r");
        java.lang.String str3 = manager2.getPassword();
        boolean boolean5 = manager2.validateUser("hi!");
        java.lang.String str6 = manager2.getName();
        java.lang.Class<?> wildcardClass7 = manager2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\At58_|z@U?r" + "'", str3, "\\At58_|z@U?r");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_za<PrGJq!$h" + "'", str6, "_za<PrGJq!$h");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        park.Manager manager2 = new park.Manager("@J,\\F{ED0M3u", "@J,\\F{ED0M3u");
        park.User user3 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.addUser(user3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"park.User.getValidationStatus()\" because \"u\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getName();
        java.lang.String str4 = manager2.getPassword();
        boolean boolean6 = manager2.validateUser("");
        boolean boolean8 = manager2.validateUser("hi!");
        java.lang.String str9 = manager2.getName();
        java.lang.Class<?> wildcardClass10 = manager2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getName();
        java.lang.String str4 = manager2.getPassword();
        java.lang.String str5 = manager2.getName();
        java.lang.String str6 = manager2.getPassword();
        boolean boolean8 = manager2.validateUser("^|$0-!nxn9t6");
        park.User user9 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.removeUser(user9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot assign field \"validationStatus\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getPassword();
        java.lang.String str4 = manager2.generatePassword();
        java.lang.String str5 = manager2.getPassword();
        java.lang.String str6 = manager2.getPassword();
        java.lang.String str7 = manager2.generatePassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\\\H[iqc!\":gK" + "'", str4, "\\\\H[iqc!\":gK");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "C[gCA:xYk)N_" + "'", str7, "C[gCA:xYk)N_");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getName();
        java.lang.String str4 = manager2.getName();
        java.lang.String str5 = manager2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        park.Manager manager2 = new park.Manager("", "");
        java.lang.String str3 = manager2.getName();
        java.lang.String str4 = manager2.getName();
        java.lang.String str5 = manager2.generatePassword();
        park.User user6 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.addUser(user6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"park.User.getValidationStatus()\" because \"u\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "T<]=&Yi{]c)E" + "'", str5, "T<]=&Yi{]c)E");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        park.Manager manager2 = new park.Manager("", "T8u[xH5+!Wk_");
        park.User user3 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.addUser(user3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"park.User.getValidationStatus()\" because \"u\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        park.Manager manager2 = new park.Manager("Qq\"YzZfcV}<w", "@G!A2t0.do;9");
        java.lang.Class<?> wildcardClass3 = manager2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getPassword();
        java.lang.String str4 = manager2.getPassword();
        java.lang.Class<?> wildcardClass5 = manager2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        park.Manager manager2 = new park.Manager("", "");
        java.lang.String str3 = manager2.getName();
        java.lang.String str4 = manager2.getPassword();
        boolean boolean6 = manager2.validateUser(":$OYdEcbnoi=");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        park.Manager manager2 = new park.Manager("T8u[xH5+!Wk_", "79&=}-l>nFe2");
        boolean boolean4 = manager2.validateUser("%u-;)9s>XK#;");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getName();
        java.lang.String str4 = manager2.getPassword();
        boolean boolean6 = manager2.validateUser("");
        boolean boolean8 = manager2.validateUser("hi!");
        park.User user9 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.addUser(user9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"park.User.getValidationStatus()\" because \"u\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        park.Manager manager2 = new park.Manager("z/y\\:f$%XU]4", "1x}DkGj&g^\"g");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getPassword();
        java.lang.String str4 = manager2.getPassword();
        java.lang.String str5 = manager2.getName();
        java.lang.Class<?> wildcardClass6 = manager2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        park.Manager manager2 = new park.Manager("", "");
        java.lang.String str3 = manager2.getName();
        java.lang.String str4 = manager2.getName();
        boolean boolean6 = manager2.validateUser("!9F3r+a$Osu4");
        park.User user7 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.addUser(user7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"park.User.getValidationStatus()\" because \"u\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getPassword();
        java.lang.String str4 = manager2.generatePassword();
        java.lang.String str5 = manager2.getName();
        java.lang.String str6 = manager2.getPassword();
        java.lang.String str7 = manager2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Yjte7w9K\".Ag" + "'", str4, "Yjte7w9K\".Ag");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getPassword();
        java.lang.String str4 = manager2.getPassword();
        java.lang.String str5 = manager2.getName();
        java.lang.String str6 = manager2.getPassword();
        park.User user7 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.removeUser(user7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot assign field \"validationStatus\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        park.Manager manager2 = new park.Manager("3}F_u),J+1Q+", "");
        java.lang.String str3 = manager2.getName();
        java.lang.Class<?> wildcardClass4 = manager2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3}F_u),J+1Q+" + "'", str3, "3}F_u),J+1Q+");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        park.Manager manager2 = new park.Manager("_za<PrGJq!$h", "\\At58_|z@U?r");
        java.lang.String str3 = manager2.getPassword();
        boolean boolean5 = manager2.validateUser("hi!");
        java.lang.String str6 = manager2.getName();
        park.User user7 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.removeUser(user7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot assign field \"validationStatus\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\At58_|z@U?r" + "'", str3, "\\At58_|z@U?r");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_za<PrGJq!$h" + "'", str6, "_za<PrGJq!$h");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getName();
        java.lang.String str4 = manager2.getName();
        java.lang.String str5 = manager2.generatePassword();
        java.lang.String str6 = manager2.getName();
        java.lang.String str7 = manager2.generatePassword();
        park.User user8 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.addUser(user8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"park.User.getValidationStatus()\" because \"u\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "F90/&SI,&vSN" + "'", str5, "F90/&SI,&vSN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + ".3p*BQD1.Wr_" + "'", str7, ".3p*BQD1.Wr_");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        park.Manager manager2 = new park.Manager("", "");
        java.lang.String str3 = manager2.getName();
        java.lang.String str4 = manager2.getName();
        boolean boolean6 = manager2.validateUser("!9F3r+a$Osu4");
        boolean boolean8 = manager2.validateUser("hi!");
        java.lang.String str9 = manager2.getName();
        park.User user10 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.removeUser(user10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot assign field \"validationStatus\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        park.Manager manager2 = new park.Manager("o7F<^7PbbroF", "");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        park.Manager manager2 = new park.Manager("_za<PrGJq!$h", "\\At58_|z@U?r");
        java.lang.String str3 = manager2.getPassword();
        boolean boolean5 = manager2.validateUser("hi!");
        java.lang.String str6 = manager2.getName();
        java.lang.String str7 = manager2.getName();
        java.lang.String str8 = manager2.generatePassword();
        java.lang.Class<?> wildcardClass9 = manager2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\At58_|z@U?r" + "'", str3, "\\At58_|z@U?r");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_za<PrGJq!$h" + "'", str6, "_za<PrGJq!$h");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_za<PrGJq!$h" + "'", str7, "_za<PrGJq!$h");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-,\".??K%a=yf" + "'", str8, "-,\".??K%a=yf");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getName();
        java.lang.String str4 = manager2.getPassword();
        boolean boolean6 = manager2.validateUser("");
        boolean boolean8 = manager2.validateUser("hi!");
        java.lang.String str9 = manager2.generatePassword();
        boolean boolean11 = manager2.validateUser("h9PqEu26kQNY");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "n+jb|0/0feA5" + "'", str9, "n+jb|0/0feA5");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        park.Manager manager2 = new park.Manager("7,wg!Vg45p>o", "@G!A2t0.do;9");
        java.lang.Class<?> wildcardClass3 = manager2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        park.Manager manager2 = new park.Manager("_za<PrGJq!$h", "\\At58_|z@U?r");
        java.lang.String str3 = manager2.getName();
        java.lang.String str4 = manager2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_za<PrGJq!$h" + "'", str3, "_za<PrGJq!$h");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\At58_|z@U?r" + "'", str4, "\\At58_|z@U?r");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        park.Manager manager2 = new park.Manager("", "");
        java.lang.String str3 = manager2.getName();
        java.lang.String str4 = manager2.getPassword();
        java.lang.String str5 = manager2.getName();
        park.User user6 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.addUser(user6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"park.User.getValidationStatus()\" because \"u\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getPassword();
        java.lang.String str4 = manager2.getPassword();
        java.lang.String str5 = manager2.generatePassword();
        boolean boolean7 = manager2.validateUser("tzvk.xJS[lgX");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "VD)rKq/2nzN&" + "'", str5, "VD)rKq/2nzN&");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        park.Manager manager2 = new park.Manager("D4lO%x}j]<c9", "b1|3*Tmp$X+L");
        park.User user3 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.removeUser(user3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot assign field \"validationStatus\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        park.Manager manager2 = new park.Manager("k}m_oq1I\")]3", "mEhS?)?fIW}|");
        boolean boolean4 = manager2.validateUser("H/@,9x0[6rxt");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        park.Manager manager2 = new park.Manager("OZSv^IXld&Ei", "mEhS?)?fIW}|");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getPassword();
        java.lang.String str4 = manager2.getPassword();
        java.lang.String str5 = manager2.getName();
        java.lang.String str6 = manager2.getPassword();
        boolean boolean8 = manager2.validateUser("79&=}-l>nFe2");
        java.lang.String str9 = manager2.generatePassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + ".7P8Ne%};B7{" + "'", str9, ".7P8Ne%};B7{");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getPassword();
        java.lang.String str4 = manager2.generatePassword();
        java.lang.String str5 = manager2.getPassword();
        java.lang.Class<?> wildcardClass6 = manager2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5OGh8\\913o^W" + "'", str4, "5OGh8\\913o^W");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        park.Manager manager2 = new park.Manager("T8u[xH5+!Wk_", "");
        java.lang.String str3 = manager2.generatePassword();
        park.User user4 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.removeUser(user4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot assign field \"validationStatus\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "%h|RkyT4%u_K" + "'", str3, "%h|RkyT4%u_K");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        park.Manager manager2 = new park.Manager("", "");
        java.lang.String str3 = manager2.getName();
        java.lang.String str4 = manager2.getName();
        boolean boolean6 = manager2.validateUser("!9F3r+a$Osu4");
        boolean boolean8 = manager2.validateUser("hi!");
        java.lang.String str9 = manager2.getName();
        java.lang.String str10 = manager2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        park.Manager manager2 = new park.Manager("", "");
        java.lang.String str3 = manager2.getName();
        java.lang.String str4 = manager2.getName();
        boolean boolean6 = manager2.validateUser("!9F3r+a$Osu4");
        boolean boolean8 = manager2.validateUser("hi!");
        java.lang.String str9 = manager2.getName();
        park.User user10 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.addUser(user10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"park.User.getValidationStatus()\" because \"u\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getName();
        java.lang.String str4 = manager2.getPassword();
        boolean boolean6 = manager2.validateUser("");
        java.lang.Class<?> wildcardClass7 = manager2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        park.Manager manager2 = new park.Manager("GW)U<MkKkV\"|", "Qq\"YzZfcV}<w");
        boolean boolean4 = manager2.validateUser("");
        park.User user5 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.removeUser(user5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot assign field \"validationStatus\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        park.Manager manager2 = new park.Manager("", "T8u[xH5+!Wk_");
        java.lang.String str3 = manager2.getPassword();
        park.User user4 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.removeUser(user4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot assign field \"validationStatus\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "T8u[xH5+!Wk_" + "'", str3, "T8u[xH5+!Wk_");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        park.Manager manager2 = new park.Manager("H/@,9x0[6rxt", "mEhS?)?fIW}|");
        java.lang.String str3 = manager2.generatePassword();
        java.lang.String str4 = manager2.getPassword();
        java.lang.String str5 = manager2.getName();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\Ifk?^,%^ST$" + "'", str3, "\\Ifk?^,%^ST$");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mEhS?)?fIW}|" + "'", str4, "mEhS?)?fIW}|");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H/@,9x0[6rxt" + "'", str5, "H/@,9x0[6rxt");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        park.Manager manager2 = new park.Manager("1x}DkGj&g^\"g", "");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        park.Manager manager2 = new park.Manager("k}m_oq1I\")]3", "mEhS?)?fIW}|");
        java.lang.Class<?> wildcardClass3 = manager2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        park.Manager manager2 = new park.Manager("!9F3r+a$Osu4", "<5j0vDyVq%6f");
        park.User user3 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.removeUser(user3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot assign field \"validationStatus\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        park.Manager manager2 = new park.Manager("z/y\\:f$%XU]4", "h9PqEu26kQNY");
        java.lang.Class<?> wildcardClass3 = manager2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        park.Manager manager2 = new park.Manager("", "hi!");
        park.User user3 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.removeUser(user3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot assign field \"validationStatus\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        park.Manager manager2 = new park.Manager("", "");
        java.lang.String str3 = manager2.getName();
        java.lang.String str4 = manager2.getName();
        park.User user5 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.removeUser(user5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot assign field \"validationStatus\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getPassword();
        java.lang.String str4 = manager2.getPassword();
        java.lang.String str5 = manager2.generatePassword();
        java.lang.String str6 = manager2.getPassword();
        java.lang.String str7 = manager2.getPassword();
        java.lang.String str8 = manager2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "l.[.]c$-@xs:" + "'", str5, "l.[.]c$-@xs:");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        park.Manager manager2 = new park.Manager("3}F_u),J+1Q+", "");
        java.lang.String str3 = manager2.getName();
        park.User user4 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.removeUser(user4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot assign field \"validationStatus\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3}F_u),J+1Q+" + "'", str3, "3}F_u),J+1Q+");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        park.Manager manager2 = new park.Manager("T8u[xH5+!Wk_", "rFi[b77f[;:j");
        java.lang.String str3 = manager2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "T8u[xH5+!Wk_" + "'", str3, "T8u[xH5+!Wk_");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getPassword();
        java.lang.String str4 = manager2.getPassword();
        java.lang.String str5 = manager2.generatePassword();
        java.lang.String str6 = manager2.generatePassword();
        boolean boolean8 = manager2.validateUser("@G!A2t0.do;9");
        boolean boolean10 = manager2.validateUser("GW)U<MkKkV\"|");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "zV30E%&?+cQm" + "'", str5, "zV30E%&?+cQm");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + ">_|kv/-f]2uA" + "'", str6, ">_|kv/-f]2uA");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        park.Manager manager2 = new park.Manager("_za<PrGJq!$h", "\\At58_|z@U?r");
        java.lang.String str3 = manager2.getPassword();
        boolean boolean5 = manager2.validateUser("hi!");
        java.lang.String str6 = manager2.getName();
        java.lang.String str7 = manager2.getName();
        java.lang.String str8 = manager2.generatePassword();
        park.User user9 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.addUser(user9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"park.User.getValidationStatus()\" because \"u\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\At58_|z@U?r" + "'", str3, "\\At58_|z@U?r");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_za<PrGJq!$h" + "'", str6, "_za<PrGJq!$h");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_za<PrGJq!$h" + "'", str7, "_za<PrGJq!$h");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "T?+b4[,cU,iV" + "'", str8, "T?+b4[,cU,iV");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        park.Manager manager2 = new park.Manager("<5j0vDyVq%6f", "T8u[xH5+!Wk_");
        park.User user3 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.addUser(user3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"park.User.getValidationStatus()\" because \"u\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getPassword();
        java.lang.String str4 = manager2.getPassword();
        java.lang.String str5 = manager2.generatePassword();
        boolean boolean7 = manager2.validateUser("}/tU=\"ZM^le4");
        java.lang.String str8 = manager2.generatePassword();
        java.lang.Class<?> wildcardClass9 = manager2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "jj&8%K6,X1qV" + "'", str5, "jj&8%K6,X1qV");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "x7],IGcn4JVl" + "'", str8, "x7],IGcn4JVl");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getPassword();
        java.lang.String str4 = manager2.getPassword();
        java.lang.String str5 = manager2.generatePassword();
        boolean boolean7 = manager2.validateUser("}/tU=\"ZM^le4");
        java.lang.Class<?> wildcardClass8 = manager2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "{w9txA;wGS-g" + "'", str5, "{w9txA;wGS-g");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getPassword();
        java.lang.String str4 = manager2.generatePassword();
        java.lang.String str5 = manager2.getPassword();
        java.lang.String str6 = manager2.generatePassword();
        java.lang.String str7 = manager2.getPassword();
        park.User user8 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.removeUser(user8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot assign field \"validationStatus\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "B1[r/dRCAoD&" + "'", str4, "B1[r/dRCAoD&");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/iuqh09S6Aq0" + "'", str6, "/iuqh09S6Aq0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        park.Manager manager2 = new park.Manager("Gyii\\nOcj>v[", "Gyii\\nOcj>v[");
        java.lang.String str3 = manager2.getPassword();
        park.User user4 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.addUser(user4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"park.User.getValidationStatus()\" because \"u\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Gyii\\nOcj>v[" + "'", str3, "Gyii\\nOcj>v[");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getName();
        java.lang.String str4 = manager2.getPassword();
        java.lang.String str5 = manager2.generatePassword();
        java.lang.String str6 = manager2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#gHiwgQ]OzY%" + "'", str5, "#gHiwgQ]OzY%");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        park.Manager manager2 = new park.Manager("jj&8%K6,X1qV", "^|$0-!nxn9t6");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getPassword();
        java.lang.String str4 = manager2.generatePassword();
        java.lang.String str5 = manager2.getName();
        boolean boolean7 = manager2.validateUser("79&=}-l>nFe2");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "gRL78$8)b<<h" + "'", str4, "gRL78$8)b<<h");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        park.Manager manager2 = new park.Manager("", "");
        boolean boolean4 = manager2.validateUser("");
        java.lang.String str5 = manager2.getName();
        boolean boolean7 = manager2.validateUser("hi!");
        boolean boolean9 = manager2.validateUser("_za<PrGJq!$h");
        java.lang.Class<?> wildcardClass10 = manager2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        park.Manager manager2 = new park.Manager("", "");
        java.lang.String str3 = manager2.getName();
        java.lang.String str4 = manager2.getName();
        boolean boolean6 = manager2.validateUser("!9F3r+a$Osu4");
        boolean boolean8 = manager2.validateUser("hi!");
        java.lang.String str9 = manager2.generatePassword();
        park.User user10 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.addUser(user10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"park.User.getValidationStatus()\" because \"u\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "QTnfMukg<ll4" + "'", str9, "QTnfMukg<ll4");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        park.Manager manager0 = new park.Manager();
        java.lang.String str1 = manager0.generatePassword();
        java.lang.String str2 = manager0.getPassword();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UX[e3Vbd(IKW" + "'", str1, "UX[e3Vbd(IKW");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "l0QOecbIos7\\" + "'", str2, "l0QOecbIos7\\");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getPassword();
        java.lang.String str4 = manager2.generatePassword();
        java.lang.String str5 = manager2.getPassword();
        java.lang.String str6 = manager2.generatePassword();
        java.lang.String str7 = manager2.getPassword();
        boolean boolean9 = manager2.validateUser(":$OYdEcbnoi=");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + ";ePf*IY;xo@t" + "'", str4, ";ePf*IY;xo@t");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PvuV\\7yAIQw5" + "'", str6, "PvuV\\7yAIQw5");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        park.Manager manager2 = new park.Manager("H/@,9x0[6rxt", "3}F_u),J+1Q+");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getName();
        java.lang.String str4 = manager2.getName();
        java.lang.String str5 = manager2.generatePassword();
        java.lang.String str6 = manager2.getName();
        park.User user7 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.removeUser(user7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot assign field \"validationStatus\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<W/}#D-n3a]v" + "'", str5, "<W/}#D-n3a]v");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        park.Manager manager2 = new park.Manager("", "k}m_oq1I\")]3");
        java.lang.String str3 = manager2.getPassword();
        java.lang.String str4 = manager2.generatePassword();
        java.lang.String str5 = manager2.generatePassword();
        boolean boolean7 = manager2.validateUser("_za<PrGJq!$h");
        java.lang.Class<?> wildcardClass8 = manager2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "k}m_oq1I\")]3" + "'", str3, "k}m_oq1I\")]3");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "vi<%WXOZrkE*" + "'", str4, "vi<%WXOZrkE*");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "A7bD0c8G\\MD1" + "'", str5, "A7bD0c8G\\MD1");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        park.Manager manager2 = new park.Manager("tzvk.xJS[lgX", "o7F<^7PbbroF");
        park.User user3 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.removeUser(user3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot assign field \"validationStatus\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        park.Manager manager2 = new park.Manager("%u-;)9s>XK#;", "-,\".??K%a=yf");
        java.lang.Class<?> wildcardClass3 = manager2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        park.Manager manager2 = new park.Manager("H/@,9x0[6rxt", "mEhS?)?fIW}|");
        java.lang.String str3 = manager2.generatePassword();
        java.lang.String str4 = manager2.getPassword();
        java.lang.String str5 = manager2.getPassword();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-FK2#Vu?zwsH" + "'", str3, "-FK2#Vu?zwsH");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mEhS?)?fIW}|" + "'", str4, "mEhS?)?fIW}|");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "mEhS?)?fIW}|" + "'", str5, "mEhS?)?fIW}|");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getPassword();
        java.lang.String str4 = manager2.getName();
        java.lang.String str5 = manager2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        park.Manager manager2 = new park.Manager("D4lO%x}j]<c9", "b1|3*Tmp$X+L");
        java.lang.String str3 = manager2.generatePassword();
        java.lang.String str4 = manager2.getName();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "}GwNSu6[1Hjk" + "'", str3, "}GwNSu6[1Hjk");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "D4lO%x}j]<c9" + "'", str4, "D4lO%x}j]<c9");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        park.Manager manager0 = new park.Manager();
        java.lang.String str1 = manager0.generatePassword();
        boolean boolean3 = manager0.validateUser("K?KP%[GzFp>V");
        java.lang.String str4 = manager0.getPassword();
        park.User user5 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager0.removeUser(user5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot assign field \"validationStatus\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\\\@SS6[{(|%&" + "'", str1, "\\\\@SS6[{(|%&");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "qOSsx)1\\JVOv" + "'", str4, "qOSsx)1\\JVOv");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        park.Manager manager2 = new park.Manager("_za<PrGJq!$h", "\\At58_|z@U?r");
        java.lang.String str3 = manager2.getPassword();
        boolean boolean5 = manager2.validateUser("hi!");
        java.lang.String str6 = manager2.getName();
        java.lang.String str7 = manager2.generatePassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\At58_|z@U?r" + "'", str3, "\\At58_|z@U?r");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_za<PrGJq!$h" + "'", str6, "_za<PrGJq!$h");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "wZqA%u:x9[PZ" + "'", str7, "wZqA%u:x9[PZ");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        park.Manager manager2 = new park.Manager("", "k}m_oq1I\")]3");
        java.lang.String str3 = manager2.getPassword();
        java.lang.String str4 = manager2.generatePassword();
        java.lang.String str5 = manager2.generatePassword();
        boolean boolean7 = manager2.validateUser("gRL78$8)b<<h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "k}m_oq1I\")]3" + "'", str3, "k}m_oq1I\")]3");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Mh2>%-=v!gWF" + "'", str4, "Mh2>%-=v!gWF");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "8J1$cr0sEf,v" + "'", str5, "8J1$cr0sEf,v");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getName();
        java.lang.String str4 = manager2.getPassword();
        boolean boolean6 = manager2.validateUser("gRL78$8)b<<h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        park.Manager manager2 = new park.Manager("_za<PrGJq!$h", "\\At58_|z@U?r");
        java.lang.String str3 = manager2.getPassword();
        boolean boolean5 = manager2.validateUser("hi!");
        java.lang.String str6 = manager2.getName();
        java.lang.String str7 = manager2.getName();
        java.lang.String str8 = manager2.getName();
        java.lang.String str9 = manager2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\At58_|z@U?r" + "'", str3, "\\At58_|z@U?r");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_za<PrGJq!$h" + "'", str6, "_za<PrGJq!$h");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_za<PrGJq!$h" + "'", str7, "_za<PrGJq!$h");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_za<PrGJq!$h" + "'", str8, "_za<PrGJq!$h");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_za<PrGJq!$h" + "'", str9, "_za<PrGJq!$h");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        park.Manager manager2 = new park.Manager("<5j0vDyVq%6f", "^|$0-!nxn9t6");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        park.Manager manager2 = new park.Manager("T8u[xH5+!Wk_", "79&=}-l>nFe2");
        java.lang.String str3 = manager2.generatePassword();
        java.lang.Class<?> wildcardClass4 = manager2.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".l-{b-ATD1EO" + "'", str3, ".l-{b-ATD1EO");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        park.Manager manager2 = new park.Manager("_za<PrGJq!$h", "K?KP%[GzFp>V");
        java.lang.String str3 = manager2.generatePassword();
        java.lang.String str4 = manager2.generatePassword();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3HNf(X,Txbaj" + "'", str3, "3HNf(X,Txbaj");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4+v@GA2#6Rs*" + "'", str4, "4+v@GA2#6Rs*");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getPassword();
        java.lang.String str4 = manager2.generatePassword();
        java.lang.String str5 = manager2.getName();
        java.lang.String str6 = manager2.generatePassword();
        boolean boolean8 = manager2.validateUser("T[>{|+Sy=Im\"");
        park.User user9 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.removeUser(user9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot assign field \"validationStatus\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "86(6!z\\%=vru" + "'", str4, "86(6!z\\%=vru");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "%g:_n5rq[pcn" + "'", str6, "%g:_n5rq[pcn");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        park.Manager manager2 = new park.Manager("T8u[xH5+!Wk_", "");
        java.lang.String str3 = manager2.generatePassword();
        boolean boolean5 = manager2.validateUser("ntMJ6?\\lkL[0");
        park.User user6 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.addUser(user6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"park.User.getValidationStatus()\" because \"u\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4gOzIZR\\c$t[" + "'", str3, "4gOzIZR\\c$t[");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getPassword();
        java.lang.String str4 = manager2.getPassword();
        java.lang.String str5 = manager2.getName();
        java.lang.String str6 = manager2.getPassword();
        boolean boolean8 = manager2.validateUser("79&=}-l>nFe2");
        park.User user9 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.removeUser(user9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot assign field \"validationStatus\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        park.Manager manager2 = new park.Manager(";ehf5#SEZgHb", "");
        java.lang.String str3 = manager2.generatePassword();
        java.lang.Class<?> wildcardClass4 = manager2.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "X*G5p-**vDxS" + "'", str3, "X*G5p-**vDxS");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        park.Manager manager2 = new park.Manager("H/@,9x0[6rxt", "k}m_oq1I\")]3");
        java.lang.String str3 = manager2.getPassword();
        java.lang.String str4 = manager2.getName();
        park.User user5 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.addUser(user5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"park.User.getValidationStatus()\" because \"u\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "k}m_oq1I\")]3" + "'", str3, "k}m_oq1I\")]3");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H/@,9x0[6rxt" + "'", str4, "H/@,9x0[6rxt");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        park.Manager manager2 = new park.Manager("", "k}m_oq1I\")]3");
        java.lang.String str3 = manager2.getPassword();
        java.lang.String str4 = manager2.generatePassword();
        java.lang.Class<?> wildcardClass5 = manager2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "k}m_oq1I\")]3" + "'", str3, "k}m_oq1I\")]3");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PRy]1Cz{1wus" + "'", str4, "PRy]1Cz{1wus");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        park.Manager manager2 = new park.Manager("", "");
        boolean boolean4 = manager2.validateUser("");
        java.lang.String str5 = manager2.getPassword();
        boolean boolean7 = manager2.validateUser("j)fgwWZdY<^9");
        java.lang.String str8 = manager2.getPassword();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getPassword();
        java.lang.String str4 = manager2.generatePassword();
        java.lang.String str5 = manager2.getPassword();
        java.lang.String str6 = manager2.generatePassword();
        java.lang.String str7 = manager2.getPassword();
        boolean boolean9 = manager2.validateUser("o7F<^7PbbroF");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "|M4l,i8sm<|Y" + "'", str4, "|M4l,i8sm<|Y");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + ">(_>{N58w=qt" + "'", str6, ">(_>{N58w=qt");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getPassword();
        java.lang.String str4 = manager2.getPassword();
        java.lang.String str5 = manager2.getName();
        java.lang.String str6 = manager2.getPassword();
        java.lang.String str7 = manager2.getName();
        boolean boolean9 = manager2.validateUser("^|$0-!nxn9t6");
        java.lang.String str10 = manager2.generatePassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ug;mG\"/CeYfq" + "'", str10, "ug;mG\"/CeYfq");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        park.Manager manager2 = new park.Manager("j)fgwWZdY<^9", "Gyii\\nOcj>v[");
        park.User user3 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.addUser(user3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"park.User.getValidationStatus()\" because \"u\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getName();
        java.lang.String str4 = manager2.getPassword();
        java.lang.String str5 = manager2.getName();
        java.lang.Class<?> wildcardClass6 = manager2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        park.Manager manager2 = new park.Manager("K?KP%[GzFp>V", "bEeXiJ]Ye!*N");
        boolean boolean4 = manager2.validateUser("tdF^\"<y^Z;[d");
        boolean boolean6 = manager2.validateUser("P@%:f_nDq}[7");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        park.Manager manager2 = new park.Manager("<5j0vDyVq%6f", "z/y\\:f$%XU]4");
        park.User user3 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.removeUser(user3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot assign field \"validationStatus\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getPassword();
        java.lang.String str4 = manager2.generatePassword();
        java.lang.String str5 = manager2.getPassword();
        park.User user6 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.removeUser(user6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot assign field \"validationStatus\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "{s:[Qb!CE<O?" + "'", str4, "{s:[Qb!CE<O?");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        park.Manager manager2 = new park.Manager("Yjte7w9K\".Ag", "hi!");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        park.Manager manager2 = new park.Manager("", "");
        java.lang.String str3 = manager2.getPassword();
        java.lang.Class<?> wildcardClass4 = manager2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        park.Manager manager2 = new park.Manager("GW)U<MkKkV\"|", "Qq\"YzZfcV}<w");
        boolean boolean4 = manager2.validateUser("");
        java.lang.String str5 = manager2.generatePassword();
        java.lang.String str6 = manager2.getName();
        boolean boolean8 = manager2.validateUser("Q#\"AC|S6]<R^");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "S\"#YtOf83\\VH" + "'", str5, "S\"#YtOf83\\VH");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "GW)U<MkKkV\"|" + "'", str6, "GW)U<MkKkV\"|");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        park.Manager manager2 = new park.Manager("5OGh8\\913o^W", "D4lO%x}j]<c9");
        park.User user3 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.removeUser(user3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot assign field \"validationStatus\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getPassword();
        java.lang.String str4 = manager2.generatePassword();
        java.lang.String str5 = manager2.getName();
        java.lang.String str6 = manager2.generatePassword();
        java.lang.String str7 = manager2.getPassword();
        park.User user8 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.addUser(user8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"park.User.getValidationStatus()\" because \"u\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "8}6HyfiimhzX" + "'", str4, "8}6HyfiimhzX");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "yiVb{[69}BYk" + "'", str6, "yiVb{[69}BYk");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        park.Manager manager2 = new park.Manager("_za<PrGJq!$h", "\\At58_|z@U?r");
        java.lang.String str3 = manager2.getPassword();
        boolean boolean5 = manager2.validateUser("hi!");
        java.lang.String str6 = manager2.getName();
        java.lang.String str7 = manager2.getName();
        java.lang.String str8 = manager2.getName();
        java.lang.String str9 = manager2.generatePassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\At58_|z@U?r" + "'", str3, "\\At58_|z@U?r");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_za<PrGJq!$h" + "'", str6, "_za<PrGJq!$h");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_za<PrGJq!$h" + "'", str7, "_za<PrGJq!$h");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_za<PrGJq!$h" + "'", str8, "_za<PrGJq!$h");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "N>Mp;f[0yr{F" + "'", str9, "N>Mp;f[0yr{F");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getPassword();
        java.lang.String str4 = manager2.getPassword();
        java.lang.String str5 = manager2.getName();
        java.lang.String str6 = manager2.getName();
        park.User user7 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.removeUser(user7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot assign field \"validationStatus\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        park.Manager manager2 = new park.Manager("\\Ifk?^,%^ST$", "PRy]1Cz{1wus");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        park.Manager manager2 = new park.Manager("79&=}-l>nFe2", "Qq\"YzZfcV}<w");
        boolean boolean4 = manager2.validateUser("K+>nf_BKCY_^");
        java.lang.String str5 = manager2.getPassword();
        java.lang.String str6 = manager2.getPassword();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Qq\"YzZfcV}<w" + "'", str5, "Qq\"YzZfcV}<w");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Qq\"YzZfcV}<w" + "'", str6, "Qq\"YzZfcV}<w");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        park.Manager manager2 = new park.Manager("%u-;)9s>XK#;", "j)fgwWZdY<^9");
        java.lang.String str3 = manager2.getName();
        java.lang.String str4 = manager2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "%u-;)9s>XK#;" + "'", str3, "%u-;)9s>XK#;");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "%u-;)9s>XK#;" + "'", str4, "%u-;)9s>XK#;");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        park.Manager manager2 = new park.Manager("", "");
        java.lang.String str3 = manager2.getName();
        java.lang.String str4 = manager2.getName();
        java.lang.String str5 = manager2.generatePassword();
        java.lang.String str6 = manager2.getPassword();
        java.lang.String str7 = manager2.generatePassword();
        java.lang.Class<?> wildcardClass8 = manager2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Ua8*#B3JFIZ#" + "'", str5, "Ua8*#B3JFIZ#");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "?+IoGa}9Tt!i" + "'", str7, "?+IoGa}9Tt!i");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        park.Manager manager2 = new park.Manager("", "_za<PrGJq!$h");
        park.User user3 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.removeUser(user3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot assign field \"validationStatus\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        park.Manager manager2 = new park.Manager("", "");
        java.lang.String str3 = manager2.generatePassword();
        park.User user4 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.removeUser(user4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot assign field \"validationStatus\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "L(?z/\\x4$ywY" + "'", str3, "L(?z/\\x4$ywY");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        park.Manager manager2 = new park.Manager("T8u[xH5+!Wk_", "");
        java.lang.String str3 = manager2.generatePassword();
        java.lang.Class<?> wildcardClass4 = manager2.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I&[Ku%<E)gb$" + "'", str3, "I&[Ku%<E)gb$");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        park.Manager manager2 = new park.Manager("7,wg!Vg45p>o", "Lf)$ZDXz_29c");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        park.Manager manager2 = new park.Manager("", "T8u[xH5+!Wk_");
        java.lang.String str3 = manager2.getPassword();
        park.User user4 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.addUser(user4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"park.User.getValidationStatus()\" because \"u\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "T8u[xH5+!Wk_" + "'", str3, "T8u[xH5+!Wk_");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        park.Manager manager2 = new park.Manager("!9F3r+a$Osu4", "<5j0vDyVq%6f");
        java.lang.Class<?> wildcardClass3 = manager2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        park.Manager manager2 = new park.Manager("NeeoM<U7GDi!", "VD)rKq/2nzN&");
        java.lang.String str3 = manager2.generatePassword();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5#%3q7a\\ldBS" + "'", str3, "5#%3q7a\\ldBS");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        park.Manager manager2 = new park.Manager("", "@J,\\F{ED0M3u");
        java.lang.String str3 = manager2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        park.Manager manager2 = new park.Manager("C[gCA:xYk)N_", "");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getPassword();
        java.lang.String str4 = manager2.generatePassword();
        java.lang.String str5 = manager2.getPassword();
        java.lang.String str6 = manager2.getName();
        park.User user7 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.removeUser(user7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot assign field \"validationStatus\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "DWR4BiH&H-Y," + "'", str4, "DWR4BiH&H-Y,");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        park.Manager manager2 = new park.Manager("jVq0}L0:km3w", "^[dObWs(N}lJ");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        park.Manager manager2 = new park.Manager("k}m_oq1I\")]3", "hi!");
        java.lang.String str3 = manager2.getPassword();
        java.lang.String str4 = manager2.generatePassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        park.Manager manager2 = new park.Manager(";ePf*IY;xo@t", "^|$0-!nxn9t6");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        park.Manager manager2 = new park.Manager(";6*@iTrZ\\=V[", "");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        park.Manager manager2 = new park.Manager("GW)U<MkKkV\"|", "Qq\"YzZfcV}<w");
        boolean boolean4 = manager2.validateUser("");
        java.lang.String str5 = manager2.generatePassword();
        java.lang.String str6 = manager2.generatePassword();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "@jt4y[\"?KtqE" + "'", str5, "@jt4y[\"?KtqE");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "s]L.JvM>rh-3" + "'", str6, "s]L.JvM>rh-3");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getPassword();
        java.lang.String str4 = manager2.getPassword();
        java.lang.String str5 = manager2.generatePassword();
        java.lang.String str6 = manager2.getPassword();
        java.lang.String str7 = manager2.getPassword();
        java.lang.Class<?> wildcardClass8 = manager2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "=KmJD,BA.o@H" + "'", str5, "=KmJD,BA.o@H");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getPassword();
        java.lang.String str4 = manager2.getPassword();
        java.lang.String str5 = manager2.getName();
        java.lang.String str6 = manager2.getPassword();
        boolean boolean8 = manager2.validateUser("79&=}-l>nFe2");
        park.User user9 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.addUser(user9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"park.User.getValidationStatus()\" because \"u\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        park.Manager manager2 = new park.Manager("<5j0vDyVq%6f", "z/y\\:f$%XU]4");
        java.lang.Class<?> wildcardClass3 = manager2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        park.Manager manager2 = new park.Manager("T8u[xH5+!Wk_", "79&=}-l>nFe2");
        java.lang.String str3 = manager2.generatePassword();
        park.User user4 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.addUser(user4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"park.User.getValidationStatus()\" because \"u\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "?[$[9@W7Du\\\"" + "'", str3, "?[$[9@W7Du\\\"");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getPassword();
        java.lang.String str4 = manager2.getPassword();
        java.lang.String str5 = manager2.generatePassword();
        boolean boolean7 = manager2.validateUser("}/tU=\"ZM^le4");
        java.lang.String str8 = manager2.generatePassword();
        park.User user9 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.removeUser(user9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot assign field \"validationStatus\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Y6o4&dc\"P!-z" + "'", str5, "Y6o4&dc\"P!-z");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + ">xa4D\\MT0M?\\" + "'", str8, ">xa4D\\MT0M?\\");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        park.Manager manager2 = new park.Manager("P@%:f_nDq}[7", "");
        java.lang.String str3 = manager2.getPassword();
        park.User user4 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.removeUser(user4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot assign field \"validationStatus\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        park.Manager manager2 = new park.Manager(";ehf5#SEZgHb", "H/@,9x0[6rxt");
        java.lang.String str3 = manager2.getName();
        park.User user4 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.addUser(user4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"park.User.getValidationStatus()\" because \"u\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ";ehf5#SEZgHb" + "'", str3, ";ehf5#SEZgHb");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        park.Manager manager2 = new park.Manager("!9F3r+a$Osu4", ":ov_[D?[Bm#)");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        park.Manager manager2 = new park.Manager("GW)U<MkKkV\"|", "Qq\"YzZfcV}<w");
        boolean boolean4 = manager2.validateUser("");
        java.lang.String str5 = manager2.generatePassword();
        java.lang.String str6 = manager2.getName();
        java.lang.String str7 = manager2.getName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "g,(oS6\\BeF*8" + "'", str5, "g,(oS6\\BeF*8");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "GW)U<MkKkV\"|" + "'", str6, "GW)U<MkKkV\"|");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "GW)U<MkKkV\"|" + "'", str7, "GW)U<MkKkV\"|");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        park.Manager manager2 = new park.Manager("\"UAhe\"fMW.vh", "SqV6,/7Nz,!y");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        park.Manager manager2 = new park.Manager("Ry5wa?}QYL_q", "1x}DkGj&g^\"g");
        park.User user3 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.addUser(user3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"park.User.getValidationStatus()\" because \"u\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        park.Manager manager2 = new park.Manager("", "");
        boolean boolean4 = manager2.validateUser("");
        java.lang.String str5 = manager2.getPassword();
        boolean boolean7 = manager2.validateUser("j)fgwWZdY<^9");
        java.lang.String str8 = manager2.generatePassword();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "j9IHF(/&9j\"@" + "'", str8, "j9IHF(/&9j\"@");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getPassword();
        java.lang.String str4 = manager2.getPassword();
        boolean boolean6 = manager2.validateUser("H/@,9x0[6rxt");
        java.lang.String str7 = manager2.getName();
        java.lang.String str8 = manager2.generatePassword();
        java.lang.Class<?> wildcardClass9 = manager2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "kv#Q9LS%Lf2c" + "'", str8, "kv#Q9LS%Lf2c");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        park.Manager manager2 = new park.Manager("GW)U<MkKkV\"|", "Qq\"YzZfcV}<w");
        boolean boolean4 = manager2.validateUser("OZSv^IXld&Ei");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getName();
        java.lang.String str4 = manager2.getPassword();
        java.lang.String str5 = manager2.getName();
        java.lang.String str6 = manager2.getName();
        java.lang.String str7 = manager2.getName();
        java.lang.String str8 = manager2.getPassword();
        park.User user9 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.addUser(user9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"park.User.getValidationStatus()\" because \"u\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        park.Manager manager2 = new park.Manager("K?KP%[GzFp>V", "bEeXiJ]Ye!*N");
        java.lang.String str3 = manager2.getPassword();
        java.lang.String str4 = manager2.getPassword();
        java.lang.String str5 = manager2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "bEeXiJ]Ye!*N" + "'", str3, "bEeXiJ]Ye!*N");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "bEeXiJ]Ye!*N" + "'", str4, "bEeXiJ]Ye!*N");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "K?KP%[GzFp>V" + "'", str5, "K?KP%[GzFp>V");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        park.Manager manager2 = new park.Manager("K?KP%[GzFp>V", "bEeXiJ]Ye!*N");
        park.User user3 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.removeUser(user3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot assign field \"validationStatus\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        park.Manager manager2 = new park.Manager("ONJw$,JIf.7Q", "jVq0}L0:km3w");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        park.Manager manager2 = new park.Manager("GW)U<MkKkV\"|", "GW)U<MkKkV\"|");
        java.lang.String str3 = manager2.generatePassword();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "oW{\\rF11JF=+" + "'", str3, "oW{\\rF11JF=+");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        park.Manager manager2 = new park.Manager("H/@,9x0[6rxt", "k}m_oq1I\")]3");
        java.lang.String str3 = manager2.getPassword();
        java.lang.String str4 = manager2.getName();
        java.lang.String str5 = manager2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "k}m_oq1I\")]3" + "'", str3, "k}m_oq1I\")]3");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H/@,9x0[6rxt" + "'", str4, "H/@,9x0[6rxt");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "k}m_oq1I\")]3" + "'", str5, "k}m_oq1I\")]3");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getPassword();
        java.lang.String str4 = manager2.getPassword();
        java.lang.String str5 = manager2.getName();
        java.lang.String str6 = manager2.getPassword();
        java.lang.String str7 = manager2.getName();
        park.User user8 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.addUser(user8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"park.User.getValidationStatus()\" because \"u\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        park.Manager manager2 = new park.Manager("xcCsi]w<W|Z*", "-FK2#Vu?zwsH");
        java.lang.String str3 = manager2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-FK2#Vu?zwsH" + "'", str3, "-FK2#Vu?zwsH");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        park.Manager manager2 = new park.Manager("NeeoM<U7GDi!", "VD)rKq/2nzN&");
        park.User user3 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.addUser(user3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"park.User.getValidationStatus()\" because \"u\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        park.Manager manager2 = new park.Manager("\\At58_|z@U?r", "hi!");
        java.lang.Class<?> wildcardClass3 = manager2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        park.Manager manager0 = new park.Manager();
        java.lang.String str1 = manager0.generatePassword();
        boolean boolean3 = manager0.validateUser("K?KP%[GzFp>V");
        java.lang.String str4 = manager0.getPassword();
        java.lang.Class<?> wildcardClass5 = manager0.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "%:{Mz-tBylNv" + "'", str1, "%:{Mz-tBylNv");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + ">:\"_0%.a.VN/" + "'", str4, ">:\"_0%.a.VN/");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        park.Manager manager2 = new park.Manager("xcCsi]w<W|Z*", "-FK2#Vu?zwsH");
        park.User user3 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.addUser(user3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"park.User.getValidationStatus()\" because \"u\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getName();
        java.lang.String str4 = manager2.getPassword();
        boolean boolean6 = manager2.validateUser("");
        boolean boolean8 = manager2.validateUser("hi!");
        java.lang.String str9 = manager2.getName();
        boolean boolean11 = manager2.validateUser("\\Ifk?^,%^ST$");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        park.Manager manager2 = new park.Manager("j9IHF(/&9j\"@", "1J<gA16\\(txY");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getName();
        java.lang.String str4 = manager2.getPassword();
        boolean boolean6 = manager2.validateUser("");
        java.lang.String str7 = manager2.generatePassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "aHUnao#A#u=r" + "'", str7, "aHUnao#A#u=r");
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        boolean boolean4 = manager2.validateUser("_za<PrGJq!$h");
        park.User user5 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.addUser(user5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"park.User.getValidationStatus()\" because \"u\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        park.Manager manager2 = new park.Manager("k}m_oq1I\")]3", "mEhS?)?fIW}|");
        java.lang.String str3 = manager2.generatePassword();
        park.User user4 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.removeUser(user4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot assign field \"validationStatus\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "FwhB:Pi4;\\*h" + "'", str3, "FwhB:Pi4;\\*h");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        park.Manager manager2 = new park.Manager("T8u[xH5+!Wk_", "79&=}-l>nFe2");
        java.lang.String str3 = manager2.generatePassword();
        java.lang.String str4 = manager2.getName();
        java.lang.String str5 = manager2.generatePassword();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ie:])k7Blpq<" + "'", str3, "ie:])k7Blpq<");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "T8u[xH5+!Wk_" + "'", str4, "T8u[xH5+!Wk_");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "];{]L%ni?Ds3" + "'", str5, "];{]L%ni?Ds3");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        park.Manager manager0 = new park.Manager();
        java.lang.String str1 = manager0.generatePassword();
        boolean boolean3 = manager0.validateUser("K?KP%[GzFp>V");
        java.lang.String str4 = manager0.generatePassword();
        java.lang.String str5 = manager0.generatePassword();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "t#$zna=d/&}9" + "'", str1, "t#$zna=d/&}9");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-ntXc0RJG<8)" + "'", str4, "-ntXc0RJG<8)");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "N\\%,:M<.l8E^" + "'", str5, "N\\%,:M<.l8E^");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getPassword();
        java.lang.String str4 = manager2.getPassword();
        java.lang.String str5 = manager2.getName();
        java.lang.String str6 = manager2.getName();
        java.lang.String str7 = manager2.generatePassword();
        boolean boolean9 = manager2.validateUser("S\"#YtOf83\\VH");
        java.lang.Class<?> wildcardClass10 = manager2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "jJ.</dVqtO3;" + "'", str7, "jJ.</dVqtO3;");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        park.Manager manager2 = new park.Manager("jVq0}L0:km3w", "o__!K!_y4--6");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        park.Manager manager2 = new park.Manager("^[dObWs(N}lJ", "{w9txA;wGS-g");
        java.lang.String str3 = manager2.getName();
        boolean boolean5 = manager2.validateUser("mEhS?)?fIW}|");
        java.lang.Class<?> wildcardClass6 = manager2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "^[dObWs(N}lJ" + "'", str3, "^[dObWs(N}lJ");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        park.Manager manager2 = new park.Manager("j)fgwWZdY<^9", "Gyii\\nOcj>v[");
        java.lang.String str3 = manager2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Gyii\\nOcj>v[" + "'", str3, "Gyii\\nOcj>v[");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        park.Manager manager2 = new park.Manager("T[>{|+Sy=Im\"", "tzvk.xJS[lgX");
        java.lang.String str3 = manager2.getPassword();
        java.lang.String str4 = manager2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "tzvk.xJS[lgX" + "'", str3, "tzvk.xJS[lgX");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "tzvk.xJS[lgX" + "'", str4, "tzvk.xJS[lgX");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        park.Manager manager2 = new park.Manager("!9F3r+a$Osu4", "H/@,9x0[6rxt");
        java.lang.String str3 = manager2.generatePassword();
        java.lang.String str4 = manager2.getName();
        park.User user5 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.addUser(user5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"park.User.getValidationStatus()\" because \"u\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Y#AQ9X5;g4L(" + "'", str3, "Y#AQ9X5;g4L(");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!9F3r+a$Osu4" + "'", str4, "!9F3r+a$Osu4");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        park.Manager manager2 = new park.Manager("GW)U<MkKkV\"|", "Qq\"YzZfcV}<w");
        boolean boolean4 = manager2.validateUser("");
        java.lang.Class<?> wildcardClass5 = manager2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        park.Manager manager2 = new park.Manager("T[>{|+Sy=Im\"", "tzvk.xJS[lgX");
        java.lang.String str3 = manager2.getPassword();
        park.User user4 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.addUser(user4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"park.User.getValidationStatus()\" because \"u\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "tzvk.xJS[lgX" + "'", str3, "tzvk.xJS[lgX");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getPassword();
        java.lang.String str4 = manager2.generatePassword();
        java.lang.String str5 = manager2.getName();
        java.lang.String str6 = manager2.getPassword();
        java.lang.String str7 = manager2.getName();
        java.lang.String str8 = manager2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Ny^wc\"_ihFxJ" + "'", str4, "Ny^wc\"_ihFxJ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        park.Manager manager2 = new park.Manager("", "");
        java.lang.String str3 = manager2.getName();
        java.lang.String str4 = manager2.getName();
        java.lang.String str5 = manager2.generatePassword();
        java.lang.String str6 = manager2.getPassword();
        java.lang.String str7 = manager2.generatePassword();
        java.lang.String str8 = manager2.getPassword();
        java.lang.String str9 = manager2.generatePassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0d%A^/yJxh%p" + "'", str5, "0d%A^/yJxh%p");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "*[_NvsF<^%h&" + "'", str7, "*[_NvsF<^%h&");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "=47qF)7dy7&X" + "'", str9, "=47qF)7dy7&X");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        park.Manager manager2 = new park.Manager("b1|3*Tmp$X+L", "bEeXiJ]Ye!*N");
        java.lang.String str3 = manager2.generatePassword();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#kH(,XY1=-5|" + "'", str3, "#kH(,XY1=-5|");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        park.Manager manager2 = new park.Manager("!9F3r+a$Osu4", "H/@,9x0[6rxt");
        java.lang.String str3 = manager2.getPassword();
        boolean boolean5 = manager2.validateUser("Lf)$ZDXz_29c");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H/@,9x0[6rxt" + "'", str3, "H/@,9x0[6rxt");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        park.Manager manager2 = new park.Manager("T8u[xH5+!Wk_", "rFi[b77f[;:j");
        java.lang.Class<?> wildcardClass3 = manager2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        park.Manager manager2 = new park.Manager("j)fgwWZdY<^9", "Gyii\\nOcj>v[");
        park.User user3 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.removeUser(user3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot assign field \"validationStatus\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        park.Manager manager2 = new park.Manager("", "");
        java.lang.String str3 = manager2.getName();
        java.lang.String str4 = manager2.getName();
        boolean boolean6 = manager2.validateUser("!9F3r+a$Osu4");
        boolean boolean8 = manager2.validateUser(";u9S:4#CvyEg");
        park.User user9 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.addUser(user9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"park.User.getValidationStatus()\" because \"u\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getPassword();
        java.lang.String str4 = manager2.getPassword();
        boolean boolean6 = manager2.validateUser("H/@,9x0[6rxt");
        java.lang.String str7 = manager2.getName();
        java.lang.String str8 = manager2.generatePassword();
        park.User user9 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.removeUser(user9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot assign field \"validationStatus\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "wkZ@w]p!gCTc" + "'", str8, "wkZ@w]p!gCTc");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        park.Manager manager2 = new park.Manager("^[dObWs(N}lJ", "{w9txA;wGS-g");
        java.lang.String str3 = manager2.getName();
        java.lang.Class<?> wildcardClass4 = manager2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "^[dObWs(N}lJ" + "'", str3, "^[dObWs(N}lJ");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getPassword();
        java.lang.String str4 = manager2.getPassword();
        java.lang.String str5 = manager2.generatePassword();
        boolean boolean7 = manager2.validateUser("}/tU=\"ZM^le4");
        boolean boolean9 = manager2.validateUser("K@[<?7DRwF:V");
        java.lang.Class<?> wildcardClass10 = manager2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hch>\\B(Jy0}m" + "'", str5, "hch>\\B(Jy0}m");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        park.Manager manager2 = new park.Manager("79&=}-l>nFe2", "Qq\"YzZfcV}<w");
        boolean boolean4 = manager2.validateUser("K+>nf_BKCY_^");
        java.lang.String str5 = manager2.getName();
        boolean boolean7 = manager2.validateUser("mEhS?)?fIW}|");
        java.lang.String str8 = manager2.getPassword();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "79&=}-l>nFe2" + "'", str5, "79&=}-l>nFe2");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Qq\"YzZfcV}<w" + "'", str8, "Qq\"YzZfcV}<w");
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        park.Manager manager2 = new park.Manager("^|$0-!nxn9t6", "k}m_oq1I\")]3");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getPassword();
        java.lang.String str4 = manager2.getPassword();
        java.lang.String str5 = manager2.generatePassword();
        java.lang.String str6 = manager2.generatePassword();
        java.lang.String str7 = manager2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Y@@|Wq7b:.5l" + "'", str5, "Y@@|Wq7b:.5l");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hE:&E!\\?CR9&" + "'", str6, "hE:&E!\\?CR9&");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        park.Manager manager2 = new park.Manager("", "");
        java.lang.String str3 = manager2.getName();
        java.lang.String str4 = manager2.getName();
        java.lang.String str5 = manager2.getPassword();
        java.lang.Class<?> wildcardClass6 = manager2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        park.Manager manager2 = new park.Manager("k}m_oq1I\")]3", "mEhS?)?fIW}|");
        java.lang.String str3 = manager2.generatePassword();
        java.lang.String str4 = manager2.generatePassword();
        java.lang.String str5 = manager2.getPassword();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ql%j@*Q&C%Hc" + "'", str3, "Ql%j@*Q&C%Hc");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + ":#:#/vM$^>[5" + "'", str4, ":#:#/vM$^>[5");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "mEhS?)?fIW}|" + "'", str5, "mEhS?)?fIW}|");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        park.Manager manager2 = new park.Manager("#gHiwgQ]OzY%", "j9IHF(/&9j\"@");
        java.lang.String str3 = manager2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#gHiwgQ]OzY%" + "'", str3, "#gHiwgQ]OzY%");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        park.Manager manager2 = new park.Manager("N>Mp;f[0yr{F", "%u-;)9s>XK#;");
        park.User user3 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.addUser(user3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"park.User.getValidationStatus()\" because \"u\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        park.Manager manager2 = new park.Manager("!9F3r+a$Osu4", "<5j0vDyVq%6f");
        java.lang.String str3 = manager2.getPassword();
        java.lang.String str4 = manager2.getName();
        java.lang.String str5 = manager2.generatePassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<5j0vDyVq%6f" + "'", str3, "<5j0vDyVq%6f");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!9F3r+a$Osu4" + "'", str4, "!9F3r+a$Osu4");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SD5-nWwF#}Hf" + "'", str5, "SD5-nWwF#}Hf");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        park.Manager manager2 = new park.Manager("", "");
        java.lang.String str3 = manager2.getName();
        java.lang.String str4 = manager2.getName();
        java.lang.String str5 = manager2.generatePassword();
        java.lang.String str6 = manager2.getPassword();
        boolean boolean8 = manager2.validateUser("j)fgwWZdY<^9");
        java.lang.String str9 = manager2.getName();
        java.lang.String str10 = manager2.getPassword();
        park.User user11 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.addUser(user11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"park.User.getValidationStatus()\" because \"u\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "9wrzd>RJi3u\"" + "'", str5, "9wrzd>RJi3u\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        park.Manager manager2 = new park.Manager("aHUnao#A#u=r", "{w9txA;wGS-g");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getName();
        java.lang.String str4 = manager2.getPassword();
        boolean boolean6 = manager2.validateUser("");
        boolean boolean8 = manager2.validateUser("D4lO%x}j]<c9");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        park.Manager manager2 = new park.Manager("}\\6!DM}:}48u", "Lf)$ZDXz_29c");
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        park.Manager manager2 = new park.Manager("K?KP%[GzFp>V", "bEeXiJ]Ye!*N");
        java.lang.String str3 = manager2.getPassword();
        java.lang.String str4 = manager2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "bEeXiJ]Ye!*N" + "'", str3, "bEeXiJ]Ye!*N");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "K?KP%[GzFp>V" + "'", str4, "K?KP%[GzFp>V");
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        park.Manager manager2 = new park.Manager("zjvB)rc;]Ch2", "79&=}-l>nFe2");
        boolean boolean4 = manager2.validateUser("-FK2#Vu?zwsH");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        park.Manager manager2 = new park.Manager("T8u[xH5+!Wk_", "}/tU=\"ZM^le4");
        java.lang.String str3 = manager2.getName();
        java.lang.String str4 = manager2.generatePassword();
        boolean boolean6 = manager2.validateUser("Y@@|Wq7b:.5l");
        park.User user7 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.addUser(user7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"park.User.getValidationStatus()\" because \"u\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "T8u[xH5+!Wk_" + "'", str3, "T8u[xH5+!Wk_");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "&,X$t=\"=0b+U" + "'", str4, "&,X$t=\"=0b+U");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getName();
        java.lang.String str4 = manager2.getPassword();
        java.lang.String str5 = manager2.getName();
        park.User user6 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.removeUser(user6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot assign field \"validationStatus\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        park.Manager manager2 = new park.Manager(".l-{b-ATD1EO", "F64HYd+6bU7h");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        park.Manager manager2 = new park.Manager("j)fgwWZdY<^9", "Gyii\\nOcj>v[");
        java.lang.String str3 = manager2.generatePassword();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "&\"/iYUQ;0F1V" + "'", str3, "&\"/iYUQ;0F1V");
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getPassword();
        java.lang.String str4 = manager2.getPassword();
        java.lang.String str5 = manager2.generatePassword();
        java.lang.String str6 = manager2.generatePassword();
        java.lang.String str7 = manager2.generatePassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/wf^7Dqb7:\"Q" + "'", str6, "/wf^7Dqb7:\"Q");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[24OXeLmN+($" + "'", str7, "[24OXeLmN+($");
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        park.Manager manager2 = new park.Manager("Mh2>%-=v!gWF", "@J,\\F{ED0M3u");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getPassword();
        java.lang.String str4 = manager2.getPassword();
        java.lang.String str5 = manager2.getName();
        java.lang.String str6 = manager2.getName();
        java.lang.String str7 = manager2.generatePassword();
        boolean boolean9 = manager2.validateUser("S\"#YtOf83\\VH");
        java.lang.String str10 = manager2.generatePassword();
        java.lang.Class<?> wildcardClass11 = manager2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "uF+C#t%UJv1?" + "'", str7, "uF+C#t%UJv1?");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "38q#5Qfyg?|*" + "'", str10, "38q#5Qfyg?|*");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getName();
        java.lang.String str4 = manager2.getPassword();
        java.lang.String str5 = manager2.generatePassword();
        java.lang.String str6 = manager2.getName();
        park.User user7 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.removeUser(user7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot assign field \"validationStatus\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "oB1)r^{*n@[Q" + "'", str5, "oB1)r^{*n@[Q");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        park.Manager manager2 = new park.Manager("1J<gA16\\(txY", "VD)rKq/2nzN&");
        java.lang.String str3 = manager2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1J<gA16\\(txY" + "'", str3, "1J<gA16\\(txY");
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getPassword();
        java.lang.String str4 = manager2.getPassword();
        java.lang.String str5 = manager2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getName();
        java.lang.String str4 = manager2.getPassword();
        java.lang.String str5 = manager2.getName();
        java.lang.String str6 = manager2.getPassword();
        java.lang.String str7 = manager2.getPassword();
        park.User user8 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.removeUser(user8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot assign field \"validationStatus\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        park.Manager manager2 = new park.Manager("%u-;)9s>XK#;", "l0QOecbIos7\\");
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        park.Manager manager2 = new park.Manager("3}F_u),J+1Q+", "");
        park.User user3 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.removeUser(user3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot assign field \"validationStatus\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        park.Manager manager2 = new park.Manager("PRy]1Cz{1wus", "bEeXiJ]Ye!*N");
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        park.Manager manager2 = new park.Manager(";ehf5#SEZgHb", "");
        park.User user3 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.addUser(user3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"park.User.getValidationStatus()\" because \"u\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getPassword();
        java.lang.String str4 = manager2.getPassword();
        java.lang.String str5 = manager2.getName();
        java.lang.String str6 = manager2.getPassword();
        java.lang.String str7 = manager2.getName();
        boolean boolean9 = manager2.validateUser("^|$0-!nxn9t6");
        boolean boolean11 = manager2.validateUser(";u9S:4#CvyEg");
        boolean boolean13 = manager2.validateUser(";ePf*IY;xo@t");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        park.Manager manager2 = new park.Manager(";ehf5#SEZgHb", "H/@,9x0[6rxt");
        boolean boolean4 = manager2.validateUser("zV30E%&?+cQm");
        java.lang.String str5 = manager2.generatePassword();
        java.lang.String str6 = manager2.getName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+VAF${\")90xs" + "'", str5, "+VAF${\")90xs");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ";ehf5#SEZgHb" + "'", str6, ";ehf5#SEZgHb");
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        park.Manager manager2 = new park.Manager("%u-;)9s>XK#;", "P@%:f_nDq}[7");
        java.lang.String str3 = manager2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "%u-;)9s>XK#;" + "'", str3, "%u-;)9s>XK#;");
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getName();
        boolean boolean5 = manager2.validateUser("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        park.Manager manager0 = new park.Manager();
        java.lang.String str1 = manager0.generatePassword();
        boolean boolean3 = manager0.validateUser("K?KP%[GzFp>V");
        java.lang.String str4 = manager0.generatePassword();
        park.User user5 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager0.addUser(user5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"park.User.getValidationStatus()\" because \"u\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "F-KXBp\\v9:u." + "'", str1, "F-KXBp\\v9:u.");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "p$Zi1+iiGs/r" + "'", str4, "p$Zi1+iiGs/r");
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        park.Manager manager2 = new park.Manager("%u-;)9s>XK#;", "^H=EsH0F>R\\;");
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getName();
        java.lang.String str4 = manager2.getPassword();
        java.lang.String str5 = manager2.getName();
        java.lang.String str6 = manager2.getPassword();
        java.lang.String str7 = manager2.getPassword();
        java.lang.String str8 = manager2.getPassword();
        java.lang.Class<?> wildcardClass9 = manager2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        park.Manager manager2 = new park.Manager("", "_za<PrGJq!$h");
        java.lang.String str3 = manager2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_za<PrGJq!$h" + "'", str3, "_za<PrGJq!$h");
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        park.Manager manager2 = new park.Manager("", "k}m_oq1I\")]3");
        java.lang.String str3 = manager2.getPassword();
        boolean boolean5 = manager2.validateUser("zV30E%&?+cQm");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "k}m_oq1I\")]3" + "'", str3, "k}m_oq1I\")]3");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        park.Manager manager2 = new park.Manager("GW)U<MkKkV\"|", "GW)U<MkKkV\"|");
        java.lang.String str3 = manager2.getPassword();
        java.lang.String str4 = manager2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GW)U<MkKkV\"|" + "'", str3, "GW)U<MkKkV\"|");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GW)U<MkKkV\"|" + "'", str4, "GW)U<MkKkV\"|");
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        park.Manager manager2 = new park.Manager("?+IoGa}9Tt!i", "W}\\AyR*^$_M^");
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        park.Manager manager2 = new park.Manager("hi!", "hi!");
        java.lang.String str3 = manager2.getName();
        java.lang.String str4 = manager2.getPassword();
        java.lang.String str5 = manager2.getName();
        java.lang.String str6 = manager2.getPassword();
        java.lang.String str7 = manager2.getPassword();
        java.lang.String str8 = manager2.getPassword();
        park.User user9 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.removeUser(user9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot assign field \"validationStatus\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        park.Manager manager2 = new park.Manager("%u-;)9s>XK#;", "-,\".??K%a=yf");
        park.User user3 = null;
        // The following exception was thrown during execution in test generation
        try {
            manager2.removeUser(user3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot assign field \"validationStatus\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}
