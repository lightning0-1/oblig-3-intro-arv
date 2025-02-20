package edu.ntnu.idatx2003.wrap;

import edu.ntnu.idatx2003.TextCommand;

public abstract class WrapTextCommand implements TextCommand {
  protected String opening;
  protected String end;

  public WrapTextCommand(String opening, String end) {
    this.opening = opening;
    this.end = end;
  }

  public String getOpening() {
    return opening;
  }

  public String getEnd() {
    return end;
  }

  @Override
  public abstract String execute(String text);
}