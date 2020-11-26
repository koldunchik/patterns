package ru.x5.patterns.structural.adapter;

public class JSON2XMLAdapter extends XMLDocument {
  private JSONDocument json;

  public JSON2XMLAdapter(JSONDocument json) {
    this.json = json;
  }

  @Override
  public String getXmlDocument() {
    return "json " + json.getJsonDocument() + " converted to XML";
  }
}
