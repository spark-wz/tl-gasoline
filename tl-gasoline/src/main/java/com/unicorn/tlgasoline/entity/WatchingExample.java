package com.unicorn.tlgasoline.entity;

import java.util.ArrayList;
import java.util.List;

public class WatchingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WatchingExample() {
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

        public Criteria andHwhIsNull() {
            addCriterion("HWH is null");
            return (Criteria) this;
        }

        public Criteria andHwhIsNotNull() {
            addCriterion("HWH is not null");
            return (Criteria) this;
        }

        public Criteria andHwhEqualTo(Integer value) {
            addCriterion("HWH =", value, "hwh");
            return (Criteria) this;
        }

        public Criteria andHwhNotEqualTo(Integer value) {
            addCriterion("HWH <>", value, "hwh");
            return (Criteria) this;
        }

        public Criteria andHwhGreaterThan(Integer value) {
            addCriterion("HWH >", value, "hwh");
            return (Criteria) this;
        }

        public Criteria andHwhGreaterThanOrEqualTo(Integer value) {
            addCriterion("HWH >=", value, "hwh");
            return (Criteria) this;
        }

        public Criteria andHwhLessThan(Integer value) {
            addCriterion("HWH <", value, "hwh");
            return (Criteria) this;
        }

        public Criteria andHwhLessThanOrEqualTo(Integer value) {
            addCriterion("HWH <=", value, "hwh");
            return (Criteria) this;
        }

        public Criteria andHwhIn(List<Integer> values) {
            addCriterion("HWH in", values, "hwh");
            return (Criteria) this;
        }

        public Criteria andHwhNotIn(List<Integer> values) {
            addCriterion("HWH not in", values, "hwh");
            return (Criteria) this;
        }

        public Criteria andHwhBetween(Integer value1, Integer value2) {
            addCriterion("HWH between", value1, value2, "hwh");
            return (Criteria) this;
        }

        public Criteria andHwhNotBetween(Integer value1, Integer value2) {
            addCriterion("HWH not between", value1, value2, "hwh");
            return (Criteria) this;
        }

        public Criteria andDythIsNull() {
            addCriterion("Dyth is null");
            return (Criteria) this;
        }

        public Criteria andDythIsNotNull() {
            addCriterion("Dyth is not null");
            return (Criteria) this;
        }

        public Criteria andDythEqualTo(Integer value) {
            addCriterion("Dyth =", value, "dyth");
            return (Criteria) this;
        }

        public Criteria andDythNotEqualTo(Integer value) {
            addCriterion("Dyth <>", value, "dyth");
            return (Criteria) this;
        }

        public Criteria andDythGreaterThan(Integer value) {
            addCriterion("Dyth >", value, "dyth");
            return (Criteria) this;
        }

        public Criteria andDythGreaterThanOrEqualTo(Integer value) {
            addCriterion("Dyth >=", value, "dyth");
            return (Criteria) this;
        }

        public Criteria andDythLessThan(Integer value) {
            addCriterion("Dyth <", value, "dyth");
            return (Criteria) this;
        }

        public Criteria andDythLessThanOrEqualTo(Integer value) {
            addCriterion("Dyth <=", value, "dyth");
            return (Criteria) this;
        }

        public Criteria andDythIn(List<Integer> values) {
            addCriterion("Dyth in", values, "dyth");
            return (Criteria) this;
        }

        public Criteria andDythNotIn(List<Integer> values) {
            addCriterion("Dyth not in", values, "dyth");
            return (Criteria) this;
        }

        public Criteria andDythBetween(Integer value1, Integer value2) {
            addCriterion("Dyth between", value1, value2, "dyth");
            return (Criteria) this;
        }

        public Criteria andDythNotBetween(Integer value1, Integer value2) {
            addCriterion("Dyth not between", value1, value2, "dyth");
            return (Criteria) this;
        }

        public Criteria andDylhIsNull() {
            addCriterion("Dylh is null");
            return (Criteria) this;
        }

        public Criteria andDylhIsNotNull() {
            addCriterion("Dylh is not null");
            return (Criteria) this;
        }

        public Criteria andDylhEqualTo(Integer value) {
            addCriterion("Dylh =", value, "dylh");
            return (Criteria) this;
        }

        public Criteria andDylhNotEqualTo(Integer value) {
            addCriterion("Dylh <>", value, "dylh");
            return (Criteria) this;
        }

