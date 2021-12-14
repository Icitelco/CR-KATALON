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

WebUI.delay(5)

WebUI.navigateToUrl('http://10.7.148.132:8080/SIGA-TG/servlet/wwcliente')

String Clientenro = CustomKeywords.'CRPREP_CLIENTE_CON_PROPDUCTO_DE_PROMOCION.CRPREP_Cliente_Numero'()

println(Clientenro)

if (Clientenro == null) {
    WebUI.closeBrowser()

    WebUI.callTestCase(findTestCase('EVO 3 CR/PRODUCT MANAGER/CREAR CLIENTE CON PRODUCTO CREADO/CREAR CLIENTE'), [:])

    WebUI.closeBrowser()

    WebUI.callTestCase(findTestCase('EVO 3 CR/PRODUCT MANAGER/CREAR CLIENTE CON PRODUCTO CREADO/CONTRATO CLIENTE'), [:])

    WebUI.closeBrowser()

    WebUI.callTestCase(findTestCase('EVO 3 CR/PRODUCT MANAGER/PROMOCION/AGREGAR PROMOCION A CLIENTE/AGREGAR PROMOCION'), 
        [:])
} else {
    WebUI.setText(findTestObject('Page_Clientes/input_Cliente Nro_vCLIENTENRO'), Clientenro)

    WebUI.delay(10)

    WebUI.click(findTestObject('Page_Clientes/input_Home Pack_SEARCHBUTTON'))

    WebUI.delay(10)

    WebUI.click(findTestObject('Page_Clientes/img_Cantidad facturas_vDISPLAY_0001'))

    WebUI.delay(10)

    WebUI.click(findTestObject('Page_Cliente/span_Contratos'))

    WebUI.delay(10)

    String Contrato = CustomKeywords.'CRPREP_CONTRATO_QUE_ADMITE_PROMOCION.CRPREP_Cliente_Numero'()

    WebUI.delay(10)

    WebUI.setText(findTestObject('Object Repository/Page_Cliente/input_Nro_W0033W0007vCONTRATONRO'), Contrato)

    WebUI.delay(10)

    WebUI.click(findTestObject('Object Repository/Page_Cliente/input_Status_W0033W0007SEARCHBUTTON'))

    WebUI.delay(10)

    WebUI.click(findTestObject('Object Repository/Page_Cliente/img_Navega Plus_W0033W0007vDISPLAY_0001'))

    WebUI.delay(15)

    WebUI.waitForElementPresent(findTestObject('Object Repository/Page_1003/span_Contrato -'), 30)

    WebUI.delay(10)

    WebUI.click(findTestObject('Object Repository/Page_27572485/span_Promociones'))

    WebUI.delay(5)

    WebUI.click(findTestObject('Object Repository/Page_Contrato/input_Concepto Personalizado_W0026W0007AGREGAR'))

    WebUI.delay(10)

    WebUI.click(findTestObject('Object Repository/Page_Contrato/input_Clase_BUTTON1'))

    WebUI.delay(10)

    WebUI.click(findTestObject('Object Repository/Page_Contrato/a_RODRII PROMO'))

    WebUI.delay(5)

    Promocion = CustomKeywords.'CRPRERP_PROMOCIONID_NOMBRE.CRPREP_Cliente_Numero'()

    WebUI.click(findTestObject('Object Repository/Page_Contrato/input_Vencimiento 3_AGREGAR'))
}

