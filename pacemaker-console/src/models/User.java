package models;
import static com.google.common.base.MoreObjects.toStringHelper;

import java.util.HashMap;
import java.util.Map;

import com.google.common.base.Objects;

public class User 
{
  static Long   counter = 0l;

  public Long   id;

private String firstName;
private String lastName;
private String email;
private String password;
public Map<Long, Activity> activities = new HashMap<Long, Activity>();


  public User(String firstName, String lastName, String email, String password)
  {
    this.id        = counter++;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.password = password;
  }

  
  @Override  
  public int hashCode()  
  {  
     return Objects.hashCode(this.lastName, this.firstName, this.email, this.password);  
  }  
  
  @Override
  public String toString()
  {
    return toStringHelper(this).addValue(firstName)
                               .addValue(lastName)
                               .addValue(password)
                               .addValue(email)                               
                               .toString();
  }
}
