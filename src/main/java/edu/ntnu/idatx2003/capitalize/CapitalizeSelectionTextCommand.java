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
    String[] words = selection.split(" ");
    StringBuilder capitalizedSelection = new StringBuilder();
    for (String word : words) {
      if (!word.isEmpty()) {
        capitalizedSelection.append(Character.toUpperCase(word.charAt(0)))
                .append(word.substring(1).toLowerCase()).append(" ");
      }
    }
    String capitalizedText = capitalizedSelection.toString().trim();
    return text.replace(selection, capitalizedText);
  }
}