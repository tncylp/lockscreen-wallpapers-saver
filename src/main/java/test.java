import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;

public class test {

    public static void main(String[] args) throws IOException {

        File source = new File("C:\\Users\\" + System.getProperty("user.name") + "\\AppData\\Local\\Packages\\Microsoft.Windows.ContentDeliveryManager_cw5n1h2txyewy\\LocalState\\Assets");

        //File source = new File("C:\\Users\\" + System.getProperty("user.name") + "\\Desktop\\wallpaper");
        File destination = new File("C:\\Users\\" + System.getProperty("user.name") + "\\Desktop\\wallpapers");

        if(!destination.exists()){
            destination.mkdir();
        }

        for (File file : source.listFiles()){
            FileUtils.copyFileToDirectory(file,destination);
        }

        for (File file : destination.listFiles()){
            file.renameTo(new File(file.toPath() + ".jpg"));
        }
    }
}
