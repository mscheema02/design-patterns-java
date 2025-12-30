import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        park.UserFactory userFactory0 = new park.UserFactory();
        java.lang.Class<?> wildcardClass1 = userFactory0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        park.client client3 = park.UserFactory.getInstance("hi!", "hi!", "");
        org.junit.Assert.assertNull(client3);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        park.client client3 = park.UserFactory.getInstance("hi!", "", "");
        org.junit.Assert.assertNull(client3);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        park.client client3 = park.UserFactory.getInstance("", "hi!", "");
        org.junit.Assert.assertNull(client3);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        park.client client3 = park.UserFactory.getInstance("", "hi!", "hi!");
        org.junit.Assert.assertNull(client3);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        park.client client3 = park.UserFactory.getInstance("hi!", "", "hi!");
        org.junit.Assert.assertNull(client3);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        park.client client3 = park.UserFactory.getInstance("", "", "");
        org.junit.Assert.assertNull(client3);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        park.client client3 = park.UserFactory.getInstance("", "", "hi!");
        org.junit.Assert.assertNull(client3);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        park.client client3 = park.UserFactory.getInstance("hi!", "hi!", "hi!");
        org.junit.Assert.assertNull(client3);
    }
}

