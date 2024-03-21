// package com.example.weatherapi.service;

// import com.example.weatherapi.model.ForecastData;
// import com.example.weatherapi.model.WeatherResponse;
// import com.example.weatherapi.strategy.fifoStrategy;

// import org.junit.jupiter.api.BeforeEach;
// import org.junit.jupiter.api.Test;

// import static org.junit.jupiter.api.Assertions.*;
// import static org.mockito.Mockito.*;

// public class WeatherServiceTest {

//     private WeatherService weatherService;
//     private ForecastData mockForecast;

//     @BeforeEach
//     public void setUp() {
//         weatherService = new WeatherService(new fifoStrategy());
//         mockForecast = mock(ForecastData.class);
//     }

//     @Test
//     public void testGetWeatherForecast_CachedData() {
//         String zipcode = "12345";
//         when(mockForecast.isFresh()).thenReturn(true);
//         // weatherService.addForecastData(zipcode, mockForecast);

//         WeatherResponse weatherResponse = weatherService.getWeatherForecast(zipcode);

//         assertNotNull(weatherResponse);
//         assertEquals(mockForecast, weatherResponse.getForecast());
//         assertTrue(weatherResponse.isFromCache());
//     }

//     @Test
//     public void testGetWeatherForecast_FetchData() {
//         String zipcode = "12345";
//         when(mockForecast.isFresh()).thenReturn(false);
//         when(mockForecast.getCurrentTemperature()).thenReturn(73.5);
//         when(weatherService.fetchWeatherDataFromExternalAPI(zipcode)).thenReturn(73.5);

//         WeatherResponse weatherResponse = weatherService.getWeatherForecast(zipcode);

//         assertNotNull(weatherResponse);
//         assertEquals(73.5, weatherResponse.getForecast().getCurrentTemperature());
//         assertFalse(weatherResponse.isFromCache());
//     }
// }

