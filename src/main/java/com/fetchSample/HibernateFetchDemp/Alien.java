package com.fetchSample.HibernateFetchDemp;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.mysql.cj.x.protobuf.MysqlxCursor.Fetch;

@Entity // (name ="alien_table") in case you wanna create a table with different name from your class name. This happens to be the entity name.
//@Table(name="alien_table") - change only table name and not the entity name 
public class Alien {

	@Id
	private int aid;
	private String aname;

	@OneToMany(mappedBy="alien",fetch = FetchType.EAGER)
	private List<Laptop> laps = new ArrayList<Laptop>();

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public List<Laptop> getLaps() {
		return laps;
	}

	public void setLaps(List<Laptop> laps) {
		this.laps = laps;
	}

	


}
