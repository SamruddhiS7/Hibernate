package mobile;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Battery {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int mah;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMah() {
		return mah;
	}
	public void setMah(int mah) {
		this.mah = mah;
	}
	
}
