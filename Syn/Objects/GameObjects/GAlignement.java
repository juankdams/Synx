package GameObjects;

import Constants.CPerso;

public class GAlignement {
	//VOIR http://dofuswiki.wikia.com/wiki/Alignment
	
	//Ne pas créer de GAlignement si le personnage est neutre
	//
	
	//Alignement ID (neutre, ange, demon, mercenaire)
	//honneur
	//déshonneur
	//grade
	//
	//XP + niveau  (par les quetes) (NivMax = 5)
	//ordre (Specialisation)   (3 ordres par alignement, 5 niveaux par ordres)
	
	private byte specialization = 0;//0=neutre, 1=bonta, 2=brakmar, 3=mercenaire.
//	private short honor = 0;//dans les gstats du perso
//	private byte dishonor = 0;//dans les gstats du perso
	private byte XP = 0;//XP = en fait le nombre de Quests d'alignement faites
	private byte order = 0;//
	private boolean isActive = false;
	
	
	//XP
	public void setXP(byte xp){
		XP = xp;
	}
	public byte getXP(){
		return XP;
	}
	public void incrementXP(int add){
		XP += add;
	}
	/**
	 * Le niveau de l'alignement.
	 * @return XP % CPerso.xpForAlignmentLevel;
	 */
	public int getLevel(){
		return XP % CPerso.xpForAlignmentLevel;
	}
	
	

	//SPECIALIZATION
	public void setSpecialization(byte specialization) {
		this.specialization = specialization;
	}
	public byte getSpecialization() {
		return specialization;
	}

	//HONEUR
/*	public void setHonor(short honor) {
		this.honor = honor;
	}
	public short getHonor() {
		return honor;
	}
	public void incrementHonor(int add){
		honor += add;
	}
	public void decrementHonor(int remove){
		honor -= remove;
		if(honor < 0){
			honor = 0;
		}
	}
	public int getGrade(GWorld w){
		for(int i = w.honorXPLevels.length-1; i >= 0; i--){
			if(honor >= w.honorXPLevels[i]){
				return i+1;
			}
		}
		return 0;
	}	
	//DESHONNEUR
	public void setDishonor(byte dishonor) {
		this.dishonor = dishonor;
	}
	public byte getDishonor() {
		return dishonor;
	}
	public void incrementDishonor(int add){
		dishonor += add;
	}
	public void decrementDishonor(int add){
		dishonor -= add;
		if(dishonor < 0){
			dishonor = 0;
		}
	}
*/	
	//ORDRE
	public void setOrder(byte order) {
		this.order = order;
	}

