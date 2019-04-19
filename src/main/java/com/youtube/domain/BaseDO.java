package com.youtube.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.youtube.util.YoutubeConstantsConstants;
/**
 * Base DO for all classes - Has fields that are common across all DB tables (like createts, etc)
 * @author raj
 *
 */
@MappedSuperclass
public abstract class BaseDO {
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATETS", nullable = false)
	protected Date createTs;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "MODIFYTS", nullable = false)
	protected Date modifyTs;
	
	@Column(name = "CREATE_USER_ID")
	protected String createUserId;
	
	@Column(name = "MODIFY_USER_ID")
	protected String modifyUserId;
	
	public String getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}

	public String getModifyUserId() {
		return modifyUserId;
	}

	public void setModifyUserId(String modifyUserId) {
		this.modifyUserId = modifyUserId;
	}

	public Date getCreateTs() {
		return createTs;
	}

	public void setCreateTs(Date createts) {
		this.createTs = createts;
	}

	public Date getModifyTs() {
		return modifyTs;
	}

	public void setModifyTs(Date modifyTs) {
		this.modifyTs = modifyTs;
	}

	@PrePersist
	protected void onCreate() {
		Date now = new Date();
		this.createTs = now;
		this.modifyTs = now;
		
		// TODO Get userId from auth token and store later. Defauting to 'app' user now
		this.createUserId = YoutubeConstantsConstants.APPLICATION_USER;
		this.modifyUserId = YoutubeConstantsConstants.APPLICATION_USER;
	}
	
	@PreUpdate
	protected void onUpdate() {
		this.modifyTs = new Date();
		this.modifyUserId = YoutubeConstantsConstants.APPLICATION_USER;
	}
}
