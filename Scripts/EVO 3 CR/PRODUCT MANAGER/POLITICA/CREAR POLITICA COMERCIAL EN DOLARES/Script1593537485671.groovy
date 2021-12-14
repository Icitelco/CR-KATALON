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

WebUI.callTestCase(findTestCase('EVO 3 CR/LOGIN EVO 3 CR/LOGIN'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

WebUI.navigateToUrl('http://10.7.148.132:8080/SIGA-TG/servlet/wwpolitica')

WebUI.click(findTestObject('Object Repository/Page_Politicas Comerciales/input_Politicas Comerciales_INSERT'))

WebUI.delay(10)

String PoliticaNom = 'POLITICA KATALON PRUEBA'

WebUI.setText(findTestObject('Object Repository/Page_Politica Comercial/input_Nombre_W0027W0007W0009POLITICANOMBRE'), PoliticaNom)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Politica Comercial/select_'), '2', true)

String Concepto = CustomKeywords.'CREVO3_CONCEPTOFACASIG.CRPREP_Cliente_Numero'()

WebUI.setText(findTestObject('Object Repository/Page_Politica Comercial/input_Adicional Factura_W0027W0007W0009CPTO_d564c7'), 
    Concepto)

WebUI.selectOptionByValue(findTestObject('Page_Politica Comercial/select_CICLICOPRIMER AOFIRMAFIRMA INSTALACI_fce49f'), 
    'C', true)

WebUI.selectOptionByValue(findTestObject('Page_Politica Comercial/select_(Ninguno)1 CUOTA1 CUOTA CONTRATO1 CU_ffa9e4'), 
    '43', true)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Politica Comercial/input_Nueva fila_W0027W0007W0009ENTER'))

WebUI.click(findTestObject('Object Repository/Page_Politica Comercial/a_Precios'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Politica Comercial/input_Vencimiento 3_W0026W0007UPDATE'), 
    30)

WebUI.click(findTestObject('Object Repository/Page_Politica Comercial/input_Vencimiento 3_W0026W0007UPDATE'))

WebUI.click(findTestObject('Object Repository/Page_Politica Comercial/span_Nueva fila'))

mydate = new Date()

formattedDate = mydate.format('dd/MM/YYYY')

WebUI.setText(findTestObject('Object Repository/Page_Politica Comercial/input_Vencimiento 3_W0026W0007W0009POLITICA_95ff13'), 
    formattedDate)

WebUI.setText(findTestObject('Object Repository/Page_Politica Comercial/input_Vencimiento 3_W0026W0007W0009POLITICA_eb9a42'), 
    '120')

WebUI.setText(findTestObject('Object Repository/Page_Politica Comercial/input_Vencimiento 3_W0026W0007W0009POLITICA_da2593'), 
    '130')

WebUI.setText(findTestObject('Object Repository/Page_Politica Comercial/input_Vencimiento 3_W0026W0007W0009POLITICA_794b64'), 
    '130')

WebUI.click(findTestObject('Object Repository/Page_Politica Comercial/input_Nueva fila_W0026W0007W0009ENTER'))

WebUI.click(findTestObject('Object Repository/Page_Politica Comercial/span_Politica Comercial Precio_gxp0_cls'))

WebUI.click(findTestObject('Object Repository/Page_Politica Comercial/span_Productos'))

WebUI.click(findTestObject('Object Repository/Page_Politica Comercial/input_Histricos_W0027W0007INSERT'))

String Producto = CustomKeywords.'CRPREP_MAXPRODUCTONRO.CRPREP_Cliente_Numero'()

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Producto Politica/select_2017 SERVICIO DIGITAL2017 SERVICIO D_d634fd'), 
    Producto, true)

WebUI.click(findTestObject('Page_Producto Politica/input_Nueva fila_W0019W0007W0009ENTER'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_LISTA900 SERVICIOAECOM PAQUETE-/span_Sucursales'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_LISTA900 SERVICIOAECOM PAQUETE-/input_Histricos_W0027W0007INSERT'))

WebUI.click(findTestObject('Page_Politica Sucursal/input_Modo_W0024W0007W0009ENTER'))

