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

String OrdenEmitida = CustomKeywords.'CRPREP_ORDEN_INSTALACION_EMITIDA.CRPREP_Cliente_Numero'()

WebUI.delay(5)

WebUI.navigateToUrl('http://10.7.148.132:8080/SIGA-TG/servlet/wope0300')

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/input_Orden Nro_vE_ORDENNRO_F'), OrdenEmitida)

WebUI.clearText(findTestObject('Object Repository/input_Desde Ingreso_vE_FROMORDENFING'))

mydate = (new Date() - 360)

formattedDate = mydate.format('dd/MM/YYYY')

WebUI.setText(findTestObject('Object Repository/input_Desde Ingreso_vE_FROMORDENFING'), formattedDate)

mydate = new Date()

formattedDate = mydate.format('dd/MM/YYYY')

WebUI.clearText(findTestObject('Object Repository/input_Hasta Ingreso_vE_TOORDENFING'))

WebUI.setText(findTestObject('Object Repository/input_Hasta Ingreso_vE_TOORDENFING'), formattedDate)

WebUI.click(findTestObject('Page_Pantalla de Ordenes de Servicio/input_Cliente Nro_BUTTON1'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_Pantalla de Ordenes de Servicio/img_Orden Confirmada_vE_CUMPLIR_0001'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Cumplir una Orden/select_PENDIENTESUSPENDIDAFINALIZADAREAGENDAR'), 
    'F', true)

WebUI.click(findTestObject('Object Repository/Page_Cumplir una Orden/input_Observacin_W0027ENTER'))

WebUI.delay(10)

WebUI.takeFullPageScreenshot(FailureHandling.CONTINUE_ON_FAILURE)

