package backend;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Taking care of reading and writing properties files.
 *
 * @author herman
 */
public abstract class PropDaoImpl {

    /**
     * Loads the properties files.
     * @param file the name of the file loaded.
     * @return prop the properties file.
     */
    protected Properties load(String file) {

        Properties prop = new Properties();
        FileInputStream fis;

        try {
            fis = new FileInputStream(file);
            prop.load(fis);

        } catch (IOException ex) {
        }

        return prop;
    }

    /**
     * Stores the properties files.
     * @param file
     * @param prop
     * @param append
     */
    protected void store(String file, Properties prop, boolean append) {

        FileOutputStream fos;

        try {
            fos = new FileOutputStream(file, append);
            prop.store(fos, null);
            fos.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

}
