/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nrkprosjekt;

import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author Simen
 */
public class FileFiltering extends FileFilter {

    String fileFormat;
    String ext;

    public FileFiltering(String fileFormat, String ext) {
        this.fileFormat = fileFormat;
        this.ext = ext;
    }

    @Override
    public boolean accept(File f) {
        if (f.isDirectory()) {
            return true;
        } else {
            return f.getName().toLowerCase().endsWith(ext);
        }
    }

    @Override
    public String getDescription() {
        return fileFormat;
    }
}
