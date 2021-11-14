package basis.io;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * @author luojun
 * @create 2021-11-14 22:45
 */
public class DirList3 {
    public static void main(String[] args) {
        File file = new File(".");

        String[] list;

        if (args.length == 0) {
            list = file.list();
        } else {
            list = file.list(new FilenameFilter() {
                Pattern pattern = Pattern.compile(args[0]);

                @Override
                public boolean accept(File dir, String name) {
                    return pattern.matcher(name).matches();
                }
            });
        }

        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);

        for (String s : list) {
            System.out.println(s);
        }
    }
}
