package com.imooc.modol;

/**
 * Created by daiqian on 2020-12-1812:55.
 */
public class Student {
    //成员属性：学号、姓名、性别、年龄
    private String stuNo;
    private String stuName;
    private String stuSex;
    private int stuAge;
    private Subject stuSubject;

    //无参构造
    public  Student(){

    }

    /**
     *
     * @param stuNo 学号
     * @param stuName  姓名
     * @param stuSex  性别
     * @param stuAge  年龄
     */
    //带参构造
    public  Student(String stuNo,String stuName,String stuSex,int stuAge){
        this.setStuNo(stuNo);
        this.setStuName(stuName);
        this.setStuSex(stuSex);
        this.setStuAge(stuAge);
    }

    //带参构造
    public  Student(String stuNo,String stuName,String stuSex,int stuAge,Subject stuSubject){
        this.setStuNo(stuNo);
        this.setStuName(stuName);
        this.setStuSex(stuSex);
        this.setStuAge(stuAge);
        this.setStuSubject(stuSubject);
    }
    public void setStuNo(String stuNo){
        this.stuNo=stuNo;
    }

    public String getStuNo(){
        return this.stuNo;
    }

    public void setStuName(String stuName){

        this.stuName=stuName;
    }

    public String getStuName()
    {
        return this.stuName;
    }

    /**
     * 给性别赋值，限定只能是男或女，反之强制赋值为男
     * @param stuSex 传入的性别
     */
    public void setStuSex(String stuSex) {
        if (stuSex.equals("男") || stuSex.equals("女")) {
            this.stuSex = stuSex;
        } else{
            this.stuSex = "男";
        }

    }

    public String getStuSex(){
        return stuSex;
    }

    /**
     * 给年龄赋值，限定必须在10-100之间，反之赋值为18
     * @param stuAge 传入的年龄
     */
    public void setStuAge(int stuAge){
        if (stuAge<10 || stuAge>100){
            this.stuAge=18;
        }else{
            this.stuAge=stuAge;
        }
    }
    /**
     *
     * @return
     */
    public Subject getStuSubject() {
        if (stuSubject==null)
            this.stuSubject = new Subject();
        return stuSubject;
    }

    public void setStuSubject(Subject stuSubject) {

            this.stuSubject = stuSubject;

    }

    /**
     * 学生自我介绍的方法
     * @return 自我介绍的信息，包括姓名、学号、性别和年龄
     */
    public String introduction(){
        String str = "学生信息如下：\n姓名:"+this.getStuName()+"\n学号:"+this.getStuNo()+"\n性别:"+this.stuSex+"\n年龄:"+this.stuAge;
        return str;
    }

    /**
     *
     * @param subjectName 专业名称
     * @param subjectLife  学制年限
     * @return 自我介绍的信息，包括姓名、学号、性别、年龄、所学专业名称、学制年限
     */
    public String introduction(String subjectName,int subjectLife){
        String str = "学生信息如下：\n姓名:" + this.getStuName() + "\n学号：" + this.getStuNo() + "\n性别:"
                + this.stuSex + "\n年龄:" + this.stuAge+"\n所报专业名称:"+subjectName+"\n学制年限:"+subjectLife;
        return str;
    }

    /**
     *
     * @param mySubject 学科对象
     * @return 自我介绍的信息，包括姓名、学号、性别、年龄、所学专业名称、学制年限、专业编号
     */
    public String introduction(Subject mySubject){
        String str = "学生信息如下：\n姓名：" + this.getStuName() + "\n学号：" + this.getStuNo() + "\n性别："
                + this.stuSex + "\n年龄：" + this.stuAge+"\n所报专业名称："+mySubject.getSubjectName()+"\n学制年限："
                +mySubject.getSubjectLife()+"\n专业编号："+mySubject.getSubjectNo();
        return str;
    }

    /**
     * 学生自我介绍的方法
     * @return 自我介绍的信息，包括姓名、学号、性别、年龄、专业信息
     */
    public String introduction1(){
        String str = "学生信息如下：\n姓名：" + this.getStuName() + "\n学号：" + this.getStuNo() + "\n性别："
                + this.stuSex + "\n年龄：" + this.stuAge+"\n所报专业名称："+this.getStuSubject().getSubjectName()+"\n学制年限："
                +this.getStuSubject().getSubjectLife()+"\n专业编号："+this.getStuSubject().getSubjectNo();
        return str;
    }
}
