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

    String[] lines = text.split("\n"); // Include trailing empty strings
    StringBuilder wrappedText = new StringBuilder();

    for (int i = 0; i < lines.length; i++) {
      if (!lines[i].isEmpty()) {
        wrappedText.append(opening).append(lines[i]).append(end);
      }
      if (i < lines.length - 1) { // Only append newline if not the last line
        wrappedText.append("\n");
      }
    }

    return wrappedText.toString();
  }
}