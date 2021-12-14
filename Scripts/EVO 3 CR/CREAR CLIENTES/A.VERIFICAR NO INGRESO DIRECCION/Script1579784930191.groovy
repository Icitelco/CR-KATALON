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

WebUI.callTestCase(findTestCase('EVO 3 CR/LOGIN EVO 3 CR/LOGIN'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(10)

WebUI.navigateToUrl('http://10.7.148.132:8080/SIGA-TG/servlet/wwcliente')

WebUI.click(findTestObject('Object Repository/Page_Clientes/input_Clientes_INSERT'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Page_Cliente/input_Nombre_W0033W0007W0009CLIENTENOM'), 'PRUEBA KATALON')

WebUI.setText(findTestObject('Object Repository/Page_Cliente/input_Apellido_W0033W0007W0009CLIENTEAPE'), 'VERIFICAR DIRECCION')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Cliente/select_(Ninguno)Cdula JurdicaCdula Residenc_5df885'), 
    'CNA', true)

WebUI.setText(findTestObject('Object Repository/Page_Cliente/input_Cdula_W0033W0007W0009vCEDULA'), '1-2356-8965')

WebUI.setText(findTestObject('Object Repository/Page_Cliente/input_Fecha de Nacimiento_W0033W0007W0009CL_df87f2'), '20/08/2000')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Cliente/select_(Ninguno)MASCULINOFEMENINO'), 'M', true)

WebUI.setText(findTestObject('Object Repository/Page_Cliente/input_Telfono Principal_W0033W0007W0009vCLIENTETEL'), '64569854')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Cliente/select_CORPORATIVODTHFONATELHOMEPYMESSEGMEN_a20c43'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Cliente/select_CONDOMINIO HOME RESIDENCIALCORTESIA _d34f6f'), 
    '114', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Cliente/select_1 CLIENTES HFC11 OPS202012 CLIENTES _1bd73a'), 
    '418', true)

WebUI.selectOptionByValue(findTestObject('COSTA RICA/select_(Ninguno)ABJASIAAFGHANISTANALBANIAAL_5ee262'), '75', true)

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Cliente/select_ALAJUELACARTAGOGUANACASTEHEREDIALIMO_ef087e'), 
    '2', true)

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Cliente/select_(Ninguno)ALAJUELAATENASGRECIAGUATUSO_df2ac0'), 
    '21', true)

WebUI.delay(4)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Cliente/select_(Ninguno)ALAJUELA DISTRITOCAJON DIST_9454d1'), 
    '203', true)

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Cliente/select_(Ninguno)ALAJUELA'), '468', true)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Cliente/input_  _W0033W0007W0009ENTER'))

WebUI.click(findTestObject('Object Repository/Page_Cliente/div_Error Formato de cedula invalido'))

