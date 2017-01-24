package chapter18.T1;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

class DirList {
    public static void main(String[] args) {
        File path = new File(".");
        System.out.println(path.getAbsolutePath());
        String[] list;
        if(args.length == 0)
            list = path.list();
        else
            list = path.list(new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    return false;
                }
            });
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        for (String s : list)
            System.out.println(s);
    }
}