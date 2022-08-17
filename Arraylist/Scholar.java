public class Scholar {
    private int id;
    private String name;
    private int age;
    private String hocluc;
    
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setHocluc(String hocluc) {
        this.hocluc = hocluc;
    }

    public Scholar(int id, String name, int age, String hocluc) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.hocluc = hocluc;
    }
    @Override
    public String toString() {
        return "Scholar [age=" + age + ", hocluc=" + hocluc + ", id=" + id + ", name=" + name + "]";
    }

    
    
}
