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
import oracle.jdbc.driver.OracleConnection as OracleConnection
import java.lang.String as String
import java.sql.Connection as Connection

WebUI.openBrowser('')

WebUI.navigateToUrl('https://192.168.1.115/SIGA-MSA-BO/servlet/login')

//Connection connection = null
//connection = CustomKeywords.'com.katalon.plugin.keyword.connection.DatabaseKeywords.createConnection'(com.katalon.plugin.keyword.connection.DBType.oracle, '192.168.1.220', '1521', 'ICI',
//'SIGABO', 'U0lHQUJP')
WebUI.setText(findTestObject('Object Repository/Page_Login/input_Usuario_vUSUARIO'), 'ADMIN')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_Contrasea_vPASSWORD'), 'XmnPW7mE0VA=')

WebUI.sendKeys(findTestObject('Object Repository/Page_Login/input_Contrasea_vPASSWORD'), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Elegir Aplicacin/div_Gestin de clientes CATV'))

