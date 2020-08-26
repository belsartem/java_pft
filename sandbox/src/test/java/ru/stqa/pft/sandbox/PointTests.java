package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

    @Test
    public void TestDistance() {

        Point p1 = new Point(12.4, 15.9);
        Point p2 = new Point(5.2, -17);

        Assert.assertEquals(p1.distance(p2), 33.678628238097815);
    }
}