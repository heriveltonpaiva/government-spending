package br.com.personal.governmentspending.governamentalEntity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class GovernamentalEntity {

    private String code;

    private String description;

    private String descriptionFormatted;

}
