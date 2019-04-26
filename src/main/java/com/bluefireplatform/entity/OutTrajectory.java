package com.bluefireplatform.entity;

public class OutTrajectory {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column out_trajectory.trajectory_id
     *
     * @mbggenerated Fri Apr 26 17:21:08 CST 2019
     */
    private Integer trajectoryId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column out_trajectory.user_id
     *
     * @mbggenerated Fri Apr 26 17:21:08 CST 2019
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column out_trajectory.start_time
     *
     * @mbggenerated Fri Apr 26 17:21:08 CST 2019
     */
    private Long startTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column out_trajectory.end_time
     *
     * @mbggenerated Fri Apr 26 17:21:08 CST 2019
     */
    private Long endTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column out_trajectory.trajectory_type
     *
     * @mbggenerated Fri Apr 26 17:21:08 CST 2019
     */
    private Integer trajectoryType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column out_trajectory.trajectory_src
     *
     * @mbggenerated Fri Apr 26 17:21:08 CST 2019
     */
    private String trajectorySrc;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column out_trajectory.trajectory_id
     *
     * @return the value of out_trajectory.trajectory_id
     *
     * @mbggenerated Fri Apr 26 17:21:08 CST 2019
     */
    public Integer getTrajectoryId() {
        return trajectoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column out_trajectory.trajectory_id
     *
     * @param trajectoryId the value for out_trajectory.trajectory_id
     *
     * @mbggenerated Fri Apr 26 17:21:08 CST 2019
     */
    public void setTrajectoryId(Integer trajectoryId) {
        this.trajectoryId = trajectoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column out_trajectory.user_id
     *
     * @return the value of out_trajectory.user_id
     *
     * @mbggenerated Fri Apr 26 17:21:08 CST 2019
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column out_trajectory.user_id
     *
     * @param userId the value for out_trajectory.user_id
     *
     * @mbggenerated Fri Apr 26 17:21:08 CST 2019
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column out_trajectory.start_time
     *
     * @return the value of out_trajectory.start_time
     *
     * @mbggenerated Fri Apr 26 17:21:08 CST 2019
     */
    public Long getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column out_trajectory.start_time
     *
     * @param startTime the value for out_trajectory.start_time
     *
     * @mbggenerated Fri Apr 26 17:21:08 CST 2019
     */
    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column out_trajectory.end_time
     *
     * @return the value of out_trajectory.end_time
     *
     * @mbggenerated Fri Apr 26 17:21:08 CST 2019
     */
    public Long getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column out_trajectory.end_time
     *
     * @param endTime the value for out_trajectory.end_time
     *
     * @mbggenerated Fri Apr 26 17:21:08 CST 2019
     */
    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column out_trajectory.trajectory_type
     *
     * @return the value of out_trajectory.trajectory_type
     *
     * @mbggenerated Fri Apr 26 17:21:08 CST 2019
     */
    public Integer getTrajectoryType() {
        return trajectoryType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column out_trajectory.trajectory_type
     *
     * @param trajectoryType the value for out_trajectory.trajectory_type
     *
     * @mbggenerated Fri Apr 26 17:21:08 CST 2019
     */
    public void setTrajectoryType(Integer trajectoryType) {
        this.trajectoryType = trajectoryType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column out_trajectory.trajectory_src
     *
     * @return the value of out_trajectory.trajectory_src
     *
     * @mbggenerated Fri Apr 26 17:21:08 CST 2019
     */
    public String getTrajectorySrc() {
        return trajectorySrc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column out_trajectory.trajectory_src
     *
     * @param trajectorySrc the value for out_trajectory.trajectory_src
     *
     * @mbggenerated Fri Apr 26 17:21:08 CST 2019
     */
    public void setTrajectorySrc(String trajectorySrc) {
        this.trajectorySrc = trajectorySrc == null ? null : trajectorySrc.trim();
    }
}