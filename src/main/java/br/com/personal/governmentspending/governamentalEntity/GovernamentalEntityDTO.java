package br.com.personal.governmentspending.governamentalEntity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class GovernamentalEntityDTO {

    @JsonProperty("codigo")
    private String code;

    @JsonProperty("descricao")
    private String description;

    @JsonProperty("codigoDescricaoFormatado")
    private String descriptionFormatted;
    
}
