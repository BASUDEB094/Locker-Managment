package lock.locker.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="locker")
public class Locker {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long lockerid;
	@Column(name="lockername")
	private String locker_Name;

}
