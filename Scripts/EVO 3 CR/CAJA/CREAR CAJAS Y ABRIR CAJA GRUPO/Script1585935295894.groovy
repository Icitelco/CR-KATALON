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

WebUI.delay(5)

'PANTALLA CAJA DIARIAS DE OFICINA\r\n'
WebUI.navigateToUrl('http://10.7.148.132:8080/SIGA-TG/servlet/wwcajagrupodia')

WebUI.click(findTestObject('Object Repository/Page_Cajas Diarias de Oficina/input_Pgina 1 de 1_CREARCAJASDELDIA'))

'SELECCIONAMOS LA CAJA'
WebUI.click(findTestObject('Object Repository/COSTA RICA/input_ACTIVO_vSELECCIONADO_13'))

WebUI.click(findTestObject('Object Repository/COSTA RICA/input_HASTA_BUTTON1'))

'CREAMOS LAS CAJAS'
WebUI.click(findTestObject('Page_Cajas Diarias de Oficina/span_Creacin de caja de una Oficina_gxp0_cls'))

'STS DE CAJA INGRESADA'
WebUI.selectOptionByValue(findTestObject('Page_Cajas Diarias de Oficina/select_(Ninguno)INGRESADAABIERTACERRADA'), 'I', 
    true)

mydate = new Date()

formattedDate = mydate.format('dd/MM/YYYY')

'FECHA DE HOY\r\n'
WebUI.setText(findTestObject('Object Repository/Page_Cajas Diarias de Oficina/input_Desde Fecha_vFROMCAJAGRUPOFCH'), formattedDate)

'FECHA DE HOY'
WebUI.setText(findTestObject('Object Repository/Page_Cajas Diarias de Oficina/input_Hasta Fecha_vTOCAJAGRUPOFCH'), formattedDate)

'INGRESAMOS VALORES DE APERTURA'
WebUI.click(findTestObject('Page_Cajas Diarias de Oficina/a_Valores'))

WebUI.click(findTestObject('Object Repository/Page_Caja Diaria de Oficina/input_Depsitos_W0029W0007INSERT'))

'METODO DE PAGO (EFECTIVO)'
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Caja Grupo Dia Valor/select_AJUSTE CONVENIO AVALAJUSTE TARJETACH_f835a2'), 
    '1', true)

'MONEDA (COLONES)'
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Caja Grupo Dia Valor/select_'), '1', true)

'CONFIRMAMOS VALOR'
WebUI.click(findTestObject('Object Repository/Page_Caja Grupo Dia Valor/input_Importe_W0024W0007W0009ENTER'))

'ABRIMOS CAJA'
WebUI.click(findTestObject('Object Repository/Page_Caja Diaria de Oficina/input_Pgina 1 de 1_W0029W0007ABRIR'))

WebUI.click(findTestObject('Object Repository/Page_Caja Diaria de Oficina/input_Confirma abrir Caja_W0029W0007I_BUTTO_a888a8'))

