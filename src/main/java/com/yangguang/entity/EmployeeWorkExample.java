package com.yangguang.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class EmployeeWorkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmployeeWorkExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andEmpWorkIdIsNull() {
            addCriterion("emp_work_id is null");
            return (Criteria) this;
        }

        public Criteria andEmpWorkIdIsNotNull() {
            addCriterion("emp_work_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmpWorkIdEqualTo(Integer value) {
            addCriterion("emp_work_id =", value, "empWorkId");
            return (Criteria) this;
        }

        public Criteria andEmpWorkIdNotEqualTo(Integer value) {
            addCriterion("emp_work_id <>", value, "empWorkId");
            return (Criteria) this;
        }

        public Criteria andEmpWorkIdGreaterThan(Integer value) {
            addCriterion("emp_work_id >", value, "empWorkId");
            return (Criteria) this;
        }

        public Criteria andEmpWorkIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("emp_work_id >=", value, "empWorkId");
            return (Criteria) this;
        }

        public Criteria andEmpWorkIdLessThan(Integer value) {
            addCriterion("emp_work_id <", value, "empWorkId");
            return (Criteria) this;
        }

        public Criteria andEmpWorkIdLessThanOrEqualTo(Integer value) {
            addCriterion("emp_work_id <=", value, "empWorkId");
            return (Criteria) this;
        }

        public Criteria andEmpWorkIdIn(List<Integer> values) {
            addCriterion("emp_work_id in", values, "empWorkId");
            return (Criteria) this;
        }

        public Criteria andEmpWorkIdNotIn(List<Integer> values) {
            addCriterion("emp_work_id not in", values, "empWorkId");
            return (Criteria) this;
        }

        public Criteria andEmpWorkIdBetween(Integer value1, Integer value2) {
            addCriterion("emp_work_id between", value1, value2, "empWorkId");
            return (Criteria) this;
        }

        public Criteria andEmpWorkIdNotBetween(Integer value1, Integer value2) {
            addCriterion("emp_work_id not between", value1, value2, "empWorkId");
            return (Criteria) this;
        }

        public Criteria andEmpIdIsNull() {
            addCriterion("emp_id is null");
            return (Criteria) this;
        }

        public Criteria andEmpIdIsNotNull() {
            addCriterion("emp_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmpIdEqualTo(String value) {
            addCriterion("emp_id =", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotEqualTo(String value) {
            addCriterion("emp_id <>", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThan(String value) {
            addCriterion("emp_id >", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThanOrEqualTo(String value) {
            addCriterion("emp_id >=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThan(String value) {
            addCriterion("emp_id <", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThanOrEqualTo(String value) {
            addCriterion("emp_id <=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLike(String value) {
            addCriterion("emp_id like", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotLike(String value) {
            addCriterion("emp_id not like", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdIn(List<String> values) {
            addCriterion("emp_id in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotIn(List<String> values) {
            addCriterion("emp_id not in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdBetween(String value1, String value2) {
            addCriterion("emp_id between", value1, value2, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotBetween(String value1, String value2) {
            addCriterion("emp_id not between", value1, value2, "empId");
            return (Criteria) this;
        }

        public Criteria andWorkInfoIsNull() {
            addCriterion("work_info is null");
            return (Criteria) this;
        }

        public Criteria andWorkInfoIsNotNull() {
            addCriterion("work_info is not null");
            return (Criteria) this;
        }

        public Criteria andWorkInfoEqualTo(String value) {
            addCriterion("work_info =", value, "workInfo");
            return (Criteria) this;
        }

        public Criteria andWorkInfoNotEqualTo(String value) {
            addCriterion("work_info <>", value, "workInfo");
            return (Criteria) this;
        }

        public Criteria andWorkInfoGreaterThan(String value) {
            addCriterion("work_info >", value, "workInfo");
            return (Criteria) this;
        }

        public Criteria andWorkInfoGreaterThanOrEqualTo(String value) {
            addCriterion("work_info >=", value, "workInfo");
            return (Criteria) this;
        }

        public Criteria andWorkInfoLessThan(String value) {
            addCriterion("work_info <", value, "workInfo");
            return (Criteria) this;
        }

        public Criteria andWorkInfoLessThanOrEqualTo(String value) {
            addCriterion("work_info <=", value, "workInfo");
            return (Criteria) this;
        }

        public Criteria andWorkInfoLike(String value) {
            addCriterion("work_info like", value, "workInfo");
            return (Criteria) this;
        }

        public Criteria andWorkInfoNotLike(String value) {
            addCriterion("work_info not like", value, "workInfo");
            return (Criteria) this;
        }

        public Criteria andWorkInfoIn(List<String> values) {
            addCriterion("work_info in", values, "workInfo");
            return (Criteria) this;
        }

        public Criteria andWorkInfoNotIn(List<String> values) {
            addCriterion("work_info not in", values, "workInfo");
            return (Criteria) this;
        }

        public Criteria andWorkInfoBetween(String value1, String value2) {
            addCriterion("work_info between", value1, value2, "workInfo");
            return (Criteria) this;
        }

        public Criteria andWorkInfoNotBetween(String value1, String value2) {
            addCriterion("work_info not between", value1, value2, "workInfo");
            return (Criteria) this;
        }

        public Criteria andWorkStartIsNull() {
            addCriterion("work_start is null");
            return (Criteria) this;
        }

        public Criteria andWorkStartIsNotNull() {
            addCriterion("work_start is not null");
            return (Criteria) this;
        }

        public Criteria andWorkStartEqualTo(Date value) {
            addCriterionForJDBCDate("work_start =", value, "workStart");
            return (Criteria) this;
        }

        public Criteria andWorkStartNotEqualTo(Date value) {
            addCriterionForJDBCDate("work_start <>", value, "workStart");
            return (Criteria) this;
        }

        public Criteria andWorkStartGreaterThan(Date value) {
            addCriterionForJDBCDate("work_start >", value, "workStart");
            return (Criteria) this;
        }

        public Criteria andWorkStartGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("work_start >=", value, "workStart");
            return (Criteria) this;
        }

        public Criteria andWorkStartLessThan(Date value) {
            addCriterionForJDBCDate("work_start <", value, "workStart");
            return (Criteria) this;
        }

        public Criteria andWorkStartLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("work_start <=", value, "workStart");
            return (Criteria) this;
        }

        public Criteria andWorkStartIn(List<Date> values) {
            addCriterionForJDBCDate("work_start in", values, "workStart");
            return (Criteria) this;
        }

        public Criteria andWorkStartNotIn(List<Date> values) {
            addCriterionForJDBCDate("work_start not in", values, "workStart");
            return (Criteria) this;
        }

        public Criteria andWorkStartBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("work_start between", value1, value2, "workStart");
            return (Criteria) this;
        }

        public Criteria andWorkStartNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("work_start not between", value1, value2, "workStart");
            return (Criteria) this;
        }

        public Criteria andWorkEndIsNull() {
            addCriterion("work_end is null");
            return (Criteria) this;
        }

        public Criteria andWorkEndIsNotNull() {
            addCriterion("work_end is not null");
            return (Criteria) this;
        }

        public Criteria andWorkEndEqualTo(Date value) {
            addCriterionForJDBCDate("work_end =", value, "workEnd");
            return (Criteria) this;
        }

        public Criteria andWorkEndNotEqualTo(Date value) {
            addCriterionForJDBCDate("work_end <>", value, "workEnd");
            return (Criteria) this;
        }

        public Criteria andWorkEndGreaterThan(Date value) {
            addCriterionForJDBCDate("work_end >", value, "workEnd");
            return (Criteria) this;
        }

        public Criteria andWorkEndGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("work_end >=", value, "workEnd");
            return (Criteria) this;
        }

        public Criteria andWorkEndLessThan(Date value) {
            addCriterionForJDBCDate("work_end <", value, "workEnd");
            return (Criteria) this;
        }

        public Criteria andWorkEndLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("work_end <=", value, "workEnd");
            return (Criteria) this;
        }

        public Criteria andWorkEndIn(List<Date> values) {
            addCriterionForJDBCDate("work_end in", values, "workEnd");
            return (Criteria) this;
        }

        public Criteria andWorkEndNotIn(List<Date> values) {
            addCriterionForJDBCDate("work_end not in", values, "workEnd");
            return (Criteria) this;
        }

        public Criteria andWorkEndBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("work_end between", value1, value2, "workEnd");
            return (Criteria) this;
        }

        public Criteria andWorkEndNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("work_end not between", value1, value2, "workEnd");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}