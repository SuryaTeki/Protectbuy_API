package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transactionID;

    @NotBlank(message = "Transaction DateTime is mandatory")
    private String transactionDateTime;

    @NotBlank(message = "Transaction Completion Time is mandatory")
    private String transactionCompletionTime;

    @NotBlank(message = "3DS Protocol is mandatory")
    private String protocol3DS;

    @NotBlank(message = "Requester ID is mandatory")
    private String requesterID;

    @NotBlank(message = "Requester Name is mandatory")
    private String requesterName;

    @NotBlank(message = "Merchant ID is mandatory")
    private String merchantId;

    @NotBlank(message = "Issuer is mandatory")
    private String issuer;

    @NotNull(message = "Issuer BIN is mandatory")
    private Long issuerBIN;

    @NotBlank(message = "Acquirer Name is mandatory")
    private String acquirerName;

    @NotNull(message = "Acquirer BIN is mandatory")
    private Long acquirerBIN;
}
