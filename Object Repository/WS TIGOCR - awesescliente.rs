<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>WS TIGOCR - awesescliente</name>
   <tag></tag>
   <elementGuidId>6fd5ddc9-2c62-40c2-84df-2b675c06871c</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent></httpBodyContent>
   <httpBodyType></httpBodyType>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>SOAPAction</name>
      <type>Main</type>
      <value>SIGA-TGaction/AWSESCLIENTE.Execute</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>text/xml; charset=utf-8</value>
   </httpHeaderProperties>
   <katalonVersion>7.5.5</katalonVersion>
   <restRequestMethod></restRequestMethod>
   <restUrl></restUrl>
   <serviceType>SOAP</serviceType>
   <soapBody>&lt;soapenv:Envelope xmlns:soapenv=&quot;http://schemas.xmlsoap.org/soap/envelope/&quot; xmlns:siga=&quot;SIGA-TG&quot;>
   &lt;soapenv:Header/>
   &lt;soapenv:Body>
      &lt;siga:wsEsCliente.Execute>
         &lt;siga:Usuario>ICITELCO&lt;/siga:Usuario> 
         &lt;siga:Password>ici&lt;/siga:Password>
         &lt;siga:Empresa>10&lt;/siga:Empresa>
         &lt;siga:Campo>CLI&lt;/siga:Campo>
         &lt;siga:Valor>${Valor}&lt;/siga:Valor> 
      &lt;/siga:wsEsCliente.Execute>
   &lt;/soapenv:Body>
&lt;/soapenv:Envelope></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod>SOAP</soapRequestMethod>
   <soapServiceEndpoint>http://10.7.148.132/SIGA-WS-TG/servlet/awsescliente</soapServiceEndpoint>
   <soapServiceFunction>Execute</soapServiceFunction>
   <useServiceInfoFromWsdl>false</useServiceInfoFromWsdl>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import java.sql.Connection
import java.sql.ResultSet

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()

Connection connection= null;
connection = CustomKeywords.'com.katalon.plugin.keyword.connection.DatabaseKeywords.createConnection'(com.katalon.plugin.keyword.connection.DBType.oracle,
	'10.45.160.30', '1521', 'SIGAPREP','SIGATG', 'U0lHQVRH')
connection.setAutoCommit(false)

//Obtener dato de BD
ResultSet rs;

String query='SELECT MAX(CLIENTENRO) FROM SIGATG.CLIENTE'


rs=CustomKeywords.'com.katalon.plugin.keyword.connection.DatabaseKeywords.executeQuery'(connection,query)

String prueba;

while (rs.next()) {
	println(rs.getString(1));
	$variable=rs.getString(1);
}
CustomKeywords.'com.katalon.plugin.keyword.connection.DatabaseKeywords.closeConnection'(connection)
 


</verificationScript>
   <wsdlAddress>http://10.7.148.132/SIGA-WS-TG/servlet/awsescliente?wsdl</wsdlAddress>
</WebServiceRequestEntity>
