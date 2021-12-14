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

WebUI.navigateToUrl('http://10.7.148.132:8080/SIGA-TG/servlet/wwproducto')

WebUI.click(findTestObject('Object Repository/Page_Productos/input_Productos_INSERT'))

WebUI.setText(findTestObject('Object Repository/Page_Producto/input_Nombre Abreviado_W0027W0007W0009PRODU_93f7c6'), 'PRODUCTO PRUEBA')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Producto/select_CAMARAS SEGURIDADCLOUDDATOSINTERNETO_fdb96c'), 
    'OTR', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Producto/select_ADICIONAL ACCESORIOADICIONAL BBIADIC_27ac71'), 
    'B', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Producto/select_PRINCIPALSECUNDARIONO'), 'P', true)

WebUI.click(findTestObject('Object Repository/Page_Producto/input_Genera corte de TAP_W0027W0007W0009ENTER'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Page_Productos/input_Nombre_vPRODUCTONOMBRE'), 'PRODUCTO PRUEBA')

