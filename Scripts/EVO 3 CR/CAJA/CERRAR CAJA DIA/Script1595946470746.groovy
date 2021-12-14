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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

WebUI.callTestCase(findTestCase('EVO 3 CR/LOGIN EVO 3 CR/LOGIN'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

'PANTALLA CAJA DIA'
WebUI.navigateToUrl('http://10.7.148.132:8080/SIGA-TG/servlet/wwcajadia')

String CajaGrupoID=CustomKeywords.'CRPREP_NROMAX_CAJAGRUPOO.CRPREP_Cliente_Numero'()

WebUI.selectOptionByValue(findTestObject('Object Repository/select_ALAJUELACALL CENTER SAC ESDIGITACION_e3fa0d'),CajaGrupoID,
	true)

WebUI.delay(6)

String CajaNombre = CustomKeywords.'CRPERP_NOMBRE_CAJAA.CRPREP_Cliente_Numero'()

String Cajanro = CustomKeywords.'CRPERP_NROMAX_CAJA.CRPREP_Cliente_Numero'()

'NOMBRE CAJA'
WebUI.setText(findTestObject('Page_Cajas Diarias/input_Caja_vCAJANOMBRE'), CajaNombre)

WebUI.selectOptionByValue(findTestObject('Page_Cajas Diarias/select_(Ninguno)INGRESADAABIERTACERRADA'), 'A', true)

WebUI.click(findTestObject('Object Repository/Page_Cajas Diarias/input_Status_SEARCHBUTTON'))

WebUI.delay(10)

'INGRESAR VALORES DE APERTURA'
WebUI.click(findTestObject('Page_Cajas Diarias/a_Valores'))

WebUI.click(findTestObject('Page_Caja Diaria/input_Deposito Recaudadores_W0027W0007INSERT'))

WebUI.selectOptionByValue(findTestObject('Page_Caja Dia Valor/select_APERTURACIERREAJUSTE'), '2', true)

String ValorCierre = CustomKeywords.'CRPERP_VALORES_CIERRE_CAJA.CRPREP_Cliente_Numero'(Cajanro)

'VALOR DE APERTURA VALOR EFECTIVO'
WebUI.selectOptionByValue(findTestObject('Page_Caja Dia Valor/select_DEBITODEPOSITOEFECTIVO'), '1', true)

'MONEDA (COLONES)'
WebUI.selectOptionByValue(findTestObject('Page_Caja Dia Valor/select_'), '1', true)

WebUI.setText(findTestObject('Page_Caja Dia Valor/input_Importe_W0024W0007W0009CAJADIAVALORIMP'), ValorCierre)

WebUI.click(findTestObject('Page_Caja Dia Valor/input_Importe_W0024W0007W0009ENTER'))

WebUI.click(findTestObject('Object Repository/Page_CAJA PRUEBA KATALON/input_Pgina 1 de 1_W0027W0007CERRARCAJA'))

WebUI.click(findTestObject('Object Repository/Page_CAJA PRUEBA KATALON/input_Confirma CERRAR Caja_W0027W0007I_BUTT_849d2e'))

