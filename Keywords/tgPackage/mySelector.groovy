package tgPackage

import com.kms.katalon.core.testobject.TestObject

import java.lang.reflect.Array
import java.sql.Connection
import java.sql.ResultSet

import org.openqa.selenium.WebElement

import com.kms.katalon.core.testobject.ConditionType


class mySelector {
	def getClienteNumero(String a){
		Connection connection= null;
		connection = CustomKeywords.'com.katalon.plugin.keyword.connection.DatabaseKeywords.createConnection'(com.katalon.plugin.keyword.connection.DBType.oracle,
				'10.45.160.30', '1521', 'SIGAPREP','SIGATG', 'U0lHQVRH')
		connection.setAutoCommit(false)

		ResultSet rs;

		String query='SELECT MAX(CLIENTENRO) FROM SIGATG.CLIENTE'

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


