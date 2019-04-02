package pl.opitz.consulting.caseweek.model;

import java.math.BigDecimal;

public class RectangleTaskRequest extends TaskRequest {

  private BigDecimal length;
  private BigDecimal width;

  public RectangleTaskRequest() {
    setTask(Task.RECTANGLE_FIELD);
  }

  public RectangleTaskRequest(BigDecimal length, BigDecimal width) {
    this();
    this.length = length;
    this.width = width;
  }

  public BigDecimal getLength() {
    return length;
  }

  public void setLength(BigDecimal length) {
    this.length = length;
  }

  public BigDecimal getWidth() {
    return width;
  }

  public void setWidth(BigDecimal width) {
    this.width = width;
  }
}
