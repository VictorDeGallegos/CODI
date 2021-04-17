
public class Persona {
private String name;
private int age;

public Persona(String name,int age){
        this.name = name;
        this.age = age;



}

/**
 * Returns value of name
 * @return
 */
public String getName() {
        return name;
}

/**
 * Sets new value of name
 * @param
 */
public void setName(String name) {
        this.name = name;
}

/**
 * Returns value of age
 * @return
 */
public int getAge() {
        return age;
}

/**
 * Sets new value of age
 * @param
 */
public void setAge(int age) {
        this.age = age;

}



/**
 * Create string representation of Persona for printing
 * @return
 */
@Override
public String toString() {
        return "Persona [ name=" + name + ", age=" + age +" ]";
}
}
