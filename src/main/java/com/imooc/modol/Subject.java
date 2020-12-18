package com.imooc.modol;

/**
 * 专业类
 * Created by daiqian on 2020-12-1811:15.
 */
public class Subject {
    //成员属性：学科名称、学科编号、学制年限
    private String subjectName;
    private String subjectNo;
    private int subjectLife;

    //无参构造
    public Subject(){

    }

    //带参构造
    public Subject(String subjectName,String subjectNo,int subjectLife) {
        this.setSubjectName(subjectName);
        this.setSubjectNo(subjectNo);
        this.setSubjectLife(subjectLife);
    }

    public void setSubjectName(String subjectName){
        this.subjectName=subjectName;
    }

    public String getSubjectName(){
        return this.subjectName;
    }

    public void setSubjectNo(String subjectNo){
        this.subjectNo=subjectNo;
    }

    public String  getSubjectNo(){
        return this.subjectNo;
    }

    //设置学制年限，限制必须>0
    public void setSubjectLife(int subjectLife){
        if (subjectLife<=0)
            return;
        this.subjectLife=subjectLife;
    }

    public int getSubjectLife(){
        return this.subjectLife;
    }

    /**
     * 专业信息介绍的方法
     * 专业的信息，包括专业名称、专业编号、学制年限
     * @return
     */
    public String info(){
        String str = "专业信息如下：\n专业名称："+this.getSubjectName()+"\n专业编号："+this.getSubjectNo()+"\n学制年限："+this.getSubjectLife();
        return str;
    }


}
