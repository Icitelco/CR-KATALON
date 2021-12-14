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

WebUI.navigateToUrl('http://10.7.148.132:8080/SIGA-TG/servlet/wwpromocion')

WebUI.click(findTestObject('Page_Promociones/input_Promociones_INSERT'))

WebUI.setText(findTestObject('Object Repository/Page_Promocin/input_Nombre_W0027W0007W0009PROMOCIONNOMBRE'), 'RODRII PROMO')

WebUI.setText(findTestObject('Object Repository/Page_Promocin/input_Nombre Cartelera_W0027W0007W0009PROMO_1fc479'), 'PROMOCION PRUEBA')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Promocin/select_Mismo ConceptoOtra de Linea mismo Co_f431e8'), 
    'L', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Promocin/select_NORMALRETENCIONCORTESIADEMO'), 'N', true)

WebUI.click(findTestObject('Object Repository/Page_Promocin/input_Restriccin de Zona_W0027W0007W0009ENTER'))

WebUI.setText(findTestObject('Page_Promociones/input_Nombre_vPROMOCIONNOMBRE'), 'RODRII PROMO')

WebUI.click(findTestObject('Object Repository/Page_Promociones/img_Estado_vDISPLAY_0001'))

WebUI.click(findTestObject('Object Repository/Page_PROMOCIONNN PRUEBAA/span_Porcentaje de Descuento por Mes'))

WebUI.click(findTestObject('Object Repository/Page_Promocin/input_Dbito Dto _W0027W0007UPDATE'))

WebUI.click(findTestObject('Object Repository/Page_Promocin/span_Nueva fila'))

WebUI.setText(findTestObject('Object Repository/Page_Promocin/input_Dbito Dto _W0027W0007W0009PROMOCIONMES_0001'), '1')

WebUI.setText(findTestObject('Object Repository/Page_Promocin/input_Dbito Dto _W0027W0007W0009PROMOCIONDE_d05b5c'), '50,0000')

WebUI.setText(findTestObject('Object Repository/Page_Promocin/input_Dbito Dto _W0027W0007W0009PROMOCIONDT_8af9d5'), '50,0000')

WebUI.click(findTestObject('Object Repository/Page_Promocin/span_Nueva fila'))

WebUI.setText(findTestObject('Object Repository/Page_Promocin/input_Dbito Dto _W0027W0007W0009PROMOCIONMES_0002'), '2')

WebUI.setText(findTestObject('Object Repository/Page_Promocin/input_Dbito Dto _W0027W0007W0009PROMOCIONDT_fc9fb4'), '30')

WebUI.setText(findTestObject('Object Repository/Page_Promocin/input_Dbito Dto _W0027W0007W0009PROMOCIONDE_8ccedc'), '50')

WebUI.click(findTestObject('Object Repository/Page_Promocin/span_Nueva fila'))

WebUI.setText(findTestObject('Object Repository/Page_Promocin/input_Dbito Dto _W0027W0007W0009PROMOCIONMES_0003'), '3')

WebUI.setText(findTestObject('Object Repository/Page_Promocin/input_Dbito Dto _W0027W0007W0009PROMOCIONDT_05bd66'), '20')

WebUI.setText(findTestObject('Object Repository/Page_Promocin/input_Dbito Dto _W0027W0007W0009PROMOCIONDE_2e716f'), '50')

WebUI.click(findTestObject('Object Repository/Page_Promocin/input_Nueva fila_W0027W0007W0009ENTER'))

WebUI.click(findTestObject('Object Repository/Page_Promocin/input_Histricos_W0027W0007INSERT'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Producto Politica Promocion/select_2017 SERVICIO DIGITAL2017 SERVICIO D_d634fd'), 
    '4014', true)

WebUI.setText(findTestObject('Object Repository/Page_Producto Politica Promocion/input_Politica Comercial_W0019W0007W0009POLITICAID'), 
    '15894')

WebUI.click(findTestObject('Object Repository/Page_Producto Politica Promocion/input_Prioridad de Aplicacin_W0019W0007W0009ENTER'))

WebUI.click(findTestObject('Object Repository/Page_Promocin/span_Promocion Vigencias'))

WebUI.click(findTestObject('Object Repository/Page_Promocin/input_Histricos_W0027W0007INSERT'))

WebUI.setText(findTestObject('Object Repository/Page_Promocion Vigencia/input_Vigente Desde_W0024W0007W0009PROMOCIO_ed2f46'), 
    '18/03/2020')

WebUI.setText(findTestObject('Object Repository/Page_Promocion Vigencia/input_Vigente Hasta_W0024W0007W0009PROMOCIO_b17ee8'), 
    '18/03/2030')

WebUI.click(findTestObject('Object Repository/Page_Promocion Vigencia/input_Vigente Hasta_W0024W0007W0009ENTER'))

