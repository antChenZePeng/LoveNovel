package com.wenzhi.novel.mysql.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PG_MediaStorageExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table PG_MediaStorage
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table PG_MediaStorage
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table PG_MediaStorage
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PG_MediaStorage
     *
     * @mbggenerated
     */
    public PG_MediaStorageExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PG_MediaStorage
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PG_MediaStorage
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PG_MediaStorage
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PG_MediaStorage
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PG_MediaStorage
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PG_MediaStorage
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PG_MediaStorage
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
     * This method corresponds to the database table PG_MediaStorage
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
     * This method corresponds to the database table PG_MediaStorage
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PG_MediaStorage
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
     * This class corresponds to the database table PG_MediaStorage
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

        public Criteria andMediatypeIsNull() {
            addCriterion("MediaType is null");
            return (Criteria) this;
        }

        public Criteria andMediatypeIsNotNull() {
            addCriterion("MediaType is not null");
            return (Criteria) this;
        }

        public Criteria andMediatypeEqualTo(Integer value) {
            addCriterion("MediaType =", value, "mediatype");
            return (Criteria) this;
        }

        public Criteria andMediatypeNotEqualTo(Integer value) {
            addCriterion("MediaType <>", value, "mediatype");
            return (Criteria) this;
        }

        public Criteria andMediatypeGreaterThan(Integer value) {
            addCriterion("MediaType >", value, "mediatype");
            return (Criteria) this;
        }

        public Criteria andMediatypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("MediaType >=", value, "mediatype");
            return (Criteria) this;
        }

        public Criteria andMediatypeLessThan(Integer value) {
            addCriterion("MediaType <", value, "mediatype");
            return (Criteria) this;
        }

        public Criteria andMediatypeLessThanOrEqualTo(Integer value) {
            addCriterion("MediaType <=", value, "mediatype");
            return (Criteria) this;
        }

        public Criteria andMediatypeIn(List<Integer> values) {
            addCriterion("MediaType in", values, "mediatype");
            return (Criteria) this;
        }

        public Criteria andMediatypeNotIn(List<Integer> values) {
            addCriterion("MediaType not in", values, "mediatype");
            return (Criteria) this;
        }

        public Criteria andMediatypeBetween(Integer value1, Integer value2) {
            addCriterion("MediaType between", value1, value2, "mediatype");
            return (Criteria) this;
        }

        public Criteria andMediatypeNotBetween(Integer value1, Integer value2) {
            addCriterion("MediaType not between", value1, value2, "mediatype");
            return (Criteria) this;
        }

        public Criteria andMedianameIsNull() {
            addCriterion("MediaName is null");
            return (Criteria) this;
        }

        public Criteria andMedianameIsNotNull() {
            addCriterion("MediaName is not null");
            return (Criteria) this;
        }

        public Criteria andMedianameEqualTo(String value) {
            addCriterion("MediaName =", value, "medianame");
            return (Criteria) this;
        }

        public Criteria andMedianameNotEqualTo(String value) {
            addCriterion("MediaName <>", value, "medianame");
            return (Criteria) this;
        }

        public Criteria andMedianameGreaterThan(String value) {
            addCriterion("MediaName >", value, "medianame");
            return (Criteria) this;
        }

        public Criteria andMedianameGreaterThanOrEqualTo(String value) {
            addCriterion("MediaName >=", value, "medianame");
            return (Criteria) this;
        }

        public Criteria andMedianameLessThan(String value) {
            addCriterion("MediaName <", value, "medianame");
            return (Criteria) this;
        }

        public Criteria andMedianameLessThanOrEqualTo(String value) {
            addCriterion("MediaName <=", value, "medianame");
            return (Criteria) this;
        }

        public Criteria andMedianameLike(String value) {
            addCriterion("MediaName like", value, "medianame");
            return (Criteria) this;
        }

        public Criteria andMedianameNotLike(String value) {
            addCriterion("MediaName not like", value, "medianame");
            return (Criteria) this;
        }

        public Criteria andMedianameIn(List<String> values) {
            addCriterion("MediaName in", values, "medianame");
            return (Criteria) this;
        }

        public Criteria andMedianameNotIn(List<String> values) {
            addCriterion("MediaName not in", values, "medianame");
            return (Criteria) this;
        }

        public Criteria andMedianameBetween(String value1, String value2) {
            addCriterion("MediaName between", value1, value2, "medianame");
            return (Criteria) this;
        }

        public Criteria andMedianameNotBetween(String value1, String value2) {
            addCriterion("MediaName not between", value1, value2, "medianame");
            return (Criteria) this;
        }

        public Criteria andDomainpathIsNull() {
            addCriterion("DomainPath is null");
            return (Criteria) this;
        }

        public Criteria andDomainpathIsNotNull() {
            addCriterion("DomainPath is not null");
            return (Criteria) this;
        }

        public Criteria andDomainpathEqualTo(String value) {
            addCriterion("DomainPath =", value, "domainpath");
            return (Criteria) this;
        }

        public Criteria andDomainpathNotEqualTo(String value) {
            addCriterion("DomainPath <>", value, "domainpath");
            return (Criteria) this;
        }

        public Criteria andDomainpathGreaterThan(String value) {
            addCriterion("DomainPath >", value, "domainpath");
            return (Criteria) this;
        }

        public Criteria andDomainpathGreaterThanOrEqualTo(String value) {
            addCriterion("DomainPath >=", value, "domainpath");
            return (Criteria) this;
        }

        public Criteria andDomainpathLessThan(String value) {
            addCriterion("DomainPath <", value, "domainpath");
            return (Criteria) this;
        }

        public Criteria andDomainpathLessThanOrEqualTo(String value) {
            addCriterion("DomainPath <=", value, "domainpath");
            return (Criteria) this;
        }

        public Criteria andDomainpathLike(String value) {
            addCriterion("DomainPath like", value, "domainpath");
            return (Criteria) this;
        }

        public Criteria andDomainpathNotLike(String value) {
            addCriterion("DomainPath not like", value, "domainpath");
            return (Criteria) this;
        }

        public Criteria andDomainpathIn(List<String> values) {
            addCriterion("DomainPath in", values, "domainpath");
            return (Criteria) this;
        }

        public Criteria andDomainpathNotIn(List<String> values) {
            addCriterion("DomainPath not in", values, "domainpath");
            return (Criteria) this;
        }

        public Criteria andDomainpathBetween(String value1, String value2) {
            addCriterion("DomainPath between", value1, value2, "domainpath");
            return (Criteria) this;
        }

        public Criteria andDomainpathNotBetween(String value1, String value2) {
            addCriterion("DomainPath not between", value1, value2, "domainpath");
            return (Criteria) this;
        }

        public Criteria andDirpathIsNull() {
            addCriterion("DirPath is null");
            return (Criteria) this;
        }

        public Criteria andDirpathIsNotNull() {
            addCriterion("DirPath is not null");
            return (Criteria) this;
        }

        public Criteria andDirpathEqualTo(String value) {
            addCriterion("DirPath =", value, "dirpath");
            return (Criteria) this;
        }

        public Criteria andDirpathNotEqualTo(String value) {
            addCriterion("DirPath <>", value, "dirpath");
            return (Criteria) this;
        }

        public Criteria andDirpathGreaterThan(String value) {
            addCriterion("DirPath >", value, "dirpath");
            return (Criteria) this;
        }

        public Criteria andDirpathGreaterThanOrEqualTo(String value) {
            addCriterion("DirPath >=", value, "dirpath");
            return (Criteria) this;
        }

        public Criteria andDirpathLessThan(String value) {
            addCriterion("DirPath <", value, "dirpath");
            return (Criteria) this;
        }

        public Criteria andDirpathLessThanOrEqualTo(String value) {
            addCriterion("DirPath <=", value, "dirpath");
            return (Criteria) this;
        }

        public Criteria andDirpathLike(String value) {
            addCriterion("DirPath like", value, "dirpath");
            return (Criteria) this;
        }

        public Criteria andDirpathNotLike(String value) {
            addCriterion("DirPath not like", value, "dirpath");
            return (Criteria) this;
        }

        public Criteria andDirpathIn(List<String> values) {
            addCriterion("DirPath in", values, "dirpath");
            return (Criteria) this;
        }

        public Criteria andDirpathNotIn(List<String> values) {
            addCriterion("DirPath not in", values, "dirpath");
            return (Criteria) this;
        }

        public Criteria andDirpathBetween(String value1, String value2) {
            addCriterion("DirPath between", value1, value2, "dirpath");
            return (Criteria) this;
        }

        public Criteria andDirpathNotBetween(String value1, String value2) {
            addCriterion("DirPath not between", value1, value2, "dirpath");
            return (Criteria) this;
        }

        public Criteria andOriginalnameIsNull() {
            addCriterion("OriginalName is null");
            return (Criteria) this;
        }

        public Criteria andOriginalnameIsNotNull() {
            addCriterion("OriginalName is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalnameEqualTo(String value) {
            addCriterion("OriginalName =", value, "originalname");
            return (Criteria) this;
        }

        public Criteria andOriginalnameNotEqualTo(String value) {
            addCriterion("OriginalName <>", value, "originalname");
            return (Criteria) this;
        }

        public Criteria andOriginalnameGreaterThan(String value) {
            addCriterion("OriginalName >", value, "originalname");
            return (Criteria) this;
        }

        public Criteria andOriginalnameGreaterThanOrEqualTo(String value) {
            addCriterion("OriginalName >=", value, "originalname");
            return (Criteria) this;
        }

        public Criteria andOriginalnameLessThan(String value) {
            addCriterion("OriginalName <", value, "originalname");
            return (Criteria) this;
        }

        public Criteria andOriginalnameLessThanOrEqualTo(String value) {
            addCriterion("OriginalName <=", value, "originalname");
            return (Criteria) this;
        }

        public Criteria andOriginalnameLike(String value) {
            addCriterion("OriginalName like", value, "originalname");
            return (Criteria) this;
        }

        public Criteria andOriginalnameNotLike(String value) {
            addCriterion("OriginalName not like", value, "originalname");
            return (Criteria) this;
        }

        public Criteria andOriginalnameIn(List<String> values) {
            addCriterion("OriginalName in", values, "originalname");
            return (Criteria) this;
        }

        public Criteria andOriginalnameNotIn(List<String> values) {
            addCriterion("OriginalName not in", values, "originalname");
            return (Criteria) this;
        }

        public Criteria andOriginalnameBetween(String value1, String value2) {
            addCriterion("OriginalName between", value1, value2, "originalname");
            return (Criteria) this;
        }

        public Criteria andOriginalnameNotBetween(String value1, String value2) {
            addCriterion("OriginalName not between", value1, value2, "originalname");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("UserId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("UserId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("UserId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("UserId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("UserId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("UserId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("UserId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("UserId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("UserId like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("UserId not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("UserId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("UserId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("UserId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("UserId not between", value1, value2, "userid");
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
     * This class corresponds to the database table PG_MediaStorage
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
     * This class corresponds to the database table PG_MediaStorage
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