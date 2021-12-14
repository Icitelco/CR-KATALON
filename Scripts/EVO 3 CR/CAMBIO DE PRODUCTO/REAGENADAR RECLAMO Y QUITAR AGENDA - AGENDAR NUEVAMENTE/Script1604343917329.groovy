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

WebUI.callTestCase(findTestCase('EVO 3 CR/CAMBIO DE PRODUCTO/CREAR AGENDA ALEJUELA - 2DO DIA'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.navigateToUrl('http://10.7.148.132:8080/SIGA-TG/servlet/wwcliente')

CLIENTENROORD = CustomKeywords.'CRPRERP_CLIENTE_CON_ORDEN_AGENDADA.CRPREP_Cliente_Numero'()

WebUI.delay(10)

WebUI.setText(findTestObject('Object Repository/Page_Clientes/input_Cliente Nro_vCLIENTENRO'), CLIENTENROORD)

WebUI.click(findTestObject('Object Repository/Page_Clientes/input_Home Pack_SEARCHBUTTON'))

WebUI.click(findTestObject('Object Repository/Page_Clientes/a_CLIENTE'))

WebUI.click(findTestObject('Object Repository/Page_CLIENTE APELLIDO-A/span_Ordenes'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CLIENTE APELLIDO/select_(Ninguno)INSTALACIONDESCONEXIONSERVI_985ee4'), 
    'R', true)

CONTRATONRO = CustomKeywords.'CRPREP_CONTRATO_DE_ORDEN_AGENDADA_DE_CLIENTE.CRPREP_Cliente_Numero'(CLIENTENROORD)

WebUI.setText(findTestObject('Object Repository/Page_CLIENTE APELLIDO/input_Contrato Nro_W0033W0007vCONTRATONRO'), CONTRATONRO)

FECHA = CustomKeywords.'CRPREP_ORDEN_FECHA_DE_ORDEN_AGENDADA_DE_CLIENTE.CRPREP_Cliente_Numero'(CLIENTENROORD, CONTRATONRO)

WebUI.setText(findTestObject('Object Repository/Page_CLIENTE APELLIDO/input_Desde Ingreso_W0033W0007vFROMORDENFING'), FECHA)

WebUI.setText(findTestObject('Object Repository/Page_CLIENTE APELLIDO/input_Hasta Ingreso_W0033W0007vTOORDENFING'), FECHA)

WebUI.click(findTestObject('Object Repository/Page_CLIENTE APELLIDO/input_El valor no representa un nmero corre_a5b909'))

WebUI.click(findTestObject('Object Repository/Page_CLIENTE APELLIDO-A/input_FIJA_W0033W0007vREAGENDAR_0005'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CLIENTE APELLIDO-A/select_(Ninguno)Agendamiento incorrectoFalt_05e6e2'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Page_CLIENTE APELLIDO-A/input_HFC MAANA_QUITARDEAGENDA'))

WebUI.click(findTestObject('Object Repository/Page_CLIENTE APELLIDO-A/input_Histricos_W0033W0007AGENDAR'))

WebUI.click(findTestObject('Object Repository/Page_CLIENTE APELLIDO-A/a_AVERIAS CATV'))

WebUI.click(findTestObject('Object Repository/Page_CLIENTE APELLIDO/a_8'))

WebUI.click(findTestObject('Object Repository/Page_CLIENTE APELLIDO/span_Elegir Dia y Turno para Reagendar_gxp0_cls'))

