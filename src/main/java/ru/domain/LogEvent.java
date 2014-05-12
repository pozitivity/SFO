package ru.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "logevents")
public class LogEvent implements Serializable {

	private static final long serialVersionUID = 1L;

	public enum Severity {
		DEBUG("DEBUG"), INFO("INFO"), WARN("WARN"), ERROR("ERROR");
		
		private String name;
		
		Severity(String name) {
			this.name = name;
		}
		
		public String getName() {
			return name;
		}
	};

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long logEventId;

	@Basic(optional = false)
	@Column(name = "category", nullable = false)
	private String category;
	
	@Column(name = "action_name")
	private String action;
	
	@Basic(optional = false)
	@Column(name = "severity", nullable = false)
	private Severity severity = Severity.INFO;
	
	@Basic(optional = false)
	@Column(name = "when_date", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date when = new Date();
	
	@Column(name = "message")
	private String message;
	
	@Column(name = "extra")
	private String extra;
	
	public LogEvent() {
	}

	public LogEvent(Severity severity, String category, String action,
			String message, String extra) {
		this.category = category;
		this.action = action;
		this.severity = severity;
		this.message = message;
		this.extra = extra;
	}
	
	public Long getLogEventId() {
		return logEventId;
	}

	public void setLogEventId(Long logEventId) {
		this.logEventId = logEventId;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public Severity getSeverity() {
		return severity;
	}

	public void setSeverity(Severity severity) {
		this.severity = severity;
	}

	public Date getWhen() {
		return when;
	}

	public void setWhen(Date when) {
		this.when = when;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getExtra() {
		return extra;
	}

	public void setExtra(String extra) {
		this.extra = extra;
	}
}
