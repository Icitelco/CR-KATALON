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

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Movimientos de Stock/select_NUEVO A DEPOSITODEPOSITO A MOVILDEPOSITO A DEPOSITODEPOSITO A TALLERMOVIL A DEPOSITOMOVIL A MOVILNUEVO A MOVILTALLER A DEPOSITOTRASPASO AUTOMATICO'), 
    '2', true)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Movimientos de Stock/select_LUVITILSE (MOVILES)'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Movimientos de Stock/select_LUVITILSE (MOVILES)'))

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Movimientos de Stock/select_LUVITILSE (MOVILES)'), '9', 
    true)

WebUI.delay(5)

WebUI.uploadFile(findTestObject('COSTA RICA/input_BOTON_CARGAR_ARCHIVO'), 'C:\\Users\\icikatalon\\Desktop\\MOVIMIENTO DE DEPOSITO A MOVIL.xls')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_699266/input_CARGAR_PROCESAR'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_699260/span_Artculos con Serie del Movimiento'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_699277/input_Procesar_W0029W0007vCHECKALL'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_699277/input_Pgina 1 de 1_W0029W0007SOLICITARAUTORIZACION'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_699277/input_Procesar_W0029W0007vCHECKALL'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_699277/input_Procesar_W0029W0007vCHECKALL'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_699277/input_Histrico_W0029W0007AUTORIZAR'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_699277/input_Procesar_W0029W0007vCHECKALL'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_699277/input_Procesar_W0029W0007vCHECKALL'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_699277/input_Pgina 1 de 1_W0029W0007PROCESAR'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_699277/input_Procesar MovStockNro_CONFIRMAR'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_699277/input_Procesar MovStockNro_VOLVER'))

WebUI.delay(5)

