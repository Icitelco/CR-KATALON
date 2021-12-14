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

WebUI.callTestCase(findTestCase('EVO 3 BOLIVIA/LOGIN EVO 3'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.navigateToUrl('http://192.168.1.115:8080/SIGA-BO/servlet/wwcajagrupodia')

WebUI.click(findTestObject('Object Repository/Page_Cajas Diarias de Oficina/input_Pgina 0 de 0_CREARCAJASDELDIA'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/BOLIVIA/input_Caja Nro_vSEL_0001'))

WebUI.click(findTestObject('Object Repository/BOLIVIA/input_Caja Nro_vSEL_0002 (1)'))

WebUI.click(findTestObject('Object Repository/BOLIVIA/CREAR CAJAS'))

WebUI.delay(4)

WebUI.refresh()

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Page_Cajas Diarias de Oficina/a_Valores'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Caja Grupo Usuario/Page_Caja Grupo Dia Valor/Page_Caja Diaria de Oficina/input_Depsitos_W0029W0007INSERT'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_Caja Grupo Usuario/Page_Caja Grupo Dia Valor/input_Importe_W0024W0007W0009ENTER'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Caja Grupo Usuario/Page_Caja Grupo Dia Valor/Page_Caja Diaria de Oficina/input_Pgina 1 de 1_W0029W0007ABRIR'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Caja Grupo Usuario/Page_Caja Grupo Dia Valor/Page_Caja Diaria de Oficina/input_Confirma abrir Caja_W0029W0007I_BUTTO_a888a8'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_Caja Grupo Usuario/Page_Caja Grupo Dia Valor/Page_Caja Diaria de Oficina/span_General'))

