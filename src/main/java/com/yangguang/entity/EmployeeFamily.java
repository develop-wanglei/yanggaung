package com.yangguang.entity;

public class EmployeeFamily {
    private Integer empFamilyId;

    private String empId;

    private String empFamilyName;

    private String empFamilyWork;

    private String empFamilyRelation;

    public EmployeeFamily() {
    }

    public EmployeeFamily(Integer empFamilyId, String empId, String empFamilyName, String empFamilyWork, String empFamilyRelation) {
        this.empFamilyId = empFamilyId;
        this.empId = empId;
        this.empFamilyName = empFamilyName;
        this.empFamilyWork = empFamilyWork;
        this.empFamilyRelation = empFamilyRelation;
    }

    public Integer getEmpFamilyId() {
        return empFamilyId;
    }

    public void setEmpFamilyId(Integer empFamilyId) {
        this.empFamilyId = empFamilyId;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId == null ? null : empId.trim();
    }

    public String getEmpFamilyName() {
        return empFamilyName;
    }

    public void setEmpFamilyName(String empFamilyName) {
        this.empFamilyName = empFamilyName == null ? null : empFamilyName.trim();
    }

    public String getEmpFamilyWork() {
        return empFamilyWork;
    }

    public void setEmpFamilyWork(String empFamilyWork) {
        this.empFamilyWork = empFamilyWork == null ? null : empFamilyWork.trim();
    }

    public String getEmpFamilyRelation() {
        return empFamilyRelation;
    }

    public void setEmpFamilyRelation(String empFamilyRelation) {
        this.empFamilyRelation = empFamilyRelation == null ? null : empFamilyRelation.trim();
    }

    @Override
    public String toString() {
        return "EmployeeFamily{" +
                "empFamilyId=" + empFamilyId +
                ", empId='" + empId + '\'' +
                ", empFamilyName='" + empFamilyName + '\'' +
                ", empFamilyWork='" + empFamilyWork + '\'' +
                ", empFamilyRelation='" + empFamilyRelation + '\'' +
                '}';
    }
}