package com.youtube.service.impl;


import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.youtube.dao.SubscriptionDao;
import com.youtube.domain.SubscriptionDO;
import com.youtube.domain.mapper.SubscriptionDomainMapper;
import com.youtube.service.SubscriptionService;
import com.youtube.service.model.Subscription;

/**
 * This class contains the implementation for the subscribe/unsubscribe functionalities
 * @author raj
 *
 */
@Component
public class SubscriptionServiceImpl implements SubscriptionService {

	@Autowired
	SubscriptionDao subscriptionDao;
	
	@Autowired
	SubscriptionDomainMapper subscriptionDomainMapper;

	@Override
	public Subscription subscribe(Subscription subscription) throws Exception {
		if (subscription == null)
			throw new Exception("Subscription information cannot be null");
		
		// Generating unique subscripitonId before persisting
		String subscriptionId = UUID.randomUUID().toString();
		SubscriptionDO subscriptionDO = subscriptionDomainMapper.mapToDO(subscription);
		subscriptionDO.setSubscriptionId(subscriptionId);
		subscriptionDao.add(subscriptionDO);
		
		Subscription result = subscriptionDomainMapper.mapToModel(subscriptionDao.get(SubscriptionDO.class, subscriptionId));
		return result;
	}

	@Override
	public void unsubscribe(Subscription subscription) throws Exception {
		if (subscription == null)
			throw new Exception("Subscription information cannot be null");
		
		String subscriptionId = subscription.getSubscriptionId();
		subscriptionDao.delete(SubscriptionDO.class, subscriptionId);
	}

		


}
