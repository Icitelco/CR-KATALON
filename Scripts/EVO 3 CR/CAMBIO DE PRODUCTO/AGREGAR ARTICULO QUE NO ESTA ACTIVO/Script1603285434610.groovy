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

WebUI.click(findTestObject('Object Repository/Page_SIGA Software/span_Product Manager'))

WebUI.click(findTestObject('Object Repository/Page_SIGA Software/span_Productos'))

WebUI.setText(findTestObject('Object Repository/Page_Productos/input_Nombre_vPRODUCTONOMBRE'), 'INTERNET RESIDENCIAL 4 MEGAS')

WebUI.click(findTestObject('Object Repository/Page_Productos/input_Filtros avanzados_SEARCHBUTTON'))

WebUI.click(findTestObject('Object Repository/Page_Productos/a_INTERNET RESIDENCIAL 4 MEGAS'))

WebUI.click(findTestObject('Object Repository/Page_INTERNET RESIDENCIAL 4 MEGAS/span_Materiales'))

WebUI.click(findTestObject('Object Repository/Page_INTERNET RESIDENCIAL 4 MEGAS/a_CABLE MODEM'))

WebUI.click(findTestObject('Object Repository/Page_CABLE MODEM/input_EMTA DOCSIS 3.0 TG2482 ARRIS_W0024W00_3c19c2'))

WebUI.delay(10)

WebUI.uncheck(findTestObject('Object Repository/Page_CABLE MODEM/input_CABLE MODEM WIRELESS HITRON CGN-1000 _e27234'))

WebUI.click(findTestObject('Object Repository/Page_CABLE MODEM/input_Nueva fila_W0024W0007W0009ENTER'))

WebUI.navigateToUrl('http://10.7.148.132:8080/SIGA-TG/servlet/wope0300')

ORDENNRO = CustomKeywords.'CRPREP_ORDEN_INSTALACION_EMITIDA_RES_4_MEGAS.CRPREP_Cliente_Numero'()

WebUI.setText(findTestObject('Object Repository/Page_Pantalla de Ordenes de Servicio/input_Orden Nro_vE_ORDENNRO_F'), ORDENNRO)

mydate = new Date()

formattedDate = mydate.format('dd/MM/YYYY')

WebUI.setText(findTestObject('Object Repository/Page_Pantalla de Ordenes de Servicio/input_Desde Ingreso_vE_FROMORDENFING'), 
    '01/01/2000')

WebUI.setText(findTestObject('Object Repository/Page_Pantalla de Ordenes de Servicio/input_Hasta Ingreso_vE_TOORDENFING'), 
    formattedDate)

WebUI.click(findTestObject('Object Repository/Page_Pantalla de Ordenes de Servicio/input_Cliente Nro_BUTTON1'))

WebUI.click(findTestObject('Object Repository/Page_Pantalla de Ordenes de Servicio/img_Orden Confirmada_vE_UPDATE_0001'))

TECNICOID = CustomKeywords.'CRPREP_TECNICO_EN_CENTRO_DE_STOCK.CRPREP_Cliente_Numero'()

WebUI.setText(findTestObject('Object Repository/Page_1013353520/input_Tcnico_W0026W0007W0009TECNICOID'), TECNICOID)

WebUI.click(findTestObject('Object Repository/Page_1013353520/input_Observacin_W0026W0007W0009ENTER'))

WebUI.navigateToUrl('http://10.7.148.132:8080/SIGA-TG/servlet/wope0300')

WebUI.click(findTestObject('Object Repository/Page_Pantalla de Ordenes de Servicio/input_Orden Confirmada_vE_APROVISIONAR_0001'))

//WebUI.navigateToUrl('http://10.7.148.132:8080/SIGA-TG/servlet/wope0010?1013353520')
WebUI.click(findTestObject('Page_Aprovisionar Orden de Servicio/input_Page_ELEGIRARTPARAINSTALAR'))

String URL = WebUI.getUrl()

ARTICULOSERIE = CustomKeywords.'CRPREP_ARTICULO_EN_CENTRO_DE_STOCK.CRPREP_Cliente_Numero'()

WebUI.setText(findTestObject('Object Repository/Page_Aprovisionar Orden de Servicio/input_Numero de Serie_vARTICULOSERIE'), 
    ARTICULOSERIE)

WebUI.click(findTestObject('Object Repository/Page_Aprovisionar Orden de Servicio/input_Articulo_SEARCHBUTTON'))

WebUI.delay(10)

//WebUI.click(findTestObject('Object Repository/Page_Aprovisionar Orden de Servicio/span_Seleccionar Articulo Serie en Mvil de _3b0275'))
WebUI.navigateToUrl('http://10.7.148.132:8080/SIGA-TG/servlet/entitymanagerproductomaterial?DSP,10,947,2,')

WebUI.click(findTestObject('Object Repository/Page_CABLE MODEM/input_EMTA DOCSIS 3.0 TG2482 ARRIS_W0024W00_3c19c2'))

WebUI.delay(10)

WebUI.check(findTestObject('Object Repository/Page_CABLE MODEM/input_CABLE MODEM WIRELESS HITRON CGN-1000 _e27234'))

WebUI.click(findTestObject('Object Repository/Page_CABLE MODEM/input_Nueva fila_W0024W0007W0009ENTER'))

WebUI.navigateToUrl('http://10.7.148.132:8080/SIGA-TG/servlet/wope0300')

WebUI.click(findTestObject('Object Repository/Page_Pantalla de Ordenes de Servicio/input_Orden Confirmada_vE_APROVISIONAR_0001'))

WebUI.navigateToUrl(URL)

WebUI.delay(10)

WebUI.click(findTestObject('Page_Aprovisionar Orden de Servicio/input_Page_ELEGIRARTPARAINSTALAR'))

//ARTICULOSERIE = CustomKeywords.'CRPREP_ARTICULO_EN_CENTRO_DE_STOCK.CRPREP_Cliente_Numero'()
WebUI.setText(findTestObject('Object Repository/Page_Aprovisionar Orden de Servicio/input_Numero de Serie_vARTICULOSERIE'), 
    ARTICULOSERIE)

WebUI.click(findTestObject('Object Repository/Page_Aprovisionar Orden de Servicio/input_Articulo_SEARCHBUTTON'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Aprovisionar Orden de Servicio/span_Seleccionar Articulo Serie en Mvil de _3b0275'), 
    20)

