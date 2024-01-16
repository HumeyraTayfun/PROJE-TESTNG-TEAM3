package tests.Azim;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.admin.AdminDashboard;
import pages.admin.manageFleets.FleetType;
import pages.admin.manageFleets.SeatLayouts;
import pages.admin.manageFleets.Vehicles;
import utilities.Driver;
import utilities.ReusableMethods;

public class US31 {


    @Test
    public void test01(){
        SoftAssert softAssert = new SoftAssert();
        AdminDashboard adminDashboard = new AdminDashboard();
        FleetType fleetType=new FleetType();
        Vehicles vehicles=new Vehicles();
        //1-User go to the "https://qa.easybusticket.com/admin"
        //2-User clicks on "Username" box.
        //3-User enters a valid username.
        //4-User clicks on "Password" box.
        //5-User enters a valid password.
        //6-User clicks the "Login" button.
        ReusableMethods.adminLogin("azimadmin","azimAdminPassword");

        //7-Verify that the "Tranport Maneger" page opens to display.
        String expectedTranportManegerUrl="https://qa.easybusticket.com/admin/manage/seat_layouts";
        String actualTranportManegerUrl= Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualTranportManegerUrl,expectedTranportManegerUrl,"TranportManeger page is not sended");

        //8-Click on the " Manage fleets" button on the left sidebar.
        fleetType.manageFleets.click();
        //9-In the drop-down list that opens, click on the " Seat Layouts" button.
        fleetType.seatLayouts.click();

