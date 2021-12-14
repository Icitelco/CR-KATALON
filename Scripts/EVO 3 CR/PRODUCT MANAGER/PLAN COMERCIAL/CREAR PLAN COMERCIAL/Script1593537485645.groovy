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
import net.bytebuddy.utility.RandomString as RandomString
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

WebUI.callTestCase(findTestCase('EVO 3 CR/LOGIN EVO 3 CR/LOGIN'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

WebUI.navigateToUrl('http://10.7.148.132:8080/SIGA-TG/servlet/wwplancomercial')

WebUI.click(findTestObject('Object Repository/Page_Planes Comerciales/input_Planes Comerciales_INSERT'))

String Nombre = RandomStringUtils.randomAlphabetic(20)

WebUI.setText(findTestObject('Object Repository/input_Nombre_W0027W0007W0009PLANCOMERCIALNOMBRE'), Nombre)

WebUI.setText(findTestObject('Object Repository/input_Nombre de Cartelera_W0027W0007W0009PL_e4d995'), Nombre)

WebUI.selectOptionByValue(findTestObject('Object Repository/select_CORPORATIVODTHFONATELHOMEPYMESSEGMEN_14c244'), '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/select_'), '1', true)

a = WebUI.getText(findTestObject('Object Repository/input_Nombre_W0027W0007W0009PLANCOMERCIALNOMBRE'))

WebUI.click(findTestObject('Object Repository/input_Restriccin de Sucursal_W0027W0007W0009ENTER'))

WebUI.delay(5)

String PlanComercial = CustomKeywords.'CRPRERP_PLANCOMERCIALID.CRPREP_Cliente_Numero'()

WebUI.setText(findTestObject('Object Repository/Page_Planes Comerciales/input_Plan Comercial Id_vPLANCOMERCIALID'), PlanComercial)

WebUI.click(findTestObject('Object Repository/Page_Planes Comerciales/input_Segmento de Negocio_SEARCHBUTTON'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Planes Comerciales/img_Status_vDISPLAY_0001'))

WebUI.click(findTestObject('Object Repository/span_Items del Plan Comercial'))

WebUI.click(findTestObject('Object Repository/input_Histricos_W0027W0007INSERT (2)'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Page_Plan Comercial Item/input_Descripcin_W0024W0007W0009PLANCOMERCI_5a653d'), 
    'BASICO')

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Page_Plan Comercial Item/input_Politica Default Nombre_W0024W0007W00_d29ca2'), 
    '1')

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Page_Plan Comercial Item/input_concat(No existe   Politica Comercial_96de2e'), 
    '887')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_BASICO/input_COMUN_W0024W0007W0009PLANCOMERCIALPRO_5b6bb1'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Plan Comercial Item/input_Nueva fila_W0024W0007W0009ENTER'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/input_Histricos_W0027W0007INSERT (2)'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Plan Comercial Item/input_Politica Default Nombre_W0024W0007W00_d29ca2'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Page_Plan Comercial Item/input_Descripcin_W0024W0007W0009PLANCOMERCI_5a653d'), 
    'DECODER')

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Page_Plan Comercial Item/input_Politica Default Nombre_W0024W0007W00_d29ca2'), 
    '354')

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Page_Plan Comercial Item/input_concat(No existe   Politica Comercial_96de2e'), 
    '2109')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_BASICO/input_COMUN_W0024W0007W0009PLANCOMERCIALPRO_5b6bb1'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Plan Comercial Item/input_Nueva fila_W0024W0007W0009ENTER'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/input_Histricos_W0027W0007INSERT (2)'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Page_Plan Comercial Item/input_Descripcin_W0024W0007W0009PLANCOMERCI_5a653d'), 
    'CABLE MODEM')

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Page_Plan Comercial Item/input_Politica Default Nombre_W0024W0007W00_d29ca2'), 
    '1460')

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Page_Plan Comercial Item/input_concat(No existe   Politica Comercial_96de2e'), 
    '7715')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_BASICO/input_COMUN_W0024W0007W0009PLANCOMERCIALPRO_5b6bb1'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Plan Comercial Item/input_Nueva fila_W0024W0007W0009ENTER'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/span_Vigencias'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/input_Histricos_W0027W0007INSERT (2)'))

mydate = new Date()

formattedDate = mydate.format('dd/MM/YYYY')

WebUI.setText(findTestObject('Object Repository/Page_Plan Comercial Vigencia/input_Fecha Inicial_W0024W0007W0009PLANCOME_a01ada'), 
    formattedDate)

mydate = (new Date() + 360)

formattedDate = mydate.format('dd/MM/YYYY')

WebUI.setText(findTestObject('Object Repository/Page_Plan Comercial Vigencia/input_Fecha Final_W0024W0007W0009PLANCOMERC_087235'), 
    formattedDate)

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Page_Plan Comercial Vigencia/input_Nombre_W0024W0007W0009PLANCOMERCIALVI_a7f10b'), 
    'VIGENCIA PRUEBA')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Plan Comercial Vigencia/input_Nombre_W0024W0007W0009ENTER'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/span_Sucursales'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/input_Histricos_W0027W0007INSERT (2)'))

WebUI.click(findTestObject('Object Repository/input_Sucursal_W0024W0007W0009ENTER'))

