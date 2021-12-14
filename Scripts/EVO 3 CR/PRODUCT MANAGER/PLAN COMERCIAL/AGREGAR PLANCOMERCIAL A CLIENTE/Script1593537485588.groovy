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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('EVO 3 CR/LOGIN EVO 3 CR/LOGIN'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.navigateToUrl('http://10.7.148.132:8080/SIGA-TG/servlet/wwcliente')

String CLIENTENRO = CustomKeywords.'CRPRERP_CLIENTE_ALAJUELA_INGRESADO.CRPREP_Cliente_Numero'()

println(CLIENTENRO)

if (CLIENTENRO == null) {
    WebUI.closeBrowser()

    WebUI.callTestCase(findTestCase('EVO 3 CR/CREAR CLIENTES/1.CLIENTE HOME'), [:])

    WebUI.closeBrowser()

    WebUI.callTestCase(findTestCase('EVO 3 CR/PRODUCT MANAGER/PLAN COMERCIAL/AGREGAR PLANCOMERCIAL A CLIENTE'), [:])
} else {
    WebUI.setText(findTestObject('Object Repository/Page_Clientes/input_Cliente Nro_vCLIENTENRO'), CLIENTENRO)

    WebUI.delay(5)

    WebUI.click(findTestObject('Object Repository/Page_Clientes/input_Home Pack_SEARCHBUTTON'))

    WebUI.delay(5)

    WebUI.click(findTestObject('Object Repository/Page_Clientes/img_Cantidad facturas_vDISPLAY_0001'))

    WebUI.delay(10)

    WebUI.click(findTestObject('Object Repository/Page_Cliente/span_Contratos'))

    WebUI.delay(5)

    WebUI.click(findTestObject('Object Repository/Page_Cliente/input_Histricos_W0033W0007CONTRATOAGREGAR'))

    if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Ingreso de Contratos/input_No_vE_GUARDAR'), 15)) {
        WebUI.delay(5)

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

    WebUI.click(findTestObject('Object Repository/Page_Ingreso de Contratos/input_DevicePrdId_PLANCOMERCIAL'))

    WebUI.delay(5)

    String PlanComercialID = CustomKeywords.'CRPRERP_PLANCOMERCIALID.CRPREP_Cliente_Numero'()

    WebUI.delay(5)

    WebUI.setText(findTestObject('COSTA RICA/input_Nombre_vE_FILTROPLANCOMERCIALID'), PlanComercialID)

    WebUI.delay(5)

    WebUI.click(findTestObject('Object Repository/Page_Ingreso de Contratos/input_Nombre_BUSCAR'))

    WebUI.delay(7)

    WebUI.click(findTestObject('COSTA RICA/a_PLANCOMERICIALNOMBRE'))

    WebUI.delay(3)

    WebUI.click(findTestObject('COSTA RICA/input_SELECCIONAR_PLAN_COMERCIAL'))

    WebUI.click(findTestObject('Object Repository/Page_Ingreso de Contratos/input_PLAN COMERCIAL KATALONN  3_CONFIRMAR'))

    WebUI.click(findTestObject('Object Repository/Page_Ingreso de Contratos/button_Aceptar'))
}

