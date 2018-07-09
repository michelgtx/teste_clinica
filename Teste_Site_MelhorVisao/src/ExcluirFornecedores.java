import java.util.List;

import javax.swing.JOptionPane;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Sleeper;

public class ExcluirFornecedores {
	
	FirefoxDriver pagina;
	
	@Before
	public void antes() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\181620089.SENACINFO\\eclipse\\java-oxygen\\eclipse\\geckodriver.exe");

		pagina = new FirefoxDriver();
		pagina.get("http://10.10.139.20/cadastroFornecedor/fornecedores.php");	
	}
	
	@Test
	public void test() {
		WebElement login = pagina.findElementByName("login");
		login.sendKeys("david");
		WebElement senha = pagina.findElementByName("senha");
		senha.sendKeys("12345");
		WebElement entrar = pagina.findElementByName("entrar");
		entrar.click();
		WebElement fornecedores = pagina.findElementByName("fornecedores");
		fornecedores.click();
			
		List<WebElement> botoesExcluir = pagina.findElementsByName("excluir");
		int total = botoesExcluir.size();
		
		WebElement botao = pagina.findElementByXPath("/html/body/table/tbody/tr[2]/td[14]/a/button");
		botao.click();
		
		List<WebElement> btnExcluir = pagina.findElementsByName("excluir");
		int novoTotal = btnExcluir.size();
		
		String mensagem = "";
		if (total != novoTotal) {
			mensagem = "Teste ok";
		}else {
			if(total == novoTotal) {
				mensagem = "Teste retornou ERRO";
			}
		}
		JOptionPane.showMessageDialog(null, mensagem);
		
		
		
	}
	
	@After
	public void depois() {
		
	}
	
	

}
