package zc.com.pattern.model.factory;

/**
 * Created by Administrator on 2017/3/13.
 * 简单工厂
 */
public class SimpleFactory  {

    public static LeiFeng CreateLeiFeng(String type){
            LeiFeng result = null;
            switch (type){
                case "大学生":
                    result = new Unergraduate();
                    break;
                case "志愿者":
                    result = new Volunteer();
                    break;
            }
            return result;
    }
}
