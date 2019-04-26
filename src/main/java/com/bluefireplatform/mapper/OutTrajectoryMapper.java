package com.bluefireplatform.mapper;

import com.bluefireplatform.entity.OutTrajectory;
import com.bluefireplatform.entity.OutTrajectoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OutTrajectoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table out_trajectory
     *
     * @mbggenerated Fri Apr 26 17:21:08 CST 2019
     */
    int countByExample(OutTrajectoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table out_trajectory
     *
     * @mbggenerated Fri Apr 26 17:21:08 CST 2019
     */
    int deleteByExample(OutTrajectoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table out_trajectory
     *
     * @mbggenerated Fri Apr 26 17:21:08 CST 2019
     */
    int deleteByPrimaryKey(Integer trajectoryId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table out_trajectory
     *
     * @mbggenerated Fri Apr 26 17:21:08 CST 2019
     */
    int insert(OutTrajectory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table out_trajectory
     *
     * @mbggenerated Fri Apr 26 17:21:08 CST 2019
     */
    int insertSelective(OutTrajectory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table out_trajectory
     *
     * @mbggenerated Fri Apr 26 17:21:08 CST 2019
     */
    List<OutTrajectory> selectByExample(OutTrajectoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table out_trajectory
     *
     * @mbggenerated Fri Apr 26 17:21:08 CST 2019
     */
    OutTrajectory selectByPrimaryKey(Integer trajectoryId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table out_trajectory
     *
     * @mbggenerated Fri Apr 26 17:21:08 CST 2019
     */
    int updateByExampleSelective(@Param("record") OutTrajectory record, @Param("example") OutTrajectoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table out_trajectory
     *
     * @mbggenerated Fri Apr 26 17:21:08 CST 2019
     */
    int updateByExample(@Param("record") OutTrajectory record, @Param("example") OutTrajectoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table out_trajectory
     *
     * @mbggenerated Fri Apr 26 17:21:08 CST 2019
     */
    int updateByPrimaryKeySelective(OutTrajectory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table out_trajectory
     *
     * @mbggenerated Fri Apr 26 17:21:08 CST 2019
     */
    int updateByPrimaryKey(OutTrajectory record);
}