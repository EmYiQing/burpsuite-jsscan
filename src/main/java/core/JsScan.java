package core;

import burp.IBurpExtenderCallbacks;
import common.Constants;
import common.JsDict;
import common.PrintUtil;
import http.HttpUtil;
import ui.TestUI;

import java.util.Objects;

public class JsScan {

    private static IBurpExtenderCallbacks callbacks;

    public JsScan(IBurpExtenderCallbacks callbacks) {
        JsScan.callbacks = callbacks;
    }

    public static void startScan(final String target) {
        new Thread(() -> {
            String template;

            try {
                String url = target;
                if (!target.endsWith("/")) {
                    url = target + "/";
                }
                for (int i = 0; i < JsDict.JS_DICT.size(); i++) {

                    PrintUtil.print(callbacks, url + JsDict.JS_DICT.get(i));

                    template = HttpUtil.doGet(url + "qwer/asdf/zxcv/uiop");
                    String response = HttpUtil.doGet(url + JsDict.JS_DICT.get(i));
                    if (!Objects.equals(response, "")) {
                        if (!Objects.equals(template, response)) {
                            PrintUtil.print(callbacks, url + JsDict.JS_DICT.get(i));
                            for(String item: Constants.jsLibs){
                                if(url.toLowerCase().contains(item)){
                                    return;
                                }
                            }
                            TestUI.setManualText(url + JsDict.JS_DICT.get(i));
                            JsDict.JS_DICT.add(url);
                        }
                    }
                    double index = (double) i;
                    double size = (double) JsDict.JS_DICT.size();
                    double result = (index / size) * 100;

                    TestUI.progress.setValue((int) result);
                    TestUI.progressLabel.setText(String.valueOf(i + 1) + "/" +
                            String.valueOf(JsDict.JS_DICT.size()));
                }
                TestUI.finishManualScan();
            } catch (Exception ignore) {
            }
        }).start();

    }
}
