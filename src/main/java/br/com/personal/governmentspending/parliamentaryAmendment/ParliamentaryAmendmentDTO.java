package br.com.personal.governmentspending.parliamentaryAmendment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ParliamentaryAmendmentDTO {

    @JsonProperty("ano")
    private String age;

    @JsonProperty("autor")
    private String author;

    @JsonProperty("codigoAutor")
    private String authorCode;

    @JsonProperty("funcao")
    private String function;

    @JsonProperty("localidadeDoGasto")
    private String budgeLocale;

    @JsonProperty("subfuncao")
    private String subFunction;

    @JsonProperty("valorEmpenhado")
    private String commitedValue;

    @JsonProperty("valorLiquidado")
    private String settledAmount;

    @JsonProperty("valorPago")
    private String paidValue;

    @JsonProperty("valorRestoAPagar")
    private String restToPayValue;

    @JsonProperty("valorRestoCancelado")
    private String restToCancelValue;

    @JsonProperty("valorRestoInscrito")
    private String restSubscribeValue;

    @JsonProperty("valorRestoPago")
    private String restPaidValue;

}
