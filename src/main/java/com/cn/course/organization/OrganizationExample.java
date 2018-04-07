package com.cn.course.organization;

import java.util.ArrayList;
import java.util.List;

public class OrganizationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrganizationExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNull() {
            addCriterion("introduction is null");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNotNull() {
            addCriterion("introduction is not null");
            return (Criteria) this;
        }

        public Criteria andIntroductionEqualTo(String value) {
            addCriterion("introduction =", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotEqualTo(String value) {
            addCriterion("introduction <>", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThan(String value) {
            addCriterion("introduction >", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("introduction >=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThan(String value) {
            addCriterion("introduction <", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThanOrEqualTo(String value) {
            addCriterion("introduction <=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLike(String value) {
            addCriterion("introduction like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotLike(String value) {
            addCriterion("introduction not like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionIn(List<String> values) {
            addCriterion("introduction in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotIn(List<String> values) {
            addCriterion("introduction not in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionBetween(String value1, String value2) {
            addCriterion("introduction between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotBetween(String value1, String value2) {
            addCriterion("introduction not between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeIsNull() {
            addCriterion("businesscode is null");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeIsNotNull() {
            addCriterion("businesscode is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeEqualTo(String value) {
            addCriterion("businesscode =", value, "businesscode");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeNotEqualTo(String value) {
            addCriterion("businesscode <>", value, "businesscode");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeGreaterThan(String value) {
            addCriterion("businesscode >", value, "businesscode");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeGreaterThanOrEqualTo(String value) {
            addCriterion("businesscode >=", value, "businesscode");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeLessThan(String value) {
            addCriterion("businesscode <", value, "businesscode");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeLessThanOrEqualTo(String value) {
            addCriterion("businesscode <=", value, "businesscode");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeLike(String value) {
            addCriterion("businesscode like", value, "businesscode");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeNotLike(String value) {
            addCriterion("businesscode not like", value, "businesscode");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeIn(List<String> values) {
            addCriterion("businesscode in", values, "businesscode");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeNotIn(List<String> values) {
            addCriterion("businesscode not in", values, "businesscode");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeBetween(String value1, String value2) {
            addCriterion("businesscode between", value1, value2, "businesscode");
            return (Criteria) this;
        }

        public Criteria andBusinesscodeNotBetween(String value1, String value2) {
            addCriterion("businesscode not between", value1, value2, "businesscode");
            return (Criteria) this;
        }

        public Criteria andExperienceIsNull() {
            addCriterion("experience is null");
            return (Criteria) this;
        }

        public Criteria andExperienceIsNotNull() {
            addCriterion("experience is not null");
            return (Criteria) this;
        }

        public Criteria andExperienceEqualTo(String value) {
            addCriterion("experience =", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceNotEqualTo(String value) {
            addCriterion("experience <>", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceGreaterThan(String value) {
            addCriterion("experience >", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceGreaterThanOrEqualTo(String value) {
            addCriterion("experience >=", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceLessThan(String value) {
            addCriterion("experience <", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceLessThanOrEqualTo(String value) {
            addCriterion("experience <=", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceLike(String value) {
            addCriterion("experience like", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceNotLike(String value) {
            addCriterion("experience not like", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceIn(List<String> values) {
            addCriterion("experience in", values, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceNotIn(List<String> values) {
            addCriterion("experience not in", values, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceBetween(String value1, String value2) {
            addCriterion("experience between", value1, value2, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceNotBetween(String value1, String value2) {
            addCriterion("experience not between", value1, value2, "experience");
            return (Criteria) this;
        }

        public Criteria andExperience1IsNull() {
            addCriterion("experience1 is null");
            return (Criteria) this;
        }

        public Criteria andExperience1IsNotNull() {
            addCriterion("experience1 is not null");
            return (Criteria) this;
        }

        public Criteria andExperience1EqualTo(String value) {
            addCriterion("experience1 =", value, "experience1");
            return (Criteria) this;
        }

        public Criteria andExperience1NotEqualTo(String value) {
            addCriterion("experience1 <>", value, "experience1");
            return (Criteria) this;
        }

        public Criteria andExperience1GreaterThan(String value) {
            addCriterion("experience1 >", value, "experience1");
            return (Criteria) this;
        }

        public Criteria andExperience1GreaterThanOrEqualTo(String value) {
            addCriterion("experience1 >=", value, "experience1");
            return (Criteria) this;
        }

        public Criteria andExperience1LessThan(String value) {
            addCriterion("experience1 <", value, "experience1");
            return (Criteria) this;
        }

        public Criteria andExperience1LessThanOrEqualTo(String value) {
            addCriterion("experience1 <=", value, "experience1");
            return (Criteria) this;
        }

        public Criteria andExperience1Like(String value) {
            addCriterion("experience1 like", value, "experience1");
            return (Criteria) this;
        }

        public Criteria andExperience1NotLike(String value) {
            addCriterion("experience1 not like", value, "experience1");
            return (Criteria) this;
        }

        public Criteria andExperience1In(List<String> values) {
            addCriterion("experience1 in", values, "experience1");
            return (Criteria) this;
        }

        public Criteria andExperience1NotIn(List<String> values) {
            addCriterion("experience1 not in", values, "experience1");
            return (Criteria) this;
        }

        public Criteria andExperience1Between(String value1, String value2) {
            addCriterion("experience1 between", value1, value2, "experience1");
            return (Criteria) this;
        }

        public Criteria andExperience1NotBetween(String value1, String value2) {
            addCriterion("experience1 not between", value1, value2, "experience1");
            return (Criteria) this;
        }

        public Criteria andExperience2IsNull() {
            addCriterion("experience2 is null");
            return (Criteria) this;
        }

        public Criteria andExperience2IsNotNull() {
            addCriterion("experience2 is not null");
            return (Criteria) this;
        }

        public Criteria andExperience2EqualTo(String value) {
            addCriterion("experience2 =", value, "experience2");
            return (Criteria) this;
        }

        public Criteria andExperience2NotEqualTo(String value) {
            addCriterion("experience2 <>", value, "experience2");
            return (Criteria) this;
        }

        public Criteria andExperience2GreaterThan(String value) {
            addCriterion("experience2 >", value, "experience2");
            return (Criteria) this;
        }

        public Criteria andExperience2GreaterThanOrEqualTo(String value) {
            addCriterion("experience2 >=", value, "experience2");
            return (Criteria) this;
        }

        public Criteria andExperience2LessThan(String value) {
            addCriterion("experience2 <", value, "experience2");
            return (Criteria) this;
        }

        public Criteria andExperience2LessThanOrEqualTo(String value) {
            addCriterion("experience2 <=", value, "experience2");
            return (Criteria) this;
        }

        public Criteria andExperience2Like(String value) {
            addCriterion("experience2 like", value, "experience2");
            return (Criteria) this;
        }

        public Criteria andExperience2NotLike(String value) {
            addCriterion("experience2 not like", value, "experience2");
            return (Criteria) this;
        }

        public Criteria andExperience2In(List<String> values) {
            addCriterion("experience2 in", values, "experience2");
            return (Criteria) this;
        }

        public Criteria andExperience2NotIn(List<String> values) {
            addCriterion("experience2 not in", values, "experience2");
            return (Criteria) this;
        }

        public Criteria andExperience2Between(String value1, String value2) {
            addCriterion("experience2 between", value1, value2, "experience2");
            return (Criteria) this;
        }

        public Criteria andExperience2NotBetween(String value1, String value2) {
            addCriterion("experience2 not between", value1, value2, "experience2");
            return (Criteria) this;
        }

        public Criteria andExperience3IsNull() {
            addCriterion("experience3 is null");
            return (Criteria) this;
        }

        public Criteria andExperience3IsNotNull() {
            addCriterion("experience3 is not null");
            return (Criteria) this;
        }

        public Criteria andExperience3EqualTo(String value) {
            addCriterion("experience3 =", value, "experience3");
            return (Criteria) this;
        }

        public Criteria andExperience3NotEqualTo(String value) {
            addCriterion("experience3 <>", value, "experience3");
            return (Criteria) this;
        }

        public Criteria andExperience3GreaterThan(String value) {
            addCriterion("experience3 >", value, "experience3");
            return (Criteria) this;
        }

        public Criteria andExperience3GreaterThanOrEqualTo(String value) {
            addCriterion("experience3 >=", value, "experience3");
            return (Criteria) this;
        }

        public Criteria andExperience3LessThan(String value) {
            addCriterion("experience3 <", value, "experience3");
            return (Criteria) this;
        }

        public Criteria andExperience3LessThanOrEqualTo(String value) {
            addCriterion("experience3 <=", value, "experience3");
            return (Criteria) this;
        }

        public Criteria andExperience3Like(String value) {
            addCriterion("experience3 like", value, "experience3");
            return (Criteria) this;
        }

        public Criteria andExperience3NotLike(String value) {
            addCriterion("experience3 not like", value, "experience3");
            return (Criteria) this;
        }

        public Criteria andExperience3In(List<String> values) {
            addCriterion("experience3 in", values, "experience3");
            return (Criteria) this;
        }

        public Criteria andExperience3NotIn(List<String> values) {
            addCriterion("experience3 not in", values, "experience3");
            return (Criteria) this;
        }

        public Criteria andExperience3Between(String value1, String value2) {
            addCriterion("experience3 between", value1, value2, "experience3");
            return (Criteria) this;
        }

        public Criteria andExperience3NotBetween(String value1, String value2) {
            addCriterion("experience3 not between", value1, value2, "experience3");
            return (Criteria) this;
        }

        public Criteria andExperience4IsNull() {
            addCriterion("experience4 is null");
            return (Criteria) this;
        }

        public Criteria andExperience4IsNotNull() {
            addCriterion("experience4 is not null");
            return (Criteria) this;
        }

        public Criteria andExperience4EqualTo(String value) {
            addCriterion("experience4 =", value, "experience4");
            return (Criteria) this;
        }

        public Criteria andExperience4NotEqualTo(String value) {
            addCriterion("experience4 <>", value, "experience4");
            return (Criteria) this;
        }

        public Criteria andExperience4GreaterThan(String value) {
            addCriterion("experience4 >", value, "experience4");
            return (Criteria) this;
        }

        public Criteria andExperience4GreaterThanOrEqualTo(String value) {
            addCriterion("experience4 >=", value, "experience4");
            return (Criteria) this;
        }

        public Criteria andExperience4LessThan(String value) {
            addCriterion("experience4 <", value, "experience4");
            return (Criteria) this;
        }

        public Criteria andExperience4LessThanOrEqualTo(String value) {
            addCriterion("experience4 <=", value, "experience4");
            return (Criteria) this;
        }

        public Criteria andExperience4Like(String value) {
            addCriterion("experience4 like", value, "experience4");
            return (Criteria) this;
        }

        public Criteria andExperience4NotLike(String value) {
            addCriterion("experience4 not like", value, "experience4");
            return (Criteria) this;
        }

        public Criteria andExperience4In(List<String> values) {
            addCriterion("experience4 in", values, "experience4");
            return (Criteria) this;
        }

        public Criteria andExperience4NotIn(List<String> values) {
            addCriterion("experience4 not in", values, "experience4");
            return (Criteria) this;
        }

        public Criteria andExperience4Between(String value1, String value2) {
            addCriterion("experience4 between", value1, value2, "experience4");
            return (Criteria) this;
        }

        public Criteria andExperience4NotBetween(String value1, String value2) {
            addCriterion("experience4 not between", value1, value2, "experience4");
            return (Criteria) this;
        }

        public Criteria andExperience5IsNull() {
            addCriterion("experience5 is null");
            return (Criteria) this;
        }

        public Criteria andExperience5IsNotNull() {
            addCriterion("experience5 is not null");
            return (Criteria) this;
        }

        public Criteria andExperience5EqualTo(String value) {
            addCriterion("experience5 =", value, "experience5");
            return (Criteria) this;
        }

        public Criteria andExperience5NotEqualTo(String value) {
            addCriterion("experience5 <>", value, "experience5");
            return (Criteria) this;
        }

        public Criteria andExperience5GreaterThan(String value) {
            addCriterion("experience5 >", value, "experience5");
            return (Criteria) this;
        }

        public Criteria andExperience5GreaterThanOrEqualTo(String value) {
            addCriterion("experience5 >=", value, "experience5");
            return (Criteria) this;
        }

        public Criteria andExperience5LessThan(String value) {
            addCriterion("experience5 <", value, "experience5");
            return (Criteria) this;
        }

        public Criteria andExperience5LessThanOrEqualTo(String value) {
            addCriterion("experience5 <=", value, "experience5");
            return (Criteria) this;
        }

        public Criteria andExperience5Like(String value) {
            addCriterion("experience5 like", value, "experience5");
            return (Criteria) this;
        }

        public Criteria andExperience5NotLike(String value) {
            addCriterion("experience5 not like", value, "experience5");
            return (Criteria) this;
        }

        public Criteria andExperience5In(List<String> values) {
            addCriterion("experience5 in", values, "experience5");
            return (Criteria) this;
        }

        public Criteria andExperience5NotIn(List<String> values) {
            addCriterion("experience5 not in", values, "experience5");
            return (Criteria) this;
        }

        public Criteria andExperience5Between(String value1, String value2) {
            addCriterion("experience5 between", value1, value2, "experience5");
            return (Criteria) this;
        }

        public Criteria andExperience5NotBetween(String value1, String value2) {
            addCriterion("experience5 not between", value1, value2, "experience5");
            return (Criteria) this;
        }

        public Criteria andExperience6IsNull() {
            addCriterion("experience6 is null");
            return (Criteria) this;
        }

        public Criteria andExperience6IsNotNull() {
            addCriterion("experience6 is not null");
            return (Criteria) this;
        }

        public Criteria andExperience6EqualTo(String value) {
            addCriterion("experience6 =", value, "experience6");
            return (Criteria) this;
        }

        public Criteria andExperience6NotEqualTo(String value) {
            addCriterion("experience6 <>", value, "experience6");
            return (Criteria) this;
        }

        public Criteria andExperience6GreaterThan(String value) {
            addCriterion("experience6 >", value, "experience6");
            return (Criteria) this;
        }

        public Criteria andExperience6GreaterThanOrEqualTo(String value) {
            addCriterion("experience6 >=", value, "experience6");
            return (Criteria) this;
        }

        public Criteria andExperience6LessThan(String value) {
            addCriterion("experience6 <", value, "experience6");
            return (Criteria) this;
        }

        public Criteria andExperience6LessThanOrEqualTo(String value) {
            addCriterion("experience6 <=", value, "experience6");
            return (Criteria) this;
        }

        public Criteria andExperience6Like(String value) {
            addCriterion("experience6 like", value, "experience6");
            return (Criteria) this;
        }

        public Criteria andExperience6NotLike(String value) {
            addCriterion("experience6 not like", value, "experience6");
            return (Criteria) this;
        }

        public Criteria andExperience6In(List<String> values) {
            addCriterion("experience6 in", values, "experience6");
            return (Criteria) this;
        }

        public Criteria andExperience6NotIn(List<String> values) {
            addCriterion("experience6 not in", values, "experience6");
            return (Criteria) this;
        }

        public Criteria andExperience6Between(String value1, String value2) {
            addCriterion("experience6 between", value1, value2, "experience6");
            return (Criteria) this;
        }

        public Criteria andExperience6NotBetween(String value1, String value2) {
            addCriterion("experience6 not between", value1, value2, "experience6");
            return (Criteria) this;
        }

        public Criteria andExperience7IsNull() {
            addCriterion("experience7 is null");
            return (Criteria) this;
        }

        public Criteria andExperience7IsNotNull() {
            addCriterion("experience7 is not null");
            return (Criteria) this;
        }

        public Criteria andExperience7EqualTo(String value) {
            addCriterion("experience7 =", value, "experience7");
            return (Criteria) this;
        }

        public Criteria andExperience7NotEqualTo(String value) {
            addCriterion("experience7 <>", value, "experience7");
            return (Criteria) this;
        }

        public Criteria andExperience7GreaterThan(String value) {
            addCriterion("experience7 >", value, "experience7");
            return (Criteria) this;
        }

        public Criteria andExperience7GreaterThanOrEqualTo(String value) {
            addCriterion("experience7 >=", value, "experience7");
            return (Criteria) this;
        }

        public Criteria andExperience7LessThan(String value) {
            addCriterion("experience7 <", value, "experience7");
            return (Criteria) this;
        }

        public Criteria andExperience7LessThanOrEqualTo(String value) {
            addCriterion("experience7 <=", value, "experience7");
            return (Criteria) this;
        }

        public Criteria andExperience7Like(String value) {
            addCriterion("experience7 like", value, "experience7");
            return (Criteria) this;
        }

        public Criteria andExperience7NotLike(String value) {
            addCriterion("experience7 not like", value, "experience7");
            return (Criteria) this;
        }

        public Criteria andExperience7In(List<String> values) {
            addCriterion("experience7 in", values, "experience7");
            return (Criteria) this;
        }

        public Criteria andExperience7NotIn(List<String> values) {
            addCriterion("experience7 not in", values, "experience7");
            return (Criteria) this;
        }

        public Criteria andExperience7Between(String value1, String value2) {
            addCriterion("experience7 between", value1, value2, "experience7");
            return (Criteria) this;
        }

        public Criteria andExperience7NotBetween(String value1, String value2) {
            addCriterion("experience7 not between", value1, value2, "experience7");
            return (Criteria) this;
        }

        public Criteria andIsvalidIsNull() {
            addCriterion("isvalid is null");
            return (Criteria) this;
        }

        public Criteria andIsvalidIsNotNull() {
            addCriterion("isvalid is not null");
            return (Criteria) this;
        }

        public Criteria andIsvalidEqualTo(Integer value) {
            addCriterion("isvalid =", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidNotEqualTo(Integer value) {
            addCriterion("isvalid <>", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidGreaterThan(Integer value) {
            addCriterion("isvalid >", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidGreaterThanOrEqualTo(Integer value) {
            addCriterion("isvalid >=", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidLessThan(Integer value) {
            addCriterion("isvalid <", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidLessThanOrEqualTo(Integer value) {
            addCriterion("isvalid <=", value, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidIn(List<Integer> values) {
            addCriterion("isvalid in", values, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidNotIn(List<Integer> values) {
            addCriterion("isvalid not in", values, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidBetween(Integer value1, Integer value2) {
            addCriterion("isvalid between", value1, value2, "isvalid");
            return (Criteria) this;
        }

        public Criteria andIsvalidNotBetween(Integer value1, Integer value2) {
            addCriterion("isvalid not between", value1, value2, "isvalid");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andQqIsNull() {
            addCriterion("qq is null");
            return (Criteria) this;
        }

        public Criteria andQqIsNotNull() {
            addCriterion("qq is not null");
            return (Criteria) this;
        }

        public Criteria andQqEqualTo(String value) {
            addCriterion("qq =", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotEqualTo(String value) {
            addCriterion("qq <>", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThan(String value) {
            addCriterion("qq >", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThanOrEqualTo(String value) {
            addCriterion("qq >=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThan(String value) {
            addCriterion("qq <", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThanOrEqualTo(String value) {
            addCriterion("qq <=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLike(String value) {
            addCriterion("qq like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotLike(String value) {
            addCriterion("qq not like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqIn(List<String> values) {
            addCriterion("qq in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotIn(List<String> values) {
            addCriterion("qq not in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqBetween(String value1, String value2) {
            addCriterion("qq between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotBetween(String value1, String value2) {
            addCriterion("qq not between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andQqgroupIsNull() {
            addCriterion("qqgroup is null");
            return (Criteria) this;
        }

        public Criteria andQqgroupIsNotNull() {
            addCriterion("qqgroup is not null");
            return (Criteria) this;
        }

        public Criteria andQqgroupEqualTo(String value) {
            addCriterion("qqgroup =", value, "qqgroup");
            return (Criteria) this;
        }

        public Criteria andQqgroupNotEqualTo(String value) {
            addCriterion("qqgroup <>", value, "qqgroup");
            return (Criteria) this;
        }

        public Criteria andQqgroupGreaterThan(String value) {
            addCriterion("qqgroup >", value, "qqgroup");
            return (Criteria) this;
        }

        public Criteria andQqgroupGreaterThanOrEqualTo(String value) {
            addCriterion("qqgroup >=", value, "qqgroup");
            return (Criteria) this;
        }

        public Criteria andQqgroupLessThan(String value) {
            addCriterion("qqgroup <", value, "qqgroup");
            return (Criteria) this;
        }

        public Criteria andQqgroupLessThanOrEqualTo(String value) {
            addCriterion("qqgroup <=", value, "qqgroup");
            return (Criteria) this;
        }

        public Criteria andQqgroupLike(String value) {
            addCriterion("qqgroup like", value, "qqgroup");
            return (Criteria) this;
        }

        public Criteria andQqgroupNotLike(String value) {
            addCriterion("qqgroup not like", value, "qqgroup");
            return (Criteria) this;
        }

        public Criteria andQqgroupIn(List<String> values) {
            addCriterion("qqgroup in", values, "qqgroup");
            return (Criteria) this;
        }

        public Criteria andQqgroupNotIn(List<String> values) {
            addCriterion("qqgroup not in", values, "qqgroup");
            return (Criteria) this;
        }

        public Criteria andQqgroupBetween(String value1, String value2) {
            addCriterion("qqgroup between", value1, value2, "qqgroup");
            return (Criteria) this;
        }

        public Criteria andQqgroupNotBetween(String value1, String value2) {
            addCriterion("qqgroup not between", value1, value2, "qqgroup");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNull() {
            addCriterion("photo is null");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNotNull() {
            addCriterion("photo is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoEqualTo(String value) {
            addCriterion("photo =", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotEqualTo(String value) {
            addCriterion("photo <>", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThan(String value) {
            addCriterion("photo >", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("photo >=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThan(String value) {
            addCriterion("photo <", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThanOrEqualTo(String value) {
            addCriterion("photo <=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLike(String value) {
            addCriterion("photo like", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotLike(String value) {
            addCriterion("photo not like", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoIn(List<String> values) {
            addCriterion("photo in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotIn(List<String> values) {
            addCriterion("photo not in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoBetween(String value1, String value2) {
            addCriterion("photo between", value1, value2, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotBetween(String value1, String value2) {
            addCriterion("photo not between", value1, value2, "photo");
            return (Criteria) this;
        }

        public Criteria andLinkIsNull() {
            addCriterion("link is null");
            return (Criteria) this;
        }

        public Criteria andLinkIsNotNull() {
            addCriterion("link is not null");
            return (Criteria) this;
        }

        public Criteria andLinkEqualTo(String value) {
            addCriterion("link =", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkNotEqualTo(String value) {
            addCriterion("link <>", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkGreaterThan(String value) {
            addCriterion("link >", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkGreaterThanOrEqualTo(String value) {
            addCriterion("link >=", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkLessThan(String value) {
            addCriterion("link <", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkLessThanOrEqualTo(String value) {
            addCriterion("link <=", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkLike(String value) {
            addCriterion("link like", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkNotLike(String value) {
            addCriterion("link not like", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkIn(List<String> values) {
            addCriterion("link in", values, "link");
            return (Criteria) this;
        }

        public Criteria andLinkNotIn(List<String> values) {
            addCriterion("link not in", values, "link");
            return (Criteria) this;
        }

        public Criteria andLinkBetween(String value1, String value2) {
            addCriterion("link between", value1, value2, "link");
            return (Criteria) this;
        }

        public Criteria andLinkNotBetween(String value1, String value2) {
            addCriterion("link not between", value1, value2, "link");
            return (Criteria) this;
        }

        public Criteria andStudentnumIsNull() {
            addCriterion("studentnum is null");
            return (Criteria) this;
        }

        public Criteria andStudentnumIsNotNull() {
            addCriterion("studentnum is not null");
            return (Criteria) this;
        }

        public Criteria andStudentnumEqualTo(Integer value) {
            addCriterion("studentnum =", value, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumNotEqualTo(Integer value) {
            addCriterion("studentnum <>", value, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumGreaterThan(Integer value) {
            addCriterion("studentnum >", value, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("studentnum >=", value, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumLessThan(Integer value) {
            addCriterion("studentnum <", value, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumLessThanOrEqualTo(Integer value) {
            addCriterion("studentnum <=", value, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumIn(List<Integer> values) {
            addCriterion("studentnum in", values, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumNotIn(List<Integer> values) {
            addCriterion("studentnum not in", values, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumBetween(Integer value1, Integer value2) {
            addCriterion("studentnum between", value1, value2, "studentnum");
            return (Criteria) this;
        }

        public Criteria andStudentnumNotBetween(Integer value1, Integer value2) {
            addCriterion("studentnum not between", value1, value2, "studentnum");
            return (Criteria) this;
        }

        public Criteria andTeachernumIsNull() {
            addCriterion("teachernum is null");
            return (Criteria) this;
        }

        public Criteria andTeachernumIsNotNull() {
            addCriterion("teachernum is not null");
            return (Criteria) this;
        }

        public Criteria andTeachernumEqualTo(Integer value) {
            addCriterion("teachernum =", value, "teachernum");
            return (Criteria) this;
        }

        public Criteria andTeachernumNotEqualTo(Integer value) {
            addCriterion("teachernum <>", value, "teachernum");
            return (Criteria) this;
        }

        public Criteria andTeachernumGreaterThan(Integer value) {
            addCriterion("teachernum >", value, "teachernum");
            return (Criteria) this;
        }

        public Criteria andTeachernumGreaterThanOrEqualTo(Integer value) {
            addCriterion("teachernum >=", value, "teachernum");
            return (Criteria) this;
        }

        public Criteria andTeachernumLessThan(Integer value) {
            addCriterion("teachernum <", value, "teachernum");
            return (Criteria) this;
        }

        public Criteria andTeachernumLessThanOrEqualTo(Integer value) {
            addCriterion("teachernum <=", value, "teachernum");
            return (Criteria) this;
        }

        public Criteria andTeachernumIn(List<Integer> values) {
            addCriterion("teachernum in", values, "teachernum");
            return (Criteria) this;
        }

        public Criteria andTeachernumNotIn(List<Integer> values) {
            addCriterion("teachernum not in", values, "teachernum");
            return (Criteria) this;
        }

        public Criteria andTeachernumBetween(Integer value1, Integer value2) {
            addCriterion("teachernum between", value1, value2, "teachernum");
            return (Criteria) this;
        }

        public Criteria andTeachernumNotBetween(Integer value1, Integer value2) {
            addCriterion("teachernum not between", value1, value2, "teachernum");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Integer value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Integer value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Integer value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Integer value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Integer value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Integer> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Integer> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Integer value1, Integer value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andAssessorIsNull() {
            addCriterion("assessor is null");
            return (Criteria) this;
        }

        public Criteria andAssessorIsNotNull() {
            addCriterion("assessor is not null");
            return (Criteria) this;
        }

        public Criteria andAssessorEqualTo(Integer value) {
            addCriterion("assessor =", value, "assessor");
            return (Criteria) this;
        }

        public Criteria andAssessorNotEqualTo(Integer value) {
            addCriterion("assessor <>", value, "assessor");
            return (Criteria) this;
        }

        public Criteria andAssessorGreaterThan(Integer value) {
            addCriterion("assessor >", value, "assessor");
            return (Criteria) this;
        }

        public Criteria andAssessorGreaterThanOrEqualTo(Integer value) {
            addCriterion("assessor >=", value, "assessor");
            return (Criteria) this;
        }

        public Criteria andAssessorLessThan(Integer value) {
            addCriterion("assessor <", value, "assessor");
            return (Criteria) this;
        }

        public Criteria andAssessorLessThanOrEqualTo(Integer value) {
            addCriterion("assessor <=", value, "assessor");
            return (Criteria) this;
        }

        public Criteria andAssessorIn(List<Integer> values) {
            addCriterion("assessor in", values, "assessor");
            return (Criteria) this;
        }

        public Criteria andAssessorNotIn(List<Integer> values) {
            addCriterion("assessor not in", values, "assessor");
            return (Criteria) this;
        }

        public Criteria andAssessorBetween(Integer value1, Integer value2) {
            addCriterion("assessor between", value1, value2, "assessor");
            return (Criteria) this;
        }

        public Criteria andAssessorNotBetween(Integer value1, Integer value2) {
            addCriterion("assessor not between", value1, value2, "assessor");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(Integer value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(Integer value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(Integer value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(Integer value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<Integer> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<Integer> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(Integer value1, Integer value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andTimestampIsNull() {
            addCriterion("timestamp is null");
            return (Criteria) this;
        }

        public Criteria andTimestampIsNotNull() {
            addCriterion("timestamp is not null");
            return (Criteria) this;
        }

        public Criteria andTimestampEqualTo(String value) {
            addCriterion("timestamp =", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotEqualTo(String value) {
            addCriterion("timestamp <>", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampGreaterThan(String value) {
            addCriterion("timestamp >", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampGreaterThanOrEqualTo(String value) {
            addCriterion("timestamp >=", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampLessThan(String value) {
            addCriterion("timestamp <", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampLessThanOrEqualTo(String value) {
            addCriterion("timestamp <=", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampLike(String value) {
            addCriterion("timestamp like", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotLike(String value) {
            addCriterion("timestamp not like", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampIn(List<String> values) {
            addCriterion("timestamp in", values, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotIn(List<String> values) {
            addCriterion("timestamp not in", values, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampBetween(String value1, String value2) {
            addCriterion("timestamp between", value1, value2, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotBetween(String value1, String value2) {
            addCriterion("timestamp not between", value1, value2, "timestamp");
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