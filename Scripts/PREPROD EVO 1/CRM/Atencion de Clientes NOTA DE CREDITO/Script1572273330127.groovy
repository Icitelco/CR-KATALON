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

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_SIGA Software/span_CRM Contactos_1'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_SIGA Software/span_Atencin a Clientes'))

WebUI.delay(7)

WebUI.click(findTestObject('Object Repository/Page_Registro de CRM de Usuario/input_MARCAUZ_ALTAWP'))

WebUI.delay(10)

WebUI.setText(findTestObject('Object Repository/Page_Registro de CRM - 360/input_Cliente Nro_vE_CLIENTENRO'), '5')

WebUI.click(findTestObject('Object Repository/Page_Registro de CRM - 360/input_BANCO_BUSCAR'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Registro de CRM - 360/span_Mensaje_gxp0_cls'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Registro de CRM - 360/input_ _ACCIONINICIAR'))

WebUI.delay(5)

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Registro de CRM - 360/span_Actualizar email y direccion de client_49a023'), 
    10)) {
    WebUI.click(findTestObject('Object Repository/Page_Registro de CRM - 360/span_Actualizar email y direccion de client_49a023'))

    WebUI.click(findTestObject('Object Repository/Page_Registro de CRM - 360/span_Actualizar email y direccion de client_49a023'))
}

WebUI.click(findTestObject('Object Repository/Page_Registro de CRM - 360/span_ONE TV LITE DVR (40HD)'))

WebUI.click(findTestObject('Object Repository/Page_Registro de CRM - 360/span_SMART CARD DVB'))

WebUI.click(findTestObject('Object Repository/Page_Registro de CRM - 360/span_1011619292'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Registro de CRM - 360/OBSERVACION 1'), '88', true)

WebUI.delay(7)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Registro de CRM - 360/OBSERVACION 2'), '16', true)

WebUI.delay(7)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Registro de CRM - 360/Observacion 3'), '4', true)

WebUI.delay(7)

WebUI.setText(findTestObject('Object Repository/Page_Registro de CRM - 360/textarea_Motivo y Observacin_vE_CRMOBS'), 'PRUEBAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Registro de CRM - 360/input_Imprime Fac_NOTADECREDITO'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Registro de CRM - 360/input_PAGA_vE_CREARNOTA_0001'))

WebUI.takeScreenshot()

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Registro de CRM - 360/input_Motivo Detalle_vE_PROMPTDETALLE'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Registro de CRM - 360/a_AJUSTE WHOLESALE 2016'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Registro de CRM - 360/input_Impuesto_vE_SEL_0001'))



WebUI.click(findTestObject('Object Repository/Page_Registro de CRM - 360/input_IMPUESTO_GENERARNC'))
WebUI.takeScreenshot()
WebUI.click(findTestObject('Page_Registro de CRM - 360/button_Aceptar (1)'))

WebUI.navigateToUrl('http://10.7.148.132/SIGA-TG/servlet/entitymanagercliente?DSP,10,5,Factura')

WebUI.takeScreenshot()
