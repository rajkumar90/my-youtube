package com.youtube.domain.mapper;

import org.springframework.stereotype.Component;

import com.youtube.domain.SubscriptionDO;
import com.youtube.service.model.Subscription;
import com.youtube.service.model.SubscriptionType;

/**
 * Mapper classes that maps between Subscription(model) class, and SubscriptionDO (Domain Entity) class
 * @author raj
 *
 */
@Component
public class SubscriptionDomainMapper implements DomainMapper<Subscription, SubscriptionDO>{
	/**
	 * Map from model to domain object
	 */
	public SubscriptionDO mapToDO(Subscription subscription) {		
		SubscriptionDO subscriptionDO = new SubscriptionDO();
		subscriptionDO.setSubscriptionId(subscription.getSubscriptionId());
		subscriptionDO.setChannelOrTagId(subscription.getChannelOrTagId());
		subscriptionDO.setSubscriptionType(subscription.getSubscriptionType().name());
		subscriptionDO.setUserId(subscription.getUserId());
		return subscriptionDO;
	}
		
	/**
	 * Map from domain to model object
	 */
	public Subscription mapToModel(SubscriptionDO subscriptionDO) {	
		Subscription subscription = new Subscription();
		subscription.setSubscriptionId(subscriptionDO.getSubscriptionId());
		subscription.setUserId(subscriptionDO.getUserId());
		subscription.setSubscriptionType(SubscriptionType.valueOf(subscriptionDO.getSubscriptionType()));
		subscription.setChannelOrTagId(subscriptionDO.getChannelOrTagId());
		
		return subscription;
	}		
}
