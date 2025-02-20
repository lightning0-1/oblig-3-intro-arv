package edu.ntnu.idatx2003.wrap;

public class WrapLinesTextCommand extends WrapTextCommand {

  public WrapLinesTextCommand(String opening, String end) {
    super(opening, end);
  }

  @Override
  public String execute(String text) {
    if (text == null) {
      throw new IllegalArgumentException("Text cannot be null");
    }
    if (text.isEmpty()) {
      return "";
    }
    String[] lines = text.split("\n");
    StringBuilder wrappedText = new StringBuilder();

    for (String line : lines) {
      if (!line.isEmpty()) {
        wrappedText.append(opening).append(line).append(end).append(" ");
      }
    }

    if (wrappedText.length() > 0) {
      wrappedText.deleteCharAt(wrappedText.length() - 1);
    }

    return wrappedText.toString();
  }
}