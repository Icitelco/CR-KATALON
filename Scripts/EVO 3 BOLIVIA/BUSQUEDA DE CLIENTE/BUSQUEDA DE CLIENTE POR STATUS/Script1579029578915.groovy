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

WebUI.navigateToUrl('http://192.168.1.115:8080/SIGA-BO/servlet/wwcliente')
//CONECTADO
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Clientes/select_(Todos)INGRESADOPENDIENTEEMITIDOCONE_72c401'), 
    'C', true)

WebUI.delay(5)

WebUI.takeScreenshot()
//INGRESADO
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Clientes/select_(Todos)INGRESADOPENDIENTEEMITIDOCONE_72c401'), 
    'I', true)

WebUI.delay(5)

WebUI.takeScreenshot()
//EMITIDO
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Clientes/select_(Todos)INGRESADOPENDIENTEEMITIDOCONE_72c401'), 
    'E', true)

WebUI.delay(5)

WebUI.takeScreenshot()
//PENDIENTE
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Clientes/select_(Todos)INGRESADOPENDIENTEEMITIDOCONE_72c401'), 
    'P', true)

WebUI.delay(5)

WebUI.takeScreenshot()
//DESCONECTADO
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Clientes/select_(Todos)INGRESADOPENDIENTEEMITIDOCONE_72c401'), 
    'X', true)

WebUI.delay(5)

WebUI.takeScreenshot()

