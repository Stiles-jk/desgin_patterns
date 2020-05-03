package test;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.Arrays;

/**
 * @auther Stiles-JKY
 * @date 2020/4/27-14:54
 */
public class Demo {

    public static void main(String[] args) {

        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine jsEngine = manager.getEngineByName("javascript");
        String script = "A1+A2+A3";
        try {
            jsEngine.put("A1",1);
            jsEngine.put("A2",2);
            jsEngine.put("A3",3);
            Object sum = jsEngine.eval(script);
//            Object sum = jsEngine.getContext().getAttribute("sum");
            System.out.println(sum);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(jsEngine);

    }
}
