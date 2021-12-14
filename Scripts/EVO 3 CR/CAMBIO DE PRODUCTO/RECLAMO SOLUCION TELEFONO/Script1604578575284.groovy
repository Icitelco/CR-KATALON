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

WebUI.navigateToUrl('http://10.7.148.132:8080/SIGA-TG/servlet/wope0300')

mydate = new Date()

formattedDate = mydate.format('dd/MM/YYYY')

ORDENNRO = CustomKeywords.'CRPREP_ORDEN_RECLAMO_EMITIDA.CRPREP_Cliente_Numero'()

WebUI.setText(findTestObject('Object Repository/Page_Pantalla de Ordenes de Servicio/input_Orden Nro_vE_ORDENNRO_F'), ORDENNRO)

WebUI.setText(findTestObject('Object Repository/Page_Pantalla de Ordenes de Servicio/input_Desde Ingreso_vE_FROMORDENFING'), 
    '01/01/2000')

WebUI.setText(findTestObject('Object Repository/Page_Pantalla de Ordenes de Servicio/input_Hasta Ingreso_vE_TOORDENFING'), 
    formattedDate)

WebUI.click(findTestObject('Object Repository/Page_Pantalla de Ordenes de Servicio/input_Cliente Nro_BUTTON1'))

WebUI.click(findTestObject('Object Repository/Page_Pantalla de Ordenes de Servicio/img_Orden Confirmada_vE_CUMPLIR_0001'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Cumplir una Orden/select_PENDIENTESUSPENDIDAFINALIZADAREAGENDAR'), 
    'F', true)

WebUI.click(findTestObject('Object Repository/Page_Cumplir una Orden/input_(Ninguno)_W0027vPROMPTMOTIVO2'))

WebUI.setText(findTestObject('Object Repository/Page_Cumplir una Orden/input_Motivo Orden_vPRODTPOMOTIVOORDNOM'), 'REPARACION/CAMBIO ACOMETIDA EXTERNA')

WebUI.click(findTestObject('Object Repository/Page_Cumplir una Orden/input_Status_SEARCHBUTTON'))

WebUI.click(findTestObject('Object Repository/Page_Cumplir una Orden/a_REPARACIONCAMBIO ACOMETIDA EXTERNA (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Cumplir una Orden/input_Comienzo_W0027ORDENFCOM'), formattedDate)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Cumplir una Orden/select_(Ninguno)ACOMETIDA EXTERNA CAIDA'), 
    '14', true)

WebUI.setText(findTestObject('Object Repository/Page_Cumplir una Orden/input_Comienzo_W0027ORDENFCOM'), formattedDate)

WebUI.setText(findTestObject('Object Repository/Page_Cumplir una Orden/input_Finalizada_W0027ORDENFFIN'), formattedDate)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Cumplir una Orden/select_DOMICILIOTELEFONOREDMDUOFICINANINGUN_9caccf'), 
    'T', true)

WebUI.click(findTestObject('Object Repository/Page_Cumplir una Orden/img_Tcnico_W0027PROMPT_2356'))

WebUI.click(findTestObject('Page_Orden de Reclamo Tcnico_B/a_ATENCION EN OFICINA'))

WebUI.click(findTestObject('Object Repository/Page_Cumplir una Orden/input_CRM Asociado_W0027ENTER'))

