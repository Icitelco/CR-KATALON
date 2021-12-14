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

WebUI.delay(10)

WebUI.navigateToUrl('http://10.7.148.132:8080/SIGA-TG/servlet/wwpreventaclientedeusuario')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Preventa Clientes de Usuario/input_MARCAUZ_AGREGARPREVENTACLIENTE'))

WebUI.delay(10)

WebUI.selectOptionByValue(findTestObject('Object Repository/select_(Ninguno)BASICO CATVBASICO CATV - IN_ab7ec5 (1) (1) (1)'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/select_ALTERNATIVE CHANNELSB2C ATLANTICAB2C_6d8990 (1) (1) (1)'), 
    '122', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/select_(Ninguno)BIBIANA CASTRO CARTAGENADIA_dafa0e (1) (1) (1)'), 
    '14602', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/select_(Ninguno)BRITVCALL CENTER SACDTH TMK_6d2d06 (1) (1) (1)'), 
    '140', true)

WebUI.setText(findTestObject('Object Repository/input_Nombre_W0027W0007W0009PREVENTANOM (1) (1) (1)'), 'PRUEBA PREVENTA')

WebUI.setText(findTestObject('Object Repository/input_Apellido_W0027W0007W0009PREVENTAAPE (1) (1) (1)'), 'PREVENTA')

WebUI.selectOptionByValue(findTestObject('Object Repository/select_(Ninguno)Cdula JurdicaCdula Residenc_5df885 (1) (1) (1) (1)'), 
    'JUR', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/select_(Ninguno)Cdula JurdicaCdula Residenc_5df885 (1) (1) (1) (1)'), 
    'CNA', true)

WebUI.setText(findTestObject('Object Repository/input_Cdula_W0027W0007W0009vCEDULA (1) (1) (1)'), '1-2356-8965')

WebUI.setText(findTestObject('Object Repository/input_E-mail_W0027W0007W0009PREVENTAEMAIL (1) (1) (1)'), 'prueba@gmail.com')

WebUI.setText(findTestObject('Object Repository/input_Fecha de Nacimiento_W0027W0007W0009PR_40c5b2 (1) (1) (1)'), '20/08/2000')

WebUI.setText(findTestObject('Object Repository/input_Telfono Principal_W0027W0007W0009PREV_2b8637 (1) (1) (1)'), '64569854')

WebUI.selectOptionByValue(findTestObject('Object Repository/select_(Ninguno)ALAJUELACARTAGOGUANACASTEHE_837124 (1) (1) (1)'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/select_(Ninguno)ALAJUELAATENASGRECIAGUATUSO_df2ac0 (1) (1) (1) (1)'), 
    '21', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/select_(Ninguno)ALAJUELA DISTRITOCAJON DIST_9454d1 (1) (1) (1) (1)'), 
    '203', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/select_(Ninguno)ALAJUELA (3) (1) (1) (1)'), '468', true)

WebUI.setText(findTestObject('Object Repository/textarea_Direccion_W0027W0007W0009PREVENTAC_f63b38 (1) (1) (1)'), 'PRUEBA DIRECION')

WebUI.click(findTestObject('Object Repository/input_Observaciones_W0027W0007W0009ENTER (1) (1) (1)'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/span_Informacin de Cobro (1) (1) (1)'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/span_Telfonos (1) (1) (1)'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/span_Documentos de ID (1) (1) (1)'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/span_Productos de la Preventa (2) (1) (1)'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/input_Pgina 0 de 0_W0027W0007AGREGARPRODUCTOS'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/input_HOME_SELECCIONARPRODUCTOS'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Page_Ingreso de Contratos/input_Nombre_vPRODUCTONOMBRE'), 'SERVICIO BASICO')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Ingreso de Contratos/input_Aprovisionar_vSELECCIONADO_0001'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Ingreso de Contratos/input__CONFIRMAR333'))

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Object Repository/select_(Ninguno)BASIC -- SERVICIO BASICO GA_be2c18 (1) (1) (1)'), 
    '1119', true)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/input__CONFIRMAR (1) (1) (1)'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Ingreso de Contratos/button_Aceptar'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/span_Condiciones de Productos (1) (1) (1)'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/input_Status_W0027W0007vACEPTAR_0001 (1) (1) (1)'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/span_Productos de la Preventa (2) (1) (1)'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/input_Producto Nombre_W0027W0007vCHECKALL (1) (1) (1)'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/input_Histricos_W0027W0007AUTORIZARPRODUCTOS (1) (1) (1)'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/input_Pgina 1 de 1_W0027W0007GENERARPREVENTA (1) (1) (1)'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/input_Confirma GENERAR preventa_W0027W0007I_4ceda4 (1) (1) (1)'))

