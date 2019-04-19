package com.youtube.service;

import com.youtube.service.model.Subscription;

/**
 * Interface that contains methods dealing with Subscription to a channel or tag
 * @author raj
 *
 */
public interface SubscriptionService {
	// Subscribe - Upon successful subscription, this method returns the subscription data to the caller
	public Subscription subscribe(Subscription subscription) throws Exception;
	
	// Unsubscribe - Method does not return anything since the subscription info will be removed from the system as part of this call
	public void unsubscribe(Subscription subscription) throws Exception;
	
}