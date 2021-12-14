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

WebUI.delay(10)

WebUI.navigateToUrl('http://10.7.148.132/SIGA-TG/servlet/wwterminal')

WebUI.click(findTestObject('Object Repository/Page_Terminales de cobro/input_Terminales de cobro_INSERT'))

WebUI.setText(findTestObject('Object Repository/Page_Terminal de cobro (POS)/input_Terminal_W0024W0008W0007TERMINALID'), 
    '0654662356')

WebUI.setText(findTestObject('Object Repository/Page_Terminal de cobro (POS)/input_Nombre_W0024W0008W0007TERMINALDSC'), 
    'TERMINAL PRUEBA')

WebUI.click(findTestObject('Object Repository/Page_Terminal de cobro (POS)/input_Banco_W0024W0008W0007ENTER'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Page_Terminales de cobro/input_Nombre_vTERMINALDSC'), 'TERMINAL PRUEBA')

WebUI.click(findTestObject('Object Repository/Page_Terminales de cobro/input_Tipo_SEARCHBUTTON'))

WebUI.takeScreenshot()

