package nbs.imersaoJPAData.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;
@Component//Adicionado para poder fazer a injeção de dependencias
@Entity//Entidade de indemtificação
public class User {
    @Id//Chave primária//Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Gerenciado de forma automática dentro do banco que será inserio em ordem
    @Column(name= "user_id")//Dizer que o id se chamara user_id
    private Integer id;

    @Column(length = 50, nullable = false)//Dizer o tamanho da string e se pode ser nulo ou não na coluna
    private String name;

    @Column(length = 20, nullable = false)
    private String username;

    @Column(length = 50, nullable = false)
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
