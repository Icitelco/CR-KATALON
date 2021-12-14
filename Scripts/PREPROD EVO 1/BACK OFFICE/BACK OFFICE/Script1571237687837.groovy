import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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
import org.openqa.selenium.Keys as Keys

WebUI.delay(6)

WebUI.click(findTestObject('Object Repository/Page_SIGA Software/a_Back Office'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_SIGA Software/span_Corregir Clientes'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Page_Back Office de Clientes/input_Cliente_vE_CLIENTENRO'), '5')

WebUI.click(findTestObject('Object Repository/Page_Back Office de Clientes/input_Incluir Reclamos _BUSCAR'))

WebUI.delay(7)

WebUI.click(findTestObject('Object Repository/Page_Back Office de Clientes/a_Status'))

WebUI.delay(7)

WebUI.click(findTestObject('Object Repository/Page_Back Office de Clientes/input_INGRESADO_vCONTRATOSTS'))

WebUI.click(findTestObject('Object Repository/Page_Back Office de Clientes/input_Ultima Factura_CONFIRMAR'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Back Office de Clientes/a_Vigencia'))

WebUI.delay(7)

WebUI.click(findTestObject('Object Repository/Page_Back Office de Clientes/a_Status_1'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_Back Office de Clientes/input_PENDIENTE_vORDENSTS'))

WebUI.click(findTestObject('Object Repository/Page_Back Office de Clientes/input_Finaliza_CONFIRMAR'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Page_Back Office de Clientes/a_Status_2'))

WebUI.delay(7)

WebUI.click(findTestObject('Object Repository/Page_Back Office de Clientes/input_INGRESADO_vCLIENTESRVSTS'))

WebUI.click(findTestObject('Object Repository/Page_Back Office de Clientes/input_CANCELADO_CONFIRMAR'))

