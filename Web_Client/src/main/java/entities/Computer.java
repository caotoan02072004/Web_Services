package entities;

import java.util.Date;

public class Computer {
	private Integer comId;
	private String comName;
	private String producer;
	private Boolean status;
	private Date yearMaking;
	private Date expireDate;
	private Float price;
	
	public Computer() {
		// TODO Auto-generated constructor stub
	}

	public Computer(Integer comId, String comName, String producer, Boolean status, Date yearMaking, Date expireDate,
			Float price) {
		super();
		this.comId = comId;
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
