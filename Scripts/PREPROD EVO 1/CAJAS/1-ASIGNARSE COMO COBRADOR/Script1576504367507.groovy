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

WebUI.click(findTestObject('Object Repository/Page_SIGA Software/span_Cobradores'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Cobradores/input_Cobradores_INSERT'))

WebUI.setText(findTestObject('Object Repository/Page_Cobrador/input_Cobrador Nombre_W0024W0008W0007COBRAD_4f9ca2'), 'MAURICIO ARCAUZ')

WebUI.setText(findTestObject('Object Repository/Page_Cobrador/input_Usuario_W0024W0008W0007USUARIOID'), 'MAURICIO ARCAUZ')

WebUI.click(findTestObject('Object Repository/Page_Cobrador/input_MARCAUZ_W0024W0008W0007ENTER'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Page_Cobradores/input_Cobrador Nombre_vCOBRADORNOMBRE'), 'MAURICIO ARCAUZ')

WebUI.delay(2)

WebUI.takeScreenshot()

