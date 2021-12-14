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

String Nombre = WebUI.getText(findTestObject('Object Repository/Page_Usuarios de Flujo/span_MAURICIO ARCAUZ'))

WebUI.navigateToUrl('http://10.7.148.132:8080/SIGA-TG/servlet/wwcajagrupo')

String CajaGrupo=CustomKeywords.'CRPREP_MAX_CAJAGRUPONOMBREE.CRPREP_Cliente_Numero'()

'CAJA GRUPO NOMBRE\r\n'
WebUI.setText(findTestObject('Page_Grupo de Atencin de Cajas/input_Oficina_vCAJAGRUPONOMBRE'), CajaGrupo)

WebUI.delay(3)

WebUI.click(findTestObject('Page_Grupo de Atencin de Cajas/img_Transfiere valores al cierre_vDISPLAY_0001'))

WebUI.click(findTestObject('Page_Grupo de Atencin de Caja/span_Cobradores'))

WebUI.click(findTestObject('Page_Grupo de Atencin de Caja/input_Cuentas bancarias_W0027W0007INSERT'))

String CobradorID = CustomKeywords.'CRPREP_COBRADORID.CRPREP_Cliente_Numero'(Nombre)

'Verificar que el cobrador no este en otra caja, si esta lo elimina'
if (CustomKeywords.'CRPREP_COBRADOR_Y_CAJA.CRPREP_Cliente_Numero'(CobradorID) != null) {
 String CajanroCobrador = CustomKeywords.'CRPREP_COBRADOR_Y_CAJA.CRPREP_Cliente_Numero'(CobradorID)

 CustomKeywords.'CRPREP_ELIMINAR_COBRADOR_Y_CAJA.CRPREP_Cliente_Numero'(CobradorID)

    WebUI.refresh()
	}

'ID DE COBRADOR'
WebUI.setText(findTestObject('Page_Caja Cobrador/input_Cobrador_W0019W0007W0009COBRADORID'), CobradorID)

String Caja = CustomKeywords.'CRPERP_NROMAX_CAJA.CRPREP_Cliente_Numero'()

'ID DE CAJA'
WebUI.setText(findTestObject('Page_Caja Cobrador/input_Caja_W0019W0007W0009CAJACOBRADORCAJANRO'), Caja)

'REALIZA APERTURA DE LA CAJA?'
WebUI.click(findTestObject('Page_Caja Cobrador/input_Realiza Apertura_W0019W0007W0009CAJAC_889bad'))

'REALIZA CERRE DE LA CAJA?'
WebUI.click(findTestObject('Page_Caja Cobrador/input_Realiza Cierre_W0019W0007W0009CAJACOB_060b6d'))

WebUI.click(findTestObject('Page_Caja Cobrador/input_Realiza Cierre_W0019W0007W0009ENTER'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_ALAJUELA/span_Usuarios autorizados'))

String UsuarioLGN = CustomKeywords.'CRPREP_USUARIOLOGEADO.CRPREP_Cliente_Numero'(Nombre)

WebUI.setText(findTestObject('Object Repository/Page_ALAJUELA/input_Login_W0027W0007vCAJAGRUPOUSUARIOLGN'), UsuarioLGN)

//if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_ALAJUELA/img_Login_W0027W0007vDISPLAY_0001'), 10)) {
  //  println('EXISTE USR') //WebUI.verifyElementPresent(findTestObject('Object Repository/Page_ALAJUELA/img_Login_W0027W0007vDISPLAY_0001'), 10)
//} 
//else {
    WebUI.click(findTestObject('Object Repository/Page_ALAJUELA/input_Cuentas bancarias_W0027W0007INSERT'))

    WebUI.setText(findTestObject('Object Repository/Page_Caja Grupo Usuario/input_Usuario_W0024W0007W0009CAJAGRUPOUSUARIOID (1)'), 
        Nombre)

    WebUI.click(findTestObject('Object Repository/Page_Caja Grupo Usuario/input_Login_W0024W0007W0009ENTER'))
//}

