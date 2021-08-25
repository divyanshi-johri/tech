package com.TraineesTracker.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "TRAINEESDATA")
@Table(name = "TRAINEESDATA")
public class TraineesDetails {

	@Id
	@Column(name = "ID", nullable = false, unique = true)
	private long id;

	@Column(name = "TRAINEE_ID", nullable = false, unique = true)
	private String traineeId;
	@Column(name = "TRAINEE_NAME", nullable = false)
	private String traineeName;
	@Column(name = "EMAIL", nullable = false, unique = true)
	private String email;
	@Column(name = "PASSWORD", nullable = false)
	private String password;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTraineeId() {
		return traineeId;
	}

	public void setTraineeId(String traineeId) {
		this.traineeId = traineeId;
	}

	public String getTraineeName() {
		return traineeName;
	}

	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "TraineesDetails [id=" + id + ", traineeId=" + traineeId + ", traineeName=" + traineeName + ", email="
				+ email + ", password=" + password + "]";
	}

}
