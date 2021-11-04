package com.example.demo.XMLParser;


import com.example.demo.models.Car;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import javax.xml.xpath.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Parser {

    public static List<Car> parsebyproductionYear(String productionYear) throws XPathExpressionException, FileNotFoundException {

        XPathFactory factory = XPathFactory.newInstance();

        XPath xPath = factory.newXPath();

        XPathExpression xPathExpression = xPath.compile("//car[production-year='" + productionYear + "']");

        File xmlDoc = new File("C:\\cars.xml");
        InputSource inputSource = new InputSource(new FileInputStream(xmlDoc));

        Object result = xPathExpression.evaluate(inputSource, XPathConstants.NODESET);

        NodeList nodeList = (NodeList) result;

        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);

            if (node.getNodeType() == Node.ELEMENT_NODE){
                Element element = (Element) node;
                Car car = new Car();

                car.setManufacturer(element.getElementsByTagName("manufacturer").item(0).getTextContent());
                car.setModel(element.getElementsByTagName("model").item(0).getTextContent());
                car.setProductionYear((element.getElementsByTagName("production-year").item(0).getTextContent()));
                car.setHorsepower((element.getElementsByTagName("horsepower").item(0).getTextContent()));
                car.setPrice((element.getElementsByTagName("price").item(0).getTextContent()));
                car.setConsumption(element.getElementsByTagName("consumption").item(0).getTextContent());
                car.setConsumptionType(String.valueOf(element.getElementsByTagName("consumption").item(0).getAttributes().getNamedItem("type").getTextContent()));

                cars.add(car);

            }
        }



        return cars;

    }
    public static List<Car> parseByManufacturer(String manufacturer ) throws XPathExpressionException, FileNotFoundException {

        XPathFactory factory2 = XPathFactory.newInstance();

        XPath xPath = factory2.newXPath();

        XPathExpression xPathExpression = xPath.compile("/cars/car[manufacturer='" + manufacturer + "']");

        File xmlDoc = new File("C:\\cars.xml");
        InputSource inputSource = new InputSource(new FileInputStream(xmlDoc));

        Object result = xPathExpression.evaluate(inputSource, XPathConstants.NODESET);

        NodeList nodeList = (NodeList) result;
        List<Car> cars = new ArrayList<>();


        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);

            if (node.getNodeType() == Node.ELEMENT_NODE){
                Element element = (Element) node;
                Car car = new Car();

                car.setManufacturer(element.getElementsByTagName("manufacturer").item(0).getTextContent());
                car.setModel(element.getElementsByTagName("model").item(0).getTextContent());
                car.setProductionYear((element.getElementsByTagName("production-year").item(0).getTextContent()));
                car.setHorsepower((element.getElementsByTagName("horsepower").item(0).getTextContent()));
                car.setPrice((element.getElementsByTagName("price").item(0).getTextContent()));
                car.setConsumption(element.getElementsByTagName("consumption").item(0).getTextContent());
                car.setConsumptionType(String.valueOf(element.getElementsByTagName("consumption").item(0).getAttributes().getNamedItem("type").getTextContent()));

                cars.add(car);

            }
        }
        return cars;
    }

    public static List<Car> parseByConsumptionType(String consumptionType, String consumption) throws FileNotFoundException, XPathExpressionException {

        XPathFactory factory3 = XPathFactory.newInstance();

        XPath xPath = factory3.newXPath();

        XPathExpression xPathExpression = xPath.compile("//*[consumption/@type = '"+ consumptionType +"' and consumption = '"+ consumption+"']  ");

        File xmlDoc = new File("C:\\cars.xml");
        InputSource inputSource = new InputSource(new FileInputStream(xmlDoc));

        Object result = xPathExpression.evaluate(inputSource, XPathConstants.NODESET);

        NodeList nodeList = (NodeList) result;

        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);

            if (node.getNodeType() == Node.ELEMENT_NODE){
                Element element = (Element) node;
                Car car = new Car();

                car.setManufacturer(element.getElementsByTagName("manufacturer").item(0).getTextContent());
                car.setModel(element.getElementsByTagName("model").item(0).getTextContent());
                car.setProductionYear((element.getElementsByTagName("production-year").item(0).getTextContent()));
                car.setHorsepower((element.getElementsByTagName("horsepower").item(0).getTextContent()));
                car.setPrice((element.getElementsByTagName("price").item(0).getTextContent()));
                car.setConsumption(element.getElementsByTagName("consumption").item(0).getTextContent());
                car.setConsumptionType(String.valueOf(element.getElementsByTagName("consumption").item(0).getAttributes().getNamedItem("type").getTextContent()));

                cars.add(car);

            }
        }

        return cars;

    }

}
