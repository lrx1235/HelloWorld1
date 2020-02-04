package org.student1.HelloWorld1.entity;

import java.util.Arrays;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.Email;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import org.student1.HelloWorld1.entity.Pet;

@Component     //将此放入ioc
@ConfigurationProperties(prefix="student")
@Validated  //jsr303开启的注解
@PropertySource(value= {"classpath:conf.properties"})  //此注解是加载名字自命的.properties文件
public class Student {

	@Email    //数据校验
	private String email;
	private String name;
	private int age;
	@Value("true")
	private boolean sex;
	private Date birthday;
	private Map<String,Object> location;
	private String[] hobbies;
	private List<String> skills;
	private Pet pet;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Map<String, Object> getLocation() {
		return location;
	}
	public void setLocation(Map<String, Object> location) {
		this.location = location;
	}
	public String[] getHobbies() {
		return hobbies;
	}
	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	public Pet getPet() {
		return pet;
	}
	public void setPet(Pet pet) {
		this.pet = pet;
	}
	@Override
	public String toString() {
		return "Student [email=" + email + ", name=" + name + ", age=" + age + ", sex=" + sex + ", birthday=" + birthday
				+ ", location=" + location + ", hobbies=" + Arrays.toString(hobbies) + ", skills=" + skills + ", pet="
				+ pet + "]";
	}
	
}
