package com.wenzhi.novel.mysql.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PG_NovelListExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table PG_NovelList
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table PG_NovelList
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table PG_NovelList
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PG_NovelList
     *
     * @mbggenerated
     */
    public PG_NovelListExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PG_NovelList
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PG_NovelList
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PG_NovelList
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PG_NovelList
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PG_NovelList
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PG_NovelList
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PG_NovelList
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PG_NovelList
     *
     * @mbggenerated
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
     * This method corresponds to the database table PG_NovelList
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PG_NovelList
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table PG_NovelList
     *
     * @mbggenerated
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

        public Criteria andIdIsNull() {
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNovelnameIsNull() {
            addCriterion("NovelName is null");
            return (Criteria) this;
        }

        public Criteria andNovelnameIsNotNull() {
            addCriterion("NovelName is not null");
            return (Criteria) this;
        }

        public Criteria andNovelnameEqualTo(String value) {
            addCriterion("NovelName =", value, "novelname");
            return (Criteria) this;
        }

        public Criteria andNovelnameNotEqualTo(String value) {
            addCriterion("NovelName <>", value, "novelname");
            return (Criteria) this;
        }

        public Criteria andNovelnameGreaterThan(String value) {
            addCriterion("NovelName >", value, "novelname");
            return (Criteria) this;
        }

        public Criteria andNovelnameGreaterThanOrEqualTo(String value) {
            addCriterion("NovelName >=", value, "novelname");
            return (Criteria) this;
        }

        public Criteria andNovelnameLessThan(String value) {
            addCriterion("NovelName <", value, "novelname");
            return (Criteria) this;
        }

        public Criteria andNovelnameLessThanOrEqualTo(String value) {
            addCriterion("NovelName <=", value, "novelname");
            return (Criteria) this;
        }

        public Criteria andNovelnameLike(String value) {
            addCriterion("NovelName like", value, "novelname");
            return (Criteria) this;
        }

        public Criteria andNovelnameNotLike(String value) {
            addCriterion("NovelName not like", value, "novelname");
            return (Criteria) this;
        }

        public Criteria andNovelnameIn(List<String> values) {
            addCriterion("NovelName in", values, "novelname");
            return (Criteria) this;
        }

        public Criteria andNovelnameNotIn(List<String> values) {
            addCriterion("NovelName not in", values, "novelname");
            return (Criteria) this;
        }

        public Criteria andNovelnameBetween(String value1, String value2) {
            addCriterion("NovelName between", value1, value2, "novelname");
            return (Criteria) this;
        }

        public Criteria andNovelnameNotBetween(String value1, String value2) {
            addCriterion("NovelName not between", value1, value2, "novelname");
            return (Criteria) this;
        }

        public Criteria andNoveldescIsNull() {
            addCriterion("NovelDesc is null");
            return (Criteria) this;
        }

        public Criteria andNoveldescIsNotNull() {
            addCriterion("NovelDesc is not null");
            return (Criteria) this;
        }

        public Criteria andNoveldescEqualTo(String value) {
            addCriterion("NovelDesc =", value, "noveldesc");
            return (Criteria) this;
        }

        public Criteria andNoveldescNotEqualTo(String value) {
            addCriterion("NovelDesc <>", value, "noveldesc");
            return (Criteria) this;
        }

        public Criteria andNoveldescGreaterThan(String value) {
            addCriterion("NovelDesc >", value, "noveldesc");
            return (Criteria) this;
        }

        public Criteria andNoveldescGreaterThanOrEqualTo(String value) {
            addCriterion("NovelDesc >=", value, "noveldesc");
            return (Criteria) this;
        }

        public Criteria andNoveldescLessThan(String value) {
            addCriterion("NovelDesc <", value, "noveldesc");
            return (Criteria) this;
        }

        public Criteria andNoveldescLessThanOrEqualTo(String value) {
            addCriterion("NovelDesc <=", value, "noveldesc");
            return (Criteria) this;
        }

        public Criteria andNoveldescLike(String value) {
            addCriterion("NovelDesc like", value, "noveldesc");
            return (Criteria) this;
        }

        public Criteria andNoveldescNotLike(String value) {
            addCriterion("NovelDesc not like", value, "noveldesc");
            return (Criteria) this;
        }

        public Criteria andNoveldescIn(List<String> values) {
            addCriterion("NovelDesc in", values, "noveldesc");
            return (Criteria) this;
        }

        public Criteria andNoveldescNotIn(List<String> values) {
            addCriterion("NovelDesc not in", values, "noveldesc");
            return (Criteria) this;
        }

        public Criteria andNoveldescBetween(String value1, String value2) {
            addCriterion("NovelDesc between", value1, value2, "noveldesc");
            return (Criteria) this;
        }

        public Criteria andNoveldescNotBetween(String value1, String value2) {
            addCriterion("NovelDesc not between", value1, value2, "noveldesc");
            return (Criteria) this;
        }

        public Criteria andNovelauthorIsNull() {
            addCriterion("NovelAuthor is null");
            return (Criteria) this;
        }

        public Criteria andNovelauthorIsNotNull() {
            addCriterion("NovelAuthor is not null");
            return (Criteria) this;
        }

        public Criteria andNovelauthorEqualTo(String value) {
            addCriterion("NovelAuthor =", value, "novelauthor");
            return (Criteria) this;
        }

        public Criteria andNovelauthorNotEqualTo(String value) {
            addCriterion("NovelAuthor <>", value, "novelauthor");
            return (Criteria) this;
        }

        public Criteria andNovelauthorGreaterThan(String value) {
            addCriterion("NovelAuthor >", value, "novelauthor");
            return (Criteria) this;
        }

        public Criteria andNovelauthorGreaterThanOrEqualTo(String value) {
            addCriterion("NovelAuthor >=", value, "novelauthor");
            return (Criteria) this;
        }

        public Criteria andNovelauthorLessThan(String value) {
            addCriterion("NovelAuthor <", value, "novelauthor");
            return (Criteria) this;
        }

        public Criteria andNovelauthorLessThanOrEqualTo(String value) {
            addCriterion("NovelAuthor <=", value, "novelauthor");
            return (Criteria) this;
        }

        public Criteria andNovelauthorLike(String value) {
            addCriterion("NovelAuthor like", value, "novelauthor");
            return (Criteria) this;
        }

        public Criteria andNovelauthorNotLike(String value) {
            addCriterion("NovelAuthor not like", value, "novelauthor");
            return (Criteria) this;
        }

        public Criteria andNovelauthorIn(List<String> values) {
            addCriterion("NovelAuthor in", values, "novelauthor");
            return (Criteria) this;
        }

        public Criteria andNovelauthorNotIn(List<String> values) {
            addCriterion("NovelAuthor not in", values, "novelauthor");
            return (Criteria) this;
        }

        public Criteria andNovelauthorBetween(String value1, String value2) {
            addCriterion("NovelAuthor between", value1, value2, "novelauthor");
            return (Criteria) this;
        }

        public Criteria andNovelauthorNotBetween(String value1, String value2) {
            addCriterion("NovelAuthor not between", value1, value2, "novelauthor");
            return (Criteria) this;
        }

        public Criteria andNovelimageIsNull() {
            addCriterion("NovelImage is null");
            return (Criteria) this;
        }

        public Criteria andNovelimageIsNotNull() {
            addCriterion("NovelImage is not null");
            return (Criteria) this;
        }

        public Criteria andNovelimageEqualTo(String value) {
            addCriterion("NovelImage =", value, "novelimage");
            return (Criteria) this;
        }

        public Criteria andNovelimageNotEqualTo(String value) {
            addCriterion("NovelImage <>", value, "novelimage");
            return (Criteria) this;
        }

        public Criteria andNovelimageGreaterThan(String value) {
            addCriterion("NovelImage >", value, "novelimage");
            return (Criteria) this;
        }

        public Criteria andNovelimageGreaterThanOrEqualTo(String value) {
            addCriterion("NovelImage >=", value, "novelimage");
            return (Criteria) this;
        }

        public Criteria andNovelimageLessThan(String value) {
            addCriterion("NovelImage <", value, "novelimage");
            return (Criteria) this;
        }

        public Criteria andNovelimageLessThanOrEqualTo(String value) {
            addCriterion("NovelImage <=", value, "novelimage");
            return (Criteria) this;
        }

        public Criteria andNovelimageLike(String value) {
            addCriterion("NovelImage like", value, "novelimage");
            return (Criteria) this;
        }

        public Criteria andNovelimageNotLike(String value) {
            addCriterion("NovelImage not like", value, "novelimage");
            return (Criteria) this;
        }

        public Criteria andNovelimageIn(List<String> values) {
            addCriterion("NovelImage in", values, "novelimage");
            return (Criteria) this;
        }

        public Criteria andNovelimageNotIn(List<String> values) {
            addCriterion("NovelImage not in", values, "novelimage");
            return (Criteria) this;
        }

        public Criteria andNovelimageBetween(String value1, String value2) {
            addCriterion("NovelImage between", value1, value2, "novelimage");
            return (Criteria) this;
        }

        public Criteria andNovelimageNotBetween(String value1, String value2) {
            addCriterion("NovelImage not between", value1, value2, "novelimage");
            return (Criteria) this;
        }

        public Criteria andNovelstatusIsNull() {
            addCriterion("NovelStatus is null");
            return (Criteria) this;
        }

        public Criteria andNovelstatusIsNotNull() {
            addCriterion("NovelStatus is not null");
            return (Criteria) this;
        }

        public Criteria andNovelstatusEqualTo(Byte value) {
            addCriterion("NovelStatus =", value, "novelstatus");
            return (Criteria) this;
        }

        public Criteria andNovelstatusNotEqualTo(Byte value) {
            addCriterion("NovelStatus <>", value, "novelstatus");
            return (Criteria) this;
        }

        public Criteria andNovelstatusGreaterThan(Byte value) {
            addCriterion("NovelStatus >", value, "novelstatus");
            return (Criteria) this;
        }

        public Criteria andNovelstatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("NovelStatus >=", value, "novelstatus");
            return (Criteria) this;
        }

        public Criteria andNovelstatusLessThan(Byte value) {
            addCriterion("NovelStatus <", value, "novelstatus");
            return (Criteria) this;
        }

        public Criteria andNovelstatusLessThanOrEqualTo(Byte value) {
            addCriterion("NovelStatus <=", value, "novelstatus");
            return (Criteria) this;
        }

        public Criteria andNovelstatusIn(List<Byte> values) {
            addCriterion("NovelStatus in", values, "novelstatus");
            return (Criteria) this;
        }

        public Criteria andNovelstatusNotIn(List<Byte> values) {
            addCriterion("NovelStatus not in", values, "novelstatus");
            return (Criteria) this;
        }

        public Criteria andNovelstatusBetween(Byte value1, Byte value2) {
            addCriterion("NovelStatus between", value1, value2, "novelstatus");
            return (Criteria) this;
        }

        public Criteria andNovelstatusNotBetween(Byte value1, Byte value2) {
            addCriterion("NovelStatus not between", value1, value2, "novelstatus");
            return (Criteria) this;
        }

        public Criteria andIsshowIsNull() {
            addCriterion("IsShow is null");
            return (Criteria) this;
        }

        public Criteria andIsshowIsNotNull() {
            addCriterion("IsShow is not null");
            return (Criteria) this;
        }

        public Criteria andIsshowEqualTo(Byte value) {
            addCriterion("IsShow =", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowNotEqualTo(Byte value) {
            addCriterion("IsShow <>", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowGreaterThan(Byte value) {
            addCriterion("IsShow >", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowGreaterThanOrEqualTo(Byte value) {
            addCriterion("IsShow >=", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowLessThan(Byte value) {
            addCriterion("IsShow <", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowLessThanOrEqualTo(Byte value) {
            addCriterion("IsShow <=", value, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowIn(List<Byte> values) {
            addCriterion("IsShow in", values, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowNotIn(List<Byte> values) {
            addCriterion("IsShow not in", values, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowBetween(Byte value1, Byte value2) {
            addCriterion("IsShow between", value1, value2, "isshow");
            return (Criteria) this;
        }

        public Criteria andIsshowNotBetween(Byte value1, Byte value2) {
            addCriterion("IsShow not between", value1, value2, "isshow");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CreateTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("CreateTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("CreateTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("CreateTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CreateTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("CreateTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CreateTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("CreateTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("CreateTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("CreateTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CreateTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("UpdateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("UpdateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("UpdateTime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("UpdateTime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("UpdateTime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UpdateTime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("UpdateTime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("UpdateTime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("UpdateTime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("UpdateTime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("UpdateTime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("UpdateTime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andIsdeletedIsNull() {
            addCriterion("IsDeleted is null");
            return (Criteria) this;
        }

        public Criteria andIsdeletedIsNotNull() {
            addCriterion("IsDeleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsdeletedEqualTo(Byte value) {
            addCriterion("IsDeleted =", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedNotEqualTo(Byte value) {
            addCriterion("IsDeleted <>", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedGreaterThan(Byte value) {
            addCriterion("IsDeleted >", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedGreaterThanOrEqualTo(Byte value) {
            addCriterion("IsDeleted >=", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedLessThan(Byte value) {
            addCriterion("IsDeleted <", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedLessThanOrEqualTo(Byte value) {
            addCriterion("IsDeleted <=", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedIn(List<Byte> values) {
            addCriterion("IsDeleted in", values, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedNotIn(List<Byte> values) {
            addCriterion("IsDeleted not in", values, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedBetween(Byte value1, Byte value2) {
            addCriterion("IsDeleted between", value1, value2, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedNotBetween(Byte value1, Byte value2) {
            addCriterion("IsDeleted not between", value1, value2, "isdeleted");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table PG_NovelList
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table PG_NovelList
     *
     * @mbggenerated
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