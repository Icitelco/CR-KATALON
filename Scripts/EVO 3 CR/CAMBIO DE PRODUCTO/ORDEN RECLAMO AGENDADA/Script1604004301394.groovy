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

WebUI.callTestCase(findTestCase('EVO 3 CR/CAMBIO DE PRODUCTO/CREAR AGENDA ALEJUELA - 1ER DIA'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.navigateToUrl('http://10.7.148.132:8080/SIGA-TG/servlet/wwcliente')

//11905107
CLIENTENRO = CustomKeywords.'CRPRERP_CLIENTE_SIN_ORDEN_RECLAMO_PENDIENTE.CRPREP_Cliente_Numero'()

WebUI.setText(findTestObject('Object Repository/Page_Clientes/input_Cliente Nro_vCLIENTENRO'), CLIENTENRO)

WebUI.click(findTestObject('Object Repository/Page_Clientes/input_Home Pack_SEARCHBUTTON'))

WebUI.click(findTestObject('Object Repository/Page_Clientes/a_CLIENTE'))

WebUI.click(findTestObject('Page_CLIENTE APELLIDO-A/span_Ordenes'))

WebUI.click(findTestObject('Object Repository/Page_NICOLAS SILVERA PRUEBA/input_Pgina 1 de 1_W0033W0007RECLAMOTECNICO'))

WebUI.click(findTestObject('Page_Orden de Reclamo Tcnico_B/input_Contrato_W0029W0007W0009vPROMPTCONTRATO'))

WebUI.setText(findTestObject('Page_Orden de Reclamo Tcnico_B/input_Producto_vPRODUCTONOMBRE'), '2017 SERVICIO DIGITAL')

WebUI.click(findTestObject('Page_Orden de Reclamo Tcnico_B/input_Producto_SEARCHBUTTON'))

WebUI.click(findTestObject('Page_Orden de Reclamo Tcnico_B/a_2017 SERVICIO DIGITAL'))

WebUI.click(findTestObject('Page_Orden de Reclamo Tcnico_B/input_(Ninguno)_W0029W0007W0009vPROMPTMOTIVO1'))

WebUI.setText(findTestObject('Page_Orden de Reclamo Tcnico_B/input_Motivo Orden_vPRODTPOMOTIVOORDNOM'), 'DIGITAL HD-IMAGEN CONGELADA')

WebUI.click(findTestObject('Page_Orden de Reclamo Tcnico_B/input_Status_SEARCHBUTTON'))

WebUI.click(findTestObject('Page_Orden de Reclamo Tcnico_B/a_DIGITAL HD-IMAGEN CONGELADA'))

WebUI.click(findTestObject('Page_Orden de Reclamo Tcnico_B/img_Tcnico_W0029W0007W0009PROMPT_2356'))

WebUI.click(findTestObject('Page_Orden de Reclamo Tcnico_B/a_ATENCION EN OFICINA'))

WebUI.click(findTestObject('Page_Orden de Reclamo Tcnico_B/input_CRM Asociado_W0029W0007W0009ENTER'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_NICOLAS SILVERA PRUEBA/select_(Ninguno)INSTALACIONDESCONEXIONSERVI_985ee4'), 
    'R', true)

WebUI.click(findTestObject('Object Repository/Page_Cliente/input_Histricos_W0033W0007AGENDAR'))

WebUI.click(findTestObject('Object Repository/Page_Cliente/a_AVERIAS CATV'))

WebUI.click(findTestObject('Object Repository/Page_Cliente/a_8'))

WebUI.click(findTestObject('Object Repository/Page_Cliente/span_Agendar Ordenes de Cliente_gxp0_cls'))

