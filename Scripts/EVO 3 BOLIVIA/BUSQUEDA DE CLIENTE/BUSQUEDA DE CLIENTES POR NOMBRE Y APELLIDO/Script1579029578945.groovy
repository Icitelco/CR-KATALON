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

WebUI.callTestCase(findTestCase('EVO 3 BOLIVIA/LOGIN EVO 3'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.navigateToUrl('http://192.168.1.115:8080/SIGA-BO/servlet/wwcliente')

WebUI.setText(findTestObject('Object Repository/Page_Clientes/input_Nombre_vCLIENTENOM'), 'PRUEBA')

WebUI.setText(findTestObject('Page_Clientes/input_Apellido_vCLIENTEAPE'), 'BUSQUEDA')

WebUI.click(findTestObject('Object Repository/Page_Clientes/input_Status_SEARCHBUTTON'))

WebUI.delay(3)

WebUI.takeScreenshot()
