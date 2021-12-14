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
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('EVO 3 CR/LOGIN EVO 3 CR/LOGIN'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.navigateToUrl('http://10.7.148.132:8080/SIGA-TG/servlet/wwflgpousr')

WebUI.click(findTestObject('Object Repository/Page_Grupos del Flujo/input_Grupos del Flujo_INSERT'))

String NombreGrupo = RandomStringUtils.randomAlphabetic(10)

WebUI.setText(findTestObject('Object Repository/Page_Grupos de Usuario de Flujos/input_Nombre Grupo_W0027W0007W0009FLGPOUSRNOMBRE'), 
    NombreGrupo)

WebUI.click(findTestObject('Object Repository/Page_Grupos de Usuario de Flujos/input_Nueva fila_W0027W0007W0009ENTER'))

WebUI.setText(findTestObject('Page_Grupos del Flujo/input_Usuario Flujo_vFLGPOUSRNOMBRE'), NombreGrupo)

WebUI.click(findTestObject('Page_Grupos del Flujo/input_Usuario Flujo_SEARCHBUTTON'))

WebUI.click(findTestObject('Object Repository/Page_Grupos del Flujo/img_Grupo Nombre_vDISPLAY_0001'))

WebUI.click(findTestObject('Object Repository/Page_GRUPO SUSPENSION/input_ROY ALEXANDER RIVERA GUTIERREZ_W0027W_90ef6d'))

WebUI.click(findTestObject('Object Repository/Page_GRUPO SUSPENSION/input_Nueva fila_W0027W0007W0009ENTER'))

