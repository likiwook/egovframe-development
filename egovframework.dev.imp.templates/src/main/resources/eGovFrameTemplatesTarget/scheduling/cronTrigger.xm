<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-2.5.xsd">

	<bean id="trigger" class="org.springframework.scheduling.quartz.CronTriggerBean">
	  	<property name="jobDetail" ref="job1" />
	   	<property name="cronExpression" value="*" />
	</bean>

</beans>