package tests.Burcu;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.admin.AdminDashboard;

public class US22 {
    @Test
    public void TestCase22(){

        SoftAssert softAssert = new SoftAssert();
        AdminDashboard adminDashboard = new AdminDashboard();

        //1- User clicks on "View All" button for "Total Users".(kullanıı toplam kullanıcı için tümünü görüntüle dügmesine tıklar)
        adminDashboard.TotalUsers.click();
       // 2- User displays "Manage Users" page.(kullanıcı kullanıcıları yönetme sayfasını göruntuler)
        //3-User returns to the dashboard page.(kullanıcı yönet sayfasını göruntuler)
    }
}
