package backend.projeto_final.Enum;

public enum UsuarioEnum {
    ADMIN("admin"),
    USER("user");

    private String role;

    UsuarioEnum (String role){
        this.role = role;
    }

    public String getRole(){
        return role;
    }
}
