package com.howhow.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity @Table(name="coursebasic")
@Component("coursebasic")
public class CourseBasic {
	
	@Id @Column(name="COURSEID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int courseId;
	
	@Column(name="COURSENAME")
	private String courseName;
	
	@Column(name="PRICE")
	private Long price;
	
	@Column(name="DISCOUNT")
	private double discount;
	
	@ManyToOne
	@JoinColumn(name="CATEGORYID")
	private Category category;
	
	
	@Column(name="COURSESTATUS")
	private Long courseStatus;
	
	
	@Column(name="COURSECOVER")
	private String courseCover;
	
	
	@Column
	private String description;
	
	@Column(name="SYSTEMTIME")
	private String SystemTime;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn
	private UserAccountDt creator;
	
	@OneToMany(mappedBy = "courseBasic")
	private List<Section> sectionList =new ArrayList<Section>();
	
	
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "courseBasic", cascade = CascadeType.ALL)
	private List<PurchasedCourse> purchasedCourses = new ArrayList<PurchasedCourse>();
	
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "courseBasic", cascade = CascadeType.ALL)
	private List<OrderDt> orderDtList = new ArrayList<OrderDt>();
	
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "courseBasic", cascade = CascadeType.ALL)
	private List<ShoppingCart> shoppingCartList = new ArrayList<ShoppingCart>();
	
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "courseBasic", cascade = CascadeType.ALL)
	private List<CFCourse> cfCourseList = new ArrayList<CFCourse>();
	
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "courseBasic", cascade = CascadeType.ALL)
	private List<FavoriteCourse> favoriteCourseList = new ArrayList<FavoriteCourse>();
	
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "courseBasic", cascade = CascadeType.ALL)
	private List<CourseRank> courseRankList = new ArrayList<CourseRank>();

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}



	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}



	public String getCourseCover() {
		return courseCover;
	}

	public void setCourseCover(String courseCover) {
		this.courseCover = courseCover;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSystemTime() {
		return SystemTime;
	}

	public void setSystemTime(String systemTime) {
		SystemTime = systemTime;
	}

	public UserAccountDt getCreator() {
		return creator;
	}

	public void setCreator(UserAccountDt creator) {
		this.creator = creator;
	}

	public List<Section> getSectionList() {
		return sectionList;
	}

	public void setSectionList(List<Section> sectionList) {
		this.sectionList = sectionList;
	}

	public List<PurchasedCourse> getPurchasedCourses() {
		return purchasedCourses;
	}

	public void setPurchasedCourses(List<PurchasedCourse> purchasedCourses) {
		this.purchasedCourses = purchasedCourses;
	}

	public List<OrderDt> getOrderDtList() {
		return orderDtList;
	}

	public void setOrderDtList(List<OrderDt> orderDtList) {
		this.orderDtList = orderDtList;
	}

	public List<ShoppingCart> getShoppingCartList() {
		return shoppingCartList;
	}

	public void setShoppingCartList(List<ShoppingCart> shoppingCartList) {
		this.shoppingCartList = shoppingCartList;
	}

	public List<CFCourse> getCfCourseList() {
		return cfCourseList;
	}

	public void setCfCourseList(List<CFCourse> cfCourseList) {
		this.cfCourseList = cfCourseList;
	}

	public List<FavoriteCourse> getFavoriteCourseList() {
		return favoriteCourseList;
	}

	public void setFavoriteCourseList(List<FavoriteCourse> favoriteCourseList) {
		this.favoriteCourseList = favoriteCourseList;
	}

	public List<CourseRank> getCourseRankList() {
		return courseRankList;
	}

	public void setCourseRankList(List<CourseRank> courseRankList) {
		this.courseRankList = courseRankList;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public Long getCourseStatus() {
		return courseStatus;
	}

	public void setCourseStatus(Long courseStatus) {
		this.courseStatus = courseStatus;
	}


	
}
