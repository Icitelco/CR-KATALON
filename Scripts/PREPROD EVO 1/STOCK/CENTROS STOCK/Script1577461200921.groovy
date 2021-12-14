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

WebUI.click(findTestObject('Object Repository/Page_SIGA Software/span_Stock'))

WebUI.click(findTestObject('Object Repository/Page_SIGA Software/span_Centros de Stock'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Page_Centros de Stock/input_Nombre_vCENTROSTKNOMBRE'), 'BODEGA TIGO')

WebUI.click(findTestObject('Object Repository/Page_Centros de Stock/input_Acepta retiros_SEARCHBUTTON'))

WebUI.click(findTestObject('Object Repository/Page_Centros de Stock/img_Acepta Retiros de Tecnicos_vDISPLAY_0001'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_BODEGA TIGO/span_Usuarios'))

WebUI.click(findTestObject('Object Repository/Page_BODEGA TIGO/input_Histricos Centro Stock_W0024W0008INSERT'))

WebUI.setText(findTestObject('Object Repository/Page_Centro Stock Usuario/input_Usuario_W0022W0008W0007CENTROSTKUSUARIOID'), 
    'MAURICIO ARCAUZ')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Centro Stock Usuario/select_ALMACEN DESECHO TIGOALMACEN WODENART_7657fe'), 
    '490', true)

WebUI.click(findTestObject('Object Repository/Page_Centro Stock Usuario/input_Ingreso_W0022W0008W0007CENTROSTKUSUINGRESAR'))

WebUI.click(findTestObject('Object Repository/Page_Centro Stock Usuario/input_Autorizar_W0022W0008W0007CENTROSTKUSU_5367fc'))

WebUI.click(findTestObject('Object Repository/Page_Centro Stock Usuario/input_Procesar_W0022W0008W0007CENTROSTKUSUPROCESAR'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Centro Stock Usuario/input_Procesar_W0022W0008W0007ENTER'))

WebUI.delay(2)

WebUI.takeScreenshot()

