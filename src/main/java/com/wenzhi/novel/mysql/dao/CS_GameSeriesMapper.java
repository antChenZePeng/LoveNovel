package com.wenzhi.novel.mysql.dao;

import com.wenzhi.novel.mysql.model.CS_GameSeries;
import com.wenzhi.novel.mysql.model.CS_GameSeriesExample;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface CS_GameSeriesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CS_GameSeries
     *
     * @mbggenerated
     */
    int countByExample(CS_GameSeriesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CS_GameSeries
     *
     * @mbggenerated
     */
    int deleteByExample(CS_GameSeriesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CS_GameSeries
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CS_GameSeries
     *
     * @mbggenerated
     */
    int insert(CS_GameSeries record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CS_GameSeries
     *
     * @mbggenerated
     */
    int insertSelective(CS_GameSeries record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CS_GameSeries
     *
     * @mbggenerated
     */
    List<CS_GameSeries> selectByExample(CS_GameSeriesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CS_GameSeries
     *
     * @mbggenerated
     */
    CS_GameSeries selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CS_GameSeries
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") CS_GameSeries record, @Param("example") CS_GameSeriesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CS_GameSeries
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") CS_GameSeries record, @Param("example") CS_GameSeriesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CS_GameSeries
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(CS_GameSeries record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CS_GameSeries
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(CS_GameSeries record);
}