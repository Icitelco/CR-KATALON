import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.text.DateFormat as DateFormat
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

mydate = new Date()

formattedDate = mydate.format('dd/MM/YYYY')

WebUI.callTestCase(findTestCase('EVO 3 CR/LOGIN EVO 3 CR/LOGIN'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

'PANTALLA CAJA DIARIAS DE OFICINA\r\n'
WebUI.navigateToUrl('http://10.7.148.132:8080/SIGA-TG/servlet/wwcajagrupodia')

String CajaGrupoID=CustomKeywords.'CRPREP_NROMAX_CAJAGRUPOO.CRPREP_Cliente_Numero'()

WebUI.selectOptionByValue(findTestObject('Object Repository/select_ALAJUELACALL CENTER SAC ESDIGITACION_e3fa0d'),CajaGrupoID,
	true)

WebUI.delay(6)

'STS DE CAJA ABIERTA'
WebUI.selectOptionByValue(findTestObject('Page_Cajas Diarias de Oficina/select_(Ninguno)INGRESADAABIERTACERRADA'), 'A', 
    true)

WebUI.delay(10)

//WebUI.setText(findTestObject('Object Repository/Page_Cajas Diarias de Oficina/input_Hasta Fecha_vTOCAJAGRUPOFCH'), date)
'INGRESAMOS VALORES DE APERTURA'
WebUI.click(findTestObject('Page_Cajas Diarias de Oficina/a_Valores'))

String Valores = CustomKeywords.'CRPERP_VALORES_CIERRE_CAJAGRUPO.CRPREP_Cliente_Numero'()

WebUI.click(findTestObject('Object Repository/Page_ALAJUELA/span_Transferencias Cajeros'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_ALAJUELA/img_Nombre_W0029W0007vUPDATE_0001'), 30)

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_ALAJUELA/img_Nombre_W0029W0007vUPDATE_0001'))

WebUI.setText(findTestObject('Object Repository/Page_/input_Boleta Nro_W0024W0007W0009CAJAGRUPOTR_c4c4f1'), '1')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/select_INGRESADOAPROBADOCANCELADO'), 'A', true)

WebUI.click(findTestObject('Object Repository/Page_/input_Aprueba_W0024W0007W0009ENTER'))

WebUI.click(findTestObject('Object Repository/Page_ALAJUELA/input_Pgina 1 de 1_W0029W0007GENERARDEPOSITO'))

WebUI.setText(findTestObject('Object Repository/Page_ALAJUELA/input_Tula_vCAJAGRUPODEPOREFERENCIA'), '12')

WebUI.setText(findTestObject('Object Repository/Page_ALAJUELA/input_Planilla_vCAJAGRUPODEPOPLANILLA'), '156')

WebUI.click(findTestObject('Object Repository/Page_ALAJUELA/input_Cuenta_BTN_GENERAR'))

WebUI.click(findTestObject('Object Repository/Page_ALAJUELA/span_Depsitos'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_ALAJUELA/span_Valores'))

WebUI.click(findTestObject('Page_ALAJUELA/input_Pgina 1 de 1_W0029W0007CERRAR'))

WebUI.click(findTestObject('Page_ALAJUELA/input_Confirma CERRAR Caja_W0029W0007I_BUTT_de5de6'))

