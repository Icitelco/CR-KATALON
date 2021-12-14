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

WebUI.callTestCase(findTestCase('PREPROD EVO 1/CLIENTE NUEVO/Cliente'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_PRUEBA AUTOGESTION PRUEBA/span_Contratos'))

WebUI.delay(5)

cliente = WebUI.getUrl()

WebUI.click(findTestObject('Object Repository/Page_PRUEBA AUTOGESTION PRUEBA/input_Histricos_W0030W0008CONTRATOAGREGAR'))

WebUI.delay(20)

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Registro de CRM - 360/span_Actualizar email y direccion de client_49a023'), 
    10)) {
    WebUI.click(findTestObject('Object Repository/Page_Registro de CRM - 360/span_Actualizar email y direccion de client_49a023'))
}

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Ingreso de Contratos/PROMOTOR'), '98238', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Ingreso de Contratos/REFERENTE'), '140', true)

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_Ingreso de Contratos/input_DevicePrdId_ELEGIRPRODUCTOS'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_Ingreso de Contratos/input_Aprovisionar_vSELECCIONADO_0001'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_Ingreso de Contratos/input_CABLE MODEM_vSELECCIONADO_0024'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_Ingreso de Contratos/input_TELEFONO_CONFIRMAR'))

WebUI.delay(20)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Ingreso de Contratos/POLITICA BASICO'), '1119', true)

WebUI.delay(7)

/*if(WebUI.verifyTextPresent('Aceptar', true)){
	System.out.println('Estoy aqui')
	
}
else {
	System.out.println('No estoy aqui')
}*/
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Ingreso de Contratos/select_(Ninguno)EXCLUSIVO COLABORADORES 100_7b644b'), 
    '9101', true)

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Ingreso de Contratos/select_(Ninguno)BASIC -- SERVICIO BASICO GA_be2c18'), 
    '1119', true)

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Page_Ingreso de Contratos/input__CONFIRMAR'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_Ingreso de Contratos/button_Aceptar_2'))

WebUI.delay(15)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Page_PRUEBA AUTOGESTION PRUEBA/img_CONECTADO_W0030W0008vDISPLAY_0002'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_2010047098/span_Contratos Adicionales'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_2010047098/input_INGRESADO_W0024W0008AGREGARADICIONAL'))

WebUI.delay(10)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Ingreso de Contratos Adicionales/PROMOTORR'), '98238', 
    true)

WebUI.click(findTestObject('Object Repository/Page_Ingreso de Contratos Adicionales/input_Page_ELEGIRPRODUCTOS'))

WebUI.delay(8)

WebUI.click(findTestObject('Object Repository/Page_Ingreso de Contratos Adicionales/input_Status_vSELECCIONADO_0001 (2)'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_Ingreso de Contratos Adicionales/input_ACTIVO_CONFIRMAR'))

WebUI.delay(10)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Ingreso de Contratos Adicionales/ADICIONAL POLITICA'), 
    '2812', true)

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_Ingreso de Contratos Adicionales/input_Page_CONFIRMAR'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Ingreso de Contratos/button_Aceptar_2'))

WebUI.delay(5)

WebUI.navigateToUrl(cliente)

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Page_PRUEBA AUTOGESTION PRUEBA/span_Ordenes'))

WebUI.takeScreenshot()

WebUI.callTestCase(findTestCase('PREPROD EVO 1/CLIENTE NUEVO/ORDENES'), [:], FailureHandling.CONTINUE_ON_FAILURE)



