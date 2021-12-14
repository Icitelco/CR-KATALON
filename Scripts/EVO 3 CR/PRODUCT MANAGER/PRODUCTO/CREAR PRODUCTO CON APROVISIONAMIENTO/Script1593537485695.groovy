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

String Nombre = RandomStringUtils.randomAlphabetic(10)

WebUI.navigateToUrl('http://10.7.148.132:8080/SIGA-TG/servlet/wwproducto')

WebUI.click(findTestObject('Object Repository/Page_Productos/input_Productos_INSERT'))

//CAMBIAR SIEMPRE EL NOMBRE
WebUI.setText(findTestObject('Object Repository/Page_Producto/input_Nombre_W0027W0007W0009PRODUCTONOMBRE'), Nombre)

WebUI.setText(findTestObject('Object Repository/Page_Producto/input_Nombre Abreviado_W0027W0007W0009PRODU_93f7c6'), 'PRODUCTO PRUEBA')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Producto/select_CAMARAS SEGURIDADCLOUDDATOSINTERNETO_fdb96c'), 
    'OTR', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Producto/select_ADICIONAL ACCESORIOADICIONAL BBIADIC_27ac71'), 
    'C', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Producto/select_PRINCIPALSECUNDARIONO'), 'P', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Producto/select_NODECODERCABLE MODEMTELEFONOARTICULO_03c8c8'), 
    'C', true)

WebUI.click(findTestObject('Object Repository/Page_Producto/input_Genera corte de TAP_W0027W0007W0009ENTER'))

WebUI.delay(5)

WebUI.setText(findTestObject('Page_Productos/input_Nombre_vPRODUCTONOMBRE'), Nombre)

WebUI.click(findTestObject('Object Repository/Page_Productos/input_Filtros avanzados_SEARCHBUTTON'))

WebUI.click(findTestObject('Page_Productos/img_ID_vDISPLAY_0001'))

WebUI.click(findTestObject('Object Repository/Page_Producto/span_Segmentos de Negocio'))

WebUI.click(findTestObject('Object Repository/Page_Producto/input_Histricos_W0027W0007INSERT'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Producto Negocio Segmento/select_CORPORATIVODTHFONATELHOMEPYMESSEGMEN_a20c43'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Page_Producto Negocio Segmento/input_Negocio Segmento Producto Restringe T_86063c'))

WebUI.click(findTestObject('Object Repository/Page_Producto/span_Sucursales'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Producto/input_Histricos_W0027W0007INSERT'))

WebUI.click(findTestObject('Object Repository/Page_Producto Sucursal/input_Sucursal_W0024W0007W0009ENTER'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_LNIQWMILEY/span_Materiales'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_LNIQWMILEY/input_Histricos_W0027W0007INSERT'))

WebUI.setText(findTestObject('Object Repository/Page_Producto Material/input_Material_W0024W0007W0009MATERIALNOMBRE'), 'CMODEM')

String ArticuloID=CustomKeywords.'CRPRERP_ARTICULO_CABLEMODEM.CRPREP_Cliente_Numero'()

WebUI.click(findTestObject('Object Repository/Page_Producto Material/input_Obligatorio_W0024W0007W0009MATERIALOB_87662a'))

WebUI.setText(findTestObject('Object Repository/Page_Producto Material/input_Activo para instalacion_W0024W0007W00_72e6c8'),ArticuloID)

WebUI.click(findTestObject('Object Repository/Page_Producto Material/input_Nueva fila_W0024W0007W0009ENTER'))

