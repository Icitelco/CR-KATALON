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

'PANTALLA CLIENTES'
WebUI.navigateToUrl('http://10.7.148.132:8080/SIGA-TG/servlet/wwcliente')

String Clientenro = CustomKeywords.'CRPRERP_CLIENTE_CON_CONCEPTO_FIRMA.CRPREP_Cliente_Numero'()

WebUI.setText(findTestObject('Object Repository/Page_Clientes/input_Cliente Nro_vCLIENTENRO'), Clientenro)

WebUI.click(findTestObject('Object Repository/Page_Clientes/input_Home Pack_SEARCHBUTTON'))

WebUI.click(findTestObject('Object Repository/Page_Clientes/img_Cantidad facturas_vDISPLAY_0001'))

WebUI.click(findTestObject('Page_CLIENTE APELLIDO-A/span_Recibos'))

String ReciboNro = CustomKeywords.'CRPRERP_RECIBO_DE_CLIENTE_CON_CONCEPTO_FIRMA.CRPREP_Cliente_Numero'(Clientenro)

WebUI.setText(findTestObject('Page_CLIENTE APELLIDO-A/input_Nmero_W0033W0007vRECIBONRO'), ReciboNro)

WebUI.clearText(findTestObject('Page_CLIENTE APELLIDO-A/input_Desde Fecha_W0033W0007vFROMRECIBOFCH'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_CLIENTE APELLIDO-A/input_Hasta Fecha_W0033W0007SEARCHBUTTON'))

WebUI.click(findTestObject('Page_CLIENTE APELLIDO-A/img_Nro Deposito_W0033W0007vAGREGARORDENDEP_6c07be'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Ingresar Devolucin de Pago de un Clien_f74c20/select_(Ninguno)ANULAR PAGO POR FIRMAANULAR_734355'), 
    '425', true)

WebUI.setText(findTestObject('Object Repository/Page_Ingresar Devolucin de Pago de un Clien_f74c20/input_Motivo Detalle_vE_MOTIVOFACTURADETALLEID'), 
    '196')

WebUI.setText(findTestObject('Object Repository/Page_Ingresar Devolucin de Pago de un Clien_f74c20/input_Observacin_vE_ORDENDEPAGOOBS'), 
    'fsfsafsdsadsadsadsadasdasdasdasda')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Ingresar Devolucin de Pago de un Clien_f74c20/select_EFECTIVOCHEQUETARJETADEPOSITODEBITOO_5b3a8a'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Page_Ingresar Devolucin de Pago de un Clien_f74c20/input_RECIBO_APLICARCAMBIOS'))

//WebUI.setText(findTestObject('Object Repository/Page_Ingresar Devolucin de Pago de un Clien_f74c20/input_Cheque a Anular_vE_CHEQUEADEVOLVER'), 
//ChequeNro)
//WebUI.click(findTestObject('Object Repository/Page_Ingresar Devolucin de Pago de un Clien_f74c20/input_Cheque a Anular_vE_VALIDARCHEQUE'))
//String Importe = WebUI.getText(findTestObject('Object Repository/Page_Ingresar Devolucin de Pago de un Clien_f74c20/span_4582190_1'))
//WebUI.setText(findTestObject('Object Repository/Page_Ingresar Devolucin de Pago de un Clien_f74c20/input_CLIENTE APELLIDO_vE_CLIIMP_0001'), 
//  Importe)
WebUI.click(findTestObject('Object Repository/Page_Ingresar Devolucin de Pago de un Clien_f74c20/input_RECIBO_GENERAR'))

WebUI.click(findTestObject('Object Repository/Page_Ingresar Devolucin de Pago de un Clien_f74c20/button_Aceptar_1'))

WebUI.delay(5)

String DevolucionNro = CustomKeywords.'CRPRERP_DEVOLUCION_DE_PAGOMAXNRO.CRPREP_Cliente_Numero'(Clientenro)

WebUI.setText(findTestObject('Page_CLIENTE APELLIDO-A/input_Nmero_W0033W0007vRECIBONRO'), DevolucionNro)

WebUI.click(findTestObject('Page_CLIENTE APELLIDO-A/input_Hasta Fecha_W0033W0007SEARCHBUTTON'))

