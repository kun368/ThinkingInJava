package chapter18.T2;


import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * Created by Administrator on 2017/1/24.
 */
public class SortedDirList {

    private File path;

    public SortedDirList() {
        this.path = new File(".");
    }

    public SortedDirList(File path) {
        this.path = path;
    }

    public String[] list() {
        String[] list = path.list();
        Arrays.sort(list);
        return list;
    }

    public String[] list(String regex) {
        String[] list = path.list(new FilenameFilter() {
            private Pattern pattern = Pattern.compile(regex);

            @Override
            public boolean accept(File dir, String name) {
                return pattern.matcher(name).matches();
            }
        });
        Arrays.sort(list);
        return list;
    }

    public static void main(String[] args) {
        String[] list = new SortedDirList().list(".*");
        System.out.println(Arrays.toString(list));
    }
}