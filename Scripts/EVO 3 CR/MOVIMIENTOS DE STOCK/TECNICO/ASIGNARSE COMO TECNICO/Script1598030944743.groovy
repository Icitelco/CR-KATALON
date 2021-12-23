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

WebUI.callTestCase(findTestCase('EVO 3 CR/LOGIN EVO 3 CR/LOGIN'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_SIGA Software/svg_FERNANDO PENSATORI_feather feather-menu'))

String Nombre = WebUI.getText(findTestObject('Object Repository/Page_Grupo de Atencin de Cajas/span_FERNANDO PENSATORI'))

println(Nombre)

WebUI.delay(5)

//String UsuarioLGN = CustomKeywords.'CRPREP_USUARIOLOGEADO.CRPREP_Cliente_Numero'(Nombre)
WebUI.navigateToUrl('http://10.7.148.132:8080/SIGA-TG/servlet/wwtecnico')

WebUI.delay(5)

//WebUI.delay(5)
WebUI.setText(findTestObject('Object Repository/Page_Tecnicos/input_Tecnico Nombre_vTECNICONOMBRE'), Nombre)

WebUI.delay(5)

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Tecnicos/img_Status_vDISPLAY_0001'), 10)) {
    println('Existe Tecnico')

    WebUI.delay(5)

    WebUI.takeFullPageScreenshot()
} else {
    WebUI.click(findTestObject('Object Repository/Page_Tecnicos/input_Tecnicos_INSERT'))

    WebUI.delay(5)

    WebUI.setText(findTestObject('Object Repository/Page_Tecnico/input_Tcnico Nombre_W0027W0007W0009TECNICONOMBRE'), Nombre)

    WebUI.delay(5)

    WebUI.setText(findTestObject('Object Repository/Page_Tecnico/input_Documento_W0027W0007W0009TECNICOCI'), '51627079')

    WebUI.delay(5)

    WebUI.setText(findTestObject('Object Repository/Page_Tecnico/input_Celular_W0027W0007W0009TECNICOCEL'), '094568741')

    WebUI.delay(5)

    WebUI.setText(findTestObject('Object Repository/Page_Tecnico/input_Tcnico Nombre_W0027W0007W0009TECNICONOMBRE'), Nombre)

    WebUI.delay(5)

    WebUI.setText(findTestObject('Object Repository/Page_Tecnico/input_Email_W0027W0007W0009TECNICOEMAIL'), 'prueba@gmail.com')

    WebUI.delay(5)

    String UsuarioLGN = CustomKeywords.'CRPREP_USUARIOLOGEADO.CRPREP_Cliente_Numero'(Nombre)

    WebUI.delay(5)

    WebUI.setText(findTestObject('Object Repository/Page_Tecnico/input_Usuario de Sistema_W0027W0007W0009TEC_4ff68d'), UsuarioLGN)

    WebUI.delay(5)

    WebUI.setText(findTestObject('Object Repository/Page_Tecnico/input_Medio Cobro_W0027W0007W0009TECNICOMEDCOBROID'), '1')

    WebUI.delay(5)

    WebUI.click(findTestObject('Object Repository/Page_Tecnico/input_Medio Cobro_W0027W0007W0009ENTER'))

    WebUI.delay(5)

    WebUI.takeFullPageScreenshot()
}

