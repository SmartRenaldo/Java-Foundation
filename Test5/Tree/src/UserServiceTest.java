import org.junit.*;

public class UserServiceTest {
    // @Before：用来修饰实例方法，该方法会在每一个测试方法执行之前执行一次
    @Before
    public void before() {
        System.out.println("===before===");
    }

    // @After：用来修饰实例方法，该方法会在每一个测试方法执行之后执行一次
    @After
    public void after() {
        System.out.println("===after===");
    }

    // @BeforeClass：用来静态修饰方法，该方法会在所有测试方法之前只执行一次
    @BeforeClass
    public static void beforeClass() {
        System.out.println("===beforeClass===");
    }

    // @AfterClass：用来静态修饰方法，该方法会在所有测试方法之后只执行一次
    @AfterClass
    public static void afterClass() {
        System.out.println("===afterClass===");
    }

    @Test
    public void testLogin() {
        UserService userService = new UserService();
        String str = userService.login("admin", "123456");

        // 断言预期结果的正确性。
        /**
         * 参数一：测试失败的提示信息。
         * 参数二：期望值。
         * 参数三：实际值
         */
        // public static void assertEquals(String message, Object expected, Object actual)
        Assert.assertEquals("Login method error", "success", str);
    }

    @Test
    public void testDivide() {
        UserService userService = new UserService();
        userService.divide(2, 0);
    }

}
