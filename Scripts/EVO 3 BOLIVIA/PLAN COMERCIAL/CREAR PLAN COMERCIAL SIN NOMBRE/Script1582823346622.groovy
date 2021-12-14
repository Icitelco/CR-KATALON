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

WebUI.delay(5)

WebUI.navigateToUrl('https://192.168.1.115/SIGA-BO/servlet/wwplancomercial')

WebUI.click(findTestObject('Object Repository/Page_Planes Comerciales/input_Planes Comerciales_INSERT'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Plan Comercial/select_CORPORATECORPORATE NFDTH B2BDTH POSP_b5e8ac'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/Page_Plan Comercial/input_Activo en Venta_W0027W0007W0009PLANCO_20ba9c'))

WebUI.click(findTestObject('Object Repository/Page_Plan Comercial/input_Clientes Activos_W0027W0007W0009ENTER'))

