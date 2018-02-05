package com.zhou.jdshop.pojo.po;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TbVipExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbVipExample() {
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

        public Criteria andUserLevelIsNull() {
            addCriterion("user_level is null");
            return (Criteria) this;
        }

        public Criteria andUserLevelIsNotNull() {
            addCriterion("user_level is not null");
            return (Criteria) this;
        }

        public Criteria andUserLevelEqualTo(Integer value) {
            addCriterion("user_level =", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelNotEqualTo(Integer value) {
            addCriterion("user_level <>", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelGreaterThan(Integer value) {
            addCriterion("user_level >", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_level >=", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelLessThan(Integer value) {
            addCriterion("user_level <", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelLessThanOrEqualTo(Integer value) {
            addCriterion("user_level <=", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelIn(List<Integer> values) {
            addCriterion("user_level in", values, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelNotIn(List<Integer> values) {
            addCriterion("user_level not in", values, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelBetween(Integer value1, Integer value2) {
            addCriterion("user_level between", value1, value2, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("user_level not between", value1, value2, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserDiscountIsNull() {
            addCriterion("user_discount is null");
            return (Criteria) this;
        }

        public Criteria andUserDiscountIsNotNull() {
            addCriterion("user_discount is not null");
            return (Criteria) this;
        }

        public Criteria andUserDiscountEqualTo(Double value) {
            addCriterion("user_discount =", value, "userDiscount");
            return (Criteria) this;
        }

        public Criteria andUserDiscountNotEqualTo(Double value) {
            addCriterion("user_discount <>", value, "userDiscount");
            return (Criteria) this;
        }

        public Criteria andUserDiscountGreaterThan(Double value) {
            addCriterion("user_discount >", value, "userDiscount");
            return (Criteria) this;
        }

        public Criteria andUserDiscountGreaterThanOrEqualTo(Double value) {
            addCriterion("user_discount >=", value, "userDiscount");
            return (Criteria) this;
        }

        public Criteria andUserDiscountLessThan(Double value) {
            addCriterion("user_discount <", value, "userDiscount");
            return (Criteria) this;
        }

        public Criteria andUserDiscountLessThanOrEqualTo(Double value) {
            addCriterion("user_discount <=", value, "userDiscount");
            return (Criteria) this;
        }

        public Criteria andUserDiscountIn(List<Double> values) {
            addCriterion("user_discount in", values, "userDiscount");
            return (Criteria) this;
        }

        public Criteria andUserDiscountNotIn(List<Double> values) {
            addCriterion("user_discount not in", values, "userDiscount");
            return (Criteria) this;
        }

        public Criteria andUserDiscountBetween(Double value1, Double value2) {
            addCriterion("user_discount between", value1, value2, "userDiscount");
            return (Criteria) this;
        }

        public Criteria andUserDiscountNotBetween(Double value1, Double value2) {
            addCriterion("user_discount not between", value1, value2, "userDiscount");
            return (Criteria) this;
        }

        public Criteria andUpLimitIsNull() {
            addCriterion("up_limit is null");
            return (Criteria) this;
        }

        public Criteria andUpLimitIsNotNull() {
            addCriterion("up_limit is not null");
            return (Criteria) this;
        }

        public Criteria andUpLimitEqualTo(Integer value) {
            addCriterion("up_limit =", value, "upLimit");
            return (Criteria) this;
        }

        public Criteria andUpLimitNotEqualTo(Integer value) {
            addCriterion("up_limit <>", value, "upLimit");
            return (Criteria) this;
        }

        public Criteria andUpLimitGreaterThan(Integer value) {
            addCriterion("up_limit >", value, "upLimit");
            return (Criteria) this;
        }

        public Criteria andUpLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("up_limit >=", value, "upLimit");
            return (Criteria) this;
        }

        public Criteria andUpLimitLessThan(Integer value) {
            addCriterion("up_limit <", value, "upLimit");
            return (Criteria) this;
        }

        public Criteria andUpLimitLessThanOrEqualTo(Integer value) {
            addCriterion("up_limit <=", value, "upLimit");
            return (Criteria) this;
        }

        public Criteria andUpLimitIn(List<Integer> values) {
            addCriterion("up_limit in", values, "upLimit");
            return (Criteria) this;
        }

        public Criteria andUpLimitNotIn(List<Integer> values) {
            addCriterion("up_limit not in", values, "upLimit");
            return (Criteria) this;
        }

        public Criteria andUpLimitBetween(Integer value1, Integer value2) {
            addCriterion("up_limit between", value1, value2, "upLimit");
            return (Criteria) this;
        }

        public Criteria andUpLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("up_limit not between", value1, value2, "upLimit");
            return (Criteria) this;
        }

        public Criteria andDownLimitIsNull() {
            addCriterion("down_limit is null");
            return (Criteria) this;
        }

        public Criteria andDownLimitIsNotNull() {
            addCriterion("down_limit is not null");
            return (Criteria) this;
        }

        public Criteria andDownLimitEqualTo(Integer value) {
            addCriterion("down_limit =", value, "downLimit");
            return (Criteria) this;
        }

        public Criteria andDownLimitNotEqualTo(Integer value) {
            addCriterion("down_limit <>", value, "downLimit");
            return (Criteria) this;
        }

        public Criteria andDownLimitGreaterThan(Integer value) {
            addCriterion("down_limit >", value, "downLimit");
            return (Criteria) this;
        }

        public Criteria andDownLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("down_limit >=", value, "downLimit");
            return (Criteria) this;
        }

        public Criteria andDownLimitLessThan(Integer value) {
            addCriterion("down_limit <", value, "downLimit");
            return (Criteria) this;
        }

        public Criteria andDownLimitLessThanOrEqualTo(Integer value) {
            addCriterion("down_limit <=", value, "downLimit");
            return (Criteria) this;
        }

        public Criteria andDownLimitIn(List<Integer> values) {
            addCriterion("down_limit in", values, "downLimit");
            return (Criteria) this;
        }

        public Criteria andDownLimitNotIn(List<Integer> values) {
            addCriterion("down_limit not in", values, "downLimit");
            return (Criteria) this;
        }

        public Criteria andDownLimitBetween(Integer value1, Integer value2) {
            addCriterion("down_limit between", value1, value2, "downLimit");
            return (Criteria) this;
        }

        public Criteria andDownLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("down_limit not between", value1, value2, "downLimit");
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