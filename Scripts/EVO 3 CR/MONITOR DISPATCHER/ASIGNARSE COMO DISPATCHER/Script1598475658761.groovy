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

WebUI.navigateToUrl('http://10.7.148.132:8080/SIGA-TG/servlet/wwdispatcher')

WebUI.click(findTestObject('Object Repository/Page_SIGA Software/svg_FERNANDO PENSATORI_feather feather-menu'))

WebUI.delay(5)

String Nombre = WebUI.getText(findTestObject('Object Repository/Page_Grupo de Atencin de Cajas/span_FERNANDO PENSATORI'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Page_Dispatchers/input_Nombre_vDISPATCHERNOMBRE'), Nombre)

println(Nombre)

WebUI.click(findTestObject('Object Repository/Page_Dispatchers/input_Nombre_SEARCHBUTTON'))

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Dispatchers/img_Estado_vDISPLAY_0001'), 15)) {
    println('Existe Dispatcher')

    WebUI.delay(5)

    WebUI.takeFullPageScreenshot()
} else {
    WebUI.click(findTestObject('Object Repository/Page_Dispatchers/input_Dispatchers_INSERT'))

    WebUI.delay(5)

    WebUI.setText(findTestObject('Object Repository/Page_Dispatcher/input_Nombre_W0037W0007W0009DISPATCHERNOMBRE'), Nombre)

    WebUI.delay(5)

    WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Dispatcher/select_INACTIVOACTIVOSUSPENDIDO'), 'A', 
        true)

    WebUI.delay(5)

    WebUI.click(findTestObject('Object Repository/Page_Dispatcher/input_Estado_W0037W0007W0009ENTER'))

    WebUI.delay(5)

    WebUI.clearText(findTestObject('Object Repository/Page_Dispatchers/input_Nombre_vDISPATCHERNOMBRE'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.delay(5)

    WebUI.setText(findTestObject('Object Repository/Page_Dispatchers/input_Nombre_vDISPATCHERNOMBRE'), Nombre)

    WebUI.delay(5)

    WebUI.click(findTestObject('Object Repository/Page_Dispatchers/img_Estado_vDISPLAY_0001'))

    WebUI.delay(5)

    WebUI.click(findTestObject('Object Repository/Page_PAUL SCHOLES/span_Usuarios'))

    WebUI.delay(5)

    WebUI.click(findTestObject('Object Repository/Page_PAUL SCHOLES/input_Tecnicos_W0037W0007INSERT'))

    WebUI.delay(5)

    WebUI.setText(findTestObject('Object Repository/Page_Usuario de Dispatcher/input_Usuario_W0024W0007W0009DISPATCHERUSUARIO'), 
        Nombre)

    WebUI.delay(5)

    WebUI.click(findTestObject('Object Repository/Page_Usuario de Dispatcher/input_Usuario no puede ser vacio_W0024W0007_9d7c81'))

    WebUI.delay(5)

    WebUI.click(findTestObject('Object Repository/Page_PAUL SCHOLES/span_Tecnicos'))

    WebUI.delay(5)

    WebUI.click(findTestObject('Object Repository/Page_PAUL SCHOLES/input_Tecnicos_W0037W0007INSERT'))

    WebUI.delay(5)

    WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Dispatcher Tecnico/select_ADAN PEAS ROJAS-DESCOADRIAN VEGA AST_2cd3af'), 
        '15388', true)

    WebUI.delay(5)

    WebUI.click(findTestObject('Object Repository/Page_Dispatcher Tecnico/input_Tcnico_W0019W0007W0009ENTER'))

    WebUI.delay(5)

    WebUI.takeFullPageScreenshot()
}

