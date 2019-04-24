package com.bluefireplatform.entity;

import java.util.ArrayList;
import java.util.List;

public class OutdoorCompressionExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table outdoor_compression
     *
     * @mbggenerated Mon Apr 22 14:24:57 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table outdoor_compression
     *
     * @mbggenerated Mon Apr 22 14:24:57 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table outdoor_compression
     *
     * @mbggenerated Mon Apr 22 14:24:57 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table outdoor_compression
     *
     * @mbggenerated Mon Apr 22 14:24:57 CST 2019
     */
    public OutdoorCompressionExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table outdoor_compression
     *
     * @mbggenerated Mon Apr 22 14:24:57 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table outdoor_compression
     *
     * @mbggenerated Mon Apr 22 14:24:57 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table outdoor_compression
     *
     * @mbggenerated Mon Apr 22 14:24:57 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table outdoor_compression
     *
     * @mbggenerated Mon Apr 22 14:24:57 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table outdoor_compression
     *
     * @mbggenerated Mon Apr 22 14:24:57 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table outdoor_compression
     *
     * @mbggenerated Mon Apr 22 14:24:57 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table outdoor_compression
     *
     * @mbggenerated Mon Apr 22 14:24:57 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table outdoor_compression
     *
     * @mbggenerated Mon Apr 22 14:24:57 CST 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table outdoor_compression
     *
     * @mbggenerated Mon Apr 22 14:24:57 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table outdoor_compression
     *
     * @mbggenerated Mon Apr 22 14:24:57 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table outdoor_compression
     *
     * @mbggenerated Mon Apr 22 14:24:57 CST 2019
     */
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

        public Criteria andOutTrajectoryIdIsNull() {
            addCriterion("out_trajectory_id is null");
            return (Criteria) this;
        }

        public Criteria andOutTrajectoryIdIsNotNull() {
            addCriterion("out_trajectory_id is not null");
            return (Criteria) this;
        }

        public Criteria andOutTrajectoryIdEqualTo(Integer value) {
            addCriterion("out_trajectory_id =", value, "outTrajectoryId");
            return (Criteria) this;
        }

        public Criteria andOutTrajectoryIdNotEqualTo(Integer value) {
            addCriterion("out_trajectory_id <>", value, "outTrajectoryId");
            return (Criteria) this;
        }

        public Criteria andOutTrajectoryIdGreaterThan(Integer value) {
            addCriterion("out_trajectory_id >", value, "outTrajectoryId");
            return (Criteria) this;
        }

        public Criteria andOutTrajectoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("out_trajectory_id >=", value, "outTrajectoryId");
            return (Criteria) this;
        }

        public Criteria andOutTrajectoryIdLessThan(Integer value) {
            addCriterion("out_trajectory_id <", value, "outTrajectoryId");
            return (Criteria) this;
        }

        public Criteria andOutTrajectoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("out_trajectory_id <=", value, "outTrajectoryId");
            return (Criteria) this;
        }

        public Criteria andOutTrajectoryIdIn(List<Integer> values) {
            addCriterion("out_trajectory_id in", values, "outTrajectoryId");
            return (Criteria) this;
        }

        public Criteria andOutTrajectoryIdNotIn(List<Integer> values) {
            addCriterion("out_trajectory_id not in", values, "outTrajectoryId");
            return (Criteria) this;
        }

        public Criteria andOutTrajectoryIdBetween(Integer value1, Integer value2) {
            addCriterion("out_trajectory_id between", value1, value2, "outTrajectoryId");
            return (Criteria) this;
        }

        public Criteria andOutTrajectoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("out_trajectory_id not between", value1, value2, "outTrajectoryId");
            return (Criteria) this;
        }

        public Criteria andOutUserIdIsNull() {
            addCriterion("out_user_id is null");
            return (Criteria) this;
        }

        public Criteria andOutUserIdIsNotNull() {
            addCriterion("out_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andOutUserIdEqualTo(Integer value) {
            addCriterion("out_user_id =", value, "outUserId");
            return (Criteria) this;
        }

        public Criteria andOutUserIdNotEqualTo(Integer value) {
            addCriterion("out_user_id <>", value, "outUserId");
            return (Criteria) this;
        }

        public Criteria andOutUserIdGreaterThan(Integer value) {
            addCriterion("out_user_id >", value, "outUserId");
            return (Criteria) this;
        }

        public Criteria andOutUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("out_user_id >=", value, "outUserId");
            return (Criteria) this;
        }

        public Criteria andOutUserIdLessThan(Integer value) {
            addCriterion("out_user_id <", value, "outUserId");
            return (Criteria) this;
        }

        public Criteria andOutUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("out_user_id <=", value, "outUserId");
            return (Criteria) this;
        }

        public Criteria andOutUserIdIn(List<Integer> values) {
            addCriterion("out_user_id in", values, "outUserId");
            return (Criteria) this;
        }

        public Criteria andOutUserIdNotIn(List<Integer> values) {
            addCriterion("out_user_id not in", values, "outUserId");
            return (Criteria) this;
        }

        public Criteria andOutUserIdBetween(Integer value1, Integer value2) {
            addCriterion("out_user_id between", value1, value2, "outUserId");
            return (Criteria) this;
        }

        public Criteria andOutUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("out_user_id not between", value1, value2, "outUserId");
            return (Criteria) this;
        }

        public Criteria andOutTrajectoryTypeIsNull() {
            addCriterion("out_trajectory_type is null");
            return (Criteria) this;
        }

        public Criteria andOutTrajectoryTypeIsNotNull() {
            addCriterion("out_trajectory_type is not null");
            return (Criteria) this;
        }

        public Criteria andOutTrajectoryTypeEqualTo(Integer value) {
            addCriterion("out_trajectory_type =", value, "outTrajectoryType");
            return (Criteria) this;
        }

        public Criteria andOutTrajectoryTypeNotEqualTo(Integer value) {
            addCriterion("out_trajectory_type <>", value, "outTrajectoryType");
            return (Criteria) this;
        }

        public Criteria andOutTrajectoryTypeGreaterThan(Integer value) {
            addCriterion("out_trajectory_type >", value, "outTrajectoryType");
            return (Criteria) this;
        }

        public Criteria andOutTrajectoryTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("out_trajectory_type >=", value, "outTrajectoryType");
            return (Criteria) this;
        }

        public Criteria andOutTrajectoryTypeLessThan(Integer value) {
            addCriterion("out_trajectory_type <", value, "outTrajectoryType");
            return (Criteria) this;
        }

        public Criteria andOutTrajectoryTypeLessThanOrEqualTo(Integer value) {
            addCriterion("out_trajectory_type <=", value, "outTrajectoryType");
            return (Criteria) this;
        }

        public Criteria andOutTrajectoryTypeIn(List<Integer> values) {
            addCriterion("out_trajectory_type in", values, "outTrajectoryType");
            return (Criteria) this;
        }

        public Criteria andOutTrajectoryTypeNotIn(List<Integer> values) {
            addCriterion("out_trajectory_type not in", values, "outTrajectoryType");
            return (Criteria) this;
        }

        public Criteria andOutTrajectoryTypeBetween(Integer value1, Integer value2) {
            addCriterion("out_trajectory_type between", value1, value2, "outTrajectoryType");
            return (Criteria) this;
        }

        public Criteria andOutTrajectoryTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("out_trajectory_type not between", value1, value2, "outTrajectoryType");
            return (Criteria) this;
        }

        public Criteria andOutTrajectorySrcIsNull() {
            addCriterion("out_trajectory_src is null");
            return (Criteria) this;
        }

        public Criteria andOutTrajectorySrcIsNotNull() {
            addCriterion("out_trajectory_src is not null");
            return (Criteria) this;
        }

        public Criteria andOutTrajectorySrcEqualTo(String value) {
            addCriterion("out_trajectory_src =", value, "outTrajectorySrc");
            return (Criteria) this;
        }

        public Criteria andOutTrajectorySrcNotEqualTo(String value) {
            addCriterion("out_trajectory_src <>", value, "outTrajectorySrc");
            return (Criteria) this;
        }

        public Criteria andOutTrajectorySrcGreaterThan(String value) {
            addCriterion("out_trajectory_src >", value, "outTrajectorySrc");
            return (Criteria) this;
        }

        public Criteria andOutTrajectorySrcGreaterThanOrEqualTo(String value) {
            addCriterion("out_trajectory_src >=", value, "outTrajectorySrc");
            return (Criteria) this;
        }

        public Criteria andOutTrajectorySrcLessThan(String value) {
            addCriterion("out_trajectory_src <", value, "outTrajectorySrc");
            return (Criteria) this;
        }

        public Criteria andOutTrajectorySrcLessThanOrEqualTo(String value) {
            addCriterion("out_trajectory_src <=", value, "outTrajectorySrc");
            return (Criteria) this;
        }

        public Criteria andOutTrajectorySrcLike(String value) {
            addCriterion("out_trajectory_src like", value, "outTrajectorySrc");
            return (Criteria) this;
        }

        public Criteria andOutTrajectorySrcNotLike(String value) {
            addCriterion("out_trajectory_src not like", value, "outTrajectorySrc");
            return (Criteria) this;
        }

        public Criteria andOutTrajectorySrcIn(List<String> values) {
            addCriterion("out_trajectory_src in", values, "outTrajectorySrc");
            return (Criteria) this;
        }

        public Criteria andOutTrajectorySrcNotIn(List<String> values) {
            addCriterion("out_trajectory_src not in", values, "outTrajectorySrc");
            return (Criteria) this;
        }

        public Criteria andOutTrajectorySrcBetween(String value1, String value2) {
            addCriterion("out_trajectory_src between", value1, value2, "outTrajectorySrc");
            return (Criteria) this;
        }

        public Criteria andOutTrajectorySrcNotBetween(String value1, String value2) {
            addCriterion("out_trajectory_src not between", value1, value2, "outTrajectorySrc");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table outdoor_compression
     *
     * @mbggenerated do_not_delete_during_merge Mon Apr 22 14:24:57 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table outdoor_compression
     *
     * @mbggenerated Mon Apr 22 14:24:57 CST 2019
     */
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