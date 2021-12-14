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

WebUI.callTestCase(findTestCase('PREPROD EVO 1/CLIENTE NUEVO/Cliente'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_PRUEBA AUTOGESTION PRUEBA/span_Contratos'))

WebUI.delay(5)

cliente = WebUI.getUrl()

WebUI.click(findTestObject('Object Repository/Page_PRUEBA AUTOGESTION PRUEBA/input_Histricos_W0030W0008CONTRATOAGREGAR'))

WebUI.delay(20)

WebUI.click(findTestObject('Object Repository/Page_Ingreso de Contratos/input_DevicePrdId_ELEGIRPRODUCTOS'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_Ingreso de Contratos/input_Aprovisionar_vSELECCIONADO_0001'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_Ingreso de Contratos/input_CABLE MODEM_vSELECCIONADO_0024'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_Ingreso de Contratos/input_TELEFONO_CONFIRMAR'))

WebUI.delay(20)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Ingreso de Contratos/POLITICA BASICO'), '1119', true)

WebUI.delay(7)

WebUI.click(findTestObject('Object Repository/Page_Ingreso de Contratos/input__CONFIRMAR'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_Ingreso de Contratos/button_Aceptar_2'))

WebUI.delay(15)

WebUI.takeScreenshot()

