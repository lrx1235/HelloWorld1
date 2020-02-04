package org.student1.HelloWorld1.entity;

public class Pet {

	private String nickname;
	private String strain;    //宠物种类
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getStrain() {
		return strain;
	}
	public void setStrain(String strain) {
		this.strain = strain;
	}
	@Override
	public String toString() {
		return "Pet [nickname=" + nickname + ", strain=" + strain + "]";
	}
	
}
