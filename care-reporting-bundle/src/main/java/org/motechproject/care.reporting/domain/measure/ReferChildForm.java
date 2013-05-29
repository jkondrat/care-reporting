package org.motechproject.care.reporting.domain.measure;

// Generated May 16, 2013 2:49:27 PM by Hibernate Tools 3.4.0.CR1

import org.motechproject.care.reporting.domain.dimension.ChildCase;
import org.motechproject.care.reporting.domain.dimension.Flw;

import javax.persistence.*;
import java.util.Date;

/**
 * ReferChildForm generated by hbm2java
 */
@Entity
@Table(name = "refer_child_form", uniqueConstraints = @UniqueConstraint(columnNames = "form_id"))
public class ReferChildForm implements java.io.Serializable {

	private int id;
	private ChildCase childCase;
	private Flw flw;
	private String formId;
	private Date timeend;
	private Date timestart;
	private Date dateModified;
	private Boolean referChild;

	public ReferChildForm() {
	}

	public ReferChildForm(int id) {
		this.id = id;
	}

	public ReferChildForm(int id, ChildCase childCase, Flw flw, String formId,
			Date timeend, Date timestart, Date dateModified, Boolean referChild) {
		this.id = id;
		this.childCase = childCase;
		this.flw = flw;
		this.formId = formId;
		this.timeend = timeend;
		this.timestart = timestart;
		this.dateModified = dateModified;
		this.referChild = referChild;
	}

	@Id
	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "case_id")
	public ChildCase getChildCase() {
		return this.childCase;
	}

	public void setChildCase(ChildCase childCase) {
		this.childCase = childCase;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userid")
	public Flw getFlw() {
		return this.flw;
	}

	public void setFlw(Flw flw) {
		this.flw = flw;
	}

	@Column(name = "form_id", unique = true, length = 36)
	public String getFormId() {
		return this.formId;
	}

	public void setFormId(String formId) {
		this.formId = formId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "timeend", length = 35)
	public Date getTimeend() {
		return this.timeend;
	}

	public void setTimeend(Date timeend) {
		this.timeend = timeend;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "timestart", length = 35)
	public Date getTimestart() {
		return this.timestart;
	}

	public void setTimestart(Date timestart) {
		this.timestart = timestart;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_modified", length = 35)
	public Date getDateModified() {
		return this.dateModified;
	}

	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;
	}

	@Column(name = "refer_child")
	public Boolean getReferChild() {
		return this.referChild;
	}

	public void setReferChild(Boolean referChild) {
		this.referChild = referChild;
	}

}