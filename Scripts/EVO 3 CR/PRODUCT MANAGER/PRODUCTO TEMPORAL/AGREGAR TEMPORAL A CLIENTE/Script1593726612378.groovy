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

WebUI.callTestCase(findTestCase('EVO 3 CR/LOGIN EVO 3 CR/LOGIN'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.navigateToUrl('http://10.7.148.132:8080/SIGA-TG/servlet/wwcliente')

String CLIENTE = CustomKeywords.'CRPREP_CLIENTE_CON_PRODUCTO_DE_TEMPORAL.CRPREP_Cliente_Numero'()

if (CLIENTE == null) {
    WebUI.closeBrowser()

    WebUI.callTestCase(findTestCase('EVO 3 CR/PRODUCT MANAGER/CREAR CLIENTE CON PRODUCTO CREADO/CREAR CLIENTE'), [:], FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.closeBrowser()

    WebUI.callTestCase(findTestCase('EVO 3 CR/PRODUCT MANAGER/CREAR CLIENTE CON PRODUCTO CREADO/CONTRATO CLIENTE'), [:], 
        FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.closeBrowser()

    WebUI.callTestCase(findTestCase('EVO 3 CR/PRODUCT MANAGER/PRODUCTO TEMPORAL/AGREGAR PRODUCTO TEMPORAL A PRODUCTO'), 
        [:], FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.closeBrowser()

    WebUI.callTestCase(findTestCase('EVO 3 CR/PRODUCT MANAGER/PRODUCTO TEMPORAL/AGREGAR TEMPORAL A CLIENTE'), [:], FailureHandling.CONTINUE_ON_FAILURE)
} else {
    WebUI.setText(findTestObject('Page_Clientes/input_Cliente Nro_vCLIENTENRO'), CLIENTE)

    WebUI.click(findTestObject('Object Repository/Page_Clientes/input_Home Pack_SEARCHBUTTON'))

    WebUI.click(findTestObject('Object Repository/Page_Clientes/img_Cantidad facturas_vDISPLAY_0001'))

    WebUI.click(findTestObject('Object Repository/Page_Cliente/span_Contratos'))

    WebUI.delay(5)

    String ContratoNro = CustomKeywords.'CRPRERP_CONTRATO_DE_CLIENTE_CON_TEMPORAL.CRPREP_Cliente_Numero'(CLIENTE)

    WebUI.delay(5)

    WebUI.setText(findTestObject('Object Repository/Page_PRUEBA APELLIDO/input_Nro_W0033W0007vCONTRATONRO'), ContratoNro)

    WebUI.delay(5)

    WebUI.click(findTestObject('Object Repository/Page_PRUEBA APELLIDO/input_Status_W0033W0007SEARCHBUTTON'))

    WebUI.delay(5)

    WebUI.click(findTestObject('Object Repository/Page_PRUEBA APELLIDO/img_Navega Plus_W0033W0007vDISPLAY_0001'))

    WebUI.delay(5)

    WebUI.click(findTestObject('Object Repository/Page_27341507/span_Productos Temporales'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.delay(5)

    WebUI.click(findTestObject('Object Repository/Page_27341507/span_Productos Temporales'))

    WebUI.delay(5)

    WebUI.click(findTestObject('Object Repository/Page_27341507/input_Pgina 0 de 0_W0026W0007AGREGARPRODUCT_461540'))

    WebUI.delay(5)

    String NombreProd = CustomKeywords.'CRPREP_NOMBRE_PRODUCTOTEMPORAL.CRPREP_Cliente_Numero'()

    WebUI.delay(5)

    WebUI.setText(findTestObject('Object Repository/Page_27341507/input_Nombre_vE_FILTROPRODUCTOTEMPORALNOMBRE'), NombreProd)

    WebUI.delay(5)

    WebUI.click(findTestObject('Object Repository/Page_27341507/input_Nombre_BUTTON1'))

    WebUI.delay(5)

    WebUI.click(findTestObject('Object Repository/Page_27341507/input_Hora de Corte_vE_SELPROD_0001'))

    WebUI.delay(5)

    WebUI.click(findTestObject('Object Repository/Page_27341507/input_Hora Inicio_CONFIRMAR'))

    WebUI.delay(5)

    WebUI.click(findTestObject('Object Repository/Page_27341507/input_Hora Inicio_CONFIRMAR'))
}

