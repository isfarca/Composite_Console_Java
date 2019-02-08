package headfirst.composite.speisekarteiterator;

import java.util.*;

public class SpeisekartenTestlauf {
	public static void main(String args[]) {
		SpeisekartenKomponente pfannkuchenhausSpeisekarte = 
			new Speisekarte("PFANNKUCHENHAUS-SPEISEKARTE", "Fr�hst�ck");
		SpeisekartenKomponente restaurantSpeisekarte = 
			new Speisekarte("RESTAURANT-SPEISEKARTE", "Mittagessen");
		SpeisekartenKomponente cafeSpeisekarte = 
			new Speisekarte("CAFE-SPEISEKARTE", "Abendessen");
		SpeisekartenKomponente dessertSpeisekarte = 
			new Speisekarte("DESSERT-SPEISEKARTE", "Desserts nat�rlich!");
		SpeisekartenKomponente kaffeeSpeisekarte = new Speisekarte("KAFFEE-SPEISEKARTE", "Alles, was man zum Nachmittagskaffee essen kann");
  
		SpeisekartenKomponente alleSpeisekarten = new Speisekarte("ALLE SPEISEKARTEN", "Alle Speisekarten");
  
		alleSpeisekarten.hinzuf�gen(pfannkuchenhausSpeisekarte);
		alleSpeisekarten.hinzuf�gen(restaurantSpeisekarte);
		alleSpeisekarten.hinzuf�gen(cafeSpeisekarte);
  
		pfannkuchenhausSpeisekarte.hinzuf�gen(new Speise(
			"Spezial Pfannkuchen-Fr�hst�ck", 
			"Pfannkuchen mit R�hrei und Toast", 
			true,
			2.99));
		pfannkuchenhausSpeisekarte.hinzuf�gen(new Speise(
			"Normales Pfannkuchen-Fr�hst�ck", 
			"Pfannkuchen mit Spiegelei und W�rstche", 
			false,
			2.99));
		pfannkuchenhausSpeisekarte.hinzuf�gen(new Speise(
			"Blaubeer-Pfannkuchen",
			"Pfannkuchen mit frischen Blaubeeren und Blaubeersirup",
			true,
			3.49));
		pfannkuchenhausSpeisekarte.hinzuf�gen(new Speise(
			"Waffeln",
			"Waffeln mit Baubeeren oder Erdbeeren",
			true,
			3.59));

		restaurantSpeisekarte.hinzuf�gen(new Speise(
			"Vegetarisches Sandwich",
			"(Falscher) Schinken mit Salat und Tomaten auf Vollkornbrot", 
			true, 
			2.99));
		restaurantSpeisekarte.hinzuf�gen(new Speise(
			"Schinken-Sandwich",
			"Schinken, Salat & Tomaten auf Vollkornbrot", 
			false, 
			2.99));
		restaurantSpeisekarte.hinzuf�gen(new Speise(
			"Tagessuppe",
			"Ein Teller Suppe des Tages mit Beilagensalat", 
			false, 
			3.29));
		restaurantSpeisekarte.hinzuf�gen(new Speise(
			"Hotdog",
			"Ein Hotdog mit Sauerkraut, relish###, Zwiebeln und K�se",
			false, 
			3.05));
		restaurantSpeisekarte.hinzuf�gen(new Speise(
			"Ged�nstetes Gem�se auf braunem Reis",
			"Ged�nstetes Gem�se auf braunem Reis", 
			true, 
			3.99));
 
		restaurantSpeisekarte.hinzuf�gen(new Speise(
			"Pasta",
			"Spaghetti mit Marinara-So�e und einer Scheibe Brot",
			true, 
			3.89));
   
		restaurantSpeisekarte.hinzuf�gen(dessertSpeisekarte);
  
		dessertSpeisekarte.hinzuf�gen(new Speise(
			"Apfelkuchen",
			"Hei�er Apfelkuchen mit Sahne und Vanilleeis",
			true,
			1.59));
  
		dessertSpeisekarte.hinzuf�gen(new Speise(
			"K�sekuchen",
			"Cremiger K�sekuchen mit Kirschen",
			true,
			1.99));
		dessertSpeisekarte.hinzuf�gen(new Speise(
			"Sorbet",
			"Himbeer- und Zitronen-Sorbet",
			true,
			1.89));

		cafeSpeisekarte.hinzuf�gen(new Speise(
			"Vegetarischer Burger mit Pommes",
			"Vegatarischer Burger auf Vollkornbr�tchen mit Salat, Tomaten und Pommes",
			true, 
			3.99));
		cafeSpeisekarte.hinzuf�gen(new Speise(
			"Tagesuppe",
			"Ein Teller Suppe des Tages mit Beilagensalat",
			false, 
			3.69));
		cafeSpeisekarte.hinzuf�gen(new Speise(
			"Burrito",
			"Ein gro�er Burrito mit Bohnen, Salsa und Mais",
			true, 
			4.29));

		cafeSpeisekarte.hinzuf�gen(kaffeeSpeisekarte);

		kaffeeSpeisekarte.hinzuf�gen(new Speise(
			"Zupfkuchen",
			"Schokoladen-Vanille-Kuchen",
			true,
			1.59));
		kaffeeSpeisekarte.hinzuf�gen(new Speise(
			"Bagel",
			"Verschiedene Sorten: Sesam, Mohn, Rosinen, K�rbis",
			false,
			0.69));
		kaffeeSpeisekarte.hinzuf�gen(new Speise(
			"Kekse",
			"Drei wunderbar kr�melige Kekse",
			true,
			0.89));
 
		Kellnerin kellnerin = new Kellnerin(alleSpeisekarten);
   
		kellnerin.vegetarischeSpeisekarteAusgeben();
	}
}
