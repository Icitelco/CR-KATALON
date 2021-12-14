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

WebUI.callTestCase(findTestCase('EVO 3 CR/LOGIN EVO 3 CR/LOGIN'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(10)

WebUI.navigateToUrl('http://10.7.148.132:8080/SIGA-TG/servlet/wwpreventaclientedeusuario')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Preventa Clientes de Usuario/input_MARCAUZ_AGREGARPREVENTAPRODUCTO'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Preventa Cliente/select_(Ninguno)BASICO CATVBASICO CATV - IN_ab7ec5'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Preventa Cliente/select_ALTERNATIVE CHANNELSB2C ATLANTICAB2C_6d8990'), 
    '122', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Preventa Cliente/select_(Ninguno)BIBIANA CASTRO CARTAGENADIA_dafa0e'), 
    '14602', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Preventa Cliente/select_(Ninguno)BRITVCALL CENTER SACDTH TMK_6d2d06'), 
    '140', true)

//CLIENTE EN STS INGRESADO
String Clientenro = CustomKeywords.'CRPREP_CLIENTE_INGRESADO_HOME_SIN_PREVENTA.CRPREP_Cliente_Numero'()

WebUI.setText(findTestObject('Object Repository/Page_Preventa Cliente/input_Cliente_W0027W0007W0009CLIENTENROPREVENTA'), 
    Clientenro)

WebUI.click(findTestObject('Object Repository/Page_Preventa Cliente/input_Observaciones_W0027W0007W0009ENTER'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Preventa Cliente/span_Productos de la Preventa'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/input_Pgina 0 de 0_W0027W0007AGREGARPRODUCTOS'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/input_HOME_SELECCIONARPRODUCTOS'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Page_Ingreso de Contratos/input_Nombre_vPRODUCTONOMBRE'), 'SERVICIO BASICO')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Ingreso de Contratos/input_Aprovisionar_vSELECCIONADO_0001'))

WebUI.click(findTestObject('Object Repository/Page_Ingreso de Contratos/input__CONFIRMAR333'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Ingreso de Productos de Preventa/select_(Ninguno)BASIC -- SERVICIO BASICO GA_be2c18'), 
    '1119', true)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Ingreso de Productos de Preventa/input_HOME_SELECCIONARPRODUCTOS'))

WebUI.delay(10)

WebUI.setText(findTestObject('Object Repository/Page_Ingreso de Contratos/input_Nombre_vPRODUCTONOMBRE (1)'), 'INTERNET RESIDENCIAL 10 MEGAS')

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_Ingreso de Contratos/input_Aprovisionar_vSELECCIONADO_0001'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Ingreso de Contratos/input__CONFIRMAR333'))

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Ingreso de Productos de Preventa/select_(Ninguno)MEG10 INTERNET RESIDENCIAL _98b590'), 
    '5239', true)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Ingreso de Productos de Preventa/input__vE_PRODUCTOADICIONAL_0002'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Ingreso de Productos de Preventa/input_Status_vSELECCIONADO_0001'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Ingreso de Productos de Preventa/input_Page 1 Of 1_CONFIRMAR'))

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Ingreso de Productos de Preventa/select_(Ninguno)EAMO3 ALQUILER CABLE MODEM _e6e274'), 
    '2812', true)

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_Ingreso de Productos de Preventa/input__CONFIRMAR'))

WebUI.click(findTestObject('Object Repository/Page_Ingreso de Productos de Preventa/button_Aceptar'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Preventa Cliente/span_Condiciones de Productos'))

WebUI.click(findTestObject('Object Repository/Page_Preventa Cliente/input_Status_W0027W0007vACEPTAR_0001'))

WebUI.click(findTestObject('Object Repository/Page_Preventa Cliente/span_Productos de la Preventa'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Preventa Cliente/input_Producto Nombre_W0027W0007vCHECKALL'))

WebUI.click(findTestObject('Object Repository/Page_Preventa Cliente/input_Histricos_W0027W0007AUTORIZARPRODUCTOS'))

WebUI.click(findTestObject('Object Repository/Page_Preventa Cliente/input_Pgina 1 de 1_W0027W0007GENERARPREVENTA'))

WebUI.click(findTestObject('Object Repository/Page_Preventa Cliente/input_Confirma GENERAR preventa_W0027W0007I_4ceda4'))

WebUI.refresh()

