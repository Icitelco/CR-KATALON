import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('EVO 3 CR/LOGIN EVO 3 CR/LOGIN'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.navigateToUrl('http://10.7.148.132:8080/SIGA-TG/servlet/monitorordenagendadispatcher')

WebUI.delay(5)

String Fecha = CustomKeywords.'CRPREP_FECHA_ORDEN_TECNICO_DISPATCHER.CRPREP_Cliente_Numero'()

WebUI.setText(findTestObject('Page_Monitor Orden Agendamiento((Dispatcher)))/input_Fecha Agenda_vFILAGENDAFECHA'), Fecha)

WebUI.click(findTestObject('Page_Monitor Orden Agendamiento((Dispatcher)))/input_Fecha Agenda_BUTTON1'))

WebUI.click(findTestObject('Page_Monitor Orden Agendamiento((Dispatcher)))/input_LESTER MENDEZ ANDURAY_vBTNDSP_0001'))

WebUI.click(findTestObject('Page_Monitor Orden Agendamiento((Dispatcher)))/input_LESTER MENDEZ ANDURAY_OCULTOMUESTRO'))

WebUI.click(findTestObject('Page_Monitor Orden Agendamiento((Dispatcher)))/input_CANCELADO_W0038vFILCANCELADO'))

WebUI.click(findTestObject('Page_Monitor Orden Agendamiento((Dispatcher)))/input_COMENZADO_W0038vFILCOMENZADO'))

WebUI.click(findTestObject('Page_Monitor Orden Agendamiento((Dispatcher)))/input_INGRESADO_W0038vFILINGRESADO'))

WebUI.click(findTestObject('Page_Monitor Orden Agendamiento((Dispatcher)))/input_EMITIDO_W0038vFILEMITIDO'))

WebUI.click(findTestObject('Page_Monitor Orden Agendamiento((Dispatcher)))/input_TERMINADO_W0038vFILTERMINADO'))

WebUI.click(findTestObject('Page_Monitor Orden Agendamiento((Dispatcher)))/input_VISITADO_W0038vFILVISITADO'))

WebUI.click(findTestObject('Page_Monitor Orden Agendamiento((Dispatcher)))/input_RECOORDINADO_W0038vFILRECOORDINADO'))

WebUI.click(findTestObject('Page_Monitor Orden Agendamiento((Dispatcher)))/input_ACEPTADO_W0038vFILACEPTADO'))

WebUI.click(findTestObject('Page_Monitor Orden Agendamiento((Dispatcher)))/input_RECOORDINADO_W0038BUTTON1'))

WebUI.delay(10)

WebUI.click(findTestObject('Page_Monitor Orden Agendamiento((Dispatcher)))/input_DESCONEXIONES CONSOLIDADO_W0038vBTNACE_0001'))

WebUI.click(findTestObject('Page_Monitor Orden Agendamiento((Dispatcher)))/input_ENVIADO_W0038vFILENVIADO'))

WebUI.click(findTestObject('Page_Monitor Orden Agendamiento((Dispatcher)))/input_ACEPTADO_W0038vFILACEPTADO'))

WebUI.click(findTestObject('Page_Monitor Orden Agendamiento((Dispatcher)))/input_RECOORDINADO_W0038BUTTON1'))

WebUI.click(findTestObject('Page_Monitor Orden Agendamiento((Dispatcher)))/input_RECOORDINADO_W0038BUTTON1'))

WebUI.delay(10)

WebUI.click(findTestObject('Page_Monitor Orden Agendamiento((Dispatcher)))/input_DESCONEXIONES CONSOLIDADO_W0038vBTNC1_0001'))

WebUI.click(findTestObject('Page_Monitor Orden Agendamiento((Dispatcher)))/input_ACEPTADO_W0038vFILACEPTADO'))

WebUI.click(findTestObject('Page_Monitor Orden Agendamiento((Dispatcher)))/input_COMENZADO_W0038vFILCOMENZADO'))

WebUI.click(findTestObject('Page_Monitor Orden Agendamiento((Dispatcher)))/input_RECOORDINADO_W0038BUTTON1'))

WebUI.click(findTestObject('Page_Monitor Orden Agendamiento((Dispatcher)))/input_RECOORDINADO_W0038BUTTON1'))

WebUI.delay(10)

WebUI.click(findTestObject('Page_Monitor Orden Agendamiento((Dispatcher)))/input_DESCONEXIONES CONSOLIDADO_W0038vBTNC2_0001'))

