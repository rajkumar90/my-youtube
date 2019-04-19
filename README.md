This project contains a high-level implementation of the Follow/Subscribe functionality for Youtube
The key classes are the following:
1. SubscriptionResourceImpl (which implements SubscriptionResource)
	-> This class has the REST interface with path definitions, etc
2. SubscriptionServiceServiceImpl (which implements by SubscriptionService)
	-> This class has the business logic of handling each subscription request
3. SubscriptionDomainMapper (which implements DomainMapper)
	-> This class has the mapping logic between the model/business objects and the domain objects (used for persistence)
4. SubscriptionDao (which extends GenericDao)
	-> This is the data access layer which handles get/add/update/delete
	-> Have assumed using a Relational DB with JPA for persistence
	

Callaouts:
1. The project has some dependencies managed via Gradle (For eg. I used some jax-rs and jpa annotations to specify REST resources and persistence classes).
Due to this there may be compilation errors when the project is imported into IDE. The compilation errors will go off, once you update the gradle dependencies through your IDE
2. Haven't written unit tests for any of the classes
