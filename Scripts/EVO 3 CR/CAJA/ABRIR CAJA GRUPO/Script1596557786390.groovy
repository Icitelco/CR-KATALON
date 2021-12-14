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
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

mydate = new Date()

formattedDate = mydate.format('dd/MM/YYYY')

if (CustomKeywords.'CRPREP_VERIFICAR_EXISTE_COTIZACION.CRPREP_Cliente_Numero'(formattedDate) == null) {
    WebUI.callTestCase(findTestCase('EVO 3 CR/CAJA/CARGAR COTIZACION DEL DIA'), [:], FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.closeBrowser()

    WebUI.callTestCase(findTestCase('EVO 3 CR/LOGIN EVO 3 CR/LOGIN'), [:], FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.delay(5)

    'PANTALLA CAJA DIARIAS DE OFICINA\r\n'
    WebUI.navigateToUrl('http://10.7.148.132:8080/SIGA-TG/servlet/wwcajagrupodia')

	String CajaGrupoID=CustomKeywords.'CRPREP_NROMAX_CAJAGRUPOO.CRPREP_Cliente_Numero'()
	
    WebUI.selectOptionByValue(findTestObject('Object Repository/select_ALAJUELACALL CENTER SAC ESDIGITACION_e3fa0d'),CajaGrupoID, 
        true)

    WebUI.delay(6)

    WebUI.click(findTestObject('Page_Cajas Diarias de Oficina/input_Pgina 1 de 1_CREARCAJASDELDIA'))

    'SELECCIONAMOS LA CAJA'
    String CantCajas = CustomKeywords.'CRPERP_CANTIDAD_CAJAS_ALAJUELA.CRPREP_Cliente_Numero'()

    WebUI.switchToFrame(findTestObject('Object Repository/Page_Agendas/iframe_Crear Agenda_gxp0_ifrm'), 0)

    String dynamicId = 'vSEL_00'.concat(CantCajas)

    println(dynamicId)

    TestObject to = new TestObject('vSEL_0013')

    to.addProperty('xpath', ConditionType.EQUALS, 'id('.concat('\'').concat(dynamicId).concat('\'').concat(')'))

    if (WebUI.verifyElementClickable(to, FailureHandling.CONTINUE_ON_FAILURE)) {
        WebUI.click(to)

        WebUI.click(findTestObject('Object Repository/COSTA RICA/input_HASTA_BUTTON1'))

        WebUI.switchToDefaultContent()

        WebUI.click(findTestObject('Object Repository/Page_Cajas Diarias de Oficina/span_Creacin de caja de una Oficina_gxp0_cls'))

        'STS DE CAJA INGRESADA'
        WebUI.selectOptionByValue(findTestObject('Page_Cajas Diarias de Oficina/select_(Ninguno)INGRESADAABIERTACERRADA'), 
            'I', true)

        'FECHA DE HOY\r\n'
        WebUI.setText(findTestObject('Object Repository/Page_Cajas Diarias de Oficina/input_Desde Fecha_vFROMCAJAGRUPOFCH'), 
            formattedDate)

        'FECHA DE HOY'
        WebUI.setText(findTestObject('Object Repository/Page_Cajas Diarias de Oficina/input_Hasta Fecha_vTOCAJAGRUPOFCH'), 
            formattedDate)

        'INGRESAMOS VALORES DE APERTURA'
        WebUI.click(findTestObject('Page_Cajas Diarias de Oficina/a_Valores'))

        WebUI.click(findTestObject('Object Repository/Page_Caja Diaria de Oficina/input_Depsitos_W0029W0007INSERT'))

        'METODO DE PAGO (EFECTIVO)'
        WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Caja Grupo Dia Valor/select_AJUSTE CONVENIO AVALAJUSTE TARJETACH_f835a2'), 
            '1', true)

        'MONEDA (COLONES)'
        WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Caja Grupo Dia Valor/select_'), '1', true)

        'CONFIRMAMOS VALOR'
        WebUI.click(findTestObject('Object Repository/Page_Caja Grupo Dia Valor/input_Importe_W0024W0007W0009ENTER'))

        WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Caja Diaria de Oficina/input_Pgina 1 de 1_W0029W0007ABRIR'), 
            0)

        'ABRIMOS CAJA'
        WebUI.click(findTestObject('Object Repository/Page_Caja Diaria de Oficina/input_Pgina 1 de 1_W0029W0007ABRIR'))

        WebUI.click(findTestObject('Object Repository/Page_Caja Diaria de Oficina/input_Confirma abrir Caja_W0029W0007I_BUTTO_a888a8'))
    } //WebUI.click(findTestObject('Object Repository/COSTA RICA/input_ACTIVO_vSELECCIONADO_13'))
    else {
        println('Ya esta abierta la caja')
    }
} else {
    WebUI.callTestCase(findTestCase('EVO 3 CR/LOGIN EVO 3 CR/LOGIN'), [:], FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.delay(5)

    'PANTALLA CAJA DIARIAS DE OFICINA\r\n'
    WebUI.navigateToUrl('http://10.7.148.132:8080/SIGA-TG/servlet/wwcajagrupodia')

    String CajaGrupoID=CustomKeywords.'CRPREP_NROMAX_CAJAGRUPOO.CRPREP_Cliente_Numero'()
	
    WebUI.selectOptionByValue(findTestObject('Object Repository/select_ALAJUELACALL CENTER SAC ESDIGITACION_e3fa0d'),CajaGrupoID, 
        true)

    WebUI.delay(6)

    WebUI.click(findTestObject('Page_Cajas Diarias de Oficina/input_Pgina 1 de 1_CREARCAJASDELDIA'))

    'SELECCIONAMOS LA CAJA'
    String CantCajas = CustomKeywords.'CRPERP_CANTIDAD_CAJAS_ALAJUELA.CRPREP_Cliente_Numero'()

    WebUI.switchToFrame(findTestObject('Object Repository/Page_Agendas/iframe_Crear Agenda_gxp0_ifrm'), 0)

    String dynamicId = 'vSEL_00'.concat(CantCajas)

    println(dynamicId)

    TestObject to = new TestObject('vSEL_0013')

    to.addProperty('xpath', ConditionType.EQUALS, 'id('.concat('\'').concat(dynamicId).concat('\'').concat(')'))

    if (WebUI.verifyElementClickable(to, FailureHandling.CONTINUE_ON_FAILURE)) {
        WebUI.click(to)

        WebUI.click(findTestObject('Object Repository/COSTA RICA/input_HASTA_BUTTON1'))

        WebUI.switchToDefaultContent()

        WebUI.click(findTestObject('Object Repository/Page_Cajas Diarias de Oficina/span_Creacin de caja de una Oficina_gxp0_cls'))

        'STS DE CAJA INGRESADA'
        WebUI.selectOptionByValue(findTestObject('Page_Cajas Diarias de Oficina/select_(Ninguno)INGRESADAABIERTACERRADA'), 
            'I', true)

        'FECHA DE HOY\r\n'
        WebUI.setText(findTestObject('Object Repository/Page_Cajas Diarias de Oficina/input_Desde Fecha_vFROMCAJAGRUPOFCH'), 
            formattedDate)

        'FECHA DE HOY'
        WebUI.setText(findTestObject('Object Repository/Page_Cajas Diarias de Oficina/input_Hasta Fecha_vTOCAJAGRUPOFCH'), 
            formattedDate)

        WebUI.delay(5)

        'INGRESAMOS VALORES DE APERTURA'
        WebUI.click(findTestObject('Page_Cajas Diarias de Oficina/a_Valores'))

        WebUI.click(findTestObject('Object Repository/Page_Caja Diaria de Oficina/input_Depsitos_W0029W0007INSERT'))

        'METODO DE PAGO (EFECTIVO)'
        WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Caja Grupo Dia Valor/select_AJUSTE CONVENIO AVALAJUSTE TARJETACH_f835a2'), 
            '1', true)

        'MONEDA (COLONES)'
        WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Caja Grupo Dia Valor/select_'), '1', true)

        'CONFIRMAMOS VALOR'
        WebUI.click(findTestObject('Object Repository/Page_Caja Grupo Dia Valor/input_Importe_W0024W0007W0009ENTER'))

        WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Caja Diaria de Oficina/input_Pgina 1 de 1_W0029W0007ABRIR'), 
            0)

        'ABRIMOS CAJA'
        WebUI.click(findTestObject('Object Repository/Page_Caja Diaria de Oficina/input_Pgina 1 de 1_W0029W0007ABRIR'))

        WebUI.click(findTestObject('Object Repository/Page_Caja Diaria de Oficina/input_Confirma abrir Caja_W0029W0007I_BUTTO_a888a8'))
    } else {
        println('Ya esta abierta la caja')
    }
}

