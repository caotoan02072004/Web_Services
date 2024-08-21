package api.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Computer")
public class Computer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ComId")
	private Integer comId;
	@Column(name="ComName")
	private String comName;
	@Column(name="Producer")
	private String producer;
	@Column(name="Status")
	private Boolean status;
	@Column(name="YearMaking")
	private Date yearMaking;
	@Column(name="ExpireDate")
	private Date expireDate;
	@Column(name="Price")
	private Float price;
	
	public Computer() {
		// TODO Auto-generated constructor stub
	}

	public Computer(String comName, String producer, Boolean status, Date yearMaking, Date expireDate,
			Float price) {
		super();
		this.comName = comName;
		this.producer = producer;
		this.status = status;
		this.yearMaking = yearMaking;
		this.expireDate = expireDate;
		this.price = price;
	}

	public Integer getComId() {
		return comId;
	}

	public void setComId(Integer comId) {
		this.comId = comId;
	}

	public String getComName() {
		return comName;
	}

	public void setComName(String comName) {
		this.comName = comName;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Date getYearMaking() {
		return yearMaking;
	}

	public void setYearMaking(Date yearMaking) {
		this.yearMaking = yearMaking;
	}

	public Date getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}
}
