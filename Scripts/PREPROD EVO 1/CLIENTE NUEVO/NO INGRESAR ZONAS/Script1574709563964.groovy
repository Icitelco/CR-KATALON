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

WebUI.callTestCase(findTestCase('PREPROD EVO 1/CLIENTE NUEVO/LOGIN'), [:], FailureHandling.CONTINUE_ON_FAILURE)


WebUI.click(findTestObject('Object Repository/Page_SIGA Software/span_Gestin Comercial'))

WebUI.click(findTestObject('Object Repository/Page_SIGA Software/span_Clientes'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Clientes/input_Clientes_INSERT'))

WebUI.delay(10)

WebUI.setText(findTestObject('Object Repository/Page_Cliente/input_Nombre_W0030W0008W0007CLIENTENOM'), 'Prueba Autogestion')

WebUI.setText(findTestObject('Object Repository/Page_Cliente/input_Apellido_W0030W0008W0007CLIENTEAPE'), 'Prueba')

WebUI.clearText(findTestObject('Object Repository/Page_Cliente/input_Fecha de Nacimiento_W0030W0008W0007CLIENTEFCHNAC'))

//WebUI.click(findTestObject('Object Repository/Page_Cliente/img_Fecha de Nacimiento_W0030W0008W0007CLIENTEFCHNAC_dp_trigger'))
//WebUI.clickOffset(findTestObject('Object Repository/Page_Cliente/CALENDARIOO'), 10, 50)
WebUI.setText(findTestObject('Object Repository/Page_Cliente/input_Fecha de Nacimiento_W0030W0008W0007CLIENTEFCHNAC'), '20/08/2000')

WebUI.delay(10)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Cliente/select_(Ninguno)Cdula JurdicaCdula Residencia PermanenteCdula Residencia TemporalCdula de IdentidadLicencia de ConducirNITEPasaporte'),
	'JUR', true)

WebUI.setText(findTestObject('Object Repository/Page_Cliente/input_Cdula_W0030W0008W0007vCEDULA'), '1-5698-3256')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Cliente/select_(Ninguno)MASCULINOFEMENINO'), 'M', true)

WebUI.setText(findTestObject('Object Repository/Page_Cliente/input_Telfono Principal_W0030W0008W0007CLIENTETELPPL'), '85693256')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Cliente/select_CORPORATIVODTHFONATELHOMEPYMESWHOLESALE'),
	'1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Cliente/TIPOCLIENTE'), '114', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Cliente/CARTERA'), '341', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Cliente/PAIS'), '1', true)

WebUI.setText(findTestObject('Object Repository/Page_Cliente/DIRECCION'), 'PRUEBA')

//WebUI.click(findTestObject('Object Repository/Page_Cliente/a_ALAL-01'))
//WebUI.click(findTestObject('Object Repository/Page_Cliente/input_Zona Nombre_W0030W0008W0007vPROMPTZONA'))
WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Cliente/input_ _W0030W0008W0007ENTER'))

WebUI.delay(10)

WebUI.takeScreenshot()