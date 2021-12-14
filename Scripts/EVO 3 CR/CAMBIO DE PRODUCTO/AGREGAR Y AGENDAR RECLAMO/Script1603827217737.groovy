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

WebUI.callTestCase(findTestCase('EVO 3 CR/CAMBIO DE PRODUCTO/CREAR AGENDA ALEJUELA - 1ER DIA'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.navigateToUrl('http://10.7.148.132:8080/SIGA-TG/servlet/wwcliente')

CLIENTENRO = CustomKeywords.'CRPRERP_CLIENTE_SIN_ORDEN_RECLAMO_PENDIENTE.CRPREP_Cliente_Numero'()

WebUI.setText(findTestObject('Object Repository/Page_Clientes/input_Cliente Nro_vCLIENTENRO'), CLIENTENRO)

WebUI.click(findTestObject('Object Repository/Page_Clientes/input_Home Pack_SEARCHBUTTON'))

WebUI.click(findTestObject('Object Repository/Page_Clientes/a_CLIENTE'))

WebUI.click(findTestObject('Object Repository/Page_CLIENTE APELLIDO-A/span_Ordenes'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_PRUEBA CR CLIENTE HOME/input_Pgina 1 de 1_W0033W0007RECLAMOTECNICO'))

WebUI.click(findTestObject('Page_Orden de Reclamo Tcnico_B/input_Contrato_W0029W0007W0009vPROMPTCONTRATO'))

WebUI.click(findTestObject('Object Repository/Page_Orden de Reclamo Tcnico/a_1003'))

WebUI.click(findTestObject('Page_Orden de Reclamo Tcnico_B/input_(Ninguno)_W0029W0007W0009vPROMPTMOTIVO1'))

WebUI.setText(findTestObject('Object Repository/Page_Orden de Reclamo Tcnico/input_Motivo Orden_vPRODTPOMOTIVOORDNOM'), 
    'TV-IMAGEN CONGELADA')

WebUI.click(findTestObject('Object Repository/Page_Orden de Reclamo Tcnico/input_Status_SEARCHBUTTON'))

WebUI.click(findTestObject('Page_Orden de Reclamo Tcnico/a_TV-IMAGEN CONGELADA'))

WebUI.delay(10)

WebUI.click(findTestObject('Page_Orden de Reclamo Tcnico_B/input_CRM Asociado_W0029W0007W0009ENTER'))

WebUI.click(findTestObject('Object Repository/Page_CLIENTE APELLIDO-A/input_Niveles CModem_W0033W0007AGENDAR'))

WebUI.click(findTestObject('Object Repository/Page_CLIENTE APELLIDO-A/div_Agendar Ordenes de Cliente'))

WebUI.click(findTestObject('Object Repository/Page_CLIENTE APELLIDO-A/a_ADENDUM INTERNET'))

WebUI.click(findTestObject('Object Repository/Page_CLIENTE APELLIDO-A/a_3'))

WebUI.click(findTestObject('Object Repository/Page_CLIENTE APELLIDO-A/span_Agendar Ordenes de Cliente_gxp0_cls'))

