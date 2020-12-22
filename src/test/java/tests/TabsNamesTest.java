package tests;

import org.junit.Before;
import org.junit.Test;
import pages.LoginPage;

public class TabsNamesTest extends BaseTest{
    private LoginPage page;

    @Before
    public void signIn(){
        page = new LoginPage(driver);

    }
        @Test
    public void tabsNames(){
           page.checkAuthField()
           .login("nva0045@gmail.com", "Bulka_1507")
           .projectOpening()
           .tabsSearch()
           .tabsPrint()
           .logOut()
           .logOutChecking();

    }

}
