package com.zhou.jdshop.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbLeaveWordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbLeaveWordExample() {
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

        public Criteria andLeaveWordIdIsNull() {
            addCriterion("leave_word_id is null");
            return (Criteria) this;
        }

        public Criteria andLeaveWordIdIsNotNull() {
            addCriterion("leave_word_id is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveWordIdEqualTo(Long value) {
            addCriterion("leave_word_id =", value, "leaveWordId");
            return (Criteria) this;
        }

        public Criteria andLeaveWordIdNotEqualTo(Long value) {
            addCriterion("leave_word_id <>", value, "leaveWordId");
            return (Criteria) this;
        }

        public Criteria andLeaveWordIdGreaterThan(Long value) {
            addCriterion("leave_word_id >", value, "leaveWordId");
            return (Criteria) this;
        }

        public Criteria andLeaveWordIdGreaterThanOrEqualTo(Long value) {
            addCriterion("leave_word_id >=", value, "leaveWordId");
            return (Criteria) this;
        }

        public Criteria andLeaveWordIdLessThan(Long value) {
            addCriterion("leave_word_id <", value, "leaveWordId");
            return (Criteria) this;
        }

        public Criteria andLeaveWordIdLessThanOrEqualTo(Long value) {
            addCriterion("leave_word_id <=", value, "leaveWordId");
            return (Criteria) this;
        }

        public Criteria andLeaveWordIdIn(List<Long> values) {
            addCriterion("leave_word_id in", values, "leaveWordId");
            return (Criteria) this;
        }

        public Criteria andLeaveWordIdNotIn(List<Long> values) {
            addCriterion("leave_word_id not in", values, "leaveWordId");
            return (Criteria) this;
        }

        public Criteria andLeaveWordIdBetween(Long value1, Long value2) {
            addCriterion("leave_word_id between", value1, value2, "leaveWordId");
            return (Criteria) this;
        }

        public Criteria andLeaveWordIdNotBetween(Long value1, Long value2) {
            addCriterion("leave_word_id not between", value1, value2, "leaveWordId");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Long value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Long value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Long value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Long value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Long value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Long value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Long> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Long> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Long value1, Long value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Long value1, Long value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andCaptionIsNull() {
            addCriterion("caption is null");
            return (Criteria) this;
        }

        public Criteria andCaptionIsNotNull() {
            addCriterion("caption is not null");
            return (Criteria) this;
        }

        public Criteria andCaptionEqualTo(String value) {
            addCriterion("caption =", value, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionNotEqualTo(String value) {
            addCriterion("caption <>", value, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionGreaterThan(String value) {
            addCriterion("caption >", value, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionGreaterThanOrEqualTo(String value) {
            addCriterion("caption >=", value, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionLessThan(String value) {
            addCriterion("caption <", value, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionLessThanOrEqualTo(String value) {
            addCriterion("caption <=", value, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionLike(String value) {
            addCriterion("caption like", value, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionNotLike(String value) {
            addCriterion("caption not like", value, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionIn(List<String> values) {
            addCriterion("caption in", values, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionNotIn(List<String> values) {
            addCriterion("caption not in", values, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionBetween(String value1, String value2) {
            addCriterion("caption between", value1, value2, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionNotBetween(String value1, String value2) {
            addCriterion("caption not between", value1, value2, "caption");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
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

        public Criteria andRepliesIsNull() {
            addCriterion("replies is null");
            return (Criteria) this;
        }

        public Criteria andRepliesIsNotNull() {
            addCriterion("replies is not null");
            return (Criteria) this;
        }

        public Criteria andRepliesEqualTo(Integer value) {
            addCriterion("replies =", value, "replies");
            return (Criteria) this;
        }

        public Criteria andRepliesNotEqualTo(Integer value) {
            addCriterion("replies <>", value, "replies");
            return (Criteria) this;
        }

        public Criteria andRepliesGreaterThan(Integer value) {
            addCriterion("replies >", value, "replies");
            return (Criteria) this;
        }

        public Criteria andRepliesGreaterThanOrEqualTo(Integer value) {
            addCriterion("replies >=", value, "replies");
            return (Criteria) this;
        }

        public Criteria andRepliesLessThan(Integer value) {
            addCriterion("replies <", value, "replies");
            return (Criteria) this;
        }

        public Criteria andRepliesLessThanOrEqualTo(Integer value) {
            addCriterion("replies <=", value, "replies");
            return (Criteria) this;
        }

        public Criteria andRepliesIn(List<Integer> values) {
            addCriterion("replies in", values, "replies");
            return (Criteria) this;
        }

        public Criteria andRepliesNotIn(List<Integer> values) {
            addCriterion("replies not in", values, "replies");
            return (Criteria) this;
        }

        public Criteria andRepliesBetween(Integer value1, Integer value2) {
            addCriterion("replies between", value1, value2, "replies");
            return (Criteria) this;
        }

        public Criteria andRepliesNotBetween(Integer value1, Integer value2) {
            addCriterion("replies not between", value1, value2, "replies");
            return (Criteria) this;
        }

        public Criteria andViewsIsNull() {
            addCriterion("views is null");
            return (Criteria) this;
        }

        public Criteria andViewsIsNotNull() {
            addCriterion("views is not null");
            return (Criteria) this;
        }

        public Criteria andViewsEqualTo(Integer value) {
            addCriterion("views =", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsNotEqualTo(Integer value) {
            addCriterion("views <>", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsGreaterThan(Integer value) {
            addCriterion("views >", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsGreaterThanOrEqualTo(Integer value) {
            addCriterion("views >=", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsLessThan(Integer value) {
            addCriterion("views <", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsLessThanOrEqualTo(Integer value) {
            addCriterion("views <=", value, "views");
            return (Criteria) this;
        }

        public Criteria andViewsIn(List<Integer> values) {
            addCriterion("views in", values, "views");
            return (Criteria) this;
        }

        public Criteria andViewsNotIn(List<Integer> values) {
            addCriterion("views not in", values, "views");
            return (Criteria) this;
        }

        public Criteria andViewsBetween(Integer value1, Integer value2) {
            addCriterion("views between", value1, value2, "views");
            return (Criteria) this;
        }

        public Criteria andViewsNotBetween(Integer value1, Integer value2) {
            addCriterion("views not between", value1, value2, "views");
            return (Criteria) this;
        }

        public Criteria andFinalReplyIsNull() {
            addCriterion("final_reply is null");
            return (Criteria) this;
        }

        public Criteria andFinalReplyIsNotNull() {
            addCriterion("final_reply is not null");
            return (Criteria) this;
        }

        public Criteria andFinalReplyEqualTo(String value) {
            addCriterion("final_reply =", value, "finalReply");
            return (Criteria) this;
        }

        public Criteria andFinalReplyNotEqualTo(String value) {
            addCriterion("final_reply <>", value, "finalReply");
            return (Criteria) this;
        }

        public Criteria andFinalReplyGreaterThan(String value) {
            addCriterion("final_reply >", value, "finalReply");
            return (Criteria) this;
        }

        public Criteria andFinalReplyGreaterThanOrEqualTo(String value) {
            addCriterion("final_reply >=", value, "finalReply");
            return (Criteria) this;
        }

        public Criteria andFinalReplyLessThan(String value) {
            addCriterion("final_reply <", value, "finalReply");
            return (Criteria) this;
        }

        public Criteria andFinalReplyLessThanOrEqualTo(String value) {
            addCriterion("final_reply <=", value, "finalReply");
            return (Criteria) this;
        }

        public Criteria andFinalReplyLike(String value) {
            addCriterion("final_reply like", value, "finalReply");
            return (Criteria) this;
        }

        public Criteria andFinalReplyNotLike(String value) {
            addCriterion("final_reply not like", value, "finalReply");
            return (Criteria) this;
        }

        public Criteria andFinalReplyIn(List<String> values) {
            addCriterion("final_reply in", values, "finalReply");
            return (Criteria) this;
        }

        public Criteria andFinalReplyNotIn(List<String> values) {
            addCriterion("final_reply not in", values, "finalReply");
            return (Criteria) this;
        }

        public Criteria andFinalReplyBetween(String value1, String value2) {
            addCriterion("final_reply between", value1, value2, "finalReply");
            return (Criteria) this;
        }

        public Criteria andFinalReplyNotBetween(String value1, String value2) {
            addCriterion("final_reply not between", value1, value2, "finalReply");
            return (Criteria) this;
        }

        public Criteria andWhetherTopIsNull() {
            addCriterion("whether_top is null");
            return (Criteria) this;
        }

        public Criteria andWhetherTopIsNotNull() {
            addCriterion("whether_top is not null");
            return (Criteria) this;
        }

        public Criteria andWhetherTopEqualTo(Integer value) {
            addCriterion("whether_top =", value, "whetherTop");
            return (Criteria) this;
        }

        public Criteria andWhetherTopNotEqualTo(Integer value) {
            addCriterion("whether_top <>", value, "whetherTop");
            return (Criteria) this;
        }

        public Criteria andWhetherTopGreaterThan(Integer value) {
            addCriterion("whether_top >", value, "whetherTop");
            return (Criteria) this;
        }

        public Criteria andWhetherTopGreaterThanOrEqualTo(Integer value) {
            addCriterion("whether_top >=", value, "whetherTop");
            return (Criteria) this;
        }

        public Criteria andWhetherTopLessThan(Integer value) {
            addCriterion("whether_top <", value, "whetherTop");
            return (Criteria) this;
        }

        public Criteria andWhetherTopLessThanOrEqualTo(Integer value) {
            addCriterion("whether_top <=", value, "whetherTop");
            return (Criteria) this;
        }

        public Criteria andWhetherTopIn(List<Integer> values) {
            addCriterion("whether_top in", values, "whetherTop");
            return (Criteria) this;
        }

        public Criteria andWhetherTopNotIn(List<Integer> values) {
            addCriterion("whether_top not in", values, "whetherTop");
            return (Criteria) this;
        }

        public Criteria andWhetherTopBetween(Integer value1, Integer value2) {
            addCriterion("whether_top between", value1, value2, "whetherTop");
            return (Criteria) this;
        }

        public Criteria andWhetherTopNotBetween(Integer value1, Integer value2) {
            addCriterion("whether_top not between", value1, value2, "whetherTop");
            return (Criteria) this;
        }

        public Criteria andWhetherEliteIsNull() {
            addCriterion("whether_elite is null");
            return (Criteria) this;
        }

        public Criteria andWhetherEliteIsNotNull() {
            addCriterion("whether_elite is not null");
            return (Criteria) this;
        }

        public Criteria andWhetherEliteEqualTo(Integer value) {
            addCriterion("whether_elite =", value, "whetherElite");
            return (Criteria) this;
        }

        public Criteria andWhetherEliteNotEqualTo(Integer value) {
            addCriterion("whether_elite <>", value, "whetherElite");
            return (Criteria) this;
        }

        public Criteria andWhetherEliteGreaterThan(Integer value) {
            addCriterion("whether_elite >", value, "whetherElite");
            return (Criteria) this;
        }

        public Criteria andWhetherEliteGreaterThanOrEqualTo(Integer value) {
            addCriterion("whether_elite >=", value, "whetherElite");
            return (Criteria) this;
        }

        public Criteria andWhetherEliteLessThan(Integer value) {
            addCriterion("whether_elite <", value, "whetherElite");
            return (Criteria) this;
        }

        public Criteria andWhetherEliteLessThanOrEqualTo(Integer value) {
            addCriterion("whether_elite <=", value, "whetherElite");
            return (Criteria) this;
        }

        public Criteria andWhetherEliteIn(List<Integer> values) {
            addCriterion("whether_elite in", values, "whetherElite");
            return (Criteria) this;
        }

        public Criteria andWhetherEliteNotIn(List<Integer> values) {
            addCriterion("whether_elite not in", values, "whetherElite");
            return (Criteria) this;
        }

        public Criteria andWhetherEliteBetween(Integer value1, Integer value2) {
            addCriterion("whether_elite between", value1, value2, "whetherElite");
            return (Criteria) this;
        }

        public Criteria andWhetherEliteNotBetween(Integer value1, Integer value2) {
            addCriterion("whether_elite not between", value1, value2, "whetherElite");
            return (Criteria) this;
        }

        public Criteria andBoardNameIsNull() {
            addCriterion("board_name is null");
            return (Criteria) this;
        }

        public Criteria andBoardNameIsNotNull() {
            addCriterion("board_name is not null");
            return (Criteria) this;
        }

        public Criteria andBoardNameEqualTo(String value) {
            addCriterion("board_name =", value, "boardName");
            return (Criteria) this;
        }

        public Criteria andBoardNameNotEqualTo(String value) {
            addCriterion("board_name <>", value, "boardName");
            return (Criteria) this;
        }

        public Criteria andBoardNameGreaterThan(String value) {
            addCriterion("board_name >", value, "boardName");
            return (Criteria) this;
        }

        public Criteria andBoardNameGreaterThanOrEqualTo(String value) {
            addCriterion("board_name >=", value, "boardName");
            return (Criteria) this;
        }

        public Criteria andBoardNameLessThan(String value) {
            addCriterion("board_name <", value, "boardName");
            return (Criteria) this;
        }

        public Criteria andBoardNameLessThanOrEqualTo(String value) {
            addCriterion("board_name <=", value, "boardName");
            return (Criteria) this;
        }

        public Criteria andBoardNameLike(String value) {
            addCriterion("board_name like", value, "boardName");
            return (Criteria) this;
        }

        public Criteria andBoardNameNotLike(String value) {
            addCriterion("board_name not like", value, "boardName");
            return (Criteria) this;
        }

        public Criteria andBoardNameIn(List<String> values) {
            addCriterion("board_name in", values, "boardName");
            return (Criteria) this;
        }

        public Criteria andBoardNameNotIn(List<String> values) {
            addCriterion("board_name not in", values, "boardName");
            return (Criteria) this;
        }

        public Criteria andBoardNameBetween(String value1, String value2) {
            addCriterion("board_name between", value1, value2, "boardName");
            return (Criteria) this;
        }

        public Criteria andBoardNameNotBetween(String value1, String value2) {
            addCriterion("board_name not between", value1, value2, "boardName");
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