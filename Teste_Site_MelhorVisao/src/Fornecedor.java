

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Fornecedor {

	
	FirefoxDriver pagina;
	
	@Before
	public void antes() {
		
		System.setProperty("webdriver.gecko.driver",
				"C:\\uc13\\geckodriver.exe");
		
		pagina = new FirefoxDriver();
		pagina.get("http://10.10.139.20/cadastroFornecedor/frmFornecedor.php");
		
	}
			
			
	@Test
 public	void test() {
		
		WebElement nome = pagina.findElementByName("nome");
		nome.sendKeys("filipe");
		WebElement cnpj = pagina.findElementByName("cnpj");
		cnpj.sendKeys("444555666");
		WebElement telefone = pagina.findElementByName("telefone");
		telefone.sendKeys("(51)99988-8777");
		
		Select cidade = new Select(pagina.findElementByName("cidade")); 
		cidade.selectByIndex(2);
		
		WebElement email = pagina.findElementByName("email");
		email.sendKeys("adalto@gmail.com");
		WebElement logradouro = pagina.findElementByName("logradouro");
		logradouro.sendKeys("venancio");
		WebElement numero = pagina.findElementByName("numero");
		numero.sendKeys("4523");
		WebElement complemento = pagina.findElementByName("complemento");
		complemento.sendKeys("casa");
		WebElement bairro = pagina.findElementByName("bairro");
		bairro.sendKeys("cidade baixo");
		WebElement cep = pagina.findElementByName("cep");
		cep.sendKeys("91350-180");
		
		WebElement salvar = pagina.findElementByXPath("/html/body/form/input[11]");
		salvar.click();
	}
	
	public void depois() {
		
		
		
	}

}
