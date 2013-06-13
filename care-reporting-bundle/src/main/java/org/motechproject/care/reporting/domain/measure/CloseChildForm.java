package org.motechproject.care.reporting.domain.measure;

// Generated Jun 4, 2013 4:50:32 PM by Hibernate Tools 3.4.0.CR1

import org.hibernate.annotations.Cascade;
import org.motechproject.care.reporting.domain.dimension.ChildCase;
import org.motechproject.care.reporting.domain.dimension.Flw;
import org.motechproject.care.reporting.utils.FormToString;

import javax.persistence.*;
import java.util.Date;

/**
 * CloseChildForm generated by hbm2java
 */
@Entity
@Table(name = "close_child_form", uniqueConstraints = @UniqueConstraint(columnNames = {"instance_id","case_id"}))
public class CloseChildForm implements java.io.Serializable {

	private int id;
	private Flw flw;
	private ChildCase childCase;
	private String instanceId;
	private Date timeEnd;
	private Date timeStart;
	private Date dateModified;
	private String close;
	private Boolean childAlive;
	private Boolean closeChild;
	private Boolean confirmClose;
	private Date dateDeath;
	private Boolean died;
	private Boolean diedVillage;
	private Boolean dupeReg;
	private Boolean finishedContinuum;
	private String siteDeath;
	private String placeDeath;

	public CloseChildForm() {
	}

	public CloseChildForm(int id) {
		this.id = id;
	}

	public CloseChildForm(int id, Flw flw, ChildCase childCase,
			String instanceId, Date timeEnd, Date timeStart, Date dateModified,
			String close, Boolean childAlive, Boolean closeChild,
			Boolean confirmClose, Date dateDeath, Boolean died,
			Boolean diedVillage, Boolean dupeReg, Boolean finishedContinuum,
			String siteDeath, String placeDeath) {
		this.id = id;
		this.flw = flw;
		this.childCase = childCase;
		this.instanceId = instanceId;
		this.timeEnd = timeEnd;
		this.timeStart = timeStart;
		this.dateModified = dateModified;
		this.close = close;
		this.childAlive = childAlive;
		this.closeChild = closeChild;
		this.confirmClose = confirmClose;
		this.dateDeath = dateDeath;
		this.died = died;
		this.diedVillage = diedVillage;
		this.dupeReg = dupeReg;
		this.finishedContinuum = finishedContinuum;
		this.siteDeath = siteDeath;
		this.placeDeath = placeDeath;
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
	public ChildCase getChildCase() {
		return this.childCase;
	}

	public void setChildCase(ChildCase childCase) {
		this.childCase = childCase;
	}

	@Column(name = "instance_id", length = 36)
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

	@Column(name = "child_alive")
	public Boolean getChildAlive() {
		return this.childAlive;
	}

	public void setChildAlive(Boolean childAlive) {
		this.childAlive = childAlive;
	}

	@Column(name = "close_child")
	public Boolean getCloseChild() {
		return this.closeChild;
	}

	public void setCloseChild(Boolean closeChild) {
		this.closeChild = closeChild;
	}

	@Column(name = "confirm_close")
	public Boolean getConfirmClose() {
		return this.confirmClose;
	}

	public void setConfirmClose(Boolean confirmClose) {
		this.confirmClose = confirmClose;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "date_death", length = 13)
	public Date getDateDeath() {
		return this.dateDeath;
	}

	public void setDateDeath(Date dateDeath) {
		this.dateDeath = dateDeath;
	}

	@Column(name = "died")
	public Boolean getDied() {
		return this.died;
	}

	public void setDied(Boolean died) {
		this.died = died;
	}

	@Column(name = "died_village")
	public Boolean getDiedVillage() {
		return this.diedVillage;
	}

	public void setDiedVillage(Boolean diedVillage) {
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

	@Column(name = "site_death")
	public String getSiteDeath() {
		return this.siteDeath;
	}

	public void setSiteDeath(String siteDeath) {
		this.siteDeath = siteDeath;
	}

	@Column(name = "place_death")
	public String getPlaceDeath() {
		return this.placeDeath;
	}

	public void setPlaceDeath(String placeDeath) {
		this.placeDeath = placeDeath;
	}

    @Override
    public String toString() {
        return FormToString.toString(this);
    }
}
