package com.bluefireplatform.mapper;

import com.bluefireplatform.entity.IndoorCompression;
import com.bluefireplatform.entity.IndoorCompressionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IndoorCompressionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table indoor_compression
     *
     * @mbggenerated Mon Apr 29 11:09:34 CST 2019
     */
    int countByExample(IndoorCompressionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table indoor_compression
     *
     * @mbggenerated Mon Apr 29 11:09:34 CST 2019
     */
    int deleteByExample(IndoorCompressionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table indoor_compression
     *
     * @mbggenerated Mon Apr 29 11:09:34 CST 2019
     */
    int deleteByPrimaryKey(Integer trajectoryId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table indoor_compression
     *
     * @mbggenerated Mon Apr 29 11:09:34 CST 2019
     */
    int insert(IndoorCompression record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table indoor_compression
     *
     * @mbggenerated Mon Apr 29 11:09:34 CST 2019
     */
    int insertSelective(IndoorCompression record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table indoor_compression
     *
     * @mbggenerated Mon Apr 29 11:09:34 CST 2019
     */
    List<IndoorCompression> selectByExample(IndoorCompressionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table indoor_compression
     *
     * @mbggenerated Mon Apr 29 11:09:34 CST 2019
     */
    IndoorCompression selectByPrimaryKey(Integer trajectoryId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table indoor_compression
     *
     * @mbggenerated Mon Apr 29 11:09:34 CST 2019
     */
    int updateByExampleSelective(@Param("record") IndoorCompression record, @Param("example") IndoorCompressionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table indoor_compression
     *
     * @mbggenerated Mon Apr 29 11:09:34 CST 2019
     */
    int updateByExample(@Param("record") IndoorCompression record, @Param("example") IndoorCompressionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table indoor_compression
     *
     * @mbggenerated Mon Apr 29 11:09:34 CST 2019
     */
    int updateByPrimaryKeySelective(IndoorCompression record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table indoor_compression
     *
     * @mbggenerated Mon Apr 29 11:09:34 CST 2019
     */
    int updateByPrimaryKey(IndoorCompression record);
}