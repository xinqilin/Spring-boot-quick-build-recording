package com.bill.springbootquick.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Component
@ConfigurationProperties(prefix = "person")
public class Person {
//    name: 小吳
//    age: 18
//    boss: true
//    maps: {306: 78,307: 79}
//    list1: [dog,cat,doll]
//    set1:
    private String name;
    private Integer age;
    private boolean isBoss;
    private Map<String,Object> maps;
    private List<Object> list1;
    private Set<Object> set1;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isBoss=" + isBoss +
                ", maps=" + maps +
                ", list1=" + list1 +
                ", set1=" + set1 +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public boolean isBoss() {
        return isBoss;
    }

    public void setBoss(boolean boss) {
        isBoss = boss;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public List<Object> getList1() {
        return list1;
    }

    public void setList1(List<Object> list1) {
        this.list1 = list1;
    }

    public Set<Object> getSet1() {
        return set1;
    }

    public void setSet1(Set<Object> set1) {
        this.set1 = set1;
    }
}
