package pack;

public class Statics {

	//Cons
	public static final String achatsList = "!boutique pour s'y téléporter\nAchats par Commande Disponibles : \n!achat 1 (Paracape 385pts)\n!achat 2 (Paracoiffe 385pts)\n!achat 3 (Rolicape 385pts)\n!achat 4 (Rolicoiffe 385pts)\nPS: L'espace entre 'achat' et le numero est important.";
	public static final String DCcommands = "!DCcadeau";
	
	public static final String helpMessage = new StringBuilder()
	.append("===============\n")
	.append("\n.go sert à se téléporter a�une map avec ses coordonn�es: .go 'X' 'Y' 'CASE'. Exemple pour aller au zaap Astrub: <.go 4 -19 311>\n")
	.append("\n.fmcac vous coûte 1M Kamas et s'utilise sous la forme suivante: .fmcac (ELEMENT). Exemple: <.fmcac eau> Prenez note que vous devez equiper le Cac et ne pas etre en combat.\n") 
	.append("\n.tp vous indique les commandes de teleportation\n")
	.append("\n.align vous indique les commandes d'alignement\n")
	.append("\n.Pour augmenter vos stats: Le nombre que vous mettez correspond au nombre de points dont la caracteristique va augmenter(Pas aux capitaux).\n")
	.append("\n.stats vous indique vos statistiques (utile pour les objectifs)\n")
	.append("\n.objectif vous indique la liste des objectifs\n")
	.append("\n.points sert indique le nombre de points boutique que vous poss�dez.\n")
    .append("\n.double permet de delete votre double.\n")
    .append("\n!infoboutique permet de voir quelques commandes d'achat boutique.\n")
    .append("\n===============\n").toString();
	
	public static final String commandList = "Commandes Disponibles : \n.aide (Donne de l'aide/infos pour les commandes)\n.tp (Donne les commandes de t�l�portation)\n.infos\n.save (Sauvegarde votre perso et ses items)\n.vie\n.fmcac\n.parcho\n.staff\n.align (Donne les commandes d'alignement)\n.all\n.site (Donne un lien vers le site)\n.vote (Donne un lien pour aller voter)\n.forum (Donne un lien pour aller sur le forum)\n.demorph (Enl�ve votre morphe)\n.stats\n.objectif\n.points (Montre vos points boutique)\n.refresh (Refresh les monstres sur la carte)\n.double (Supprime votre double)\n.untitle (Enl�ve votre titre)\n.koli (Donne les commandes pour le Koliz�um)\n!infoboutique (Des commandes boutique)";
	
	public static final String koliCommands = "Commandes Kolizeum Disponibles : \n.inscrireKoli (Inscrit votre groupe au kolis�um (Ou votre perso si vous �tes seul))\n.desinscrireKoli (D�sinscrit votre groupe Koliz�um)\n.combatKoli (Cherche et lance automatiquement un combat Koliz�um)";
	
	
}
