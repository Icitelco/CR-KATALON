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

WebUI.callTestCase(findTestCase('PREPROD EVO 1/CLIENTE NUEVO/LOGIN'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_SIGA Software/span_Product Manager'))

WebUI.click(findTestObject('Object Repository/Page_SIGA Software/span_Plan Comercial'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Planes Comerciales/input_Planes Comerciales_INSERT'))

WebUI.setText(findTestObject('Object Repository/Page_Plan Comercial/input_Nombre_W0024W0008W0007PLANCOMERCIALNOMBRE'), 'PLAN PRUEBA')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Plan Comercial/select_'), '1', true)

WebUI.setText(findTestObject('Object Repository/Page_Plan Comercial/input_Nombre de Cartelera_W0024W0008W0007PL_91b522'), 
    'PLAN PRUEBA')

FECHA=WebUI.getText(findTestObject('Object Repository/Page_Plan Comercial/span_04122019'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Plan Comercial/select_CORPORATIVODTHFONATELHOMEPYMESWHOLESALE'), 
    '1', true)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Page_Plan Comercial/input_Restriccin de Sucursal_W0024W0008W0007ENTER'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Page_Planes Comerciales/input_Nombre_vPLANCOMERCIALNOMBRE'), 'PLAN PRUEBA')

WebUI.click(findTestObject('Object Repository/Page_Planes Comerciales/input_Segmento de Negocio_SEARCHBUTTON'))

WebUI.delay(2)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Page_Planes Comerciales/img_Status_vDISPLAY_0001'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_PLAN PRUEBA/span_Items del Plan Comercial'))

WebUI.click(findTestObject('Object Repository/Page_PLAN PRUEBA/input_Histricos_W0024W0008INSERT'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Page_Plan Comercial Item/input_Descripcin_W0022W0008W0007PLANCOMERCI_32bfe5'), 
    'INTERNET RESIDENCIAL 10 MEGAS')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Plan Comercial Item/img_Politica Default Nombre_W0022W0008W0007_ba530d'))

WebUI.click(findTestObject('Object Repository/Page_Plan Comercial Item/img_Politica Default Nombre_W0022W0008W0007_ba530d'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Page_Plan Comercial Item/input_Nombre_vPRODUCTONOMBRE'), 'INTERNET RESIDENCIAL 10 MEGAS')

WebUI.click(findTestObject('Object Repository/Page_Plan Comercial Item/input_Producto Tipo_SEARCHBUTTON'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Plan Comercial Item/a_INTERNET RESIDENCIAL 10 MEGAS'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Plan Comercial Item/input_Politica Default Nombre_W0022W0008W00_ddbaca'))

WebUI.delay(8)

WebUI.click(findTestObject('Object Repository/Page_Plan Comercial Item/a_LISTA300 SERVICIOMEG10 PAQUETEDP10Z'))

WebUI.click(findTestObject('Object Repository/Page_Plan Comercial Vigencia/input_Nombre_W0022W0008W0007ENTER'))

WebUI.click(findTestObject('Object Repository/Page_PLAN PRUEBA/input_Histricos_W0024W0008INSERT'))

WebUI.delay(10)

WebUI.setText(findTestObject('Object Repository/Page_Plan Comercial Item/input_Descripcin_W0022W0008W0007PLANCOMERCI_32bfe5'), 
    'ALQUILER')

WebUI.click(findTestObject('Object Repository/Page_Plan Comercial Item/input_Es Adicional_W0022W0008W0007PLANCOMER_17fd93'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Plan Comercial Item/select_gxfndisableCtrl(W0022W0008W0007PLANC_cfe032'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Plan Comercial Item/select_gxfndisableCtrl(W0022W0008W0007PLANC_cfe032'), 
    '1', true)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Plan Comercial Item/img_Politica Default Nombre_W0022W0008W0007_ba530d'))

WebUI.click(findTestObject('Object Repository/Page_Plan Comercial Item/img_Politica Default Nombre_W0022W0008W0007_ba530d'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Page_Plan Comercial Item/input_Nombre_vPRODUCTONOMBRE'), 'ALQUILER EAMTA INALAMBRICO DOCSIS 3.0')

WebUI.click(findTestObject('Object Repository/Page_Plan Comercial Item/input_Producto Tipo_SEARCHBUTTON'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Plan Comercial Item/a_ALQUILER EAMTA INALAMBRICO DOCSIS 30'))

WebUI.click(findTestObject('Object Repository/Page_Plan Comercial Item/input_Politica Default Nombre_W0022W0008W00_ddbaca'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_Plan Comercial Item/a_EAEM3 -- ALQUILER MTA INALAMBRICO'))

WebUI.click(findTestObject('Object Repository/Page_Plan Comercial Vigencia/input_Nombre_W0022W0008W0007ENTER'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Page_PLAN PRUEBA/input_Histricos_W0024W0008INSERT'))

WebUI.setText(findTestObject('Object Repository/Page_Plan Comercial Item/input_Descripcin_W0022W0008W0007PLANCOMERCI_32bfe5'),
	'PRODUCTO PRUEBA')
WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/Page_Plan Comercial Item/img_Politica Default Nombre_W0022W0008W0007_ba530d'))
WebUI.click(findTestObject('Object Repository/Page_Plan Comercial Item/img_Politica Default Nombre_W0022W0008W0007_ba530d'))

WebUI.setText(findTestObject('Object Repository/Page_Plan Comercial Item/input_Nombre_vPRODUCTONOMBRE'), 'PRODUCTO PRUEBA')

WebUI.click(findTestObject('Object Repository/Page_Plan Comercial Item/input_Producto Tipo_SEARCHBUTTON'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Plan Comercial Item/a_PRODUCTO PRUEBA'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Plan Comercial Item/input_Politica Default Nombre_W0022W0008W00_ddbaca'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Plan Comercial Item/a_POLITICA PRUEBA'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Page_Plan Comercial Item/input_Nueva fila_W0022W0008W0007ENTER'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Page_PLAN PRUEBA/span_Vigencias'))

WebUI.click(findTestObject('Object Repository/Page_PLAN PRUEBA/input_Histricos_W0024W0008INSERT'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Page_Plan Comercial Vigencia/input_Fecha Inicial_W0022W0008W0007PLANCOME_908c19'),
	FECHA)

WebUI.setText(findTestObject('Object Repository/Page_Plan Comercial Vigencia/input_Nombre_W0022W0008W0007PLANCOMERCIALVI_7fe7eb'),
	'PRUEBA VIGENCIA')

WebUI.setText(findTestObject('Object Repository/Page_Plan Comercial Vigencia/input_Fecha Final_W0022W0008W0007PLANCOMERC_120766'),
	'01/01/2030')

WebUI.click(findTestObject('Object Repository/Page_Plan Comercial Vigencia/input_Nombre_W0022W0008W0007ENTER'))

WebUI.delay(5)

WebUI.takeScreenshot()




