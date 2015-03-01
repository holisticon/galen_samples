/**
 * 
 */
package sample.layout;

import org.junit.Test;

import sample.util.GalenBaseTest;

/**
 * @author mreinhardt
 *
 */
public class CssLayoutTest extends GalenBaseTest {
	
	/**
	 * @param pTestDevice
	 */
	public CssLayoutTest(TestDevice pTestDevice) {
		super(pTestDevice);
	}

	@Test
	public void testCssPage() throws Exception {
		verifyPage("/css","/specs/cssPageLayout.spec");
	}

}
