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

public class CRPRERP_CONTRATO_DE_CLIENTE_CON_TEMPORAL {
	@Keyword
	def CRPREP_Cliente_Numero(String Clientenro){
		Connection connection= null;
		connection = CustomKeywords.'com.katalon.plugin.keyword.connection.DatabaseKeywords.createConnection'(com.katalon.plugin.keyword.connection.DBType.oracle,
				'10.45.160.30', '1521', 'SIGAPREP','SIGATG', 'U0lHQVRH')
		connection.setAutoCommit(false)

		ResultSet rs;

		String query="SELECT CONTRATONRO FROM SIGATG.CONTRATO WHERE CLIENTENRO=".concat(Clientenro).concat("AND PRODUCTOID IN (SELECT PRODUCTOID FROM SIGATG.PRODUCTOPRODUCTOTEMPORAL WHERE PRODUCTOPRDTEMPORALID IN (SELECT MAX(PRODUCTOTEMPORALID) FROM SIGATG.PRODUCTOTEMPORAL))")

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
