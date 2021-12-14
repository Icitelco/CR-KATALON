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

WebUI.delay(5)

String CLIENTE = CustomKeywords.'CRPREP_CLIENTE_INGRESADO_PYMES.CRPREP_Cliente_Numero'()

println(CLIENTE)

if (CLIENTE == null) {
    WebUI.closeBrowser()

    WebUI.callTestCase(findTestCase('EVO 3 CR/CREAR CLIENTES/3.CLIENTE PYMES'), [:])

    WebUI.closeBrowser()

    WebUI.callTestCase(findTestCase('EVO 3 CR/CONTRATOS/CONTRATO CLIENTE PYMES'), [:])
} else {
    WebUI.setText(findTestObject('Page_Clientes/input_Cliente Nro_vCLIENTENRO'), CLIENTE)

    WebUI.delay(5)

    WebUI.click(findTestObject('Object Repository/Page_Clientes/input_Home Pack_SEARCHBUTTON'))

    WebUI.delay(5)

    WebUI.click(findTestObject('Object Repository/Page_Clientes/img_Cantidad facturas_vDISPLAY_0001'))

    WebUI.delay(5)

    WebUI.click(findTestObject('Object Repository/Page_Cliente/span_Contratos'))

    WebUI.delay(5)

    WebUI.click(findTestObject('Object Repository/Page_Cliente/input_Histricos_W0033W0007CONTRATOAGREGAR'))

    WebUI.delay(5)

    if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Ingreso de Contratos/input_No_vE_GUARDAR'), 15)) {
        WebUI.click(findTestObject('Object Repository/Page_Ingreso de Contratos/input_No_vE_GUARDAR'))
    }
    
    WebUI.delay(5)

    WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Ingreso de Contratos/select_ALTERNATIVE CHANNELSB2C ATLANTICAB2C_6d8990'), 
        '122', true)

    WebUI.delay(5)

    WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Ingreso de Contratos/select_(Ninguno)BIBIANA CASTRO CARTAGENADIA_dafa0e'), 
        '14602', true)

    WebUI.delay(5)

    WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Ingreso de Contratos/select_(Ninguno)BRITVCALL CENTER SACDTH TMK_6d2d06'), 
        '140', true)

    WebUI.delay(5)

    WebUI.click(findTestObject('Object Repository/Page_Ingreso de Contratos/input_DevicePrdId_ELEGIRPRODUCTOS'))

    WebUI.delay(5)

    WebUI.setText(findTestObject('Object Repository/Page_Ingreso de Contratos/input_Nombre_vPRODUCTONOMBRE'), 'SERVICIO BASICO')

    WebUI.delay(5)

    WebUI.click(findTestObject('Object Repository/Page_Ingreso de Contratos/input_Aprovisionar_vSELECCIONADO_0001'))

    WebUI.delay(5)

    WebUI.click(findTestObject('Object Repository/Page_Ingreso de Contratos/input__CONFIRMAR'))

    WebUI.delay(5)

    WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Ingreso de Contratos/select_(Ninguno)SERVICIO BASICOSME-TV-BASIC_fb6a6f'), 
        '6818', true)

    WebUI.delay(5)

    WebUI.click(findTestObject('Object Repository/Page_Ingreso de Contratos/input__CONFIRMAR_1'))

    WebUI.delay(5)

    WebUI.click(findTestObject('Object Repository/Page_Ingreso de Contratos/button_Aceptar'))
}

