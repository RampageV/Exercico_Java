package pageObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class DesafioPage {

	public DesafioPage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id = "com.socialnmobile.dictapps.notepad.color.note:id/bottom_fab")
	private MobileElement BotaoCentro;

	@AndroidFindBy(id = "com.socialnmobile.dictapps.notepad.color.note:id/icon")
	private MobileElement botaoMais;
	
	@AndroidFindBy(id = "com.socialnmobile.dictapps.notepad.color.note:id/edit_title")
	private MobileElement Titulo;
	
	@AndroidFindBy(id = "com.socialnmobile.dictapps.notepad.color.note:id/back_btn")
	private MobileElement ConfirmarTitulo;
	
	@AndroidFindBy(id = "com.socialnmobile.dictapps.notepad.color.note:id/back_btn")
	private MobileElement SairDoTitulo;
	
	@AndroidFindBy(id = "com.socialnmobile.dictapps.notepad.color.note:id/icon")
	private MobileElement clickNaColo;
	
	@AndroidFindBy(id = "com.socialnmobile.dictapps.notepad.color.note:id/txt1")
	private MobileElement CorVermelha;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@Text='Reminder']")
	private MobileElement remetente;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@Text='REMIND ME IN 15 MINUTES']")
	private MobileElement EscolhendoRemetente;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@Text='DONE']")
	private MobileElement Done;
	
	@AndroidFindBy(id = "com.socialnmobile.dictapps.notepad.color.note:id/background")
	private MobileElement entrandoNoNote;
	
	@AndroidFindBy(id = "com.socialnmobile.dictapps.notepad.color.note:id/menu_btn")
	private MobileElement TresPontos;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@Text='Check']")
	private MobileElement ClicandoCheck;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@Text='OK']")
	private MobileElement ClikandoOK;
	
	@AndroidFindBy(id = "com.socialnmobile.dictapps.notepad.color.note:id/icon")
	private MobileElement Deletando;
	
	@AndroidFindBy(id = "//android:id/button1[@Text='OK']")
	private MobileElement ConfirmandoDele;

	
	// MÉTODOS
	public void BotaoCentroo() {
		BotaoCentro.click();
	}
	
	public void  BotaoMaiss() {
		botaoMais.click();
	}
	
	public void tituloNome() {
		Titulo.sendKeys("Erick");
	}
	
	public void ConfirmarTitulo() {
		ConfirmarTitulo.click();
	}
	
	
	public void SairDeTodoTitulo() {
		SairDoTitulo.click();
	}
	
	public void ClicaNaCor() {
		clickNaColo.click();
	}
	
	public void corVermelha() {
		CorVermelha.click();
	}
	
	public void RemetenteApp() {
		remetente.click();
	}
	
	
	public void EscolhendoMelhorRemetente() {
		EscolhendoRemetente.click();
	}
	
	public void DandoDone() {
		Done.click();
	}
	
	public void EntrandoNoNote() {
		entrandoNoNote.click();
	}
	
	public void TresPontos() {
		TresPontos.click();
	}
	
	public void CheckClick() {
		ClicandoCheck.click();
	}
	
	public void ConfirmandoOk() {
		ClikandoOK.click();
	}
	
	public void Deletando() {
		Deletando.click();
	}
	
	public void DeleteConfirmado() {
		ConfirmandoDele.click();
	}
	
	
	
	
	
	



}
