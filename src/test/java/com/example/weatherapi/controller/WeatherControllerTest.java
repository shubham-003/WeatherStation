// package com.example.weatherapi.controller;

// import com.example.weatherapi.model.WeatherResponse;
// import com.example.weatherapi.service.WeatherService;
// import org.junit.jupiter.api.Test;
// import org.mockito.InjectMocks;
// import org.mockito.Mock;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
// import org.springframework.boot.test.context.SpringBootTest;
// import org.springframework.test.web.servlet.MockMvc;
// import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

// import static org.mockito.Mockito.*;
// import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

// @SpringBootTest
// @AutoConfigureMockMvc
// public class WeatherControllerTest {

//     @Autowired
//     private MockMvc mockMvc;

//     @Mock
//     private WeatherService weatherService;

//     @InjectMocks
//     private WeatherController weatherController;

//     @Test
//     public void testGetWeatherForecast_Success() throws Exception {
//         WeatherResponse weatherResponse = new WeatherResponse(null, false);
//         when(weatherService.getWeatherForecast("12345")).thenReturn(weatherResponse);

//         mockMvc.perform(MockMvcRequestBuilders.get("/weather?zipcode=12345"))
//                 .andExpect(status().isOk());
//     }

//     @Test
//     public void testGetWeatherForecast_InternalServerError() throws Exception {
//         when(weatherService.getWeatherForecast("12345")).thenReturn(null);

//         mockMvc.perform(MockMvcRequestBuilders.get("/weather?zipcode=12345"))
//                 .andExpect(status().isInternalServerError());
//     }
// }

