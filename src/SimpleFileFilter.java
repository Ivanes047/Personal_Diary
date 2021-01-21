

import java.io.*;

/**
 *
 * @author Вадим Монахов
 */
public class SimpleFileFilter extends javax.swing.filechooser.FileFilter {
    String ext;
    String description;
    
    SimpleFileFilter(String ext, String description){
        this.ext=ext;
        this.description=description;
    }
    
    @Override
    public boolean accept(File f){
        if(f==null)
            return false;
        if(f.isDirectory()){
            return true ;
        } else return (f.getName().endsWith(ext));
    }
    
    /**
     * The description of this filter. For example: "JPG and GIF Images"
     * @see FileView#getName
     */
    @Override
    public  String getDescription(){
        return description+" ("+ext+")";
    }

}
