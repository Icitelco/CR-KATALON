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

WebUI.navigateToUrl('http://192.168.1.115:8080/SIGA-BO/servlet/wwcajagrupo')

WebUI.delay(2)

WebUI.setText(findTestObject('Page_Grupo de Atencin de Cajas/input_Oficina_vCAJAGRUPONOMBRE'), 'CAJAS ESPECIALES')

WebUI.delay(2)

WebUI.click(findTestObject('Page_Grupo de Atencin de Cajas/img_Transfiere valores al cierre_vDISPLAY_0001'))

WebUI.delay(6)

WebUI.click(findTestObject('Object Repository/Page_Grupo de Atencin de Caja/span_Cobradores'))

WebUI.click(findTestObject('Object Repository/Page_Grupo de Atencin de Caja/input_Cuentas bancarias_W0027W0007INSERT'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Page_Caja Cobrador/input_Cobrador_W0019W0007W0009COBRADORID'), '1')

WebUI.setText(findTestObject('Object Repository/Page_Caja Cobrador/input_Caja_W0019W0007W0009CAJACOBRADORCAJANRO'), '6')

WebUI.click(findTestObject('Object Repository/Page_Caja Cobrador/input_Realiza Apertura_W0019W0007W0009CAJAC_889bad'))

WebUI.click(findTestObject('Object Repository/Page_Caja Cobrador/input_Realiza Cierre_W0019W0007W0009CAJACOB_060b6d'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Page_Caja Cobrador/input_Realiza Cierre_W0019W0007W0009ENTER'))

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Page_Grupo de Atencin de Caja/span_Usuarios autorizados'))

WebUI.click(findTestObject('Object Repository/Page_Grupo de Atencin de Caja/input_Cuentas bancarias_W0027W0007INSERT'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Page_Caja Grupo Usuario/input_Usuario_W0024W0007W0009CAJAGRUPOUSUARIOID'), 
    'ADMIN')

WebUI.click(findTestObject('Object Repository/Page_Caja Grupo Usuario/input_ADMIN_W0024W0007W0009ENTER'))

WebUI.takeScreenshot()

