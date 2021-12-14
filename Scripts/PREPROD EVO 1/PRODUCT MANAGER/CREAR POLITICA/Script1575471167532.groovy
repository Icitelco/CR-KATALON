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
import java.text.SimpleDateFormat
import groovy.json.internal.Dates
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('PREPROD EVO 1/CLIENTE NUEVO/LOGIN'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_SIGA Software/span_Product Manager'))

WebUI.click(findTestObject('Object Repository/Page_SIGA Software/span_Politicas Comerciales'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Politicas Comerciales/input_Politicas Comerciales_INSERT'))

WebUI.setText(findTestObject('Object Repository/Page_Politica Comercial/input_Nombre_W0024W0008W0007POLITICANOMBRE'), 'POLITICA PRUEBA')

WebUI.click(findTestObject('Object Repository/Page_Politica Comercial/img_Adicional Factura_W0024W0008W0007PROMPT_33efb0'))

WebUI.delay(7)

WebUI.setText(findTestObject('Object Repository/Page_Politica Comercial/input_Nombre_vCPTOFACNOMBRE'), 'CONCEPTO PRUEBA')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Page_Politica Comercial/a_CONCEPTO PRUEBA'))

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Politica Comercial/select_CICLICOPRIMER AOFIRMAFIRMA INSTALACI_fce49f'), 
    'C', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Politica Comercial/select_(Ninguno)1 CUOTA1 CUOTA CONTRATO1 CU_ffa9e4'), 
    '35', true)

WebUI.click(findTestObject('Object Repository/Page_Politica Comercial/input_Nueva fila_W0024W0008W0007ENTER'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_POLITICA PRUEBA/a_Precios'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_POLITICA PRUEBA/input_Vencimiento 3_W0024W0008UPDATE'))

WebUI.click(findTestObject('Object Repository/Page_POLITICA PRUEBA/span_Nueva fila'))

WebUI.setText(findTestObject('Object Repository/Page_POLITICA PRUEBA/input_Vencimiento 3_W0024W0008W0007POLITICA_c73db3'), 
    '04/12/2019')

WebUI.setText(findTestObject('Object Repository/Page_POLITICA PRUEBA/input_Vencimiento 3_W0024W0008W0007POLITICA_fda29e'), 
    '10000')

WebUI.click(findTestObject('Object Repository/Page_POLITICA PRUEBA/input_Nueva fila_W0024W0008W0007ENTER'))

WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_POLITICA PRUEBA/span_Politica Comercial Precio_gxp0_cls'))

WebUI.delay(3)

