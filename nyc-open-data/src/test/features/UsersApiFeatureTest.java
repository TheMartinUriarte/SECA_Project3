@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class UsersApiFeatureTest {

    @Autowired
    private UserRepository userRepository;

    @Before
    public void setUp() {
        userRepository.deleteAll();
    }

    @After
    public void tearDown() {
        userRepository.deleteAll();
    }

    @Test
    public void shouldAllowFullCrudForAUser() throws Exception {

        User firstUser = new User(
                "Ash",
                "Ketchum",
                "Trainer"
        );

        User secondUser = new User(
                "Misty",
                "Yawa",
                "Gym Leader"
        );

        Stream.of(firstUser, secondUser)
                .forEach(user -> {
                    userRepository.save(user);
                });
    }

}

// Test get all Users
when()
    .get("http://localhost:8080/users")
.then()
    .statusCode(is(200))
    .and().body(containsString("Misty"))
    .and().body(containsString("Yawa"));