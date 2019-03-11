
package com.hubberspot.bean;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;


@Named(value = "userBean")
@SessionScoped
public class UserBean implements Serializable {

    public UserBean() {
    }
    
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String display() {
        
        return "display";
    }
    
}
