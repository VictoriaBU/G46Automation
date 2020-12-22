package helper;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileHelper {

    private final static Logger LOG = LogManager.getLogger("helper");

    public static List<String> readLinesFromFile(String path){
        try {
           return Files.readAllLines(Paths.get(path));
        } catch (IOException e) {
            e.printStackTrace();
            LOG.error(String.format("Проблема с файлом $s: $s", path, e.getMessage()));
            return new ArrayList<>();
        }

    }
}
