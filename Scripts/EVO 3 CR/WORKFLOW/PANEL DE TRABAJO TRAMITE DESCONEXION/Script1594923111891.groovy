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

WebUI.navigateToUrl('http://10.7.148.132:8080/SIGA-TG/servlet/wfl0019')

WebUI.click(findTestObject('Object Repository/Page_Menu Principal de Tramite/input_Trmites_ALTATRAMITE'))

WebUI.click(findTestObject('COSTA RICA/input_Flujo_vE_BTNCREARTRAM_0004'))

WebUI.delay(5)

String ClienteNro = CustomKeywords.'CLIENTE_CONECTADO.CRPREP_Cliente_Numero'()

if (ClienteNro == null) {
    WebUI.closeBrowser()

    WebUI.callTestCase(findTestCase('EVO 3 CR/CONTRATOS/CONTRATO CLIENTE HOME'), [:], FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.closeBrowser()

    WebUI.callTestCase(findTestCase('EVO 3 CR/WORKFLOW/PANEL DE TRABAJO TRAMITE DESCONEXION'), [:], FailureHandling.CONTINUE_ON_FAILURE)
} else {
    WebUI.setText(findTestObject('Object Repository/Page_Menu Principal de Tramite/input_Cliente Nro_vE_GRDFILCLIENTENRO'), 
        ClienteNro)

    WebUI.click(findTestObject('Object Repository/Page_Menu Principal de Tramite/input_Nombre_BUTTON1'))

    WebUI.click(findTestObject('Object Repository/Page_Menu Principal de Tramite/div_Nuevo Flujo dado de alta por un Usuario_cb99f8'))

    WebUI.click(findTestObject('COSTA RICA/BOTON CONFIRMAR'))

    WebUI.setText(findTestObject('Object Repository/Page_Menu Principal de Tramite/input_Cliente_vE_CLIENTENROFIL'), ClienteNro)

    mydate = new Date()

    formattedDate = mydate.format('dd/MM/YYYY')

    WebUI.setText(findTestObject('Object Repository/Page_Menu Principal de Tramite/input_Fecha_vE_FLTRAMITEFHFIL'), formattedDate)

    WebUI.click(findTestObject('Object Repository/Page_Menu Principal de Tramite/input_Vencimiento_vE_BTNREGRESH'))

    WebUI.click(findTestObject('Object Repository/Page_Menu Principal de Tramite/input_Avance_vE_SELECCION1_0001'))

    WebUI.click(findTestObject('Object Repository/Page_Menu Principal de Tramite/input_Alarma_vE_BTN_OPEN_0001'))

    WebUI.click(findTestObject('Object Repository/Page_Despliega formulario y archivos/span_Archivos'))

    WebUI.click(findTestObject('Object Repository/Page_Despliega formulario y archivos/input_Usuario_W0113vE_IMGSUBIR3_0001'))

    WebUI.uploadFile(findTestObject('Object Repository/Page_Despliega formulario y archivos/input_Seleccion_files'), 'C:\\Users\\icikatalon\\Pictures\\Los hombres.jpg')

    WebUI.click(findTestObject('Object Repository/Page_Despliega formulario y archivos/input_Observacin_SUBIRIMG'))

    WebUI.delay(5)

    WebUI.refresh()

    WebUI.click(findTestObject('Page_Despliega formulario y archivos/Ainput_Usuario_W0113vE_IMGSUBIR3_0002'))

    WebUI.uploadFile(findTestObject('Object Repository/Page_Despliega formulario y archivos/input_Seleccion_files'), 'C:\\Users\\icikatalon\\Pictures\\Los hombres.jpg')

    WebUI.click(findTestObject('Object Repository/Page_Despliega formulario y archivos/input_Observacin_SUBIRIMG'))

    WebUI.delay(5)

    WebUI.refresh()

    WebUI.click(findTestObject('Page_Despliega formulario y archivos/div_Acciones_hvr-icon-finalizaretapa'))

    WebUI.click(findTestObject('Page_Despliega formulario y archivos/div_Acciones_hvr-icon-finalizaretapa'))

    WebUI.acceptAlert()

    WebUI.click(findTestObject('Object Repository/Page_Seleccion de Etapa Ciclo cerrado/input_Finalizacin_vE_BTNETAPASEL_0001'))

    WebUI.click(findTestObject('Object Repository/Page_Menu Principal de Tramite/input_GRUPO SUSPENSIONDIGITACION PYMES  B2B_14364c'))

    WebUI.click(findTestObject('Object Repository/Page_Despliega formulario y archivos/span_Archivos'))

    WebUI.click(findTestObject('Object Repository/Page_Despliega formulario y archivos/input_Usuario_W0113vE_IMGSUBIR3_0001'))

    WebUI.uploadFile(findTestObject('Object Repository/Page_Despliega formulario y archivos/input_Seleccion_files'), 'C:\\Users\\icikatalon\\Pictures\\Los hombres.jpg')

    WebUI.click(findTestObject('Object Repository/Page_Despliega formulario y archivos/input_Observacin_SUBIRIMG'))

    WebUI.refresh()

    WebUI.waitForElementPresent(findTestObject('Page_Despliega formulario y archivos/div_Acciones_hvr-icon-finalizaretapa'), 
        30)

    WebUI.click(findTestObject('Page_Despliega formulario y archivos/div_Acciones_hvr-icon-finalizaretapa'))

    WebUI.click(findTestObject('Page_Despliega formulario y archivos/div_Acciones_hvr-icon-finalizaretapa'))

    WebUI.acceptAlert()

    WebUI.click(findTestObject('Object Repository/Page_Seleccion de Etapa Ciclo cerrado/input_Finalizacin_vE_BTNETAPASEL_0001 (2)'))

    WebUI.delay(5)

    WebUI.click(findTestObject('Object Repository/Page_Menu Principal de Tramite/input_GRUPO SUSPENSIONDOCUMENTA ENTREGA_vE__128787'))

    WebUI.click(findTestObject('Object Repository/Page_Despliega formulario y archivos/span_Archivos (1)'))

    WebUI.delay(5)

    WebUI.click(findTestObject('Object Repository/Page_Despliega formulario y archivos/input_Usuario_W0113vE_IMGSUBIR3_0001'))

    WebUI.uploadFile(findTestObject('Object Repository/Page_Despliega formulario y archivos/input_Seleccion_files'), 'C:\\Users\\icikatalon\\Pictures\\Los hombres.jpg')

    WebUI.click(findTestObject('Object Repository/Page_Despliega formulario y archivos/input_Observacin_SUBIRIMG'))

    WebUI.click(findTestObject('Object Repository/Page_Despliega formulario y archivos/div_Acciones_hvr-icon-finalizaretapa'))

    WebUI.click(findTestObject('Object Repository/Page_Despliega formulario y archivos/div_Acciones_hvr-icon-finalizaretapa'))

    WebUI.acceptAlert()

    WebUI.delay(5)

    WebUI.click(findTestObject('Object Repository/Page_Seleccion de Etapa Ciclo cerrado/input_CLIENTE APELLIDO_vE_BTNETAPASEL_0003'))

    WebUI.delay(15)

    String URL = WebUI.getUrl()

    WebUI.click(findTestObject('Object Repository/Page_Menu Principal de Tramite/input_HDGRUPO SUSPENSION_vE_BTN_OPEN_0004 (1)'))

    WebUI.click(findTestObject('Object Repository/Page_Despliega formulario y archivos/div_Acciones_hvr-icon-finalizaretapa'))

    WebUI.click(findTestObject('Object Repository/Page_Despliega formulario y archivos/div_Acciones_hvr-icon-finalizaretapa'))

    WebUI.acceptAlert()

    WebUI.click(findTestObject('Object Repository/Page_Seleccion de Etapa Ciclo cerrado/input_Finalizacin_vE_BTNETAPASEL_0001 (2)'))

    WebUI.click(findTestObject('Object Repository/Page_Menu Principal de Tramite/input_     0000_vE_BTN_OPEN_0007 (1)'))

    WebUI.click(findTestObject('Object Repository/Page_Despliega formulario y archivos/span_Archivos (1)'))

    WebUI.delay(5)

    WebUI.click(findTestObject('Object Repository/Page_Despliega formulario y archivos/input_Usuario_W0113vE_IMGSUBIR3_0001'))

    WebUI.uploadFile(findTestObject('Object Repository/Page_Despliega formulario y archivos/input_Seleccion_files'), 'C:\\Users\\icikatalon\\Pictures\\Los hombres.jpg')

    WebUI.click(findTestObject('Object Repository/Page_Despliega formulario y archivos/input_Observacin_SUBIRIMG'))

    WebUI.click(findTestObject('Object Repository/Page_Despliega formulario y archivos/div_Acciones_hvr-icon-finalizaretapa'))

    WebUI.click(findTestObject('Object Repository/Page_Despliega formulario y archivos/div_Acciones_hvr-icon-finalizaretapa'))

    WebUI.acceptAlert()

    WebUI.click(findTestObject('Object Repository/Page_Seleccion de Etapa Ciclo cerrado/input_Finalizacin_vE_BTNETAPASEL_0001 (2)'))

    WebUI.click(findTestObject('Object Repository/Page_Menu Principal de Tramite/input_     0000_vE_BTN_OPEN_0010 (2)'))

    WebUI.click(findTestObject('Object Repository/Page_Despliega formulario y archivos/div_Acciones_hvr-icon-finalizaretapa'))

    WebUI.click(findTestObject('Object Repository/Page_Despliega formulario y archivos/div_Acciones_hvr-icon-finalizaretapa'))

    WebUI.acceptAlert()

    WebUI.click(findTestObject('Object Repository/Page_Seleccion de Etapa Ciclo cerrado/input_Finalizacin_vE_BTNETAPASEL_0001 (2)'))

    WebUI.click(findTestObject('Object Repository/Page_Menu Principal de Tramite/input_GRUPO SUSPENSIONROLL OUT (TP)_vE_BTN__690c5d (1)'))

    WebUI.click(findTestObject('Object Repository/Page_Despliega formulario y archivos/div_Acciones_hvr-icon-finalizaretapa'))

    WebUI.click(findTestObject('Object Repository/Page_Despliega formulario y archivos/div_Acciones_hvr-icon-finalizaretapa'))

    WebUI.acceptAlert()

    WebUI.navigateToUrl(URL)

    WebUI.delay(5)

    WebUI.click(findTestObject('Object Repository/Page_Menu Principal de Tramite/input_     0000_vE_BTNENPROC_0013'))

    WebUI.click(findTestObject('Object Repository/Page_Menu Principal de Tramite/input_     0000_vE_BTNENPROC_0013'))

    WebUI.acceptAlert()

    WebUI.click(findTestObject('Object Repository/Page_Menu Principal de Tramite/input_     0000_vE_BTN_OPEN_0013'))

    WebUI.click(findTestObject('Object Repository/Page_Despliega formulario y archivos/input_Acciones_vBTNFINALIZAR (2)'))

    WebUI.click(findTestObject('Object Repository/Page_Despliega formulario y archivos/input_Acciones_vBTNFINALIZAR (2)'))

    WebUI.acceptAlert()
}

