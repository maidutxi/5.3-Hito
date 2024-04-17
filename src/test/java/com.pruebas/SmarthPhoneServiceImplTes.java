public class SmarthPhoneServiceImplTes {
    private SmartPhoneServiceImpl smartPhoneService;


    @BeforeEach
    public void setUp() {
        smartPhoneService = new SmartPhoneServiceImpl();
    }
    @Test
    public void testCountNotNull() {
        assertNotNull(smartPhoneService.count());
    }


    @Test
    public void testCountGreaterThanZero() {
        assertTrue(smartPhoneService.count() > 0);
    }


    @Test
    public void testCountEqualsThree() {
        assertEquals(3, smartPhoneService.count());
    }



}
