package Protype;

import java.util.Date;
/*
实现一个接口
重写一个方法

 */
//视频原型
public class Video implements Cloneable{//无量UP主

    private String name;
    private Date creatTime;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Video{" +
                "name='" + name + '\'' +
                ", creatTime=" + creatTime +
                '}';
    }

    public Video() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public Video(String name, Date creatTime) {
        this.name = name;
        this.creatTime = creatTime;
    }
}
