jee6-app-enterprise-archetype
=============================

JEE 6 Enterprise (Multi-Project) Archetype

1. Persistence

For execution in application servers: the persistence unit must be set transaction-type JTA and don't need to specify provider tag. For the datasource configuration, Glassfish uses JNDI names in follow format: 'java:app/jdbc/<datasource>'. Glassfish uses the datasource name without prefix like just 'jdbc/<datasource>'

Example:

<persistence-unit name="default" transaction-type="JTA">
	<!-- for Glassfish -->	
	<jta-data-source>java:app/jdbc/exampleapp-ds</jta-data-source>
	<!-- for JBoss, uncoment this and coment glassfish configuration -->
	<!-- <jta-data-source>jdbc/exampleapp-ds</jta-data-source> -->
	...
</persistence-unit>

In JSE/Tests environment, the persistence unit must specify the provider, transaction-type must be RESOURCE_LOCAL and the datasource specification must be non-jta.

Example:

<persistence-unit name="test" transaction-type="RESOURCE_LOCAL">
	<provider>org.hibernate.ejb.HibernatePersistence</provider>
	<!-- for Glassfish -->
	<non-jta-data-source>java:app/jdbc/${rootArtifactId}-ds</non-jta-data-source>
	<!-- for JBoss, uncoment this and coment glassfish configuration -->
	<!-- <non-jta-data-source>java:app/jdbc/${rootArtifactId}-ds</non-jta-data-source> -->
	...
</persistence-unit>


