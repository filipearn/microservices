package arn.filipe.productcatalog.helper;

import org.springframework.core.io.ClassPathResource;

import java.io.File;
import java.nio.file.Files;

public class Util {

    public static String loadAsString(final String path) {
        try {
            final File resource = new ClassPathResource(path).getFile();

            return new String(Files.readAllBytes(resource.toPath()));
        } catch (final Exception e) {
            return null;
        }
    }
}
