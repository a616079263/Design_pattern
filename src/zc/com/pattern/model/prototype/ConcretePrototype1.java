package zc.com.pattern.model.prototype;

import java.io.*;

/**
 * Created by Administrator on 2017/3/16.
 * 克隆模式
 */
public class ConcretePrototype1 extends Prototype implements Serializable,Cloneable {

    public ConcretePrototype1(String id) {
        super(id);
    }

    @Override
    public Object Clone() {
        try {
            return (Prototype) this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Object deepClone() {
        try {
            //将对象写到流里
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = null;
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            //从流里读回来
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            return ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        ConcretePrototype1 c1 = new ConcretePrototype1("222");
        ConcretePrototype1 c2 = (ConcretePrototype1) c1.Clone();
        ConcretePrototype1 c3 = (ConcretePrototype1) c1.deepClone();
        System.out.println(c2.getId());
        System.out.println(c3.getId());
    }
}
