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

WebUI.click(findTestObject('Object Repository/Page_SIGA Software/span_Conceptos de Factura'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Conceptos de Facturas/input_Conceptos de Facturas_INSERT'))

WebUI.setText(findTestObject('Object Repository/Page_Concepto de Factura/input_Nombre_W0024W0008W0007CPTOFACNOMBRE'), 'CONCEPTO PRUEBA')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Concepto de Factura/select_(Ninguno)MOROSIDAD GENERAL'), 
    '1', true)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Page_Concepto de Factura/input_Agrupar en Plan Comercial_W0024W0008W_be2fdf'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Page_Conceptos de Facturas/input_Nombre_vCPTOFACNOMBRE'), 'CONCEPTO PRUEBA')

WebUI.click(findTestObject('Object Repository/Page_Conceptos de Facturas/input_Status_SEARCHBUTTON'))

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Page_Conceptos de Facturas/img_PrvExterno_vDISPLAY_0001'))

WebUI.takeScreenshot()

