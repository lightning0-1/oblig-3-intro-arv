package edu.ntnu.idatx2003.capitalize;

public class CapitalizeWordsTextCommand extends CapitalizeTextCommand {

  @Override
  public String execute(String text) {
    String[] words = text.split(" ");
    StringBuilder capitalizedText = new StringBuilder();
    for (String word : words) {
      capitalizedText.append(Character.toUpperCase(word.charAt(0)))
              .append(word.substring(1)).append(" ");
    }
    return capitalizedText.toString().trim();
  }
}