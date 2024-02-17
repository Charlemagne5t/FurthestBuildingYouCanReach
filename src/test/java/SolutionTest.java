import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1(){
        int[] heights = {4,2,7,6,9,14,12};
        int bricks = 5;
        int ladders = 1;
        int expected = 4;
        int actual = new Solution().furthestBuilding(heights, bricks, ladders);
        Assert.assertEquals(expected, actual);
    }
}
