package tests.İhsan;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.admin.AdminDashboard;
import pages.admin.manageTrips.*;
import pages.user.registeredUser.SupportRequests;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US32 {
    @Test
    public void testCase01(){
        SoftAssert softAssert = new SoftAssert();
        AdminDashboard adminDashboard = new AdminDashboard();
        Route route = new Route();

        // 1- User go to the "https://qa.easybusticket.com/admin"
        // 2- User clicks on "Username" box.
        // 3- User enters a valid username.
        // 4- User clicks on "Password" box.
        // 5- User enters a valid password.
        // 6- User clicks the "Login" button.
        // 7- User displays the "Admin Dashboard" page.
        ReusableMethods.adminLogin("ihsanAdminUsername" , "ihsanAdminPassword");

        // 8- User clicks on "Manage Trips" menu button.
        adminDashboard.manageTripsButton.click();

        // 9- User clicks on "Route" option.
        adminDashboard.routeButton.click();

        // 10- User displays "Route" page.
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.easybusticket.com/admin/manage/route";
        softAssert.assertEquals(actualUrl, expectedUrl, "User DID NOT display the 'Route' page!");

        // 11- User click "Add New" button.
        route.addNewButton.click();

        // 12- User displays "Create Route" page.
        actualUrl = Driver.getDriver().getCurrentUrl();
        expectedUrl = "https://qa.easybusticket.com/admin/manage/route/create";
        softAssert.assertEquals(actualUrl, expectedUrl, "User DID NOT display the 'Create Route' page!");

        // 13- User clicks on "Name" box.
        // 14- User enters a valid name.
        route.nameBox.sendKeys(ConfigReader.getProperty("ihsanRouteName"));

        // 15- User clicks on "Start From" menu.
        // 16- User selects an option.
        Select selectStartFrom = new Select(route.dropDownStartFrom);
        selectStartFrom.selectByValue("1");
        ReusableMethods.bekle(1);

        // 17- User clicks on "End To" menu.
        // 18- User selects an option.
        Select selectEndTo = new Select(route.dropDownEndTo);
        selectEndTo.selectByValue("2");

        // 19- User clicks on "Time" box.
        // 20- User enters a valid time.
        route.timeBox.click();
        route.timeBox.sendKeys(ConfigReader.getProperty("ihsanRouteTime"));

        // 21- User clicks on "Distance" box.
        // 22- User enters a valid distance.
        route.distanceBox.click();
        route.distanceBox.sendKeys(ConfigReader.getProperty("ihsanRouteDistance"));

        // 23- User clicks on "Save" button.
        route.saveButton.click();

        // 24- User verifies that "Route save successfully" text appeared.
        String actualText = route.labelSave.getText();
        String expectedText = "Route save successfully";
        softAssert.assertEquals(actualText, expectedText, "'Route save successfully' DID NOT appear!");

        // 25- User clicks on "Go Back" button.
        route.goBackButton.click();

        // 26- User displays "Route" page.
        actualUrl = Driver.getDriver().getCurrentUrl();
        expectedUrl = "https://qa.easybusticket.com/admin/manage/route";
        softAssert.assertEquals(actualUrl, expectedUrl, "User DID NOT display the 'Route' page!");

        // 27- User verifies that new route is added.
        String actualAddition = route.newRouteElement.getText();
        String expectedAddition = ConfigReader.getProperty("ihsanRouteName");
        softAssert.assertEquals(actualAddition, expectedAddition, "New 'Route' DID NOT add!");

        softAssert.assertAll();
        Driver.quitDriver();
    }

    @Test
    public void testCase02(){
        SoftAssert softAssert = new SoftAssert();
        AdminDashboard adminDashboard = new AdminDashboard();
        Schedule schedule = new Schedule();
        // 1- User go to the "https://qa.easybusticket.com/admin"
        // 2- User clicks on "Username" box.
        // 3- User enters a valid username.
        // 4- User clicks on "Password" box.
        // 5- User enters a valid password.
        // 6- User clicks the "Login" button.
        // 7- User displays the "Admin Dashboard" page.
        ReusableMethods.adminLogin("ihsanAdminUsername" , "ihsanAdminPassword");

        // 8- User clicks on "Manage Trips" menu button.
        adminDashboard.manageTripsButton.click();

        // 9- User clicks on "Schedule" option.
        adminDashboard.scheduleButton.click();

        // 10- User displays "Schedule" page.
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.easybusticket.com/admin/manage/schedule";
        softAssert.assertEquals(actualUrl, expectedUrl, "User DID NOT display the 'Schedule' page!");

        // 11- User click "Add New" button.
        schedule.addNewButton.click();

        // 12- User displays "Add Schedule" page.
        String actualPage = schedule.labelAddSchedule.getText();
        String expectedPage = "Add Schedule";
        softAssert.assertEquals(actualPage, expectedPage, "User DID NOT display the 'Add Schedule' page!");

        // 13- User clicks on "Start From" box.
        // 14- User enters a valid start time.
        schedule.startFromBox.sendKeys(ConfigReader.getProperty("ihsanScheduleStartFrom"));

        // 15- User clicks on "End At" box.
        // 16- User enters a valid end time.
        // 17- User clicks on "Save" button.
        schedule.endAtBox.sendKeys(ConfigReader.getProperty("ihsanScheduleEndAt") + Keys.ENTER);
        ReusableMethods.bekle(1);

        // 18- User verifies that "Schedule save successfully" text appeared.
        String actualText = schedule.labelSave.getText();
        String expectedText = "Schedule save successfully";
        softAssert.assertEquals(actualText, expectedText, "'Schedule save successfully' DID NOT appear!");

        // 19- User verifies that the schedule is added.
        String actualAddition = schedule.newScheduleElement.getText();
        String expectedAddition = ConfigReader.getProperty("ihsanScheduleStartFrom");
        softAssert.assertEquals(actualAddition, expectedAddition, "New 'Schedule' DID NOT add!");

        softAssert.assertAll();
        Driver.quitDriver();

    }

    @Test
    public void testCase03(){
        SoftAssert softAssert = new SoftAssert();
        AdminDashboard adminDashboard = new AdminDashboard();
        TicketPrice ticketPrice = new TicketPrice();

        // 1- User go to the "https://qa.easybusticket.com/admin"
        // 2- User clicks on "Username" box.
        // 3- User enters a valid username.
        // 4- User clicks on "Password" box.
        // 5- User enters a valid password.
        // 6- User clicks the "Login" button.
        // 7- User displays the "Admin Dashboard" page.
        ReusableMethods.adminLogin("ihsanAdminUsername" , "ihsanAdminPassword");

        // 8- User clicks on "Manage Trips" menu button.
        adminDashboard.manageTripsButton.click();

        // 9- User clicks on "Ticket Price" option.
        adminDashboard.ticketPriceButton.click();

        // 10- User displays "Ticket Price" page.
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.easybusticket.com/admin/manage/ticket-price";
        softAssert.assertEquals(actualUrl,expectedUrl, "User DID NOT display the 'Ticket Price' page!");

        // 11- User click "Add New" button.
        ticketPrice.addNewButton.click();

        // 12- User displays "Add Ticket Price" page.
        actualUrl = Driver.getDriver().getCurrentUrl();
        expectedUrl = "https://qa.easybusticket.com/admin/manage/ticket-price/create";
        softAssert.assertEquals(actualUrl, expectedUrl, "User DID NOT display the 'Add Ticket Price' page!");

        // 13- User clicks on "Fleet Type" menu.
        // 14- User selects an option.
        Select selectFleetType = new Select(ticketPrice.dropDownFleetType);
        selectFleetType.selectByValue("1");

        // 15- User clicks on "Route" menu.
        // 16- User selects an option.
        Select selectRoute = new Select(ticketPrice.dropDownRoute);
        selectRoute.selectByValue("41");

        // 17- User clicks on "Price For Source To Destination" box.
        // 18- User enters a valid price.
        ticketPrice.priceBox.click();
        ticketPrice.priceBox.sendKeys(ConfigReader.getProperty("ihsanTicketPrice"));

        // 19- User clicks on newly opened price box.
        // 20- User enters a valid price.
        ticketPrice.priceBox2.click();
        ticketPrice.priceBox2.sendKeys(ConfigReader.getProperty("ihsanTicketPrice2"));

        // 21- User clicks on "Save" button.
        ticketPrice.saveButton.click();

        // 22- User verifies that "Ticket price added successfully" text appeared.
        String actualText = ticketPrice.labelSave.getText();
        String expectedText = "Ticket price added successfully";
        softAssert.assertEquals(actualText, expectedText, "'Ticket price added successfully' DID NOT appear!");

        // 23- User clicks on "Go Back" button.
        ticketPrice.goBackButton.click();

        // 24- User displays "Ticket Price" page.
        actualUrl = Driver.getDriver().getCurrentUrl();
        expectedUrl = "https://qa.easybusticket.com/admin/manage/ticket-price";
        softAssert.assertEquals(actualUrl, expectedUrl, "User DID NOT display the 'Ticket Price' page!");

        // 25- User verifies that new ticket price is added.
        String actualAddition = ticketPrice.newTicketPriceElement.getText();
        String expectedAddition = ConfigReader.getProperty("ihsanTicketPrice");
        softAssert.assertEquals(actualAddition, expectedAddition, "New 'Ticket Price' DID NOT add!");

        softAssert.assertAll();
        Driver.quitDriver();
    }

    @Test
    public void testCase04(){
        SoftAssert softAssert = new SoftAssert();
        AdminDashboard adminDashboard = new AdminDashboard();
        Trip trip = new Trip();

        // 1- User go to the "https://qa.easybusticket.com/admin"
        // 2- User clicks on "Username" box.
        // 3- User enters a valid username.
        // 4- User clicks on "Password" box.
        // 5- User enters a valid password.
        // 6- User clicks the "Login" button.
        // 7- User displays the "Admin Dashboard" page.
        ReusableMethods.adminLogin("ihsanAdminUsername" , "ihsanAdminPassword");

        // 8- User clicks on "Manage Trips" menu button.
        adminDashboard.manageTripsButton.click();

        // 9- User clicks on "Trip" option.
        adminDashboard.tripButton.click();

        // 10- User displays "Trip" page.
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.easybusticket.com/admin/manage/trip";
        softAssert.assertEquals(actualUrl, expectedUrl, "User DID NOT display the 'Trip' page!");

        // 11- User click "Add New" button.
        trip.addNewButton.click();

        // 12- User displays "Add Trip" page.
        ReusableMethods.bekle(1);
        String actualPage = trip.labelAddTrip.getText();
        String expectedPage = "Add Trip";
        softAssert.assertEquals(actualPage, expectedPage, "User DID NOT display the 'Add Trip' page!");

        // 13- User clicks on "Fleet Type" menu.
        // 14- User selects an option.
        Select selectFleetType = new Select(trip.dropDownFleetType);
        ReusableMethods.bekle(1);
        selectFleetType.selectByValue("1");
        String fleetTypeText = trip.labelFleetType.getText();

        // 15- User clicks on "Route" menu.
        // 16- User selects an option.
        Select selectRoute = new Select(trip.dropDownRoute);
        selectRoute.selectByValue("42");

        // 17- User clicks on "Schedule" menu.
        // 18- User selects an option.
        Select selectSchedule = new Select(trip.dropDownSchedule);
        selectSchedule.selectByValue("1");

        // 19- User clicks on "Start From" menu.
        // 20- User selects an option.
        Select selectStartFrom = new Select(trip.dropDownStartFrom);
        selectStartFrom.selectByValue("1");
        String startFromText = trip.labelStartFrom.getText();

        // 21- User clicks on "End To" menu.
        // 22- User selects an option.
        Select selectEndTo = new Select(trip.dropDownEndTo);
        selectEndTo.selectByValue("2");
        String endToText = trip.labelEndTo.getText();

        // 23- User clicks on "Day Off" menu.
        // 24- User selects an option.
        Select selectDayOff = new Select(trip.dropDownDayOff);
        selectDayOff.selectByValue("1");

        // 25- User clicks on "Save" button.
        trip.saveButton.click();

        // 26- User verifies that "Trip save successfully" text appeared.
        ReusableMethods.bekle(1);
        String actualText = trip.labelSave.getText();
        String expectedText = "Trip save successfully";
        softAssert.assertEquals(actualText, expectedText, "'Trip save successfully' DID NOT appear!");

        // 27- User verifies that new trip is added.
        String actualAddition = trip.newTripElement.getText();
        String expectedAddition = fleetTypeText + " - " + startFromText + " - " + endToText;
        softAssert.assertEquals(actualAddition, expectedAddition, "New 'Trip' DID NOT add!");

        softAssert.assertAll();
        Driver.quitDriver();
    }

    @Test
    public void testCase05(){
        SoftAssert softAssert = new SoftAssert();
        AdminDashboard adminDashboard = new AdminDashboard();
        AssignedVehicle assignedVehicle = new AssignedVehicle();

        // 1- User go to the "https://qa.easybusticket.com/admin"
        // 2- User clicks on "Username" box.
        // 3- User enters a valid username.
        // 4- User clicks on "Password" box.
        // 5- User enters a valid password.
        // 6- User clicks the "Login" button.
        // 7- User displays the "Admin Dashboard" page.
        ReusableMethods.adminLogin("ihsanAdminUsername" , "ihsanAdminPassword");

        // 8- User clicks on "Manage Trips" menu button.
        adminDashboard.manageTripsButton.click();

        // 9- User clicks on "Assigned Vehicle" option.
        adminDashboard.assignedVehicleButton.click();

        // 10- User displays "Assigned Vehicle" page.
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.easybusticket.com/admin/manage/assigned-vehicle";
        softAssert.assertEquals(actualUrl, expectedUrl, "User DID NOT display the 'Assigned Vehicle' page!");

        // 11- User click "Add New" button.
        assignedVehicle.addNewButton.click();

        // 12- User displays "Assign Vehicle" page.
        ReusableMethods.bekle(1);
        String actualPage = assignedVehicle.labelAssignVehicle.getText();
        String expectedPage = "Assign Vehicle";
        softAssert.assertEquals(actualPage, expectedPage, "User DID NOT display the 'Assign Vehicle' page!");

        // 13- User clicks on "Trip" menu.
        // 14- User selects an option.
        Select selectTrip = new Select(assignedVehicle.dropDownTrip);
        selectTrip.selectByValue("95");
        String tripText = assignedVehicle.labelTrip.getText();

        // 15- User clicks on "Vehicle" menu.
        // 16- User selects an option.
        Select selectVehicle = new Select(assignedVehicle.dropDownVehicle);
        selectVehicle.selectByValue("7");
        String vehicleText = assignedVehicle.labelVehicle.getText();

        // 17- User clicks on "Save" button.
        assignedVehicle.saveButton.click();

        // 18- User verifies that "Vehicle assigned successfully." text appeared.
        ReusableMethods.bekle(1);
        String actualText = assignedVehicle.labelSave.getText();
        String expectedText = "Vehicle assigned successfully.";
        softAssert.assertEquals(actualText, expectedText, "'Vehicle assigned successfully' DID NOT appear!");

        // 19- User verifies that new vehicle is added.
        String actualAddition = assignedVehicle.newTripElement.getText();
        String actualAddition2 = assignedVehicle.newVehicleElement.getText();
        if (actualAddition.equals(tripText)){
            System.out.println("New Vehicle added!");
        }else {
            softAssert.assertEquals(actualAddition, tripText, "New 'Vehicle' DID NOT add!");
        }

        softAssert.assertAll();
        Driver.quitDriver();
    }

    @Test
    public void testCase06(){
        SoftAssert softAssert = new SoftAssert();
        AdminDashboard adminDashboard = new AdminDashboard();
        Route route = new Route();

        // 1- User go to the "https://qa.easybusticket.com/admin"
        // 2- User clicks on "Username" box.
        // 3- User enters a valid username.
        // 4- User clicks on "Password" box.
        // 5- User enters a valid password.
        // 6- User clicks the "Login" button.
        // 7- User displays the "Admin Dashboard" page.
        ReusableMethods.adminLogin("ihsanAdminUsername" , "ihsanAdminPassword");

        // 8- User clicks on "Manage Trips" menu button.
        adminDashboard.manageTripsButton.click();

        // 9- User clicks on "Route" option.
        adminDashboard.routeButton.click();

        // 10- User displays "Route" page.
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.easybusticket.com/admin/manage/route";
        softAssert.assertEquals(actualUrl, expectedUrl, "User DID NOT display the 'Route' page!");

        String routeName =route.newRouteElement.getText();

        // 11- User clicks on "Disable Route" button for the added route.
        route.disableButton.click();

        // 12- User clicks on "Disable" option.
        route.disableActiveButton.click();

        // 13- User verifies that the route is disabled.
        String actualText = route.labelStatus.getText();
        String expectedText = "Disabled";
        softAssert.assertEquals(actualText, expectedText, "'Route' IS NOT disabled.");

        // 14- User clicks on "Update Route" button for the added route.
        route.editButton.click();

        // 15- User displays "Update Route" page.
        actualUrl = Driver.getDriver().getCurrentUrl();
        expectedUrl = "https://qa.easybusticket.com/admin/manage/route/edit";
        softAssert.assertTrue(actualUrl.contains(expectedUrl), "User DID NOT display the 'Update Route' page!");

        // 16- User clicks on "Name" box.
        // 17- User enters a valid updated name.
        route.nameBox.sendKeys(ConfigReader.getProperty("ihsanRouteNameUpdated"));

        // 18- User clicks on "Save Changes" button.
        route.saveChangesButton.click();
        ReusableMethods.bekle(1);

        // 19- User verifies that "Route update successfully" text appeared.
        actualText = route.labelUpdate.getText();
        expectedText = "Route update successfully";
        softAssert.assertEquals(actualText, expectedText, "'Route update successfully' DID NOT appear!");

        // 20- User clicks on "Go Back" button.
        route.goBackButton.click();

        // 21- User displays "Route" page.
        actualUrl = Driver.getDriver().getCurrentUrl();
        expectedUrl = "https://qa.easybusticket.com/admin/manage/route";
        softAssert.assertEquals(actualUrl, expectedUrl, "User DID NOT display the 'Route' page!");

        // 22- User verifies that the route is updated.
        String actualUpdate = route.newRouteElement.getText();
        String expectedUpdate = routeName + ConfigReader.getProperty("ihsanRouteNameUpdated");
        softAssert.assertEquals(actualUpdate, expectedUpdate, "'Route' IS NOT updated!");

        softAssert.assertAll();
        Driver.quitDriver();
    }

    @Test
    public void testCase07(){
        SoftAssert softAssert = new SoftAssert();
        AdminDashboard adminDashboard = new AdminDashboard();
        Schedule schedule = new Schedule();

        // 1- User go to the "https://qa.easybusticket.com/admin"
        // 2- User clicks on "Username" box.
        // 3- User enters a valid username.
        // 4- User clicks on "Password" box.
        // 5- User enters a valid password.
        // 6- User clicks the "Login" button.
        // 7- User displays the "Admin Dashboard" page.
        ReusableMethods.adminLogin("ihsanAdminUsername" , "ihsanAdminPassword");

        // 8- User clicks on "Manage Trips" menu button.
        adminDashboard.manageTripsButton.click();

        // 9- User clicks on "Schedule" option.
        adminDashboard.scheduleButton.click();

        // 10- User displays "Schedule" page.
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.easybusticket.com/admin/manage/schedule";
        softAssert.assertEquals(actualUrl, expectedUrl, "User DID NOT display the 'Schedule' page!");

        // 11- User clicks on "Disable Schedule" button for the added Schedule.
        schedule.disableButton.click();

        // 12- User clicks on "Disable" option.
        schedule.disableActiveButton.click();

        // 13- User verifies that the Schedule is disabled.
        String actualText = schedule.labelStatus.getText();
        String expectedText = "Disabled";
        softAssert.assertEquals(actualText, expectedText, "'Schedule' IS NOT disabled.");

        // 14- User clicks on "Update Schedule" button for the added Schedule.
        schedule.editButton.click();

        // 15- User displays "Update Schedule" page.
        String actualPage = schedule.labelUpdatePage.getText();
        String expectedPage = "Update Schedule";
        softAssert.assertEquals(actualPage, expectedPage, "User DID NOT display the 'Update Schedule' page!");

        // 16- User clicks on "Start From" box.
        // 17- User enters a valid updated start time.
        schedule.startFromBox.clear();
        ReusableMethods.bekle(1);
        schedule.startFromBox.sendKeys(ConfigReader.getProperty("ihsanScheduleStartFromUpdated"));

        // 18- User clicks on "Update" button.
        schedule.updateButton.click();

        // 19- User verifies that update verification text appeared.
        // 20- User verifies that the schedule is updated.

        softAssert.assertAll();
        Driver.quitDriver();
    }

    @Test
    public void testCase08(){
        SoftAssert softAssert = new SoftAssert();
        AdminDashboard adminDashboard = new AdminDashboard();
        TicketPrice ticketPrice = new TicketPrice();

        // 1- User go to the "https://qa.easybusticket.com/admin"
        // 2- User clicks on "Username" box.
        // 3- User enters a valid username.
        // 4- User clicks on "Password" box.
        // 5- User enters a valid password.
        // 6- User clicks the "Login" button.
        // 7- User displays the "Admin Dashboard" page.
        ReusableMethods.adminLogin("ihsanAdminUsername" , "ihsanAdminPassword");

        // 8- User clicks on "Manage Trips" menu button.
        adminDashboard.manageTripsButton.click();

        // 9- User clicks on "Ticket Price" option.
        adminDashboard.ticketPriceButton.click();

        // 10- User displays "Ticket Price" page.
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.easybusticket.com/admin/manage/ticket-price";
        softAssert.assertEquals(actualUrl,expectedUrl, "User DID NOT display the 'Ticket Price' page!");

        // 11- User clicks on "Delete" button for the added ticket price.
        String routeName = ticketPrice.routeName.getText();
        ticketPrice.deleteButton.click();

        // 12- User confirms by clicking "Delete" button.
        ticketPrice.deleteConfirmButton.click();
        ReusableMethods.bekle(1);

        // 13- User verifies that "Price Deleted Successfully" text appeared.
        String actualText = ticketPrice.labelDelete.getText();
        String expectedText = "Price Deleted Successfully";
        softAssert.assertEquals(actualText, expectedText, "'Price Deleted Successfully' DID NOT appear!");

        // 14- User verifies "Ticket Price " has been deleted.
        softAssert.assertFalse(routeName.equals(ticketPrice.routeName.getText()),"'Ticket Price' IS NOT deleted.");

        // 15- User clicks on "Edit" button for the added ticket price.
        ticketPrice.editButton.click();

        // 16- User displays "Update Ticket Price" page.
        actualUrl = Driver.getDriver().getCurrentUrl();
        expectedUrl = "https://qa.easybusticket.com/admin/manage/ticket-price/edit";
        softAssert.assertTrue(actualUrl.contains(expectedUrl), "User DID NOT display the 'Update Ticket Price' page!");

        // 17- User clicks on price box.
        ticketPrice.updateBox.click();
        ticketPrice.updateBox.clear();

        // 18- User enters a valid updated price.
        ticketPrice.updateBox.sendKeys(ConfigReader.getProperty("ihsanUpdatedTicketPrice"));

        // 19- User clicks on "Update" button.
        ticketPrice.updateButton.click();
        ReusableMethods.bekle(1);

        // 20- User verifies that "Price Updated Successfully" text appeared.
        actualText = ticketPrice.labelUpdate.getText();
        expectedText = "Price Updated Successfully";
        softAssert.assertEquals(actualText, expectedText, "'Price Updated Successfully' DID NOT appear!");

        // 21- User clicks on "Go Back" button.
        ticketPrice.goBackButton.click();

        // 22- User displays "Ticket Price" page.
        actualUrl = Driver.getDriver().getCurrentUrl();
        expectedUrl = "https://qa.easybusticket.com/admin/manage/ticket-price";
        softAssert.assertEquals(actualUrl,expectedUrl, "User DID NOT display the 'Ticket Price' page!");

        // 23- User verifies that the ticket price is updated.
        String actualUpdate = ticketPrice.newTicketPriceElement.getText();
        String expectedUpdate = ConfigReader.getProperty("ihsanUpdatedTicketPrice") + ".00 USD";
        softAssert.assertEquals(actualUpdate, expectedUpdate, "'Ticket Price' IS NOT updated!");

        softAssert.assertAll();
        Driver.quitDriver();
    }

    @Test
    public void testCase09(){
        SoftAssert softAssert = new SoftAssert();
        AdminDashboard adminDashboard = new AdminDashboard();
        Trip trip = new Trip();

        // 1- User go to the "https://qa.easybusticket.com/admin"
        // 2- User clicks on "Username" box.
        // 3- User enters a valid username.
        // 4- User clicks on "Password" box.
        // 5- User enters a valid password.
        // 6- User clicks the "Login" button.
        // 7- User displays the "Admin Dashboard" page.
        ReusableMethods.adminLogin("ihsanAdminUsername" , "ihsanAdminPassword");

        // 8- User clicks on "Manage Trips" menu button.
        adminDashboard.manageTripsButton.click();

        // 9- User clicks on "Trip" option.
        adminDashboard.tripButton.click();

        // 10- User displays "Trip" page.
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.easybusticket.com/admin/manage/trip";
        softAssert.assertEquals(actualUrl, expectedUrl, "User DID NOT display the 'Trip' page!");

        // 11- User clicks on "Disable" button for the added trip.
        trip.disableButton.click();

        // 12- User clicks on "Disable" option.
        trip.disableConfirmButton.click();
        ReusableMethods.bekle(1);

        // 13- User verifies that "Trip disabled successfully" text appeared.
        String actualText = trip.labelDisable.getText();
        String expectedText = "Trip disabled successfully";
        softAssert.assertEquals(actualText, expectedText, "'Trip disabled successfully' DID NOT appear!");

        // 14- User verifies that the "Trip" is disabled.
        actualText = trip.labelDisabled.getText();
        expectedText = "Disabled";
        softAssert.assertEquals(actualText, expectedText, "'Trip' IS NOT disabled.");

        // 15- User clicks on "Edit" button for the added trip.
        trip.editButton.click();
        ReusableMethods.bekle(1);

        // 16- User displays "Update Trip" page.
        String actualPage = trip.labelUpdateTrip.getText();
        String expectedPage = "Update Trip";
        softAssert.assertEquals(actualPage, expectedPage, "User DID NOT display the 'Update Trip' page!");

        // 17- User clicks on "Title" box.
        // 18- User enters an updated title.
        trip.titleBox.click();
        trip.titleBox.clear();
        trip.titleBox.sendKeys(ConfigReader.getProperty("ihsanUpdatedTripTitle"));

        // 19- User clicks on "Update" button.
        trip.updateButton.click();

        // 20- User clicks on close button.
        trip.closeButton.click();

        // 21- User verifies that the trip is updated.
        String actualUpdate = trip.newTripElement.getText();
        String expectedUpdate = ConfigReader.getProperty("ihsanUpdatedTripTitle");
        softAssert.assertEquals(actualUpdate, expectedUpdate, "'Trip' IS NOT updated!");

        softAssert.assertAll();
        Driver.quitDriver();
    }

    @Test
    public void testCase10(){
        SoftAssert softAssert = new SoftAssert();
        AdminDashboard adminDashboard = new AdminDashboard();
        AssignedVehicle assignedVehicle = new AssignedVehicle();

        // 1- User go to the "https://qa.easybusticket.com/admin"
        // 2- User clicks on "Username" box.
        // 3- User enters a valid username.
        // 4- User clicks on "Password" box.
        // 5- User enters a valid password.
        // 6- User clicks the "Login" button.
        // 7- User displays the "Admin Dashboard" page.
        ReusableMethods.adminLogin("ihsanAdminUsername" , "ihsanAdminPassword");

        // 8- User clicks on "Manage Trips" menu button.
        adminDashboard.manageTripsButton.click();

        // 9- User clicks on "Assigned Vehicle" option.
        adminDashboard.assignedVehicleButton.click();

        // 10- User displays "Assigned Vehicle" page.
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.easybusticket.com/admin/manage/assigned-vehicle";
        softAssert.assertEquals(actualUrl, expectedUrl, "User DID NOT display the 'Assigned Vehicle' page!");

        // 11- User clicks on "Edit" button for the added vehicle.
        assignedVehicle.editButton.click();
        ReusableMethods.bekle(1);

        // 12- User displays "Update Assigned Vehicle" page.
        String actualPage = assignedVehicle.labelUpdateAssignedVehicle.getText();
        String expectedPage = "Update Assigned Vehicle";
        softAssert.assertEquals(actualPage, expectedPage, "User DID NOT display the 'Update Assigned Vehicle' page!");

        // 13- User clicks on "Trip" menu.
        // 14- User selects an updated option.
        Select selectTrip = new Select(assignedVehicle.dropDownUpdateTrip);
        ReusableMethods.bekle(1);
        selectTrip.selectByVisibleText(ConfigReader.getProperty("ihsanUpdatedTripName"));

        // 15- User clicks on "Vehicle" menu.
        // 16- User selects an updated option.
        Select selectVehicle = new Select(assignedVehicle.dropDownUpdateVehicle);
        selectVehicle.selectByVisibleText(ConfigReader.getProperty("ihsanUpdatedVehicle"));

        // 17- User clicks on "Update" button.
        assignedVehicle.updateButton.click();
        ReusableMethods.bekle(1);

        // 18- User verifies that "Assigned vehicle update successfully." text appeared.
        String actualText = assignedVehicle.labelUpdate.getText();
        String expectedText = "Assigned vehicle update successfully.";
        softAssert.assertEquals(actualText, expectedText, "'Assigned vehicle update successfully.' DID NOT appear!");

        // 19- User verifies that the vehicle is updated.
        String actualUpdate = assignedVehicle.newTripElement.getText();
        String expectedUpdate = ConfigReader.getProperty("ihsanUpdatedTripName");
        softAssert.assertEquals(actualUpdate, expectedUpdate, "'Vehicle' IS NOT updated!");

        // 20- User clicks on "Disable" button.

        softAssert.assertAll();
        Driver.quitDriver();
    }
}
