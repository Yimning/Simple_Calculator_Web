package cn.test1 ;
import java.util.HashMap ;
import java.util.Map ;
public class Register {
	private String name ;
	private String age ;	// In this case, if the user enters the parameters himself, string is used
	private String email ;
	private Map<String,String> errors = null ;
	public Register(){
		this.name = "" ;
		this.age = "" ;
		this.email = "" ;
		this.errors = new HashMap<String,String>() ; //Store all error messages
	}
	public boolean isValidate(){
		boolean flag = true ;
		if(!this.name.matches("\\w{6,15}")){ //regular expression
			flag = false ;
			this.name = "" ;	// Clear the original name content
			this.errors.put("errname","The user name is 6-15 letters or numbers") ;
		}
		if(!this.email.matches("\\w+@\\w+\\.\\w+\\.?\\w*")){
			flag = false ;
			this.email = "" ;	// Clear the original email content
			this.errors.put("erremail","The email address entered is illegal") ;
		}
		if(!this.age.matches("\\d+")){
			flag = false ;
			this.age = "" ;	// Clear the original age content
			this.errors.put("errage","Age can only be a number") ;
		}
		return flag ;
	}
	public String getErrorMsg(String key){
		String value = this.errors.get(key) ;
		return value==null?"":value ;
	}
	public void setName(String name){
		this.name = name ;
	}
	public void setAge(String age){
		this.age = age ;
	}
	public void setEmail(String email){
		this.email = email ;
	}
	public String getName(){
		return this.name ;
	}
	public String getAge(){
		return this.age ;
	}
	public String getEmail(){
		return this.email ;
	}
}