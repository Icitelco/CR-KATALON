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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

WebUI.callTestCase(findTestCase('EVO 3 CR/LOGIN EVO 3 CR/LOGIN'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

WebUI.navigateToUrl('http://10.7.148.132:8080/SIGA-TG/servlet/wwcliente')

String CLIENTE = CustomKeywords.'CLIENTE_CONECTADO.CRPREP_Cliente_Numero'()

WebUI.delay(5)

WebUI.setText(findTestObject('Page_Clientes/input_Cliente Nro_vCLIENTENRO'), CLIENTE)

WebUI.delay(5)

WebUI.click(findTestObject('Page_Clientes/input_Home Pack_SEARCHBUTTON'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Clientes/img_Cantidad facturas_vDISPLAY_0001'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Cliente/span_Servicios'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_ANA BORDALLO ABAD/input_Histricos_W0033W0007AGREGARSERVICIO'))

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Ingreso de Servicio de Clientee/select_NingunoCOBRO ARTICULOS NO RECUPERABL_6fe62f'), 
    '1', true)

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Page_Ingreso de Servicio de Clientee/select_FALTA DE PAGO CORPORATIVOMIGRACION A_411bf6'), 
    '349', true)

WebUI.delay(5)

WebUI.click(findTestObject('Page_Ingreso de Servicio de Clientee/input_Codigo Postal_AGREGAR'))

WebUI.delay(5)

WebUI.navigateToUrl('http://10.7.148.132:8080/SIGA-TG/servlet/wwcliente')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Clientes/img_Cantidad facturas_vDISPLAY_0001'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Cliente/span_Servicios'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_ANA BORDALLO ABAD/input_Histricos_W0033W0007AGREGARSERVICIO'))

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Ingreso de Servicio de Clientee/select_NingunoCOBRO ARTICULOS NO RECUPERABL_6fe62f'), 
    '1', true)

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Page_Ingreso de Servicio de Clientee/select_FALTA DE PAGO CORPORATIVOMIGRACION A_411bf6'), 
    '349', true)

WebUI.click(findTestObject('Page_Ingreso de Servicio de Clientee/input_Codigo Postal_AGREGAR'))

WebUI.takeFullPageScreenshot()

