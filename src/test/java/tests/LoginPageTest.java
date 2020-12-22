package tests;

import org.junit.Before;
import org.junit.Test;
import pages.LoginPage;

public class LoginPageTest extends BaseTest{
    private LoginPage page;
    @Before
    public void setPage(){
        this.page = new LoginPage(driver);
    }
    @Test
    public void authTest(){
        page.checkAuthField()
        .login("nva0045@gmail.com", "Bulka_1507");
    }
}
