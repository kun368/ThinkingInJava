package chapter18.T3;

import java.io.File;

/**
 * Created by Administrator on 2017/1/24.
 */
public class DirList {

    public static long countBytes(File path) {
        if(path.isFile())
            return path.length();
        long sum = 0;
        for(File file : path.listFiles())
            sum += countBytes(file);
        return sum;
    }

    public static void main(String[] args) {
        File path = new File(".");
        System.out.println(countBytes(path));
    }
}
