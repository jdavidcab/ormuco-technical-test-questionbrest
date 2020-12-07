package com.ormuco.technicaltest.questionbrest.controllers;

import javax.validation.Valid;

import com.ormuco.technicaltest.questionbrest.dto.CompareTwoStringRequest;
import com.ormuco.technicaltest.questionbrest.dto.CompareTwoStringResponse;
import com.ormuco.technicaltest.questionbrest.services.ICompareService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * RestController to Compare two {@code String}
 * <p>
 * This controller allow compare two version {@code String} as input and returns
 * whether one is greater than, equal, or less than the other.
 * </p>
 * 
 * @author Johann David Cabrera Mora
 * @since 1.0
 */
@RestController
@RequestMapping( "/compare" )
public class CompareController {

    private static final Logger LOGGER = LoggerFactory.getLogger( CompareController.class );

    /**
     * Spring Dependency injection of service.
     */
    @Autowired
    ICompareService compareService;

    /** 
     * Compare two {@code String}.
     * 
     * <p>
     * This method compares two version string as input and returns 
     * whether one is greater than, equal, or less than the other.
     * </p>
     * @param request Request fields with first {@code String} to evaluate, Second {@code String} to evaluate,
     * and Locale object represents a specific geographic, cultural, or political region.
     * @return CompareTwoStringResponse: the value 0 if {@code strNum1 == strNum2;} a value -1 
     * if {@code strNum1 < strNum2;} and a value 1 if {@code strNum1 > strNum2;}
     * 
     */
    @PostMapping( path="/twoString" )
    public CompareTwoStringResponse compareTwoString(@Valid @RequestBody CompareTwoStringRequest request) {

        LOGGER.debug( "Receiving post method request. CompareTwoStringRequest:[" + request + "]" );

        Integer compareInd = null;
        if( request.getLocale() != null ) {

            compareInd = compareService.compareTwoString( 
                request.getStrNum1(), 
                request.getStrNum2(), 
                request.getLocale().getLanguage(), 
                request.getLocale().getCountry()
            );

        } else {

            compareInd = compareService.compareTwoString( 
                request.getStrNum1(), 
                request.getStrNum2()
            );

        }
        
        LOGGER.debug( "Compare result to strNum1:[" + request.getStrNum1() + "] and strNum1:[" + 
            request.getStrNum2() + "]. CompareInd:[" + compareInd + "]" );

        return new CompareTwoStringResponse( compareInd );

    }
    

}
