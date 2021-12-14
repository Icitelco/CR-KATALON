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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('EVO 3 CR/LOGIN EVO 3 CR/LOGIN'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.navigateToUrl('http://10.7.148.132:8080/SIGA-TG/servlet/wwflflujo')

WebUI.click(findTestObject('Object Repository/Page_Flujos de Procesos/input_Flujos de Procesos_INSERT'))

String Nombre = RandomStringUtils.randomAlphabetic(20)

WebUI.setText(findTestObject('Object Repository/Page_Flujo de Proceso/input_Nombre_W0027W0007W0009FLFLUJONOMBRE'), Nombre)

WebUI.setText(findTestObject('Object Repository/Page_Flujo de Proceso/input_Descripcion_W0027W0007W0009FLFLUJODES_573505'), 
    'prueba')

WebUI.setText(findTestObject('Object Repository/Page_Flujo de Proceso/input_Actualizar Obs_W0027W0007W0009FLFLUJO_699692'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_Flujo de Proceso/input_Actualizar Obs_W0027W0007W0009FLFLUJO_a31f03'), 
    'PRUEBA')

WebUI.click(findTestObject('Object Repository/Page_Flujo de Proceso/span_Nueva fila'))

WebUI.setText(findTestObject('Object Repository/Page_Flujo de Proceso/input_Actualizar Obs_W0027W0007W0009FLFLUJO_68ac6f'), 
    '2')

WebUI.setText(findTestObject('Object Repository/Page_Flujo de Proceso/input_Actualizar Obs_W0027W0007W0009FLFLUJO_6bafaa'), 
    'PRUEBA 2')

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_Flujo de Proceso/input_Nueva fila_W0027W0007W0009ENTER'))

WebUI.setText(findTestObject('Object Repository/Page_Flujos de Procesos/input_Nombre_vFLFLUJONOMBRE'), Nombre)

WebUI.click(findTestObject('Object Repository/Page_Flujos de Procesos/input_Nombre_SEARCHBUTTON'))

WebUI.click(findTestObject('Object Repository/Page_Flujos de Procesos/img_Descripcion_vDISPLAY_0001'))

WebUI.delay(5)

String URL = WebUI.getUrl()

String FormularioID = CustomKeywords.'CRPRERP_FORMULARIO_WRFLW.CRPREP_Cliente_Numero'()

String FormularioVersion = CustomKeywords.'CRPRERP_FORMULARIO_WRFLW_VERSION.CRPREP_Cliente_Numero'(FormularioID)

WebUI.click(findTestObject('Object Repository/Page_Flujo de Proceso/span_Formularios'))

WebUI.click(findTestObject('Object Repository/Page_Flujo de Proceso/input_Opciones Extras_W0027W0007INSERT'))

WebUI.setText(findTestObject('Object Repository/Page_FLFlujo Formulario/input_FLFormulario Id_W0022W0007W0009FLFORM_008041'), 
    FormularioID)

WebUI.setText(findTestObject('Object Repository/Page_FLFlujo Formulario/input_FLFormulario Id_W0022W0007W0009FLFORM_b8ed76'), 
    FormularioVersion)

WebUI.click(findTestObject('Page_Flujo de Proceso/input_Nueva fila_W0027W0007W0009ENTER'))

WebUI.delay(5)

WebUI.navigateToUrl(URL)

WebUI.delay(10)

//WebUI.click(findTestObject('Object Repository/Page_Flujo de Proceso/span_General'))
WebUI.click(findTestObject('Object Repository/Page_Flujo de Proceso/input_Actualizar Obs_W0027W0007W0009vDETALLES_0001'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_PRUEBA/input_FLFlujo Etapa Ar Accion_W0027W0007UPDATE'))

WebUI.click(findTestObject('Object Repository/Page_PRUEBA/span_Nueva fila'))

WebUI.click(findTestObject('Object Repository/Page_PRUEBA/input_Orden Mostrar_W0027W0007W0009FLFORMUL_6b90e1'))

WebUI.setText(findTestObject('Object Repository/Page_PRUEBA/input_Orden Mostrar_W0027W0007W0009FLFORMUL_6b90e1'), FormularioID)

WebUI.setText(findTestObject('Object Repository/Page_PRUEBA/input_Orden Mostrar_W0027W0007W0009FLFORMUL_eeda43'), FormularioVersion)

WebUI.click(findTestObject('Object Repository/Page_PRUEBA/input_Nueva fila_W0027W0007W0009ENTER'))

WebUI.delay(10)

WebUI.navigateToUrl(URL)

WebUI.click(findTestObject('Object Repository/Page_Flujo de Proceso/span_Archivos'))

WebUI.waitForElementPresent(findTestObject('Page_Flujo de Proceso/input_Opciones Extras_W0027W0007INSERT'), 30)

WebUI.delay(5)

WebUI.click(findTestObject('Page_Flujo de Proceso/input_Opciones Extras_W0027W0007INSERT'))

WebUI.setText(findTestObject('Object Repository/Page_FLFlujo Archivo/input_Archivo Nombre_W0027W0007W0009FLFLUJO_98a431'), 
    'Archivo Prueba')

WebUI.click(findTestObject('Object Repository/Page_FLFlujo Archivo/input_Carpeta_W0027W0007W0009ENTER'))

WebUI.click(findTestObject('Object Repository/Page_Flujo de Proceso/span_Etapas Derivadas'))

WebUI.waitForElementPresent(findTestObject('Page_Flujo de Proceso/input_Opciones Extras_W0027W0007INSERT'), 30)

WebUI.delay(5)

WebUI.click(findTestObject('Page_Flujo de Proceso/input_Opciones Extras_W0027W0007INSERT'))

WebUI.setText(findTestObject('Object Repository/Page_FLFlujo Etapa Ciclo Cerrado/input_Desde etapa_W0027W0007W0009FLFLUJOETA_b2898e'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Page_FLFlujo Etapa Ciclo Cerrado/input_Derivada Nombre_W0027W0007W0009FLFLUJ_b55f4a'), 
    '2')

WebUI.setText(findTestObject('Object Repository/Page_FLFlujo Etapa Ciclo Cerrado/input_Reversa Nombre_W0027W0007W0009FLFLUJO_96a861'), 
    '1')

WebUI.click(findTestObject('Object Repository/Page_FLFlujo Etapa Ciclo Cerrado/input_Nueva fila_W0027W0007W0009ENTER'))

WebUI.click(findTestObject('Object Repository/Page_Flujo de Proceso/span_Etapas Condicionadas'))

WebUI.waitForElementPresent(findTestObject('Page_Flujo de Proceso/input_Opciones Extras_W0027W0007INSERT'), 30)

WebUI.delay(5)

WebUI.click(findTestObject('Page_Flujo de Proceso/input_Opciones Extras_W0027W0007INSERT'))

WebUI.setText(findTestObject('Object Repository/Page_FLEtapa Condicionada (pasajes automaticos)/input_Etapa inicio_W0027W0007W0009FLFLUJOETAPAID'), 
    '1')

WebUI.click(findTestObject('Object Repository/Page_FLEtapa Condicionada (pasajes automaticos)/input_Destino_W0027W0007W0009FLETAPACONDICI_d09511'))

WebUI.click(findTestObject('Object Repository/Page_FLEtapa Condicionada (pasajes automaticos)/input_Valor_W0027W0007W0009FLFORMULARIOID_0001'))

WebUI.setText(findTestObject('Object Repository/Page_FLEtapa Condicionada (pasajes automaticos)/input_Destino_W0027W0007W0009FLETAPACONDICI_d09511'), 
    '2')

WebUI.setText(findTestObject('Object Repository/Page_FLEtapa Condicionada (pasajes automaticos)/input_Valor_W0027W0007W0009FLFORMULARIOID_0001'), 
    FormularioID)

WebUI.setText(findTestObject('Object Repository/Page_FLEtapa Condicionada (pasajes automaticos)/input_Valor_W0027W0007W0009FLFORMULARIOVERS_6f5b13'), 
    FormularioVersion)

WebUI.delay(5)

WebUI.click(findTestObject('Page_Flujo de Proceso/input_Nueva fila_W0027W0007W0009ENTER'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_Flujo de Proceso/span_Etapas Dependencias'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Caja/input_Puntos de Venta_W0027W0007INSERT'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Dependencias de Etapas/select_(Ninguno)INGRESADOEN PROCESOPENDIENT_b8fcf9'), 
    'E', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Dependencias de Etapas/select_(Ninguno)INGRESADOEN PROCESOPENDIENT_b8fcf9_1'), 
    'E', true)

WebUI.click(findTestObject('Object Repository/Page_Dependencias de Etapas/span_Nueva fila'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Dependencias de Etapas/select_PRUEBAPRUEBA 2'), '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Dependencias de Etapas/select_(Ninguno)INGRESADOEN PROCESOPENDIENT_b8fcf9_1_2'), 
    'P', true)

WebUI.click(findTestObject('Object Repository/Page_Dependencias de Etapas/input_Nueva fila_W0024W0007W0009ENTER'))

WebUI.click(findTestObject('Object Repository/Page_Flujo de Proceso/span_Acciones al Comienzo y Final del Flujo'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Caja/input_Puntos de Venta_W0027W0007INSERT'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Acciones al Comienzo y al Final del Flujo/select_ACTUALIZAR MONTOS DE INSTALACION Y P_882252'), 
    'AVANZAR_GESTION', true)

WebUI.click(findTestObject('Object Repository/Page_Acciones al Comienzo y al Final del Flujo/input_Activo_W0027W0007W0009FLFLUJOPROGRAMAACTIVO'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Acciones al Comienzo y al Final del Flujo/select_MANUAL UNA VEZMANUAL SIEMPREAUTOMATI_95ba4a'), 
    'A', true)

WebUI.click(findTestObject('Object Repository/Page_Acciones al Comienzo y al Final del Flujo/input_Ejecucion_W0027W0007W0009ENTER'))

