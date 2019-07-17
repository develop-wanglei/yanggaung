package com.yangguang.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmployeeExample() {
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

        public Criteria andEmpNameIsNull() {
            addCriterion("emp_name is null");
            return (Criteria) this;
        }

        public Criteria andEmpNameIsNotNull() {
            addCriterion("emp_name is not null");
            return (Criteria) this;
        }

        public Criteria andEmpNameEqualTo(String value) {
            addCriterion("emp_name =", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotEqualTo(String value) {
            addCriterion("emp_name <>", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameGreaterThan(String value) {
            addCriterion("emp_name >", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameGreaterThanOrEqualTo(String value) {
            addCriterion("emp_name >=", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameLessThan(String value) {
            addCriterion("emp_name <", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameLessThanOrEqualTo(String value) {
            addCriterion("emp_name <=", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameLike(String value) {
            addCriterion("emp_name like", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotLike(String value) {
            addCriterion("emp_name not like", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameIn(List<String> values) {
            addCriterion("emp_name in", values, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotIn(List<String> values) {
            addCriterion("emp_name not in", values, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameBetween(String value1, String value2) {
            addCriterion("emp_name between", value1, value2, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotBetween(String value1, String value2) {
            addCriterion("emp_name not between", value1, value2, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpSexIsNull() {
            addCriterion("emp_sex is null");
            return (Criteria) this;
        }

        public Criteria andEmpSexIsNotNull() {
            addCriterion("emp_sex is not null");
            return (Criteria) this;
        }

        public Criteria andEmpSexEqualTo(Integer value) {
            addCriterion("emp_sex =", value, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexNotEqualTo(Integer value) {
            addCriterion("emp_sex <>", value, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexGreaterThan(Integer value) {
            addCriterion("emp_sex >", value, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("emp_sex >=", value, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexLessThan(Integer value) {
            addCriterion("emp_sex <", value, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexLessThanOrEqualTo(Integer value) {
            addCriterion("emp_sex <=", value, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexIn(List<Integer> values) {
            addCriterion("emp_sex in", values, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexNotIn(List<Integer> values) {
            addCriterion("emp_sex not in", values, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexBetween(Integer value1, Integer value2) {
            addCriterion("emp_sex between", value1, value2, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexNotBetween(Integer value1, Integer value2) {
            addCriterion("emp_sex not between", value1, value2, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpBirthdayIsNull() {
            addCriterion("emp_birthday is null");
            return (Criteria) this;
        }

        public Criteria andEmpBirthdayIsNotNull() {
            addCriterion("emp_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andEmpBirthdayEqualTo(String value) {
            addCriterion("emp_birthday =", value, "empBirthday");
            return (Criteria) this;
        }

        public Criteria andEmpBirthdayNotEqualTo(String value) {
            addCriterion("emp_birthday <>", value, "empBirthday");
            return (Criteria) this;
        }

        public Criteria andEmpBirthdayGreaterThan(String value) {
            addCriterion("emp_birthday >", value, "empBirthday");
            return (Criteria) this;
        }

        public Criteria andEmpBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("emp_birthday >=", value, "empBirthday");
            return (Criteria) this;
        }

        public Criteria andEmpBirthdayLessThan(String value) {
            addCriterion("emp_birthday <", value, "empBirthday");
            return (Criteria) this;
        }

        public Criteria andEmpBirthdayLessThanOrEqualTo(String value) {
            addCriterion("emp_birthday <=", value, "empBirthday");
            return (Criteria) this;
        }

        public Criteria andEmpBirthdayLike(String value) {
            addCriterion("emp_birthday like", value, "empBirthday");
            return (Criteria) this;
        }

        public Criteria andEmpBirthdayNotLike(String value) {
            addCriterion("emp_birthday not like", value, "empBirthday");
            return (Criteria) this;
        }

        public Criteria andEmpBirthdayIn(List<String> values) {
            addCriterion("emp_birthday in", values, "empBirthday");
            return (Criteria) this;
        }

        public Criteria andEmpBirthdayNotIn(List<String> values) {
            addCriterion("emp_birthday not in", values, "empBirthday");
            return (Criteria) this;
        }

        public Criteria andEmpBirthdayBetween(String value1, String value2) {
            addCriterion("emp_birthday between", value1, value2, "empBirthday");
            return (Criteria) this;
        }

        public Criteria andEmpBirthdayNotBetween(String value1, String value2) {
            addCriterion("emp_birthday not between", value1, value2, "empBirthday");
            return (Criteria) this;
        }

        public Criteria andEmpNationIsNull() {
            addCriterion("emp_nation is null");
            return (Criteria) this;
        }

        public Criteria andEmpNationIsNotNull() {
            addCriterion("emp_nation is not null");
            return (Criteria) this;
        }

        public Criteria andEmpNationEqualTo(String value) {
            addCriterion("emp_nation =", value, "empNation");
            return (Criteria) this;
        }

        public Criteria andEmpNationNotEqualTo(String value) {
            addCriterion("emp_nation <>", value, "empNation");
            return (Criteria) this;
        }

        public Criteria andEmpNationGreaterThan(String value) {
            addCriterion("emp_nation >", value, "empNation");
            return (Criteria) this;
        }

        public Criteria andEmpNationGreaterThanOrEqualTo(String value) {
            addCriterion("emp_nation >=", value, "empNation");
            return (Criteria) this;
        }

        public Criteria andEmpNationLessThan(String value) {
            addCriterion("emp_nation <", value, "empNation");
            return (Criteria) this;
        }

        public Criteria andEmpNationLessThanOrEqualTo(String value) {
            addCriterion("emp_nation <=", value, "empNation");
            return (Criteria) this;
        }

        public Criteria andEmpNationLike(String value) {
            addCriterion("emp_nation like", value, "empNation");
            return (Criteria) this;
        }

        public Criteria andEmpNationNotLike(String value) {
            addCriterion("emp_nation not like", value, "empNation");
            return (Criteria) this;
        }

        public Criteria andEmpNationIn(List<String> values) {
            addCriterion("emp_nation in", values, "empNation");
            return (Criteria) this;
        }

        public Criteria andEmpNationNotIn(List<String> values) {
            addCriterion("emp_nation not in", values, "empNation");
            return (Criteria) this;
        }

        public Criteria andEmpNationBetween(String value1, String value2) {
            addCriterion("emp_nation between", value1, value2, "empNation");
            return (Criteria) this;
        }

        public Criteria andEmpNationNotBetween(String value1, String value2) {
            addCriterion("emp_nation not between", value1, value2, "empNation");
            return (Criteria) this;
        }

        public Criteria andEmpEducationIsNull() {
            addCriterion("emp_education is null");
            return (Criteria) this;
        }

        public Criteria andEmpEducationIsNotNull() {
            addCriterion("emp_education is not null");
            return (Criteria) this;
        }

        public Criteria andEmpEducationEqualTo(String value) {
            addCriterion("emp_education =", value, "empEducation");
            return (Criteria) this;
        }

        public Criteria andEmpEducationNotEqualTo(String value) {
            addCriterion("emp_education <>", value, "empEducation");
            return (Criteria) this;
        }

        public Criteria andEmpEducationGreaterThan(String value) {
            addCriterion("emp_education >", value, "empEducation");
            return (Criteria) this;
        }

        public Criteria andEmpEducationGreaterThanOrEqualTo(String value) {
            addCriterion("emp_education >=", value, "empEducation");
            return (Criteria) this;
        }

        public Criteria andEmpEducationLessThan(String value) {
            addCriterion("emp_education <", value, "empEducation");
            return (Criteria) this;
        }

        public Criteria andEmpEducationLessThanOrEqualTo(String value) {
            addCriterion("emp_education <=", value, "empEducation");
            return (Criteria) this;
        }

        public Criteria andEmpEducationLike(String value) {
            addCriterion("emp_education like", value, "empEducation");
            return (Criteria) this;
        }

        public Criteria andEmpEducationNotLike(String value) {
            addCriterion("emp_education not like", value, "empEducation");
            return (Criteria) this;
        }

        public Criteria andEmpEducationIn(List<String> values) {
            addCriterion("emp_education in", values, "empEducation");
            return (Criteria) this;
        }

        public Criteria andEmpEducationNotIn(List<String> values) {
            addCriterion("emp_education not in", values, "empEducation");
            return (Criteria) this;
        }

        public Criteria andEmpEducationBetween(String value1, String value2) {
            addCriterion("emp_education between", value1, value2, "empEducation");
            return (Criteria) this;
        }

        public Criteria andEmpEducationNotBetween(String value1, String value2) {
            addCriterion("emp_education not between", value1, value2, "empEducation");
            return (Criteria) this;
        }

        public Criteria andEmpPoliticsstatusIsNull() {
            addCriterion("emp_politicsStatus is null");
            return (Criteria) this;
        }

        public Criteria andEmpPoliticsstatusIsNotNull() {
            addCriterion("emp_politicsStatus is not null");
            return (Criteria) this;
        }

        public Criteria andEmpPoliticsstatusEqualTo(String value) {
            addCriterion("emp_politicsStatus =", value, "empPoliticsstatus");
            return (Criteria) this;
        }

        public Criteria andEmpPoliticsstatusNotEqualTo(String value) {
            addCriterion("emp_politicsStatus <>", value, "empPoliticsstatus");
            return (Criteria) this;
        }

        public Criteria andEmpPoliticsstatusGreaterThan(String value) {
            addCriterion("emp_politicsStatus >", value, "empPoliticsstatus");
            return (Criteria) this;
        }

        public Criteria andEmpPoliticsstatusGreaterThanOrEqualTo(String value) {
            addCriterion("emp_politicsStatus >=", value, "empPoliticsstatus");
            return (Criteria) this;
        }

        public Criteria andEmpPoliticsstatusLessThan(String value) {
            addCriterion("emp_politicsStatus <", value, "empPoliticsstatus");
            return (Criteria) this;
        }

        public Criteria andEmpPoliticsstatusLessThanOrEqualTo(String value) {
            addCriterion("emp_politicsStatus <=", value, "empPoliticsstatus");
            return (Criteria) this;
        }

        public Criteria andEmpPoliticsstatusLike(String value) {
            addCriterion("emp_politicsStatus like", value, "empPoliticsstatus");
            return (Criteria) this;
        }

        public Criteria andEmpPoliticsstatusNotLike(String value) {
            addCriterion("emp_politicsStatus not like", value, "empPoliticsstatus");
            return (Criteria) this;
        }

        public Criteria andEmpPoliticsstatusIn(List<String> values) {
            addCriterion("emp_politicsStatus in", values, "empPoliticsstatus");
            return (Criteria) this;
        }

        public Criteria andEmpPoliticsstatusNotIn(List<String> values) {
            addCriterion("emp_politicsStatus not in", values, "empPoliticsstatus");
            return (Criteria) this;
        }

        public Criteria andEmpPoliticsstatusBetween(String value1, String value2) {
            addCriterion("emp_politicsStatus between", value1, value2, "empPoliticsstatus");
            return (Criteria) this;
        }

        public Criteria andEmpPoliticsstatusNotBetween(String value1, String value2) {
            addCriterion("emp_politicsStatus not between", value1, value2, "empPoliticsstatus");
            return (Criteria) this;
        }

        public Criteria andEmpPlaceIsNull() {
            addCriterion("emp_place is null");
            return (Criteria) this;
        }

        public Criteria andEmpPlaceIsNotNull() {
            addCriterion("emp_place is not null");
            return (Criteria) this;
        }

        public Criteria andEmpPlaceEqualTo(String value) {
            addCriterion("emp_place =", value, "empPlace");
            return (Criteria) this;
        }

        public Criteria andEmpPlaceNotEqualTo(String value) {
            addCriterion("emp_place <>", value, "empPlace");
            return (Criteria) this;
        }

        public Criteria andEmpPlaceGreaterThan(String value) {
            addCriterion("emp_place >", value, "empPlace");
            return (Criteria) this;
        }

        public Criteria andEmpPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("emp_place >=", value, "empPlace");
            return (Criteria) this;
        }

        public Criteria andEmpPlaceLessThan(String value) {
            addCriterion("emp_place <", value, "empPlace");
            return (Criteria) this;
        }

        public Criteria andEmpPlaceLessThanOrEqualTo(String value) {
            addCriterion("emp_place <=", value, "empPlace");
            return (Criteria) this;
        }

        public Criteria andEmpPlaceLike(String value) {
            addCriterion("emp_place like", value, "empPlace");
            return (Criteria) this;
        }

        public Criteria andEmpPlaceNotLike(String value) {
            addCriterion("emp_place not like", value, "empPlace");
            return (Criteria) this;
        }

        public Criteria andEmpPlaceIn(List<String> values) {
            addCriterion("emp_place in", values, "empPlace");
            return (Criteria) this;
        }

        public Criteria andEmpPlaceNotIn(List<String> values) {
            addCriterion("emp_place not in", values, "empPlace");
            return (Criteria) this;
        }

        public Criteria andEmpPlaceBetween(String value1, String value2) {
            addCriterion("emp_place between", value1, value2, "empPlace");
            return (Criteria) this;
        }

        public Criteria andEmpPlaceNotBetween(String value1, String value2) {
            addCriterion("emp_place not between", value1, value2, "empPlace");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneIsNull() {
            addCriterion("emp_phone is null");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneIsNotNull() {
            addCriterion("emp_phone is not null");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneEqualTo(String value) {
            addCriterion("emp_phone =", value, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneNotEqualTo(String value) {
            addCriterion("emp_phone <>", value, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneGreaterThan(String value) {
            addCriterion("emp_phone >", value, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("emp_phone >=", value, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneLessThan(String value) {
            addCriterion("emp_phone <", value, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneLessThanOrEqualTo(String value) {
            addCriterion("emp_phone <=", value, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneLike(String value) {
            addCriterion("emp_phone like", value, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneNotLike(String value) {
            addCriterion("emp_phone not like", value, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneIn(List<String> values) {
            addCriterion("emp_phone in", values, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneNotIn(List<String> values) {
            addCriterion("emp_phone not in", values, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneBetween(String value1, String value2) {
            addCriterion("emp_phone between", value1, value2, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneNotBetween(String value1, String value2) {
            addCriterion("emp_phone not between", value1, value2, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpAddressIsNull() {
            addCriterion("emp_address is null");
            return (Criteria) this;
        }

        public Criteria andEmpAddressIsNotNull() {
            addCriterion("emp_address is not null");
            return (Criteria) this;
        }

        public Criteria andEmpAddressEqualTo(String value) {
            addCriterion("emp_address =", value, "empAddress");
            return (Criteria) this;
        }

        public Criteria andEmpAddressNotEqualTo(String value) {
            addCriterion("emp_address <>", value, "empAddress");
            return (Criteria) this;
        }

        public Criteria andEmpAddressGreaterThan(String value) {
            addCriterion("emp_address >", value, "empAddress");
            return (Criteria) this;
        }

        public Criteria andEmpAddressGreaterThanOrEqualTo(String value) {
            addCriterion("emp_address >=", value, "empAddress");
            return (Criteria) this;
        }

        public Criteria andEmpAddressLessThan(String value) {
            addCriterion("emp_address <", value, "empAddress");
            return (Criteria) this;
        }

        public Criteria andEmpAddressLessThanOrEqualTo(String value) {
            addCriterion("emp_address <=", value, "empAddress");
            return (Criteria) this;
        }

        public Criteria andEmpAddressLike(String value) {
            addCriterion("emp_address like", value, "empAddress");
            return (Criteria) this;
        }

        public Criteria andEmpAddressNotLike(String value) {
            addCriterion("emp_address not like", value, "empAddress");
            return (Criteria) this;
        }

        public Criteria andEmpAddressIn(List<String> values) {
            addCriterion("emp_address in", values, "empAddress");
            return (Criteria) this;
        }

        public Criteria andEmpAddressNotIn(List<String> values) {
            addCriterion("emp_address not in", values, "empAddress");
            return (Criteria) this;
        }

        public Criteria andEmpAddressBetween(String value1, String value2) {
            addCriterion("emp_address between", value1, value2, "empAddress");
            return (Criteria) this;
        }

        public Criteria andEmpAddressNotBetween(String value1, String value2) {
            addCriterion("emp_address not between", value1, value2, "empAddress");
            return (Criteria) this;
        }

        public Criteria andEmpCardidIsNull() {
            addCriterion("emp_cardID is null");
            return (Criteria) this;
        }

        public Criteria andEmpCardidIsNotNull() {
            addCriterion("emp_cardID is not null");
            return (Criteria) this;
        }

        public Criteria andEmpCardidEqualTo(String value) {
            addCriterion("emp_cardID =", value, "empCardid");
            return (Criteria) this;
        }

        public Criteria andEmpCardidNotEqualTo(String value) {
            addCriterion("emp_cardID <>", value, "empCardid");
            return (Criteria) this;
        }

        public Criteria andEmpCardidGreaterThan(String value) {
            addCriterion("emp_cardID >", value, "empCardid");
            return (Criteria) this;
        }

        public Criteria andEmpCardidGreaterThanOrEqualTo(String value) {
            addCriterion("emp_cardID >=", value, "empCardid");
            return (Criteria) this;
        }

        public Criteria andEmpCardidLessThan(String value) {
            addCriterion("emp_cardID <", value, "empCardid");
            return (Criteria) this;
        }

        public Criteria andEmpCardidLessThanOrEqualTo(String value) {
            addCriterion("emp_cardID <=", value, "empCardid");
            return (Criteria) this;
        }

        public Criteria andEmpCardidLike(String value) {
            addCriterion("emp_cardID like", value, "empCardid");
            return (Criteria) this;
        }

        public Criteria andEmpCardidNotLike(String value) {
            addCriterion("emp_cardID not like", value, "empCardid");
            return (Criteria) this;
        }

        public Criteria andEmpCardidIn(List<String> values) {
            addCriterion("emp_cardID in", values, "empCardid");
            return (Criteria) this;
        }

        public Criteria andEmpCardidNotIn(List<String> values) {
            addCriterion("emp_cardID not in", values, "empCardid");
            return (Criteria) this;
        }

        public Criteria andEmpCardidBetween(String value1, String value2) {
            addCriterion("emp_cardID between", value1, value2, "empCardid");
            return (Criteria) this;
        }

        public Criteria andEmpCardidNotBetween(String value1, String value2) {
            addCriterion("emp_cardID not between", value1, value2, "empCardid");
            return (Criteria) this;
        }

        public Criteria andEmpIdentityIsNull() {
            addCriterion("emp_identity is null");
            return (Criteria) this;
        }

        public Criteria andEmpIdentityIsNotNull() {
            addCriterion("emp_identity is not null");
            return (Criteria) this;
        }

        public Criteria andEmpIdentityEqualTo(String value) {
            addCriterion("emp_identity =", value, "empIdentity");
            return (Criteria) this;
        }

        public Criteria andEmpIdentityNotEqualTo(String value) {
            addCriterion("emp_identity <>", value, "empIdentity");
            return (Criteria) this;
        }

        public Criteria andEmpIdentityGreaterThan(String value) {
            addCriterion("emp_identity >", value, "empIdentity");
            return (Criteria) this;
        }

        public Criteria andEmpIdentityGreaterThanOrEqualTo(String value) {
            addCriterion("emp_identity >=", value, "empIdentity");
            return (Criteria) this;
        }

        public Criteria andEmpIdentityLessThan(String value) {
            addCriterion("emp_identity <", value, "empIdentity");
            return (Criteria) this;
        }

        public Criteria andEmpIdentityLessThanOrEqualTo(String value) {
            addCriterion("emp_identity <=", value, "empIdentity");
            return (Criteria) this;
        }

        public Criteria andEmpIdentityLike(String value) {
            addCriterion("emp_identity like", value, "empIdentity");
            return (Criteria) this;
        }

        public Criteria andEmpIdentityNotLike(String value) {
            addCriterion("emp_identity not like", value, "empIdentity");
            return (Criteria) this;
        }

        public Criteria andEmpIdentityIn(List<String> values) {
            addCriterion("emp_identity in", values, "empIdentity");
            return (Criteria) this;
        }

        public Criteria andEmpIdentityNotIn(List<String> values) {
            addCriterion("emp_identity not in", values, "empIdentity");
            return (Criteria) this;
        }

        public Criteria andEmpIdentityBetween(String value1, String value2) {
            addCriterion("emp_identity between", value1, value2, "empIdentity");
            return (Criteria) this;
        }

        public Criteria andEmpIdentityNotBetween(String value1, String value2) {
            addCriterion("emp_identity not between", value1, value2, "empIdentity");
            return (Criteria) this;
        }

        public Criteria andEmpJobIsNull() {
            addCriterion("emp_job is null");
            return (Criteria) this;
        }

        public Criteria andEmpJobIsNotNull() {
            addCriterion("emp_job is not null");
            return (Criteria) this;
        }

        public Criteria andEmpJobEqualTo(String value) {
            addCriterion("emp_job =", value, "empJob");
            return (Criteria) this;
        }

        public Criteria andEmpJobNotEqualTo(String value) {
            addCriterion("emp_job <>", value, "empJob");
            return (Criteria) this;
        }

        public Criteria andEmpJobGreaterThan(String value) {
            addCriterion("emp_job >", value, "empJob");
            return (Criteria) this;
        }

        public Criteria andEmpJobGreaterThanOrEqualTo(String value) {
            addCriterion("emp_job >=", value, "empJob");
            return (Criteria) this;
        }

        public Criteria andEmpJobLessThan(String value) {
            addCriterion("emp_job <", value, "empJob");
            return (Criteria) this;
        }

        public Criteria andEmpJobLessThanOrEqualTo(String value) {
            addCriterion("emp_job <=", value, "empJob");
            return (Criteria) this;
        }

        public Criteria andEmpJobLike(String value) {
            addCriterion("emp_job like", value, "empJob");
            return (Criteria) this;
        }

        public Criteria andEmpJobNotLike(String value) {
            addCriterion("emp_job not like", value, "empJob");
            return (Criteria) this;
        }

        public Criteria andEmpJobIn(List<String> values) {
            addCriterion("emp_job in", values, "empJob");
            return (Criteria) this;
        }

        public Criteria andEmpJobNotIn(List<String> values) {
            addCriterion("emp_job not in", values, "empJob");
            return (Criteria) this;
        }

        public Criteria andEmpJobBetween(String value1, String value2) {
            addCriterion("emp_job between", value1, value2, "empJob");
            return (Criteria) this;
        }

        public Criteria andEmpJobNotBetween(String value1, String value2) {
            addCriterion("emp_job not between", value1, value2, "empJob");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andEmpPhotoBigIsNull() {
            addCriterion("emp_photo_big is null");
            return (Criteria) this;
        }

        public Criteria andEmpPhotoBigIsNotNull() {
            addCriterion("emp_photo_big is not null");
            return (Criteria) this;
        }

        public Criteria andEmpPhotoBigEqualTo(String value) {
            addCriterion("emp_photo_big =", value, "empPhotoBig");
            return (Criteria) this;
        }

        public Criteria andEmpPhotoBigNotEqualTo(String value) {
            addCriterion("emp_photo_big <>", value, "empPhotoBig");
            return (Criteria) this;
        }

        public Criteria andEmpPhotoBigGreaterThan(String value) {
            addCriterion("emp_photo_big >", value, "empPhotoBig");
            return (Criteria) this;
        }

        public Criteria andEmpPhotoBigGreaterThanOrEqualTo(String value) {
            addCriterion("emp_photo_big >=", value, "empPhotoBig");
            return (Criteria) this;
        }

        public Criteria andEmpPhotoBigLessThan(String value) {
            addCriterion("emp_photo_big <", value, "empPhotoBig");
            return (Criteria) this;
        }

        public Criteria andEmpPhotoBigLessThanOrEqualTo(String value) {
            addCriterion("emp_photo_big <=", value, "empPhotoBig");
            return (Criteria) this;
        }

        public Criteria andEmpPhotoBigLike(String value) {
            addCriterion("emp_photo_big like", value, "empPhotoBig");
            return (Criteria) this;
        }

        public Criteria andEmpPhotoBigNotLike(String value) {
            addCriterion("emp_photo_big not like", value, "empPhotoBig");
            return (Criteria) this;
        }

        public Criteria andEmpPhotoBigIn(List<String> values) {
            addCriterion("emp_photo_big in", values, "empPhotoBig");
            return (Criteria) this;
        }

        public Criteria andEmpPhotoBigNotIn(List<String> values) {
            addCriterion("emp_photo_big not in", values, "empPhotoBig");
            return (Criteria) this;
        }

        public Criteria andEmpPhotoBigBetween(String value1, String value2) {
            addCriterion("emp_photo_big between", value1, value2, "empPhotoBig");
            return (Criteria) this;
        }

        public Criteria andEmpPhotoBigNotBetween(String value1, String value2) {
            addCriterion("emp_photo_big not between", value1, value2, "empPhotoBig");
            return (Criteria) this;
        }

        public Criteria andEmpPhotoLittleIsNull() {
            addCriterion("emp_photo_little is null");
            return (Criteria) this;
        }

        public Criteria andEmpPhotoLittleIsNotNull() {
            addCriterion("emp_photo_little is not null");
            return (Criteria) this;
        }

        public Criteria andEmpPhotoLittleEqualTo(String value) {
            addCriterion("emp_photo_little =", value, "empPhotoLittle");
            return (Criteria) this;
        }

        public Criteria andEmpPhotoLittleNotEqualTo(String value) {
            addCriterion("emp_photo_little <>", value, "empPhotoLittle");
            return (Criteria) this;
        }

        public Criteria andEmpPhotoLittleGreaterThan(String value) {
            addCriterion("emp_photo_little >", value, "empPhotoLittle");
            return (Criteria) this;
        }

        public Criteria andEmpPhotoLittleGreaterThanOrEqualTo(String value) {
            addCriterion("emp_photo_little >=", value, "empPhotoLittle");
            return (Criteria) this;
        }

        public Criteria andEmpPhotoLittleLessThan(String value) {
            addCriterion("emp_photo_little <", value, "empPhotoLittle");
            return (Criteria) this;
        }

        public Criteria andEmpPhotoLittleLessThanOrEqualTo(String value) {
            addCriterion("emp_photo_little <=", value, "empPhotoLittle");
            return (Criteria) this;
        }

        public Criteria andEmpPhotoLittleLike(String value) {
            addCriterion("emp_photo_little like", value, "empPhotoLittle");
            return (Criteria) this;
        }

        public Criteria andEmpPhotoLittleNotLike(String value) {
            addCriterion("emp_photo_little not like", value, "empPhotoLittle");
            return (Criteria) this;
        }

        public Criteria andEmpPhotoLittleIn(List<String> values) {
            addCriterion("emp_photo_little in", values, "empPhotoLittle");
            return (Criteria) this;
        }

        public Criteria andEmpPhotoLittleNotIn(List<String> values) {
            addCriterion("emp_photo_little not in", values, "empPhotoLittle");
            return (Criteria) this;
        }

        public Criteria andEmpPhotoLittleBetween(String value1, String value2) {
            addCriterion("emp_photo_little between", value1, value2, "empPhotoLittle");
            return (Criteria) this;
        }

        public Criteria andEmpPhotoLittleNotBetween(String value1, String value2) {
            addCriterion("emp_photo_little not between", value1, value2, "empPhotoLittle");
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