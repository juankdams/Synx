package Enums;

public enum ImPackets{

	
	
	
	/*
	 * 
	
	
	public static final String Im_Welcome = "189";
	public static final String Im_WelcomeLastConnexionAndIP = "0152;";
	public static final String Im_WelcomeLastConnexion = "0153;";
	public static final String Im_CaracConviennentPas = "119|44";
	 */

	InventairePlein("10"),//ERROR_10 = "Ton inventaire est plein, impossible d\'y ajouter d\'autres objets.";
	TropLourdBouge("12"),//ERROR_12 = "Vous êtes trop chargé. Jetez quelques objets afin de pouvoir bouger.";
	
	CanalRestreintTemps("115"),//INFOS_115 = "Ce canal est restreint pour améliorer sa lisibilité. Vous pourrez envoyer un nouveau message dans %1 secondes. Ceci ne vous autorise cependant pas pour autant à surcharger ce canal.";

	NotEnoughPlaceAround("145"),//ERROR_145 = "Il n\'y a pas assez de place ici.";
	
	WelcomeLastConnexionAndIP("152"),
	WelcomeLastConnexion("153"),
	//CaracConviennentPas("119|44"),
	//CaracConviennentPas("119|44"),
	
	Welcome("89"),//(Strenght)
	;
	/*
	 INFOS_0 = "%1";
INFOS_1 = "Tu as récupéré <b>%1</b> points de vie.";
INFOS_10 = "Tu as gagné <b>%1</b> points de force.";
INFOS_100 = "Vos prochains combats ne seront plus joignables uniquement par votre groupe.";
INFOS_101 = "Personne ne sera autorisé à rejoindre vos prochains combats.";
INFOS_102 = "Tout le monde sera autorisé à rejoindre vos prochains combats.";
INFOS_103 = "Demande d\'aide signalée...";
INFOS_104 = "Demande d\'aide annulée...";
INFOS_105 = "Votre monture apprécie le repas.";
INFOS_106 = "Pour utiliser le canal d\'alignement vous devez développer vos ailes à 3 ou plus, ou encore avoir choisi une spécialisation par les quêtes d\'alignement (niveau de quêtes à partir de 20)";
INFOS_107 = "Surveille ton langage, t\'es pas un Bwork.";
INFOS_108 = "Avertissement avant sanction.";
INFOS_109 = "Le dieu Sram sème la confusion mentale dans l\'esprit du joueur.";
INFOS_11 = "Tu as gagné <b>%1</b> points de chance.";
INFOS_110 = "Votre monture%1 a été reprise de l\'enclos %2 par %3";
INFOS_111 = "Votre monture mâle sauvage%1 s\'est enfui aussitôt après avoir fécondé une femelle (enclos en %2).";
INFOS_112 = "Votre monture sauvage femelle%1, aussitôt après avoir mis bas, s\'est enfuie.";
INFOS_113 = "Par respect pour les autres aventuriers, vous décidez après mûre réflexion de ne pas céder à la tentation de participer à la cacophonie d\'ordinaire habituelle de ces lieux.";
INFOS_114 = "Impossible d\'afficher des objets dans ce canal.";
INFOS_115 = "Ce canal est restreint pour améliorer sa lisibilité. Vous pourrez envoyer un nouveau message dans %1 secondes. Ceci ne vous autorise cependant pas pour autant à surcharger ce canal.";
INFOS_116 = "<b>Avertissement</b> : %1";
INFOS_117 = "Malgré vos talents, la magie n\'opère pas et vous sentez l\'échec de la transformation, ainsi que la diminution de la puissance de l\'objet.";
INFOS_118 = "Vous n\'arrivez pas à assembler correctement les ingrédients, et vous n\'arrivez pas à concevoir quoi que ce soit d\'utilisable cette fois.";
INFOS_119 = "« Miroir, mon beau miroir ... » Le miroir ne semble pas disposé à répondre à vos préoccupations esthétiques.";
INFOS_12 = "Tu as gagné <b>%1</b> points d\'agilité.";
INFOS_120 = "L\'horloge indique %1h%2.";
INFOS_121 = "Cette horloge ne semble pas fonctionner.";
INFOS_122 = "Sont-ce les restes d\'une beuverie ou des encres d\'imprimerie ?";
INFOS_123 = "Vous créez : °0";
INFOS_124 = "Une pensée vous vient à l\'esprit : « Quel beau portrait de ma grand tante Danielle ! ... » ";
INFOS_125 = "« coco ? » ";
INFOS_126 = "« Il est exactement %1h%2. Coco » ";
INFOS_127 = "Cette horloge n\'est pas à l\'heure, elle indique %1h%2.";
INFOS_128 = "« Vous a-t-on déjà dit que vous ressembliez à %1 ? » s\'enquit le miroir.";
INFOS_129 = "« Je détiens la force toute puissante! » ";
INFOS_13 = "Tu as gagné <b>%1</b> points de vitalité.";
INFOS_130 = "« Savez-vous planter les choux ... » ";
INFOS_131 = "« Ci-gît Hector, niveau 197, tué par le cri d\'un Tofu affamé. » ";
INFOS_132 = "« Attention ! Peinture fraîche » ";
INFOS_133 = "« PIOU PIOU » ";
INFOS_134 = "Cet oiseau empaillé, rembourré à la fleur de chanvre, sent bon le bwork malade.";
INFOS_135 = "Vous vous réchauffez au coin du poêle. Il fait bon dans la pièce.";
INFOS_136 = "Le poêle est éteint.";
INFOS_137 = "Cet oiseau n\'a pas l\'air en forme, il vaudrait mieux l\'achever d\'un bon coup d\'épée ...";
INFOS_138 = "Le piou se jette sur vous et vous arrache les yeux ... \nAh non, c\'est une illusion, quelqu\'un vous en veut ...";
INFOS_139 = "Vous ne pouvez plus parler dans ce canal, seuls les débutants présents dans Incarnam le peuvent. Vous pouvez néanmoins leur répondre en message privé pour les aider.";
INFOS_14 = "Tu as gagné <b>%1</b> points d\' intelligence.";
INFOS_140 = "Un tofu peinturluré s\'échappe du tableau et vous attaque.";
INFOS_141 = "Le tofu collé à la toile par la peinture semble vouloir se détacher du tableau.";
INFOS_142 = "Le tofu est maintenant bien fixé ! Marylork est un vrai artiste réaliste.";
INFOS_143 = "%1 est en ligne.";
INFOS_144 = "Votre inventaire est plein. Votre récolte est perdue...";
INFOS_145 = "Vous faites halte devant cette œuvre de magnificence, et l\'ayant admiré en votre cœur, vous vous exclamez avec enthousiasme : « Voilà donc le héros d\'endurance qui, des épreuves des dieux, a su triompher. Voici donc le visage de ce guerrier légendaire qui sous l\'égide de Féca atteignit le pinacle du firmament ». Puis, pour pondérer votre envolée lyrique, vous ajoutez : « Rhô ke c bo, il r0xX ! ».";
INFOS_146 = "Que je suis beau !";
INFOS_147 = "Après vérification de ses registres, un gardien d\'étable vous annonce, qu\'il a libéré la monture dénommée « %1 » que vous lui aviez confié.  \nIl était, en effet, sans nouvelles de vous ou de son nouveau propriétaire dans les délais fixés lors de l\'échange.";
INFOS_148 = "Les ailes sanglantes de Sacrieur, la Déesse des Martyrs, s\'ouvrent devant vos yeux ébahis.\nCette statue apparut lors de l\'avènement de la Déesse, générée par les pensées réunies de milliers de fidèles.";
INFOS_149 = "Cette armure ancienne semble cacher les restes d\'un passage secret qui a dû s\'écrouler il y a bien longtemps.\nPeut-être qu\'avec une pelle, une pioche, et beaucoup de courage... Hm, après réflexion, en fait non.";
INFOS_15 = "Tu as gagné <b>%1</b> points de caractéristique.";
INFOS_150 = "De la main de <b>%2</b>, <b>%1</b> dit : %3";
INFOS_151 = "Votre <b>%1</b> vous murmure : %2";
INFOS_152 = "Précédente connexion sur votre compte effectuée le %3/%2/%1 à %4:%5 via l\'adresse IP %6";
INFOS_153 = "Votre adresse IP actuelle est %1.";
INFOS_154 = "Tu as oublié un sort de niveau %1 et tu as regagné %2 points de sort.";
INFOS_155 = "Votre présence dans ce territoire ne vous a pas procuré d\'honneur cette fois, vous aviez déjà vaillamment défendu il y a peu. Le prochain combat sera sans doute plus valorisant !";
INFOS_156 = "La porte du tribunal est fermée à clef.";
INFOS_157 = "Ce canal n\'est accessible en diffusion aux abonnés qu\'à partir du niveau %1.";
INFOS_158 = "Votre dragodinde %1 a été mise dans votre enclos suite à la vente de la ferme dans laquelle elle se trouvait.";
INFOS_159 = "Votre arme ne peut contenir autant de runes ! Toutes les runes vous ont été rendues.";
INFOS_16 = "Tu as gagné <b>%1</b> points de sort.";
INFOS_160 = "Sanctuaire Hotomani";
INFOS_161 = "Une force invisible vous empêche de passer";
INFOS_162 = "Plus que <b>%2</b> tour(s) avant la déconnexion de <b>%1</b>";
INFOS_163 = "<b>%1</b> a visé le mur.";
INFOS_164 = "Vous vous regardez dans le miroir, vous êtes moche.";
INFOS_165 = "Nouveau challenge : %1 !";
INFOS_166 = "Challenge échoué !";
INFOS_167 = "Challenge réussi !";
INFOS_168 = "Message automatique : Le joueur <b>%1</b> a été rendu muet pour ne pas avoir respecté les règles. <b>%1</b> ne pourra pas vous répondre avant <b>%2</b> minutes.";
INFOS_169 = "(...) Riyou Tchevlakouk, citoyen bénévole de Bonta, est en charge du dressage des crocs glands, au bâtiment annexe à l\'hôtel de vente des animaux.";
INFOS_17 = "Tu as gagné <b>%1</b> XP dans le métier <b>%2</b>.";
INFOS_170 = "En montant sur le bâtiment vous apercevez un milicien bontarien se dirigeant vers Astrub.";
INFOS_171 = "Vous trouvez des traces de lutte et des restes de Karne.";
INFOS_172 = "Cette porte est verrouillée. Impossible de la forcer.";
INFOS_173 = "Vous ne pouvez pas dérober le document tant que le garde vous surveille.";
INFOS_174 = "Il vous faut un Tonneau en Bombu pour transporter l\'hydre au miel.";
INFOS_175 = "Contrat rempli ! Retournez auprès de votre commanditaire.";
INFOS_176 = "Tu as quitté ta guilde";
INFOS_177 = "Tu as banni <b>%1</b> de ta guilde.";
INFOS_178 = "Tous les membres du groupe suivent vos déplacements.";
INFOS_179 = "Contrat échoué ! Retournez auprès de votre commanditaire.";
INFOS_18 = "%1 vous a mis à la porte de sa maison...";
INFOS_180 = "Vous avez survécu au chasseur de tête <b>%1</b> !";
INFOS_181 = "Votre monture %1 a été retirée de l\'enclos %2 par %3 et mise dans votre étable.";
INFOS_182 = "Le message au joueur <b>%1</b> est en cours d\'envoi via son accès mobile...";
INFOS_183 = "Malgré vos talents, la magie n\'opère pas et vous sentez l\'échec de la transformation.";
INFOS_184 = "Vous avez placé la monture %1 dans l\'enclos de son propriétaire.";
INFOS_185 = "Au milieu des armes est rangé le manuscrit de la chanson Je sais que tu combats composée et interprétée par le ménestrel Francisque Kabroule lors de la cérémonie d\'ouverture de l\'arène.";
INFOS_186 = "Vous avez été expulsé du village suite à sa capture par vos ennemis.";
INFOS_187 = "Suite à la capture du village par vos ennemis, vous en serez expulsé à la fin du combat.";
INFOS_188 = "Et comme d\'habitude, c\'est à <b>%1</b> que l\'on doit cet exploit...";
INFOS_189 = "[wait_mod_Br8190] Des jets de lave jaillissent, bloquant votre avancée.";
INFOS_19 = "%1 avait d\'autres clients et a dû vous laisser.";
INFOS_190 = "[wait_mod_Bo8190] Un combat a eu lieu ici. Vous devriez interroger le voisinage pour en savoir plus.";
INFOS_191 = "[wait_mod_Bo9100] La statuette semble n\'avoir aucun effet, vous l\'avez sans doute cassée. C\'est Jiva qui va être fâchée.";
INFOS_192 = "Un champ de force magique vous empêche de passer.";
INFOS_193 = "[WIP] Précédente connexion sur votre compte effectuée le %3/%2/%1 à %4:%5";
INFOS_194 = "La magie n\'a pas parfaitement fonctionné, une des caractéristiques de l\'objet a baissé en puissance.";
INFOS_195 = "Ledrob Terceséc vous surveillant, il vaut mieux éviter de fouiller dans ses affaires.";
INFOS_196 = "[Wip] Réservé pour Dofus 2";
INFOS_197 = "[Wip] Réservé pour Dofus 2";
INFOS_198 = "Un Bontarien interrompt vos recherches.";
INFOS_199 = "Le buisson est vide. Les branches cassées indique que quelqu\'un a profité de votre combat pour dérober ce qui était caché ici. Oto Mustam va être mécontent.";
INFOS_2 = "Tu as appris le métier <b>%1</b>.";
INFOS_20 = "Tu as dû donner %1 kamas pour pouvoir accéder à ce coffre.";
INFOS_200 = "Quelque chose de puissant est passé par ici, mais le portail est maintenant refermé.";
INFOS_201 = "En application du décret contre les mutants de l\'officier Kelly, l\'accès à l\'arène est interdit aux mutants.";
INFOS_202 = "Tes caractéristiques ne conviennent pas";
INFOS_203 = "Tu n\'as pas le niveau nécessaire.";
INFOS_204 = "Tu n\'exerces pas le métier nécessaire.";
INFOS_205 = "[wait_mod_Bo9100] Nul ne peut retourner dans le sanctuaire tant que l\'enchantement de Terrakourial fait effet.";
INFOS_206 = "[NO_TRAD] Les fontaines de jouvence n\'ont plus d\'effet régénérateur à votre niveau.";
INFOS_207 = "[NO_TRAD] Le message inconnu n°%1 n\'a pu être affiché ";
INFOS_208 = "Vous n\'êtes pas encore autorisé à entrer sur cette île. Vous devriez vous renseigner auprès du garde Pandawa.";
INFOS_209 = "Vous n\'exercez pas le métier nécessaire.";
INFOS_21 = "Tu as obtenu %1 \'%2\'.";
INFOS_210 = "Vous devez équiper votre outil pour cette action.";
INFOS_211 = "[WIP]Réservé à Dofus 2";
INFOS_22 = "Tu as perdu %1 \'%2\'.";
INFOS_23 = "Tu viens de récupérer %1 points de stats.";
INFOS_24 = "Tu viens de mémoriser un nouveau zaap.";
INFOS_25 = "Votre familier vous fait la fête !";
INFOS_26 = "Vous donnez à manger à votre familier alors qu\'il n\'avait plus faim. Il se force pour vous faire plaisir";
INFOS_27 = "Vous donnez à manger à répétition à votre familier déjà obèse. Il avale quand même la ressource et fait une indigestion.";
INFOS_28 = "Vous donnez à manger à votre familier tout famélique. Il dévore tout le plus rapidement possible et son estomac en souffre. Mais il reprend du poids.";
INFOS_29 = "Vous donnez à manger à votre familier. Il semble qu\'il avait très faim.";
INFOS_3 = "Tu as appris le sort <b>%1</b>.";
INFOS_30 = "Vous donnez à manger à votre gros familier qui se précipite dessus tellement il semble avoir faim. Il mange trop rapidement et se fait mal. Au moins il a maigri un peu";
INFOS_31 = "Vous donnez à manger à votre familier famélique qui traînait comme un zombi. Il se force à manger mais la nourriture qu\'il avale fait 3 fois son estomac et il se tord de douleur. Au moins il a mangé.";
INFOS_32 = "Votre familier apprécie le repas.";
INFOS_33 = "Tu viens de ressusciter, mais ton énergie est encore faible. Prends garde ou les esprits te rattraperont.";
INFOS_34 = "Tu as perdu <b>%1</b> points d\'énergie.";
INFOS_36 = "%1 vient de rejoindre le combat en spectateur.";
INFOS_37 = "Vous êtes désormais considéré comme absent.";
INFOS_38 = "Vous n\'êtes plus considéré comme absent.";
INFOS_39 = "Le mode \'spectateur\' est activé.";
INFOS_4 = "Ton humeur guerrière reprend le dessus. Tu peux être défié...";
INFOS_40 = "Le mode \'spectateur\' est désactivé.";
INFOS_42 = "La milice a envoyé du renfort pour aider l\'équipe de %1 à se défendre.";
INFOS_43 = "Ton alignement vient d\'augmenter de %1 et est désormais de %2.";
INFOS_44 = "Ton alignement est désormais de %1.";
INFOS_45 = "Tu as gagné %1 kamas.";
INFOS_46 = "Tu as perdu %1 kamas.";
INFOS_47 = "Ton mariage avec %1 a été annulé.";
INFOS_48 = "Le mariage entre %1 et %2 a été annulé.";
INFOS_49 = "En voyant cette porte ainsi illuminée, votre larve dorée s\'est précipité pour la franchir, vous n\'avez pas pu la suivre. Nul doute qu\'elle rejoindra les autres larves maintenant. Une perle dorée gît là où la larve se trouvait quelques secondes auparavent.";
INFOS_5 = "Tu es maintenant tranquille. On ne peut plus te défier...";
INFOS_50 = "Vous êtes maintenant en mode invisible.";
INFOS_51 = "Vous n\'êtes plus en mode invisible.";
INFOS_52 = "<b>%1</b> suit votre déplacement.";
INFOS_53 = "<b>%1</b> ne suit plus votre déplacement.";
INFOS_54 = "Nouvelle quête : <b>%1</b>";
INFOS_55 = "Quête mise à jour : <b>%1</b>";
INFOS_56 = "Quête terminée : <b>%1</b>";
INFOS_57 = "Vous ne disposez pas d\'assez de kamas pour acquiter la taxe de mise en vente...";
INFOS_58 = "Vous ne pouvez pas mettre plus d\'objets en vente actuellement...";
INFOS_59 = "Vous ne pouvez pas mettre plus d\'objets en vente actuellement...";
INFOS_6 = "Position sauvegardée.";
INFOS_60 = "Cet objet ne peut être accepté ici vu sa rareté...";
INFOS_61 = "Cet objet ne fait pas partie des catégories prévues dans cet hôtel de vente.";
INFOS_62 = "Action annulée pour cause de surcharge...";
INFOS_63 = "Vous ne disposez pas d\'assez de kamas pour acheter cet objet.";
INFOS_64 = "Cet objet n\'est plus disponible à ce prix. Quelqu\'un a été plus rapide...";
INFOS_65 = "Votre compte en banque a été crédité de %1 kamas suite à la vente de \'%3\'.";
INFOS_66 = "Votre objet bon marché a été acheté immédiatement par les miliciens qui en feront, bien entendu, très bon usage. Votre compte en banque a été crédité de %1 kamas.";
INFOS_67 = "Un de vos objets n\'a pas été vendu dans le temps limite. Vous le retrouverez à votre banque.";
INFOS_68 = "Lot acheté.";
INFOS_69 = "Les autres vous voient maintenant hors ligne...";
INFOS_7 = "Tu as récupéré <b>%1</b> points d\'énergie.";
INFOS_70 = "Les autres vous revoient en ligne à nouveau.";
INFOS_71 = "Les autres vous voient maintenant hors ligne, sauf vos amis.";
INFOS_72 = "Vous êtes actuellement absent, cette personne risque de ne pas pouvoir vous répondre...";
INFOS_73 = "Votre compte en banque a été crédité de %1 kamas suite à la vente de %4 \'%3\' lorsque vous étiez hors jeu.";
INFOS_74 = "Tu as gagné <b>%1</b> points d\' honneur.";
INFOS_75 = "Tu as gagné <b>%1</b> points de déshonneur.";
INFOS_76 = "Tu as perdu <b>%1</b> points d\' honneur.";
INFOS_77 = "Tu as perdu <b>%1</b> points de déshonneur.";
INFOS_78 = "Vous avez dû lâcher votre arme à deux mains pour équiper un bouclier.";
INFOS_79 = "Vous avez dû lâcher votre bouclier pour équiper une arme à deux mains.";
INFOS_8 = "Tu as gagné <b>%1</b> points d\'expérience.";
INFOS_80 = "Vous gagnez %1 points d\'honneur en récompense de votre bravoure.";
INFOS_81 = "Vous perdez %1 points d\'honneur suite à cette défaite.";
INFOS_82 = "Votre bravoure vous a fait grimper au rang %1.";
INFOS_83 = "Vous avez été dégradé au rang %1.";
INFOS_84 = "Vous êtes sanctionné par %1 point(s) de déshonneur pour ce combat déshonorant";
INFOS_85 = "Vous rachetez votre déshonneur de %1 point(s) avec cet acte de bravoure.";
INFOS_9 = "Tu as gagné <b>%1</b> points de sagesse.";
INFOS_91 = "Vous avez été téléporté hors d\'une zone alignée ennemie...";
INFOS_92 = "Vous avez récupéré %1 points d\'énergie en vous reposant.";
INFOS_93 = "L\'équipe n\'accepte désormais que les membres du groupe du personnage principal.";
INFOS_94 = "L\'équipe accepte les membres de tous les groupes.";
INFOS_95 = "L\'équipe n\'accepte plus de personnages supplémentaires.";
INFOS_96 = "L\'équipe accepte de nouveau des personnages supplémentaires.";
INFOS_97 = "Les spectateurs seront admis initialement dans vos prochains combats.";
INFOS_98 = "Les spectateurs seront refusés initialement dans vos prochains combats.";
INFOS_99 = "Vos prochains combats seront joignables uniquement par votre groupe.";
	 */
	
	
	
	
	
	
	/*
	 ERROR = "Erreur : %1";
ERROR_1 = "Certaines conditions ne sont pas satisfaites";
ERROR_10 = "Ton inventaire est plein, impossible d\'y ajouter d\'autres objets.";
ERROR_100 = "Vous n\'appartenez pas à la bonne guilde pour profiter de cet enclos.";
ERROR_101 = "Vous ne disposez pas des droits de guildes suffisants pour cette opération.";
ERROR_102 = "Cellule cible invalide.";
ERROR_103 = "Impossible d\'acheter un enclos supplémentaire. Une guilde peut acquérir un enclos après son niveau 10, puis un supplémentaire par tranche de 10 niveaux. Il faut en outre que la guilde soit agée de plus de 2 mois.";
ERROR_104 = "Monture désignée invalide.";
ERROR_105 = "L\'étable est pleine. Vous ne pouvez conserver que 100 montures maximum.";
ERROR_106 = "Votre inventaire de monture doit être vide pour pouvoir la déséquiper.";
ERROR_107 = "L\'enclos est plein pour le moment.";
ERROR_108 = "Cette monture n\'est plus disponible. Elle a dû s\'enfuir. Les certificats ne permettent de conserver une monture qu\'un temps limité.";
ERROR_109 = "Attention ! Bavasser comme un Porkass est mal vu des autres aventuriers.";
ERROR_11 = "Vous avez déjà appris ce métier.";
ERROR_110 = "A peine entrée dans l\'étable, votre monture s\'accroupit et commence à mettre bas. Après quelques instants, vous pouvez constater que tout s\'est bien passé. Vous voilà responsable d\'une nouvelle monture.";
ERROR_111 = "A peine entrée dans l\'étable, votre monture s\'accroupit et commence à mettre bas. Après quelques instants, vous pouvez constater que tout s\'est bien passé. Vous voilà responsable de %1 nouvelles montures.";
ERROR_112 = "Votre monture semble souffrir, et commence à mettre bas sa progéniture. Hélas, vous avez trop tardé à venir l\'accompagner dans son travail, et son petit ne survit pas.";
ERROR_113 = "Impossible de monter sur votre monture, elle est épuisée... Nourrissez-la, ou laissez-la se reposer dans un enclos.";
ERROR_114 = "Votre monture, épuisée, refuse de vous porter plus loin.";
ERROR_115 = "Seuls les comptes abonnés peuvent profiter des montures.";
ERROR_116 = "Impossible dans votre état actuel.";
ERROR_117 = "Impossible d\'être sur une monture à l\'intérieur d\'une maison.";
ERROR_118 = "Impossible d\'entrer dans une demeure en restant sur sa monture.";
ERROR_119 = "Impossible d\'acheter un enclos sans avoir de monture.";
ERROR_12 = "Vous êtes trop chargé. Jetez quelques objets afin de pouvoir bouger.";
ERROR_120 = "Impossible d\'interagir avec votre percepteur sur la carte même où vous vous êtes connecté.";
ERROR_121 = "Avertissement avant sanction.";
ERROR_122 = "L\'abus de points d\'exclamations est dangereux pour la santé !!!";
ERROR_123 = "Le principe de précaution vous a rendu muet pour %1 seconde(s).";
ERROR_124 = "A force de trop parler, vous en avez perdu la voix. Vous devriez vous taire pendant les %1 prochaines secondes.";
ERROR_125 = "Le gardien de l\'enclos a perdu trace de votre monture. Il vous propose en échange une même monture, mais qui vient de naître. C\'est toujours mieux que rien...";
ERROR_126 = "Vous n\'avez pas les droits nécessaires.";
ERROR_127 = "Incarnam ne vous est plus accessible désormais, votre expérience fait de vous un aventurier apte à parcourir le monde sans continuer dans cette zone...";
ERROR_128 = "Le montant de la transaction s\'élève à %1 kamas. Malheureusement vous n\'avez actuellement pas cette somme sur vous.";
ERROR_129 = "Vous ne pouvez pas poser ceci au sol.";
ERROR_13 = "Cette action n\'est pas autorisée sur cette carte.";
ERROR_130 = "Vous ne pouvez pas atteindre cet endroit depuis votre position actuelle.";
ERROR_131 = "Il faut être abonné ";
ERROR_132 = "Il est interdit d\'attaquer ceci pendant encore %1 minute(s).";
ERROR_133 = "Il est trop tôt";
ERROR_134 = "Ce n\'est pas le bon moment";
ERROR_135 = "Vous devez appartenir à une guilde pour profiter de cette possibilité.";
ERROR_136 = "La téléportation vers cette maison de guilde n\'a pas été autorisée par son propriétaire.";
ERROR_137 = "Vous êtes à court de potion de foyer de guilde.";
ERROR_138 = "Votre percepteur est de mauvaise humeur, pour pouvoir récolter son butin revenez plus tard (%1h).";
ERROR_139 = "Attention, la fenêtre d\'échange se fermera automatiquement dans %1 minutes.";
ERROR_14 = "Le joueur %1 était absent et n\'a donc pas reçu votre message.";
ERROR_140 = "La destination est en territoire hostile.";
ERROR_141 = "La téléportation vers cette zone n\'est pas autorisée aux joueurs neutres.";
ERROR_142 = "Les tombes sont interdites en donjon, vous avez été ramené à votre dernier point de sauvegarde.";
ERROR_143 = "Vous ne pouvez plus accéder à ce prisme.";
ERROR_144 = "Vous avez besoin de vos ailes pour voler jusqu\'à un autre prisme.";
ERROR_145 = "Il n\'y a pas assez de place ici.";
ERROR_146 = "Vous ne pouvez pas poser de prisme sur cette carte.";
ERROR_147 = "Vous ne pouvez pas poser de prisme dans cette zone.";
ERROR_148 = "Pour poser un prisme il vous faut au préalable parader ostensiblement avec vos jolies ailes, tel un paon, pendant une période de 5 minutes.";
ERROR_149 = "Il y a déjà un prisme dans cette zone.";
ERROR_15 = "Pour des raisons de maintenances, le serveur va être redémarré dans %1.";
ERROR_150 = "Vous ne pouvez pas dissimuler vos ailes en ce lieu.";
ERROR_151 = "Impossible d\'acheter une maison supplémentaire. Une guilde peut partager une maison après son niveau 10, puis une supplémentaire par tranche de 10 niveaux. Il faut en outre que la guilde soit agée de plus de 2 mois.";
ERROR_152 = "Vous ne pouvez pas poser de prisme dans cette zone : vous ne possédez pas assez de territoires de base.";
ERROR_153 = "Vous ne pouvez pas poser de prisme dans cette zone : il reste trop d\'ennemis. Pourchassez les ennemis encore présents pour que la balance du territoire vous soit favorable.";
ERROR_154 = "Vous ne pouvez pas attaquer ce prisme durant sa première heure de vie.";
ERROR_155 = "Vous devez être au minimum niveau 10 et de grade 3 pour poser un prisme.";
ERROR_156 = "Vous ne pouvez prendre la place que d\'un joueur ayant un grade inférieur au vôtre. Les plus haut gradés sont prioritaires !";
ERROR_157 = "Vous ne pouvez pas attaquer ce prisme, vos territoires sont trop éloignés pour permettre une percée dans cette zone.";
ERROR_158 = "Seuls les téméraires triomphant d\'une quête précise sont bienvenus.";
ERROR_159 = "Vous êtes à court de potion d\'enclos de guilde.";
ERROR_16 = "%1 : %2";
ERROR_160 = "Vous ne pouvez pas attaquer ce prisme dans cette zone : trop d\'ennemis sont présents. Pourchassez les ennemis encore présents ou attaquez dans une zone moins peuplée pour que la balance du territoire vous soit favorable.";
ERROR_161 = "Vous ne pouvez pas équiper un objet vivant directement, essayez plutôt de l\'associer sur un objet équipé qu\'il affectionne.";
ERROR_162 = "Vous ne pouvez pas associer un objet vivant à un objet inanimé non échangeable.";
ERROR_163 = "Votre objet vivant n\'a pas l\'air de vouloir ingurgiter quoi que ce soit pour le moment.";
ERROR_164 = "Une sauvegarde du serveur est en cours... Vous pouvez continuer de jouer, mais l\'accès au serveur est temporairement bloqué. La connexion sera de nouveau possible d\'ici quelques instants. Merci de votre patience.";
ERROR_165 = "La sauvegarde du serveur est terminée. L\'accès au serveur est de nouveau possible. Merci de votre compréhension.";
ERROR_166 = "Votre personnage ne peut s\'incarner tout de suite dans cet avatar, entre deux incarnations vous devez vous reposer au moins une minute.";
ERROR_167 = "Vous ne pouvez pas poser de percepteur ici avant %1 minutes";
ERROR_168 = "Vous ne pouvez pas poser plus de %1 percepteur(s) par zone.";
ERROR_169 = "Impossible de lancer ce sort : vous ne le possédez pas !";
ERROR_17 = "%1 vous a rendu muet pour %2 minute(s).";
ERROR_170 = "Impossible de lancer ce sort : Vous avez %1 PA disponible(s) et il vous en faut %2 pour ce sort !";
ERROR_171 = "Impossible de lancer ce sort : Vous avez une portée de %1 à %2 et vous visez à %3 !";
ERROR_172 = "Impossible de lancer ce sort : la cellule visée n\'est pas disponible !";
ERROR_173 = "Impossible de lancer ce sort autrement qu\'en ligne droite !";
ERROR_174 = "Impossible de lancer ce sort : un obstacle gène votre vue !";
ERROR_175 = "Impossible de lancer ce sort actuellement.";
ERROR_176 = "Votre monture est trop jeune pour être chevauchée. Il faut d\'abord l\'élever correctement en enclos pour qu\'elle grandisse un peu...";
ERROR_177 = "Vous avez trop d\'objets dans votre inventaire, vous ne pouvez pas les voir tous.";
ERROR_178 = "Vous avez trop de montures à l\'étable, retirez-en quelque-unes pour les voir toutes.";
ERROR_179 = "Vous avez trop d\'objets dans votre banque, retirez-en quelque-uns pour les voir tous.";
ERROR_18 = "L\'heure actuelle ne convient pas.";
ERROR_180 = "Ce percepteur est en train d\'être récolté, vous ne pouvez pas l\'attaquer.";
ERROR_181 = "Cette rune est trop puissante pour être ajoutée sur cette arme.";
ERROR_182 = "<b>%1</b> vient d\'être déconnecté, il quittera la partie dans <b>%2</b> tour(s) s\'il ne se reconnecte pas avant.";
ERROR_183 = "La zone \'Incarnam\' fonctionne sur plusieurs instances, pour éviter qu\'un trop grand nombre de joueurs soient présent dans cette zone de petite taille. Ceci signifie qu\'il existe plusieurs \'Incarnam\' en parallèle, afin qu\'il n\'y ait pas plus d\'un certain nombre de joueurs dans la même instance. Vous pouvez donc ne pas être dans le même \'Incarnam\' que vos amis, pour les rejoindre, vous pouvez utiliser la liste d\'amis, et vous retrouver instantanément à leurs côtés, à conditions qu\'ils soient eux aussi dans Incarnam en dehors des grottes et donjons.";
ERROR_184 = "<b>%1</b> vient de se reconnecter en combat.";
ERROR_185 = "Vous ne pouvez pas vous incarner en étant mort.";
ERROR_186 = "Comme ton équipe a remporté le combat, ton personnage <b>%1</b> a été sauvé de justesse d\'une mort affreuse.";
ERROR_187 = "Une déconnexion massive a été détectée : ton personnage <b>%1</b> est sauvé d\'une mort affreuse.";
ERROR_188 = "Une déconnexion massive a été détectée : le combat est annulé.";
ERROR_189 = "Il y a déjà trop de personnes présentes";
ERROR_19 = "Tes caractéristiques ne conviennent pas";
ERROR_190 = "Ton personnage <b>%1</b> est mort, rien ni personne n\'a pu le sauver.";
ERROR_191 = "Vous ne pouvez plus faire cette quête aujourd\'hui, car vous l\'avez déjà terminée avec l\'un de vos personnages.";
ERROR_192 = "Ton personnage <b>%1</b> a été sauvé d\'une mort affreuse, car le combat n\'était pas fini lorsque le serveur s\'est éteint.";
ERROR_193 = "Impossible de lancer ce sort : la cellule visée n\'est pas valide !";
ERROR_194 = "Il y a trop de monstres invoqués sur la carte !";
ERROR_195 = "Vous ne pouvez pas utiliser cet objet sur un personnage qui n\'a pas activé son mode \"Joueur contre joueur\".";
ERROR_196 = "Ton alignement ne te permet pas d\'utiliser ce transport !";
ERROR_197 = "Cet objet n\'est utilisable que sur des personnage d\'alignement ennemi !";
ERROR_198 = "Malgré toutes vos tentatives, votre cible reste introuvable. Réessayez plus tard.";
ERROR_199 = "Ton meneur a quitté la guilde <b>%2</b>, et c\'est <b>%1</b> qui a été désigné pour le remplacer.";
ERROR_2 = "Vous n\'exercez pas le métier nécessaire";
ERROR_20 = "Cet emplacement de stockage est déjà utilisé.";
ERROR_200 = "Vous ne pouvez pas libérer davantage de monstres, attaquez d\'abord ceux que vous avez déjà libérés !";
ERROR_201 = "<b>%1</b> vient de vous bannir. Le bannissement sera effectif dès la fin du combat.";
ERROR_202 = "La cible est actuellement invisible !";
ERROR_203 = "Vous ne pouvez pas avoir plus de <b>%1</b> invocation(s) en même temps.";
ERROR_204 = "Impossible d\'utiliser ce zaap.";
ERROR_205 = "Vous devez faire partie d\'une guilde pour accéder à cette interface.";
ERROR_206 = "Impossible, ce joueur est déjà dans une guilde";
ERROR_207 = "Vous n\'avez pas le droit d\'inviter d\'autres personnages dans votre guilde.";
ERROR_208 = "Impossible d\'inviter, ce joueur est inconnu ou non connecté.";
ERROR_209 = "Ce joueur est occupé. Impossible de l\'inviter.";
ERROR_21 = "Action impossible car ton abonnement a expiré.";
ERROR_210 = "Impossible, ce personnage ne fait pas partie de la guilde.";
ERROR_211 = "Impossible, ce perso ou compte n\'existe pas ou n\'est pas connecté.";
ERROR_212 = "Vous ne pouvez rejoindre actuellement cette personne en raison d\'une incompatibilité d\'état.";
ERROR_213 = "La puissance de la magie de téléportation est inversement proportionnelle au carré de la distance. La distance actuelle est trop grande, vous ne pourriez rejoindre cette personne en un seul morceau.";
ERROR_214 = "Il n\'y a pas de place disponible près de cette personne, vous risqueriez de vous rematérialiser dans un rocher ou un innocent tofu.";
ERROR_215 = "Ce challenge n\'a actuellement aucune cible.";
ERROR_216 = "Pas les droits suffisants pour booster les caractéristiques et les rangs de sort dans la guilde.";
ERROR_217 = "Impossible de rejoindre le percepteur, Vous êtes occupé.";
ERROR_218 = "Multi-compte interdit lors de combat de guilde";
ERROR_219 = "On ne peut pas passer en mode marchand si on est dans un enclos!";
ERROR_22 = "Le joueur %1 n\'est pas abonné. Action impossible...";
ERROR_220 = "Impossible d\'utiliser le zaapi.";
ERROR_221 = "Impossible d\'utiliser le transporteur lié au prisme !";
ERROR_222 = "Vous ne pouvez plus accélérer la vitesse d\'apprentissage de vos montures aujourd\'hui. Vous devez utiliser les machines d\'élevage.";
ERROR_223 = "[WIP] Votre conjoint n\'a pas donné de signes de vie depuis trop longtemps, selon le rite d\'Allister votre union est désormais caduque. Vous voilà libre. Est-ce une occasion de se réjouir ou une de pleurer ?";
ERROR_224 = "[WIP] Ton union avec %1 a été jugée caduque par contumace. Retour à la case célibat pour le moment.";
ERROR_225 = "Attention, vous êtes sur un serveur de test dont l\'objectif est la détection de problèmes dans les futures modifications. Tout ce qui est sur ce serveur (les personnages, les objets, les guildes, etc.) n\'est pas permanent, et peut être supprimé ou remplacé à tout moment, et ce sans avertissement. Bon test à tous, et dans la bonne humeur !";
ERROR_226 = "Action impossible sur ce serveur.";
ERROR_227 = "[WIP] Vous devez atteindre le <b>niveau %1</b> pour utiliser cette monture.";
ERROR_228 = "[WAIT]Ce lieu ne peut pas accueillir de percepteur.";
ERROR_229 = "[WAIT] Il y a déjà un piège sur cette case";
ERROR_23 = "Vous ne pouvez pas passer en mode marchand, vous n\'avez pas d\'objet à vendre.";
ERROR_230 = "[WAIT] Cet objet ne semble pas pouvoir être utilisé ...";
ERROR_231 = "[WAIT] L\'erreur n°%1 est survenue.";
ERROR_232 = "Le mode restreint est actif pour la session, cette action est impossible.";
ERROR_233 = "Vous ne respectez pas le niveau de sécurité paramétré pour ce compte, le mode restreint est donc actif pour cette session et empêche certaines actions. Veuillez consulter la <a href=\'URL FAQ SUPPORT\'>F.A.Q du service sécurité des comptes </a>  pour obtenir davantage d\'informations.";
ERROR_234 = "";
ERROR_235 = "Une modification du niveau de sécurité de votre compte est en cours, veuillez vous connecter sur <a href=\'URL FAQ SUPPORT\'>votre gestion de compte</a> si vous souhaitez l\'annuler.";
ERROR_236 = "[WIP] Réservé pour Dofus 2";
ERROR_237 = "[WIP] Réservé pour Dofus 2";
ERROR_24 = "Vous ne pouvez devenir vendeur que sur une case vide.";
ERROR_25 = "Impossible : il ne peut y avoir plus de %1 vendeurs sur cette carte.";
ERROR_26 = "Impossible de se téléporter dans une maison verrouillée.";
ERROR_27 = "Action impossible car ta période d\'essai est terminée.";
ERROR_28 = "<b>En attente du joueur %1...</b>";
ERROR_29 = "<b>En attente des joueurs %1...</b>";
ERROR_3 = "Vous n\'avez pas le niveau nécessaire.";
ERROR_30 = "<b>Perte de la connexion : le joueur %1 a été exclu de la partie</b>";
ERROR_31 = "Cette action nécessite un abonnement valide.";
ERROR_32 = "Tu ne peux pas avoir plus de %1 maison(s).";
ERROR_33 = "Impossible d\'agresser un joueur de si faible niveau.";
ERROR_34 = "Certaines conditions ne sont pas satisfaites.";
ERROR_35 = "Etre marié ou ne pas l\'être... Tu sembles ne pas avoir fait le bon choix.";
ERROR_36 = "Ton épouse n\'est pas connectée.";
ERROR_37 = "Ton mari n\'est pas connecté.";
ERROR_38 = "Tu n\'es pas marié(e).";
ERROR_39 = "Ton épouse n\'est pas disponible pour l\'instant...";
ERROR_4 = "Tu ne possèdes pas l\'objet nécessaire.";
ERROR_40 = "Ton époux n\'est pas disponible pour l\'instant...";
ERROR_41 = "Il n\'y a pas de place disponible près de ton épouse.";
ERROR_42 = "Il n\'y a pas de place disponible près de ton époux.";
ERROR_43 = "Pour utiliser cet objet.";
ERROR_44 = "pour équiper cet objet.";
ERROR_45 = "pour rentrer ici.";
ERROR_46 = "Tu n\'exerces pas le métier %1.";
ERROR_47 = "Ton niveau est trop faible pour prendre part à une agression.";
ERROR_48 = "Vous étiez au mauvais endroit, au mauvais moment, et votre corps à été réduit en charpie.";
ERROR_49 = "Impossible de désapprendre le métier <b>%1</b>.";
ERROR_5 = "Tu n\'appartiens pas à la bonne classe.";
ERROR_50 = "Vous aviez oublié votre familier, il a dû trouver à manger tout seul. Mais son état laisse à penser qu\'il n\'a pas très bien réussi.";
ERROR_51 = "Vous aviez oublié votre familier, il est trop gros pour chasser tout seul et à dû se résigner à manger ce qui traînait. Il a perdu du poids mais aussi de sa puissance.";
ERROR_52 = "Vous aviez oublié votre familier qui était déjà trop maigre. Il a tenté de manger quelque chose qui traînait mais sans grand succès. Il est maintenant au plus mal.";
ERROR_53 = "Votre familier prend la ressource, la renifle un peu, ne semble pas convaincu et vous la rend.";
ERROR_54 = "Vous n\'avez pas assez fait attention à votre familier. Il s\'est transformé en fantôme !";
ERROR_55 = "Le niveau de ta guilde ne te permet pas d\'avoir plus de %1 membres.";
ERROR_56 = "Il est trop tard";
ERROR_57 = "Impossible de rejoindre ce combat en mode \'Spectateur\'.";
ERROR_58 = "Vérifie les Emote que tu connais déjà, et réessaye...";
ERROR_59 = "Votre apparence ne vous permet pas d\'exécuter cette action.";
ERROR_6 = "Impossible d\'apprendre le métier %1.";
ERROR_60 = "Votre arme vient de se dématérialiser entre votre mains.";
ERROR_61 = "Il faut posséder une maison pour utiliser cet objet.";
ERROR_62 = "Action impossible avec un compte non abonné. <font color=\"#0000FF\"><u><a href=\'asfunction:onHref,OpenPayZoneDetails\'>Comment devenir membre de la communauté ?</a></u></font>";
ERROR_63 = "Action impossible car votre interlocuteur est trop chargé.";
ERROR_64 = "Cet objet ne fait pas partie des catégories prévues dans cet hôtel de vente.";
ERROR_65 = "Vous ne disposez pas d\'assez de kamas pour acquitter la taxe de mise en vente...";
ERROR_66 = "Vous ne pouvez pas mettre plus d\'objets en vente actuellement...";
ERROR_67 = "Vous ne pouvez pas mettre plus d\'objets en vente actuellement...";
ERROR_68 = "Cet objet ne peut être accepté ici vu sa rareté...";
ERROR_7 = "Impossible d\'apprendre le sort %1.";
ERROR_70 = "Action annulée pour cause de surcharge...";
ERROR_71 = "Vous ne disposez pas d\'assez de kamas pour acheter cet objet.";
ERROR_72 = "Cet objet n\'est plus disponible à ce prix. Quelqu\'un a été plus rapide...";
ERROR_74 = "Action annulée. Désolé, l\'hôtel des ventes est clos temporairement.  Revenez un peu plus tard !!";
ERROR_75 = "pour débuter cette quête.";
ERROR_76 = "Vous n\'avez pas assez de kamas pour acquitter la taxe de mise en mode marchand...";
ERROR_77 = "Cette personne est déjà alignée.";
ERROR_78 = "Votre état et celui de votre mari ne vous permet pas de le rejoindre actuellement.";
ERROR_79 = "Votre état et celui de votre femme ne vous permet pas de la rejoindre actuellement.";
ERROR_8 = "Il faut être au moins niveau %1 dans tous ses métiers pour en apprendre un autre.";
ERROR_80 = "Votre mari est trop éloigné pour vous permettre de le rejoindre.";
ERROR_81 = "Votre femme est trop éloignée pour vous permettre de la rejoindre.";
ERROR_82 = "Vous n\'avez pas assez de kamas pour effectuer cette action.";
ERROR_83 = "Votre déshonneur ne vous permet pas de faire cette action.";
ERROR_84 = "Votre message n\'a pas abouti car identique au précédent message.";
ERROR_85 = "Vous devez équiper votre outil pour cette action.";
ERROR_86 = "Impossible de ressusciter une personne d\'une cité ennemie.";
ERROR_87 = "L\'abonnement lié au cadeau a été invalidé. L\'objet est donc repris.";
ERROR_88 = "Votre familier ne peut vous suivre tant que vous êtes sur votre monture...";
ERROR_89 = "Bienvenue sur DOFUS, dans le Monde des Douze ! \nRappel : prenez garde, il est interdit de transmettre votre identifiant de connexion ainsi que votre mot de passe.";
ERROR_89_MINICLIP = "Bienvenue sur DOFUS, dans le Monde des Douze ! \nRappel : prenez garde, il est interdit de transmettre votre identifiant de connexion ainsi que votre mot de passe.";
ERROR_9 = "Tu connais déjà suffisamment de métiers.";
ERROR_90 = "Votre monture semble ne pas vouloir avaler cette nourriture...";
ERROR_91 = "Action impossible en cours de combat.";
ERROR_92 = "Impossible de modifier la structure des enclos publics.";
ERROR_93 = "Impossible de modifier la structure d\'un enclos qui ne vous appartient pas.";
ERROR_94 = "Impossible de vendre un enclos public.";
ERROR_95 = "Impossible de vendre un enclos qui ne vous appartient pas.";
ERROR_96 = "Impossible d\'acheter un enclos public.";
ERROR_97 = "Impossible d\'acheter un enclos non en vente.";
ERROR_98 = "Seul le meneur de la guilde peut acheter des enclos.";
ERROR_99 = "Prix invalide.";
	 */
	
	
	
	
	
