package ru.x5.patterns.behavioral.visitor;

public class XMLVisitor implements Visitor {

  public String export(Shape... shapes){
    StringBuilder sb = new StringBuilder();
    sb.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>" + "\n");
    sb.append("<parent>\n");
    for (Shape shape : shapes) {
      sb.append(shape.accept(this)).append("\n");
    }
    sb.append("</parent>");
    return sb.toString();
  }

  @Override
  public String visitCircle(Circle circle) {
    return "<circle>" + "\n" +
        "    <name>" + circle.getName() + "</name>" + "\n" +
        "    <square>" + circle.getSquare() + "</square>" + "\n" +
        "</circle>";
  }

  @Override
  public String visitTriangle(Triangle triangle) {
    return "<triangle>" + "\n" +
        "    <name>" + triangle.getName() + "</name>" + "\n" +
        "    <square>" + triangle.getSquare() + "</square>" + "\n" +
        "</triangle>";
  }

  @Override
  public String visitRectangle(Rectangle reactangle) {
    return "<reactangle>" + "\n" +
        "    <name>" + reactangle.getName() + "</name>" + "\n" +
        "    <square>" + reactangle.getSquare() + "</square>" + "\n" +
        "</reactangle>";
  }
}
