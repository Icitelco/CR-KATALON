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

WebUI.setText(findTestObject('Object Repository/Page_Dispatchers/input_Nombre_vDISPATCHERNOMBRE'), 'PAUL SCHOLES')

WebUI.click(findTestObject('Object Repository/Page_Dispatchers/input_Nombre_SEARCHBUTTON'))

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Dispatchers/img_Estado_vDISPLAY_0001'), 15)) {
    println('Existe Dispatcher')
} else {
    WebUI.click(findTestObject('Object Repository/Page_Dispatchers/input_Dispatchers_INSERT'))

    WebUI.setText(findTestObject('Object Repository/Page_Dispatcher/input_Nombre_W0037W0007W0009DISPATCHERNOMBRE'), 'PAUL SCHOLES')

    WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Dispatcher/select_INACTIVOACTIVOSUSPENDIDO'), 'A', 
        true)

    WebUI.click(findTestObject('Object Repository/Page_Dispatcher/input_Estado_W0037W0007W0009ENTER'))

    WebUI.setText(findTestObject('Object Repository/Page_Dispatchers/input_Nombre_vDISPATCHERNOMBRE'), 'PAUL SCHOLES')

    WebUI.delay(15)

    WebUI.click(findTestObject('Object Repository/Page_Dispatchers/img_Estado_vDISPLAY_0001'))

    WebUI.click(findTestObject('Object Repository/Page_PAUL SCHOLES/span_Usuarios'))

    WebUI.click(findTestObject('Object Repository/Page_PAUL SCHOLES/input_Tecnicos_W0037W0007INSERT'))

    String Nombre = WebUI.getText(findTestObject('Object Repository/Page_Usuarios de Flujo/span_MAURICIO ARCAUZ'))

    WebUI.setText(findTestObject('Object Repository/Page_Usuario de Dispatcher/input_Usuario_W0024W0007W0009DISPATCHERUSUARIO'), 
        Nombre)

    WebUI.click(findTestObject('Object Repository/Page_Usuario de Dispatcher/input_Usuario no puede ser vacio_W0024W0007_9d7c81'))

    WebUI.click(findTestObject('Object Repository/Page_PAUL SCHOLES/span_Tecnicos'))

    WebUI.click(findTestObject('Object Repository/Page_PAUL SCHOLES/input_Tecnicos_W0037W0007INSERT'))

    WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Dispatcher Tecnico/select_ADAN PEAS ROJAS-DESCOADRIAN VEGA AST_2cd3af'), 
        '16600', true)

    WebUI.click(findTestObject('Object Repository/Page_Dispatcher Tecnico/input_Tcnico_W0019W0007W0009ENTER'))
}

