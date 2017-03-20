package zc.com.pattern.model.prototype;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/3/16.
 */
public abstract class Prototype implements Serializable {
    private String id;

    public Prototype(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    //浅克隆
    public abstract Object Clone();
    //深克隆
    public abstract Object deepClone();
}
