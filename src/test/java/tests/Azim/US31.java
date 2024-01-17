package tests.Azim;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.admin.AdminDashboard;
import pages.admin.manageFleets.FleetType;
import pages.admin.manageFleets.SeatLayouts;
import pages.admin.manageFleets.Vehicles;
import utilities.ConfigReader;
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
        Select select=new Select(fleetType.SelectAnOptionFleetTypeBox);
        select.selectByIndex(2);

        //13-Click "No of Deck" box.User enters a valid No of Deck.
        fleetType.addFleetNoofDeckBox.sendKeys("1");

        //14-Click "Seats of Deck" box User enters a valid Seats of Deck
        fleetType.SeatSofDeckBox.sendKeys("2");

        //15-Click "Facilities" box.
        fleetType.removeButton.click();
        fleetType.removeButton.click();
        fleetType.removeButton.click();
        fleetType.removeButton.click();

        //16-In the drop-down list that appears, click on the "Tea&amp;Caffe" button.
        Select select1=new Select(fleetType.facilitiesBox);
        select1.selectByVisibleText("Tea &amp; Coffee");

        //17-In the drop-down list that appears, click on the "Water" button.
        Select select2=new Select(fleetType.facilitiesBox);
        select2.selectByVisibleText("Water");

        //18-In the drop-down list that appears, click on the "Pillow" button.
        Select select3=new Select(fleetType.facilitiesBox);
        select3.selectByVisibleText("Pillow");

        //19-In the drop-down list that appears, click on the "wifi" button.
        Select select4=new Select(fleetType.facilitiesBox);
        select4.selectByVisibleText("Wifi");

        fleetType.removeButton.click();
        fleetType.removeButton.click();
        fleetType.removeButton.click();
        fleetType.removeButton.click();
        fleetType.facilitiesBox2.click();

        //20-Click "AC status" button.
        fleetType.acStatusButton.click();

        //21-Click "Save" button.
        fleetType.submitButton.click();

        //22-Verify that the new Fleet Type  data page opens to display.
        String expectedFleetTypeDataPageUrl="https://qa.easybusticket.com/admin/manage/fleet-type";
        String actualFleetTypeDataPageUrl= Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualFleetTypeDataPageUrl,expectedFleetTypeDataPageUrl,"Fleet Type data pagepage is not sended");

        //23-Click "Action" button.
        fleetType.ActionButton.click();

        //24-Click "Add Fleet Type name" box User enters a valid name.
        fleetType.updateFleetTypeBox.sendKeys(Keys.DELETE);
        fleetType.updateFleetTypeBox.sendKeys("Delüx");

        //25-In the drop-down list that appears, click on the "Seat Layout" button.
        Select select5=new Select(fleetType.SelectAnOptionFleetTypeBox1);
        select5.selectByIndex(3);

        //26-Click "No of Deck" box.User enters a valid No of Deck.
        fleetType.addFleetNoofDeckBox1.sendKeys(" ");

        //27-Click "Seats of Deck" box.User enters a valid Seats of Deck
        fleetType.updateFleetTypeBox.sendKeys(Keys.DELETE);
        fleetType.updateFleetTypeBox.sendKeys("1");

        //28-Click "Facilities" box.
        fleetType.removeButton1.click();
        fleetType.removeButton1.click();
        fleetType.removeButton1.click();
        fleetType.removeButton1.click();

        //29-In the drop-down list that appears, click on the "Tea&amp;Caffe" button.
        Select select6=new Select(fleetType.facilitiesBox4);
        select6.selectByVisibleText("Tea &amp; Coffee");

        //30-In the drop-down list that appears, click on the "Pillow" button.
        Select select7=new Select(fleetType.facilitiesBox4);
        select7.selectByVisibleText("Water");

        //31-In the drop-down list that appears, click on the "wifi" button.
        Select select8=new Select(fleetType.facilitiesBox4);
        select8.selectByVisibleText("Pillow");

        //32-Click "AC status" button.
        Select select9=new Select(fleetType.facilitiesBox4);
        select9.selectByVisibleText("Wifi");

        fleetType.facilitiesBox5.click();

        //31-Click "AC status" button.
        fleetType.acStatusButton1.click();

        //32-Click "Save" button.
        fleetType.submitButton1.click();

        //34-Verify that the update Fleet Type  data page opens to display.
        String expectedUpdateFleetTypeDataUrl="https://qa.easybusticket.com/admin/manage/fleet-type";
        String actualUpdateFleetTypeDataUrl= Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualUpdateFleetTypeDataUrl,expectedUpdateFleetTypeDataUrl,"Update Fleet Type  data pagepage is not sended");

        //35-Click "delete" button.
        //36-The user verifies that the text "fleet types deleted" appears.
        Driver.getDriver().quit();

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
        vehicles.allVehiclesSearchBox.sendKeys(ConfigReader.getProperty("otobus"));
        vehicles.allVehiclesSearchButton.click();

        //11Verify that the Vihicl data page opens to display.
        String expectedUpdatedVihicldatapageUrl="https://qa.easybusticket.com/admin/manage/fleet-type";
        String actualVihicldatapageUrl= Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualVihicldatapageUrl,expectedUpdatedVihicldatapageUrl," Vihicl data pagepage is not sended");

        //12-Click "Add New"box button.
        vehicles.addNewButton.click();

        //13-Click "Nick Name"box Write vehicle Nick Name  in the search box
        vehicles.nicNameBox.sendKeys(ConfigReader.getProperty("nicName"));

        //14- In the drop-down list that opens, click on the " Fleet Type" button.
        Select select=new Select(vehicles.fleetTypeBoxSeleckBox);
        select.selectByVisibleText("LüxDelüx");

        //15-Click "Register No."box. Write vehicle Register No. in the search box
        vehicles.RegisterNoBox.sendKeys(ConfigReader.getProperty("registerNo"));

        //16-Click "Engine No"box Write vehicle Engine No. in the search box
        vehicles.engineNoBox.sendKeys(ConfigReader.getProperty("engineNo"));

        //17-Click "Chasis No"box .Write vehicle Chasis No. in the search box
        vehicles.chasisNoBox.sendKeys(ConfigReader.getProperty("chasisNo"));

        //18-Click "Model No."box. Write vehicle Model No in the search box
        vehicles.modelNoBox.sendKeys(ConfigReader.getProperty("modelNo"));

        //19-Click "Save"box
        vehicles.submitButton.click();

        //20-Verify that the new Vihicl  data page opens to display.
        String expectednewVihicldataPageUrl="https://qa.easybusticket.com/admin/manage/vehicles/search?search=AB5057906737";
        String actualnewVihicldataPageUrl= Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualnewVihicldataPageUrl,expectednewVihicldataPageUrl," new Vihicl  data page is not sended");

        //21-Click Action update button
        vehicles.actionButton.click();

        //22-Click "Nick Name"box .Write vehicle Nick Name  in the search box
        vehicles.nicNameBox1.sendKeys(Keys.DELETE);
        vehicles.nicNameBox1.sendKeys(ConfigReader.getProperty("nicName1"));

        //23-In the drop-down list that opens, click on the " Fleet Type" button.
        Select select1=new Select(vehicles.fleetTypeBoxSeleckBox1);
        select1.selectByVisibleText("Confort bus");

        //24-Click "Register No."box .Write vehicle Register No. in the search box
        vehicles.RegisterNoBox1.sendKeys(Keys.DELETE);
        vehicles.RegisterNoBox1.sendKeys(ConfigReader.getProperty("registerNo1"));

        //25-Click "Engine No"box .Write vehicle Engine No. in the search box
        vehicles.engineNoBox1.sendKeys(Keys.DELETE);
        vehicles.engineNoBox1.sendKeys(ConfigReader.getProperty("engineNo1"));

        //26-Click "Chasis No"box .Write vehicle Chasis No. in the search box
        vehicles.chasisNoBox1.sendKeys(Keys.DELETE);
        vehicles.chasisNoBox1.sendKeys(ConfigReader.getProperty("chasisNo1"));

        //27-Click "Model No."box Write vehicle Model No in the search box
        vehicles.modelNoBox1.sendKeys(Keys.DELETE);
        vehicles.modelNoBox1.sendKeys(ConfigReader.getProperty("modelNo1"));

        //28-Click "update" button.
        vehicles.updateButton1.click();

        //29-Verify that the new Vihicl update  data page opens to display.
        String expectednewVihiclUpdateDataUrl="https://qa.easybusticket.com/admin/manage/vehicles/search?search=AB5057906737";
        String actualnewVihiclUpdateDataUrl= Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualnewVihiclUpdateDataUrl,expectednewVihiclUpdateDataUrl,"Vew Vihicl update  data data page is not sended");

        //30-Click active/disable button
        vehicles.statüsActionButton.click();

        //31-Click active alert button
        vehicles.disableVehicleButton.click();

        //32-Verify that the  new active  data page opens to display.
        String expectednewVihiclactiveUpdateDataUrl="https://qa.easybusticket.com/admin/manage/vehicles/search?search=AB5057906737";
        String actualnewVihiclactiveUpdateDataUrl= Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualnewVihiclactiveUpdateDataUrl,expectednewVihiclactiveUpdateDataUrl,"Vew Vihicl update  data data page is not sended");

        //33-Click active/disable button
        vehicles.statüsActionButton.click();

        //34-Click active alert button
        vehicles.disableVehicleButton1.click();

        //35-Verify that the  new disabled  data page opens to display.
        String expectednewdisabledVihiclactiveUpdateDataUrl="https://qa.easybusticket.com/admin/manage/vehicles/search?search=AB5057906737";
        String actualnewdisabledVihiclactiveUpdateDataUrl= Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualnewdisabledVihiclactiveUpdateDataUrl,expectednewVihiclactiveUpdateDataUrl,"Vew Vihicl update  data data page is not sended");


    }

}
