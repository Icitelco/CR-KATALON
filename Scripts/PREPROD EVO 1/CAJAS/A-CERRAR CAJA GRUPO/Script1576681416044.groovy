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

WebUI.callTestCase(findTestCase('PREPROD EVO 1/CLIENTE NUEVO/LOGIN'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_SIGA Software/span_Facturacin y Cobranza'))

WebUI.click(findTestObject('Object Repository/Page_SIGA Software/span_Cajas Diarias de Oficina'))

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Cajas Diarias de Oficina/select_(Ninguno)INGRESADAABIERTACERRADA'), 
    'A', true)

GRUPO = WebUI.getText(findTestObject('Object Repository/Page_Cajas Diarias de Oficina/select_CARTAGOGRUPO PRUEBA'))

if (GRUPO == 'GRUPO PRUEBA') {
} else {
    WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Cajas Diarias de Oficina/select_CARTAGOGRUPO PRUEBA'), 
        '83', true)
}

WebUI.click(findTestObject('Object Repository/Page_Cajas Diarias de Oficina/a_Valores'))

WebUI.click(findTestObject('Object Repository/Page_GRUPO PRUEBA/input_Depsitos_W0026W0008INSERT'))

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Page_Caja Grupo Usuario/Page_Caja Grupo Dia Valor/select_APERTURACIERREAJUSTE'), '2', 
    true)

WebUI.selectOptionByValue(findTestObject('Page_Caja Grupo Usuario/Page_Caja Grupo Dia Valor/select_AJUSTE TARJETACHEQUECOMISIONES BANCA_fecf4c'), 
    '1', true)

WebUI.setText(findTestObject('Page_Caja Grupo Usuario/Page_Caja Grupo Dia Valor/input_Importe_W0022W0008W0007CAJAGRUPODIAVALORIMP'), 
    '0')

WebUI.selectOptionByValue(findTestObject('Page_Caja Grupo Usuario/Page_Caja Grupo Dia Valor/select_'), '1', true)

WebUI.click(findTestObject('Page_Caja Grupo Usuario/Page_Caja Grupo Dia Valor/input_Importe_W0022W0008W0007ENTER'))

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Page_GRUPO PRUEBA/input_Page 1 Of 1_W0026W0008CERRAR'))

WebUI.click(findTestObject('Object Repository/Page_GRUPO PRUEBA/button_Aceptar'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_GRUPO PRUEBA/span_General'))

WebUI.delay(2)

WebUI.takeScreenshot()

