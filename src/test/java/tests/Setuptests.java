package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import utils.Browser;
import utils.Utils;

import static org.junit.Assert.assertTrue;

public class Setuptests extends BaseTests {

    @Test
    public void testOpeningBrowserLoadingPage() {
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl()));
        System.out.println("Navegador aberto e carregado a URL");

    }

    @Test

    public void testCreatAccount(){

        Browser.getCurrentDriver().findElement(By.className("login")).click();
        System.out.println("clicou em login");
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl().concat("index.php?controller=authentication&back=my-account")));
        System.out.println("validou a pagina");
        Browser.getCurrentDriver().findElement(By.id("email_create")).sendKeys("testscreatlogin8@tests.com");
        System.out.println("inseriu email de preferencia");
        Browser.getCurrentDriver().findElement(By.id("SubmitCreate")).click();
        System.out.println("clicou no botao creat my account");
        Browser.getCurrentDriver().findElement(By.id("id_gender2")).click();
        System.out.println("clicou e selecionou o genero masculino");
        Browser.getCurrentDriver().findElement(By.name("customer_firstname")).sendKeys("Vivimi");
        System.out.println("preencheu nome");
        Browser.getCurrentDriver().findElement(By.name("customer_lastname")).sendKeys("Lacesoares");
        System.out.println("preencheu sobrenome");
        Browser.getCurrentDriver().findElement(By.id("passwd")).sendKeys("1234567");
        System.out.println("preencheu senha");
        Browser.getCurrentDriver().findElement(By.id("days")).sendKeys("5");
        Browser.getCurrentDriver().findElement(By.id("months")).sendKeys("May");
        Browser.getCurrentDriver().findElement(By.id("years")).sendKeys("2001");
        System.out.println("preencheu data, mes e ano de nascimento");
        Browser.getCurrentDriver().findElement(By.id("optin")).click();
        System.out.println("click opção de recebminento de ofertas especiais");
        Browser.getCurrentDriver().findElement(By.id("address1")).sendKeys("Av Joaquim Antonio");
        System.out.println("preencher nome de rua");
        Browser.getCurrentDriver().findElement(By.id("address2")).sendKeys("Numero:591 Ap125 Bloco1");
        System.out.println("preencher numero casa|ap");
        Browser.getCurrentDriver().findElement(By.id("city")).sendKeys("Sapucaia do Sul");
        System.out.println("preencheu cidade");
        Browser.getCurrentDriver().findElement(By.id("id_state")).sendKeys("Hawaii");
        System.out.println("preencheu estado");
        Browser.getCurrentDriver().findElement(By.id("postcode")).sendKeys("64531");
        System.out.println("preecheu CEP");
        Browser.getCurrentDriver().findElement(By.id("id_country")).sendKeys("United States");
        System.out.println("preencheu País");
        Browser.getCurrentDriver().findElement(By.id("other")).sendKeys("Teste Creat My Account");
        System.out.println("preencheu informações adicionais");
        Browser.getCurrentDriver().findElement(By.id("phone")).sendKeys("099 30324040");
        System.out.println("preencheu numero de telefone");
        Browser.getCurrentDriver().findElement(By.id("phone_mobile")).sendKeys("099 999324489");
        System.out.println("preencheu numero de celular");
        Browser.getCurrentDriver().findElement(By.id("alias")).sendKeys("test.account@test.com");
        System.out.println("preencheu email alternativo");
        Browser.getCurrentDriver().findElement(By.id("submitAccount")).click();
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl().concat("index.php?controller=my-account")));
        System.out.println("validou a pagina creat account");




    }


}
