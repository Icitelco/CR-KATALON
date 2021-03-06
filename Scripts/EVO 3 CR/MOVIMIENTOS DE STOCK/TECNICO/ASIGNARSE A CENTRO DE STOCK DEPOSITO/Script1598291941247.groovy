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

WebUI.navigateToUrl('http://10.7.148.132:8080/SIGA-TG/servlet/wwcentrostock')

WebUI.delay(5)

WebUI.setText(findTestObject('Page_Centros de Stock/input_Nombre_vCENTROSTKNOMBRE'), 'BODEGA TIGO')

WebUI.delay(5)

WebUI.click(findTestObject('Page_Centros de Stock/input_Acepta retiros_SEARCHBUTTON'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Centros de Stock/img_Acepta Retiros de Tecnicos_vDISPLAY_0001'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_LUVITILSE (MOVILES)/span_Tcnicos'))

WebUI.delay(5)

//NOMBRE TECNICO
//String NombreTec = CustomKeywords.'CRPREP_NOMBRE_MAXTECNICOO.CRPREP_Cliente_Numero'()
WebUI.click(findTestObject('Object Repository/Page_SIGA Software/svg_FERNANDO PENSATORI_feather feather-menu'))

WebUI.delay(5)

String Nombre = WebUI.getText(findTestObject('Object Repository/Page_Grupo de Atencin de Cajas/span_FERNANDO PENSATORI'))

WebUI.delay(5)

println(Nombre)

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Page_LUVITILSE (MOVILES)/input_Tecnico_W0027W0007vTECNICONOMBRE'), Nombre)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_LUVITILSE (MOVILES)/input_Tecnico_W0027W0007SEARCHBUTTON'))

WebUI.delay(5)

WebUI.takeFullPageScreenshot()

//EXISTE TECNICO EN CENTRO DE STOCK
if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_LUVITILSE (MOVILES)/img_Tecnico_W0027W0007vDISPLAY_0001'), 
    10)) {
    WebUI.delay(5)

    println('Tecico Asociado' //NUMERO TECNICO
        )

    WebUI.takeFullPageScreenshot()
} else {
    WebUI.click(findTestObject('Object Repository/Page_LUVITILSE (MOVILES)/input_Histricos Centro Stock_W0027W0007INSERT'))

    WebUI.delay(5)

    String TecnicoNro = CustomKeywords.'CRPREP_TECNICOID.CRPREP_Cliente_Numero'(Nombre)

    WebUI.delay(5)

    WebUI.setText(findTestObject('Object Repository/Page_Centro Stock Tecnico/input_Tcnico_W0019W0007W0009TECNICOID'), TecnicoNro)

    WebUI.delay(5)

    WebUI.click(findTestObject('Object Repository/Page_Centro Stock Tecnico/input_Nombre_W0019W0007W0009ENTER'))
}

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_LUVITILSE (MOVILES)/span_Usuarios'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Page_LUVITILSE (MOVILES)/input_Centro Stk Usuario_W0027W0007vCENTROS_efff21'), 
    Nombre)

WebUI.delay(5)

WebUI.takeFullPageScreenshot()

//SI EXISTE USUARIO EN CENTRO DE STOCK
if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_BODEGA TIGO/img_Procesar_W0027W0007vDISPLAY_0001'), 
    10)) {
    println('Existe Usuario')

    WebUI.delay(5)

    WebUI.takeFullPageScreenshot()
} else {
    WebUI.click(findTestObject('Object Repository/Page_LUVITILSE (MOVILES)/input_Histricos Centro Stock_W0027W0007INSERT (1)'))

    WebUI.delay(5)

    WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Centro Stock Usuario/select_ALMACEN DESECHO TIGOALMACEN WODENART_7657fe (1)'), 
        '1', true)

    WebUI.delay(5)

    WebUI.setText(findTestObject('Object Repository/Page_Centro Stock Usuario/input_Usuario_W0024W0007W0009CENTROSTKUSUARIOID'), 
        Nombre)

    WebUI.delay(5)

    WebUI.click(findTestObject('Object Repository/Page_Centro Stock Usuario/input_Ingreso_W0024W0007W0009CENTROSTKUSUINGRESAR'))

    WebUI.delay(5)

    WebUI.click(findTestObject('Object Repository/Page_Centro Stock Usuario/input_Autorizar_W0024W0007W0009CENTROSTKUSU_523f33'))

    WebUI.delay(5)

    WebUI.click(findTestObject('Object Repository/Page_Centro Stock Usuario/input_Procesar_W0024W0007W0009CENTROSTKUSUPROCESAR'))

    WebUI.delay(5)

    WebUI.click(findTestObject('Object Repository/Page_Centro Stock Usuario/input_Procesar_W0024W0007W0009ENTER'))

    WebUI.delay(5)

    WebUI.takeFullPageScreenshot()

    WebUI.click(findTestObject('Object Repository/Page_LUVITILSE (MOVILES)/input_Histricos Centro Stock_W0027W0007INSERT (1)'))

    WebUI.delay(5)

    WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Centro Stock Usuario/select_ALMACEN DESECHO TIGOALMACEN WODENART_7657fe (1)'), 
        '9', true)

    WebUI.delay(5)

    WebUI.setText(findTestObject('Object Repository/Page_Centro Stock Usuario/input_Usuario_W0024W0007W0009CENTROSTKUSUARIOID'), 
        Nombre)

    WebUI.delay(5)

    WebUI.click(findTestObject('Object Repository/Page_Centro Stock Usuario/input_Ingreso_W0024W0007W0009CENTROSTKUSUINGRESAR'))

    WebUI.delay(5)

    WebUI.click(findTestObject('Object Repository/Page_Centro Stock Usuario/input_Autorizar_W0024W0007W0009CENTROSTKUSU_523f33'))

    WebUI.delay(5)

    WebUI.click(findTestObject('Object Repository/Page_Centro Stock Usuario/input_Procesar_W0024W0007W0009CENTROSTKUSUPROCESAR'))

    WebUI.delay(5)

    WebUI.click(findTestObject('Object Repository/Page_Centro Stock Usuario/input_Procesar_W0024W0007W0009ENTER'))

    WebUI.delay(5)

    WebUI.takeFullPageScreenshot()
}

