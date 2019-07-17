package com.yangguang.entity;

import java.util.Date;

public class Employee {
    private String empId;

    private String empName;

    private Integer empSex;

    private String empBirthday;

    private String empNation;

    private String empEducation;

    private String empPoliticsstatus;

    private String empPlace;

    private String empPhone;

    private String empAddress;

    private String empCardid;

    private String empIdentity;

    private String empJob;

    private Date time;

    private String empPhotoBig;

    private String empPhotoLittle;

    public Employee() {
    }

    public Employee(String empId, String empName, Integer empSex, String empBirthday, String empNation, String empEducation, String empPoliticsstatus, String empPlace, String empPhone, String empAddress, String empCardid, String empIdentity, String empJob, Date time, String empPhotoBig, String empPhotoLittle) {
        this.empId = empId;
        this.empName = empName;
        this.empSex = empSex;
        this.empBirthday = empBirthday;
        this.empNation = empNation;
        this.empEducation = empEducation;
        this.empPoliticsstatus = empPoliticsstatus;
        this.empPlace = empPlace;
        this.empPhone = empPhone;
        this.empAddress = empAddress;
        this.empCardid = empCardid;
        this.empIdentity = empIdentity;
        this.empJob = empJob;
        this.time = time;
        this.empPhotoBig = empPhotoBig;
        this.empPhotoLittle = empPhotoLittle;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId == null ? null : empId.trim();
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName == null ? null : empName.trim();
    }

    public Integer getEmpSex() {
        return empSex;
    }

    public void setEmpSex(Integer empSex) {
        this.empSex = empSex;
    }

    public String getEmpBirthday() {
        return empBirthday;
    }

    public void setEmpBirthday(String empBirthday) {
        this.empBirthday = empBirthday == null ? null : empBirthday.trim();
    }

    public String getEmpNation() {
        return empNation;
    }

    public void setEmpNation(String empNation) {
        this.empNation = empNation == null ? null : empNation.trim();
    }

    public String getEmpEducation() {
        return empEducation;
    }

    public void setEmpEducation(String empEducation) {
        this.empEducation = empEducation == null ? null : empEducation.trim();
    }

    public String getEmpPoliticsstatus() {
        return empPoliticsstatus;
    }

    public void setEmpPoliticsstatus(String empPoliticsstatus) {
        this.empPoliticsstatus = empPoliticsstatus == null ? null : empPoliticsstatus.trim();
    }

    public String getEmpPlace() {
        return empPlace;
    }

    public void setEmpPlace(String empPlace) {
        this.empPlace = empPlace == null ? null : empPlace.trim();
    }

    public String getEmpPhone() {
        return empPhone;
    }

    public void setEmpPhone(String empPhone) {
        this.empPhone = empPhone == null ? null : empPhone.trim();
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress == null ? null : empAddress.trim();
    }

    public String getEmpCardid() {
        return empCardid;
    }

    public void setEmpCardid(String empCardid) {
        this.empCardid = empCardid == null ? null : empCardid.trim();
    }

    public String getEmpIdentity() {
        return empIdentity;
    }

    public void setEmpIdentity(String empIdentity) {
        this.empIdentity = empIdentity == null ? null : empIdentity.trim();
    }

    public String getEmpJob() {
        return empJob;
    }

    public void setEmpJob(String empJob) {
        this.empJob = empJob == null ? null : empJob.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getEmpPhotoBig() {
        return empPhotoBig;
    }

    public void setEmpPhotoBig(String empPhotoBig) {
        this.empPhotoBig = empPhotoBig == null ? null : empPhotoBig.trim();
    }

    public String getEmpPhotoLittle() {
        return empPhotoLittle;
    }

    public void setEmpPhotoLittle(String empPhotoLittle) {
        this.empPhotoLittle = empPhotoLittle == null ? null : empPhotoLittle.trim();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId='" + empId + '\'' +
                ", empName='" + empName + '\'' +
                ", empSex=" + empSex +
                ", empBirthday='" + empBirthday + '\'' +
                ", empNation='" + empNation + '\'' +
                ", empEducation='" + empEducation + '\'' +
                ", empPoliticsstatus='" + empPoliticsstatus + '\'' +
                ", empPlace='" + empPlace + '\'' +
                ", empPhone='" + empPhone + '\'' +
                ", empAddress='" + empAddress + '\'' +
                ", empCardid='" + empCardid + '\'' +
                ", empIdentity='" + empIdentity + '\'' +
                ", empJob='" + empJob + '\'' +
                ", time=" + time +
                ", empPhotoBig='" + empPhotoBig + '\'' +
                ", empPhotoLittle='" + empPhotoLittle + '\'' +
                '}';
    }
}