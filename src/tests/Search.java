package tests;

import org.testng.annotations.Test;
import pages.MainPage;

public class Search extends Main{
    @Test
    public void HabrSearch() {
        String searchresult = "Лучшие публикации за сутки / Хабрахабр";
        MainPage mainPage = new MainPage();
        mainPage.searchHabr()
                .clickonSearchResultLink(searchresult)
                .goToLoginPage()
                .loginTohabr()
                .openUserProfile()
                .verifyUserNickname();





    }


}
