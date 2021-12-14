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

WebUI.callTestCase(findTestCase('PREPROD EVO 1/CLIENTE NUEVO/LOGIN'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_SIGA Software/span_Product Manager'))

WebUI.click(findTestObject('Object Repository/Page_SIGA Software/span_Promociones'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Promociones/input_Promociones_INSERT'))

WebUI.setText(findTestObject('Object Repository/Page_Promocin/input_Nombre_W0024W0008W0007PROMOCIONNOMBRE'), 'PROMOCION PRUEBA')

WebUI.setText(findTestObject('Object Repository/Page_Promocin/input_Nombre Cartelera_W0024W0008W0007PROMO_504531'), 'PROMOCION PRUEBA')

WebUI.click(findTestObject('Object Repository/Page_Promocin/input_Restriccin de Zona_W0024W0008W0007ENTER'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Page_Promociones/input_Nombre_vPROMOCIONNOMBRE'), 'PROMOCION PRUEBA')

WebUI.click(findTestObject('Object Repository/Page_Promociones/input_Clase_SEARCHBUTTON'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Page_Promociones/img_Estado_vDISPLAY_0001'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_PROMOCION PRUEBA/span_Productos y Polticas'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_PROMOCION PRUEBA/input_Histricos_W0024W0008INSERT'))

WebUI.click(findTestObject('Object Repository/Page_Producto Politica Promocion/img_Producto_W0018W0008W0007PROMPT_12_1574'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Page_Producto Politica Promocion/input_Nombre_vPRODUCTONOMBRE'), 'PRODUCTO PRUEBA')

WebUI.click(findTestObject('Object Repository/Page_Producto Politica Promocion/input_Producto Tipo_SEARCHBUTTON'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Producto Politica Promocion/a_PRODUCTO PRUEBA'))

WebUI.click(findTestObject('Object Repository/Page_Producto Politica Promocion/input_Politica Comercial_W0018W0008W0007vPR_2592c2'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Page_Producto Politica Promocion/input_Politica Comercial_vPOLITICANOMBRE'), 
    'POLITICA PRUEBA')

WebUI.click(findTestObject('Object Repository/Page_Producto Politica Promocion/input_Politica Comercial_SEARCHBUTTON'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Producto Politica Promocion/a_POLITICA PRUEBA'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Page_Producto Politica Promocion/input_Prioridad de Aplicacin_W0018W0008W0007ENTER'))

