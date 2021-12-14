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

WebUI.navigateToUrl('http://10.7.148.132:8080/SIGA-TG/servlet/wwcliente')

CLIENTENRO = CustomKeywords.'CRPREP_CLIENTE_CON_INTERNET_RESIDENCIAL__12MB.CRPREP_Cliente_Numero'()

WebUI.delay(10)

WebUI.setText(findTestObject('Object Repository/Page_Clientes/input_Cliente Nro_vCLIENTENRO'), CLIENTENRO)

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_Clientes/input_Home Pack_SEARCHBUTTON'))

WebUI.click(findTestObject('Object Repository/Page_Clientes/a_CLIENTE'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_CLIENTE APELLIDO-A/span_Servicios'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_CLIENTE APELLIDO-A/input_Histricos_W0033W0007AGREGARSERVICIO'))

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Ingreso de Servicio de Clientee/select_NingunoCOBRO ARTICULOS NO RECUPERABL_6fe62f'), 
    '5', true)

WebUI.delay(10)

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Ingreso de Contratos/input_No_vE_GUARDAR'), 15)) {
    WebUI.click(findTestObject('Object Repository/span_Actualizar email y direccin de Cliente_17963a'))

    WebUI.delay(10)
}

WebUI.click(findTestObject('Object Repository/input_Contrato_vE_PROMPTCONTRATO'))

WebUI.delay(10)

WebUI.setText(findTestObject('Object Repository/Page_Ingreso de Servicio de Cliente1/input_Producto_vPRODUCTONOMBRE (1)'), 
    'INTERNET RESIDENCIAL 12 MEGAS')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Ingreso de Servicio de Cliente1/input_Producto_SEARCHBUTTON (1)'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Ingreso de Servicio de Cliente1/a_INTERNET RESIDENCIAL 12 MEGAS (1)'))

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Object Repository/select_(Ninguno)INTERNET 104 MBINTERNET 100_68b226'), '1459', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/select_(Ninguno)INTERNET 104 MBINTERNET 100_68b226'), '1459', 
    true)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/input_Codigo Postal_AGREGAR'))

WebUI.selectOptionByValue(findTestObject('Object Repository/select_(Ninguno)INTERNET 3 MB TV DIG3 MB RU_035e5c'), '0', true)

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Object Repository/select_(Ninguno)INTERNET 3 MB TV DIG3 MB RU_035e5c'), '7705', 
    true)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/input_Page_CONFIRMAR'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/button_Aceptar'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_CLIENTE APELLIDO-A/span_Contratos'))

WebUI.uncheck(findTestObject('Object Repository/input_Status Activos_W0033W0007vSTATUSACTIVOS'))

