package pl.edu.bogdan.training.prime.faces;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="message", eager=true)
public class MessageBean {
	private String message = "Generated by PrimeFaces";

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
