/**@generated
 * WARNING  Changes you make to this file may be lost.
 *           File is generated and may be re-generated without warning.
 * @RPT-Core-generated Version 8.6
 */
/******************************************************************
* Licensed Materials - Property of IBM
* IBM Rational Test Workbench
* Copyright IBM Corporation 2013. All Rights Reserved.
* 
* U.S. Government Users Restricted Rights - Use, duplication or 
* disclosure restricted by GSA ADP Schedule Contract with IBM Corp.
******************************************************************/
/* TestScript.template - Suitable for collaborative code generation */
package test;

import com.ibm.rational.test.lt.datacorrelation.datapoolAction.Datapool;
import com.ibm.rational.test.lt.datacorrelation.datapoolAction.DatapoolAction;
import com.ibm.rational.test.lt.datacorrelation.execution.action.CustomCodeAction;
import com.ibm.rational.test.lt.datacorrelation.execution.action.VariableAction;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataCorrelationVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataHarvester;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDCArray;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDCCoreVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDataCorrelationVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDataHarvester;
import com.ibm.rational.test.lt.datacorrelation.execution.proto.ProtoAdapterHandler;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.DataSub;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.IDataSub;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.ISubRule;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.SubRule;
import com.ibm.rational.test.lt.datatransform.adapters.DataTransformAction;
import com.ibm.rational.test.lt.datatransform.adapters.IDataTransform;
import com.ibm.rational.test.lt.execution.core.IContentVPElement;
import com.ibm.rational.test.lt.execution.core.impl.ArmableTransaction;
import com.ibm.rational.test.lt.execution.core.impl.CaseSensitivityType;
import com.ibm.rational.test.lt.execution.core.impl.ContentVPElement;
import com.ibm.rational.test.lt.execution.core.impl.ErrorStringType;
import com.ibm.rational.test.lt.execution.core.impl.LTTestScript;
import com.ibm.rational.test.lt.execution.core.impl.MetaString;
import com.ibm.rational.test.lt.execution.core.impl.ZipEntryProxy;
import com.ibm.rational.test.lt.execution.http.IBasicAuthentication;
import com.ibm.rational.test.lt.execution.http.IConnectionRecord;
import com.ibm.rational.test.lt.execution.http.IHTTPRequest;
import com.ibm.rational.test.lt.execution.http.IHTTPSessionTypes;
import com.ibm.rational.test.lt.execution.http.INtlmAuthenticationContext;
import com.ibm.rational.test.lt.execution.http.ISSLInfo;
import com.ibm.rational.test.lt.execution.http.connection.IConnectionLimitsAlgorithm;
import com.ibm.rational.test.lt.execution.http.impl.ConfigConnection;
import com.ibm.rational.test.lt.execution.http.impl.DynamicHTTPRequestsContainer;
import com.ibm.rational.test.lt.execution.http.impl.HTTPAction;
import com.ibm.rational.test.lt.execution.http.impl.HTTPPage;
import com.ibm.rational.test.lt.execution.http.impl.HTTPParallel;
import com.ibm.rational.test.lt.execution.http.impl.HTTPPostData;
import com.ibm.rational.test.lt.execution.http.impl.HTTPPostDataChunk;
import com.ibm.rational.test.lt.execution.http.impl.HTTPRequest;
import com.ibm.rational.test.lt.execution.http.impl.HTTPThink;
import com.ibm.rational.test.lt.execution.http.impl.INextActionGenerator;
import com.ibm.rational.test.lt.execution.http.impl.PerHostPortConnectionAlgorithm;
import com.ibm.rational.test.lt.execution.http.impl.RequestHeaderData;
import com.ibm.rational.test.lt.execution.http.impl.SSLInfo;
import com.ibm.rational.test.lt.execution.http.tes.*;
import com.ibm.rational.test.lt.execution.http.util.ConnectionRecordFactory;
import com.ibm.rational.test.lt.execution.http.util.CookieCacheUtil;
import com.ibm.rational.test.lt.execution.http.util.HTTPDataArea;
import com.ibm.rational.test.lt.execution.http.util.PageCacheUtil;
import com.ibm.rational.test.lt.execution.http.vp.impl.SubstitutableHTTPContentVP;
import com.ibm.rational.test.lt.execution.protocol.IProxyServerInfo;
import com.ibm.rational.test.lt.execution.protocol.impl.HTTPTestScriptHelper;
import com.ibm.rational.test.lt.kernel.IDataArea;
import com.ibm.rational.test.lt.kernel.action.IContainer;
import com.ibm.rational.test.lt.kernel.action.IKAction;
import com.ibm.rational.test.lt.kernel.action.IKTimeoutControl;
import com.ibm.rational.test.lt.kernel.action.impl.For;
import com.ibm.rational.test.lt.kernel.action.impl.KAction;
import com.ibm.rational.test.lt.kernel.action.impl.KThrow;
import com.ibm.rational.test.lt.kernel.custom.ICustomCode2;
import com.ibm.rational.test.lt.kernel.dc.IKDCCoreVar;
import com.ibm.rational.test.lt.kernel.services.*;
import com.ibm.rational.test.lt.kernel.services.ITestExecutionServices;
import com.ibm.rational.test.lt.kernel.services.RPTCustomCodeExceptionEvent;
import com.ibm.rational.test.lt.kernel.services.RPTCustomCodeVPFailureEvent;
import com.ibm.rational.test.lt.kernel.services.RPTEvent;
import com.ibm.rational.test.lt.kernel.services.RPTEventStructure;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("all")
public class Testcase_4_prod__Test_A1E776C649B74840EC3BE23533313434 extends LTTestScript  {

    static ProtoAdapterHandler pa = new ProtoAdapterHandler();
    static {           
        pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.protocol.core.CoreProtoAdapter", "coreAdapter");
pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.http.HTTPActionAdapter", "com.ibm.rational.test.lt.execution.http.impl.HTTPPostDataChunk");
pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.http.HTTPActionAdapter", "com.ibm.rational.test.lt.execution.http.impl.HTTPAction");
    }
	private IDataCorrelationVar[] dcVars = DataCorrelationVar.getArrayDCVars(52);
	private DataVar[] vars = new DataVar[35];
	
    private IContentVPElement contVPElem_0 = new ContentVPElement("jabil", 
                          -1, ErrorStringType.LITERAL, CaseSensitivityType.INSENSITIVE);
private IContentVPElement contVPElem_1 = new ContentVPElement("Jabil Circuit", 
                          -1, ErrorStringType.LITERAL, CaseSensitivityType.INSENSITIVE);
private IContentVPElement contVPElem_2 = new ContentVPElement("success", 
                          -1, ErrorStringType.LITERAL, CaseSensitivityType.INSENSITIVE);
private IContentVPElement contVPElem_3 = new ContentVPElement("stateToken", 
                          -1, ErrorStringType.LITERAL, CaseSensitivityType.INSENSITIVE);
private IContentVPElement contVPElem_4 = new ContentVPElement("scvisibility", 
                          -1, ErrorStringType.LITERAL, CaseSensitivityType.INSENSITIVE);
private IContentVPElement contVPElem_5 = new ContentVPElement("profileName", 
                          -1, ErrorStringType.LITERAL, CaseSensitivityType.INSENSITIVE);
private IContentVPElement contVPElem_6 = new ContentVPElement("earthquake", 
                          -1, ErrorStringType.LITERAL, CaseSensitivityType.INSENSITIVE);
private IContentVPElement contVPElem_7 = new ContentVPElement("cityName", 
                          -1, ErrorStringType.LITERAL, CaseSensitivityType.INSENSITIVE);
    
private HTTPTestScriptHelper httpTestScriptHelper;

	private HTTPTestScriptHelper getHTTPTest() {
		return httpTestScriptHelper;
	}

	
	public Testcase_4_prod__Test_A1E776C649B74840EC3BE23533313434(IContainer container, String invocationId) {
		super(container, "Testcase_4(prod)", invocationId, "A1E776C649B74840EC3BE23533313434");
		setArmEnabled(false);
		stopAtYourConvenience=false;
		this.httpTestScriptHelper = new HTTPTestScriptHelper(this);
        setTimeoutDuration(240000);
        setTimeoutScheme(IKTimeoutControl.CONTINUE);

	}

    public void execute() {
    	try {
				CookieCacheUtil.clearCookieCache((ITestExecutionServices)this);
	PageCacheUtil.clearPageCache((ITestExecutionServices)this);
	PageCacheUtil.setCacheEmulation((ITestExecutionServices)this, true);

	    		if (!isScheduleRun()) setThinkMax(2000);
	
	if (!isScheduleRun()){
this.addEventBehavior(new RPTEventStructure(new HTTPPageTitleVPEvent(), new RPTContinueEvent("Page title verification failed"), 1, "Page title verification failed"));
	this.addEventBehavior(new RPTEventStructure(new HTTPResponseCodeVPEvent(), new RPTContinueEvent("Response code verification failed"), 1, "Response code verification failed"));
	this.addEventBehavior(new RPTEventStructure(new HTTPResponseSizeVPEvent(), new RPTContinueEvent("Response size verification failed"), 1, "Response size verification failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTFailVPEvent(), new RPTContinueEvent("Content Verification Point failed"), 1, "Content Verification Point failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTConnectEvent(), new RPTContinueEvent("Connection failed"), 1, "Connection failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTAuthenticationEvent(), new RPTContinueEvent("Authentication failed"), 1, "Authentication failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTDataPoolEOFEvent(), new RPTStopUserEvent("End of datapool reached"), 1, "End of datapool reached"));
	this.addEventBehavior(new RPTEventStructure(new RPTReferenceEvent(), new RPTContinueEvent("Failed to extract reference"), 1, "Failed to extract reference"));
	this.addEventBehavior(new RPTEventStructure(new RPTSubstitutionEvent(), new RPTContinueEvent("Substitution failed"), 1, "Substitution failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTServerTimeoutEvent(), new RPTContinueEvent("Timeout"), 1, "Timeout"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeVPFailureEvent(), new RPTContinueEvent("Custom Verification Point failed"), 1, "Custom Verification Point failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeAlertEvent(), new RPTContinueEvent("Custom Code reported an Alert"), 0, "Custom Code reported an Alert"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeExceptionEvent(), new RPTStopUserEvent("Custom Code reported an unhandled exception"), 1, "Custom Code reported an unhandled exception"));
	}
	
	
	        	this.add(dataTransform(this));
	this.add(datapool_1(this));
	this.add(datapool_2(this));
	this.add(varAction_1(this));
	this.add(confCon_1(this));
	this.add(confCon_2(this));
	this.add(confCon_3(this));
	this.add(confCon_4(this));
	this.add(confCon_5(this));
	this.add(confCon_6(this));
	this.add(confCon_7(this));
	this.add(confCon_8(this));
	this.add(confCon_9(this));
	this.add(confCon_10(this));
	this.add(confCon_11(this));
	this.add(confCon_12(this));
	this.add(confCon_13(this));
	this.add(confCon_14(this));
	this.add(confCon_15(this));
		For loopNm_2 = Loop_1(this);
		this.add(loopNm_2);
		loopNm_2.addVarsToInit(Arrays.asList((IKDCCoreVar)vars[9],(IKDCCoreVar)vars[10],(IKDCCoreVar)vars[0]));
		
			this.httpTestScriptHelper.executeHelper();

	    } catch (Throwable e) {
		     log("Test Execution: Testcase_4_prod__Test_A1E776C649B74840EC3BE23533313434 ",e);
	    } finally {
	        super.execute();
		}	    
    }
    
	public void preFinish() {
		this.httpTestScriptHelper.preFinishHelper();

		super.preFinish();
	}
	
	public void stop() {
		
		super.stop();
	}	
	
	private KAction dataTransform(IContainer parent) {
		DataTransformAction action = 
			new DataTransformAction(parent, "Data Transform Action");

		action.setMapFile("A1E776C649B74840EC3BE23533313434");

		// Control file contains transforms 
		// com.ibm.rational.test.lt.datatransform.adapters.impl.XMLAdapterVERSION_0

		return action;
	}

	private DatapoolAction datapool_1(IContainer parent) {
		DatapoolAction dpAction = new DatapoolAction(parent, "A1E77840ADA48594CE92E16262343336", "A1E778F5A38AE940C93EB26232326437");
		Datapool dp = new Datapool(
				 "/A1E77840ADA48594CE92E16262343336.datapool",
				 0,
				 false,
				 true,
				 Datapool.SEQUENTIAL,
				 null, 0);
		dp.addHarvestInstruction("Variable1", dcVars[0], false);
		dpAction.setDatapool(dp);
		return dpAction;
	}


	private DatapoolAction datapool_2(IContainer parent) {
		DatapoolAction dpAction = new DatapoolAction(parent, "A1E7784069C90030CE92E16262343336", "A1E778F5BDCC4150C93EB26232326437");
		Datapool dp = new Datapool(
				 "/A1E7784069C90030CE92E16262343336.datapool",
				 0,
				 true,
				 false,
				 Datapool.SEQUENTIAL,
				 null, 0);
		dp.addHarvestInstruction("testcase4_countries", dcVars[1], false);
		dpAction.setDatapool(dp);
		return dpAction;
	}

private VariableAction varAction_1(final IContainer parent) {

	VariableAction vc = new VariableAction(parent, "", "A1E7768D2B4DBA4CD202B93534383732");	
			vars[0] = new DataVar("ProdTestcase6_Host", "www.scvisibility.com", IDataArea.TEST, "IGNORE", false, false);

	
		vars[1] = new DataVar("ProdTestcase6_Host_1", "ibm.tilehosting.com", IDataArea.TEST, "IGNORE", false, false);

	
		vars[2] = new DataVar("ProdTestcase6_Host_2", "nominatim.openstreetmap.org", IDataArea.TEST, "IGNORE", false, false);

	
		vars[3] = new DataVar("ProdTestcase6_Host_3", "clients2.google.com", IDataArea.TEST, "IGNORE", false, false);

	
		vars[4] = new DataVar("ProdTestcase6_Host_4", "safebrowsing.google.com", IDataArea.TEST, "IGNORE", false, false);

	
		vars[5] = new DataVar("ProdTestcase6_Host_5", "safebrowsing-cache.google.com", IDataArea.TEST, "IGNORE", false, false);

	
		vars[6] = new DataVar("ProdTestcase6_Host_6", "fonts.gstatic.com", IDataArea.TEST, "IGNORE", false, false);

	
		vars[7] = new DataVar("ProdTestcase6_Host_7", "openmaptiles.github.io", IDataArea.TEST, "IGNORE", false, false);

	
		vars[8] = new DataVar("ProdTestcase6_Host_8", "fonts.googleapis.com", IDataArea.TEST, "IGNORE", false, false);

	
		vars[9] = new DataVar("ProdTestcase6_Host_9", "sso.scvisibility.com", IDataArea.TEST, "IGNORE", false, false);

	
		vars[10] = new DataVar("ProdTestcase6_Host_10", "jabil.okta.com", IDataArea.TEST, "IGNORE", false, false);

	
		vars[11] = new DataVar("ProdTestcase6_Host_11", "login.okta.com", IDataArea.TEST, "IGNORE", false, false);

	
		vars[12] = new DataVar("ProdTestcase6_Host_12", "www.google.com", IDataArea.TEST, "IGNORE", false, false);

	
		vars[13] = new DataVar("ProdTestcase6_Host_13", "ssl.gstatic.com", IDataArea.TEST, "IGNORE", false, false);

	
		vars[14] = new DataVar("ProdTestcase6_Host_14", "clients1.google.com", IDataArea.TEST, "IGNORE", false, false);

	
		vars[15] = new DataVar("ProdTestcase6_Host_15", "clients4.google.com", IDataArea.TEST, "IGNORE", false, false);

	
		vars[16] = new DataVar("ProdTestcase6_Host_16", "translate.googleapis.com", IDataArea.TEST, "IGNORE", false, false);

	
		vars[17] = new DataVar("ProdTestcase6_Host_2_Port", "443", IDataArea.TEST, "IGNORE", false, false);

	
		vars[18] = new DataVar("ProdTestcase6_Host_3_Port", "443", IDataArea.TEST, "IGNORE", false, false);

	
		vars[19] = new DataVar("ProdTestcase6_Host_5_Port", "443", IDataArea.TEST, "IGNORE", false, false);

	
		vars[20] = new DataVar("ProdTestcase6_Host_1_Port", "443", IDataArea.TEST, "IGNORE", false, false);

	
		vars[21] = new DataVar("ProdTestcase6_Host_6_Port", "443", IDataArea.TEST, "IGNORE", false, false);

	
		vars[22] = new DataVar("ProdTestcase6_Host_7_Port", "443", IDataArea.TEST, "IGNORE", false, false);

	
		vars[23] = new DataVar("ProdTestcase6_Host_8_Port", "443", IDataArea.TEST, "IGNORE", false, false);

	
		vars[24] = new DataVar("ProdTestcase6_Host_4_Port", "443", IDataArea.TEST, "IGNORE", false, false);

	
		vars[25] = new DataVar("ProdTestcase6_Host_Port", "443", IDataArea.TEST, "IGNORE", false, false);

	
		vars[26] = new DataVar("ProdTestcase6_Host_11_Port", "443", IDataArea.TEST, "IGNORE", false, false);

	
		vars[27] = new DataVar("ProdTestcase6_Host_10_Port", "443", IDataArea.TEST, "IGNORE", false, false);

	
		vars[28] = new DataVar("ProdTestcase6_Host_9_Port", "443", IDataArea.TEST, "IGNORE", false, false);

	
		vars[29] = new DataVar("ProdTestcase6_Host_Port_1", "80", IDataArea.TEST, "IGNORE", false, false);

	
		vars[30] = new DataVar("ProdTestcase6_Host_13_Port", "443", IDataArea.TEST, "IGNORE", false, false);

	
		vars[31] = new DataVar("ProdTestcase6_Host_12_Port", "443", IDataArea.TEST, "IGNORE", false, false);

	
		vars[32] = new DataVar("ProdTestcase6_Host_14_Port", "443", IDataArea.TEST, "IGNORE", false, false);

	
		vars[33] = new DataVar("ProdTestcase6_Host_15_Port", "443", IDataArea.TEST, "IGNORE", false, false);

	
		vars[34] = new DataVar("ProdTestcase6_Host_16_Port", "443", IDataArea.TEST, "IGNORE", false, false);

		
	vc.add(vars);
	return vc;
	
}