        //11-Verify that the "Seat Layouts" page opens to display.
        String expectedSeatLayoutsUrl="https://qa.easybusticket.com/admin/manage/seat_layouts";
        String actualSeatLayoutsUrl= Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualSeatLayoutsUrl,expectedSeatLayoutsUrl,"SeatLayouts page is not sended");

        //12-Click "Fleet Type" button.
        fleetType.fleetType.click();

        //13-Verify that the "Fleet Type" page opens to display.
        String expectedFleetTypeUrl="https://qa.easybusticket.com/admin/manage/fleet-type";
        String actualFleetTypeUrl= Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualFleetTypeUrl,expectedFleetTypeUrl,"Fleet Type page is not sended");

        //14-Click "Vehicles" button.
        vehicles.Vehicles.click();

        //15-Verify that the "Vehicles" page opens to display.
        String expectedVehiclesUrl="https://qa.easybusticket.com/admin/manage/vehicles";
        String actualVehiclesUrl= Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualVehiclesUrl,expectedVehiclesUrl,"Fleet Type page is not sended");

        Driver.getDriver().quit();
    }
    @Test
    public void test02(){
        SoftAssert softAssert = new SoftAssert();
        AdminDashboard adminDashboard = new AdminDashboard();
        FleetType fleetType=new FleetType();
        SeatLayouts seatLayouts=new SeatLayouts();
        //1-User go to the "https://qa.easybusticket.com/admin"
        //2-User clicks on "Username" box.
        //3-User enters a valid username.
        //4-User clicks on "Password" box.
        //5-User enters a valid password.
        //6-User clicks the "Login" button.
        ReusableMethods.adminLogin("azimadmin","azimAdminPassword");
        //7 - Click on the " Manage fleets" button on the left sidebar.
        fleetType.manageFleets.click();

        //8-Click "Seat Layouts" button.
        fleetType.seatLayouts.click();

        //9-Verify that the "Seat Layouts" page opens to display.
        String expectedSeatLayoutsUrl="https://qa.easybusticket.com/admin/manage/seat_layouts";
        String actualSeatLayoutsUrl= Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualSeatLayoutsUrl,expectedSeatLayoutsUrl,"Seat Layouts page is not sended");

        //10-Click "Add New" button.
        seatLayouts.AdNevButton.click();

        //11-Click "Add Seat Layouts" to.Enter the number of seats in the Add Seat Layouts box.
        seatLayouts.addSeatLayoutsBox.sendKeys("2","4");

        //12-Click "Save" button.
        seatLayouts.addSeatLayoutsSaveButton.click();

        //13-Verify that the new seats appear to have been successfully added.
        String expectednewSeatsAddUrl="https://qa.easybusticket.com/admin/manage/seat_layouts";
        String actualnewSeatsAddUrl= Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualnewSeatsAddUrl,expectednewSeatsAddUrl,"New Seats Add page is not sended");

        //14-Click "Action " button.
        seatLayouts.addSeatLayoutsActionButton.click();

        //15-Click "Update Seat Layouts" to box.Enter data for seat correction
        seatLayouts.addSeatLayoutsAbdateBox.sendKeys(Keys.CONTROL+"a");

        seatLayouts.addSeatLayoutsAbdateBox.sendKeys(Keys.DELETE);

        //16-Click "Update " button.
        seatLayouts.addSeatLayoutsAbdateButton.click();

        //17-Verify that the update new Seat Layouts  page opens to display.
        String expectednewSeatLayoutsUrl="https://qa.easybusticket.com/admin/manage/seat_layouts";
        String actualewSeatLayoutsUrl= Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualewSeatLayoutsUrl,expectednewSeatLayoutsUrl,"Update new Seat Layouts page is not sended");

        //18-Click "delete" button.
        ReusableMethods.bekle(2);
        seatLayouts.addSeatLayoutsDeleteButton.click();

        //19-The user verifies that the text "Seat Layouts deleted" appears.
        String expectedSeatLayoutsDeletedUrl="https://qa.easybusticket.com/admin/manage/seat_layouts";
        String actualSeatLayoutsDeletedUrl= Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualSeatLayoutsDeletedUrl,expectedSeatLayoutsDeletedUrl,"Seat Layouts deleted page is not sended");

        //Driver.getDriver().quit();

    }

    @Test
    public void test03(){
        SoftAssert softAssert = new SoftAssert();
        AdminDashboard adminDashboard = new AdminDashboard();
        FleetType fleetType=new FleetType();
        SeatLayouts seatLayouts=new SeatLayouts();

        //1-User go to the "https://qa.easybusticket.com/admin"
        //2-User clicks on "Username" box.
        //3-User enters a valid username.
        //4-User clicks on "Password" box.
        //5-User enters a valid password.
        //6-User clicks the "Login" button.
        ReusableMethods.adminLogin("azimadmin","azimAdminPassword");
        //7-Click on the " Manage fleets" button on the left sidebar.
        fleetType.manageFleets.click();

        //8-Click "Fleet Type" button.
        fleetType.fleetType.click();

        //9-Verify that the new Fleet Type  data page opens to display.
        String expectedFleetTypeUrl="https://qa.easybusticket.com/admin/manage/fleet-type";
        String actualFleetTypeUrl= Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualFleetTypeUrl,expectedFleetTypeUrl,"Fleet Type page is not sended");

        //10-Click "Add new" button.
        seatLayouts.AdNevButton.click();

        //11-Click "Add Fleet Type name" Box.User enters a valid name.
        fleetType.addFleetTypeNameBox.sendKeys("Lüx");

        //12-User clicks the "Seat Layout" button.
        ReusableMethods.bekle(2);

        Select select=new Select(fleetType.SelectAnOptionFleetTypeBox);
        select.selectByIndex(2);

        //13-Click "No of Deck" box.User enters a valid No of Deck.
        fleetType.addFleetNoofDeckBox.sendKeys("1");

        //14-Click "Seats of Deck" box User enters a valid Seats of Deck
        fleetType.SeatSofDeckBox.sendKeys("2");

        //15-Click "Facilities" box.
        Select select1=new Select(fleetType.facilitiesBox);
        select1.selectByIndex(2);



        //16-In the drop-down list that appears, click on the "Tea&amp;Caffe" button.
        //17-In the drop-down list that appears, click on the "Pillow" button.
        //18-In the drop-down list that appears, click on the "wifi" button.
        //19-Click "AC status" button.
        //20-Click "Save" button.
        //21-Verify that the new Fleet Type  data page opens to display.
        //22-Click "Action" button.
        //23-Click "Add Fleet Type name" box User enters a valid name.
        //24-User clicks the "Seat Layout" button.
        //25-In the drop-down list that appears, click on the "Seat Layout" button.
        //26-Click "No of Deck" box.User enters a valid No of Deck.
        //27-Click "Seats of Deck" box.User enters a valid Seats of Deck
        //28- Click "Facilities" box.
        //29-In the drop-down list that appears, click on the "Tea&amp;Caffe" button.
        //30-In the drop-down list that appears, click on the "Pillow" button.
        //31-In the drop-down list that appears, click on the "wifi" button.
        //32-Click "AC status" button.
        //33-Click "Save" button.
        //34-Verify that the update Fleet Type  data page opens to display.
        //35-Click "delete" button.
        //36-The user verifies that the text "fleet types deleted" appears.


       // Driver.getDriver().quit();

    }

    @Test
    public void test04(){
        SoftAssert softAssert = new SoftAssert();
        AdminDashboard adminDashboard = new AdminDashboard();
        FleetType fleetType=new FleetType();
        SeatLayouts seatLayouts=new SeatLayouts();
        Vehicles vehicles=new Vehicles();
        //1-User go to the "https://qa.easybusticket.com/admin"
        //2-User clicks on "Username" box.
        //3-User enters a valid username.
        //4-User clicks on "Password" box.
        //5-User enters a valid password.
        //6-User clicks the "Login" button.
        ReusableMethods.adminLogin("azimadmin","azimAdminPassword");

        //7-Click on the " Manage fleets" button on the left sidebar.
        fleetType.manageFleets.click();

        //8-Click "Vehicles" button.
        vehicles.Vehicles.click();

        //9-Verify that the Vihicles data page opens to display.
        String expectedVehiclesUrl="https://qa.easybusticket.com/admin/manage/vehicles";
        String actualVehiclesUrl= Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualVehiclesUrl,expectedVehiclesUrl,"Fleet Type page is not sended");

        //10-Click "Search"box button.Write vehicle registration number in the search box

        //11Verify that the Vihicl data page opens to display.

        //12-Click "Add New"box button.

        //13-Click "Nick Name"box Write vehicle Nick Name  in the search box

        //14-Click "Nick Name"box

        //15-In the drop-down list that opens, click on the " Fleet Type" button.
        //16-Click "Register No."box. Write vehicle Register No. in the search box
        //17-Click "Engine No"box Write vehicle Engine No. in the search box
        //18-Click "Chasis No"box .Write vehicle Chasis No. in the search box
        //19-Click "Model No."box. Write vehicle Model No in the search box
        //20-Click "Save"box
        //21-Verify that the new Vihicl  data page opens to display.
        //22-Click Action update button
        //23-Click "Nick Name"box .Write vehicle Nick Name  in the search box
        //24-Click "Nick Name"box
        //25- In the drop-down list that opens, click on the " Fleet Type" button.
        //26-Click "Register No."box .Write vehicle Register No. in the search box
        //27-Click "Engine No"box .Write vehicle Engine No. in the search box
        //28-Click "Chasis No"box .Write vehicle Chasis No. in the search box
        //29-Click "Model No."box Write vehicle Model No in the search box
        //30-Click "Save"box
        //31-Verify that the new Vihicl  data page opens to display.
        //32-Click Action update button
        //33-Verify that the update new Vihicl  data page opens to display.
        //34-Click active/disable button
        //35-Click active alert button
        //36-Verify that the  new active  data page opens to display.
        //37-Click active/disable button
        //38-Click active alert button
        //39-Verify that the  new disabled  data page opens to display.
        Driver.getDriver().quit();
    }







}
