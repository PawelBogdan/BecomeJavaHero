package pl.edu.bogdan.training.prime.faces.db.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name="autorzy", schema="public")
@Entity
public class AuthorEntity {
	@Id
	@Column(name="id_autor")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="imie")
	private String firstName;
	
	@Column(name="nazwisko")
	private String lastName;
	
	@OneToMany(targetEntity = BookEntity.class, mappedBy="author", fetch=FetchType.LAZY)
	private List<BookEntity> books;
	
	public AuthorEntity() {
		
	}
	public AuthorEntity(int id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public List<BookEntity> getBooks() {
		return books;
	}
	public void setBooks(List<BookEntity> books) {
		this.books = books;
	}
	@Override
	public String toString() {
		return "Author [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + id;
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AuthorEntity other = (AuthorEntity) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (id != other.id)
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}
	
}
