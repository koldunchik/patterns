package ru.x5.patterns.structural.adapter;

public class Main {
  public static void main(String[] args) {
    XMLDocument xml = new XMLDocument();
    xml.setXmlDocument("<xml><item>1</item></xml>");

    XMLDocumentReader xmlDocumentReader = new XMLDocumentReader();

    xmlDocumentReader.read(xml);

    JSONDocument json = new JSONDocument();
    json.setJsonDocument("{item:2}");

    JSON2XMLAdapter adapter = new JSON2XMLAdapter(json);

    xmlDocumentReader.read(adapter);
  }
}
