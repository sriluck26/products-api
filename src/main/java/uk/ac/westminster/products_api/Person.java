package uk.ac.westminster.products_api;

/**
 * Week 1 starter class.
 *
 * Already provided:
 *   - a private "name" field
 *   - a no-argument constructor (required by Jackson later in the module)
 *   - a full constructor
 *   - a getter and setter for "name"
 *

 */
public class Person {

    private String name;
    private String email;


    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getEmail() {return email;}
    public String getName() {return name;}

    public void setEmail(String email) {this.email = email;}
    public void setName(String name) {
        this.name = name;
    }


}
