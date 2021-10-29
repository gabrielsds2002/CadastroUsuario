package com.brq.cadastroCliente.dtos;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EmailDto implements Serializable {
    private String uuid;
    private String de;
    private String para;
    private String assunto;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<String> emails;
    private String corpo;
    
	
}
