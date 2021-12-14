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

WebUI.setText(findTestObject('Object Repository/Page_Politica Comercial/input_Nombre_W0027W0007W0009POLITICANOMBRE'), 'POLITICAA PRUEBA')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Politica Comercial/select_'), '1', true)

WebUI.setText(findTestObject('Object Repository/Page_Politica Comercial/input_Adicional Factura_W0027W0007W0009CPTO_d564c7'), 
    '9999')

WebUI.click(findTestObject('Object Repository/Page_Politica Comercial/input_Nueva fila_W0027W0007W0009ENTER'))

WebUI.click(findTestObject('Object Repository/Page_Politica Comercial/a_Precios'))

WebUI.click(findTestObject('Object Repository/Page_Politica Comercial/input_Vencimiento 3_W0026W0007UPDATE'))

WebUI.click(findTestObject('Object Repository/Page_Politica Comercial/span_Nueva fila'))

WebUI.setText(findTestObject('Object Repository/Page_Politica Comercial/input_Vencimiento 3_W0026W0007W0009POLITICA_95ff13'), 
    '12/03/2020')

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

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Producto Politica/select_2017 SERVICIO DIGITAL2017 SERVICIO D_d634fd'), 
    '4013', true)

WebUI.click(findTestObject('Page_Producto Politica/input_Nueva fila_W0019W0007W0009ENTER'))

