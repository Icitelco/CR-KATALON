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

WebUI.callTestCase(findTestCase('EVO 3 CR/LOGIN EVO 3 CR/LOGIN'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

WebUI.navigateToUrl('http://10.7.148.132:8080/SIGA-TG/servlet/wwcliente')

WebUI.setText(findTestObject('Page_Clientes/input_Cliente Nro_vCLIENTENRO'), '10956838')

WebUI.click(findTestObject('Page_Clientes/input_Home Pack_SEARCHBUTTON'))

WebUI.click(findTestObject('Page_Clientes/img_Cantidad facturas_vDISPLAY_0001'))

WebUI.click(findTestObject('Page_Cliente/span_Contratos'))

WebUI.setText(findTestObject('Object Repository/Page_Cliente/input_Nro_W0033W0007vCONTRATONRO'), '27572485')

WebUI.click(findTestObject('Object Repository/Page_Cliente/input_Status_W0033W0007SEARCHBUTTON'))

WebUI.click(findTestObject('Object Repository/Page_Cliente/img_Navega Plus_W0033W0007vDISPLAY_0001'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_27572485/span_Promociones'))

WebUI.click(findTestObject('Object Repository/Page_Contrato/input_Concepto Personalizado_W0026W0007AGREGAR'))

WebUI.setText(findTestObject('Object Repository/Page_Contrato/input_Promocion_vE_FILTROPROMOCIONNOMBRE'), 'RODRII PROMO')

WebUI.click(findTestObject('Object Repository/Page_Contrato/input_Clase_BUTTON1'))

WebUI.click(findTestObject('Object Repository/Page_Contrato/a_RODRII PROMO'))

WebUI.click(findTestObject('Object Repository/Page_Contrato/input_Vencimiento 3_AGREGAR'))

