package c1;


class Animal2 {
    //Defining a second public class will result in compilation failure
}

public class Animal {

    String name;
    Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public int numbervisitors (int month) {

        // single line comment

        /*
         * - Multiple Line Comment
         */

        /**
         * Javadoc multiple-line comment
         * @author Ramai Alexandria
         */
        return 10;
    }
}
