package org.motechproject.care.reporting.domain.measure;

// Generated Jun 4, 2013 4:50:32 PM by Hibernate Tools 3.4.0.CR1

import org.hibernate.annotations.*;
import org.motechproject.care.reporting.domain.dimension.Flw;
import org.motechproject.care.reporting.domain.dimension.FlwGroup;
import org.motechproject.care.reporting.domain.dimension.MotherCase;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * NewForm generated by hbm2java
 */
@Entity
@Table(name = "new_form", uniqueConstraints = @UniqueConstraint(columnNames = "instance_id"))
public class NewForm implements java.io.Serializable {

	private int id;
	private Flw flw;
	private FlwGroup flwGroup;
	private MotherCase motherCase;
	private String instanceId;
	private Date timeEnd;
	private Date timeStart;
	private Date dateModified;
	private Short ageCalc;
	private String caseName;
	private String caseType;
	private String ownerId;
	private Date dateLastVisit;
	private Date dateNextReg;
	private Integer familyNumber;
	private Integer hhNumber;
	private String husbandName;
	private String lastVisitType;
	private Boolean motherAlive;
	private Date motherDob;
	private String motherName;
	private String caste;
	private Date dob;
	private Boolean dobKnown;
	private String fullName;

	public NewForm() {
	}

	public NewForm(int id) {
		this.id = id;
	}

	public NewForm(int id, Flw flw, FlwGroup flwGroup, MotherCase motherCase,
			String instanceId, Date timeEnd, Date timeStart, Date dateModified,
			Short ageCalc, String caseName, String caseType, String ownerId,
			Date dateLastVisit, Date dateNextReg, Integer familyNumber,
			Integer hhNumber, String husbandName, String lastVisitType,
			Boolean motherAlive, Date motherDob, String motherName,
			String caste, Date dob, Boolean dobKnown, String fullName) {
		this.id = id;
		this.flw = flw;
		this.flwGroup = flwGroup;
		this.motherCase = motherCase;
		this.instanceId = instanceId;
		this.timeEnd = timeEnd;
		this.timeStart = timeStart;
		this.dateModified = dateModified;
		this.ageCalc = ageCalc;
		this.caseName = caseName;
		this.caseType = caseType;
		this.ownerId = ownerId;
		this.dateLastVisit = dateLastVisit;
		this.dateNextReg = dateNextReg;
		this.familyNumber = familyNumber;
		this.hhNumber = hhNumber;
		this.husbandName = husbandName;
		this.lastVisitType = lastVisitType;
		this.motherAlive = motherAlive;
		this.motherDob = motherDob;
		this.motherName = motherName;
		this.caste = caste;
		this.dob = dob;
		this.dobKnown = dobKnown;
		this.fullName = fullName;
	}

	@Id
	@Column(name = "id", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
    @Cascade(value = org.hibernate.annotations.CascadeType.ALL)
	public Flw getFlw() {
		return this.flw;
	}

	public void setFlw(Flw flw) {
		this.flw = flw;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "manual_group")
	public FlwGroup getFlwGroup() {
		return this.flwGroup;
	}

	public void setFlwGroup(FlwGroup flwGroup) {
		this.flwGroup = flwGroup;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "case_id")
    @Cascade(value = org.hibernate.annotations.CascadeType.ALL)
	public MotherCase getMotherCase() {
		return this.motherCase;
	}

	public void setMotherCase(MotherCase motherCase) {
		this.motherCase = motherCase;
	}

	@Column(name = "instance_id", unique = true, length = 36)
	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "time_end", length = 35)
	public Date getTimeEnd() {
		return this.timeEnd;
	}

	public void setTimeEnd(Date timeEnd) {
		this.timeEnd = timeEnd;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "time_start", length = 35)
	public Date getTimeStart() {
		return this.timeStart;
	}

	public void setTimeStart(Date timeStart) {
		this.timeStart = timeStart;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_modified", length = 35)
	public Date getDateModified() {
		return this.dateModified;
	}

	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;
	}

	@Column(name = "age_calc")
	public Short getAgeCalc() {
		return this.ageCalc;
	}

	public void setAgeCalc(Short ageCalc) {
		this.ageCalc = ageCalc;
	}

	@Column(name = "case_name")
	public String getCaseName() {
		return this.caseName;
	}

	public void setCaseName(String caseName) {
		this.caseName = caseName;
	}

	@Column(name = "case_type")
	public String getCaseType() {
		return this.caseType;
	}

	public void setCaseType(String caseType) {
		this.caseType = caseType;
	}

	@Column(name = "owner_id", length = 36)
	public String getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "date_last_visit", length = 13)
	public Date getDateLastVisit() {
		return this.dateLastVisit;
	}

	public void setDateLastVisit(Date dateLastVisit) {
		this.dateLastVisit = dateLastVisit;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "date_next_reg", length = 13)
	public Date getDateNextReg() {
		return this.dateNextReg;
	}

	public void setDateNextReg(Date dateNextReg) {
		this.dateNextReg = dateNextReg;
	}

	@Column(name = "family_number")
	public Integer getFamilyNumber() {
		return this.familyNumber;
	}

	public void setFamilyNumber(Integer familyNumber) {
		this.familyNumber = familyNumber;
	}

	@Column(name = "hh_number")
	public Integer getHhNumber() {
		return this.hhNumber;
	}

	public void setHhNumber(Integer hhNumber) {
		this.hhNumber = hhNumber;
	}

	@Column(name = "husband_name")
	public String getHusbandName() {
		return this.husbandName;
	}

	public void setHusbandName(String husbandName) {
		this.husbandName = husbandName;
	}

	@Column(name = "last_visit_type", length = 20)
	public String getLastVisitType() {
		return this.lastVisitType;
	}

	public void setLastVisitType(String lastVisitType) {
		this.lastVisitType = lastVisitType;
	}

	@Column(name = "mother_alive")
	public Boolean getMotherAlive() {
		return this.motherAlive;
	}

	public void setMotherAlive(Boolean motherAlive) {
		this.motherAlive = motherAlive;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "mother_dob", length = 13)
	public Date getMotherDob() {
		return this.motherDob;
	}

	public void setMotherDob(Date motherDob) {
		this.motherDob = motherDob;
	}

	@Column(name = "mother_name")
	public String getMotherName() {
		return this.motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	@Column(name = "caste")
	public String getCaste() {
		return this.caste;
	}

	public void setCaste(String caste) {
		this.caste = caste;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "dob", length = 13)
	public Date getDob() {
		return this.dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Column(name = "dob_known")
	public Boolean getDobKnown() {
		return this.dobKnown;
	}

	public void setDobKnown(Boolean dobKnown) {
		this.dobKnown = dobKnown;
	}

	@Column(name = "full_name")
	public String getFullName() {
		return this.fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

}
