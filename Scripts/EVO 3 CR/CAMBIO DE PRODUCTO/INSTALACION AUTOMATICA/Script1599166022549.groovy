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

String CLIENTENRO = CustomKeywords.'CRPREP_CLIENTE_CON_INTERNET_RESIDENCIAL__6MB_ALAJUELA.CRPREP_Cliente_Numero'()

WebUI.setText(findTestObject('Object Repository/Page_Clientes/input_Cliente Nro_vCLIENTENRO'), CLIENTENRO)

WebUI.click(findTestObject('Object Repository/Page_Clientes/input_Home Pack_SEARCHBUTTON'))

WebUI.click(findTestObject('Object Repository/Page_Clientes/img_Cantidad facturas_vDISPLAY_0001'))

WebUI.click(findTestObject('Object Repository/span_Contratos'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Cliente/select_(Ninguno)ADDON ANDROIDADICION ANDROI_ea54b9'), 
    'C', true)

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/span_Servicios'))

WebUI.click(findTestObject('Object Repository/input_Histricos_W0033W0007AGREGARSERVICIO'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Ingreso de Servicio de Clientee/select_NingunoCOBRO ARTICULOS NO RECUPERABL_6fe62f'), 
    '5', true)

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Ingreso de Contratos/input_No_vE_GUARDAR'), 15)) {
    WebUI.click(findTestObject('Object Repository/span_Actualizar email y telfono del cliente_658fac'))

    WebUI.delay(5)
}

WebUI.click(findTestObject('Object Repository/Page_Ingreso de Servicio de Clientee/input_Contrato_vE_PROMPTCONTRATO'))

WebUI.setText(findTestObject('Object Repository/Page_Ingreso de Servicio de Clientee/input_Producto_vPRODUCTONOMBRE'), 'INTERNET RESIDENCIAL 6 MEGAS')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Ingreso de Servicio de Clientee/a_INTERNET RESIDENCIAL 25 MEGAS'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Ingreso de Servicio de Clientee/select_(Ninguno)INTERNET 1MB COVIDINTERNET _1e49dc'), 
    '1463', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Ingreso de Servicio de Clientee/select_(Ninguno)INTERNET 1MB COVIDINTERNET _1e49dc'), 
    '1463', true)

WebUI.click(findTestObject('Object Repository/Page_Ingreso de Servicio de Clientee/input_Codigo Postal_AGREGAR'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Ingreso de Contratos por Cambio de Producto/select_(Ninguno)INTERNET RESIDENCIAL 50MB -_d3e496'), 
    '15658', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Ingreso de Contratos por Cambio de Producto/select_(Ninguno)INTERNET RESIDENCIAL 50MB -_d3e496'), 
    '15658', true)

WebUI.click(findTestObject('Object Repository/Page_Ingreso de Contratos por Cambio de Producto/input_Page_CONFIRMAR'))

WebUI.click(findTestObject('Object Repository/Page_Ingreso de Contratos por Cambio de Producto/button_Aceptar'))

WebUI.click(findTestObject('Object Repository/span_Contratos'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Cliente/select_(Ninguno)ADDON ANDROIDADICION ANDROI_ea54b9'), 
    'C', true)

WebUI.click(findTestObject('Object Repository/Page_PRUEBA COHETE APELLIDO/input_Status Activos_W0033W0007vSTATUSACTIVOS'))

WebUI.click(findTestObject('Object Repository/span_Ordenes'))

