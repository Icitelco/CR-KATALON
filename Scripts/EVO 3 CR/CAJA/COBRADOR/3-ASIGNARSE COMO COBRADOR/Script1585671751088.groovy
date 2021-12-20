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

WebUI.delay(5)

String Nombre = WebUI.getText(findTestObject('Object Repository/Page_Usuarios de Flujo/span_MAURICIO ARCAUZ'))

println(Nombre)

WebUI.navigateToUrl('http://10.7.148.132:8080/SIGA-TG/servlet/wwcobrador')

WebUI.setText(findTestObject('Page_Cobradores/input_Cobrador Nombre_vCOBRADORNOMBRE'), Nombre)

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Cobradores/img_Estado_vDISPLAY_0001'), 20)) {
    WebUI.click(findTestObject('Object Repository/Page_Cobradores/img_Estado_vDISPLAY_0001'))
} else {
    WebUI.click(findTestObject('Page_Cobradores/input_Cobradores_INSERT'))

    WebUI.delay(4)

    WebUI.setText(findTestObject('Object Repository/Page_Cobrador/input_Cobrador Nombre_W0027W0007W0009COBRAD_728e15'), 
        Nombre)

    WebUI.setText(findTestObject('Object Repository/Page_Cobrador/input_Usuario_W0027W0007W0009USUARIOID'), Nombre)

    WebUI.click(findTestObject('Object Repository/Page_Cobrador/input_MARCAUZ_W0027W0007W0009ENTER'))

    WebUI.setText(findTestObject('Page_Cobradores/input_Cobrador Nombre_vCOBRADORNOMBRE'), Nombre)

	//PRUEBA
    //WebUI.setText(findTestObject('Page_Cobradores/input_Cobrador Nombre_vCOBRADORNOMBRE'), Nombre)
}

