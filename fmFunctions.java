import java.io.File;
import java.io.IOException;

public class fmFunctions {
    static void delFile(String pth) {
        File path = new File(pth);
        path.delete();
    }
    public static void listOfFiles(String pth) {
        File path = new File(pth);
        if (path.exists()) {
            File[] files = path.listFiles();
            for (File file : files) {
                if (file.isFile()) {
                    System.out.println(file.getName());
                }
                if (file.isDirectory()) {
                    System.out.println(file.getName() + "\\");
                }
            }
        }
    }
    public static void listOfFilesInfo(String pth) {
        System.out.println(pth);
        File path = new File(pth);
        if (path.exists()) {
            File[] files = path.listFiles();
            for (File file : files) {
                if (file.isFile()) {
                    float fgb = file.length() / 1024.0f / 1024.0f;
                    System.out.println(file.getName() + " " + fgb + " GB");
                }
                if (file.isDirectory()) {
                    float fgb = file.length() / 1024.0f / 1024.0f;
                    System.out.println(file.getName() + "\\ " + fgb + " GB");
                }
            }
        }
    }
    static void createfile(String pth) throws IOException {
        File path = new File(pth);
        path.createNewFile();
    }
    static void startfile(String pth) {
        File path = new File(pth);
        try {
            Process process = Runtime.getRuntime().exec(pth);
            process.waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
