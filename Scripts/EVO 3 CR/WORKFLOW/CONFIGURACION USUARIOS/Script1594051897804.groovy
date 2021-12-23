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

WebUI.click(findTestObject('Object Repository/Page_SIGA Software/svg_FERNANDO PENSATORI_feather feather-menu'))

String Nombre = WebUI.getText(findTestObject('Object Repository/Page_Grupo de Atencin de Cajas/span_FERNANDO PENSATORI'))

String Usuario = CustomKeywords.'CRPREP_USUARIOLOGEADO.CRPREP_Cliente_Numero'(Nombre)

WebUI.setText(findTestObject('Object Repository/Page_Usuarios de Flujo/input_Nombre_vFLUSRNOMBRE'), Nombre)

WebUI.delay(5)

String usuarioWorkflow = CustomKeywords.'CRPRERP_FORMULARIO_WRFLW.CRPREP_Existe_Usuario'(Nombre)
println(usuarioWorkflow)

if (usuarioWorkflow != null) {
    WebUI.click(findTestObject('Object Repository/Page_Usuarios de Flujo/img_Puede Activar Etapas_vDISPLAY_0001'))
} else {
    WebUI.click(findTestObject('Object Repository/Page_Usuarios de Flujo/input_Usuarios de Flujo_INSERT'))

    WebUI.delay(5)

    WebUI.setText(findTestObject('Object Repository/Page_Usuarios de Flujo Corporativo/input_Usuario_W0027W0007W0009FLUSR'), 
        Usuario)

    WebUI.setText(findTestObject('Page_Usuarios de Flujo Corporativo/input_Nombre_W0027W0007W0009FLUSRNOMBRE'), Nombre)

    WebUI.click(findTestObject('Object Repository/Page_ADRIAN BRICEO MENA/input_Asigna Tramite_W0027W0007W0009FLUSRAS_a5725c'))

    WebUI.click(findTestObject('Object Repository/Page_ADRIAN BRICEO MENA/input_Puede Activar Etapas_W0027W0007W0009F_977b80'))

    WebUI.click(findTestObject('Object Repository/Page_Usuarios de Flujo Corporativo/input_Nueva fila_W0027W0007W0009ENTER'))
}

