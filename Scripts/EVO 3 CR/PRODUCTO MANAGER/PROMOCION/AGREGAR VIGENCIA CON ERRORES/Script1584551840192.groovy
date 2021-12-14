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

WebUI.delay(5)

WebUI.navigateToUrl('http://10.7.148.132:8080/SIGA-TG/servlet/wwpromocion')

WebUI.setText(findTestObject('Object Repository/Page_Promociones/input_Nombre_vPROMOCIONNOMBRE'), 'RODRII PROMO')

WebUI.click(findTestObject('Object Repository/Page_Promociones/img_Estado_vDISPLAY_0001'))

WebUI.click(findTestObject('Object Repository/Page_Promocin/span_Promocion Vigencias'))

WebUI.click(findTestObject('Object Repository/Page_Promocin/input_Histricos_W0027W0007INSERT'))

WebUI.setText(findTestObject('Object Repository/Page_Promocion Vigencia/input_Vigente Desde_W0024W0007W0009PROMOCIO_ed2f46'), 
    'RR/RR/RRRR')

WebUI.setText(findTestObject('Object Repository/Page_Promocion Vigencia/input_Vigente Hasta_W0024W0007W0009PROMOCIO_b17ee8'), 
    'RR/RR/RRRR')

WebUI.click(findTestObject('Object Repository/Page_Promocion Vigencia/input_Vigente Hasta_W0024W0007W0009ENTER'))

