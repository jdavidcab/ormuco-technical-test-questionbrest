package com.ormuco.technicaltest.questionbrest.dto;

import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Request object fields.
 * 
 * <p>
 * Request object contain all fields to evaluate if two version string as input and returns 
 * whether one is greater than, equal, or less than the other.
 * 
 * <ul>
 *      <li><b>strNum1</b>: First {@code String} to evaluate. This field is required.</li>
 *      <li><b>strNum2</b>: Second {@code String} to evaluate. This field is required.</li>
 *      <li><b>locale</b>: Locale object represents a specific geographic, cultural, or political region. 
 *       This field is not required.</li>
 * </ul>
 * </p>
 * 
 * @author Johann David Cabrera Mora
 * @since 1.0
 */
@ToString
public class CompareTwoStringRequest {
    
    @Getter
    @Setter
    @NotNull( message = "The field strNum1 can't be null" )
    private String strNum1;

    @Getter
    @Setter
    @NotNull( message = "The field strNum2 can't be null" )
    private String strNum2;

    @Getter
    @Setter
    private LocaleRequest locale;

}
