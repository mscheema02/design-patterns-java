package park;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        park.MaintainUser.add("hi!", "hi!", "hi!");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        park.MaintainUser.add("", "hi!", "");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        park.MaintainUser.add("", "", "hi!");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        park.MaintainUser.add("hi!", "", "hi!");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        java.lang.String str3 = maintainUser0.path;
        java.lang.Class<?> wildcardClass4 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        boolean boolean3 = park.MaintainUser.check("hi!", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        park.MaintainUser.add("", "hi!", "hi!");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.Class<?> wildcardClass1 = maintainUser0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        boolean boolean3 = park.MaintainUser.check("", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        java.lang.String str7 = maintainUser0.path;
        java.lang.Class<?> wildcardClass8 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        boolean boolean3 = park.MaintainUser.check("", "", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        java.lang.Class<?> wildcardClass3 = maintainUser0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        park.MaintainUser.add("hi!", "hi!", "");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        java.lang.Class<?> wildcardClass7 = maintainUser0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.Class<?> wildcardClass4 = maintainUser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        boolean boolean3 = park.MaintainUser.check("", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        boolean boolean3 = park.MaintainUser.check("hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        java.lang.Class<?> wildcardClass2 = maintainUser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        park.MaintainUser.add("", "", "");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        java.lang.String str3 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.Class<?> wildcardClass6 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        java.lang.String str3 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.Class<?> wildcardClass6 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        boolean boolean3 = park.MaintainUser.check("hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str4 = maintainUser0.path;
        java.lang.Class<?> wildcardClass5 = maintainUser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        java.lang.String str7 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.Class<?> wildcardClass10 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "";
        java.lang.String str6 = maintainUser0.path;
        java.lang.Class<?> wildcardClass7 = maintainUser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        java.lang.String str5 = maintainUser0.path;
        java.lang.Class<?> wildcardClass6 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        java.lang.String str3 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str6 = maintainUser0.path;
        java.lang.Class<?> wildcardClass7 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        boolean boolean3 = park.MaintainUser.check("hi!", "", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        park.MaintainUser.add("hi!", "", "");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        java.lang.String str7 = maintainUser0.path;
        java.lang.String str8 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.Class<?> wildcardClass11 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "";
        java.lang.Class<?> wildcardClass6 = maintainUser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        boolean boolean3 = park.MaintainUser.check("", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        java.lang.Class<?> wildcardClass5 = maintainUser0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        java.lang.String str7 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str10 = maintainUser0.path;
        java.lang.String str11 = maintainUser0.path;
        java.lang.Class<?> wildcardClass12 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.String str4 = maintainUser0.path;
        java.lang.Class<?> wildcardClass5 = maintainUser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        java.lang.String str7 = maintainUser0.path;
        java.lang.Class<?> wildcardClass8 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        java.lang.String str3 = maintainUser0.path;
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        java.lang.Class<?> wildcardClass12 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        java.lang.Class<?> wildcardClass6 = maintainUser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        java.lang.Class<?> wildcardClass11 = maintainUser0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        java.lang.String str7 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str10 = maintainUser0.path;
        java.lang.Class<?> wildcardClass11 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "";
        java.lang.String str6 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str9 = maintainUser0.path;
        java.lang.Class<?> wildcardClass10 = maintainUser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        java.lang.String str7 = maintainUser0.path;
        java.lang.String str8 = maintainUser0.path;
        java.lang.Class<?> wildcardClass9 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.String str4 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.Class<?> wildcardClass7 = maintainUser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        maintainUser0.path = "";
        java.lang.Class<?> wildcardClass9 = maintainUser0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "";
        java.lang.String str6 = maintainUser0.path;
        java.lang.String str7 = maintainUser0.path;
        java.lang.Class<?> wildcardClass8 = maintainUser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str4 = maintainUser0.path;
        java.lang.String str5 = maintainUser0.path;
        java.lang.String str6 = maintainUser0.path;
        java.lang.String str7 = maintainUser0.path;
        java.lang.Class<?> wildcardClass8 = maintainUser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        java.lang.String str5 = maintainUser0.path;
        maintainUser0.path = "hi!";
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        java.lang.String str7 = maintainUser0.path;
        java.lang.String str8 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.String str11 = maintainUser0.path;
        java.lang.String str12 = maintainUser0.path;
        java.lang.Class<?> wildcardClass13 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.Class<?> wildcardClass4 = maintainUser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        java.lang.String str2 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.Class<?> wildcardClass5 = maintainUser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        java.lang.String str8 = maintainUser0.path;
        java.lang.String str9 = maintainUser0.path;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        java.lang.Class<?> wildcardClass7 = maintainUser0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        java.lang.String str3 = maintainUser0.path;
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        maintainUser0.path = "";
        java.lang.Class<?> wildcardClass10 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        java.lang.String str9 = maintainUser0.path;
        java.lang.Class<?> wildcardClass10 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        java.lang.String str3 = maintainUser0.path;
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        java.lang.String str12 = maintainUser0.path;
        java.lang.Class<?> wildcardClass13 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        java.lang.String str7 = maintainUser0.path;
        java.lang.String str8 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "";
        java.lang.Class<?> wildcardClass13 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        java.lang.String str7 = maintainUser0.path;
        java.lang.String str8 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "";
        maintainUser0.path = "";
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        java.lang.String str8 = maintainUser0.path;
        java.lang.Class<?> wildcardClass9 = maintainUser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        java.lang.String str3 = maintainUser0.path;
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        java.lang.Class<?> wildcardClass10 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        java.lang.String str2 = maintainUser0.path;
        java.lang.Class<?> wildcardClass3 = maintainUser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        java.lang.String str7 = maintainUser0.path;
        java.lang.String str8 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.Class<?> wildcardClass11 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        java.lang.String str11 = maintainUser0.path;
        java.lang.String str12 = maintainUser0.path;
        java.lang.Class<?> wildcardClass13 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        java.lang.String str3 = maintainUser0.path;
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        java.lang.Class<?> wildcardClass8 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        java.lang.String str7 = maintainUser0.path;
        java.lang.String str8 = maintainUser0.path;
        java.lang.Class<?> wildcardClass9 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        java.lang.String str11 = maintainUser0.path;
        java.lang.String str12 = maintainUser0.path;
        java.lang.String str13 = maintainUser0.path;
        java.lang.Class<?> wildcardClass14 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        java.lang.String str7 = maintainUser0.path;
        java.lang.String str8 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        maintainUser0.path = "";
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        java.lang.String str3 = maintainUser0.path;
        java.lang.String str4 = maintainUser0.path;
        java.lang.String str5 = maintainUser0.path;
        java.lang.Class<?> wildcardClass6 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        java.lang.String str3 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.String str6 = maintainUser0.path;
        java.lang.Class<?> wildcardClass7 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        java.lang.Class<?> wildcardClass10 = maintainUser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        java.lang.String str7 = maintainUser0.path;
        java.lang.String str8 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        java.lang.Class<?> wildcardClass15 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        java.lang.Class<?> wildcardClass12 = maintainUser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "";
        java.lang.String str6 = maintainUser0.path;
        java.lang.String str7 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.String str10 = maintainUser0.path;
        java.lang.Class<?> wildcardClass11 = maintainUser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str4 = maintainUser0.path;
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        maintainUser0.path = "";
        java.lang.Class<?> wildcardClass11 = maintainUser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str4 = maintainUser0.path;
        java.lang.String str5 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.String str8 = maintainUser0.path;
        java.lang.Class<?> wildcardClass9 = maintainUser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        java.lang.String str11 = maintainUser0.path;
        java.lang.String str12 = maintainUser0.path;
        java.lang.Class<?> wildcardClass13 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        java.lang.String str7 = maintainUser0.path;
        java.lang.String str8 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        java.lang.Class<?> wildcardClass15 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str4 = maintainUser0.path;
        java.lang.String str5 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        java.lang.Class<?> wildcardClass10 = maintainUser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        java.lang.String str3 = maintainUser0.path;
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        java.lang.Class<?> wildcardClass14 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        java.lang.String str3 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        java.lang.Class<?> wildcardClass10 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        java.lang.String str3 = maintainUser0.path;
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        java.lang.String str3 = maintainUser0.path;
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        java.lang.String str14 = maintainUser0.path;
        java.lang.Class<?> wildcardClass15 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        java.lang.String str7 = maintainUser0.path;
        java.lang.String str8 = maintainUser0.path;
        java.lang.String str9 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.Class<?> wildcardClass12 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        java.lang.String str3 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        java.lang.String str8 = maintainUser0.path;
        maintainUser0.path = "hi!";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str4 = maintainUser0.path;
        java.lang.String str5 = maintainUser0.path;
        java.lang.String str6 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.Class<?> wildcardClass9 = maintainUser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "";
        java.lang.String str6 = maintainUser0.path;
        java.lang.String str7 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str10 = maintainUser0.path;
        java.lang.String str11 = maintainUser0.path;
        java.lang.Class<?> wildcardClass12 = maintainUser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        java.lang.String str3 = maintainUser0.path;
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        java.lang.String str14 = maintainUser0.path;
        java.lang.Class<?> wildcardClass15 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        java.lang.String str7 = maintainUser0.path;
        java.lang.String str8 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.String str11 = maintainUser0.path;
        java.lang.String str12 = maintainUser0.path;
        java.lang.String str13 = maintainUser0.path;
        maintainUser0.path = "";
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        java.lang.String str3 = maintainUser0.path;
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        java.lang.String str8 = maintainUser0.path;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        java.lang.String str8 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.Class<?> wildcardClass11 = maintainUser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        java.lang.String str7 = maintainUser0.path;
        java.lang.String str8 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.String str11 = maintainUser0.path;
        java.lang.String str12 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.Class<?> wildcardClass15 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        java.lang.String str7 = maintainUser0.path;
        java.lang.String str8 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.String str11 = maintainUser0.path;
        java.lang.String str12 = maintainUser0.path;
        java.lang.String str13 = maintainUser0.path;
        java.lang.Class<?> wildcardClass14 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        java.lang.String str7 = maintainUser0.path;
        java.lang.String str8 = maintainUser0.path;
        maintainUser0.path = "";
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str4 = maintainUser0.path;
        java.lang.String str5 = maintainUser0.path;
        java.lang.String str6 = maintainUser0.path;
        java.lang.Class<?> wildcardClass7 = maintainUser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "";
        java.lang.String str6 = maintainUser0.path;
        java.lang.String str7 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str10 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "";
        java.lang.Class<?> wildcardClass15 = maintainUser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        java.lang.String str7 = maintainUser0.path;
        java.lang.String str8 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.Class<?> wildcardClass11 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        java.lang.String str3 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.String str6 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        java.lang.String str3 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.String str6 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.Class<?> wildcardClass9 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        java.lang.String str7 = maintainUser0.path;
        java.lang.String str8 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "";
        java.lang.String str13 = maintainUser0.path;
        java.lang.String str14 = maintainUser0.path;
        maintainUser0.path = "hi!";
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        java.lang.String str3 = maintainUser0.path;
        java.lang.String str4 = maintainUser0.path;
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        java.lang.Class<?> wildcardClass9 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        java.lang.String str7 = maintainUser0.path;
        java.lang.String str8 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.String str11 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.Class<?> wildcardClass14 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        java.lang.String str6 = maintainUser0.path;
        java.lang.Class<?> wildcardClass7 = maintainUser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        java.lang.String str7 = maintainUser0.path;
        java.lang.String str8 = maintainUser0.path;
        java.lang.String str9 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.String str12 = maintainUser0.path;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        java.lang.String str2 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.String str5 = maintainUser0.path;
        java.lang.String str6 = maintainUser0.path;
        java.lang.Class<?> wildcardClass7 = maintainUser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "";
        java.lang.String str6 = maintainUser0.path;
        java.lang.String str7 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "";
        java.lang.Class<?> wildcardClass12 = maintainUser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "";
        java.lang.String str6 = maintainUser0.path;
        java.lang.String str7 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str10 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "";
        java.lang.String str15 = maintainUser0.path;
        java.lang.String str16 = maintainUser0.path;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        java.lang.String str11 = maintainUser0.path;
        java.lang.String str12 = maintainUser0.path;
        java.lang.String str13 = maintainUser0.path;
        java.lang.Class<?> wildcardClass14 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        java.lang.String str7 = maintainUser0.path;
        java.lang.String str8 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        java.lang.String str15 = maintainUser0.path;
        java.lang.Class<?> wildcardClass16 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        java.lang.String str7 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str10 = maintainUser0.path;
        java.lang.String str11 = maintainUser0.path;
        java.lang.String str12 = maintainUser0.path;
        maintainUser0.path = "hi!";
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        java.lang.String str3 = maintainUser0.path;
        java.lang.String str4 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.String str7 = maintainUser0.path;
        java.lang.Class<?> wildcardClass8 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "";
        java.lang.String str6 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str9 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.Class<?> wildcardClass12 = maintainUser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str4 = maintainUser0.path;
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        maintainUser0.path = "";
        maintainUser0.path = "";
        java.lang.String str13 = maintainUser0.path;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        java.lang.String str3 = maintainUser0.path;
        java.lang.String str4 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.Class<?> wildcardClass7 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        java.lang.String str3 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        java.lang.String str8 = maintainUser0.path;
        java.lang.Class<?> wildcardClass9 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str4 = maintainUser0.path;
        java.lang.String str5 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        java.lang.String str10 = maintainUser0.path;
        java.lang.Class<?> wildcardClass11 = maintainUser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        java.lang.String str3 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        java.lang.String str8 = maintainUser0.path;
        java.lang.String str9 = maintainUser0.path;
        java.lang.String str10 = maintainUser0.path;
        java.lang.Class<?> wildcardClass11 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str4 = maintainUser0.path;
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        java.lang.String str9 = maintainUser0.path;
        java.lang.Class<?> wildcardClass10 = maintainUser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str4 = maintainUser0.path;
        java.lang.String str5 = maintainUser0.path;
        maintainUser0.path = "hi!";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "";
        java.lang.String str6 = maintainUser0.path;
        java.lang.String str7 = maintainUser0.path;
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        java.lang.Class<?> wildcardClass12 = maintainUser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        java.lang.String str3 = maintainUser0.path;
        java.lang.String str4 = maintainUser0.path;
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        java.lang.String str9 = maintainUser0.path;
        java.lang.Class<?> wildcardClass10 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        java.lang.String str5 = maintainUser0.path;
        java.lang.String str6 = maintainUser0.path;
        java.lang.Class<?> wildcardClass7 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        java.lang.String str2 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.String str5 = maintainUser0.path;
        java.lang.Class<?> wildcardClass6 = maintainUser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        java.lang.String str11 = maintainUser0.path;
        java.lang.Class<?> wildcardClass12 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        java.lang.String str3 = maintainUser0.path;
        java.lang.String str4 = maintainUser0.path;
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        java.lang.Class<?> wildcardClass9 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.String str4 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.String str7 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.Class<?> wildcardClass10 = maintainUser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str4 = maintainUser0.path;
        java.lang.String str5 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.String str8 = maintainUser0.path;
        maintainUser0.path = "hi!";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        java.lang.Class<?> wildcardClass13 = maintainUser0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        java.lang.String str2 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "";
        java.lang.String str7 = maintainUser0.path;
        java.lang.Class<?> wildcardClass8 = maintainUser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        java.lang.String str7 = maintainUser0.path;
        java.lang.String str8 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        java.lang.Class<?> wildcardClass13 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        java.lang.String str2 = maintainUser0.path;
        java.lang.String str3 = maintainUser0.path;
        java.lang.Class<?> wildcardClass4 = maintainUser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        java.lang.String str7 = maintainUser0.path;
        java.lang.String str8 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.String str11 = maintainUser0.path;
        java.lang.String str12 = maintainUser0.path;
        java.lang.String str13 = maintainUser0.path;
        maintainUser0.path = "hi!";
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str4 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.Class<?> wildcardClass7 = maintainUser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        java.lang.String str6 = maintainUser0.path;
        java.lang.String str7 = maintainUser0.path;
        maintainUser0.path = "";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        java.lang.String str7 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str10 = maintainUser0.path;
        java.lang.String str11 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str14 = maintainUser0.path;
        maintainUser0.path = "hi!";
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str4 = maintainUser0.path;
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        java.lang.String str3 = maintainUser0.path;
        java.lang.String str4 = maintainUser0.path;
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        java.lang.String str9 = maintainUser0.path;
        java.lang.String str10 = maintainUser0.path;
        java.lang.String str11 = maintainUser0.path;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        java.lang.String str11 = maintainUser0.path;
        java.lang.String str12 = maintainUser0.path;
        java.lang.String str13 = maintainUser0.path;
        java.lang.String str14 = maintainUser0.path;
        java.lang.Class<?> wildcardClass15 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        java.lang.String str7 = maintainUser0.path;
        java.lang.String str8 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.String str11 = maintainUser0.path;
        java.lang.String str12 = maintainUser0.path;
        java.lang.String str13 = maintainUser0.path;
        java.lang.String str14 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.Class<?> wildcardClass17 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        java.lang.String str13 = maintainUser0.path;
        java.lang.Class<?> wildcardClass14 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        java.lang.String str5 = maintainUser0.path;
        java.lang.String str6 = maintainUser0.path;
        java.lang.String str7 = maintainUser0.path;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        java.lang.String str7 = maintainUser0.path;
        java.lang.String str8 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.String str11 = maintainUser0.path;
        java.lang.String str12 = maintainUser0.path;
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        java.lang.Class<?> wildcardClass17 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        java.lang.String str3 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str6 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.Class<?> wildcardClass9 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        java.lang.String str7 = maintainUser0.path;
        java.lang.String str8 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.String str11 = maintainUser0.path;
        java.lang.String str12 = maintainUser0.path;
        java.lang.String str13 = maintainUser0.path;
        java.lang.String str14 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str17 = maintainUser0.path;
        java.lang.Class<?> wildcardClass18 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "";
        java.lang.String str6 = maintainUser0.path;
        java.lang.String str7 = maintainUser0.path;
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.String str4 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        java.lang.Class<?> wildcardClass9 = maintainUser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        java.lang.String str7 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str10 = maintainUser0.path;
        maintainUser0.path = "hi!";
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        java.lang.String str6 = maintainUser0.path;
        java.lang.String str7 = maintainUser0.path;
        java.lang.String str8 = maintainUser0.path;
        java.lang.String str9 = maintainUser0.path;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        java.lang.String str13 = maintainUser0.path;
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        maintainUser0.path = "";
        java.lang.String str9 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "";
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        java.lang.String str3 = maintainUser0.path;
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        java.lang.String str10 = maintainUser0.path;
        java.lang.String str11 = maintainUser0.path;
        java.lang.String str12 = maintainUser0.path;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        java.lang.String str2 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "";
        java.lang.String str7 = maintainUser0.path;
        java.lang.String str8 = maintainUser0.path;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        java.lang.String str3 = maintainUser0.path;
        java.lang.String str4 = maintainUser0.path;
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        java.lang.Class<?> wildcardClass11 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "";
        java.lang.String str6 = maintainUser0.path;
        java.lang.String str7 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str10 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "";
        maintainUser0.path = "";
        java.lang.Class<?> wildcardClass17 = maintainUser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        java.lang.String str7 = maintainUser0.path;
        java.lang.String str8 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "";
        java.lang.String str13 = maintainUser0.path;
        java.lang.String str14 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "";
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        java.lang.String str3 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        java.lang.String str8 = maintainUser0.path;
        java.lang.String str9 = maintainUser0.path;
        java.lang.Class<?> wildcardClass10 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "";
        java.lang.String str6 = maintainUser0.path;
        java.lang.String str7 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str10 = maintainUser0.path;
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        java.lang.String str15 = maintainUser0.path;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "";
        java.lang.String str6 = maintainUser0.path;
        java.lang.String str7 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str10 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        maintainUser0.path = "";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "";
        java.lang.String str6 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str9 = maintainUser0.path;
        java.lang.String str10 = maintainUser0.path;
        maintainUser0.path = "hi!";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str4 = maintainUser0.path;
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        maintainUser0.path = "";
        maintainUser0.path = "";
        java.lang.Class<?> wildcardClass13 = maintainUser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "";
        java.lang.String str6 = maintainUser0.path;
        java.lang.String str7 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str10 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.Class<?> wildcardClass13 = maintainUser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        java.lang.Class<?> wildcardClass9 = maintainUser0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        java.lang.String str3 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        java.lang.String str8 = maintainUser0.path;
        java.lang.String str9 = maintainUser0.path;
        java.lang.String str10 = maintainUser0.path;
        maintainUser0.path = "hi!";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        java.lang.String str3 = maintainUser0.path;
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        maintainUser0.path = "";
        java.lang.String str10 = maintainUser0.path;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        java.lang.Class<?> wildcardClass13 = maintainUser0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "";
        java.lang.String str6 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str9 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        java.lang.String str13 = maintainUser0.path;
        java.lang.String str14 = maintainUser0.path;
        java.lang.Class<?> wildcardClass15 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        java.lang.String str6 = maintainUser0.path;
        java.lang.String str7 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str10 = maintainUser0.path;
        java.lang.String str11 = maintainUser0.path;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "";
        java.lang.String str6 = maintainUser0.path;
        java.lang.String str7 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.Class<?> wildcardClass10 = maintainUser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        java.lang.String str3 = maintainUser0.path;
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        java.lang.String str14 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.String str17 = maintainUser0.path;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        maintainUser0.path = "";
        maintainUser0.path = "";
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "";
        java.lang.String str6 = maintainUser0.path;
        java.lang.String str7 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str10 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.String str13 = maintainUser0.path;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str4 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str7 = maintainUser0.path;
        java.lang.Class<?> wildcardClass8 = maintainUser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        java.lang.String str3 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        java.lang.String str10 = maintainUser0.path;
        java.lang.Class<?> wildcardClass11 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        java.lang.String str8 = maintainUser0.path;
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        java.lang.String str3 = maintainUser0.path;
        java.lang.String str4 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "";
        java.lang.Class<?> wildcardClass9 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        java.lang.String str7 = maintainUser0.path;
        java.lang.String str8 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.String str11 = maintainUser0.path;
        java.lang.String str12 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str15 = maintainUser0.path;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        java.lang.String str3 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str6 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        java.lang.String str11 = maintainUser0.path;
        java.lang.String str12 = maintainUser0.path;
        java.lang.Class<?> wildcardClass13 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "";
        java.lang.String str6 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.String str9 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.Class<?> wildcardClass12 = maintainUser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        java.lang.String str6 = maintainUser0.path;
        java.lang.String str7 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str10 = maintainUser0.path;
        java.lang.Class<?> wildcardClass11 = maintainUser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        java.lang.String str3 = maintainUser0.path;
        java.lang.String str4 = maintainUser0.path;
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        java.lang.String str11 = maintainUser0.path;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        java.lang.String str7 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str10 = maintainUser0.path;
        maintainUser0.path = "";
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        java.lang.String str11 = maintainUser0.path;
        java.lang.Class<?> wildcardClass12 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.String str4 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.String str7 = maintainUser0.path;
        java.lang.Class<?> wildcardClass8 = maintainUser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "";
        java.lang.String str6 = maintainUser0.path;
        java.lang.String str7 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str10 = maintainUser0.path;
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        java.lang.Class<?> wildcardClass15 = maintainUser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "";
        java.lang.String str6 = maintainUser0.path;
        java.lang.String str7 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str10 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        java.lang.Class<?> wildcardClass17 = maintainUser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        java.lang.String str2 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.String str5 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.Class<?> wildcardClass8 = maintainUser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str4 = maintainUser0.path;
        java.lang.String str5 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        java.lang.String str10 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.String str13 = maintainUser0.path;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        java.lang.String str12 = maintainUser0.path;
        java.lang.String str13 = maintainUser0.path;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        java.lang.String str7 = maintainUser0.path;
        java.lang.String str8 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "";
        java.lang.String str6 = maintainUser0.path;
        java.lang.String str7 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.String str10 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str4 = maintainUser0.path;
        java.lang.String str5 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.String str8 = maintainUser0.path;
        java.lang.String str9 = maintainUser0.path;
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        maintainUser0.path = "";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        java.lang.String str3 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.String str6 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.String str9 = maintainUser0.path;
        java.lang.String str10 = maintainUser0.path;
        java.lang.String str11 = maintainUser0.path;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        maintainUser0.path = "";
        java.lang.String str9 = maintainUser0.path;
        java.lang.String str10 = maintainUser0.path;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        java.lang.String str9 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.String str12 = maintainUser0.path;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        java.lang.String str3 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        java.lang.String str8 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.Class<?> wildcardClass11 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        java.lang.String str3 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.String str6 = maintainUser0.path;
        java.lang.String str7 = maintainUser0.path;
        java.lang.Class<?> wildcardClass8 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        java.lang.String str3 = maintainUser0.path;
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        java.lang.String str9 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.Class<?> wildcardClass12 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        java.lang.String str3 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        java.lang.String str10 = maintainUser0.path;
        java.lang.String str11 = maintainUser0.path;
        java.lang.String str12 = maintainUser0.path;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str4 = maintainUser0.path;
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str4 = maintainUser0.path;
        java.lang.String str5 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        java.lang.String str7 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.String str10 = maintainUser0.path;
        java.lang.Class<?> wildcardClass11 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        java.lang.String str3 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        java.lang.String str10 = maintainUser0.path;
        java.lang.String str11 = maintainUser0.path;
        java.lang.Class<?> wildcardClass12 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        java.lang.String str9 = maintainUser0.path;
        java.lang.String str10 = maintainUser0.path;
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str4 = maintainUser0.path;
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        java.lang.String str11 = maintainUser0.path;
        maintainUser0.path = "hi!";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "";
        java.lang.String str6 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.String str9 = maintainUser0.path;
        java.lang.Class<?> wildcardClass10 = maintainUser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.String str4 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.String str7 = maintainUser0.path;
        java.lang.String str8 = maintainUser0.path;
        maintainUser0.path = "hi!";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        java.lang.String str7 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str10 = maintainUser0.path;
        java.lang.String str11 = maintainUser0.path;
        java.lang.String str12 = maintainUser0.path;
        java.lang.Class<?> wildcardClass13 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        java.lang.String str3 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.String str6 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.String str9 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.Class<?> wildcardClass12 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "";
        java.lang.String str6 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str9 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.String str12 = maintainUser0.path;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        java.lang.String str7 = maintainUser0.path;
        java.lang.String str8 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.String str11 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "";
        java.lang.String str16 = maintainUser0.path;
        java.lang.String str17 = maintainUser0.path;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str4 = maintainUser0.path;
        java.lang.String str5 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.Class<?> wildcardClass8 = maintainUser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "";
        maintainUser0.path = "";
        java.lang.Class<?> wildcardClass8 = maintainUser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        java.lang.String str2 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.String str5 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "hi!";
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        java.lang.String str2 = maintainUser0.path;
        java.lang.String str3 = maintainUser0.path;
        java.lang.String str4 = maintainUser0.path;
        java.lang.String str5 = maintainUser0.path;
        java.lang.String str6 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.Class<?> wildcardClass9 = maintainUser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        java.lang.String str3 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str6 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        java.lang.String str11 = maintainUser0.path;
        java.lang.String str12 = maintainUser0.path;
        java.lang.String str13 = maintainUser0.path;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        java.lang.String str11 = maintainUser0.path;
        maintainUser0.path = "hi!";
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        java.lang.String str13 = maintainUser0.path;
        java.lang.String str14 = maintainUser0.path;
        maintainUser0.path = "";
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        java.lang.String str9 = maintainUser0.path;
        java.lang.Class<?> wildcardClass10 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "";
        java.lang.String str6 = maintainUser0.path;
        java.lang.String str7 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.String str10 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.Class<?> wildcardClass13 = maintainUser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        java.lang.String str7 = maintainUser0.path;
        java.lang.String str8 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "";
        java.lang.String str13 = maintainUser0.path;
        java.lang.String str14 = maintainUser0.path;
        java.lang.String str15 = maintainUser0.path;
        java.lang.Class<?> wildcardClass16 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str4 = maintainUser0.path;
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        java.lang.Class<?> wildcardClass9 = maintainUser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        java.lang.String str2 = maintainUser0.path;
        java.lang.String str3 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.String str6 = maintainUser0.path;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        java.lang.String str7 = maintainUser0.path;
        java.lang.String str8 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "";
        java.lang.String str13 = maintainUser0.path;
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        java.lang.String str2 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        java.lang.Class<?> wildcardClass7 = maintainUser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str4 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str7 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str10 = maintainUser0.path;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        java.lang.String str7 = maintainUser0.path;
        java.lang.String str8 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.String str11 = maintainUser0.path;
        java.lang.String str12 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.String str15 = maintainUser0.path;
        maintainUser0.path = "";
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "";
        java.lang.String str6 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.Class<?> wildcardClass9 = maintainUser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str4 = maintainUser0.path;
        java.lang.String str5 = maintainUser0.path;
        java.lang.String str6 = maintainUser0.path;
        java.lang.String str7 = maintainUser0.path;
        java.lang.String str8 = maintainUser0.path;
        java.lang.Class<?> wildcardClass9 = maintainUser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str4 = maintainUser0.path;
        java.lang.String str5 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.String str8 = maintainUser0.path;
        java.lang.String str9 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str12 = maintainUser0.path;
        java.lang.String str13 = maintainUser0.path;
        maintainUser0.path = "hi!";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str4 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str7 = maintainUser0.path;
        java.lang.String str8 = maintainUser0.path;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        java.lang.String str7 = maintainUser0.path;
        java.lang.String str8 = maintainUser0.path;
        java.lang.String str9 = maintainUser0.path;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str4 = maintainUser0.path;
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        java.lang.String str9 = maintainUser0.path;
        java.lang.String str10 = maintainUser0.path;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        java.lang.String str7 = maintainUser0.path;
        java.lang.String str8 = maintainUser0.path;
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        java.lang.Class<?> wildcardClass13 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        java.lang.String str3 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str6 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.String str9 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str12 = maintainUser0.path;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "";
        java.lang.String str6 = maintainUser0.path;
        java.lang.String str7 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str10 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "";
        maintainUser0.path = "";
        java.lang.String str17 = maintainUser0.path;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        java.lang.String str7 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str10 = maintainUser0.path;
        java.lang.String str11 = maintainUser0.path;
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        java.lang.String str16 = maintainUser0.path;
        java.lang.Class<?> wildcardClass17 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        java.lang.String str2 = maintainUser0.path;
        java.lang.String str3 = maintainUser0.path;
        java.lang.String str4 = maintainUser0.path;
        java.lang.String str5 = maintainUser0.path;
        java.lang.String str6 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.String str9 = maintainUser0.path;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        java.lang.String str7 = maintainUser0.path;
        java.lang.String str8 = maintainUser0.path;
        java.lang.String str9 = maintainUser0.path;
        maintainUser0.path = "hi!";
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.String str4 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        java.lang.String str3 = maintainUser0.path;
        java.lang.String str4 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str7 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str10 = maintainUser0.path;
        java.lang.String str11 = maintainUser0.path;
        maintainUser0.path = "hi!";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        java.lang.String str10 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        java.lang.String str3 = maintainUser0.path;
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        java.lang.Class<?> wildcardClass14 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        java.lang.String str7 = maintainUser0.path;
        java.lang.String str8 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.String str11 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.String str14 = maintainUser0.path;
        java.lang.String str15 = maintainUser0.path;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "";
        java.lang.String str6 = maintainUser0.path;
        java.lang.String str7 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.String str10 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "";
        java.lang.Class<?> wildcardClass15 = maintainUser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        java.lang.String str2 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.String str5 = maintainUser0.path;
        java.lang.String str6 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.Class<?> wildcardClass9 = maintainUser0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str4 = maintainUser0.path;
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        java.lang.String str9 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str12 = maintainUser0.path;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        maintainUser0.path = "";
        java.lang.String str9 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.Class<?> wildcardClass12 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        java.lang.String str2 = maintainUser0.path;
        java.lang.String str3 = maintainUser0.path;
        java.lang.String str4 = maintainUser0.path;
        java.lang.String str5 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        java.lang.String str3 = maintainUser0.path;
        java.lang.String str4 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str7 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.String str10 = maintainUser0.path;
        maintainUser0.path = "hi!";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        java.lang.String str7 = maintainUser0.path;
        java.lang.String str8 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str4 = maintainUser0.path;
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        java.lang.String str9 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.String str12 = maintainUser0.path;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        java.lang.String str2 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        java.lang.String str7 = maintainUser0.path;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        java.lang.String str7 = maintainUser0.path;
        java.lang.String str8 = maintainUser0.path;
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        java.lang.String str13 = maintainUser0.path;
        maintainUser0.path = "hi!";
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        java.lang.String str3 = maintainUser0.path;
        java.lang.String str4 = maintainUser0.path;
        java.lang.String str5 = maintainUser0.path;
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        java.lang.String str10 = maintainUser0.path;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        java.lang.String str3 = maintainUser0.path;
        java.lang.String str4 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str7 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str10 = maintainUser0.path;
        java.lang.Class<?> wildcardClass11 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        java.lang.String str7 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.String str10 = maintainUser0.path;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        java.lang.String str7 = maintainUser0.path;
        java.lang.String str8 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "";
        java.lang.String str13 = maintainUser0.path;
        java.lang.String str14 = maintainUser0.path;
        java.lang.Class<?> wildcardClass15 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        maintainUser0.path = "hi!";
        java.lang.String str7 = maintainUser0.path;
        java.lang.String str8 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.String str11 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str14 = maintainUser0.path;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        java.lang.String str3 = maintainUser0.path;
        java.lang.String str4 = maintainUser0.path;
        java.lang.Class<?> wildcardClass5 = maintainUser0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        maintainUser0.path = "";
        java.lang.String str3 = maintainUser0.path;
        java.lang.String str4 = maintainUser0.path;
        java.lang.String str5 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str8 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str4 = maintainUser0.path;
        maintainUser0.path = "hi!";
        maintainUser0.path = "";
        maintainUser0.path = "";
        maintainUser0.path = "";
        maintainUser0.path = "";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "";
        java.lang.String str6 = maintainUser0.path;
        java.lang.String str7 = maintainUser0.path;
        maintainUser0.path = "hi!";
        java.lang.String str10 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "hi!";
        java.lang.String str15 = maintainUser0.path;
        maintainUser0.path = "hi!";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        park.MaintainUser maintainUser0 = new park.MaintainUser();
        java.lang.String str1 = maintainUser0.path;
        maintainUser0.path = "";
        maintainUser0.path = "";
        java.lang.String str6 = maintainUser0.path;
        maintainUser0.path = "";
        java.lang.String str9 = maintainUser0.path;
        java.lang.String str10 = maintainUser0.path;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }
}

