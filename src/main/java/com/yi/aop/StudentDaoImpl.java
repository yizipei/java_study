package com.yi.aop;

public class StudentDaoImpl implements StudentDao {

    public void find() {
        System.out.println("find student");
    }

    public void save() {
        System.out.println("save student");
    }

    public void update() {
        System.out.println("update student");
    }

    public void delete() {
        System.out.println("delete student");
    }
}
