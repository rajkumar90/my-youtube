package com.youtube.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * DO for the 'Subscription' entity
 * @author raj
 *
 */
@Entity
@Table(name = "SUBSCRIPTION_INFO")
public class SubscriptionDO extends BaseDO {		
	@Id
	@Column(name = "SUBSCRIPTION_ID")
	private String subscriptionId;
	
	// User can follow/subscribe to either a channel or tag
	@Column(name = "SUBSCRIPTION_TYPE")
	private String subscriptionType;

	public String getSubscriptionId() {
		return subscriptionId;
	}

	public void setSubscriptionId(String subscriptionId) {
		this.subscriptionId = subscriptionId;
	}

	public String getSubscriptionType() {
		return subscriptionType;
	}

	public void setSubscriptionType(String subscriptionType) {
		this.subscriptionType = subscriptionType;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getChannelOrTagId() {
		return channelOrTagId;
	}

	public void setChannelOrTagId(String channelOrTagId) {
		this.channelOrTagId = channelOrTagId;
	}

	@Column(name = "USER_ID")
	private String userId;
	
	@Column(name = "CHANNEL_OR_TAG_ID")
	private String channelOrTagId;
	
}
