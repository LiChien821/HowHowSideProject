package com.howhow.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;

import org.springframework.stereotype.Component;

@Entity @Table(name="favoritecourse",
uniqueConstraints=@UniqueConstraint(columnNames={"course_id", "user_id"}))
@Component
public class FavoriteCourse {
	
	@Id @Column(name = "favoritecourse_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int FavoriteCourseID;
	
	@Transient
	private int userID;
	
	@Transient
	private int courseID;

	@Column(name = "system_time")
	private String systemTime;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="user_id")
	private UserAccountMt userAccountMt;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="course_id")
	private CourseBasic courseBasic;

	public String getSystemTime() {
		return systemTime;
	}

	public void setSystemTime(String systemTime) {
		this.systemTime = systemTime;
	}

	public int getFavoriteCourseID() {
		return FavoriteCourseID;
	}

	public void setFavoriteCourseID(int favoriteCourseID) {
		FavoriteCourseID = favoriteCourseID;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public int getCourseID() {
		return courseID;
	}

	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}

	public UserAccountMt getUserAccountMt() {
		return userAccountMt;
	}

	public void setUserAccountMt(UserAccountMt userAccountMt) {
		this.userAccountMt = userAccountMt;
	}

	public CourseBasic getCourseBasic() {
		return courseBasic;
	}

	public void setCourseBasic(CourseBasic courseBasic) {
		this.courseBasic = courseBasic;
	}
	
	
	
}
