package cn.zerry.framework.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * @author linzengrui
 * @Description 返回视图对象
 * @date 2018年07月03日 11:48
 */
public class View {
    /**
     * 视图路径
     */
    private String path;

    /**
     * 模型数据
     */
    private Map<String, Object> model;

    public View(String path){
        this.path = path;
        model = new HashMap<>();
    }

    public View addModel(String key, Object value){
        model.put(key, value);
        return this;
    }

    public String getPath(){
        return path;
    }

    public Map<String, Object> getModel() {
        return model;
    }
}
