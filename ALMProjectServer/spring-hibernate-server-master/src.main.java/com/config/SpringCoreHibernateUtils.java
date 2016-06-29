package com.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;

import java.util.Properties;
import java.util.ResourceBundle;

import javax.sql.DataSource;

@Configuration
public class SpringCoreHibernateUtils 
{
	public SpringCoreHibernateUtils() 
	{
		System.out.println("This is the output, I was hoping for");
	}
	ResourceBundle rb = ResourceBundle.getBundle("resource");
	
	//dataSource Bean  -- Used as a reference by bean of type LocalSessionFactory
	@Bean
	public DataSource dataSource() 
	{
		final BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName(rb.getString("jdbc.driver"));
		dataSource.setUrl(rb.getString("jdbc.url"));
		dataSource.setUsername(rb.getString("jdbc.username"));
		dataSource.setPassword(rb.getString("jdbc.password"));
		return dataSource;
	}

	//sessionFactory Bean
	@Bean
	public LocalSessionFactoryBean sessionFactory() 
	{
		final LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(dataSource());
		sessionFactory.setHibernateProperties(hibernateProperties());
		sessionFactory.setPackagesToScan("com.pojos");
		return sessionFactory;
	}

	/*@Bean
	@Autowired 
	public HibernateTransactionManager txmanager(final SessionFactory sessionFactory)
	{
		final HibernateTransactionManager htm = new HibernateTransactionManager();
		htm.setSessionFactory(sessionFactory);
		return htm;
	}
	
	@Bean
    @Autowired
    public HibernateTemplate getHibernateTemplate(SessionFactory sessionFactory)
    {
        HibernateTemplate hibernateTemplate = new HibernateTemplate(sessionFactory);
        return hibernateTemplate;
    }
	
	@Bean
    @Autowired 
    public HibernateTransactionManager transactionManager(SessionFactory sessionFactory)
    {
        HibernateTransactionManager htm = new HibernateTransactionManager();
        htm.setSessionFactory(sessionFactory);
        return htm;
    }*/
	
	//Hibernate Properties -- used by bean of type LocalSessionFactory
	public Properties hibernateProperties() 
	{
		final Properties hibernateProperties = new Properties();
		hibernateProperties.setProperty("hibernate.hbm2ddl.auto", rb.getString("hibernate.hbm2ddl.auto"));
		hibernateProperties.setProperty("hibernate.dialect", rb.getString("hibernate.dialect"));
		hibernateProperties.setProperty("hibernate.show_sql", rb.getString("hibernate.show_sql"));
		hibernateProperties.setProperty("hibernate.format_sql", rb.getString("hibernate.format_sql"));
		
		return hibernateProperties;
	}
	
}
