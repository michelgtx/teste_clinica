import javax.swing.JOptionPane;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CadastroFornecedor {
	FirefoxDriver pagina;

	@Before
	public void antes() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\181620009.SENACINFO\\eclipse\\java-oxygen\\eclipse\\geckodriver.exe");
		pagina = new FirefoxDriver();
		pagina.get("http://10.10.139.20/cadastroFornecedor/");
		
	}
	
	@Test
	public void teste() {
		WebElement login = pagina.findElementByName("login");
				login.sendKeys("filipe");
		WebElement senha = pagina.findElementByName("senha");
				senha.sendKeys("12345");		
		WebElement botao = pagina.findElementByName("entrar");
		botao.click();
		
		JOptionPane.showMessageDialog(null, "Teste ok!");
		
	}
	
    @After
    public void depois() {
    	
    }
}
