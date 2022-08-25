package demo.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BaseDemoTest {

    @Test
    public void should_return_hello_world() {
        BaseDemo baseDemo = new BaseDemo();

        String expected = "Hello World";

        assertEquals(expected, baseDemo.print());
    }

    @Test
    public void should_return_sum1() {
        BaseDemo baseDemo = new BaseDemo();

        int expected = 20;

        assertEquals(expected, baseDemo.sum(10,10));
    }

    @Test
    public void should_return_sum2() {
        BaseDemo baseDemo = new BaseDemo();

        int expected = 15;

        assertEquals(expected, baseDemo.sum(7,8));
    }
}
