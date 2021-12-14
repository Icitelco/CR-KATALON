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

WebUI.click(findTestObject('Object Repository/Page_SIGA Software/span_Cajas de Oficina'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Page_Grupo de Atencin de Cajas/input_Oficina_vCAJAGRUPONOMBRE'), 'GRUPO PRUEBA')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Grupo de Atencin de Cajas/img_Transfiere valores al cierre_vDISPLAY_0001'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_GRUPO PRUEBA/span_Cobradores'))

WebUI.click(findTestObject('Page_GRUPO PRUEBA/input_Cuentas bancarias_W0024W0008INSERT'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_Caja Cobrador/img_Cobrador_W0018W0008W0007PROMPT_510'))

WebUI.delay(3)

WebUI.setText(findTestObject('Page_Caja Cobrador/input_Cobrador Nombre_vCOBRADORNOMBRE'), 'MAURICIO ARCAUZ')

WebUI.click(findTestObject('Page_Caja Cobrador/input_Login_SEARCHBUTTON'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Caja Cobrador/a_MAURICIO ARCAUZ'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Caja Cobrador/img_Caja_W0018W0008W0007PROMPT_12_175_2786'))

WebUI.click(findTestObject('Object Repository/Page_Caja Cobrador/a_CAJA PRUEBA'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Caja Cobrador/input_Realiza Apertura_W0018W0008W0007CAJAC_5cc276'))

WebUI.click(findTestObject('Object Repository/Page_Caja Cobrador/input_Realiza Cierre_W0018W0008W0007CAJACOB_05ea0b'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Page_Caja Cobrador/input_Realiza Cierre_W0018W0008W0007ENTER'))

WebUI.delay(0)

WebUI.takeScreenshot()

