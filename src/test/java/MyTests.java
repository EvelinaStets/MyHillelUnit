import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class MyTests {


    public static boolean isPhone(String text) {
        String regex = "(?:\\+38)? ?(?:0\\d{2}|\\(0\\d{2}\\)) ?\\d{2}(?:\\d{3}|\\d[- ]\\d{2}[- ]|[ -]\\d{2}[ -]\\d)\\d{2}";
        return text.matches(regex);
    }

    @Test
    public static void test1_isPhone() {
        String testData = "0971132645";

        boolean result = isPhone(testData);

        Assert.assertTrue(result, "test1 failed");// если будет фолс, то вылетит ошибка, тест помещается как фейл, но тесты другие будут проганятсья дальше

    }

    @Test
    public static void test2_isPhone() {
        String testData = "fhrftdgf";

        boolean result = isPhone(testData);

        Assert.assertFalse(result, "test2 failed");
    }

    @Test
    public static void test3_isPhone() {
        String testData = "+380631132645";

        boolean result = isPhone(testData);

        if (result == true) {
            System.out.println("Test3 passed");
        } else {
            Assert.assertTrue(result, "test3 failed");// если будет фолс, то вылетит ошибка, тест помещается как фейл, но тесты другие будут проганятсья дальше
            //System.out.println("Test1 failed");
        }
    }

    @Test
    public static void test4_isPhone() {
        String testData = "+38(063)113 26 45";

        boolean result = isPhone(testData);

        if (result == true) {
            System.out.println("Test4 passed");
        } else {
            Assert.assertTrue(result, "test4 failed");// если будет фолс, то вылетит ошибка, тест помещается как фейл, но тесты другие будут проганятсья дальше
            //System.out.println("Test1 failed");
        }
    }

    @Test
    public static void test5_isPhone() {
        String testData = "+38(063)113 26 45";

        boolean result = isPhone(testData);

        if (result == true) {
            System.out.println("Test5 passed");
        } else {
            Assert.assertTrue(result, "test5 failed");// если будет фолс, то вылетит ошибка, тест помещается как фейл, но тесты другие будут проганятсья дальше
            //System.out.println("Test1 failed");
        }


    }

    @Test
    public static void test6_isPhone() {
        String testData = "063 My113-26-45";

        boolean result = isPhone(testData);

        Assert.assertTrue(result, "test6 failed");// если будет фолс, то вылетит ошибка, тест помещается как фейл, но тесты другие будут проганятсья дальше

    }
}

