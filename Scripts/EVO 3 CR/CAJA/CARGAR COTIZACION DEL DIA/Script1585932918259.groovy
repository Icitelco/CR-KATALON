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

mydate = new Date()

formattedDate = mydate.format('dd/MM/YYYY')

WebUI.delay(5)

WebUI.navigateToUrl('http://10.7.148.132:8080/SIGA-TG/servlet/wwmoneda')

'NOMBRE MONEDA'
WebUI.setText(findTestObject('Object Repository/Page_Monedas/input_Nombre_vMONEDANOMBRE'), 'DOLAR ')

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Monedas/img_AFIP Codigo Moneda_vDISPLAY_0001'), 30)

WebUI.click(findTestObject('Object Repository/Page_Monedas/img_AFIP Codigo Moneda_vDISPLAY_0001'))

WebUI.click(findTestObject('Object Repository/Page_DOLAR USA/span_Cotizacin'))

WebUI.click(findTestObject('Object Repository/Page_DOLAR USA/input_Cotizacin Fija para Negocios_W0027W00_77cf8c'))

'FECHA DE HOY (DD/MM/YYYY)'
WebUI.setText(findTestObject('Object Repository/Page_Moneda Cotizacin/input_Vigencia_W0024W0007W0009MONEDAFCH'), formattedDate)

WebUI.setText(findTestObject('Object Repository/Page_Moneda Cotizacin/input_Compra_W0024W0007W0009MONEDAVALCOM'), '10')

WebUI.setText(findTestObject('Object Repository/Page_Moneda Cotizacin/input_Venta_W0024W0007W0009MONEDAVALVTA'), '12')

WebUI.click(findTestObject('Object Repository/Page_Moneda Cotizacin/input_Sugerido_W0024W0007W0009ENTER'))

