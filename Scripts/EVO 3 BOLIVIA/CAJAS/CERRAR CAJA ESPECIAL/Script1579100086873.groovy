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

WebUI.callTestCase(findTestCase('EVO 3 BOLIVIA/LOGIN EVO 3'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.navigateToUrl('http://192.168.1.115:8080/SIGA-BO/servlet/wwcajadia')

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Page_Cajas Diarias/input_Caja_vCAJANOMBRE'), 'CAJA ESPECIAL')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Cajas Diarias/a_Valores'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Caja Diaria/span_Recibos de Caja'))

WebUI.delay(5)

a = WebUI.getText(findTestObject('Object Repository/Page_Caja Diaria/span_150000'))

WebUI.click(findTestObject('Object Repository/Page_Caja Diaria/span_Valores de Apertura y Cierre'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Page_Caja Diaria/input_Deposito Recaudadores_W0027W0007INSERT'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Caja Dia Valor/select_APERTURACIERREAJUSTE'), '2', true)

WebUI.setText(findTestObject('Object Repository/Page_Caja Dia Valor/input_Importe_W0024W0007W0009CAJADIAVALORIMP'), a)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Caja Dia Valor/input_Importe_W0024W0007W0009ENTER'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Caja Diaria/input_Pgina 1 de 1_W0027W0007CERRARCAJA'))

WebUI.click(findTestObject('Object Repository/Page_Caja Diaria/input_Confirma CERRAR Caja_W0027W0007I_BUTT_849d2e'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Caja Diaria/span_General'))

