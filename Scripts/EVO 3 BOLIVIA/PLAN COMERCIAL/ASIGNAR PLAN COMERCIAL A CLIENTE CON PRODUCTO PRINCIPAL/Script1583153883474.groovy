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

WebUI.delay(5)

WebUI.navigateToUrl('https://192.168.1.115/SIGA-BO/servlet/wwcliente')

//NUMERO DE CLIENTE A BUSCAR QUE TENGA UN PRODUCTO PRINCIPAL QUE ESTE EN UN PLAN
WebUI.setText(findTestObject('Page_Clientes/input_Cliente Nro_vCLIENTENRO'), '9')

WebUI.click(findTestObject('Page_Clientes/input_Status_SEARCHBUTTON'))

WebUI.click(findTestObject('Page_Clientes/img_Cantidad facturas_vDISPLAY_0001'))

WebUI.click(findTestObject('Object Repository/Page_Cliente/span_Contratos'))

WebUI.click(findTestObject('Object Repository/Page_Cliente/input_URN_W0029W0007CONTRATOAGREGAR'))

WebUI.click(findTestObject('Object Repository/Page_Ingreso de Contratos/input_Linea Convergente_PLANCOMERCIAL'))

//NOMBRE DEL PLAN COMERCIAL QUE TIENE EL PRODUCTO
WebUI.setText(findTestObject('Page_Ingreso de Contratos/input_Nombre_vE_FILTROPLANCOMERCIALNOMBRE'), '%PLAN COMERCIAL KATA%')

WebUI.click(findTestObject('Page_Ingreso de Contratos/input_Nombre_BUSCAR'))

WebUI.click(findTestObject('BOLIVIA/a_PLAN COMERCIAL SEL'))

WebUI.click(findTestObject('Page_Ingreso de Contratos/input_PLAN PRUEBA_SELECCIONAR'))

