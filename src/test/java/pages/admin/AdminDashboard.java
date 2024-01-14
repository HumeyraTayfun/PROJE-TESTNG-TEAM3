package pages.admin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminDashboard {
    public AdminDashboard(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//*[text()='Booking History']")
    public WebElement bookingHistoryButton;

    @FindBy(xpath = "//*[text()='Pending Ticket']")
    public WebElement pendingTicketButton;

    @FindBy(xpath = "//*[text()='Booked Ticket']")
    public WebElement bookedTicketButton;

    @FindBy(xpath = "//*[text()='Rejected Ticket']")
    public WebElement rejectedTicketButton;

    @FindBy(xpath = "//*[text()='All Ticket']")
    public WebElement allTicketButton;

    @FindBy(xpath = "(//*[@*='javascript:void(0)'])[8]")
    public WebElement manageTripsButton;

    @FindBy(xpath = "//*[text()='Route']")
    public WebElement routeButton;

    @FindBy(xpath = "//*[text()='Schedule']")
    public WebElement scheduleButton;

    @FindBy(xpath = "//*[text()='Ticket Price']")
    public WebElement ticketPriceButton;

    @FindBy(xpath = "//*[text()='Trip']")
    public WebElement tripButton;

    @FindBy(xpath = "//*[text()='Assigned Vehicle']")
    public WebElement assignedVehicleButton;

    @FindBy(xpath = "//*[text()='Total Verified Users']")
    public WebElement TotalVerifiedUsers;

    @FindBy(xpath = "(//*[text()='View All'])[2]")
    public WebElement ViewAllTotalVerifiedUsers;

    private final String ViewAllFilter = "/parent::*/following-sibling::*[text()='View All']";
    @FindBy(xpath = "//*[text()='Total Users']")
    public WebElement TotalUsers;

    @FindBy(xpath = "(//*[text()='View All'])[1]")
    public WebElement ViewAllTotalUsers;

    @FindBy(xpath = "//*[text()='Total Email Unverified Users']")
    public WebElement TotalEmailUnverifiedUsers;

    @FindBy(xpath = "(//*[text()='View All'])[3]")
    public WebElement ViewAllTotalEmailUnverifiedUsers;

    @FindBy(xpath = "//*[text()='Total SMS Unverified Users']")
    public WebElement TotalSMUnverifiedUsers;

    @FindBy(xpath = "(//*[text()='View All'])[4]")
    public WebElement ViewAllTotalSMSUnverifiedUsers;

    @FindBy(xpath = "(//*[text()='Successful Payment'])[1]")
    public WebElement SuccessfulPayment;

    @FindBy(xpath = "(//*[text()='View All'])[5]")
    public  WebElement ViewAllSuccessfulPayment;

    @FindBy(xpath = "//*[text()='Pending Payment']")
    public  WebElement pendingPayment;

    @FindBy(xpath = "(//*[text()='View All'])[6]")
    public WebElement ViewAllPendingPayment;

    @FindBy(xpath = "(//*[text()='Rejected Payment'])[1]")
    public WebElement RejectedPayment;

    @FindBy(xpath = "(//*[text()='View All'])[7]")
    public WebElement ViewAllRejectedPayment;

    @FindBy(xpath = "//*[text()='AC Vehicle']")
    public WebElement ACVehicle;

    @FindBy(xpath = "(//*[text()='View All'])[8]")
    public WebElement ViewAllACVehicle;

    @FindBy(xpath = "//*[text()='Non-AC Vehicle']")
    public WebElement NonACVehicle;

    @FindBy(xpath = "(//*[text()='View All'])[9]")
    public WebElement ViewAllNonACVehicle;

    @FindBy(xpath = "//*[text()='Total Counter']")
    public WebElement TotalCounter;

    @FindBy(xpath = "(//*[text()='View All'])[10]")
    public  WebElement ViewAllTotalCounter;

    @FindBy(xpath = "//*[text()='Latest Booking History']")
    public WebElement lastestBookingHistory;

    @FindBy(xpath = "//*[text()='Last 30 days Payment History']")
    public WebElement last30daysPaymentHistory;

    @FindBy(xpath = "//*[text()='Login By OS']")
    public WebElement loginByOS;

    @FindBy(xpath = "//*[text()='Login By Browser']")
    public WebElement loginByBrowser;

    @FindBy(xpath = "//*[text()='Login By Country']")
    public  WebElement loginByCountry;

    @FindBy(xpath = "//*[text()='Manage Users']")
    public WebElement  ManageUsers;

}
