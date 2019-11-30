package com.unicorn.tlgasoline.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TieluSfyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TieluSfyExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSfyIsNull() {
            addCriterion("sfy is null");
            return (Criteria) this;
        }

        public Criteria andSfyIsNotNull() {
            addCriterion("sfy is not null");
            return (Criteria) this;
        }

        public Criteria andSfyEqualTo(Byte value) {
            addCriterion("sfy =", value, "sfy");
            return (Criteria) this;
        }

        public Criteria andSfyNotEqualTo(Byte value) {
            addCriterion("sfy <>", value, "sfy");
            return (Criteria) this;
        }

        public Criteria andSfyGreaterThan(Byte value) {
            addCriterion("sfy >", value, "sfy");
            return (Criteria) this;
        }

        public Criteria andSfyGreaterThanOrEqualTo(Byte value) {
            addCriterion("sfy >=", value, "sfy");
            return (Criteria) this;
        }

        public Criteria andSfyLessThan(Byte value) {
            addCriterion("sfy <", value, "sfy");
            return (Criteria) this;
        }

        public Criteria andSfyLessThanOrEqualTo(Byte value) {
            addCriterion("sfy <=", value, "sfy");
            return (Criteria) this;
        }

        public Criteria andSfyIn(List<Byte> values) {
            addCriterion("sfy in", values, "sfy");
            return (Criteria) this;
        }

        public Criteria andSfyNotIn(List<Byte> values) {
            addCriterion("sfy not in", values, "sfy");
            return (Criteria) this;
        }

        public Criteria andSfyBetween(Byte value1, Byte value2) {
            addCriterion("sfy between", value1, value2, "sfy");
            return (Criteria) this;
        }

        public Criteria andSfyNotBetween(Byte value1, Byte value2) {
            addCriterion("sfy not between", value1, value2, "sfy");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Boolean value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Boolean value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Boolean value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Boolean value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Boolean> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Boolean> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andThisCumulativeIsNull() {
            addCriterion("this_cumulative is null");
            return (Criteria) this;
        }

        public Criteria andThisCumulativeIsNotNull() {
            addCriterion("this_cumulative is not null");
            return (Criteria) this;
        }

        public Criteria andThisCumulativeEqualTo(BigDecimal value) {
            addCriterion("this_cumulative =", value, "thisCumulative");
            return (Criteria) this;
        }

        public Criteria andThisCumulativeNotEqualTo(BigDecimal value) {
            addCriterion("this_cumulative <>", value, "thisCumulative");
            return (Criteria) this;
        }

        public Criteria andThisCumulativeGreaterThan(BigDecimal value) {
            addCriterion("this_cumulative >", value, "thisCumulative");
            return (Criteria) this;
        }

        public Criteria andThisCumulativeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("this_cumulative >=", value, "thisCumulative");
            return (Criteria) this;
        }

        public Criteria andThisCumulativeLessThan(BigDecimal value) {
            addCriterion("this_cumulative <", value, "thisCumulative");
            return (Criteria) this;
        }

        public Criteria andThisCumulativeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("this_cumulative <=", value, "thisCumulative");
            return (Criteria) this;
        }

        public Criteria andThisCumulativeIn(List<BigDecimal> values) {
            addCriterion("this_cumulative in", values, "thisCumulative");
            return (Criteria) this;
        }

        public Criteria andThisCumulativeNotIn(List<BigDecimal> values) {
            addCriterion("this_cumulative not in", values, "thisCumulative");
            return (Criteria) this;
        }

        public Criteria andThisCumulativeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("this_cumulative between", value1, value2, "thisCumulative");
            return (Criteria) this;
        }

        public Criteria andThisCumulativeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("this_cumulative not between", value1, value2, "thisCumulative");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(String value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(String value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(String value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(String value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(String value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLike(String value) {
            addCriterion("start_time like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotLike(String value) {
            addCriterion("start_time not like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<String> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<String> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(String value1, String value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(String value1, String value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("Time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("Time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(String value) {
            addCriterion("Time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(String value) {
            addCriterion("Time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(String value) {
            addCriterion("Time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(String value) {
            addCriterion("Time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(String value) {
            addCriterion("Time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(String value) {
            addCriterion("Time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLike(String value) {
            addCriterion("Time like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotLike(String value) {
            addCriterion("Time not like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<String> values) {
            addCriterion("Time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<String> values) {
            addCriterion("Time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(String value1, String value2) {
            addCriterion("Time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(String value1, String value2) {
            addCriterion("Time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andLiusuIsNull() {
            addCriterion("Liusu is null");
            return (Criteria) this;
        }

        public Criteria andLiusuIsNotNull() {
            addCriterion("Liusu is not null");
            return (Criteria) this;
        }

        public Criteria andLiusuEqualTo(String value) {
            addCriterion("Liusu =", value, "liusu");
            return (Criteria) this;
        }

        public Criteria andLiusuNotEqualTo(String value) {
            addCriterion("Liusu <>", value, "liusu");
            return (Criteria) this;
        }

        public Criteria andLiusuGreaterThan(String value) {
            addCriterion("Liusu >", value, "liusu");
            return (Criteria) this;
        }

        public Criteria andLiusuGreaterThanOrEqualTo(String value) {
            addCriterion("Liusu >=", value, "liusu");
            return (Criteria) this;
        }

        public Criteria andLiusuLessThan(String value) {
            addCriterion("Liusu <", value, "liusu");
            return (Criteria) this;
        }

        public Criteria andLiusuLessThanOrEqualTo(String value) {
            addCriterion("Liusu <=", value, "liusu");
            return (Criteria) this;
        }

        public Criteria andLiusuLike(String value) {
            addCriterion("Liusu like", value, "liusu");
            return (Criteria) this;
        }

        public Criteria andLiusuNotLike(String value) {
            addCriterion("Liusu not like", value, "liusu");
            return (Criteria) this;
        }

        public Criteria andLiusuIn(List<String> values) {
            addCriterion("Liusu in", values, "liusu");
            return (Criteria) this;
        }

        public Criteria andLiusuNotIn(List<String> values) {
            addCriterion("Liusu not in", values, "liusu");
            return (Criteria) this;
        }

        public Criteria andLiusuBetween(String value1, String value2) {
            addCriterion("Liusu between", value1, value2, "liusu");
            return (Criteria) this;
        }

        public Criteria andLiusuNotBetween(String value1, String value2) {
            addCriterion("Liusu not between", value1, value2, "liusu");
            return (Criteria) this;
        }

        public Criteria andMiduIsNull() {
            addCriterion("Midu is null");
            return (Criteria) this;
        }

        public Criteria andMiduIsNotNull() {
            addCriterion("Midu is not null");
            return (Criteria) this;
        }

        public Criteria andMiduEqualTo(String value) {
            addCriterion("Midu =", value, "midu");
            return (Criteria) this;
        }

        public Criteria andMiduNotEqualTo(String value) {
            addCriterion("Midu <>", value, "midu");
            return (Criteria) this;
        }

        public Criteria andMiduGreaterThan(String value) {
            addCriterion("Midu >", value, "midu");
            return (Criteria) this;
        }

        public Criteria andMiduGreaterThanOrEqualTo(String value) {
            addCriterion("Midu >=", value, "midu");
            return (Criteria) this;
        }

        public Criteria andMiduLessThan(String value) {
            addCriterion("Midu <", value, "midu");
            return (Criteria) this;
        }

        public Criteria andMiduLessThanOrEqualTo(String value) {
            addCriterion("Midu <=", value, "midu");
            return (Criteria) this;
        }

        public Criteria andMiduLike(String value) {
            addCriterion("Midu like", value, "midu");
            return (Criteria) this;
        }

        public Criteria andMiduNotLike(String value) {
            addCriterion("Midu not like", value, "midu");
            return (Criteria) this;
        }

        public Criteria andMiduIn(List<String> values) {
            addCriterion("Midu in", values, "midu");
            return (Criteria) this;
        }

        public Criteria andMiduNotIn(List<String> values) {
            addCriterion("Midu not in", values, "midu");
            return (Criteria) this;
        }

        public Criteria andMiduBetween(String value1, String value2) {
            addCriterion("Midu between", value1, value2, "midu");
            return (Criteria) this;
        }

        public Criteria andMiduNotBetween(String value1, String value2) {
            addCriterion("Midu not between", value1, value2, "midu");
            return (Criteria) this;
        }

        public Criteria andWenduIsNull() {
            addCriterion("Wendu is null");
            return (Criteria) this;
        }

        public Criteria andWenduIsNotNull() {
            addCriterion("Wendu is not null");
            return (Criteria) this;
        }

        public Criteria andWenduEqualTo(String value) {
            addCriterion("Wendu =", value, "wendu");
            return (Criteria) this;
        }

        public Criteria andWenduNotEqualTo(String value) {
            addCriterion("Wendu <>", value, "wendu");
            return (Criteria) this;
        }

        public Criteria andWenduGreaterThan(String value) {
            addCriterion("Wendu >", value, "wendu");
            return (Criteria) this;
        }

        public Criteria andWenduGreaterThanOrEqualTo(String value) {
            addCriterion("Wendu >=", value, "wendu");
            return (Criteria) this;
        }

        public Criteria andWenduLessThan(String value) {
            addCriterion("Wendu <", value, "wendu");
            return (Criteria) this;
        }

        public Criteria andWenduLessThanOrEqualTo(String value) {
            addCriterion("Wendu <=", value, "wendu");
            return (Criteria) this;
        }

        public Criteria andWenduLike(String value) {
            addCriterion("Wendu like", value, "wendu");
            return (Criteria) this;
        }

        public Criteria andWenduNotLike(String value) {
            addCriterion("Wendu not like", value, "wendu");
            return (Criteria) this;
        }

        public Criteria andWenduIn(List<String> values) {
            addCriterion("Wendu in", values, "wendu");
            return (Criteria) this;
        }

        public Criteria andWenduNotIn(List<String> values) {
            addCriterion("Wendu not in", values, "wendu");
            return (Criteria) this;
        }

        public Criteria andWenduBetween(String value1, String value2) {
            addCriterion("Wendu between", value1, value2, "wendu");
            return (Criteria) this;
        }

        public Criteria andWenduNotBetween(String value1, String value2) {
            addCriterion("Wendu not between", value1, value2, "wendu");
            return (Criteria) this;
        }

        public Criteria andLeijiIsNull() {
            addCriterion("Leiji is null");
            return (Criteria) this;
        }

        public Criteria andLeijiIsNotNull() {
            addCriterion("Leiji is not null");
            return (Criteria) this;
        }

        public Criteria andLeijiEqualTo(String value) {
            addCriterion("Leiji =", value, "leiji");
            return (Criteria) this;
        }

        public Criteria andLeijiNotEqualTo(String value) {
            addCriterion("Leiji <>", value, "leiji");
            return (Criteria) this;
        }

        public Criteria andLeijiGreaterThan(String value) {
            addCriterion("Leiji >", value, "leiji");
            return (Criteria) this;
        }

        public Criteria andLeijiGreaterThanOrEqualTo(String value) {
            addCriterion("Leiji >=", value, "leiji");
            return (Criteria) this;
        }

        public Criteria andLeijiLessThan(String value) {
            addCriterion("Leiji <", value, "leiji");
            return (Criteria) this;
        }

        public Criteria andLeijiLessThanOrEqualTo(String value) {
            addCriterion("Leiji <=", value, "leiji");
            return (Criteria) this;
        }

        public Criteria andLeijiLike(String value) {
            addCriterion("Leiji like", value, "leiji");
            return (Criteria) this;
        }

        public Criteria andLeijiNotLike(String value) {
            addCriterion("Leiji not like", value, "leiji");
            return (Criteria) this;
        }

        public Criteria andLeijiIn(List<String> values) {
            addCriterion("Leiji in", values, "leiji");
            return (Criteria) this;
        }

        public Criteria andLeijiNotIn(List<String> values) {
            addCriterion("Leiji not in", values, "leiji");
            return (Criteria) this;
        }

        public Criteria andLeijiBetween(String value1, String value2) {
            addCriterion("Leiji between", value1, value2, "leiji");
            return (Criteria) this;
        }

        public Criteria andLeijiNotBetween(String value1, String value2) {
            addCriterion("Leiji not between", value1, value2, "leiji");
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