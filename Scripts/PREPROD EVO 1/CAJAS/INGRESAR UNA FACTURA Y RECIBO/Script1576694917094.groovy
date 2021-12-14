import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.sql.Connection as Connection
import java.sql.ResultSet as ResultSet
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
import oracle.jdbc.driver.ResultSetCache as ResultSetCache
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('PREPROD EVO 1/CLIENTE NUEVO/LOGIN'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_SIGA Software/span_Gestin Comercial'))

WebUI.click(findTestObject('Object Repository/Page_SIGA Software/span_Clientes'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Page_Clientes/input_Cliente Nro_vCLIENTENRO'), '5')

//WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Clientes/select_INGRESADOPENDIENTEEMITIDOCONECTADODE_890a74'), 
//  'C', true)
WebUI.click(findTestObject('Object Repository/Page_Clientes/input_Home Pack_SEARCHBUTTON'))

WebUI.delay(15)

WebUI.click(findTestObject('Object Repository/Page_Clientes/img_Cantidad facturas_vDISPLAY_0001'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_ANA BORDALLO ABAD/span_Documentos'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_ANA BORDALLO ABAD/input_Histricos_W0030W0008INSERT'))

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Documento/select_AMERICAN EXPRESS TBCR SIN COMISION B_eb8749'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/Page_Documento/input_Exonerado_W0024W0008W0007CPTOFACID_0001'), '1')

WebUI.setText(findTestObject('Object Repository/Page_Documento/input_SERVICIO TV CABLE_W0024W0008W0007FACT_f655fb'), '100')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Page_Documento/input_Preview_W0024W0008W0007ENTER'))

WebUI.delay(20)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ANA BORDALLO ABAD/select_(Ninguno)PAGAIMPAGAENVIADAREFINANCIA_98f530'), 
    'I', true)

WebUI.click(findTestObject('Object Repository/Page_ANA BORDALLO ABAD/input_Hasta Fecha_W0030W0008SEARCHBUTTON'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Page_ANA BORDALLO ABAD/input_Histricos_W0030W0008AGREGARRECIBO'))