	private IKAction confCon_1(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = new SSLInfo("TLSv1.2", "OFF", "SSL_ECDHE_RSA_WITH_AES_128_CBC_SHA");
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_1",
					(String)(vars[16].getValue()== null?"translate.googleapis.com": (String)vars[16].getValue()),  // host name
					Integer.parseInt((String)(vars[34].getValue()== null?"443": (String)vars[34].getValue())), 
					sslInfo,  // SSL info
					null,  // NTLM info
					proxyServerInfo  // proxy server info
				);
				ConfigConnection.storeConfigConnection(this, conn);
				finish();
			}
		};
		return action;		
	}


	private IKAction confCon_2(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = new SSLInfo("TLSv1.2", "OFF", "SSL_ECDHE_ECDSA_WITH_AES_128_CBC_SHA");
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_2",
					(String)(vars[15].getValue()== null?"clients4.google.com": (String)vars[15].getValue()),  // host name
					Integer.parseInt((String)(vars[33].getValue()== null?"443": (String)vars[33].getValue())), 
					sslInfo,  // SSL info
					null,  // NTLM info
					proxyServerInfo  // proxy server info
				);
				ConfigConnection.storeConfigConnection(this, conn);
				finish();
			}
		};
		return action;		
	}


	private IKAction confCon_3(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = new SSLInfo("TLSv1.2", "OFF", "SSL_ECDHE_ECDSA_WITH_AES_128_CBC_SHA");
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_3",
					(String)(vars[14].getValue()== null?"clients1.google.com": (String)vars[14].getValue()),  // host name
					Integer.parseInt((String)(vars[32].getValue()== null?"443": (String)vars[32].getValue())), 
					sslInfo,  // SSL info
					null,  // NTLM info
					proxyServerInfo  // proxy server info
				);
				ConfigConnection.storeConfigConnection(this, conn);
				finish();
			}
		};
		return action;		
	}


	private IKAction confCon_4(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = new SSLInfo("TLSv1.2", "OFF", "SSL_ECDHE_RSA_WITH_AES_128_CBC_SHA");
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_4",
					(String)(vars[12].getValue()== null?"www.google.com": (String)vars[12].getValue()),  // host name
					Integer.parseInt((String)(vars[31].getValue()== null?"443": (String)vars[31].getValue())), 
					sslInfo,  // SSL info
					null,  // NTLM info
					proxyServerInfo  // proxy server info
				);
				ConfigConnection.storeConfigConnection(this, conn);
				finish();
			}
		};
		return action;		
	}


	private IKAction confCon_5(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = new SSLInfo("TLSv1.2", "OFF", "SSL_ECDHE_ECDSA_WITH_AES_128_CBC_SHA");
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_5",
					(String)(vars[13].getValue()== null?"ssl.gstatic.com": (String)vars[13].getValue()),  // host name
					Integer.parseInt((String)(vars[30].getValue()== null?"443": (String)vars[30].getValue())), 
					sslInfo,  // SSL info
					null,  // NTLM info
					proxyServerInfo  // proxy server info
				);
				ConfigConnection.storeConfigConnection(this, conn);
				finish();
			}
		};
		return action;		
	}


	private IKAction confCon_6(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = null;
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_6",
					(String)(vars[0].getValue()== null?"www.scvisibility.com": (String)vars[0].getValue()),  // host name
					Integer.parseInt((String)(vars[29].getValue()== null?"80": (String)vars[29].getValue())), 
					sslInfo,  // SSL info
					null,  // NTLM info
					proxyServerInfo  // proxy server info
				);
				ConfigConnection.storeConfigConnection(this, conn);
				finish();
			}
		};
		return action;		
	}


	private IKAction confCon_7(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = new SSLInfo("TLSv1.2", "ON", "SSL_DHE_RSA_WITH_AES_128_GCM_SHA256");
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_7",
					(String)(vars[9].getValue()== null?"sso.scvisibility.com": (String)vars[9].getValue()),  // host name
					Integer.parseInt((String)(vars[28].getValue()== null?"443": (String)vars[28].getValue())), 
					sslInfo,  // SSL info
					null,  // NTLM info
					proxyServerInfo  // proxy server info
				);
				ConfigConnection.storeConfigConnection(this, conn);
				finish();
			}
		};
		return action;		
	}


	private IKAction confCon_8(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = new SSLInfo("TLSv1.2", "ON", "SSL_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_8",
					(String)(vars[10].getValue()== null?"jabil.okta.com": (String)vars[10].getValue()),  // host name
					Integer.parseInt((String)(vars[27].getValue()== null?"443": (String)vars[27].getValue())), 
					sslInfo,  // SSL info
					null,  // NTLM info
					proxyServerInfo  // proxy server info
				);
				ConfigConnection.storeConfigConnection(this, conn);
				finish();
			}
		};
		return action;		
	}


	private IKAction confCon_9(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = new SSLInfo("TLSv1.2", "ON", "SSL_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_9",
					(String)(vars[11].getValue()== null?"login.okta.com": (String)vars[11].getValue()),  // host name
					Integer.parseInt((String)(vars[26].getValue()== null?"443": (String)vars[26].getValue())), 
					sslInfo,  // SSL info
					null,  // NTLM info
					proxyServerInfo  // proxy server info
				);
				ConfigConnection.storeConfigConnection(this, conn);
				finish();
			}
		};
		return action;		
	}


	private IKAction confCon_10(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = new SSLInfo("TLSv1.2", "ON", "SSL_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_10",
					(String)(vars[0].getValue()== null?"www.scvisibility.com": (String)vars[0].getValue()),  // host name
					Integer.parseInt((String)(vars[25].getValue()== null?"443": (String)vars[25].getValue())), 
					sslInfo,  // SSL info
					null,  // NTLM info
					proxyServerInfo  // proxy server info
				);
				ConfigConnection.storeConfigConnection(this, conn);
				finish();
			}
		};
		return action;		
	}


	private IKAction confCon_11(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = new SSLInfo("TLSv1.2", "OFF", "SSL_ECDHE_RSA_WITH_AES_128_CBC_SHA");
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_12",
					(String)(vars[8].getValue()== null?"fonts.googleapis.com": (String)vars[8].getValue()),  // host name
					Integer.parseInt((String)(vars[23].getValue()== null?"443": (String)vars[23].getValue())), 
					sslInfo,  // SSL info
					null,  // NTLM info
					proxyServerInfo  // proxy server info
				);
				ConfigConnection.storeConfigConnection(this, conn);
				finish();
			}
		};
		return action;		
	}


	private IKAction confCon_12(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = new SSLInfo("TLSv1.2", "OFF", "SSL_ECDHE_RSA_WITH_AES_128_CBC_SHA256");
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_13",
					(String)(vars[7].getValue()== null?"openmaptiles.github.io": (String)vars[7].getValue()),  // host name
					Integer.parseInt((String)(vars[22].getValue()== null?"443": (String)vars[22].getValue())), 
					sslInfo,  // SSL info
					null,  // NTLM info
					proxyServerInfo  // proxy server info
				);
				ConfigConnection.storeConfigConnection(this, conn);
				finish();
			}
		};
		return action;		
	}


	private IKAction confCon_13(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = new SSLInfo("TLSv1.2", "OFF", "SSL_ECDHE_ECDSA_WITH_AES_128_CBC_SHA");
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_14",
					(String)(vars[6].getValue()== null?"fonts.gstatic.com": (String)vars[6].getValue()),  // host name
					Integer.parseInt((String)(vars[21].getValue()== null?"443": (String)vars[21].getValue())), 
					sslInfo,  // SSL info
					null,  // NTLM info
					proxyServerInfo  // proxy server info
				);
				ConfigConnection.storeConfigConnection(this, conn);
				finish();
			}
		};
		return action;		
	}


	private IKAction confCon_14(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = new SSLInfo("TLSv1.2", "OFF", "SSL_ECDHE_ECDSA_WITH_AES_128_CBC_SHA");
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_15",
					(String)(vars[1].getValue()== null?"ibm.tilehosting.com": (String)vars[1].getValue()),  // host name
					Integer.parseInt((String)(vars[20].getValue()== null?"443": (String)vars[20].getValue())), 
					sslInfo,  // SSL info
					null,  // NTLM info
					proxyServerInfo  // proxy server info
				);
				ConfigConnection.storeConfigConnection(this, conn);
				finish();
			}
		};
		return action;		
	}


	private IKAction confCon_15(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = new SSLInfo("TLSv1.2", "OFF", "SSL_ECDHE_ECDSA_WITH_AES_128_CBC_SHA");
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_16",
					(String)(vars[5].getValue()== null?"safebrowsing-cache.google.com": (String)vars[5].getValue()),  // host name
					Integer.parseInt((String)(vars[19].getValue()== null?"443": (String)vars[19].getValue())), 
					sslInfo,  // SSL info
					null,  // NTLM info
					proxyServerInfo  // proxy server info
				);
				ConfigConnection.storeConfigConnection(this, conn);
				finish();
			}
		};
		return action;		
	}

	private For Loop_1(IContainer parent) {
		For forLoop = new For(parent,
				 "Loop2",
				 "A1E77B33F0178030E095B23534633538",
				 0,
				 0,
				 0,
				 1,
				 1,
				 true, 
				 false) {

			
		  
		    public void executeLoop() { 
		    	
	
	
	
	               
				this.add(datapool_2(this));
	this.add(datapool_1(this));
	this.add(new CustomCode_1(this, dcVars[2]));
	this.add(transaction_1(this));
	this.add(transaction_2(this));
	this.add(transaction_3(this));
		For loopNm_1 = Loop_2(this);
		this.add(loopNm_1);
		loopNm_1.addVarsToInit(Arrays.asList((IKDCCoreVar)vars[0]));
		
	this.add(transaction_6(this));
			super.executeLoop();
		    }
		
		};
		return forLoop;
	}

	public class CustomCode_1 extends CustomCodeAction {

		IDataCorrelationVar outVar;
		/**
		 * @param parent
		 * @param name
		 */
		public CustomCode_1(IContainer parent, IDataCorrelationVar outVar) {
			super(parent, "er2.Clearcook", "A1E776C488007B50D4A1B83438373139");
			this.outVar = outVar;
		}
	
		/**
		 * @see com.ibm.rational.test.lt.kernel.action.IKAction#execute()
		 */
		public void execute() {
		
				
	
	
	
	
	
	
			IDCCoreVar[] inputVars = {
				
			};
			
			ICustomCode2 ccclass = 	new er2.Clearcook();
			
			setCCClass(ccclass);
			setInputVars(inputVars);
			setOutVar(outVar);
			
			super.execute();

		}
	}




	private ArmableTransaction transaction_1(final IContainer parent) {
		ArmableTransaction trx = new ArmableTransaction(parent, "Okta_Homepage", "A1E7768D2BB025CFD202B93534383732") {
		
		    public void execute() {     
		       	
	
	
	
	      
                	this.add(page_1(this));
	this.add(page_2(this));
	this.add(page_3(this));

		     
                super.execute();
            }
        
            public void finish(IKAction child) {
                super.finish(child);
                if (hasFinished()) {
                    
                }
            }
		};
		trx.setArmEnabled(false);
		return trx;
	}

