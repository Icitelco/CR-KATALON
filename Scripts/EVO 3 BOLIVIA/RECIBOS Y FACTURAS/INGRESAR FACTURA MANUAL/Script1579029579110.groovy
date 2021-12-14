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

WebUI.navigateToUrl('https://192.168.1.115/SIGA-BO/servlet/wwcliente')

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Page_Clientes/input_Cliente Nro_vCLIENTENRO'), '9')

WebUI.click(findTestObject('Object Repository/Page_Clientes/input_Status_SEARCHBUTTON'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Clientes/img_Cantidad facturas_vDISPLAY_0001'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Cliente/span_Documentos'))

WebUI.click(findTestObject('Object Repository/Page_Cliente/input_URN_W0029W0007INSERT'))

WebUI.delay(4)

WebUI.setText(findTestObject('Object Repository/Page_Documento/input_Importe_W0026W0007W0009CPTOFACID_0001'), '1')

WebUI.setText(findTestObject('Object Repository/Page_Documento/input_INSTALACION DECO PRE-PAGO_W0026W0007W_e3be2f'), '1')

WebUI.setText(findTestObject('Object Repository/Page_Documento/input_INSTALACION DECO PRE-PAGO_W0026W0007W_a081b4'), '100,00')

WebUI.click(findTestObject('Object Repository/Page_Documento/input_Total_W0026W0007W0009ENTER'))

