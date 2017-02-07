package com.cognizant.spring.batch.processor;

import org.springframework.batch.item.ItemProcessor;

import com.cognizant.spring.batch.model.XmlToCsvModel;

//run before writing
public class XmlToCsvProcessor implements ItemProcessor<XmlToCsvModel, XmlToCsvModel> {

	@Override
	public XmlToCsvModel process(XmlToCsvModel item) throws Exception {

		//filter object which age = 30
		if(item.getAge()==30){
			return null; // null = ignore this object
		}
		return item;
	}

}