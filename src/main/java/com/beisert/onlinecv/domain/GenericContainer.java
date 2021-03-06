package com.beisert.onlinecv.domain;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlType;

@XmlType( propOrder={"title","value","children"})
public class GenericContainer {
	
	I18NText title;
	I18NText value;
	
	List<GenericContainer> children = new ArrayList<GenericContainer>();
	
	
	public GenericContainer(){}
	
	public GenericContainer(I18NText title, I18NText value) {
		super();
		this.title = title;
		this.value = value;
	}

	public I18NText getTitle() {
		return title;
	}

	public void setTitle(I18NText title) {
		this.title = title;
	}

	public I18NText getValue() {
		return value;
	}

	public void setValue(I18NText value) {
		this.value = value;
	}

	public List<GenericContainer> getChildren() {
		return children;
	}

	public void setChildren(List<GenericContainer> children) {
		this.children = children;
	}
	
}
