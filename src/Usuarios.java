public class Usuarios {
    private String name;
    private String id;
    private String email;

    // constructor
    public Usuarios(String name, String id, String email){
        this.name = name;
        this.id = id;
        this.email = email;
    }
    //getter

    public String getName(){
        return this.name;
    }
    public String getId(){
        return this.id;
    }
    public String getEmail(){
        return this.email;
    }

    // setter
    public void setName(String newName){
        this.name = newName;
    }
    public void setId(String newId){
        this.id = newId;
    }
    public void setEmail(String newEmail){
        this.email = newEmail;
    }





}
