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
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

WebUI.callTestCase(findTestCase('EVO 3 CR/LOGIN EVO 3 CR/LOGIN'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

WebUI.navigateToUrl('http://10.7.148.132:8080/SIGA-TG/servlet/wwproducto')

WebUI.click(findTestObject('Object Repository/Page_Productos/input_Productos_INSERT'))

WebUI.delay(10)

String Nombre = RandomStringUtils.randomAlphabetic(20)

WebUI.setText(findTestObject('Object Repository/Page_Producto/input_Nombre_W0027W0007W0009PRODUCTONOMBRE'), Nombre)

WebUI.setText(findTestObject('Object Repository/Page_Producto/input_Nombre Abreviado_W0027W0007W0009PRODU_93f7c6'), 'PRODUCTO PRUEBA KATALON')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Producto/select_CAMARAS SEGURIDADCLOUDDATOSINTERNETO_fdb96c'), 
    'OTR', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Producto/select_ADICIONAL ACCESORIOADICIONAL BBIADIC_27ac71'), 
    'B', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Producto/select_PRINCIPALSECUNDARIONO'), 'P', true)

WebUI.click(findTestObject('Object Repository/Page_Producto/input_Acepta Adicionales_W0027W0007W0009PRO_a13ff6'))

WebUI.click(findTestObject('Object Repository/Page_Producto/input_Genera corte de TAP_W0027W0007W0009ENTER'))

WebUI.delay(5)

WebUI.setText(findTestObject('Page_Productos/input_Nombre_vPRODUCTONOMBRE'), Nombre)

WebUI.click(findTestObject('Object Repository/Page_Productos/input_Filtros avanzados_SEARCHBUTTON'))

WebUI.click(findTestObject('Page_Productos/img_ID_vDISPLAY_0001'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Producto/span_Segmentos de Negocio'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Producto/input_Histricos_W0027W0007INSERT'))

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Producto Negocio Segmento/select_CORPORATIVODTHFONATELHOMEPYMESSEGMEN_a20c43'), 
    '1', true)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Producto Negocio Segmento/input_Negocio Segmento Producto Restringe T_86063c'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Producto/span_Sucursales'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Producto/input_Histricos_W0027W0007INSERT'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Producto Sucursal/input_Sucursal_W0024W0007W0009ENTER'))

