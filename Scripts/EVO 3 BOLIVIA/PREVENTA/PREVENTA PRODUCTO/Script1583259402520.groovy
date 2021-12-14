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

WebUI.delay(5)

WebUI.navigateToUrl('https://192.168.1.115/SIGA-BO/servlet/wwpreventacliente')

WebUI.click(findTestObject('Object Repository/Page_Preventa Clientes/input_Preventa Clientes_AGREGARPREVENTAPRODUCTO'))

WebUI.selectOptionByValue(findTestObject('Page_Preventa Cliente/select_(Todos)DTH POSPAGODTH PREPAGOHFC TVH_f11028'), '3', 
    true)

WebUI.click(findTestObject('Page_Preventa Cliente/select_(Todos)CESAR AUGUSTO HERBAS TERCEROS_788c76'))

WebUI.selectOptionByValue(findTestObject('Page_Preventa Cliente/select_(Todos)CESAR AUGUSTO HERBAS TERCEROS_788c76'), '63779', 
    true)

WebUI.selectOptionByValue(findTestObject('Page_Preventa Cliente/select_(Todos)BAGO-CONSULTORIO MEDICO RUSIA_6a6c66'), '124', 
    true)

WebUI.setText(findTestObject('Page_Preventa Cliente/input_Cliente_W0027W0007W0009CLIENTENROPREVENTA'), '9')

WebUI.click(findTestObject('Page_Preventa Cliente/input_Observaciones_W0027W0007W0009ENTER'))

WebUI.click(findTestObject('Page_Preventa Cliente/span_Productos de la Preventa'))

WebUI.click(findTestObject('Page_Preventa Cliente/input_Pgina 0 de 0_W0027W0007AGREGARPRODUCTOS'))

WebUI.click(findTestObject('Page_Ingreso de Productos de Preventa/input_HAB_SELECCIONARPRODUCTOS'))

WebUI.setText(findTestObject('Page_Ingreso de Contratos/input_Nombre_vPRODUCTONOMBRE'), 'HFC-TV-BASICO-SCZ')

WebUI.click(findTestObject('BOLIVIA/input_ACTIVO_vSELECCIONADO_0002'))

WebUI.click(findTestObject('Object Repository/Page_Ingreso de Contratos/input_ACTIVO_CONFIRMARR'))

