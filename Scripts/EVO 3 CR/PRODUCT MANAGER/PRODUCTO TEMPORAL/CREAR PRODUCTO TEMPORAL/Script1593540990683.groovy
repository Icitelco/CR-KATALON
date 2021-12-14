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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('EVO 3 CR/LOGIN EVO 3 CR/LOGIN'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.navigateToUrl('http://10.7.148.132:8080/SIGA-TG/servlet/wwproductotemporal')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Productos Temporales/input_Productos Temporales_INSERT'))

WebUI.delay(5)

String Nombre = RandomStringUtils.randomAlphabetic(20)

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Page_Producto Temporal/input_Nombre_W0027W0007W0009PRODUCTOTEMPORALNOMBRE'), 
    Nombre)

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Producto Temporal/select_DIAHORASEMANAMESFECHA FINAL'), 
    'H', true)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Producto Temporal/input_Duracin_W0027W0007W0009PRODUCTOTEMPOR_dbc55a'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Producto Temporal/input_Duracin_W0027W0007W0009PRODUCTOTEMPOR_dbc55a'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Page_Producto Temporal/input_Duracin_W0027W0007W0009PRODUCTOTEMPOR_dbc55a'), 
    '1')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Producto Temporal/input_Finaliza Automaticamente_W0027W0007W0_757b63'))

WebUI.delay(5)

String Concepto = CustomKeywords.'CREVO3_CONCEPTOFACASIG.CRPREP_Cliente_Numero'()

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Page_Producto Temporal/input_Concepto_W0027W0007W0009PRODUCTOTEMPORALCPTO'), 
    Concepto)

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Page_Producto Temporal/input_Importe_W0027W0007W0009PRODUCTOTEMPOR_a7f04c'), 
    '1000,00')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Producto Temporal/input_Importe_W0027W0007W0009ENTER'))

WebUI.delay(10)

WebUI.setText(findTestObject('Object Repository/Page_Productos Temporales/input_Producto Temporal Nombre_vPRODUCTOTEM_c87c94'), 
    Nombre)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Productos Temporales/input_Estado_SEARCHBUTTON'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Productos Temporales/img_Estado_vDISPLAY_0001'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_PAQUETE HBO 1 HORA/span_Productos del Temporal'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_PAQUETE HBO 1 HORA/input_Contratos Asignados_W0027W0007INSERT'))

WebUI.delay(5)

String IdProductoInternet = CustomKeywords.'CRPREP_PRODUCTO_INTERNET_RESIDENCIAL.CRPREP_Cliente_Numero'()

WebUI.delay(10)

WebUI.setText(findTestObject('Object Repository/Page_Producto Temporal Producto/input_Producto_W0024W0007W0009PRODUCTOTMPID'), 
    IdProductoInternet)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Producto Temporal Producto/input_Producto_W0024W0007W0009ENTER'))

