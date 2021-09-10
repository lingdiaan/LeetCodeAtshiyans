package Protype;

import java.util.Date;

public class VideoDeep implements Cloneable{

    private String name;
    private Date creatTime;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        VideoDeep obj = (VideoDeep) super.clone();
        obj.creatTime = (Date) this.creatTime.clone();
        return obj;
    }

    @Override
    public String toString() {
        return "Video{" +
                "name='" + name + '\'' +
                ", creatTime=" + creatTime +
                '}';
    }

    public VideoDeep() {
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

    public VideoDeep(String name, Date creatTime) {
        this.name = name;
        this.creatTime = creatTime;
    }
}
