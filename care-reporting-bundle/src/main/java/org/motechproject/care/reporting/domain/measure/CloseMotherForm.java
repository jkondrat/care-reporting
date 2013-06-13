package org.motechproject.care.reporting.domain.measure;

// Generated Jun 4, 2013 4:50:32 PM by Hibernate Tools 3.4.0.CR1

import org.hibernate.annotations.Cascade;
import org.motechproject.care.reporting.domain.dimension.Flw;
import org.motechproject.care.reporting.domain.dimension.MotherCase;
import org.motechproject.care.reporting.utils.FormToString;

import javax.persistence.*;
import java.util.Date;

/**
 * CloseMotherForm generated by hbm2java
 */
@Entity
@Table(name = "close_mother_form", uniqueConstraints = @UniqueConstraint(columnNames = "instance_id"))
public class CloseMotherForm implements java.io.Serializable {

	private int id;
	private Flw flw;
	private MotherCase motherCase;
	private String instanceId;
	private Date timeEnd;
	private Date timeStart;
	private Date dateModified;
	private String close;
	private Integer children;
	private Boolean closeMother;
	private Boolean confirmClose;
	private Boolean deathVillage;
	private String diedVillage;
	private Boolean dupeReg;
	private Boolean finishedContinuum;
	private Short numChildren;
	private String motherAlive;
	private Boolean moved;
	private Boolean migrated;
	private Date dateLearned;
	private Date dateLeft;
	private Boolean migrationNote;
	private Boolean died;
	private Date dateDeath;
	private String siteDeath;

	public CloseMotherForm() {
	}

	public CloseMotherForm(int id) {
		this.id = id;
	}

	public CloseMotherForm(int id, Flw flw, MotherCase motherCase,
			String instanceId, Date timeEnd, Date timeStart, Date dateModified,
			String close, Integer children, Boolean closeMother,
			Boolean confirmClose, Boolean deathVillage, String diedVillage,
			Boolean dupeReg, Boolean finishedContinuum, Short numChildren,
			String motherAlive, Boolean moved, Boolean migrated,
			Date dateLearned, Date dateLeft, Boolean migrationNote,
			Boolean died, Date dateDeath, String siteDeath) {
		this.id = id;
		this.flw = flw;
		this.motherCase = motherCase;
		this.instanceId = instanceId;
		this.timeEnd = timeEnd;
		this.timeStart = timeStart;
		this.dateModified = dateModified;
		this.close = close;
		this.children = children;
		this.closeMother = closeMother;
		this.confirmClose = confirmClose;
		this.deathVillage = deathVillage;
		this.diedVillage = diedVillage;
		this.dupeReg = dupeReg;
		this.finishedContinuum = finishedContinuum;
		this.numChildren = numChildren;
		this.motherAlive = motherAlive;
		this.moved = moved;
		this.migrated = migrated;
		this.dateLearned = dateLearned;
		this.dateLeft = dateLeft;
		this.migrationNote = migrationNote;
		this.died = died;
		this.dateDeath = dateDeath;
		this.siteDeath = siteDeath;
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

	@Column(name = "close", length = 20)
	public String getClose() {
		return this.close;
	}

	public void setClose(String close) {
		this.close = close;
	}

	@Column(name = "children")
	public Integer getChildren() {
		return this.children;
	}

	public void setChildren(Integer children) {
		this.children = children;
	}

	@Column(name = "close_mother")
	public Boolean getCloseMother() {
		return this.closeMother;
	}

	public void setCloseMother(Boolean closeMother) {
		this.closeMother = closeMother;
	}

	@Column(name = "confirm_close")
	public Boolean getConfirmClose() {
		return this.confirmClose;
	}

	public void setConfirmClose(Boolean confirmClose) {
		this.confirmClose = confirmClose;
	}

	@Column(name = "death_village")
	public Boolean getDeathVillage() {
		return this.deathVillage;
	}

	public void setDeathVillage(Boolean deathVillage) {
		this.deathVillage = deathVillage;
	}

	@Column(name = "died_village")
	public String getDiedVillage() {
		return this.diedVillage;
	}

	public void setDiedVillage(String diedVillage) {
		this.diedVillage = diedVillage;
	}

	@Column(name = "dupe_reg")
	public Boolean getDupeReg() {
		return this.dupeReg;
	}

	public void setDupeReg(Boolean dupeReg) {
		this.dupeReg = dupeReg;
	}

	@Column(name = "finished_continuum")
	public Boolean getFinishedContinuum() {
		return this.finishedContinuum;
	}

	public void setFinishedContinuum(Boolean finishedContinuum) {
		this.finishedContinuum = finishedContinuum;
	}

	@Column(name = "num_children")
	public Short getNumChildren() {
		return this.numChildren;
	}

	public void setNumChildren(Short numChildren) {
		this.numChildren = numChildren;
	}

	@Column(name = "mother_alive", length = 20)
	public String getMotherAlive() {
		return this.motherAlive;
	}

	public void setMotherAlive(String motherAlive) {
		this.motherAlive = motherAlive;
	}

	@Column(name = "moved")
	public Boolean getMoved() {
		return this.moved;
	}

	public void setMoved(Boolean moved) {
		this.moved = moved;
	}

	@Column(name = "migrated")
	public Boolean getMigrated() {
		return this.migrated;
	}

	public void setMigrated(Boolean migrated) {
		this.migrated = migrated;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "date_learned", length = 13)
	public Date getDateLearned() {
		return this.dateLearned;
	}

	public void setDateLearned(Date dateLearned) {
		this.dateLearned = dateLearned;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "date_left", length = 13)
	public Date getDateLeft() {
		return this.dateLeft;
	}

	public void setDateLeft(Date dateLeft) {
		this.dateLeft = dateLeft;
	}

	@Column(name = "migration_note")
	public Boolean getMigrationNote() {
		return this.migrationNote;
	}

	public void setMigrationNote(Boolean migrationNote) {
		this.migrationNote = migrationNote;
	}

	@Column(name = "died")
	public Boolean getDied() {
		return this.died;
	}

	public void setDied(Boolean died) {
		this.died = died;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "date_death", length = 13)
	public Date getDateDeath() {
		return this.dateDeath;
	}

	public void setDateDeath(Date dateDeath) {
		this.dateDeath = dateDeath;
	}

	@Column(name = "site_death")
	public String getSiteDeath() {
		return this.siteDeath;
	}

	public void setSiteDeath(String siteDeath) {
		this.siteDeath = siteDeath;
	}

    @Override
    public String toString() {
        return FormToString.toString(this);
    }
}
