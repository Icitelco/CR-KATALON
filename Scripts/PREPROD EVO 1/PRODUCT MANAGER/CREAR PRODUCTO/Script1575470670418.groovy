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

WebUI.click(findTestObject('Object Repository/Page_SIGA Software/span_Productos'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Productos/input_Productos_INSERT'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Page_Producto/input_Nombre_W0024W0008W0007PRODUCTONOMBRE'), 'PRODUCTO PRUEBA')

WebUI.setText(findTestObject('Object Repository/Page_Producto/input_Nombre Abreviado_W0024W0008W0007PRODU_1e4508'), 'PRUEBA')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Producto/select_CAMARAS SEGURIDADCLOUDDATOSINTERNETO_fdb96c'), 
    'INT', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Producto/select_ADICIONAL ACCESORIOADICIONAL BBIADIC_27ac71'), 
    'B', true)

WebUI.setText(findTestObject('Object Repository/Page_Producto/input_Cantidad Mxima_W0024W0008W0007PRODUCT_9fdaf2'), '1')

WebUI.setText(findTestObject('Object Repository/Page_Producto/input_Cantidad Mxima_W0024W0008W0007PRODUCT_9fdaf2'), '1')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Producto/input_Genera corte de TAP_W0024W0008W0007ENTER'))

WebUI.setText(findTestObject('Object Repository/Page_Productos/input_Nombre_vPRODUCTONOMBRE'), '%PRODUCTO PRUEBA%')

WebUI.click(findTestObject('Object Repository/Page_Productos/input_Productos_REFRESH'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Page_Productos/img_ID_vDISPLAY_0001'))

WebUI.takeScreenshot()

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_PRODUCTO PRUEBA/span_Politicas Comerciales'))

WebUI.delay(7)

WebUI.click(findTestObject('Object Repository/Page_PRODUCTO PRUEBA/input_Histricos_W0024W0008INSERT'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Producto Politica/input_Poltica Comercial_W0018W0008W0007vPRO_07294b'))

WebUI.delay(15)

WebUI.setText(findTestObject('Object Repository/Page_Producto Politica/input_Politica Comercial_vPOLITICANOMBRE'), 'POLITICA PRUEBA')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Producto Politica/input_Politica Comercial_SEARCHBUTTON'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Producto Politica/a_POLITICA PRUEBA'))

WebUI.click(findTestObject('Object Repository/Page_Producto Politica/input_Nueva fila_W0018W0008W0007ENTER'))

WebUI.delay(5)

WebUI.takeScreenshot()

