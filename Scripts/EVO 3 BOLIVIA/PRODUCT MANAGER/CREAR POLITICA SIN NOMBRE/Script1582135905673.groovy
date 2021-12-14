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

WebUI.callTestCase(findTestCase('EVO 3 BOLIVIA/LOGIN EVO 3'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

WebUI.navigateToUrl('https://192.168.1.115/SIGA-BO/servlet/wwpolitica')

WebUI.click(findTestObject('Object Repository/Page_Politicas Comerciales/input_Politicas Comerciales_INSERT'))

WebUI.click(findTestObject('Object Repository/Page_Politica Comercial/img_Adicional Factura_W0027W0007W0009PROMPT_86034c'))

WebUI.setText(findTestObject('Object Repository/BOLIVIA/input_Nombre_vCPTOFACNOMBRE'), 'CONCEPTO FAC PRUEBA')

WebUI.click(findTestObject('Object Repository/BOLIVIA/a_CONCEPTO PRUEBA'))

WebUI.click(findTestObject('Object Repository/BOLIVIA/a_CONCEPTO PRUEBA'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Politica Comercial/select_CICLICOPRIMER AOFIRMAFIRMA INSTALACION'), 
    'C', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Politica Comercial/select_(Todos)1 CUOTA1 CUOTA CONTRATO1 CUOT_fe132b'), 
    '12', true)

WebUI.click(findTestObject('Object Repository/Page_Politica Comercial/input_Nueva fila_W0027W0007W0009ENTER'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Politica Comercial/a_Precios'))

WebUI.click(findTestObject('Object Repository/Page_Politica Comercial/input_Vencimiento 3_W0026W0007UPDATE'))

WebUI.click(findTestObject('Object Repository/Page_Politica Comercial/span_Nueva fila'))

WebUI.setText(findTestObject('Object Repository/Page_Politica Comercial/input_Vencimiento 3_W0026W0007W0009POLITICA_95ff13'), 
    '19/02/2020')

WebUI.setText(findTestObject('Object Repository/Page_Politica Comercial/input_Vencimiento 3_W0026W0007W0009POLITICA_eb9a42'), 
    '150')

WebUI.setText(findTestObject('Object Repository/Page_Politica Comercial/input_Vencimiento 3_W0026W0007W0009POLITICA_da2593'), 
    '170')

WebUI.setText(findTestObject('Object Repository/Page_Politica Comercial/input_Vencimiento 3_W0026W0007W0009POLITICA_794b64'), 
    '180')

WebUI.click(findTestObject('Object Repository/Page_Politica Comercial/input_Nueva fila_W0026W0007W0009ENTER'))

WebUI.click(findTestObject('Object Repository/Page_Politica Comercial/span_Politica Comercial Precio_gxp0_cls'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Politica Comercial/span_Productos'))

WebUI.click(findTestObject('Object Repository/Page_Politica Comercial/input_Bonificaciones_W0027W0007INSERT'))

WebUI.click(findTestObject('Object Repository/Page_Producto Politica/img_Producto_W0019W0007W0009PROMPT_1574'))

WebUI.setText(findTestObject('Page_Producto Politica/input_Nombre_vPRODUCTONOMBRE'), 'PRODUCTO PRUEBA')

WebUI.click(findTestObject('Page_Producto Politica Promocion/a_PRODUCTO PRUEBA'))

WebUI.click(findTestObject('Object Repository/Page_Producto Politica/input_Nueva fila_W0019W0007W0009ENTER'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Politica Comercial/span_Sucursales'))

WebUI.click(findTestObject('Object Repository/Page_Politica Comercial/input_Bonificaciones_W0027W0007INSERT'))

WebUI.click(findTestObject('Object Repository/Page_Politica Sucursal/input_Modo_W0024W0007W0009ENTER'))

WebUI.click(findTestObject('Object Repository/Page_Politica Comercial/input_Bonificaciones_W0027W0007INSERT'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Politica Sucursal/select_DTH  BENIDTH  CHUQUISADTH  COCHABAMB_eb9082'), 
    '7', true)

WebUI.click(findTestObject('Object Repository/Page_Politica Sucursal/input_Modo_W0024W0007W0009ENTER'))

WebUI.click(findTestObject('Object Repository/Page_Politica Comercial/input_Bonificaciones_W0027W0007INSERT'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Politica Sucursal/select_DTH  BENIDTH  CHUQUISADTH  COCHABAMB_eb9082'), 
    '22', true)

WebUI.click(findTestObject('Object Repository/Page_Politica Sucursal/input_Modo_W0024W0007W0009ENTER'))

