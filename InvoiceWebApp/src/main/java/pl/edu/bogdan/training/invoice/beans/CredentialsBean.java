package pl.edu.bogdan.training.invoice.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import pl.edu.bogdan.training.invoice.service.LoginService;
import pl.edu.bogdan.training.invoice.utils.Hashing;

@ManagedBean(name="credential")
@SessionScoped
public class CredentialsBean {
	private String username;
	private String password;
	
	@ManagedProperty(value="#{loginService}")
	private LoginService loginService;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LoginService getLoginService() {
		return loginService;
	}
	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}
	public String login() {
		password = Hashing.hash(password);
		if (loginService.isCredentialOk(this)) {
			return "after_login";
		} else {
			return "login";
		}
	}
}
