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

WebUI.click(findTestObject('Object Repository/Page_SIGA Software/svg_FERNANDO PENSATORI_feather feather-menu'))

String Nombre = WebUI.getText(findTestObject('Object Repository/Page_Grupo de Atencin de Cajas/span_FERNANDO PENSATORI'))

println(Nombre)

WebUI.navigateToUrl('http://10.7.148.132:8080/SIGA-TG/servlet/wwcajagrupo')

String CajaGrupo = CustomKeywords.'CRPREP_MAX_CAJAGRUPONOMBREE.CRPREP_Cliente_Numero'()

String hola = "SELECT MAX(CG.CAJAGRUPOID)CAJAID FROM CAJAGRUPOUSUARIO CG WHERE CG.CAJAGRUPOID IN (SELECT CU.CAJAGRUPOID FROM CAJAGRUPO CU WHERE CU.EMPRESAID = CG.EMPRESAID AND CAJAGRUPONOMBRE =".concat(CajaGrupo) + " AND CU.CAJAGRUPOID = CG.CAJAGRUPOID) AND CG.CAJAGRUPOUSUARIOID IN (SELECT CO.USUARIOID FROM COBRADOR CO WHERE CO.EMPRESAID = CG.EMPRESAID AND CO.USUARIOID = CG.CAJAGRUPOUSUARIOID AND COBRADORNOMBRE=".concat(Nombre) + " AND COBRADORSTS = 'A')"

println(hola)
println(CajaGrupo)
//println("SELECT MAX(CG.CAJAGRUPOID)CAJAID FROM CAJAGRUPOUSUARIO CG WHERE CG.CAJAGRUPOID IN (SELECT CU.CAJAGRUPOID FROM CAJAGRUPO CU WHERE CU.EMPRESAID = CG.EMPRESAID AND CU.CAJAGRUPOID = CG.CAJAGRUPOID AND CAJAGRUPONOMBRE = AND CG.CAJAGRUPOUSUARIOID IN (SELECT CO.USUARIOID FROM COBRADOR CO WHERE CO.EMPRESAID = CG.EMPRESAID AND CO.USUARIOID = CG.CAJAGRUPOUSUARIOID AND COBRADORSTS = 'A' AND COBRADORNOMBRE=".concat(nombre))

'CAJA GRUPO NOMBRE\r\n'
WebUI.setText(findTestObject('Object Repository/Page_Grupo de Atencin de Cajas/input_Oficina_vCAJAGRUPONOMBRE'), CajaGrupo)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Grupo de Atencin de Cajas/img_Transfiere valores al cierre_vDISPLAY_0001'))

WebUI.click(findTestObject('Object Repository/Page_Grupo de Atencin de Caja/span_Cobradores'))

WebUI.delay(7)

WebUI.click(findTestObject('Object Repository/Page_Grupo de Atencin de Caja/input_Cuentas bancarias_W0027W0007INSERT'))

WebUI.delay(7)

String CobradorID = CustomKeywords.'CRPREP_COBRADORID.CRPREP_Cliente_Numero'(Nombre)

'Verificar que el cobrador no este en otra caja, si esta lo elimina'
if (CustomKeywords.'CRPREP_COBRADOR_Y_CAJA.CRPREP_Cliente_Numero'(CobradorID) != null) {
    String CajanroCobrador = CustomKeywords.'CRPREP_COBRADOR_Y_CAJA.CRPREP_Cliente_Numero'(CobradorID)

    CustomKeywords.'CRPREP_ELIMINAR_COBRADOR_Y_CAJA.CRPREP_Cliente_Numero'(CobradorID)

    WebUI.refresh()
}

'ID DE COBRADOR'
WebUI.setText(findTestObject('Object Repository/Page_Caja Cobrador/input_Cobrador_W0019W0007W0009COBRADORID'), CobradorID)

String Caja = CustomKeywords.'CRPERP_NROMAX_CAJA.CRPREP_Cliente_Numero'()

'ID DE CAJA'
WebUI.setText(findTestObject('Object Repository/Page_Caja Cobrador/input_Caja_W0019W0007W0009CAJACOBRADORCAJANRO'), Caja)

'REALIZA APERTURA DE LA CAJA?'
WebUI.click(findTestObject('Object Repository/Page_Caja Cobrador/input_Realiza Apertura_W0019W0007W0009CAJAC_889bad'))

'REALIZA CERRE DE LA CAJA?'
WebUI.click(findTestObject('Object Repository/Page_Caja Cobrador/input_Realiza Cierre_W0019W0007W0009CAJACOB_060b6d'))

WebUI.click(findTestObject('Object Repository/Page_Caja Cobrador/input_Realiza Cierre_W0019W0007W0009ENTER'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_ALAJUELA/span_Usuarios autorizados'))

String UsuarioLGN = CustomKeywords.'CRPREP_USUARIOLOGEADO.CRPREP_Cliente_Numero'(Nombre)

WebUI.setText(findTestObject('Object Repository/Page_ALAJUELA/input_Login_W0027W0007vCAJAGRUPOUSUARIOLGN'), UsuarioLGN)

String CajaGrupoId = CustomKeywords.'CRPREP_USUARIO_ASIGNADO.CRPREP_Cliente_Numero'(CajaGrupo, Nombre)

'Traemos el id de la cajagrupo, si no trae el numero el usuario no esta asignado a la caja, se va al else y lo asigna.'
if( CajaGrupoId != null) {
	println('EXISTE USR')
}else {
WebUI.click(findTestObject('Object Repository/Page_ALAJUELA/input_Cuentas bancarias_W0027W0007INSERT'))
	
WebUI.setText(findTestObject('Object Repository/Page_Caja Grupo Usuario/input_Usuario_W0024W0007W0009CAJAGRUPOUSUARIOID (1)'),
		Nombre)
	
WebUI.click(findTestObject('Object Repository/Page_Caja Grupo Usuario/input_Login_W0024W0007W0009ENTER'))
	
}
//dejo comentado lo que estaba anteriormente. falla
/*Si el usuario no esta asignado, se saltea el if pero da error. Sin embargo se crea el usuario luego.
if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_ALAJUELA/img_Login_W0027W0007vDISPLAY_0001'), 10)) {
	println('EXISTE USR') 
	} 
else {
WebUI.click(findTestObject('Object Repository/Page_ALAJUELA/input_Cuentas bancarias_W0027W0007INSERT'))

WebUI.setText(findTestObject('Object Repository/Page_Caja Grupo Usuario/input_Usuario_W0024W0007W0009CAJAGRUPOUSUARIOID (1)'), 
    Nombre)

WebUI.click(findTestObject('Object Repository/Page_Caja Grupo Usuario/input_Login_W0024W0007W0009ENTER'))

/*WebUI.setText(findTestObject('Object Repository/Page_Grupo de Atencin de Cajas/input_Oficina_vCAJAGRUPONOMBRE'), 'hUqzIdMVKDxcTrpLESTQ')
 Lo comentamos porque el usuario ya se agrega a la caja y este paso no seria necesario.
*/