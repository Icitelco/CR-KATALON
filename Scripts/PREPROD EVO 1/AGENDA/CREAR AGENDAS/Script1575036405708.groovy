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

WebUI.callTestCase(findTestCase('PREPROD EVO 1/CLIENTE NUEVO/LOGIN'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_SIGA Software/div_Gestin Operativa_ygtvspacer'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_SIGA Software/span_Agenda Diaria'))

WebUI.delay(5)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Page_Agendas/input_Ordenado por_CREARAGENDA'))

WebUI.click(findTestObject('Object Repository/Page_Agendas/input_Tipo de Tarea_vSEL_0001'))

WebUI.click(findTestObject('Object Repository/Page_Agendas/input_AVERIAS CONSOLIDADO_vSEL_0002'))

WebUI.click(findTestObject('Object Repository/Page_Agendas/input_AVERIAS DTH_vSEL_0003'))

WebUI.click(findTestObject('Object Repository/Page_Agendas/input_AVERIAS SME_vSEL_0004'))

WebUI.click(findTestObject('Object Repository/Page_Agendas/input_DESCONEXION DTH_vSEL_0005'))

WebUI.click(findTestObject('Object Repository/Page_Agendas/input_DESCONEXION SME_vSEL_0006'))

WebUI.click(findTestObject('Object Repository/Page_Agendas/input_DESCONEXIONES CONSOLIDADO_vSEL_0007'))

WebUI.click(findTestObject('Object Repository/Page_Agendas/input_INSTALACION DTH_vSEL_0008'))

WebUI.click(findTestObject('Object Repository/Page_Agendas/input_INSTALACION SME_vSEL_0009'))

WebUI.click(findTestObject('Object Repository/Page_Agendas/input_INSTALACIONES CONSOLIDADO_vSEL_0010'))

WebUI.click(findTestObject('Object Repository/Page_Agendas/input_NO AGENDA_vSEL_0011'))

WebUI.click(findTestObject('Object Repository/Page_Agendas/input_RECONEXION OPERATIVA_vSEL_0012'))

WebUI.click(findTestObject('Object Repository/Page_Agendas/input_RECONEXION TAP_vSEL_0013'))

WebUI.click(findTestObject('Object Repository/Page_Agendas/input_TAREAS DE SUPERVISION_vSEL_0014'))

WebUI.click(findTestObject('Object Repository/Page_Agendas/input_TAREAS DE SUPERVISION SME_vSEL_0015'))

WebUI.click(findTestObject('Object Repository/Page_Agendas/input_Hasta_BUTTON1'))

WebUI.click(findTestObject('Object Repository/Page_Agendas/span_Crear Agenda_gxp0_cls'))

WebUI.takeScreenshot()

