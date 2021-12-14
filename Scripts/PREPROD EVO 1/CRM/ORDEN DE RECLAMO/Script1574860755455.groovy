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

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_Registro de CRM - 360/input_Crear OT Reclamo Tcnico_vE_BTNRECLAMO'))

WebUI.delay(5)

//WebUI.click(findTestObject('Page_Orden de Reclamo Tcnicoooo/input_(Ninguno)_W0026W0008W0007vPROMPTMOTIVO1'))
WebUI.click(findTestObject('Page_Orden de Reclamo Tcnicoooo/input_Contrato_W0026W0008W0007vPROMPTCONTRATO'))
WebUI.click(findTestObject('Page_Orden de Reclamo Tcnicoooo/input_Contrato_W0026W0008W0007vPROMPTCONTRATO'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_Orden de Reclamo Tcnicoooo/a_SERVICIO BASICO'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_Orden de Reclamo Tcnicoooo/input_(Ninguno)_W0026W0008W0007vPROMPTMOTIVO1'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_Orden de Reclamo Tcnicoooo/a_TV-IMAGEN CONGELADA'))

WebUI.takeScreenshot()

FECHA=WebUI.getText(findTestObject('Page_Orden de Reclamo Tcnicoooo/span_27112019'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_Orden de Reclamo Tcnicoooo/input_CRM Asociado_W0026W0008W0007ENTER'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Registro de CRM - 360/span_Actualizar email y direccion de client_49a023'))

WebUI.click(findTestObject('Object Repository/Page_Registro de CRM - 360/input_Acciones y escalamientos_vE_CRMACCION'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_ANA BORDALLO ABAD/span_Ordenes'))

WebUI.setText(findTestObject('Object Repository/Page_ANA BORDALLO ABAD/input_Desde Ingreso_W0030W0008vFROMORDENFING'),FECHA)

WebUI.setText(findTestObject('Object Repository/Page_ANA BORDALLO ABAD/input_Hasta Ingreso_W0030W0008vTOORDENFING'),FECHA)

WebUI.takeScreenshot()



