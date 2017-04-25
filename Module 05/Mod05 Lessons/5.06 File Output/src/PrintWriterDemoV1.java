import java.io.PrintWriter;
import java.io.IOException;
import java.io.File;
import java.util.Random;

public class PrintWriterDemoV1 {

    public static void main(String[] args) throws IOException {
        PrintWriter outFile = new PrintWriter(new File("Hello.txt"));
        Random randNumList = new Random();
        int randNum;

        for (int loop = 1; loop <= 5; loop++) {
            randNum = randNumList.nextInt(100);
            outFile.println(randNum);
        }
        outFile.close();

    }
}
