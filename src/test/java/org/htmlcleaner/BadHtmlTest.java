package org.htmlcleaner;

import junit.framework.TestCase;
import java.io.File;
import java.io.IOException;


public class BadHtmlTest extends TestCase {

    private HtmlCleaner cleaner;
    private CleanerProperties props;

    protected void setUp() throws Exception {
        cleaner = new HtmlCleaner();
        props = cleaner.getProperties();
        props.setAllowMovingNodesOutOfWrongEnclosingNodes(false);
    }

    public void testFieldsetNotInForm_shouldNotDieOutOfMemory() throws IOException {
        TagNode node = cleaner.clean(new File("src/test/resources/test10.html"));
        assertNotNull(node);
    }
}