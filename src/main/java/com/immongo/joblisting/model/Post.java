package com.immongo.joblisting.model;

import java.util.Arrays;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "JobPost")
public class Post {
	private String profile;
	
	private String desc;
	
	private int ex;
	
	private String techs[];
	
	public Post() {
		
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getEx() {
		return ex;
	}

	public void setEx(int ex) {
		this.ex = ex;
	}

	public String[] getTechs() {
		return techs;
	}

	public void setTechs(String[] techs) {
		this.techs = techs;
	}

	@Override
	public String toString() {
		return "Post [profile=" + profile + ", desc=" + desc + ", ex=" + ex + ", techs=" + Arrays.toString(techs) + "]";
	}
	
}
