import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Input {

  public static String readContentFromFile(String path) {
    String res = "";
    try {
      List<String> lines = Files.readAllLines(Paths.get(path));
      for (String line : lines) {
        res += line;
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return res;
  }

  public static void writeContentToFile(String s, String path) {
    try {
      Files.write(Paths.get(path), s.getBytes());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void writeLastToFile(String s, String path) {
    try {
      Files.write(
        Paths.get(path),
        s.getBytes(),
        java.nio.file.StandardOpenOption.APPEND
      );
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static Path findFileByName(String folderPath, String fileName) {
    try {
      return Files
        .walk(Paths.get(folderPath))
        .filter(path -> path.getFileName().toString().equals(fileName))
        .findFirst()
        .orElse(null);
    } catch (IOException e) {
      e.printStackTrace();
    }
    return null;
  }

  public static void main(String[] args) {
    Path file = findFileByName(
      "D:/Visual Studio Code/Java/Code Java",
      "input.txt"
    );
    if (file != null) {
      System.out.println(file.toAbsolutePath());
      String content = readContentFromFile(file.toAbsolutePath().toString());
      writeContentToFile(content + "\n", "output.txt");
      writeContentToFile("Goodbye 1\n", "output.txt");
      writeLastToFile("Goodbye 2\n", "output.txt");
    }
  }
}
