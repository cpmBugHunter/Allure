package ru.BugHunter;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by lysenko on 18.04.2017.
 */
public class AllureReportTests {

    @Test
    public void firstTestShouldPass(){
        int a = 5;
        Assert.assertEquals(5, a);
    }

    @Test
    public void secondTestShouldPass(){
        int a = 5;
        Assert.assertEquals(5, a);
    }

    @Test
    public void firstTestShouldFail(){
        int a = 5;
        Assert.assertEquals(3, a);
    }

    @Test
    public void secondTestShouldFail(){
        int a = 5;
        Assert.assertEquals(3, a);
    }
}
