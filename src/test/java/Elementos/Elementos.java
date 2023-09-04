package Elementos;

import org.openqa.selenium.By;

	
	public class Elementos {
		
		private By corcinza = By.xpath("//*[@id=\"ui-pdp-main-container\"]/div[1]/div/div[1]/div[2]/div[4]/div/div[2]/a[5]/div/img");

		private By celular = By.xpath("//*[@id=\":R9i2kpp:\"]/div[2]/div/div/div/a/img");
		private By pesquisar = By.id("cb1-edit");
		private By bot = By.xpath("/html/body/header/div/div[2]/form/button");
		
		public By getCorcinza() {
			return corcinza;
		}

		public By getCelular() {
			return celular;
		}

		public By getPesquisar() {
			return pesquisar;
		}

		public By getBot() {
			return bot;
		}
	}


