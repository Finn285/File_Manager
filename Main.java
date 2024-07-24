import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("SeaManager");
        System.out.print(">> ");
        String inp1 = input.nextLine();
        String[] pt = inp1.split(" ");
        String cmd = pt[0];
        String pth = pt[1];
        if (Objects.equals(cmd, fmCmd.deleteFile)) {
            fmFunctions.delFile(pth);
        }
        if (Objects.equals(cmd, fmCmd.listOfFiles)) {
            fmFunctions.listOfFiles(pth);
        }
        if (Objects.equals(cmd, fmCmd.listOfFilesInfo)) {
            fmFunctions.listOfFilesInfo(pth);
        }
    }
}