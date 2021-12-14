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

WebUI.setText(findTestObject('Object Repository/Page_Plan Comercial/input_Nombre_W0027W0007W0009PLANCOMERCIALNOMBRE'), 'PLANNN COMERCIALL PRUEBAAA')

WebUI.setText(findTestObject('Object Repository/Page_Plan Comercial/input_Nombre de Cartelera_W0027W0007W0009PL_e4d995'), 
    'PLAN COMERCIAL PRUEBA')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Plan Comercial/select_CORPORATIVODTHFONATELHOMEPYMESSEGMEN_a20c43'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Plan Comercial/select_'), '1', true)

a = WebUI.getText(findTestObject('Object Repository/Page_Plan Comercial/input_Nombre_W0027W0007W0009PLANCOMERCIALNOMBRE'))

WebUI.click(findTestObject('Object Repository/Page_Plan Comercial/input_Restriccin de Sucursal_W0027W0007W0009ENTER'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Page_Planes Comerciales/input_Nombre_vPLANCOMERCIALNOMBRE'), 'KJYUKLTYUIO')

WebUI.click(findTestObject('Object Repository/Page_Planes Comerciales/img_Status_vDISPLAY_0001'))

WebUI.click(findTestObject('Object Repository/Page_Planes Comerciales/img_Status_vDISPLAY_0001'))

WebUI.click(findTestObject('Object Repository/Page_Plan Comercial/span_Items del Plan Comercial'))

WebUI.click(findTestObject('Object Repository/Page_Plan Comercial/input_Histricos_W0027W0007INSERT'))

WebUI.setText(findTestObject('Object Repository/Page_Plan Comercial Item/input_Descripcin_W0024W0007W0009PLANCOMERCI_5a653d'), 
    'BASICO')

WebUI.setText(findTestObject('Object Repository/Page_Plan Comercial Item/input_Politica Default Nombre_W0024W0007W00_d29ca2'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_Plan Comercial Item/input_concat(No existe   Politica Comercial_96de2e'), 
    '887')

WebUI.click(findTestObject('Object Repository/Page_Plan Comercial Item/input_Nueva fila_W0024W0007W0009ENTER'))

WebUI.click(findTestObject('Object Repository/Page_Plan Comercial/input_Histricos_W0027W0007INSERT'))

WebUI.click(findTestObject('Object Repository/Page_Plan Comercial Item/input_Politica Default Nombre_W0024W0007W00_d29ca2'))

WebUI.setText(findTestObject('Object Repository/Page_Plan Comercial Item/input_Descripcin_W0024W0007W0009PLANCOMERCI_5a653d'), 
    'DECODER')

WebUI.setText(findTestObject('Object Repository/Page_Plan Comercial Item/input_Politica Default Nombre_W0024W0007W00_d29ca2'), 
    '354')

WebUI.setText(findTestObject('Object Repository/Page_Plan Comercial Item/input_concat(No existe   Politica Comercial_96de2e'), 
    '2109')

WebUI.click(findTestObject('Object Repository/Page_Plan Comercial Item/input_Nueva fila_W0024W0007W0009ENTER'))

WebUI.click(findTestObject('Object Repository/Page_Plan Comercial/input_Histricos_W0027W0007INSERT'))

WebUI.setText(findTestObject('Object Repository/Page_Plan Comercial Item/input_Descripcin_W0024W0007W0009PLANCOMERCI_5a653d'), 
    'CABLE MODEM')

WebUI.setText(findTestObject('Object Repository/Page_Plan Comercial Item/input_Politica Default Nombre_W0024W0007W00_d29ca2'), 
    '1460')

WebUI.setText(findTestObject('Object Repository/Page_Plan Comercial Item/input_concat(No existe   Politica Comercial_96de2e'), 
    '7715')

WebUI.click(findTestObject('Object Repository/Page_Plan Comercial Item/input_Nueva fila_W0024W0007W0009ENTER'))

WebUI.click(findTestObject('Object Repository/Page_Plan Comercial/span_Vigencias'))

WebUI.click(findTestObject('Object Repository/Page_Plan Comercial/input_Histricos_W0027W0007INSERT'))

WebUI.setText(findTestObject('Page_Plan Comercial Vigencia/input_Fecha Inicial_W0024W0007W0009PLANCOME_a01ada'), '12/03/2020')

WebUI.setText(findTestObject('Page_Plan Comercial Vigencia/input_Fecha Final_W0024W0007W0009PLANCOMERC_087235'), '12/03/2030')

WebUI.setText(findTestObject('Page_Plan Comercial Vigencia/input_Nombre_W0024W0007W0009PLANCOMERCIALVI_a7f10b'), 'VIGENCIA PRUEBA')

WebUI.click(findTestObject('Page_Plan Comercial Vigencia/input_Nombre_W0024W0007W0009ENTER'))

