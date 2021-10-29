package com.brq.cadastroCliente.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.validation.constraints.NotBlank;

@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_usuarios")
public class Usuario  {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "usuario_id")
    private Long id;

    @Column(name = "nome")
    @NotBlank(message = "Nome deve ser preenchido")
    private String nome;
    
    @Column(name = "sobrenome")
    @NotBlank(message = "Sobrenome deve ser preenchido")
    private String sobrenome ;
    
    @Column(name = "idade")
    @NotBlank(message = "Idade deve ser preenchido")
    private String idade ;
    
    @Column(name = "sexo")
    @NotBlank(message = "Sexo deve ser preenchido")
    private String sexo ;
    
    @Column(name = "endereco")
    @NotBlank(message = "Endereco deve ser preenchido")
    private String endereco ;
    
    @Column(name = "bairro")
    @NotBlank(message = "Bairro deve ser preenchido")
    private String bairro ;
    
    @Column(name = "cidade")
    @NotBlank(message = "Cidade deve ser preenchido")
    private String cidade ;
    
    @Column(name = "estado")
    @NotBlank(message = "Estado deve ser preenchido")
    private String estado ;

    @Column(name = "email")
    @NotBlank(message = "Email deve ser preenchido")
    private String email;

    @Column(name = "senha")
    @NotBlank(message = "Senha deve ser preenchida")
    private String senha;
 
    @Column(name = "uuid")
    @NotBlank(message = "UUID deve ser preenchido")
    private String uuid;

}

