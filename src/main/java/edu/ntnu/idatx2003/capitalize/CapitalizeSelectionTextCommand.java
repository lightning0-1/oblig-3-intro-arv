package edu.ntnu.idatx2003.capitalize;

public class CapitalizeSelectionTextCommand extends CapitalizeTextCommand {
  private String selection;

  public CapitalizeSelectionTextCommand(String selection) {
    this.selection = selection;
  }

  public String getSelection() {
    return selection;
  }

  @Override
  public String execute(String text) {
    if (text == null || selection == null) {
      throw new IllegalArgumentException("Text and selection cannot be null");
    }
    if (selection.isEmpty()) {
      return text;
    }
    return text.replace(selection, selection.toUpperCase());
  }
}