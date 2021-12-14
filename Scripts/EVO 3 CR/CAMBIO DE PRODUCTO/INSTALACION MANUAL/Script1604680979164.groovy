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
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('EVO 3 CR/LOGIN EVO 3 CR/LOGIN'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.navigateToUrl('http://10.7.148.132:8080/SIGA-TG/servlet/wwcliente')

CLIENTENRO = CustomKeywords.'CRPREP_CLIENTE_CON_INTERNET_RESIDENCIAL_4_MEGAS.CRPREP_Cliente_Numero'()

WebUI.setText(findTestObject('Object Repository/Page_Clientes/input_Cliente Nro_vCLIENTENRO'), CLIENTENRO)

WebUI.click(findTestObject('Object Repository/Page_Clientes/input_Home Pack_SEARCHBUTTON'))

WebUI.click(findTestObject('Object Repository/Page_Clientes/a_CLIENTE'))

WebUI.click(findTestObject('Object Repository/Page_CLIENTE APELLIDO/span_Servicios'))

WebUI.click(findTestObject('Object Repository/Page_CLIENTE APELLIDO/input_Histricos_W0033W0007AGREGARSERVICIO'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Ingreso de Servicio de Clientee/select_NingunoCOBRO ARTICULOS NO RECUPERABL_6fe62f'), 
    '5', true)

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Ingreso de Contratos/input_No_vE_GUARDAR'), 15)) {
    WebUI.click(findTestObject('Object Repository/span_Actualizar email y direccin de Cliente_17963a'))

    WebUI.delay(5)
}

WebUI.click(findTestObject('Object Repository/Page_Ingreso de Servicio de Cliente/input_Contrato_vE_PROMPTCONTRATO'))

WebUI.setText(findTestObject('Object Repository/Page_Ingreso de Servicio de Cliente1/input_Producto_vPRODUCTONOMBRE (1)'), 
    'INTERNET RESIDENCIAL 4 MEGAS')

WebUI.click(findTestObject('Object Repository/Page_Ingreso de Servicio de Cliente1/input_Producto_SEARCHBUTTON (1)'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_Ingreso de Servicio de Cliente/a_2017 SERVICIO DIGITAL (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Ingreso de Servicio de Cliente/select_(Ninguno)2017 SERVICIO DIGITAL BASIC_ca42eb'), 
    '3006', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Ingreso de Servicio de Cliente/select_(Ninguno)2017 SERVICIO DIGITAL BASIC_ca42eb'), 
    '3006', true)

WebUI.click(findTestObject('Object Repository/Page_Ingreso de Servicio de Cliente/input_Codigo Postal_AGREGAR'))

WebUI.navigateToUrl('http://10.7.148.132:8080/SIGA-TG/servlet/wwcliente')

WebUI.click(findTestObject('Object Repository/Page_Clientes/a_CLIENTE'))

WebUI.click(findTestObject('Object Repository/Page_Cliente/span_Contratos'))

Contratonro = CustomKeywords.'CRPREP_CONTRATO_DE_CLIENTE_PLAN_COMERCIAL.CRPREP_Cliente_Numero'(CLIENTENRO)

WebUI.setText(findTestObject('Page_CLIENTE APELLIDO-A/input_Nro_W0033W0007vCONTRATONRO'), Contratonro)

WebUI.click(findTestObject('Page_CLIENTE APELLIDO-A/input_Status_W0033W0007SEARCHBUTTON'))

WebUI.click(findTestObject('Page_CLIENTE APELLIDO-A/a_TV DIGITAL  30MB    1'))

WebUI.click(findTestObject('Object Repository/Page_Cliente/input__ELIMINARPLAN'))

WebUI.click(findTestObject('Page_CLIENTE APELLIDO-A/input_Abono Mensual_CONFIRMAELIMINAR'))

WebUI.click(findTestObject('Page_CLIENTE APELLIDO-A/button_Aceptar'))

WebUI.click(findTestObject('Page_CLIENTE APELLIDO-A/span_Plan Comercial de Cliente_gxp0_cls'))

WebUI.click(findTestObject('Object Repository/Page_NICOLAS SILVERA PRUEBA/span_Servicios'))

WebUI.click(findTestObject('Object Repository/Page_NICOLAS SILVERA PRUEBA/input_Histricos_W0033W0007AGREGARSERVICIO'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Ingreso de Servicio de Clientee/select_NingunoCOBRO ARTICULOS NO RECUPERABL_6fe62f'), 
    '5', true)

WebUI.delay(10)

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Ingreso de Contratos/input_No_vE_GUARDAR'), 15)) {
    WebUI.click(findTestObject('Object Repository/Page_Ingreso de Contratos/input_No_vE_GUARDAR'))
}

WebUI.click(findTestObject('Object Repository/Page_Ingreso de Servicio de Cliente/input_Contrato_vE_PROMPTCONTRATO'))

WebUI.setText(findTestObject('Object Repository/Page_Ingreso de Servicio de Cliente1/input_Producto_vPRODUCTONOMBRE (1)'), 
    'INTERNET RESIDENCIAL 4 MEGAS')

WebUI.click(findTestObject('Object Repository/Page_Ingreso de Servicio de Cliente1/input_Producto_SEARCHBUTTON (1)'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_Ingreso de Servicio de Cliente/a_2017 SERVICIO DIGITAL (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Ingreso de Servicio de Cliente/select_(Ninguno)2017 SERVICIO DIGITAL BASIC_ca42eb'), 
    '3006', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Ingreso de Servicio de Cliente/select_(Ninguno)2017 SERVICIO DIGITAL BASIC_ca42eb'), 
    '3006', true)

WebUI.click(findTestObject('Object Repository/Page_Ingreso de Servicio de Cliente/input_Codigo Postal_AGREGAR'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Ingreso de Contratos por Cambio de Producto/select_(Ninguno)SERVICIO HD DVBDIGITAL HD -_30e162'), 
    '10035', true)

WebUI.click(findTestObject('Object Repository/Page_Ingreso de Contratos por Cambio de Producto/input_Page_CONFIRMAR'))

WebUI.click(findTestObject('Object Repository/Page_Ingreso de Contratos por Cambio de Producto/button_Aceptar'))

WebUI.click(findTestObject('Page_CLIENTE APELLIDO-A/span_Ordenes'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_Cliente/span_Contratos_1'))

WebUI.delay(10)

WebUI.setText(findTestObject('Object Repository/Page_Cliente/input_Nro_W0033W0007vCONTRATONRO'), ' ')

