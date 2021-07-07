package project.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name="employers")
@PrimaryKeyJoinColumn(name="user_id",referencedColumnName = "id")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdvertisements"})
@EqualsAndHashCode(callSuper=false) 
public class Employer extends User {
    
	
	@Column(name="web_site")
	private String webSite;
	
	@Column(name="phone_number")
	private String phoneNumber;
	
    @Column(name="company_name")
    private String companyName;
    
	
    @Column(name="is_email_verified")
	private Boolean isEmailVerified;
    
    @Column(name="is_verified_by_emlopyee")
	private Boolean isVerifiedByEmlopyee;
    

    // relational properties
    
     @OneToMany(mappedBy="employer")
     private List<JobAdvertisement> jobAdvertisements;


	public String getWebSite() {
		return webSite;
	}


	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getCompanyName() {
		return companyName;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	public Boolean getIsEmailVerified() {
		return isEmailVerified;
	}


	public void setIsEmailVerified(Boolean isEmailVerified) {
		this.isEmailVerified = isEmailVerified;
	}


	public Boolean getIsVerifiedByEmlopyee() {
		return isVerifiedByEmlopyee;
	}


	public void setIsVerifiedByEmlopyee(Boolean isVerifiedByEmlopyee) {
		this.isVerifiedByEmlopyee = isVerifiedByEmlopyee;
	}


	public List<JobAdvertisement> getJobAdvertisements() {
		return jobAdvertisements;
	}


	public void setJobAdvertisements(List<JobAdvertisement> jobAdvertisements) {
		this.jobAdvertisements = jobAdvertisements;
	}
     
     
}


// primitive tipler null olmayacağı için, class haline getiriyorum. 