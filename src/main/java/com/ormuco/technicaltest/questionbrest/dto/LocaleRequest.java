package com.ormuco.technicaltest.questionbrest.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * Request object fields about {@code Locale}.
 * 
 * <p>
 * Request object contain all fields about Locale information.
 * </p>
 * 
 * <ul>
 *      <li><b>language</b>: An ISO 639 alpha-2 or alpha-3 language code, or a language subtag
 *      up to 8 characters in length.  See the <code>Locale</code> class description about 
 *      valid language values.</li>
 *      <li><b>country</b>: An ISO 3166 alpha-2 country code or a UN M.49 numeric-3 area code. 
 *      See the <code>Locale</code> class description about valid country values.</li>
 * </ul>
 * 
 * @author Johann David Cabrera Mora
 * @since 1.0
 */
public class LocaleRequest {
    
    /**
     * An ISO 639 alpha-2 or alpha-3 language code, or a language subtag 
     * up to 8 characters in length.  See the <code>Locale</code> class description about 
     * valid language values.
     */
    @Getter
    @Setter
    private String language;

    /**
     * An ISO 3166 alpha-2 country code or a UN M.49 numeric-3 area code. 
     * See the <code>Locale</code> class description about valid country values.
     */
    @Getter
    @Setter
    private String country;

    /**
     * Default contructor.
     */
    public LocaleRequest() {}

    /**
     * 
     * @param language An ISO 639 alpha-2 or alpha-3 language code, or a language subtag 
     * up to 8 characters in length.  See the <code>Locale</code> class description about 
     * valid language values.
     * @param country An ISO 3166 alpha-2 country code or a UN M.49 numeric-3 area code. 
     * See the <code>Locale</code> class description about valid country values.
     * 
     */
    public LocaleRequest( final String language, final String country ) {
        this.language = language;
        this.country = country;
    }
}
