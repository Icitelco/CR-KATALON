<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>WS TIGOBO EVO3- awsclientesaldo</name>
   <tag></tag>
   <elementGuidId>cac4b4a3-849e-49bb-852f-cb2308b854c8</elementGuidId>
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
      <value>SIGABOaction/AWSCLIENTESALDO.Execute</value>
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
   <soapBody>&lt;soapenv:Envelope xmlns:soapenv=&quot;http://schemas.xmlsoap.org/soap/envelope/&quot; xmlns:siga=&quot;SIGA-BO&quot;>
   &lt;soapenv:Header/>
   &lt;soapenv:Body>
      &lt;siga:wsClienteSaldo.Execute>
         &lt;siga:Usuario>TOL&lt;/siga:Usuario>
         &lt;siga:Password>TOL&lt;/siga:Password>
         &lt;siga:Empresa>10&lt;/siga:Empresa>
         &lt;siga:Clientenro>5&lt;/siga:Clientenro>
      &lt;/siga:wsClienteSaldo.Execute>
   &lt;/soapenv:Body>
&lt;/soapenv:Envelope></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod>SOAP</soapRequestMethod>
   <soapServiceEndpoint>https://172.16.210.11:8443/SIGA-BO/servlet/awsclientesaldo</soapServiceEndpoint>
   <soapServiceFunction>Execute</soapServiceFunction>
   <useServiceInfoFromWsdl>false</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>6a1164a1-a25c-4a95-a886-59a24d173261</id>
      <masked>false</masked>
      <name>variable</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>c14f9b97-f09b-4431-873c-c33151b5b9c4</id>
      <masked>false</masked>
      <name>variable_0</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>c815504d-7ca2-461a-aa7d-7e60629cc969</id>
      <masked>false</masked>
      <name>variable_1</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>1246da7d-990f-48c1-b304-4b60b9a6bc44</id>
      <masked>false</masked>
      <name>variable_2</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>f48ff9c4-3652-49c6-9120-c670d738fad6</id>
      <masked>false</masked>
      <name>variable_3</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>6ed280e7-6b16-4e1b-86f0-8974cd5083a8</id>
      <masked>false</masked>
      <name>variable_4</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>b8172dba-32ae-458b-af18-cdc16df4fa93</id>
      <masked>false</masked>
      <name>variable_5</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>32e144f9-851a-4dea-b70d-c745d2d1d0cb</id>
      <masked>false</masked>
      <name>variable_6</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>e5997abb-06e3-4820-a5e7-fdfbe86892d8</id>
      <masked>false</masked>
      <name>variable_7</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>a68e055e-f2ab-4876-a56d-c56a6950b251</id>
      <masked>false</masked>
      <name>variable_8</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>73b8abca-d16c-45b4-96d5-be3c2cc8eb71</id>
      <masked>false</masked>
      <name>variable_9</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>4221e6d5-1a0b-4bff-9312-f3d0c3f4aaf8</id>
      <masked>false</masked>
      <name>variable_10</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()</verificationScript>
   <wsdlAddress>https://172.16.210.11:8443/SIGA-BO/servlet/awsclientesaldo?wsdl</wsdlAddress>
</WebServiceRequestEntity>