	/*
	 SRV_MSG_0 = "Trop de spam !";
SRV_MSG_1 = "Tu es resté trop longtemps inactif.";
SRV_MSG_10 = "Il vous faut au moins %1 kamas pour accéder à votre coffre.";
SRV_MSG_11 = "Ton énergie est dangereusement basse !\n%1 point(s)";
SRV_MSG_12 = "Tu viens de succomber à tes blessures. \nTu peux attendre qu\'un prêtre vienne te sauver ou libérer ton âme (/release) pour rejoindre le cimetière le plus proche.";
SRV_MSG_13 = "Le serveur est actuellement en maintenance.\nMerci de votre compréhension.\n\n<u><a href=\"http://ankama-games.com/game.php\" target=\"_blank\"><font color=\"#0000FF\">Profitez-en pour découvrir les différents jeux Ankama-Games !</font></a></u>";
SRV_MSG_14 = "Cette classe est réservée aux abonnés.";
SRV_MSG_15 = "Tu as désormais rejoint le monde des esprits. \nSi tu veux retourner dans le monde des vivants, il te faut trouver une statue de phœnix ou un prêtre. \nN\'oublies pas à l\'avenir de reprendre de l\'énergie en te reposant dans les tavernes ou grâce à des potions.";
SRV_MSG_16 = "Connexion temporairement refusée : le serveur reçoit trop de connexions simultanées. Merci de réessayer dans quelques minutes.";
SRV_MSG_17 = "L\'un de vos enclos vient d\'être acheté %1 kamas par la guilde %2. La somme a été placée sur votre compte en banque.";
SRV_MSG_18 = "Vous avez été kické par %1.%2";
SRV_MSG_19 = "Ce serveur est restreint en accès à une certaine communauté de joueurs, vous ne pouvez pas y accéder.";
SRV_MSG_2 = "Ton personnage a atteint le niveau maximum autorisé.";
SRV_MSG_20 = "Ce serveur est restreint en accès à une certaine communauté de joueurs, ou à tous les abonnés. Vous ne pouvez pas y accéder sans respecter une de ces conditions.";
SRV_MSG_21 = "Des objets ont été déposés dans votre banque.";
SRV_MSG_22 = "Votre niveau d\'artisan actuel ne vous permettra pas de réussir un tel objet. Il vous faudra progresser encore un peu. Pour réussir cet objet de niveau %1, il faut avoir progressé au minimum au niveau %2 dans ce métier.";
SRV_MSG_23 = "Suite à la modification des effets du sort %1, ce sort a été \'oublié\' par votre personnage, qui a été recrédité des %2 boosts correspondants.";
SRV_MSG_24 = "Le serveur a détecté un problème de dates anormales sur %1 de vos familiers non-échangeables. \nLa date d\'échange a été fixée à demain pour chaque familier concerné.";
SRV_MSG_25 = "Le serveur a détecté des conditions de repas anormales pour l\'un de vos familiers. \nCe familier maigrichon a bénéficié d\'un apport express en nutriments, vitamines et sels-minéraux. \nIl a maintenant le poil heureux et le regard soyeux.";
SRV_MSG_26 = "Tu viens de succomber à tes blessures.";
SRV_MSG_27 = "Ce serveur est complet. Seuls les comptes possédant déjà un personnage sur ce serveur peuvent s\'y connecter, ou en étant parrainé par une personne de ce serveur.";
SRV_MSG_28 = "Tu ne peux plus supprimer de personnages aujourd\'hui !";
SRV_MSG_29 = "Connexion refusée. \nUn défaut de sécurité de votre connexion Internet a été relevé : votre adresse IP publique n\'est pas constante, et ne permet pas d\'authentifier votre connexion. \nContactez votre administrateur réseau ou votre FAI, afin de vous assurer que votre connexion puisse conserver une IP identique entre l\'identification et le choix du serveur de jeu. \nCette \'inconstance\' de l\'IP se produit principalement dans les réseaux possédant plusieurs connexion Internet en parallèle, lorsque les connexions réseau sont réparties entre les différents points d\'accès Internet. Ce problème n\'est pas lié aux adresses IP \'dynamiques\', qui ne changent pas au cours d\'une même session Internet.";
SRV_MSG_3 = "Pour des raisons de maintenance, le serveur va être coupé d\'ici quelques minutes.";
SRV_MSG_30 = "Connexion refusée. \nL\'authentification au serveur a échoué, en raison d\'un trop grand délai de connexion. \nAssurez vous de couper les téléchargements, vidéos ou musiques en diffusion continue (streaming), afin d\'améliorer la rapidité de votre connexion.";
SRV_MSG_31 = "Connexion refusée. \nLe serveur de jeu n\'a pas reçu les informations d\'authentification suite à votre identification. \nRéessayez, si le problème persiste, contactez votre administrateur réseau ou votre FAI, il s\'agit probablement d\'une redirection erronée due à un mauvais paramétrage DNS.";
SRV_MSG_32 = "Afin de ne pas gêner les autres joueurs, veuillez attendre %1 secondes avant de vous reconnecter.";
SRV_MSG_33 = "Ce serveur est restreint à certaines langues ou communautés en ce qui concerne l\'accès gratuit. Votre connexion nous indique que vous devriez jouer sur un serveur d\'une autre communauté, correspondant à votre pays. \nMerci de vous diriger sur un serveur de votre communauté, le cas échéant, de créer un compte Dofus dans la communauté adaptée à votre pays.";
SRV_MSG_34 = "Connexion impossible \n %1 comptes sont déjà connectés au jeu depuis votre IP %2. Suite à des repérages récurrents de comportements illicites, certaines plages d\'IP de votre hébergeur ont été limitées en nombre de connexion simultanées.  \nLes comptes abonnés ont une limitation moindre. \nVous pouvez contacter le support à ce sujet <a href=\"http://support.ankama.com/fr/faq/718\"><u>ici</u></a>";
SRV_MSG_35 = "Ce serveur est restreint en accès à une certaine communauté de joueurs, vous ne pouvez pas y accéder. \nCertains pays ignorent la communauté associée au compte pour proposer une communauté en fonction de la position géographique de la connexion. \nVous pouvez interroger le support à ce sujet <a href=\"http://support.ankama.com/fr/faq/716\"><u>ici</u></a>";
SRV_MSG_36 = "Suite à la modification des effets de plusieurs de vos sorts, tous vos points de sorts vous ont été rendus.";
SRV_MSG_37 = "Période de jeu terminée. \nAfin de laisser la possibilité à tous les visiteurs de se connecter, le temps de jeu par compte est restreint depuis ce lieu. Votre compte sera de nouveau utilisable depuis le salon dans quelques heures. \nPour les tournois, prévenez un membre du staff afin que votre compte ait une dérogation le temps du tournoi.";
SRV_MSG_38 = "Vous ne respectez pas le niveau de sécurité paramétré pour ce compte. Le mode restreint  sera activé si vous vous connectez en jeu,  certaines actions ne seront alors plus possibles. Veuillez consulter la <a href=\'URL FAQ SUPPORT\'>F.A.Q du service sécurité des comptes </a> pour obtenir davantage d\'informations.";
SRV_MSG_39 = "[WIP] Réservé pour Dofus 2";
SRV_MSG_4 = "Votre connexion a été coupée pour des raisons de maintenance.";
SRV_MSG_40 = "[WIP] Réservé pour Dofus 2";
SRV_MSG_41 = "[WIP] Réservé pour Dofus 2";
SRV_MSG_42 = "[WIP] Réservé pour Dofus 2";
SRV_MSG_43 = "[WIP] Réservé pour Dofus 2";
SRV_MSG_44 = "[WIP] Réservé pour Dofus 2";
SRV_MSG_5 = "L\'une de vos maisons vient d\'être achetée %1 kamas par %2. La somme a été placée sur votre compte en banque.";
SRV_MSG_6 = "Le nombre maximum d\'objets pour cet inventaire est déjà atteint.";
SRV_MSG_7 = "Cette opération n\'est pas autorisée ici.";
SRV_MSG_8 = "Cet objet n\'est plus disponible.";
SRV_MSG_9 = "Plus rien à acheter : le magasin est vide";
SRV_MSG_45 = "[WIP] Réservé pour Dofus 2";
	 */
	
	
	

	
	/*
	PVP_41 = "La %1 menant à votre coeur de ville du %2 est attaquée.";
PVP_86 = "Vous devez repousser l\'attaque sur la zone %1 avant que nos ennemis ne s\'en emparent.";
PVP_87 = "Le coeur de la zone %1 est ouvert aux ennemis, protégez le !";
PVP_88 = "Le coeur de la zone %1 est refermé... Terrassez les ennemis encore présents et la victoire est acquise.";
PVP_89 = "Vos alliés attaquent en ce moment la zone %1. Ils ont certainement besoin de votre aide.";
PVP_90 = "Le coeur de la zone %1 a été ouvert par vos alliés, vous pouvez tenter de capturer ce lieu !";
	 */
	
	
	
	
	/*
	 PAYZONE_MSG_10 = "Attention jeune aventurier, vous avez quitté le village d\'Astrub et vous vous trouvez actuellement dans une zone réservée aux aventuriers expérimentés qui sont membres de la communauté.";
PAYZONE_MSG_11 = "EMPTY";
PAYZONE_MSG_12 = "Tu as dépassé le niveau 30 dans ton métier. Tu ne peux plus progresser dans ton métier sans devenir membre de la communauté.";
PAYZONE_MSG_13 = "Critère non valide pour les non abonnés. (ne pas traduire)";
PAYZONE_MSG_14 = "Cet objet ne peut pas être utilisé par un aventurier qui n\'est pas membre de la communauté.";
PAYZONE_MSG_15 = "Vous ne pouvez pas passer en mode marchand car vous n\'êtes pas membre de la communauté.";
PAYZONE_MSG_16 = "Action impossible car vous n\'êtes pas membre de la communauté.";
	 */
	
	public static enum ImType{
		INFOS("0"),
		ERROR("1"),
		PVP("2");

		private String symbol = "";
		private ImType(String symbol){
			this.symbol = symbol;
		}
		public String getSymbol(){
			return symbol;
		}
		@Override
		public String toString(){
			return symbol;
		}
	}
	
	
	
	private String symbol = "";
	private ImPackets(String symbol){
		this.symbol = symbol;
	}
	public String getSymbol(){
		return symbol;
	}
	@Override
	public String toString(){
		return symbol;
	}
	
	
	
	
	
}
