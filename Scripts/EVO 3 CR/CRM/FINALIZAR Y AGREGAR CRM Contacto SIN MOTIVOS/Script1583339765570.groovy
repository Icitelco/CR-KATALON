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

WebUI.delay(10)

WebUI.navigateToUrl('http://10.7.148.132:8080/SIGA-TG/servlet/wwcrmdeusuario')

WebUI.click(findTestObject('Object Repository/Page_Registro de CRM de Usuario/input_MARCAUZ_ALTAWP'))

WebUI.setText(findTestObject('Object Repository/Page_Registro de CRM - 360/input_Cliente Nro_vE_CLIENTENRO'), '18')

WebUI.click(findTestObject('Object Repository/Page_Registro de CRM - 360/input_BANCO_BUSCAR'))

WebUI.click(findTestObject('Object Repository/Page_Registro de CRM - 360/span_Mensaje_gxp0_cls'))

WebUI.click(findTestObject('Object Repository/Page_Registro de CRM - 360/input_     0000_ACCIONINICIAR'))

WebUI.delay(15)

a = WebUI.getText(findTestObject('Object Repository/Page_Registro de CRM - 360/span_1033780738'))

WebUI.click(findTestObject('Object Repository/Page_Registro de CRM - 360/span_Equipos del Cliente'))

WebUI.click(findTestObject('Object Repository/Page_Registro de CRM - 360/span_Ordenes de Servicio'))

WebUI.selectOptionByValue(findTestObject('Page_Registro de CRM - 360/select_(Ninguno)PENDIENTEFINALIZADOANULADOC_aca55c'), 
    'F', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Registro de CRM - 360/select_(Ninguno)BBIBBIFLCONSULTADIGDTHFLGES_ab6f79'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Page_Registro de CRM - 360/input_Inicio_ACCIONAGREGAR'))

WebUI.click(findTestObject('Object Repository/Page_Registro de CRM - 360/button_Aceptar'))

