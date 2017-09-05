/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package com.sitewhere.rest.model.scheduling;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.sitewhere.rest.model.common.MetadataProviderEntity;
import com.sitewhere.rest.model.datatype.JsonDateSerializer;
import com.sitewhere.spi.scheduling.ISchedule;
import com.sitewhere.spi.scheduling.TriggerType;

/**
 * Model object for a schedule.
 * 
 * @author Derek
 */
public class Schedule extends MetadataProviderEntity implements ISchedule {

    /** Serial version UID */
    private static final long serialVersionUID = -1316208751255296000L;

    /** Unique token */
    private String token;

    /** Schedule name */
    private String name;

    /** Type of trigger */
    private TriggerType triggerType;

    /** Configuration of trigger */
    private Map<String, String> triggerConfiguration = new HashMap<String, String>();

    /** Date schedule takes effect */
    private Date startDate;

    /** Date schedule is no longer in effect */
    private Date endDate;

    /*
     * (non-Javadoc)
     * 
     * @see com.sitewhere.spi.scheduling.ISchedule#getToken()
     */
    public String getToken() {
	return token;
    }

    public void setToken(String token) {
	this.token = token;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.sitewhere.spi.scheduling.ISchedule#getName()
     */
    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.sitewhere.spi.scheduling.ISchedule#getTriggerType()
     */
    public TriggerType getTriggerType() {
	return triggerType;
    }

    public void setTriggerType(TriggerType triggerType) {
	this.triggerType = triggerType;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.sitewhere.spi.scheduling.ISchedule#getTriggerConfiguration()
     */
    public Map<String, String> getTriggerConfiguration() {
	return triggerConfiguration;
    }

    public void setTriggerConfiguration(Map<String, String> triggerConfiguration) {
	this.triggerConfiguration = triggerConfiguration;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.sitewhere.spi.scheduling.ISchedule#getStartDate()
     */
    @JsonSerialize(using = JsonDateSerializer.class)
    public Date getStartDate() {
	return startDate;
    }

    public void setStartDate(Date startDate) {
	this.startDate = startDate;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.sitewhere.spi.scheduling.ISchedule#getEndDate()
     */
    @JsonSerialize(using = JsonDateSerializer.class)
    public Date getEndDate() {
	return endDate;
    }

    public void setEndDate(Date endDate) {
	this.endDate = endDate;
    }
}