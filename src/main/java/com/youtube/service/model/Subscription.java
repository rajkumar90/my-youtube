package com.youtube.service.model;

/**
 * This is the model class for Subscription - All services/components use this class while dealing with subscriptions
 * Using the same class in the API contract as well (instead of creating a separate request/response DTO)
 * @author raj
 *
 */
public class Subscription {
	private String subscriptionId;
	private String channelOrTagId;
	private String userId;
	// User can either subscribe or follow a channel or tag - This info is represented in the following enum
	private SubscriptionType subscriptionType;
	
	public String getChannelOrTagId() {
		return channelOrTagId;
	}
	public void setChannelOrTagId(String channelOrTagId) {
		this.channelOrTagId = channelOrTagId;
	}
	
	public SubscriptionType getSubscriptionType() {
		return subscriptionType;
	}
	public void setSubscriptionType(SubscriptionType subscriptionType) {
		this.subscriptionType = subscriptionType;
	}
	public String getSubscriptionId() {
		return subscriptionId;
	}
	public void setSubscriptionId(String subscriptionId) {
		this.subscriptionId = subscriptionId;
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	
}
