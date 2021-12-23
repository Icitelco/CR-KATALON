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

WebUI.click(findTestObject('Object Repository/Page_SIGA Software/svg_FERNANDO PENSATORI_feather feather-menu'))

String Nombre = WebUI.getText(findTestObject('Object Repository/Page_Grupo de Atencin de Cajas/span_FERNANDO PENSATORI'))

String Usuario = CustomKeywords.'CRPREP_USUARIOLOGEADO.CRPREP_Cliente_Numero'(Nombre);
println(Usuario);

String GrupoFlujo = CustomKeywords.'CRPRERP_GRUPO_FLUJO.CRPREP_Cliente_Numero'()

WebUI.setText(findTestObject('Object Repository/Page_Grupos del Flujo/input_Usuario Flujo_vFLGPOUSRNOMBRE'), GrupoFlujo)

WebUI.click(findTestObject('Object Repository/Page_Grupos del Flujo/input_Usuario Flujo_SEARCHBUTTON'))

WebUI.click(findTestObject('Object Repository/Page_Grupos del Flujo/img_Grupo Nombre_vDISPLAY_0001'))

WebUI.click(findTestObject('Object Repository/Page_GRUPO SUSPENSION/input_ROY ALEXANDER RIVERA GUTIERREZ_W0027W_90ef6d'))

WebUI.click(findTestObject('Object Repository/Page_GRUPO SUSPENSION/span_Nueva fila'))

WebUI.setText(findTestObject('Object Repository/Page_GRUPO SUSPENSION/input_ROY ALEXANDER RIVERA GUTIERREZ_W0027W_de85fe'), 
    Usuario)

WebUI.click(findTestObject('Object Repository/Page_GRUPO SUSPENSION/input_Nueva fila_W0027W0007W0009ENTER'))

