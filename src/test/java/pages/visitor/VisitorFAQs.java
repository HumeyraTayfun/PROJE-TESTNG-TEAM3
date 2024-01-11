package pages.visitor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class VisitorFAQs {
    public VisitorFAQs(){
        PageFactory.initElements(Driver.getDriver(),this);}

    // "FAQs" Header Text
    @FindBy(xpath = "(//h2[@class='title'])[1]")
    public WebElement labelFaqs;

    // "Frequently Asked Questions" Body Text
    @FindBy(xpath = "(//h2[@class='title'])[2]")
    public WebElement labelFaqsBody;

    // FAQs 1. Question
    @FindBy(xpath = "(//h5[@class='title'])[1]")
    public WebElement labelQuestion1;

    // FAQs 1. Answer
    @FindBy(xpath = "(//div[@class='faq-content'])[1]")
    public WebElement labelAnswer1;

    // FAQs 2. Question
    @FindBy(xpath = "(//h5[@class='title'])[2]")
    public WebElement labelQuestion2;

    // FAQs 2. Answer
    @FindBy(xpath = "(//div[@class='faq-content'])[2]")
    public WebElement labelAnswer2;

    // FAQs 3. Question
    @FindBy(xpath = "(//h5[@class='title'])[3]")
    public WebElement labelQuestion3;

    // FAQs 3. Answer
    @FindBy(xpath = "(//div[@class='faq-content'])[3]")
    public WebElement labelAnswer3;

    // FAQs 4. Question
    @FindBy(xpath = "(//h5[@class='title'])[4]")
    public WebElement labelQuestion4;

    // FAQs 4. Answer
    @FindBy(xpath = "(//div[@class='faq-content'])[4]")
    public WebElement labelAnswer4;

    // FAQs 5. Question
    @FindBy(xpath = "(//h5[@class='title'])[5]")
    public WebElement labelQuestion5;

    // FAQs 5. Answer
    @FindBy(xpath = "(//div[@class='faq-content'])[5]")
    public WebElement labelAnswer5;

    // FAQs 6. Question
    @FindBy(xpath = "(//h5[@class='title'])[6]")
    public WebElement labelQuestion6;

    // FAQs 6. Answer
    @FindBy(xpath = "(//div[@class='faq-content'])[6]")
    public WebElement labelAnswer6;

    // FAQs 7. Question
    @FindBy(xpath = "(//h5[@class='title'])[7]")
    public WebElement labelQuestion7;

    // FAQs 7. Answer
    @FindBy(xpath = "(//div[@class='faq-content'])[7]")
    public WebElement labelAnswer7;

    // FAQs 8. Question
    @FindBy(xpath = "(//h5[@class='title'])[8]")
    public WebElement labelQuestion8;

    // FAQs 8. Answer
    @FindBy(xpath = "(//div[@class='faq-content'])[8]")
    public WebElement labelAnswer8;

    // FAQs 9. Question
    @FindBy(xpath = "(//h5[@class='title'])[9]")
    public WebElement labelQuestion9;

    // FAQs 9. Answer
    @FindBy(xpath = "(//div[@class='faq-content'])[9]")
    public WebElement labelAnswer9;

    // FAQs 10. Question
    @FindBy(xpath = "(//h5[@class='title'])[10]")
    public WebElement labelQuestion10;

    // FAQs 10. Answer
    @FindBy(xpath = "(//div[@class='faq-content'])[10]")
    public WebElement labelAnswer10;

    // FAQs 11. Question
    @FindBy(xpath = "(//h5[@class='title'])[11]")
    public WebElement labelQuestion11;

    // FAQs 11. Answer
    @FindBy(xpath = "(//div[@class='faq-content'])[11]")
    public WebElement labelAnswer11;

    // FAQs 12. Question
    @FindBy(xpath = "(//h5[@class='title'])[12]")
    public WebElement labelQuestion12;

    // FAQs 12. Answer
    @FindBy(xpath = "(//div[@class='faq-content'])[12]")
    public WebElement labelAnswer12;

    // FAQs 13. Question
    @FindBy(xpath = "(//h5[@class='title'])[13]")
    public WebElement labelQuestion13;

    // FAQs 13. Answer
    @FindBy(xpath = "(//div[@class='faq-content'])[13]")
    public WebElement labelAnswer13;
}