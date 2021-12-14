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

String CLIENTENRO = CustomKeywords.'CLIENTE_CONECTADO.CRPREP_Cliente_Numero'()

if (CLIENTENRO == null) {
    WebUI.closeBrowser()

    WebUI.callTestCase(findTestCase('EVO 3 CR/CONTRATOS/CONTRATO CLIENTE HOME'), [:], FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.closeBrowser()

    WebUI.callTestCase(findTestCase('EVO 3 CR/PRODUCT MANAGER/PROMOCION GENERAL/AGREGAR PROMOCION GENERAL A CLIENTE'), [:], 
        FailureHandling.CONTINUE_ON_FAILURE) //WebUI.delay(15)
} else {
    WebUI.setText(findTestObject('Object Repository/Page_Clientes/input_Cliente Nro_vCLIENTENRO'), CLIENTENRO)

    WebUI.click(findTestObject('Object Repository/Page_Clientes/input_Home Pack_SEARCHBUTTON'))

    WebUI.click(findTestObject('Object Repository/Page_Clientes/img_Cantidad facturas_vDISPLAY_0001'))

    WebUI.click(findTestObject('Object Repository/Page_PRUEBA APELLIDO/span_Documentos'))

    WebUI.click(findTestObject('Object Repository/Page_PRUEBA APELLIDO/input_Pgina 1 de 1_W0033W0007FACTURACIONADELANTADA'))

    WebUI.delay(5)

    String a = WebUI.getUrl()

    WebUI.click(findTestObject('Object Repository/Page_PRUEBA APELLIDO/span_Facturacion Adelantada de Cliente_gxp0_cls'))

    WebUI.delay(2)

    WebUI.click(findTestObject('Page_CLIENTE APELLIDO-A/span_Promociones Grles'))

    WebUI.delay(10)

    WebUI.click(findTestObject('COSTA RICA/ingresar promo general'))

    WebUI.delay(3)

    String Promo = CustomKeywords.'CRPREP_PROMOCIONGENERALNOMBREEE.CRPREP_Cliente_Numero'()

	WebUI.setText(findTestObject('Object Repository/input_Nombre_vFILTROPROMOCIONGRLNOMBRE'), Promo)
	
	
	
	WebUI.click(findTestObject('Object Repository/input_Nombre_BUTTON1'))
	WebUI.delay(5)
	
	WebUI.click(findTestObject('Object Repository/a_CORTESIA EN EXCEDENTES 100'))
	
	WebUI.rightClick(findTestObject('Object Repository/input_Cantidad de Meses_AGREGAR'))
	
	
    //WebUI.setText(findTestObject('Object Repository/Page_Cliente Promocion General/input_Promocin General_W0024W0007W0009PROMO_f8083d'), 
     //   PromoID)

   // WebUI.click(findTestObject('Object Repository/Page_Cliente Promocion General/input_Dto _W0024W0007W0009ENTER'))

    WebUI.delay(5)

    WebUI.navigateToUrl(a)

    WebUI.click(findTestObject('Object Repository/Page_PRUEBA APELLIDO/input_Pgina 1 de 1_W0033W0007FACTURACIONADELANTADA'))

    WebUI.delay(15)

    WebUI.click(findTestObject('Object Repository/Page_PRUEBA APELLIDO/span_Facturacion Adelantada de Cliente_gxp0_cls'))
}

