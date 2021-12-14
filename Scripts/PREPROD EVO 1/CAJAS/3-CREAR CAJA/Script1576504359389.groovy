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

WebUI.click(findTestObject('Object Repository/Page_SIGA Software/span_Facturacin y Cobranza'))

WebUI.click(findTestObject('Object Repository/Page_SIGA Software/span_Cajas'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Cajas/input_Cajas_INSERT'))

WebUI.setText(findTestObject('Object Repository/Page_Caja/input_Nombre_W0024W0008W0007CAJANOMBRE'), 'CAJA PRUEBA')

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Caja/select_ALAJUELAALAJUELA DIGITACIONAlajuelaB_c0f9c6'), 
    '83', true)

WebUI.click(findTestObject('Object Repository/Page_Caja/input_  _W0024W0008W0007ENTER'))

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Cajas/select_CARTAGOGRUPO PRUEBA'), '83', true)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Cajas/img_Requiere valor apertura_vDISPLAY_0001'))

WebUI.click(findTestObject('Object Repository/Page_CAJA PRUEBA/span_Puntos de Venta'))

WebUI.click(findTestObject('Object Repository/Page_CAJA PRUEBA/input_Puntos de Venta_W0024W0008INSERT'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_Cajas Diarias/Page_Caja Punto de Venta/img_Punto de Venta_W0018W0008W0007PROMPT_497'))

WebUI.click(findTestObject('Page_Cajas Diarias/Page_Caja Punto de Venta/a_TIGO'))

WebUI.click(findTestObject('Page_Cajas Diarias/Page_Caja Punto de Venta/input_TIGO_W0018W0008W0007ENTER'))

WebUI.delay(3)

WebUI.takeScreenshot()

