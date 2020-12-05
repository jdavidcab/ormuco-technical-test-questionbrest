package com.ormuco.technicaltest.questionbrest.services;

/**
 * CollinearService interface.
 * <p>
 * This interface define methods to CompareServiceImpl.
 * </p>
 * 
 * @author Johann David Cabrera Mora
 * @since 1.0
 */
public interface ICompareService {
    
    /**
     * Compare two {@code String}.
     * 
     * <p>
     * This method compares two version string as input and returns 
     * whether one is greater than, equal, or less than the other.
     * </p>
     * 
     * <p>
     * This method uses {@code Locale.getDefault()} from Java Virtual Machine
     * to specific geographic, cultural, or political region.
     * </p>
     * 
     * @param strNum1 First {@code String} to evaluate.
     * @param strNum2 Second {@code String} to evaluate.
     * @return the value 0 if strNum1 == strNum2; a value -1 if strNum1 < strNum2; 
     * and a value 1 if strNum1 > strNum2;
     * 
     */
    Integer compareTwoString( final String strNum1, final String strNum2 );

    /**
     * Compare two {@code String}.
     * 
     * <p>
     * This method compares two version string as input and returns 
     * whether one is greater than, equal, or less than the other.
     * </p>
     * 
     * @param strNum1 First {@code String} to evaluate.
     * @param strNum2 Second {@code String} to evaluate.
     * @param language An ISO 639 alpha-2 or alpha-3 language code, or a language subtag 
     * up to 8 characters in length.  See the <code>Locale</code> class description about 
     * valid language values.
     * @param country An ISO 3166 alpha-2 country code or a UN M.49 numeric-3 area code. 
     * See the <code>Locale</code> class description about valid country values.
     * @return the value 0 if strNum1 == strNum2; a value -1 if strNum1 < strNum2; 
     * and a value 1 if strNum1 > strNum2;
     * 
     */
    Integer compareTwoString( final String strNum1, final String strNum2, final String language, final String country );

}
