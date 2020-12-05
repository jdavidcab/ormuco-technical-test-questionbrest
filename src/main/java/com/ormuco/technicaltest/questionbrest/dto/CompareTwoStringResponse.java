package com.ormuco.technicaltest.questionbrest.dto;

import lombok.Getter;
import lombok.Setter;

import com.ormuco.technicaltest.questionblib.utilities.StringNumberUtils;

import lombok.AccessLevel;

/**
 * Response object fields.
 * 
 * <p>
 * Response object contain all fields to evaluate 2 version string as input and 
 * returns whether one is greater than, equal, or less than the other.
 * This class contain the following fields:
 * <ul>
 *      <li><b>compareInd</b>: the value 0 if strNum1 == strNum2; a value -1 if strNum1 < strNum2; 
 *          and a value 1 if strNum1 > strNum2;</li>
 *      <li><b>description</b>: {@code String} description of the result.</li>
 * </ul>
 * </p>
 * 
 * @author Johann David Cabrera Mora
 * @since 1.0
 */
public class CompareTwoStringResponse {
    
    /**
     * the value 0 if strNum1 == strNum2; a value -1 if strNum1 < strNum2; 
     * and a value 1 if strNum1 > strNum2;
     */
    @Getter
    @Setter( AccessLevel.PROTECTED )
    private Integer compareInd;

    /**
     * {@code String} description of the result.
     */
    @Getter
    @Setter( AccessLevel.PROTECTED )
    private String description;

    /**
     * Object contructor with compareInd result.
     * 
     * @param compareInd the value 0 if strNum1 == strNum2; a value -1 if strNum1 < strNum2; 
     * and a value 1 if strNum1 > strNum2;
     */
    public CompareTwoStringResponse( final Integer compareInd ) {
        this.compareInd = compareInd;
        this.description = getDefaultDescription();
    }

    /**
     * Object contructor with compareInd result and description.
     * 
     * @param compareInd the value 0 if strNum1 == strNum2; a value -1 if strNum1 < strNum2; 
     * and a value 1 if strNum1 > strNum2;
     * @param description {@code String} description of the result.
     */
    public CompareTwoStringResponse( final Integer compareInd, final String description ) {
        this.compareInd = compareInd;
        this.description = description;
    }

    /**
     * This method get default description.
     * @return {@code String} default description.
     */
    private String getDefaultDescription() {
        switch ( this.compareInd ) {
            case StringNumberUtils.IS_GREATER_THAN:
                return "strNum1 is greater than strNum2";
            case StringNumberUtils.IS_LESS_THAN:
                return "strNum1 is less than strNum2";
            default:
                return "strNum1 is equals than strNum2";
        }
    }

}
