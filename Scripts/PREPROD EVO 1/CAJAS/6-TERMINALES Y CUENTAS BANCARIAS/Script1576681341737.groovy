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

WebUI.click(findTestObject('Object Repository/Page_GRUPO PRUEBA/span_Terminales'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_GRUPO PRUEBA/input_Cuentas bancarias_W0024W0008INSERT'))

WebUI.click(findTestObject('Object Repository/Page_Terminales de la Oficina/img_Terminal Id_W0029W0008W0007PROMPT_2984'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Page_Terminales de la Oficina/input_Nombre_vTERMINALDSC'), 'TERMINAL PRUEBA')

WebUI.click(findTestObject('Object Repository/Page_Terminales de la Oficina/input_Terminal Tpo_SEARCHBUTTON'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Terminales de la Oficina/a_TERMINAL PRUEBA'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Terminales de la Oficina/input_Activo_W0029W0008W0007ENTER'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_GRUPO PRUEBA/span_Cuentas bancarias'))

WebUI.click(findTestObject('Object Repository/Page_GRUPO PRUEBA/input_Cuentas bancarias_W0024W0008INSERT'))

WebUI.acceptAlert()

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Cuentas bancarias de una oficina/img_Banco_W0018W0008W0007PROMPT_12_130'))

WebUI.click(findTestObject('Object Repository/Page_Cuentas bancarias de una oficina/a_BANCO DE COSTA RICA'))

WebUI.click(findTestObject('Object Repository/Page_Cuentas bancarias de una oficina/img_Cuenta_W0018W0008W0007PROMPT_130_2734'))

WebUI.click(findTestObject('Object Repository/Page_Cuentas bancarias de una oficina/a_BCR Colones'))

WebUI.click(findTestObject('Object Repository/Page_Cuentas bancarias de una oficina/input_BCR Colones_W0018W0008W0007ENTER'))