        public Criteria andDylhGreaterThan(Integer value) {
            addCriterion("Dylh >", value, "dylh");
            return (Criteria) this;
        }

        public Criteria andDylhGreaterThanOrEqualTo(Integer value) {
            addCriterion("Dylh >=", value, "dylh");
            return (Criteria) this;
        }

        public Criteria andDylhLessThan(Integer value) {
            addCriterion("Dylh <", value, "dylh");
            return (Criteria) this;
        }

        public Criteria andDylhLessThanOrEqualTo(Integer value) {
            addCriterion("Dylh <=", value, "dylh");
            return (Criteria) this;
        }

        public Criteria andDylhIn(List<Integer> values) {
            addCriterion("Dylh in", values, "dylh");
            return (Criteria) this;
        }

        public Criteria andDylhNotIn(List<Integer> values) {
            addCriterion("Dylh not in", values, "dylh");
            return (Criteria) this;
        }

        public Criteria andDylhBetween(Integer value1, Integer value2) {
            addCriterion("Dylh between", value1, value2, "dylh");
            return (Criteria) this;
        }

        public Criteria andDylhNotBetween(Integer value1, Integer value2) {
            addCriterion("Dylh not between", value1, value2, "dylh");
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

        public Criteria andYbxsIsNull() {
            addCriterion("YBXS is null");
            return (Criteria) this;
        }

        public Criteria andYbxsIsNotNull() {
            addCriterion("YBXS is not null");
            return (Criteria) this;
        }

        public Criteria andYbxsEqualTo(Float value) {
            addCriterion("YBXS =", value, "ybxs");
            return (Criteria) this;
        }

        public Criteria andYbxsNotEqualTo(Float value) {
            addCriterion("YBXS <>", value, "ybxs");
            return (Criteria) this;
        }

        public Criteria andYbxsGreaterThan(Float value) {
            addCriterion("YBXS >", value, "ybxs");
            return (Criteria) this;
        }

        public Criteria andYbxsGreaterThanOrEqualTo(Float value) {
            addCriterion("YBXS >=", value, "ybxs");
            return (Criteria) this;
        }

        public Criteria andYbxsLessThan(Float value) {
            addCriterion("YBXS <", value, "ybxs");
            return (Criteria) this;
        }

        public Criteria andYbxsLessThanOrEqualTo(Float value) {
            addCriterion("YBXS <=", value, "ybxs");
            return (Criteria) this;
        }

        public Criteria andYbxsIn(List<Float> values) {
            addCriterion("YBXS in", values, "ybxs");
            return (Criteria) this;
        }

        public Criteria andYbxsNotIn(List<Float> values) {
            addCriterion("YBXS not in", values, "ybxs");
            return (Criteria) this;
        }

        public Criteria andYbxsBetween(Float value1, Float value2) {
            addCriterion("YBXS between", value1, value2, "ybxs");
            return (Criteria) this;
        }

        public Criteria andYbxsNotBetween(Float value1, Float value2) {
            addCriterion("YBXS not between", value1, value2, "ybxs");
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

        public Criteria andDfgsIsNull() {
            addCriterion("DFGS is null");
            return (Criteria) this;
        }

        public Criteria andDfgsIsNotNull() {
            addCriterion("DFGS is not null");
            return (Criteria) this;
        }

        public Criteria andDfgsEqualTo(Integer value) {
            addCriterion("DFGS =", value, "dfgs");
            return (Criteria) this;
        }

        public Criteria andDfgsNotEqualTo(Integer value) {
            addCriterion("DFGS <>", value, "dfgs");
            return (Criteria) this;
        }

        public Criteria andDfgsGreaterThan(Integer value) {
            addCriterion("DFGS >", value, "dfgs");
            return (Criteria) this;
        }

        public Criteria andDfgsGreaterThanOrEqualTo(Integer value) {
            addCriterion("DFGS >=", value, "dfgs");
            return (Criteria) this;
        }

        public Criteria andDfgsLessThan(Integer value) {
            addCriterion("DFGS <", value, "dfgs");
            return (Criteria) this;
        }

        public Criteria andDfgsLessThanOrEqualTo(Integer value) {
            addCriterion("DFGS <=", value, "dfgs");
            return (Criteria) this;
        }

        public Criteria andDfgsIn(List<Integer> values) {
            addCriterion("DFGS in", values, "dfgs");
            return (Criteria) this;
        }

        public Criteria andDfgsNotIn(List<Integer> values) {
            addCriterion("DFGS not in", values, "dfgs");
            return (Criteria) this;
        }

        public Criteria andDfgsBetween(Integer value1, Integer value2) {
            addCriterion("DFGS between", value1, value2, "dfgs");
            return (Criteria) this;
        }

        public Criteria andDfgsNotBetween(Integer value1, Integer value2) {
            addCriterion("DFGS not between", value1, value2, "dfgs");
            return (Criteria) this;
        }

        public Criteria andYfgsIsNull() {
            addCriterion("YFGS is null");
            return (Criteria) this;
        }

        public Criteria andYfgsIsNotNull() {
            addCriterion("YFGS is not null");
            return (Criteria) this;
        }

        public Criteria andYfgsEqualTo(Integer value) {
            addCriterion("YFGS =", value, "yfgs");
            return (Criteria) this;
        }

        public Criteria andYfgsNotEqualTo(Integer value) {
            addCriterion("YFGS <>", value, "yfgs");
            return (Criteria) this;
        }

        public Criteria andYfgsGreaterThan(Integer value) {
            addCriterion("YFGS >", value, "yfgs");
            return (Criteria) this;
        }

        public Criteria andYfgsGreaterThanOrEqualTo(Integer value) {
            addCriterion("YFGS >=", value, "yfgs");
            return (Criteria) this;
        }

        public Criteria andYfgsLessThan(Integer value) {
            addCriterion("YFGS <", value, "yfgs");
            return (Criteria) this;
        }

        public Criteria andYfgsLessThanOrEqualTo(Integer value) {
            addCriterion("YFGS <=", value, "yfgs");
            return (Criteria) this;
        }

        public Criteria andYfgsIn(List<Integer> values) {
            addCriterion("YFGS in", values, "yfgs");
            return (Criteria) this;
        }

        public Criteria andYfgsNotIn(List<Integer> values) {
            addCriterion("YFGS not in", values, "yfgs");
            return (Criteria) this;
        }

        public Criteria andYfgsBetween(Integer value1, Integer value2) {
            addCriterion("YFGS between", value1, value2, "yfgs");
            return (Criteria) this;
        }

        public Criteria andYfgsNotBetween(Integer value1, Integer value2) {
            addCriterion("YFGS not between", value1, value2, "yfgs");
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

        public Criteria andFystyleIsNull() {
            addCriterion("FYSTYLE is null");
            return (Criteria) this;
        }

        public Criteria andFystyleIsNotNull() {
            addCriterion("FYSTYLE is not null");
            return (Criteria) this;
        }

        public Criteria andFystyleEqualTo(Integer value) {
            addCriterion("FYSTYLE =", value, "fystyle");
            return (Criteria) this;
        }

        public Criteria andFystyleNotEqualTo(Integer value) {
            addCriterion("FYSTYLE <>", value, "fystyle");
            return (Criteria) this;
        }

        public Criteria andFystyleGreaterThan(Integer value) {
            addCriterion("FYSTYLE >", value, "fystyle");
            return (Criteria) this;
        }

        public Criteria andFystyleGreaterThanOrEqualTo(Integer value) {
            addCriterion("FYSTYLE >=", value, "fystyle");
            return (Criteria) this;
        }

        public Criteria andFystyleLessThan(Integer value) {
            addCriterion("FYSTYLE <", value, "fystyle");
            return (Criteria) this;
        }

        public Criteria andFystyleLessThanOrEqualTo(Integer value) {
            addCriterion("FYSTYLE <=", value, "fystyle");
            return (Criteria) this;
        }

        public Criteria andFystyleIn(List<Integer> values) {
            addCriterion("FYSTYLE in", values, "fystyle");
            return (Criteria) this;
        }

        public Criteria andFystyleNotIn(List<Integer> values) {
            addCriterion("FYSTYLE not in", values, "fystyle");
            return (Criteria) this;
        }

        public Criteria andFystyleBetween(Integer value1, Integer value2) {
            addCriterion("FYSTYLE between", value1, value2, "fystyle");
            return (Criteria) this;
        }

        public Criteria andFystyleNotBetween(Integer value1, Integer value2) {
            addCriterion("FYSTYLE not between", value1, value2, "fystyle");
            return (Criteria) this;
        }

        public Criteria andFaIsNull() {
            addCriterion("FA is null");
            return (Criteria) this;
        }

        public Criteria andFaIsNotNull() {
            addCriterion("FA is not null");
            return (Criteria) this;
        }

        public Criteria andFaEqualTo(Integer value) {
            addCriterion("FA =", value, "fa");
            return (Criteria) this;
        }

        public Criteria andFaNotEqualTo(Integer value) {
            addCriterion("FA <>", value, "fa");
            return (Criteria) this;
        }

        public Criteria andFaGreaterThan(Integer value) {
            addCriterion("FA >", value, "fa");
            return (Criteria) this;
        }

        public Criteria andFaGreaterThanOrEqualTo(Integer value) {
            addCriterion("FA >=", value, "fa");
            return (Criteria) this;
        }

        public Criteria andFaLessThan(Integer value) {
            addCriterion("FA <", value, "fa");
            return (Criteria) this;
        }

        public Criteria andFaLessThanOrEqualTo(Integer value) {
            addCriterion("FA <=", value, "fa");
            return (Criteria) this;
        }

        public Criteria andFaIn(List<Integer> values) {
            addCriterion("FA in", values, "fa");
            return (Criteria) this;
        }

        public Criteria andFaNotIn(List<Integer> values) {
            addCriterion("FA not in", values, "fa");
            return (Criteria) this;
        }

        public Criteria andFaBetween(Integer value1, Integer value2) {
            addCriterion("FA between", value1, value2, "fa");
            return (Criteria) this;
        }

        public Criteria andFaNotBetween(Integer value1, Integer value2) {
            addCriterion("FA not between", value1, value2, "fa");
            return (Criteria) this;
        }

        public Criteria andFbIsNull() {
            addCriterion("FB is null");
            return (Criteria) this;
        }

        public Criteria andFbIsNotNull() {
            addCriterion("FB is not null");
            return (Criteria) this;
        }

        public Criteria andFbEqualTo(Integer value) {
            addCriterion("FB =", value, "fb");
            return (Criteria) this;
        }

        public Criteria andFbNotEqualTo(Integer value) {
            addCriterion("FB <>", value, "fb");
            return (Criteria) this;
        }

        public Criteria andFbGreaterThan(Integer value) {
            addCriterion("FB >", value, "fb");
            return (Criteria) this;
        }

        public Criteria andFbGreaterThanOrEqualTo(Integer value) {
            addCriterion("FB >=", value, "fb");
            return (Criteria) this;
        }

        public Criteria andFbLessThan(Integer value) {
            addCriterion("FB <", value, "fb");
            return (Criteria) this;
        }

        public Criteria andFbLessThanOrEqualTo(Integer value) {
            addCriterion("FB <=", value, "fb");
            return (Criteria) this;
        }

        public Criteria andFbIn(List<Integer> values) {
            addCriterion("FB in", values, "fb");
            return (Criteria) this;
        }

        public Criteria andFbNotIn(List<Integer> values) {
            addCriterion("FB not in", values, "fb");
            return (Criteria) this;
        }

        public Criteria andFbBetween(Integer value1, Integer value2) {
            addCriterion("FB between", value1, value2, "fb");
            return (Criteria) this;
        }

        public Criteria andFbNotBetween(Integer value1, Integer value2) {
            addCriterion("FB not between", value1, value2, "fb");
            return (Criteria) this;
        }

        public Criteria andYybjIsNull() {
            addCriterion("YYBJ is null");
            return (Criteria) this;
        }

        public Criteria andYybjIsNotNull() {
            addCriterion("YYBJ is not null");
            return (Criteria) this;
        }

        public Criteria andYybjEqualTo(Integer value) {
            addCriterion("YYBJ =", value, "yybj");
            return (Criteria) this;
        }

        public Criteria andYybjNotEqualTo(Integer value) {
            addCriterion("YYBJ <>", value, "yybj");
            return (Criteria) this;
        }

        public Criteria andYybjGreaterThan(Integer value) {
            addCriterion("YYBJ >", value, "yybj");
            return (Criteria) this;
        }

        public Criteria andYybjGreaterThanOrEqualTo(Integer value) {
            addCriterion("YYBJ >=", value, "yybj");
            return (Criteria) this;
        }

        public Criteria andYybjLessThan(Integer value) {
            addCriterion("YYBJ <", value, "yybj");
            return (Criteria) this;
        }

        public Criteria andYybjLessThanOrEqualTo(Integer value) {
            addCriterion("YYBJ <=", value, "yybj");
            return (Criteria) this;
        }

        public Criteria andYybjIn(List<Integer> values) {
            addCriterion("YYBJ in", values, "yybj");
            return (Criteria) this;
        }

        public Criteria andYybjNotIn(List<Integer> values) {
            addCriterion("YYBJ not in", values, "yybj");
            return (Criteria) this;
        }

        public Criteria andYybjBetween(Integer value1, Integer value2) {
            addCriterion("YYBJ between", value1, value2, "yybj");
            return (Criteria) this;
        }

        public Criteria andYybjNotBetween(Integer value1, Integer value2) {
            addCriterion("YYBJ not between", value1, value2, "yybj");
            return (Criteria) this;
        }

        public Criteria andJdbjIsNull() {
            addCriterion("JDBJ is null");
            return (Criteria) this;
        }

        public Criteria andJdbjIsNotNull() {
            addCriterion("JDBJ is not null");
            return (Criteria) this;
        }

        public Criteria andJdbjEqualTo(Integer value) {
            addCriterion("JDBJ =", value, "jdbj");
            return (Criteria) this;
        }

        public Criteria andJdbjNotEqualTo(Integer value) {
            addCriterion("JDBJ <>", value, "jdbj");
            return (Criteria) this;
        }

        public Criteria andJdbjGreaterThan(Integer value) {
            addCriterion("JDBJ >", value, "jdbj");
            return (Criteria) this;
        }

        public Criteria andJdbjGreaterThanOrEqualTo(Integer value) {
            addCriterion("JDBJ >=", value, "jdbj");
            return (Criteria) this;
        }

        public Criteria andJdbjLessThan(Integer value) {
            addCriterion("JDBJ <", value, "jdbj");
            return (Criteria) this;
        }

        public Criteria andJdbjLessThanOrEqualTo(Integer value) {
            addCriterion("JDBJ <=", value, "jdbj");
            return (Criteria) this;
        }

        public Criteria andJdbjIn(List<Integer> values) {
            addCriterion("JDBJ in", values, "jdbj");
            return (Criteria) this;
        }

        public Criteria andJdbjNotIn(List<Integer> values) {
            addCriterion("JDBJ not in", values, "jdbj");
            return (Criteria) this;
        }

        public Criteria andJdbjBetween(Integer value1, Integer value2) {
            addCriterion("JDBJ between", value1, value2, "jdbj");
            return (Criteria) this;
        }

        public Criteria andJdbjNotBetween(Integer value1, Integer value2) {
            addCriterion("JDBJ not between", value1, value2, "jdbj");
            return (Criteria) this;
        }

        public Criteria andYbIsNull() {
            addCriterion("YB is null");
            return (Criteria) this;
        }

        public Criteria andYbIsNotNull() {
            addCriterion("YB is not null");
            return (Criteria) this;
        }

        public Criteria andYbEqualTo(Integer value) {
            addCriterion("YB =", value, "yb");
            return (Criteria) this;
        }

        public Criteria andYbNotEqualTo(Integer value) {
            addCriterion("YB <>", value, "yb");
            return (Criteria) this;
        }

        public Criteria andYbGreaterThan(Integer value) {
            addCriterion("YB >", value, "yb");
            return (Criteria) this;
        }

        public Criteria andYbGreaterThanOrEqualTo(Integer value) {
            addCriterion("YB >=", value, "yb");
            return (Criteria) this;
        }

        public Criteria andYbLessThan(Integer value) {
            addCriterion("YB <", value, "yb");
            return (Criteria) this;
        }

        public Criteria andYbLessThanOrEqualTo(Integer value) {
            addCriterion("YB <=", value, "yb");
            return (Criteria) this;
        }

        public Criteria andYbIn(List<Integer> values) {
            addCriterion("YB in", values, "yb");
            return (Criteria) this;
        }

        public Criteria andYbNotIn(List<Integer> values) {
            addCriterion("YB not in", values, "yb");
            return (Criteria) this;
        }

        public Criteria andYbBetween(Integer value1, Integer value2) {
            addCriterion("YB between", value1, value2, "yb");
            return (Criteria) this;
        }

        public Criteria andYbNotBetween(Integer value1, Integer value2) {
            addCriterion("YB not between", value1, value2, "yb");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("STATE is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("STATE not between", value1, value2, "state");
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