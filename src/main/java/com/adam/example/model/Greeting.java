package com.adam.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Greeting {

    @JsonProperty
    private String hello;
}
