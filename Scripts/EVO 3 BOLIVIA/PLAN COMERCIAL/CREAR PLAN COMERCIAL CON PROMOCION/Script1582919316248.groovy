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

WebUI.delay(5)

WebUI.navigateToUrl('https://192.168.1.115/SIGA-BO/servlet/wwplancomercial')

WebUI.click(findTestObject('Object Repository/Page_Planes Comerciales/input_Planes Comerciales_INSERT'))

WebUI.setText(findTestObject('Object Repository/Page_Plan Comercial/input_Nombre_W0027W0007W0009PLANCOMERCIALNOMBRE'), ' PLAN COMERCIAL KATA')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Plan Comercial/select_CORPORATECORPORATE NFDTH B2BDTH POSP_b5e8ac'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/Page_Plan Comercial/input_Activo en Venta_W0027W0007W0009PLANCO_20ba9c'))

WebUI.click(findTestObject('Object Repository/Page_Plan Comercial/input_Clientes Activos_W0027W0007W0009ENTER'))

WebUI.setText(findTestObject('Object Repository/Page_Planes Comerciales/input_Nombre_vPLANCOMERCIALNOMBRE'), ' PLAN COMERCIAL KATA')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Planes Comerciales/input_Clientes Activos_vUPDATE_0001'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Versiones de plan comercial/input_PENDIENTE_W0027W0007W0009ENTER'))

WebUI.click(findTestObject('Object Repository/Page_Planes Comerciales/img_Clientes Activos_vDISPLAY_0001'))

WebUI.click(findTestObject('Object Repository/Page_Plan Comercial/span_Versionado'))

WebUI.click(findTestObject('Object Repository/Page_PLAN COMERCIAL PRUEBAA/img_Estado_W0027W0007vDISPLAY_0001'))

WebUI.click(findTestObject('Object Repository/Page_PLAN COMERCIAL PRUEBAA/span_Versiones de items de plan comerciales'))

WebUI.click(findTestObject('Object Repository/Page_PLAN COMERCIAL PRUEBAA/input_Versiones de items de plan comerciale_4f86b8'))

WebUI.setText(findTestObject('Object Repository/Page_Versiones de items de plan comercial/input_Item Id_W0027W0007W0009PLANCOMHISTITEMID'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_Versiones de items de plan comercial/input_Item Dsc_W0027W0007W0009PLANCOMHISTITEMDSC'), 
    'BASICO')

WebUI.click(findTestObject('Object Repository/Page_Versiones de items de plan comercial/img_Politica Default_W0027W0007W0009PROMPT__774f4c'))

WebUI.setText(findTestObject('Object Repository/Page_Versiones de items de plan comercial/input_Nombre_vPRODUCTONOMBRE'), 
    'HFC-TV-BASICO')

WebUI.click(findTestObject('Object Repository/Page_Versiones de items de plan comercial/a_HFC-TV-BASICO'))

WebUI.click(findTestObject('Object Repository/Page_Versiones de items de plan comercial/input_Politica Default_W0027W0007W0009vPRMP_821ffa'))

WebUI.click(findTestObject('Object Repository/Page_Versiones de items de plan comercial/a_TV BASICO HFC'))

WebUI.click(findTestObject('BOLIVIA/input_SERVICIO BASICO_W0022W0008W0007vPRMPT_9274e1'))

WebUI.click(findTestObject('Object Repository/Page_Plan Comercial Item/a_ANTICIPADO - PLAN BASICOBASICO HFCBAS INTERM'))

WebUI.click(findTestObject('Object Repository/Page_Versiones de items de plan comercial/input_Nueva fila_W0027W0007W0009ENTER'))

WebUI.click(findTestObject('Object Repository/Page_PLAN COMERCIAL PRUEBAAA/img_Estado_W0027W0007vDISPLAY_0001'))

WebUI.click(findTestObject('Object Repository/Page_PLAN COMERCIAL PRUEBAAA/span_Versiones de items de plan comerciales'))

WebUI.click(findTestObject('Object Repository/Page_PLAN COMERCIAL PRUEBAAA/input_Versiones de items de plan comerciale_4f86b8'))

WebUI.setText(findTestObject('Object Repository/Page_Versiones de items de plan comercial/input_Item Id_W0027W0007W0009PLANCOMHISTITEMID'), 
    '2')

WebUI.setText(findTestObject('Object Repository/Page_Versiones de items de plan comercial/input_Item Dsc_W0027W0007W0009PLANCOMHISTITEMDSC'), 
    'BBI 40 MBPS B2B')

WebUI.click(findTestObject('Object Repository/Page_Versiones de items de plan comercial/img_Politica Default_W0027W0007W0009PROMPT__774f4c'))

WebUI.setText(findTestObject('Object Repository/Page_Versiones de items de plan comercial/input_Nombre_vPRODUCTONOMBRE'), 
    'BBI 40 MBPS B2B')

WebUI.click(findTestObject('Page_UFC STAF/a_BBI 40 MBPS B2B'))

WebUI.click(findTestObject('Object Repository/Page_UFC STAF/input_FOX PACK_W0027W0007W0009vPRMPTPOLITICA_0001'))

WebUI.click(findTestObject('Object Repository/Page_UFC STAF/a_PREMIUM FOX PACK'))

WebUI.click(findTestObject('Object Repository/Page_Versiones de items de plan comercial/input_Nueva fila_W0027W0007W0009ENTER'))

WebUI.click(findTestObject('Object Repository/Page_Plan Comercial/input_Estado_W0027W0007vCONFIRMAR_0001'))

WebUI.click(findTestObject('Object Repository/Page_Plan Comercial/input_La confirmacin de la versin actualiza_9be3e8'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Plan Comercial/span_Vigencias'))

WebUI.click(findTestObject('Object Repository/Page_Plan Comercial/input_Migracin_W0027W0007INSERT'))

WebUI.setText(findTestObject('Object Repository/Page_Plan Comercial Vigencia/input_Fecha Inicial_W0024W0007W0009PLANCOME_a01ada'), 
    '27/02/2020')

WebUI.setText(findTestObject('Object Repository/Page_Plan Comercial Vigencia/input_Fecha Final_W0024W0007W0009PLANCOMERC_087235'), 
    '20/01/2030')

WebUI.setText(findTestObject('Object Repository/Page_Plan Comercial Vigencia/input_Nombre_W0024W0007W0009PLANCOMERCIALVI_a7f10b'), 
    'VIG')

WebUI.click(findTestObject('Object Repository/Page_Plan Comercial Vigencia/input_Nombre_W0024W0007W0009ENTER'))

