package park;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest12 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        park.UserVerification userVerification0 = new park.UserVerification();
        park.UserVerification userVerification1 = new park.UserVerification();
        java.lang.String str2 = userVerification1.email;
        userVerification0.verifyUser((park.User) userVerification1);
        java.lang.String str4 = userVerification1.name;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.toString();
        userVerification0.validationStatus = true;
        java.lang.Class<?> wildcardClass4 = userVerification0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.setLiscensePlate("User [name=null, id=0, email=null, password=null]");
        userVerification0.setPassword("hi!");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        java.lang.String str2 = userVerification0.email;
        java.lang.String str3 = userVerification0.name;
        userVerification0.setName("hi!");
        java.lang.String str6 = userVerification0.name;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        park.UserVerification userVerification0 = new park.UserVerification();
        boolean boolean2 = userVerification0.isNoShow((int) ' ');
        double double3 = userVerification0.getDeposit();
        userVerification0.setLiscensePlate("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.name = "";
        park.UserVerification userVerification4 = new park.UserVerification();
        boolean boolean6 = userVerification4.isNoShow((int) ' ');
        userVerification0.verifyUser((park.User) userVerification4);
        java.lang.Class<?> wildcardClass8 = userVerification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        park.UserVerification userVerification0 = new park.UserVerification();
        boolean boolean2 = userVerification0.isNoShow((int) ' ');
        int int3 = userVerification0.costPerHour;
        userVerification0.validationStatus = false;
        java.lang.String str6 = userVerification0.liscensePlate;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.liscensePlate = "";
        java.lang.Class<?> wildcardClass4 = userVerification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        park.UserVerification userVerification0 = new park.UserVerification();
        boolean boolean2 = userVerification0.isNoShow((int) ' ');
        int int3 = userVerification0.costPerHour;
        userVerification0.email = "";
        userVerification0.id = (-1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.name = "";
        park.UserVerification userVerification4 = new park.UserVerification();
        boolean boolean6 = userVerification4.isNoShow((int) ' ');
        userVerification0.verifyUser((park.User) userVerification4);
        boolean boolean8 = userVerification4.getValidationStatus();
        boolean boolean9 = userVerification4.getValidationStatus();
        userVerification4.setId(0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        java.lang.String str2 = userVerification0.email;
        java.lang.String str3 = userVerification0.email;
        java.lang.String str4 = userVerification0.liscensePlate;
        userVerification0.liscensePlate = "User [name=null, id=0, email=null, password=null]";
        java.lang.String str7 = userVerification0.name;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        java.lang.String str2 = userVerification0.email;
        java.lang.String str3 = userVerification0.name;
        userVerification0.setPassword("");
        java.lang.String str6 = userVerification0.name;
        int int7 = userVerification0.getId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.toString();
        userVerification0.setId(0);
        userVerification0.liscensePlate = "User [name=null, id=0, email=null, password=null]";
        java.lang.Class<?> wildcardClass6 = userVerification0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        java.lang.String str2 = userVerification0.email;
        boolean boolean3 = userVerification0.getValidationStatus();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.name = "";
        park.UserVerification userVerification4 = new park.UserVerification();
        boolean boolean6 = userVerification4.isNoShow((int) ' ');
        userVerification0.verifyUser((park.User) userVerification4);
        java.lang.String str8 = userVerification4.getName();
        userVerification4.name = "User [name=null, id=0, email=null, password=null]";
        userVerification4.setEmail("hi!");
        boolean boolean13 = userVerification4.getValidationStatus();
        park.UserVerification userVerification14 = new park.UserVerification();
        boolean boolean16 = userVerification14.isNoShow((int) ' ');
        int int17 = userVerification14.costPerHour;
        userVerification14.email = "";
        userVerification14.id = (byte) -1;
        userVerification4.verifyUser((park.User) userVerification14);
        boolean boolean24 = userVerification4.isNoShow((int) (byte) 10);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        park.UserVerification userVerification0 = new park.UserVerification();
        userVerification0.id = (short) 1;
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        park.UserVerification userVerification0 = new park.UserVerification();
        park.UserVerification userVerification1 = new park.UserVerification();
        java.lang.String str2 = userVerification1.email;
        userVerification0.verifyUser((park.User) userVerification1);
        double double4 = userVerification1.getDeposit();
        java.lang.String str5 = userVerification1.password;
        java.lang.String str6 = userVerification1.liscensePlate;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        park.UserVerification userVerification0 = new park.UserVerification();
        boolean boolean2 = userVerification0.isNoShow((int) ' ');
        java.lang.String str3 = userVerification0.getLiscensePlate();
        userVerification0.name = "hi!";
        userVerification0.costPerHour = 100;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        java.lang.String str2 = userVerification0.email;
        java.lang.String str3 = userVerification0.name;
        userVerification0.setPassword("hi!");
        userVerification0.name = "";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.liscensePlate = "";
        java.lang.String str4 = userVerification0.toString();
        userVerification0.id = 0;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str4, "User [name=null, id=0, email=null, password=null]");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        java.lang.String str2 = userVerification0.email;
        java.lang.String str3 = userVerification0.name;
        userVerification0.setPassword("");
        java.lang.String str6 = userVerification0.getName();
        java.lang.String str7 = userVerification0.getLiscensePlate();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.toString();
        userVerification0.setId(0);
        userVerification0.liscensePlate = "User [name=null, id=0, email=null, password=null]";
        userVerification0.deposit = (byte) 1;
        java.lang.String str8 = userVerification0.password;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        java.lang.String str2 = userVerification0.email;
        boolean boolean3 = userVerification0.validationStatus;
        park.UserVerification userVerification4 = new park.UserVerification();
        boolean boolean6 = userVerification4.isNoShow((int) ' ');
        java.lang.String str7 = userVerification4.getLiscensePlate();
        java.lang.String str8 = userVerification4.name;
        userVerification0.verifyUser((park.User) userVerification4);
        userVerification0.setDeposit((double) (byte) -1);
        java.lang.String str12 = userVerification0.getLiscensePlate();
        boolean boolean13 = userVerification0.getValidationStatus();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        park.UserVerification userVerification0 = new park.UserVerification();
        boolean boolean2 = userVerification0.isNoShow((int) ' ');
        java.lang.String str3 = userVerification0.getLiscensePlate();
        userVerification0.liscensePlate = "";
        park.UserVerification userVerification6 = new park.UserVerification();
        java.lang.String str7 = userVerification6.email;
        userVerification0.verifyUser((park.User) userVerification6);
        userVerification0.name = "hi!";
        userVerification0.email = "User [name=null, id=0, email=null, password=null]";
        userVerification0.setValidationStatus(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        java.lang.String str2 = userVerification0.email;
        java.lang.String str3 = userVerification0.name;
        java.lang.String str4 = userVerification0.getName();
        java.lang.String str5 = userVerification0.password;
        userVerification0.setEmail("hi!");
        boolean boolean8 = userVerification0.validationStatus;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        java.lang.String str2 = userVerification0.email;
        boolean boolean3 = userVerification0.validationStatus;
        park.UserVerification userVerification4 = new park.UserVerification();
        java.lang.String str5 = userVerification4.email;
        userVerification4.name = "";
        park.UserVerification userVerification8 = new park.UserVerification();
        boolean boolean10 = userVerification8.isNoShow((int) ' ');
        userVerification4.verifyUser((park.User) userVerification8);
        boolean boolean12 = userVerification8.getValidationStatus();
        boolean boolean13 = userVerification8.getValidationStatus();
        userVerification0.verifyUser((park.User) userVerification8);
        userVerification0.setId(100);
        java.lang.String str17 = userVerification0.email;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.toString();
        userVerification0.setId(0);
        userVerification0.liscensePlate = "User [name=null, id=0, email=null, password=null]";
        userVerification0.deposit = 0L;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        java.lang.String str2 = userVerification0.email;
        java.lang.String str3 = userVerification0.name;
        userVerification0.setPassword("hi!");
        java.lang.String str6 = userVerification0.email;
        userVerification0.setPassword("hi!");
        userVerification0.password = "";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        java.lang.String str2 = userVerification0.email;
        java.lang.String str3 = userVerification0.name;
        userVerification0.setPassword("hi!");
        userVerification0.deposit = (-1.0f);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        boolean boolean2 = userVerification0.validationStatus;
        boolean boolean3 = userVerification0.getValidationStatus();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        park.UserVerification userVerification0 = new park.UserVerification();
        park.UserVerification userVerification1 = new park.UserVerification();
        java.lang.String str2 = userVerification1.email;
        userVerification0.verifyUser((park.User) userVerification1);
        userVerification0.setDeposit((double) (short) 1);
        int int6 = userVerification0.id;
        boolean boolean7 = userVerification0.getValidationStatus();
        userVerification0.costPerHour = (byte) 0;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        park.UserVerification userVerification0 = new park.UserVerification();
        park.UserVerification userVerification1 = new park.UserVerification();
        java.lang.String str2 = userVerification1.email;
        userVerification0.verifyUser((park.User) userVerification1);
        userVerification0.id = 'a';
        java.lang.String str6 = userVerification0.liscensePlate;
        java.lang.String str7 = userVerification0.password;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.name = "";
        park.UserVerification userVerification4 = new park.UserVerification();
        boolean boolean6 = userVerification4.isNoShow((int) ' ');
        userVerification0.verifyUser((park.User) userVerification4);
        java.lang.String str8 = userVerification4.getName();
        userVerification4.name = "User [name=null, id=0, email=null, password=null]";
        int int11 = userVerification4.id;
        double double12 = userVerification4.deposit;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.liscensePlate = "";
        double double4 = userVerification0.deposit;
        int int5 = userVerification0.costPerHour;
        java.lang.String str6 = userVerification0.liscensePlate;
        userVerification0.setId(10);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.liscensePlate = "";
        double double4 = userVerification0.deposit;
        userVerification0.setDeposit((double) 0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        park.UserVerification userVerification0 = new park.UserVerification();
        boolean boolean2 = userVerification0.isNoShow((int) ' ');
        int int3 = userVerification0.costPerHour;
        userVerification0.email = "";
        userVerification0.id = (byte) -1;
        java.lang.String str8 = userVerification0.getPassword();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        park.UserVerification userVerification0 = new park.UserVerification();
        boolean boolean2 = userVerification0.isNoShow((int) ' ');
        java.lang.String str3 = userVerification0.getLiscensePlate();
        userVerification0.liscensePlate = "";
        park.UserVerification userVerification6 = new park.UserVerification();
        java.lang.String str7 = userVerification6.email;
        userVerification0.verifyUser((park.User) userVerification6);
        userVerification0.name = "hi!";
        userVerification0.liscensePlate = "hi!";
        userVerification0.setLiscensePlate("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.toString();
        userVerification0.setId(0);
        userVerification0.liscensePlate = "User [name=null, id=0, email=null, password=null]";
        userVerification0.deposit = (byte) 1;
        java.lang.String str8 = userVerification0.getLiscensePlate();
        java.lang.Class<?> wildcardClass9 = userVerification0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str8, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        park.UserVerification userVerification0 = new park.UserVerification();
        park.UserVerification userVerification1 = new park.UserVerification();
        java.lang.String str2 = userVerification1.email;
        userVerification0.verifyUser((park.User) userVerification1);
        userVerification0.id = 'a';
        java.lang.String str6 = userVerification0.liscensePlate;
        userVerification0.email = "";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.name = "";
        park.UserVerification userVerification4 = new park.UserVerification();
        boolean boolean6 = userVerification4.isNoShow((int) ' ');
        userVerification0.verifyUser((park.User) userVerification4);
        userVerification4.costPerHour = (short) 100;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.name = "";
        park.UserVerification userVerification4 = new park.UserVerification();
        boolean boolean6 = userVerification4.isNoShow((int) ' ');
        userVerification0.verifyUser((park.User) userVerification4);
        java.lang.String str8 = userVerification4.getName();
        userVerification4.name = "User [name=null, id=0, email=null, password=null]";
        userVerification4.setEmail("User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        park.UserVerification userVerification0 = new park.UserVerification();
        boolean boolean2 = userVerification0.isNoShow((int) ' ');
        int int3 = userVerification0.costPerHour;
        userVerification0.setValidationStatus(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        java.lang.String str2 = userVerification0.email;
        boolean boolean3 = userVerification0.validationStatus;
        park.UserVerification userVerification4 = new park.UserVerification();
        boolean boolean6 = userVerification4.isNoShow((int) ' ');
        java.lang.String str7 = userVerification4.getLiscensePlate();
        java.lang.String str8 = userVerification4.name;
        userVerification0.verifyUser((park.User) userVerification4);
        java.lang.String str10 = userVerification4.name;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.name = "";
        java.lang.String str4 = userVerification0.getEmail();
        userVerification0.setName("User [name=null, id=0, email=null, password=null]");
        userVerification0.setLiscensePlate("User [name=null, id=0, email=null, password=null]");
        java.lang.Class<?> wildcardClass9 = userVerification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.toString();
        userVerification0.setId(0);
        java.lang.String str4 = userVerification0.password;
        java.lang.Class<?> wildcardClass5 = userVerification0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.costPerHour = ' ';
        double double4 = userVerification0.getDeposit();
        int int5 = userVerification0.costPerHour;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.liscensePlate = "";
        userVerification0.name = "hi!";
        userVerification0.password = "";
        userVerification0.setId((int) (byte) 1);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.liscensePlate = "";
        userVerification0.name = "hi!";
        userVerification0.setPassword("User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        park.UserVerification userVerification0 = new park.UserVerification();
        boolean boolean2 = userVerification0.isNoShow((int) ' ');
        userVerification0.email = "";
        userVerification0.setId(100);
        userVerification0.liscensePlate = "";
        java.lang.String str9 = userVerification0.getPassword();
        java.lang.String str10 = userVerification0.name;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.name = "";
        park.UserVerification userVerification4 = new park.UserVerification();
        boolean boolean6 = userVerification4.isNoShow((int) ' ');
        userVerification0.verifyUser((park.User) userVerification4);
        java.lang.String str8 = userVerification4.getName();
        userVerification4.name = "User [name=null, id=0, email=null, password=null]";
        userVerification4.setEmail("hi!");
        boolean boolean13 = userVerification4.getValidationStatus();
        userVerification4.setDeposit((double) (byte) 100);
        java.lang.String str16 = userVerification4.password;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        java.lang.String str2 = userVerification0.email;
        boolean boolean3 = userVerification0.validationStatus;
        int int4 = userVerification0.costPerHour;
        boolean boolean6 = userVerification0.isNoShow((int) '4');
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.toString();
        java.lang.String str2 = userVerification0.getEmail();
        userVerification0.setId((int) '4');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.name = "";
        java.lang.String str4 = userVerification0.getEmail();
        int int5 = userVerification0.getId();
        boolean boolean6 = userVerification0.getValidationStatus();
        boolean boolean7 = userVerification0.getValidationStatus();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        java.lang.String str2 = userVerification0.email;
        java.lang.String str3 = userVerification0.name;
        java.lang.String str4 = userVerification0.getName();
        java.lang.String str5 = userVerification0.password;
        java.lang.String str6 = userVerification0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str6, "User [name=null, id=0, email=null, password=null]");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.name = "";
        park.UserVerification userVerification4 = new park.UserVerification();
        boolean boolean6 = userVerification4.isNoShow((int) ' ');
        userVerification0.verifyUser((park.User) userVerification4);
        java.lang.String str8 = userVerification4.getName();
        userVerification4.name = "User [name=null, id=0, email=null, password=null]";
        int int11 = userVerification4.id;
        userVerification4.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.setLiscensePlate("User [name=null, id=0, email=null, password=null]");
        userVerification0.deposit = 1.0d;
        userVerification0.setPassword("hi!");
        userVerification0.costPerHour = '#';
        java.lang.String str10 = userVerification0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.toString();
        userVerification0.validationStatus = true;
        userVerification0.deposit = (byte) 100;
        double double6 = userVerification0.deposit;
        java.lang.String str7 = userVerification0.getLiscensePlate();
        java.lang.String str8 = userVerification0.name;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.toString();
        userVerification0.validationStatus = true;
        userVerification0.deposit = (byte) 100;
        java.lang.String str6 = userVerification0.name;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        java.lang.String str2 = userVerification0.email;
        java.lang.String str3 = userVerification0.email;
        java.lang.String str4 = userVerification0.liscensePlate;
        java.lang.String str5 = userVerification0.getLiscensePlate();
        userVerification0.setName("");
        userVerification0.setName("User [name=null, id=0, email=null, password=null]");
        userVerification0.setDeposit((double) 0L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.name = "";
        park.UserVerification userVerification4 = new park.UserVerification();
        boolean boolean6 = userVerification4.isNoShow((int) ' ');
        userVerification0.verifyUser((park.User) userVerification4);
        boolean boolean8 = userVerification4.getValidationStatus();
        boolean boolean10 = userVerification4.isNoShow((-1));
        userVerification4.setEmail("");
        java.lang.String str13 = userVerification4.name;
        userVerification4.password = "hi!";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.name = "";
        java.lang.String str4 = userVerification0.getEmail();
        userVerification0.id = '4';
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        java.lang.String str2 = userVerification0.email;
        java.lang.String str3 = userVerification0.name;
        java.lang.String str4 = userVerification0.getName();
        userVerification0.setDeposit((double) (short) 1);
        userVerification0.name = "";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.name = "";
        park.UserVerification userVerification4 = new park.UserVerification();
        boolean boolean6 = userVerification4.isNoShow((int) ' ');
        userVerification0.verifyUser((park.User) userVerification4);
        java.lang.String str8 = userVerification4.getName();
        userVerification4.name = "User [name=null, id=0, email=null, password=null]";
        userVerification4.setEmail("hi!");
        boolean boolean13 = userVerification4.getValidationStatus();
        park.UserVerification userVerification14 = new park.UserVerification();
        boolean boolean16 = userVerification14.isNoShow((int) ' ');
        int int17 = userVerification14.costPerHour;
        userVerification14.email = "";
        userVerification14.id = (byte) -1;
        userVerification4.verifyUser((park.User) userVerification14);
        java.lang.String str23 = userVerification4.name;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str23, "User [name=null, id=0, email=null, password=null]");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        park.UserVerification userVerification0 = new park.UserVerification();
        park.UserVerification userVerification1 = new park.UserVerification();
        java.lang.String str2 = userVerification1.email;
        userVerification0.verifyUser((park.User) userVerification1);
        userVerification1.setLiscensePlate("User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.getEmail();
        boolean boolean2 = userVerification0.getValidationStatus();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        park.UserVerification userVerification0 = new park.UserVerification();
        boolean boolean2 = userVerification0.isNoShow((int) ' ');
        userVerification0.email = "";
        userVerification0.setId(100);
        userVerification0.liscensePlate = "";
        userVerification0.setValidationStatus(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.setLiscensePlate("User [name=null, id=0, email=null, password=null]");
        userVerification0.deposit = 1.0d;
        userVerification0.setName("User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.name = "";
        park.UserVerification userVerification4 = new park.UserVerification();
        boolean boolean6 = userVerification4.isNoShow((int) ' ');
        userVerification0.verifyUser((park.User) userVerification4);
        userVerification0.password = "";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        java.lang.String str2 = userVerification0.email;
        java.lang.String str3 = userVerification0.name;
        java.lang.String str4 = userVerification0.getName();
        userVerification0.costPerHour = (byte) -1;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.setLiscensePlate("User [name=null, id=0, email=null, password=null]");
        userVerification0.deposit = 1.0d;
        java.lang.String str6 = userVerification0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.name = "";
        park.UserVerification userVerification4 = new park.UserVerification();
        boolean boolean6 = userVerification4.isNoShow((int) ' ');
        userVerification0.verifyUser((park.User) userVerification4);
        boolean boolean8 = userVerification0.getValidationStatus();
        int int9 = userVerification0.getId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        java.lang.String str2 = userVerification0.email;
        java.lang.String str3 = userVerification0.email;
        java.lang.String str4 = userVerification0.liscensePlate;
        userVerification0.liscensePlate = "User [name=null, id=0, email=null, password=null]";
        java.lang.String str7 = userVerification0.getPassword();
        boolean boolean8 = userVerification0.getValidationStatus();
        userVerification0.setEmail("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.name = "";
        park.UserVerification userVerification4 = new park.UserVerification();
        boolean boolean6 = userVerification4.isNoShow((int) ' ');
        userVerification0.verifyUser((park.User) userVerification4);
        java.lang.String str8 = userVerification4.getName();
        userVerification4.name = "User [name=null, id=0, email=null, password=null]";
        userVerification4.setEmail("hi!");
        boolean boolean13 = userVerification4.getValidationStatus();
        park.UserVerification userVerification14 = new park.UserVerification();
        boolean boolean16 = userVerification14.isNoShow((int) ' ');
        int int17 = userVerification14.costPerHour;
        userVerification14.email = "";
        userVerification14.id = (byte) -1;
        userVerification4.verifyUser((park.User) userVerification14);
        double double23 = userVerification4.getDeposit();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.setLiscensePlate("User [name=null, id=0, email=null, password=null]");
        userVerification0.id = (byte) 100;
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        java.lang.String str2 = userVerification0.email;
        java.lang.String str3 = userVerification0.email;
        java.lang.String str4 = userVerification0.liscensePlate;
        java.lang.String str5 = userVerification0.getName();
        userVerification0.setPassword("");
        userVerification0.password = "User [name=null, id=0, email=null, password=null]";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        park.UserVerification userVerification0 = new park.UserVerification();
        boolean boolean2 = userVerification0.isNoShow((int) ' ');
        java.lang.String str3 = userVerification0.getLiscensePlate();
        userVerification0.liscensePlate = "";
        park.UserVerification userVerification6 = new park.UserVerification();
        java.lang.String str7 = userVerification6.email;
        userVerification0.verifyUser((park.User) userVerification6);
        park.UserVerification userVerification9 = new park.UserVerification();
        userVerification6.verifyUser((park.User) userVerification9);
        userVerification9.setValidationStatus(true);
        userVerification9.setPassword("User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.name = "";
        java.lang.String str4 = userVerification0.getEmail();
        java.lang.String str5 = userVerification0.password;
        userVerification0.setPassword("User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        park.UserVerification userVerification0 = new park.UserVerification();
        park.UserVerification userVerification1 = new park.UserVerification();
        java.lang.String str2 = userVerification1.email;
        userVerification0.verifyUser((park.User) userVerification1);
        userVerification0.id = 'a';
        userVerification0.liscensePlate = "hi!";
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        java.lang.String str2 = userVerification0.email;
        java.lang.String str3 = userVerification0.name;
        userVerification0.setPassword("hi!");
        int int6 = userVerification0.costPerHour;
        int int7 = userVerification0.id;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.name = "";
        userVerification0.id = (byte) 10;
        userVerification0.costPerHour = ' ';
        userVerification0.id = (byte) 1;
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        park.UserVerification userVerification0 = new park.UserVerification();
        park.UserVerification userVerification1 = new park.UserVerification();
        java.lang.String str2 = userVerification1.email;
        userVerification0.verifyUser((park.User) userVerification1);
        userVerification0.liscensePlate = "hi!";
        java.lang.String str6 = userVerification0.getName();
        userVerification0.email = "";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.name = "";
        park.UserVerification userVerification4 = new park.UserVerification();
        boolean boolean6 = userVerification4.isNoShow((int) ' ');
        userVerification0.verifyUser((park.User) userVerification4);
        java.lang.String str8 = userVerification4.getName();
        userVerification4.setLiscensePlate("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        park.UserVerification userVerification0 = new park.UserVerification();
        boolean boolean2 = userVerification0.isNoShow((int) ' ');
        userVerification0.email = "";
        userVerification0.setId(100);
        userVerification0.liscensePlate = "";
        java.lang.String str9 = userVerification0.getPassword();
        userVerification0.validationStatus = true;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        java.lang.String str2 = userVerification0.email;
        boolean boolean3 = userVerification0.validationStatus;
        park.UserVerification userVerification4 = new park.UserVerification();
        boolean boolean6 = userVerification4.isNoShow((int) ' ');
        java.lang.String str7 = userVerification4.getLiscensePlate();
        java.lang.String str8 = userVerification4.name;
        userVerification0.verifyUser((park.User) userVerification4);
        userVerification4.setValidationStatus(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.toString();
        boolean boolean2 = userVerification0.getValidationStatus();
        java.lang.String str3 = userVerification0.name;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        park.UserVerification userVerification0 = new park.UserVerification();
        boolean boolean2 = userVerification0.isNoShow((int) ' ');
        java.lang.String str3 = userVerification0.getPassword();
        userVerification0.setLiscensePlate("User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.name = "";
        park.UserVerification userVerification4 = new park.UserVerification();
        boolean boolean6 = userVerification4.isNoShow((int) ' ');
        userVerification0.verifyUser((park.User) userVerification4);
        boolean boolean8 = userVerification0.getValidationStatus();
        userVerification0.liscensePlate = "User [name=null, id=0, email=null, password=null]";
        userVerification0.setValidationStatus(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        park.UserVerification userVerification0 = new park.UserVerification();
        boolean boolean2 = userVerification0.isNoShow((int) ' ');
        java.lang.String str3 = userVerification0.getLiscensePlate();
        userVerification0.liscensePlate = "";
        park.UserVerification userVerification6 = new park.UserVerification();
        java.lang.String str7 = userVerification6.email;
        userVerification0.verifyUser((park.User) userVerification6);
        userVerification0.name = "hi!";
        userVerification0.validationStatus = true;
        boolean boolean13 = userVerification0.getValidationStatus();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        java.lang.Class<?> wildcardClass2 = userVerification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.toString();
        userVerification0.setId(0);
        java.lang.String str4 = userVerification0.password;
        userVerification0.validationStatus = true;
        java.lang.Class<?> wildcardClass7 = userVerification0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.name = "";
        park.UserVerification userVerification4 = new park.UserVerification();
        boolean boolean6 = userVerification4.isNoShow((int) ' ');
        userVerification0.verifyUser((park.User) userVerification4);
        java.lang.String str8 = userVerification4.getName();
        userVerification4.name = "User [name=null, id=0, email=null, password=null]";
        userVerification4.setEmail("hi!");
        java.lang.String str13 = userVerification4.getName();
        java.lang.String str14 = userVerification4.liscensePlate;
        java.lang.String str15 = userVerification4.email;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str13, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.name = "";
        java.lang.String str4 = userVerification0.getEmail();
        int int5 = userVerification0.getId();
        boolean boolean6 = userVerification0.getValidationStatus();
        userVerification0.password = "";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        park.UserVerification userVerification0 = new park.UserVerification();
        park.UserVerification userVerification1 = new park.UserVerification();
        java.lang.String str2 = userVerification1.email;
        userVerification0.verifyUser((park.User) userVerification1);
        userVerification0.setDeposit((double) (short) 1);
        int int6 = userVerification0.id;
        userVerification0.setPassword("User [name=null, id=0, email=null, password=null]");
        userVerification0.name = "";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.name = "";
        java.lang.String str4 = userVerification0.getEmail();
        userVerification0.validationStatus = true;
        java.lang.String str7 = userVerification0.getLiscensePlate();
        userVerification0.validationStatus = true;
        java.lang.String str10 = userVerification0.getLiscensePlate();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.setLiscensePlate("User [name=null, id=0, email=null, password=null]");
        userVerification0.deposit = 1.0d;
        userVerification0.password = "hi!";
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.liscensePlate = "";
        java.lang.String str4 = userVerification0.getLiscensePlate();
        userVerification0.costPerHour = (short) 1;
        java.lang.String str7 = userVerification0.liscensePlate;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.toString();
        userVerification0.setId(0);
        userVerification0.setValidationStatus(true);
        userVerification0.validationStatus = false;
        userVerification0.liscensePlate = "hi!";
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        park.UserVerification userVerification0 = new park.UserVerification();
        boolean boolean2 = userVerification0.isNoShow((int) ' ');
        java.lang.String str3 = userVerification0.getLiscensePlate();
        userVerification0.liscensePlate = "";
        park.UserVerification userVerification6 = new park.UserVerification();
        java.lang.String str7 = userVerification6.email;
        userVerification0.verifyUser((park.User) userVerification6);
        java.lang.String str9 = userVerification6.email;
        userVerification6.setValidationStatus(true);
        java.lang.String str12 = userVerification6.getLiscensePlate();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        park.UserVerification userVerification0 = new park.UserVerification();
        boolean boolean2 = userVerification0.isNoShow((int) ' ');
        double double3 = userVerification0.getDeposit();
        userVerification0.liscensePlate = "User [name=null, id=0, email=null, password=null]";
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        java.lang.String str2 = userVerification0.email;
        java.lang.String str3 = userVerification0.email;
        java.lang.String str4 = userVerification0.liscensePlate;
        java.lang.String str5 = userVerification0.getName();
        userVerification0.setPassword("");
        java.lang.String str8 = userVerification0.name;
        java.lang.Class<?> wildcardClass9 = userVerification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        park.UserVerification userVerification0 = new park.UserVerification();
        boolean boolean2 = userVerification0.isNoShow((int) ' ');
        java.lang.String str3 = userVerification0.getLiscensePlate();
        userVerification0.liscensePlate = "";
        park.UserVerification userVerification6 = new park.UserVerification();
        java.lang.String str7 = userVerification6.email;
        userVerification0.verifyUser((park.User) userVerification6);
        userVerification0.name = "hi!";
        int int11 = userVerification0.getId();
        userVerification0.setId((int) (byte) 0);
        int int14 = userVerification0.id;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        park.UserVerification userVerification0 = new park.UserVerification();
        boolean boolean2 = userVerification0.isNoShow((int) ' ');
        java.lang.String str3 = userVerification0.getLiscensePlate();
        userVerification0.liscensePlate = "";
        park.UserVerification userVerification6 = new park.UserVerification();
        java.lang.String str7 = userVerification6.email;
        userVerification0.verifyUser((park.User) userVerification6);
        userVerification0.name = "hi!";
        int int11 = userVerification0.getId();
        userVerification0.setName("User [name=null, id=0, email=null, password=null]");
        userVerification0.setEmail("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.setLiscensePlate("User [name=null, id=0, email=null, password=null]");
        int int4 = userVerification0.id;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.toString();
        userVerification0.setId(0);
        userVerification0.liscensePlate = "User [name=null, id=0, email=null, password=null]";
        userVerification0.email = "hi!";
        double double8 = userVerification0.deposit;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.email = "hi!";
        double double4 = userVerification0.deposit;
        java.lang.Class<?> wildcardClass5 = userVerification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.name = "";
        java.lang.String str4 = userVerification0.getEmail();
        userVerification0.validationStatus = true;
        java.lang.String str7 = userVerification0.getLiscensePlate();
        userVerification0.setLiscensePlate("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        park.UserVerification userVerification0 = new park.UserVerification();
        park.UserVerification userVerification1 = new park.UserVerification();
        java.lang.String str2 = userVerification1.email;
        userVerification0.verifyUser((park.User) userVerification1);
        double double4 = userVerification1.getDeposit();
        java.lang.String str5 = userVerification1.password;
        userVerification1.costPerHour = (byte) -1;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.setLiscensePlate("User [name=null, id=0, email=null, password=null]");
        userVerification0.deposit = 1.0d;
        userVerification0.setPassword("hi!");
        userVerification0.email = "";
        userVerification0.setDeposit((double) 0L);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        park.UserVerification userVerification0 = new park.UserVerification();
        park.UserVerification userVerification1 = new park.UserVerification();
        java.lang.String str2 = userVerification1.email;
        userVerification0.verifyUser((park.User) userVerification1);
        boolean boolean5 = userVerification0.isNoShow(100);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.name = "";
        java.lang.String str4 = userVerification0.getEmail();
        int int5 = userVerification0.getId();
        boolean boolean6 = userVerification0.validationStatus;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        park.UserVerification userVerification0 = new park.UserVerification();
        boolean boolean2 = userVerification0.isNoShow((int) ' ');
        java.lang.String str3 = userVerification0.getLiscensePlate();
        userVerification0.liscensePlate = "";
        park.UserVerification userVerification6 = new park.UserVerification();
        java.lang.String str7 = userVerification6.email;
        userVerification0.verifyUser((park.User) userVerification6);
        double double9 = userVerification6.deposit;
        userVerification6.liscensePlate = "User [name=null, id=0, email=null, password=null]";
        userVerification6.setValidationStatus(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.name = "";
        java.lang.String str4 = userVerification0.getEmail();
        userVerification0.setName("User [name=null, id=0, email=null, password=null]");
        java.lang.String str7 = userVerification0.getLiscensePlate();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        java.lang.String str2 = userVerification0.email;
        java.lang.String str3 = userVerification0.name;
        java.lang.String str4 = userVerification0.getName();
        userVerification0.setDeposit((double) (short) 1);
        userVerification0.setValidationStatus(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        java.lang.String str2 = userVerification0.email;
        java.lang.String str3 = userVerification0.email;
        java.lang.String str4 = userVerification0.liscensePlate;
        double double5 = userVerification0.deposit;
        java.lang.String str6 = userVerification0.email;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        java.lang.String str2 = userVerification0.email;
        boolean boolean3 = userVerification0.validationStatus;
        park.UserVerification userVerification4 = new park.UserVerification();
        boolean boolean6 = userVerification4.isNoShow((int) ' ');
        java.lang.String str7 = userVerification4.getLiscensePlate();
        java.lang.String str8 = userVerification4.name;
        userVerification0.verifyUser((park.User) userVerification4);
        userVerification0.setDeposit((double) (byte) -1);
        java.lang.String str12 = userVerification0.getLiscensePlate();
        userVerification0.setId(0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.toString();
        boolean boolean2 = userVerification0.validationStatus;
        double double3 = userVerification0.deposit;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.name = "";
        park.UserVerification userVerification4 = new park.UserVerification();
        boolean boolean6 = userVerification4.isNoShow((int) ' ');
        userVerification0.verifyUser((park.User) userVerification4);
        double double8 = userVerification0.deposit;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.toString();
        userVerification0.setId(0);
        userVerification0.validationStatus = true;
        userVerification0.password = "";
        userVerification0.setEmail("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        java.lang.String str2 = userVerification0.email;
        java.lang.String str3 = userVerification0.name;
        userVerification0.setPassword("hi!");
        java.lang.String str6 = userVerification0.email;
        userVerification0.setPassword("hi!");
        userVerification0.setPassword("hi!");
        int int11 = userVerification0.id;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        park.UserVerification userVerification0 = new park.UserVerification();
        boolean boolean2 = userVerification0.isNoShow((int) ' ');
        java.lang.String str3 = userVerification0.getLiscensePlate();
        userVerification0.liscensePlate = "";
        java.lang.String str6 = userVerification0.toString();
        userVerification0.id = (byte) -1;
        boolean boolean9 = userVerification0.getValidationStatus();
        java.lang.String str10 = userVerification0.getName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str6, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        java.lang.String str2 = userVerification0.email;
        java.lang.String str3 = userVerification0.email;
        userVerification0.setDeposit(0.0d);
        int int6 = userVerification0.costPerHour;
        int int7 = userVerification0.costPerHour;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.costPerHour = ' ';
        double double4 = userVerification0.getDeposit();
        boolean boolean5 = userVerification0.getValidationStatus();
        userVerification0.validationStatus = true;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.liscensePlate = "";
        java.lang.String str4 = userVerification0.getLiscensePlate();
        userVerification0.costPerHour = (short) 1;
        int int7 = userVerification0.costPerHour;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        park.UserVerification userVerification0 = new park.UserVerification();
        boolean boolean2 = userVerification0.isNoShow((int) ' ');
        double double3 = userVerification0.getDeposit();
        java.lang.String str4 = userVerification0.email;
        boolean boolean6 = userVerification0.isNoShow((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        java.lang.String str2 = userVerification0.email;
        boolean boolean3 = userVerification0.validationStatus;
        park.UserVerification userVerification4 = new park.UserVerification();
        java.lang.String str5 = userVerification4.email;
        userVerification4.name = "";
        park.UserVerification userVerification8 = new park.UserVerification();
        boolean boolean10 = userVerification8.isNoShow((int) ' ');
        userVerification4.verifyUser((park.User) userVerification8);
        boolean boolean12 = userVerification8.getValidationStatus();
        boolean boolean13 = userVerification8.getValidationStatus();
        userVerification0.verifyUser((park.User) userVerification8);
        userVerification8.setDeposit((double) 1.0f);
        userVerification8.liscensePlate = "User [name=null, id=0, email=null, password=null]";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        park.UserVerification userVerification0 = new park.UserVerification();
        boolean boolean2 = userVerification0.isNoShow((int) ' ');
        int int3 = userVerification0.costPerHour;
        userVerification0.email = "";
        userVerification0.id = 0;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.toString();
        userVerification0.setId(0);
        userVerification0.liscensePlate = "User [name=null, id=0, email=null, password=null]";
        userVerification0.setPassword("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.name = "";
        java.lang.String str4 = userVerification0.getEmail();
        userVerification0.id = 0;
        java.lang.String str7 = userVerification0.email;
        java.lang.Class<?> wildcardClass8 = userVerification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        java.lang.String str2 = userVerification0.email;
        boolean boolean3 = userVerification0.validationStatus;
        park.UserVerification userVerification4 = new park.UserVerification();
        java.lang.String str5 = userVerification4.email;
        userVerification4.name = "";
        park.UserVerification userVerification8 = new park.UserVerification();
        boolean boolean10 = userVerification8.isNoShow((int) ' ');
        userVerification4.verifyUser((park.User) userVerification8);
        boolean boolean12 = userVerification8.getValidationStatus();
        boolean boolean13 = userVerification8.getValidationStatus();
        userVerification0.verifyUser((park.User) userVerification8);
        userVerification0.setId(100);
        java.lang.String str17 = userVerification0.name;
        java.lang.String str18 = userVerification0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        java.lang.String str2 = userVerification0.email;
        boolean boolean3 = userVerification0.validationStatus;
        park.UserVerification userVerification4 = new park.UserVerification();
        boolean boolean6 = userVerification4.isNoShow((int) ' ');
        java.lang.String str7 = userVerification4.getLiscensePlate();
        java.lang.String str8 = userVerification4.name;
        userVerification0.verifyUser((park.User) userVerification4);
        userVerification0.setDeposit((double) (byte) -1);
        double double12 = userVerification0.deposit;
        double double13 = userVerification0.getDeposit();
        userVerification0.setValidationStatus(true);
        java.lang.String str16 = userVerification0.getPassword();
        java.lang.String str17 = userVerification0.getLiscensePlate();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.toString();
        boolean boolean2 = userVerification0.validationStatus;
        java.lang.String str3 = userVerification0.email;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.liscensePlate = "";
        java.lang.String str4 = userVerification0.toString();
        int int5 = userVerification0.getId();
        userVerification0.name = "hi!";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str4, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.name = "";
        park.UserVerification userVerification4 = new park.UserVerification();
        boolean boolean6 = userVerification4.isNoShow((int) ' ');
        userVerification0.verifyUser((park.User) userVerification4);
        java.lang.String str8 = userVerification4.getName();
        java.lang.String str9 = userVerification4.getName();
        park.UserVerification userVerification10 = new park.UserVerification();
        java.lang.String str11 = userVerification10.email;
        java.lang.String str12 = userVerification10.email;
        java.lang.String str13 = userVerification10.name;
        userVerification4.verifyUser((park.User) userVerification10);
        double double15 = userVerification4.deposit;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        park.UserVerification userVerification0 = new park.UserVerification();
        boolean boolean2 = userVerification0.isNoShow((int) ' ');
        java.lang.String str3 = userVerification0.getLiscensePlate();
        userVerification0.liscensePlate = "";
        park.UserVerification userVerification6 = new park.UserVerification();
        java.lang.String str7 = userVerification6.email;
        userVerification0.verifyUser((park.User) userVerification6);
        userVerification0.name = "hi!";
        int int11 = userVerification0.getId();
        userVerification0.setId((int) (byte) 0);
        boolean boolean14 = userVerification0.getValidationStatus();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.name = "";
        park.UserVerification userVerification4 = new park.UserVerification();
        boolean boolean6 = userVerification4.isNoShow((int) ' ');
        userVerification0.verifyUser((park.User) userVerification4);
        java.lang.String str8 = userVerification4.getName();
        userVerification4.name = "User [name=null, id=0, email=null, password=null]";
        java.lang.String str11 = userVerification4.getEmail();
        userVerification4.setLiscensePlate("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        park.UserVerification userVerification0 = new park.UserVerification();
        boolean boolean2 = userVerification0.isNoShow((int) ' ');
        userVerification0.email = "";
        userVerification0.setId(100);
        userVerification0.liscensePlate = "";
        userVerification0.setId((-1));
        java.lang.String str11 = userVerification0.liscensePlate;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.name = "";
        park.UserVerification userVerification4 = new park.UserVerification();
        boolean boolean6 = userVerification4.isNoShow((int) ' ');
        userVerification0.verifyUser((park.User) userVerification4);
        java.lang.String str8 = userVerification4.getName();
        userVerification4.name = "User [name=null, id=0, email=null, password=null]";
        userVerification4.setEmail("hi!");
        boolean boolean13 = userVerification4.getValidationStatus();
        userVerification4.setId((int) 'a');
        userVerification4.setId(0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        park.UserVerification userVerification0 = new park.UserVerification();
        boolean boolean2 = userVerification0.isNoShow((int) ' ');
        userVerification0.email = "";
        userVerification0.setId(100);
        userVerification0.liscensePlate = "";
        java.lang.String str9 = userVerification0.getEmail();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.toString();
        userVerification0.setId(0);
        java.lang.String str4 = userVerification0.password;
        userVerification0.validationStatus = true;
        java.lang.String str7 = userVerification0.name;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.name = "";
        park.UserVerification userVerification4 = new park.UserVerification();
        boolean boolean6 = userVerification4.isNoShow((int) ' ');
        userVerification0.verifyUser((park.User) userVerification4);
        java.lang.String str8 = userVerification4.getName();
        userVerification4.name = "User [name=null, id=0, email=null, password=null]";
        int int11 = userVerification4.id;
        userVerification4.setPassword("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        boolean boolean2 = userVerification0.validationStatus;
        java.lang.String str3 = userVerification0.toString();
        java.lang.String str4 = userVerification0.getLiscensePlate();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str3, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        java.lang.String str2 = userVerification0.email;
        boolean boolean3 = userVerification0.validationStatus;
        userVerification0.email = "User [name=null, id=0, email=null, password=null]";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        java.lang.String str2 = userVerification0.email;
        boolean boolean3 = userVerification0.validationStatus;
        park.UserVerification userVerification4 = new park.UserVerification();
        java.lang.String str5 = userVerification4.email;
        userVerification4.name = "";
        park.UserVerification userVerification8 = new park.UserVerification();
        boolean boolean10 = userVerification8.isNoShow((int) ' ');
        userVerification4.verifyUser((park.User) userVerification8);
        boolean boolean12 = userVerification8.getValidationStatus();
        boolean boolean13 = userVerification8.getValidationStatus();
        userVerification0.verifyUser((park.User) userVerification8);
        userVerification8.setDeposit((double) 1.0f);
        java.lang.String str17 = userVerification8.name;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        park.UserVerification userVerification0 = new park.UserVerification();
        park.UserVerification userVerification1 = new park.UserVerification();
        java.lang.String str2 = userVerification1.email;
        userVerification0.verifyUser((park.User) userVerification1);
        userVerification0.setDeposit((double) (short) 1);
        int int6 = userVerification0.id;
        boolean boolean7 = userVerification0.getValidationStatus();
        park.UserVerification userVerification8 = new park.UserVerification();
        java.lang.String str9 = userVerification8.email;
        userVerification8.liscensePlate = "";
        java.lang.String str12 = userVerification8.toString();
        userVerification0.verifyUser((park.User) userVerification8);
        int int14 = userVerification0.id;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str12, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        park.UserVerification userVerification0 = new park.UserVerification();
        boolean boolean2 = userVerification0.isNoShow((int) ' ');
        java.lang.String str3 = userVerification0.getLiscensePlate();
        userVerification0.liscensePlate = "";
        park.UserVerification userVerification6 = new park.UserVerification();
        java.lang.String str7 = userVerification6.email;
        userVerification0.verifyUser((park.User) userVerification6);
        park.UserVerification userVerification9 = new park.UserVerification();
        userVerification6.verifyUser((park.User) userVerification9);
        userVerification9.setValidationStatus(true);
        userVerification9.setDeposit((double) 10L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        park.UserVerification userVerification0 = new park.UserVerification();
        park.UserVerification userVerification1 = new park.UserVerification();
        java.lang.String str2 = userVerification1.email;
        userVerification0.verifyUser((park.User) userVerification1);
        userVerification0.setDeposit((double) (short) 1);
        int int6 = userVerification0.id;
        userVerification0.name = "User [name=null, id=0, email=null, password=null]";
        java.lang.String str9 = userVerification0.name;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str9, "User [name=null, id=0, email=null, password=null]");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        park.UserVerification userVerification0 = new park.UserVerification();
        park.UserVerification userVerification1 = new park.UserVerification();
        java.lang.String str2 = userVerification1.email;
        userVerification0.verifyUser((park.User) userVerification1);
        double double4 = userVerification1.getDeposit();
        boolean boolean5 = userVerification1.validationStatus;
        java.lang.String str6 = userVerification1.toString();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str6, "User [name=null, id=0, email=null, password=null]");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        park.UserVerification userVerification0 = new park.UserVerification();
        boolean boolean2 = userVerification0.isNoShow((int) ' ');
        java.lang.String str3 = userVerification0.getLiscensePlate();
        java.lang.String str4 = userVerification0.name;
        java.lang.String str5 = userVerification0.liscensePlate;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.name = "";
        park.UserVerification userVerification4 = new park.UserVerification();
        boolean boolean6 = userVerification4.isNoShow((int) ' ');
        userVerification0.verifyUser((park.User) userVerification4);
        java.lang.String str8 = userVerification4.getName();
        userVerification4.name = "User [name=null, id=0, email=null, password=null]";
        userVerification4.setEmail("hi!");
        boolean boolean13 = userVerification4.getValidationStatus();
        int int14 = userVerification4.getId();
        java.lang.String str15 = userVerification4.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.liscensePlate = "";
        double double4 = userVerification0.deposit;
        int int5 = userVerification0.getId();
        int int6 = userVerification0.getId();
        java.lang.String str7 = userVerification0.password;
        java.lang.String str8 = userVerification0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.setLiscensePlate("User [name=null, id=0, email=null, password=null]");
        userVerification0.costPerHour = 0;
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.name = "";
        park.UserVerification userVerification4 = new park.UserVerification();
        boolean boolean6 = userVerification4.isNoShow((int) ' ');
        userVerification0.verifyUser((park.User) userVerification4);
        double double8 = userVerification0.getDeposit();
        userVerification0.costPerHour = (byte) -1;
        java.lang.Class<?> wildcardClass11 = userVerification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.name = "";
        park.UserVerification userVerification4 = new park.UserVerification();
        boolean boolean6 = userVerification4.isNoShow((int) ' ');
        userVerification0.verifyUser((park.User) userVerification4);
        boolean boolean8 = userVerification4.getValidationStatus();
        userVerification4.setLiscensePlate("hi!");
        userVerification4.setId((int) (byte) 100);
        userVerification4.name = "hi!";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.name = "";
        park.UserVerification userVerification4 = new park.UserVerification();
        boolean boolean6 = userVerification4.isNoShow((int) ' ');
        userVerification0.verifyUser((park.User) userVerification4);
        java.lang.String str8 = userVerification4.getName();
        userVerification4.name = "User [name=null, id=0, email=null, password=null]";
        userVerification4.setEmail("hi!");
        boolean boolean13 = userVerification4.getValidationStatus();
        userVerification4.setDeposit((double) (byte) 100);
        java.lang.String str16 = userVerification4.name;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str16, "User [name=null, id=0, email=null, password=null]");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        park.UserVerification userVerification0 = new park.UserVerification();
        boolean boolean2 = userVerification0.isNoShow((int) ' ');
        java.lang.String str3 = userVerification0.getLiscensePlate();
        userVerification0.liscensePlate = "";
        park.UserVerification userVerification6 = new park.UserVerification();
        java.lang.String str7 = userVerification6.email;
        userVerification0.verifyUser((park.User) userVerification6);
        park.UserVerification userVerification9 = new park.UserVerification();
        userVerification6.verifyUser((park.User) userVerification9);
        int int11 = userVerification9.id;
        userVerification9.password = "User [name=null, id=0, email=null, password=null]";
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        park.UserVerification userVerification0 = new park.UserVerification();
        boolean boolean2 = userVerification0.isNoShow((int) ' ');
        java.lang.String str3 = userVerification0.getLiscensePlate();
        userVerification0.liscensePlate = "";
        park.UserVerification userVerification6 = new park.UserVerification();
        java.lang.String str7 = userVerification6.email;
        userVerification0.verifyUser((park.User) userVerification6);
        java.lang.String str9 = userVerification6.email;
        userVerification6.setValidationStatus(true);
        double double12 = userVerification6.deposit;
        int int13 = userVerification6.costPerHour;
        userVerification6.deposit = 100L;
        userVerification6.deposit = 0;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.name = "";
        park.UserVerification userVerification4 = new park.UserVerification();
        boolean boolean6 = userVerification4.isNoShow((int) ' ');
        userVerification0.verifyUser((park.User) userVerification4);
        java.lang.String str8 = userVerification4.getName();
        userVerification4.name = "User [name=null, id=0, email=null, password=null]";
        userVerification4.setEmail("hi!");
        int int13 = userVerification4.costPerHour;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        park.UserVerification userVerification0 = new park.UserVerification();
        boolean boolean2 = userVerification0.isNoShow((int) ' ');
        java.lang.String str3 = userVerification0.getLiscensePlate();
        java.lang.String str4 = userVerification0.name;
        park.UserVerification userVerification5 = new park.UserVerification();
        boolean boolean7 = userVerification5.isNoShow((int) ' ');
        userVerification5.email = "";
        userVerification5.setId(100);
        userVerification5.liscensePlate = "";
        userVerification5.setId((-1));
        userVerification0.verifyUser((park.User) userVerification5);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.toString();
        java.lang.String str2 = userVerification0.getEmail();
        userVerification0.costPerHour = (short) 100;
        java.lang.String str5 = userVerification0.getEmail();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        java.lang.String str2 = userVerification0.email;
        java.lang.String str3 = userVerification0.email;
        java.lang.String str4 = userVerification0.liscensePlate;
        java.lang.String str5 = userVerification0.getName();
        java.lang.String str6 = userVerification0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.name = "";
        java.lang.String str4 = userVerification0.getEmail();
        userVerification0.validationStatus = true;
        userVerification0.deposit = 100.0f;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        java.lang.String str2 = userVerification0.email;
        java.lang.String str3 = userVerification0.email;
        java.lang.String str4 = userVerification0.liscensePlate;
        userVerification0.liscensePlate = "User [name=null, id=0, email=null, password=null]";
        java.lang.String str7 = userVerification0.getPassword();
        java.lang.String str8 = userVerification0.name;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.name = "";
        park.UserVerification userVerification4 = new park.UserVerification();
        boolean boolean6 = userVerification4.isNoShow((int) ' ');
        userVerification0.verifyUser((park.User) userVerification4);
        java.lang.String str8 = userVerification4.getName();
        userVerification4.name = "User [name=null, id=0, email=null, password=null]";
        userVerification4.setEmail("hi!");
        boolean boolean13 = userVerification4.getValidationStatus();
        int int14 = userVerification4.getId();
        userVerification4.setValidationStatus(false);
        boolean boolean18 = userVerification4.isNoShow((int) (short) 0);
        userVerification4.password = "";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.name = "";
        java.lang.String str4 = userVerification0.getEmail();
        userVerification0.setName("User [name=null, id=0, email=null, password=null]");
        userVerification0.setLiscensePlate("User [name=null, id=0, email=null, password=null]");
        boolean boolean9 = userVerification0.getValidationStatus();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.toString();
        java.lang.String str2 = userVerification0.getEmail();
        userVerification0.setEmail("hi!");
        userVerification0.email = "";
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.toString();
        java.lang.String str2 = userVerification0.getEmail();
        userVerification0.costPerHour = (short) 100;
        userVerification0.setId(100);
        userVerification0.deposit = 0;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.name = "";
        park.UserVerification userVerification4 = new park.UserVerification();
        boolean boolean6 = userVerification4.isNoShow((int) ' ');
        userVerification0.verifyUser((park.User) userVerification4);
        double double8 = userVerification0.getDeposit();
        userVerification0.costPerHour = (byte) -1;
        userVerification0.email = "User [name=null, id=0, email=null, password=null]";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.email = "hi!";
        double double4 = userVerification0.deposit;
        double double5 = userVerification0.deposit;
        userVerification0.setLiscensePlate("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.toString();
        userVerification0.validationStatus = true;
        userVerification0.deposit = (byte) 100;
        double double6 = userVerification0.deposit;
        userVerification0.setDeposit((double) 0);
        userVerification0.costPerHour = 10;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.name = "";
        java.lang.String str4 = userVerification0.getEmail();
        userVerification0.validationStatus = false;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.toString();
        java.lang.String str2 = userVerification0.getEmail();
        userVerification0.costPerHour = (short) 100;
        userVerification0.setValidationStatus(true);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        park.UserVerification userVerification0 = new park.UserVerification();
        boolean boolean2 = userVerification0.isNoShow((int) ' ');
        java.lang.String str3 = userVerification0.getLiscensePlate();
        userVerification0.liscensePlate = "";
        park.UserVerification userVerification6 = new park.UserVerification();
        java.lang.String str7 = userVerification6.email;
        userVerification0.verifyUser((park.User) userVerification6);
        userVerification0.name = "hi!";
        userVerification0.liscensePlate = "hi!";
        userVerification0.setId((-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.name = "";
        park.UserVerification userVerification4 = new park.UserVerification();
        boolean boolean6 = userVerification4.isNoShow((int) ' ');
        userVerification0.verifyUser((park.User) userVerification4);
        boolean boolean8 = userVerification4.getValidationStatus();
        boolean boolean9 = userVerification4.getValidationStatus();
        userVerification4.liscensePlate = "User [name=null, id=0, email=null, password=null]";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.name = "";
        park.UserVerification userVerification4 = new park.UserVerification();
        boolean boolean6 = userVerification4.isNoShow((int) ' ');
        userVerification0.verifyUser((park.User) userVerification4);
        java.lang.String str8 = userVerification4.getName();
        userVerification4.name = "User [name=null, id=0, email=null, password=null]";
        userVerification4.setEmail("hi!");
        java.lang.String str13 = userVerification4.getName();
        java.lang.String str14 = userVerification4.liscensePlate;
        userVerification4.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str13, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.toString();
        userVerification0.setId(0);
        userVerification0.costPerHour = 0;
        java.lang.String str6 = userVerification0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        park.UserVerification userVerification0 = new park.UserVerification();
        park.UserVerification userVerification1 = new park.UserVerification();
        java.lang.String str2 = userVerification1.email;
        userVerification0.verifyUser((park.User) userVerification1);
        userVerification0.setDeposit((double) (short) 1);
        int int6 = userVerification0.id;
        boolean boolean7 = userVerification0.getValidationStatus();
        park.UserVerification userVerification8 = new park.UserVerification();
        java.lang.String str9 = userVerification8.email;
        userVerification8.liscensePlate = "";
        java.lang.String str12 = userVerification8.toString();
        userVerification0.verifyUser((park.User) userVerification8);
        userVerification0.setValidationStatus(true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str12, "User [name=null, id=0, email=null, password=null]");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.name = "";
        boolean boolean4 = userVerification0.getValidationStatus();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        park.UserVerification userVerification0 = new park.UserVerification();
        boolean boolean2 = userVerification0.isNoShow((int) ' ');
        java.lang.String str3 = userVerification0.getLiscensePlate();
        userVerification0.liscensePlate = "";
        java.lang.String str6 = userVerification0.toString();
        userVerification0.id = (byte) -1;
        boolean boolean9 = userVerification0.getValidationStatus();
        int int10 = userVerification0.id;
        userVerification0.setPassword("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str6, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.liscensePlate = "";
        java.lang.String str4 = userVerification0.getLiscensePlate();
        userVerification0.setPassword("");
        userVerification0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        park.UserVerification userVerification0 = new park.UserVerification();
        park.UserVerification userVerification1 = new park.UserVerification();
        java.lang.String str2 = userVerification1.email;
        userVerification0.verifyUser((park.User) userVerification1);
        userVerification0.setDeposit((double) (short) 1);
        int int6 = userVerification0.id;
        userVerification0.name = "User [name=null, id=0, email=null, password=null]";
        java.lang.String str9 = userVerification0.getEmail();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        park.UserVerification userVerification0 = new park.UserVerification();
        boolean boolean2 = userVerification0.isNoShow((int) ' ');
        java.lang.String str3 = userVerification0.getLiscensePlate();
        userVerification0.liscensePlate = "";
        park.UserVerification userVerification6 = new park.UserVerification();
        java.lang.String str7 = userVerification6.email;
        userVerification0.verifyUser((park.User) userVerification6);
        double double9 = userVerification6.deposit;
        userVerification6.email = "";
        userVerification6.name = "User [name=null, id=0, email=null, password=null]";
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.liscensePlate = "";
        double double4 = userVerification0.deposit;
        int int5 = userVerification0.getId();
        boolean boolean7 = userVerification0.isNoShow((int) (short) 0);
        userVerification0.costPerHour = 'a';
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.liscensePlate = "";
        double double4 = userVerification0.deposit;
        int int5 = userVerification0.costPerHour;
        userVerification0.liscensePlate = "";
        java.lang.String str8 = userVerification0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        park.UserVerification userVerification0 = new park.UserVerification();
        boolean boolean2 = userVerification0.isNoShow((int) ' ');
        java.lang.String str3 = userVerification0.getLiscensePlate();
        userVerification0.liscensePlate = "";
        park.UserVerification userVerification6 = new park.UserVerification();
        java.lang.String str7 = userVerification6.email;
        userVerification0.verifyUser((park.User) userVerification6);
        park.UserVerification userVerification9 = new park.UserVerification();
        userVerification6.verifyUser((park.User) userVerification9);
        java.lang.String str11 = userVerification6.getName();
        park.UserVerification userVerification12 = new park.UserVerification();
        java.lang.String str13 = userVerification12.email;
        userVerification12.setLiscensePlate("User [name=null, id=0, email=null, password=null]");
        userVerification12.deposit = 1.0d;
        userVerification12.setPassword("hi!");
        userVerification12.deposit = 10;
        userVerification6.verifyUser((park.User) userVerification12);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        park.UserVerification userVerification0 = new park.UserVerification();
        park.UserVerification userVerification1 = new park.UserVerification();
        java.lang.String str2 = userVerification1.email;
        userVerification0.verifyUser((park.User) userVerification1);
        userVerification0.id = 'a';
        java.lang.String str6 = userVerification0.liscensePlate;
        java.lang.String str7 = userVerification0.getPassword();
        java.lang.String str8 = userVerification0.name;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.liscensePlate = "";
        userVerification0.password = "";
        java.lang.Class<?> wildcardClass6 = userVerification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.liscensePlate = "";
        double double4 = userVerification0.deposit;
        int int5 = userVerification0.getId();
        boolean boolean7 = userVerification0.isNoShow((int) (short) 0);
        boolean boolean8 = userVerification0.getValidationStatus();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.toString();
        java.lang.String str2 = userVerification0.getEmail();
        userVerification0.setEmail("hi!");
        int int5 = userVerification0.costPerHour;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        java.lang.String str2 = userVerification0.email;
        boolean boolean3 = userVerification0.validationStatus;
        userVerification0.setName("hi!");
        double double6 = userVerification0.getDeposit();
        boolean boolean8 = userVerification0.isNoShow((int) (short) 0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        java.lang.String str2 = userVerification0.email;
        userVerification0.setName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        java.lang.String str2 = userVerification0.email;
        boolean boolean3 = userVerification0.validationStatus;
        park.UserVerification userVerification4 = new park.UserVerification();
        boolean boolean6 = userVerification4.isNoShow((int) ' ');
        java.lang.String str7 = userVerification4.getLiscensePlate();
        java.lang.String str8 = userVerification4.name;
        userVerification0.verifyUser((park.User) userVerification4);
        java.lang.String str10 = userVerification0.email;
        userVerification0.setValidationStatus(false);
        userVerification0.name = "";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        java.lang.String str2 = userVerification0.email;
        boolean boolean3 = userVerification0.validationStatus;
        userVerification0.setName("hi!");
        boolean boolean6 = userVerification0.validationStatus;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.name = "";
        double double4 = userVerification0.getDeposit();
        java.lang.String str5 = userVerification0.name;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        park.UserVerification userVerification0 = new park.UserVerification();
        boolean boolean2 = userVerification0.isNoShow((int) ' ');
        java.lang.String str3 = userVerification0.getLiscensePlate();
        userVerification0.liscensePlate = "";
        park.UserVerification userVerification6 = new park.UserVerification();
        java.lang.String str7 = userVerification6.email;
        userVerification0.verifyUser((park.User) userVerification6);
        park.UserVerification userVerification9 = new park.UserVerification();
        userVerification6.verifyUser((park.User) userVerification9);
        int int11 = userVerification9.id;
        park.UserVerification userVerification12 = new park.UserVerification();
        java.lang.String str13 = userVerification12.email;
        userVerification12.liscensePlate = "";
        userVerification9.verifyUser((park.User) userVerification12);
        double double17 = userVerification9.deposit;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        park.UserVerification userVerification0 = new park.UserVerification();
        boolean boolean2 = userVerification0.isNoShow((int) ' ');
        java.lang.String str3 = userVerification0.getLiscensePlate();
        userVerification0.liscensePlate = "";
        park.UserVerification userVerification6 = new park.UserVerification();
        java.lang.String str7 = userVerification6.email;
        userVerification0.verifyUser((park.User) userVerification6);
        park.UserVerification userVerification9 = new park.UserVerification();
        userVerification6.verifyUser((park.User) userVerification9);
        int int11 = userVerification9.id;
        park.UserVerification userVerification12 = new park.UserVerification();
        java.lang.String str13 = userVerification12.email;
        userVerification12.liscensePlate = "";
        userVerification9.verifyUser((park.User) userVerification12);
        userVerification9.setValidationStatus(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        park.UserVerification userVerification0 = new park.UserVerification();
        boolean boolean2 = userVerification0.isNoShow((int) ' ');
        java.lang.String str3 = userVerification0.getPassword();
        userVerification0.setValidationStatus(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        park.UserVerification userVerification0 = new park.UserVerification();
        boolean boolean2 = userVerification0.isNoShow((int) ' ');
        java.lang.String str3 = userVerification0.getLiscensePlate();
        userVerification0.liscensePlate = "";
        java.lang.String str6 = userVerification0.toString();
        userVerification0.id = (byte) -1;
        boolean boolean9 = userVerification0.getValidationStatus();
        int int10 = userVerification0.id;
        userVerification0.liscensePlate = "";
        boolean boolean14 = userVerification0.isNoShow((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str6, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.name = "";
        java.lang.String str4 = userVerification0.getEmail();
        boolean boolean6 = userVerification0.isNoShow(0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.liscensePlate = "";
        userVerification0.name = "hi!";
        java.lang.String str6 = userVerification0.name;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.toString();
        java.lang.String str2 = userVerification0.getEmail();
        userVerification0.costPerHour = (short) 100;
        userVerification0.setId(100);
        double double7 = userVerification0.deposit;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        java.lang.String str2 = userVerification0.email;
        java.lang.String str3 = userVerification0.name;
        userVerification0.setPassword("");
        java.lang.String str6 = userVerification0.name;
        park.UserVerification userVerification7 = new park.UserVerification();
        park.UserVerification userVerification8 = new park.UserVerification();
        java.lang.String str9 = userVerification8.email;
        userVerification7.verifyUser((park.User) userVerification8);
        userVerification7.setDeposit((double) (short) 1);
        int int13 = userVerification7.id;
        boolean boolean14 = userVerification7.getValidationStatus();
        park.UserVerification userVerification15 = new park.UserVerification();
        java.lang.String str16 = userVerification15.email;
        userVerification15.liscensePlate = "";
        java.lang.String str19 = userVerification15.toString();
        userVerification7.verifyUser((park.User) userVerification15);
        userVerification0.verifyUser((park.User) userVerification7);
        userVerification7.setValidationStatus(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str19, "User [name=null, id=0, email=null, password=null]");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        park.UserVerification userVerification0 = new park.UserVerification();
        boolean boolean2 = userVerification0.isNoShow((int) ' ');
        int int3 = userVerification0.costPerHour;
        userVerification0.validationStatus = false;
        userVerification0.password = "hi!";
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.name = "";
        java.lang.String str4 = userVerification0.getEmail();
        int int5 = userVerification0.getId();
        userVerification0.validationStatus = false;
        boolean boolean8 = userVerification0.getValidationStatus();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        park.UserVerification userVerification0 = new park.UserVerification();
        boolean boolean2 = userVerification0.isNoShow((int) ' ');
        java.lang.String str3 = userVerification0.getLiscensePlate();
        userVerification0.liscensePlate = "";
        park.UserVerification userVerification6 = new park.UserVerification();
        java.lang.String str7 = userVerification6.email;
        userVerification0.verifyUser((park.User) userVerification6);
        userVerification0.name = "hi!";
        int int11 = userVerification0.getId();
        int int12 = userVerification0.getId();
        userVerification0.deposit = 100.0d;
        java.lang.String str15 = userVerification0.getName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.toString();
        userVerification0.setId(0);
        userVerification0.liscensePlate = "User [name=null, id=0, email=null, password=null]";
        userVerification0.deposit = (byte) 1;
        java.lang.String str8 = userVerification0.getLiscensePlate();
        java.lang.String str9 = userVerification0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str8, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.name = "";
        park.UserVerification userVerification4 = new park.UserVerification();
        boolean boolean6 = userVerification4.isNoShow((int) ' ');
        userVerification0.verifyUser((park.User) userVerification4);
        java.lang.String str8 = userVerification4.getEmail();
        java.lang.String str9 = userVerification4.name;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.name = "";
        park.UserVerification userVerification4 = new park.UserVerification();
        boolean boolean6 = userVerification4.isNoShow((int) ' ');
        userVerification0.verifyUser((park.User) userVerification4);
        java.lang.String str8 = userVerification4.getName();
        userVerification4.name = "User [name=null, id=0, email=null, password=null]";
        userVerification4.setEmail("hi!");
        boolean boolean13 = userVerification4.getValidationStatus();
        userVerification4.setId((int) 'a');
        userVerification4.costPerHour = (-1);
        int int18 = userVerification4.id;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        park.UserVerification userVerification0 = new park.UserVerification();
        park.UserVerification userVerification1 = new park.UserVerification();
        java.lang.String str2 = userVerification1.email;
        userVerification0.verifyUser((park.User) userVerification1);
        int int4 = userVerification1.id;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        park.UserVerification userVerification0 = new park.UserVerification();
        boolean boolean2 = userVerification0.isNoShow((int) ' ');
        java.lang.String str3 = userVerification0.getLiscensePlate();
        java.lang.String str4 = userVerification0.name;
        java.lang.String str5 = userVerification0.getPassword();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        park.UserVerification userVerification0 = new park.UserVerification();
        boolean boolean2 = userVerification0.isNoShow((int) ' ');
        java.lang.String str3 = userVerification0.getLiscensePlate();
        userVerification0.liscensePlate = "";
        park.UserVerification userVerification6 = new park.UserVerification();
        java.lang.String str7 = userVerification6.email;
        userVerification0.verifyUser((park.User) userVerification6);
        park.UserVerification userVerification9 = new park.UserVerification();
        userVerification6.verifyUser((park.User) userVerification9);
        userVerification9.setValidationStatus(true);
        java.lang.String str13 = userVerification9.email;
        java.lang.String str14 = userVerification9.toString();
        park.UserVerification userVerification15 = new park.UserVerification();
        java.lang.String str16 = userVerification15.email;
        userVerification15.name = "";
        java.lang.String str19 = userVerification15.getEmail();
        userVerification15.validationStatus = true;
        java.lang.String str22 = userVerification15.getLiscensePlate();
        userVerification15.id = (byte) 1;
        userVerification15.setDeposit((double) (byte) 0);
        userVerification9.verifyUser((park.User) userVerification15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str14, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.costPerHour = ' ';
        double double4 = userVerification0.getDeposit();
        userVerification0.setId((int) (byte) 0);
        int int7 = userVerification0.costPerHour;
        userVerification0.liscensePlate = "hi!";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.liscensePlate = "";
        java.lang.String str4 = userVerification0.getLiscensePlate();
        userVerification0.setPassword("");
        userVerification0.deposit = (-1);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        java.lang.String str2 = userVerification0.email;
        boolean boolean3 = userVerification0.validationStatus;
        park.UserVerification userVerification4 = new park.UserVerification();
        boolean boolean6 = userVerification4.isNoShow((int) ' ');
        java.lang.String str7 = userVerification4.getLiscensePlate();
        java.lang.String str8 = userVerification4.name;
        userVerification0.verifyUser((park.User) userVerification4);
        java.lang.String str10 = userVerification0.email;
        userVerification0.email = "User [name=null, id=0, email=null, password=null]";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        java.lang.String str2 = userVerification0.email;
        boolean boolean3 = userVerification0.validationStatus;
        park.UserVerification userVerification4 = new park.UserVerification();
        java.lang.String str5 = userVerification4.email;
        userVerification4.name = "";
        park.UserVerification userVerification8 = new park.UserVerification();
        boolean boolean10 = userVerification8.isNoShow((int) ' ');
        userVerification4.verifyUser((park.User) userVerification8);
        boolean boolean12 = userVerification8.getValidationStatus();
        boolean boolean13 = userVerification8.getValidationStatus();
        userVerification0.verifyUser((park.User) userVerification8);
        userVerification8.setDeposit((double) 1.0f);
        userVerification8.validationStatus = false;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        park.UserVerification userVerification0 = new park.UserVerification();
        boolean boolean2 = userVerification0.isNoShow((int) ' ');
        java.lang.String str3 = userVerification0.getLiscensePlate();
        userVerification0.name = "hi!";
        userVerification0.id = 1;
        java.lang.String str8 = userVerification0.liscensePlate;
        boolean boolean9 = userVerification0.validationStatus;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        park.UserVerification userVerification0 = new park.UserVerification();
        boolean boolean2 = userVerification0.isNoShow((int) ' ');
        java.lang.String str3 = userVerification0.getLiscensePlate();
        userVerification0.liscensePlate = "";
        park.UserVerification userVerification6 = new park.UserVerification();
        java.lang.String str7 = userVerification6.email;
        userVerification0.verifyUser((park.User) userVerification6);
        double double9 = userVerification6.deposit;
        boolean boolean10 = userVerification6.getValidationStatus();
        userVerification6.password = "";
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        park.UserVerification userVerification0 = new park.UserVerification();
        boolean boolean2 = userVerification0.isNoShow((int) ' ');
        java.lang.String str3 = userVerification0.getLiscensePlate();
        userVerification0.liscensePlate = "";
        park.UserVerification userVerification6 = new park.UserVerification();
        java.lang.String str7 = userVerification6.email;
        userVerification0.verifyUser((park.User) userVerification6);
        userVerification0.name = "hi!";
        java.lang.String str11 = userVerification0.password;
        userVerification0.setDeposit((double) 1L);
        java.lang.String str14 = userVerification0.liscensePlate;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.toString();
        int int2 = userVerification0.costPerHour;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        park.UserVerification userVerification0 = new park.UserVerification();
        boolean boolean2 = userVerification0.isNoShow((int) ' ');
        java.lang.String str3 = userVerification0.getLiscensePlate();
        userVerification0.liscensePlate = "";
        java.lang.String str6 = userVerification0.toString();
        userVerification0.id = (byte) -1;
        java.lang.String str9 = userVerification0.getEmail();
        userVerification0.password = "User [name=null, id=0, email=null, password=null]";
        boolean boolean13 = userVerification0.isNoShow((int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str6, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        java.lang.String str2 = userVerification0.email;
        java.lang.String str3 = userVerification0.name;
        userVerification0.setPassword("");
        userVerification0.password = "hi!";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        java.lang.String str2 = userVerification0.email;
        java.lang.String str3 = userVerification0.email;
        java.lang.String str4 = userVerification0.liscensePlate;
        java.lang.String str5 = userVerification0.getLiscensePlate();
        userVerification0.setName("");
        userVerification0.setId((int) (short) 0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.name = "";
        java.lang.String str4 = userVerification0.getEmail();
        userVerification0.id = 0;
        java.lang.String str7 = userVerification0.email;
        userVerification0.password = "";
        userVerification0.id = (byte) 0;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.name = "";
        park.UserVerification userVerification4 = new park.UserVerification();
        boolean boolean6 = userVerification4.isNoShow((int) ' ');
        userVerification0.verifyUser((park.User) userVerification4);
        java.lang.String str8 = userVerification4.getName();
        userVerification4.setEmail("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        java.lang.String str2 = userVerification0.email;
        boolean boolean3 = userVerification0.validationStatus;
        userVerification0.email = "";
        userVerification0.setDeposit((double) (short) 10);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        java.lang.String str2 = userVerification0.email;
        userVerification0.setValidationStatus(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        park.UserVerification userVerification0 = new park.UserVerification();
        boolean boolean2 = userVerification0.isNoShow((int) ' ');
        double double3 = userVerification0.getDeposit();
        java.lang.String str4 = userVerification0.email;
        java.lang.String str5 = userVerification0.getEmail();
        double double6 = userVerification0.deposit;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        java.lang.String str2 = userVerification0.email;
        java.lang.String str3 = userVerification0.email;
        java.lang.String str4 = userVerification0.liscensePlate;
        userVerification0.liscensePlate = "User [name=null, id=0, email=null, password=null]";
        java.lang.String str7 = userVerification0.liscensePlate;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str7, "User [name=null, id=0, email=null, password=null]");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.liscensePlate = "";
        java.lang.String str4 = userVerification0.getLiscensePlate();
        userVerification0.costPerHour = 0;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        park.UserVerification userVerification0 = new park.UserVerification();
        boolean boolean2 = userVerification0.isNoShow((int) ' ');
        userVerification0.email = "";
        userVerification0.setId(100);
        userVerification0.liscensePlate = "";
        userVerification0.setEmail("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.liscensePlate = "";
        java.lang.String str4 = userVerification0.toString();
        int int5 = userVerification0.getId();
        java.lang.String str6 = userVerification0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str4, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.costPerHour = ' ';
        double double4 = userVerification0.getDeposit();
        boolean boolean5 = userVerification0.validationStatus;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        park.UserVerification userVerification0 = new park.UserVerification();
        park.UserVerification userVerification1 = new park.UserVerification();
        java.lang.String str2 = userVerification1.email;
        userVerification0.verifyUser((park.User) userVerification1);
        userVerification0.setDeposit((double) (short) 1);
        int int6 = userVerification0.id;
        userVerification0.setPassword("User [name=null, id=0, email=null, password=null]");
        userVerification0.setId(0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        park.UserVerification userVerification0 = new park.UserVerification();
        boolean boolean2 = userVerification0.isNoShow((int) ' ');
        java.lang.String str3 = userVerification0.getLiscensePlate();
        userVerification0.liscensePlate = "";
        park.UserVerification userVerification6 = new park.UserVerification();
        java.lang.String str7 = userVerification6.email;
        userVerification0.verifyUser((park.User) userVerification6);
        park.UserVerification userVerification9 = new park.UserVerification();
        userVerification6.verifyUser((park.User) userVerification9);
        userVerification9.setValidationStatus(true);
        int int13 = userVerification9.id;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        java.lang.String str2 = userVerification0.email;
        boolean boolean3 = userVerification0.validationStatus;
        park.UserVerification userVerification4 = new park.UserVerification();
        java.lang.String str5 = userVerification4.email;
        userVerification4.name = "";
        park.UserVerification userVerification8 = new park.UserVerification();
        boolean boolean10 = userVerification8.isNoShow((int) ' ');
        userVerification4.verifyUser((park.User) userVerification8);
        boolean boolean12 = userVerification8.getValidationStatus();
        boolean boolean13 = userVerification8.getValidationStatus();
        userVerification0.verifyUser((park.User) userVerification8);
        userVerification8.setPassword("User [name=null, id=0, email=null, password=null]");
        userVerification8.id = 0;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.toString();
        userVerification0.setId(0);
        int int4 = userVerification0.costPerHour;
        double double5 = userVerification0.deposit;
        userVerification0.validationStatus = true;
        java.lang.Class<?> wildcardClass8 = userVerification0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        java.lang.String str2 = userVerification0.email;
        java.lang.String str3 = userVerification0.name;
        userVerification0.setPassword("hi!");
        java.lang.String str6 = userVerification0.getName();
        boolean boolean8 = userVerification0.isNoShow((int) (byte) 10);
        userVerification0.setValidationStatus(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.name = "";
        java.lang.String str4 = userVerification0.email;
        userVerification0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        park.UserVerification userVerification0 = new park.UserVerification();
        park.UserVerification userVerification1 = new park.UserVerification();
        java.lang.String str2 = userVerification1.email;
        userVerification0.verifyUser((park.User) userVerification1);
        userVerification0.setDeposit((double) (short) 1);
        int int6 = userVerification0.id;
        userVerification0.name = "User [name=null, id=0, email=null, password=null]";
        java.lang.String str9 = userVerification0.getName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str9, "User [name=null, id=0, email=null, password=null]");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.toString();
        userVerification0.setId(0);
        int int4 = userVerification0.costPerHour;
        double double5 = userVerification0.deposit;
        userVerification0.email = "hi!";
        double double8 = userVerification0.getDeposit();
        userVerification0.deposit = '4';
        boolean boolean11 = userVerification0.getValidationStatus();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        java.lang.String str2 = userVerification0.email;
        java.lang.String str3 = userVerification0.name;
        userVerification0.setPassword("hi!");
        int int6 = userVerification0.costPerHour;
        userVerification0.setLiscensePlate("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        park.UserVerification userVerification0 = new park.UserVerification();
        boolean boolean2 = userVerification0.isNoShow((int) ' ');
        java.lang.String str3 = userVerification0.getLiscensePlate();
        userVerification0.liscensePlate = "";
        userVerification0.liscensePlate = "";
        java.lang.String str8 = userVerification0.toString();
        boolean boolean9 = userVerification0.validationStatus;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str8, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.toString();
        userVerification0.setId(0);
        userVerification0.liscensePlate = "User [name=null, id=0, email=null, password=null]";
        userVerification0.deposit = (byte) 1;
        java.lang.String str8 = userVerification0.getLiscensePlate();
        java.lang.String str9 = userVerification0.liscensePlate;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str8, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str9, "User [name=null, id=0, email=null, password=null]");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.name = "";
        park.UserVerification userVerification4 = new park.UserVerification();
        boolean boolean6 = userVerification4.isNoShow((int) ' ');
        userVerification0.verifyUser((park.User) userVerification4);
        java.lang.String str8 = userVerification4.getName();
        userVerification4.name = "User [name=null, id=0, email=null, password=null]";
        userVerification4.setEmail("hi!");
        java.lang.String str13 = userVerification4.getName();
        double double14 = userVerification4.getDeposit();
        userVerification4.costPerHour = (short) 10;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str13, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        park.UserVerification userVerification0 = new park.UserVerification();
        boolean boolean2 = userVerification0.isNoShow((int) ' ');
        java.lang.String str3 = userVerification0.getLiscensePlate();
        userVerification0.liscensePlate = "";
        park.UserVerification userVerification6 = new park.UserVerification();
        java.lang.String str7 = userVerification6.email;
        userVerification0.verifyUser((park.User) userVerification6);
        userVerification0.name = "hi!";
        java.lang.String str11 = userVerification0.password;
        userVerification0.setDeposit((double) 1L);
        java.lang.String str14 = userVerification0.getEmail();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.name = "";
        park.UserVerification userVerification4 = new park.UserVerification();
        boolean boolean6 = userVerification4.isNoShow((int) ' ');
        userVerification0.verifyUser((park.User) userVerification4);
        boolean boolean8 = userVerification4.getValidationStatus();
        userVerification4.setLiscensePlate("hi!");
        userVerification4.email = "";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.name = "";
        park.UserVerification userVerification4 = new park.UserVerification();
        boolean boolean6 = userVerification4.isNoShow((int) ' ');
        userVerification0.verifyUser((park.User) userVerification4);
        boolean boolean8 = userVerification4.getValidationStatus();
        userVerification4.deposit = '4';
        java.lang.String str11 = userVerification4.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str11, "User [name=null, id=0, email=null, password=null]");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        park.UserVerification userVerification0 = new park.UserVerification();
        boolean boolean2 = userVerification0.isNoShow((int) ' ');
        java.lang.String str3 = userVerification0.getLiscensePlate();
        userVerification0.liscensePlate = "";
        park.UserVerification userVerification6 = new park.UserVerification();
        java.lang.String str7 = userVerification6.email;
        userVerification0.verifyUser((park.User) userVerification6);
        userVerification0.name = "hi!";
        userVerification0.setName("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        userVerification0.name = "";
        park.UserVerification userVerification4 = new park.UserVerification();
        boolean boolean6 = userVerification4.isNoShow((int) ' ');
        userVerification0.verifyUser((park.User) userVerification4);
        java.lang.String str8 = userVerification4.getName();
        userVerification4.name = "User [name=null, id=0, email=null, password=null]";
        java.lang.String str11 = userVerification4.email;
        userVerification4.costPerHour = (short) 0;
        java.lang.String str14 = userVerification4.password;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        java.lang.String str2 = userVerification0.email;
        java.lang.String str3 = userVerification0.name;
        userVerification0.setName("hi!");
        userVerification0.validationStatus = true;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        park.UserVerification userVerification0 = new park.UserVerification();
        boolean boolean2 = userVerification0.isNoShow((int) ' ');
        java.lang.String str3 = userVerification0.getLiscensePlate();
        userVerification0.liscensePlate = "";
        java.lang.String str6 = userVerification0.toString();
        java.lang.String str7 = userVerification0.getEmail();
        userVerification0.setPassword("User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str6, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.toString();
        userVerification0.validationStatus = true;
        userVerification0.deposit = (byte) 100;
        double double6 = userVerification0.deposit;
        java.lang.String str7 = userVerification0.getLiscensePlate();
        java.lang.String str8 = userVerification0.getEmail();
        userVerification0.setLiscensePlate("hi!");
        java.lang.String str11 = userVerification0.getLiscensePlate();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str1, "User [name=null, id=0, email=null, password=null]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        park.UserVerification userVerification0 = new park.UserVerification();
        boolean boolean2 = userVerification0.isNoShow((int) ' ');
        java.lang.String str3 = userVerification0.getLiscensePlate();
        userVerification0.liscensePlate = "";
        java.lang.String str6 = userVerification0.toString();
        userVerification0.setPassword("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [name=null, id=0, email=null, password=null]" + "'", str6, "User [name=null, id=0, email=null, password=null]");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        park.UserVerification userVerification0 = new park.UserVerification();
        java.lang.String str1 = userVerification0.email;
        java.lang.String str2 = userVerification0.email;
        java.lang.String str3 = userVerification0.name;
        userVerification0.setPassword("hi!");
        java.lang.String str6 = userVerification0.email;
        java.lang.String str7 = userVerification0.getLiscensePlate();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }
}

