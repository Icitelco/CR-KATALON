import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent
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

'PANTALLA CLIENTES'
WebUI.navigateToUrl('http://10.7.148.132:8080/SIGA-TG/servlet/wwcliente')

String Clientenro = CustomKeywords.'CRPERP_CLIENTE_FACTURAS_IMPAGAS.CRPREP_Cliente_Numero'()

'NUMERO DE CLIENTE'
WebUI.setText(findTestObject('Object Repository/Page_Clientes/input_Cliente Nro_vCLIENTENRO'), Clientenro)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Clientes/input_Home Pack_SEARCHBUTTON'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Clientes/img_Cantidad facturas_vDISPLAY_0001'))

WebUI.delay(5)

'PESTAÑA DOCUMENTOS'
WebUI.click(findTestObject('Object Repository/Page_Cliente/span_Documentos'))

WebUI.delay(5)

//url = WebUI.getUrl()
'AGREGAMOS UN RECIBO\r\n'
WebUI.click(findTestObject('Object Repository/Page_JOSE URGELLES CHAVARRIA/input_Histricos_W0033W0007AGREGARRECIBO'))

WebUI.delay(10)

'AGREGAR COMPOSICION DE PAGO'
WebUI.click(findTestObject('Object Repository/Page_Ingresar Recibo de Pago - CC/input_Composicin del Pago_NUEVOTIPODEPAGO'))

WebUI.delay(5)

'CREAMOS EL RECIBO'
WebUI.click(findTestObject('Object Repository/Page_Ingresar Recibo de Pago - CC/input_Cantidad de Facturas_GENERARRECIBO'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Ingresar Recibo de Pago - CC/button_Aceptar'))

WebUI.delay(8)

WebUI.click(findTestObject('Object Repository/Page_Ingresar Recibo de Pago - CC/input_Confirmar impresin de recibo_CONFIRMAR'))

WebUI.navigateToUrl('http://10.7.148.132:8080/SIGA-TG/servlet/entitymanagercliente?Na6+jafnwZO8SIBdTgNiDb4wGsFJfME2NgzZUWMHfXKS4cDQz_f_uCKg2FGTcRAhWR0T5pAf2CA5ChwjpZ_swQ==')

WebUI.delay(5)

//WebUI.click(findTestObject('Object Repository/Page_Ingresar Recibo de Pago - CC/input_Confirmar impresin de recibo_CONFIRMAR'))
'PESTAÑA RECIBOS'
WebUI.click(findTestObject('Object Repository/Page_JOSE URGELLES CHAVARRIA/span_Recibos'))

