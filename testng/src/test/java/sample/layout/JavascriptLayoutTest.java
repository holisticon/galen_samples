/**
 * 
 */
package sample.layout;

import org.testng.annotations.Test;

import util.testng.GalenBaseTest;

/**
 * @author mreinhardt
 *
 */
public class JavascriptLayoutTest extends GalenBaseTest {

	@Test(dataProvider = "devices")
	public void testJavascriptPage(final TestDevice device) throws Exception {
	    verifyPage("/javascript", device, "/specs/javascriptPageLayout.spec");
	}

}
