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

    @Test
    public void testFindOneWithNullId() {
        assertThrows(IllegalArgumentException.class, () -> {
            smartPhoneService.findOne(null);
        });
    }
    @Test
    public void testCount() {
        assertAll("count",
                () -> assertNotNull(smartPhoneService.count()),
                () -> assertTrue(smartPhoneService.count() > 0),
                () -> assertEquals(3, smartPhoneService.count())
        );
    }


}
