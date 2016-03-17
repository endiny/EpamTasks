package task3;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created on 17.03.16.
 *
 * @author Vladislav Boboshko
 */
public class HTMLPictureCheckerTest {
    @Test
    public void testRegex() throws Exception {
        System.out.println(System.getProperty("user.dir"));
        HTMLPictureChecker checker = new HTMLPictureChecker();
        assertTrue(checker.setFile("src/main/resources/Java.SE.03.Information handling_task_attachment.html"));
        checker.check();

    }
}