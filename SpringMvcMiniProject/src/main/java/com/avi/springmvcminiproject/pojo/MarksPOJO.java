package com.avi.springmvcminiproject.pojo;

import lombok.Data;
import javax.validation.constraints.Pattern;

@Data
public class MarksPOJO {

    private int id;

    @Pattern(regexp = "[0-9]{1,2}",message = "enter valid marks")
    private String maths;

    @Pattern(regexp = "[0-9]{1,2}",message = "enter valid marks")
    private String science;

}
