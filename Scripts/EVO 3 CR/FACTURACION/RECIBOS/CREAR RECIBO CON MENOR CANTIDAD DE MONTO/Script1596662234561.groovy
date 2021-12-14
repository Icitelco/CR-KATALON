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

WebUI.callTestCase(findTestCase('EVO 3 CR/LOGIN EVO 3 CR/LOGIN'), [:], FailureHandling.CONTINUE_ON_FAILURE)

'PANTALLA CLIENTES'
WebUI.navigateToUrl('http://10.7.148.132:8080/SIGA-TG/servlet/wwcliente')

String Clientenro = CustomKeywords.'CRPERP_CLIENTE_FACTURAS_IMPAGAS.CRPREP_Cliente_Numero'()

'NUMERO DE CLIENTE'
WebUI.setText(findTestObject('Object Repository/Page_Clientes/input_Cliente Nro_vCLIENTENRO'), Clientenro)

WebUI.click(findTestObject('Object Repository/Page_Clientes/input_Home Pack_SEARCHBUTTON'))

WebUI.click(findTestObject('Object Repository/Page_Clientes/img_Cantidad facturas_vDISPLAY_0001'))

'PESTAÑA DOCUMENTOS'
WebUI.click(findTestObject('Object Repository/Page_Cliente/span_Documentos'))

url = WebUI.getUrl()

'AGREGAMOS UN RECIBO\r\n'
WebUI.click(findTestObject('Object Repository/Page_JOSE URGELLES CHAVARRIA/input_Histricos_W0033W0007AGREGARRECIBO'))

String Monto1 = '1'

println(Monto1)

WebUI.setText(findTestObject('Object Repository/Page_Ingresar Recibo de Pago - CC/input__vE_RECIBOIMP'), Monto1)

WebUI.click(findTestObject('Object Repository/Page_Ingresar Recibo de Pago - CC/input_Cantidad de Facturas_vE_APLICARRECIBOIMP'))

'AGREGAR COMPOSICION DE PAGO'
WebUI.click(findTestObject('Object Repository/Page_Ingresar Recibo de Pago - CC/input_Composicin del Pago_NUEVOTIPODEPAGO'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Ingresar Recibo de Pago - CC/input_Titular_vE_RBOCPGOIMPORTE_0001'), 
    0)

WebUI.setText(findTestObject('Object Repository/Page_Ingresar Recibo de Pago - CC/input_Titular_vE_RBOCPGOIMPORTE_0001'), 
    Monto1)

'CREAMOS EL RECIBO'
WebUI.click(findTestObject('Object Repository/Page_Ingresar Recibo de Pago - CC/input_Cantidad de Facturas_GENERARRECIBO'))

WebUI.click(findTestObject('Object Repository/Page_Ingresar Recibo de Pago - CC/button_Aceptar'))

WebUI.delay(15)

Robot a = new Robot()

a.keyPress(KeyEvent.VK_ALT)

a.keyPress(KeyEvent.VK_F4)

a.keyRelease(KeyEvent.VK_ALT)

a.keyRelease(KeyEvent.VK_F4)

WebUI.delay(5)

WebUI.navigateToUrl(url)

//WebUI.click(findTestObject('Object Repository/Page_Ingresar Recibo de Pago - CC/input_Confirmar impresin de recibo_CONFIRMAR'))
'PESTAÑA RECIBOS'
WebUI.click(findTestObject('Object Repository/Page_JOSE URGELLES CHAVARRIA/span_Recibos'))

