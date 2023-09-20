import javax.swing.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.nio.file.StandardOpenOption.CREATE;

public class ShortLister {
    public static void main(String[] args){
        JFileChooser chooser = new JFileChooser();
        File selectedFile;
        ShortWordFilter filter = new ShortWordFilter();
        String rec = "";

        try
        {

        File workingDirectory = new File(System.getProperty("user.dir"));
        chooser.setCurrentDirectory(workingDirectory);

        if(chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
        {
            selectedFile = chooser.getSelectedFile();
            Path file = selectedFile.toPath();
            InputStream in =
                    new BufferedInputStream(Files.newInputStream(file, CREATE));
            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(in));

            int line = 0;
            while(reader.ready())
            {
                rec = reader.readLine();
                line++;
                String[] words = rec.split("\\W+");
                for (String word:
                     words) {
                    if (filter.accept(word)==true){
                        System.out.println(word);
                    }
                }

            }
            reader.close();
            System.out.println("\n\nData file read!");
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found!!!");
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}
