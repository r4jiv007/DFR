/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package my.filecopyrem;

import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author rajiv
 */
class ExtensionFileFilter extends FileFilter {
  
        @Override
        public boolean accept(File file) {
            // Allow only directories, or files with ".txt" extension
            return file.isDirectory() || file.getAbsolutePath().endsWith(".log");
        }
        @Override
        public String getDescription() {
            // This description will be displayed in the dialog,
            // hard-coded = ugly, should be done via I18N
            return "Log files (*.log)";
        }
    } 