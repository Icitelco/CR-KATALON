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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('EVO 3 CR/LOGIN EVO 3 CR/LOGIN'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.navigateToUrl('http://10.7.148.132:8080/SIGA-TG/servlet/wwcliente')

String Clientenro = CustomKeywords.'CRPRERP_CLIENTE_CON_PLAN_COMERCIAL.CRPREP_Cliente_Numero'()

WebUI.setText(findTestObject('Object Repository/Page_Clientes/input_Cliente Nro_vCLIENTENRO'), Clientenro)

WebUI.click(findTestObject('Object Repository/Page_Clientes/input_Home Pack_SEARCHBUTTON'))

WebUI.click(findTestObject('Object Repository/Page_Clientes/img_Cantidad facturas_vDISPLAY_0001'))

WebUI.click(findTestObject('Object Repository/Page_Cliente/span_Contratos'))

String Contratonro = CustomKeywords.'CRPREP_CONTRATO_DE_CLIENTE_PLAN_COMERCIAL.CRPREP_Cliente_Numero'(Clientenro)

WebUI.delay(5)

WebUI.setText(findTestObject('Page_CLIENTE APELLIDO-A/input_Nro_W0033W0007vCONTRATONRO'), Contratonro)

WebUI.delay(5)

WebUI.click(findTestObject('Page_CLIENTE APELLIDO-A/input_Status_W0033W0007SEARCHBUTTON'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_CLIENTE APELLIDO-A/a_SME - TRIPLE PLAY 2 MEGAS (TP2MG)    1'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_CLIENTE APELLIDO-A/input_Abono Mensual_ELIMINARPLAN'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_CLIENTE APELLIDO-A/input_Abono Mensual_CONFIRMAELIMINAR'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_CLIENTE APELLIDO-A/button_Aceptar'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_CLIENTE APELLIDO-A/span_Plan Comercial de Cliente_gxp0_cls'))

WebUI.setText(findTestObject('Page_CLIENTE APELLIDO-A/input_Nro_W0033W0007vCONTRATONRO'), '0')

WebUI.click(findTestObject('Page_CLIENTE APELLIDO-A/input_Status_W0033W0007SEARCHBUTTON'))

