package pl.opitz.consulting.caseweek.model;

import java.math.BigDecimal;
import java.util.Objects;

public class RectangleTaskResponse extends TaskResponse {

  private BigDecimal field;

  public RectangleTaskResponse() {
    setTask(Task.RECTANGLE_FIELD);
  }

  public RectangleTaskResponse(BigDecimal field) {
    this();
    this.field = field;
  }

  public BigDecimal getField() {
    return field;
  }

  public void setField(BigDecimal field) {
    this.field = field;
  }
}
