package com.youtube.resource.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.youtube.resource.SubscriptionResource;
import com.youtube.service.SubscriptionService;
import com.youtube.service.model.Subscription;

@Component
public class SubscriptionResourceImpl implements SubscriptionResource {

	@Autowired
	SubscriptionService subscriptionService;

	@Override
	public Subscription subscribe(Subscription subscription) throws Exception {
		return subscriptionService.subscribe(subscription);
	}

	@Override
	public void unsubscribe(Subscription subscription) throws Exception {
		subscriptionService.unsubscribe(subscription);
	}

}
