package com.ty.HBMS.config;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.ty.HBMS.config","com.ty.HBMS.controller","com.ty.HBMS.dao","com.ty.HBMS.dto","com.ty.HBMS.service"})
public class IocConfig {
	@Bean
	public EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("dev").createEntityManager();
	}
	@Bean
	public EntityTransaction getTransaction() {
		return getEntityManager().getTransaction();
	}
}
