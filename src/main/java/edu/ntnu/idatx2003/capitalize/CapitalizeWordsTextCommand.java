package edu.ntnu.idatx2003.capitalize;

public class CapitalizeWordsTextCommand extends CapitalizeTextCommand {

  @Override
  public String execute(String text) {
    if (text == null) {
      throw new IllegalArgumentException("Text cannot be null");
    }
    String[] words = text.split(" ");
    StringBuilder capitalizedText = new StringBuilder();
    for (String word : words) {
      if (!word.isEmpty()) {
        capitalizedText.append(Character.toUpperCase(word.charAt(0)))
                .append(word.substring(1).toLowerCase()).append(" ");
      }
    }
    return capitalizedText.toString().trim();
  }
}