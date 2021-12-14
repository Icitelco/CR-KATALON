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
import org.apache.commons.lang.RandomStringUtils as RandStr

WebUI.callTestCase(findTestCase('COSTA RICA TEST/LOGIN CR TEST'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_SIGA Software/a_Gestin Comercial'))

WebUI.click(findTestObject('Object Repository/Page_SIGA Software/span_Clientes'))

WebUI.navigateToUrl('http://10.7.57.126/SIGA-TG/servlet/wwcliente')

WebUI.click(findTestObject('Object Repository/Page_Clientes/input_Clientes_INSERT'))

String Nombre='PRUEBA'+RandStr.randomAlphabetic (5);

System.out.println('EL NOMBRE ES :'+Nombre);

WebUI.setText(findTestObject('Object Repository/Page_Cliente/input_Nombre_W0033W0007W0009vCLIENTENOM'),Nombre)

WebUI.setText(findTestObject('Object Repository/Page_Cliente/input_Apellido_W0033W0007W0009vCLIENTEAPE'), 'CR TEST')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Cliente/select_(Ninguno)Cdula de IdentidadCdula Jur_21301f'), 
    'JUR', true)

WebUI.setText(findTestObject('Object Repository/Page_Cliente/input_Cdula_W0033W0007W0009vCEDULA'), '0101010101010101')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Cliente/select_CelularFaxOtroResidencialTIGO NUMBERTrabajo'), 
    'C', true)

WebUI.setText(findTestObject('Object Repository/Page_Cliente/input_Telfono Principal_W0033W0007W0009vCLIENTETEL'), '84522113')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Cliente/select_(Ninguno)SAN JOSEALAJUELACARTAGOHERE_ef9a18'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Cliente/select_(Ninguno)SAN JOSEESCAZUDESAMPARADOSP_de358c'), 
    '10', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Cliente/select_(Ninguno)ALAJUELITA DISTRITOSAN JOSE_8855c1'), 
    '148', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Cliente/select_(Ninguno)ALAJUELITA'), '133', true)

WebUI.setText(findTestObject('Object Repository/Page_Cliente/textarea_Direccin_W0033W0007W0009vCLICALDIRECCION'), 'ABELLA 1010')

WebUI.click(findTestObject('Object Repository/Page_Cliente/input_Sucursal_W0033W0007W0009vPROMPTSUCURSAL'))

WebUI.click(findTestObject('Object Repository/Page_Cliente/a_LA SABANA'))

WebUI.click(findTestObject('Object Repository/Page_Cliente/input_Zona_W0033W0007W0009vPROMPTZONA'))

WebUI.click(findTestObject('Object Repository/Page_Cliente/a_904'))

