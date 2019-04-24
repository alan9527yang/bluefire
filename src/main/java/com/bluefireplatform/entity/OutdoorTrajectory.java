package com.bluefireplatform.entity;

import java.util.Date;

public class OutdoorTrajectory {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column outdoor_trajectory.out_point_id
     *
     * @mbggenerated Wed Apr 10 10:47:33 CST 2019
     */
    private Integer outPointId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column outdoor_trajectory.out_user_id
     *
     * @mbggenerated Wed Apr 10 10:47:33 CST 2019
     */
    private Integer outUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column outdoor_trajectory.out_latitude
     *
     * @mbggenerated Wed Apr 10 10:47:33 CST 2019
     */
    private Double outLatitude;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column outdoor_trajectory.out_longitude
     *
     * @mbggenerated Wed Apr 10 10:47:33 CST 2019
     */
    private Double outLongitude;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column outdoor_trajectory.out_set
     *
     * @mbggenerated Wed Apr 10 10:47:33 CST 2019
     */
    private String outSet;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column outdoor_trajectory.out_altitude_in_feet
     *
     * @mbggenerated Wed Apr 10 10:47:33 CST 2019
     */
    private Integer outAltitudeInFeet;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column outdoor_trajectory.out_days
     *
     * @mbggenerated Wed Apr 10 10:47:33 CST 2019
     */
    private Double outDays;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column outdoor_trajectory.out_date
     *
     * @mbggenerated Wed Apr 10 10:47:33 CST 2019
     */
    private Date outDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column outdoor_trajectory.out_time
     *
     * @mbggenerated Wed Apr 10 10:47:33 CST 2019
     */
    private Date outTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column outdoor_trajectory.out_point_id
     *
     * @return the value of outdoor_trajectory.out_point_id
     *
     * @mbggenerated Wed Apr 10 10:47:33 CST 2019
     */
    public Integer getOutPointId() {
        return outPointId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column outdoor_trajectory.out_point_id
     *
     * @param outPointId the value for outdoor_trajectory.out_point_id
     *
     * @mbggenerated Wed Apr 10 10:47:33 CST 2019
     */
    public void setOutPointId(Integer outPointId) {
        this.outPointId = outPointId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column outdoor_trajectory.out_user_id
     *
     * @return the value of outdoor_trajectory.out_user_id
     *
     * @mbggenerated Wed Apr 10 10:47:33 CST 2019
     */
    public Integer getOutUserId() {
        return outUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column outdoor_trajectory.out_user_id
     *
     * @param outUserId the value for outdoor_trajectory.out_user_id
     *
     * @mbggenerated Wed Apr 10 10:47:33 CST 2019
     */
    public void setOutUserId(Integer outUserId) {
        this.outUserId = outUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column outdoor_trajectory.out_latitude
     *
     * @return the value of outdoor_trajectory.out_latitude
     *
     * @mbggenerated Wed Apr 10 10:47:33 CST 2019
     */
    public Double getOutLatitude() {
        return outLatitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column outdoor_trajectory.out_latitude
     *
     * @param outLatitude the value for outdoor_trajectory.out_latitude
     *
     * @mbggenerated Wed Apr 10 10:47:33 CST 2019
     */
    public void setOutLatitude(Double outLatitude) {
        this.outLatitude = outLatitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column outdoor_trajectory.out_longitude
     *
     * @return the value of outdoor_trajectory.out_longitude
     *
     * @mbggenerated Wed Apr 10 10:47:33 CST 2019
     */
    public Double getOutLongitude() {
        return outLongitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column outdoor_trajectory.out_longitude
     *
     * @param outLongitude the value for outdoor_trajectory.out_longitude
     *
     * @mbggenerated Wed Apr 10 10:47:33 CST 2019
     */
    public void setOutLongitude(Double outLongitude) {
        this.outLongitude = outLongitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column outdoor_trajectory.out_set
     *
     * @return the value of outdoor_trajectory.out_set
     *
     * @mbggenerated Wed Apr 10 10:47:33 CST 2019
     */
    public String getOutSet() {
        return outSet;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column outdoor_trajectory.out_set
     *
     * @param outSet the value for outdoor_trajectory.out_set
     *
     * @mbggenerated Wed Apr 10 10:47:33 CST 2019
     */
    public void setOutSet(String outSet) {
        this.outSet = outSet == null ? null : outSet.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column outdoor_trajectory.out_altitude_in_feet
     *
     * @return the value of outdoor_trajectory.out_altitude_in_feet
     *
     * @mbggenerated Wed Apr 10 10:47:33 CST 2019
     */
    public Integer getOutAltitudeInFeet() {
        return outAltitudeInFeet;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column outdoor_trajectory.out_altitude_in_feet
     *
     * @param outAltitudeInFeet the value for outdoor_trajectory.out_altitude_in_feet
     *
     * @mbggenerated Wed Apr 10 10:47:33 CST 2019
     */
    public void setOutAltitudeInFeet(Integer outAltitudeInFeet) {
        this.outAltitudeInFeet = outAltitudeInFeet;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column outdoor_trajectory.out_days
     *
     * @return the value of outdoor_trajectory.out_days
     *
     * @mbggenerated Wed Apr 10 10:47:33 CST 2019
     */
    public Double getOutDays() {
        return outDays;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column outdoor_trajectory.out_days
     *
     * @param outDays the value for outdoor_trajectory.out_days
     *
     * @mbggenerated Wed Apr 10 10:47:33 CST 2019
     */
    public void setOutDays(Double outDays) {
        this.outDays = outDays;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column outdoor_trajectory.out_date
     *
     * @return the value of outdoor_trajectory.out_date
     *
     * @mbggenerated Wed Apr 10 10:47:33 CST 2019
     */
    public Date getOutDate() {
        return outDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column outdoor_trajectory.out_date
     *
     * @param outDate the value for outdoor_trajectory.out_date
     *
     * @mbggenerated Wed Apr 10 10:47:33 CST 2019
     */
    public void setOutDate(Date outDate) {
        this.outDate = outDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column outdoor_trajectory.out_time
     *
     * @return the value of outdoor_trajectory.out_time
     *
     * @mbggenerated Wed Apr 10 10:47:33 CST 2019
     */
    public Date getOutTime() {
        return outTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column outdoor_trajectory.out_time
     *
     * @param outTime the value for outdoor_trajectory.out_time
     *
     * @mbggenerated Wed Apr 10 10:47:33 CST 2019
     */
    public void setOutTime(Date outTime) {
        this.outTime = outTime;
    }
}