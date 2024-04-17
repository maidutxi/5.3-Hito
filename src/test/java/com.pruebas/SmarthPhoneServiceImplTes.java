package com.pruebas;
import static org.junit.jupiter.api.Assertions.*;
import com.example.demo.service.SmartPhoneServiceImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import static org.junit.jupiter.api.Assertions.*;


@TestMethodOrder(OrderAnnotation.class)
@DisplayName("Conjunto de pruebas")
public class SmartPhoneServiceImplTest {


    private SmartPhoneServiceImpl smartPhoneService;


    @BeforeEach
    public void setUp() {
        smartPhoneService = new SmartPhoneServiceImpl();
    }


    @AfterEach
    void tearDown() {
        smartPhoneService.deleteAll();
        System.out.println("Limpieza después de cada prueba");
    }


    @Test
    @Order(1)
    @DisplayName("No es Nulo")
    public void testCountNotNull() {
        assertNotNull(smartPhoneService.count());
    }


    @Test
    @Order(2)
    @DisplayName("Mayor que 0")
    public void testCountGreaterThanZero() {
        assertTrue(smartPhoneService.count() > 0);
    }


    @Test
    @Order(3)
    @DisplayName("Igual a 3")
    public void testCountEqualsThree() {
        assertEquals(3, smartPhoneService.count());
    }


    @Test
    @Order(4)
    @DisplayName("ID nulo")
    public void testFindOneWithNullId() {
        assertThrows(IllegalArgumentException.class, () -> {
            smartPhoneService.findOne(null);
        });
    }


    @Test
    @Order(5)
    @DisplayName("Contador")
    public void testCount() {
        assertAll("count",
                () -> assertNotNull(smartPhoneService.count()),
                () -> assertTrue(smartPhoneService.count() > 0),
                () -> assertEquals(3, smartPhoneService.count())
        );
    }
}
