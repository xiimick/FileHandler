package app;

public class Main {
    private final static String Base_Path = "files/";

public static void main(String[] args) {
    FileHandler handler = new FileHandler();
    String fileName = "my life";
    String fileContent = "My very important information";
    String result = handler.writeFile(fileName, fileContent);
    String content = handler.readFile(Base_Path + fileName + ".txt");
    getOutput("RESULT: " + result);
    getOutput("FILE CONTENT: " + content);
}
    private static void getOutput(String output) {
        System.out.println(output);
    }
}
