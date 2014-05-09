package com.process.factory;

import java.io.Serializable;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.activitikbase.IService.IActivitiProcessUtils;
import com.process.service.ActivitiProcessUtils;



public class ActivitiProcessImplFactory implements Serializable{

	
	private static final long serialVersionUID = -7215063937786967093L;
	
	//make the ActivitiProcessImplFactory as singleton class
	private static final ActivitiProcessImplFactory singletonProcess=new ActivitiProcessImplFactory();
	
	private ActivitiProcessImplFactory(){
		
	}
	
	public static ActivitiProcessImplFactory getinstance(){
		
		return singletonProcess;
	}
	//end of class been made as singleton
	
	public IActivitiProcessUtils getActvitiProcessUtils(ApplicationContext context){
		
		if(context!=null){
		//retrieve the spring activiti configuration files
		 context = new ClassPathXmlApplicationContext("\\config\\spring-activiti.xml");
		}
		//get the respective bean from conf file
		ActivitiProcessUtils activitiProcess=(ActivitiProcessUtils)context.getBean("ActivitiServices");
		
		return activitiProcess;
	}

}
