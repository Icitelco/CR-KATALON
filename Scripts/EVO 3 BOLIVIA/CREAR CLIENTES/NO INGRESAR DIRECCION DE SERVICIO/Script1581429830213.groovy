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

WebUI.navigateToUrl('https://192.168.1.115/SIGA-BO/servlet/wwcliente')

WebUI.click(findTestObject('Object Repository/Page_Clientes/input_Clientes_INSERT'))

WebUI.delay(10)

WebUI.setText(findTestObject('Object Repository/Page_Cliente/input_Nombre_W0029W0007W0009CLIENTENOM'), 'PRUEBA HOME')

WebUI.setText(findTestObject('Object Repository/Page_Cliente/input_Apellido_W0029W0007W0009CLIENTEAPE'), 'PRUEBA')

WebUI.clearText(findTestObject('Object Repository/Page_Cliente/input_Fecha de Nacimiento_W0029W0007W0009CL_add09b'))

WebUI.setText(findTestObject('Object Repository/Page_Cliente/input_Fecha de Nacimiento_W0029W0007W0009CL_add09b'), '20/08/2000')

WebUI.selectOptionByValue(findTestObject('BOLIVIA/select_(Ninguno)MASCULINOFEMENINO_1'), 'M', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Cliente/select_DTH PREPAGOHFC HOMEDTH POSPAGOCORPOR_ce81ba'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Cliente/select_CLIENTE STAFFCLIENTES DTH PRECORPORA_44c2a3'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Cliente/select_(Ninguno)ABJASIAAFGHANISTANALBANIAAL_5ee262'), 
    '75', true)

WebUI.setText(findTestObject('Object Repository/Page_Cliente/input_NIT_W0029W0007W0009CLIENTERUT'), '4263692|460919')

WebUI.click(findTestObject('Object Repository/Page_Cliente/input_Nueva fila_W0029W0007W0009ENTER'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Cliente/input_Antiguedad de Deuda_W0029W0007W0009ENTER'))

