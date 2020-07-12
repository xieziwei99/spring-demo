package com.xzw.helloworld.entity;

/**
 * @author xieziwei99
 * 2020-07-11
 */
@SuppressWarnings("unused")
public class Person {

    private Integer id;
    private String name;
    private String idCardNumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdCardNumber() {
        return idCardNumber;
    }

    public void setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", idCardNumber='" + idCardNumber + '\'' +
                '}';
    }
}