private HTTPPage page_1(final IContainer parent) {
			HTTPThink think = new HTTPThink(20, 1000, parent, parent, "A1E7777C0D7BD9C0DCF4B83631323436");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "Incontrol_1_Login", "A1E7777C0D7BD9C0DCF4B83631323436") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(1, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_1(this, true, "A1E7768D2BB073A0D202B93534383732", true, true,
						"Config_6", "www.scvisibility.com/",	"/", true, false), 0, "null", 3);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_1(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2BB09AB5D202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Proxy-Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, sdch", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_1 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_1);

	harvestContainer_1.addHarvestInstruction ("resp_hdr_Location_1", dcVars[3], "http.{0,1}://.*?(/.*)", 1, 0, 0, 0, false, "Location", null, 0, false);
	IDataSub subContainer_1 = new DataSub();
	reqAction.addDataSub(subContainer_1);

		ISubRule sub_0 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_199", null, 0, false);
	subContainer_1.addSubInstruction(sub_0);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2BB09AB8D202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(302);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("http://");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
private HTTPPage page_2(final IContainer parent) {
			HTTPThink think = new HTTPThink(20, 1000, parent, parent, "A1E7777DB8D5DBD0DCF4B83631323436");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "CIS_1_Login", "A1E7777DB8D5DBD0DCF4B83631323436") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(2, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_2(this, true, "A1E7768D2BB0E8DFD202B93534383732", false, false,
						"Config_7", "sso.scvisibility.com:443/FIM/sps/JABLPNodejsSAML20/saml20/logininitial?RequestBinding=HTTPPost&PartnerId=https%3A%2F%2Fwww.scvisibility.com%2Fauth%2Fsso%2Fcallback%2F&NameIdFormat=email&SAMLRequest=nVRNj9owEP0rkQ%2B9kS%2BWD7kExIJWpWK3EdAeelkZe9h169ipxwH239cJpEJqF6koB0ueNzNv3jxnNDkWKtiDRWl0RpIwJpPxCFmhSjqt3Ktewa8K0AUeppE2gYxUVlPDUCLVrACkjtP19HFJ0zCmpTXOcKNIsJhn5LnfHya9u95ODO%2F6oidi3t0yEnxrG%2FoMD0SsYKHRMe38VZwMOvGwEyebeEC7KU0H4bCbfidBfi59L7WQ%2BuU6j%2B0JhPTTZpN38i%2FrDQmmiGCdbzwzGqsC7BrsXnL4ulpm5NW5EmkUHQ6HEPleotxKJd1byE0RMa9FhGgizpTaMv6TBHMvi9TMNXO0yR7yd%2FLD4jHCEqPP0%2Ftl%2FmQE%2FMCaZhpHtZ7%2BUOZFav85ydTkrHg7ZE0%2FN%2Bg%2BsKL8mDPrNNiFyP6PbdRkP3mRFuLB2IK5DAomFTntmjYbsBdLvq4ta3UkY6OhYf9cZ42ii2qtjZqu89woyd9usdGZ77voJEyaGyk6uwZKm9GmQlhA9EtXyhxmFpiDjDhbAYlaamepQTRW96ZwcLzJ6jNTlMxKrK0AR8ZdK%2Bxl4Znyuq1gd4vMV2Gc8rq0v879cTBW1C8FuB9sY5nG0lh3Xs2%2F%2BIxPsXfk%2BBO9%2FB2MfwM%3D",	"/FIM/sps/JABLPNodejsSAML20/saml20/logininitial?RequestBinding=HTTPPost&PartnerId=https%3A%2F%2Fwww.scvisibility.com%2Fauth%2Fsso%2Fcallback%2F&NameIdFormat=email&SAMLRequest=nVRNj9owEP0rkQ%2B9kS%2BWD7kExIJWpWK3EdAeelkZe9h169ipxwH239cJpEJqF6koB0ueNzNv3jxnNDkWKtiDRWl0RpIwJpPxCFmhSjqt3Ktewa8K0AUeppE2gYxUVlPDUCLVrACkjtP19HFJ0zCmpTXOcKNIsJhn5LnfHya9u95ODO%2F6oidi3t0yEnxrG%2FoMD0SsYKHRMe38VZwMOvGwEyebeEC7KU0H4bCbfidBfi59L7WQ%2BuU6j%2B0JhPTTZpN38i%2FrDQmmiGCdbzwzGqsC7BrsXnL4ulpm5NW5EmkUHQ6HEPleotxKJd1byE0RMa9FhGgizpTaMv6TBHMvi9TMNXO0yR7yd%2FLD4jHCEqPP0%2Ftl%2FmQE%2FMCaZhpHtZ7%2BUOZFav85ydTkrHg7ZE0%2FN%2Bg%2BsKL8mDPrNNiFyP6PbdRkP3mRFuLB2IK5DAomFTntmjYbsBdLvq4ta3UkY6OhYf9cZ42ii2qtjZqu89woyd9usdGZ77voJEyaGyk6uwZKm9GmQlhA9EtXyhxmFpiDjDhbAYlaamepQTRW96ZwcLzJ6jNTlMxKrK0AR8ZdK%2Bxl4Znyuq1gd4vMV2Gc8rq0v879cTBW1C8FuB9sY5nG0lh3Xs2%2F%2BIxPsXfk%2BBO9%2FB2MfwM%3D", true, false), 0, "null", 3);
				httpParallel.addRequest(0, request_3(this, false, "A1E7768D2BB0E8DFD202B93534383732", false, true,
						"Config_7", "sso.scvisibility.com:443/EAI/Responder?TAM_OP=login&USERNAME=unauthenticated&ERROR_CODE=0x00000000&ERROR_TEXT=HPDBA0521I%20%20%20Successful%20completion&METHOD=GET&URL=%2FFIM%2Fsps%2FJABLPNodejsSAML20%2Fsaml20%2Flogininitial%3FRequestBinding%3DHTTPPost%26PartnerId%3Dhttps%253A%252F%252Fwww.scvisibility.com%252Fauth%252Fsso%252Fcallback%252F%26NameIdFormat%3Demail%26SAMLRequest%3DnVRNj9owEP0rkQ%252B9kS%252BWD7kExIJWpWK3EdAeelkZe9h169ipxwH239cJpEJqF6koB0ueNzNv3jxnNDkWKtiDRWl0RpIwJpPxCFmhSjqt3Ktewa8K0AUeppE2gYxUVlPDUCLVrACkjtP19HFJ0zCmpTXOcKNIsJhn5LnfHya9u95ODO%252F6oidi3t0yEnxrG%252FoMD0SsYKHRMe38VZwMOvGwEyebeEC7KU0H4bCbfidBfi59L7WQ%252BuU6j%252B0JhPTTZpN38i%252FrDQmmiGCdbzwzGqsC7BrsXnL4ulpm5NW5EmkUHQ6HEPleotxKJd1byE0RMa9FhGgizpTaMv6TBHMvi9TMNXO0yR7yd%252FLD4jHCEqPP0%252Ftl%252FmQE%252FMCaZhpHtZ7%252BUOZFav85ydTkrHg7ZE0%252FN%252Bg%252BsKL8mDPrNNiFyP6PbdRkP3mRFuLB2IK5DAomFTntmjYbsBdLvq4ta3UkY6OhYf9cZ42ii2qtjZqu89woyd9usdGZ77voJEyaGyk6uwZKm9GmQlhA9EtXyhxmFpiDjDhbAYlaamepQTRW96ZwcLzJ6jNTlMxKrK0AR8ZdK%252Bxl4Znyuq1gd4vMV2Gc8rq0v879cTBW1C8FuB9sY5nG0lh3Xs2%252F%252BIxPsXfk%252BBO9%252FB2MfwM%253D&REFERER=&HOSTNAME=sso.scvisibility.com&AUTHNLEVEL=&FAILREASON=&PROTOCOL=https&OLDSESSION=&EXPIRE_SECS=0",	"/EAI/Responder?TAM_OP=login&USERNAME=unauthenticated&ERROR_CODE=0x00000000&ERROR_TEXT=HPDBA0521I%20%20%20Successful%20completion&METHOD=GET&URL=%2FFIM%2Fsps%2FJABLPNodejsSAML20%2Fsaml20%2Flogininitial%3FRequestBinding%3DHTTPPost%26PartnerId%3Dhttps%253A%252F%252Fwww.scvisibility.com%252Fauth%252Fsso%252Fcallback%252F%26NameIdFormat%3Demail%26SAMLRequest%3DnVRNj9owEP0rkQ%252B9kS%252BWD7kExIJWpWK3EdAeelkZe9h169ipxwH239cJpEJqF6koB0ueNzNv3jxnNDkWKtiDRWl0RpIwJpPxCFmhSjqt3Ktewa8K0AUeppE2gYxUVlPDUCLVrACkjtP19HFJ0zCmpTXOcKNIsJhn5LnfHya9u95ODO%252F6oidi3t0yEnxrG%252FoMD0SsYKHRMe38VZwMOvGwEyebeEC7KU0H4bCbfidBfi59L7WQ%252BuU6j%252B0JhPTTZpN38i%252FrDQmmiGCdbzwzGqsC7BrsXnL4ulpm5NW5EmkUHQ6HEPleotxKJd1byE0RMa9FhGgizpTaMv6TBHMvi9TMNXO0yR7yd%252FLD4jHCEqPP0%252Ftl%252FmQE%252FMCaZhpHtZ7%252BUOZFav85ydTkrHg7ZE0%252FN%252Bg%252BsKL8mDPrNNiFyP6PbdRkP3mRFuLB2IK5DAomFTntmjYbsBdLvq4ta3UkY6OhYf9cZ42ii2qtjZqu89woyd9usdGZ77voJEyaGyk6uwZKm9GmQlhA9EtXyhxmFpiDjDhbAYlaamepQTRW96ZwcLzJ6jNTlMxKrK0AR8ZdK%252Bxl4Znyuq1gd4vMV2Gc8rq0v879cTBW1C8FuB9sY5nG0lh3Xs2%252F%252BIxPsXfk%252BBO9%252FB2MfwM%253D&REFERER=&HOSTNAME=sso.scvisibility.com&AUTHNLEVEL=&FAILREASON=&PROTOCOL=https&OLDSESSION=&EXPIRE_SECS=0", true, false), 0, "null", 3);
				httpParallel.addRequest(0, request_4(this, false, "A1E7768D2BB0E8DFD202B93534383732", false, false,
						"Config_7", "sso.scvisibility.com:443/EAI/css/jabil.css",	"/EAI/css/jabil.css", true, false), 0, "null", 3);
				httpParallel.addRequest(1, request_5(this, false, "A1E7768D2BB3CF03D202B93534383732", true, false,
						"Config_7", "sso.scvisibility.com:443/FIM/sps/JABLPOktaSAML20/saml20/logininitial?RequestBinding=HTTPPost&NameIdFormat=email&PartnerId=http://www.okta.com/exke8lz54bfbYX2f60x7&Target=https://www.scvisibility.com/",	"/FIM/sps/JABLPOktaSAML20/saml20/logininitial?RequestBinding=HTTPPost&NameIdFormat=email&PartnerId=http://www.okta.com/exke8lz54bfbYX2f60x7&Target=https://www.scvisibility.com/", true, false), 1, "A1E7768D2BB13726D202B93534383732", 3);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_2(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2BB10FE7D202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "sso.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, sdch, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_2 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_2);

	harvestContainer_2.addHarvestInstruction ("resp_hdr_location_1", dcVars[4], "http.{0,1}://.*?(/[^?]*)/", 1, 1, 0, 0, false, "location", null, 0, false);
	harvestContainer_2.addHarvestInstruction ("resp_hdr_location_1", dcVars[5], "http.{0,1}://.*?(/.*)", 1, 0, 0, 0, false, "location_2", null, 0, false);
	IDataSub subContainer_2 = new DataSub();
	reqAction.addDataSub(subContainer_2);

		ISubRule sub_1 = new SubRule("req_uri", 0, 856, false, (IDCCoreVar)dcVars[3], false, "Secure login_url_7", null, 0, false);
	subContainer_2.addSubInstruction(sub_1);
		ISubRule sub_2 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[9], false, "Host_198", null, 0, false);
	subContainer_2.addSubInstruction(sub_2);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2BB10FEAD202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(302);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_3(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2BB13726D202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "sso.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, sdch, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_3 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_3);

	harvestContainer_3.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[6], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)", null, 0, false);
	harvestContainer_3.addHarvestInstruction ("resp_content", dcVars[7], "/sso\\.scvisibility\\.com(.*?)\"", 1, 1, 0, 0, false, "sso.scvisibility.com", null, 0, false);
	IDataSub subContainer_3 = new DataSub();
	reqAction.addDataSub(subContainer_3);

		ISubRule sub_3 = new SubRule("req_uri", 0, 1186, false, (IDCCoreVar)dcVars[5], false, "Secure login_url_6", null, 0, false);
	subContainer_3.addSubInstruction(sub_3);
		ISubRule sub_4 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[9], false, "Host_197", null, 0, false);
	subContainer_3.addSubInstruction(sub_4);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2BB10FE7D202B93534383732"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2BB13729D202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_4(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2BB1AC43D202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "sso.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/css,*/*;q=0.1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://sso.scvisibility.com/EAI/Responder?TAM_OP=login&USERNAME=unauthenticated&ERROR_CODE=0x00000000&ERROR_TEXT=HPDBA0521I%20%20%20Successful%20completion&METHOD=GET&URL=%2FFIM%2Fsps%2FJABLPNodejsSAML20%2Fsaml20%2Flogininitial%3FRequestBinding%3DHTTPPost%26PartnerId%3Dhttps%253A%252F%252Fwww.scvisibility.com%252Fauth%252Fsso%252Fcallback%252F%26NameIdFormat%3Demail%26SAMLRequest%3DnVRNj9owEP0rkQ%252B9kS%252BWD7kExIJWpWK3EdAeelkZe9h169ipxwH239cJpEJqF6koB0ueNzNv3jxnNDkWKtiDRWl0RpIwJpPxCFmhSjqt3Ktewa8K0AUeppE2gYxUVlPDUCLVrACkjtP19HFJ0zCmpTXOcKNIsJhn5LnfHya9u95ODO%252F6oidi3t0yEnxrG%252FoMD0SsYKHRMe38VZwMOvGwEyebeEC7KU0H4bCbfidBfi59L7WQ%252BuU6j%252B0JhPTTZpN38i%252FrDQmmiGCdbzwzGqsC7BrsXnL4ulpm5NW5EmkUHQ6HEPleotxKJd1byE0RMa9FhGgizpTaMv6TBHMvi9TMNXO0yR7yd%252FLD4jHCEqPP0%252Ftl%252FmQE%252FMCaZhpHtZ7%252BUOZFav85ydTkrHg7ZE0%252FN%252Bg%252BsKL8mDPrNNiFyP6PbdRkP3mRFuLB2IK5DAomFTntmjYbsBdLvq4ta3UkY6OhYf9cZ42ii2qtjZqu89woyd9usdGZ77voJEyaGyk6uwZKm9GmQlhA9EtXyhxmFpiDjDhbAYlaamepQTRW96ZwcLzJ6jNTlMxKrK0AR8ZdK%252Bxl4Znyuq1gd4vMV2Gc8rq0v879cTBW1C8FuB9sY5nG0lh3Xs2%252F%252BIxPsXfk%252BBO9%252FB2MfwM%253D&REFERER=&HOSTNAME=sso.scvisibility.com&AUTHNLEVEL=&FAILREASON=&PROTOCOL=https&OLDSESSION=&EXPIRE_SECS=0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, sdch, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_4 = new DataSub();
	reqAction.addDataSub(subContainer_4);

		ISubRule sub_5 = new SubRule("req_hdr_Referer_1", 0, 1214, false, (IDCCoreVar)dcVars[6], false, "Referer_115", null, 0, false);
	subContainer_4.addSubInstruction(sub_5);
		ISubRule sub_6 = new SubRule("req_uri", 0, 4, false, (IDCCoreVar)dcVars[4], false, "/EAI", null, 0, false);
	subContainer_4.addSubInstruction(sub_6);
		ISubRule sub_7 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[9], false, "Host_196", null, 0, false);
	subContainer_4.addSubInstruction(sub_7);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2BB13726D202B93534383732"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2BB13726D202B93534383732"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2BB10FE7D202B93534383732"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2BB1AC46D202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/css");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_5(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2BB3F610D202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "sso.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://sso.scvisibility.com/EAI/Responder?TAM_OP=login&USERNAME=unauthenticated&ERROR_CODE=0x00000000&ERROR_TEXT=HPDBA0521I%20%20%20Successful%20completion&METHOD=GET&URL=%2FFIM%2Fsps%2FJABLPNodejsSAML20%2Fsaml20%2Flogininitial%3FRequestBinding%3DHTTPPost%26PartnerId%3Dhttps%253A%252F%252Fwww.scvisibility.com%252Fauth%252Fsso%252Fcallback%252F%26NameIdFormat%3Demail%26SAMLRequest%3DnVRNj9owEP0rkQ%252B9kS%252BWD7kExIJWpWK3EdAeelkZe9h169ipxwH239cJpEJqF6koB0ueNzNv3jxnNDkWKtiDRWl0RpIwJpPxCFmhSjqt3Ktewa8K0AUeppE2gYxUVlPDUCLVrACkjtP19HFJ0zCmpTXOcKNIsJhn5LnfHya9u95ODO%252F6oidi3t0yEnxrG%252FoMD0SsYKHRMe38VZwMOvGwEyebeEC7KU0H4bCbfidBfi59L7WQ%252BuU6j%252B0JhPTTZpN38i%252FrDQmmiGCdbzwzGqsC7BrsXnL4ulpm5NW5EmkUHQ6HEPleotxKJd1byE0RMa9FhGgizpTaMv6TBHMvi9TMNXO0yR7yd%252FLD4jHCEqPP0%252Ftl%252FmQE%252FMCaZhpHtZ7%252BUOZFav85ydTkrHg7ZE0%252FN%252Bg%252BsKL8mDPrNNiFyP6PbdRkP3mRFuLB2IK5DAomFTntmjYbsBdLvq4ta3UkY6OhYf9cZ42ii2qtjZqu89woyd9usdGZ77voJEyaGyk6uwZKm9GmQlhA9EtXyhxmFpiDjDhbAYlaamepQTRW96ZwcLzJ6jNTlMxKrK0AR8ZdK%252Bxl4Znyuq1gd4vMV2Gc8rq0v879cTBW1C8FuB9sY5nG0lh3Xs2%252F%252BIxPsXfk%252BBO9%252FB2MfwM%253D&REFERER=&HOSTNAME=sso.scvisibility.com&AUTHNLEVEL=&FAILREASON=&PROTOCOL=https&OLDSESSION=&EXPIRE_SECS=0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, sdch, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_4 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_4);

	harvestContainer_4.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[8], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)_2", null, 0, false);
	harvestContainer_4.addHarvestInstruction ("resp_content", dcVars[9], "/jabil\\.okta\\.com(.*?)\"", 1, 1, 0, 0, false, "jabil.okta.com", null, 0, false);
	harvestContainer_4.addHarvestInstruction ("resp_content", dcVars[10], "<[[^>].]*?name=\"RelayState\"(([[^>].]*?value=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "value", null, 0, false);
	harvestContainer_4.addHarvestInstruction ("resp_content", dcVars[11], "(?s)<[[^>].]*?name=\"SAMLRequest\"(([[^>].]*?value=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "value_2", null, 0, false);
	IDataSub subContainer_5 = new DataSub();
	reqAction.addDataSub(subContainer_5);

		ISubRule sub_8 = new SubRule("req_hdr_Referer_1", 0, 1214, false, (IDCCoreVar)dcVars[6], false, "Referer_114", null, 0, false);
	subContainer_5.addSubInstruction(sub_8);
		ISubRule sub_9 = new SubRule("req_uri", 0, 175, false, (IDCCoreVar)dcVars[7], false, "Secure login_url_5", null, 0, false);
	subContainer_5.addSubInstruction(sub_9);
		ISubRule sub_10 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[9], false, "Host_195", null, 0, false);
	subContainer_5.addSubInstruction(sub_10);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2BB13726D202B93534383732"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2BB13726D202B93534383732"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2BB10FE7D202B93534383732"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2BB3F613D202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
				SubstitutableHTTPContentVP localContentVp_0 = new SubstitutableHTTPContentVP(1, true, null, 0, reqAction);
	
			localContentVp_0.addConstContentElement(contVPElem_0);
	req.addVerificationPoint(localContentVp_0);

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html;charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
private HTTPPage page_3(final IContainer parent) {
			HTTPThink think = new HTTPThink(20, 1000, parent, parent, "A1E7768D2BB09AB1D202B93534383732");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "OKTA_1_Login", "A1E7768D2BB09AB1D202B93534383732") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(2, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_6(this, true, "A1E7768D2BB5CAD3D202B93534383732", false, true,
						"Config_8", "jabil.okta.com:443/app/jabilcircuitprod_incontrol_1/exke8lz54bfbYX2f60x7/sso/saml",	"/app/jabilcircuitprod_incontrol_1/exke8lz54bfbYX2f60x7/sso/saml", true, false), 0, "null", 3);
				httpParallel.addRequest(0, request_7(this, false, "A1E7768D2BB5CAD3D202B93534383732", false, false,
						"Config_8", "jabil.okta.com:443/assets/loginpage/css/okta-sign-in.min.94146f30b6c2e51c29ed60e53ea6d1e8.css",	"/assets/loginpage/css/okta-sign-in.min.94146f30b6c2e51c29ed60e53ea6d1e8.css", true, false), 0, "null", 3);
				httpParallel.addRequest(0, request_8(this, false, "A1E7768D2BB5CAD3D202B93534383732", false, false,
						"Config_8", "jabil.okta.com:443/assets/loginpage/css/loginpage-theme.d04e4505faecdbf6ef37389aa3337dd6.css",	"/assets/loginpage/css/loginpage-theme.d04e4505faecdbf6ef37389aa3337dd6.css", true, false), 0, "null", 3);
				httpParallel.addRequest(1, request_9(this, false, "A1E7768D2BB79FB8D202B93534383732", false, false,
						"Config_8", "jabil.okta.com:443/bc/globalFileStoreRecord?id=gfse8m2bpkpUovl5A0x7",	"/bc/globalFileStoreRecord?id=gfse8m2bpkpUovl5A0x7", true, false), 17, "A1E7768D2BB5F1E5D202B93534383732", 3);
				httpParallel.addRequest(0, request_10(this, false, "A1E7768D2BB5CAD3D202B93534383732", false, false,
						"Config_8", "jabil.okta.com:443/assets/js/mvc/loginpage/main-loginpage.pack.d41eb3310be1780dc58759d31ba209b7.js",	"/assets/js/mvc/loginpage/main-loginpage.pack.d41eb3310be1780dc58759d31ba209b7.js", true, false), 0, "null", 3);
				httpParallel.addRequest(0, request_11(this, false, "A1E7768D2BB5CAD3D202B93534383732", false, false,
						"Config_8", "jabil.okta.com:443/bc/image/fileStoreRecord?id=fs05cu0mejtyuWuyn0x7",	"/bc/image/fileStoreRecord?id=fs05cu0mejtyuWuyn0x7", true, false), 0, "null", 3);
				httpParallel.addRequest(0, request_12(this, false, "A1E7768D2BB5CAD3D202B93534383732", true, false,
						"Config_8", "jabil.okta.com:443/assets/loginpage/font/okticon.e92c81c58840dcf25ca0a2bed8dd3b34.woff",	"/assets/loginpage/font/okticon.e92c81c58840dcf25ca0a2bed8dd3b34.woff", true, false), 0, "null", 3);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_6(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2BB5F1E5D202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(12);
					
		headers.add(new RequestHeaderData("Host", "jabil.okta.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "4792", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cache-Control", "max-age=0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://sso.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "application/x-www-form-urlencoded", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://sso.scvisibility.com/FIM/sps/JABLPOktaSAML20/saml20/logininitial?RequestBinding=HTTPPost&NameIdFormat=email&PartnerId=http://www.okta.com/exke8lz54bfbYX2f60x7&Target=https://www.scvisibility.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_1(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_5 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_5);

	harvestContainer_5.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[12], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)_3", null, 0, false);
	harvestContainer_5.addHarvestInstruction ("resp_content", dcVars[13], "/jabil\\.okta\\.com(.*?)\"", 1, 1, 0, 0, false, "jabil.okta.com_4", null, 0, false);
	harvestContainer_5.addHarvestInstruction ("resp_content", dcVars[14], "/jabil\\.okta\\.com(.*?)\"", 2, 1, 0, 0, false, "jabil.okta.com_3", null, 0, false);
	harvestContainer_5.addHarvestInstruction ("resp_content", dcVars[15], "\\?id=(.*?)\"", 1, 1, 0, 0, false, "id_4", null, 0, false);
	harvestContainer_5.addHarvestInstruction ("resp_content", dcVars[16], "/jabil\\.okta\\.com(.*?)'", 1, 1, 0, 0, false, "jabil.okta.com_2", null, 0, false);
	harvestContainer_5.addHarvestInstruction ("resp_content", dcVars[17], "\\\\.*?RelayState\\\\x3D(.*?)\\\\x2D", 1, 1, 0, 0, false, "Relay_1", null, 0, false);
	harvestContainer_5.addHarvestInstruction ("resp_content", dcVars[18], "\\\\.*?RelayState\\\\x3D.*?\\\\x2D(.*?)\\\\x2D", 1, 0, 0, 0, false, "Relay_2", null, 0, false);
	harvestContainer_5.addHarvestInstruction ("resp_content", dcVars[19], "\\\\.*?RelayState\\\\x3D.*?\\\\x2D.*?\\\\x2D(.*?)\\\\x2D", 1, 0, 0, 0, false, "Relay_3", null, 0, false);
	harvestContainer_5.addHarvestInstruction ("resp_content", dcVars[20], "\\\\.*?RelayState\\\\x3D.*?\\\\x2D.*?\\\\x2D.*?\\\\x2D(.*?)\\\\x2D", 1, 0, 0, 0, false, "Relay_4", null, 0, false);
	harvestContainer_5.addHarvestInstruction ("resp_content", dcVars[21], "\\\\.*?RelayState\\\\x3D.*?\\\\x2D.*?\\\\x2D.*?\\\\x2D.*?\\\\x2D(.*?)\\\\x26", 1, 0, 0, 0, false, "Relay_5", null, 0, false);
	harvestContainer_5.addHarvestInstruction ("resp_content", dcVars[22], "SAMLRequest([\\\\a-zA-Z0-9].*?)26", 1, 1, 0, 0, false, "SAML_!", null, 0, false);
	harvestContainer_5.addHarvestInstruction ("resp_content", dcVars[23], "\\?id=(.*?)'", 1, 1, 0, 0, false, "id_3", null, 0, false);
	IDataSub subContainer_7 = new DataSub();
	reqAction.addDataSub(subContainer_7);

		ISubRule sub_13 = new SubRule("req_hdr_Referer_1", 0, 203, false, (IDCCoreVar)dcVars[8], false, "Referer_112", null, 0, false);
	subContainer_7.addSubInstruction(sub_13);
		ISubRule sub_14 = new SubRule("req_uri", 0, 63, false, (IDCCoreVar)dcVars[9], false, "Secure login_url_4", null, 0, false);
	subContainer_7.addSubInstruction(sub_14);
		ISubRule sub_15 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[10], false, "Host_193", null, 0, false);
	subContainer_7.addSubInstruction(sub_15);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			postData,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2BB5F1E8D202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
				SubstitutableHTTPContentVP localContentVp_1 = new SubstitutableHTTPContentVP(1, true, null, 0, reqAction);
	
			localContentVp_1.addConstContentElement(contVPElem_1);
	req.addVerificationPoint(localContentVp_1);

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html;charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_1(HTTPPostData postData) {
					String requestData_1 = MetaString.encode(ZipEntryProxy.asXMLFragment(
	                                   "A1E776C649B74840EC3BE23533313434.testdata",
	                                   "A1E7768D2BB61905D202B93534383732",
	                                   4792));
			
	HTTPPostDataChunk pdc_0 = new HTTPPostDataChunk("A1E7768D2BB61905D202B93534383732", postData, requestData_1, "UTF-8", 4768, 4792);
	postData.addDataChunk(pdc_0);

	IDataSub subContainer_6 = new DataSub();
	pdc_0.addDataSub(subContainer_6);

		ISubRule sub_11 = new SubRule("req_content", 64, 4728, true, (IDCCoreVar)dcVars[11], false, "SAMLRequest", null, 0, false);
	subContainer_6.addSubInstruction(sub_11);
		ISubRule sub_12 = new SubRule("req_content", 11, 40, true, (IDCCoreVar)dcVars[10], false, "RelayState", null, 0, false);
	subContainer_6.addSubInstruction(sub_12);
	



	}

	public HTTPAction request_7(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2BB66717D202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "jabil.okta.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/css,*/*;q=0.1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://jabil.okta.com/app/jabilcircuitprod_incontrol_1/exke8lz54bfbYX2f60x7/sso/saml", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, sdch, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_6 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_6);

	harvestContainer_6.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[24], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)_4", null, 0, false);
	IDataSub subContainer_8 = new DataSub();
	reqAction.addDataSub(subContainer_8);

		ISubRule sub_16 = new SubRule("req_hdr_Referer_1", 0, 85, false, (IDCCoreVar)dcVars[12], false, "Referer_111", null, 0, false);
	subContainer_8.addSubInstruction(sub_16);
		ISubRule sub_17 = new SubRule("req_uri", 0, 75, false, (IDCCoreVar)dcVars[13], false, "Secure login_url_3", null, 0, false);
	subContainer_8.addSubInstruction(sub_17);
		ISubRule sub_18 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[10], false, "Host_192", null, 0, false);
	subContainer_8.addSubInstruction(sub_18);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2BB5F1E5D202B93534383732"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2BB5F1E5D202B93534383732"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2BB6671AD202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/css");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_8(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2BB72A67D202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "jabil.okta.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/css,*/*;q=0.1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://jabil.okta.com/app/jabilcircuitprod_incontrol_1/exke8lz54bfbYX2f60x7/sso/saml", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, sdch, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_9 = new DataSub();
	reqAction.addDataSub(subContainer_9);

		ISubRule sub_19 = new SubRule("req_hdr_Referer_1", 0, 85, false, (IDCCoreVar)dcVars[12], false, "Referer_110", null, 0, false);
	subContainer_9.addSubInstruction(sub_19);
		ISubRule sub_20 = new SubRule("req_uri", 0, 74, false, (IDCCoreVar)dcVars[14], false, "Secure login_url_2", null, 0, false);
	subContainer_9.addSubInstruction(sub_20);
		ISubRule sub_21 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[10], false, "Host_191", null, 0, false);
	subContainer_9.addSubInstruction(sub_21);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2BB5F1E5D202B93534383732"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2BB5F1E5D202B93534383732"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2BB72A6AD202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/css");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_9(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2BB7C6A0D202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "jabil.okta.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://jabil.okta.com/app/jabilcircuitprod_incontrol_1/exke8lz54bfbYX2f60x7/sso/saml", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, sdch, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_10 = new DataSub();
	reqAction.addDataSub(subContainer_10);

		ISubRule sub_22 = new SubRule("req_uri", 29, 20, true, (IDCCoreVar)dcVars[15], false, "id", null, 0, false);
	subContainer_10.addSubInstruction(sub_22);
		ISubRule sub_23 = new SubRule("req_hdr_Referer_1", 0, 85, false, (IDCCoreVar)dcVars[12], false, "Referer_109", null, 0, false);
	subContainer_10.addSubInstruction(sub_23);
		ISubRule sub_24 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[10], false, "Host_190", null, 0, false);
	subContainer_10.addSubInstruction(sub_24);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2BB5F1E5D202B93534383732"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2BB5F1E5D202B93534383732"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2BB7C6A3D202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/png");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_10(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2BB83BDFD202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "jabil.okta.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://jabil.okta.com/app/jabilcircuitprod_incontrol_1/exke8lz54bfbYX2f60x7/sso/saml", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, sdch, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_11 = new DataSub();
	reqAction.addDataSub(subContainer_11);

		ISubRule sub_25 = new SubRule("req_hdr_Referer_1", 0, 85, false, (IDCCoreVar)dcVars[12], false, "Referer_108", null, 0, false);
	subContainer_11.addSubInstruction(sub_25);
		ISubRule sub_26 = new SubRule("req_uri", 0, 80, false, (IDCCoreVar)dcVars[16], false, "Secure login_url", null, 0, false);
	subContainer_11.addSubInstruction(sub_26);
		ISubRule sub_27 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[10], false, "Host_189", null, 0, false);
	subContainer_11.addSubInstruction(sub_27);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2BB5F1E5D202B93534383732"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2BB5F1E5D202B93534383732"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2BB7C6A0D202B93534383732"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2BB83BE2D202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_11(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2BC24E1BD202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "jabil.okta.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://jabil.okta.com/app/jabilcircuitprod_incontrol_1/exke8lz54bfbYX2f60x7/sso/saml", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, sdch, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_12 = new DataSub();
	reqAction.addDataSub(subContainer_12);

		ISubRule sub_28 = new SubRule("req_uri", 29, 20, true, (IDCCoreVar)dcVars[23], false, "id", null, 0, false);
	subContainer_12.addSubInstruction(sub_28);
		ISubRule sub_29 = new SubRule("req_hdr_Referer_1", 0, 85, false, (IDCCoreVar)dcVars[12], false, "Referer_106", null, 0, false);
	subContainer_12.addSubInstruction(sub_29);
		ISubRule sub_30 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[10], false, "Host_187", null, 0, false);
	subContainer_12.addSubInstruction(sub_30);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2BB5F1E5D202B93534383732"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2BB5F1E5D202B93534383732"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2BB7C6A0D202B93534383732"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2BC24E1ED202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/png");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_12(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2BC422EBD202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "jabil.okta.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://jabil.okta.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://jabil.okta.com/assets/loginpage/css/okta-sign-in.min.94146f30b6c2e51c29ed60e53ea6d1e8.css", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, sdch, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_13 = new DataSub();
	reqAction.addDataSub(subContainer_13);

		ISubRule sub_31 = new SubRule("req_hdr_Referer_1", 0, 97, false, (IDCCoreVar)dcVars[24], false, "Referer_103", null, 0, false);
	subContainer_13.addSubInstruction(sub_31);
		ISubRule sub_32 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[10], false, "Host_184", null, 0, false);
	subContainer_13.addSubInstruction(sub_32);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2BB5F1E5D202B93534383732"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2BB66717D202B93534383732"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2BC24E1BD202B93534383732"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2BC422EED202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/font-woff");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	private ArmableTransaction transaction_2(final IContainer parent) {
		ArmableTransaction trx = new ArmableTransaction(parent, "Sign_In", "A1E7768D2BC952D0D202B93534383732") {
		
		    public void execute() {     
		       	
	
	
	
	      
                	this.add(page_4(this));
	this.add(page_5(this));

		     
                super.execute();
            }
        
            public void finish(IKAction child) {
                super.finish(child);
                if (hasFinished()) {
                    
                }
            }
		};
		trx.setArmEnabled(false);
		return trx;
	}

private HTTPPage page_4(final IContainer parent) {
			HTTPThink think = new HTTPThink(20, 1000, parent, parent, "A1E7768D2BC9A0FDD202B93534383732");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "OKTA_2_Login_Username", "A1E7768D2BC9A0FDD202B93534383732") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(1, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_13(this, true, "A1E7768D2BC9A0F0D202B93534383732", false, true,
						"Config_8", "jabil.okta.com:443/login/getimage?username=IDSEUser304",	"/login/getimage?username=IDSEUser304", true, false), 0, "null", 3);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_13(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2BC9A101D202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(9);
					
		headers.add(new RequestHeaderData("Host", "jabil.okta.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("X-Okta-XsrfToken", "", "UTF-8", 1));			
		headers.add(new RequestHeaderData("X-Requested-With", "XMLHttpRequest", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://jabil.okta.com/app/jabilcircuitprod_incontrol_1/exke8lz54bfbYX2f60x7/sso/saml", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, sdch, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_14 = new DataSub();
	reqAction.addDataSub(subContainer_14);

		ISubRule sub_33 = new SubRule("req_uri", 25, 11, true, (IDCCoreVar)dcVars[0], false, "username", null, 0, false);
	subContainer_14.addSubInstruction(sub_33);
		ISubRule sub_34 = new SubRule("req_hdr_Referer_1", 0, 85, false, (IDCCoreVar)dcVars[12], false, "Referer_98", null, 0, false);
	subContainer_14.addSubInstruction(sub_34);
		ISubRule sub_35 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[10], false, "Host_179", null, 0, false);
	subContainer_14.addSubInstruction(sub_35);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2BC9A104D202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
				SubstitutableHTTPContentVP localContentVp_2 = new SubstitutableHTTPContentVP(1, true, null, 0, reqAction);
	
			localContentVp_2.addConstContentElement(contVPElem_2);
	req.addVerificationPoint(localContentVp_2);

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json;charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
private HTTPPage page_5(final IContainer parent) {
			HTTPThink think = new HTTPThink(20, 1000, parent, parent, "A1E7768D2BCB0087D202B93534383732");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "OKTA_2_Login_Password", "A1E7768D2BCB0087D202B93534383732") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(1, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_14(this, true, "A1E7768D2BCAD970D202B93534383732", false, true,
						"Config_8", "jabil.okta.com:443/api/v1/authn",	"/api/v1/authn", true, false), 0, "null", 3);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_14(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2BCB2790D202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
		headers.add(new RequestHeaderData("Host", "jabil.okta.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "130", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://jabil.okta.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("X-Okta-XsrfToken", "", "UTF-8", 1));			
		headers.add(new RequestHeaderData("X-Okta-User-Agent-Extended", "okta-signin-widget-1.14.0-beta.2", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "application/json", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json", "UTF-8", 1));			
		headers.add(new RequestHeaderData("X-Requested-With", "XMLHttpRequest", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://jabil.okta.com/app/jabilcircuitprod_incontrol_1/exke8lz54bfbYX2f60x7/sso/saml", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_2(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_7 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_7);

	harvestContainer_7.addHarvestInstruction ("resp_content", dcVars[25], "\"stateToken\":\"(.*?)\"", 1, 1, 0, 0, false, "State_token_1", null, 0, false);
	harvestContainer_7.addHarvestInstruction ("resp_content", dcVars[26], "/factors/(.*?)/", 1, 1, 0, 0, false, "verify", null, 0, false);
	IDataSub subContainer_16 = new DataSub();
	reqAction.addDataSub(subContainer_16);

		ISubRule sub_37 = new SubRule("req_hdr_Referer_1", 0, 85, false, (IDCCoreVar)dcVars[12], false, "Referer_95", null, 0, false);
	subContainer_16.addSubInstruction(sub_37);
		ISubRule sub_38 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[10], false, "Host_176", null, 0, false);
	subContainer_16.addSubInstruction(sub_38);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			postData,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2BCB2793D202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
				SubstitutableHTTPContentVP localContentVp_3 = new SubstitutableHTTPContentVP(0, true, null, 0, reqAction);
	
			localContentVp_3.addConstContentElement(contVPElem_3);
	req.addVerificationPoint(localContentVp_3);

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json;charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_2(HTTPPostData postData) {
				StringBuffer strBuf_1 = new StringBuffer();
strBuf_1.append("{\"username\":\"IDSEUser304\",\"password\":\"1Ds3P@ssword\",\"options");
strBuf_1.append("\":{\"warnBeforePasswordExpired\":true,\"multiOptionalFactorEnro");
strBuf_1.append("ll\":true}}");
String requestData_2 = strBuf_1.toString();
			
	HTTPPostDataChunk pdc_1 = new HTTPPostDataChunk("A1E7768D2BCB27E0D202B93534383732", postData, requestData_2, "UTF-8", 11, 24);
	postData.addDataChunk(pdc_1);

	IDataSub subContainer_15 = new DataSub();
	pdc_1.addDataSub(subContainer_15);

		ISubRule sub_36 = new SubRule("req_content", 13, 11, true, (IDCCoreVar)dcVars[0], false, "username_2", null, 0, false);
	subContainer_15.addSubInstruction(sub_36);
	



	}

	private ArmableTransaction transaction_3(final IContainer parent) {
		ArmableTransaction trx = new ArmableTransaction(parent, "Verify", "A1E7768D2BCBC3D4D202B93534383732") {
		
		    public void execute() {     
		       	
	
	
	
	      
                	this.add(page_6(this));
	this.add(page_7(this));
	this.add(page_8(this));
	this.add(page_9(this));

		     
                super.execute();
            }
        
            public void finish(IKAction child) {
                super.finish(child);
                if (hasFinished()) {
                    
                }
            }
		};
		trx.setArmEnabled(false);
		return trx;
	}

private HTTPPage page_6(final IContainer parent) {
			HTTPThink think = new HTTPThink(20, 1000, parent, parent, "A1E7777C3B315BB0DCF4B83631323436");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "OKTA_1_Verification", "A1E7777C3B315BB0DCF4B83631323436") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(1, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_15(this, true, "A1E7768D2BCBEAE0D202B93534383732", false, false,
						"Config_8", "jabil.okta.com:443/api/v1/authn/factors/ufsejxnv5oDeyx8UV0x7/verify",	"/api/v1/authn/factors/ufsejxnv5oDeyx8UV0x7/verify", true, false), 0, "null", 3);
				httpParallel.addRequest(0, request_16(this, false, "A1E7768D2BCBEAE0D202B93534383732", false, true,
						"Config_8", "jabil.okta.com:443/login/sessionCookieRedirect",	"/login/sessionCookieRedirect", true, false), 0, "null", 3);
				httpParallel.addRequest(0, request_17(this, false, "A1E7768D2BCBEAE0D202B93534383732", false, false,
						"Config_8", "jabil.okta.com:443/assets/js/jquery-1.11.3.min.895323ed2f7258af4fae2c738c8aea49.js",	"/assets/js/jquery-1.11.3.min.895323ed2f7258af4fae2c738c8aea49.js", true, false), 0, "null", 3);
				httpParallel.addRequest(0, request_18(this, false, "A1E7768D2BCBEAE0D202B93534383732", false, false,
						"Config_8", "jabil.okta.com:443/assets/css/sections/interstitial.b50e299a21400f2b173a71c8ebc3678d.css",	"/assets/css/sections/interstitial.b50e299a21400f2b173a71c8ebc3678d.css", true, false), 0, "null", 3);
				httpParallel.addRequest(0, request_19(this, false, "A1E7768D2BCBEAE0D202B93534383732", false, false,
						"Config_8", "jabil.okta.com:443/assets/js/widget/spin.min.545405225c13b2f42ab103fca31a49b1.js",	"/assets/js/widget/spin.min.545405225c13b2f42ab103fca31a49b1.js", true, false), 0, "null", 3);
				httpParallel.addRequest(0, request_20(this, false, "A1E7768D2BCBEAE0D202B93534383732", false, false,
						"Config_8", "jabil.okta.com:443/assets/js/app/sso/interstitial.0dee13f2d74d523aca30e2028a2b2199.js",	"/assets/js/app/sso/interstitial.0dee13f2d74d523aca30e2028a2b2199.js", true, false), 0, "null", 3);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_15(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2BCC11F7D202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "jabil.okta.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "84", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://jabil.okta.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("X-Okta-XsrfToken", "", "UTF-8", 1));			
		headers.add(new RequestHeaderData("X-Okta-User-Agent-Extended", "okta-signin-widget-1.14.0-beta.2", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "application/json", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json", "UTF-8", 1));			
		headers.add(new RequestHeaderData("X-Requested-With", "XMLHttpRequest", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://jabil.okta.com/signin/verify/okta/question", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "oktaStateToken=009LmoT_N4eZCNtse3alCeG4r7M36OmA1PiqI-yXLz", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_3(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_8 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_8);

	harvestContainer_8.addHarvestInstruction ("resp_content", dcVars[27], "\"sessionToken\":\"(.*?)\"", 1, 1, 0, 0, false, "Session_Token_1", null, 0, false);
	IDataSub subContainer_18 = new DataSub();
	reqAction.addDataSub(subContainer_18);

		ISubRule sub_40 = new SubRule("req_uri", 22, 20, true, (IDCCoreVar)dcVars[26], false, "factors", null, 0, false);
	subContainer_18.addSubInstruction(sub_40);
		ISubRule sub_41 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[10], false, "Host_174", null, 0, false);
	subContainer_18.addSubInstruction(sub_41);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			postData,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2BCC11FAD202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json;charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_3(HTTPPostData postData) {
				StringBuffer strBuf_2 = new StringBuffer();
strBuf_2.append("{\"answer\":\"anchovy paste\",\"stateToken\":\"009LmoT_N4eZCNtse3al");
strBuf_2.append("CeG4r7M36OmA1PiqI-yXLz\"}");
String requestData_3 = strBuf_2.toString();
			
	HTTPPostDataChunk pdc_2 = new HTTPPostDataChunk("A1E7768D2BCC390CD202B93534383732", postData, requestData_3, "UTF-8", 42, 82);
	postData.addDataChunk(pdc_2);

	IDataSub subContainer_17 = new DataSub();
	pdc_2.addDataSub(subContainer_17);

		ISubRule sub_39 = new SubRule("req_content", 40, 42, true, (IDCCoreVar)dcVars[25], false, "stateToken", null, 0, false);
	subContainer_17.addSubInstruction(sub_39);
	



	}

	public HTTPAction request_16(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2BCC603CD202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(12);
					
		headers.add(new RequestHeaderData("Host", "jabil.okta.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "5286", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cache-Control", "max-age=0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://jabil.okta.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "application/x-www-form-urlencoded", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://jabil.okta.com/signin/verify/okta/question", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_4(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_9 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_9);

	harvestContainer_9.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[28], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)_7", null, 0, false);
	harvestContainer_9.addHarvestInstruction ("resp_content", dcVars[29], "/jabil\\.okta\\.com(.*?)\"", 9, 9, 0, 0, false, "jabil.okta.com_11", null, 0, false);
	harvestContainer_9.addHarvestInstruction ("resp_content", dcVars[30], "/jabil\\.okta\\.com(.*?)\"", 11, 2, 0, 0, false, "jabil.okta.com_10", null, 0, false);
	harvestContainer_9.addHarvestInstruction ("resp_content", dcVars[31], "/jabil\\.okta\\.com(.*?)\"", 12, 1, 0, 0, false, "jabil.okta.com_9", null, 0, false);
	harvestContainer_9.addHarvestInstruction ("resp_content", dcVars[32], "<[[^>].]*?name=\"SAMLResponse\"(([[^>].]*?value=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "value_3", null, 0, false);
	harvestContainer_9.addHarvestInstruction ("resp_content", dcVars[33], "<[[^>].]*?name=\"RelayState\"(([[^>].]*?value=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "value_4", null, 0, false);
	harvestContainer_9.addHarvestInstruction ("resp_content", dcVars[34], "/jabil\\.okta\\.com(.*?)\"", 13, 1, 0, 0, false, "jabil.okta.com_8", null, 0, false);
	IDataSub subContainer_20 = new DataSub();
	reqAction.addDataSub(subContainer_20);

		ISubRule sub_49 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[10], false, "Host_173", null, 0, false);
	subContainer_20.addSubInstruction(sub_49);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2BCC11F7D202B93534383732"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2BCC11F7D202B93534383732"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			postData,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2BCC603FD202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
				SubstitutableHTTPContentVP localContentVp_4 = new SubstitutableHTTPContentVP(1, true, null, 0, reqAction);
	
			localContentVp_4.addConstContentElement(contVPElem_4);
	req.addVerificationPoint(localContentVp_4);

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html;charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_4(HTTPPostData postData) {
					String requestData_4 = MetaString.encode(ZipEntryProxy.asXMLFragment(
	                                   "A1E776C649B74840EC3BE23533313434.testdata",
	                                   "A1E7768D2BCC8763D202B93534383732",
	                                   5286));
			
	HTTPPostDataChunk pdc_3 = new HTTPPostDataChunk("A1E7768D2BCC8763D202B93534383732", postData, requestData_4, "UTF-8", 5081, 5250);
	postData.addDataChunk(pdc_3);

	IDataSub subContainer_19 = new DataSub();
	pdc_3.addDataSub(subContainer_19);

		ISubRule sub_42 = new SubRule("req_content", 260, 4990, false, (IDCCoreVar)dcVars[22], false, "redirectUrl_6", null, 0, false);
	subContainer_19.addSubInstruction(sub_42);
		ISubRule sub_43 = new SubRule("req_content", 234, 12, true, (IDCCoreVar)dcVars[21], false, "redirectUrl_5", null, 0, false);
	subContainer_19.addSubInstruction(sub_43);
		ISubRule sub_44 = new SubRule("req_content", 229, 4, true, (IDCCoreVar)dcVars[20], false, "redirectUrl_4", null, 0, false);
	subContainer_19.addSubInstruction(sub_44);
		ISubRule sub_45 = new SubRule("req_content", 224, 4, true, (IDCCoreVar)dcVars[19], false, "redirectUrl_3", null, 0, false);
	subContainer_19.addSubInstruction(sub_45);
		ISubRule sub_46 = new SubRule("req_content", 219, 4, true, (IDCCoreVar)dcVars[18], false, "redirectUrl_2", null, 0, false);
	subContainer_19.addSubInstruction(sub_46);
		ISubRule sub_47 = new SubRule("req_content", 206, 12, true, (IDCCoreVar)dcVars[17], false, "redirectUrl", null, 0, false);
	subContainer_19.addSubInstruction(sub_47);
		ISubRule sub_48 = new SubRule("req_content", 49, 55, true, (IDCCoreVar)dcVars[27], false, "token", null, 0, false);
	subContainer_19.addSubInstruction(sub_48);
	



	}

	public HTTPAction request_17(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2BCCFC56D202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "jabil.okta.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://jabil.okta.com/login/sessionCookieRedirect", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, sdch, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_21 = new DataSub();
	reqAction.addDataSub(subContainer_21);

		ISubRule sub_50 = new SubRule("req_hdr_Referer_1", 0, 50, false, (IDCCoreVar)dcVars[28], false, "Referer_93", null, 0, false);
	subContainer_21.addSubInstruction(sub_50);
		ISubRule sub_51 = new SubRule("req_uri", 0, 64, false, (IDCCoreVar)dcVars[29], false, "Jabil Circuit - Prod_url_9", null, 0, false);
	subContainer_21.addSubInstruction(sub_51);
		ISubRule sub_52 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[10], false, "Host_172", null, 0, false);
	subContainer_21.addSubInstruction(sub_52);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2BCC603CD202B93534383732"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2BCC603CD202B93534383732"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2BCD2360D202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_18(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2BCDE6B7D202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "jabil.okta.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/css,*/*;q=0.1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://jabil.okta.com/login/sessionCookieRedirect", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, sdch, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_22 = new DataSub();
	reqAction.addDataSub(subContainer_22);

		ISubRule sub_53 = new SubRule("req_hdr_Referer_1", 0, 50, false, (IDCCoreVar)dcVars[28], false, "Referer_92", null, 0, false);
	subContainer_22.addSubInstruction(sub_53);
		ISubRule sub_54 = new SubRule("req_uri", 0, 70, false, (IDCCoreVar)dcVars[30], false, "Jabil Circuit - Prod_url_8", null, 0, false);
	subContainer_22.addSubInstruction(sub_54);
		ISubRule sub_55 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[10], false, "Host_171", null, 0, false);
	subContainer_22.addSubInstruction(sub_55);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2BCC603CD202B93534383732"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2BCC603CD202B93534383732"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2BCE0DC0D202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/css");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_19(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2BCE3517D202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "jabil.okta.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://jabil.okta.com/login/sessionCookieRedirect", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, sdch, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_23 = new DataSub();
	reqAction.addDataSub(subContainer_23);

		ISubRule sub_56 = new SubRule("req_hdr_Referer_1", 0, 50, false, (IDCCoreVar)dcVars[28], false, "Referer_91", null, 0, false);
	subContainer_23.addSubInstruction(sub_56);
		ISubRule sub_57 = new SubRule("req_uri", 0, 62, false, (IDCCoreVar)dcVars[31], false, "Jabil Circuit - Prod_url_7", null, 0, false);
	subContainer_23.addSubInstruction(sub_57);
		ISubRule sub_58 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[10], false, "Host_170", null, 0, false);
	subContainer_23.addSubInstruction(sub_58);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2BCC603CD202B93534383732"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2BCC603CD202B93534383732"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2BCE351AD202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_20(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2BCEAA0FD202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "jabil.okta.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://jabil.okta.com/login/sessionCookieRedirect", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, sdch, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_24 = new DataSub();
	reqAction.addDataSub(subContainer_24);

		ISubRule sub_59 = new SubRule("req_hdr_Referer_1", 0, 50, false, (IDCCoreVar)dcVars[28], false, "Referer_90", null, 0, false);
	subContainer_24.addSubInstruction(sub_59);
		ISubRule sub_60 = new SubRule("req_uri", 0, 67, false, (IDCCoreVar)dcVars[34], false, "Jabil Circuit - Prod_url_6", null, 0, false);
	subContainer_24.addSubInstruction(sub_60);
		ISubRule sub_61 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[10], false, "Host_169", null, 0, false);
	subContainer_24.addSubInstruction(sub_61);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2BCC603CD202B93534383732"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2BCC603CD202B93534383732"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2BCEAA12D202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
