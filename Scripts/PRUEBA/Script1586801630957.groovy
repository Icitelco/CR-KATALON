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

WebUI.click(findTestObject('Page_SIGA Software/span_Gestin Comercial'))

WebUI.click(findTestObject('Page_SIGA Software/span_Clientes'))

WebUI.click(findTestObject('Page_Clientes/input_Clientes_INSERT'))

WebUI.setText(findTestObject('Page_Cliente/input_Nombre_W0033W0007W0009CLIENTENOM'), 'odrigo')

WebUI.setText(findTestObject('Page_Cliente/input_Apellido_W0033W0007W0009CLIENTEAPE'), 'Prueba')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Cliente/select_(Ninguno)Cdula JurdicaCdula Residenc_b91d1a'), 
    'JUR', true)

WebUI.setText(findTestObject('Page_Cliente/input_Cdula_W0033W0007W0009vCEDULA'), '1-8956-4587')

WebUI.setText(findTestObject('Page_Cliente/input_Fecha de Nacimiento_W0033W0007W0009CL_df87f2'), '20/08/2000')

WebUI.selectOptionByValue(findTestObject('Page_Cliente/select_(Ninguno)MASCULINOFEMENINO'), 'M', true)

WebUI.click(findTestObject('Page_Cliente/input_Telfono Principal_W0033W0007W0009vCLIENTETEL'))

WebUI.setText(findTestObject('Page_Cliente/input_Telfono Principal_W0033W0007W0009vCLIENTETEL'), '64578458')

