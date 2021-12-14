import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

//WebUI.callTestCase(findTestCase('PREPROD EVO 1/CLIENTE NUEVO/LOGIN'), [:], FailureHandling.CONTINUE_ON_FAILURE)
WebUI.callTestCase(findTestCase('PREPROD EVO 1/CLIENTE NUEVO/LOGIN'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.navigateToUrl('http://10.7.148.132/SIGA-TG/servlet/wwcliente')

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

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Cliente/select_(Ninguno)MASCULINOFEMENINO_1'), 'M', true)

WebUI.setText(findTestObject('Object Repository/Page_Cliente/input_Telfono Principal_W0030W0008W0007CLIENTETELPPL'), '85693256')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Cliente/select_CORPORATIVODTHFONATELHOMEPYMESWHOLESALE'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Cliente/TIPOCLIENTE'), '114', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Cliente/CARTERA'), '341', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Cliente/PAIS'), '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Cliente/Provincia'), '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Cliente/Canton'), '21', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Cliente/Districto'), '203', true)

WebUI.delay(10)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Cliente/LOCALIZACIOOOOON'), '468', true)

WebUI.setText(findTestObject('Object Repository/Page_Cliente/DIRECCION'), 'PRUEBA')

//WebUI.click(findTestObject('Object Repository/Page_Cliente/a_ALAL-01'))
//WebUI.click(findTestObject('Object Repository/Page_Cliente/input_Zona Nombre_W0030W0008W0007vPROMPTZONA'))
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Cliente/select_ALAJUELAALAL-01ALAL-02ALAL-03ALAL-04ALAL-05ALAL-06ALAL-07ALAL-08ALAL-09ALAL-10ALAL-11ALDE-01ALSA-04SAHO-01SRSR-02ZONA 2'), 
    '2', true)

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_Cliente/input_ _W0030W0008W0007ENTER'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_PRUEBA AUTOGESTION PRUEBA/input_Antiguedad de Deuda_W0030W0008W0007ENTER'))

WebUI.delay(15)

WebUI.click(findTestObject('Object Repository/Page_PRUEBA AUTOGESTION PRUEBA/input_Tipo de  Retencion_W0030W0008W0007ENTER'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_PRUEBA AUTOGESTION PRUEBA/span_General'))

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Page_PRUEBA AUTOGESTION PRUEBA/span_Informacin de Cobro'))

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Page_PRUEBA AUTOGESTION PRUEBA/span_Documentos de ID'))

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Page_PRUEBA AUTOGESTION PRUEBA/span_Telfonos'))

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Page_PRUEBA AUTOGESTION PRUEBA/span_E-Mails'))

WebUI.click(findTestObject('Object Repository/Page_PRUEBA AUTOGESTION PRUEBA/input_Histricos_W0030W0008INSERT'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Page_Cliente EMail/input_EMail_W0022W0008W0007CLIENTEEMAIL'), 'prueba@hotmail.com')

WebUI.click(findTestObject('Object Repository/Page_Cliente EMail/input_ltima Actualizacin_W0022W0008W0007ENTER'))

WebUI.delay(5)

WebUI.takeScreenshot()

