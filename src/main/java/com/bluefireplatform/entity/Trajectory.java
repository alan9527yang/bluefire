package com.bluefireplatform.entity;

public class Trajectory {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trajectory.trajectory_id
     *
     * @mbggenerated Tue Apr 16 09:23:46 CST 2019
     */
    private Integer trajectoryId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trajectory.user_id
     *
     * @mbggenerated Tue Apr 16 09:23:46 CST 2019
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trajectory.start_time
     *
     * @mbggenerated Tue Apr 16 09:23:46 CST 2019
     */
    private String startTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trajectory.end_time
     *
     * @mbggenerated Tue Apr 16 09:23:46 CST 2019
     */
    private String endTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trajectory.trajectory_type
     *
     * @mbggenerated Tue Apr 16 09:23:46 CST 2019
     */
    private Integer trajectoryType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trajectory.trajectory_src
     *
     * @mbggenerated Tue Apr 16 09:23:46 CST 2019
     */
    private String trajectorySrc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trajectory.map_id
     *
     * @mbggenerated Tue Apr 16 09:23:46 CST 2019
     */
    private Integer mapId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trajectory.trajectory_id
     *
     * @return the value of trajectory.trajectory_id
     *
     * @mbggenerated Tue Apr 16 09:23:46 CST 2019
     */
    public Integer getTrajectoryId() {
        return trajectoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trajectory.trajectory_id
     *
     * @param trajectoryId the value for trajectory.trajectory_id
     *
     * @mbggenerated Tue Apr 16 09:23:46 CST 2019
     */
    public void setTrajectoryId(Integer trajectoryId) {
        this.trajectoryId = trajectoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trajectory.user_id
     *
     * @return the value of trajectory.user_id
     *
     * @mbggenerated Tue Apr 16 09:23:46 CST 2019
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trajectory.user_id
     *
     * @param userId the value for trajectory.user_id
     *
     * @mbggenerated Tue Apr 16 09:23:46 CST 2019
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trajectory.start_time
     *
     * @return the value of trajectory.start_time
     *
     * @mbggenerated Tue Apr 16 09:23:46 CST 2019
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trajectory.start_time
     *
     * @param startTime the value for trajectory.start_time
     *
     * @mbggenerated Tue Apr 16 09:23:46 CST 2019
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime == null ? null : startTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trajectory.end_time
     *
     * @return the value of trajectory.end_time
     *
     * @mbggenerated Tue Apr 16 09:23:46 CST 2019
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trajectory.end_time
     *
     * @param endTime the value for trajectory.end_time
     *
     * @mbggenerated Tue Apr 16 09:23:46 CST 2019
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime == null ? null : endTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trajectory.trajectory_type
     *
     * @return the value of trajectory.trajectory_type
     *
     * @mbggenerated Tue Apr 16 09:23:46 CST 2019
     */
    public Integer getTrajectoryType() {
        return trajectoryType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trajectory.trajectory_type
     *
     * @param trajectoryType the value for trajectory.trajectory_type
     *
     * @mbggenerated Tue Apr 16 09:23:46 CST 2019
     */
    public void setTrajectoryType(Integer trajectoryType) {
        this.trajectoryType = trajectoryType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trajectory.trajectory_src
     *
     * @return the value of trajectory.trajectory_src
     *
     * @mbggenerated Tue Apr 16 09:23:46 CST 2019
     */
    public String getTrajectorySrc() {
        return trajectorySrc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trajectory.trajectory_src
     *
     * @param trajectorySrc the value for trajectory.trajectory_src
     *
     * @mbggenerated Tue Apr 16 09:23:46 CST 2019
     */
    public void setTrajectorySrc(String trajectorySrc) {
        this.trajectorySrc = trajectorySrc == null ? null : trajectorySrc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trajectory.map_id
     *
     * @return the value of trajectory.map_id
     *
     * @mbggenerated Tue Apr 16 09:23:46 CST 2019
     */
    public Integer getMapId() {
        return mapId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trajectory.map_id
     *
     * @param mapId the value for trajectory.map_id
     *
     * @mbggenerated Tue Apr 16 09:23:46 CST 2019
     */
    public void setMapId(Integer mapId) {
        this.mapId = mapId;
    }
}