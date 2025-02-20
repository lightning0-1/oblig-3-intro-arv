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
    String[] lines = text.split("\n", -1); // Include trailing empty strings
    StringBuilder wrappedText = new StringBuilder();

    for (String line : lines) {
      if (!line.isEmpty()) {
        wrappedText.append(opening).append(line).append(end).append("\n");
      } else {
        wrappedText.append("\n");
      }
    }

    // Remove the last newline character if it exists
    if (wrappedText.length() > 0 && wrappedText.charAt(wrappedText.length() - 1) == '\n') {
      wrappedText.deleteCharAt(wrappedText.length() - 1);
    }

    return wrappedText.toString();
  }
}