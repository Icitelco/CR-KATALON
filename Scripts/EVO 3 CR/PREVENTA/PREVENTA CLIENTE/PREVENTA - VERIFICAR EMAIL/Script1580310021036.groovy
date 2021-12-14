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

WebUI.navigateToUrl('http://10.7.148.132:8080/SIGA-TG/servlet/wwpreventaclientedeusuario')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Preventa Clientes de Usuario/input_MARCAUZ_AGREGARPREVENTACLIENTE'))

WebUI.delay(10)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Preventa Cliente/select_(Ninguno)BASICO CATVBASICO CATV - IN_ab7ec5'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Preventa Cliente/select_ALTERNATIVE CHANNELSB2C ATLANTICAB2C_6d8990'), 
    '122', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Preventa Cliente/select_(Ninguno)BIBIANA CASTRO CARTAGENADIA_dafa0e'), 
    '14602', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Preventa Cliente/select_(Ninguno)BRITVCALL CENTER SACDTH TMK_6d2d06'), 
    '140', true)

WebUI.setText(findTestObject('Object Repository/Page_Preventa Cliente/input_Nombre_W0027W0007W0009PREVENTANOM'), 'PRUEBA PREVENTA')

WebUI.setText(findTestObject('Object Repository/Page_Preventa Cliente/input_Apellido_W0027W0007W0009PREVENTAAPE'), 'PREVENTA')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Preventa Cliente/select_(Ninguno)Cdula JurdicaCdula Residenc_5df885'), 
    'JUR', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Preventa Cliente/select_(Ninguno)Cdula JurdicaCdula Residenc_5df885'), 
    'CNA', true)

WebUI.setText(findTestObject('Object Repository/Page_Preventa Cliente/input_Cdula_W0027W0007W0009vCEDULA'), '1-2356-8965')

WebUI.setText(findTestObject('Object Repository/Page_Preventa Cliente/input_E-mail_W0027W0007W0009PREVENTAEMAIL'), 'prueba')

WebUI.setText(findTestObject('Object Repository/Page_Preventa Cliente/input_Fecha de Nacimiento_W0027W0007W0009PR_40c5b2'), 
    '20/08/2000')

WebUI.setText(findTestObject('Object Repository/Page_Preventa Cliente/input_Telfono Principal_W0027W0007W0009PREV_2b8637'), 
    '64569854')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Preventa Cliente/select_(Ninguno)ALAJUELACARTAGOGUANACASTEHE_837124'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Preventa Cliente/select_(Ninguno)ALAJUELAATENASGRECIAGUATUSO_df2ac0'), 
    '21', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Preventa Cliente/select_(Ninguno)ALAJUELA DISTRITOCAJON DIST_9454d1'), 
    '203', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Preventa Cliente/select_(Ninguno)ALAJUELA'), '468', true)

WebUI.setText(findTestObject('Object Repository/Page_Preventa Cliente/textarea_Direccion_W0027W0007W0009PREVENTAC_f63b38'), 
    'PRUEBA DIRECION')

WebUI.click(findTestObject('Object Repository/Page_Preventa Cliente/input_Observaciones_W0027W0007W0009ENTER'))

