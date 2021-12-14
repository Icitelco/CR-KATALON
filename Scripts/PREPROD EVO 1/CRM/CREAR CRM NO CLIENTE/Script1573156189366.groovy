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

WebUI.click(findTestObject('Object Repository/Page_SIGA Software/span_CRM Contactos_1'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_SIGA Software/span_Atencin a Clientes'))

WebUI.delay(7)

WebUI.click(findTestObject('Object Repository/Page_Registro de CRM de Usuario/input_MARCAUZ_ALTAWP'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_Registro de CRM - 360/input_Es Cliente_vE_ESCLIENTE'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Page_Registro de CRM - 360/input_     0000_ACCIONINICIAR'))

WebUI.delay(5)

if(WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Registro de CRM - 360/span_Actualizar email y direccion de client_49a023'), 10)){
	WebUI.click(findTestObject('Object Repository/Page_Registro de CRM - 360/span_Actualizar email y direccion de client_49a023'))
	
	WebUI.click(findTestObject('Object Repository/Page_Registro de CRM - 360/span_Actualizar email y direccion de client_49a023'))
	}

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Registro de CRM - 360/select_(Ninguno)BBIBBIFLCONSULTADIGDTHFLGES_ab6f79'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Registro de CRM - 360/select_(Ninguno)PENDIENTEFINALIZADOANULADOC_aca55c'), 
    'F', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Registro de CRM - 360/select_(Ninguno)BUENOREGULARMALO'), 
    'B', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Registro de CRM - 360/select_(Ninguno)BASE NO APLICAEXITOSONO COM_62aa07'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Registro de CRM - 360/select_NingunoADMINISTRATIVAAJUSTE DE FACTU_609688'), 
    '80', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Registro de CRM - 360/select_(Ninguno)ACTUALIZACION DE INFORMACIO_5d5777'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Registro de CRM - 360/select_(Ninguno)CAMBIO DE CEDULACORRECCION _51b5a5'), 
    '1', true)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Registro de CRM - 360/input_Inicio_ACCIONFINALIZAR'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Registro de CRM - 360/button_Aceptar'))

WebUI.takeScreenshot()

