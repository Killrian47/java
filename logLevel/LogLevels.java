package logLevel;

public class LogLevels {

  public static String message(String logLine) {
    return logLine.split(":")[1].trim();
  }

  public static String logLevel(String logLine) {
    return logLine.split(":")[0].replaceAll("\\W", "").toLowerCase();
  }

  public static String reformat(String logLine) {
    return message(logLine) + " (" + logLevel(logLine) + ")";
  }
}