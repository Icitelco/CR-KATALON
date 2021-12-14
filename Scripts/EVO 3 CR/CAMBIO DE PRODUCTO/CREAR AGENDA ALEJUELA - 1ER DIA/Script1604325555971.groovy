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

WebUI.navigateToUrl('http://10.7.148.132:8080/SIGA-TG/servlet/wwagenda')

WebUI.click(findTestObject('Object Repository/Page_Agendas/input_Pgina 1 de 1_CREARAGENDA'))

mydate = (new Date() + 1)

formattedDate = mydate.format('dd/MM/YYYY')

WebUI.setText(findTestObject('Object Repository/Page_Agendas/input_Desde_vAGENDAFECHADESDE'), formattedDate)

WebUI.click(findTestObject('Object Repository/Page_Agendas/input_Tipo de Tarea_vSEL_0001'))

WebUI.check(findTestObject('Object Repository/Page_Agendas/input_AVERIAS CONSOLIDADO_vSEL_0002'))

WebUI.check(findTestObject('Object Repository/Page_Agendas/input_AVERIAS DTH_vSEL_0003'))

WebUI.check(findTestObject('Object Repository/Page_Agendas/input_AVERIAS SME_vSEL_0004'))

WebUI.check(findTestObject('Object Repository/Page_Agendas/input_DESCONEXION DTH_vSEL_0005'))

WebUI.check(findTestObject('Object Repository/Page_Agendas/input_DESCONEXION SME_vSEL_0006'))

WebUI.check(findTestObject('Object Repository/Page_Agendas/input_DESCONEXIONES CONSOLIDADO_vSEL_0007'))

WebUI.check(findTestObject('Object Repository/Page_Agendas/input_INSTALACION DTH_vSEL_0008'))

WebUI.check(findTestObject('Object Repository/Page_Agendas/input_INSTALACION SME_vSEL_0009'))

WebUI.check(findTestObject('Object Repository/Page_Agendas/input_INSTALACIONES CONSOLIDADO_vSEL_0010'))

WebUI.check(findTestObject('Object Repository/Page_Agendas/input_NO AGENDA_vSEL_0011'))

WebUI.check(findTestObject('Object Repository/Page_Agendas/input_RECONEXION OPERATIVA_vSEL_0012'))

WebUI.check(findTestObject('Object Repository/Page_Agendas/input_RECONEXION TAP_vSEL_0013'))

WebUI.check(findTestObject('Object Repository/Page_Agendas/input_TAREAS DE SUPERVISION_vSEL_0014'))

WebUI.check(findTestObject('Object Repository/Page_Agendas/input_TAREAS DE SUPERVISION SME_vSEL_0015'))

WebUI.click(findTestObject('Object Repository/Page_Agendas/input_Hasta_BUTTON1'))

WebUI.delay(10)

WebUI.refresh()

