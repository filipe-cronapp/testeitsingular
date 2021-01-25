public class CompraDebito {
@test
public void testcompra() 	{
		WebDriver navegador = new ChromeDriver();
 
 //Navegando para a pagina da Compra
		
        navegador.get("https://urltest.com");
		navegador.findElement(By.id("debito")).click();
		navegador.findElement(By.xpath(= "//input[@name=’numero’]")).sendKeys(" 5172665886301291");
		navegador.findElement(By.xpath(= "//input[@name=’titular’]).sendKeys("Carlos Augusto");
		navegador.findElement(By.xpath(= "//input[@name=’dataVencimento’]")).sendKeys("10/10/1990");
		navegador.findElement(By.xpath(= "//input[@name=’codSeguranca’]")).sendKeys("597");
		navegador.findElement(By.xpath(= "//a[@class = ‘Finalizar compra’]/button”)).click();
		navegador.findElement(By.xpath(="//span[contains(text(),'Seu pedido foi realizado com sucesso')]”)).getText(); 
		assertEquals("Seu pedido foi realizado com sucesso", "Seu pedido foi realizado com sucesso");
		    }
}
