import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.sql.Connection as Connection
import java.sql.ResultSet as ResultSet
import java.sql.Statement as Statement
import java.lang.Boolean as Boolean
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
import oracle.jdbc.driver.OracleResultSet.ResultSetType as ResultSetType
import com.katalon.plugin.keyword.connection.ResultSetKeywords as ResultSetKeywords

Connection connection = null

connection = CustomKeywords.'com.katalon.plugin.keyword.connection.DatabaseKeywords.createConnection'(com.katalon.plugin.keyword.connection.DBType.oracle, 
    '10.45.160.30', '1521', 'SIGAPREP', 'SIGATG', 'U0lHQVRH')

connection.setAutoCommit(false)

//Obtener dato de BD
ResultSet rs

String query = 'SELECT MAX(CLIENTENRO) FROM SIGATG.CLIENTE WHERE CLIENTESTS=\'C\''

rs = CustomKeywords.'com.katalon.plugin.keyword.connection.DatabaseKeywords.executeQuery'(connection, query)

String prueba

while (rs.next()) {
    println(rs.getString(1))

    prueba = rs.getString(1)
}

CustomKeywords.'com.katalon.plugin.keyword.connection.DatabaseKeywords.closeConnection'(connection)

//ejecutar update
String query1 = 'UPDATE SIGATG.CLIENTE SET CLIENTENOM=\'PRUEBAjeje\' WHERE CLIENTENRO=2'

CustomKeywords.'com.katalon.plugin.keyword.connection.DatabaseKeywords.execute'(connection, query1)

