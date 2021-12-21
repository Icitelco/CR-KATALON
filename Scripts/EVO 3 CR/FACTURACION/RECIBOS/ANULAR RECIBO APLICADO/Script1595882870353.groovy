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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

WebUI.callTestCase(findTestCase('EVO 3 CR/LOGIN EVO 3 CR/LOGIN'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

'PANTALLA CLIENTES'
WebUI.navigateToUrl('http://10.7.148.132:8080/SIGA-TG/servlet/wwcliente')

String Clientenro = CustomKeywords.'CRPREP_CLIENTENRO_CON_MAXRECIBONRO.CRPREP_Cliente_Numero'()

'NUMERO DE CLIENTE'
WebUI.setText(findTestObject('Object Repository/Page_Clientes/input_Cliente Nro_vCLIENTENRO'), Clientenro)

WebUI.click(findTestObject('Object Repository/Page_Clientes/input_Home Pack_SEARCHBUTTON'))

WebUI.click(findTestObject('Object Repository/Page_Clientes/img_Cantidad facturas_vDISPLAY_0001'))

WebUI.click(findTestObject('Object Repository/Page_CLIENTE APELLIDO-A/span_Documentos'))

WebUI.delay(5)

'PESTAÑA RECIBOS'
WebUI.click(findTestObject('Object Repository/Page_ANA BORDALLO ABAD/span_Recibos'))

WebUI.delay(5)

String Recibonro = CustomKeywords.'CRPREP_RECIBO_DE_CLIENTE.CRPREP_Cliente_Numero'(Clientenro)

WebUI.setText(findTestObject('Page_CLIENTE APELLIDO-A/input_Nmero_W0033W0007vRECIBONRO'), Recibonro)

WebUI.delay(5)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_CLIENTE APELLIDO/input_Autorizacion_W0033W0007vANULARRECIBO_0001'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_CLIENTE APELLIDO/input_Confirma ANULAR Recibo_W0033W0007I_BU_ded17a'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_CLIENTE APELLIDO-A/span_Documentos'))

