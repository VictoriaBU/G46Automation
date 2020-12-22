package tests;

import org.junit.Before;
import org.junit.Test;
import pages.LoginPage;
import pages.PomPage;
import pages.ProjectPage;


public class PomPageTest extends BaseTest{

    private LoginPage page;
    private ProjectPage page1;
    private PomPage page2;
    @Before
    public void setPage(){
        this.page = new LoginPage(driver);

    }
    @Test
        public void pomSearch(){
        page.checkAuthField()
            .login("nva0045@gmail.com", "Bulka_1507")
            .projectOpening()
            .pomSearch()
            .versionCompare()
            .logOut()
            .logOutChecking();
    }
}

