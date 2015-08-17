package com.Aakash.pojos;

// Generated Aug 17, 2015 2:47:43 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Testexam generated by hbm2java
 */
@Entity
@Table(name = "testexam", catalog = "crossover")
public class Testexam implements java.io.Serializable {

	private Integer id;
	private String name;
	private String description;
	private Integer passScore;
	private Integer totalScore;
	private Integer examDuration;

	public Testexam() {
	}

	public Testexam(String name, String description, Integer passScore,
			Integer totalScore, Integer examDuration) {
		this.name = name;
		this.description = description;
		this.passScore = passScore;
		this.totalScore = totalScore;
		this.examDuration = examDuration;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "name", length = 45)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "description", length = 65535)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "pass_score")
	public Integer getPassScore() {
		return this.passScore;
	}

	public void setPassScore(Integer passScore) {
		this.passScore = passScore;
	}

	@Column(name = "total_score")
	public Integer getTotalScore() {
		return this.totalScore;
	}

	public void setTotalScore(Integer totalScore) {
		this.totalScore = totalScore;
	}

	@Column(name = "exam_duration")
	public Integer getExamDuration() {
		return this.examDuration;
	}

	public void setExamDuration(Integer examDuration) {
		this.examDuration = examDuration;
	}

}
