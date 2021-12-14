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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('EVO 3 CR/LOGIN EVO 3 CR/LOGIN'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.navigateToUrl('http://10.7.148.132:8080/SIGA-TG/servlet/wwagenda')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Agendas/select_(Ninguno)ALAJUELABELENCARTAGOCAAS (C_3b71c0'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Agendas/select_(Ninguno)AVERIAS CONSOLIDADOAVERIAS _cd935f'), 
    '201', true)

mydate = (new Date() + 1)

println(mydate)

formattedDate = mydate.format('dd/MM/YYYY')

println(formattedDate)

WebUI.setText(findTestObject('Object Repository/Page_Agendas/input_Desde Fecha_vFROMAGENDAFECHA'), formattedDate)

WebUI.click(findTestObject('Object Repository/Page_Agendas/input_Hasta Fecha_SEARCHBUTTON'))

WebUI.click(findTestObject('Object Repository/Page_Agendas/a_Registros de Agenda'))

WebUI.click(findTestObject('Object Repository/Page_Registros de Agenda/span_10 de 10 elegidos'))

WebUI.click(findTestObject('Object Repository/Page_Registros de Agenda/span_Todos'))

WebUI.check(findTestObject('Object Repository/Page_Registros de Agenda/input_EMITIDO_multiselect_W0069GS_COMBOBOX1_cbf0e8'))

WebUI.click(findTestObject('Object Repository/Page_Registros de Agenda/input_RECOORDINADO_W0069BUTTON1'))

WebUI.click(findTestObject('Object Repository/Page_Registros de Agenda/input_Zona_SEARCHBUTTON'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_Registros de Agenda/input_Confirmar Visita_vSELECTED_0001'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Registros de Agenda/input_AVERIAS CONSOLIDADO_EMITIRORDEN'))

WebUI.click(findTestObject('Object Repository/Page_Registros de Agenda/input_Ordenes a Emitir_CONFIRMAR'))

WebUI.delay(5)

WebUI.acceptAlert()

WebUI.delay(10)

WebUI.refresh()

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Registros de Agenda/input_Confirmar Visita_vSELECTED_0001'))

WebUI.click(findTestObject('Object Repository/Page_Registros de Agenda/input_TURNO_ASIGNARORDENESTECNICO'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Registros de Agenda/input_Ordenes a Asignar_CONFIRMAR'))

WebUI.delay(5)

WebUI.acceptAlert()

