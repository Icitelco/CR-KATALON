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

'IR A LA PANTALLA DE CAJAS'
WebUI.navigateToUrl('http://10.7.148.132:8080/SIGA-TG/servlet/wwcaja')

'INSERTAR CAJA'
WebUI.click(findTestObject('Object Repository/Page_Cajas/input_Cajas_INSERT'))

'Nombre Random'
String NombreCaja = RandomStringUtils.randomAlphabetic(20)

'NOMBRE DE LA CAJA A CREAR'
WebUI.setText(findTestObject('Object Repository/Page_Caja/input_Nombre_W0027W0007W0009CAJANOMBRE'), NombreCaja)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Caja/select_ALAJUELAALAJUELA DIGITACIONAlajuelaB_c0f9c6'), 
    '7', true)

WebUI.click(findTestObject('Object Repository/Page_Caja/input_  _W0027W0007W0009ENTER'))

WebUI.delay(5)

'BUSCAR NOMBRE DE LA CAJA'
WebUI.setText(findTestObject('Object Repository/Page_Cajas/input_Caja Nombre_vCAJANOMBRE'), NombreCaja)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/BOLIVIA/input_Forma Generada_SEARCHBUTTON'))

WebUI.click(findTestObject('Object Repository/Page_Cajas/img_Requiere valor apertura_vDISPLAY_0001'))

WebUI.click(findTestObject('Object Repository/Page_Caja/span_Puntos de Venta'))

WebUI.click(findTestObject('Object Repository/Page_Caja/input_Puntos de Venta_W0027W0007INSERT'))

'ELEGIR PUNTO DE VENTA'
WebUI.setText(findTestObject('Object Repository/Page_Caja Punto de Venta/input_Punto de Venta_W0019W0007W0009PUNTOVTAID'), 
    '1')

WebUI.click(findTestObject('Object Repository/Page_Caja Punto de Venta/input_Punto de Venta_W0019W0007W0009ENTER'))

