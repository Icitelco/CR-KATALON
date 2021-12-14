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

WebUI.delay(5)

WebUI.navigateToUrl('http://10.7.148.132:8080/SIGA-TG/servlet/wwpromociongrl')

WebUI.click(findTestObject('Object Repository/Page_Promociones Generales/input_Promociones Generales_INSERT'))

WebUI.delay(10)

WebUI.setText(findTestObject('Object Repository/Page_Promocion General/input_Nombre_W0027W0007W0009PROMOCIONGRLNOMBRE'), 
    'PROMOCION GENERAL KATALON PRUEBA')

WebUI.delay(10)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Promocion General/select_Por ProductoGlobal'), 'G', true)

WebUI.delay(10)

WebUI.setText(findTestObject('Object Repository/Page_Promocion General/input_Dto _W0027W0007W0009PROMOCIONGRLDTOPRJ'), 'EEEE')

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_Promocion General/input_Permite Ajustar (aterrizado)_W0027W00_c1c330'))

