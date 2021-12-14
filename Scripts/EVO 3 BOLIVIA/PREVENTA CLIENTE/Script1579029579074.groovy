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

WebUI.callTestCase(findTestCase('EVO 3 BOLIVIA/LOGIN EVO 3'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3)

WebUI.navigateToUrl('https://192.168.1.115/SIGA-BO/servlet/wwpreventacliente')

WebUI.click(findTestObject('Object Repository/Page_Preventa Clientes/input_Preventa Clientes_AGREGARPREVENTACLIENTE'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Preventa Cliente/select_(Todos)DTH POSPAGODTH PREPAGOHFC TVH_f11028'), 
    '3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Preventa Cliente/select_BAGO-CONSULTORIO MEDICO RUSIA18BANCO_8a34e1'), 
    '124', true)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Preventa Cliente/select_(Todos)CESAR AUGUSTO HERBAS TERCEROS_8fbc83'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Preventa Cliente/select_(Todos)CESAR AUGUSTO HERBAS TERCEROS_8fbc83'), 
    '63779', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Preventa Cliente/select_(Todos)BAGO-CONSULTORIO MEDICO RUSIA_6a6c66'), 
    '124', true)

WebUI.setText(findTestObject('Object Repository/Page_Preventa Cliente/input_Nombre_W0027W0007W0009PREVENTANOM'), 'PREVENTA')

WebUI.setText(findTestObject('Object Repository/Page_Preventa Cliente/input_Apellido_W0027W0007W0009PREVENTAAPE'), 'PRUEBA')

WebUI.setText(findTestObject('Object Repository/Page_Preventa Cliente/input_Fecha de Nacimiento_W0027W0007W0009PR_40c5b2'), 
    '20/08/2000')

WebUI.setText(findTestObject('Object Repository/Page_Preventa Cliente/input_E-mail_W0027W0007W0009PREVENTAEMAIL'), 'preventaprueba@gmail.com')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Preventa Cliente/select_CORPORATECORPORATE NFDTH B2BDTH POSP_b5e8ac'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Preventa Cliente/select_(Todos)CLIENTE STAFFCLIENTES DTH PRE_ae6646'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Preventa Cliente/Nacionalidad'), '75', true)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Preventa Cliente/select_(Todos)GUAYARAMERIN'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Preventa Cliente/select_(Todos)GUAYARAMERINMAGDALENARIBERALT_c73a3f'), 
    '48', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Preventa Cliente/select_(Todos)GUAYARAMERIN'), '1', true)

WebUI.setText(findTestObject('Object Repository/Page_Preventa Cliente/textarea_Direccion_W0027W0007W0009PREVENTAC_f63b38'), 
    'PREVENTA PRUEBA')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Preventa Cliente/select_(Todos)DTHDTH  BENI'), '13', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Preventa Cliente/select_(Todos)CASARABEGUAYARAMERINHUACARAJE_4d171c'), 
    '40729', true)

WebUI.click(findTestObject('Object Repository/Page_Preventa Cliente/input_Observaciones_W0027W0007W0009ENTER'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Preventa Cliente/span_Preventa Cliente -'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Page_Preventa Cliente/span_Productos de la Preventa'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Preventa Cliente/input_Pgina 0 de 0_W0027W0007AGREGARPRODUCTOS'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Ingreso de Productos de Preventa/input_HAB_SELECCIONARPRODUCTOS'))

WebUI.delay(6)

WebUI.setText(findTestObject('Object Repository/Page_Ingreso de Contratos/input_Nombre_vPRODUCTONOMBRE'), 'PRODUCTO PRUEBA')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Ingreso de Contratos/input_ACTIVO_vSELECCIONADO_0002'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Ingreso de Contratos/input_ACTIVO_CONFIRMARR'))

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Ingreso de Contratos/POLITICA COMBO'), '10300', true)

WebUI.delay(3)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Ingreso de Contratos/CONFIRMAR CONTRATOS'))

WebUI.click(findTestObject('Object Repository/Page_Ingreso de Contratos/ACEPTAR CONTRATOS'))

WebUI.delay(2)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Preventa Cliente/input_Producto Nombre_W0027W0007vCHECKALL'))

WebUI.click(findTestObject('Object Repository/Page_Preventa Cliente/input_Histricos_W0027W0007AUTORIZARPRODUCTOS'))

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.refresh()

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_PREVENTA PRUEBA/input_Pgina 1 de 1_W0027W0007GENERARPREVENTA'))

WebUI.click(findTestObject('Object Repository/Page_PREVENTA PRUEBA/input_Confirma GENERAR preventa_W0027W0007I_4ceda4'))

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.navigateToUrl('https://192.168.1.115/SIGA-BO/servlet/wwcliente')

WebUI.setText(findTestObject('Object Repository/Page_Clientes/input_Nombre_vCLIENTENOM'), 'PREVENTA')

WebUI.setText(findTestObject('Page_Clientes/input_Apellido_vCLIENTEAPE'), 'PRUEBA')

WebUI.click(findTestObject('Object Repository/Page_Clientes/input_Status_SEARCHBUTTON'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_Clientes/img_Cantidad facturas_vDISPLAY_0001'))

