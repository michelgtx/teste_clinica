import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Material {

	FirefoxDriver pagina;
	
	@Before
	public void antes() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\uc13\\geckodriver.exe");
		
		pagina = new FirefoxDriver();
		pagina.get("http://10.10.139.20/cadastroFornecedor/frmMaterial.php");
	}
	
	@Test
	public void test() {
		
		WebElement nome = pagina.findElementByName("nome");
		nome.sendKeys("testematerial2");
		
		WebElement valor = pagina.findElementByName("valor");
		valor.sendKeys("10");
		
		WebElement descricao = pagina.findElementByName("descricao");
		descricao.sendKeys("descricao");
		
		WebElement salvar = pagina.findElementByName("salvar");
		salvar.click();
	}
	
	@After
	public void depois() {
		
	}

}
