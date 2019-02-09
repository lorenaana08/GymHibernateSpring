package org.sda.gymhibernatespring.dao.entity;

import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "schedule")
public class ScheduleEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="class_id")
	private ClassEntity classEntity;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="trainer_id")
	private TrainerEntity trainerEntity;
	@Column(name = "date_time")
	private Date createdAt;
	private Date availability;
	@Column(name = "subscribe_start_time")
	private Date subscriptionStartTime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ClassEntity getClassEntity() {
		return classEntity;
	}

	public void setClassEntity(ClassEntity classEntity) {
		this.classEntity = classEntity;
	}

	public TrainerEntity getTrainerEntity() {
		return trainerEntity;
	}

	public void setTrainerEntity(TrainerEntity trainerEntity) {
		this.trainerEntity = trainerEntity;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getAvailability() {
		return availability;
	}

	public void setAvailability(Date availability) {
		this.availability = availability;
	}

	public Date getSubscriptionStartTime() {
		return subscriptionStartTime;
	}

	public void setSubscriptionStartTime(Date subscriptionTime) {
		this.subscriptionStartTime = subscriptionTime;
	}

}
