import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class Parser {

	
	public Parser(){
		parseXmlFile("foo");
	}
	
	public Document parseXmlFile(String path){
		//get the factory
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		Document dom;
		try {

			//Using factory get an instance of document builder
			DocumentBuilder db = dbf.newDocumentBuilder();

			//parse using builder to get DOM representation of the XML file
			dom = db.parse("res/XML/rules.xml");
			return dom;

		}catch(ParserConfigurationException pce) {
			pce.printStackTrace();
			return null;
		}catch(SAXException se) {
			se.printStackTrace();
			return null;
		}catch(IOException ioe) {
			ioe.printStackTrace();
			return null;
		}

	}
	public ArrayList parseRulesXML(Document dom){
		ArrayList ruleList = new ArrayList();
		//get the root element
		Element docEle = dom.getDocumentElement();

		//get a nodelist of elements
		
		NodeList nl = docEle.getElementsByTagName("Employee");
		if(nl != null && nl.getLength() > 0) {
			for(int i = 0 ; i < nl.getLength();i++) {

				//get the employee element
				Element el = (Element)nl.item(i);

				//get the Employee object
				//Employee e = getEmployee(el);

				//add it to list
				//myEmpls.add(e);
			}
		}
		return ruleList;
	}
}
