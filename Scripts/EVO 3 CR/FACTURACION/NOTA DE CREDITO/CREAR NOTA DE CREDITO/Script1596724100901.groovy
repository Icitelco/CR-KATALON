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

mydate = new Date()

formattedDate = mydate.format('dd/MM/YYYY')

'PANTALLA CLIENTES'
WebUI.navigateToUrl('http://10.7.148.132:8080/SIGA-TG/servlet/wwcliente')

String Clientenro = CustomKeywords.'CRPREP_CLIENTE_CONECTADO_SIN_COMPROBANTES_PARA_AUTORIZARR.CRPREP_Cliente_Numero'()

WebUI.delay(5)

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

WebUI.takeFullPageScreenshot()

'INSERTAMOS FACTURA MANUAL'
WebUI.click(findTestObject('Object Repository/Page_Cliente/input_Histricos_W0033W0007INSERT'))

WebUI.delay(5)

WebUI.takeFullPageScreenshot()

'METODO DE PAGO'
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Documento/select_AMERICAN EXPRESS TBCR SIN COMISION B_eb8749'), 
    '112', true)

WebUI.delay(5)

'COBRADORID'
WebUI.setText(findTestObject('Object Repository/Page_Documento/input_Cobrador_W0026W0007W0020COBRADORID'), '1')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Documento/img_Exonerado_W0026W0007W0020PROMPT_672_0001'))

WebUI.delay(5)

'CONCEPTO DE FACTURA'
WebUI.click(findTestObject('Object Repository/Page_Documento/a_SERVICIO TV CABLE'))

WebUI.delay(5)

'IMPORTE'
WebUI.setText(findTestObject('Object Repository/Page_Documento/input_SERVICIO TV CABLE_W0026W0007W0020FACT_2acffc'), '1000')

WebUI.delay(5)

'GENERAR FACTURA'
WebUI.click(findTestObject('Object Repository/Page_Documento/input_Preview_W0026W0007W0020ENTER'))

WebUI.delay(5)

WebUI.takeFullPageScreenshot()

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Cliente/select_(Ninguno)FACTURANOTA DE CREDITONOTA _6e5342'), 
    'F', true)

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Cliente/select_(Ninguno)PAGAIMPAGAENVIADAREFINANCIA_98f530'), 
    'I', true)

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Page_Cliente/input_Desde Fecha_W0033W0007vFROMFACTURAFCH'), formattedDate)

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Page_Cliente/input_Hasta Fecha_W0033W0007vTOFACTURAFCH'), formattedDate)

WebUI.delay(5)

WebUI.click(findTestObject('Page_CLIENTE APELLIDO-A/input_Hasta Fecha_W0033W0007SEARCHBUTTON'))

WebUI.delay(5)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Page_CLIENTE APELLIDO-A/input_Es de Gobierno_W0033W0007vCREARNC_0001'))

WebUI.delay(5)

WebUI.setText(findTestObject('Page_CLIENTE APELLIDO-A/input_Motivo Detalle_vE_MOTIVOFACTURADETALLEID'), '120')

WebUI.delay(5)

WebUI.setText(findTestObject('Page_CLIENTE APELLIDO-A/textarea_Observacin_vE_FACTURAOBS'), 'cchchcghcchchcghcghcghcghcghcghccg')

WebUI.delay(5)

WebUI.click(findTestObject('Page_CLIENTE APELLIDO-A/input_Observacin_TODOS'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_CLIENTE APELLIDO-A/input_IMPUESTO_GENERARNC'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_CLIENTE APELLIDO-A/button_Aceptar (1)'))

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Page_CLIENTE APELLIDO-A/select_(Ninguno)FACTURANOTA DE CREDITONOTA _6e5342'), 
    'N', true)

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Page_CLIENTE APELLIDO-A/select_(Ninguno)PAGAIMPAGAENVIADAREFINANCIA_98f530'), 
    'P', true)

WebUI.delay(5)

mydate = new Date()

formattedDate = mydate.format('dd/MM/YYYY')

WebUI.setText(findTestObject('Page_CLIENTE APELLIDO-A/input_Desde Fecha_W0033W0007vFROMFACTURAFCH'), formattedDate)

WebUI.delay(5)

WebUI.click(findTestObject('Page_CLIENTE APELLIDO-A/input_Hasta Fecha_W0033W0007SEARCHBUTTON'))

WebUI.delay(5)

WebUI.takeFullPageScreenshot()

