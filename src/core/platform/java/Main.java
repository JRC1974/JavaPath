package core.platform.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

/**
 * Created by JasonCrane on 5/25/2017.
 * Project JavaPath
 */
public class Main {
  public static void main(String[] args) {
    //doTryCatchFinally();
    //doTryWithResources();
    //doTryWithResourcesMulti();
    //doCloseThing();
//    try {
//      readData();
//    } catch (IOException e) {
//      e.printStackTrace();
//    }
//    try {
//      readThemAll();
//    } catch (IOException e) {
//      e.printStackTrace();
//    }
    StringJoiner sj = new StringJoiner(", ");
    sj.add("alpha");
    sj.add("theta");
    sj.add("gamma");
    String theResult = sj.toString();
    StringJoiner sj1 = new StringJoiner(", ");
    sj1.add("alpha").add("theta").add("gamma");
    String theResult1 = sj1.toString();
    StringJoiner sj2 = new StringJoiner(", ", "{", "}");
    sj2.add("alpha");
    sj2.add("theta");
    sj2.add("gamma");
    String theResult2 = sj2.toString();
    StringJoiner sj3 = new StringJoiner("], [","[","]");
    sj3.add("alpha");
    sj3.add("theta");
    sj3.add("gamma");
    String theResult3 = sj3.toString();
    System.out.println("theResults(3): " +theResult3.toString());
    StringJoiner sj4 = new StringJoiner(", ");
    sj4.add("alpha");
    String theResult4 = sj4.toString();
    System.out.println("theResults(4): " +theResult4.toString());
    StringJoiner sj5 = new StringJoiner(", ", "{", "}");
    sj5.add("alpha").add("beta").add("gamma").add("theta");
    String theResult5 = sj5.toString();
    System.out.println("theResults(5): " +theResult5);
    StringJoiner sj6 = new StringJoiner(", ");
    sj6.setEmptyValue("EMPTY");
    String theResult6 = sj6.toString();
    System.out.println("theResults(6): " +theResult6);
    StringJoiner sj7 = new StringJoiner(", ");
    sj7.setEmptyValue("EMPTY");
    sj7.add("");
    String theResult7 = sj7.toString();
    System.out.println("theResults(7): " +theResult7); //setEmptyValue only works when .add not called


    String[] data = {
            "Line 1",
            "Line 2 2",
            "Line 3 3 3",
            "Line 4 4 4 4",
            "Line 5 5 5 5 5"
    };

    try (FileSystem zipFs = openZip(Paths.get("myData.zip"))) {
      copyToZip(zipFs);
      writeToFileInZip1(zipFs,data);
      writeToFileInZip2(zipFs,data);
    } catch (Exception e) {
      System.out.println(e.getClass().getSimpleName() + " - " + e.getMessage());
    }
  }
  public static void doTryCatchFinally() {
    char[] buff = new char[8];
    int length;
    Reader reader = null;
    try {
      reader = Helper.openReader("C:\\Users\\JasonCrane\\IdeaProjects\\JavaPath\\src\\file1.txt");
      while ((length = reader.read(buff)) >= 0) {
        System.out.println("Length: " +length);
        for(int i = 0; i < length; i++) {
          System.out.println(buff[i]);
        }
      }
    } catch (IOException e) {
      System.out.println(e.getClass().getSimpleName() + " - " + e.getMessage());
    } finally {
      try {
        if (reader != null) {
          reader.close();
        }
      } catch (IOException e2) {
        System.out.println(e2.getClass().getSimpleName() + " - " + e2.getMessage());
      }
    }
  }

  public static void doTryWithResources() {
    char[] buff = new char[8];
    int length;
    try (Reader reader = Helper.openReader("C:\\Users\\JasonCrane\\IdeaProjects\\JavaPath\\src\\file1.txt")) {
      while ((length = reader.read(buff)) >= 0) {
        System.out.println("Length: " +length);
        for(int i = 0; i < length; i++) {
          System.out.println(buff[i]);
        }
      }
    } catch (IOException e) {
      System.out.println(e.getClass().getSimpleName() + " - " + e.getMessage());
    }
  }

  public static void doTryWithResourcesMulti() {
    char[] buff = new char[8];
    int length;
    try (Reader reader = Helper.openReader("C:\\Users\\JasonCrane\\IdeaProjects\\JavaPath\\src\\file1.txt"); Writer writer = Helper.openWriter("C:\\Users\\JasonCrane\\IdeaProjects\\JavaPath\\src\\file2.txt")) {
      while ((length = reader.read(buff)) >= 0) {
        System.out.println("Length: " +length);
        writer.write(buff, 0, length);
      }
    } catch (IOException e) {
      System.out.println(e.getClass().getSimpleName() + " - " + e.getMessage());
    }
  }

  private static void doCloseThing() {
    try(MyAutoCloseable ac = new MyAutoCloseable()) {
      ac.saySomething();
    } catch (IOException e) {
      System.out.println(e.getClass().getSimpleName() + " - " + e.getMessage());

      for(Throwable t:e.getSuppressed()) {
        System.out.println("Suppressed: " +t.getMessage());
      }
    }
  }

  //NIO Class
  private static void readData() throws IOException {
    try (BufferedReader br = Files.newBufferedReader(Paths.get("C:\\Users\\JasonCrane\\IdeaProjects\\JavaPath\\src\\file1.txt"))) {
      String inValue;
      while ((inValue = br.readLine()) != null) {
        System.out.println(inValue);
      }
    } catch (IOException e) {
      System.out.println(e.getClass().getSimpleName() + " - " + e.getMessage());
    }
  }

  private static void readThemAll() throws IOException {
    List<String> lines = Files.readAllLines(Paths.get("C:\\Users\\JasonCrane\\IdeaProjects\\JavaPath\\src\\file3.txt"));
    for (String line: lines) {
      System.out.println(line);
    }
  }

  private static FileSystem openZip(Path zipPath) throws IOException, URISyntaxException {
    Map<String, String> providerProps = new HashMap<>();
    providerProps.put("create","true");

    URI zipURI = new URI("jar:file", zipPath.toUri().getPath(), null);
    FileSystem zipFs = FileSystems.newFileSystem(zipURI, providerProps);

    return zipFs;
  }

  private static void copyToZip(FileSystem zipFs) throws IOException {
    Path sourceFile = Paths.get("file1.txt"); //Default path from File System
    //Path sourceFile = FileSystems.getDefault().getPath("file1.txt"); //Long way of line above
    Path destFile = zipFs.getPath("/file1Copied.txt");

    Files.copy(sourceFile,destFile, StandardCopyOption.REPLACE_EXISTING);
  }

  private static void writeToFileInZip1(FileSystem zipFs, String[] data) throws IOException {
    try(BufferedWriter writer = Files.newBufferedWriter(zipFs.getPath("/newFile1.txt"))) {
      for(String d:data) {
        writer.write(d);
        writer.newLine();
      }
    }
  }

  private static void writeToFileInZip2(FileSystem zipFs, String[] data) throws IOException {
    Files.write(zipFs.getPath("/newFile2.txt"), Arrays.asList(data), Charset.defaultCharset(), StandardOpenOption.CREATE);
  }

}
