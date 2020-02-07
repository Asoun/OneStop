package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Model containing user info
 */
@ApiModel(description = "Model containing user info")
@Validated
@Entity
@Table(name="User_Details")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-21T11:51:13.410Z[GMT]")
public class User   {
  @JsonProperty("UserName")
  @Id
  private String userName = "";

  @JsonProperty("Password")
  private String password = null;

  @JsonProperty("Email")
  private String email = null;

  @JsonProperty("Address")
  private String address = null;

  @JsonProperty("ContactNumber")
  private Long contactNumber = 0L;

  @JsonProperty("Type")
  private String type = null;

  @JsonProperty("Balance")
  private Double balance = 0.0d;

  public User userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * Get userName
   * @return userName
  **/
  @ApiModelProperty(example = "Ahana", value = "")
  
    public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public User password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
  **/
  @ApiModelProperty(example = "ahana123", value = "")
  
    public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public User email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(example = "ahana@gmail.com", value = "")
  
    public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public User address(String address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(example = "Delhi", value = "")
  
    public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public User contactNumber(Long contactNumber) {
    this.contactNumber = contactNumber;
    return this;
  }

  /**
   * Get contactNumber
   * @return contactNumber
  **/
  @ApiModelProperty(example = "8787879090", value = "")
  
    public Long getContactNumber() {
    return contactNumber;
  }

  public void setContactNumber(Long contactNumber) {
    this.contactNumber = contactNumber;
  }

  public User type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "Admin", value = "")
  
    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public User balance(Double balance) {
    this.balance = balance;
    return this;
  }

  /**
   * Get balance
   * @return balance
  **/
  @ApiModelProperty(example = "23456", value = "")
  
    public Double getBalance() {
    return balance;
  }

  public void setBalance(Double balance) {
    this.balance = balance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.userName, user.userName) &&
        Objects.equals(this.password, user.password) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.address, user.address) &&
        Objects.equals(this.contactNumber, user.contactNumber) &&
        Objects.equals(this.type, user.type) &&
        Objects.equals(this.balance, user.balance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userName, password, email, address, contactNumber, type, balance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    contactNumber: ").append(toIndentedString(contactNumber)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
