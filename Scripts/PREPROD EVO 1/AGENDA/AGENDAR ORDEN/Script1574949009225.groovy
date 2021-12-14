import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.sql.Connection as Connection
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('PREPROD EVO 1/CLIENTE NUEVO/LOGIN'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_SIGA Software/span_Gestin Comercial'))

WebUI.click(findTestObject('Object Repository/Page_SIGA Software/span_Clientes'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Page_Clientes/input_Cliente Nro_vCLIENTENRO'), '5')

//WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Clientes/select_INGRESADOPENDIENTEEMITIDOCONECTADODE_890a74'), 
//  'C', true)
WebUI.click(findTestObject('Object Repository/Page_Clientes/input_Home Pack_SEARCHBUTTON'))

WebUI.delay(15)

WebUI.click(findTestObject('Object Repository/Page_Clientes/img_Cantidad facturas_vDISPLAY_0001'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_ANA BORDALLO ABAD/span_Contratos'))

url = WebUI.getUrl()

WebUI.click(findTestObject('Object Repository/Page_ANA BORDALLO ABAD/input_Histricos_W0030W0008CONTRATOAGREGAR'))

WebUI.delay(20)

WebUI.click(findTestObject('Object Repository/Page_Registro de CRM - 360/span_Actualizar email y direccion de client_49a023'))

WebUI.delay(5)

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

WebUI.navigateToUrl(url)

WebUI.click(findTestObject('Object Repository/Page_ANA BORDALLO ABAD/span_Ordenes'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Page_ANA BORDALLO ABAD/input_Histricos_W0030W0008AGENDAR'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Page_ANA BORDALLO ABAD/a_INSTALACION TV'))

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Page_ANA BORDALLO ABAD/a_11'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_ANA BORDALLO ABAD/span_Agendar Ordenes de Cliente_gxp0_cls'))

WebUI.delay(5)

WebUI.takeScreenshot()

a = WebUI.getText(findTestObject('Object Repository/Page_PRUEBA AUTOGESTION PRUEBA/CLIENTENRO'))

WebUI.click(findTestObject('Object Repository/Page_PRUEBA AUTOGESTION PRUEBA/span_Gestin Operativa'))

WebUI.click(findTestObject('Object Repository/Page_PRUEBA AUTOGESTION PRUEBA/span_Ordenes de Servicio'))

WebUI.delay(15)

WebUI.setText(findTestObject('Object Repository/Page_Ordenes de Servicio/input_Cliente Nro_vCLIENTENROORD'), a)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Ordenes de Servicio/input_Forma Generada_SEARCHBUTTON'))

