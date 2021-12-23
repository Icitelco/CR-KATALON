import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import java.sql.Connection
import java.sql.ResultSet

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class CRPRERP_CLIENTE_SIN_ORDEN_RECLAMO_PENDIENTE {
	@Keyword
	def CRPREP_Cliente_Numero(){
		Connection connection= null;
		connection = CustomKeywords.'com.katalon.plugin.keyword.connection.DatabaseKeywords.createConnection'(com.katalon.plugin.keyword.connection.DBType.oracle,
				'10.45.160.30', '1521', 'SIGAPREP','SIGATG', 'U0lHQVRH')
		connection.setAutoCommit(false)

		ResultSet rs;

		String query="SELECT TRIM(MAX(CLIENTENRO)) FROM CONTRATO CO WHERE PRODUCTOID=3007 AND CONTRATOSTS='C' AND CLIENTENRO IN (SELECT CLIENTENRO FROM CLIENTE WHERE SUCURSALID=8 AND CLIENTESTS<>'X' AND NEGOCIOSEGMENTO=1) AND CLIENTENRO NOT IN (SELECT CLIENTENROORD FROM ORDENSRV ORD WHERE ORDENSTS IN('I','P','A') AND ORDENTPO='R')"

		rs=CustomKeywords.'com.katalon.plugin.keyword.connection.DatabaseKeywords.executeQuery'(connection,query)

		String prueba;

		while (rs.next()) {
			println(rs.getString(1));
			prueba=rs.getString(1);
		}
		CustomKeywords.'com.katalon.plugin.keyword.connection.DatabaseKeywords.closeConnection'(connection)

		return prueba;
	}
}
