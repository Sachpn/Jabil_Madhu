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
public class Newtestcase3_2__Test_A1E7B3ED5EAA2740E3A5B83735623136 extends LTTestScript  {

    static ProtoAdapterHandler pa = new ProtoAdapterHandler();
    static {           
        pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.protocol.core.CoreProtoAdapter", "coreAdapter");
pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.http.HTTPActionAdapter", "com.ibm.rational.test.lt.execution.http.impl.HTTPPostDataChunk");
pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.http.HTTPActionAdapter", "com.ibm.rational.test.lt.execution.http.impl.HTTPAction");
    }
	private IDataCorrelationVar[] dcVars = DataCorrelationVar.getArrayDCVars(67);
	private DataVar[] vars = new DataVar[6];
	
    private IContentVPElement contVPElem_0 = new ContentVPElement("jabil", 
                          -1, ErrorStringType.LITERAL, CaseSensitivityType.INSENSITIVE);
private IContentVPElement contVPElem_1 = new ContentVPElement("Jabil Circuit", 
                          -1, ErrorStringType.LITERAL, CaseSensitivityType.INSENSITIVE);
private IContentVPElement contVPElem_2 = new ContentVPElement("success", 
                          -1, ErrorStringType.LITERAL, CaseSensitivityType.INSENSITIVE);
private IContentVPElement contVPElem_3 = new ContentVPElement("stateToken", 
                          -1, ErrorStringType.LITERAL, CaseSensitivityType.INSENSITIVE);
private IContentVPElement contVPElem_4 = new ContentVPElement("firstName", 
                          -1, ErrorStringType.LITERAL, CaseSensitivityType.INSENSITIVE);
private IContentVPElement contVPElem_5 = new ContentVPElement("RelayState", 
                          -1, ErrorStringType.LITERAL, CaseSensitivityType.INSENSITIVE);
private IContentVPElement contVPElem_6 = new ContentVPElement("profileName", 
                          -1, ErrorStringType.LITERAL, CaseSensitivityType.INSENSITIVE);
private IContentVPElement contVPElem_7 = new ContentVPElement("UserName", 
                          -1, ErrorStringType.LITERAL, CaseSensitivityType.INSENSITIVE);
private IContentVPElement contVPElem_8 = new ContentVPElement("Message", 
                          -1, ErrorStringType.LITERAL, CaseSensitivityType.INSENSITIVE);
private IContentVPElement contVPElem_9 = new ContentVPElement("value", 
                          -1, ErrorStringType.LITERAL, CaseSensitivityType.INSENSITIVE);
private IContentVPElement contVPElem_10 = new ContentVPElement("supplier", 
                          -1, ErrorStringType.LITERAL, CaseSensitivityType.INSENSITIVE);
private IContentVPElement contVPElem_11 = new ContentVPElement("commodity", 
                          -1, ErrorStringType.LITERAL, CaseSensitivityType.INSENSITIVE);
private IContentVPElement contVPElem_12 = new ContentVPElement("sector", 
                          -1, ErrorStringType.LITERAL, CaseSensitivityType.INSENSITIVE);
private IContentVPElement contVPElem_13 = new ContentVPElement("customer", 
                          -1, ErrorStringType.LITERAL, CaseSensitivityType.INSENSITIVE);
private IContentVPElement contVPElem_14 = new ContentVPElement("campus", 
                          -1, ErrorStringType.LITERAL, CaseSensitivityType.INSENSITIVE);
private IContentVPElement contVPElem_15 = new ContentVPElement("site", 
                          -1, ErrorStringType.LITERAL, CaseSensitivityType.INSENSITIVE);
private IContentVPElement contVPElem_16 = new ContentVPElement("global", 
                          -1, ErrorStringType.LITERAL, CaseSensitivityType.INSENSITIVE);
    
private HTTPTestScriptHelper httpTestScriptHelper;

	private HTTPTestScriptHelper getHTTPTest() {
		return httpTestScriptHelper;
	}

	
	public Newtestcase3_2__Test_A1E7B3ED5EAA2740E3A5B83735623136(IContainer container, String invocationId) {
		super(container, "Newtestcase3(2)", invocationId, "A1E7B3ED5EAA2740E3A5B83735623136");
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
	PageCacheUtil.setCacheEmulation((ITestExecutionServices)this, false);

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
	this.add(datapool_3(this));
	this.add(varAction_1(this));
	this.add(confCon_1(this));
	this.add(confCon_2(this));
	this.add(confCon_3(this));
	this.add(new CustomCode_1(this, dcVars[12]));
	this.add(transaction_1(this));
	this.add(transaction_2(this));
	this.add(transaction_3(this));
		For loopNm_1 = Loop_1(this);
		this.add(loopNm_1);
		loopNm_1.addVarsToInit(Arrays.asList((IKDCCoreVar)vars[0]));
		
	this.add(transaction_15(this));
	this.add(new CustomCode_2(this, dcVars[66]));
			this.httpTestScriptHelper.executeHelper();

	    } catch (Throwable e) {
		     log("Test Execution: Newtestcase3_2__Test_A1E7B3ED5EAA2740E3A5B83735623136 ",e);
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

		action.setMapFile("A1E7B3ED5EAA2740E3A5B83735623136");

		// Control file contains transforms 
		// com.ibm.rational.test.lt.datatransform.adapters.impl.XMLAdapterVERSION_0

		return action;
	}

	private DatapoolAction datapool_1(IContainer parent) {
		DatapoolAction dpAction = new DatapoolAction(parent, "A1E77D0202414CD0DC39B56430316230", "A1E7B3F3BDD00180E3A5B83735623136");
		Datapool dp = new Datapool(
				 "/A1E77D0202414CD0DC39B56430316230.datapool",
				 0,
				 true,
				 false,
				 Datapool.SEQUENTIAL,
				 null, 0);
		dp.addHarvestInstruction("User_id", dcVars[0], false);
dp.addHarvestInstruction("Message", dcVars[1], false);
		dpAction.setDatapool(dp);
		return dpAction;
	}


	private DatapoolAction datapool_2(IContainer parent) {
		DatapoolAction dpAction = new DatapoolAction(parent, "A1E77D013A86C6C0DC39B56430316230", "A1E7B3F46BD087F0E3A5B83735623136");
		Datapool dp = new Datapool(
				 "/A1E77D013A86C6C0DC39B56430316230.datapool",
				 0,
				 true,
				 false,
				 Datapool.SEQUENTIAL,
				 null, 0);
		dp.addHarvestInstruction("User_ic_id", dcVars[2], false);
dp.addHarvestInstruction("Fname", dcVars[3], false);
dp.addHarvestInstruction("Lname", dcVars[4], false);
dp.addHarvestInstruction("Variable1", dcVars[5], false);
		dpAction.setDatapool(dp);
		return dpAction;
	}


	private DatapoolAction datapool_3(IContainer parent) {
		DatapoolAction dpAction = new DatapoolAction(parent, "A1E77D014CDE3600DC39B56430316230", "A1E7B3F7692BC660E3A5B83735623136");
		Datapool dp = new Datapool(
				 "/A1E77D014CDE3600DC39B56430316230.datapool",
				 0,
				 true,
				 false,
				 Datapool.SEQUENTIAL,
				 null, 0);
		dp.addHarvestInstruction("Division", dcVars[6], false);
dp.addHarvestInstruction("Sector", dcVars[7], false);
dp.addHarvestInstruction("Customer", dcVars[8], false);
dp.addHarvestInstruction("Region", dcVars[9], false);
dp.addHarvestInstruction("Campus", dcVars[10], false);
dp.addHarvestInstruction("Site", dcVars[11], false);
		dpAction.setDatapool(dp);
		return dpAction;
	}

private VariableAction varAction_1(final IContainer parent) {

	VariableAction vc = new VariableAction(parent, "", "A1E7B3E5B77E746EE3A5B83735623136");	
			vars[0] = new DataVar("Newtestcase3_Host", "www.scvisibility.com", IDataArea.TEST, "IGNORE", false, false);

	
		vars[1] = new DataVar("Newtestcase3_Host_1", "sso.scvisibility.com", IDataArea.TEST, "IGNORE", false, false);

	
		vars[2] = new DataVar("Newtestcase3_Host_2", "jabil.okta.com", IDataArea.TEST, "IGNORE", false, false);

	
		vars[3] = new DataVar("Newtestcase3_Host_2_Port", "443", IDataArea.TEST, "IGNORE", false, false);

	
		vars[4] = new DataVar("Newtestcase3_Host_1_Port", "443", IDataArea.TEST, "IGNORE", false, false);

	
		vars[5] = new DataVar("Newtestcase3_Host_Port", "443", IDataArea.TEST, "IGNORE", false, false);

		
	vc.add(vars);
	return vc;
	
}

	private IKAction confCon_1(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = new SSLInfo("TLSv1.2", "ON", "SSL_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_1",
					(String)(vars[0].getValue()== null?"www.scvisibility.com": (String)vars[0].getValue()),  // host name
					Integer.parseInt((String)(vars[5].getValue()== null?"443": (String)vars[5].getValue())), 
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
				ISSLInfo sslInfo = new SSLInfo("TLSv1.2", "ON", "SSL_DHE_RSA_WITH_AES_128_GCM_SHA256");
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_2",
					(String)(vars[1].getValue()== null?"sso.scvisibility.com": (String)vars[1].getValue()),  // host name
					Integer.parseInt((String)(vars[4].getValue()== null?"443": (String)vars[4].getValue())), 
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
				ISSLInfo sslInfo = new SSLInfo("TLSv1.2", "ON", "SSL_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_3",
					(String)(vars[2].getValue()== null?"jabil.okta.com": (String)vars[2].getValue()),  // host name
					Integer.parseInt((String)(vars[3].getValue()== null?"443": (String)vars[3].getValue())), 
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


	public class CustomCode_1 extends CustomCodeAction {

		IDataCorrelationVar outVar;
		/**
		 * @param parent
		 * @param name
		 */
		public CustomCode_1(IContainer parent, IDataCorrelationVar outVar) {
			super(parent, "er100.Clearcook", "A1E7B49E1DE4DD20E5C3B96635613362");
			this.outVar = outVar;
		}
	
		/**
		 * @see com.ibm.rational.test.lt.kernel.action.IKAction#execute()
		 */
		public void execute() {
		
				
	
	
	
	
	
	
			IDCCoreVar[] inputVars = {
				
			};
			
			ICustomCode2 ccclass = 	new er100.Clearcook();
			
			setCCClass(ccclass);
			setInputVars(inputVars);
			setOutVar(outVar);
			
			super.execute();

		}
	}




	private ArmableTransaction transaction_1(final IContainer parent) {
		ArmableTransaction trx = new ArmableTransaction(parent, "Okata_Homepage", "A1E7B3E5B7881140E3A5B83735623136") {
		
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
			HTTPThink think = new HTTPThink(20, 1000, parent, parent, "A1E7B3E5B808DA0EE3A5B83735623136");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "Incontrol_1_Login", "A1E7B3E5B808DA0EE3A5B83735623136") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(1, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_1(this, true, "A1E7B3E5B808DA00E3A5B83735623136", true, true,
						"Config_1", "www.scvisibility.com:443/",	"/", true, false), 0, "null", 3);
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5B808DA1CE3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_1 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_1);

	harvestContainer_1.addHarvestInstruction ("resp_hdr_Location_1", dcVars[13], "http.{0,1}://.*?(/.*)", 1, 0, 0, 0, false, "Location", null, 0, false);
	IDataSub subContainer_1 = new DataSub();
	reqAction.addDataSub(subContainer_1);

		ISubRule sub_0 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_325", null, 0, false);
	subContainer_1.addSubInstruction(sub_0);
	


		
				
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
			"A1E7B3E5B808DA1FE3A5B83735623136",
			false,
			false
		);
		
		req.setExpectedResponseCode(302);
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
private HTTPPage page_2(final IContainer parent) {
			HTTPThink think = new HTTPThink(7613, 1, parent, parent, "A1E7B3E5B80D955DE3A5B83735623136");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "CIS_1_Login", "A1E7B3E5B80D955DE3A5B83735623136") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(2, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_2(this, true, "A1E7B3E5B80D954CE3A5B83735623136", false, false,
						"Config_2", "sso.scvisibility.com:443/FIM/sps/JABLPNodejsSAML20/saml20/logininitial?RequestBinding=HTTPPost&PartnerId=https%3A%2F%2Fwww.scvisibility.com%2Fauth%2Fsso%2Fcallback%2F&NameIdFormat=email&SAMLRequest=nVRRb9owEP4rkR%2F2RuxQVJhHQBRUjYl2EbA97KUyztF6c%2BzM5wD993UCmZC2Ig3lwZLvu7vvvvuc4fhQ6GgHDpU1KUliRsajIYpCl3xS%2BRezhN8VoI8CzCBvAimpnOFWoEJuRAHIveSrycOCd2PGS2e9lVaTaD5LyROTm%2B1ttze4TRLZZ72bbjJgJPreNgwZAYhYwdygF8aHK5b0OwnrJIM1%2B8hZj7NB3L3p%2FyBRdip9p0yuzPNlHpsjCPnn9TrrZF9XaxJNEMH50HhqDVYFuBW4nZLwbblIyYv3JXJK9%2Ft9jHKnUG2UVv41lragImhBES2VQuuNkL9INAuyKCN8M0ebHCB%2FJ9%2FPHyiWSL9M7hbZo83hJ9Y0u4zWeoZD22dlwueV0OOT4u2QNf3Mov8givJTJpw34OZ5%2Bn9saZP9GESa5%2FfWFcKnUAilyXHXvNmAO1vyZW1FqyMZWQMN%2B6c6a0jPqrU2arrOMquVfL3GRie%2B76KTOGluVN7ZNlDejDbJcweIYela2%2F3UgfCQEu8qILSldpIa8sbqwRQeDldZfWqLUjiFtRXgIKRvhT0vPNVBtyVsr5H5IkxyWZcO11k49tbl9UsBGQZbO2GwtM6fVvMvPqNj7B05%2FkTPfwejNw%3D%3D",	"/FIM/sps/JABLPNodejsSAML20/saml20/logininitial?RequestBinding=HTTPPost&PartnerId=https%3A%2F%2Fwww.scvisibility.com%2Fauth%2Fsso%2Fcallback%2F&NameIdFormat=email&SAMLRequest=nVRRb9owEP4rkR%2F2RuxQVJhHQBRUjYl2EbA97KUyztF6c%2BzM5wD993UCmZC2Ig3lwZLvu7vvvvuc4fhQ6GgHDpU1KUliRsajIYpCl3xS%2BRezhN8VoI8CzCBvAimpnOFWoEJuRAHIveSrycOCd2PGS2e9lVaTaD5LyROTm%2B1ttze4TRLZZ72bbjJgJPreNgwZAYhYwdygF8aHK5b0OwnrJIM1%2B8hZj7NB3L3p%2FyBRdip9p0yuzPNlHpsjCPnn9TrrZF9XaxJNEMH50HhqDVYFuBW4nZLwbblIyYv3JXJK9%2Ft9jHKnUG2UVv41lragImhBES2VQuuNkL9INAuyKCN8M0ebHCB%2FJ9%2FPHyiWSL9M7hbZo83hJ9Y0u4zWeoZD22dlwueV0OOT4u2QNf3Mov8givJTJpw34OZ5%2Bn9saZP9GESa5%2FfWFcKnUAilyXHXvNmAO1vyZW1FqyMZWQMN%2B6c6a0jPqrU2arrOMquVfL3GRie%2B76KTOGluVN7ZNlDejDbJcweIYela2%2F3UgfCQEu8qILSldpIa8sbqwRQeDldZfWqLUjiFtRXgIKRvhT0vPNVBtyVsr5H5IkxyWZcO11k49tbl9UsBGQZbO2GwtM6fVvMvPqNj7B05%2FkTPfwejNw%3D%3D", true, false), 0, "null", 3);
				httpParallel.addRequest(0, request_3(this, false, "A1E7B3E5B80D954CE3A5B83735623136", false, true,
						"Config_2", "sso.scvisibility.com:443/EAI/Responder?TAM_OP=login&USERNAME=unauthenticated&ERROR_CODE=0x00000000&ERROR_TEXT=HPDBA0521I%20%20%20Successful%20completion&METHOD=GET&URL=%2FFIM%2Fsps%2FJABLPNodejsSAML20%2Fsaml20%2Flogininitial%3FRequestBinding%3DHTTPPost%26PartnerId%3Dhttps%253A%252F%252Fwww.scvisibility.com%252Fauth%252Fsso%252Fcallback%252F%26NameIdFormat%3Demail%26SAMLRequest%3DnVRRb9owEP4rkR%252F2RuxQVJhHQBRUjYl2EbA97KUyztF6c%252BzM5wD993UCmZC2Ig3lwZLvu7vvvvuc4fhQ6GgHDpU1KUliRsajIYpCl3xS%252BRezhN8VoI8CzCBvAimpnOFWoEJuRAHIveSrycOCd2PGS2e9lVaTaD5LyROTm%252B1ttze4TRLZZ72bbjJgJPreNgwZAYhYwdygF8aHK5b0OwnrJIM1%252B8hZj7NB3L3p%252FyBRdip9p0yuzPNlHpsjCPnn9TrrZF9XaxJNEMH50HhqDVYFuBW4nZLwbblIyYv3JXJK9%252Ft9jHKnUG2UVv41lragImhBES2VQuuNkL9INAuyKCN8M0ebHCB%252FJ9%252FPHyiWSL9M7hbZo83hJ9Y0u4zWeoZD22dlwueV0OOT4u2QNf3Mov8givJTJpw34OZ5%252Bn9saZP9GESa5%252FfWFcKnUAilyXHXvNmAO1vyZW1FqyMZWQMN%252B6c6a0jPqrU2arrOMquVfL3GRie%252B76KTOGluVN7ZNlDejDbJcweIYela2%252F3UgfCQEu8qILSldpIa8sbqwRQeDldZfWqLUjiFtRXgIKRvhT0vPNVBtyVsr5H5IkxyWZcO11k49tbl9UsBGQZbO2GwtM6fVvMvPqNj7B05%252FkTPfwejNw%253D%253D&REFERER=&HOSTNAME=sso.scvisibility.com&AUTHNLEVEL=&FAILREASON=&PROTOCOL=https&OLDSESSION=&EXPIRE_SECS=0",	"/EAI/Responder?TAM_OP=login&USERNAME=unauthenticated&ERROR_CODE=0x00000000&ERROR_TEXT=HPDBA0521I%20%20%20Successful%20completion&METHOD=GET&URL=%2FFIM%2Fsps%2FJABLPNodejsSAML20%2Fsaml20%2Flogininitial%3FRequestBinding%3DHTTPPost%26PartnerId%3Dhttps%253A%252F%252Fwww.scvisibility.com%252Fauth%252Fsso%252Fcallback%252F%26NameIdFormat%3Demail%26SAMLRequest%3DnVRRb9owEP4rkR%252F2RuxQVJhHQBRUjYl2EbA97KUyztF6c%252BzM5wD993UCmZC2Ig3lwZLvu7vvvvuc4fhQ6GgHDpU1KUliRsajIYpCl3xS%252BRezhN8VoI8CzCBvAimpnOFWoEJuRAHIveSrycOCd2PGS2e9lVaTaD5LyROTm%252B1ttze4TRLZZ72bbjJgJPreNgwZAYhYwdygF8aHK5b0OwnrJIM1%252B8hZj7NB3L3p%252FyBRdip9p0yuzPNlHpsjCPnn9TrrZF9XaxJNEMH50HhqDVYFuBW4nZLwbblIyYv3JXJK9%252Ft9jHKnUG2UVv41lragImhBES2VQuuNkL9INAuyKCN8M0ebHCB%252FJ9%252FPHyiWSL9M7hbZo83hJ9Y0u4zWeoZD22dlwueV0OOT4u2QNf3Mov8givJTJpw34OZ5%252Bn9saZP9GESa5%252FfWFcKnUAilyXHXvNmAO1vyZW1FqyMZWQMN%252B6c6a0jPqrU2arrOMquVfL3GRie%252B76KTOGluVN7ZNlDejDbJcweIYela2%252F3UgfCQEu8qILSldpIa8sbqwRQeDldZfWqLUjiFtRXgIKRvhT0vPNVBtyVsr5H5IkxyWZcO11k49tbl9UsBGQZbO2GwtM6fVvMvPqNj7B05%252FkTPfwejNw%253D%253D&REFERER=&HOSTNAME=sso.scvisibility.com&AUTHNLEVEL=&FAILREASON=&PROTOCOL=https&OLDSESSION=&EXPIRE_SECS=0", true, false), 0, "null", 3);
				httpParallel.addRequest(0, request_4(this, false, "A1E7B3E5B80D954CE3A5B83735623136", true, false,
						"Config_2", "sso.scvisibility.com:443/EAI/css/jabil.css",	"/EAI/css/jabil.css", true, false), 0, "null", 3);
				httpParallel.addRequest(1, request_5(this, false, "A1E7B3E5B814C117E3A5B83735623136", false, false,
						"Config_2", "sso.scvisibility.com:443/FIM/sps/JABLPOktaSAML20/saml20/logininitial?RequestBinding=HTTPPost&NameIdFormat=email&PartnerId=http://www.okta.com/exke8lz54bfbYX2f60x7&Target=https://www.scvisibility.com/",	"/FIM/sps/JABLPOktaSAML20/saml20/logininitial?RequestBinding=HTTPPost&NameIdFormat=email&PartnerId=http://www.okta.com/exke8lz54bfbYX2f60x7&Target=https://www.scvisibility.com/", true, false), 9, "A1E7B3E5B810063CE3A5B83735623136", 3);
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5B80D9561E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "sso.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_2 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_2);

	harvestContainer_2.addHarvestInstruction ("resp_hdr_location_1", dcVars[14], "http.{0,1}://.*?(/[^?]*)/", 1, 1, 0, 0, false, "location", null, 0, false);
	harvestContainer_2.addHarvestInstruction ("resp_hdr_location_1", dcVars[15], "http.{0,1}://.*?(/.*)", 1, 0, 0, 0, false, "location_2", null, 0, false);
	IDataSub subContainer_2 = new DataSub();
	reqAction.addDataSub(subContainer_2);

		ISubRule sub_1 = new SubRule("req_uri", 0, 848, false, (IDCCoreVar)dcVars[13], false, "Secure login_url_3", null, 0, false);
	subContainer_2.addSubInstruction(sub_1);
		ISubRule sub_2 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[1], false, "Host_324", null, 0, false);
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
			"A1E7B3E5B80D9564E3A5B83735623136",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5B810063CE3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "sso.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_3 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_3);

	harvestContainer_3.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[16], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)", null, 0, false);
	harvestContainer_3.addHarvestInstruction ("resp_content", dcVars[17], "/sso\\.scvisibility\\.com(.*?)\"", 1, 1, 0, 0, false, "sso.scvisibility.com", null, 0, false);
	IDataSub subContainer_3 = new DataSub();
	reqAction.addDataSub(subContainer_3);

