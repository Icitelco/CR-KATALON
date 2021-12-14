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

WebUI.setText(findTestObject('Object Repository/Page_Promocin/input_Nombre Cartelera_W0027W0007W0009PROMO_1fc479'), 'PROMOCION PRUEBA')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Promocin/select_Mismo ConceptoOtra de Linea mismo Co_f431e8'), 
    'L', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Promocin/select_NORMALRETENCIONCORTESIADEMO'), 'N', true)

WebUI.click(findTestObject('Object Repository/Page_Promocin/input_Restriccin de Zona_W0027W0007W0009ENTER'))

