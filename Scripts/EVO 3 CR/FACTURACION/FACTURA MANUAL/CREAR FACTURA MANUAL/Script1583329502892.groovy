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

WebUI.navigateToUrl('http://10.7.148.132:8080/SIGA-TG/servlet/wwcliente')

'NUMERO DE CLIENTE'
String ClienteNro = CustomKeywords.'CLIENTE_CONECTADO.CRPREP_Cliente_Numero'()

if (ClienteNro == null) {
    WebUI.closeBrowser()

    WebUI.callTestCase(findTestCase('EVO 3 CR/CONTRATOS/CONTRATO CLIENTE HOME'), [:], FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.closeBrowser()

    WebUI.callTestCase(findTestCase('EVO 3 CR/FACTURACION/FACTURA MANUAL/CREAR FACTURA MANUAL'), [:], FailureHandling.CONTINUE_ON_FAILURE)
} else {
    WebUI.setText(findTestObject('Object Repository/Page_Clientes/input_Cliente Nro_vCLIENTENRO'), ClienteNro)

    WebUI.click(findTestObject('Object Repository/Page_Clientes/input_Home Pack_SEARCHBUTTON'))

    WebUI.click(findTestObject('Object Repository/Page_Clientes/img_Cantidad facturas_vDISPLAY_0001'))

    'PESTAÑA DOCUMENTOS'
    WebUI.click(findTestObject('Object Repository/Page_Cliente/span_Documentos'))

    'INSERTAMOS FACTURA MANUAL'
    WebUI.click(findTestObject('Object Repository/Page_Cliente/input_Histricos_W0033W0007INSERT'))

    WebUI.delay(10)

    'METODO DE PAGO'
    WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Documento/select_AMERICAN EXPRESS TBCR SIN COMISION B_eb8749'), 
        '112', true)

    'COBRADORID'
    WebUI.setText(findTestObject('Object Repository/Page_Documento/input_Cobrador_W0026W0007W0020COBRADORID'), '1')

    WebUI.click(findTestObject('Object Repository/Page_Documento/img_Exonerado_W0026W0007W0020PROMPT_672_0001'))

    'CONCEPTO DE FACTURA'
    WebUI.click(findTestObject('Object Repository/Page_Documento/a_SERVICIO TV CABLE'))

    'IMPORTE'
    WebUI.setText(findTestObject('Object Repository/Page_Documento/input_SERVICIO TV CABLE_W0026W0007W0020FACT_2acffc'), 
        '1000')

    'GENERAR FACTURA'
    WebUI.click(findTestObject('Object Repository/Page_Documento/input_Preview_W0026W0007W0020ENTER'))
}

