package com.youtube.domain.mapper;

/**
 * Interface for DomainMapper - Contains methods for mapping the model classes to domain(DO/DE) classes, that will be used by DAO to persist
 * @author raj
 *
 */
public interface DomainMapper<M,D> {
	/**
	 * Maps the model object to the domain object
	 * @param model
	 * @return
	 */
	D mapToDO(M model);
	
	/**
	 * Maps the domain object to model object
	 * @param domain
	 * @return
	 */
	M mapToModel(D domain);
}
