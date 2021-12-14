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

WebUI.navigateToUrl('http://10.7.148.132:8080/SIGA-TG/servlet/wwcliente')

WebUI.click(findTestObject('Object Repository/Page_Clientes/input_Clientes_INSERT'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/input_Nombre_W0033W0007W0009CLIENTENOM'), 'PRUEBA KATALON')

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/input_Apellido_W0033W0007W0009CLIENTEAPE'), 'CLIENTE HOME')

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Object Repository/select_(Ninguno)Cdula JurdicaCdula Residenc_5df885'), 'CNA', 
    true)

WebUI.setText(findTestObject('Object Repository/input_Cdula_W0033W0007W0009vCEDULA'), '1-2356-8965')

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/input_Fecha de Nacimiento_W0033W0007W0009CL_df87f2'), '20/08/2000')

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Object Repository/select_(Ninguno)MASCULINOFEMENINO'), 'M', true)

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/input_Telfono Principal_W0033W0007W0009vCLIENTETEL'), '64569854')

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Object Repository/COSTA RICA/select_(Ninguno)ABJASIAAFGHANISTANALBANIAAL_5ee262'), 
    '75', true)

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Object Repository/select_ALAJUELACARTAGOGUANACASTEHEREDIALIMO_ef087e'), '2', true)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/select_(Ninguno)ALAJUELAATENASGRECIAGUATUSO_df2ac0'))

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Object Repository/select_(Ninguno)ALAJUELAATENASGRECIAGUATUSO_df2ac0'), '21', 
    true)

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Object Repository/select_(Ninguno)ALAJUELA DISTRITOCAJON DIST_9454d1'), '203', 
    true)

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Object Repository/select_(Ninguno)ALAJUELA'), '468', true)

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/textarea_Direccin_W0033W0007W0009CLICALDIRECCION'), 'DIRECCION PRUEBA')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Cliente/select_ALAJUELAALAL-01ALAL-02ALAL-03ALAL-04_5fda2f'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Cliente/input_  _W0033W0007W0009ENTER'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_PRUEBA CLIENTE HOME/span_General'))

WebUI.delay(5)

WebUI.takeScreenshot()

