import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import java.sql.Connection
import oracle.jdbc.driver.OracleConnection as OracleConnection
import java.lang.String as String
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

WebUI.callTestCase(findTestCase('EVO 3 BOLIVIA/LOGIN EVO 3'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.navigateToUrl('http://192.168.1.115:8080/SIGA-BO/servlet/wwcliente')

WebUI.setText(findTestObject('Object Repository/Page_Clientes/input_Nombre_vCLIENTENOM'), 'PREVENTA')

WebUI.setText(findTestObject('Page_Clientes/input_Apellido_vCLIENTEAPE'), 'PRUEBA')

String a=WebUI.getText(findTestObject('Page_Clientes/input_Nombre_vCLIENTENOM'))

Connection connection = null

connection = CustomKeywords.'com.katalon.plugin.keyword.connection.DatabaseKeywords.createConnection'(com.katalon.plugin.keyword.connection.DBType.oracle, '192.168.1.220', '1521', 'ICI',
'SIGABO', 'U0lHQUJP')

connection.setAutoCommit(false)

String Query ='UPDATE SIGABO.CLIENTE SET CLIENTENOM='.concat('\'').concat('ANDAOK').concat('\'').concat('WHERE CLIENTENOM=').concat('\'').concat(a).concat('\'')

println(Query)

CustomKeywords.'com.katalon.plugin.keyword.connection.DatabaseKeywords.execute'(connection, Query)

WebUI.delay(5)

connection.commit();

CustomKeywords.'com.katalon.plugin.keyword.connection.DatabaseKeywords.closeConnection'(connection)

WebUI.click(findTestObject('Object Repository/Page_Clientes/input_Status_SEARCHBUTTON'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_Clientes/img_Cantidad facturas_vDISPLAY_0001'))

