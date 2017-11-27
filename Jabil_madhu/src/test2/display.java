package test2;

import com.ibm.rational.test.lt.kernel.services.ITestLogManager;
import com.ibm.rational.test.lt.kernel.services.ITestExecutionServices;
/**import com.ibm.rational.test.lt.kernel.logging.IKLog;*/


/**
 * @author unknown
 */
public class display implements
		com.ibm.rational.test.lt.kernel.custom.ICustomCode2 {

	/**
	 * Instances of this will be created using the no-arg constructor.
	 */

	 public display () {
	}

	/**
	 * For javadoc of ICustomCode2 and ITestExecutionServices interfaces, select 'Help Contents' in the
	 * Help menu and select 'Extending Rational Performance Tester functionality' -> 'Extending test execution with custom code'
	 */
	public String exec(ITestExecutionServices tes, String[] args) {
		ITestLogManager itestLogManager = tes.getTestLogManager ();
		for(int i=0;i<args.length; i++){
		/**	ITestLogManager testLogManager;*/
			itestLogManager.reportMessage("Argument"+i+":"+args[i]);
			}

		    itestLogManager.reportMessage("Jabil SAML okta code");
			return null;

	}

}