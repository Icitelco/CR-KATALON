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

WebUI.navigateToUrl('http://10.7.148.132:8080/SIGA-TG/servlet/wwflusr')

String Nombre = WebUI.getText(findTestObject('Object Repository/Page_Usuarios de Flujo/span_MAURICIO ARCAUZ'))

String Usuario = CustomKeywords.'CRPREP_USUARIOLOGEADO.CRPREP_Cliente_Numero'(Nombre)

WebUI.setText(findTestObject('Object Repository/Page_Usuarios de Flujo/input_Nombre_vFLUSRNOMBRE'), Nombre)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Usuarios de Flujo/img_Puede Activar Etapas_vDISPLAY_0001'))

WebUI.click(findTestObject('Page_ADRIAN BRICEO MENA/input_Prioridad_W0027W0007UPDATE'))

WebUI.delay(5)

	if (WebUI.verifyElementPresent(findTestObject('Object Repository/img_Prioridad_W0027W0007W0009deleteGridemail_0001'), 10))
	{
		
		WebUI.click(findTestObject('Object Repository/img_Prioridad_W0027W0007W0009deleteGridemail_0001'))
		
		WebUI.click(findTestObject('Object Repository/Page_ADRIAN BRICEO MENA/input_Nueva fila_W0027W0007W0009ENTER'))
		
		WebUI.delay(5)
		
		WebUI.click(findTestObject('Page_ADRIAN BRICEO MENA/input_Prioridad_W0027W0007UPDATE'))
		
		
		}	

WebUI.click(findTestObject('Object Repository/Page_ADRIAN BRICEO MENA/span_Nueva fila'))

WebUI.delay(10)

WebUI.setText(findTestObject('Object Repository/Page_ADRIAN BRICEO MENA/input_Prioridad_W0027W0007W0009FLUSREMAIL_0001'), 
    'PRUEBA@GMAIL.COM')

WebUI.click(findTestObject('Object Repository/Page_ADRIAN BRICEO MENA/input_Nueva fila_W0027W0007W0009ENTER'))

