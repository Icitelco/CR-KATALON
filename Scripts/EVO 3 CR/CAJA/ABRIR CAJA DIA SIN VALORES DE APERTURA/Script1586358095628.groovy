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

WebUI.delay(5)

mydate = new Date()

formattedDate = mydate.format('dd/MM/YYYY')

'PANTALLA CAJA DIA'
WebUI.navigateToUrl('http://10.7.148.132:8080/SIGA-TG/servlet/wwcajadia')

String CAJANOMBRE = CustomKeywords.'CRPERP_NOMBRE_CAJAA.CRPREP_Cliente_Numero'()

println(CAJANOMBRE)

/*String CajaGrupoID = CustomKeywords.'CRPREP_NROMAX_CAJAGRUPOO.CRPREP_Cliente_Numero'()*/

WebUI.delay(6)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Cajas Diarias/select_ArZANJqjPvYZZrbAOspAHEREDIASGOKseoxB_134ec0'), 
    '7', true)

/*'SELECCIONAMOS LA CAJA GRUPO'
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Cajas Diarias/select_ArZANJqjPvYZZrbAOspASGOKseoxBSoItckh_aebc87'), 
    CajaGrupoID, true)*/

'NOMBRE CAJA'
WebUI.setText(findTestObject('Object Repository/Page_Cajas Diarias/input_Caja_vCAJANOMBRE'), CAJANOMBRE)

'FECHA DE HOY'
WebUI.setText(findTestObject('Object Repository/Page_Cajas Diarias/input_Desde Caja Fecha_vFROMCAJADIAFCH'), formattedDate)

'FECHA DE HOY'
WebUI.setText(findTestObject('Object Repository/Page_Cajas Diarias/input_Hasta Caja Fecha_vTOCAJADIAFCH'), formattedDate)

'STATUS INGRESADA'
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Cajas Diarias/select_(Ninguno)INGRESADAABIERTACERRADA'), 
    'I', true)

WebUI.click(findTestObject('Object Repository/Page_Cajas Diarias/input_Status_SEARCHBUTTON'))

/*
'INGRESAR VALORES DE APERTURA'
WebUI.click(findTestObject('Object Repository/Page_Cajas Diarias/a_Valores'))
*/

'ABRIR CAJA DIA'
WebUI.click(findTestObject('Object Repository/Page_Cajas Diarias de Oficina/input_Cierre_vABRIR_0001'))

/*WebUI.click(findTestObject('Object Repository/Page_Cajas Diarias de Oficina/input_Confirma abrir Caja_I_BUTTONCONFIRMYES'))*/

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Cajas Diarias de Oficina/select_(Ninguno)INGRESADAABIERTACERRADA'), 
    'A', true)

