package com.avi.springmvcminiproject.pojo;

import com.avi.springmvcminiproject.entity.Assets;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.Set;

@Data
public class StudentPOJO {
    private int id;

    @NotBlank(message = "name is mandatory")
    @Pattern(regexp = "[a-zA-Z ]{1,20}",message = "enter valid name")
    private String fullName;

    @NotBlank
    @Pattern(regexp = "[0-9]{1,2}",message = "enter valid age")
    private String age;

    @NotBlank(message = "city is mandatory")
    @Pattern(regexp = "[a-zA-Z ]{1,20}",message = "enter valid city")
    private String city;

    @Pattern(regexp = "[0-9]{1,2}",message = "enter valid marks")
    private String maths;

    @Pattern(regexp = "[0-9]{1,2}",message = "enter valid marks")
    private String science;

    @Valid
    private Set<Assets> products;

}
