package com.unicorn.tlgasoline.entity;

import java.util.ArrayList;
import java.util.List;

public class OilJlExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OilJlExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andFydateIsNull() {
            addCriterion("FYDATE is null");
            return (Criteria) this;
        }

        public Criteria andFydateIsNotNull() {
            addCriterion("FYDATE is not null");
            return (Criteria) this;
        }

        public Criteria andFydateEqualTo(String value) {
            addCriterion("FYDATE =", value, "fydate");
            return (Criteria) this;
        }

        public Criteria andFydateNotEqualTo(String value) {
            addCriterion("FYDATE <>", value, "fydate");
            return (Criteria) this;
        }

        public Criteria andFydateGreaterThan(String value) {
            addCriterion("FYDATE >", value, "fydate");
            return (Criteria) this;
        }

        public Criteria andFydateGreaterThanOrEqualTo(String value) {
            addCriterion("FYDATE >=", value, "fydate");
            return (Criteria) this;
        }

        public Criteria andFydateLessThan(String value) {
            addCriterion("FYDATE <", value, "fydate");
            return (Criteria) this;
        }

        public Criteria andFydateLessThanOrEqualTo(String value) {
            addCriterion("FYDATE <=", value, "fydate");
            return (Criteria) this;
        }

        public Criteria andFydateLike(String value) {
            addCriterion("FYDATE like", value, "fydate");
            return (Criteria) this;
        }

        public Criteria andFydateNotLike(String value) {
            addCriterion("FYDATE not like", value, "fydate");
            return (Criteria) this;
        }

        public Criteria andFydateIn(List<String> values) {
            addCriterion("FYDATE in", values, "fydate");
            return (Criteria) this;
        }

        public Criteria andFydateNotIn(List<String> values) {
            addCriterion("FYDATE not in", values, "fydate");
            return (Criteria) this;
        }

        public Criteria andFydateBetween(String value1, String value2) {
            addCriterion("FYDATE between", value1, value2, "fydate");
            return (Criteria) this;
        }

        public Criteria andFydateNotBetween(String value1, String value2) {
            addCriterion("FYDATE not between", value1, value2, "fydate");
            return (Criteria) this;
        }

        public Criteria andFysttimeIsNull() {
            addCriterion("FYSTTIME is null");
            return (Criteria) this;
        }

        public Criteria andFysttimeIsNotNull() {
            addCriterion("FYSTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andFysttimeEqualTo(String value) {
            addCriterion("FYSTTIME =", value, "fysttime");
            return (Criteria) this;
        }

        public Criteria andFysttimeNotEqualTo(String value) {
            addCriterion("FYSTTIME <>", value, "fysttime");
            return (Criteria) this;
        }

        public Criteria andFysttimeGreaterThan(String value) {
            addCriterion("FYSTTIME >", value, "fysttime");
            return (Criteria) this;
        }

        public Criteria andFysttimeGreaterThanOrEqualTo(String value) {
            addCriterion("FYSTTIME >=", value, "fysttime");
            return (Criteria) this;
        }

        public Criteria andFysttimeLessThan(String value) {
            addCriterion("FYSTTIME <", value, "fysttime");
            return (Criteria) this;
        }

        public Criteria andFysttimeLessThanOrEqualTo(String value) {
            addCriterion("FYSTTIME <=", value, "fysttime");
            return (Criteria) this;
        }

        public Criteria andFysttimeLike(String value) {
            addCriterion("FYSTTIME like", value, "fysttime");
            return (Criteria) this;
        }

        public Criteria andFysttimeNotLike(String value) {
            addCriterion("FYSTTIME not like", value, "fysttime");
            return (Criteria) this;
        }

        public Criteria andFysttimeIn(List<String> values) {
            addCriterion("FYSTTIME in", values, "fysttime");
            return (Criteria) this;
        }

        public Criteria andFysttimeNotIn(List<String> values) {
            addCriterion("FYSTTIME not in", values, "fysttime");
            return (Criteria) this;
        }

        public Criteria andFysttimeBetween(String value1, String value2) {
            addCriterion("FYSTTIME between", value1, value2, "fysttime");
            return (Criteria) this;
        }

        public Criteria andFysttimeNotBetween(String value1, String value2) {
            addCriterion("FYSTTIME not between", value1, value2, "fysttime");
            return (Criteria) this;
        }

        public Criteria andFyedtimeIsNull() {
            addCriterion("FYEDTIME is null");
            return (Criteria) this;
        }

        public Criteria andFyedtimeIsNotNull() {
            addCriterion("FYEDTIME is not null");
            return (Criteria) this;
        }

        public Criteria andFyedtimeEqualTo(String value) {
            addCriterion("FYEDTIME =", value, "fyedtime");
            return (Criteria) this;
        }

        public Criteria andFyedtimeNotEqualTo(String value) {
            addCriterion("FYEDTIME <>", value, "fyedtime");
            return (Criteria) this;
        }

        public Criteria andFyedtimeGreaterThan(String value) {
            addCriterion("FYEDTIME >", value, "fyedtime");
            return (Criteria) this;
        }

        public Criteria andFyedtimeGreaterThanOrEqualTo(String value) {
            addCriterion("FYEDTIME >=", value, "fyedtime");
            return (Criteria) this;
        }

        public Criteria andFyedtimeLessThan(String value) {
            addCriterion("FYEDTIME <", value, "fyedtime");
            return (Criteria) this;
        }

        public Criteria andFyedtimeLessThanOrEqualTo(String value) {
            addCriterion("FYEDTIME <=", value, "fyedtime");
            return (Criteria) this;
        }

        public Criteria andFyedtimeLike(String value) {
            addCriterion("FYEDTIME like", value, "fyedtime");
            return (Criteria) this;
        }

        public Criteria andFyedtimeNotLike(String value) {
            addCriterion("FYEDTIME not like", value, "fyedtime");
            return (Criteria) this;
        }

        public Criteria andFyedtimeIn(List<String> values) {
            addCriterion("FYEDTIME in", values, "fyedtime");
            return (Criteria) this;
        }

        public Criteria andFyedtimeNotIn(List<String> values) {
            addCriterion("FYEDTIME not in", values, "fyedtime");
            return (Criteria) this;
        }

        public Criteria andFyedtimeBetween(String value1, String value2) {
            addCriterion("FYEDTIME between", value1, value2, "fyedtime");
            return (Criteria) this;
        }

        public Criteria andFyedtimeNotBetween(String value1, String value2) {
            addCriterion("FYEDTIME not between", value1, value2, "fyedtime");
            return (Criteria) this;
        }

        public Criteria andHwhIsNull() {
            addCriterion("HWH is null");
            return (Criteria) this;
        }

        public Criteria andHwhIsNotNull() {
            addCriterion("HWH is not null");
            return (Criteria) this;
        }

        public Criteria andHwhEqualTo(Short value) {
            addCriterion("HWH =", value, "hwh");
            return (Criteria) this;
        }

        public Criteria andHwhNotEqualTo(Short value) {
            addCriterion("HWH <>", value, "hwh");
            return (Criteria) this;
        }

        public Criteria andHwhGreaterThan(Short value) {
            addCriterion("HWH >", value, "hwh");
            return (Criteria) this;
        }

        public Criteria andHwhGreaterThanOrEqualTo(Short value) {
            addCriterion("HWH >=", value, "hwh");
            return (Criteria) this;
        }

        public Criteria andHwhLessThan(Short value) {
            addCriterion("HWH <", value, "hwh");
            return (Criteria) this;
        }

        public Criteria andHwhLessThanOrEqualTo(Short value) {
            addCriterion("HWH <=", value, "hwh");
            return (Criteria) this;
        }

        public Criteria andHwhIn(List<Short> values) {
            addCriterion("HWH in", values, "hwh");
            return (Criteria) this;
        }

        public Criteria andHwhNotIn(List<Short> values) {
            addCriterion("HWH not in", values, "hwh");
            return (Criteria) this;
        }

        public Criteria andHwhBetween(Short value1, Short value2) {
            addCriterion("HWH between", value1, value2, "hwh");
            return (Criteria) this;
        }

        public Criteria andHwhNotBetween(Short value1, Short value2) {
            addCriterion("HWH not between", value1, value2, "hwh");
            return (Criteria) this;
        }

        public Criteria andDythIsNull() {
            addCriterion("DYTH is null");
            return (Criteria) this;
        }

        public Criteria andDythIsNotNull() {
            addCriterion("DYTH is not null");
            return (Criteria) this;
        }

        public Criteria andDythEqualTo(Short value) {
            addCriterion("DYTH =", value, "dyth");
            return (Criteria) this;
        }

        public Criteria andDythNotEqualTo(Short value) {
            addCriterion("DYTH <>", value, "dyth");
            return (Criteria) this;
        }

        public Criteria andDythGreaterThan(Short value) {
            addCriterion("DYTH >", value, "dyth");
            return (Criteria) this;
        }

        public Criteria andDythGreaterThanOrEqualTo(Short value) {
            addCriterion("DYTH >=", value, "dyth");
            return (Criteria) this;
        }

        public Criteria andDythLessThan(Short value) {
            addCriterion("DYTH <", value, "dyth");
            return (Criteria) this;
        }

        public Criteria andDythLessThanOrEqualTo(Short value) {
            addCriterion("DYTH <=", value, "dyth");
            return (Criteria) this;
        }

        public Criteria andDythIn(List<Short> values) {
            addCriterion("DYTH in", values, "dyth");
            return (Criteria) this;
        }

        public Criteria andDythNotIn(List<Short> values) {
            addCriterion("DYTH not in", values, "dyth");
            return (Criteria) this;
        }

        public Criteria andDythBetween(Short value1, Short value2) {
            addCriterion("DYTH between", value1, value2, "dyth");
            return (Criteria) this;
        }

        public Criteria andDythNotBetween(Short value1, Short value2) {
            addCriterion("DYTH not between", value1, value2, "dyth");
            return (Criteria) this;
        }

        public Criteria andDylhIsNull() {
            addCriterion("DYLH is null");
            return (Criteria) this;
        }

        public Criteria andDylhIsNotNull() {
            addCriterion("DYLH is not null");
            return (Criteria) this;
        }

        public Criteria andDylhEqualTo(Short value) {
            addCriterion("DYLH =", value, "dylh");
            return (Criteria) this;
        }

        public Criteria andDylhNotEqualTo(Short value) {
            addCriterion("DYLH <>", value, "dylh");
            return (Criteria) this;
        }

        public Criteria andDylhGreaterThan(Short value) {
            addCriterion("DYLH >", value, "dylh");
            return (Criteria) this;
        }

        public Criteria andDylhGreaterThanOrEqualTo(Short value) {
            addCriterion("DYLH >=", value, "dylh");
            return (Criteria) this;
        }

        public Criteria andDylhLessThan(Short value) {
            addCriterion("DYLH <", value, "dylh");
            return (Criteria) this;
        }

        public Criteria andDylhLessThanOrEqualTo(Short value) {
            addCriterion("DYLH <=", value, "dylh");
            return (Criteria) this;
        }

        public Criteria andDylhIn(List<Short> values) {
            addCriterion("DYLH in", values, "dylh");
            return (Criteria) this;
        }

        public Criteria andDylhNotIn(List<Short> values) {
            addCriterion("DYLH not in", values, "dylh");
            return (Criteria) this;
        }

        public Criteria andDylhBetween(Short value1, Short value2) {
            addCriterion("DYLH between", value1, value2, "dylh");
            return (Criteria) this;
        }

        public Criteria andDylhNotBetween(Short value1, Short value2) {
            addCriterion("DYLH not between", value1, value2, "dylh");
            return (Criteria) this;
        }

        public Criteria andXsdIsNull() {
            addCriterion("XSD is null");
            return (Criteria) this;
        }

        public Criteria andXsdIsNotNull() {
            addCriterion("XSD is not null");
            return (Criteria) this;
        }

        public Criteria andXsdEqualTo(String value) {
            addCriterion("XSD =", value, "xsd");
            return (Criteria) this;
        }

        public Criteria andXsdNotEqualTo(String value) {
            addCriterion("XSD <>", value, "xsd");
            return (Criteria) this;
        }

        public Criteria andXsdGreaterThan(String value) {
            addCriterion("XSD >", value, "xsd");
            return (Criteria) this;
        }

        public Criteria andXsdGreaterThanOrEqualTo(String value) {
            addCriterion("XSD >=", value, "xsd");
            return (Criteria) this;
        }

        public Criteria andXsdLessThan(String value) {
            addCriterion("XSD <", value, "xsd");
            return (Criteria) this;
        }

        public Criteria andXsdLessThanOrEqualTo(String value) {
            addCriterion("XSD <=", value, "xsd");
            return (Criteria) this;
        }

        public Criteria andXsdLike(String value) {
            addCriterion("XSD like", value, "xsd");
            return (Criteria) this;
        }

        public Criteria andXsdNotLike(String value) {
            addCriterion("XSD not like", value, "xsd");
            return (Criteria) this;
        }

        public Criteria andXsdIn(List<String> values) {
            addCriterion("XSD in", values, "xsd");
            return (Criteria) this;
        }

        public Criteria andXsdNotIn(List<String> values) {
            addCriterion("XSD not in", values, "xsd");
            return (Criteria) this;
        }

        public Criteria andXsdBetween(String value1, String value2) {
            addCriterion("XSD between", value1, value2, "xsd");
            return (Criteria) this;
        }

        public Criteria andXsdNotBetween(String value1, String value2) {
            addCriterion("XSD not between", value1, value2, "xsd");
            return (Criteria) this;
        }

        public Criteria andTdhIsNull() {
            addCriterion("TDH is null");
            return (Criteria) this;
        }

        public Criteria andTdhIsNotNull() {
            addCriterion("TDH is not null");
            return (Criteria) this;
        }

        public Criteria andTdhEqualTo(String value) {
            addCriterion("TDH =", value, "tdh");
            return (Criteria) this;
        }

        public Criteria andTdhNotEqualTo(String value) {
            addCriterion("TDH <>", value, "tdh");
            return (Criteria) this;
        }

        public Criteria andTdhGreaterThan(String value) {
            addCriterion("TDH >", value, "tdh");
            return (Criteria) this;
        }

        public Criteria andTdhGreaterThanOrEqualTo(String value) {
            addCriterion("TDH >=", value, "tdh");
            return (Criteria) this;
        }

        public Criteria andTdhLessThan(String value) {
            addCriterion("TDH <", value, "tdh");
            return (Criteria) this;
        }

        public Criteria andTdhLessThanOrEqualTo(String value) {
            addCriterion("TDH <=", value, "tdh");
            return (Criteria) this;
        }

        public Criteria andTdhLike(String value) {
            addCriterion("TDH like", value, "tdh");
            return (Criteria) this;
        }

        public Criteria andTdhNotLike(String value) {
            addCriterion("TDH not like", value, "tdh");
            return (Criteria) this;
        }

        public Criteria andTdhIn(List<String> values) {
            addCriterion("TDH in", values, "tdh");
            return (Criteria) this;
        }

        public Criteria andTdhNotIn(List<String> values) {
            addCriterion("TDH not in", values, "tdh");
            return (Criteria) this;
        }

        public Criteria andTdhBetween(String value1, String value2) {
            addCriterion("TDH between", value1, value2, "tdh");
            return (Criteria) this;
        }

        public Criteria andTdhNotBetween(String value1, String value2) {
            addCriterion("TDH not between", value1, value2, "tdh");
            return (Criteria) this;
        }

        public Criteria andYpmcIsNull() {
            addCriterion("YPMC is null");
            return (Criteria) this;
        }

        public Criteria andYpmcIsNotNull() {
            addCriterion("YPMC is not null");
            return (Criteria) this;
        }

        public Criteria andYpmcEqualTo(String value) {
            addCriterion("YPMC =", value, "ypmc");
            return (Criteria) this;
        }

        public Criteria andYpmcNotEqualTo(String value) {
            addCriterion("YPMC <>", value, "ypmc");
            return (Criteria) this;
        }

        public Criteria andYpmcGreaterThan(String value) {
            addCriterion("YPMC >", value, "ypmc");
            return (Criteria) this;
        }

        public Criteria andYpmcGreaterThanOrEqualTo(String value) {
            addCriterion("YPMC >=", value, "ypmc");
            return (Criteria) this;
        }

        public Criteria andYpmcLessThan(String value) {
            addCriterion("YPMC <", value, "ypmc");
            return (Criteria) this;
        }

        public Criteria andYpmcLessThanOrEqualTo(String value) {
            addCriterion("YPMC <=", value, "ypmc");
            return (Criteria) this;
        }

        public Criteria andYpmcLike(String value) {
            addCriterion("YPMC like", value, "ypmc");
            return (Criteria) this;
        }

        public Criteria andYpmcNotLike(String value) {
            addCriterion("YPMC not like", value, "ypmc");
            return (Criteria) this;
        }

        public Criteria andYpmcIn(List<String> values) {
            addCriterion("YPMC in", values, "ypmc");
            return (Criteria) this;
        }

        public Criteria andYpmcNotIn(List<String> values) {
            addCriterion("YPMC not in", values, "ypmc");
            return (Criteria) this;
        }

        public Criteria andYpmcBetween(String value1, String value2) {
            addCriterion("YPMC between", value1, value2, "ypmc");
            return (Criteria) this;
        }

        public Criteria andYpmcNotBetween(String value1, String value2) {
            addCriterion("YPMC not between", value1, value2, "ypmc");
            return (Criteria) this;
        }

        public Criteria andYflIsNull() {
            addCriterion("YFL is null");
            return (Criteria) this;
        }

        public Criteria andYflIsNotNull() {
            addCriterion("YFL is not null");
            return (Criteria) this;
        }

        public Criteria andYflEqualTo(Float value) {
            addCriterion("YFL =", value, "yfl");
            return (Criteria) this;
        }

        public Criteria andYflNotEqualTo(Float value) {
            addCriterion("YFL <>", value, "yfl");
            return (Criteria) this;
        }

        public Criteria andYflGreaterThan(Float value) {
            addCriterion("YFL >", value, "yfl");
            return (Criteria) this;
        }

        public Criteria andYflGreaterThanOrEqualTo(Float value) {
            addCriterion("YFL >=", value, "yfl");
            return (Criteria) this;
        }

        public Criteria andYflLessThan(Float value) {
            addCriterion("YFL <", value, "yfl");
            return (Criteria) this;
        }

        public Criteria andYflLessThanOrEqualTo(Float value) {
            addCriterion("YFL <=", value, "yfl");
            return (Criteria) this;
        }

        public Criteria andYflIn(List<Float> values) {
            addCriterion("YFL in", values, "yfl");
            return (Criteria) this;
        }

        public Criteria andYflNotIn(List<Float> values) {
            addCriterion("YFL not in", values, "yfl");
            return (Criteria) this;
        }

        public Criteria andYflBetween(Float value1, Float value2) {
            addCriterion("YFL between", value1, value2, "yfl");
            return (Criteria) this;
        }

        public Criteria andYflNotBetween(Float value1, Float value2) {
            addCriterion("YFL not between", value1, value2, "yfl");
            return (Criteria) this;
        }

        public Criteria andMiduIsNull() {
            addCriterion("MIDU is null");
            return (Criteria) this;
        }

        public Criteria andMiduIsNotNull() {
            addCriterion("MIDU is not null");
            return (Criteria) this;
        }

        public Criteria andMiduEqualTo(Float value) {
            addCriterion("MIDU =", value, "midu");
            return (Criteria) this;
        }

        public Criteria andMiduNotEqualTo(Float value) {
            addCriterion("MIDU <>", value, "midu");
            return (Criteria) this;
        }

        public Criteria andMiduGreaterThan(Float value) {
            addCriterion("MIDU >", value, "midu");
            return (Criteria) this;
        }

        public Criteria andMiduGreaterThanOrEqualTo(Float value) {
            addCriterion("MIDU >=", value, "midu");
            return (Criteria) this;
        }

        public Criteria andMiduLessThan(Float value) {
            addCriterion("MIDU <", value, "midu");
            return (Criteria) this;
        }

        public Criteria andMiduLessThanOrEqualTo(Float value) {
            addCriterion("MIDU <=", value, "midu");
            return (Criteria) this;
        }

        public Criteria andMiduIn(List<Float> values) {
            addCriterion("MIDU in", values, "midu");
            return (Criteria) this;
        }

        public Criteria andMiduNotIn(List<Float> values) {
            addCriterion("MIDU not in", values, "midu");
            return (Criteria) this;
        }

        public Criteria andMiduBetween(Float value1, Float value2) {
            addCriterion("MIDU between", value1, value2, "midu");
            return (Criteria) this;
        }

        public Criteria andMiduNotBetween(Float value1, Float value2) {
            addCriterion("MIDU not between", value1, value2, "midu");
            return (Criteria) this;
        }

        public Criteria andWenduIsNull() {
            addCriterion("WENDU is null");
            return (Criteria) this;
        }

        public Criteria andWenduIsNotNull() {
            addCriterion("WENDU is not null");
            return (Criteria) this;
        }

        public Criteria andWenduEqualTo(Float value) {
            addCriterion("WENDU =", value, "wendu");
            return (Criteria) this;
        }

        public Criteria andWenduNotEqualTo(Float value) {
            addCriterion("WENDU <>", value, "wendu");
            return (Criteria) this;
        }

        public Criteria andWenduGreaterThan(Float value) {
            addCriterion("WENDU >", value, "wendu");
            return (Criteria) this;
        }

        public Criteria andWenduGreaterThanOrEqualTo(Float value) {
            addCriterion("WENDU >=", value, "wendu");
            return (Criteria) this;
        }

        public Criteria andWenduLessThan(Float value) {
            addCriterion("WENDU <", value, "wendu");
            return (Criteria) this;
        }

        public Criteria andWenduLessThanOrEqualTo(Float value) {
            addCriterion("WENDU <=", value, "wendu");
            return (Criteria) this;
        }

        public Criteria andWenduIn(List<Float> values) {
            addCriterion("WENDU in", values, "wendu");
            return (Criteria) this;
        }

        public Criteria andWenduNotIn(List<Float> values) {
            addCriterion("WENDU not in", values, "wendu");
            return (Criteria) this;
        }

        public Criteria andWenduBetween(Float value1, Float value2) {
            addCriterion("WENDU between", value1, value2, "wendu");
            return (Criteria) this;
        }

        public Criteria andWenduNotBetween(Float value1, Float value2) {
            addCriterion("WENDU not between", value1, value2, "wendu");
            return (Criteria) this;
        }

        public Criteria andSflIsNull() {
            addCriterion("SFL is null");
            return (Criteria) this;
        }

        public Criteria andSflIsNotNull() {
            addCriterion("SFL is not null");
            return (Criteria) this;
        }

        public Criteria andSflEqualTo(Float value) {
            addCriterion("SFL =", value, "sfl");
            return (Criteria) this;
        }

        public Criteria andSflNotEqualTo(Float value) {
            addCriterion("SFL <>", value, "sfl");
            return (Criteria) this;
        }

        public Criteria andSflGreaterThan(Float value) {
            addCriterion("SFL >", value, "sfl");
            return (Criteria) this;
        }

        public Criteria andSflGreaterThanOrEqualTo(Float value) {
            addCriterion("SFL >=", value, "sfl");
            return (Criteria) this;
        }

        public Criteria andSflLessThan(Float value) {
            addCriterion("SFL <", value, "sfl");
            return (Criteria) this;
        }

        public Criteria andSflLessThanOrEqualTo(Float value) {
            addCriterion("SFL <=", value, "sfl");
            return (Criteria) this;
        }

        public Criteria andSflIn(List<Float> values) {
            addCriterion("SFL in", values, "sfl");
            return (Criteria) this;
        }

        public Criteria andSflNotIn(List<Float> values) {
            addCriterion("SFL not in", values, "sfl");
            return (Criteria) this;
        }

        public Criteria andSflBetween(Float value1, Float value2) {
            addCriterion("SFL between", value1, value2, "sfl");
            return (Criteria) this;
        }

        public Criteria andSflNotBetween(Float value1, Float value2) {
            addCriterion("SFL not between", value1, value2, "sfl");
            return (Criteria) this;
        }

        public Criteria andChehaoIsNull() {
            addCriterion("CHEHAO is null");
            return (Criteria) this;
        }

        public Criteria andChehaoIsNotNull() {
            addCriterion("CHEHAO is not null");
            return (Criteria) this;
        }

        public Criteria andChehaoEqualTo(String value) {
            addCriterion("CHEHAO =", value, "chehao");
            return (Criteria) this;
        }

        public Criteria andChehaoNotEqualTo(String value) {
            addCriterion("CHEHAO <>", value, "chehao");
            return (Criteria) this;
        }

        public Criteria andChehaoGreaterThan(String value) {
            addCriterion("CHEHAO >", value, "chehao");
            return (Criteria) this;
        }

        public Criteria andChehaoGreaterThanOrEqualTo(String value) {
            addCriterion("CHEHAO >=", value, "chehao");
            return (Criteria) this;
        }

        public Criteria andChehaoLessThan(String value) {
            addCriterion("CHEHAO <", value, "chehao");
            return (Criteria) this;
        }

        public Criteria andChehaoLessThanOrEqualTo(String value) {
            addCriterion("CHEHAO <=", value, "chehao");
            return (Criteria) this;
        }

        public Criteria andChehaoLike(String value) {
            addCriterion("CHEHAO like", value, "chehao");
            return (Criteria) this;
        }

        public Criteria andChehaoNotLike(String value) {
            addCriterion("CHEHAO not like", value, "chehao");
            return (Criteria) this;
        }

        public Criteria andChehaoIn(List<String> values) {
            addCriterion("CHEHAO in", values, "chehao");
            return (Criteria) this;
        }

        public Criteria andChehaoNotIn(List<String> values) {
            addCriterion("CHEHAO not in", values, "chehao");
            return (Criteria) this;
        }

        public Criteria andChehaoBetween(String value1, String value2) {
            addCriterion("CHEHAO between", value1, value2, "chehao");
            return (Criteria) this;
        }

        public Criteria andChehaoNotBetween(String value1, String value2) {
            addCriterion("CHEHAO not between", value1, value2, "chehao");
            return (Criteria) this;
        }

        public Criteria andFystyleIsNull() {
            addCriterion("FYSTYLE is null");
            return (Criteria) this;
        }

        public Criteria andFystyleIsNotNull() {
            addCriterion("FYSTYLE is not null");
            return (Criteria) this;
        }

        public Criteria andFystyleEqualTo(String value) {
            addCriterion("FYSTYLE =", value, "fystyle");
            return (Criteria) this;
        }

        public Criteria andFystyleNotEqualTo(String value) {
            addCriterion("FYSTYLE <>", value, "fystyle");
            return (Criteria) this;
        }

        public Criteria andFystyleGreaterThan(String value) {
            addCriterion("FYSTYLE >", value, "fystyle");
            return (Criteria) this;
        }

        public Criteria andFystyleGreaterThanOrEqualTo(String value) {
            addCriterion("FYSTYLE >=", value, "fystyle");
            return (Criteria) this;
        }

        public Criteria andFystyleLessThan(String value) {
            addCriterion("FYSTYLE <", value, "fystyle");
            return (Criteria) this;
        }

        public Criteria andFystyleLessThanOrEqualTo(String value) {
            addCriterion("FYSTYLE <=", value, "fystyle");
            return (Criteria) this;
        }

        public Criteria andFystyleLike(String value) {
            addCriterion("FYSTYLE like", value, "fystyle");
            return (Criteria) this;
        }

        public Criteria andFystyleNotLike(String value) {
            addCriterion("FYSTYLE not like", value, "fystyle");
            return (Criteria) this;
        }

        public Criteria andFystyleIn(List<String> values) {
            addCriterion("FYSTYLE in", values, "fystyle");
            return (Criteria) this;
        }

        public Criteria andFystyleNotIn(List<String> values) {
            addCriterion("FYSTYLE not in", values, "fystyle");
            return (Criteria) this;
        }

        public Criteria andFystyleBetween(String value1, String value2) {
            addCriterion("FYSTYLE between", value1, value2, "fystyle");
            return (Criteria) this;
        }

        public Criteria andFystyleNotBetween(String value1, String value2) {
            addCriterion("FYSTYLE not between", value1, value2, "fystyle");
            return (Criteria) this;
        }

        public Criteria andThdwIsNull() {
            addCriterion("THDW is null");
            return (Criteria) this;
        }

        public Criteria andThdwIsNotNull() {
            addCriterion("THDW is not null");
            return (Criteria) this;
        }

        public Criteria andThdwEqualTo(String value) {
            addCriterion("THDW =", value, "thdw");
            return (Criteria) this;
        }

        public Criteria andThdwNotEqualTo(String value) {
            addCriterion("THDW <>", value, "thdw");
            return (Criteria) this;
        }

        public Criteria andThdwGreaterThan(String value) {
            addCriterion("THDW >", value, "thdw");
            return (Criteria) this;
        }

        public Criteria andThdwGreaterThanOrEqualTo(String value) {
            addCriterion("THDW >=", value, "thdw");
            return (Criteria) this;
        }

        public Criteria andThdwLessThan(String value) {
            addCriterion("THDW <", value, "thdw");
            return (Criteria) this;
        }

        public Criteria andThdwLessThanOrEqualTo(String value) {
            addCriterion("THDW <=", value, "thdw");
            return (Criteria) this;
        }

        public Criteria andThdwLike(String value) {
            addCriterion("THDW like", value, "thdw");
            return (Criteria) this;
        }

        public Criteria andThdwNotLike(String value) {
            addCriterion("THDW not like", value, "thdw");
            return (Criteria) this;
        }

        public Criteria andThdwIn(List<String> values) {
            addCriterion("THDW in", values, "thdw");
            return (Criteria) this;
        }

        public Criteria andThdwNotIn(List<String> values) {
            addCriterion("THDW not in", values, "thdw");
            return (Criteria) this;
        }

        public Criteria andThdwBetween(String value1, String value2) {
            addCriterion("THDW between", value1, value2, "thdw");
            return (Criteria) this;
        }

        public Criteria andThdwNotBetween(String value1, String value2) {
            addCriterion("THDW not between", value1, value2, "thdw");
            return (Criteria) this;
        }

        public Criteria andKpdwIsNull() {
            addCriterion("KPDW is null");
            return (Criteria) this;
        }

        public Criteria andKpdwIsNotNull() {
            addCriterion("KPDW is not null");
            return (Criteria) this;
        }

        public Criteria andKpdwEqualTo(String value) {
            addCriterion("KPDW =", value, "kpdw");
            return (Criteria) this;
        }

        public Criteria andKpdwNotEqualTo(String value) {
            addCriterion("KPDW <>", value, "kpdw");
            return (Criteria) this;
        }

        public Criteria andKpdwGreaterThan(String value) {
            addCriterion("KPDW >", value, "kpdw");
            return (Criteria) this;
        }

        public Criteria andKpdwGreaterThanOrEqualTo(String value) {
            addCriterion("KPDW >=", value, "kpdw");
            return (Criteria) this;
        }

        public Criteria andKpdwLessThan(String value) {
            addCriterion("KPDW <", value, "kpdw");
            return (Criteria) this;
        }

        public Criteria andKpdwLessThanOrEqualTo(String value) {
            addCriterion("KPDW <=", value, "kpdw");
            return (Criteria) this;
        }

        public Criteria andKpdwLike(String value) {
            addCriterion("KPDW like", value, "kpdw");
            return (Criteria) this;
        }

        public Criteria andKpdwNotLike(String value) {
            addCriterion("KPDW not like", value, "kpdw");
            return (Criteria) this;
        }

        public Criteria andKpdwIn(List<String> values) {
            addCriterion("KPDW in", values, "kpdw");
            return (Criteria) this;
        }

        public Criteria andKpdwNotIn(List<String> values) {
            addCriterion("KPDW not in", values, "kpdw");
            return (Criteria) this;
        }

        public Criteria andKpdwBetween(String value1, String value2) {
            addCriterion("KPDW between", value1, value2, "kpdw");
            return (Criteria) this;
        }

        public Criteria andKpdwNotBetween(String value1, String value2) {
            addCriterion("KPDW not between", value1, value2, "kpdw");
            return (Criteria) this;
        }

        public Criteria andLeijilIsNull() {
            addCriterion("LEIJIL is null");
            return (Criteria) this;
        }

        public Criteria andLeijilIsNotNull() {
            addCriterion("LEIJIL is not null");
            return (Criteria) this;
        }

        public Criteria andLeijilEqualTo(Float value) {
            addCriterion("LEIJIL =", value, "leijil");
            return (Criteria) this;
        }

        public Criteria andLeijilNotEqualTo(Float value) {
            addCriterion("LEIJIL <>", value, "leijil");
            return (Criteria) this;
        }

        public Criteria andLeijilGreaterThan(Float value) {
            addCriterion("LEIJIL >", value, "leijil");
            return (Criteria) this;
        }

        public Criteria andLeijilGreaterThanOrEqualTo(Float value) {
            addCriterion("LEIJIL >=", value, "leijil");
            return (Criteria) this;
        }

        public Criteria andLeijilLessThan(Float value) {
            addCriterion("LEIJIL <", value, "leijil");
            return (Criteria) this;
        }

        public Criteria andLeijilLessThanOrEqualTo(Float value) {
            addCriterion("LEIJIL <=", value, "leijil");
            return (Criteria) this;
        }

        public Criteria andLeijilIn(List<Float> values) {
            addCriterion("LEIJIL in", values, "leijil");
            return (Criteria) this;
        }

        public Criteria andLeijilNotIn(List<Float> values) {
            addCriterion("LEIJIL not in", values, "leijil");
            return (Criteria) this;
        }

        public Criteria andLeijilBetween(Float value1, Float value2) {
            addCriterion("LEIJIL between", value1, value2, "leijil");
            return (Criteria) this;
        }

        public Criteria andLeijilNotBetween(Float value1, Float value2) {
            addCriterion("LEIJIL not between", value1, value2, "leijil");
            return (Criteria) this;
        }

        public Criteria andKprIsNull() {
            addCriterion("KPR is null");
            return (Criteria) this;
        }

        public Criteria andKprIsNotNull() {
            addCriterion("KPR is not null");
            return (Criteria) this;
        }

        public Criteria andKprEqualTo(String value) {
            addCriterion("KPR =", value, "kpr");
            return (Criteria) this;
        }

        public Criteria andKprNotEqualTo(String value) {
            addCriterion("KPR <>", value, "kpr");
            return (Criteria) this;
        }

        public Criteria andKprGreaterThan(String value) {
            addCriterion("KPR >", value, "kpr");
            return (Criteria) this;
        }

        public Criteria andKprGreaterThanOrEqualTo(String value) {
            addCriterion("KPR >=", value, "kpr");
            return (Criteria) this;
        }

        public Criteria andKprLessThan(String value) {
            addCriterion("KPR <", value, "kpr");
            return (Criteria) this;
        }

        public Criteria andKprLessThanOrEqualTo(String value) {
            addCriterion("KPR <=", value, "kpr");
            return (Criteria) this;
        }

        public Criteria andKprLike(String value) {
            addCriterion("KPR like", value, "kpr");
            return (Criteria) this;
        }

        public Criteria andKprNotLike(String value) {
            addCriterion("KPR not like", value, "kpr");
            return (Criteria) this;
        }

        public Criteria andKprIn(List<String> values) {
            addCriterion("KPR in", values, "kpr");
            return (Criteria) this;
        }

        public Criteria andKprNotIn(List<String> values) {
            addCriterion("KPR not in", values, "kpr");
            return (Criteria) this;
        }

        public Criteria andKprBetween(String value1, String value2) {
            addCriterion("KPR between", value1, value2, "kpr");
            return (Criteria) this;
        }

        public Criteria andKprNotBetween(String value1, String value2) {
            addCriterion("KPR not between", value1, value2, "kpr");
            return (Criteria) this;
        }

        public Criteria andFyghIsNull() {
            addCriterion("FYGH is null");
            return (Criteria) this;
        }

        public Criteria andFyghIsNotNull() {
            addCriterion("FYGH is not null");
            return (Criteria) this;
        }

        public Criteria andFyghEqualTo(String value) {
            addCriterion("FYGH =", value, "fygh");
            return (Criteria) this;
        }

        public Criteria andFyghNotEqualTo(String value) {
            addCriterion("FYGH <>", value, "fygh");
            return (Criteria) this;
        }

        public Criteria andFyghGreaterThan(String value) {
            addCriterion("FYGH >", value, "fygh");
            return (Criteria) this;
        }

        public Criteria andFyghGreaterThanOrEqualTo(String value) {
            addCriterion("FYGH >=", value, "fygh");
            return (Criteria) this;
        }

        public Criteria andFyghLessThan(String value) {
            addCriterion("FYGH <", value, "fygh");
            return (Criteria) this;
        }

        public Criteria andFyghLessThanOrEqualTo(String value) {
            addCriterion("FYGH <=", value, "fygh");
            return (Criteria) this;
        }

        public Criteria andFyghLike(String value) {
            addCriterion("FYGH like", value, "fygh");
            return (Criteria) this;
        }

        public Criteria andFyghNotLike(String value) {
            addCriterion("FYGH not like", value, "fygh");
            return (Criteria) this;
        }

        public Criteria andFyghIn(List<String> values) {
            addCriterion("FYGH in", values, "fygh");
            return (Criteria) this;
        }

        public Criteria andFyghNotIn(List<String> values) {
            addCriterion("FYGH not in", values, "fygh");
            return (Criteria) this;
        }

        public Criteria andFyghBetween(String value1, String value2) {
            addCriterion("FYGH between", value1, value2, "fygh");
            return (Criteria) this;
        }

        public Criteria andFyghNotBetween(String value1, String value2) {
            addCriterion("FYGH not between", value1, value2, "fygh");
            return (Criteria) this;
        }

        public Criteria andCxdatetimeIsNull() {
            addCriterion("CXDATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCxdatetimeIsNotNull() {
            addCriterion("CXDATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCxdatetimeEqualTo(String value) {
            addCriterion("CXDATETIME =", value, "cxdatetime");
            return (Criteria) this;
        }

        public Criteria andCxdatetimeNotEqualTo(String value) {
            addCriterion("CXDATETIME <>", value, "cxdatetime");
            return (Criteria) this;
        }

        public Criteria andCxdatetimeGreaterThan(String value) {
            addCriterion("CXDATETIME >", value, "cxdatetime");
            return (Criteria) this;
        }

        public Criteria andCxdatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("CXDATETIME >=", value, "cxdatetime");
            return (Criteria) this;
        }

        public Criteria andCxdatetimeLessThan(String value) {
            addCriterion("CXDATETIME <", value, "cxdatetime");
            return (Criteria) this;
        }

        public Criteria andCxdatetimeLessThanOrEqualTo(String value) {
            addCriterion("CXDATETIME <=", value, "cxdatetime");
            return (Criteria) this;
        }

        public Criteria andCxdatetimeLike(String value) {
            addCriterion("CXDATETIME like", value, "cxdatetime");
            return (Criteria) this;
        }

        public Criteria andCxdatetimeNotLike(String value) {
            addCriterion("CXDATETIME not like", value, "cxdatetime");
            return (Criteria) this;
        }

        public Criteria andCxdatetimeIn(List<String> values) {
            addCriterion("CXDATETIME in", values, "cxdatetime");
            return (Criteria) this;
        }

        public Criteria andCxdatetimeNotIn(List<String> values) {
            addCriterion("CXDATETIME not in", values, "cxdatetime");
            return (Criteria) this;
        }

        public Criteria andCxdatetimeBetween(String value1, String value2) {
            addCriterion("CXDATETIME between", value1, value2, "cxdatetime");
            return (Criteria) this;
        }

        public Criteria andCxdatetimeNotBetween(String value1, String value2) {
            addCriterion("CXDATETIME not between", value1, value2, "cxdatetime");
            return (Criteria) this;
        }

        public Criteria andDylIsNull() {
            addCriterion("DYL is null");
            return (Criteria) this;
        }

        public Criteria andDylIsNotNull() {
            addCriterion("DYL is not null");
            return (Criteria) this;
        }

        public Criteria andDylEqualTo(Float value) {
            addCriterion("DYL =", value, "dyl");
            return (Criteria) this;
        }

        public Criteria andDylNotEqualTo(Float value) {
            addCriterion("DYL <>", value, "dyl");
            return (Criteria) this;
        }

        public Criteria andDylGreaterThan(Float value) {
            addCriterion("DYL >", value, "dyl");
            return (Criteria) this;
        }

        public Criteria andDylGreaterThanOrEqualTo(Float value) {
            addCriterion("DYL >=", value, "dyl");
            return (Criteria) this;
        }

        public Criteria andDylLessThan(Float value) {
            addCriterion("DYL <", value, "dyl");
            return (Criteria) this;
        }

        public Criteria andDylLessThanOrEqualTo(Float value) {
            addCriterion("DYL <=", value, "dyl");
            return (Criteria) this;
        }

        public Criteria andDylIn(List<Float> values) {
            addCriterion("DYL in", values, "dyl");
            return (Criteria) this;
        }

        public Criteria andDylNotIn(List<Float> values) {
            addCriterion("DYL not in", values, "dyl");
            return (Criteria) this;
        }

        public Criteria andDylBetween(Float value1, Float value2) {
            addCriterion("DYL between", value1, value2, "dyl");
            return (Criteria) this;
        }

        public Criteria andDylNotBetween(Float value1, Float value2) {
            addCriterion("DYL not between", value1, value2, "dyl");
            return (Criteria) this;
        }

        public Criteria andJlstyleIsNull() {
            addCriterion("JLSTYLE is null");
            return (Criteria) this;
        }

        public Criteria andJlstyleIsNotNull() {
            addCriterion("JLSTYLE is not null");
            return (Criteria) this;
        }

        public Criteria andJlstyleEqualTo(String value) {
            addCriterion("JLSTYLE =", value, "jlstyle");
            return (Criteria) this;
        }

        public Criteria andJlstyleNotEqualTo(String value) {
            addCriterion("JLSTYLE <>", value, "jlstyle");
            return (Criteria) this;
        }

        public Criteria andJlstyleGreaterThan(String value) {
            addCriterion("JLSTYLE >", value, "jlstyle");
            return (Criteria) this;
        }

        public Criteria andJlstyleGreaterThanOrEqualTo(String value) {
            addCriterion("JLSTYLE >=", value, "jlstyle");
            return (Criteria) this;
        }

        public Criteria andJlstyleLessThan(String value) {
            addCriterion("JLSTYLE <", value, "jlstyle");
            return (Criteria) this;
        }

        public Criteria andJlstyleLessThanOrEqualTo(String value) {
            addCriterion("JLSTYLE <=", value, "jlstyle");
            return (Criteria) this;
        }

        public Criteria andJlstyleLike(String value) {
            addCriterion("JLSTYLE like", value, "jlstyle");
            return (Criteria) this;
        }

        public Criteria andJlstyleNotLike(String value) {
            addCriterion("JLSTYLE not like", value, "jlstyle");
            return (Criteria) this;
        }

        public Criteria andJlstyleIn(List<String> values) {
            addCriterion("JLSTYLE in", values, "jlstyle");
            return (Criteria) this;
        }

        public Criteria andJlstyleNotIn(List<String> values) {
            addCriterion("JLSTYLE not in", values, "jlstyle");
            return (Criteria) this;
        }

        public Criteria andJlstyleBetween(String value1, String value2) {
            addCriterion("JLSTYLE between", value1, value2, "jlstyle");
            return (Criteria) this;
        }

        public Criteria andJlstyleNotBetween(String value1, String value2) {
            addCriterion("JLSTYLE not between", value1, value2, "jlstyle");
            return (Criteria) this;
        }

        public Criteria andSingleyfzlIsNull() {
            addCriterion("SINGLEYFZL is null");
            return (Criteria) this;
        }

        public Criteria andSingleyfzlIsNotNull() {
            addCriterion("SINGLEYFZL is not null");
            return (Criteria) this;
        }

        public Criteria andSingleyfzlEqualTo(Float value) {
            addCriterion("SINGLEYFZL =", value, "singleyfzl");
            return (Criteria) this;
        }

        public Criteria andSingleyfzlNotEqualTo(Float value) {
            addCriterion("SINGLEYFZL <>", value, "singleyfzl");
            return (Criteria) this;
        }

        public Criteria andSingleyfzlGreaterThan(Float value) {
            addCriterion("SINGLEYFZL >", value, "singleyfzl");
            return (Criteria) this;
        }

        public Criteria andSingleyfzlGreaterThanOrEqualTo(Float value) {
            addCriterion("SINGLEYFZL >=", value, "singleyfzl");
            return (Criteria) this;
        }

        public Criteria andSingleyfzlLessThan(Float value) {
            addCriterion("SINGLEYFZL <", value, "singleyfzl");
            return (Criteria) this;
        }

        public Criteria andSingleyfzlLessThanOrEqualTo(Float value) {
            addCriterion("SINGLEYFZL <=", value, "singleyfzl");
            return (Criteria) this;
        }

        public Criteria andSingleyfzlIn(List<Float> values) {
            addCriterion("SINGLEYFZL in", values, "singleyfzl");
            return (Criteria) this;
        }

        public Criteria andSingleyfzlNotIn(List<Float> values) {
            addCriterion("SINGLEYFZL not in", values, "singleyfzl");
            return (Criteria) this;
        }

        public Criteria andSingleyfzlBetween(Float value1, Float value2) {
            addCriterion("SINGLEYFZL between", value1, value2, "singleyfzl");
            return (Criteria) this;
        }

        public Criteria andSingleyfzlNotBetween(Float value1, Float value2) {
            addCriterion("SINGLEYFZL not between", value1, value2, "singleyfzl");
            return (Criteria) this;
        }

        public Criteria andSingleyftjIsNull() {
            addCriterion("SINGLEYFTJ is null");
            return (Criteria) this;
        }

        public Criteria andSingleyftjIsNotNull() {
            addCriterion("SINGLEYFTJ is not null");
            return (Criteria) this;
        }

        public Criteria andSingleyftjEqualTo(Float value) {
            addCriterion("SINGLEYFTJ =", value, "singleyftj");
            return (Criteria) this;
        }

        public Criteria andSingleyftjNotEqualTo(Float value) {
            addCriterion("SINGLEYFTJ <>", value, "singleyftj");
            return (Criteria) this;
        }

        public Criteria andSingleyftjGreaterThan(Float value) {
            addCriterion("SINGLEYFTJ >", value, "singleyftj");
            return (Criteria) this;
        }

        public Criteria andSingleyftjGreaterThanOrEqualTo(Float value) {
            addCriterion("SINGLEYFTJ >=", value, "singleyftj");
            return (Criteria) this;
        }

        public Criteria andSingleyftjLessThan(Float value) {
            addCriterion("SINGLEYFTJ <", value, "singleyftj");
            return (Criteria) this;
        }

        public Criteria andSingleyftjLessThanOrEqualTo(Float value) {
            addCriterion("SINGLEYFTJ <=", value, "singleyftj");
            return (Criteria) this;
        }

        public Criteria andSingleyftjIn(List<Float> values) {
            addCriterion("SINGLEYFTJ in", values, "singleyftj");
            return (Criteria) this;
        }

        public Criteria andSingleyftjNotIn(List<Float> values) {
            addCriterion("SINGLEYFTJ not in", values, "singleyftj");
            return (Criteria) this;
        }

        public Criteria andSingleyftjBetween(Float value1, Float value2) {
            addCriterion("SINGLEYFTJ between", value1, value2, "singleyftj");
            return (Criteria) this;
        }

        public Criteria andSingleyftjNotBetween(Float value1, Float value2) {
            addCriterion("SINGLEYFTJ not between", value1, value2, "singleyftj");
            return (Criteria) this;
        }

        public Criteria andSinglesfzlIsNull() {
            addCriterion("SINGLESFZL is null");
            return (Criteria) this;
        }

        public Criteria andSinglesfzlIsNotNull() {
            addCriterion("SINGLESFZL is not null");
            return (Criteria) this;
        }

        public Criteria andSinglesfzlEqualTo(Float value) {
            addCriterion("SINGLESFZL =", value, "singlesfzl");
            return (Criteria) this;
        }

        public Criteria andSinglesfzlNotEqualTo(Float value) {
            addCriterion("SINGLESFZL <>", value, "singlesfzl");
            return (Criteria) this;
        }

        public Criteria andSinglesfzlGreaterThan(Float value) {
            addCriterion("SINGLESFZL >", value, "singlesfzl");
            return (Criteria) this;
        }

        public Criteria andSinglesfzlGreaterThanOrEqualTo(Float value) {
            addCriterion("SINGLESFZL >=", value, "singlesfzl");
            return (Criteria) this;
        }

        public Criteria andSinglesfzlLessThan(Float value) {
            addCriterion("SINGLESFZL <", value, "singlesfzl");
            return (Criteria) this;
        }

        public Criteria andSinglesfzlLessThanOrEqualTo(Float value) {
            addCriterion("SINGLESFZL <=", value, "singlesfzl");
            return (Criteria) this;
        }

        public Criteria andSinglesfzlIn(List<Float> values) {
            addCriterion("SINGLESFZL in", values, "singlesfzl");
            return (Criteria) this;
        }

        public Criteria andSinglesfzlNotIn(List<Float> values) {
            addCriterion("SINGLESFZL not in", values, "singlesfzl");
            return (Criteria) this;
        }

        public Criteria andSinglesfzlBetween(Float value1, Float value2) {
            addCriterion("SINGLESFZL between", value1, value2, "singlesfzl");
            return (Criteria) this;
        }

        public Criteria andSinglesfzlNotBetween(Float value1, Float value2) {
            addCriterion("SINGLESFZL not between", value1, value2, "singlesfzl");
            return (Criteria) this;
        }

        public Criteria andSinglesftjIsNull() {
            addCriterion("SINGLESFTJ is null");
            return (Criteria) this;
        }

        public Criteria andSinglesftjIsNotNull() {
            addCriterion("SINGLESFTJ is not null");
            return (Criteria) this;
        }

        public Criteria andSinglesftjEqualTo(Float value) {
            addCriterion("SINGLESFTJ =", value, "singlesftj");
            return (Criteria) this;
        }

        public Criteria andSinglesftjNotEqualTo(Float value) {
            addCriterion("SINGLESFTJ <>", value, "singlesftj");
            return (Criteria) this;
        }

        public Criteria andSinglesftjGreaterThan(Float value) {
            addCriterion("SINGLESFTJ >", value, "singlesftj");
            return (Criteria) this;
        }

        public Criteria andSinglesftjGreaterThanOrEqualTo(Float value) {
            addCriterion("SINGLESFTJ >=", value, "singlesftj");
            return (Criteria) this;
        }

        public Criteria andSinglesftjLessThan(Float value) {
            addCriterion("SINGLESFTJ <", value, "singlesftj");
            return (Criteria) this;
        }

        public Criteria andSinglesftjLessThanOrEqualTo(Float value) {
            addCriterion("SINGLESFTJ <=", value, "singlesftj");
            return (Criteria) this;
        }

        public Criteria andSinglesftjIn(List<Float> values) {
            addCriterion("SINGLESFTJ in", values, "singlesftj");
            return (Criteria) this;
        }

        public Criteria andSinglesftjNotIn(List<Float> values) {
            addCriterion("SINGLESFTJ not in", values, "singlesftj");
            return (Criteria) this;
        }

        public Criteria andSinglesftjBetween(Float value1, Float value2) {
            addCriterion("SINGLESFTJ between", value1, value2, "singlesftj");
            return (Criteria) this;
        }

        public Criteria andSinglesftjNotBetween(Float value1, Float value2) {
            addCriterion("SINGLESFTJ not between", value1, value2, "singlesftj");
            return (Criteria) this;
        }

        public Criteria andStyleIsNull() {
            addCriterion("STYLE is null");
            return (Criteria) this;
        }

        public Criteria andStyleIsNotNull() {
            addCriterion("STYLE is not null");
            return (Criteria) this;
        }

        public Criteria andStyleEqualTo(String value) {
            addCriterion("STYLE =", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleNotEqualTo(String value) {
            addCriterion("STYLE <>", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleGreaterThan(String value) {
            addCriterion("STYLE >", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleGreaterThanOrEqualTo(String value) {
            addCriterion("STYLE >=", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleLessThan(String value) {
            addCriterion("STYLE <", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleLessThanOrEqualTo(String value) {
            addCriterion("STYLE <=", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleLike(String value) {
            addCriterion("STYLE like", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleNotLike(String value) {
            addCriterion("STYLE not like", value, "style");
            return (Criteria) this;
        }

        public Criteria andStyleIn(List<String> values) {
            addCriterion("STYLE in", values, "style");
            return (Criteria) this;
        }

        public Criteria andStyleNotIn(List<String> values) {
            addCriterion("STYLE not in", values, "style");
            return (Criteria) this;
        }

        public Criteria andStyleBetween(String value1, String value2) {
            addCriterion("STYLE between", value1, value2, "style");
            return (Criteria) this;
        }

        public Criteria andStyleNotBetween(String value1, String value2) {
            addCriterion("STYLE not between", value1, value2, "style");
            return (Criteria) this;
        }

        public Criteria andWlbmIsNull() {
            addCriterion("WLBM is null");
            return (Criteria) this;
        }

        public Criteria andWlbmIsNotNull() {
            addCriterion("WLBM is not null");
            return (Criteria) this;
        }

        public Criteria andWlbmEqualTo(String value) {
            addCriterion("WLBM =", value, "wlbm");
            return (Criteria) this;
        }

        public Criteria andWlbmNotEqualTo(String value) {
            addCriterion("WLBM <>", value, "wlbm");
            return (Criteria) this;
        }

        public Criteria andWlbmGreaterThan(String value) {
            addCriterion("WLBM >", value, "wlbm");
            return (Criteria) this;
        }

        public Criteria andWlbmGreaterThanOrEqualTo(String value) {
            addCriterion("WLBM >=", value, "wlbm");
            return (Criteria) this;
        }

        public Criteria andWlbmLessThan(String value) {
            addCriterion("WLBM <", value, "wlbm");
            return (Criteria) this;
        }

        public Criteria andWlbmLessThanOrEqualTo(String value) {
            addCriterion("WLBM <=", value, "wlbm");
            return (Criteria) this;
        }

        public Criteria andWlbmLike(String value) {
            addCriterion("WLBM like", value, "wlbm");
            return (Criteria) this;
        }

        public Criteria andWlbmNotLike(String value) {
            addCriterion("WLBM not like", value, "wlbm");
            return (Criteria) this;
        }

        public Criteria andWlbmIn(List<String> values) {
            addCriterion("WLBM in", values, "wlbm");
            return (Criteria) this;
        }

        public Criteria andWlbmNotIn(List<String> values) {
            addCriterion("WLBM not in", values, "wlbm");
            return (Criteria) this;
        }

        public Criteria andWlbmBetween(String value1, String value2) {
            addCriterion("WLBM between", value1, value2, "wlbm");
            return (Criteria) this;
        }

        public Criteria andWlbmNotBetween(String value1, String value2) {
            addCriterion("WLBM not between", value1, value2, "wlbm");
            return (Criteria) this;
        }

        public Criteria andKhbmIsNull() {
            addCriterion("KHBM is null");
            return (Criteria) this;
        }

        public Criteria andKhbmIsNotNull() {
            addCriterion("KHBM is not null");
            return (Criteria) this;
        }

        public Criteria andKhbmEqualTo(String value) {
            addCriterion("KHBM =", value, "khbm");
            return (Criteria) this;
        }

        public Criteria andKhbmNotEqualTo(String value) {
            addCriterion("KHBM <>", value, "khbm");
            return (Criteria) this;
        }

        public Criteria andKhbmGreaterThan(String value) {
            addCriterion("KHBM >", value, "khbm");
            return (Criteria) this;
        }

        public Criteria andKhbmGreaterThanOrEqualTo(String value) {
            addCriterion("KHBM >=", value, "khbm");
            return (Criteria) this;
        }

        public Criteria andKhbmLessThan(String value) {
            addCriterion("KHBM <", value, "khbm");
            return (Criteria) this;
        }

        public Criteria andKhbmLessThanOrEqualTo(String value) {
            addCriterion("KHBM <=", value, "khbm");
            return (Criteria) this;
        }

        public Criteria andKhbmLike(String value) {
            addCriterion("KHBM like", value, "khbm");
            return (Criteria) this;
        }

        public Criteria andKhbmNotLike(String value) {
            addCriterion("KHBM not like", value, "khbm");
            return (Criteria) this;
        }

        public Criteria andKhbmIn(List<String> values) {
            addCriterion("KHBM in", values, "khbm");
            return (Criteria) this;
        }

        public Criteria andKhbmNotIn(List<String> values) {
            addCriterion("KHBM not in", values, "khbm");
            return (Criteria) this;
        }

        public Criteria andKhbmBetween(String value1, String value2) {
            addCriterion("KHBM between", value1, value2, "khbm");
            return (Criteria) this;
        }

        public Criteria andKhbmNotBetween(String value1, String value2) {
            addCriterion("KHBM not between", value1, value2, "khbm");
            return (Criteria) this;
        }

        public Criteria andYkbmIsNull() {
            addCriterion("YKBM is null");
            return (Criteria) this;
        }

        public Criteria andYkbmIsNotNull() {
            addCriterion("YKBM is not null");
            return (Criteria) this;
        }

        public Criteria andYkbmEqualTo(String value) {
            addCriterion("YKBM =", value, "ykbm");
            return (Criteria) this;
        }

        public Criteria andYkbmNotEqualTo(String value) {
            addCriterion("YKBM <>", value, "ykbm");
            return (Criteria) this;
        }

        public Criteria andYkbmGreaterThan(String value) {
            addCriterion("YKBM >", value, "ykbm");
            return (Criteria) this;
        }

        public Criteria andYkbmGreaterThanOrEqualTo(String value) {
            addCriterion("YKBM >=", value, "ykbm");
            return (Criteria) this;
        }

        public Criteria andYkbmLessThan(String value) {
            addCriterion("YKBM <", value, "ykbm");
            return (Criteria) this;
        }

        public Criteria andYkbmLessThanOrEqualTo(String value) {
            addCriterion("YKBM <=", value, "ykbm");
            return (Criteria) this;
        }

        public Criteria andYkbmLike(String value) {
            addCriterion("YKBM like", value, "ykbm");
            return (Criteria) this;
        }

        public Criteria andYkbmNotLike(String value) {
            addCriterion("YKBM not like", value, "ykbm");
            return (Criteria) this;
        }

        public Criteria andYkbmIn(List<String> values) {
            addCriterion("YKBM in", values, "ykbm");
            return (Criteria) this;
        }

        public Criteria andYkbmNotIn(List<String> values) {
            addCriterion("YKBM not in", values, "ykbm");
            return (Criteria) this;
        }

        public Criteria andYkbmBetween(String value1, String value2) {
            addCriterion("YKBM between", value1, value2, "ykbm");
            return (Criteria) this;
        }

        public Criteria andYkbmNotBetween(String value1, String value2) {
            addCriterion("YKBM not between", value1, value2, "ykbm");
            return (Criteria) this;
        }

        public Criteria andYkmcIsNull() {
            addCriterion("YKMC is null");
            return (Criteria) this;
        }

        public Criteria andYkmcIsNotNull() {
            addCriterion("YKMC is not null");
            return (Criteria) this;
        }

        public Criteria andYkmcEqualTo(String value) {
            addCriterion("YKMC =", value, "ykmc");
            return (Criteria) this;
        }

        public Criteria andYkmcNotEqualTo(String value) {
            addCriterion("YKMC <>", value, "ykmc");
            return (Criteria) this;
        }

        public Criteria andYkmcGreaterThan(String value) {
            addCriterion("YKMC >", value, "ykmc");
            return (Criteria) this;
        }

        public Criteria andYkmcGreaterThanOrEqualTo(String value) {
            addCriterion("YKMC >=", value, "ykmc");
            return (Criteria) this;
        }

        public Criteria andYkmcLessThan(String value) {
            addCriterion("YKMC <", value, "ykmc");
            return (Criteria) this;
        }

        public Criteria andYkmcLessThanOrEqualTo(String value) {
            addCriterion("YKMC <=", value, "ykmc");
            return (Criteria) this;
        }

        public Criteria andYkmcLike(String value) {
            addCriterion("YKMC like", value, "ykmc");
            return (Criteria) this;
        }

        public Criteria andYkmcNotLike(String value) {
            addCriterion("YKMC not like", value, "ykmc");
            return (Criteria) this;
        }

        public Criteria andYkmcIn(List<String> values) {
            addCriterion("YKMC in", values, "ykmc");
            return (Criteria) this;
        }

        public Criteria andYkmcNotIn(List<String> values) {
            addCriterion("YKMC not in", values, "ykmc");
            return (Criteria) this;
        }

        public Criteria andYkmcBetween(String value1, String value2) {
            addCriterion("YKMC between", value1, value2, "ykmc");
            return (Criteria) this;
        }

        public Criteria andYkmcNotBetween(String value1, String value2) {
            addCriterion("YKMC not between", value1, value2, "ykmc");
            return (Criteria) this;
        }

        public Criteria andPrtFlagIsNull() {
            addCriterion("Prt_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andPrtFlagIsNotNull() {
            addCriterion("Prt_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andPrtFlagEqualTo(Integer value) {
            addCriterion("Prt_FLAG =", value, "prtFlag");
            return (Criteria) this;
        }

        public Criteria andPrtFlagNotEqualTo(Integer value) {
            addCriterion("Prt_FLAG <>", value, "prtFlag");
            return (Criteria) this;
        }

        public Criteria andPrtFlagGreaterThan(Integer value) {
            addCriterion("Prt_FLAG >", value, "prtFlag");
            return (Criteria) this;
        }

        public Criteria andPrtFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("Prt_FLAG >=", value, "prtFlag");
            return (Criteria) this;
        }

        public Criteria andPrtFlagLessThan(Integer value) {
            addCriterion("Prt_FLAG <", value, "prtFlag");
            return (Criteria) this;
        }

        public Criteria andPrtFlagLessThanOrEqualTo(Integer value) {
            addCriterion("Prt_FLAG <=", value, "prtFlag");
            return (Criteria) this;
        }

        public Criteria andPrtFlagIn(List<Integer> values) {
            addCriterion("Prt_FLAG in", values, "prtFlag");
            return (Criteria) this;
        }

        public Criteria andPrtFlagNotIn(List<Integer> values) {
            addCriterion("Prt_FLAG not in", values, "prtFlag");
            return (Criteria) this;
        }

        public Criteria andPrtFlagBetween(Integer value1, Integer value2) {
            addCriterion("Prt_FLAG between", value1, value2, "prtFlag");
            return (Criteria) this;
        }

        public Criteria andPrtFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("Prt_FLAG not between", value1, value2, "prtFlag");
            return (Criteria) this;
        }

        public Criteria andSeralIsNull() {
            addCriterion("SERAL is null");
            return (Criteria) this;
        }

        public Criteria andSeralIsNotNull() {
            addCriterion("SERAL is not null");
            return (Criteria) this;
        }

        public Criteria andSeralEqualTo(String value) {
            addCriterion("SERAL =", value, "seral");
            return (Criteria) this;
        }

        public Criteria andSeralNotEqualTo(String value) {
            addCriterion("SERAL <>", value, "seral");
            return (Criteria) this;
        }

        public Criteria andSeralGreaterThan(String value) {
            addCriterion("SERAL >", value, "seral");
            return (Criteria) this;
        }

        public Criteria andSeralGreaterThanOrEqualTo(String value) {
            addCriterion("SERAL >=", value, "seral");
            return (Criteria) this;
        }

        public Criteria andSeralLessThan(String value) {
            addCriterion("SERAL <", value, "seral");
            return (Criteria) this;
        }

        public Criteria andSeralLessThanOrEqualTo(String value) {
            addCriterion("SERAL <=", value, "seral");
            return (Criteria) this;
        }

        public Criteria andSeralLike(String value) {
            addCriterion("SERAL like", value, "seral");
            return (Criteria) this;
        }

        public Criteria andSeralNotLike(String value) {
            addCriterion("SERAL not like", value, "seral");
            return (Criteria) this;
        }

        public Criteria andSeralIn(List<String> values) {
            addCriterion("SERAL in", values, "seral");
            return (Criteria) this;
        }

        public Criteria andSeralNotIn(List<String> values) {
            addCriterion("SERAL not in", values, "seral");
            return (Criteria) this;
        }

        public Criteria andSeralBetween(String value1, String value2) {
            addCriterion("SERAL between", value1, value2, "seral");
            return (Criteria) this;
        }

        public Criteria andSeralNotBetween(String value1, String value2) {
            addCriterion("SERAL not between", value1, value2, "seral");
            return (Criteria) this;
        }

        public Criteria andStyleFyIsNull() {
            addCriterion("style_fy is null");
            return (Criteria) this;
        }

        public Criteria andStyleFyIsNotNull() {
            addCriterion("style_fy is not null");
            return (Criteria) this;
        }

        public Criteria andStyleFyEqualTo(String value) {
            addCriterion("style_fy =", value, "styleFy");
            return (Criteria) this;
        }

        public Criteria andStyleFyNotEqualTo(String value) {
            addCriterion("style_fy <>", value, "styleFy");
            return (Criteria) this;
        }

        public Criteria andStyleFyGreaterThan(String value) {
            addCriterion("style_fy >", value, "styleFy");
            return (Criteria) this;
        }

        public Criteria andStyleFyGreaterThanOrEqualTo(String value) {
            addCriterion("style_fy >=", value, "styleFy");
            return (Criteria) this;
        }

        public Criteria andStyleFyLessThan(String value) {
            addCriterion("style_fy <", value, "styleFy");
            return (Criteria) this;
        }

        public Criteria andStyleFyLessThanOrEqualTo(String value) {
            addCriterion("style_fy <=", value, "styleFy");
            return (Criteria) this;
        }

        public Criteria andStyleFyLike(String value) {
            addCriterion("style_fy like", value, "styleFy");
            return (Criteria) this;
        }

        public Criteria andStyleFyNotLike(String value) {
            addCriterion("style_fy not like", value, "styleFy");
            return (Criteria) this;
        }

        public Criteria andStyleFyIn(List<String> values) {
            addCriterion("style_fy in", values, "styleFy");
            return (Criteria) this;
        }

        public Criteria andStyleFyNotIn(List<String> values) {
            addCriterion("style_fy not in", values, "styleFy");
            return (Criteria) this;
        }

        public Criteria andStyleFyBetween(String value1, String value2) {
            addCriterion("style_fy between", value1, value2, "styleFy");
            return (Criteria) this;
        }

        public Criteria andStyleFyNotBetween(String value1, String value2) {
            addCriterion("style_fy not between", value1, value2, "styleFy");
            return (Criteria) this;
        }

        public Criteria andCardchecktimeIsNull() {
            addCriterion("CardCheckTime is null");
            return (Criteria) this;
        }

        public Criteria andCardchecktimeIsNotNull() {
            addCriterion("CardCheckTime is not null");
            return (Criteria) this;
        }

        public Criteria andCardchecktimeEqualTo(String value) {
            addCriterion("CardCheckTime =", value, "cardchecktime");
            return (Criteria) this;
        }

        public Criteria andCardchecktimeNotEqualTo(String value) {
            addCriterion("CardCheckTime <>", value, "cardchecktime");
            return (Criteria) this;
        }

        public Criteria andCardchecktimeGreaterThan(String value) {
            addCriterion("CardCheckTime >", value, "cardchecktime");
            return (Criteria) this;
        }

        public Criteria andCardchecktimeGreaterThanOrEqualTo(String value) {
            addCriterion("CardCheckTime >=", value, "cardchecktime");
            return (Criteria) this;
        }

        public Criteria andCardchecktimeLessThan(String value) {
            addCriterion("CardCheckTime <", value, "cardchecktime");
            return (Criteria) this;
        }

        public Criteria andCardchecktimeLessThanOrEqualTo(String value) {
            addCriterion("CardCheckTime <=", value, "cardchecktime");
            return (Criteria) this;
        }

        public Criteria andCardchecktimeLike(String value) {
            addCriterion("CardCheckTime like", value, "cardchecktime");
            return (Criteria) this;
        }

        public Criteria andCardchecktimeNotLike(String value) {
            addCriterion("CardCheckTime not like", value, "cardchecktime");
            return (Criteria) this;
        }

        public Criteria andCardchecktimeIn(List<String> values) {
            addCriterion("CardCheckTime in", values, "cardchecktime");
            return (Criteria) this;
        }

        public Criteria andCardchecktimeNotIn(List<String> values) {
            addCriterion("CardCheckTime not in", values, "cardchecktime");
            return (Criteria) this;
        }

        public Criteria andCardchecktimeBetween(String value1, String value2) {
            addCriterion("CardCheckTime between", value1, value2, "cardchecktime");
            return (Criteria) this;
        }

        public Criteria andCardchecktimeNotBetween(String value1, String value2) {
            addCriterion("CardCheckTime not between", value1, value2, "cardchecktime");
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