package ru.x5.Patterns.Structural.Adapter;

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
