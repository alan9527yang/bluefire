package com.bluefireplatform.mapper;

import com.bluefireplatform.entity.OutdoorPresentLocation;
import com.bluefireplatform.entity.OutdoorPresentLocationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OutdoorPresentLocationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table outdoor_present_location
     *
     * @mbggenerated Wed May 08 15:32:34 CST 2019
     */
    int countByExample(OutdoorPresentLocationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table outdoor_present_location
     *
     * @mbggenerated Wed May 08 15:32:34 CST 2019
     */
    int deleteByExample(OutdoorPresentLocationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table outdoor_present_location
     *
     * @mbggenerated Wed May 08 15:32:34 CST 2019
     */
    int deleteByPrimaryKey(Integer locationId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table outdoor_present_location
     *
     * @mbggenerated Wed May 08 15:32:34 CST 2019
     */
    int insert(OutdoorPresentLocation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table outdoor_present_location
     *
     * @mbggenerated Wed May 08 15:32:34 CST 2019
     */
    int insertSelective(OutdoorPresentLocation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table outdoor_present_location
     *
     * @mbggenerated Wed May 08 15:32:34 CST 2019
     */
    List<OutdoorPresentLocation> selectByExample(OutdoorPresentLocationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table outdoor_present_location
     *
     * @mbggenerated Wed May 08 15:32:34 CST 2019
     */
    OutdoorPresentLocation selectByPrimaryKey(Integer locationId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table outdoor_present_location
     *
     * @mbggenerated Wed May 08 15:32:34 CST 2019
     */
    int updateByExampleSelective(@Param("record") OutdoorPresentLocation record, @Param("example") OutdoorPresentLocationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table outdoor_present_location
     *
     * @mbggenerated Wed May 08 15:32:34 CST 2019
     */
    int updateByExample(@Param("record") OutdoorPresentLocation record, @Param("example") OutdoorPresentLocationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table outdoor_present_location
     *
     * @mbggenerated Wed May 08 15:32:34 CST 2019
     */
    int updateByPrimaryKeySelective(OutdoorPresentLocation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table outdoor_present_location
     *
     * @mbggenerated Wed May 08 15:32:34 CST 2019
     */
    int updateByPrimaryKey(OutdoorPresentLocation record);
}