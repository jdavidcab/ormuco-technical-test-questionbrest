package com.ormuco.technicaltest.questionbrest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ormuco.technicaltest.questionbrest.controllers.CompareController;
import com.ormuco.technicaltest.questionbrest.dto.CompareTwoStringRequest;
import com.ormuco.technicaltest.questionbrest.dto.LocaleRequest;
import com.ormuco.technicaltest.questionbrest.services.ICompareService;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest( controllers = CompareController.class)
public class CompareRestPostTest {
    
   
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @MockBean
    private ICompareService collinearService;

    @Test
    void whenValidInput_thenReturns200() throws Exception {

        CompareTwoStringRequest request = new CompareTwoStringRequest();
        request.setStrNum1( "1.2" );
        request.setStrNum2( "1.1" );

        mockMvc.perform(
            post( "/compare/twoString" )
            .contentType( "application/json" )
            .content( objectMapper.writeValueAsString( request ) )
        )
        .andExpect( status().isOk() );

    }

    @Test
    void whenInvalidInput_thenReturns400() throws Exception {

        CompareTwoStringRequest request = new CompareTwoStringRequest();
        request.setStrNum1( null );
        request.setStrNum2( null );
        request.setLocale( new LocaleRequest( "en", "CA" ) );

        mockMvc.perform(
            post( "/compare/twoString" )
            .contentType( "application/json" )
            .content( objectMapper.writeValueAsString( request ) )
        )
        .andExpect( status().isBadRequest() );

    }

}
