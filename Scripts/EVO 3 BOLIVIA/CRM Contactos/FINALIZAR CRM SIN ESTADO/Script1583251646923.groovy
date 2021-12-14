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

WebUI.navigateToUrl('https://192.168.1.115/SIGA-BO/servlet/wwcrmdeusuario')

WebUI.click(findTestObject('Object Repository/Page_Registro de CRM de Usuario/input_ADMIN_ALTAWP'))

WebUI.setText(findTestObject('Object Repository/Page_Registro de CRM Inicial/input_Cliente Nro_vE_CLIENTENRO'), '9')

WebUI.click(findTestObject('Object Repository/Page_Registro de CRM Inicial/input_Med Cobro_BUSCAR'))

WebUI.click(findTestObject('Object Repository/Page_Registro de CRM Inicial/input_     0000_ACCIONINICIAR'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Registro de CRM Inicial/div_Informacin de Cliente'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Registro de CRM Inicial/select_(Ninguno)BUENOREGULARMALO'), 
    'B', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Registro de CRM Inicial/select_(Ninguno)CONSULTAINTERNET  TVOTRAS A_11bb8f'), 
    '12', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Registro de CRM Inicial/select_(Ninguno)CLIENTE COLGO LA LLAMADAFAC_152337'), 
    '4', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Registro de CRM Inicial/select_(Ninguno)CAMBIO O VENTA DE CONTROL R_1dc34a'), 
    '4', true)

WebUI.setText(findTestObject('Object Repository/Page_Registro de CRM Inicial/textarea_Motivo y Observacin_vE_CRMOBS'), 'PRUEBA CRM')

WebUI.click(findTestObject('Object Repository/Page_Registro de CRM Inicial/input_Inicio_ACCIONFINALIZAR'))

WebUI.click(findTestObject('Object Repository/Page_Registro de CRM Inicial/button_Aceptar'))

