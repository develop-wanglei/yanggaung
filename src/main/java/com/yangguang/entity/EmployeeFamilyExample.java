package com.yangguang.entity;

import java.util.ArrayList;
import java.util.List;

public class EmployeeFamilyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmployeeFamilyExample() {
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

        public Criteria andEmpFamilyIdIsNull() {
            addCriterion("emp_family_id is null");
            return (Criteria) this;
        }

        public Criteria andEmpFamilyIdIsNotNull() {
            addCriterion("emp_family_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmpFamilyIdEqualTo(Integer value) {
            addCriterion("emp_family_id =", value, "empFamilyId");
            return (Criteria) this;
        }

        public Criteria andEmpFamilyIdNotEqualTo(Integer value) {
            addCriterion("emp_family_id <>", value, "empFamilyId");
            return (Criteria) this;
        }

        public Criteria andEmpFamilyIdGreaterThan(Integer value) {
            addCriterion("emp_family_id >", value, "empFamilyId");
            return (Criteria) this;
        }

        public Criteria andEmpFamilyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("emp_family_id >=", value, "empFamilyId");
            return (Criteria) this;
        }

        public Criteria andEmpFamilyIdLessThan(Integer value) {
            addCriterion("emp_family_id <", value, "empFamilyId");
            return (Criteria) this;
        }

        public Criteria andEmpFamilyIdLessThanOrEqualTo(Integer value) {
            addCriterion("emp_family_id <=", value, "empFamilyId");
            return (Criteria) this;
        }

        public Criteria andEmpFamilyIdIn(List<Integer> values) {
            addCriterion("emp_family_id in", values, "empFamilyId");
            return (Criteria) this;
        }

        public Criteria andEmpFamilyIdNotIn(List<Integer> values) {
            addCriterion("emp_family_id not in", values, "empFamilyId");
            return (Criteria) this;
        }

        public Criteria andEmpFamilyIdBetween(Integer value1, Integer value2) {
            addCriterion("emp_family_id between", value1, value2, "empFamilyId");
            return (Criteria) this;
        }

        public Criteria andEmpFamilyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("emp_family_id not between", value1, value2, "empFamilyId");
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

        public Criteria andEmpFamilyNameIsNull() {
            addCriterion("emp_family_name is null");
            return (Criteria) this;
        }

        public Criteria andEmpFamilyNameIsNotNull() {
            addCriterion("emp_family_name is not null");
            return (Criteria) this;
        }

        public Criteria andEmpFamilyNameEqualTo(String value) {
            addCriterion("emp_family_name =", value, "empFamilyName");
            return (Criteria) this;
        }

        public Criteria andEmpFamilyNameNotEqualTo(String value) {
            addCriterion("emp_family_name <>", value, "empFamilyName");
            return (Criteria) this;
        }

        public Criteria andEmpFamilyNameGreaterThan(String value) {
            addCriterion("emp_family_name >", value, "empFamilyName");
            return (Criteria) this;
        }

        public Criteria andEmpFamilyNameGreaterThanOrEqualTo(String value) {
            addCriterion("emp_family_name >=", value, "empFamilyName");
            return (Criteria) this;
        }

        public Criteria andEmpFamilyNameLessThan(String value) {
            addCriterion("emp_family_name <", value, "empFamilyName");
            return (Criteria) this;
        }

        public Criteria andEmpFamilyNameLessThanOrEqualTo(String value) {
            addCriterion("emp_family_name <=", value, "empFamilyName");
            return (Criteria) this;
        }

        public Criteria andEmpFamilyNameLike(String value) {
            addCriterion("emp_family_name like", value, "empFamilyName");
            return (Criteria) this;
        }

        public Criteria andEmpFamilyNameNotLike(String value) {
            addCriterion("emp_family_name not like", value, "empFamilyName");
            return (Criteria) this;
        }

        public Criteria andEmpFamilyNameIn(List<String> values) {
            addCriterion("emp_family_name in", values, "empFamilyName");
            return (Criteria) this;
        }

        public Criteria andEmpFamilyNameNotIn(List<String> values) {
            addCriterion("emp_family_name not in", values, "empFamilyName");
            return (Criteria) this;
        }

        public Criteria andEmpFamilyNameBetween(String value1, String value2) {
            addCriterion("emp_family_name between", value1, value2, "empFamilyName");
            return (Criteria) this;
        }

        public Criteria andEmpFamilyNameNotBetween(String value1, String value2) {
            addCriterion("emp_family_name not between", value1, value2, "empFamilyName");
            return (Criteria) this;
        }

        public Criteria andEmpFamilyWorkIsNull() {
            addCriterion("emp_family_work is null");
            return (Criteria) this;
        }