	public byte getOrder() {
		return order;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public boolean isActive() {
		return isActive;
	}
	
	
	
	/*
FILE_BEGIN = true;
System.security.allowDomain(_parent._url);
VERSION = 145;
A = new Object();
A.a = new Object();
A.o = new Object();
A.jo = new Object();
A.at = new Object();
A.f = new Object();
A.fe = new Object();
A.b = new Object();
A.g = new Object();
A.s = new Object();
A.a[0] = {n: "Neutre", c: true};
A.a[1] = {n: "Bontarien", c: true};
A.a[2] = {n: "Brakmarien", c: true};
A.a[3] = {n: "Mercenaire", c: false};
A.jo[0] = [true, false, false, false];
A.jo[1] = [true, true, false, true];
A.jo[2] = [true, false, true, true];
A.jo[3] = [true, true, true, true];
A.at[0] = [false, false, false, false];
A.at[1] = [true, false, true, true];
A.at[2] = [true, true, false, true];
A.at[3] = [true, true, true, true];
A.o[0] = {n: "Neutre", a: 0};                               //ORDRES (branches dans lesquelles on peut évoluer)
A.o[1] = {n: "Nouvelles recrues de Bonta", a: 1};
A.o[2] = {n: "Ordre du Coeur Vaillant", a: 1};
A.o[3] = {n: "Ordre de l\'Esprit Salvateur", a: 1};
A.o[4] = {n: "Ordre de l\'Oeil Attentif", a: 1};
A.o[5] = {n: "Nouvelles recrues de Brakmar", a: 2};
A.o[6] = {n: "Ordre du Coeur Saignant", a: 2};
A.o[7] = {n: "Ordre de l\'Esprit Malsain", a: 2};
A.o[8] = {n: "Ordre de l\'Oeil Putride", a: 2};
A.o[9] = {n: "Clan de Sériane-Kerm", a: 3};
A.g[0] = [false, false, false, false];
A.g[1] = [false, true, true, false];
A.g[2] = [false, true, true, false];
A.g[3] = [false, false, false, true];
A.f[1] = {n: "Efficacité ", g: 1, e: 10};
A.f[2] = {n: "Initiative", g: 2, e: 2};
A.f[3] = {n: "Résistance à la Terre", g: 3, e: 17};
A.f[4] = {n: "Résistance au Feu", g: 4, e: 18};
A.f[5] = {n: "Résistance à l\'Eau", g: 5, e: 19};
A.f[6] = {n: "Résistance à l\'Air", g: 6, e: 20};
A.f[7] = {n: "Résistance au Neutre", g: 7, e: 21};
A.f[8] = {n: "Robustesse", g: 8, e: 4};
A.f[9] = {n: "Endurance", g: 9, e: 22};
A.f[10] = {n: "Art du Camouflage", g: 10, e: 0};
A.f[11] = {n: "Connaissance des Parchemins", g: 11, e: 0};
A.f[12] = {n: "Faculté de résurrection", g: 12, e: 0};
A.f[13] = {n: "Perte d\'énergie supplémentaire", g: 12, e: 23};
A.f[15] = {n: "Résistance aux combattants Terre", g: 3, e: 29};
A.f[16] = {n: "Résistance aux combattants Eau", g: 5, e: 31};
A.f[17] = {n: "Résistance aux combattants Air", g: 6, e: 32};
A.f[18] = {n: "Résistance aux combattants Neutre", g: 7, e: 33};
A.f[19] = {n: "Résistance aux combattants Feu", g: 4, e: 30};
A.f[20] = {n: "Prospection", g: 13, e: 40};
A.f[21] = {n: "Garde", g: 1, e: 0};
A.f[22] = {n: "Affaiblissement", g: 12, e: 23};
A.f[23] = {n: "Connaissance des potions", g: 11, e: 0};
A.fe[1] = "+#1 en portée";
A.fe[2] = "+#1 en initiative";
A.fe[3] = "+#1 aux dommages";
A.fe[4] = "+#1 en vitalité ";
A.fe[6] = "+#1 en intelligence";
A.fe[7] = "+#1 en force";
A.fe[8] = "+#1 en agilité ";
A.fe[9] = "+#1 en chance";
A.fe[10] = "+#1 aux coups critiques";
A.fe[11] = "+#1 PA";
A.fe[12] = "+#1 PM";
A.fe[13] = "+#1 en sagesse";
A.fe[14] = "+#1% en résistance à la perte de PA";
A.fe[15] = "+#1% en résistance à la perte de PM";
A.fe[16] = "#1% de remise en magasin";
A.fe[17] = "+#1% de résistance aux dommages de Terre";
A.fe[18] = "+#1% de résistance aux dommages de Feu";
A.fe[19] = "+#1% de résistance aux dommages d\'Eau";
A.fe[20] = "+#1% de résistance aux dommages d\'Air";
A.fe[21] = "+#1% de résistance aux dommages Neutres";
A.fe[22] = "+#1 en énergie";
A.fe[23] = "+#1 en énergie perdue";
A.fe[24] = "+#1 de résistance aux dommages de Terre";
A.fe[25] = "+#1 de résistance aux dommages de Feu";
A.fe[26] = "+#1 de résistance aux dommages d\'Eau";
A.fe[27] = "+#1 de résistance aux dommages d\'Air";
A.fe[28] = "+#1 de résistance aux dommages Neutres";
A.fe[29] = "+#1% de résistance aux dommages des combattants Terre ";
A.fe[30] = "+#1% de résistance aux dommages des combattants Feu";
A.fe[31] = "+#1% de résistance aux dommages des combattants Eau";
A.fe[32] = "+#1% de résistance aux dommages des combattants Air";
A.fe[33] = "+#1% de résistance aux dommages des combattants Neutres";
A.fe[34] = "+#1 de résistance aux dommages des combattants Terre";
A.fe[35] = "+#1 de résistance aux dommages des combattants Feu";
A.fe[36] = "+#1 de résistance aux dommages des combattants Eau";
A.fe[37] = "+#1 de résistance aux dommages des combattants Air";
A.fe[38] = "+#1 de résistance aux dommages des combattants Neutres";
A.fe[39] = "+#1 aux soins";
A.fe[40] = "+#1 en prospection";
A.b[0] = {s: 0, e: 10, n: "Requiem", d: "Votre alignement est si faible que sa survie est menacée."};
A.b[1] = {s: 10, e: 20, n: "Survivant", d: "Votre alignement survit difficilement dans un environnement très hostile."};
A.b[2] = {s: 20, e: 30, n: "Guerilla", d: "Votre alignement résiste envers et contre tout à l\'envahisseur !"};
A.b[3] = {s: 30, e: 40, n: "Minorité ", d: "Votre alignement est à genoux, mais il ne tardera pas à se relever."};
A.b[4] = {s: 40, e: 50, n: "Cohabitation", d: "L\'équilibre du Monde est au désavantage de votre alignement."};
A.b[5] = {s: 50, e: 60, n: "Statu quo", d: "Votre alignement domine de peu la Balance du Monde."};
A.b[6] = {s: 60, e: 70, n: "Domination", d: "Vos ennemis n\'osent plus sortir de chez eux;\r\n            votre alignement domine."};
A.b[7] = {s: 70, e: 80, n: "Tyrannie", d: "La puissance de votre alignement est telle que vous doutez de l\'existence de vos ennemis."};
A.b[8] = {s: 80, e: 90, n: "Conquérant", d: "Votre alignement n\'a plus de prédateur et la guerre est presque gagnée."};
A.b[9] = {s: 90, e: 100, n: "Apogée", d: "Votre alignement est au sommet et vos ennemis n\'existent (probablement) plus."};
A.s[0] = {n: "Neutre", d: "-", o: 0, av: 0, f: []};
A.s[1] = {n: "Néophyte", d: "Les nouvelles recrues ont fait le choix de protéger la veuve et l\'orphelin. Toutefois, leur formation débutant à peine, elles n\'ont pas encore choisi de spécialisation. Leur désir et leurs aptitudes permettront de les orienter par la suite.", o: 1, av: 0, f: []};
A.s[2] = {n: "Disciple de Menalt", d: "Désireux de développer leurs aptitudes guerrières, les disciples de Menalt doivent prouver leur courage et leur force au cours d\'entraînements longs et douloureux.", o: 2, av: 20, f: [[22, 1, [200]], [21, 1]]};
A.s[3] = {n: "Ecuyer", d: "Un Ecuyer digne de ce nom n’a cure des courbatures;\r\n            il le montrera chaque jour au cours d’entraînements très longs et très douloureux.", o: 2, av: 40, f: [[22, 2, [400]], [21, 2]]};
A.s[4] = {n: "Chevalier de l\'Espoir", d: "-", o: 2, av: 60, f: [[21, 3], [22, 3, [600]]]};
A.s[5] = {n: "Champion Merveilleux", d: "-", o: 2, av: 80, f: [[22, 4, [800]], [21, 4]]};
A.s[6] = {n: "Héros Légendaire", d: "-", o: 2, av: 100, f: [[21, 5], [22, 5, [1000]]]};
A.s[7] = {n: "Disciple de Jiva", d: "Désireux de développer leurs pouvoirs magiques, les disciples de Jiva doivent découvrir en eux-mêmes la force spirituelle qui doit les guider dans l\'apprentissage de la magie.", o: 3, av: 20, f: [[23, 1]]};
A.s[8] = {n: "Apprenti", d: "Celui ou celle qui se revendique Apprenti devra mériter ce titre honorifique, en soignant blessés et mourants au plus fort des batailles.", o: 3, av: 40, f: [[23, 2]]};
A.s[9] = {n: "Adepte des Ecrits", d: "-", o: 3, av: 60, f: [[23, 3]]};
A.s[10] = {n: "Maître des Parchemins", d: "-", o: 3, av: 80, f: [[23, 4]]};
A.s[11] = {n: "Gardien du Savoir", d: "-", o: 3, av: 100, f: [[23, 5]]};
A.s[13] = {n: "Disciple de Silvosse", d: "Désireux de développer leurs qualités d\'espion, les disciples de Silvosse doivent apprendre à récolter des informations utiles et à ne pas se faire repérer.", o: 4, av: 20, f: [[10, 1]]};
A.s[14] = {n: "Espion", d: "Se proclamer espion n’est rien. Immobile comme le chêne, silencieux comme la pierre, seul un Espion éprouvé saura écouter tout ce qui se meut ici-bas.", o: 4, av: 40, f: [[10, 2]]};
A.s[15] = {n: "Chasseur de Renégats", d: "-", o: 4, av: 60, f: [[10, 3]]};
A.s[16] = {n: "Assassin Suprême", d: "-", o: 4, av: 80, f: [[10, 4]]};
A.s[17] = {n: "Maître des Illusions", d: "-", o: 4, av: 100, f: [[10, 5]]};
A.s[18] = {n: "Néophyte", d: "Les nouvelles recrues sont issues de la fange la plus immonde qui soit. Même si leur fourberie est déjà grande, leur niaiserie n\'en fait pas des ennemis redoutables. La formation et les spécialisations qu\'ils vont suivre devraient y remédier.", o: 5, av: 0, f: []};
A.s[19] = {n: "Disciple de Djaul", d: "Animés par l\'amour de la haine, les disciples de Djaul doivent apprendre qu\'en combat, il n\'y a pas d\'ennemis, seulement des têtes à fracasser.", o: 6, av: 20, f: [[22, 1, [200]], [21, 1]]};
A.s[20] = {n: "Surineur", d: "Etre surineur à la solde de Djaul requiert de grandes qualités physiques et une immoralité à toute épreuve.", o: 6, av: 40, f: [[21, 2], [22, 2, [400]]]};
A.s[21] = {n: "Chevalier du Désespoir", d: "-", o: 6, av: 60, f: [[22, 3, [600]], [21, 3]]};
A.s[22] = {n: "Champion du Chaos", d: "-", o: 6, av: 80, f: [[21, 4], [22, 4, [800]]]};
A.s[23] = {n: "Héros de l\'Apocalypse", d: "-", o: 6, av: 100, f: [[22, 5, [1000]], [21, 5]]};
A.s[24] = {n: "Disciple d\'Hécate", d: "Animés par le vice, les disciples d\'Hécate doivent démontrer leur capacité à collecter des informations et à désinformer.", o: 7, av: 20, f: [[23, 1]]};
A.s[25] = {n: "Apprenti Sombre", d: "Celui ou celle qui se revendique Apprenti devra mériter ce titre honorifique, en ensorcelant des vivants, des morts et même des morts-vivants.", o: 7, av: 40, f: [[23, 2]]};
A.s[26] = {n: "Adepte des Douleurs", d: "-", o: 7, av: 60, f: [[23, 3]]};
A.s[27] = {n: "Maître des Sévices", d: "-", o: 7, av: 80, f: [[23, 4]]};
A.s[28] = {n: "Gardien des Tortures", d: "-", o: 7, av: 100, f: [[23, 5]]};
A.s[29] = {n: "Disciple de Brumaire", d: "Animés par un goût immodéré pour le glauque, les disciples de Brumaire doivent justifier de leurs bonnes connaissances dans l\'assortiment des ingrédients mortifères.", o: 8, av: 20, f: [[10, 1]]};
A.s[30] = {n: "Espion Sombre", d: "Drapé dans son manteau de ténèbres, l’Espion sombre saura faire couler les larmes et saigner les lames, et non l’inverse.", o: 8, av: 40, f: [[10, 2]]};
A.s[31] = {n: "Chasseur d\'Ames", d: "-", o: 8, av: 60, f: [[10, 3]]};
A.s[32] = {n: "Psychopathe", d: "-", o: 8, av: 80, f: [[10, 4]]};
A.s[33] = {n: "Maître des Ombres", d: "-", o: 8, av: 100, f: [[10, 5]]};
A.s[34] = {n: "Néophyte", d: "-", o: 9, av: 0, f: []};
A.s[36] = {n: "Apprenti Mercenaire", d: "-", o: 9, av: 20, f: [[3, 1, [1]], [2, 1, [50]], [4, 1, [1]], [5, 1, [1]], [6, 1, [1]], [13, 1, [1500]]]};
A.s[37] = {n: "Mercenaire", d: "-", o: 9, av: 40, f: [[3, 2, [2]], [4, 2, [2]], [13, 2, [3500]], [5, 2, [2]], [6, 2, [2]], [2, 2, [100]]]};
A.s[38] = {n: "Grand Mercenaire", d: "-", o: 9, av: 60, f: [[2, 3, [150]], [6, 3, [3]], [5, 3, [3]], [8, 3, [50]], [4, 3, [3]], [3, 3, [3]], [13, 3, [5500]]]};
A.s[39] = {n: "Maître Mercenaire", d: "-", o: 9, av: 80, f: [[3, 4, [4]], [11, 1], [2, 4, [200]], [13, 4, [7500]], [8, 4, [100]], [6, 4, [4]], [5, 4, [4]], [4, 4, [4]]]};
A.s[40] = {n: "Grand Maître Mercenaire", d: "-", o: 9, av: 100, f: [[4, 5, [5]], [13, 5, [9500]], [11, 1], [2, 5, [250]], [6, 5, [5]], [8, 5, [150]], [5, 5, [5]], [3, 5, [5]]]};
FILE_END = true;

	 */
	
	
}
