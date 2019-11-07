package alex.training.toSelenium;

import org.openqa.selenium.By;
/*
 * Selectors of the Amazon's Hamburger Menu Side Bar. Ordered from Top to Bottom.
 */

public class sideBarHamburger {
	
	
	
	
		private static final By customerProfileButton = By.xpath("//div[@id='hmenu-customer-profile']");
		private static final By hambugerOption2 = By.xpath("//div[@id='hmenu-container']//li[2]//a[1]");									//Amazon Prime Video
		private static final By hambugerOption3 = By.xpath("//ul[contains(@class,'hmenu-visible')]//li[3]//a[1]	");							//Echo y Alexa
		private static final By hambugerOption4 = By.xpath("//ul[contains(@class,'hmenu-visible')]//li[4]//a[1]");							//Amazon Music
		private static final By hambugerOption5 = By.xpath("//ul[contains(@class,'hmenu-visible')]//li[5]//a[1]");							//Amazon Fire TV
		private static final By hambugerOption6 = By.xpath("//ul[contains(@class,'hmenu-visible')]//li[6]//a[1]");							//E-Readers y eBooks Kindle
		private static final By hambugerOption7 = By.xpath("//ul[contains(@class,'hmenu-visible')]//li[7]//a[1]");							//Alimentos y Bebidas
		private static final By hambugerOption8 = By.xpath("//ul[contains(@class,'hmenu-visible')]//li[8]//a[1]");							//Libros
		private static final By hambugerOption9 = By.xpath("//ul[contains(@class,'hmenu-visible')]//li[9]//a[1]");							//Péliculas, Series de TV y Musica
		private static final By hambugerOption10 = By.xpath("//ul[contains(@class,'hmenu-visible')]//li[10]//a[1]");							//Electrónicos
		private static final By hambugerOption11 = By.xpath("//ul[contains(@class,'hmenu-visible')]//li[11]//a[1]");						//Cómputo y Tablets
		private static final By hambugerOption12 = By.xpath("//ul[contains(@class,'hmenu-visible')]//li[12]//a[1]");						//Software
		private static final By hambugerOption13 = By.xpath("//ul[contains(@class,'hmenu-visible')]//li[13]//a[1]");						//Videojuegos
		private static final By hambugerOption14 = By.xpath("//ul[contains(@class,'hmenu-visible')]//li[14]//a[1]");						//Hogar y Cocina
		private static final By hambugerOption15 = By.xpath("//ul[contains(@class,'hmenu-visible')]//li[15]//a[1]");						//Herramientas y Mejoras del Hogar
		private static final By hambugerOption16 = By.xpath("//ul[contains(@class,'hmenu-visible')]//li[16]//a[1]");						//Automotriz y Motocicletas
		private static final By hambugerOption17 = By.xpath("//ul[contains(@class,'hmenu-visible')]//li[17]//a[1]");						//Juegos y Jugetes
		private static final By hambugerOption18 = By.xpath("//ul[contains(@class,'hmenu-visible')]//li[18]//a[1]");						//Mascotas y Accesorios
		private static final By hambugerOption19 = By.xpath("//div[@id='hmenu-container']//li[19]//a[1]");									//Bebé
		private static final By hambugerOption20 = By.xpath("//div[@id='hmenu-container']//li[20]//a[1]");									//Ropa, Zapatos  y Accesorios
		private static final By hambugerOption21 = By.xpath("//ul[contains(@class,'hmenu hmenu-visible hmenu-translateX')]//li[21]//a[1]");	//Handmade
		private static final By hambugerOption22 = By.xpath("//ul[contains(@class,'hmenu hmenu-visible hmenu-translateX')]//li[22]//a[1]");	//Deportes y Aire Libre
		private static final By hambugerOption23 = By.xpath("//ul[contains(@class,'hmenu hmenu-visible hmenu-translateX')]//li[23]//a[1]");	//Salud, Belleza y Cuidado Personal
		private static final By hambugerOption24 = By.xpath("//li[24]//a[1]");																//Industria, Empresas y Ciencia
		private static final By hambugerOption25 = By.xpath("//li[25]//a[1]");																//Todas las Categorias	
		private static final By hambugerOption28 = By.xpath("//li[28]//a[1]");																//Mi Cuenta
		private static final By hambugerOption29 = By.xpath("///li[29]//a[1]");																//Ayuda
		private static final By hambugerOption30 = By.xpath("//li[30]//a[1]");																//Identificarse
		
		/*
		 * Subelemnts belonging to each hamburger menu Option
		 */
		
		//Amazon Prime Video
			private static final By apvReturn = By.xpath("//ul[contains(@class,'hmenu hmenu-visible hmenu-translateX')]//a[contains(@class,'hmenu-item hmenu-back-button')]"); //Menú Principal	
			private static final By apvOption3 = By.xpath("//ul[contains(@class,'hmenu hmenu-visible hmenu-translateX')]//li[3]//a[1]"); 	//Todos los Videos
			private static final By apvOption4 = By.xpath("//ul[contains(@class,'hmenu hmenu-visible hmenu-translateX')]//li[4]//a[1]");	//Prime Video Channels
			private static final By apvOption5 = By.xpath("//ul[contains(@class,'hmenu hmenu-visible hmenu-translateX')]//li[5]//a[1]");	//Ver en Cualquier Lugar
//			private static final By xx = By.xpath("");	//De Viaje con los Derbez
//			private static final By xx = By.xpath("");	//Tom Clancy's Jack Ryan
//			private static final By xx = By.xpath("");	//El Juego de las Llaves
//			private static final By xx = By.xpath("");	//Modern Love
//			private static final By xx = By.xpath("");	//LOL: Last One Laughing

			
}
