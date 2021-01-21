/*
 * SimpleFilenameFilter.java
 *
 */


import java.io.*;
/**
 *
 * @author Вадим Монахов
 */
public class SimpleFilenameFilter implements FilenameFilter{
    String ext;
    /**
     * Creates a new instance of SimpleFilenameFilter
     * @param ext
     */
    public SimpleFilenameFilter(String ext) {
      this.ext=ext;
    }
    
    @Override
    public boolean accept(File dir,String fileName){
       return  "".equals(ext)||fileName.endsWith(ext);
    }
}
