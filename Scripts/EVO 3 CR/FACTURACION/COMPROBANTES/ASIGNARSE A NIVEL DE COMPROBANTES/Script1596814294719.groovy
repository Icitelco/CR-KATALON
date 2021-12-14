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

WebUI.navigateToUrl('http://10.7.148.132:8080/SIGA-TG/servlet/wwcmpteautorizanivel')

WebUI.setText(findTestObject('Object Repository/Page_Nivel de Autorizacin de Comprobantes/input_Nivel de Autorizacin Nombre_vCMPTENIV_e29f60'), 
    'HOME/PYMES - MENOR A 20000')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Nivel de Autorizacin de Comprobantes/img_Requiere Archivo Adjunto_vDISPLAY_0001'))

WebUI.click(findTestObject('Object Repository/Page_HOMEPYMES - MENOR A 20000/span_Roles'))

WebUI.setText(findTestObject('Object Repository/Page_HOMEPYMES - MENOR A 20000/input_Rol_W0027W0007vROLID'), 'ADM 1')

WebUI.delay(5)

    WebUI.click(findTestObject('Object Repository/Page_HOMEPYMES - MENOR A 20000/input_Roles_W0027W0007INSERT'))

    WebUI.setText(findTestObject('Object Repository/Page_Cmpte Nivel de Autorizacin Rol/input_Rol_W0024W0007W0009ROLID'), 
        'ADM 1')

    WebUI.click(findTestObject('Object Repository/Page_Cmpte Nivel de Autorizacin Rol/input_Autorizar_W0024W0007W0009CMPTENIVELRO_0a2d53'))

    WebUI.click(findTestObject('Object Repository/Page_Cmpte Nivel de Autorizacin Rol/input_Aplicar_W0024W0007W0009CMPTENIVELROLAPLICAR'))

    WebUI.click(findTestObject('Object Repository/Page_Cmpte Nivel de Autorizacin Rol/input_Anular_W0024W0007W0009CMPTENIVELROLANULAR'))

    WebUI.click(findTestObject('Object Repository/Page_Cmpte Nivel de Autorizacin Rol/input_Anular_W0024W0007W0009ENTER'))


