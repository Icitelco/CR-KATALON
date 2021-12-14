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

WebUI.navigateToUrl('http://192.168.1.115:8080/SIGA-BO/servlet/wwcliente')

WebUI.click(findTestObject('Object Repository/Page_Clientes/input_Clientes_INSERT'))

WebUI.delay(10)

WebUI.setText(findTestObject('Object Repository/Page_Cliente/input_Nombre_W0029W0007W0009CLIENTENOM'), 'PRUEBA HOME')

WebUI.setText(findTestObject('Object Repository/Page_Cliente/input_Apellido_W0029W0007W0009CLIENTEAPE'), 'PRUEBA')

WebUI.setText(findTestObject('Object Repository/Page_Cliente/input_Fecha de Nacimiento_W0029W0007W0009CL_add09b'), '20/08/2000')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Cliente/select_(Ninguno)MASCULINOFEMENINO'), 'M', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Cliente/select_DTH PREPAGOHFC HOMEDTH POSPAGOCORPOR_ce81ba'), 
    '2', true)

Verif1 = WebUI.getText(findTestObject('Object Repository/Page_Cliente/select_CLIENTE STAFFCLIENTES DTH PRECORPORA_44c2a3'))

if (Verif1 == 'CLIENTE STAFF') {
} else {
    WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Cliente/select_CLIENTE STAFFCLIENTES DTH PRECORPORA_44c2a3'), 
        '1', true)
}

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Cliente/select_(Ninguno)ABJASIAAFGHANISTANALBANIAAL_5ee262'), 
    '75', true)

WebUI.setText(findTestObject('Object Repository/Page_Cliente/input_NIT_W0029W0007W0009CLIENTERUT'), '4263692')

WebUI.click(findTestObject('Object Repository/Page_Cliente/select_GUAYARAMERINMAGDALENARIBERALTARURREN_67b0ce'))

WebUI.click(findTestObject('Object Repository/Page_Cliente/span_Direccin'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Cliente/select_GUAYARAMERINMAGDALENARIBERALTARURREN_67b0ce'), 
    '48', true)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Cliente/select_(Todos)GUAYARAMERIN'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Cliente/select_(Todos)GUAYARAMERIN'), '1', true)

WebUI.setText(findTestObject('Object Repository/Page_Cliente/textarea_Direccin_W0029W0007W0009CLICALDIRECCION'), 'PRUEBA1414')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Cliente/select_(Todos)DTHDTH  BENI'), '13', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Cliente/select_(Todos)CASARABEGUAYARAMERINHUACARAJE_4d171c'), 
    '40720', true)

WebUI.click(findTestObject('Object Repository/Page_Cliente/input_Nueva fila_W0029W0007W0009ENTER'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Cliente/input_Antiguedad de Deuda_W0029W0007W0009ENTER'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Cliente/input_URN_W0029W0007INSERT'))

WebUI.setText(findTestObject('Object Repository/Page_Cliente Documento/input_Nmero de Documento_W0024W0007W0009CLIENTECI'), 
    '4263692')

WebUI.click(findTestObject('Object Repository/Page_Cliente Documento/input_Emisor_W0024W0007W0009ENTER'))

WebUI.delay(5)

A = WebUI.getText(findTestObject('Object Repository/BOLIVIA/CLIENTENRO'))

WebUI.click(findTestObject('Object Repository/Page_Cliente/span_Contratos'))

WebUI.click(findTestObject('Object Repository/Page_Cliente/input_URN_W0029W0007CONTRATOAGREGAR'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Ingreso de Contratos/input_Promotor_vE_PROMPTPROMOTOR'))

WebUI.click(findTestObject('Object Repository/Page_Ingreso de Contratos/a_ROBERTO CARLOS SUAREZ ALVAREZ'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Ingreso de Contratos/input_Linea Convergente_ELEGIRPRODUCTOS'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Page_Ingreso de Contratos/input_Nombre_vPRODUCTONOMBRE'), 'PRODUCTO PRUEBA')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Ingreso de Contratos/input_ACTIVO_vSELECCIONADO_0002'))

WebUI.click(findTestObject('Object Repository/Page_Ingreso de Contratos/input_ACTIVO_CONFIRMARR'))

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Ingreso de Contratos/POLITICA COMBO'), '3314', true)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Ingreso de Contratos/CONFIRMAR CONTRATOS'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Ingreso de Contratos/ACEPTAR CONTRATOS'))

WebUI.navigateToUrl('http://192.168.1.115:8080/SIGA-BO/servlet/wwordensrv')

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/BOLIVIA/input_Cliente Nro_vCLIENTENROORD'), A)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/BOLIVIA/input_Forma Generada_SEARCHBUTTON'))

WebUI.delay(3)

//PASAR A EMITIDA LA ORDEN
//WebUI.click(findTestObject('BOLIVIA/input_Empresa_vEMITIR_0001'))
//WebUI.delay(5)
//WebUI.click(findTestObject('BOLIVIA/button_Aceptar'))
//WebUI.delay(10)
//WebUI.selectOptionByValue(findTestObject('BOLIVIA/tecnicoo'), '1140', true)
//WebUI.delay(2)
//WebUI.click(findTestObject('BOLIVIA/input_Tecnico_allbox'))
//WebUI.click(findTestObject('BOLIVIA/input_Page_EMITIRORDEN'))
//WebUI.click(findTestObject('BOLIVIA/button_Aceptar'))
//WebUI.delay(10)
//WebUI.click(findTestObject('BOLIVIA/input_Page_VOLVER'))
//WebUI.delay(10)
WebUI.click(findTestObject('Object Repository/BOLIVIA/img_Empresa_vCUMPLIR_0001'))

WebUI.delay(10)

//FC = WebUI.getText(findTestObject('BOLIVIA/FECHA INGRESO'))
//WebUI.delay(3)
//WebUI.setText(findTestObject('Object Repository/BOLIVIA/input_Comienzo_W0021ORDENFCOM'), FC)
//WebUI.setText(findTestObject('Object Repository/BOLIVIA/input_Finalizada_W0021ORDENFFIN'), FC)
//WebUI.delay(10)
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Cumplir una Orden/select_PENDIENTESUSPENDIDAFINALIZADAINCUMPL_35ae3e'), 
    'F', true)

WebUI.setText(findTestObject('Object Repository/Page_Cumplir una Orden/input_Tcnico_W0027TECNICOID'), '1')

WebUI.setText(findTestObject('Object Repository/Page_Cumplir una Orden/textarea_Observacin_W0027ORDENOBS'), 'PRUEB')

WebUI.click(findTestObject('Object Repository/BOLIVIA/input_Observacin_W0021ENTER'))