private HTTPPage page_7(final IContainer parent) {
			HTTPThink think = new HTTPThink(20, 1000, parent, parent, "A1E7777C3F9CA510DCF4B83631323436");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "CIS_1_Verification", "A1E7777C3F9CA510DCF4B83631323436") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(1, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_21(this, true, "A1E7768D2BD057E3D202B93534383732", false, false,
						"Config_7", "sso.scvisibility.com:443/FIM/sps/JABLPOktaSAML20/saml20/login",	"/FIM/sps/JABLPOktaSAML20/saml20/login", true, false), 0, "null", 3);
				httpParallel.addRequest(0, request_22(this, false, "A1E7768D2BD057E3D202B93534383732", true, true,
						"Config_7", "sso.scvisibility.com:443/FIM/sps/JABLPNodejsSAML20/saml20/logininitial?RequestBinding=HTTPPost&PartnerId=https%3A%2F%2Fwww.scvisibility.com%2Fauth%2Fsso%2Fcallback%2F&NameIdFormat=email&SAMLRequest=nVRNj9owEP0rkQ%2B9kS%2BWD7kExIJWpWK3EdAeelkZe9h169ipxwH239cJpEJqF6koB0ueNzNv3jxnNDkWKtiDRWl0RpIwJpPxCFmhSjqt3Ktewa8K0AUeppE2gYxUVlPDUCLVrACkjtP19HFJ0zCmpTXOcKNIsJhn5LnfHya9u95ODO%2F6oidi3t0yEnxrG%2FoMD0SsYKHRMe38VZwMOvGwEyebeEC7KU0H4bCbfidBfi59L7WQ%2BuU6j%2B0JhPTTZpN38i%2FrDQmmiGCdbzwzGqsC7BrsXnL4ulpm5NW5EmkUHQ6HEPleotxKJd1byE0RMa9FhGgizpTaMv6TBHMvi9TMNXO0yR7yd%2FLD4jHCEqPP0%2Ftl%2FmQE%2FMCaZhpHtZ7%2BUOZFav85ydTkrHg7ZE0%2FN%2Bg%2BsKL8mDPrNNiFyP6PbdRkP3mRFuLB2IK5DAomFTntmjYbsBdLvq4ta3UkY6OhYf9cZ42ii2qtjZqu89woyd9usdGZ77voJEyaGyk6uwZKm9GmQlhA9EtXyhxmFpiDjDhbAYlaamepQTRW96ZwcLzJ6jNTlMxKrK0AR8ZdK%2Bxl4Znyuq1gd4vMV2Gc8rq0v879cTBW1C8FuB9sY5nG0lh3Xs2%2F%2BIxPsXfk%2BBO9%2FB2MfwM%3D",	"/FIM/sps/JABLPNodejsSAML20/saml20/logininitial?RequestBinding=HTTPPost&PartnerId=https%3A%2F%2Fwww.scvisibility.com%2Fauth%2Fsso%2Fcallback%2F&NameIdFormat=email&SAMLRequest=nVRNj9owEP0rkQ%2B9kS%2BWD7kExIJWpWK3EdAeelkZe9h169ipxwH239cJpEJqF6koB0ueNzNv3jxnNDkWKtiDRWl0RpIwJpPxCFmhSjqt3Ktewa8K0AUeppE2gYxUVlPDUCLVrACkjtP19HFJ0zCmpTXOcKNIsJhn5LnfHya9u95ODO%2F6oidi3t0yEnxrG%2FoMD0SsYKHRMe38VZwMOvGwEyebeEC7KU0H4bCbfidBfi59L7WQ%2BuU6j%2B0JhPTTZpN38i%2FrDQmmiGCdbzwzGqsC7BrsXnL4ulpm5NW5EmkUHQ6HEPleotxKJd1byE0RMa9FhGgizpTaMv6TBHMvi9TMNXO0yR7yd%2FLD4jHCEqPP0%2Ftl%2FmQE%2FMCaZhpHtZ7%2BUOZFav85ydTkrHg7ZE0%2FN%2Bg%2BsKL8mDPrNNiFyP6PbdRkP3mRFuLB2IK5DAomFTntmjYbsBdLvq4ta3UkY6OhYf9cZ42ii2qtjZqu89woyd9usdGZ77voJEyaGyk6uwZKm9GmQlhA9EtXyhxmFpiDjDhbAYlaamepQTRW96ZwcLzJ6jNTlMxKrK0AR8ZdK%2Bxl4Znyuq1gd4vMV2Gc8rq0v879cTBW1C8FuB9sY5nG0lh3Xs2%2F%2BIxPsXfk%2BBO9%2FB2MfwM%3D", true, false), 0, "null", 3);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_21(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2BD057F0D202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(12);
					
		headers.add(new RequestHeaderData("Host", "sso.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "9457", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cache-Control", "max-age=0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://jabil.okta.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "application/x-www-form-urlencoded", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://jabil.okta.com/login/sessionCookieRedirect", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_5(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_10 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_10);

	harvestContainer_10.addHarvestInstruction ("resp_hdr_location_1", dcVars[35], "http.{0,1}://.*?(/.*)", 1, 0, 0, 0, false, "location_3", null, 0, false);
	IDataSub subContainer_26 = new DataSub();
	reqAction.addDataSub(subContainer_26);

		ISubRule sub_64 = new SubRule("req_hdr_Referer_1", 0, 50, false, (IDCCoreVar)dcVars[28], false, "Referer_86", null, 0, false);
	subContainer_26.addSubInstruction(sub_64);
		ISubRule sub_65 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[9], false, "Host_165", null, 0, false);
	subContainer_26.addSubInstruction(sub_65);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			postData,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2BD07EC2D202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(302);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_5(HTTPPostData postData) {
					String requestData_5 = MetaString.encode(ZipEntryProxy.asXMLFragment(
	                                   "A1E776C649B74840EC3BE23533313434.testdata",
	                                   "A1E7768D2BD0A5E0D202B93534383732",
	                                   9457));
			
	HTTPPostDataChunk pdc_4 = new HTTPPostDataChunk("A1E7768D2BD0A5E0D202B93534383732", postData, requestData_5, "UTF-8", 9432, 9457);
	postData.addDataChunk(pdc_4);

	IDataSub subContainer_25 = new DataSub();
	pdc_4.addDataSub(subContainer_25);

		ISubRule sub_62 = new SubRule("req_content", 9417, 40, true, (IDCCoreVar)dcVars[33], false, "RelayState", null, 0, false);
	subContainer_25.addSubInstruction(sub_62);
		ISubRule sub_63 = new SubRule("req_content", 13, 9392, true, (IDCCoreVar)dcVars[32], false, "SAMLResponse", null, 0, false);
	subContainer_25.addSubInstruction(sub_63);
	



	}

	public HTTPAction request_22(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2BD0CCE8D202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(9);
					
		headers.add(new RequestHeaderData("Host", "sso.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cache-Control", "max-age=0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://jabil.okta.com/login/sessionCookieRedirect", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, sdch, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_11 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_11);

	harvestContainer_11.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[36], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)_8", null, 0, false);
	harvestContainer_11.addHarvestInstruction ("resp_content", dcVars[37], "<[[^>].]*?name=\"RelayState\"(([[^>].]*?value=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "value_5", null, 0, false);
	harvestContainer_11.addHarvestInstruction ("resp_content", dcVars[38], "(?s)<[[^>].]*?name=\"SAMLResponse\"(([[^>].]*?value=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "value_6", null, 0, false);
	IDataSub subContainer_27 = new DataSub();
	reqAction.addDataSub(subContainer_27);

		ISubRule sub_66 = new SubRule("req_hdr_Referer_1", 0, 50, false, (IDCCoreVar)dcVars[28], false, "Referer_85", null, 0, false);
	subContainer_27.addSubInstruction(sub_66);
		ISubRule sub_67 = new SubRule("req_uri", 0, 856, false, (IDCCoreVar)dcVars[35], false, "Jabil Circuit - Prod_url_2", null, 0, false);
	subContainer_27.addSubInstruction(sub_67);
		ISubRule sub_68 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[9], false, "Host_164", null, 0, false);
	subContainer_27.addSubInstruction(sub_68);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2BD057F0D202B93534383732"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2BD0CCEBD202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
				SubstitutableHTTPContentVP localContentVp_5 = new SubstitutableHTTPContentVP(1, true, null, 0, reqAction);
	
			localContentVp_5.addConstContentElement(contVPElem_4);
	req.addVerificationPoint(localContentVp_5);

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html;charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
private HTTPPage page_8(final IContainer parent) {
			HTTPThink think = new HTTPThink(20, 1000, parent, parent, "A1E7768D2BCC11F3D202B93534383732");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "Incontrol_Verification", "A1E7768D2BCC11F3D202B93534383732") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(4, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_23(this, true, "A1E7768D2BD11B35D202B93534383732", false, false,
						"Config_10", "www.scvisibility.com:443/auth/sso/callback/",	"/auth/sso/callback/", true, false), 0, "null", 3);
				httpParallel.addRequest(0, request_24(this, false, "A1E7768D2BD11B35D202B93534383732", false, true,
						"Config_10", "www.scvisibility.com:443/",	"/", true, false), 0, "null", 3);
				httpParallel.addRequest(0, request_25(this, false, "A1E7768D2BD11B35D202B93534383732", false, false,
						"Config_10", "www.scvisibility.com:443/styles/lib-f36fe5c4b2.css",	"/styles/lib-f36fe5c4b2.css", true, false), 0, "null", 3);
				httpParallel.addRequest(1, request_26(this, false, "A1E7768D2BD33DE0D202B93534383732", false, false,
						"Config_10", "www.scvisibility.com:443/styles/app-4396edd9d0.css",	"/styles/app-4396edd9d0.css", true, false), 18, "A1E7768D2BD1906BD202B93534383732", 3);
				httpParallel.addRequest(2, request_27(this, false, "A1E7768D2BD44F57D202B93534383732", false, false,
						"Config_10", "www.scvisibility.com:443/js/app-1f066487f4.js",	"/js/app-1f066487f4.js", true, false), 18, "A1E7768D2BD1906BD202B93534383732", 3);
				httpParallel.addRequest(3, request_28(this, false, "A1E7768D2C1A31F0D202B93534383732", false, false,
						"Config_10", "www.scvisibility.com:443/js/lib-c47ff678cb.js",	"/js/lib-c47ff678cb.js", true, false), 19, "A1E7768D2BD1906BD202B93534383732", 3);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_23(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2BD14212D202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(12);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "6131", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cache-Control", "max-age=0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://sso.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "application/x-www-form-urlencoded", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://sso.scvisibility.com/FIM/sps/JABLPNodejsSAML20/saml20/logininitial?RequestBinding=HTTPPost&PartnerId=https%3A%2F%2Fwww.scvisibility.com%2Fauth%2Fsso%2Fcallback%2F&NameIdFormat=email&SAMLRequest=nVRNj9owEP0rkQ%2B9kS%2BWD7kExIJWpWK3EdAeelkZe9h169ipxwH239cJpEJqF6koB0ueNzNv3jxnNDkWKtiDRWl0RpIwJpPxCFmhSjqt3Ktewa8K0AUeppE2gYxUVlPDUCLVrACkjtP19HFJ0zCmpTXOcKNIsJhn5LnfHya9u95ODO%2F6oidi3t0yEnxrG%2FoMD0SsYKHRMe38VZwMOvGwEyebeEC7KU0H4bCbfidBfi59L7WQ%2BuU6j%2B0JhPTTZpN38i%2FrDQmmiGCdbzwzGqsC7BrsXnL4ulpm5NW5EmkUHQ6HEPleotxKJd1byE0RMa9FhGgizpTaMv6TBHMvi9TMNXO0yR7yd%2FLD4jHCEqPP0%2Ftl%2FmQE%2FMCaZhpHtZ7%2BUOZFav85ydTkrHg7ZE0%2FN%2Bg%2BsKL8mDPrNNiFyP6PbdRkP3mRFuLB2IK5DAomFTntmjYbsBdLvq4ta3UkY6OhYf9cZ42ii2qtjZqu89woyd9usdGZ77voJEyaGyk6uwZKm9GmQlhA9EtXyhxmFpiDjDhbAYlaamepQTRW96ZwcLzJ6jNTlMxKrK0AR8ZdK%2Bxl4Znyuq1gd4vMV2Gc8rq0v879cTBW1C8FuB9sY5nG0lh3Xs2%2F%2BIxPsXfk%2BBO9%2FB2MfwM%3D", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_6(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_12 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_12);

	harvestContainer_12.addHarvestInstruction ("resp_hdr_Location_1", dcVars[39], ".*", 1, 0, 0, 0, false, "Location_2", null, 0, false);
	IDataSub subContainer_29 = new DataSub();
	reqAction.addDataSub(subContainer_29);

		ISubRule sub_71 = new SubRule("req_hdr_Referer_1", 0, 884, false, (IDCCoreVar)dcVars[36], false, "Referer_84", null, 0, false);
	subContainer_29.addSubInstruction(sub_71);
		ISubRule sub_72 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_163", null, 0, false);
	subContainer_29.addSubInstruction(sub_72);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			postData,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2BD14215D202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(302);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_6(HTTPPostData postData) {
					String requestData_6 = MetaString.encode(ZipEntryProxy.asXMLFragment(
	                                   "A1E776C649B74840EC3BE23533313434.testdata",
	                                   "A1E7768D2BD16950D202B93534383732",
	                                   6131));
			
	HTTPPostDataChunk pdc_5 = new HTTPPostDataChunk("A1E7768D2BD16950D202B93534383732", postData, requestData_6, "UTF-8", 6106, 6131);
	postData.addDataChunk(pdc_5);

	IDataSub subContainer_28 = new DataSub();
	pdc_5.addDataSub(subContainer_28);

		ISubRule sub_69 = new SubRule("req_content", 25, 6106, true, (IDCCoreVar)dcVars[38], false, "SAMLResponse", null, 0, false);
	subContainer_28.addSubInstruction(sub_69);
		ISubRule sub_70 = new SubRule("req_content", 11, 0, true, (IDCCoreVar)dcVars[37], false, "RelayState", null, 0, false);
	subContainer_28.addSubInstruction(sub_70);
	



	}

	public HTTPAction request_24(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2BD1906BD202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(9);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cache-Control", "max-age=0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://sso.scvisibility.com/FIM/sps/JABLPNodejsSAML20/saml20/logininitial?RequestBinding=HTTPPost&PartnerId=https%3A%2F%2Fwww.scvisibility.com%2Fauth%2Fsso%2Fcallback%2F&NameIdFormat=email&SAMLRequest=nVRNj9owEP0rkQ%2B9kS%2BWD7kExIJWpWK3EdAeelkZe9h169ipxwH239cJpEJqF6koB0ueNzNv3jxnNDkWKtiDRWl0RpIwJpPxCFmhSjqt3Ktewa8K0AUeppE2gYxUVlPDUCLVrACkjtP19HFJ0zCmpTXOcKNIsJhn5LnfHya9u95ODO%2F6oidi3t0yEnxrG%2FoMD0SsYKHRMe38VZwMOvGwEyebeEC7KU0H4bCbfidBfi59L7WQ%2BuU6j%2B0JhPTTZpN38i%2FrDQmmiGCdbzwzGqsC7BrsXnL4ulpm5NW5EmkUHQ6HEPleotxKJd1byE0RMa9FhGgizpTaMv6TBHMvi9TMNXO0yR7yd%2FLD4jHCEqPP0%2Ftl%2FmQE%2FMCaZhpHtZ7%2BUOZFav85ydTkrHg7ZE0%2FN%2Bg%2BsKL8mDPrNNiFyP6PbdRkP3mRFuLB2IK5DAomFTntmjYbsBdLvq4ta3UkY6OhYf9cZ42ii2qtjZqu89woyd9usdGZ77voJEyaGyk6uwZKm9GmQlhA9EtXyhxmFpiDjDhbAYlaamepQTRW96ZwcLzJ6jNTlMxKrK0AR8ZdK%2Bxl4Znyuq1gd4vMV2Gc8rq0v879cTBW1C8FuB9sY5nG0lh3Xs2%2F%2BIxPsXfk%2BBO9%2FB2MfwM%3D", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, sdch, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_13 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_13);

	harvestContainer_13.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[40], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)_9", null, 0, false);
	harvestContainer_13.addHarvestInstruction ("resp_content", dcVars[41], "/lib-(.*?)\\.", 1, 1, 0, 0, false, "Src_1", null, 0, false);
	harvestContainer_13.addHarvestInstruction ("resp_content", dcVars[42], "/app-(.*?)\\.", 1, 1, 0, 0, false, "Src_2", null, 0, false);
	harvestContainer_13.addHarvestInstruction ("resp_content", dcVars[43], "/lib-(.*?)\\.", 2, 1, 0, 0, false, "Src_3", null, 0, false);
	harvestContainer_13.addHarvestInstruction ("resp_content", dcVars[44], "/app-(.*?)\\.", 2, 1, 0, 0, false, "Src_4", null, 0, false);
	IDataSub subContainer_30 = new DataSub();
	reqAction.addDataSub(subContainer_30);

		ISubRule sub_73 = new SubRule("req_hdr_Referer_1", 0, 884, false, (IDCCoreVar)dcVars[36], false, "Referer_83", null, 0, false);
	subContainer_30.addSubInstruction(sub_73);
		ISubRule sub_74 = new SubRule("req_uri", 0, 1, false, (IDCCoreVar)dcVars[39], false, "Jabil Circuit - Prod_url", null, 0, false);
	subContainer_30.addSubInstruction(sub_74);
		ISubRule sub_75 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_162", null, 0, false);
	subContainer_30.addSubInstruction(sub_75);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2BD14212D202B93534383732"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2BD1906ED202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
				SubstitutableHTTPContentVP localContentVp_6 = new SubstitutableHTTPContentVP(1, true, null, 0, reqAction);
	
			localContentVp_6.addConstContentElement(contVPElem_0);
	req.addVerificationPoint(localContentVp_6);

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_25(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2BD1DEABD202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/css,*/*;q=0.1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, sdch, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_14 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_14);

	harvestContainer_14.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[45], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)_10", null, 0, false);
	IDataSub subContainer_31 = new DataSub();
	reqAction.addDataSub(subContainer_31);

		ISubRule sub_76 = new SubRule("req_uri", 12, 10, true, (IDCCoreVar)dcVars[41], false, "lib-", null, 0, false);
	subContainer_31.addSubInstruction(sub_76);
		ISubRule sub_77 = new SubRule("req_hdr_Referer_1", 0, 29, false, (IDCCoreVar)dcVars[40], false, "Referer_82", null, 0, false);
	subContainer_31.addSubInstruction(sub_77);
		ISubRule sub_78 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_161", null, 0, false);
	subContainer_31.addSubInstruction(sub_78);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2BD1906BD202B93534383732"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2BD14212D202B93534383732"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2BD1906BD202B93534383732"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2BD1DEAED202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/css; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_26(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2BD33DEDD202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/css,*/*;q=0.1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, sdch, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_15 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_15);

	harvestContainer_15.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[46], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)_11", null, 0, false);
	harvestContainer_15.addHarvestInstruction ("resp_content", dcVars[47], "\\?v=(.*?)\\)", 1, 1, 0, 0, false, "v_2", null, 0, false);
	IDataSub subContainer_32 = new DataSub();
	reqAction.addDataSub(subContainer_32);

		ISubRule sub_79 = new SubRule("req_uri", 12, 10, true, (IDCCoreVar)dcVars[42], false, "app-", null, 0, false);
	subContainer_32.addSubInstruction(sub_79);
		ISubRule sub_80 = new SubRule("req_hdr_Referer_1", 0, 29, false, (IDCCoreVar)dcVars[40], false, "Referer_81", null, 0, false);
	subContainer_32.addSubInstruction(sub_80);
		ISubRule sub_81 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_160", null, 0, false);
	subContainer_32.addSubInstruction(sub_81);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2BD1906BD202B93534383732"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2BD14212D202B93534383732"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2BD1906BD202B93534383732"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2BD33DF0D202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/css; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_27(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2BD44F64D202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, sdch, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_33 = new DataSub();
	reqAction.addDataSub(subContainer_33);

		ISubRule sub_82 = new SubRule("req_uri", 8, 10, true, (IDCCoreVar)dcVars[44], false, "app-_2", null, 0, false);
	subContainer_33.addSubInstruction(sub_82);
		ISubRule sub_83 = new SubRule("req_hdr_Referer_1", 0, 29, false, (IDCCoreVar)dcVars[40], false, "Referer_80", null, 0, false);
	subContainer_33.addSubInstruction(sub_83);
		ISubRule sub_84 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_159", null, 0, false);
	subContainer_33.addSubInstruction(sub_84);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2BD1906BD202B93534383732"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2BD14212D202B93534383732"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2BD1906BD202B93534383732"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2BD47662D202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_28(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2C1A31FDD202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, sdch, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_34 = new DataSub();
	reqAction.addDataSub(subContainer_34);

		ISubRule sub_85 = new SubRule("req_uri", 8, 10, true, (IDCCoreVar)dcVars[43], false, "lib-_2", null, 0, false);
	subContainer_34.addSubInstruction(sub_85);
		ISubRule sub_86 = new SubRule("req_hdr_Referer_1", 0, 29, false, (IDCCoreVar)dcVars[40], false, "Referer_79", null, 0, false);
	subContainer_34.addSubInstruction(sub_86);
		ISubRule sub_87 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_158", null, 0, false);
	subContainer_34.addSubInstruction(sub_87);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2BD1906BD202B93534383732"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2BD14212D202B93534383732"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2BD1906BD202B93534383732"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2C1A3200D202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/javascript");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
private HTTPPage page_9(final IContainer parent) {
			HTTPThink think = new HTTPThink(20, 1000, parent, parent, "A1E7777C4FEDE410DCF4B83631323436");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "ER_TC4_FFC_APIS_Incontrol_LandingPage", "A1E7777C4FEDE410DCF4B83631323436") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(6, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_29(this, true, "A1E7768D2C1A31F0D202B93534383732", false, true,
						"Config_10", "www.scvisibility.com:443/?_=1501572896230",	"/?_=1501572896230", true, false), 0, "null", 3);
				httpParallel.addRequest(1, request_30(this, false, "A1E7768D2BD44F57D202B93534383732", false, false,
						"Config_10", "www.scvisibility.com:443/usernameEnv",	"/usernameEnv", true, false), 1, "A1E7768D2C2E5636D202B93534383732", 3);
				httpParallel.addRequest(0, request_31(this, false, "A1E7768D2C1A31F0D202B93534383732", false, false,
						"Config_10", "www.scvisibility.com:443/ffc/api/userProfile/profileByEmail",	"/ffc/api/userProfile/profileByEmail", true, false), 0, "null", 3);
				httpParallel.addRequest(0, request_32(this, false, "A1E7768D2C1A31F0D202B93534383732", false, false,
						"Config_10", "www.scvisibility.com:443/ffc/api/authorization/rolesAndPermissions?subscriberId=1",	"/ffc/api/authorization/rolesAndPermissions?subscriberId=1", true, false), 0, "null", 3);
				httpParallel.addRequest(0, request_33(this, false, "A1E7768D2C1A31F0D202B93534383732", false, false,
						"Config_10", "www.scvisibility.com:443/api/translation?$http=%7B%7D&key=en-us",	"/api/translation?$http=%7B%7D&key=en-us", true, false), 0, "null", 3);
				httpParallel.addRequest(1, request_34(this, false, "A1E7768D2BD44F57D202B93534383732", false, false,
						"Config_10", "www.scvisibility.com:443/api/tooltip?$http=%7B%7D&key=en-us",	"/api/tooltip?$http=%7B%7D&key=en-us", true, false), 0, "null", 3);
				httpParallel.addRequest(2, request_35(this, false, "A1E7768D2BD33DE0D202B93534383732", false, false,
						"Config_10", "www.scvisibility.com:443/api/error?$http=%7B%7D&key=en-us",	"/api/error?$http=%7B%7D&key=en-us", true, false), 8, "A1E7768D2C2E5636D202B93534383732", 3);
				httpParallel.addRequest(0, request_36(this, false, "A1E7768D2C1A31F0D202B93534383732", false, false,
						"Config_10", "www.scvisibility.com:443/api/config",	"/api/config", true, false), 0, "null", 3);
				httpParallel.addRequest(1, request_37(this, false, "A1E7768D2BD44F57D202B93534383732", false, false,
						"Config_10", "www.scvisibility.com:443/images/AddMsg.svg",	"/images/AddMsg.svg", true, false), 0, "null", 3);
				httpParallel.addRequest(0, request_38(this, false, "A1E7768D2C1A31F0D202B93534383732", false, false,
						"Config_10", "www.scvisibility.com:443/images/Attachment_InThread.svg",	"/images/Attachment_InThread.svg", true, false), 0, "null", 3);
				httpParallel.addRequest(3, request_39(this, false, "A1E7768D2BD11B35D202B93534383732", false, false,
						"Config_10", "www.scvisibility.com:443/images/Home_grey.svg",	"/images/Home_grey.svg", true, false), 0, "A1E7768D2C2E5636D202B93534383732", 3);
				httpParallel.addRequest(3, request_40(this, false, "A1E7768D2BD11B35D202B93534383732", false, false,
						"Config_10", "www.scvisibility.com:443/fonts/Titillium_Web/TitilliumWeb-SemiBold.ttf",	"/fonts/Titillium_Web/TitilliumWeb-SemiBold.ttf", true, false), 0, "null", 3);
				httpParallel.addRequest(2, request_41(this, false, "A1E7768D2BD33DE0D202B93534383732", false, false,
						"Config_10", "www.scvisibility.com:443/images/Message_Inactive.svg",	"/images/Message_Inactive.svg", true, false), 0, "null", 3);
				httpParallel.addRequest(1, request_42(this, false, "A1E7768D2BD44F57D202B93534383732", false, false,
						"Config_10", "www.scvisibility.com:443/images/Alerts_Inactive.svg",	"/images/Alerts_Inactive.svg", true, false), 0, "null", 3);
				httpParallel.addRequest(1, request_43(this, false, "A1E7768D2BD44F57D202B93534383732", false, false,
						"Config_10", "www.scvisibility.com:443/images/filter_Inactive.svg",	"/images/filter_Inactive.svg", true, false), 0, "null", 3);
				httpParallel.addRequest(3, request_44(this, false, "A1E7768D2BD11B35D202B93534383732", false, false,
						"Config_10", "www.scvisibility.com:443/images/MyStories_grey.svg",	"/images/MyStories_grey.svg", true, false), 0, "null", 3);
				httpParallel.addRequest(0, request_45(this, false, "A1E7768D2C1A31F0D202B93534383732", false, false,
						"Config_10", "www.scvisibility.com:443/images/User_grey.svg",	"/images/User_grey.svg", true, false), 0, "null", 3);
				httpParallel.addRequest(2, request_46(this, false, "A1E7768D2BD33DE0D202B93534383732", false, false,
						"Config_10", "www.scvisibility.com:443/ffc/api/authorization/heirarchyFilters?subscriberId=1&userId=71",	"/ffc/api/authorization/heirarchyFilters?subscriberId=1&userId=71", true, false), 0, "null", 3);
				httpParallel.addRequest(1, request_47(this, false, "A1E7768D2BD44F57D202B93534383732", false, false,
						"Config_10", "www.scvisibility.com:443/ffc/api/authorization/applications?subscriberId=1&userId=71",	"/ffc/api/authorization/applications?subscriberId=1&userId=71", true, false), 0, "null", 3);
				httpParallel.addRequest(0, request_48(this, false, "A1E7768D2C1A31F0D202B93534383732", false, false,
						"Config_10", "www.scvisibility.com:443/ffc/api/general/appNavigation?userId=71&subscriberId=1",	"/ffc/api/general/appNavigation?userId=71&subscriberId=1", true, false), 0, "null", 3);
				httpParallel.addRequest(3, request_49(this, false, "A1E7768D2BD11B35D202B93534383732", false, false,
						"Config_10", "www.scvisibility.com:443/ffc/api/groupAdmin/groupsAndMembers?userId=71&subscriberId=1&applicationId=10",	"/ffc/api/groupAdmin/groupsAndMembers?userId=71&subscriberId=1&applicationId=10", true, false), 0, "null", 3);
				httpParallel.addRequest(1, request_50(this, false, "A1E7768D2BD44F57D202B93534383732", false, false,
						"Config_10", "www.scvisibility.com:443/ffc/api//story/stories?userId=71&subscriberId=1&applicationId=10",	"/ffc/api//story/stories?userId=71&subscriberId=1&applicationId=10", true, false), 0, "null", 3);
				httpParallel.addRequest(2, request_51(this, false, "A1E7768D2BD33DE0D202B93534383732", false, false,
						"Config_10", "www.scvisibility.com:443/ffc/api/authorization/heirarchyFiltersAsCogs?userId=71&subscriberId=1",	"/ffc/api/authorization/heirarchyFiltersAsCogs?userId=71&subscriberId=1", true, false), 0, "null", 3);
				httpParallel.addRequest(0, request_52(this, false, "A1E7768D2C1A31F0D202B93534383732", false, false,
						"Config_10", "www.scvisibility.com:443/ffc/api/authorization/heirarchyFilters?subscriberId=1&userId=71&hierarchyBranchId=99",	"/ffc/api/authorization/heirarchyFilters?subscriberId=1&userId=71&hierarchyBranchId=99", true, false), 0, "null", 3);
				httpParallel.addRequest(0, request_53(this, false, "A1E7768D2C1A31F0D202B93534383732", false, false,
						"Config_10", "www.scvisibility.com:443/fonts/Roboto/Roboto-Regular.ttf",	"/fonts/Roboto/Roboto-Regular.ttf", true, false), 0, "null", 3);
				httpParallel.addRequest(3, request_54(this, false, "A1E7768D2BD11B35D202B93534383732", false, false,
						"Config_10", "www.scvisibility.com:443/fonts/Titillium_Web/TitilliumWeb-Regular.ttf",	"/fonts/Titillium_Web/TitilliumWeb-Regular.ttf", true, false), 0, "null", 3);
				httpParallel.addRequest(3, request_55(this, false, "A1E7768D2BD11B35D202B93534383732", false, false,
						"Config_10", "www.scvisibility.com:443/ffc/api/general/appNavigation?userId=71&subscriberId=1",	"/ffc/api/general/appNavigation?userId=71&subscriberId=1", true, false), 0, "null", 3);
				httpParallel.addRequest(0, request_56(this, false, "A1E7768D2C1A31F0D202B93534383732", false, false,
						"Config_10", "www.scvisibility.com:443/ffc/api/authorization/heirarchyFilters?subscriberId=1&userId=71&hierarchyBranchId=97",	"/ffc/api/authorization/heirarchyFilters?subscriberId=1&userId=71&hierarchyBranchId=97", true, false), 0, "null", 3);
				httpParallel.addRequest(3, request_57(this, false, "A1E7768D2BD11B35D202B93534383732", false, false,
						"Config_10", "www.scvisibility.com:443/ffc/api//story/templates?userId=71&subscriberId=1&applicationId=10&isUserSpecific=false",	"/ffc/api//story/templates?userId=71&subscriberId=1&applicationId=10&isUserSpecific=false", true, false), 0, "null", 3);
				httpParallel.addRequest(1, request_58(this, false, "A1E7768D2BD44F57D202B93534383732", false, false,
						"Config_10", "www.scvisibility.com:443/ffc/api//story/stories?userId=71&subscriberId=1&applicationId=10",	"/ffc/api//story/stories?userId=71&subscriberId=1&applicationId=10", true, false), 0, "null", 3);
				httpParallel.addRequest(0, request_59(this, false, "A1E7768D2C1A31F0D202B93534383732", false, false,
						"Config_10", "www.scvisibility.com:443/collab/api/collaboration/unReadMessageCount?userId=71",	"/collab/api/collaboration/unReadMessageCount?userId=71", true, false), 0, "null", 3);
				httpParallel.addRequest(4, request_60(this, false, "A1E7768D2C5C9244D202B93534383732", false, false,
						"Config_10", "www.scvisibility.com:443/events/api/platform/notification/alertUnreadCount?userId=71&subscriberId=1&applicationId=10",	"/events/api/platform/notification/alertUnreadCount?userId=71&subscriberId=1&applicationId=10", true, false), 9, "A1E7768D2C2E5636D202B93534383732", 3);
				httpParallel.addRequest(5, request_61(this, false, "A1E7768D2C5CE074D202B93534383732", false, false,
						"Config_10", "www.scvisibility.com:443/collab/api/collaboration/toList?userId=71",	"/collab/api/collaboration/toList?userId=71", true, false), 9, "A1E7768D2C2E5636D202B93534383732", 3);
				httpParallel.addRequest(4, request_62(this, false, "A1E7768D2C5C9244D202B93534383732", false, false,
						"Config_10", "www.scvisibility.com:443/images/Widget_Library.svg",	"/images/Widget_Library.svg", true, false), 0, "null", 3);
				httpParallel.addRequest(4, request_63(this, false, "A1E7768D2C5C9244D202B93534383732", false, false,
						"Config_10", "www.scvisibility.com:443/images/SprintZeroZoomOut.svg",	"/images/SprintZeroZoomOut.svg", true, false), 0, "null", 3);
				httpParallel.addRequest(4, request_64(this, false, "A1E7768D2C5C9244D202B93534383732", false, false,
						"Config_10", "www.scvisibility.com:443/images/SprintZeroZoomIn.svg",	"/images/SprintZeroZoomIn.svg", true, false), 0, "null", 3);
				httpParallel.addRequest(0, request_65(this, false, "A1E7768D2C1A31F0D202B93534383732", false, false,
						"Config_10", "www.scvisibility.com:443/images/oval_2.svg",	"/images/oval_2.svg", true, false), 0, "null", 3);
				httpParallel.addRequest(4, request_66(this, false, "A1E7768D2C5C9244D202B93534383732", false, false,
						"Config_10", "www.scvisibility.com:443/images/Administration_grey.svg",	"/images/Administration_grey.svg", true, false), 0, "null", 3);
				httpParallel.addRequest(3, request_67(this, false, "A1E7768D2BD11B35D202B93534383732", false, false,
						"Config_10", "www.scvisibility.com:443/images/SupplyChainDiagnostics_grey.svg",	"/images/SupplyChainDiagnostics_grey.svg", true, false), 0, "null", 3);
				httpParallel.addRequest(1, request_68(this, false, "A1E7768D2BD44F57D202B93534383732", false, false,
						"Config_10", "www.scvisibility.com:443/images/EventRisk_grey.svg",	"/images/EventRisk_grey.svg", true, false), 0, "null", 3);
				httpParallel.addRequest(0, request_69(this, false, "A1E7768D2C1A31F0D202B93534383732", false, false,
						"Config_10", "www.scvisibility.com:443/images/SupplyChainVisibility_grey.svg",	"/images/SupplyChainVisibility_grey.svg", true, false), 0, "null", 3);
				httpParallel.addRequest(5, request_70(this, false, "A1E7768D2C5CE074D202B93534383732", false, false,
						"Config_10", "www.scvisibility.com:443/fonts/Roboto/Roboto-Medium.ttf",	"/fonts/Roboto/Roboto-Medium.ttf", true, false), 0, "null", 3);
				httpParallel.addRequest(0, request_71(this, false, "A1E7768D2C1A31F0D202B93534383732", false, false,
						"Config_10", "www.scvisibility.com:443/fonts/glyphicons-halflings-regular.woff2",	"/fonts/glyphicons-halflings-regular.woff2", true, false), 0, "null", 3);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_29(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2C2E5636D202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("X-Requested-With", "XMLHttpRequest", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, sdch, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_35 = new DataSub();
	reqAction.addDataSub(subContainer_35);

		ISubRule sub_88 = new SubRule("req_hdr_Referer_1", 0, 29, false, (IDCCoreVar)dcVars[40], false, "Referer_78", null, 0, false);
	subContainer_35.addSubInstruction(sub_88);
		ISubRule sub_89 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_157", null, 0, false);
	subContainer_35.addSubInstruction(sub_89);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2C2E5639D202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_30(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2C2EA460D202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, sdch, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_16 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_16);

	harvestContainer_16.addHarvestInstruction ("resp_content", dcVars[48], "\"user\":\"(.*?)\"", 1, 1, 0, 0, false, "User_email", null, 0, false);
	IDataSub subContainer_36 = new DataSub();
	reqAction.addDataSub(subContainer_36);

		ISubRule sub_90 = new SubRule("req_hdr_Referer_1", 0, 29, false, (IDCCoreVar)dcVars[40], false, "Referer_77", null, 0, false);
	subContainer_36.addSubInstruction(sub_90);
		ISubRule sub_91 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_156", null, 0, false);
	subContainer_36.addSubInstruction(sub_91);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2C2E5636D202B93534383732"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2C2EA463D202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json; charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_31(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2C2ECB95D202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "45", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "application/json", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_7(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_17 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_17);

	harvestContainer_17.addHarvestInstruction ("resp_content", dcVars[49], "\"userId\":(.*?),", 1, 1, 0, 0, false, "User_id", null, 0, false);
	IDataSub subContainer_38 = new DataSub();
	reqAction.addDataSub(subContainer_38);

		ISubRule sub_93 = new SubRule("req_hdr_Referer_1", 0, 29, false, (IDCCoreVar)dcVars[40], false, "Referer_76", null, 0, false);
	subContainer_38.addSubInstruction(sub_93);
		ISubRule sub_94 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_155", null, 0, false);
	subContainer_38.addSubInstruction(sub_94);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2C2EA460D202B93534383732"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			postData,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2C2ECB98D202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
				SubstitutableHTTPContentVP localContentVp_7 = new SubstitutableHTTPContentVP(1, true, null, 0, reqAction);
	
			localContentVp_7.addConstContentElement(contVPElem_5);
	req.addVerificationPoint(localContentVp_7);

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_7(HTTPPostData postData) {
				StringBuffer strBuf_3 = new StringBuffer();
strBuf_3.append("{\"data\":{\"emailId\":\"IDSE_User304@jabil.com\"}}");
String requestData_7 = strBuf_3.toString();
			
	HTTPPostDataChunk pdc_6 = new HTTPPostDataChunk("A1E7768D2C2EF270D202B93534383732", postData, requestData_7, "UTF-8", 22, 42);
	postData.addDataChunk(pdc_6);

	IDataSub subContainer_37 = new DataSub();
	pdc_6.addDataSub(subContainer_37);

		ISubRule sub_92 = new SubRule("req_content", 20, 22, false, (IDCCoreVar)dcVars[48], false, "emailId", null, 0, false);
	subContainer_37.addSubInstruction(sub_92);
	



	}

	public HTTPAction request_32(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2C2F4097D202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "35", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "application/json", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_8(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_40 = new DataSub();
	reqAction.addDataSub(subContainer_40);

		ISubRule sub_96 = new SubRule("req_hdr_Referer_1", 0, 29, false, (IDCCoreVar)dcVars[40], false, "Referer_74", null, 0, false);
	subContainer_40.addSubInstruction(sub_96);
		ISubRule sub_97 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_153", null, 0, false);
	subContainer_40.addSubInstruction(sub_97);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2C2EA460D202B93534383732"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2C2E5636D202B93534383732"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			postData,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2C2F409AD202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_8(HTTPPostData postData) {
				StringBuffer strBuf_4 = new StringBuffer();
strBuf_4.append("{\"data\":{\"userName\":\"IDSE_User304@jabil.com\"}}");
String requestData_8 = strBuf_4.toString();
			
	HTTPPostDataChunk pdc_7 = new HTTPPostDataChunk("A1E7768D2C2F40DBD202B93534383732", postData, requestData_8, "UTF-8", 22, 43);
	postData.addDataChunk(pdc_7);

	IDataSub subContainer_39 = new DataSub();
	pdc_7.addDataSub(subContainer_39);

		ISubRule sub_95 = new SubRule("req_content", 21, 22, false, (IDCCoreVar)dcVars[48], false, "userName", null, 0, false);
	subContainer_39.addSubInstruction(sub_95);
	



	}

	public HTTPAction request_33(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2C2F8EB5D202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/plain, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, sdch, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_41 = new DataSub();
	reqAction.addDataSub(subContainer_41);

		ISubRule sub_98 = new SubRule("req_hdr_Referer_1", 0, 29, false, (IDCCoreVar)dcVars[40], false, "Referer_73", null, 0, false);
	subContainer_41.addSubInstruction(sub_98);
		ISubRule sub_99 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_152", null, 0, false);
	subContainer_41.addSubInstruction(sub_99);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2C2F8EB8D202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json; charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_34(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2C2FDCD1D202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/plain, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, sdch, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_42 = new DataSub();
	reqAction.addDataSub(subContainer_42);

		ISubRule sub_100 = new SubRule("req_hdr_Referer_1", 0, 29, false, (IDCCoreVar)dcVars[40], false, "Referer_72", null, 0, false);
	subContainer_42.addSubInstruction(sub_100);
		ISubRule sub_101 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_151", null, 0, false);
	subContainer_42.addSubInstruction(sub_101);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2C2FDCD4D202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json; charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_35(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2C300408D202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/plain, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, sdch, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_43 = new DataSub();
	reqAction.addDataSub(subContainer_43);

		ISubRule sub_102 = new SubRule("req_hdr_Referer_1", 0, 29, false, (IDCCoreVar)dcVars[40], false, "Referer_71", null, 0, false);
	subContainer_43.addSubInstruction(sub_102);
		ISubRule sub_103 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_150", null, 0, false);
	subContainer_43.addSubInstruction(sub_103);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2C30040BD202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json; charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_36(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2C302B3DD202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/plain, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, sdch, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_44 = new DataSub();
	reqAction.addDataSub(subContainer_44);

		ISubRule sub_104 = new SubRule("req_hdr_Referer_1", 0, 29, false, (IDCCoreVar)dcVars[40], false, "Referer_70", null, 0, false);
	subContainer_44.addSubInstruction(sub_104);
		ISubRule sub_105 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_149", null, 0, false);
	subContainer_44.addSubInstruction(sub_105);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2C302B40D202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/json; charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_37(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2C322705D202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, sdch, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_45 = new DataSub();
	reqAction.addDataSub(subContainer_45);

		ISubRule sub_106 = new SubRule("req_hdr_Referer_1", 0, 29, false, (IDCCoreVar)dcVars[40], false, "Referer_64", null, 0, false);
	subContainer_45.addSubInstruction(sub_106);
		ISubRule sub_107 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_143", null, 0, false);
	subContainer_45.addSubInstruction(sub_107);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2C2E5636D202B93534383732"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2C322708D202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/svg+xml");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_38(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2C3274EBD202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, sdch, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_46 = new DataSub();
	reqAction.addDataSub(subContainer_46);

		ISubRule sub_108 = new SubRule("req_hdr_Referer_1", 0, 29, false, (IDCCoreVar)dcVars[40], false, "Referer_63", null, 0, false);
	subContainer_46.addSubInstruction(sub_108);
		ISubRule sub_109 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_142", null, 0, false);
	subContainer_46.addSubInstruction(sub_109);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2C2E5636D202B93534383732"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2C3274EED202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/svg+xml");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_39(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2C329C3CD202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/styles/app-4396edd9d0.css", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, sdch, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_47 = new DataSub();
	reqAction.addDataSub(subContainer_47);

		ISubRule sub_110 = new SubRule("req_hdr_Referer_1", 0, 54, false, (IDCCoreVar)dcVars[46], false, "Referer_62", null, 0, false);
	subContainer_47.addSubInstruction(sub_110);
		ISubRule sub_111 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_141", null, 0, false);
	subContainer_47.addSubInstruction(sub_111);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2C2E5636D202B93534383732"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2C329C3FD202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/svg+xml");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_40(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2C32C35AD202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/styles/app-4396edd9d0.css", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, sdch, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_48 = new DataSub();
	reqAction.addDataSub(subContainer_48);

		ISubRule sub_112 = new SubRule("req_hdr_Referer_1", 0, 54, false, (IDCCoreVar)dcVars[46], false, "Referer_61", null, 0, false);
	subContainer_48.addSubInstruction(sub_112);
		ISubRule sub_113 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_140", null, 0, false);
	subContainer_48.addSubInstruction(sub_113);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2C2E5636D202B93534383732"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2C32C35DD202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/x-font-ttf");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_41(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2C39C7E7D202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/styles/app-4396edd9d0.css", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, sdch, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_49 = new DataSub();
	reqAction.addDataSub(subContainer_49);

		ISubRule sub_114 = new SubRule("req_hdr_Referer_1", 0, 54, false, (IDCCoreVar)dcVars[46], false, "Referer_60", null, 0, false);
	subContainer_49.addSubInstruction(sub_114);
		ISubRule sub_115 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_139", null, 0, false);
	subContainer_49.addSubInstruction(sub_115);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2C2E5636D202B93534383732"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2C39C7EAD202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/svg+xml");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_42(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2C39EF47D202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/styles/app-4396edd9d0.css", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, sdch, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_50 = new DataSub();
	reqAction.addDataSub(subContainer_50);

		ISubRule sub_116 = new SubRule("req_hdr_Referer_1", 0, 54, false, (IDCCoreVar)dcVars[46], false, "Referer_59", null, 0, false);
	subContainer_50.addSubInstruction(sub_116);
		ISubRule sub_117 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_138", null, 0, false);
	subContainer_50.addSubInstruction(sub_117);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2C2E5636D202B93534383732"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2C39EF4AD202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/svg+xml");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_43(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2C3A3D2BD202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/styles/app-4396edd9d0.css", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, sdch, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_51 = new DataSub();
	reqAction.addDataSub(subContainer_51);

		ISubRule sub_118 = new SubRule("req_hdr_Referer_1", 0, 54, false, (IDCCoreVar)dcVars[46], false, "Referer_58", null, 0, false);
	subContainer_51.addSubInstruction(sub_118);
		ISubRule sub_119 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_137", null, 0, false);
	subContainer_51.addSubInstruction(sub_119);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2C2E5636D202B93534383732"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2C3A3D2ED202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/svg+xml");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_44(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2C3A6473D202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/styles/app-4396edd9d0.css", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, sdch, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

		reqAction.setTimeoutDuration(4, 60000);		
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_52 = new DataSub();
	reqAction.addDataSub(subContainer_52);

		ISubRule sub_120 = new SubRule("req_hdr_Referer_1", 0, 54, false, (IDCCoreVar)dcVars[46], false, "Referer_57", null, 0, false);
	subContainer_52.addSubInstruction(sub_120);
		ISubRule sub_121 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_136", null, 0, false);
	subContainer_52.addSubInstruction(sub_121);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2C2E5636D202B93534383732"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2C3A6476D202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/svg+xml");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_45(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2C3A8B8DD202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/styles/app-4396edd9d0.css", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, sdch, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_53 = new DataSub();
	reqAction.addDataSub(subContainer_53);

		ISubRule sub_122 = new SubRule("req_hdr_Referer_1", 0, 54, false, (IDCCoreVar)dcVars[46], false, "Referer_56", null, 0, false);
	subContainer_53.addSubInstruction(sub_122);
		ISubRule sub_123 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_135", null, 0, false);
	subContainer_53.addSubInstruction(sub_123);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2C2E5636D202B93534383732"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2C3A8B90D202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/svg+xml");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_46(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2C3B27C7D202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/plain, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, sdch, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_54 = new DataSub();
	reqAction.addDataSub(subContainer_54);

		ISubRule sub_124 = new SubRule("req_uri", 62, 2, true, (IDCCoreVar)dcVars[49], false, "userId", null, 0, false);
	subContainer_54.addSubInstruction(sub_124);
		ISubRule sub_125 = new SubRule("req_hdr_Referer_1", 0, 29, false, (IDCCoreVar)dcVars[40], false, "Referer_54", null, 0, false);
	subContainer_54.addSubInstruction(sub_125);
		ISubRule sub_126 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_133", null, 0, false);
	subContainer_54.addSubInstruction(sub_126);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2C2ECB95D202B93534383732"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2C2E5636D202B93534383732"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2C3B27CAD202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_47(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2C3B7598D202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/plain, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, sdch, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_55 = new DataSub();
	reqAction.addDataSub(subContainer_55);

		ISubRule sub_127 = new SubRule("req_uri", 58, 2, true, (IDCCoreVar)dcVars[49], false, "userId", null, 0, false);
	subContainer_55.addSubInstruction(sub_127);
		ISubRule sub_128 = new SubRule("req_hdr_Referer_1", 0, 29, false, (IDCCoreVar)dcVars[40], false, "Referer_53", null, 0, false);
	subContainer_55.addSubInstruction(sub_128);
		ISubRule sub_129 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_132", null, 0, false);
	subContainer_55.addSubInstruction(sub_129);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2C2ECB95D202B93534383732"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2C2E5636D202B93534383732"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2C3B759BD202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_48(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2C3BC3C3D202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/plain, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, sdch, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_56 = new DataSub();
	reqAction.addDataSub(subContainer_56);

		ISubRule sub_130 = new SubRule("req_uri", 38, 2, true, (IDCCoreVar)dcVars[49], false, "userId", null, 0, false);
	subContainer_56.addSubInstruction(sub_130);
		ISubRule sub_131 = new SubRule("req_hdr_Referer_1", 0, 29, false, (IDCCoreVar)dcVars[40], false, "Referer_52", null, 0, false);
	subContainer_56.addSubInstruction(sub_131);
		ISubRule sub_132 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_131", null, 0, false);
	subContainer_56.addSubInstruction(sub_132);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2C2ECB95D202B93534383732"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2C2E5636D202B93534383732"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2C3BC3C6D202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_49(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2C3C121DD202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/plain, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, sdch, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_57 = new DataSub();
	reqAction.addDataSub(subContainer_57);

		ISubRule sub_133 = new SubRule("req_uri", 44, 2, true, (IDCCoreVar)dcVars[49], false, "userId", null, 0, false);
	subContainer_57.addSubInstruction(sub_133);
		ISubRule sub_134 = new SubRule("req_hdr_Referer_1", 0, 29, false, (IDCCoreVar)dcVars[40], false, "Referer_51", null, 0, false);
	subContainer_57.addSubInstruction(sub_134);
		ISubRule sub_135 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_130", null, 0, false);
	subContainer_57.addSubInstruction(sub_135);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2C2ECB95D202B93534383732"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2C2E5636D202B93534383732"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2C3C1220D202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_50(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2C3C871CD202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/plain, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, sdch, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_58 = new DataSub();
	reqAction.addDataSub(subContainer_58);

		ISubRule sub_136 = new SubRule("req_uri", 31, 2, true, (IDCCoreVar)dcVars[49], false, "userId", null, 0, false);
	subContainer_58.addSubInstruction(sub_136);
		ISubRule sub_137 = new SubRule("req_hdr_Referer_1", 0, 29, false, (IDCCoreVar)dcVars[40], false, "Referer_50", null, 0, false);
	subContainer_58.addSubInstruction(sub_137);
		ISubRule sub_138 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_129", null, 0, false);
	subContainer_58.addSubInstruction(sub_138);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2C2ECB95D202B93534383732"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2C2E5636D202B93534383732"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2C3CAE10D202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_51(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2C3CD576D202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/plain, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, sdch, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_59 = new DataSub();
	reqAction.addDataSub(subContainer_59);

		ISubRule sub_139 = new SubRule("req_uri", 53, 2, true, (IDCCoreVar)dcVars[49], false, "userId", null, 0, false);
	subContainer_59.addSubInstruction(sub_139);
		ISubRule sub_140 = new SubRule("req_hdr_Referer_1", 0, 29, false, (IDCCoreVar)dcVars[40], false, "Referer_49", null, 0, false);
	subContainer_59.addSubInstruction(sub_140);
		ISubRule sub_141 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_128", null, 0, false);
	subContainer_59.addSubInstruction(sub_141);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2C2ECB95D202B93534383732"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2C2E5636D202B93534383732"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2C3CD579D202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_52(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2C3D9877D202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/plain, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, sdch, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_60 = new DataSub();
	reqAction.addDataSub(subContainer_60);

		ISubRule sub_142 = new SubRule("req_uri", 62, 2, true, (IDCCoreVar)dcVars[49], false, "userId", null, 0, false);
	subContainer_60.addSubInstruction(sub_142);
		ISubRule sub_143 = new SubRule("req_hdr_Referer_1", 0, 29, false, (IDCCoreVar)dcVars[40], false, "Referer_48", null, 0, false);
	subContainer_60.addSubInstruction(sub_143);
		ISubRule sub_144 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_127", null, 0, false);
	subContainer_60.addSubInstruction(sub_144);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2C2ECB95D202B93534383732"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2C2E5636D202B93534383732"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2C3D987AD202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_53(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2C3DE6DDD202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/styles/app-4396edd9d0.css", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, sdch, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_61 = new DataSub();
	reqAction.addDataSub(subContainer_61);

		ISubRule sub_145 = new SubRule("req_hdr_Referer_1", 0, 54, false, (IDCCoreVar)dcVars[46], false, "Referer_47", null, 0, false);
	subContainer_61.addSubInstruction(sub_145);
		ISubRule sub_146 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_126", null, 0, false);
	subContainer_61.addSubInstruction(sub_146);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2C2E5636D202B93534383732"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2C3DE6E0D202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/x-font-ttf");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_54(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2C534357D202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/styles/app-4396edd9d0.css", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, sdch, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_62 = new DataSub();
	reqAction.addDataSub(subContainer_62);

		ISubRule sub_147 = new SubRule("req_hdr_Referer_1", 0, 54, false, (IDCCoreVar)dcVars[46], false, "Referer_46", null, 0, false);
	subContainer_62.addSubInstruction(sub_147);
		ISubRule sub_148 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_125", null, 0, false);
	subContainer_62.addSubInstruction(sub_148);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2C2E5636D202B93534383732"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2C53435AD202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/x-font-ttf");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_55(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2C5A6F47D202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/plain, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, sdch, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-None-Match", "W/\"48c-ig+/n++IozM/mCcY1vKqTg\"", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_63 = new DataSub();
	reqAction.addDataSub(subContainer_63);

		ISubRule sub_149 = new SubRule("req_uri", 38, 2, true, (IDCCoreVar)dcVars[49], false, "userId", null, 0, false);
	subContainer_63.addSubInstruction(sub_149);
		ISubRule sub_150 = new SubRule("req_hdr_Referer_1", 0, 29, false, (IDCCoreVar)dcVars[40], false, "Referer_45", null, 0, false);
	subContainer_63.addSubInstruction(sub_150);
		ISubRule sub_151 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_124", null, 0, false);
	subContainer_63.addSubInstruction(sub_151);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2C2ECB95D202B93534383732"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2C2E5636D202B93534383732"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2C5A6F4AD202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_56(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2C5A9684D202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/plain, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, sdch, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_64 = new DataSub();
	reqAction.addDataSub(subContainer_64);

		ISubRule sub_152 = new SubRule("req_uri", 62, 2, true, (IDCCoreVar)dcVars[49], false, "userId", null, 0, false);
	subContainer_64.addSubInstruction(sub_152);
		ISubRule sub_153 = new SubRule("req_hdr_Referer_1", 0, 29, false, (IDCCoreVar)dcVars[40], false, "Referer_44", null, 0, false);
	subContainer_64.addSubInstruction(sub_153);
		ISubRule sub_154 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_123", null, 0, false);
	subContainer_64.addSubInstruction(sub_154);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2C2ECB95D202B93534383732"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2C2E5636D202B93534383732"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2C5A9687D202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_57(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2C5BCF08D202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/plain, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, sdch, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_65 = new DataSub();
	reqAction.addDataSub(subContainer_65);

		ISubRule sub_155 = new SubRule("req_uri", 33, 2, true, (IDCCoreVar)dcVars[49], false, "userId", null, 0, false);
	subContainer_65.addSubInstruction(sub_155);
		ISubRule sub_156 = new SubRule("req_hdr_Referer_1", 0, 29, false, (IDCCoreVar)dcVars[40], false, "Referer_41", null, 0, false);
	subContainer_65.addSubInstruction(sub_156);
		ISubRule sub_157 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_119", null, 0, false);
	subContainer_65.addSubInstruction(sub_157);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2C2ECB95D202B93534383732"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2C2E5636D202B93534383732"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2C5BCF0BD202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_58(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2C5C1D0BD202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/plain, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, sdch, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-None-Match", "W/\"338-egukxpJP25NbjQlsXsK/vw\"", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_66 = new DataSub();
	reqAction.addDataSub(subContainer_66);

		ISubRule sub_158 = new SubRule("req_uri", 31, 2, true, (IDCCoreVar)dcVars[49], false, "userId", null, 0, false);
	subContainer_66.addSubInstruction(sub_158);
		ISubRule sub_159 = new SubRule("req_hdr_Referer_1", 0, 29, false, (IDCCoreVar)dcVars[40], false, "Referer_40", null, 0, false);
	subContainer_66.addSubInstruction(sub_159);
		ISubRule sub_160 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_118", null, 0, false);
	subContainer_66.addSubInstruction(sub_160);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2C2ECB95D202B93534383732"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2C2E5636D202B93534383732"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2C5C1D0ED202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_59(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2C5C4422D202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/plain, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, sdch, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_67 = new DataSub();
	reqAction.addDataSub(subContainer_67);

		ISubRule sub_161 = new SubRule("req_uri", 52, 2, true, (IDCCoreVar)dcVars[49], false, "userId", null, 0, false);
	subContainer_67.addSubInstruction(sub_161);
		ISubRule sub_162 = new SubRule("req_hdr_Referer_1", 0, 29, false, (IDCCoreVar)dcVars[40], false, "Referer_39", null, 0, false);
	subContainer_67.addSubInstruction(sub_162);
		ISubRule sub_163 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_117", null, 0, false);
	subContainer_67.addSubInstruction(sub_163);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2C2ECB95D202B93534383732"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2C2E5636D202B93534383732"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2C5C4425D202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_60(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2C5C9251D202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/plain, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, sdch, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_68 = new DataSub();
	reqAction.addDataSub(subContainer_68);

		ISubRule sub_164 = new SubRule("req_uri", 58, 2, true, (IDCCoreVar)dcVars[49], false, "userId", null, 0, false);
	subContainer_68.addSubInstruction(sub_164);
		ISubRule sub_165 = new SubRule("req_hdr_Referer_1", 0, 29, false, (IDCCoreVar)dcVars[40], false, "Referer_38", null, 0, false);
	subContainer_68.addSubInstruction(sub_165);
		ISubRule sub_166 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_116", null, 0, false);
	subContainer_68.addSubInstruction(sub_166);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2C2ECB95D202B93534383732"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2C5C9254D202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_61(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2C5D0753D202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/plain, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, sdch, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_69 = new DataSub();
	reqAction.addDataSub(subContainer_69);

		ISubRule sub_167 = new SubRule("req_uri", 40, 2, true, (IDCCoreVar)dcVars[49], false, "userId", null, 0, false);
	subContainer_69.addSubInstruction(sub_167);
		ISubRule sub_168 = new SubRule("req_hdr_Referer_1", 0, 29, false, (IDCCoreVar)dcVars[40], false, "Referer_37", null, 0, false);
	subContainer_69.addSubInstruction(sub_168);
		ISubRule sub_169 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_115", null, 0, false);
	subContainer_69.addSubInstruction(sub_169);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2C2ECB95D202B93534383732"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2C5D0756D202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_62(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2C5D5573D202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/styles/app-4396edd9d0.css", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, sdch, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_70 = new DataSub();
	reqAction.addDataSub(subContainer_70);

		ISubRule sub_170 = new SubRule("req_hdr_Referer_1", 0, 54, false, (IDCCoreVar)dcVars[46], false, "Referer_36", null, 0, false);
	subContainer_70.addSubInstruction(sub_170);
		ISubRule sub_171 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_114", null, 0, false);
	subContainer_70.addSubInstruction(sub_171);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2C2E5636D202B93534383732"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2C5D5576D202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/svg+xml");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_63(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2C5DF1B1D202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/styles/app-4396edd9d0.css", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, sdch, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_71 = new DataSub();
	reqAction.addDataSub(subContainer_71);

		ISubRule sub_172 = new SubRule("req_hdr_Referer_1", 0, 54, false, (IDCCoreVar)dcVars[46], false, "Referer_34", null, 0, false);
	subContainer_71.addSubInstruction(sub_172);
		ISubRule sub_173 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_112", null, 0, false);
	subContainer_71.addSubInstruction(sub_173);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2C2E5636D202B93534383732"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2C5DF1B4D202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/svg+xml");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_64(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2C5E191CD202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/styles/app-4396edd9d0.css", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, sdch, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_72 = new DataSub();
	reqAction.addDataSub(subContainer_72);

		ISubRule sub_174 = new SubRule("req_hdr_Referer_1", 0, 54, false, (IDCCoreVar)dcVars[46], false, "Referer_33", null, 0, false);
	subContainer_72.addSubInstruction(sub_174);
		ISubRule sub_175 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_111", null, 0, false);
	subContainer_72.addSubInstruction(sub_175);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2C2E5636D202B93534383732"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2C5E191FD202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/svg+xml");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_65(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2C5F0358D202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/styles/app-4396edd9d0.css", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, sdch, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_73 = new DataSub();
	reqAction.addDataSub(subContainer_73);

		ISubRule sub_176 = new SubRule("req_hdr_Referer_1", 0, 54, false, (IDCCoreVar)dcVars[46], false, "Referer_30", null, 0, false);
	subContainer_73.addSubInstruction(sub_176);
		ISubRule sub_177 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_108", null, 0, false);
	subContainer_73.addSubInstruction(sub_177);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2C2E5636D202B93534383732"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2C5F035BD202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/svg+xml");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_66(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2C5F9F60D202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/styles/app-4396edd9d0.css", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, sdch, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_74 = new DataSub();
	reqAction.addDataSub(subContainer_74);

		ISubRule sub_178 = new SubRule("req_hdr_Referer_1", 0, 54, false, (IDCCoreVar)dcVars[46], false, "Referer_28", null, 0, false);
	subContainer_74.addSubInstruction(sub_178);
		ISubRule sub_179 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_106", null, 0, false);
	subContainer_74.addSubInstruction(sub_179);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2C2E5636D202B93534383732"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2C5F9F63D202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/svg+xml");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_67(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2C5FC6CFD202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/styles/app-4396edd9d0.css", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, sdch, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_75 = new DataSub();
	reqAction.addDataSub(subContainer_75);

		ISubRule sub_180 = new SubRule("req_hdr_Referer_1", 0, 54, false, (IDCCoreVar)dcVars[46], false, "Referer_27", null, 0, false);
	subContainer_75.addSubInstruction(sub_180);
		ISubRule sub_181 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_105", null, 0, false);
	subContainer_75.addSubInstruction(sub_181);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2C2E5636D202B93534383732"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2C5FC6D2D202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/svg+xml");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_68(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2C6014D8D202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/styles/app-4396edd9d0.css", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, sdch, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_76 = new DataSub();
	reqAction.addDataSub(subContainer_76);

		ISubRule sub_182 = new SubRule("req_hdr_Referer_1", 0, 54, false, (IDCCoreVar)dcVars[46], false, "Referer_26", null, 0, false);
	subContainer_76.addSubInstruction(sub_182);
		ISubRule sub_183 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_104", null, 0, false);
	subContainer_76.addSubInstruction(sub_183);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2C2E5636D202B93534383732"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2C6014DBD202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/svg+xml");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_69(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2C6062E4D202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/styles/app-4396edd9d0.css", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, sdch, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_77 = new DataSub();
	reqAction.addDataSub(subContainer_77);

		ISubRule sub_184 = new SubRule("req_hdr_Referer_1", 0, 54, false, (IDCCoreVar)dcVars[46], false, "Referer_25", null, 0, false);
	subContainer_77.addSubInstruction(sub_184);
		ISubRule sub_185 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_103", null, 0, false);
	subContainer_77.addSubInstruction(sub_185);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2C2E5636D202B93534383732"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2C6062E7D202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/svg+xml");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_70(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2C60B0D7D202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/styles/app-4396edd9d0.css", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, sdch, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_78 = new DataSub();
	reqAction.addDataSub(subContainer_78);

		ISubRule sub_186 = new SubRule("req_hdr_Referer_1", 0, 54, false, (IDCCoreVar)dcVars[46], false, "Referer_24", null, 0, false);
	subContainer_78.addSubInstruction(sub_186);
		ISubRule sub_187 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_102", null, 0, false);
	subContainer_78.addSubInstruction(sub_187);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2C2E5636D202B93534383732"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2C60B0DAD202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/x-font-ttf");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_71(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2C7634A7D202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/styles/lib-f36fe5c4b2.css", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, sdch, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_79 = new DataSub();
	reqAction.addDataSub(subContainer_79);

		ISubRule sub_188 = new SubRule("req_hdr_Referer_1", 0, 54, false, (IDCCoreVar)dcVars[45], false, "Referer_23", null, 0, false);
	subContainer_79.addSubInstruction(sub_188);
		ISubRule sub_189 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_101", null, 0, false);
	subContainer_79.addSubInstruction(sub_189);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2C2E5636D202B93534383732"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2C7634AAD202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/font-woff2");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private For Loop_2(IContainer parent) {
		For forLoop = new For(parent,
				 "Loop1",
				 "A1E778F7E422F180C93EB26232326437",
				 0,
				 0,
				 0,
				 1,
				 1,
				 true, 
				 false) {

			
		  
		    public void executeLoop() { 
		    	
	
	
	
	               
				this.add(datapool_2(this));
	this.add(transaction_4(this));
	this.add(transaction_5(this));
			super.executeLoop();
		    }
		
		};
		return forLoop;
	}

	private ArmableTransaction transaction_4(final IContainer parent) {
		ArmableTransaction trx = new ArmableTransaction(parent, "Select_ER_From_Dashboard", "A1E7768D2CE80949D202B93534383732") {
		
		    public void execute() {     
		       	
	
	
	
	      
                	this.add(page_10(this));

		     
                super.execute();
            }
        
            public void finish(IKAction child) {
                super.finish(child);
                if (hasFinished()) {
                    
                }
            }
		};
		trx.setArmEnabled(false);
		return trx;
	}

private HTTPPage page_10(final IContainer parent) {
			HTTPThink think = new HTTPThink(90, 1000, parent, parent, "A1E7768D2CE8094CD202B93534383732");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "ER_TC4_01_Select_ERapp_from_Dashboard", "A1E7768D2CE8094CD202B93534383732") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(3, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_72(this, true, "A1E7768D2CE87E70D202B93534383732", false, false,
						"Config_10", "www.scvisibility.com:443/fonts/Titillium_Web/TitilliumWeb-Light.ttf",	"/fonts/Titillium_Web/TitilliumWeb-Light.ttf", true, false), 0, "null", 3);
				httpParallel.addRequest(0, request_73(this, false, "A1E7768D2CE87E70D202B93534383732", false, false,
						"Config_10", "www.scvisibility.com:443/images/close-btn.svg",	"/images/close-btn.svg", true, false), 0, "null", 3);
				httpParallel.addRequest(0, request_74(this, false, "A1E7768D2CE87E70D202B93534383732", false, false,
						"Config_10", "www.scvisibility.com:443/fonts/Titillium_Web/TitilliumWeb-ExtraLight.woff2",	"/fonts/Titillium_Web/TitilliumWeb-ExtraLight.woff2", true, false), 0, "null", 3);
				httpParallel.addRequest(0, request_75(this, false, "A1E7768D2CE87E70D202B93534383732", false, false,
						"Config_10", "www.scvisibility.com:443/ffc/api/general/countries?noOfRecords=100&pageIndex=0",	"/ffc/api/general/countries?noOfRecords=100&pageIndex=0", true, false), 0, "null", 3);
				httpParallel.addRequest(0, request_76(this, false, "A1E7768D2CE87E70D202B93534383732", false, false,
						"Config_10", "www.scvisibility.com:443/api/mapstyle",	"/api/mapstyle", true, false), 0, "null", 3);
				httpParallel.addRequest(0, request_77(this, false, "A1E7768D2CE87E70D202B93534383732", true, true,
						"Config_10", "www.scvisibility.com:443/gr/api/gr/world/get/alert?applicationId=5&subscriberId=1&userId=71",	"/gr/api/gr/world/get/alert?applicationId=5&subscriberId=1&userId=71", true, false), 0, "null", 3);
				httpParallel.addRequest(1, request_78(this, false, "A1E7768D2CE8307ED202B93534383732", false, false,
						"Config_10", "www.scvisibility.com:443/gr/api/gr/world/get/alert/supplier?applicationId=5&subscriberId=1&userId=71",	"/gr/api/gr/world/get/alert/supplier?applicationId=5&subscriberId=1&userId=71", true, false), 1, "A1E7768D2D512B5FD202B93534383732", 3);
				httpParallel.addRequest(2, request_79(this, false, "A1E7768D2D51A08CD202B93534383732", true, false,
						"Config_10", "www.scvisibility.com:443/gr/api/gr/world/get/alert/sites?applicationId=5&subscriberId=1&userId=71",	"/gr/api/gr/world/get/alert/sites?applicationId=5&subscriberId=1&userId=71", true, false), 1, "A1E7768D2D512B5FD202B93534383732", 3);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_72(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2CE8A584D202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/styles/app-4396edd9d0.css", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, sdch, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_80 = new DataSub();
	reqAction.addDataSub(subContainer_80);

		ISubRule sub_190 = new SubRule("req_hdr_Referer_1", 0, 54, false, (IDCCoreVar)dcVars[46], false, "Referer_12", null, 0, false);
	subContainer_80.addSubInstruction(sub_190);
		ISubRule sub_191 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_61", null, 0, false);
	subContainer_80.addSubInstruction(sub_191);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2CE8A587D202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/x-font-ttf");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_73(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2CEFF889D202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/styles/app-4396edd9d0.css", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, sdch, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

		reqAction.setTimeoutDuration(4, 60000);		
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_81 = new DataSub();
	reqAction.addDataSub(subContainer_81);

		ISubRule sub_192 = new SubRule("req_hdr_Referer_1", 0, 54, false, (IDCCoreVar)dcVars[46], false, "Referer_11", null, 0, false);
	subContainer_81.addSubInstruction(sub_192);
		ISubRule sub_193 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_60", null, 0, false);
	subContainer_81.addSubInstruction(sub_193);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2CEFF88CD202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/svg+xml");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_74(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2CF046E7D202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/styles/app-4396edd9d0.css", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, sdch, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_82 = new DataSub();
	reqAction.addDataSub(subContainer_82);

		ISubRule sub_194 = new SubRule("req_hdr_Referer_1", 0, 54, false, (IDCCoreVar)dcVars[46], false, "Referer_10", null, 0, false);
	subContainer_82.addSubInstruction(sub_194);
		ISubRule sub_195 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_59", null, 0, false);
	subContainer_82.addSubInstruction(sub_195);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2CF046EAD202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/font-woff2");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_75(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2D50DD30D202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/plain, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-None-Match", "W/\"13b3-ovI6RU+FuxmI3Qzm634nxg\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/maintab/myStories/home", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, sdch, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_83 = new DataSub();
	reqAction.addDataSub(subContainer_83);

		ISubRule sub_196 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_57", null, 0, false);
	subContainer_83.addSubInstruction(sub_196);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2D50DD33D202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_76(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2D51044FD202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/plain, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-None-Match", "W/\"955e-7eMx10d4lRt374LURlQJiQ\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/maintab/myStories/home", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, sdch, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_84 = new DataSub();
	reqAction.addDataSub(subContainer_84);

		ISubRule sub_197 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_56", null, 0, false);
	subContainer_84.addSubInstruction(sub_197);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2D510452D202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_77(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2D512B5FD202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/plain, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-None-Match", "W/\"1c01-fy3FRUgpj6hCe+xyWDHMPQ\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/maintab/myStories/home", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, sdch, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_85 = new DataSub();
	reqAction.addDataSub(subContainer_85);

		ISubRule sub_198 = new SubRule("req_uri", 65, 2, true, (IDCCoreVar)dcVars[49], false, "userId", null, 0, false);
	subContainer_85.addSubInstruction(sub_198);
		ISubRule sub_199 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_55", null, 0, false);
	subContainer_85.addSubInstruction(sub_199);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2D512B62D202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
				SubstitutableHTTPContentVP localContentVp_8 = new SubstitutableHTTPContentVP(1, true, null, 0, reqAction);
	
			localContentVp_8.addConstContentElement(contVPElem_6);
	req.addVerificationPoint(localContentVp_8);

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_78(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2D5152B0D202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/plain, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-None-Match", "W/\"1fbd12-nWcakcXmYuDtTpEPb5pKJg\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/maintab/myStories/home", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, sdch, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_86 = new DataSub();
	reqAction.addDataSub(subContainer_86);

		ISubRule sub_200 = new SubRule("req_uri", 74, 2, true, (IDCCoreVar)dcVars[49], false, "userId", null, 0, false);
	subContainer_86.addSubInstruction(sub_200);
		ISubRule sub_201 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_54", null, 0, false);
	subContainer_86.addSubInstruction(sub_201);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2D512B5FD202B93534383732"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2D5152B3D202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(304);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_79(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2D51A099D202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/plain, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("If-None-Match", "W/\"57a4-4uIeIchFK/mwCan2Ya2K8g\"", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/maintab/myStories/home", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, sdch, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_87 = new DataSub();
	reqAction.addDataSub(subContainer_87);

		ISubRule sub_202 = new SubRule("req_uri", 71, 2, true, (IDCCoreVar)dcVars[49], false, "userId", null, 0, false);
	subContainer_87.addSubInstruction(sub_202);
		ISubRule sub_203 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_53", null, 0, false);
	subContainer_87.addSubInstruction(sub_203);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2D51A09CD202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	private ArmableTransaction transaction_5(final IContainer parent) {
		ArmableTransaction trx = new ArmableTransaction(parent, "Select_Country", "A1E7768D2D523CF9D202B93534383732") {
		
		    public void execute() {     
		       	
	
	
	
	      
                	this.add(page_11(this));

		     
                super.execute();
            }
        
            public void finish(IKAction child) {
                super.finish(child);
                if (hasFinished()) {
                    
                }
            }
		};
		trx.setArmEnabled(false);
		return trx;
	}

private HTTPPage page_11(final IContainer parent) {
			HTTPThink think = new HTTPThink(90, 1000, parent, parent, "A1E7768D2D523D0DD202B93534383732");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "ER_TC4_02_Select_Country", "A1E7768D2D523D0DD202B93534383732") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(1, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_80(this, true, "A1E7768D2D528AF3D202B93534383732", true, true,
						"Config_10", "www.scvisibility.com:443/ffc/api/general/citiesByCountry?&countryCode=IDN&noOfRecords=100&pageIndex=0",	"/ffc/api/general/citiesByCountry?&countryCode=IDN&noOfRecords=100&pageIndex=0", true, false), 0, "null", 3);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_80(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2D52B207D202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/plain, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/maintab/mapview", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, sdch, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_18 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_18);

	harvestContainer_18.addHarvestInstruction ("resp_content", dcVars[50], "^(.*?)\\{", 1, 0, 0, 0, false, null, null, 0, false);
	IDataSub subContainer_88 = new DataSub();
	reqAction.addDataSub(subContainer_88);

		ISubRule sub_204 = new SubRule("req_uri", 46, 3, true, (IDCCoreVar)dcVars[1], false, "countryCode", null, 0, false);
	subContainer_88.addSubInstruction(sub_204);
		ISubRule sub_205 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_48", null, 0, false);
	subContainer_88.addSubInstruction(sub_205);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2D52B20AD202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
				SubstitutableHTTPContentVP localContentVp_9 = new SubstitutableHTTPContentVP(1, true, null, 0, reqAction);
	
			localContentVp_9.addConstContentElement(contVPElem_7);
	req.addVerificationPoint(localContentVp_9);

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	private ArmableTransaction transaction_6(final IContainer parent) {
		ArmableTransaction trx = new ArmableTransaction(parent, "Click_On_Logout", "A1E7768D2DBE1E4BD202B93534383732") {
		
		    public void execute() {     
		       	
	
	
	
	      
                	this.add(page_12(this));

		     
                super.execute();
            }
        
            public void finish(IKAction child) {
                super.finish(child);
                if (hasFinished()) {
                    
                }
            }
		};
		trx.setArmEnabled(false);
		return trx;
	}

private HTTPPage page_12(final IContainer parent) {
			HTTPThink think = new HTTPThink(16691, 1, parent, parent, "A1E7768D2DBE4512D202B93534383732");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "Incontrol_Logout", "A1E7768D2DBE4512D202B93534383732") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(1, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_81(this, true, "A1E7768D2DBE4502D202B93534383732", false, false,
						"Config_10", "www.scvisibility.com:443/fonts/fontawesome-webfont.woff2?v=4.7.0",	"/fonts/fontawesome-webfont.woff2?v=4.7.0", true, false), 0, "null", 3);
				httpParallel.addRequest(0, request_82(this, false, "A1E7768D2DBE4502D202B93534383732", false, false,
						"Config_10", "www.scvisibility.com:443/ffc/api/general/clearUserCache?userId=71&subscriberId=1",	"/ffc/api/general/clearUserCache?userId=71&subscriberId=1", true, false), 0, "null", 3);
				httpParallel.addRequest(0, request_83(this, false, "A1E7768D2DBE4502D202B93534383732", false, false,
						"Config_10", "www.scvisibility.com:443/logout",	"/logout", true, false), 0, "null", 3);
				httpParallel.addRequest(0, request_84(this, false, "A1E7768D2DBE4502D202B93534383732", true, true,
						"Config_10", "www.scvisibility.com:443/logout.html",	"/logout.html", true, false), 0, "null", 3);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_81(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2DBE4516D202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/styles/app-4396edd9d0.css", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, sdch, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_89 = new DataSub();
	reqAction.addDataSub(subContainer_89);

		ISubRule sub_206 = new SubRule("req_uri", 35, 5, true, (IDCCoreVar)dcVars[47], false, "v", null, 0, false);
	subContainer_89.addSubInstruction(sub_206);
		ISubRule sub_207 = new SubRule("req_hdr_Referer_1", 0, 54, false, (IDCCoreVar)dcVars[46], false, "Referer", null, 0, false);
	subContainer_89.addSubInstruction(sub_207);
		ISubRule sub_208 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_4", null, 0, false);
	subContainer_89.addSubInstruction(sub_208);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2DBE4519D202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("application/font-woff2");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_82(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2DCD3923D202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/plain, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/maintab/mapview", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, sdch, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_90 = new DataSub();
	reqAction.addDataSub(subContainer_90);

		ISubRule sub_209 = new SubRule("req_uri", 39, 2, true, (IDCCoreVar)dcVars[49], false, "userId", null, 0, false);
	subContainer_90.addSubInstruction(sub_209);
		ISubRule sub_210 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_3", null, 0, false);
	subContainer_90.addSubInstruction(sub_210);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2DCD3926D202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_83(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2DCD606DD202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/maintab/mapview", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, sdch, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_19 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_19);

	harvestContainer_19.addHarvestInstruction ("resp_hdr_Location_1", dcVars[51], ".*", 1, 0, 0, 0, false, "Location_3", null, 0, false);
	IDataSub subContainer_91 = new DataSub();
	reqAction.addDataSub(subContainer_91);

		ISubRule sub_211 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_2", null, 0, false);
	subContainer_91.addSubInstruction(sub_211);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2DCD6070D202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(302);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_84(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7768D2DCD879AD202B93534383732", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/maintab/mapview", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, sdch, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.8", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_92 = new DataSub();
	reqAction.addDataSub(subContainer_92);

		ISubRule sub_212 = new SubRule("req_uri", 0, 12, false, (IDCCoreVar)dcVars[51], false, "Jabil_url", null, 0, false);
	subContainer_92.addSubInstruction(sub_212);
		ISubRule sub_213 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host", null, 0, false);
	subContainer_92.addSubInstruction(sub_213);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7768D2DCD606DD202B93534383732"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1E7768D2DCD879DD202B93534383732",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
}