        public Criteria andEmpFamilyWorkIsNotNull() {
            addCriterion("emp_family_work is not null");
            return (Criteria) this;
        }

        public Criteria andEmpFamilyWorkEqualTo(String value) {
            addCriterion("emp_family_work =", value, "empFamilyWork");
            return (Criteria) this;
        }

        public Criteria andEmpFamilyWorkNotEqualTo(String value) {
            addCriterion("emp_family_work <>", value, "empFamilyWork");
            return (Criteria) this;
        }

        public Criteria andEmpFamilyWorkGreaterThan(String value) {
            addCriterion("emp_family_work >", value, "empFamilyWork");
            return (Criteria) this;
        }

        public Criteria andEmpFamilyWorkGreaterThanOrEqualTo(String value) {
            addCriterion("emp_family_work >=", value, "empFamilyWork");
            return (Criteria) this;
        }

        public Criteria andEmpFamilyWorkLessThan(String value) {
            addCriterion("emp_family_work <", value, "empFamilyWork");
            return (Criteria) this;
        }

        public Criteria andEmpFamilyWorkLessThanOrEqualTo(String value) {
            addCriterion("emp_family_work <=", value, "empFamilyWork");
            return (Criteria) this;
        }

        public Criteria andEmpFamilyWorkLike(String value) {
            addCriterion("emp_family_work like", value, "empFamilyWork");
            return (Criteria) this;
        }

        public Criteria andEmpFamilyWorkNotLike(String value) {
            addCriterion("emp_family_work not like", value, "empFamilyWork");
            return (Criteria) this;
        }

        public Criteria andEmpFamilyWorkIn(List<String> values) {
            addCriterion("emp_family_work in", values, "empFamilyWork");
            return (Criteria) this;
        }

        public Criteria andEmpFamilyWorkNotIn(List<String> values) {
            addCriterion("emp_family_work not in", values, "empFamilyWork");
            return (Criteria) this;
        }

        public Criteria andEmpFamilyWorkBetween(String value1, String value2) {
            addCriterion("emp_family_work between", value1, value2, "empFamilyWork");
            return (Criteria) this;
        }

        public Criteria andEmpFamilyWorkNotBetween(String value1, String value2) {
            addCriterion("emp_family_work not between", value1, value2, "empFamilyWork");
            return (Criteria) this;
        }

        public Criteria andEmpFamilyRelationIsNull() {
            addCriterion("emp_family_relation is null");
            return (Criteria) this;
        }

        public Criteria andEmpFamilyRelationIsNotNull() {
            addCriterion("emp_family_relation is not null");
            return (Criteria) this;
        }

        public Criteria andEmpFamilyRelationEqualTo(String value) {
            addCriterion("emp_family_relation =", value, "empFamilyRelation");
            return (Criteria) this;
        }

        public Criteria andEmpFamilyRelationNotEqualTo(String value) {
            addCriterion("emp_family_relation <>", value, "empFamilyRelation");
            return (Criteria) this;
        }

        public Criteria andEmpFamilyRelationGreaterThan(String value) {
            addCriterion("emp_family_relation >", value, "empFamilyRelation");
            return (Criteria) this;
        }

        public Criteria andEmpFamilyRelationGreaterThanOrEqualTo(String value) {
            addCriterion("emp_family_relation >=", value, "empFamilyRelation");
            return (Criteria) this;
        }

        public Criteria andEmpFamilyRelationLessThan(String value) {
            addCriterion("emp_family_relation <", value, "empFamilyRelation");
            return (Criteria) this;
        }

        public Criteria andEmpFamilyRelationLessThanOrEqualTo(String value) {
            addCriterion("emp_family_relation <=", value, "empFamilyRelation");
            return (Criteria) this;
        }

        public Criteria andEmpFamilyRelationLike(String value) {
            addCriterion("emp_family_relation like", value, "empFamilyRelation");
            return (Criteria) this;
        }

        public Criteria andEmpFamilyRelationNotLike(String value) {
            addCriterion("emp_family_relation not like", value, "empFamilyRelation");
            return (Criteria) this;
        }

        public Criteria andEmpFamilyRelationIn(List<String> values) {
            addCriterion("emp_family_relation in", values, "empFamilyRelation");
            return (Criteria) this;
        }

        public Criteria andEmpFamilyRelationNotIn(List<String> values) {
            addCriterion("emp_family_relation not in", values, "empFamilyRelation");
            return (Criteria) this;
        }

        public Criteria andEmpFamilyRelationBetween(String value1, String value2) {
            addCriterion("emp_family_relation between", value1, value2, "empFamilyRelation");
            return (Criteria) this;
        }

        public Criteria andEmpFamilyRelationNotBetween(String value1, String value2) {
            addCriterion("emp_family_relation not between", value1, value2, "empFamilyRelation");
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