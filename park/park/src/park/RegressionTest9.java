package park;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        java.lang.String str6 = user5.password;
        java.lang.String str7 = user5.getName();
        java.lang.Class<?> wildcardClass8 = user5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        java.lang.String str6 = user5.password;
        user5.setPassword("");
        user5.setDeposit((double) (-1.0f));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        park.User user5 = new park.User("hi!", 1, "hi!", "hi!", (int) (byte) -1);
        int int6 = user5.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        user5.password = "hi!";
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        park.User user0 = new park.User();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        int int8 = user5.id;
        user5.setName("");
        java.lang.String str11 = user5.toString();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=, id=1, email=hi!, password=hi!]" + "'", str11, "User [name=, id=1, email=hi!, password=hi!]");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        double double6 = user5.getDeposit();
        user5.deposit = 10L;
        user5.liscensePlate = "hi!";
        user5.setEmail("User [name=hi!, id=1, email=hi!, password=hi!]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        int int8 = user5.getId();
        java.lang.String str9 = user5.password;
        user5.deposit = 'a';
        java.lang.String str12 = user5.liscensePlate;
        java.lang.Class<?> wildcardClass13 = user5.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        int int8 = user5.getId();
        java.lang.String str9 = user5.password;
        user5.deposit = 'a';
        int int12 = user5.costPerHour;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        java.lang.String str6 = user5.getPassword();
        java.lang.String str7 = user5.password;
        user5.setDeposit((double) ' ');
        java.lang.Class<?> wildcardClass10 = user5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        java.lang.String str6 = user5.password;
        java.lang.String str7 = user5.email;
        user5.setDeposit((double) (byte) 0);
        int int10 = user5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        user5.setDeposit(10.0d);
        java.lang.String str10 = user5.email;
        java.lang.String str11 = user5.toString();
        boolean boolean13 = user5.isNoShow((int) (short) 0);
        user5.setValidationStatus(false);
        user5.setDeposit((double) '4');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=hi!, id=1, email=hi!, password=hi!]" + "'", str11, "User [name=hi!, id=1, email=hi!, password=hi!]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        user5.setDeposit(10.0d);
        java.lang.String str10 = user5.email;
        java.lang.String str11 = user5.toString();
        boolean boolean13 = user5.isNoShow((int) (short) 100);
        boolean boolean14 = user5.getValidationStatus();
        user5.setId(10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=hi!, id=1, email=hi!, password=hi!]" + "'", str11, "User [name=hi!, id=1, email=hi!, password=hi!]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        int int8 = user5.getId();
        java.lang.String str9 = user5.password;
        user5.deposit = 'a';
        java.lang.String str12 = user5.liscensePlate;
        user5.liscensePlate = "User [name=hi!, id=1, email=hi!, password=hi!]";
        user5.setId(1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.deposit = 0;
        java.lang.String str8 = user5.getLiscensePlate();
        java.lang.Class<?> wildcardClass9 = user5.getClass();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        park.User user5 = new park.User("hi!", 1, "hi!", "hi!", (int) (byte) -1);
        java.lang.Class<?> wildcardClass6 = user5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        user5.setDeposit(10.0d);
        java.lang.String str10 = user5.email;
        java.lang.String str11 = user5.toString();
        boolean boolean13 = user5.isNoShow((int) (short) 100);
        user5.liscensePlate = "User [name=hi!, id=1, email=hi!, password=hi!]";
        java.lang.String str16 = user5.email;
        java.lang.String str17 = user5.email;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=hi!, id=1, email=hi!, password=hi!]" + "'", str11, "User [name=hi!, id=1, email=hi!, password=hi!]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        park.User user5 = new park.User("hi!", 1, "hi!", "hi!", (int) (byte) -1);
        user5.setName("hi!");
        user5.id = '#';
        user5.setId((int) (short) 100);
        java.lang.Class<?> wildcardClass12 = user5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        java.lang.String str6 = user5.password;
        java.lang.String str7 = user5.email;
        user5.email = "";
        user5.setId(0);
        user5.email = "User [name=hi!, id=1, email=hi!, password=hi!]";
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        user5.setDeposit(10.0d);
        java.lang.String str10 = user5.email;
        java.lang.String str11 = user5.toString();
        boolean boolean13 = user5.isNoShow((int) (short) 100);
        user5.liscensePlate = "User [name=hi!, id=1, email=hi!, password=hi!]";
        int int16 = user5.getId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=hi!, id=1, email=hi!, password=hi!]" + "'", str11, "User [name=hi!, id=1, email=hi!, password=hi!]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        double double8 = user5.deposit;
        java.lang.Class<?> wildcardClass9 = user5.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        java.lang.String str6 = user5.password;
        java.lang.String str7 = user5.email;
        user5.email = "";
        user5.setId(0);
        boolean boolean12 = user5.getValidationStatus();
        user5.email = "";
        java.lang.String str15 = user5.getLiscensePlate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        java.lang.String str8 = user5.name;
        user5.validationStatus = false;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        park.User user5 = new park.User("User [name=hi!, id=1, email=hi!, password=User [name=, id=1, email=hi!, password=hi!]]", (int) '4', "User [name=, id=1, email=hi!, password=hi!]", "User [name=, id=1, email=hi!, password=hi!]", (int) (short) 1);
        user5.setLiscensePlate("");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        user5.setDeposit(10.0d);
        java.lang.String str10 = user5.email;
        java.lang.String str11 = user5.toString();
        boolean boolean13 = user5.isNoShow((int) (short) 100);
        user5.liscensePlate = "User [name=hi!, id=1, email=hi!, password=hi!]";
        boolean boolean16 = user5.getValidationStatus();
        user5.id = ' ';
        user5.id = (byte) 1;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=hi!, id=1, email=hi!, password=hi!]" + "'", str11, "User [name=hi!, id=1, email=hi!, password=hi!]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        java.lang.String str6 = user5.getPassword();
        java.lang.String str7 = user5.password;
        user5.setDeposit((double) ' ');
        int int10 = user5.id;
        user5.setDeposit((-1.0d));
        user5.email = "";
        java.lang.String str15 = user5.email;
        boolean boolean16 = user5.validationStatus;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        park.User user5 = new park.User("hi!", 1, "hi!", "hi!", (int) (byte) -1);
        user5.setName("hi!");
        user5.id = '#';
        user5.validationStatus = false;
        boolean boolean12 = user5.getValidationStatus();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        java.lang.String str6 = user5.getPassword();
        int int7 = user5.id;
        boolean boolean9 = user5.isNoShow((int) ' ');
        user5.email = "User [name=hi!, id=1, email=hi!, password=hi!]";
        user5.email = "hi!";
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        int int8 = user5.getId();
        user5.id = (byte) 1;
        java.lang.String str11 = user5.password;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        double double8 = user5.deposit;
        user5.id = 97;
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.deposit = 0;
        user5.name = "";
        user5.costPerHour = (short) 0;
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        int int8 = user5.getId();
        user5.password = "";
        user5.liscensePlate = "";
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        java.lang.String str6 = user5.password;
        java.lang.String str7 = user5.email;
        user5.email = "";
        java.lang.Class<?> wildcardClass10 = user5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        double double6 = user5.getDeposit();
        double double7 = user5.deposit;
        user5.setPassword("User [name=, id=1, email=hi!, password=hi!]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        java.lang.String str6 = user5.password;
        java.lang.String str7 = user5.getName();
        boolean boolean8 = user5.getValidationStatus();
        user5.setId((int) 'a');
        java.lang.String str11 = user5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        double double8 = user5.deposit;
        user5.liscensePlate = "";
        user5.setDeposit((double) (short) 1);
        java.lang.String str13 = user5.password;
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        park.User user5 = new park.User("hi!", 1, "hi!", "hi!", (int) (byte) -1);
        user5.setName("hi!");
        java.lang.String str8 = user5.liscensePlate;
        java.lang.String str9 = user5.name;
        java.lang.String str10 = user5.password;
        java.lang.Class<?> wildcardClass11 = user5.getClass();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        user5.setDeposit(10.0d);
        java.lang.String str10 = user5.email;
        java.lang.String str11 = user5.toString();
        boolean boolean13 = user5.isNoShow((int) (short) 100);
        user5.costPerHour = 0;
        java.lang.Class<?> wildcardClass16 = user5.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=hi!, id=1, email=hi!, password=hi!]" + "'", str11, "User [name=hi!, id=1, email=hi!, password=hi!]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        int int8 = user5.getId();
        java.lang.String str9 = user5.password;
        user5.deposit = 'a';
        java.lang.String str12 = user5.liscensePlate;
        user5.liscensePlate = "User [name=hi!, id=1, email=hi!, password=hi!]";
        user5.setEmail("User [name=hi!, id=1, email=hi!, password=hi!]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        park.User user5 = new park.User("hi!", (int) (short) 0, "hi!", "User [name=hi!, id=1, email=hi!, password=User [name=, id=1, email=hi!, password=hi!]]", 0);
        java.lang.String str6 = user5.name;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        int int8 = user5.getId();
        java.lang.String str9 = user5.password;
        user5.setEmail("hi!");
        java.lang.String str12 = user5.getLiscensePlate();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        user5.setDeposit(10.0d);
        java.lang.String str10 = user5.email;
        java.lang.String str11 = user5.toString();
        int int12 = user5.costPerHour;
        user5.setValidationStatus(true);
        java.lang.String str15 = user5.password;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=hi!, id=1, email=hi!, password=hi!]" + "'", str11, "User [name=hi!, id=1, email=hi!, password=hi!]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        user5.setDeposit(10.0d);
        java.lang.String str10 = user5.email;
        java.lang.String str11 = user5.toString();
        boolean boolean13 = user5.isNoShow((int) (short) 100);
        user5.liscensePlate = "User [name=hi!, id=1, email=hi!, password=hi!]";
        boolean boolean16 = user5.getValidationStatus();
        user5.id = ' ';
        java.lang.String str19 = user5.getPassword();
        java.lang.String str20 = user5.getEmail();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=hi!, id=1, email=hi!, password=hi!]" + "'", str11, "User [name=hi!, id=1, email=hi!, password=hi!]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        java.lang.String str6 = user5.getPassword();
        int int7 = user5.id;
        user5.setId((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        java.lang.String str6 = user5.password;
        user5.name = "User [name=, id=1, email=hi!, password=hi!]";
        int int9 = user5.id;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        user5.setDeposit(10.0d);
        java.lang.String str10 = user5.email;
        java.lang.String str11 = user5.toString();
        int int12 = user5.costPerHour;
        user5.setEmail("User [name=hi!, id=1, email=hi!, password=hi!]");
        java.lang.String str15 = user5.toString();
        java.lang.String str16 = user5.getPassword();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=hi!, id=1, email=hi!, password=hi!]" + "'", str11, "User [name=hi!, id=1, email=hi!, password=hi!]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "User [name=hi!, id=1, email=User [name=hi!, id=1, email=hi!, password=hi!], password=hi!]" + "'", str15, "User [name=hi!, id=1, email=User [name=hi!, id=1, email=hi!, password=hi!], password=hi!]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        park.User user5 = new park.User("User [name=hi!, id=1, email=hi!, password=User [name=, id=1, email=hi!, password=hi!]]", (int) 'a', "User [name=hi!, id=1, email=hi!, password=hi!]", "hi!", (int) 'a');
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        java.lang.String str6 = user5.password;
        java.lang.String str7 = user5.email;
        user5.email = "";
        user5.password = "hi!";
        boolean boolean13 = user5.isNoShow((int) (short) 100);
        double double14 = user5.getDeposit();
        int int15 = user5.getId();
        user5.name = "User [name=hi!, id=1, email=hi!, password=User [name=, id=1, email=hi!, password=hi!]]";
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        java.lang.String str6 = user5.getPassword();
        java.lang.String str7 = user5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        user5.setDeposit(10.0d);
        java.lang.String str10 = user5.email;
        java.lang.String str11 = user5.toString();
        boolean boolean13 = user5.isNoShow((int) (short) 100);
        boolean boolean14 = user5.getValidationStatus();
        boolean boolean15 = user5.validationStatus;
        user5.password = "";
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=hi!, id=1, email=hi!, password=hi!]" + "'", str11, "User [name=hi!, id=1, email=hi!, password=hi!]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        park.User user5 = new park.User("hi!", 1, "hi!", "hi!", (int) (byte) -1);
        user5.setName("hi!");
        java.lang.String str8 = user5.liscensePlate;
        user5.name = "hi!";
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        user5.setDeposit(10.0d);
        user5.id = (short) 100;
        user5.setEmail("User [name=, id=1, email=hi!, password=hi!]");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        int int8 = user5.getId();
        java.lang.String str9 = user5.password;
        user5.deposit = 'a';
        java.lang.String str12 = user5.getPassword();
        user5.setValidationStatus(true);
        boolean boolean15 = user5.getValidationStatus();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        int int8 = user5.getId();
        java.lang.String str9 = user5.password;
        user5.deposit = 'a';
        java.lang.String str12 = user5.getPassword();
        user5.setValidationStatus(true);
        user5.setPassword("hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        java.lang.String str6 = user5.getPassword();
        int int7 = user5.id;
        boolean boolean9 = user5.isNoShow((int) ' ');
        int int10 = user5.getId();
        user5.name = "User [name=hi!, id=1, email=hi!, password=User [name=, id=1, email=hi!, password=hi!]]";
        user5.setName("User [name=hi!, id=1, email=hi!, password=User [name=, id=1, email=hi!, password=hi!]]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        double double6 = user5.getDeposit();
        double double7 = user5.deposit;
        java.lang.String str8 = user5.getEmail();
        user5.liscensePlate = "User [name=hi!, id=1, email=hi!, password=hi!]";
        user5.email = "User [name=hi!, id=1, email=hi!, password=hi!]";
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        int int8 = user5.getId();
        java.lang.String str9 = user5.password;
        user5.deposit = 'a';
        java.lang.String str12 = user5.getPassword();
        user5.liscensePlate = "User [name=hi!, id=1, email=hi!, password=hi!]";
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        java.lang.String str6 = user5.getPassword();
        int int7 = user5.id;
        boolean boolean9 = user5.isNoShow((int) ' ');
        boolean boolean10 = user5.validationStatus;
        boolean boolean12 = user5.isNoShow(0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        user5.setDeposit(10.0d);
        java.lang.String str10 = user5.email;
        java.lang.String str11 = user5.toString();
        boolean boolean13 = user5.isNoShow((int) (short) 100);
        user5.liscensePlate = "User [name=hi!, id=1, email=hi!, password=hi!]";
        boolean boolean16 = user5.getValidationStatus();
        java.lang.String str17 = user5.email;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=hi!, id=1, email=hi!, password=hi!]" + "'", str11, "User [name=hi!, id=1, email=hi!, password=hi!]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        java.lang.String str6 = user5.password;
        java.lang.String str7 = user5.getName();
        user5.deposit = (byte) 10;
        java.lang.String str10 = user5.name;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        java.lang.String str6 = user5.getPassword();
        int int7 = user5.id;
        boolean boolean9 = user5.isNoShow((int) ' ');
        boolean boolean10 = user5.validationStatus;
        user5.costPerHour = (-1);
        java.lang.String str13 = user5.name;
        double double14 = user5.deposit;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        user5.setDeposit(10.0d);
        java.lang.String str10 = user5.email;
        java.lang.String str11 = user5.toString();
        user5.setName("User [name=hi!, id=1, email=hi!, password=hi!]");
        user5.name = "";
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=hi!, id=1, email=hi!, password=hi!]" + "'", str11, "User [name=hi!, id=1, email=hi!, password=hi!]");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        park.User user5 = new park.User("hi!", 1, "hi!", "hi!", (int) (byte) -1);
        user5.setName("hi!");
        user5.id = '#';
        user5.validationStatus = false;
        java.lang.String str12 = user5.email;
        int int13 = user5.id;
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        park.User user5 = new park.User("hi!", 1, "hi!", "hi!", (int) (byte) -1);
        user5.setName("hi!");
        user5.id = '#';
        user5.setId((int) (short) 100);
        boolean boolean12 = user5.getValidationStatus();
        java.lang.String str13 = user5.password;
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        int int8 = user5.getId();
        java.lang.String str9 = user5.password;
        user5.email = "User [name=, id=1, email=hi!, password=hi!]";
        user5.deposit = 1.0d;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        java.lang.String str6 = user5.password;
        java.lang.String str7 = user5.email;
        user5.email = "";
        user5.password = "hi!";
        boolean boolean13 = user5.isNoShow((int) (short) 100);
        user5.setDeposit((double) 97);
        boolean boolean16 = user5.getValidationStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        int int8 = user5.getId();
        java.lang.String str9 = user5.password;
        user5.deposit = 'a';
        java.lang.String str12 = user5.password;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        park.User user5 = new park.User("hi!", 1, "hi!", "hi!", (int) (byte) -1);
        user5.setName("hi!");
        user5.id = '#';
        user5.setId((int) (short) 100);
        boolean boolean12 = user5.getValidationStatus();
        user5.setPassword("User [name=hi!, id=1, email=, password=hi!]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        java.lang.String str6 = user5.getPassword();
        java.lang.String str7 = user5.password;
        user5.setDeposit((double) ' ');
        int int10 = user5.id;
        java.lang.String str11 = user5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        user5.setDeposit(10.0d);
        java.lang.String str10 = user5.email;
        java.lang.String str11 = user5.toString();
        boolean boolean13 = user5.isNoShow((int) (short) 100);
        user5.liscensePlate = "User [name=hi!, id=1, email=hi!, password=hi!]";
        java.lang.String str16 = user5.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=hi!, id=1, email=hi!, password=hi!]" + "'", str11, "User [name=hi!, id=1, email=hi!, password=hi!]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "User [name=hi!, id=1, email=hi!, password=hi!]" + "'", str16, "User [name=hi!, id=1, email=hi!, password=hi!]");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        park.User user5 = new park.User("", 100, "User [name=hi!, id=1, email=hi!, password=hi!]", "", (int) (byte) 0);
        double double6 = user5.getDeposit();
        user5.setPassword("User [name=hi!, id=1, email=hi!, password=hi!]");
        java.lang.String str9 = user5.getEmail();
        boolean boolean10 = user5.validationStatus;
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=hi!, id=1, email=hi!, password=hi!]" + "'", str9, "User [name=hi!, id=1, email=hi!, password=hi!]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        java.lang.String str6 = user5.password;
        java.lang.String str7 = user5.getName();
        user5.validationStatus = false;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        park.User user5 = new park.User("hi!", 1, "hi!", "hi!", (int) (byte) -1);
        user5.setValidationStatus(true);
        int int8 = user5.id;
        boolean boolean10 = user5.isNoShow((int) (short) 100);
        java.lang.String str11 = user5.name;
        java.lang.String str12 = user5.getLiscensePlate();
        java.lang.String str13 = user5.getEmail();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        park.User user5 = new park.User("hi!", 1, "hi!", "hi!", (int) (byte) -1);
        user5.setName("hi!");
        user5.id = '#';
        user5.validationStatus = false;
        user5.setDeposit((double) 100.0f);
        java.lang.String str14 = user5.getPassword();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        int int8 = user5.getId();
        java.lang.String str9 = user5.password;
        user5.deposit = 'a';
        java.lang.String str12 = user5.getPassword();
        user5.deposit = (byte) 0;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        user5.setDeposit(10.0d);
        java.lang.String str10 = user5.email;
        java.lang.String str11 = user5.toString();
        boolean boolean13 = user5.isNoShow((int) (short) 100);
        user5.liscensePlate = "User [name=hi!, id=1, email=hi!, password=hi!]";
        java.lang.String str16 = user5.email;
        java.lang.String str17 = user5.liscensePlate;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=hi!, id=1, email=hi!, password=hi!]" + "'", str11, "User [name=hi!, id=1, email=hi!, password=hi!]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "User [name=hi!, id=1, email=hi!, password=hi!]" + "'", str17, "User [name=hi!, id=1, email=hi!, password=hi!]");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.validationStatus = true;
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        int int8 = user5.getId();
        java.lang.String str9 = user5.password;
        user5.deposit = 'a';
        java.lang.String str12 = user5.getPassword();
        user5.setName("User [name=hi!, id=1, email=hi!, password=hi!]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        user5.setDeposit(10.0d);
        java.lang.String str10 = user5.email;
        java.lang.String str11 = user5.toString();
        boolean boolean13 = user5.isNoShow((int) (short) 100);
        user5.liscensePlate = "User [name=hi!, id=1, email=hi!, password=hi!]";
        boolean boolean16 = user5.getValidationStatus();
        double double17 = user5.getDeposit();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=hi!, id=1, email=hi!, password=hi!]" + "'", str11, "User [name=hi!, id=1, email=hi!, password=hi!]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        park.User user5 = new park.User("User [name=hi!, id=1, email=hi!, password=hi!]", (int) (byte) 100, "User [name=hi!, id=1, email=hi!, password=hi!]", "hi!", (int) 'a');
        user5.password = "User [name=, id=1, email=hi!, password=hi!]";
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        int int8 = user5.getId();
        java.lang.String str9 = user5.password;
        user5.email = "User [name=, id=1, email=hi!, password=hi!]";
        user5.deposit = 32.0d;
        java.lang.String str14 = user5.password;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        int int8 = user5.getId();
        java.lang.String str9 = user5.password;
        user5.deposit = 'a';
        java.lang.String str12 = user5.liscensePlate;
        java.lang.String str13 = user5.getEmail();
        user5.password = "User [name=, id=1, email=hi!, password=hi!]";
        java.lang.String str16 = user5.toString();
        user5.setName("User [name=hi!, id=1, email=hi!, password=hi!]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "User [name=hi!, id=1, email=hi!, password=User [name=, id=1, email=hi!, password=hi!]]" + "'", str16, "User [name=hi!, id=1, email=hi!, password=User [name=, id=1, email=hi!, password=hi!]]");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        java.lang.String str6 = user5.password;
        java.lang.String str7 = user5.getName();
        java.lang.String str8 = user5.email;
        user5.email = "hi!";
        user5.setPassword("User [name=hi!, id=1, email=hi!, password=User [name=, id=1, email=hi!, password=hi!]]");
        user5.password = "hi!";
        user5.liscensePlate = "User [name=hi!, id=1, email=hi!, password=hi!]";
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        java.lang.String str6 = user5.password;
        java.lang.String str7 = user5.email;
        user5.email = "";
        user5.password = "hi!";
        boolean boolean13 = user5.isNoShow((int) (short) 100);
        user5.setValidationStatus(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        double double6 = user5.getDeposit();
        user5.deposit = 10L;
        user5.setPassword("User [name=hi!, id=1, email=, password=hi!]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        int int8 = user5.getId();
        java.lang.String str9 = user5.password;
        user5.deposit = 'a';
        java.lang.String str12 = user5.getLiscensePlate();
        user5.validationStatus = true;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.deposit = 0;
        user5.name = "";
        java.lang.String str10 = user5.liscensePlate;
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        park.User user5 = new park.User("User [name=hi!, id=1, email=User [name=hi!, id=1, email=hi!, password=hi!], password=hi!]", (int) (byte) -1, "User [name=hi!, id=1, email=hi!, password=hi!]", "User [name=hi!, id=1, email=User [name=hi!, id=1, email=hi!, password=hi!], password=hi!]", (int) (byte) 1);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        java.lang.String str6 = user5.getPassword();
        int int7 = user5.id;
        user5.setId((int) ' ');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        user5.setDeposit(10.0d);
        user5.id = ' ';
        user5.liscensePlate = "User [name=hi!, id=1, email=hi!, password=hi!]";
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        double double6 = user5.getDeposit();
        double double7 = user5.deposit;
        java.lang.String str8 = user5.getEmail();
        boolean boolean9 = user5.getValidationStatus();
        user5.setId((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        java.lang.String str6 = user5.password;
        java.lang.String str7 = user5.email;
        user5.setPassword("User [name=hi!, id=1, email=hi!, password=hi!]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        java.lang.String str8 = user5.name;
        boolean boolean9 = user5.getValidationStatus();
        java.lang.String str10 = user5.getPassword();
        java.lang.String str11 = user5.getPassword();
        double double12 = user5.deposit;
        java.lang.String str13 = user5.email;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        java.lang.String str6 = user5.password;
        java.lang.String str7 = user5.email;
        user5.email = "";
        user5.setId(0);
        java.lang.Class<?> wildcardClass12 = user5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        double double6 = user5.getDeposit();
        double double7 = user5.deposit;
        java.lang.String str8 = user5.getEmail();
        boolean boolean9 = user5.getValidationStatus();
        user5.setDeposit((double) (byte) 10);
        java.lang.Class<?> wildcardClass12 = user5.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        java.lang.String str6 = user5.getPassword();
        int int7 = user5.id;
        boolean boolean9 = user5.isNoShow((int) ' ');
        boolean boolean10 = user5.validationStatus;
        user5.costPerHour = (-1);
        double double13 = user5.deposit;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        double double8 = user5.deposit;
        user5.liscensePlate = "";
        user5.email = "";
        int int13 = user5.costPerHour;
        double double14 = user5.getDeposit();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        double double6 = user5.deposit;
        java.lang.String str7 = user5.password;
        user5.email = "User [name=hi!, id=1, email=, password=hi!]";
        user5.liscensePlate = "";
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        park.User user5 = new park.User("hi!", 1, "hi!", "hi!", (int) (byte) -1);
        user5.setName("hi!");
        java.lang.String str8 = user5.liscensePlate;
        java.lang.String str9 = user5.name;
        java.lang.String str10 = user5.password;
        java.lang.String str11 = user5.email;
        java.lang.String str12 = user5.getPassword();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        int int8 = user5.getId();
        java.lang.String str9 = user5.password;
        user5.deposit = 'a';
        java.lang.String str12 = user5.liscensePlate;
        java.lang.String str13 = user5.password;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        java.lang.String str8 = user5.name;
        boolean boolean9 = user5.getValidationStatus();
        int int10 = user5.costPerHour;
        int int11 = user5.getId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        park.User user5 = new park.User("hi!", 1, "hi!", "hi!", (int) (byte) -1);
        user5.setName("hi!");
        java.lang.String str8 = user5.liscensePlate;
        java.lang.String str9 = user5.name;
        java.lang.String str10 = user5.password;
        user5.name = "User [name=hi!, id=1, email=User [name=hi!, id=1, email=hi!, password=hi!], password=hi!]";
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        user5.setDeposit(10.0d);
        java.lang.String str10 = user5.email;
        java.lang.String str11 = user5.toString();
        java.lang.String str12 = user5.liscensePlate;
        user5.name = "User [name=hi!, id=1, email=, password=hi!]";
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=hi!, id=1, email=hi!, password=hi!]" + "'", str11, "User [name=hi!, id=1, email=hi!, password=hi!]");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        int int8 = user5.getId();
        java.lang.String str9 = user5.password;
        user5.deposit = 'a';
        java.lang.String str12 = user5.getLiscensePlate();
        user5.costPerHour = (short) -1;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        int int8 = user5.getId();
        java.lang.String str9 = user5.password;
        double double10 = user5.getDeposit();
        user5.validationStatus = true;
        user5.id = (short) 1;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        int int8 = user5.getId();
        java.lang.String str9 = user5.password;
        user5.deposit = 'a';
        int int12 = user5.getId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        park.User user5 = new park.User("hi!", 1, "hi!", "hi!", (int) (byte) -1);
        user5.setName("hi!");
        java.lang.String str8 = user5.email;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        int int8 = user5.getId();
        java.lang.String str9 = user5.password;
        user5.deposit = 'a';
        java.lang.String str12 = user5.liscensePlate;
        int int13 = user5.id;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        user5.setDeposit(10.0d);
        java.lang.String str10 = user5.email;
        java.lang.String str11 = user5.toString();
        int int12 = user5.costPerHour;
        user5.id = '#';
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=hi!, id=1, email=hi!, password=hi!]" + "'", str11, "User [name=hi!, id=1, email=hi!, password=hi!]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        java.lang.String str6 = user5.password;
        java.lang.String str7 = user5.email;
        user5.email = "";
        user5.password = "hi!";
        boolean boolean13 = user5.isNoShow((int) (short) 100);
        double double14 = user5.getDeposit();
        int int15 = user5.id;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        java.lang.String str6 = user5.getPassword();
        int int7 = user5.id;
        boolean boolean9 = user5.isNoShow((int) ' ');
        boolean boolean10 = user5.validationStatus;
        double double11 = user5.deposit;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        user5.setDeposit(10.0d);
        java.lang.String str10 = user5.email;
        java.lang.String str11 = user5.toString();
        boolean boolean13 = user5.isNoShow((int) (short) 100);
        user5.setId((int) (byte) 100);
        java.lang.String str16 = user5.getName();
        java.lang.Class<?> wildcardClass17 = user5.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=hi!, id=1, email=hi!, password=hi!]" + "'", str11, "User [name=hi!, id=1, email=hi!, password=hi!]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        park.User user5 = new park.User("hi!", 1, "hi!", "hi!", (int) (byte) -1);
        user5.setName("hi!");
        user5.id = '#';
        java.lang.String str10 = user5.getEmail();
        user5.setId((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        int int8 = user5.getId();
        java.lang.String str9 = user5.password;
        double double10 = user5.getDeposit();
        user5.validationStatus = true;
        boolean boolean13 = user5.validationStatus;
        java.lang.String str14 = user5.getLiscensePlate();
        user5.setPassword("hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        int int8 = user5.getId();
        java.lang.String str9 = user5.password;
        user5.name = "User [name=hi!, id=1, email=hi!, password=hi!]";
        user5.deposit = 10.0f;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        user5.setDeposit(10.0d);
        java.lang.String str10 = user5.email;
        java.lang.String str11 = user5.toString();
        int int12 = user5.costPerHour;
        user5.setValidationStatus(true);
        user5.setName("User [name=, id=1, email=hi!, password=hi!]");
        user5.setName("User [name=hi!, id=1, email=, password=hi!]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=hi!, id=1, email=hi!, password=hi!]" + "'", str11, "User [name=hi!, id=1, email=hi!, password=hi!]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        park.User user5 = new park.User("User [name=hi!, id=1, email=hi!, password=User [name=, id=1, email=hi!, password=hi!]]", (int) (byte) 100, "User [name=, id=1, email=hi!, password=hi!]", "hi!", (int) (byte) 1);
        java.lang.String str6 = user5.liscensePlate;
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        java.lang.String str6 = user5.name;
        java.lang.Class<?> wildcardClass7 = user5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        java.lang.String str6 = user5.getPassword();
        java.lang.String str7 = user5.password;
        user5.setDeposit((double) ' ');
        int int10 = user5.id;
        user5.setDeposit((-1.0d));
        user5.email = "";
        user5.id = 'a';
        int int17 = user5.getId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        int int8 = user5.getId();
        java.lang.String str9 = user5.password;
        user5.email = "User [name=, id=1, email=hi!, password=hi!]";
        user5.deposit = 32.0d;
        user5.setEmail("hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        java.lang.String str6 = user5.getPassword();
        int int7 = user5.id;
        boolean boolean9 = user5.isNoShow((int) ' ');
        int int10 = user5.getId();
        user5.setName("User [name=hi!, id=1, email=hi!, password=User [name=, id=1, email=hi!, password=hi!]]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        int int8 = user5.getId();
        java.lang.String str9 = user5.password;
        double double10 = user5.getDeposit();
        user5.validationStatus = true;
        boolean boolean13 = user5.validationStatus;
        java.lang.String str14 = user5.getLiscensePlate();
        java.lang.String str15 = user5.email;
        user5.costPerHour = 10;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        int int8 = user5.getId();
        java.lang.String str9 = user5.password;
        user5.setEmail("hi!");
        double double12 = user5.deposit;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        user5.setDeposit(10.0d);
        java.lang.String str10 = user5.email;
        java.lang.String str11 = user5.toString();
        boolean boolean13 = user5.isNoShow((int) (short) 100);
        user5.costPerHour = 0;
        java.lang.String str16 = user5.getLiscensePlate();
        user5.setEmail("User [name=, id=1, email=hi!, password=hi!]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=hi!, id=1, email=hi!, password=hi!]" + "'", str11, "User [name=hi!, id=1, email=hi!, password=hi!]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        user5.setDeposit(10.0d);
        java.lang.String str10 = user5.email;
        java.lang.String str11 = user5.toString();
        boolean boolean13 = user5.isNoShow((int) (short) 0);
        user5.costPerHour = (byte) -1;
        java.lang.String str16 = user5.name;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=hi!, id=1, email=hi!, password=hi!]" + "'", str11, "User [name=hi!, id=1, email=hi!, password=hi!]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        int int8 = user5.getId();
        java.lang.String str9 = user5.password;
        user5.deposit = 'a';
        user5.setLiscensePlate("User [name=hi!, id=1, email=hi!, password=User [name=, id=1, email=hi!, password=hi!]]");
        user5.password = "User [name=hi!, id=1, email=hi!, password=User [name=, id=1, email=hi!, password=hi!]]";
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        int int8 = user5.getId();
        java.lang.String str9 = user5.password;
        user5.deposit = 'a';
        java.lang.String str12 = user5.liscensePlate;
        java.lang.String str13 = user5.getEmail();
        user5.password = "User [name=, id=1, email=hi!, password=hi!]";
        java.lang.String str16 = user5.toString();
        int int17 = user5.costPerHour;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "User [name=hi!, id=1, email=hi!, password=User [name=, id=1, email=hi!, password=hi!]]" + "'", str16, "User [name=hi!, id=1, email=hi!, password=User [name=, id=1, email=hi!, password=hi!]]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        park.User user5 = new park.User("hi!", 1, "hi!", "hi!", (int) (byte) -1);
        user5.validationStatus = false;
        java.lang.Class<?> wildcardClass8 = user5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        park.User user5 = new park.User("hi!", 1, "hi!", "hi!", (int) (byte) -1);
        user5.setName("hi!");
        user5.id = '#';
        user5.validationStatus = false;
        user5.setName("User [name=hi!, id=1, email=hi!, password=hi!]");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        java.lang.String str6 = user5.password;
        java.lang.String str7 = user5.getName();
        java.lang.String str8 = user5.email;
        user5.email = "hi!";
        int int11 = user5.getId();
        user5.email = "User [name=hi!, id=1, email=hi!, password=hi!]";
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        int int8 = user5.getId();
        java.lang.String str9 = user5.password;
        user5.deposit = 'a';
        java.lang.String str12 = user5.getPassword();
        double double13 = user5.deposit;
        user5.password = "";
        java.lang.String str16 = user5.email;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        java.lang.String str6 = user5.password;
        user5.setDeposit((double) (byte) 10);
        int int9 = user5.getId();
        user5.liscensePlate = "User [name=hi!, id=1, email=User [name=hi!, id=1, email=hi!, password=hi!], password=hi!]";
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        double double6 = user5.getDeposit();
        double double7 = user5.deposit;
        double double8 = user5.deposit;
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        int int8 = user5.getId();
        java.lang.String str9 = user5.getEmail();
        boolean boolean11 = user5.isNoShow((int) (short) -1);
        user5.name = "";
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        park.User user5 = new park.User("User [name=hi!, id=1, email=hi!, password=User [name=, id=1, email=hi!, password=hi!]]", (int) (short) -1, "User [name=hi!, id=1, email=User [name=hi!, id=1, email=hi!, password=hi!], password=hi!]", "User [name=hi!, id=1, email=hi!, password=hi!]", 97);
        boolean boolean6 = user5.getValidationStatus();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        park.User user5 = new park.User("hi!", 1, "hi!", "User [name=hi!, id=1, email=hi!, password=User [name=, id=1, email=hi!, password=hi!]]", (int) ' ');
        user5.costPerHour = 0;
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        user5.setDeposit(10.0d);
        java.lang.String str10 = user5.email;
        java.lang.String str11 = user5.toString();
        int int12 = user5.costPerHour;
        user5.setValidationStatus(true);
        user5.setName("User [name=User [name=hi!, id=1, email=User [name=hi!, id=1, email=hi!, password=hi!], password=hi!], id=100, email=User [name=hi!, id=1, email=hi!, password=hi!], password=]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=hi!, id=1, email=hi!, password=hi!]" + "'", str11, "User [name=hi!, id=1, email=hi!, password=hi!]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        double double8 = user5.deposit;
        user5.liscensePlate = "";
        double double11 = user5.deposit;
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        park.User user5 = new park.User("hi!", 1, "hi!", "hi!", (int) (byte) -1);
        user5.setName("hi!");
        java.lang.String str8 = user5.liscensePlate;
        java.lang.String str9 = user5.name;
        user5.setEmail("hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        double double6 = user5.getDeposit();
        user5.deposit = 10L;
        user5.liscensePlate = "hi!";
        user5.validationStatus = false;
        user5.id = (short) 10;
        double double15 = user5.getDeposit();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        user5.setDeposit(10.0d);
        java.lang.String str10 = user5.email;
        java.lang.String str11 = user5.toString();
        java.lang.String str12 = user5.liscensePlate;
        java.lang.String str13 = user5.name;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=hi!, id=1, email=hi!, password=hi!]" + "'", str11, "User [name=hi!, id=1, email=hi!, password=hi!]");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.deposit = 0;
        user5.deposit = 100.0f;
        int int10 = user5.getId();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        java.lang.String str6 = user5.getPassword();
        int int7 = user5.id;
        boolean boolean9 = user5.isNoShow((int) ' ');
        user5.email = "";
        int int12 = user5.costPerHour;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        java.lang.String str6 = user5.getPassword();
        int int7 = user5.id;
        boolean boolean9 = user5.isNoShow((int) ' ');
        user5.email = "";
        user5.costPerHour = 10;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        park.User user5 = new park.User("hi!", 1, "hi!", "hi!", (int) (byte) -1);
        user5.setName("hi!");
        user5.id = '#';
        user5.deposit = 10.0d;
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        user5.setDeposit(10.0d);
        java.lang.String str10 = user5.email;
        java.lang.String str11 = user5.toString();
        boolean boolean13 = user5.isNoShow((int) (short) 0);
        user5.costPerHour = (byte) -1;
        java.lang.String str16 = user5.toString();
        java.lang.String str17 = user5.name;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=hi!, id=1, email=hi!, password=hi!]" + "'", str11, "User [name=hi!, id=1, email=hi!, password=hi!]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "User [name=hi!, id=1, email=hi!, password=hi!]" + "'", str16, "User [name=hi!, id=1, email=hi!, password=hi!]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        java.lang.String str6 = user5.getPassword();
        int int7 = user5.id;
        boolean boolean9 = user5.isNoShow((int) ' ');
        boolean boolean10 = user5.validationStatus;
        user5.costPerHour = (-1);
        user5.setPassword("User [name=hi!, id=1, email=User [name=hi!, id=1, email=hi!, password=hi!], password=hi!]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        user5.setDeposit(10.0d);
        java.lang.String str10 = user5.email;
        user5.setValidationStatus(true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        int int8 = user5.getId();
        java.lang.String str9 = user5.password;
        user5.deposit = 'a';
        java.lang.String str12 = user5.liscensePlate;
        user5.setEmail("");
        boolean boolean16 = user5.isNoShow(0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        java.lang.String str6 = user5.password;
        java.lang.String str7 = user5.liscensePlate;
        java.lang.String str8 = user5.liscensePlate;
        java.lang.String str9 = user5.toString();
        double double10 = user5.getDeposit();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [name=hi!, id=1, email=, password=hi!]" + "'", str9, "User [name=hi!, id=1, email=, password=hi!]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        park.User user5 = new park.User("hi!", 1, "hi!", "hi!", (int) (byte) -1);
        user5.setValidationStatus(true);
        int int8 = user5.id;
        boolean boolean10 = user5.isNoShow((int) (short) 100);
        java.lang.String str11 = user5.name;
        double double12 = user5.getDeposit();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        java.lang.String str6 = user5.password;
        java.lang.String str7 = user5.getName();
        java.lang.String str8 = user5.email;
        user5.email = "hi!";
        user5.setValidationStatus(true);
        user5.costPerHour = '#';
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        double double6 = user5.getDeposit();
        double double7 = user5.deposit;
        java.lang.String str8 = user5.getEmail();
        boolean boolean9 = user5.getValidationStatus();
        user5.setDeposit((double) (byte) 10);
        java.lang.String str12 = user5.getEmail();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        java.lang.String str6 = user5.getPassword();
        java.lang.String str7 = user5.password;
        user5.setDeposit((double) ' ');
        int int10 = user5.id;
        double double11 = user5.deposit;
        double double12 = user5.deposit;
        double double13 = user5.deposit;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        java.lang.String str8 = user5.getName();
        user5.setId((int) 'a');
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        park.User user5 = new park.User("hi!", 1, "hi!", "hi!", (int) (byte) -1);
        user5.setValidationStatus(true);
        int int8 = user5.id;
        user5.name = "";
        user5.validationStatus = false;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        int int8 = user5.getId();
        java.lang.String str9 = user5.password;
        user5.deposit = 'a';
        java.lang.String str12 = user5.liscensePlate;
        java.lang.String str13 = user5.getEmail();
        user5.password = "User [name=, id=1, email=hi!, password=hi!]";
        java.lang.String str16 = user5.toString();
        java.lang.String str17 = user5.getName();
        user5.costPerHour = ' ';
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "User [name=hi!, id=1, email=hi!, password=User [name=, id=1, email=hi!, password=hi!]]" + "'", str16, "User [name=hi!, id=1, email=hi!, password=User [name=, id=1, email=hi!, password=hi!]]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        park.User user5 = new park.User("User [name=hi!, id=1, email=hi!, password=hi!]", 100, "hi!", "User [name=hi!, id=1, email=hi!, password=hi!]", (int) '#');
        user5.password = "";
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        int int8 = user5.getId();
        java.lang.String str9 = user5.password;
        user5.setEmail("hi!");
        int int12 = user5.costPerHour;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        java.lang.String str6 = user5.password;
        java.lang.String str7 = user5.getName();
        java.lang.String str8 = user5.email;
        user5.email = "hi!";
        user5.setPassword("User [name=hi!, id=1, email=hi!, password=User [name=, id=1, email=hi!, password=hi!]]");
        user5.password = "hi!";
        java.lang.Class<?> wildcardClass15 = user5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        user5.setDeposit(10.0d);
        java.lang.String str10 = user5.email;
        java.lang.String str11 = user5.toString();
        boolean boolean13 = user5.isNoShow((int) (short) 100);
        user5.setId((int) (byte) 100);
        java.lang.String str16 = user5.getName();
        boolean boolean18 = user5.isNoShow(97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=hi!, id=1, email=hi!, password=hi!]" + "'", str11, "User [name=hi!, id=1, email=hi!, password=hi!]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        user5.setDeposit(10.0d);
        java.lang.String str10 = user5.email;
        java.lang.String str11 = user5.toString();
        boolean boolean13 = user5.isNoShow((int) (short) 0);
        user5.costPerHour = (byte) -1;
        user5.costPerHour = ' ';
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=hi!, id=1, email=hi!, password=hi!]" + "'", str11, "User [name=hi!, id=1, email=hi!, password=hi!]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        user5.setDeposit(10.0d);
        java.lang.String str10 = user5.email;
        java.lang.String str11 = user5.toString();
        boolean boolean13 = user5.isNoShow((int) (short) 100);
        boolean boolean14 = user5.getValidationStatus();
        boolean boolean15 = user5.validationStatus;
        int int16 = user5.id;
        user5.name = "User [name=hi!, id=1, email=User [name=hi!, id=1, email=hi!, password=hi!], password=hi!]";
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=hi!, id=1, email=hi!, password=hi!]" + "'", str11, "User [name=hi!, id=1, email=hi!, password=hi!]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        int int8 = user5.getId();
        java.lang.String str9 = user5.getPassword();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        java.lang.String str6 = user5.getPassword();
        int int7 = user5.id;
        boolean boolean9 = user5.isNoShow((int) ' ');
        int int10 = user5.getId();
        user5.name = "User [name=hi!, id=1, email=hi!, password=User [name=, id=1, email=hi!, password=hi!]]";
        java.lang.String str13 = user5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        user5.setDeposit(10.0d);
        java.lang.String str10 = user5.email;
        java.lang.String str11 = user5.toString();
        boolean boolean13 = user5.isNoShow((int) (short) 0);
        java.lang.String str14 = user5.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=hi!, id=1, email=hi!, password=hi!]" + "'", str11, "User [name=hi!, id=1, email=hi!, password=hi!]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        double double8 = user5.deposit;
        user5.liscensePlate = "";
        user5.email = "";
        int int13 = user5.costPerHour;
        boolean boolean14 = user5.validationStatus;
        user5.deposit = 100.0f;
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        double double8 = user5.deposit;
        user5.liscensePlate = "";
        user5.email = "";
        int int13 = user5.costPerHour;
        boolean boolean14 = user5.validationStatus;
        user5.deposit = 100;
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        double double8 = user5.deposit;
        user5.liscensePlate = "";
        user5.setId(1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        user5.setDeposit(10.0d);
        java.lang.String str10 = user5.email;
        java.lang.String str11 = user5.toString();
        boolean boolean13 = user5.isNoShow((int) (short) 0);
        java.lang.String str14 = user5.getPassword();
        user5.id = (-1);
        java.lang.String str17 = user5.liscensePlate;
        java.lang.Class<?> wildcardClass18 = user5.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=hi!, id=1, email=hi!, password=hi!]" + "'", str11, "User [name=hi!, id=1, email=hi!, password=hi!]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        park.User user5 = new park.User("User [name=hi!, id=1, email=User [name=hi!, id=1, email=hi!, password=hi!], password=hi!]", 0, "User [name=hi!, id=1, email=, password=hi!]", "", (int) (byte) 0);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        java.lang.String str6 = user5.password;
        java.lang.String str7 = user5.getName();
        user5.setDeposit((double) (-1));
        user5.setId(100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        user5.setDeposit(10.0d);
        java.lang.String str10 = user5.email;
        java.lang.String str11 = user5.toString();
        boolean boolean13 = user5.isNoShow((int) (short) 100);
        user5.liscensePlate = "User [name=hi!, id=1, email=hi!, password=hi!]";
        java.lang.String str16 = user5.email;
        user5.email = "";
        int int19 = user5.id;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=hi!, id=1, email=hi!, password=hi!]" + "'", str11, "User [name=hi!, id=1, email=hi!, password=hi!]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        java.lang.String str6 = user5.getPassword();
        java.lang.String str7 = user5.password;
        user5.setDeposit((double) ' ');
        user5.email = "";
        java.lang.String str12 = user5.getLiscensePlate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        double double6 = user5.getDeposit();
        double double7 = user5.deposit;
        java.lang.String str8 = user5.getEmail();
        user5.name = "User [name=hi!, id=1, email=hi!, password=hi!]";
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        park.User user5 = new park.User("hi!", (int) (short) 0, "User [name=hi!, id=1, email=User [name=hi!, id=1, email=hi!, password=hi!], password=hi!]", "User [name=, id=1, email=hi!, password=hi!]", (int) (byte) -1);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        double double6 = user5.getDeposit();
        user5.deposit = 10L;
        java.lang.String str9 = user5.name;
        user5.setName("hi!");
        user5.name = "User [name=hi!, id=1, email=User [name=hi!, id=1, email=hi!, password=hi!], password=hi!]";
        user5.setEmail("hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        park.User user5 = new park.User("hi!", 1, "hi!", "hi!", (int) (byte) -1);
        user5.setName("hi!");
        java.lang.String str8 = user5.liscensePlate;
        java.lang.String str9 = user5.name;
        java.lang.String str10 = user5.password;
        boolean boolean11 = user5.getValidationStatus();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        park.User user5 = new park.User("hi!", 1, "hi!", "hi!", (int) (byte) -1);
        user5.setName("hi!");
        user5.id = 0;
        user5.setId((int) (short) 0);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        double double8 = user5.deposit;
        user5.liscensePlate = "";
        java.lang.String str11 = user5.toString();
        java.lang.Class<?> wildcardClass12 = user5.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=hi!, id=1, email=hi!, password=hi!]" + "'", str11, "User [name=hi!, id=1, email=hi!, password=hi!]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        double double6 = user5.getDeposit();
        double double7 = user5.deposit;
        java.lang.String str8 = user5.getEmail();
        double double9 = user5.deposit;
        user5.validationStatus = false;
        user5.password = "User [name=hi!, id=1, email=User [name=hi!, id=1, email=hi!, password=hi!], password=hi!]";
        java.lang.String str14 = user5.liscensePlate;
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        java.lang.String str6 = user5.password;
        java.lang.String str7 = user5.email;
        user5.email = "";
        java.lang.String str10 = user5.liscensePlate;
        user5.costPerHour = 0;
        boolean boolean13 = user5.getValidationStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        park.User user5 = new park.User("hi!", 1, "hi!", "hi!", (int) (byte) -1);
        user5.setName("hi!");
        java.lang.String str8 = user5.liscensePlate;
        boolean boolean10 = user5.isNoShow((int) (byte) 10);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        park.User user5 = new park.User("", 100, "User [name=hi!, id=1, email=hi!, password=hi!]", "", (int) (byte) 0);
        int int6 = user5.getId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        park.User user5 = new park.User("", (int) ' ', "User [name=User [name=hi!, id=1, email=User [name=hi!, id=1, email=hi!, password=hi!], password=hi!], id=100, email=User [name=hi!, id=1, email=hi!, password=hi!], password=]", "User [name=hi!, id=1, email=, password=hi!]", (int) (byte) 0);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        int int8 = user5.id;
        user5.setName("");
        user5.password = "hi!";
        user5.setPassword("hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        user5.setDeposit(10.0d);
        java.lang.String str10 = user5.email;
        java.lang.String str11 = user5.toString();
        boolean boolean13 = user5.isNoShow((int) (short) 100);
        boolean boolean14 = user5.getValidationStatus();
        java.lang.String str15 = user5.getPassword();
        int int16 = user5.costPerHour;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=hi!, id=1, email=hi!, password=hi!]" + "'", str11, "User [name=hi!, id=1, email=hi!, password=hi!]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        int int8 = user5.getId();
        java.lang.String str9 = user5.password;
        user5.deposit = 'a';
        java.lang.String str12 = user5.liscensePlate;
        user5.setEmail("");
        boolean boolean15 = user5.validationStatus;
        user5.setPassword("User [name=hi!, id=1, email=, password=hi!]");
        boolean boolean19 = user5.isNoShow((int) '4');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        park.User user5 = new park.User("", (int) '4', "User [name=, id=1, email=hi!, password=hi!]", "User [name=hi!, id=1, email=, password=hi!]", 0);
        java.lang.String str6 = user5.getLiscensePlate();
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        java.lang.String str6 = user5.getPassword();
        java.lang.String str7 = user5.password;
        user5.setDeposit((double) ' ');
        int int10 = user5.id;
        user5.setDeposit((-1.0d));
        user5.email = "";
        java.lang.String str15 = user5.email;
        user5.setValidationStatus(true);
        user5.setPassword("User [name=hi!, id=1, email=, password=hi!]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        user5.setDeposit(10.0d);
        java.lang.String str10 = user5.email;
        java.lang.String str11 = user5.toString();
        boolean boolean13 = user5.isNoShow((int) (short) 100);
        boolean boolean14 = user5.getValidationStatus();
        user5.password = "User [name=hi!, id=1, email=User [name=hi!, id=1, email=hi!, password=hi!], password=hi!]";
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=hi!, id=1, email=hi!, password=hi!]" + "'", str11, "User [name=hi!, id=1, email=hi!, password=hi!]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        user5.setDeposit(10.0d);
        java.lang.String str10 = user5.email;
        java.lang.String str11 = user5.toString();
        boolean boolean13 = user5.isNoShow((int) (short) 0);
        java.lang.String str14 = user5.getPassword();
        user5.id = (-1);
        user5.setValidationStatus(true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=hi!, id=1, email=hi!, password=hi!]" + "'", str11, "User [name=hi!, id=1, email=hi!, password=hi!]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        int int8 = user5.getId();
        java.lang.String str9 = user5.password;
        user5.setName("hi!");
        user5.liscensePlate = "User [name=hi!, id=1, email=User [name=hi!, id=1, email=hi!, password=hi!], password=hi!]";
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        int int8 = user5.getId();
        java.lang.String str9 = user5.password;
        user5.name = "User [name=hi!, id=1, email=hi!, password=hi!]";
        java.lang.String str12 = user5.liscensePlate;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        java.lang.String str6 = user5.password;
        java.lang.String str7 = user5.getName();
        user5.liscensePlate = "User [name=hi!, id=1, email=, password=hi!]";
        user5.name = "User [name=, id=1, email=hi!, password=hi!]";
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        java.lang.String str6 = user5.password;
        java.lang.String str7 = user5.email;
        user5.email = "";
        user5.password = "hi!";
        boolean boolean13 = user5.isNoShow((int) (short) 100);
        double double14 = user5.getDeposit();
        user5.costPerHour = 10;
        user5.setName("User [name=hi!, id=1, email=hi!, password=hi!]");
        java.lang.String str19 = user5.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        park.User user5 = new park.User("", 100, "User [name=hi!, id=1, email=hi!, password=hi!]", "", (int) (byte) 0);
        double double6 = user5.getDeposit();
        java.lang.String str7 = user5.getName();
        double double8 = user5.deposit;
        user5.name = "User [name=hi!, id=1, email=User [name=hi!, id=1, email=hi!, password=hi!], password=hi!]";
        user5.setDeposit((double) ' ');
        java.lang.String str13 = user5.toString();
        java.lang.String str14 = user5.getLiscensePlate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User [name=User [name=hi!, id=1, email=User [name=hi!, id=1, email=hi!, password=hi!], password=hi!], id=100, email=User [name=hi!, id=1, email=hi!, password=hi!], password=]" + "'", str13, "User [name=User [name=hi!, id=1, email=User [name=hi!, id=1, email=hi!, password=hi!], password=hi!], id=100, email=User [name=hi!, id=1, email=hi!, password=hi!], password=]");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        int int8 = user5.getId();
        java.lang.String str9 = user5.password;
        user5.deposit = 'a';
        java.lang.String str12 = user5.liscensePlate;
        user5.setEmail("");
        boolean boolean15 = user5.validationStatus;
        user5.setPassword("User [name=hi!, id=1, email=, password=hi!]");
        boolean boolean18 = user5.getValidationStatus();
        java.lang.String str19 = user5.name;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        user5.setDeposit(10.0d);
        java.lang.String str10 = user5.email;
        java.lang.String str11 = user5.toString();
        int int12 = user5.costPerHour;
        java.lang.String str13 = user5.email;
        int int14 = user5.id;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=hi!, id=1, email=hi!, password=hi!]" + "'", str11, "User [name=hi!, id=1, email=hi!, password=hi!]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        int int8 = user5.getId();
        java.lang.String str9 = user5.password;
        user5.email = "User [name=, id=1, email=hi!, password=hi!]";
        user5.deposit = 32.0d;
        int int14 = user5.id;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        double double8 = user5.deposit;
        user5.setPassword("User [name=hi!, id=1, email=hi!, password=User [name=, id=1, email=hi!, password=hi!]]");
        int int11 = user5.costPerHour;
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        java.lang.String str6 = user5.getPassword();
        int int7 = user5.id;
        boolean boolean9 = user5.isNoShow((int) ' ');
        user5.email = "User [name=hi!, id=1, email=hi!, password=hi!]";
        java.lang.String str12 = user5.getLiscensePlate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        double double6 = user5.getDeposit();
        double double7 = user5.deposit;
        java.lang.String str8 = user5.getEmail();
        user5.liscensePlate = "User [name=hi!, id=1, email=hi!, password=hi!]";
        int int11 = user5.costPerHour;
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        park.User user5 = new park.User("", 100, "User [name=hi!, id=1, email=hi!, password=hi!]", "", (int) (byte) 0);
        double double6 = user5.getDeposit();
        java.lang.String str7 = user5.getName();
        double double8 = user5.deposit;
        user5.name = "User [name=hi!, id=1, email=User [name=hi!, id=1, email=hi!, password=hi!], password=hi!]";
        user5.id = (short) 1;
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        double double8 = user5.deposit;
        user5.liscensePlate = "";
        user5.email = "";
        int int13 = user5.costPerHour;
        boolean boolean14 = user5.validationStatus;
        boolean boolean15 = user5.getValidationStatus();
        int int16 = user5.costPerHour;
        user5.costPerHour = (short) 1;
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.deposit = 0;
        user5.deposit = 32.0d;
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        java.lang.String str6 = user5.password;
        java.lang.String str7 = user5.email;
        user5.setDeposit((double) (byte) 0);
        java.lang.String str10 = user5.getLiscensePlate();
        int int11 = user5.getId();
        user5.password = "User [name=hi!, id=1, email=hi!, password=User [name=, id=1, email=hi!, password=hi!]]";
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        java.lang.String str6 = user5.getPassword();
        int int7 = user5.id;
        user5.deposit = 97.0d;
        boolean boolean10 = user5.validationStatus;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        user5.setDeposit(10.0d);
        java.lang.String str10 = user5.email;
        java.lang.String str11 = user5.toString();
        boolean boolean13 = user5.isNoShow((int) (short) 100);
        user5.liscensePlate = "User [name=hi!, id=1, email=hi!, password=hi!]";
        boolean boolean16 = user5.getValidationStatus();
        user5.id = ' ';
        java.lang.String str19 = user5.getPassword();
        double double20 = user5.getDeposit();
        user5.name = "";
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=hi!, id=1, email=hi!, password=hi!]" + "'", str11, "User [name=hi!, id=1, email=hi!, password=hi!]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        java.lang.String str6 = user5.password;
        java.lang.String str7 = user5.getName();
        boolean boolean8 = user5.getValidationStatus();
        user5.setId((int) 'a');
        boolean boolean11 = user5.getValidationStatus();
        java.lang.String str12 = user5.liscensePlate;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        java.lang.String str6 = user5.password;
        java.lang.String str7 = user5.email;
        user5.email = "";
        user5.password = "hi!";
        boolean boolean13 = user5.isNoShow((int) (short) 100);
        int int14 = user5.costPerHour;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        java.lang.String str6 = user5.getPassword();
        java.lang.String str7 = user5.password;
        user5.setDeposit((double) ' ');
        int int10 = user5.id;
        user5.setDeposit((-1.0d));
        user5.email = "";
        java.lang.String str15 = user5.email;
        boolean boolean16 = user5.getValidationStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        int int8 = user5.getId();
        user5.password = "";
        user5.email = "User [name=User [name=hi!, id=1, email=User [name=hi!, id=1, email=hi!, password=hi!], password=hi!], id=100, email=User [name=hi!, id=1, email=hi!, password=hi!], password=]";
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        int int8 = user5.getId();
        java.lang.String str9 = user5.password;
        user5.name = "User [name=hi!, id=1, email=hi!, password=hi!]";
        user5.setDeposit(10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        double double6 = user5.getDeposit();
        double double7 = user5.deposit;
        java.lang.String str8 = user5.getEmail();
        boolean boolean10 = user5.isNoShow((int) 'a');
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        int int8 = user5.getId();
        java.lang.String str9 = user5.name;
        user5.setPassword("User [name=, id=1, email=hi!, password=hi!]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        java.lang.String str6 = user5.getPassword();
        java.lang.String str7 = user5.password;
        user5.setDeposit((double) ' ');
        int int10 = user5.id;
        user5.setDeposit((-1.0d));
        user5.email = "";
        java.lang.String str15 = user5.email;
        java.lang.String str16 = user5.email;
        double double17 = user5.deposit;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        double double6 = user5.getDeposit();
        double double7 = user5.deposit;
        java.lang.String str8 = user5.getEmail();
        boolean boolean9 = user5.getValidationStatus();
        user5.setDeposit((double) (byte) 10);
        int int12 = user5.costPerHour;
        java.lang.String str13 = user5.liscensePlate;
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        park.User user5 = new park.User("User [name=, id=1, email=hi!, password=hi!]", (int) (short) -1, "User [name=hi!, id=1, email=, password=hi!]", "User [name=hi!, id=1, email=, password=hi!]", (-1));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        java.lang.String str6 = user5.password;
        user5.setDeposit((double) (byte) 10);
        java.lang.String str9 = user5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        user5.setDeposit(10.0d);
        java.lang.String str10 = user5.email;
        java.lang.String str11 = user5.toString();
        boolean boolean13 = user5.isNoShow((int) (short) 0);
        user5.costPerHour = (byte) -1;
        int int16 = user5.id;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=hi!, id=1, email=hi!, password=hi!]" + "'", str11, "User [name=hi!, id=1, email=hi!, password=hi!]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        park.User user5 = new park.User("User [name=hi!, id=1, email=hi!, password=hi!]", (int) (byte) -1, "", "User [name=User [name=hi!, id=1, email=User [name=hi!, id=1, email=hi!, password=hi!], password=hi!], id=100, email=User [name=hi!, id=1, email=hi!, password=hi!], password=]", (int) ' ');
        user5.email = "User [name=User [name=hi!, id=1, email=User [name=hi!, id=1, email=hi!, password=hi!], password=hi!], id=100, email=User [name=hi!, id=1, email=hi!, password=hi!], password=]";
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        int int8 = user5.id;
        user5.setName("");
        int int11 = user5.id;
        java.lang.Class<?> wildcardClass12 = user5.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        java.lang.String str6 = user5.password;
        java.lang.String str7 = user5.getName();
        java.lang.String str8 = user5.email;
        user5.email = "hi!";
        int int11 = user5.getId();
        user5.setLiscensePlate("User [name=hi!, id=1, email=hi!, password=hi!]");
        user5.setPassword("User [name=hi!, id=1, email=User [name=hi!, id=1, email=hi!, password=hi!], password=hi!]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        java.lang.String str8 = user5.name;
        boolean boolean9 = user5.getValidationStatus();
        java.lang.String str10 = user5.getPassword();
        java.lang.String str11 = user5.getEmail();
        user5.setDeposit((-1.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        double double6 = user5.getDeposit();
        user5.deposit = 10L;
        user5.liscensePlate = "hi!";
        user5.validationStatus = false;
        java.lang.String str13 = user5.name;
        java.lang.String str14 = user5.getLiscensePlate();
        java.lang.String str15 = user5.getLiscensePlate();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        park.User user5 = new park.User("hi!", 1, "hi!", "hi!", (int) (byte) -1);
        user5.setName("hi!");
        user5.id = '#';
        java.lang.String str10 = user5.getPassword();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        java.lang.String str6 = user5.getPassword();
        int int7 = user5.id;
        user5.id = '#';
        user5.setId((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        int int8 = user5.getId();
        user5.id = (byte) 1;
        user5.deposit = 10;
        boolean boolean13 = user5.validationStatus;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        int int8 = user5.getId();
        java.lang.String str9 = user5.getEmail();
        boolean boolean11 = user5.isNoShow((int) (short) -1);
        java.lang.String str12 = user5.liscensePlate;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        park.User user5 = new park.User("User [name=hi!, id=1, email=User [name=hi!, id=1, email=hi!, password=hi!], password=hi!]", 1, "hi!", "", (int) ' ');
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        park.User user5 = new park.User("", 100, "User [name=hi!, id=1, email=hi!, password=hi!]", "", (int) (byte) 0);
        double double6 = user5.getDeposit();
        java.lang.String str7 = user5.getName();
        double double8 = user5.deposit;
        user5.name = "User [name=hi!, id=1, email=User [name=hi!, id=1, email=hi!, password=hi!], password=hi!]";
        user5.setDeposit((double) ' ');
        user5.name = "User [name=hi!, id=1, email=hi!, password=hi!]";
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        java.lang.String str6 = user5.password;
        java.lang.String str7 = user5.email;
        user5.email = "";
        double double10 = user5.getDeposit();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        java.lang.String str6 = user5.password;
        java.lang.String str7 = user5.email;
        user5.email = "";
        user5.password = "hi!";
        boolean boolean13 = user5.isNoShow((int) (short) 100);
        user5.setDeposit((double) 97);
        double double16 = user5.deposit;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        int int8 = user5.getId();
        java.lang.String str9 = user5.password;
        user5.deposit = 'a';
        java.lang.String str12 = user5.getLiscensePlate();
        user5.setName("User [name=hi!, id=1, email=hi!, password=User [name=, id=1, email=hi!, password=hi!]]");
        user5.setDeposit((double) 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        int int8 = user5.getId();
        java.lang.String str9 = user5.password;
        double double10 = user5.getDeposit();
        user5.validationStatus = true;
        boolean boolean13 = user5.validationStatus;
        java.lang.String str14 = user5.getLiscensePlate();
        double double15 = user5.deposit;
        int int16 = user5.getId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        park.User user5 = new park.User("User [name=hi!, id=1, email=, password=hi!]", (-1), "User [name=User [name=hi!, id=1, email=User [name=hi!, id=1, email=hi!, password=hi!], password=hi!], id=100, email=User [name=hi!, id=1, email=hi!, password=hi!], password=]", "User [name=hi!, id=1, email=, password=hi!]", 0);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        park.User user5 = new park.User("User [name=hi!, id=1, email=hi!, password=hi!]", 100, "hi!", "User [name=hi!, id=1, email=hi!, password=hi!]", (int) '#');
        user5.setPassword("User [name=hi!, id=1, email=User [name=hi!, id=1, email=hi!, password=hi!], password=hi!]");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        int int8 = user5.getId();
        java.lang.String str9 = user5.getEmail();
        boolean boolean11 = user5.isNoShow((int) (short) -1);
        java.lang.String str12 = user5.name;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        park.User user5 = new park.User("hi!", 1, "hi!", "hi!", (int) (byte) -1);
        user5.setValidationStatus(true);
        int int8 = user5.id;
        boolean boolean10 = user5.isNoShow((int) (short) 100);
        java.lang.String str11 = user5.name;
        java.lang.String str12 = user5.name;
        user5.setLiscensePlate("");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        java.lang.String str6 = user5.password;
        java.lang.String str7 = user5.email;
        user5.email = "";
        user5.password = "hi!";
        user5.name = "User [name=hi!, id=1, email=hi!, password=User [name=, id=1, email=hi!, password=hi!]]";
        boolean boolean14 = user5.getValidationStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        java.lang.String str6 = user5.getPassword();
        java.lang.String str7 = user5.password;
        user5.setDeposit((double) ' ');
        int int10 = user5.id;
        user5.setDeposit((-1.0d));
        user5.email = "";
        java.lang.String str15 = user5.email;
        java.lang.String str16 = user5.email;
        user5.password = "User [name=hi!, id=1, email=hi!, password=User [name=, id=1, email=hi!, password=hi!]]";
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        java.lang.String str6 = user5.password;
        user5.setDeposit((double) (byte) 10);
        user5.setPassword("User [name=hi!, id=1, email=hi!, password=User [name=, id=1, email=hi!, password=hi!]]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        int int8 = user5.getId();
        java.lang.String str9 = user5.password;
        user5.deposit = 'a';
        java.lang.String str12 = user5.liscensePlate;
        java.lang.String str13 = user5.getEmail();
        user5.password = "User [name=, id=1, email=hi!, password=hi!]";
        java.lang.String str16 = user5.toString();
        java.lang.String str17 = user5.getName();
        user5.setName("");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "User [name=hi!, id=1, email=hi!, password=User [name=, id=1, email=hi!, password=hi!]]" + "'", str16, "User [name=hi!, id=1, email=hi!, password=User [name=, id=1, email=hi!, password=hi!]]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        double double6 = user5.getDeposit();
        java.lang.String str7 = user5.email;
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        int int8 = user5.getId();
        java.lang.String str9 = user5.password;
        user5.email = "User [name=, id=1, email=hi!, password=hi!]";
        java.lang.Class<?> wildcardClass12 = user5.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        double double8 = user5.deposit;
        user5.setPassword("User [name=hi!, id=1, email=hi!, password=User [name=, id=1, email=hi!, password=hi!]]");
        user5.liscensePlate = "User [name=hi!, id=1, email=, password=hi!]";
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        double double6 = user5.deposit;
        int int7 = user5.costPerHour;
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        java.lang.String str8 = user5.name;
        boolean boolean9 = user5.getValidationStatus();
        java.lang.String str10 = user5.getPassword();
        java.lang.Class<?> wildcardClass11 = user5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        park.User user5 = new park.User("User [name=hi!, id=1, email=hi!, password=hi!]", 0, "User [name=, id=1, email=hi!, password=hi!]", "hi!", 10);
        user5.password = "User [name=hi!, id=1, email=hi!, password=hi!]";
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        java.lang.String str6 = user5.password;
        java.lang.String str7 = user5.email;
        user5.email = "";
        user5.password = "hi!";
        boolean boolean13 = user5.isNoShow((int) (short) 100);
        user5.id = ' ';
        java.lang.String str16 = user5.email;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        user5.setDeposit(10.0d);
        java.lang.String str10 = user5.email;
        java.lang.String str11 = user5.toString();
        boolean boolean13 = user5.isNoShow((int) (short) 0);
        java.lang.String str14 = user5.getPassword();
        user5.id = (-1);
        java.lang.String str17 = user5.liscensePlate;
        user5.setDeposit(1.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=hi!, id=1, email=hi!, password=hi!]" + "'", str11, "User [name=hi!, id=1, email=hi!, password=hi!]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        java.lang.String str6 = user5.getPassword();
        int int7 = user5.id;
        boolean boolean9 = user5.isNoShow((int) ' ');
        int int10 = user5.getId();
        user5.name = "User [name=hi!, id=1, email=hi!, password=User [name=, id=1, email=hi!, password=hi!]]";
        user5.validationStatus = true;
        int int15 = user5.costPerHour;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        double double6 = user5.getDeposit();
        user5.deposit = 10L;
        user5.liscensePlate = "hi!";
        java.lang.String str11 = user5.name;
        java.lang.String str12 = user5.name;
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        java.lang.String str6 = user5.getPassword();
        java.lang.String str7 = user5.password;
        user5.costPerHour = 0;
        user5.validationStatus = false;
        user5.liscensePlate = "User [name=hi!, id=1, email=hi!, password=hi!]";
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        double double6 = user5.getDeposit();
        double double7 = user5.deposit;
        java.lang.String str8 = user5.getEmail();
        boolean boolean9 = user5.getValidationStatus();
        user5.setDeposit((double) (byte) 10);
        int int12 = user5.costPerHour;
        user5.email = "User [name=hi!, id=1, email=hi!, password=hi!]";
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        user5.setDeposit(10.0d);
        java.lang.String str10 = user5.email;
        java.lang.String str11 = user5.toString();
        boolean boolean13 = user5.isNoShow((int) (short) 100);
        user5.liscensePlate = "User [name=hi!, id=1, email=hi!, password=hi!]";
        java.lang.String str16 = user5.getLiscensePlate();
        user5.id = '4';
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=hi!, id=1, email=hi!, password=hi!]" + "'", str11, "User [name=hi!, id=1, email=hi!, password=hi!]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "User [name=hi!, id=1, email=hi!, password=hi!]" + "'", str16, "User [name=hi!, id=1, email=hi!, password=hi!]");
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        int int8 = user5.getId();
        java.lang.String str9 = user5.getEmail();
        java.lang.String str10 = user5.toString();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "User [name=hi!, id=1, email=hi!, password=hi!]" + "'", str10, "User [name=hi!, id=1, email=hi!, password=hi!]");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        java.lang.String str6 = user5.getPassword();
        java.lang.String str7 = user5.password;
        user5.setDeposit((double) ' ');
        int int10 = user5.id;
        user5.setDeposit((-1.0d));
        user5.email = "";
        java.lang.String str15 = user5.email;
        java.lang.String str16 = user5.email;
        java.lang.String str17 = user5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        java.lang.String str6 = user5.password;
        user5.setPassword("");
        user5.password = "User [name=hi!, id=1, email=hi!, password=User [name=, id=1, email=hi!, password=hi!]]";
        java.lang.String str11 = user5.name;
        java.lang.String str12 = user5.name;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        user5.email = "hi!";
        user5.setDeposit(10.0d);
        java.lang.String str10 = user5.email;
        java.lang.String str11 = user5.toString();
        boolean boolean13 = user5.isNoShow((int) (short) 100);
        user5.liscensePlate = "User [name=hi!, id=1, email=hi!, password=hi!]";
        java.lang.String str16 = user5.getLiscensePlate();
        user5.setEmail("User [name=hi!, id=1, email=User [name=hi!, id=1, email=hi!, password=hi!], password=hi!]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "User [name=hi!, id=1, email=hi!, password=hi!]" + "'", str11, "User [name=hi!, id=1, email=hi!, password=hi!]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "User [name=hi!, id=1, email=hi!, password=hi!]" + "'", str16, "User [name=hi!, id=1, email=hi!, password=hi!]");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        park.User user5 = new park.User("hi!", (int) (byte) 1, "", "hi!", (int) 'a');
        java.lang.String str6 = user5.password;
        java.lang.String str7 = user5.email;
        user5.setDeposit((double) (byte) 0);
        java.lang.String str10 = user5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }
}

