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

WebUI.click(findTestObject('Object Repository/Page_Preventa Clientes/input_Preventa Clientes_AGREGARPREVENTACLIENTE'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Preventa Cliente/select_(Todos)DTH POSPAGODTH PREPAGOHFC TVH_f11028'), 
    '3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Preventa Cliente/select_(Todos)BAGO-CONSULTORIO MEDICO RUSIA_6a6c66'), 
    '124', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Preventa Cliente/select_(Todos)CESAR AUGUSTO HERBAS TERCEROS_788c76'), 
    '63779', true)

WebUI.setText(findTestObject('Object Repository/Page_Preventa Cliente/input_Nombre_W0027W0007W0009PREVENTANOM'), 'PREVENTA PRUEBA')

WebUI.setText(findTestObject('Object Repository/Page_Preventa Cliente/input_Apellido_W0027W0007W0009PREVENTAAPE'), 'PRUEBA')

WebUI.setText(findTestObject('Object Repository/Page_Preventa Cliente/input_Fecha de Nacimiento_W0027W0007W0009PR_40c5b2'), 
    '20/08/2000')

WebUI.setText(findTestObject('Object Repository/Page_Preventa Cliente/input_E-mail_W0027W0007W0009PREVENTAEMAIL'), 'prueba@hotmail.com')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Preventa Cliente/select_CORPORATECORPORATE NFDTH B2BDTH POSP_b5e8ac'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Preventa Cliente/select_(Todos)CLIENTE STAFFCLIENTES DTH PRE_ae6646'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Preventa Cliente/select_(Todos)ABJASIAAFGHANISTANALBANIAALEM_9665cb'), 
    '75', true)

WebUI.click(findTestObject('Object Repository/Page_Preventa Cliente/select_(Todos)GUAYARAMERINMAGDALENARIBERALT_791b20'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Preventa Cliente/select_(Todos)GUAYARAMERINMAGDALENARIBERALT_791b20'), 
    '48', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Preventa Cliente/select_(Todos)GUAYARAMERIN'), '1', true)

WebUI.setText(findTestObject('Object Repository/Page_Preventa Cliente/textarea_Direccion_W0027W0007W0009PREVENTAC_f63b38'), 
    'PRUEBA')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Preventa Cliente/select_(Todos)DTH  BENI'), '13', true)

