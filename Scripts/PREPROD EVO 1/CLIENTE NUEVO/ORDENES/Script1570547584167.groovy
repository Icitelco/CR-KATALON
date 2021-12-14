import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.katalon.plugin.keyword.connection.DBType as DBType
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import oracle.jdbc.driver.OracleConnection as OracleConnection
import org.openqa.selenium.Keys as Keys
import java.sql.Connection as Connection
import java.lang.String as String
import java.sql.ResultSet as ResultSet
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject








WebUI.delay(20)

a = WebUI.getText(findTestObject('Object Repository/Page_PRUEBA AUTOGESTION PRUEBA/CLIENTENRO'))

contrato = WebUI.getUrl()

WebUI.click(findTestObject('Object Repository/Page_PRUEBA AUTOGESTION PRUEBA/span_Gestin Operativa'))

WebUI.click(findTestObject('Object Repository/Page_PRUEBA AUTOGESTION PRUEBA/span_Ordenes de Servicio'))

WebUI.delay(15)

WebUI.setText(findTestObject('Object Repository/Page_Ordenes de Servicio/input_Cliente Nro_vCLIENTENROORD'), a)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Ordenes de Servicio/input_Forma Generada_SEARCHBUTTON'))

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Page_Ordenes de Servicio/input_Empresa_vEMITIR_0001'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_Ordenes de Servicio/button_Aceptar'))

WebUI.delay(15)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Emitir Ordenes Pendientes de Cliente/tecnicoo'), '15435', 
    true)

WebUI.click(findTestObject('Object Repository/Page_Emitir Ordenes Pendientes de Cliente/input_Tecnico_allbox'))

WebUI.click(findTestObject('Object Repository/Page_Emitir Ordenes Pendientes de Cliente/input_Page_EMITIRORDEN'))

WebUI.click(findTestObject('Object Repository/Page_Emitir Ordenes Pendientes de Cliente/button_Aceptar'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_Emitir Ordenes Pendientes de Cliente/input_Page_VOLVER'))

WebUI.delay(10)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Page_Ordenes de Servicio/img_Empresa_vCUMPLIR_0001'))

WebUI.delay(15)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Cumplir una Orden/select_PENDIENTESUSPENDIDAFINALIZADAREAGENDAR'), 
    'F', true)

WebUI.delay(5)

b = WebUI.getText(findTestObject('Object Repository/Page_Cumplir una Orden/span_09102019'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Page_Cumplir una Orden/input_Comienzo_W0021ORDENFCOM'), b)

WebUI.setText(findTestObject('Object Repository/Page_Cumplir una Orden/input_Finalizada_W0021ORDENFFIN'), b)

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_Cumplir una Orden/input_Observacin_W0021ENTER'))

WebUI.delay(15)

WebUI.click(findTestObject('Object Repository/Page_Ordenes de Servicio/input_CONTRATO_vAPROVISIONAR_0002'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_Aprovisionar Orden de Servicio/input_Page_ELEGIRARTPARAINSTALAR'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_Aprovisionar Orden de Servicio/input_Cantidad mxima de reclamos_vSELECCIONAR_0001 (1)'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_Aprovisionar Orden de Servicio/input_INSTALA_AGREGARARTICULOCONFIRMAR'))

WebUI.delay(10)

WebUI.takeScreenshot()

ARTSERIE = WebUI.getText(findTestObject('Object Repository/Page_Aprovisionar Orden de Servicio/ARTICULOSERIE'))

println(ARTSERIE)

Connection connection = null

connection = CustomKeywords.'com.katalon.plugin.keyword.connection.DatabaseKeywords.createConnection'(com.katalon.plugin.keyword.connection.DBType.oracle, '10.7.57.225', '1521', 'SIGAPREP', 
    'SIGATG', 'U0lHQVRH')

String Query = 'UPDATE SIGATG.CMODEM SET CMODEMHAB=1 WHERE EMPRESAID=10 AND CMODEMID='.concat('\'').concat(ARTSERIE).concat('\'')

connection.setAutoCommit(false)

println(Query)

CustomKeywords.'com.katalon.plugin.keyword.connection.DatabaseKeywords.execute'(connection, Query)

WebUI.delay(5)

CustomKeywords.'com.katalon.plugin.keyword.connection.DatabaseKeywords.closeConnection'(connection)

WebUI.delay(10)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Aprovisionar Orden de Servicio/Localu'), '13', true)

WebUI.click(findTestObject('Object Repository/Page_Aprovisionar Orden de Servicio/input_Ubicacin_CONFIRMARORDEN'))

WebUI.click(findTestObject('Object Repository/Page_Aprovisionar Orden de Servicio/button_Aceptar'))

WebUI.delay(10)

WebUI.navigateToUrl(contrato)

WebUI.takeScreenshot()

