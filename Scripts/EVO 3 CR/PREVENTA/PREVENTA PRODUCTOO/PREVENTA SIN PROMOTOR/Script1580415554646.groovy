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

WebUI.callTestCase(findTestCase('EVO 3 CR/LOGIN EVO 3 CR/LOGIN'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(10)

WebUI.navigateToUrl('http://10.7.148.132:8080/SIGA-TG/servlet/wwpreventaclientedeusuario')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Preventa Clientes de Usuario/input_MARCAUZ_AGREGARPREVENTAPRODUCTO'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Preventa Cliente/select_(Ninguno)BASICO CATVBASICO CATV - IN_ab7ec5'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Preventa Cliente/select_ALTERNATIVE CHANNELSB2C ATLANTICAB2C_6d8990'), 
    '122', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Preventa Cliente/select_(Ninguno)BRITVCALL CENTER SACDTH TMK_6d2d06'), 
    '140', true)

//CLIENTE EN STS INGRESADO
String Clientenro=CustomKeywords.'CRPREP_CLIENTE_INGRESADO_HOME_SIN_PREVENTA.CRPREP_Cliente_Numero'()

WebUI.setText(findTestObject('Object Repository/Page_Preventa Cliente/input_Cliente_W0027W0007W0009CLIENTENROPREVENTA'), 
    Clientenro)

WebUI.click(findTestObject('Object Repository/Page_Preventa Cliente/input_Observaciones_W0027W0007W0009ENTER'))

