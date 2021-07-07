package project.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="verification_codes")
public class VerificationCode {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY) 
	@Column(name="id")
	private int id;
	
	@Column(name="user_id")
	private int userId;
	
	@Column(name="verification_code")
	private String verificationCode;  // TODO emailVerificationCode diye değiştir.
	
	@Column(name="created_date",columnDefinition = "Date defult CURRENT_DATE")
	private LocalDate createdDate=LocalDate.now();
	
	@Column(name="expired_date")  // ?
	private LocalDate expiredDate;
	
	@Column(name="is_activate",columnDefinition = "boolean default false") 
	private Boolean isActivate;
	
	@Column(name="is_deleted",columnDefinition = "boolean default false")
	private Boolean isDeleted=false;
	
	@Column(name="confirmed_date")  //  ?
	private LocalDate confirmedDate;

	public VerificationCode(int userId, String verificationCode, LocalDate expiredDate) {
		super();
		this.userId = userId;
		this.verificationCode = verificationCode;
		this.expiredDate = expiredDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getVerificationCode() {
		return verificationCode;
	}

	public void setVerificationCode(String verificationCode) {
		this.verificationCode = verificationCode;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDate getExpiredDate() {
		return expiredDate;
	}

	public void setExpiredDate(LocalDate expiredDate) {
		this.expiredDate = expiredDate;
	}

	public Boolean getIsActivate() {
		return isActivate;
	}

	public void setIsActivate(Boolean isActivate) {
		this.isActivate = isActivate;
	}

	public Boolean getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public LocalDate getConfirmedDate() {
		return confirmedDate;
	}

	public void setConfirmedDate(LocalDate confirmedDate) {
		this.confirmedDate = confirmedDate;
	}
	
	
}
