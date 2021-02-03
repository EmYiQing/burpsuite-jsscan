package common;

import java.util.ArrayList;
import java.util.List;

public class Constants {
    public static final String EXTENSION_NAME="JS Scan";
    public static final String  INTRODUCTION="#############################" +
            "#########################################" +
            "############\nAuthor : Xu Shao\n" +
            "Description : Scan the JS file of the website and analyze the vulnerability.\n" +
            "#############################################" +
            "#####################################\n\n";

    public static List<String> jsLibs;
    static {
        jsLibs = new ArrayList<>();
        jsLibs.add("jquery");
        jsLibs.add("bootstrap");
        jsLibs.add("colorbox");
        jsLibs.add("superfish");
        jsLibs.add("touchswipe");
        jsLibs.add("flexslider");
        jsLibs.add("jplayer");
        jsLibs.add("fitvids");
        jsLibs.add("selectnav");
        // ......
        // 自行添加
    }
}
