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
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('EVO 3 CR/FACTURACION/COMPROBANTES/ELIMINARSE DE NIVEL DE COMPROBANTES'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('EVO 3 CR/FACTURACION/NOTA DE CREDITO/CREAR NOTA DE CREDITO'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('EVO 3 CR/FACTURACION/COMPROBANTES/ASIGNARSE A NIVEL DE COMPROBANTES'), [:], FailureHandling.CONTINUE_ON_FAILURE)

String Clientenro = CustomKeywords.'CRPERP_CLIENTE_CON_COMPROBANTEE.CRPREP_Cliente_Numero'()

WebUI.navigateToUrl('http://10.7.148.132:8080/SIGA-TG/servlet/wwcmpteautorizar')

WebUI.click(findTestObject('Object Repository/Page_Autorizacin de Comprobantes/span_Autorizaciones de Cmptes NO aplicadas__6deb02'))

WebUI.setText(findTestObject('Object Repository/Page_Autorizacin de Comprobantes/input_Cliente Nro_vCLIENTENRO'), Clientenro)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Autorizacin de Comprobantes/select_(Ninguno)COMPROBANTECARGODEVOLUCION'), 
    'F', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Autorizacin de Comprobantes/select_(Ninguno)PENDIENTEAUTORIZADAAPLICADAANULADA'), 
    'P', true)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Autorizacin de Comprobantes/td_AutorizadoAplicado'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Autorizacin de Comprobantes/input_Aplicado_vAUTORIZAR_0001'))

WebUI.click(findTestObject('Object Repository/Page_Autorizacin de Comprobantes/input__CONFIRMAR'))

WebUI.click(findTestObject('Object Repository/Page_Autorizacin de Comprobantes/button_Aceptar'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Autorizacin de Comprobantes/select_(Ninguno)PENDIENTEAUTORIZADAAPLICADAANULADA'), 
    'A', true)

WebUI.click(findTestObject('Object Repository/Page_Autorizacin de Comprobantes/input_Aplicado_vAPLICAR_0001'))

WebUI.click(findTestObject('Object Repository/Page_Autorizacin de Comprobantes/input__CONFIRMAR'))

WebUI.click(findTestObject('Object Repository/Page_Autorizacin de Comprobantes/button_Aceptar'))

