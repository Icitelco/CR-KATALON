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
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('EVO 3 CR/LOGIN EVO 3 CR/LOGIN'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.navigateToUrl('http://10.7.148.132:8080/SIGA-TG/servlet/wwmovstock')

WebUI.click(findTestObject('Object Repository/Page_Movimientos de Stock/input_Movimientos de Stock_CARGARPLANILLA'))

WebUI.uploadFile(findTestObject('COSTA RICA/input_BOTON_CARGAR_ARCHIVO'), 'C:\\Users\\icikatalon\\Desktop\\ARTICULO NUEVO A DEPOSITO.xls')

WebUI.click(findTestObject('Object Repository/Page_699266/input_CARGAR_PROCESAR'))

WebUI.click(findTestObject('Object Repository/Page_699260/span_Artculos con Serie del Movimiento'))

WebUI.click(findTestObject('Object Repository/Page_699277/input_Procesar_W0029W0007vCHECKALL'))

WebUI.click(findTestObject('Object Repository/Page_699277/input_Pgina 1 de 1_W0029W0007SOLICITARAUTORIZACION'))

WebUI.click(findTestObject('Object Repository/Page_699277/input_Procesar_W0029W0007vCHECKALL'))

WebUI.click(findTestObject('Object Repository/Page_699277/input_Procesar_W0029W0007vCHECKALL'))

WebUI.click(findTestObject('Object Repository/Page_699277/input_Histrico_W0029W0007AUTORIZAR'))

WebUI.click(findTestObject('Object Repository/Page_699277/input_Procesar_W0029W0007vCHECKALL'))

WebUI.click(findTestObject('Object Repository/Page_699277/input_Procesar_W0029W0007vCHECKALL'))

WebUI.click(findTestObject('Object Repository/Page_699277/input_Pgina 1 de 1_W0029W0007PROCESAR'))

WebUI.click(findTestObject('Object Repository/Page_699277/input_Procesar MovStockNro_CONFIRMAR'))

WebUI.click(findTestObject('Object Repository/Page_699277/input_Procesar MovStockNro_VOLVER'))

