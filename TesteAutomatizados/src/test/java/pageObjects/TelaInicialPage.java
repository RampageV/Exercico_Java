package pageObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class TelaInicialPage {

	public TelaInicialPage(AppiumDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id = "com.google.android.keep:id/skip_welcome")
	private MobileElement BotaoGetStart;

	@AndroidFindBy(id = "com.google.android.keep:id/new_list_button")
	private MobileElement BataoTakeNote;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Title']")
	private MobileElement CampoTitle;
	
	@AndroidFindBy(accessibility ="Navigate up")
	private MobileElement BotaoVoltar;

	public void AcionarBotaoGetStart() {
		BotaoGetStart.click();
	}

	public void AcionarBotaoTakeNote() {
		BataoTakeNote.click();
	}
	
	public void InformacaoCampoTitle(String title) {
		CampoTitle.sendKeys(title);
	}
	
	public void AcionarBotãoVoltar() {
		BotaoVoltar.click();
	}
	
	
}
