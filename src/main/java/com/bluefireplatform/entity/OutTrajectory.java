package com.bluefireplatform.entity;

public class OutTrajectory {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column out_trajectory.out_trajectory_id
     *
     * @mbggenerated Tue Apr 16 09:23:22 CST 2019
     */
    private Integer outTrajectoryId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column out_trajectory.out_user_id
     *
     * @mbggenerated Tue Apr 16 09:23:22 CST 2019
     */
    private Integer outUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column out_trajectory.out_trajectory_type
     *
     * @mbggenerated Tue Apr 16 09:23:22 CST 2019
     */
    private Integer outTrajectoryType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column out_trajectory.out_trajectory_src
     *
     * @mbggenerated Tue Apr 16 09:23:22 CST 2019
     */
    private String outTrajectorySrc;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column out_trajectory.out_trajectory_id
     *
     * @return the value of out_trajectory.out_trajectory_id
     *
     * @mbggenerated Tue Apr 16 09:23:22 CST 2019
     */
    public Integer getOutTrajectoryId() {
        return outTrajectoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column out_trajectory.out_trajectory_id
     *
     * @param outTrajectoryId the value for out_trajectory.out_trajectory_id
     *
     * @mbggenerated Tue Apr 16 09:23:22 CST 2019
     */
    public void setOutTrajectoryId(Integer outTrajectoryId) {
        this.outTrajectoryId = outTrajectoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column out_trajectory.out_user_id
     *
     * @return the value of out_trajectory.out_user_id
     *
     * @mbggenerated Tue Apr 16 09:23:22 CST 2019
     */
    public Integer getOutUserId() {
        return outUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column out_trajectory.out_user_id
     *
     * @param outUserId the value for out_trajectory.out_user_id
     *
     * @mbggenerated Tue Apr 16 09:23:22 CST 2019
     */
    public void setOutUserId(Integer outUserId) {
        this.outUserId = outUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column out_trajectory.out_trajectory_type
     *
     * @return the value of out_trajectory.out_trajectory_type
     *
     * @mbggenerated Tue Apr 16 09:23:22 CST 2019
     */
    public Integer getOutTrajectoryType() {
        return outTrajectoryType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column out_trajectory.out_trajectory_type
     *
     * @param outTrajectoryType the value for out_trajectory.out_trajectory_type
     *
     * @mbggenerated Tue Apr 16 09:23:22 CST 2019
     */
    public void setOutTrajectoryType(Integer outTrajectoryType) {
        this.outTrajectoryType = outTrajectoryType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column out_trajectory.out_trajectory_src
     *
     * @return the value of out_trajectory.out_trajectory_src
     *
     * @mbggenerated Tue Apr 16 09:23:22 CST 2019
     */
    public String getOutTrajectorySrc() {
        return outTrajectorySrc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column out_trajectory.out_trajectory_src
     *
     * @param outTrajectorySrc the value for out_trajectory.out_trajectory_src
     *
     * @mbggenerated Tue Apr 16 09:23:22 CST 2019
     */
    public void setOutTrajectorySrc(String outTrajectorySrc) {
        this.outTrajectorySrc = outTrajectorySrc == null ? null : outTrajectorySrc.trim();
    }
}