		ISubRule sub_3 = new SubRule("req_uri", 0, 1170, false, (IDCCoreVar)dcVars[15], false, "Secure login_url_2", null, 0, false);
	subContainer_3.addSubInstruction(sub_3);
		ISubRule sub_4 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[1], false, "Host_323", null, 0, false);
	subContainer_3.addSubInstruction(sub_4);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B80D9561E3A5B83735623136"), 3);		
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
			"A1E7B3E5B810063FE3A5B83735623136",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5B81006CBE3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "sso.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/css,*/*;q=0.1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://sso.scvisibility.com/EAI/Responder?TAM_OP=login&USERNAME=unauthenticated&ERROR_CODE=0x00000000&ERROR_TEXT=HPDBA0521I%20%20%20Successful%20completion&METHOD=GET&URL=%2FFIM%2Fsps%2FJABLPNodejsSAML20%2Fsaml20%2Flogininitial%3FRequestBinding%3DHTTPPost%26PartnerId%3Dhttps%253A%252F%252Fwww.scvisibility.com%252Fauth%252Fsso%252Fcallback%252F%26NameIdFormat%3Demail%26SAMLRequest%3DnVRRb9owEP4rkR%252F2RuxQVJhHQBRUjYl2EbA97KUyztF6c%252BzM5wD993UCmZC2Ig3lwZLvu7vvvvuc4fhQ6GgHDpU1KUliRsajIYpCl3xS%252BRezhN8VoI8CzCBvAimpnOFWoEJuRAHIveSrycOCd2PGS2e9lVaTaD5LyROTm%252B1ttze4TRLZZ72bbjJgJPreNgwZAYhYwdygF8aHK5b0OwnrJIM1%252B8hZj7NB3L3p%252FyBRdip9p0yuzPNlHpsjCPnn9TrrZF9XaxJNEMH50HhqDVYFuBW4nZLwbblIyYv3JXJK9%252Ft9jHKnUG2UVv41lragImhBES2VQuuNkL9INAuyKCN8M0ebHCB%252FJ9%252FPHyiWSL9M7hbZo83hJ9Y0u4zWeoZD22dlwueV0OOT4u2QNf3Mov8givJTJpw34OZ5%252Bn9saZP9GESa5%252FfWFcKnUAilyXHXvNmAO1vyZW1FqyMZWQMN%252B6c6a0jPqrU2arrOMquVfL3GRie%252B76KTOGluVN7ZNlDejDbJcweIYela2%252F3UgfCQEu8qILSldpIa8sbqwRQeDldZfWqLUjiFtRXgIKRvhT0vPNVBtyVsr5H5IkxyWZcO11k49tbl9UsBGQZbO2GwtM6fVvMvPqNj7B05%252FkTPfwejNw%253D%253D&REFERER=&HOSTNAME=sso.scvisibility.com&AUTHNLEVEL=&FAILREASON=&PROTOCOL=https&OLDSESSION=&EXPIRE_SECS=0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_4 = new DataSub();
	reqAction.addDataSub(subContainer_4);

		ISubRule sub_5 = new SubRule("req_hdr_Referer_1", 0, 1198, false, (IDCCoreVar)dcVars[16], false, "Referer_116", null, 0, false);
	subContainer_4.addSubInstruction(sub_5);
		ISubRule sub_6 = new SubRule("req_uri", 0, 4, false, (IDCCoreVar)dcVars[14], false, "/EAI_2", null, 0, false);
	subContainer_4.addSubInstruction(sub_6);
		ISubRule sub_7 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[1], false, "Host_322", null, 0, false);
	subContainer_4.addSubInstruction(sub_7);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B810063CE3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B810063CE3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B80D9561E3A5B83735623136"), 3);		
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
			"A1E7B3E5B81006CEE3A5B83735623136",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5B814C125E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "sso.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://sso.scvisibility.com/EAI/Responder?TAM_OP=login&USERNAME=unauthenticated&ERROR_CODE=0x00000000&ERROR_TEXT=HPDBA0521I%20%20%20Successful%20completion&METHOD=GET&URL=%2FFIM%2Fsps%2FJABLPNodejsSAML20%2Fsaml20%2Flogininitial%3FRequestBinding%3DHTTPPost%26PartnerId%3Dhttps%253A%252F%252Fwww.scvisibility.com%252Fauth%252Fsso%252Fcallback%252F%26NameIdFormat%3Demail%26SAMLRequest%3DnVRRb9owEP4rkR%252F2RuxQVJhHQBRUjYl2EbA97KUyztF6c%252BzM5wD993UCmZC2Ig3lwZLvu7vvvvuc4fhQ6GgHDpU1KUliRsajIYpCl3xS%252BRezhN8VoI8CzCBvAimpnOFWoEJuRAHIveSrycOCd2PGS2e9lVaTaD5LyROTm%252B1ttze4TRLZZ72bbjJgJPreNgwZAYhYwdygF8aHK5b0OwnrJIM1%252B8hZj7NB3L3p%252FyBRdip9p0yuzPNlHpsjCPnn9TrrZF9XaxJNEMH50HhqDVYFuBW4nZLwbblIyYv3JXJK9%252Ft9jHKnUG2UVv41lragImhBES2VQuuNkL9INAuyKCN8M0ebHCB%252FJ9%252FPHyiWSL9M7hbZo83hJ9Y0u4zWeoZD22dlwueV0OOT4u2QNf3Mov8givJTJpw34OZ5%252Bn9saZP9GESa5%252FfWFcKnUAilyXHXvNmAO1vyZW1FqyMZWQMN%252B6c6a0jPqrU2arrOMquVfL3GRie%252B76KTOGluVN7ZNlDejDbJcweIYela2%252F3UgfCQEu8qILSldpIa8sbqwRQeDldZfWqLUjiFtRXgIKRvhT0vPNVBtyVsr5H5IkxyWZcO11k49tbl9UsBGQZbO2GwtM6fVvMvPqNj7B05%252FkTPfwejNw%253D%253D&REFERER=&HOSTNAME=sso.scvisibility.com&AUTHNLEVEL=&FAILREASON=&PROTOCOL=https&OLDSESSION=&EXPIRE_SECS=0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_4 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_4);

	harvestContainer_4.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[18], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)_2", null, 0, false);
	harvestContainer_4.addHarvestInstruction ("resp_content", dcVars[19], "/jabil\\.okta\\.com(.*?)\"", 1, 1, 0, 0, false, "jabil.okta.com", null, 0, false);
	harvestContainer_4.addHarvestInstruction ("resp_content", dcVars[20], "<[[^>].]*?name=\"RelayState\"(([[^>].]*?value=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "value", null, 0, false);
	harvestContainer_4.addHarvestInstruction ("resp_content", dcVars[21], "(?s)<[[^>].]*?name=\"SAMLRequest\"(([[^>].]*?value=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "value_2", null, 0, false);
	IDataSub subContainer_5 = new DataSub();
	reqAction.addDataSub(subContainer_5);

		ISubRule sub_8 = new SubRule("req_hdr_Referer_1", 0, 1198, false, (IDCCoreVar)dcVars[16], false, "Referer_115", null, 0, false);
	subContainer_5.addSubInstruction(sub_8);
		ISubRule sub_9 = new SubRule("req_uri", 0, 175, false, (IDCCoreVar)dcVars[17], false, "Secure login_url", null, 0, false);
	subContainer_5.addSubInstruction(sub_9);
		ISubRule sub_10 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[1], false, "Host_321", null, 0, false);
	subContainer_5.addSubInstruction(sub_10);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B810063CE3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B810063CE3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B80D9561E3A5B83735623136"), 3);		
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
			"A1E7B3E5B814C128E3A5B83735623136",
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
			HTTPThink think = new HTTPThink(20, 1000, parent, parent, "A1E7B3E5B814C2ADE3A5B83735623136");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "OKTA_1_Login", "A1E7B3E5B814C2ADE3A5B83735623136") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(2, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_6(this, true, "A1E7B3E5B814C29FE3A5B83735623136", false, true,
						"Config_3", "jabil.okta.com:443/app/jabilcircuitprod_incontrol_1/exke8lz54bfbYX2f60x7/sso/saml",	"/app/jabilcircuitprod_incontrol_1/exke8lz54bfbYX2f60x7/sso/saml", true, false), 0, "null", 3);
				httpParallel.addRequest(0, request_7(this, false, "A1E7B3E5B814C29FE3A5B83735623136", false, false,
						"Config_3", "jabil.okta.com:443/assets/loginpage/css/okta-sign-in.min.0c95c324da8441b00e4c772ec426b3b2.css",	"/assets/loginpage/css/okta-sign-in.min.0c95c324da8441b00e4c772ec426b3b2.css", true, false), 0, "null", 3);
				httpParallel.addRequest(0, request_8(this, false, "A1E7B3E5B814C29FE3A5B83735623136", false, false,
						"Config_3", "jabil.okta.com:443/assets/loginpage/css/loginpage-theme.1d67bbfa2a609ed29c26d60468f12c07.css",	"/assets/loginpage/css/loginpage-theme.1d67bbfa2a609ed29c26d60468f12c07.css", true, false), 0, "null", 3);
				httpParallel.addRequest(0, request_9(this, false, "A1E7B3E5B814C29FE3A5B83735623136", false, false,
						"Config_3", "jabil.okta.com:443/bc/globalFileStoreRecord?id=gfse8m2bpkpUovl5A0x7",	"/bc/globalFileStoreRecord?id=gfse8m2bpkpUovl5A0x7", true, false), 0, "null", 3);
				httpParallel.addRequest(1, request_10(this, false, "A1E7B3E5B8197CE6E3A5B83735623136", false, false,
						"Config_3", "jabil.okta.com:443/assets/js/mvc/loginpage/initLoginPage.pack.d1faf3d3d1a1a9101eb933e8f520507a.js",	"/assets/js/mvc/loginpage/initLoginPage.pack.d1faf3d3d1a1a9101eb933e8f520507a.js", true, false), 9, "A1E7B3E5B814C2B1E3A5B83735623136", 3);
				httpParallel.addRequest(1, request_11(this, false, "A1E7B3E5B8197CE6E3A5B83735623136", false, false,
						"Config_3", "jabil.okta.com:443/bc/image/fileStoreRecord?id=fs05cu0mejtyuWuyn0x7",	"/bc/image/fileStoreRecord?id=fs05cu0mejtyuWuyn0x7", true, false), 0, "null", 3);
				httpParallel.addRequest(0, request_12(this, false, "A1E7B3E5B814C29FE3A5B83735623136", true, false,
						"Config_3", "jabil.okta.com:443/assets/loginpage/font/okticon.9e8fee906d40286704ba3d0c626c623a.woff",	"/assets/loginpage/font/okticon.9e8fee906d40286704ba3d0c626c623a.woff", true, false), 0, "null", 3);
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5B814C2B1E3A5B83735623136", getHTTPTest());
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
		headers.add(new RequestHeaderData("Content-Type", "application/x-www-form-urlencoded", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://sso.scvisibility.com/FIM/sps/JABLPOktaSAML20/saml20/logininitial?RequestBinding=HTTPPost&NameIdFormat=email&PartnerId=http://www.okta.com/exke8lz54bfbYX2f60x7&Target=https://www.scvisibility.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_1(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_5 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_5);

	harvestContainer_5.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[22], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)_3", null, 0, false);
	harvestContainer_5.addHarvestInstruction ("resp_content", dcVars[23], "/jabil\\.okta\\.com(.*?)\"", 1, 1, 0, 0, false, "jabil.okta.com_4", null, 0, false);
	harvestContainer_5.addHarvestInstruction ("resp_content", dcVars[24], "/jabil\\.okta\\.com(.*?)\"", 2, 1, 0, 0, false, "jabil.okta.com_3", null, 0, false);
	harvestContainer_5.addHarvestInstruction ("resp_content", dcVars[25], "\\?id=(.*?)\"", 1, 1, 0, 0, false, "id_4", null, 0, false);
	harvestContainer_5.addHarvestInstruction ("resp_content", dcVars[26], "/jabil\\.okta\\.com(.*?)'", 1, 1, 0, 0, false, "jabil.okta.com_2", null, 0, false);
	harvestContainer_5.addHarvestInstruction ("resp_content", dcVars[27], "\\\\x.*?RelayState\\\\x3D(.*?)\\\\x2D", 1, 1, 0, 0, false, "Relay_1", null, 0, false);
	harvestContainer_5.addHarvestInstruction ("resp_content", dcVars[28], "\\\\x.*?RelayState\\\\x3D.*?\\\\x2D(.*?)\\\\x2D", 1, 0, 0, 0, false, "Relay_2", null, 0, false);
	harvestContainer_5.addHarvestInstruction ("resp_content", dcVars[29], "\\\\x.*?RelayState\\\\x3D.*?\\\\x2D.*?\\\\x2D(.*?)\\\\x2D", 1, 0, 0, 0, false, "Realy_3", null, 0, false);
	harvestContainer_5.addHarvestInstruction ("resp_content", dcVars[30], "\\\\x.*?RelayState\\\\x3D.*?\\\\x2D.*?\\\\x2D.*?\\\\x2D(.*?)\\\\x2D", 1, 0, 0, 0, false, "Relay_4", null, 0, false);
	harvestContainer_5.addHarvestInstruction ("resp_content", dcVars[31], "\\\\x.*?RelayState\\\\x3D.*?\\\\x2D.*?\\\\x2D.*?\\\\x2D.*?\\\\x2D(.*?)\\\\x26", 1, 0, 0, 0, false, "Relay_5", null, 0, false);
	harvestContainer_5.addHarvestInstruction ("resp_content", dcVars[32], "SAMLRequest([\\\\a-zA-Z0-9].*?)26", 1, 1, 0, 0, false, "Saml_1", null, 0, false);
	harvestContainer_5.addHarvestInstruction ("resp_content", dcVars[33], "\\?id=(.*?)'", 1, 1, 0, 0, false, "id_3", null, 0, false);
	IDataSub subContainer_7 = new DataSub();
	reqAction.addDataSub(subContainer_7);

		ISubRule sub_13 = new SubRule("req_hdr_Referer_1", 0, 203, false, (IDCCoreVar)dcVars[18], false, "Referer_112", null, 0, false);
	subContainer_7.addSubInstruction(sub_13);
		ISubRule sub_14 = new SubRule("req_uri", 0, 63, false, (IDCCoreVar)dcVars[19], false, "Jabil Circuit - Prod_url_12", null, 0, false);
	subContainer_7.addSubInstruction(sub_14);
		ISubRule sub_15 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[2], false, "Host_318", null, 0, false);
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
			"A1E7B3E5B814C2B4E3A5B83735623136",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
				SubstitutableHTTPContentVP localContentVp_1 = new SubstitutableHTTPContentVP(0, true, null, 0, reqAction);
	
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
	                                   "A1E7B3ED5EAA2740E3A5B83735623136.testdata",
	                                   "A1E7B3E5B81731FDE3A5B83735623136",
	                                   4792));
			
	HTTPPostDataChunk pdc_0 = new HTTPPostDataChunk("A1E7B3E5B81731FDE3A5B83735623136", postData, requestData_1, "UTF-8", 4768, 4792);
	postData.addDataChunk(pdc_0);

	IDataSub subContainer_6 = new DataSub();
	pdc_0.addDataSub(subContainer_6);

		ISubRule sub_11 = new SubRule("req_content", 64, 4728, true, (IDCCoreVar)dcVars[21], false, "SAMLRequest", null, 0, false);
	subContainer_6.addSubInstruction(sub_11);
		ISubRule sub_12 = new SubRule("req_content", 11, 40, true, (IDCCoreVar)dcVars[20], false, "RelayState", null, 0, false);
	subContainer_6.addSubInstruction(sub_12);
	



	}

	public HTTPAction request_7(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5B817328EE3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "jabil.okta.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/css,*/*;q=0.1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://jabil.okta.com/app/jabilcircuitprod_incontrol_1/exke8lz54bfbYX2f60x7/sso/saml", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_6 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_6);

	harvestContainer_6.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[34], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)_4", null, 0, false);
	IDataSub subContainer_8 = new DataSub();
	reqAction.addDataSub(subContainer_8);

		ISubRule sub_16 = new SubRule("req_hdr_Referer_1", 0, 85, false, (IDCCoreVar)dcVars[22], false, "Referer_111", null, 0, false);
	subContainer_8.addSubInstruction(sub_16);
		ISubRule sub_17 = new SubRule("req_uri", 0, 75, false, (IDCCoreVar)dcVars[23], false, "Jabil Circuit - Prod_url_11", null, 0, false);
	subContainer_8.addSubInstruction(sub_17);
		ISubRule sub_18 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[2], false, "Host_317", null, 0, false);
	subContainer_8.addSubInstruction(sub_18);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B814C2B1E3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B814C2B1E3A5B83735623136"), 3);		
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
			"A1E7B3E5B8173291E3A5B83735623136",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5B817330DE3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "jabil.okta.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/css,*/*;q=0.1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://jabil.okta.com/app/jabilcircuitprod_incontrol_1/exke8lz54bfbYX2f60x7/sso/saml", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_9 = new DataSub();
	reqAction.addDataSub(subContainer_9);

		ISubRule sub_19 = new SubRule("req_hdr_Referer_1", 0, 85, false, (IDCCoreVar)dcVars[22], false, "Referer_110", null, 0, false);
	subContainer_9.addSubInstruction(sub_19);
		ISubRule sub_20 = new SubRule("req_uri", 0, 74, false, (IDCCoreVar)dcVars[24], false, "Jabil Circuit - Prod_url_10", null, 0, false);
	subContainer_9.addSubInstruction(sub_20);
		ISubRule sub_21 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[2], false, "Host_316", null, 0, false);
	subContainer_9.addSubInstruction(sub_21);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B814C2B1E3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B814C2B1E3A5B83735623136"), 3);		
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
			"A1E7B3E5B8173310E3A5B83735623136",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5B8197C3FE3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "jabil.okta.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,image/apng,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://jabil.okta.com/app/jabilcircuitprod_incontrol_1/exke8lz54bfbYX2f60x7/sso/saml", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_10 = new DataSub();
	reqAction.addDataSub(subContainer_10);

		ISubRule sub_22 = new SubRule("req_uri", 29, 20, true, (IDCCoreVar)dcVars[25], false, "id", null, 0, false);
	subContainer_10.addSubInstruction(sub_22);
		ISubRule sub_23 = new SubRule("req_hdr_Referer_1", 0, 85, false, (IDCCoreVar)dcVars[22], false, "Referer_109", null, 0, false);
	subContainer_10.addSubInstruction(sub_23);
		ISubRule sub_24 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[2], false, "Host_315", null, 0, false);
	subContainer_10.addSubInstruction(sub_24);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B814C2B1E3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B814C2B1E3A5B83735623136"), 3);		
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
			"A1E7B3E5B8197C42E3A5B83735623136",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5B8197CF4E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "jabil.okta.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://jabil.okta.com/app/jabilcircuitprod_incontrol_1/exke8lz54bfbYX2f60x7/sso/saml", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_11 = new DataSub();
	reqAction.addDataSub(subContainer_11);

		ISubRule sub_25 = new SubRule("req_hdr_Referer_1", 0, 85, false, (IDCCoreVar)dcVars[22], false, "Referer_108", null, 0, false);
	subContainer_11.addSubInstruction(sub_25);
		ISubRule sub_26 = new SubRule("req_uri", 0, 79, false, (IDCCoreVar)dcVars[26], false, "Jabil Circuit - Prod_url_9", null, 0, false);
	subContainer_11.addSubInstruction(sub_26);
		ISubRule sub_27 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[2], false, "Host_314", null, 0, false);
	subContainer_11.addSubInstruction(sub_27);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B814C2B1E3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B814C2B1E3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B8197C3FE3A5B83735623136"), 3);		
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
			"A1E7B3E5B8197CF7E3A5B83735623136",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5B827D3F7E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "jabil.okta.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,image/apng,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://jabil.okta.com/app/jabilcircuitprod_incontrol_1/exke8lz54bfbYX2f60x7/sso/saml", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_12 = new DataSub();
	reqAction.addDataSub(subContainer_12);

		ISubRule sub_28 = new SubRule("req_uri", 29, 20, true, (IDCCoreVar)dcVars[33], false, "id", null, 0, false);
	subContainer_12.addSubInstruction(sub_28);
		ISubRule sub_29 = new SubRule("req_hdr_Referer_1", 0, 85, false, (IDCCoreVar)dcVars[22], false, "Referer_107", null, 0, false);
	subContainer_12.addSubInstruction(sub_29);
		ISubRule sub_30 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[2], false, "Host_313", null, 0, false);
	subContainer_12.addSubInstruction(sub_30);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B814C2B1E3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B814C2B1E3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B8197C3FE3A5B83735623136"), 3);		
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
			"A1E7B3E5B827D3FAE3A5B83735623136",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5B82C8EA0E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "jabil.okta.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://jabil.okta.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://jabil.okta.com/assets/loginpage/css/okta-sign-in.min.0c95c324da8441b00e4c772ec426b3b2.css", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_13 = new DataSub();
	reqAction.addDataSub(subContainer_13);

		ISubRule sub_31 = new SubRule("req_hdr_Referer_1", 0, 97, false, (IDCCoreVar)dcVars[34], false, "Referer_102", null, 0, false);
	subContainer_13.addSubInstruction(sub_31);
		ISubRule sub_32 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[2], false, "Host_308", null, 0, false);
	subContainer_13.addSubInstruction(sub_32);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B817328EE3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B8197C3FE3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B814C2B1E3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B827D3F7E3A5B83735623136"), 3);		
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
			"A1E7B3E5B82C8EA3E3A5B83735623136",
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
		ArmableTransaction trx = new ArmableTransaction(parent, "Enter_Username", "A1E7B3E5B82EFFA0E3A5B83735623136") {
		
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
			HTTPThink think = new HTTPThink(20, 1000, parent, parent, "A1E7B3E5B838758EE3A5B83735623136");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "OKTA_2_Login_Username", "A1E7B3E5B838758EE3A5B83735623136") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(1, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_13(this, true, "A1E7B3E5B8387580E3A5B83735623136", false, true,
						"Config_3", "jabil.okta.com:443/login/getimage?username=IDSEUser137",	"/login/getimage?username=IDSEUser137", true, false), 0, "null", 3);
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5B8387592E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(9);
					
		headers.add(new RequestHeaderData("Host", "jabil.okta.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("X-Okta-XsrfToken", "", "UTF-8", 1));			
		headers.add(new RequestHeaderData("X-Requested-With", "XMLHttpRequest", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://jabil.okta.com/app/jabilcircuitprod_incontrol_1/exke8lz54bfbYX2f60x7/sso/saml", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_14 = new DataSub();
	reqAction.addDataSub(subContainer_14);

		ISubRule sub_33 = new SubRule("req_uri", 25, 11, true, (IDCCoreVar)dcVars[0], false, "username", null, 0, false);
	subContainer_14.addSubInstruction(sub_33);
		ISubRule sub_34 = new SubRule("req_hdr_Referer_1", 0, 85, false, (IDCCoreVar)dcVars[22], false, "Referer_101", null, 0, false);
	subContainer_14.addSubInstruction(sub_34);
		ISubRule sub_35 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[2], false, "Host_307", null, 0, false);
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
			"A1E7B3E5B8387595E3A5B83735623136",
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
			HTTPThink think = new HTTPThink(20, 1000, parent, parent, "A1E7B3E5B8493E6EE3A5B83735623136");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "OKTA_2_Login_Password", "A1E7B3E5B8493E6EE3A5B83735623136") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(1, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_14(this, true, "A1E7B3E5B8493E60E3A5B83735623136", false, true,
						"Config_3", "jabil.okta.com:443/api/v1/authn",	"/api/v1/authn", true, false), 0, "null", 3);
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5B8493E72E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
		headers.add(new RequestHeaderData("Host", "jabil.okta.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "130", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://jabil.okta.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("X-Okta-XsrfToken", "", "UTF-8", 1));			
		headers.add(new RequestHeaderData("X-Okta-User-Agent-Extended", "okta-signin-widget-2.3.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "application/json", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json", "UTF-8", 1));			
		headers.add(new RequestHeaderData("X-Requested-With", "XMLHttpRequest", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://jabil.okta.com/app/jabilcircuitprod_incontrol_1/exke8lz54bfbYX2f60x7/sso/saml", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_2(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_7 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_7);

	harvestContainer_7.addHarvestInstruction ("resp_content", dcVars[35], "\"stateToken\":\"(.*?)\"", 1, 1, 0, 0, false, "State_tokem_1", null, 0, false);
	harvestContainer_7.addHarvestInstruction ("resp_content", dcVars[36], "/factors/(.*?)/", 1, 1, 0, 0, false, "Verify_1", null, 0, false);
	IDataSub subContainer_16 = new DataSub();
	reqAction.addDataSub(subContainer_16);

		ISubRule sub_37 = new SubRule("req_hdr_Referer_1", 0, 85, false, (IDCCoreVar)dcVars[22], false, "Referer_98", null, 0, false);
	subContainer_16.addSubInstruction(sub_37);
		ISubRule sub_38 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[2], false, "Host_304", null, 0, false);
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
			"A1E7B3E5B8493E75E3A5B83735623136",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
				SubstitutableHTTPContentVP localContentVp_3 = new SubstitutableHTTPContentVP(1, true, null, 0, reqAction);
	
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
strBuf_1.append("{\"username\":\"IDSEUser137\",\"password\":\"1Ds3P@ssword\",\"options");
strBuf_1.append("\":{\"warnBeforePasswordExpired\":true,\"multiOptionalFactorEnro");
strBuf_1.append("ll\":true}}");
String requestData_2 = strBuf_1.toString();
			
	HTTPPostDataChunk pdc_1 = new HTTPPostDataChunk("A1E7B3E5B8493EC2E3A5B83735623136", postData, requestData_2, "UTF-8", 11, 24);
	postData.addDataChunk(pdc_1);

	IDataSub subContainer_15 = new DataSub();
	pdc_1.addDataSub(subContainer_15);

		ISubRule sub_36 = new SubRule("req_content", 13, 11, true, (IDCCoreVar)dcVars[0], false, "username_2", null, 0, false);
	subContainer_15.addSubInstruction(sub_36);
	



	}

	private ArmableTransaction transaction_3(final IContainer parent) {
		ArmableTransaction trx = new ArmableTransaction(parent, "Enter_security_answer", "A1E7B3E5B859E030E3A5B83735623136") {
		
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
			HTTPThink think = new HTTPThink(20, 1000, parent, parent, "A1E7B3EE395F6170E3A5B83735623136");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "OKTA_1_Verification", "A1E7B3EE395F6170E3A5B83735623136") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(2, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_15(this, true, "A1E7B3E5B86AA910E3A5B83735623136", false, false,
						"Config_3", "jabil.okta.com:443/api/v1/authn/factors/ufsejx8s1hRZupz7F0x7/verify",	"/api/v1/authn/factors/ufsejx8s1hRZupz7F0x7/verify", true, false), 0, "null", 3);
				httpParallel.addRequest(0, request_16(this, false, "A1E7B3E5B86AA910E3A5B83735623136", false, true,
						"Config_3", "jabil.okta.com:443/login/sessionCookieRedirect",	"/login/sessionCookieRedirect", true, false), 0, "null", 3);
				httpParallel.addRequest(0, request_17(this, false, "A1E7B3E5B86AA910E3A5B83735623136", false, false,
						"Config_3", "jabil.okta.com:443/assets/css/sections/interstitial.b50e299a21400f2b173a71c8ebc3678d.css",	"/assets/css/sections/interstitial.b50e299a21400f2b173a71c8ebc3678d.css", true, false), 0, "null", 3);
				httpParallel.addRequest(0, request_18(this, false, "A1E7B3E5B86AA910E3A5B83735623136", false, false,
						"Config_3", "jabil.okta.com:443/assets/js/jquery-1.11.3.min.895323ed2f7258af4fae2c738c8aea49.js",	"/assets/js/jquery-1.11.3.min.895323ed2f7258af4fae2c738c8aea49.js", true, false), 0, "null", 3);
				httpParallel.addRequest(0, request_19(this, false, "A1E7B3E5B86AA910E3A5B83735623136", true, false,
						"Config_3", "jabil.okta.com:443/assets/js/widget/spin.min.545405225c13b2f42ab103fca31a49b1.js",	"/assets/js/widget/spin.min.545405225c13b2f42ab103fca31a49b1.js", true, false), 0, "null", 3);
				httpParallel.addRequest(1, request_20(this, false, "A1E7B3E5B8BDF9AFE3A5B83735623136", false, false,
						"Config_3", "jabil.okta.com:443/assets/js/app/sso/interstitial.0dee13f2d74d523aca30e2028a2b2199.js",	"/assets/js/app/sso/interstitial.0dee13f2d74d523aca30e2028a2b2199.js", true, false), 10, "A1E7B3E5B87DBBE0E3A5B83735623136", 3);
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5B86AA922E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(14);
					
		headers.add(new RequestHeaderData("Host", "jabil.okta.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "84", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://jabil.okta.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("X-Okta-XsrfToken", "", "UTF-8", 1));			
		headers.add(new RequestHeaderData("X-Okta-User-Agent-Extended", "okta-signin-widget-2.3.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "application/json", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json", "UTF-8", 1));			
		headers.add(new RequestHeaderData("X-Requested-With", "XMLHttpRequest", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://jabil.okta.com/signin/verify/okta/question", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "oktaStateToken=00EClK4XcnLNfnE9CxoVl-YjO4zijzyFPhwIzmXSng", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_3(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_8 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_8);

	harvestContainer_8.addHarvestInstruction ("resp_content", dcVars[37], "\"sessionToken\":\"(.*?)\"", 1, 1, 0, 0, false, "Session_1", null, 0, false);
	IDataSub subContainer_18 = new DataSub();
	reqAction.addDataSub(subContainer_18);

		ISubRule sub_40 = new SubRule("req_uri", 22, 20, true, (IDCCoreVar)dcVars[36], false, "factors", null, 0, false);
	subContainer_18.addSubInstruction(sub_40);
		ISubRule sub_41 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[2], false, "Host_302", null, 0, false);
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
			"A1E7B3E5B86AA925E3A5B83735623136",
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
		reqAction.setResponseContentType("application/json;charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_3(HTTPPostData postData) {
				StringBuffer strBuf_2 = new StringBuffer();
strBuf_2.append("{\"answer\":\"anchovy paste\",\"stateToken\":\"00EClK4XcnLNfnE9CxoV");
strBuf_2.append("l-YjO4zijzyFPhwIzmXSng\"}");
String requestData_3 = strBuf_2.toString();
			
	HTTPPostDataChunk pdc_2 = new HTTPPostDataChunk("A1E7B3E5B86AA976E3A5B83735623136", postData, requestData_3, "UTF-8", 42, 82);
	postData.addDataChunk(pdc_2);

	IDataSub subContainer_17 = new DataSub();
	pdc_2.addDataSub(subContainer_17);

		ISubRule sub_39 = new SubRule("req_content", 40, 42, true, (IDCCoreVar)dcVars[35], false, "stateToken", null, 0, false);
	subContainer_17.addSubInstruction(sub_39);
	



	}

	public HTTPAction request_16(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5B87DBBE0E3A5B83735623136", getHTTPTest());
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
		headers.add(new RequestHeaderData("Content-Type", "application/x-www-form-urlencoded", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://jabil.okta.com/signin/verify/okta/question", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_4(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_9 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_9);

	harvestContainer_9.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[38], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)_6", null, 0, false);
	harvestContainer_9.addHarvestInstruction ("resp_content", dcVars[39], "/jabil\\.okta\\.com(.*?)\"", 9, 9, 0, 0, false, "jabil.okta.com_10", null, 0, false);
	harvestContainer_9.addHarvestInstruction ("resp_content", dcVars[40], "/jabil\\.okta\\.com(.*?)\"", 11, 2, 0, 0, false, "jabil.okta.com_11", null, 0, false);
	harvestContainer_9.addHarvestInstruction ("resp_content", dcVars[41], "/jabil\\.okta\\.com(.*?)\"", 12, 1, 0, 0, false, "jabil.okta.com_9", null, 0, false);
	harvestContainer_9.addHarvestInstruction ("resp_content", dcVars[42], "<[[^>].]*?name=\"SAMLResponse\"(([[^>].]*?value=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "value_3", null, 0, false);
	harvestContainer_9.addHarvestInstruction ("resp_content", dcVars[43], "/jabil\\.okta\\.com(.*?)\"", 13, 1, 0, 0, false, "jabil.okta.com_8", null, 0, false);
	IDataSub subContainer_20 = new DataSub();
	reqAction.addDataSub(subContainer_20);

		ISubRule sub_49 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[2], false, "Host_301", null, 0, false);
	subContainer_20.addSubInstruction(sub_49);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B86AA922E3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B86AA922E3A5B83735623136"), 3);		
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
			"A1E7B3E5B87DBBE3E3A5B83735623136",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

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
	                                   "A1E7B3ED5EAA2740E3A5B83735623136.testdata",
	                                   "A1E7B3E5B87DBC2CE3A5B83735623136",
	                                   5286));
			
	HTTPPostDataChunk pdc_3 = new HTTPPostDataChunk("A1E7B3E5B87DBC2CE3A5B83735623136", postData, requestData_4, "UTF-8", 5081, 5250);
	postData.addDataChunk(pdc_3);

	IDataSub subContainer_19 = new DataSub();
	pdc_3.addDataSub(subContainer_19);

		ISubRule sub_42 = new SubRule("req_content", 260, 4990, false, (IDCCoreVar)dcVars[32], false, "redirectUrl_6", null, 0, false);
	subContainer_19.addSubInstruction(sub_42);
		ISubRule sub_43 = new SubRule("req_content", 234, 12, true, (IDCCoreVar)dcVars[31], false, "redirectUrl_5", null, 0, false);
	subContainer_19.addSubInstruction(sub_43);
		ISubRule sub_44 = new SubRule("req_content", 229, 4, true, (IDCCoreVar)dcVars[30], false, "redirectUrl_4", null, 0, false);
	subContainer_19.addSubInstruction(sub_44);
		ISubRule sub_45 = new SubRule("req_content", 224, 4, true, (IDCCoreVar)dcVars[29], false, "redirectUrl_3", null, 0, false);
	subContainer_19.addSubInstruction(sub_45);
		ISubRule sub_46 = new SubRule("req_content", 219, 4, true, (IDCCoreVar)dcVars[28], false, "redirectUrl_2", null, 0, false);
	subContainer_19.addSubInstruction(sub_46);
		ISubRule sub_47 = new SubRule("req_content", 206, 12, true, (IDCCoreVar)dcVars[27], false, "redirectUrl", null, 0, false);
	subContainer_19.addSubInstruction(sub_47);
		ISubRule sub_48 = new SubRule("req_content", 49, 55, true, (IDCCoreVar)dcVars[37], false, "token", null, 0, false);
	subContainer_19.addSubInstruction(sub_48);
	



	}

	public HTTPAction request_17(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5B88005D0E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "jabil.okta.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/css,*/*;q=0.1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://jabil.okta.com/login/sessionCookieRedirect", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_21 = new DataSub();
	reqAction.addDataSub(subContainer_21);

		ISubRule sub_50 = new SubRule("req_hdr_Referer_1", 0, 50, false, (IDCCoreVar)dcVars[38], false, "Referer_96", null, 0, false);
	subContainer_21.addSubInstruction(sub_50);
		ISubRule sub_51 = new SubRule("req_uri", 0, 70, false, (IDCCoreVar)dcVars[40], false, "Jabil Circuit - Prod_url_8", null, 0, false);
	subContainer_21.addSubInstruction(sub_51);
		ISubRule sub_52 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[2], false, "Host_300", null, 0, false);
	subContainer_21.addSubInstruction(sub_52);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B87DBBE0E3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B87DBBE0E3A5B83735623136"), 3);		
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
			"A1E7B3E5B88005D3E3A5B83735623136",
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

	public HTTPAction request_18(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5B89318A0E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "jabil.okta.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://jabil.okta.com/login/sessionCookieRedirect", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_22 = new DataSub();
	reqAction.addDataSub(subContainer_22);

		ISubRule sub_53 = new SubRule("req_hdr_Referer_1", 0, 50, false, (IDCCoreVar)dcVars[38], false, "Referer_95", null, 0, false);
	subContainer_22.addSubInstruction(sub_53);
		ISubRule sub_54 = new SubRule("req_uri", 0, 64, false, (IDCCoreVar)dcVars[39], false, "Jabil Circuit - Prod_url_7", null, 0, false);
	subContainer_22.addSubInstruction(sub_54);
		ISubRule sub_55 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[2], false, "Host_299", null, 0, false);
	subContainer_22.addSubInstruction(sub_55);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B87DBBE0E3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B87DBBE0E3A5B83735623136"), 3);		
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
			"A1E7B3E5B89318A3E3A5B83735623136",
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

	public HTTPAction request_19(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5B8BDF930E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "jabil.okta.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://jabil.okta.com/login/sessionCookieRedirect", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_23 = new DataSub();
	reqAction.addDataSub(subContainer_23);

		ISubRule sub_56 = new SubRule("req_hdr_Referer_1", 0, 50, false, (IDCCoreVar)dcVars[38], false, "Referer_94", null, 0, false);
	subContainer_23.addSubInstruction(sub_56);
		ISubRule sub_57 = new SubRule("req_uri", 0, 62, false, (IDCCoreVar)dcVars[41], false, "Jabil Circuit - Prod_url_6", null, 0, false);
	subContainer_23.addSubInstruction(sub_57);
		ISubRule sub_58 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[2], false, "Host_298", null, 0, false);
	subContainer_23.addSubInstruction(sub_58);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B87DBBE0E3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B87DBBE0E3A5B83735623136"), 3);		
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
			"A1E7B3E5B8BDF933E3A5B83735623136",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5B8BDF9BDE3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "jabil.okta.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://jabil.okta.com/login/sessionCookieRedirect", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_24 = new DataSub();
	reqAction.addDataSub(subContainer_24);

		ISubRule sub_59 = new SubRule("req_hdr_Referer_1", 0, 50, false, (IDCCoreVar)dcVars[38], false, "Referer_93", null, 0, false);
	subContainer_24.addSubInstruction(sub_59);
		ISubRule sub_60 = new SubRule("req_uri", 0, 67, false, (IDCCoreVar)dcVars[43], false, "Jabil Circuit - Prod_url_5", null, 0, false);
	subContainer_24.addSubInstruction(sub_60);
		ISubRule sub_61 = new SubRule("req_hdr_Host_1", 0, 14, false, (IDCCoreVar)vars[2], false, "Host_297", null, 0, false);
	subContainer_24.addSubInstruction(sub_61);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B87DBBE0E3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B87DBBE0E3A5B83735623136"), 3);		
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
			"A1E7B3E5B8BDF9C0E3A5B83735623136",
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
			HTTPThink think = new HTTPThink(20, 1000, parent, parent, "A1E7B3E5B86AA91EE3A5B83735623136");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "CIS_1_Verification", "A1E7B3E5B86AA91EE3A5B83735623136") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(1, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_21(this, true, "A1E7B3E5B8CEC283E3A5B83735623136", false, false,
						"Config_2", "sso.scvisibility.com:443/FIM/sps/JABLPOktaSAML20/saml20/login",	"/FIM/sps/JABLPOktaSAML20/saml20/login", true, false), 0, "null", 3);
				httpParallel.addRequest(0, request_22(this, false, "A1E7B3E5B8CEC283E3A5B83735623136", true, true,
						"Config_2", "sso.scvisibility.com:443/FIM/sps/JABLPNodejsSAML20/saml20/logininitial?RequestBinding=HTTPPost&PartnerId=https%3A%2F%2Fwww.scvisibility.com%2Fauth%2Fsso%2Fcallback%2F&NameIdFormat=email&SAMLRequest=nVRRb9owEP4rkR%2F2RuxQVJhHQBRUjYl2EbA97KUyztF6c%2BzM5wD993UCmZC2Ig3lwZLvu7vvvvuc4fhQ6GgHDpU1KUliRsajIYpCl3xS%2BRezhN8VoI8CzCBvAimpnOFWoEJuRAHIveSrycOCd2PGS2e9lVaTaD5LyROTm%2B1ttze4TRLZZ72bbjJgJPreNgwZAYhYwdygF8aHK5b0OwnrJIM1%2B8hZj7NB3L3p%2FyBRdip9p0yuzPNlHpsjCPnn9TrrZF9XaxJNEMH50HhqDVYFuBW4nZLwbblIyYv3JXJK9%2Ft9jHKnUG2UVv41lragImhBES2VQuuNkL9INAuyKCN8M0ebHCB%2FJ9%2FPHyiWSL9M7hbZo83hJ9Y0u4zWeoZD22dlwueV0OOT4u2QNf3Mov8givJTJpw34OZ5%2Bn9saZP9GESa5%2FfWFcKnUAilyXHXvNmAO1vyZW1FqyMZWQMN%2B6c6a0jPqrU2arrOMquVfL3GRie%2B76KTOGluVN7ZNlDejDbJcweIYela2%2F3UgfCQEu8qILSldpIa8sbqwRQeDldZfWqLUjiFtRXgIKRvhT0vPNVBtyVsr5H5IkxyWZcO11k49tbl9UsBGQZbO2GwtM6fVvMvPqNj7B05%2FkTPfwejNw%3D%3D",	"/FIM/sps/JABLPNodejsSAML20/saml20/logininitial?RequestBinding=HTTPPost&PartnerId=https%3A%2F%2Fwww.scvisibility.com%2Fauth%2Fsso%2Fcallback%2F&NameIdFormat=email&SAMLRequest=nVRRb9owEP4rkR%2F2RuxQVJhHQBRUjYl2EbA97KUyztF6c%2BzM5wD993UCmZC2Ig3lwZLvu7vvvvuc4fhQ6GgHDpU1KUliRsajIYpCl3xS%2BRezhN8VoI8CzCBvAimpnOFWoEJuRAHIveSrycOCd2PGS2e9lVaTaD5LyROTm%2B1ttze4TRLZZ72bbjJgJPreNgwZAYhYwdygF8aHK5b0OwnrJIM1%2B8hZj7NB3L3p%2FyBRdip9p0yuzPNlHpsjCPnn9TrrZF9XaxJNEMH50HhqDVYFuBW4nZLwbblIyYv3JXJK9%2Ft9jHKnUG2UVv41lragImhBES2VQuuNkL9INAuyKCN8M0ebHCB%2FJ9%2FPHyiWSL9M7hbZo83hJ9Y0u4zWeoZD22dlwueV0OOT4u2QNf3Mov8givJTJpw34OZ5%2Bn9saZP9GESa5%2FfWFcKnUAilyXHXvNmAO1vyZW1FqyMZWQMN%2B6c6a0jPqrU2arrOMquVfL3GRie%2B76KTOGluVN7ZNlDejDbJcweIYela2%2F3UgfCQEu8qILSldpIa8sbqwRQeDldZfWqLUjiFtRXgIKRvhT0vPNVBtyVsr5H5IkxyWZcO11k49tbl9UsBGQZbO2GwtM6fVvMvPqNj7B05%2FkTPfwejNw%3D%3D", true, false), 0, "null", 3);
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5B8CEC291E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(12);
					
		headers.add(new RequestHeaderData("Host", "sso.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "9447", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cache-Control", "max-age=0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://jabil.okta.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "application/x-www-form-urlencoded", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://jabil.okta.com/login/sessionCookieRedirect", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_5(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_10 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_10);

	harvestContainer_10.addHarvestInstruction ("resp_hdr_location_1", dcVars[44], "http.{0,1}://.*?(/.*)", 1, 0, 0, 0, false, "location_3", null, 0, false);
	IDataSub subContainer_26 = new DataSub();
	reqAction.addDataSub(subContainer_26);

		ISubRule sub_68 = new SubRule("req_hdr_Referer_1", 0, 50, false, (IDCCoreVar)dcVars[38], false, "Referer_89", null, 0, false);
	subContainer_26.addSubInstruction(sub_68);
		ISubRule sub_69 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[1], false, "Host_293", null, 0, false);
	subContainer_26.addSubInstruction(sub_69);
	


		
				
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
			"A1E7B3E5B8CEC294E3A5B83735623136",
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
	                                   "A1E7B3ED5EAA2740E3A5B83735623136.testdata",
	                                   "A1E7B3E5B8D10C21E3A5B83735623136",
	                                   9447));
			
	HTTPPostDataChunk pdc_4 = new HTTPPostDataChunk("A1E7B3E5B8D10C21E3A5B83735623136", postData, requestData_5, "UTF-8", 9418, 9447);
	postData.addDataChunk(pdc_4);

	IDataSub subContainer_25 = new DataSub();
	pdc_4.addDataSub(subContainer_25);

		ISubRule sub_62 = new SubRule("req_content", 9435, 12, true, (IDCCoreVar)dcVars[31], false, "RelayState_5", null, 0, false);
	subContainer_25.addSubInstruction(sub_62);
		ISubRule sub_63 = new SubRule("req_content", 9430, 4, true, (IDCCoreVar)dcVars[30], false, "RelayState_4", null, 0, false);
	subContainer_25.addSubInstruction(sub_63);
		ISubRule sub_64 = new SubRule("req_content", 9425, 4, true, (IDCCoreVar)dcVars[29], false, "RelayState_3", null, 0, false);
	subContainer_25.addSubInstruction(sub_64);
		ISubRule sub_65 = new SubRule("req_content", 9420, 4, true, (IDCCoreVar)dcVars[28], false, "RelayState_2", null, 0, false);
	subContainer_25.addSubInstruction(sub_65);
		ISubRule sub_66 = new SubRule("req_content", 9407, 12, true, (IDCCoreVar)dcVars[27], false, "RelayState", null, 0, false);
	subContainer_25.addSubInstruction(sub_66);
		ISubRule sub_67 = new SubRule("req_content", 13, 9382, true, (IDCCoreVar)dcVars[42], false, "SAMLResponse", null, 0, false);
	subContainer_25.addSubInstruction(sub_67);
	



	}

	public HTTPAction request_22(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5B8D10C71E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(9);
					
		headers.add(new RequestHeaderData("Host", "sso.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cache-Control", "max-age=0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://jabil.okta.com/login/sessionCookieRedirect", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_11 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_11);

	harvestContainer_11.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[45], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)_7", null, 0, false);
	harvestContainer_11.addHarvestInstruction ("resp_content", dcVars[46], "<[[^>].]*?name=\"RelayState\"(([[^>].]*?value=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "value_5", null, 0, false);
	harvestContainer_11.addHarvestInstruction ("resp_content", dcVars[47], "(?s)<[[^>].]*?name=\"SAMLResponse\"(([[^>].]*?value=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "value_6", null, 0, false);
	IDataSub subContainer_27 = new DataSub();
	reqAction.addDataSub(subContainer_27);

		ISubRule sub_70 = new SubRule("req_hdr_Referer_1", 0, 50, false, (IDCCoreVar)dcVars[38], false, "Referer_88", null, 0, false);
	subContainer_27.addSubInstruction(sub_70);
		ISubRule sub_71 = new SubRule("req_uri", 0, 848, false, (IDCCoreVar)dcVars[44], false, "Jabil Circuit - Prod_url", null, 0, false);
	subContainer_27.addSubInstruction(sub_71);
		ISubRule sub_72 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[1], false, "Host_292", null, 0, false);
	subContainer_27.addSubInstruction(sub_72);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B8CEC291E3A5B83735623136"), 3);		
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
			"A1E7B3E5B8D10C74E3A5B83735623136",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
				SubstitutableHTTPContentVP localContentVp_5 = new SubstitutableHTTPContentVP(1, true, null, 0, reqAction);
	
			localContentVp_5.addConstContentElement(contVPElem_5);
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
			HTTPThink think = new HTTPThink(20, 1000, parent, parent, "A1E7B3E5B8D10D0AE3A5B83735623136");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "Incontrol_Verification", "A1E7B3E5B8D10D0AE3A5B83735623136") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(4, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_23(this, true, "A1E7B3E5B8D10CFCE3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/auth/sso/callback/",	"/auth/sso/callback/", true, false), 0, "null", 3);
				httpParallel.addRequest(0, request_24(this, false, "A1E7B3E5B8D10CFCE3A5B83735623136", false, true,
						"Config_1", "www.scvisibility.com:443/",	"/", true, false), 0, "null", 3);
				httpParallel.addRequest(0, request_25(this, false, "A1E7B3E5B8D10CFCE3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/styles/lib-cb338763d9.css",	"/styles/lib-cb338763d9.css", true, false), 0, "null", 3);
				httpParallel.addRequest(1, request_26(this, false, "A1E7B3E5B8E68FD9E3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/styles/app-725ee845ec.css",	"/styles/app-725ee845ec.css", true, false), 8, "A1E7B3E5B8D10DC7E3A5B83735623136", 3);
				httpParallel.addRequest(2, request_27(this, false, "A1E7B3E5B8E900D7E3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/js/lib-0fc0a9ee15.js",	"/js/lib-0fc0a9ee15.js", true, false), 48, "A1E7B3E5B8D10DC7E3A5B83735623136", 3);
				httpParallel.addRequest(3, request_28(this, false, "A1E7B3E5B9033F97E3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/js/app-e4679e5e43.js",	"/js/app-e4679e5e43.js", true, false), 1, "A1E7B3E5B8D10DC7E3A5B83735623136", 3);
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5B8D10D0EE3A5B83735623136", getHTTPTest());
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
		headers.add(new RequestHeaderData("Content-Type", "application/x-www-form-urlencoded", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://sso.scvisibility.com/FIM/sps/JABLPNodejsSAML20/saml20/logininitial?RequestBinding=HTTPPost&PartnerId=https%3A%2F%2Fwww.scvisibility.com%2Fauth%2Fsso%2Fcallback%2F&NameIdFormat=email&SAMLRequest=nVRRb9owEP4rkR%2F2RuxQVJhHQBRUjYl2EbA97KUyztF6c%2BzM5wD993UCmZC2Ig3lwZLvu7vvvvuc4fhQ6GgHDpU1KUliRsajIYpCl3xS%2BRezhN8VoI8CzCBvAimpnOFWoEJuRAHIveSrycOCd2PGS2e9lVaTaD5LyROTm%2B1ttze4TRLZZ72bbjJgJPreNgwZAYhYwdygF8aHK5b0OwnrJIM1%2B8hZj7NB3L3p%2FyBRdip9p0yuzPNlHpsjCPnn9TrrZF9XaxJNEMH50HhqDVYFuBW4nZLwbblIyYv3JXJK9%2Ft9jHKnUG2UVv41lragImhBES2VQuuNkL9INAuyKCN8M0ebHCB%2FJ9%2FPHyiWSL9M7hbZo83hJ9Y0u4zWeoZD22dlwueV0OOT4u2QNf3Mov8givJTJpw34OZ5%2Bn9saZP9GESa5%2FfWFcKnUAilyXHXvNmAO1vyZW1FqyMZWQMN%2B6c6a0jPqrU2arrOMquVfL3GRie%2B76KTOGluVN7ZNlDejDbJcweIYela2%2F3UgfCQEu8qILSldpIa8sbqwRQeDldZfWqLUjiFtRXgIKRvhT0vPNVBtyVsr5H5IkxyWZcO11k49tbl9UsBGQZbO2GwtM6fVvMvPqNj7B05%2FkTPfwejNw%3D%3D", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_6(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_12 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_12);

	harvestContainer_12.addHarvestInstruction ("resp_hdr_Location_1", dcVars[48], ".*", 1, 0, 0, 0, false, "Location_2", null, 0, false);
	IDataSub subContainer_29 = new DataSub();
	reqAction.addDataSub(subContainer_29);

		ISubRule sub_75 = new SubRule("req_hdr_Referer_1", 0, 876, false, (IDCCoreVar)dcVars[45], false, "Referer_87", null, 0, false);
	subContainer_29.addSubInstruction(sub_75);
		ISubRule sub_76 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_291", null, 0, false);
	subContainer_29.addSubInstruction(sub_76);
	


		
				
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
			"A1E7B3E5B8D10D11E3A5B83735623136",
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
	                                   "A1E7B3ED5EAA2740E3A5B83735623136.testdata",
	                                   "A1E7B3E5B8D10D5AE3A5B83735623136",
	                                   6131));
			
	HTTPPostDataChunk pdc_5 = new HTTPPostDataChunk("A1E7B3E5B8D10D5AE3A5B83735623136", postData, requestData_6, "UTF-8", 6106, 6131);
	postData.addDataChunk(pdc_5);

	IDataSub subContainer_28 = new DataSub();
	pdc_5.addDataSub(subContainer_28);

		ISubRule sub_73 = new SubRule("req_content", 25, 6106, true, (IDCCoreVar)dcVars[47], false, "SAMLResponse", null, 0, false);
	subContainer_28.addSubInstruction(sub_73);
		ISubRule sub_74 = new SubRule("req_content", 11, 0, true, (IDCCoreVar)dcVars[46], false, "RelayState", null, 0, false);
	subContainer_28.addSubInstruction(sub_74);
	



	}

	public HTTPAction request_24(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5B8D10DC7E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(9);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cache-Control", "max-age=0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://sso.scvisibility.com/FIM/sps/JABLPNodejsSAML20/saml20/logininitial?RequestBinding=HTTPPost&PartnerId=https%3A%2F%2Fwww.scvisibility.com%2Fauth%2Fsso%2Fcallback%2F&NameIdFormat=email&SAMLRequest=nVRRb9owEP4rkR%2F2RuxQVJhHQBRUjYl2EbA97KUyztF6c%2BzM5wD993UCmZC2Ig3lwZLvu7vvvvuc4fhQ6GgHDpU1KUliRsajIYpCl3xS%2BRezhN8VoI8CzCBvAimpnOFWoEJuRAHIveSrycOCd2PGS2e9lVaTaD5LyROTm%2B1ttze4TRLZZ72bbjJgJPreNgwZAYhYwdygF8aHK5b0OwnrJIM1%2B8hZj7NB3L3p%2FyBRdip9p0yuzPNlHpsjCPnn9TrrZF9XaxJNEMH50HhqDVYFuBW4nZLwbblIyYv3JXJK9%2Ft9jHKnUG2UVv41lragImhBES2VQuuNkL9INAuyKCN8M0ebHCB%2FJ9%2FPHyiWSL9M7hbZo83hJ9Y0u4zWeoZD22dlwueV0OOT4u2QNf3Mov8givJTJpw34OZ5%2Bn9saZP9GESa5%2FfWFcKnUAilyXHXvNmAO1vyZW1FqyMZWQMN%2B6c6a0jPqrU2arrOMquVfL3GRie%2B76KTOGluVN7ZNlDejDbJcweIYela2%2F3UgfCQEu8qILSldpIa8sbqwRQeDldZfWqLUjiFtRXgIKRvhT0vPNVBtyVsr5H5IkxyWZcO11k49tbl9UsBGQZbO2GwtM6fVvMvPqNj7B05%2FkTPfwejNw%3D%3D", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_13 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_13);

	harvestContainer_13.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[49], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)_8", null, 0, false);
	harvestContainer_13.addHarvestInstruction ("resp_content", dcVars[50], "/lib-(.*?)\\.", 1, 1, 0, 0, false, "css_1", null, 0, false);
	harvestContainer_13.addHarvestInstruction ("resp_content", dcVars[51], "/app-(.*?)\\.", 1, 1, 0, 0, false, "css_2", null, 0, false);
	harvestContainer_13.addHarvestInstruction ("resp_content", dcVars[52], "/lib-(.*?)\\.", 2, 1, 0, 0, false, "js_1", null, 0, false);
	harvestContainer_13.addHarvestInstruction ("resp_content", dcVars[53], "/app-(.*?)\\.", 2, 1, 0, 0, false, "js_2", null, 0, false);
	IDataSub subContainer_30 = new DataSub();
	reqAction.addDataSub(subContainer_30);

		ISubRule sub_77 = new SubRule("req_hdr_Referer_1", 0, 876, false, (IDCCoreVar)dcVars[45], false, "Referer_86", null, 0, false);
	subContainer_30.addSubInstruction(sub_77);
		ISubRule sub_78 = new SubRule("req_uri", 0, 1, false, (IDCCoreVar)dcVars[48], false, "jabil_url", null, 0, false);
	subContainer_30.addSubInstruction(sub_78);
		ISubRule sub_79 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_290", null, 0, false);
	subContainer_30.addSubInstruction(sub_79);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B8D10D0EE3A5B83735623136"), 3);		
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
			"A1E7B3E5B8D10DCAE3A5B83735623136",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5B8E41ED0E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/css,*/*;q=0.1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_14 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_14);

	harvestContainer_14.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[54], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)_9", null, 0, false);
	IDataSub subContainer_31 = new DataSub();
	reqAction.addDataSub(subContainer_31);

		ISubRule sub_80 = new SubRule("req_uri", 12, 10, true, (IDCCoreVar)dcVars[50], false, "lib-", null, 0, false);
	subContainer_31.addSubInstruction(sub_80);
		ISubRule sub_81 = new SubRule("req_hdr_Referer_1", 0, 29, false, (IDCCoreVar)dcVars[49], false, "Referer_85", null, 0, false);
	subContainer_31.addSubInstruction(sub_81);
		ISubRule sub_82 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_289", null, 0, false);
	subContainer_31.addSubInstruction(sub_82);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B8D10DC7E3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B8D10DC7E3A5B83735623136"), 3);		
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
			"A1E7B3E5B8E41ED3E3A5B83735623136",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5B8E68FE7E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/css,*/*;q=0.1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_15 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_15);

	harvestContainer_15.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[55], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)_10", null, 0, false);
	harvestContainer_15.addHarvestInstruction ("resp_content", dcVars[56], "\\?v=(.*?)\\)", 1, 1, 0, 0, false, "v_2", null, 0, false);
	IDataSub subContainer_32 = new DataSub();
	reqAction.addDataSub(subContainer_32);

		ISubRule sub_83 = new SubRule("req_uri", 12, 10, true, (IDCCoreVar)dcVars[51], false, "app-", null, 0, false);
	subContainer_32.addSubInstruction(sub_83);
		ISubRule sub_84 = new SubRule("req_hdr_Referer_1", 0, 29, false, (IDCCoreVar)dcVars[49], false, "Referer_84", null, 0, false);
	subContainer_32.addSubInstruction(sub_84);
		ISubRule sub_85 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_288", null, 0, false);
	subContainer_32.addSubInstruction(sub_85);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B8D10DC7E3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B8E41ED0E3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B8D10DC7E3A5B83735623136"), 3);		
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
			"A1E7B3E5B8E68FEAE3A5B83735623136",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5B8E900E5E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_33 = new DataSub();
	reqAction.addDataSub(subContainer_33);

		ISubRule sub_86 = new SubRule("req_uri", 8, 10, true, (IDCCoreVar)dcVars[52], false, "lib-_2", null, 0, false);
	subContainer_33.addSubInstruction(sub_86);
		ISubRule sub_87 = new SubRule("req_hdr_Referer_1", 0, 29, false, (IDCCoreVar)dcVars[49], false, "Referer_83", null, 0, false);
	subContainer_33.addSubInstruction(sub_87);
		ISubRule sub_88 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_287", null, 0, false);
	subContainer_33.addSubInstruction(sub_88);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B8D10DC7E3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B8E68FE7E3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B8D10DC7E3A5B83735623136"), 3);		
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
			"A1E7B3E5B8E900E8E3A5B83735623136",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5B9033FA5E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_16 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_16);

	harvestContainer_16.addHarvestInstruction ("resp_content", dcVars[57], "\\?subscriberId=(.*?)&", 2, 2, 0, 0, false, "subscriberId_85", null, 0, false);
	harvestContainer_16.addHarvestInstruction ("resp_content", dcVars[58], "=1,a\\.applicationicid=(.*?)1,a\\.orderNumber=", 1, 1, 0, 0, false, "1,a.applicationicid", null, 0, false);
	harvestContainer_16.addHarvestInstruction ("resp_content", dcVars[59], "=1115,e\\.subscriberid=(.*?),", 1, 1, 0, 0, false, "1115,e.subscriberid", null, 0, false);
	IDataSub subContainer_34 = new DataSub();
	reqAction.addDataSub(subContainer_34);

		ISubRule sub_89 = new SubRule("req_uri", 8, 10, true, (IDCCoreVar)dcVars[53], false, "app-_2", null, 0, false);
	subContainer_34.addSubInstruction(sub_89);
		ISubRule sub_90 = new SubRule("req_hdr_Referer_1", 0, 29, false, (IDCCoreVar)dcVars[49], false, "Referer_82", null, 0, false);
	subContainer_34.addSubInstruction(sub_90);
		ISubRule sub_91 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_286", null, 0, false);
	subContainer_34.addSubInstruction(sub_91);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B8D10DC7E3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B8D10DC7E3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B8E900E5E3A5B83735623136"), 3);		
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
			"A1E7B3E5B9033FA8E3A5B83735623136",
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
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
private HTTPPage page_9(final IContainer parent) {
			HTTPThink think = new HTTPThink(20, 1000, parent, parent, "A1E7B3E5B932DB18E3A5B83735623136");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "ER_TC3_FFC_APIS_Incontrol_LandingPage", "A1E7B3E5B932DB18E3A5B83735623136") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(6, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_29(this, true, "A1E7B3E5B8E900D7E3A5B83735623136", false, true,
						"Config_1", "www.scvisibility.com:443/?_=1508317596893",	"/?_=1508317596893", true, false), 0, "null", 3);
				httpParallel.addRequest(1, request_30(this, false, "A1E7B3E5B9033F97E3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/usernameEnv",	"/usernameEnv", true, false), 1, "A1E7B3E5B932DB1CE3A5B83735623136", 3);
				httpParallel.addRequest(1, request_31(this, false, "A1E7B3E5B9033F97E3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/ffc/api/userProfile/profileByEmail",	"/ffc/api/userProfile/profileByEmail", true, false), 0, "null", 3);
				httpParallel.addRequest(1, request_32(this, false, "A1E7B3E5B9033F97E3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/ffc/api/authorization/rolesAndPermissions?subscriberId=1",	"/ffc/api/authorization/rolesAndPermissions?subscriberId=1", true, false), 0, "null", 3);
				httpParallel.addRequest(1, request_33(this, false, "A1E7B3E5B9033F97E3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/api/translation?$http=%7B%7D&key=en-gb",	"/api/translation?$http=%7B%7D&key=en-gb", true, false), 0, "null", 3);
				httpParallel.addRequest(2, request_34(this, false, "A1E7B3E5B8E68FD9E3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/api/tooltip?$http=%7B%7D&key=en-gb",	"/api/tooltip?$http=%7B%7D&key=en-gb", true, false), 0, "A1E7B3E5B932DB1CE3A5B83735623136", 3);
				httpParallel.addRequest(0, request_35(this, false, "A1E7B3E5B8E900D7E3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/api/error?$http=%7B%7D&key=en-gb",	"/api/error?$http=%7B%7D&key=en-gb", true, false), 0, "null", 3);
				httpParallel.addRequest(3, request_36(this, false, "A1E7B3E5B8D10CFCE3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/api/config",	"/api/config", true, false), 9, "A1E7B3E5B932DB1CE3A5B83735623136", 3);
				httpParallel.addRequest(3, request_37(this, false, "A1E7B3E5B8D10CFCE3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/images/Message_Inactive.svg",	"/images/Message_Inactive.svg", true, false), 0, "null", 3);
				httpParallel.addRequest(1, request_38(this, false, "A1E7B3E5B9033F97E3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/images/filter_Inactive.svg",	"/images/filter_Inactive.svg", true, false), 0, "null", 3);
				httpParallel.addRequest(2, request_39(this, false, "A1E7B3E5B8E68FD9E3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/images/Alerts_Inactive.svg",	"/images/Alerts_Inactive.svg", true, false), 0, "null", 3);
				httpParallel.addRequest(0, request_40(this, false, "A1E7B3E5B8E900D7E3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/ffc/api/authorization/heirarchyFiltersAsCogs?userId=353&subscriberId=1&date=1508317599.827",	"/ffc/api/authorization/heirarchyFiltersAsCogs?userId=353&subscriberId=1&date=1508317599.827", true, false), 0, "null", 3);
				httpParallel.addRequest(3, request_41(this, false, "A1E7B3E5B8D10CFCE3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/images/Default_Avatar.svg",	"/images/Default_Avatar.svg", true, false), 0, "null", 3);
				httpParallel.addRequest(1, request_42(this, false, "A1E7B3E5B9033F97E3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/images/edit.svg",	"/images/edit.svg", true, false), 0, "null", 3);
				httpParallel.addRequest(2, request_43(this, false, "A1E7B3E5B8E68FD9E3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/images/Attachment_InThread.svg",	"/images/Attachment_InThread.svg", true, false), 0, "null", 3);
				httpParallel.addRequest(1, request_44(this, false, "A1E7B3E5B9033F97E3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/images/x.svg",	"/images/x.svg", true, false), 0, "null", 3);
				httpParallel.addRequest(2, request_45(this, false, "A1E7B3E5B8E68FD9E3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/images/MyStories_grey.svg",	"/images/MyStories_grey.svg", true, false), 0, "null", 3);
				httpParallel.addRequest(3, request_46(this, false, "A1E7B3E5B8D10CFCE3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/images/Home_grey.svg",	"/images/Home_grey.svg", true, false), 0, "null", 3);
				httpParallel.addRequest(1, request_47(this, false, "A1E7B3E5B9033F97E3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/images/User_grey.svg",	"/images/User_grey.svg", true, false), 0, "null", 3);
				httpParallel.addRequest(3, request_48(this, false, "A1E7B3E5B8D10CFCE3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/fonts/Titillium_Web/TitilliumWeb-SemiBold.ttf",	"/fonts/Titillium_Web/TitilliumWeb-SemiBold.ttf", true, false), 0, "null", 3);
				httpParallel.addRequest(3, request_49(this, false, "A1E7B3E5B8D10CFCE3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/ffc/api/authorization/heirarchyFilters?subscriberId=1&userId=353&date=1508317601.831",	"/ffc/api/authorization/heirarchyFilters?subscriberId=1&userId=353&date=1508317601.831", true, false), 0, "null", 3);
				httpParallel.addRequest(0, request_50(this, false, "A1E7B3E5B8E900D7E3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/ffc/api/authorization/applications?subscriberId=1&userId=353&date=1508317601.831",	"/ffc/api/authorization/applications?subscriberId=1&userId=353&date=1508317601.831", true, false), 0, "null", 3);
				httpParallel.addRequest(2, request_51(this, false, "A1E7B3E5B8E68FD9E3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/ffc/api/general/appNavigation?userId=353&subscriberId=1&date=1508317601.831",	"/ffc/api/general/appNavigation?userId=353&subscriberId=1&date=1508317601.831", true, false), 0, "null", 3);
				httpParallel.addRequest(4, request_52(this, false, "A1E7B3E5B97F2650E3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/ffc/api/groupAdmin/groupsAndMembers?userId=353&subscriberId=1&applicationId=10&date=1508317601.831",	"/ffc/api/groupAdmin/groupsAndMembers?userId=353&subscriberId=1&applicationId=10&date=1508317601.831", true, false), 9, "A1E7B3E5B932DB1CE3A5B83735623136", 3);
				httpParallel.addRequest(5, request_53(this, false, "A1E7B3E5B97F26F5E3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/collab/api/collaboration/toList?userId=353&date=1508317601.831",	"/collab/api/collaboration/toList?userId=353&date=1508317601.831", true, false), 0, "A1E7B3E5B932DB1CE3A5B83735623136", 3);
				httpParallel.addRequest(0, request_54(this, false, "A1E7B3E5B8E900D7E3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/ffc/api//story/storyNames?userId=353&subscriberId=1&applicationId=10&date=1508317601.831",	"/ffc/api//story/storyNames?userId=353&subscriberId=1&applicationId=10&date=1508317601.831", true, false), 0, "null", 3);
				httpParallel.addRequest(3, request_55(this, false, "A1E7B3E5B8D10CFCE3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/ffc/api//story/stories?userId=353&subscriberId=1&applicationId=10&date=1508317601.86",	"/ffc/api//story/stories?userId=353&subscriberId=1&applicationId=10&date=1508317601.86", true, false), 0, "null", 3);
				httpParallel.addRequest(3, request_56(this, false, "A1E7B3E5B8D10CFCE3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/images/edit.svg",	"/images/edit.svg", true, false), 0, "null", 3);
				httpParallel.addRequest(2, request_57(this, false, "A1E7B3E5B8E68FD9E3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/images/Widget_Library.svg",	"/images/Widget_Library.svg", true, false), 0, "null", 3);
				httpParallel.addRequest(5, request_58(this, false, "A1E7B3E5B97F26F5E3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/images/Sprint-Zero-Zoom-Out.svg",	"/images/Sprint-Zero-Zoom-Out.svg", true, false), 0, "null", 3);
				httpParallel.addRequest(3, request_59(this, false, "A1E7B3E5B8D10CFCE3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/images/Sprint-Zero-Zoom-In.svg",	"/images/Sprint-Zero-Zoom-In.svg", true, false), 0, "null", 3);
				httpParallel.addRequest(2, request_60(this, false, "A1E7B3E5B8E68FD9E3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/images/export.svg",	"/images/export.svg", true, false), 0, "null", 3);
				httpParallel.addRequest(3, request_61(this, false, "A1E7B3E5B8D10CFCE3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/ffc/api/general/appNavigation?userId=353&subscriberId=1&date=1508317601.831",	"/ffc/api/general/appNavigation?userId=353&subscriberId=1&date=1508317601.831", true, false), 0, "null", 3);
				httpParallel.addRequest(2, request_62(this, false, "A1E7B3E5B8E68FD9E3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/ffc/api/authorization/heirarchyFilters?subscriberId=1&userId=353&hierarchyBranchId=99&date=1508317602.204",	"/ffc/api/authorization/heirarchyFilters?subscriberId=1&userId=353&hierarchyBranchId=99&date=1508317602.204", true, false), 0, "null", 3);
				httpParallel.addRequest(4, request_63(this, false, "A1E7B3E5B97F2650E3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/ffc/api/authorization/hierarchyCustomers?userId=353&subscriberId=1&hierarchyBranchId=99&date=1508317602.204",	"/ffc/api/authorization/hierarchyCustomers?userId=353&subscriberId=1&hierarchyBranchId=99&date=1508317602.204", true, false), 0, "null", 3);
				httpParallel.addRequest(5, request_64(this, false, "A1E7B3E5B97F26F5E3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/ffc/api/authorization/heirarchyFilters?subscriberId=1&userId=353&hierarchyBranchId=97&date=1508317602.204",	"/ffc/api/authorization/heirarchyFilters?subscriberId=1&userId=353&hierarchyBranchId=97&date=1508317602.204", true, false), 0, "null", 3);
				httpParallel.addRequest(3, request_65(this, false, "A1E7B3E5B8D10CFCE3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/images/stories.svg",	"/images/stories.svg", true, false), 0, "null", 3);
				httpParallel.addRequest(1, request_66(this, false, "A1E7B3E5B9033F97E3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/images/NO_IMAGE_AVAILABLE.gif",	"/images/NO_IMAGE_AVAILABLE.gif", true, false), 0, "null", 3);
				httpParallel.addRequest(3, request_67(this, false, "A1E7B3E5B8D10CFCE3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/fonts/Roboto/Roboto-Regular.ttf",	"/fonts/Roboto/Roboto-Regular.ttf", true, false), 0, "null", 3);
				httpParallel.addRequest(5, request_68(this, false, "A1E7B3E5B97F26F5E3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/fonts/Titillium_Web/TitilliumWeb-Regular.ttf",	"/fonts/Titillium_Web/TitilliumWeb-Regular.ttf", true, false), 0, "null", 3);
				httpParallel.addRequest(1, request_69(this, false, "A1E7B3E5B9033F97E3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/fonts/Roboto/Roboto-Medium.ttf",	"/fonts/Roboto/Roboto-Medium.ttf", true, false), 0, "null", 3);
				httpParallel.addRequest(1, request_70(this, false, "A1E7B3E5B9033F97E3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/fonts/glyphicons-halflings-regular.woff2",	"/fonts/glyphicons-halflings-regular.woff2", true, false), 0, "null", 3);
				httpParallel.addRequest(3, request_71(this, false, "A1E7B3E5B8D10CFCE3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/fonts/fontawesome-webfont.woff2?v=4.7.0",	"/fonts/fontawesome-webfont.woff2?v=4.7.0", true, false), 0, "null", 3);
				httpParallel.addRequest(5, request_72(this, false, "A1E7B3E5B97F26F5E3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/fonts/Titillium_Web/TitilliumWeb-Regular.woff2",	"/fonts/Titillium_Web/TitilliumWeb-Regular.woff2", true, false), 0, "null", 3);
				httpParallel.addRequest(1, request_73(this, false, "A1E7B3E5B9033F97E3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/fonts/Titillium_Web/TitilliumWeb-Bold.ttf",	"/fonts/Titillium_Web/TitilliumWeb-Bold.ttf", true, false), 0, "null", 3);
				httpParallel.addRequest(3, request_74(this, false, "A1E7B3E5B8D10CFCE3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/fonts/Roboto/Roboto-Regular.woff2",	"/fonts/Roboto/Roboto-Regular.woff2", true, false), 0, "null", 3);
				httpParallel.addRequest(5, request_75(this, false, "A1E7B3E5B97F26F5E3A5B83735623136", true, false,
						"Config_1", "www.scvisibility.com:443/fonts/Roboto/Roboto-Bold.woff2",	"/fonts/Roboto/Roboto-Bold.woff2", true, false), 0, "null", 3);
				httpParallel.addRequest(1, request_76(this, false, "A1E7B3E5B9033F97E3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/fonts/Titillium_Web/TitilliumWeb-ExtraLight.woff2",	"/fonts/Titillium_Web/TitilliumWeb-ExtraLight.woff2", true, false), 0, "null", 3);
				httpParallel.addRequest(3, request_77(this, false, "A1E7B3E5B8D10CFCE3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/fonts/Titillium_Web/TitilliumWeb-Light.woff2",	"/fonts/Titillium_Web/TitilliumWeb-Light.woff2", true, false), 0, "null", 3);
				httpParallel.addRequest(1, request_78(this, false, "A1E7B3E5B9033F97E3A5B83735623136", true, false,
						"Config_1", "www.scvisibility.com:443/fonts/Roboto/Roboto-Light.ttf",	"/fonts/Roboto/Roboto-Light.ttf", true, false), 0, "null", 3);
				httpParallel.addRequest(3, request_79(this, false, "A1E7B3E5B8D10CFCE3A5B83735623136", true, false,
						"Config_1", "www.scvisibility.com:443/fonts/Roboto/Roboto-Medium.woff2",	"/fonts/Roboto/Roboto-Medium.woff2", true, false), 0, "null", 3);
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5B932DB1CE3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("X-Requested-With", "XMLHttpRequest", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_35 = new DataSub();
	reqAction.addDataSub(subContainer_35);

		ISubRule sub_92 = new SubRule("req_hdr_Referer_1", 0, 29, false, (IDCCoreVar)dcVars[49], false, "Referer_81", null, 0, false);
	subContainer_35.addSubInstruction(sub_92);
		ISubRule sub_93 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_285", null, 0, false);
	subContainer_35.addSubInstruction(sub_93);
	


		
				
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
			"A1E7B3E5B932DB1FE3A5B83735623136",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5B932DBC0E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_17 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_17);

	harvestContainer_17.addHarvestInstruction ("resp_content", dcVars[60], "\"user\":\"(.*?)\"", 1, 1, 0, 0, false, "User_email", null, 0, false);
	IDataSub subContainer_36 = new DataSub();
	reqAction.addDataSub(subContainer_36);

		ISubRule sub_94 = new SubRule("req_hdr_Referer_1", 0, 29, false, (IDCCoreVar)dcVars[49], false, "Referer_80", null, 0, false);
	subContainer_36.addSubInstruction(sub_94);
		ISubRule sub_95 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_284", null, 0, false);
	subContainer_36.addSubInstruction(sub_95);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B932DB1CE3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B932DB1CE3A5B83735623136"), 3);		
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
			"A1E7B3E5B932DBC3E3A5B83735623136",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5B932DCF2E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "45", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "application/json", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_7(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_18 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_18);

	harvestContainer_18.addHarvestInstruction ("resp_content", dcVars[61], "\"userId\":(.*?),", 1, 1, 0, 0, false, "User_profile", null, 0, false);
	harvestContainer_18.addHarvestInstruction ("resp_content", dcVars[62], "\"username\":\"(.*?)\"", 1, 1, 0, 0, false, "User_name", null, 0, false);
	IDataSub subContainer_38 = new DataSub();
	reqAction.addDataSub(subContainer_38);

		ISubRule sub_97 = new SubRule("req_hdr_Referer_1", 0, 29, false, (IDCCoreVar)dcVars[49], false, "Referer_78", null, 0, false);
	subContainer_38.addSubInstruction(sub_97);
		ISubRule sub_98 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_282", null, 0, false);
	subContainer_38.addSubInstruction(sub_98);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B932DC57E3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B932DB1CE3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B932DBC0E3A5B83735623136"), 3);		
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
			"A1E7B3E5B932DCF5E3A5B83735623136",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
				SubstitutableHTTPContentVP localContentVp_7 = new SubstitutableHTTPContentVP(1, true, null, 0, reqAction);
	
			localContentVp_7.addConstContentElement(contVPElem_6);
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
strBuf_3.append("{\"data\":{\"emailId\":\"IDSE_User137@jabil.com\"}}");
String requestData_7 = strBuf_3.toString();
			
	HTTPPostDataChunk pdc_6 = new HTTPPostDataChunk("A1E7B3E5B932DD36E3A5B83735623136", postData, requestData_7, "UTF-8", 22, 42);
	postData.addDataChunk(pdc_6);

	IDataSub subContainer_37 = new DataSub();
	pdc_6.addDataSub(subContainer_37);

		ISubRule sub_96 = new SubRule("req_content", 20, 22, false, (IDCCoreVar)dcVars[60], false, "emailId", null, 0, false);
	subContainer_37.addSubInstruction(sub_96);
	



	}

	public HTTPAction request_32(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5B932DE38E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "46", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "application/json", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_8(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_40 = new DataSub();
	reqAction.addDataSub(subContainer_40);

		ISubRule sub_100 = new SubRule("req_uri", 56, 1, true, (IDCCoreVar)dcVars[57], false, "subscriberId", null, 0, false);
	subContainer_40.addSubInstruction(sub_100);
		ISubRule sub_101 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_280", null, 0, false);
	subContainer_40.addSubInstruction(sub_101);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B932DCF2E3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B932DB1CE3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B932DD9DE3A5B83735623136"), 3);		
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
			"A1E7B3E5B932DE3BE3A5B83735623136",
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
strBuf_4.append("{\"data\":{\"userName\":\"IDSE_User137@jabil.com\"}}");
String requestData_8 = strBuf_4.toString();
			
	HTTPPostDataChunk pdc_7 = new HTTPPostDataChunk("A1E7B3E5B932DE7CE3A5B83735623136", postData, requestData_8, "UTF-8", 22, 43);
	postData.addDataChunk(pdc_7);

	IDataSub subContainer_39 = new DataSub();
	pdc_7.addDataSub(subContainer_39);

		ISubRule sub_99 = new SubRule("req_content", 21, 22, false, (IDCCoreVar)dcVars[62], false, "userName", null, 0, false);
	subContainer_39.addSubInstruction(sub_99);
	



	}

	public HTTPAction request_33(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5B93C7800E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/plain, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_41 = new DataSub();
	reqAction.addDataSub(subContainer_41);

		ISubRule sub_102 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_279", null, 0, false);
	subContainer_41.addSubInstruction(sub_102);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B932DE38E3A5B83735623136"), 3);		
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
			"A1E7B3E5B93C7803E3A5B83735623136",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5B93EC1F2E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/plain, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_42 = new DataSub();
	reqAction.addDataSub(subContainer_42);

		ISubRule sub_103 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_278", null, 0, false);
	subContainer_42.addSubInstruction(sub_103);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B93C7800E3A5B83735623136"), 3);		
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
			"A1E7B3E5B93EC1F5E3A5B83735623136",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5B93EC289E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/plain, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_43 = new DataSub();
	reqAction.addDataSub(subContainer_43);

		ISubRule sub_104 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_277", null, 0, false);
	subContainer_43.addSubInstruction(sub_104);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B93EC1F2E3A5B83735623136"), 3);		
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
			"A1E7B3E5B93EC28CE3A5B83735623136",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5B94132F0E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/plain, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_44 = new DataSub();
	reqAction.addDataSub(subContainer_44);

		ISubRule sub_105 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_276", null, 0, false);
	subContainer_44.addSubInstruction(sub_105);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B93EC289E3A5B83735623136"), 3);		
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
			"A1E7B3E5B94132F3E3A5B83735623136",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5B9485EE0E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,image/apng,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/styles/app-725ee845ec.css", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_45 = new DataSub();
	reqAction.addDataSub(subContainer_45);

		ISubRule sub_106 = new SubRule("req_hdr_Referer_1", 0, 54, false, (IDCCoreVar)dcVars[55], false, "Referer_68", null, 0, false);
	subContainer_45.addSubInstruction(sub_106);
		ISubRule sub_107 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_272", null, 0, false);
	subContainer_45.addSubInstruction(sub_107);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B945EDE0E3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B932DB1CE3A5B83735623136"), 3);		
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
			"A1E7B3E5B9485EE3E3A5B83735623136",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5B94D19D0E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,image/apng,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/styles/app-725ee845ec.css", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_46 = new DataSub();
	reqAction.addDataSub(subContainer_46);

		ISubRule sub_108 = new SubRule("req_hdr_Referer_1", 0, 54, false, (IDCCoreVar)dcVars[55], false, "Referer_67", null, 0, false);
	subContainer_46.addSubInstruction(sub_108);
		ISubRule sub_109 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_271", null, 0, false);
	subContainer_46.addSubInstruction(sub_109);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B9485EE0E3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B932DB1CE3A5B83735623136"), 3);		
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
			"A1E7B3E5B94D19D3E3A5B83735623136",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5B94F8AD0E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,image/apng,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/styles/app-725ee845ec.css", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_47 = new DataSub();
	reqAction.addDataSub(subContainer_47);

		ISubRule sub_110 = new SubRule("req_hdr_Referer_1", 0, 54, false, (IDCCoreVar)dcVars[55], false, "Referer_66", null, 0, false);
	subContainer_47.addSubInstruction(sub_110);
		ISubRule sub_111 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_270", null, 0, false);
	subContainer_47.addSubInstruction(sub_111);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B932DB1CE3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B94D19D0E3A5B83735623136"), 3);		
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
			"A1E7B3E5B94F8AD3E3A5B83735623136",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5B95B71B0E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/plain, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_48 = new DataSub();
	reqAction.addDataSub(subContainer_48);

		ISubRule sub_112 = new SubRule("req_uri", 70, 1, true, (IDCCoreVar)dcVars[57], false, "subscriberId", null, 0, false);
	subContainer_48.addSubInstruction(sub_112);
		ISubRule sub_113 = new SubRule("req_uri", 53, 3, true, (IDCCoreVar)dcVars[61], false, "userId", null, 0, false);
	subContainer_48.addSubInstruction(sub_113);
		ISubRule sub_114 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_269", null, 0, false);
	subContainer_48.addSubInstruction(sub_114);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B932DCF2E3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B932DB1CE3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B94F8AD0E3A5B83735623136"), 3);		
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
			"A1E7B3E5B95B71B3E3A5B83735623136",
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

	public HTTPAction request_41(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5B95DBBFBE3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,image/apng,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_49 = new DataSub();
	reqAction.addDataSub(subContainer_49);

		ISubRule sub_115 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_268", null, 0, false);
	subContainer_49.addSubInstruction(sub_115);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B95B71B0E3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B932DB1CE3A5B83735623136"), 3);		
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
			"A1E7B3E5B95DBBFEE3A5B83735623136",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5B95DBC96E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,image/apng,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_50 = new DataSub();
	reqAction.addDataSub(subContainer_50);

		ISubRule sub_116 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_267", null, 0, false);
	subContainer_50.addSubInstruction(sub_116);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B932DB1CE3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B95DBBFBE3A5B83735623136"), 3);		
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
			"A1E7B3E5B95DBC99E3A5B83735623136",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5B95DBD31E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,image/apng,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_51 = new DataSub();
	reqAction.addDataSub(subContainer_51);

		ISubRule sub_117 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_266", null, 0, false);
	subContainer_51.addSubInstruction(sub_117);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B932DB1CE3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B95DBC96E3A5B83735623136"), 3);		
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
			"A1E7B3E5B95DBD34E3A5B83735623136",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5B95DBDCCE3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,image/apng,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_52 = new DataSub();
	reqAction.addDataSub(subContainer_52);

		ISubRule sub_118 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_265", null, 0, false);
	subContainer_52.addSubInstruction(sub_118);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B95DBD31E3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B932DB1CE3A5B83735623136"), 3);		
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
			"A1E7B3E5B95DBDCFE3A5B83735623136",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5B95DBE67E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,image/apng,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/styles/app-725ee845ec.css", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_53 = new DataSub();
	reqAction.addDataSub(subContainer_53);

		ISubRule sub_119 = new SubRule("req_hdr_Referer_1", 0, 54, false, (IDCCoreVar)dcVars[55], false, "Referer_60", null, 0, false);
	subContainer_53.addSubInstruction(sub_119);
		ISubRule sub_120 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_264", null, 0, false);
	subContainer_53.addSubInstruction(sub_120);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B95DBDCCE3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B932DB1CE3A5B83735623136"), 3);		
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
			"A1E7B3E5B95DBE6AE3A5B83735623136",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5B9602CA0E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,image/apng,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/styles/app-725ee845ec.css", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_54 = new DataSub();
	reqAction.addDataSub(subContainer_54);

		ISubRule sub_121 = new SubRule("req_hdr_Referer_1", 0, 54, false, (IDCCoreVar)dcVars[55], false, "Referer_59", null, 0, false);
	subContainer_54.addSubInstruction(sub_121);
		ISubRule sub_122 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_263", null, 0, false);
	subContainer_54.addSubInstruction(sub_122);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B932DB1CE3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B95DBE67E3A5B83735623136"), 3);		
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
			"A1E7B3E5B9602CA3E3A5B83735623136",
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

	public HTTPAction request_47(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5B964E790E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,image/apng,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/styles/app-725ee845ec.css", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_55 = new DataSub();
	reqAction.addDataSub(subContainer_55);

		ISubRule sub_123 = new SubRule("req_hdr_Referer_1", 0, 54, false, (IDCCoreVar)dcVars[55], false, "Referer_58", null, 0, false);
	subContainer_55.addSubInstruction(sub_123);
		ISubRule sub_124 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_262", null, 0, false);
	subContainer_55.addSubInstruction(sub_124);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B932DB1CE3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B9602CA0E3A5B83735623136"), 3);		
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
			"A1E7B3E5B964E793E3A5B83735623136",
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

	public HTTPAction request_48(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5B964E961E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/styles/app-725ee845ec.css", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_56 = new DataSub();
	reqAction.addDataSub(subContainer_56);

		ISubRule sub_125 = new SubRule("req_hdr_Referer_1", 0, 54, false, (IDCCoreVar)dcVars[55], false, "Referer_55", null, 0, false);
	subContainer_56.addSubInstruction(sub_125);
		ISubRule sub_126 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_259", null, 0, false);
	subContainer_56.addSubInstruction(sub_126);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B932DB1CE3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B964E8C6E3A5B83735623136"), 3);		
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
			"A1E7B3E5B964E964E3A5B83735623136",
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

	public HTTPAction request_49(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5B96C1380E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/plain, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_57 = new DataSub();
	reqAction.addDataSub(subContainer_57);

		ISubRule sub_127 = new SubRule("req_uri", 62, 3, true, (IDCCoreVar)dcVars[61], false, "userId", null, 0, false);
	subContainer_57.addSubInstruction(sub_127);
		ISubRule sub_128 = new SubRule("req_uri", 53, 1, true, (IDCCoreVar)dcVars[57], false, "subscriberId", null, 0, false);
	subContainer_57.addSubInstruction(sub_128);
		ISubRule sub_129 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_258", null, 0, false);
	subContainer_57.addSubInstruction(sub_129);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B964E961E3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B932DCF2E3A5B83735623136"), 3);		
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
			"A1E7B3E5B96C1383E3A5B83735623136",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5B96C1417E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/plain, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_58 = new DataSub();
	reqAction.addDataSub(subContainer_58);

		ISubRule sub_130 = new SubRule("req_uri", 58, 3, true, (IDCCoreVar)dcVars[61], false, "userId", null, 0, false);
	subContainer_58.addSubInstruction(sub_130);
		ISubRule sub_131 = new SubRule("req_uri", 49, 1, true, (IDCCoreVar)dcVars[57], false, "subscriberId", null, 0, false);
	subContainer_58.addSubInstruction(sub_131);
		ISubRule sub_132 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_257", null, 0, false);
	subContainer_58.addSubInstruction(sub_132);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B932DCF2E3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B96C1380E3A5B83735623136"), 3);		
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
			"A1E7B3E5B96C141AE3A5B83735623136",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5B96E8480E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/plain, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_59 = new DataSub();
	reqAction.addDataSub(subContainer_59);

		ISubRule sub_133 = new SubRule("req_uri", 55, 1, true, (IDCCoreVar)dcVars[57], false, "subscriberId", null, 0, false);
	subContainer_59.addSubInstruction(sub_133);
		ISubRule sub_134 = new SubRule("req_uri", 38, 3, true, (IDCCoreVar)dcVars[61], false, "userId", null, 0, false);
	subContainer_59.addSubInstruction(sub_134);
		ISubRule sub_135 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_256", null, 0, false);
	subContainer_59.addSubInstruction(sub_135);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B932DCF2E3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B96C1417E3A5B83735623136"), 3);		
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
			"A1E7B3E5B96E8483E3A5B83735623136",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5B97F265EE3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/plain, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_60 = new DataSub();
	reqAction.addDataSub(subContainer_60);

		ISubRule sub_136 = new SubRule("req_uri", 61, 1, true, (IDCCoreVar)dcVars[57], false, "subscriberId", null, 0, false);
	subContainer_60.addSubInstruction(sub_136);
		ISubRule sub_137 = new SubRule("req_uri", 44, 3, true, (IDCCoreVar)dcVars[61], false, "userId", null, 0, false);
	subContainer_60.addSubInstruction(sub_137);
		ISubRule sub_138 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_254", null, 0, false);
	subContainer_60.addSubInstruction(sub_138);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B970CE70E3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B932DCF2E3A5B83735623136"), 3);		
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
			"A1E7B3E5B97F2661E3A5B83735623136",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5B97F279AE3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/plain, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_61 = new DataSub();
	reqAction.addDataSub(subContainer_61);

		ISubRule sub_139 = new SubRule("req_uri", 40, 3, true, (IDCCoreVar)dcVars[61], false, "userId", null, 0, false);
	subContainer_61.addSubInstruction(sub_139);
		ISubRule sub_140 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_252", null, 0, false);
	subContainer_61.addSubInstruction(sub_140);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B97F2703E3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B932DCF2E3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B932DB1CE3A5B83735623136"), 3);		
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
			"A1E7B3E5B97F279DE3A5B83735623136",
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

	public HTTPAction request_54(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5B98197B5E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/plain, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_62 = new DataSub();
	reqAction.addDataSub(subContainer_62);

		ISubRule sub_141 = new SubRule("req_uri", 51, 1, true, (IDCCoreVar)dcVars[57], false, "subscriberId", null, 0, false);
	subContainer_62.addSubInstruction(sub_141);
		ISubRule sub_142 = new SubRule("req_uri", 34, 3, true, (IDCCoreVar)dcVars[61], false, "userId", null, 0, false);
	subContainer_62.addSubInstruction(sub_142);
		ISubRule sub_143 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_251", null, 0, false);
	subContainer_62.addSubInstruction(sub_143);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B932DCF2E3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B97F279AE3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B932DB1CE3A5B83735623136"), 3);		
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
			"A1E7B3E5B98197B8E3A5B83735623136",
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

	public HTTPAction request_55(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5B981984CE3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/plain, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_63 = new DataSub();
	reqAction.addDataSub(subContainer_63);

		ISubRule sub_144 = new SubRule("req_uri", 48, 1, true, (IDCCoreVar)dcVars[57], false, "subscriberId", null, 0, false);
	subContainer_63.addSubInstruction(sub_144);
		ISubRule sub_145 = new SubRule("req_uri", 31, 3, true, (IDCCoreVar)dcVars[61], false, "userId", null, 0, false);
	subContainer_63.addSubInstruction(sub_145);
		ISubRule sub_146 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_250", null, 0, false);
	subContainer_63.addSubInstruction(sub_146);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B98197B5E3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B932DCF2E3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B932DB1CE3A5B83735623136"), 3);		
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
			"A1E7B3E5B981984FE3A5B83735623136",
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

	public HTTPAction request_56(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5B9FFEFA7E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,image/apng,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/styles/app-725ee845ec.css", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_64 = new DataSub();
	reqAction.addDataSub(subContainer_64);

		ISubRule sub_147 = new SubRule("req_hdr_Referer_1", 0, 54, false, (IDCCoreVar)dcVars[55], false, "Referer_42", null, 0, false);
	subContainer_64.addSubInstruction(sub_147);
		ISubRule sub_148 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_246", null, 0, false);
	subContainer_64.addSubInstruction(sub_148);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B9FFEF10E3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B932DB1CE3A5B83735623136"), 3);		
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
			"A1E7B3E5B9FFEFAAE3A5B83735623136",
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

	public HTTPAction request_57(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5B9FFF042E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,image/apng,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/styles/app-725ee845ec.css", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_65 = new DataSub();
	reqAction.addDataSub(subContainer_65);

		ISubRule sub_149 = new SubRule("req_hdr_Referer_1", 0, 54, false, (IDCCoreVar)dcVars[55], false, "Referer_41", null, 0, false);
	subContainer_65.addSubInstruction(sub_149);
		ISubRule sub_150 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_245", null, 0, false);
	subContainer_65.addSubInstruction(sub_150);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B9FFEFA7E3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B932DB1CE3A5B83735623136"), 3);		
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
			"A1E7B3E5B9FFF045E3A5B83735623136",
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

	public HTTPAction request_58(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5B9FFF0DDE3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,image/apng,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/styles/app-725ee845ec.css", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_66 = new DataSub();
	reqAction.addDataSub(subContainer_66);

		ISubRule sub_151 = new SubRule("req_hdr_Referer_1", 0, 54, false, (IDCCoreVar)dcVars[55], false, "Referer_40", null, 0, false);
	subContainer_66.addSubInstruction(sub_151);
		ISubRule sub_152 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_244", null, 0, false);
	subContainer_66.addSubInstruction(sub_152);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B9FFF042E3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B932DB1CE3A5B83735623136"), 3);		
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
			"A1E7B3E5B9FFF0E0E3A5B83735623136",
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

	public HTTPAction request_59(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5B9FFF178E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,image/apng,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/styles/app-725ee845ec.css", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_67 = new DataSub();
	reqAction.addDataSub(subContainer_67);

		ISubRule sub_153 = new SubRule("req_hdr_Referer_1", 0, 54, false, (IDCCoreVar)dcVars[55], false, "Referer_39", null, 0, false);
	subContainer_67.addSubInstruction(sub_153);
		ISubRule sub_154 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_243", null, 0, false);
	subContainer_67.addSubInstruction(sub_154);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B9FFF0DDE3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B932DB1CE3A5B83735623136"), 3);		
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
			"A1E7B3E5B9FFF17BE3A5B83735623136",
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

	public HTTPAction request_60(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5B9FFF213E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,image/apng,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/styles/app-725ee845ec.css", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_68 = new DataSub();
	reqAction.addDataSub(subContainer_68);

		ISubRule sub_155 = new SubRule("req_hdr_Referer_1", 0, 54, false, (IDCCoreVar)dcVars[55], false, "Referer_38", null, 0, false);
	subContainer_68.addSubInstruction(sub_155);
		ISubRule sub_156 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_242", null, 0, false);
	subContainer_68.addSubInstruction(sub_156);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B9FFF178E3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B932DB1CE3A5B83735623136"), 3);		
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
			"A1E7B3E5B9FFF216E3A5B83735623136",
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

	public HTTPAction request_61(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5B9FFF349E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/plain, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_69 = new DataSub();
	reqAction.addDataSub(subContainer_69);

		ISubRule sub_157 = new SubRule("req_uri", 55, 1, true, (IDCCoreVar)dcVars[57], false, "subscriberId", null, 0, false);
	subContainer_69.addSubInstruction(sub_157);
		ISubRule sub_158 = new SubRule("req_uri", 38, 3, true, (IDCCoreVar)dcVars[61], false, "userId", null, 0, false);
	subContainer_69.addSubInstruction(sub_158);
		ISubRule sub_159 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_240", null, 0, false);
	subContainer_69.addSubInstruction(sub_159);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B9FFF2AEE3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B932DCF2E3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B932DB1CE3A5B83735623136"), 3);		
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
			"A1E7B3E5B9FFF34CE3A5B83735623136",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5BA026034E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/plain, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/maintab/myStories/home", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_70 = new DataSub();
	reqAction.addDataSub(subContainer_70);

		ISubRule sub_160 = new SubRule("req_uri", 62, 3, true, (IDCCoreVar)dcVars[61], false, "userId", null, 0, false);
	subContainer_70.addSubInstruction(sub_160);
		ISubRule sub_161 = new SubRule("req_uri", 53, 1, true, (IDCCoreVar)dcVars[57], false, "subscriberId", null, 0, false);
	subContainer_70.addSubInstruction(sub_161);
		ISubRule sub_162 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_239", null, 0, false);
	subContainer_70.addSubInstruction(sub_162);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B9FFF349E3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B932DCF2E3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B932DB1CE3A5B83735623136"), 3);		
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
			"A1E7B3E5BA026037E3A5B83735623136",
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

	public HTTPAction request_63(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5BA0260CBE3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/plain, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/maintab/myStories/home", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_71 = new DataSub();
	reqAction.addDataSub(subContainer_71);

		ISubRule sub_163 = new SubRule("req_uri", 66, 1, true, (IDCCoreVar)dcVars[57], false, "subscriberId", null, 0, false);
	subContainer_71.addSubInstruction(sub_163);
		ISubRule sub_164 = new SubRule("req_uri", 49, 3, true, (IDCCoreVar)dcVars[61], false, "userId", null, 0, false);
	subContainer_71.addSubInstruction(sub_164);
		ISubRule sub_165 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_238", null, 0, false);
	subContainer_71.addSubInstruction(sub_165);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BA026034E3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B932DCF2E3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B932DB1CE3A5B83735623136"), 3);		
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
			"A1E7B3E5BA0260CEE3A5B83735623136",
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

	public HTTPAction request_64(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5BA026162E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/plain, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/maintab/myStories/home", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_72 = new DataSub();
	reqAction.addDataSub(subContainer_72);

		ISubRule sub_166 = new SubRule("req_uri", 62, 3, true, (IDCCoreVar)dcVars[61], false, "userId", null, 0, false);
	subContainer_72.addSubInstruction(sub_166);
		ISubRule sub_167 = new SubRule("req_uri", 53, 1, true, (IDCCoreVar)dcVars[57], false, "subscriberId", null, 0, false);
	subContainer_72.addSubInstruction(sub_167);
		ISubRule sub_168 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_237", null, 0, false);
	subContainer_72.addSubInstruction(sub_168);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B932DCF2E3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B932DB1CE3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BA0260CBE3A5B83735623136"), 3);		
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
			"A1E7B3E5BA026165E3A5B83735623136",
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

	public HTTPAction request_65(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5BA450EBCE3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,image/apng,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/maintab/myStories/home", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_73 = new DataSub();
	reqAction.addDataSub(subContainer_73);

		ISubRule sub_169 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_177", null, 0, false);
	subContainer_73.addSubInstruction(sub_169);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B932DB1CE3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BA42C9B8E3A5B83735623136"), 3);		
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
			"A1E7B3E5BA450EBFE3A5B83735623136",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5BA450F57E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,image/apng,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/maintab/myStories/home", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_74 = new DataSub();
	reqAction.addDataSub(subContainer_74);

		ISubRule sub_170 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_176", null, 0, false);
	subContainer_74.addSubInstruction(sub_170);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B932DB1CE3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BA450EBCE3A5B83735623136"), 3);		
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
			"A1E7B3E5BA450F5AE3A5B83735623136",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("image/gif");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_67(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5BA451091E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/styles/app-725ee845ec.css", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_75 = new DataSub();
	reqAction.addDataSub(subContainer_75);

		ISubRule sub_171 = new SubRule("req_hdr_Referer_1", 0, 54, false, (IDCCoreVar)dcVars[55], false, "Referer_21", null, 0, false);
	subContainer_75.addSubInstruction(sub_171);
		ISubRule sub_172 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_174", null, 0, false);
	subContainer_75.addSubInstruction(sub_172);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B932DB1CE3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BA450FF2E3A5B83735623136"), 3);		
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
			"A1E7B3E5BA451094E3A5B83735623136",
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

	public HTTPAction request_68(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5BA477F67E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/styles/app-725ee845ec.css", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_76 = new DataSub();
	reqAction.addDataSub(subContainer_76);

		ISubRule sub_173 = new SubRule("req_hdr_Referer_1", 0, 54, false, (IDCCoreVar)dcVars[55], false, "Referer_20", null, 0, false);
	subContainer_76.addSubInstruction(sub_173);
		ISubRule sub_174 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_173", null, 0, false);
	subContainer_76.addSubInstruction(sub_174);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BA451091E3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B932DB1CE3A5B83735623136"), 3);		
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
			"A1E7B3E5BA477F6AE3A5B83735623136",
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

	public HTTPAction request_69(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5BA478006E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/styles/app-725ee845ec.css", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_77 = new DataSub();
	reqAction.addDataSub(subContainer_77);

		ISubRule sub_175 = new SubRule("req_hdr_Referer_1", 0, 54, false, (IDCCoreVar)dcVars[55], false, "Referer_19", null, 0, false);
	subContainer_77.addSubInstruction(sub_175);
		ISubRule sub_176 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_172", null, 0, false);
	subContainer_77.addSubInstruction(sub_176);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B932DB1CE3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BA477F67E3A5B83735623136"), 3);		
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
			"A1E7B3E5BA478009E3A5B83735623136",
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

	public HTTPAction request_70(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5BA49CC5EE3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/styles/lib-cb338763d9.css", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_78 = new DataSub();
	reqAction.addDataSub(subContainer_78);

		ISubRule sub_177 = new SubRule("req_hdr_Referer_1", 0, 54, false, (IDCCoreVar)dcVars[54], false, "Referer_18", null, 0, false);
	subContainer_78.addSubInstruction(sub_177);
		ISubRule sub_178 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_166", null, 0, false);
	subContainer_78.addSubInstruction(sub_178);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B932DB1CE3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BA49CBC3E3A5B83735623136"), 3);		
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
			"A1E7B3E5BA49CC61E3A5B83735623136",
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

	public HTTPAction request_71(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5BA49CCFDE3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/styles/app-725ee845ec.css", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_79 = new DataSub();
	reqAction.addDataSub(subContainer_79);

		ISubRule sub_179 = new SubRule("req_uri", 35, 5, true, (IDCCoreVar)dcVars[56], false, "v", null, 0, false);
	subContainer_79.addSubInstruction(sub_179);
		ISubRule sub_180 = new SubRule("req_hdr_Referer_1", 0, 54, false, (IDCCoreVar)dcVars[55], false, "Referer_17", null, 0, false);
	subContainer_79.addSubInstruction(sub_180);
		ISubRule sub_181 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_165", null, 0, false);
	subContainer_79.addSubInstruction(sub_181);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B932DB1CE3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BA49CC5EE3A5B83735623136"), 3);		
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
			"A1E7B3E5BA49CD00E3A5B83735623136",
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

	public HTTPAction request_72(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5BA4C3A57E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/styles/app-725ee845ec.css", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_80 = new DataSub();
	reqAction.addDataSub(subContainer_80);

		ISubRule sub_182 = new SubRule("req_hdr_Referer_1", 0, 54, false, (IDCCoreVar)dcVars[55], false, "Referer_16", null, 0, false);
	subContainer_80.addSubInstruction(sub_182);
		ISubRule sub_183 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_164", null, 0, false);
	subContainer_80.addSubInstruction(sub_183);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BA49CCFDE3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B932DB1CE3A5B83735623136"), 3);		
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
			"A1E7B3E5BA4C3A5AE3A5B83735623136",
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

	public HTTPAction request_73(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5BA4C3AF6E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/styles/app-725ee845ec.css", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_81 = new DataSub();
	reqAction.addDataSub(subContainer_81);

		ISubRule sub_184 = new SubRule("req_hdr_Referer_1", 0, 54, false, (IDCCoreVar)dcVars[55], false, "Referer_15", null, 0, false);
	subContainer_81.addSubInstruction(sub_184);
		ISubRule sub_185 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_163", null, 0, false);
	subContainer_81.addSubInstruction(sub_185);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BA4C3A57E3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B932DB1CE3A5B83735623136"), 3);		
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
			"A1E7B3E5BA4C3AF9E3A5B83735623136",
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

	public HTTPAction request_74(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5BA4C3B95E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/styles/app-725ee845ec.css", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_82 = new DataSub();
	reqAction.addDataSub(subContainer_82);

		ISubRule sub_186 = new SubRule("req_hdr_Referer_1", 0, 54, false, (IDCCoreVar)dcVars[55], false, "Referer_14", null, 0, false);
	subContainer_82.addSubInstruction(sub_186);
		ISubRule sub_187 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_162", null, 0, false);
	subContainer_82.addSubInstruction(sub_187);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BA4C3AF6E3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B932DB1CE3A5B83735623136"), 3);		
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
			"A1E7B3E5BA4C3B98E3A5B83735623136",
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5BA4C3C34E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/styles/app-725ee845ec.css", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_83 = new DataSub();
	reqAction.addDataSub(subContainer_83);

		ISubRule sub_188 = new SubRule("req_hdr_Referer_1", 0, 54, false, (IDCCoreVar)dcVars[55], false, "Referer_13", null, 0, false);
	subContainer_83.addSubInstruction(sub_188);
		ISubRule sub_189 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_161", null, 0, false);
	subContainer_83.addSubInstruction(sub_189);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BA4C3B95E3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B932DB1CE3A5B83735623136"), 3);		
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
			"A1E7B3E5BA4C3C37E3A5B83735623136",
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

	public HTTPAction request_76(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5BA4EAB57E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/styles/app-725ee845ec.css", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_84 = new DataSub();
	reqAction.addDataSub(subContainer_84);

		ISubRule sub_190 = new SubRule("req_hdr_Referer_1", 0, 54, false, (IDCCoreVar)dcVars[55], false, "Referer_12", null, 0, false);
	subContainer_84.addSubInstruction(sub_190);
		ISubRule sub_191 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_160", null, 0, false);
	subContainer_84.addSubInstruction(sub_191);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BA4C3C34E3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B932DB1CE3A5B83735623136"), 3);		
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
			"A1E7B3E5BA4EAB5AE3A5B83735623136",
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

	public HTTPAction request_77(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5BA4EABF6E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/styles/app-725ee845ec.css", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_85 = new DataSub();
	reqAction.addDataSub(subContainer_85);

		ISubRule sub_192 = new SubRule("req_hdr_Referer_1", 0, 54, false, (IDCCoreVar)dcVars[55], false, "Referer_11", null, 0, false);
	subContainer_85.addSubInstruction(sub_192);
		ISubRule sub_193 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_159", null, 0, false);
	subContainer_85.addSubInstruction(sub_193);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B932DB1CE3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BA4EAB57E3A5B83735623136"), 3);		
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
			"A1E7B3E5BA4EABF9E3A5B83735623136",
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

	public HTTPAction request_78(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5BA4EAC95E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/styles/app-725ee845ec.css", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_86 = new DataSub();
	reqAction.addDataSub(subContainer_86);

		ISubRule sub_194 = new SubRule("req_hdr_Referer_1", 0, 54, false, (IDCCoreVar)dcVars[55], false, "Referer_10", null, 0, false);
	subContainer_86.addSubInstruction(sub_194);
		ISubRule sub_195 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_158", null, 0, false);
	subContainer_86.addSubInstruction(sub_195);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B932DB1CE3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BA4EABF6E3A5B83735623136"), 3);		
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
			"A1E7B3E5BA4EAC98E3A5B83735623136",
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

	public HTTPAction request_79(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5BA4EAD34E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/styles/app-725ee845ec.css", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_87 = new DataSub();
	reqAction.addDataSub(subContainer_87);

		ISubRule sub_196 = new SubRule("req_hdr_Referer_1", 0, 54, false, (IDCCoreVar)dcVars[55], false, "Referer_9", null, 0, false);
	subContainer_87.addSubInstruction(sub_196);
		ISubRule sub_197 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_157", null, 0, false);
	subContainer_87.addSubInstruction(sub_197);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BA4EAC95E3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5B932DB1CE3A5B83735623136"), 3);		
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
			"A1E7B3E5BA4EAD37E3A5B83735623136",
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
	private For Loop_1(IContainer parent) {
		For forLoop = new For(parent,
				 "Loop1",
				 "A1E7B3F8B13150F0E3A5B83735623136",
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
	this.add(datapool_3(this));
	this.add(transaction_4(this));
	this.add(transaction_5(this));
	this.add(transaction_6(this));
	this.add(transaction_7(this));
	this.add(transaction_8(this));
	this.add(transaction_9(this));
	this.add(transaction_10(this));
	this.add(transaction_11(this));
	this.add(transaction_12(this));
	this.add(transaction_13(this));
	this.add(transaction_14(this));
			super.executeLoop();
		    }
		
		};
		return forLoop;
	}

	private ArmableTransaction transaction_4(final IContainer parent) {
		ArmableTransaction trx = new ArmableTransaction(parent, "Click_On_message_icon", "A1E7B3E5BA50F5E3E3A5B83735623136") {
		
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
			HTTPThink think = new HTTPThink(90, 1000, parent, parent, "A1E7B3E5BA50F72AE3A5B83735623136");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "ER_TC3_01_Click_on_Message_icon", "A1E7B3E5BA50F72AE3A5B83735623136") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(2, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_80(this, true, "A1E7B3E5BA50F5E6E3A5B83735623136", false, true,
						"Config_1", "www.scvisibility.com:443/collab/api/collaboration/messages?subscriberId=1&userEmail=353:IDSE_User137@jabil.com",	"/collab/api/collaboration/messages?subscriberId=1&userEmail=353:IDSE_User137@jabil.com", true, false), 0, "null", 3);
				httpParallel.addRequest(1, request_81(this, false, "A1E7B3E5BA50F7DDE3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/images/Message_Active.svg",	"/images/Message_Active.svg", true, false), 1, "A1E7B3E5BA50F72EE3A5B83735623136", 3);
				httpParallel.addRequest(0, request_82(this, false, "A1E7B3E5BA50F5E6E3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/images/Default_Avatar.svg",	"/images/Default_Avatar.svg", true, false), 0, "null", 3);
				httpParallel.addRequest(1, request_83(this, false, "A1E7B3E5BA50F7DDE3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/fonts/Roboto/Roboto-Bold.ttf",	"/fonts/Roboto/Roboto-Bold.ttf", true, false), 0, "null", 3);
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
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5BA50F72EE3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "92", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/plain, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("content-Type", "application/json;", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/maintab/myStories/home", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_9(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_89 = new DataSub();
	reqAction.addDataSub(subContainer_89);

		ISubRule sub_200 = new SubRule("req_uri", 64, 22, false, (IDCCoreVar)dcVars[1], false, "353_2", null, 0, false);
	subContainer_89.addSubInstruction(sub_200);
		ISubRule sub_201 = new SubRule("req_uri", 60, 3, true, (IDCCoreVar)dcVars[61], false, "userEmail_3", null, 0, false);
	subContainer_89.addSubInstruction(sub_201);
		ISubRule sub_202 = new SubRule("req_uri", 48, 1, true, (IDCCoreVar)dcVars[57], false, "subscriberId", null, 0, false);
	subContainer_89.addSubInstruction(sub_202);
		ISubRule sub_203 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_153", null, 0, false);
	subContainer_89.addSubInstruction(sub_203);
	


		
				
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
			"A1E7B3E5BA50F731E3A5B83735623136",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
				SubstitutableHTTPContentVP localContentVp_8 = new SubstitutableHTTPContentVP(1, true, null, 0, reqAction);
	
			localContentVp_8.addConstContentElement(contVPElem_7);
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
	private void postDataClass_9(HTTPPostData postData) {
				StringBuffer strBuf_5 = new StringBuffer();
strBuf_5.append("{\"data\":{\"userEmail\":\"353:IDSE_User137@jabil.com\",\"updateBef");
strBuf_5.append("oreDate\":\"\",\"showMore\":\"false\"}}");
String requestData_9 = strBuf_5.toString();
			
	HTTPPostDataChunk pdc_8 = new HTTPPostDataChunk("A1E7B3E5BA50F772E3A5B83735623136", postData, requestData_9, "UTF-8", 25, 48);
	postData.addDataChunk(pdc_8);

	IDataSub subContainer_88 = new DataSub();
	pdc_8.addDataSub(subContainer_88);

		ISubRule sub_198 = new SubRule("req_content", 26, 22, false, (IDCCoreVar)dcVars[1], false, "353", null, 0, false);
	subContainer_88.addSubInstruction(sub_198);
		ISubRule sub_199 = new SubRule("req_content", 22, 3, true, (IDCCoreVar)dcVars[61], false, "userEmail", null, 0, false);
	subContainer_88.addSubInstruction(sub_199);
	



	}

	public HTTPAction request_81(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5BA50F7EBE3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,image/apng,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/styles/app-725ee845ec.css", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_90 = new DataSub();
	reqAction.addDataSub(subContainer_90);

		ISubRule sub_204 = new SubRule("req_hdr_Referer_1", 0, 54, false, (IDCCoreVar)dcVars[55], false, "Referer_8", null, 0, false);
	subContainer_90.addSubInstruction(sub_204);
		ISubRule sub_205 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_152", null, 0, false);
	subContainer_90.addSubInstruction(sub_205);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BA50F72EE3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BA50F72EE3A5B83735623136"), 3);		
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
			"A1E7B3E5BA50F7EEE3A5B83735623136",
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

	public HTTPAction request_82(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5BA50F88EE3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,image/apng,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/maintab/myStories/home", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_91 = new DataSub();
	reqAction.addDataSub(subContainer_91);

		ISubRule sub_206 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_151", null, 0, false);
	subContainer_91.addSubInstruction(sub_206);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BA50F7EBE3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BA50F72EE3A5B83735623136"), 3);		
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
			"A1E7B3E5BA50F891E3A5B83735623136",
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

	public HTTPAction request_83(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5BA50F929E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/styles/app-725ee845ec.css", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_92 = new DataSub();
	reqAction.addDataSub(subContainer_92);

		ISubRule sub_207 = new SubRule("req_hdr_Referer_1", 0, 54, false, (IDCCoreVar)dcVars[55], false, "Referer_7", null, 0, false);
	subContainer_92.addSubInstruction(sub_207);
		ISubRule sub_208 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_150", null, 0, false);
	subContainer_92.addSubInstruction(sub_208);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BA50F88EE3A5B83735623136"), 3);		
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
			"A1E7B3E5BA50F92CE3A5B83735623136",
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

	private ArmableTransaction transaction_5(final IContainer parent) {
		ArmableTransaction trx = new ArmableTransaction(parent, "Click_on_create_message", "A1E7B3E5BA55D7F3E3A5B83735623136") {
		
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
			HTTPThink think = new HTTPThink(90, 1000, parent, parent, "A1E7B3E5BA582130E3A5B83735623136");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "ER_TC3_02_Click_on_Create_Message_icon", "A1E7B3E5BA582130E3A5B83735623136") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(1, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_84(this, true, "A1E7B3E5B8E68FD9E3A5B83735623136", false, true,
						"Config_1", "www.scvisibility.com:443/collab/api/collaboration/newMessageCount?userId=353&date=1508317724.32",	"/collab/api/collaboration/newMessageCount?userId=353&date=1508317724.32", true, false), 0, "null", 3);
				httpParallel.addRequest(0, request_85(this, false, "A1E7B3E5B8E68FD9E3A5B83735623136", true, false,
						"Config_1", "www.scvisibility.com:443/events/api/platform/notification/alertUnreadCount?userId=353&subscriberId=1&applicationId=10&date=1508317725.162",	"/events/api/platform/notification/alertUnreadCount?userId=353&subscriberId=1&applicationId=10&date=1508317725.162", true, false), 0, "null", 3);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_84(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5BA582134E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/plain, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/maintab/myStories/home", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_93 = new DataSub();
	reqAction.addDataSub(subContainer_93);

		ISubRule sub_209 = new SubRule("req_uri", 49, 3, true, (IDCCoreVar)dcVars[61], false, "userId", null, 0, false);
	subContainer_93.addSubInstruction(sub_209);
		ISubRule sub_210 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_146", null, 0, false);
	subContainer_93.addSubInstruction(sub_210);
	


		
				
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
			"A1E7B3E5BA582137E3A5B83735623136",
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

	public HTTPAction request_85(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5BA5A9230E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/plain, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/maintab/myStories/home", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_94 = new DataSub();
	reqAction.addDataSub(subContainer_94);

		ISubRule sub_211 = new SubRule("req_uri", 75, 1, true, (IDCCoreVar)dcVars[57], false, "subscriberId", null, 0, false);
	subContainer_94.addSubInstruction(sub_211);
		ISubRule sub_212 = new SubRule("req_uri", 58, 3, true, (IDCCoreVar)dcVars[61], false, "userId", null, 0, false);
	subContainer_94.addSubInstruction(sub_212);
		ISubRule sub_213 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_145", null, 0, false);
	subContainer_94.addSubInstruction(sub_213);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BA582134E3A5B83735623136"), 3);		
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
			"A1E7B3E5BA5A9233E3A5B83735623136",
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

	private ArmableTransaction transaction_6(final IContainer parent) {
		ArmableTransaction trx = new ArmableTransaction(parent, "Click_On_Send", "A1E7B3E5BA9AF737E3A5B83735623136") {
		
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
			HTTPThink think = new HTTPThink(90, 1000, parent, parent, "A1E7B3E5BA9D4080E3A5B83735623136");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "ER_TC3_03_Click_On_Send", "A1E7B3E5BA9D4080E3A5B83735623136") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(1, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_86(this, true, "A1E7B3E5BA988590E3A5B83735623136", false, true,
						"Config_1", "www.scvisibility.com:443/ffc/api/file/fileUpload",	"/ffc/api/file/fileUpload", true, false), 0, "null", 3);
				httpParallel.addRequest(0, request_87(this, false, "A1E7B3E5BA988590E3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/collab/api/collaboration/createMessage?from=353:IDSE_User137@jabil.com",	"/collab/api/collaboration/createMessage?from=353:IDSE_User137@jabil.com", true, false), 0, "null", 3);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_86(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5BA9D4084E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "14010", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "application/json", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/maintab/myStories/home", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_10(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_96 = new DataSub();
	reqAction.addDataSub(subContainer_96);

		ISubRule sub_216 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_138", null, 0, false);
	subContainer_96.addSubInstruction(sub_216);
	


		
				
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
			"A1E7B3E5BA9D4087E3A5B83735623136",
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
	private void postDataClass_10(HTTPPostData postData) {
					String requestData_10 = MetaString.encode(ZipEntryProxy.asXMLFragment(
	                                   "A1E7B3ED5EAA2740E3A5B83735623136.testdata",
	                                   "A1E7B3E5BA9D40C8E3A5B83735623136",
	                                   14010));
			
	HTTPPostDataChunk pdc_9 = new HTTPPostDataChunk("A1E7B3E5BA9D40C8E3A5B83735623136", postData, requestData_10, "UTF-8", 6, 67);
	postData.addDataChunk(pdc_9);

	IDataSub subContainer_95 = new DataSub();
	pdc_9.addDataSub(subContainer_95);

		ISubRule sub_214 = new SubRule("req_content", 64, 3, true, (IDCCoreVar)dcVars[61], false, "updatedById", null, 0, false);
	subContainer_95.addSubInstruction(sub_214);
		ISubRule sub_215 = new SubRule("req_content", 27, 3, true, (IDCCoreVar)dcVars[61], false, "alert_", null, 0, false);
	subContainer_95.addSubInstruction(sub_215);
	



	}

	public HTTPAction request_87(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5BA9FB180E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "239", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/plain, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("content-Type", "application/json;", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/maintab/myStories/home", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_11(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_98 = new DataSub();
	reqAction.addDataSub(subContainer_98);

		ISubRule sub_224 = new SubRule("req_uri", 49, 22, false, (IDCCoreVar)dcVars[1], false, "353_3", null, 0, false);
	subContainer_98.addSubInstruction(sub_224);
		ISubRule sub_225 = new SubRule("req_uri", 45, 3, true, (IDCCoreVar)dcVars[61], false, "from", null, 0, false);
	subContainer_98.addSubInstruction(sub_225);
		ISubRule sub_226 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_137", null, 0, false);
	subContainer_98.addSubInstruction(sub_226);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BA9D4084E3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BA9D4084E3A5B83735623136"), 3);		
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
			"A1E7B3E5BA9FB183E3A5B83735623136",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
				SubstitutableHTTPContentVP localContentVp_9 = new SubstitutableHTTPContentVP(1, true, null, 0, reqAction);
	
			localContentVp_9.addConstContentElement(contVPElem_8);
	req.addVerificationPoint(localContentVp_9);

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_11(HTTPPostData postData) {
				StringBuffer strBuf_6 = new StringBuffer();
strBuf_6.append("{\"data\":{\"from\":\"353:IDSE_User137@jabil.com\",\"Message\":\"Perf");
strBuf_6.append("ormance_test~attachment~alert_353/Informational.jpg~/attachm");
strBuf_6.append("ent~\",\"Users\":[{\"key\":\"414\",\"value\":\"userfname136-userlname1");
strBuf_6.append("36\",\"email_addr\":\"IDSE_User136@jabil.com\",\"type\":\"user\"}]}}");
String requestData_11 = strBuf_6.toString();
			
	HTTPPostDataChunk pdc_10 = new HTTPPostDataChunk("A1E7B3E5BA9FB1C4E3A5B83735623136", postData, requestData_11, "UTF-8", 77, 220);
	postData.addDataChunk(pdc_10);

	IDataSub subContainer_97 = new DataSub();
	pdc_10.addDataSub(subContainer_97);

		ISubRule sub_217 = new SubRule("req_content", 198, 22, false, (IDCCoreVar)dcVars[5], false, "email_addr", null, 0, false);
	subContainer_97.addSubInstruction(sub_217);
		ISubRule sub_218 = new SubRule("req_content", 170, 12, true, (IDCCoreVar)dcVars[4], false, "userfname136-", null, 0, false);
	subContainer_97.addSubInstruction(sub_218);
		ISubRule sub_219 = new SubRule("req_content", 157, 12, true, (IDCCoreVar)dcVars[3], false, "value_7", null, 0, false);
	subContainer_97.addSubInstruction(sub_219);
		ISubRule sub_220 = new SubRule("req_content", 143, 3, true, (IDCCoreVar)dcVars[2], false, "key", null, 0, false);
	subContainer_97.addSubInstruction(sub_220);
		ISubRule sub_221 = new SubRule("req_content", 90, 3, true, (IDCCoreVar)dcVars[61], false, "Performance_test~attachment~alert_", null, 0, false);
	subContainer_97.addSubInstruction(sub_221);
		ISubRule sub_222 = new SubRule("req_content", 21, 22, false, (IDCCoreVar)dcVars[1], false, "353_4", null, 0, false);
	subContainer_97.addSubInstruction(sub_222);
		ISubRule sub_223 = new SubRule("req_content", 17, 3, true, (IDCCoreVar)dcVars[61], false, "from", null, 0, false);
	subContainer_97.addSubInstruction(sub_223);
	



	}

	private ArmableTransaction transaction_7(final IContainer parent) {
		ArmableTransaction trx = new ArmableTransaction(parent, "Click_On_clear_filter and apply ", "A1E7B3E5BAAE0A02E3A5B83735623136") {
		
		    public void execute() {     
		       	
	
	
	
	      
                	this.add(page_13(this));

		     
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

private HTTPPage page_13(final IContainer parent) {
			HTTPThink think = new HTTPThink(90, 1000, parent, parent, "A1E7B3E5BAB05350E3A5B83735623136");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "ER_TC3_04_Click_On_Global_filter&clear_filters", "A1E7B3E5BAB05350E3A5B83735623136") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(4, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_88(this, true, "A1E7B3E5BA988590E3A5B83735623136", false, true,
						"Config_1", "www.scvisibility.com:443/ffc/api/authorization/hierarchyCustomers?userId=353&subscriberId=1&hierarchyBranchId=99&date=1508317941.38",	"/ffc/api/authorization/hierarchyCustomers?userId=353&subscriberId=1&hierarchyBranchId=99&date=1508317941.38", true, false), 0, "null", 3);
				httpParallel.addRequest(0, request_89(this, false, "A1E7B3E5BA988590E3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/ffc/api/filter/apply?userId=353",	"/ffc/api/filter/apply?userId=353", true, false), 0, "null", 3);
				httpParallel.addRequest(0, request_90(this, false, "A1E7B3E5BA988590E3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/ffc/api/authorization/heirarchyFiltersAsCogs?userId=353&subscriberId=1&date=1508317953.293",	"/ffc/api/authorization/heirarchyFiltersAsCogs?userId=353&subscriberId=1&date=1508317953.293", true, false), 0, "null", 3);
				httpParallel.addRequest(1, request_91(this, false, "A1E7B3E5BAD678F0E3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/ffc/api/authorization/heirarchyFilters?subscriberId=1&userId=353&date=1508317953.293",	"/ffc/api/authorization/heirarchyFilters?subscriberId=1&userId=353&date=1508317953.293", true, false), 12554, "A1E7B3E5BAB05354E3A5B83735623136", 3);
				httpParallel.addRequest(1, request_92(this, false, "A1E7B3E5BAD678F0E3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/images/scd_expand.svg",	"/images/scd_expand.svg", true, false), 0, "null", 3);
				httpParallel.addRequest(1, request_93(this, false, "A1E7B3E5BAD678F0E3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/images/info.svg",	"/images/info.svg", true, false), 0, "null", 3);
				httpParallel.addRequest(2, request_94(this, false, "A1E7B3E5BB763BD7E3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/images/x.svg",	"/images/x.svg", true, false), 0, "A1E7B3E5BAB05354E3A5B83735623136", 3);
				httpParallel.addRequest(1, request_95(this, false, "A1E7B3E5BAD678F0E3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/images/export.svg",	"/images/export.svg", true, false), 0, "null", 3);
				httpParallel.addRequest(3, request_96(this, false, "A1E7B3E5BADDA4E0E3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/images/stories.svg",	"/images/stories.svg", true, false), 0, "A1E7B3E5BAB05354E3A5B83735623136", 3);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_88(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5BAB05354E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/plain, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/maintab/myStories/home", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_99 = new DataSub();
	reqAction.addDataSub(subContainer_99);

		ISubRule sub_227 = new SubRule("req_uri", 66, 1, true, (IDCCoreVar)dcVars[57], false, "subscriberId", null, 0, false);
	subContainer_99.addSubInstruction(sub_227);
		ISubRule sub_228 = new SubRule("req_uri", 49, 3, true, (IDCCoreVar)dcVars[61], false, "userId", null, 0, false);
	subContainer_99.addSubInstruction(sub_228);
		ISubRule sub_229 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_132", null, 0, false);
	subContainer_99.addSubInstruction(sub_229);
	


		
				
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
			"A1E7B3E5BAB05357E3A5B83735623136",
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

	public HTTPAction request_89(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5BAB2C450E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "121", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/plain, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "application/json;charset=UTF-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/maintab/myStories/home", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

		reqAction.setTimeoutDuration(4, 60000);		
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_12(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_100 = new DataSub();
	reqAction.addDataSub(subContainer_100);

		ISubRule sub_230 = new SubRule("req_uri", 29, 3, true, (IDCCoreVar)dcVars[61], false, "userId", null, 0, false);
	subContainer_100.addSubInstruction(sub_230);
		ISubRule sub_231 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_130", null, 0, false);
	subContainer_100.addSubInstruction(sub_231);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BAB053FBE3A5B83735623136"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"PUT",	// method
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
			"A1E7B3E5BAB2C453E3A5B83735623136",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
				SubstitutableHTTPContentVP localContentVp_10 = new SubstitutableHTTPContentVP(1, true, null, 0, reqAction);
	
			localContentVp_10.addConstContentElement(contVPElem_9);
	req.addVerificationPoint(localContentVp_10);

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_12(HTTPPostData postData) {
				StringBuffer strBuf_7 = new StringBuffer();
strBuf_7.append("{\"data\":[{\"type\":\"orghierarchyfilter\",\"key\":\"SUBSCRIBER\",\"id");
strBuf_7.append("\":\"99\"},{\"type\":\"geographyfilter\",\"key\":\"GLOBAL\",\"id\":\"97\"}]");
strBuf_7.append("}");
String requestData_12 = strBuf_7.toString();
			
	HTTPPostDataChunk pdc_11 = new HTTPPostDataChunk("A1E7B3E5BAB2C494E3A5B83735623136", postData, requestData_12, "UTF-8", 0, 0);
	postData.addDataChunk(pdc_11);

	}

	public HTTPAction request_90(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5BAC36620E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/plain, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/maintab/myStories/home", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_101 = new DataSub();
	reqAction.addDataSub(subContainer_101);

		ISubRule sub_232 = new SubRule("req_uri", 70, 1, true, (IDCCoreVar)dcVars[57], false, "subscriberId", null, 0, false);
	subContainer_101.addSubInstruction(sub_232);
		ISubRule sub_233 = new SubRule("req_uri", 53, 3, true, (IDCCoreVar)dcVars[61], false, "userId", null, 0, false);
	subContainer_101.addSubInstruction(sub_233);
		ISubRule sub_234 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_128", null, 0, false);
	subContainer_101.addSubInstruction(sub_234);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BAB9F040E3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BAB05354E3A5B83735623136"), 3);		
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
			"A1E7B3E5BAC36623E3A5B83735623136",
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

	public HTTPAction request_91(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5BAD678FEE3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/plain, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/maintab/myStories/home", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_102 = new DataSub();
	reqAction.addDataSub(subContainer_102);

		ISubRule sub_235 = new SubRule("req_uri", 62, 3, true, (IDCCoreVar)dcVars[61], false, "userId", null, 0, false);
	subContainer_102.addSubInstruction(sub_235);
		ISubRule sub_236 = new SubRule("req_uri", 53, 1, true, (IDCCoreVar)dcVars[57], false, "subscriberId", null, 0, false);
	subContainer_102.addSubInstruction(sub_236);
		ISubRule sub_237 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_127", null, 0, false);
	subContainer_102.addSubInstruction(sub_237);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BAC36620E3A5B83735623136"), 3);		
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
			"A1E7B3E5BAD67901E3A5B83735623136",
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

	public HTTPAction request_92(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5BB5E7170E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,image/apng,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/maintab/myStories/home", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_103 = new DataSub();
	reqAction.addDataSub(subContainer_103);

		ISubRule sub_238 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_104", null, 0, false);
	subContainer_103.addSubInstruction(sub_238);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BAB05354E3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BB5E70D5E3A5B83735623136"), 3);		
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
			"A1E7B3E5BB5E7173E3A5B83735623136",
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

	public HTTPAction request_93(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5BB60DFEBE3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,image/apng,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/maintab/myStories/home", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_104 = new DataSub();
	reqAction.addDataSub(subContainer_104);

		ISubRule sub_239 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_98", null, 0, false);
	subContainer_104.addSubInstruction(sub_239);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BAB05354E3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BB60DF40E3A5B83735623136"), 3);		
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
			"A1E7B3E5BB60DFEEE3A5B83735623136",
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

	public HTTPAction request_94(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5BB78ADD5E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,image/apng,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/maintab/myStories/home", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_105 = new DataSub();
	reqAction.addDataSub(subContainer_105);

		ISubRule sub_240 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_79", null, 0, false);
	subContainer_105.addSubInstruction(sub_240);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BB78AD3AE3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BAB05354E3A5B83735623136"), 3);		
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
			"A1E7B3E5BB78ADD8E3A5B83735623136",
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

	public HTTPAction request_95(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5BB78AE70E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,image/apng,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/maintab/myStories/home", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_106 = new DataSub();
	reqAction.addDataSub(subContainer_106);

		ISubRule sub_241 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_78", null, 0, false);
	subContainer_106.addSubInstruction(sub_241);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BAB05354E3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BB78ADD5E3A5B83735623136"), 3);		
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
			"A1E7B3E5BB78AE73E3A5B83735623136",
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

	public HTTPAction request_96(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5BB78AF0BE3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,image/apng,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/maintab/myStories/home", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_107 = new DataSub();
	reqAction.addDataSub(subContainer_107);

		ISubRule sub_242 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_77", null, 0, false);
	subContainer_107.addSubInstruction(sub_242);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BAB05354E3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BB78AE70E3A5B83735623136"), 3);		
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
			"A1E7B3E5BB78AF0EE3A5B83735623136",
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

	private ArmableTransaction transaction_8(final IContainer parent) {
		ArmableTransaction trx = new ArmableTransaction(parent, "Select_ER_from_dashboard", "A1E7B3E5BB7FD8E7E3A5B83735623136") {
		
		    public void execute() {     
		       	
	
	
	
	      
                	this.add(page_14(this));

		     
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

private HTTPPage page_14(final IContainer parent) {
			HTTPThink think = new HTTPThink(90, 1000, parent, parent, "A1E7B3E5BB7FD8EAE3A5B83735623136");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "ER_TC3_05_Select_ER_from_dashboard", "A1E7B3E5BB7FD8EAE3A5B83735623136") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(3, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_97(this, true, "A1E7B3E5BAD67A34E3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/fonts/Titillium_Web/TitilliumWeb-Light.ttf",	"/fonts/Titillium_Web/TitilliumWeb-Light.ttf", true, false), 0, "null", 3);
				httpParallel.addRequest(0, request_98(this, false, "A1E7B3E5BAD67A34E3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/images/close-btn.svg",	"/images/close-btn.svg", true, false), 0, "null", 3);
				httpParallel.addRequest(0, request_99(this, false, "A1E7B3E5BAD67A34E3A5B83735623136", false, true,
						"Config_1", "www.scvisibility.com:443/ffc/api/general/countries?date=1508318064.297&noOfRecords=100&pageIndex=0",	"/ffc/api/general/countries?date=1508318064.297&noOfRecords=100&pageIndex=0", true, false), 0, "null", 3);
				httpParallel.addRequest(1, request_100(this, false, "A1E7B3E5BB7B2176E3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/api/mapstyle",	"/api/mapstyle", true, false), 1, "A1E7B3E5BB907A20E3A5B83735623136", 3);
				httpParallel.addRequest(0, request_101(this, false, "A1E7B3E5BAD67A34E3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/gr/api/gr/world/get/alert?date=1508318064.31&applicationId=5&subscriberId=1&userId=353",	"/gr/api/gr/world/get/alert?date=1508318064.31&applicationId=5&subscriberId=1&userId=353", true, false), 0, "null", 3);
				httpParallel.addRequest(1, request_102(this, false, "A1E7B3E5BB7B2176E3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/gr/api/gr/world/get/alert/supplier?date=1508318064.31&applicationId=5&subscriberId=1&userId=353",	"/gr/api/gr/world/get/alert/supplier?date=1508318064.31&applicationId=5&subscriberId=1&userId=353", true, false), 0, "null", 3);
				httpParallel.addRequest(2, request_103(this, false, "A1E7B3E5BBCC23EDE3A5B83735623136", true, false,
						"Config_1", "www.scvisibility.com:443/gr/api/gr/world/get/alert/sites?date=1508318064.31&applicationId=5&subscriberId=1&userId=353",	"/gr/api/gr/world/get/alert/sites?date=1508318064.31&applicationId=5&subscriberId=1&userId=353", true, false), 482, "A1E7B3E5BB907A20E3A5B83735623136", 3);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_97(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5BB7FD8EEE3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "*/*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/styles/app-725ee845ec.css", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_108 = new DataSub();
	reqAction.addDataSub(subContainer_108);

		ISubRule sub_243 = new SubRule("req_hdr_Referer_1", 0, 54, false, (IDCCoreVar)dcVars[55], false, "Referer_5", null, 0, false);
	subContainer_108.addSubInstruction(sub_243);
		ISubRule sub_244 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_61", null, 0, false);
	subContainer_108.addSubInstruction(sub_244);
	


		
				
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
			"A1E7B3E5BB7FD8F1E3A5B83735623136",
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

	public HTTPAction request_98(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5BB8E3030E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,image/apng,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/styles/app-725ee845ec.css", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_109 = new DataSub();
	reqAction.addDataSub(subContainer_109);

		ISubRule sub_245 = new SubRule("req_hdr_Referer_1", 0, 54, false, (IDCCoreVar)dcVars[55], false, "Referer_4", null, 0, false);
	subContainer_109.addSubInstruction(sub_245);
		ISubRule sub_246 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_60", null, 0, false);
	subContainer_109.addSubInstruction(sub_246);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BB7FD8EEE3A5B83735623136"), 3);		
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
			"A1E7B3E5BB8E3033E3A5B83735623136",
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

	public HTTPAction request_99(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5BB907A20E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/plain, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/maintab/myStories/home", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_110 = new DataSub();
	reqAction.addDataSub(subContainer_110);

		ISubRule sub_247 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_58", null, 0, false);
	subContainer_110.addSubInstruction(sub_247);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BB8E30CBE3A5B83735623136"), 3);		
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
			"A1E7B3E5BB907A23E3A5B83735623136",
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

	public HTTPAction request_100(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5BBA14300E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/plain, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/maintab/myStories/home", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_111 = new DataSub();
	reqAction.addDataSub(subContainer_111);

		ISubRule sub_248 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_57", null, 0, false);
	subContainer_111.addSubInstruction(sub_248);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BB907A20E3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BB907A20E3A5B83735623136"), 3);		
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
			"A1E7B3E5BBA14303E3A5B83735623136",
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

	public HTTPAction request_101(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5BBC9B290E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/plain, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/maintab/myStories/home", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_112 = new DataSub();
	reqAction.addDataSub(subContainer_112);

		ISubRule sub_249 = new SubRule("req_uri", 84, 3, true, (IDCCoreVar)dcVars[61], false, "userId", null, 0, false);
	subContainer_112.addSubInstruction(sub_249);
		ISubRule sub_250 = new SubRule("req_uri", 75, 1, true, (IDCCoreVar)dcVars[57], false, "subscriberId", null, 0, false);
	subContainer_112.addSubInstruction(sub_250);
		ISubRule sub_251 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_56", null, 0, false);
	subContainer_112.addSubInstruction(sub_251);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BB907A20E3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BBA14300E3A5B83735623136"), 3);		
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
			"A1E7B3E5BBC9B293E3A5B83735623136",
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

	public HTTPAction request_102(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5BBC9B327E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/plain, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/maintab/myStories/home", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_113 = new DataSub();
	reqAction.addDataSub(subContainer_113);

		ISubRule sub_252 = new SubRule("req_uri", 93, 3, true, (IDCCoreVar)dcVars[61], false, "userId", null, 0, false);
	subContainer_113.addSubInstruction(sub_252);
		ISubRule sub_253 = new SubRule("req_uri", 84, 1, true, (IDCCoreVar)dcVars[57], false, "subscriberId", null, 0, false);
	subContainer_113.addSubInstruction(sub_253);
		ISubRule sub_254 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_55", null, 0, false);
	subContainer_113.addSubInstruction(sub_254);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BBC9B290E3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BB907A20E3A5B83735623136"), 3);		
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
			"A1E7B3E5BBC9B32AE3A5B83735623136",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
				SubstitutableHTTPContentVP localContentVp_11 = new SubstitutableHTTPContentVP(1, true, null, 0, reqAction);
	
			localContentVp_11.addConstContentElement(contVPElem_10);
	req.addVerificationPoint(localContentVp_11);

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_103(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5BBCC23FBE3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/plain, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/maintab/myStories/home", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_114 = new DataSub();
	reqAction.addDataSub(subContainer_114);

		ISubRule sub_255 = new SubRule("req_uri", 90, 3, true, (IDCCoreVar)dcVars[61], false, "userId", null, 0, false);
	subContainer_114.addSubInstruction(sub_255);
		ISubRule sub_256 = new SubRule("req_uri", 81, 1, true, (IDCCoreVar)dcVars[57], false, "subscriberId", null, 0, false);
	subContainer_114.addSubInstruction(sub_256);
		ISubRule sub_257 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_54", null, 0, false);
	subContainer_114.addSubInstruction(sub_257);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BBC9B327E3A5B83735623136"), 3);		
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
			"A1E7B3E5BBCC23FEE3A5B83735623136",
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

	private ArmableTransaction transaction_9(final IContainer parent) {
		ArmableTransaction trx = new ArmableTransaction(parent, "Click_On_Hierarchy_filter", "A1E7B3E5BBDF3660E3A5B83735623136") {
		
		    public void execute() {     
		       	
	
	
	
	      
                	this.add(page_15(this));

		     
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

private HTTPPage page_15(final IContainer parent) {
			HTTPThink think = new HTTPThink(90, 1000, parent, parent, "A1E7B3E5BBEB1DEDE3A5B83735623136");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "ER_TC3_06_Click_On_Global_filter", "A1E7B3E5BBEB1DEDE3A5B83735623136") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(2, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_104(this, true, "A1E7B3E5BBEB1D40E3A5B83735623136", false, true,
						"Config_1", "www.scvisibility.com:443/gr/api/gr/applicationfilter/get?userId=353&subscriberId=1&applicationId=5&key=commodity&date=1508318213.43",	"/gr/api/gr/applicationfilter/get?userId=353&subscriberId=1&applicationId=5&key=commodity&date=1508318213.43", true, false), 0, "null", 3);
				httpParallel.addRequest(1, request_105(this, false, "A1E7B3E5BBF4BAC7E3A5B83735623136", true, false,
						"Config_1", "www.scvisibility.com:443/gr/api/gr/applicationfilter/get?userId=353&subscriberId=1&applicationId=5&key=leadTime&date=1508318213.43",	"/gr/api/gr/applicationfilter/get?userId=353&subscriberId=1&applicationId=5&key=leadTime&date=1508318213.43", true, false), 1, "A1E7B3E5BBF4BA30E3A5B83735623136", 3);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_104(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5BBF4BA30E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/plain, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/maintab/mapview", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_115 = new DataSub();
	reqAction.addDataSub(subContainer_115);

		ISubRule sub_258 = new SubRule("req_uri", 57, 1, true, (IDCCoreVar)dcVars[57], false, "subscriberId", null, 0, false);
	subContainer_115.addSubInstruction(sub_258);
		ISubRule sub_259 = new SubRule("req_uri", 40, 3, true, (IDCCoreVar)dcVars[61], false, "userId", null, 0, false);
	subContainer_115.addSubInstruction(sub_259);
		ISubRule sub_260 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_41", null, 0, false);
	subContainer_115.addSubInstruction(sub_260);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BBEB1DF1E3A5B83735623136"), 3);		
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
			"A1E7B3E5BBF4BA33E3A5B83735623136",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
				SubstitutableHTTPContentVP localContentVp_12 = new SubstitutableHTTPContentVP(1, true, null, 0, reqAction);
	
			localContentVp_12.addConstContentElement(contVPElem_11);
	req.addVerificationPoint(localContentVp_12);

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_105(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5BBF4BAD5E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/plain, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/maintab/mapview", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_116 = new DataSub();
	reqAction.addDataSub(subContainer_116);

		ISubRule sub_261 = new SubRule("req_uri", 57, 1, true, (IDCCoreVar)dcVars[57], false, "subscriberId", null, 0, false);
	subContainer_116.addSubInstruction(sub_261);
		ISubRule sub_262 = new SubRule("req_uri", 40, 3, true, (IDCCoreVar)dcVars[61], false, "userId", null, 0, false);
	subContainer_116.addSubInstruction(sub_262);
		ISubRule sub_263 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_40", null, 0, false);
	subContainer_116.addSubInstruction(sub_263);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BBF4BA30E3A5B83735623136"), 3);		
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
			"A1E7B3E5BBF4BAD8E3A5B83735623136",
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

	private ArmableTransaction transaction_10(final IContainer parent) {
		ArmableTransaction trx = new ArmableTransaction(parent, "Select_Division", "A1E7B3E5BBF4BC0CE3A5B83735623136") {
		
		    public void execute() {     
		       	
	
	
	
	      
                	this.add(page_16(this));

		     
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

private HTTPPage page_16(final IContainer parent) {
			HTTPThink think = new HTTPThink(90, 1000, parent, parent, "A1E7B3E5BC00A110E3A5B83735623136");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "ER_TC3_07_Select_division", "A1E7B3E5BC00A110E3A5B83735623136") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(1, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_106(this, true, "A1E7B3E5BBFE3010E3A5B83735623136", false, true,
						"Config_1", "www.scvisibility.com:443/ffc/api/authorization/heirarchyFilters?subscriberId=1&userId=353&hierarchyBranchId=125&date=1508318273.696",	"/ffc/api/authorization/heirarchyFilters?subscriberId=1&userId=353&hierarchyBranchId=125&date=1508318273.696", true, false), 0, "null", 3);
				httpParallel.addRequest(0, request_107(this, false, "A1E7B3E5BBFE3010E3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/ffc/api/authorization/hierarchyCustomers?userId=353&subscriberId=1&hierarchyBranchId=125&date=1508318273.696",	"/ffc/api/authorization/hierarchyCustomers?userId=353&subscriberId=1&hierarchyBranchId=125&date=1508318273.696", true, false), 0, "null", 3);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_106(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5BC055C00E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/plain, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/maintab/mapview", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_117 = new DataSub();
	reqAction.addDataSub(subContainer_117);

		ISubRule sub_264 = new SubRule("req_uri", 84, 3, true, (IDCCoreVar)dcVars[6], false, "hierarchyBranchId", null, 0, false);
	subContainer_117.addSubInstruction(sub_264);
		ISubRule sub_265 = new SubRule("req_uri", 62, 3, true, (IDCCoreVar)dcVars[61], false, "userId", null, 0, false);
	subContainer_117.addSubInstruction(sub_265);
		ISubRule sub_266 = new SubRule("req_uri", 53, 1, true, (IDCCoreVar)dcVars[57], false, "subscriberId", null, 0, false);
	subContainer_117.addSubInstruction(sub_266);
		ISubRule sub_267 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_36", null, 0, false);
	subContainer_117.addSubInstruction(sub_267);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BC00A114E3A5B83735623136"), 3);		
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
			"A1E7B3E5BC055C03E3A5B83735623136",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
				SubstitutableHTTPContentVP localContentVp_13 = new SubstitutableHTTPContentVP(1, true, null, 0, reqAction);
	
			localContentVp_13.addConstContentElement(contVPElem_12);
	req.addVerificationPoint(localContentVp_13);

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_107(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5BC07CD00E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/plain, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/maintab/mapview", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_118 = new DataSub();
	reqAction.addDataSub(subContainer_118);

		ISubRule sub_268 = new SubRule("req_uri", 86, 3, true, (IDCCoreVar)dcVars[6], false, "hierarchyBranchId_2", null, 0, false);
	subContainer_118.addSubInstruction(sub_268);
		ISubRule sub_269 = new SubRule("req_uri", 66, 1, true, (IDCCoreVar)dcVars[57], false, "subscriberId", null, 0, false);
	subContainer_118.addSubInstruction(sub_269);
		ISubRule sub_270 = new SubRule("req_uri", 49, 3, true, (IDCCoreVar)dcVars[61], false, "userId", null, 0, false);
	subContainer_118.addSubInstruction(sub_270);
		ISubRule sub_271 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_35", null, 0, false);
	subContainer_118.addSubInstruction(sub_271);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BC055C00E3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BC055C00E3A5B83735623136"), 3);		
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
			"A1E7B3E5BC07CD03E3A5B83735623136",
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

	private ArmableTransaction transaction_11(final IContainer parent) {
		ArmableTransaction trx = new ArmableTransaction(parent, "Select_sector", "A1E7B3E5BC07CD97E3A5B83735623136") {
		
		    public void execute() {     
		       	
	
	
	
	      
                	this.add(page_17(this));

		     
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

private HTTPPage page_17(final IContainer parent) {
			HTTPThink think = new HTTPThink(90, 1000, parent, parent, "A1E7B3E5BC07CD9AE3A5B83735623136");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "ER_TC3_08_Select_Sector", "A1E7B3E5BC07CD9AE3A5B83735623136") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(1, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_108(this, true, "A1E7B3E5BBFE3010E3A5B83735623136", true, true,
						"Config_1", "www.scvisibility.com:443/ffc/api/authorization/hierarchyCustomers?userId=353&subscriberId=1&hierarchyBranchId=115&date=1508318297.5",	"/ffc/api/authorization/hierarchyCustomers?userId=353&subscriberId=1&hierarchyBranchId=115&date=1508318297.5", true, false), 0, "null", 3);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_108(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5BC0A16F0E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/plain, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/maintab/mapview", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_119 = new DataSub();
	reqAction.addDataSub(subContainer_119);

		ISubRule sub_272 = new SubRule("req_uri", 86, 3, true, (IDCCoreVar)dcVars[7], false, "hierarchyBranchId_3", null, 0, false);
	subContainer_119.addSubInstruction(sub_272);
		ISubRule sub_273 = new SubRule("req_uri", 66, 1, true, (IDCCoreVar)dcVars[57], false, "subscriberId", null, 0, false);
	subContainer_119.addSubInstruction(sub_273);
		ISubRule sub_274 = new SubRule("req_uri", 49, 3, true, (IDCCoreVar)dcVars[61], false, "userId", null, 0, false);
	subContainer_119.addSubInstruction(sub_274);
		ISubRule sub_275 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_33", null, 0, false);
	subContainer_119.addSubInstruction(sub_275);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BC07CD9EE3A5B83735623136"), 3);		
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
			"A1E7B3E5BC0A16F3E3A5B83735623136",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
				SubstitutableHTTPContentVP localContentVp_14 = new SubstitutableHTTPContentVP(1, true, null, 0, reqAction);
	
			localContentVp_14.addConstContentElement(contVPElem_13);
	req.addVerificationPoint(localContentVp_14);

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	private ArmableTransaction transaction_12(final IContainer parent) {
		ArmableTransaction trx = new ArmableTransaction(parent, "Select_region", "A1E7B3E5BC1AE06FE3A5B83735623136") {
		
		    public void execute() {     
		       	
	
	
	
	      
                	this.add(page_18(this));

		     
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

private HTTPPage page_18(final IContainer parent) {
			HTTPThink think = new HTTPThink(90, 1000, parent, parent, "A1E7B3E5BC1D29C0E3A5B83735623136");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "ER_TC3_09_Select_Region", "A1E7B3E5BC1D29C0E3A5B83735623136") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(1, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_109(this, true, "A1E7B3E5BC186ED0E3A5B83735623136", false, true,
						"Config_1", "www.scvisibility.com:443/ffc/api/authorization/heirarchyFilters?subscriberId=1&userId=353&hierarchyBranchId=7&date=1508318350.135",	"/ffc/api/authorization/heirarchyFilters?subscriberId=1&userId=353&hierarchyBranchId=7&date=1508318350.135", true, false), 0, "null", 3);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_109(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5BC1D29C4E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/plain, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/maintab/mapview", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_120 = new DataSub();
	reqAction.addDataSub(subContainer_120);

		ISubRule sub_276 = new SubRule("req_uri", 84, 1, true, (IDCCoreVar)dcVars[9], false, "hierarchyBranchId_4", null, 0, false);
	subContainer_120.addSubInstruction(sub_276);
		ISubRule sub_277 = new SubRule("req_uri", 62, 3, true, (IDCCoreVar)dcVars[61], false, "userId", null, 0, false);
	subContainer_120.addSubInstruction(sub_277);
		ISubRule sub_278 = new SubRule("req_uri", 53, 1, true, (IDCCoreVar)dcVars[57], false, "subscriberId", null, 0, false);
	subContainer_120.addSubInstruction(sub_278);
		ISubRule sub_279 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_30", null, 0, false);
	subContainer_120.addSubInstruction(sub_279);
	


		
				
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
			"A1E7B3E5BC1D29C7E3A5B83735623136",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
				SubstitutableHTTPContentVP localContentVp_15 = new SubstitutableHTTPContentVP(1, true, null, 0, reqAction);
	
			localContentVp_15.addConstContentElement(contVPElem_14);
	req.addVerificationPoint(localContentVp_15);

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	private ArmableTransaction transaction_13(final IContainer parent) {
		ArmableTransaction trx = new ArmableTransaction(parent, "Select_Campus", "A1E7B3E5BC1F9B67E3A5B83735623136") {
		
		    public void execute() {     
		       	
	
	
	
	      
                	this.add(page_19(this));

		     
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

private HTTPPage page_19(final IContainer parent) {
			HTTPThink think = new HTTPThink(90, 1000, parent, parent, "A1E7B3E5BC2455B0E3A5B83735623136");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "ER_TC3_10_Select_Campus", "A1E7B3E5BC2455B0E3A5B83735623136") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(1, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_110(this, true, "A1E7B3E5BC186ED0E3A5B83735623136", false, true,
						"Config_1", "www.scvisibility.com:443/ffc/api/authorization/heirarchyFilters?subscriberId=1&userId=353&hierarchyBranchId=13&date=1508318372.561",	"/ffc/api/authorization/heirarchyFilters?subscriberId=1&userId=353&hierarchyBranchId=13&date=1508318372.561", true, false), 0, "null", 3);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_110(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5BC2455B4E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/plain, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/maintab/mapview", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_121 = new DataSub();
	reqAction.addDataSub(subContainer_121);

		ISubRule sub_280 = new SubRule("req_uri", 84, 2, true, (IDCCoreVar)dcVars[10], false, "hierarchyBranchId_5", null, 0, false);
	subContainer_121.addSubInstruction(sub_280);
		ISubRule sub_281 = new SubRule("req_uri", 62, 3, true, (IDCCoreVar)dcVars[61], false, "userId", null, 0, false);
	subContainer_121.addSubInstruction(sub_281);
		ISubRule sub_282 = new SubRule("req_uri", 53, 1, true, (IDCCoreVar)dcVars[57], false, "subscriberId", null, 0, false);
	subContainer_121.addSubInstruction(sub_282);
		ISubRule sub_283 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_28", null, 0, false);
	subContainer_121.addSubInstruction(sub_283);
	


		
				
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
			"A1E7B3E5BC2455B7E3A5B83735623136",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
				SubstitutableHTTPContentVP localContentVp_16 = new SubstitutableHTTPContentVP(1, true, null, 0, reqAction);
	
			localContentVp_16.addConstContentElement(contVPElem_15);
	req.addVerificationPoint(localContentVp_16);

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	private ArmableTransaction transaction_14(final IContainer parent) {
		ArmableTransaction trx = new ArmableTransaction(parent, "Click_On_apply_filter", "A1E7B3E5BC2DF33FE3A5B83735623136") {
		
		    public void execute() {     
		       	
	
	
	
	      
                	this.add(page_20(this));

		     
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

private HTTPPage page_20(final IContainer parent) {
			HTTPThink think = new HTTPThink(90, 1000, parent, parent, "A1E7B3E5BC303C90E3A5B83735623136");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "ER_TC3_11_Select_sites&Click_on_Filter_apply", "A1E7B3E5BC303C90E3A5B83735623136") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(3, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_111(this, true, "A1E7B3E5BC186ED0E3A5B83735623136", false, true,
						"Config_1", "www.scvisibility.com:443/ffc/api/filter/apply?userId=353",	"/ffc/api/filter/apply?userId=353", true, false), 0, "null", 3);
				httpParallel.addRequest(0, request_112(this, false, "A1E7B3E5BC186ED0E3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/e2e/api/cache/v1/hierarchyinfo/add?subscriberid=1&userid=353&applicationicid=1&date=1508318412.243",	"/e2e/api/cache/v1/hierarchyinfo/add?subscriberid=1&userid=353&applicationicid=1&date=1508318412.243", true, false), 0, "null", 3);
				httpParallel.addRequest(0, request_113(this, false, "A1E7B3E5BC186ED0E3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/ffc/api/authorization/heirarchyFiltersAsCogs?userId=353&subscriberId=1&date=1508318412.25",	"/ffc/api/authorization/heirarchyFiltersAsCogs?userId=353&subscriberId=1&date=1508318412.25", true, false), 0, "null", 3);
				httpParallel.addRequest(1, request_114(this, false, "A1E7B3E5BC4F36DFE3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/ffc/api/authorization/heirarchyFilters?subscriberId=1&userId=353&date=1508318412.25",	"/ffc/api/authorization/heirarchyFilters?subscriberId=1&userId=353&date=1508318412.25", true, false), 578, "A1E7B3E5BC303C94E3A5B83735623136", 3);
				httpParallel.addRequest(1, request_115(this, false, "A1E7B3E5BC4F36DFE3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/ffc/api/authorization/heirarchyFilters?subscriberId=1&userId=353&hierarchyBranchId=99&date=1508318414.572",	"/ffc/api/authorization/heirarchyFilters?subscriberId=1&userId=353&hierarchyBranchId=99&date=1508318414.572", true, false), 0, "null", 3);
				httpParallel.addRequest(2, request_116(this, false, "A1E7B3E5BC51A849E3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/ffc/api/authorization/heirarchyFilters?subscriberId=1&userId=353&hierarchyBranchId=125&date=1508318414.572",	"/ffc/api/authorization/heirarchyFilters?subscriberId=1&userId=353&hierarchyBranchId=125&date=1508318414.572", true, false), 892, "A1E7B3E5BC303C94E3A5B83735623136", 3);
				httpParallel.addRequest(1, request_117(this, false, "A1E7B3E5BC4F36DFE3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/ffc/api/authorization/heirarchyFilters?subscriberId=1&userId=353&hierarchyBranchId=115&date=1508318414.572",	"/ffc/api/authorization/heirarchyFilters?subscriberId=1&userId=353&hierarchyBranchId=115&date=1508318414.572", true, false), 0, "null", 3);
				httpParallel.addRequest(2, request_118(this, false, "A1E7B3E5BC51A849E3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/ffc/api/authorization/hierarchyCustomers?userId=353&subscriberId=1&hierarchyBranchId=115&date=1508318414.572",	"/ffc/api/authorization/hierarchyCustomers?userId=353&subscriberId=1&hierarchyBranchId=115&date=1508318414.572", true, false), 0, "null", 3);
				httpParallel.addRequest(0, request_119(this, false, "A1E7B3E5BC186ED0E3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/ffc/api/authorization/heirarchyFilters?subscriberId=1&userId=353&hierarchyBranchId=97&date=1508318414.572",	"/ffc/api/authorization/heirarchyFilters?subscriberId=1&userId=353&hierarchyBranchId=97&date=1508318414.572", true, false), 0, "null", 3);
				httpParallel.addRequest(0, request_120(this, false, "A1E7B3E5BC186ED0E3A5B83735623136", true, false,
						"Config_1", "www.scvisibility.com:443/ffc/api/authorization/heirarchyFilters?subscriberId=1&userId=353&hierarchyBranchId=13&date=1508318414.572",	"/ffc/api/authorization/heirarchyFilters?subscriberId=1&userId=353&hierarchyBranchId=13&date=1508318414.572", true, false), 0, "null", 3);
				httpParallel.addRequest(2, request_121(this, false, "A1E7B3E5BC51A849E3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/api/mapstyle",	"/api/mapstyle", true, false), 0, "null", 3);
				httpParallel.addRequest(1, request_122(this, false, "A1E7B3E5BC4F36DFE3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/gr/api/gr/world/get/alert/sites?date=1508318415.048&applicationId=5&subscriberId=1&userId=353",	"/gr/api/gr/world/get/alert/sites?date=1508318415.048&applicationId=5&subscriberId=1&userId=353", true, false), 0, "null", 3);
				httpParallel.addRequest(1, request_123(this, false, "A1E7B3E5BC4F36DFE3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/ffc/api/general/countries?date=1508318415.038&noOfRecords=100&pageIndex=0",	"/ffc/api/general/countries?date=1508318415.038&noOfRecords=100&pageIndex=0", true, false), 0, "null", 3);
				httpParallel.addRequest(2, request_124(this, false, "A1E7B3E5BC51A849E3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/gr/api/gr/world/get/alert/supplier?date=1508318415.048&applicationId=5&subscriberId=1&userId=353",	"/gr/api/gr/world/get/alert/supplier?date=1508318415.048&applicationId=5&subscriberId=1&userId=353", true, false), 0, "null", 3);
				httpParallel.addRequest(1, request_125(this, false, "A1E7B3E5BC4F36DFE3A5B83735623136", true, false,
						"Config_1", "www.scvisibility.com:443/ffc/api/authorization/heirarchyFilters?subscriberId=1&userId=353&hierarchyBranchId=7&date=1508318414.572",	"/ffc/api/authorization/heirarchyFilters?subscriberId=1&userId=353&hierarchyBranchId=7&date=1508318414.572", true, false), 0, "null", 3);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_111(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5BC303C94E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(10);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "470", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/plain, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "application/json;charset=UTF-8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/maintab/mapview", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_13(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_123 = new DataSub();
	reqAction.addDataSub(subContainer_123);

		ISubRule sub_290 = new SubRule("req_uri", 29, 3, true, (IDCCoreVar)dcVars[61], false, "userId", null, 0, false);
	subContainer_123.addSubInstruction(sub_290);
		ISubRule sub_291 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_25", null, 0, false);
	subContainer_123.addSubInstruction(sub_291);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"PUT",	// method
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
			"A1E7B3E5BC303C97E3A5B83735623136",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
				SubstitutableHTTPContentVP localContentVp_17 = new SubstitutableHTTPContentVP(1, true, null, 0, reqAction);
	
			localContentVp_17.addConstContentElement(contVPElem_16);
	req.addVerificationPoint(localContentVp_17);

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html; charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_13(HTTPPostData postData) {
				StringBuffer strBuf_8 = new StringBuffer();
strBuf_8.append("{\"data\":[{\"type\":\"orghierarchyfilter\",\"key\":\"SUBSCRIBER\",\"id");
strBuf_8.append("\":\"99\"},{\"type\":\"orghierarchyfilter\",\"key\":\"DIVISION\",\"id\":\"");
strBuf_8.append("125\"},{\"type\":\"orghierarchyfilter\",\"key\":\"SECTOR\",\"id\":\"115\"");
strBuf_8.append("},{\"type\":\"orghierarchyfilter\",\"key\":\"CUSTOMER\",\"id\":\"669790");
strBuf_8.append("\"},{\"isLeafFilter\":\"Y\"},{\"type\":\"geographyfilter\",\"key\":\"GLO");
strBuf_8.append("BAL\",\"id\":\"97\"},{\"type\":\"geographyfilter\",\"key\":\"REGION\",\"id");
strBuf_8.append("\":\"7\"},{\"type\":\"geographyfilter\",\"key\":\"CAMPUS\",\"id\":\"13\"},{");
strBuf_8.append("\"type\":\"geographyfilter\",\"key\":\"SITE\",\"id\":\"82\"}]}");
String requestData_13 = strBuf_8.toString();
			
	HTTPPostDataChunk pdc_12 = new HTTPPostDataChunk("A1E7B3E5BC303CD8E3A5B83735623136", postData, requestData_13, "UTF-8", 17, 466);
	postData.addDataChunk(pdc_12);

	IDataSub subContainer_122 = new DataSub();
	pdc_12.addDataSub(subContainer_122);

		ISubRule sub_284 = new SubRule("req_content", 464, 2, true, (IDCCoreVar)dcVars[11], false, "id_10", null, 0, false);
	subContainer_122.addSubInstruction(sub_284);
		ISubRule sub_285 = new SubRule("req_content", 414, 2, true, (IDCCoreVar)dcVars[10], false, "id_9", null, 0, false);
	subContainer_122.addSubInstruction(sub_285);
		ISubRule sub_286 = new SubRule("req_content", 363, 1, true, (IDCCoreVar)dcVars[9], false, "id_8", null, 0, false);
	subContainer_122.addSubInstruction(sub_286);
		ISubRule sub_287 = new SubRule("req_content", 234, 6, true, (IDCCoreVar)dcVars[8], false, "id_7", null, 0, false);
	subContainer_122.addSubInstruction(sub_287);
		ISubRule sub_288 = new SubRule("req_content", 176, 3, true, (IDCCoreVar)dcVars[7], false, "id_6", null, 0, false);
	subContainer_122.addSubInstruction(sub_288);
		ISubRule sub_289 = new SubRule("req_content", 120, 3, true, (IDCCoreVar)dcVars[6], false, "id_5", null, 0, false);
	subContainer_122.addSubInstruction(sub_289);
	



	}

	public HTTPAction request_112(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5BC376880E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/plain, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/maintab/mapview", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_124 = new DataSub();
	reqAction.addDataSub(subContainer_124);

		ISubRule sub_292 = new SubRule("req_uri", 78, 1, true, (IDCCoreVar)dcVars[58], false, "applicationicid", null, 0, false);
	subContainer_124.addSubInstruction(sub_292);
		ISubRule sub_293 = new SubRule("req_uri", 58, 3, true, (IDCCoreVar)dcVars[61], false, "userid", null, 0, false);
	subContainer_124.addSubInstruction(sub_293);
		ISubRule sub_294 = new SubRule("req_uri", 49, 1, true, (IDCCoreVar)dcVars[59], false, "subscriberid", null, 0, false);
	subContainer_124.addSubInstruction(sub_294);
		ISubRule sub_295 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_24", null, 0, false);
	subContainer_124.addSubInstruction(sub_295);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BC303C94E3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BC303C94E3A5B83735623136"), 3);		
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
			"A1E7B3E5BC376883E3A5B83735623136",
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

	public HTTPAction request_113(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5BC4F3640E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/plain, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/maintab/mapview", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_125 = new DataSub();
	reqAction.addDataSub(subContainer_125);

		ISubRule sub_296 = new SubRule("req_uri", 70, 1, true, (IDCCoreVar)dcVars[57], false, "subscriberId", null, 0, false);
	subContainer_125.addSubInstruction(sub_296);
		ISubRule sub_297 = new SubRule("req_uri", 53, 3, true, (IDCCoreVar)dcVars[61], false, "userId", null, 0, false);
	subContainer_125.addSubInstruction(sub_297);
		ISubRule sub_298 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_23", null, 0, false);
	subContainer_125.addSubInstruction(sub_298);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BC376880E3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BC303C94E3A5B83735623136"), 3);		
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
			"A1E7B3E5BC4F3643E3A5B83735623136",
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

	public HTTPAction request_114(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5BC4F36EDE3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/plain, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/maintab/mapview", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_126 = new DataSub();
	reqAction.addDataSub(subContainer_126);

		ISubRule sub_299 = new SubRule("req_uri", 62, 3, true, (IDCCoreVar)dcVars[61], false, "userId", null, 0, false);
	subContainer_126.addSubInstruction(sub_299);
		ISubRule sub_300 = new SubRule("req_uri", 53, 1, true, (IDCCoreVar)dcVars[57], false, "subscriberId", null, 0, false);
	subContainer_126.addSubInstruction(sub_300);
		ISubRule sub_301 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_22", null, 0, false);
	subContainer_126.addSubInstruction(sub_301);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BC4F3640E3A5B83735623136"), 3);		
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
			"A1E7B3E5BC4F36F0E3A5B83735623136",
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

	public HTTPAction request_115(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5BC51A7AAE3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/plain, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/maintab/mapview", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_127 = new DataSub();
	reqAction.addDataSub(subContainer_127);

		ISubRule sub_302 = new SubRule("req_uri", 62, 3, true, (IDCCoreVar)dcVars[61], false, "userId", null, 0, false);
	subContainer_127.addSubInstruction(sub_302);
		ISubRule sub_303 = new SubRule("req_uri", 53, 1, true, (IDCCoreVar)dcVars[57], false, "subscriberId", null, 0, false);
	subContainer_127.addSubInstruction(sub_303);
		ISubRule sub_304 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_21", null, 0, false);
	subContainer_127.addSubInstruction(sub_304);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BC4F36EDE3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BC303C94E3A5B83735623136"), 3);		
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
			"A1E7B3E5BC51A7ADE3A5B83735623136",
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

	public HTTPAction request_116(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5BC51A857E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/plain, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/maintab/mapview", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_128 = new DataSub();
	reqAction.addDataSub(subContainer_128);

		ISubRule sub_305 = new SubRule("req_uri", 62, 3, true, (IDCCoreVar)dcVars[61], false, "userId", null, 0, false);
	subContainer_128.addSubInstruction(sub_305);
		ISubRule sub_306 = new SubRule("req_uri", 53, 1, true, (IDCCoreVar)dcVars[57], false, "subscriberId", null, 0, false);
	subContainer_128.addSubInstruction(sub_306);
		ISubRule sub_307 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_20", null, 0, false);
	subContainer_128.addSubInstruction(sub_307);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BC51A7AAE3A5B83735623136"), 3);		
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
			"A1E7B3E5BC51A85AE3A5B83735623136",
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

	public HTTPAction request_117(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5BC624910E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/plain, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/maintab/mapview", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_129 = new DataSub();
	reqAction.addDataSub(subContainer_129);

		ISubRule sub_308 = new SubRule("req_uri", 62, 3, true, (IDCCoreVar)dcVars[61], false, "userId", null, 0, false);
	subContainer_129.addSubInstruction(sub_308);
		ISubRule sub_309 = new SubRule("req_uri", 53, 1, true, (IDCCoreVar)dcVars[57], false, "subscriberId", null, 0, false);
	subContainer_129.addSubInstruction(sub_309);
		ISubRule sub_310 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_19", null, 0, false);
	subContainer_129.addSubInstruction(sub_310);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BC51A857E3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BC303C94E3A5B83735623136"), 3);		
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
			"A1E7B3E5BC624913E3A5B83735623136",
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

	public HTTPAction request_118(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5BC6249AFE3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/plain, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/maintab/mapview", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_130 = new DataSub();
	reqAction.addDataSub(subContainer_130);

		ISubRule sub_311 = new SubRule("req_uri", 66, 1, true, (IDCCoreVar)dcVars[57], false, "subscriberId", null, 0, false);
	subContainer_130.addSubInstruction(sub_311);
		ISubRule sub_312 = new SubRule("req_uri", 49, 3, true, (IDCCoreVar)dcVars[61], false, "userId", null, 0, false);
	subContainer_130.addSubInstruction(sub_312);
		ISubRule sub_313 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_18", null, 0, false);
	subContainer_130.addSubInstruction(sub_313);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BC624910E3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BC303C94E3A5B83735623136"), 3);		
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
			"A1E7B3E5BC6249B2E3A5B83735623136",
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

	public HTTPAction request_119(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5BC624A46E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/plain, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/maintab/mapview", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_131 = new DataSub();
	reqAction.addDataSub(subContainer_131);

		ISubRule sub_314 = new SubRule("req_uri", 62, 3, true, (IDCCoreVar)dcVars[61], false, "userId", null, 0, false);
	subContainer_131.addSubInstruction(sub_314);
		ISubRule sub_315 = new SubRule("req_uri", 53, 1, true, (IDCCoreVar)dcVars[57], false, "subscriberId", null, 0, false);
	subContainer_131.addSubInstruction(sub_315);
		ISubRule sub_316 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_17", null, 0, false);
	subContainer_131.addSubInstruction(sub_316);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BC6249AFE3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BC303C94E3A5B83735623136"), 3);		
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
			"A1E7B3E5BC624A49E3A5B83735623136",
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

	public HTTPAction request_120(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5BC624AE5E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/plain, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/maintab/mapview", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_132 = new DataSub();
	reqAction.addDataSub(subContainer_132);

		ISubRule sub_317 = new SubRule("req_uri", 62, 3, true, (IDCCoreVar)dcVars[61], false, "userId", null, 0, false);
	subContainer_132.addSubInstruction(sub_317);
		ISubRule sub_318 = new SubRule("req_uri", 53, 1, true, (IDCCoreVar)dcVars[57], false, "subscriberId", null, 0, false);
	subContainer_132.addSubInstruction(sub_318);
		ISubRule sub_319 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_16", null, 0, false);
	subContainer_132.addSubInstruction(sub_319);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BC303C94E3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BC624A46E3A5B83735623136"), 3);		
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
			"A1E7B3E5BC624AE8E3A5B83735623136",
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

	public HTTPAction request_121(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5BC70A0F0E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/plain, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/maintab/mapview", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_133 = new DataSub();
	reqAction.addDataSub(subContainer_133);

		ISubRule sub_320 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_15", null, 0, false);
	subContainer_133.addSubInstruction(sub_320);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BC624AE5E3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BC303C94E3A5B83735623136"), 3);		
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
			"A1E7B3E5BC70A0F3E3A5B83735623136",
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

	public HTTPAction request_122(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5BC947CA0E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/plain, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/maintab/mapview", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_134 = new DataSub();
	reqAction.addDataSub(subContainer_134);

		ISubRule sub_321 = new SubRule("req_uri", 91, 3, true, (IDCCoreVar)dcVars[61], false, "userId", null, 0, false);
	subContainer_134.addSubInstruction(sub_321);
		ISubRule sub_322 = new SubRule("req_uri", 82, 1, true, (IDCCoreVar)dcVars[57], false, "subscriberId", null, 0, false);
	subContainer_134.addSubInstruction(sub_322);
		ISubRule sub_323 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_14", null, 0, false);
	subContainer_134.addSubInstruction(sub_323);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BC70A0F0E3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BC303C94E3A5B83735623136"), 3);		
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
			"A1E7B3E5BC947CA3E3A5B83735623136",
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

	public HTTPAction request_123(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5BC947D3FE3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/plain, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/maintab/mapview", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_135 = new DataSub();
	reqAction.addDataSub(subContainer_135);

		ISubRule sub_324 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_13", null, 0, false);
	subContainer_135.addSubInstruction(sub_324);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BC947CA0E3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BC303C94E3A5B83735623136"), 3);		
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
			"A1E7B3E5BC947D42E3A5B83735623136",
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

	public HTTPAction request_124(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5BC947DDEE3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/plain, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/maintab/mapview", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_136 = new DataSub();
	reqAction.addDataSub(subContainer_136);

		ISubRule sub_325 = new SubRule("req_uri", 94, 3, true, (IDCCoreVar)dcVars[61], false, "userId", null, 0, false);
	subContainer_136.addSubInstruction(sub_325);
		ISubRule sub_326 = new SubRule("req_uri", 85, 1, true, (IDCCoreVar)dcVars[57], false, "subscriberId", null, 0, false);
	subContainer_136.addSubInstruction(sub_326);
		ISubRule sub_327 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_12", null, 0, false);
	subContainer_136.addSubInstruction(sub_327);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BC947D3FE3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BC303C94E3A5B83735623136"), 3);		
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
			"A1E7B3E5BC947DE1E3A5B83735623136",
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

	public HTTPAction request_125(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5BC96C6E7E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/plain, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/maintab/mapview", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_137 = new DataSub();
	reqAction.addDataSub(subContainer_137);

		ISubRule sub_328 = new SubRule("req_uri", 62, 3, true, (IDCCoreVar)dcVars[61], false, "userId", null, 0, false);
	subContainer_137.addSubInstruction(sub_328);
		ISubRule sub_329 = new SubRule("req_uri", 53, 1, true, (IDCCoreVar)dcVars[57], false, "subscriberId", null, 0, false);
	subContainer_137.addSubInstruction(sub_329);
		ISubRule sub_330 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_11", null, 0, false);
	subContainer_137.addSubInstruction(sub_330);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BC947DDEE3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BC303C94E3A5B83735623136"), 3);		
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
			"A1E7B3E5BC96C6EAE3A5B83735623136",
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

	private ArmableTransaction transaction_15(final IContainer parent) {
		ArmableTransaction trx = new ArmableTransaction(parent, "Click_On_logout", "A1E7B3E5BC96C982E3A5B83735623136") {
		
		    public void execute() {     
		       	
	
	
	
	      
                	this.add(page_21(this));

		     
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

private HTTPPage page_21(final IContainer parent) {
			HTTPThink think = new HTTPThink(6097, 1, parent, parent, "A1E7B3E5BC96CADAE3A5B83735623136");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "Jabil", "A1E7B3E5BC96CADAE3A5B83735623136") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(1, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_126(this, true, "A1E7B3E5BC96C986E3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/ffc/api/general/clearUserCache?userId=353&subscriberId=1&date=1508318460.115",	"/ffc/api/general/clearUserCache?userId=353&subscriberId=1&date=1508318460.115", true, false), 0, "null", 3);
				httpParallel.addRequest(0, request_127(this, false, "A1E7B3E5BC96C986E3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/logout",	"/logout", true, false), 0, "null", 3);
				httpParallel.addRequest(0, request_128(this, false, "A1E7B3E5BC96C986E3A5B83735623136", false, true,
						"Config_1", "www.scvisibility.com:443/logout.html",	"/logout.html", true, false), 0, "null", 3);
				httpParallel.addRequest(0, request_129(this, false, "A1E7B3E5BC96C986E3A5B83735623136", false, false,
						"Config_1", "www.scvisibility.com:443/favicon.ico",	"/favicon.ico", true, false), 0, "null", 3);
				httpParallel.addRequest(0, request_130(this, false, "A1E7B3E5BC96C986E3A5B83735623136", true, false,
						"Config_1", "www.scvisibility.com:443/",	"/", true, false), 0, "null", 3);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_126(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5BC96CADEE3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "application/json, text/plain, */*", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/maintab/mapview", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_138 = new DataSub();
	reqAction.addDataSub(subContainer_138);

		ISubRule sub_331 = new SubRule("req_uri", 56, 1, true, (IDCCoreVar)dcVars[57], false, "subscriberId", null, 0, false);
	subContainer_138.addSubInstruction(sub_331);
		ISubRule sub_332 = new SubRule("req_uri", 39, 3, true, (IDCCoreVar)dcVars[61], false, "userId", null, 0, false);
	subContainer_138.addSubInstruction(sub_332);
		ISubRule sub_333 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_5", null, 0, false);
	subContainer_138.addSubInstruction(sub_333);
	


		
				
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
			"A1E7B3E5BC96CAE1E3A5B83735623136",
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

	public HTTPAction request_127(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5BC96CB81E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/maintab/mapview", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_19 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_19);

	harvestContainer_19.addHarvestInstruction ("resp_hdr_Location_1", dcVars[63], ".*", 1, 0, 0, 0, false, "Location_6", null, 0, false);
	IDataSub subContainer_139 = new DataSub();
	reqAction.addDataSub(subContainer_139);

		ISubRule sub_334 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_4", null, 0, false);
	subContainer_139.addSubInstruction(sub_334);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BC96CADEE3A5B83735623136"), 3);		
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
			"A1E7B3E5BC96CB84E3A5B83735623136",
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

	public HTTPAction request_128(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5BC993790E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(8);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/maintab/mapview", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_20 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_20);

	harvestContainer_20.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[64], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)_12", null, 0, false);
	IDataSub subContainer_140 = new DataSub();
	reqAction.addDataSub(subContainer_140);

		ISubRule sub_335 = new SubRule("req_uri", 0, 12, false, (IDCCoreVar)dcVars[63], false, "Jabil_url_2", null, 0, false);
	subContainer_140.addSubInstruction(sub_335);
		ISubRule sub_336 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_3", null, 0, false);
	subContainer_140.addSubInstruction(sub_336);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BC96CB81E3A5B83735623136"), 3);		
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
			"A1E7B3E5BC993793E3A5B83735623136",
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

	public HTTPAction request_129(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5BC9BA890E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,image/apng,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/logout.html", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_21 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_21);

	harvestContainer_21.addHarvestInstruction ("resp_hdr_Location_1", dcVars[65], ".*", 1, 0, 0, 0, false, "Location_7", null, 0, false);
	IDataSub subContainer_141 = new DataSub();
	reqAction.addDataSub(subContainer_141);

		ISubRule sub_337 = new SubRule("req_hdr_Referer_1", 0, 40, false, (IDCCoreVar)dcVars[64], false, "Referer_2", null, 0, false);
	subContainer_141.addSubInstruction(sub_337);
		ISubRule sub_338 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host_2", null, 0, false);
	subContainer_141.addSubInstruction(sub_338);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BC993790E3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BC96CB81E3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BC993790E3A5B83735623136"), 3);		
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
			"A1E7B3E5BC9BA893E3A5B83735623136",
			false,
			false
		);
		
		req.setExpectedResponseCode(302);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/plain; charset=utf-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_130(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1E7B3E5BC9DF280E3A5B83735623136", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(7);
					
		headers.add(new RequestHeaderData("Host", "www.scvisibility.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "image/webp,image/apng,image/*,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://www.scvisibility.com/logout.html", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-GB,en-US;q=0.8,en;q=0.6", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_142 = new DataSub();
	reqAction.addDataSub(subContainer_142);

		ISubRule sub_339 = new SubRule("req_hdr_Referer_1", 0, 40, false, (IDCCoreVar)dcVars[64], false, "Referer", null, 0, false);
	subContainer_142.addSubInstruction(sub_339);
		ISubRule sub_340 = new SubRule("req_uri", 0, 1, false, (IDCCoreVar)dcVars[65], false, "Jabil_url", null, 0, false);
	subContainer_142.addSubInstruction(sub_340);
		ISubRule sub_341 = new SubRule("req_hdr_Host_1", 0, 20, false, (IDCCoreVar)vars[0], false, "Host", null, 0, false);
	subContainer_142.addSubInstruction(sub_341);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BC993790E3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BC96CB81E3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BC9BA890E3A5B83735623136"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1E7B3E5BC993790E3A5B83735623136"), 3);		
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
			"A1E7B3E5BC9DF283E3A5B83735623136",
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

	public class CustomCode_2 extends CustomCodeAction {

		IDataCorrelationVar outVar;
		/**
		 * @param parent
		 * @param name
		 */
		public CustomCode_2(IContainer parent, IDataCorrelationVar outVar) {
			super(parent, "testcase3.Clearcook", "A1E7B3F8BBB9D970E3A5B83735623136");
			this.outVar = outVar;
		}
	
		/**
		 * @see com.ibm.rational.test.lt.kernel.action.IKAction#execute()
		 */
		public void execute() {
		
				
	
	
	
	
	
	
			IDCCoreVar[] inputVars = {
				
			};
			
			ICustomCode2 ccclass = 	new testcase3.Clearcook();
			
			setCCClass(ccclass);
			setInputVars(inputVars);
			setOutVar(outVar);
			
			super.execute();

		}
	}



}
