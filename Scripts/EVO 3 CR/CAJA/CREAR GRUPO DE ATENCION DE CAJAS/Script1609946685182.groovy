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

import org.apache.commons.lang.RandomStringUtils
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('EVO 3 CR/LOGIN EVO 3 CR/LOGIN'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.navigateToUrl('http://10.7.148.132:8080/SIGA-TG/servlet/wwcajagrupo')

WebUI.click(findTestObject('Object Repository/input_Grupo de Atencin de Cajas_INSERT'))

'Nombre Random'
String NombreCajaGrupo = RandomStringUtils.randomAlphabetic(20)

WebUI.setText(findTestObject('Object Repository/input_Grupo de Caja Nombre_W0027W0007W0009C_c2155b'), NombreCajaGrupo)

WebUI.click(findTestObject('Object Repository/input_Requiere Valores Apertura_W0027W0007W_63a144'))

WebUI.click(findTestObject('Object Repository/input_Es oficina de PagoOnLine_W0027W0007W0_8a4f72'))

WebUI.setText(findTestObject('Object Repository/input_Oficina_vCAJAGRUPONOMBRE'), NombreCajaGrupo)

WebUI.click(findTestObject('Object Repository/input_Oficina_SEARCHBUTTON'))

WebUI.click(findTestObject('Object Repository/img_Transfiere valores al cierre_vDISPLAY_0001'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/span_Cajas'))

WebUI.click(findTestObject('Object Repository/input_Cuentas bancarias_W0027W0007INSERT'))

String NombreCaja=CustomKeywords.'CRPERP_NOMBRE_CAJAA.CRPREP_Cliente_Numero'()

WebUI.setText(findTestObject('Object Repository/input_Nombre_W0027W0007W0009CAJANOMBRE'), NombreCaja)

WebUI.click(findTestObject('Object Repository/input_  _W0027W0007W0009ENTER'))

