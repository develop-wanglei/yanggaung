package com.yangguang.entity;

import java.util.Date;

public class EmployeeWork {
    private Integer empWorkId;

    private String empId;

    private String workInfo;

    private Date workStart;

    private Date workEnd;

    public EmployeeWork() {
    }

    public EmployeeWork(Integer empWorkId, String empId, String workInfo, Date workStart, Date workEnd) {
        this.empWorkId = empWorkId;
        this.empId = empId;
        this.workInfo = workInfo;
        this.workStart = workStart;
        this.workEnd = workEnd;
    }

    public Integer getEmpWorkId() {
        return empWorkId;
    }

    public void setEmpWorkId(Integer empWorkId) {
        this.empWorkId = empWorkId;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId == null ? null : empId.trim();
    }

    public String getWorkInfo() {
        return workInfo;
    }

    public void setWorkInfo(String workInfo) {
        this.workInfo = workInfo == null ? null : workInfo.trim();
    }

    public Date getWorkStart() {
        return workStart;
    }

    public void setWorkStart(Date workStart) {
        this.workStart = workStart;
    }

    public Date getWorkEnd() {
        return workEnd;
    }

    public void setWorkEnd(Date workEnd) {
        this.workEnd = workEnd;
    }

    @Override
    public String toString() {
        return "EmployeeWork{" +
                "empWorkId=" + empWorkId +
                ", empId='" + empId + '\'' +
                ", workInfo='" + workInfo + '\'' +
                ", workStart=" + workStart +
                ", workEnd=" + workEnd +
                '}';
    }
}