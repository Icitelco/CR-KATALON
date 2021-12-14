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

WebUI.callTestCase(findTestCase('EVO 3 CR/LOGIN EVO 3 CR/LOGIN'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

WebUI.navigateToUrl('http://10.7.148.132:8080/SIGA-TG/servlet/wwplancomercial')

WebUI.click(findTestObject('Object Repository/Page_Planes Comerciales/input_Planes Comerciales_INSERT'))

WebUI.setText(findTestObject('Object Repository/Page_Plan Comercial/input_Nombre_W0027W0007W0009PLANCOMERCIALNOMBRE'), 'PLAN COMERCIAL PRUEBAAAAA')

WebUI.setText(findTestObject('Object Repository/Page_Plan Comercial/input_Nombre de Cartelera_W0027W0007W0009PL_e4d995'), 
    'PLAN COMERCIAL PRUEBA')

a = WebUI.getText(findTestObject('Object Repository/Page_Plan Comercial/input_Nombre_W0027W0007W0009PLANCOMERCIALNOMBRE'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Plan Comercial/select_CORPORATIVODTHFONATELHOMEPYMESSEGMEN_a20c43'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Plan Comercial/select_'), '1', true)

WebUI.click(findTestObject('Object Repository/Page_Plan Comercial/input_Restriccin de Sucursal_W0027W0007W0009ENTER'))

WebUI.setText(findTestObject('Object Repository/Page_Planes Comerciales/input_Nombre_vPLANCOMERCIALNOMBRE'), a)

WebUI.click(findTestObject('Object Repository/Page_Planes Comerciales/img_Status_vDISPLAY_0001'))

WebUI.click(findTestObject('Object Repository/Page_Planes Comerciales/img_Status_vDISPLAY_0001'))

WebUI.click(findTestObject('Object Repository/Page_Plan Comercial/span_Items del Plan Comercial'))

WebUI.click(findTestObject('Object Repository/Page_Plan Comercial/input_Histricos_W0027W0007INSERT'))

WebUI.setText(findTestObject('Object Repository/Page_Plan Comercial Item/input_Politica Default Nombre_W0024W0007W00_d29ca2'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_Plan Comercial Item/input_concat(No existe   Politica Comercial_96de2e'), 
    '887')

WebUI.click(findTestObject('Object Repository/Page_Plan Comercial Item/input_Nueva fila_W0024W0007W0009ENTER'))

