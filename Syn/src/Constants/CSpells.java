package Constants;


public class CSpells {
	
	
	
	public static final byte maxSpellPositionID = 23;
	public static final byte minSpellPositionID = 1;

	//public static final byte requiredStates_Normal[] = {};
	public static final byte requiredStates_Saoul[] = {1};
	public static final byte forbiddenStates_Saoul[] = {1};
	public static final byte forbiddenStates_AllButSaoul[] = {3,18,19,43};
	public static final byte forbiddenStates_All[] = {1,3,18,19,43};
	public static final String[] forbiddenStates = {"41,1,3,19,18","41,1,3,19,18,7","41,1,3,19,18,40","41,1,3,19,18,39","41,1,3,19,18,50",
		"41,1,3,19,18,8","41,1,3,19,18,17","41,1,3,19,18,16","41,1,3,19,18,55","41,1,3,19,18,27","41,1,3,19,18,7,8","41,1,3,19,18,11",
		"41,1,19,18","41,1,3,19,18,13,12","41,1,3,19,18,7,15,14","41,1,3,19,18,15","41,1,3,18","41,1,3,19,18,28","41,1,3,19,18,29",
		"41,1,3,19,18,30","41,1,3,19,18,31","41,1,3,19,18,32","41,1,3,19,18,33","41,1,3,19,18,38,37,36","41,1,3,19,18,37,36,35",
		"41,1,3,19,18,38,36,35","41,1,3,19,18,38,37,35","41,1,3,19,18,43","41,1,3,19,18,47,46,44","41,1,3,19,18,49","41,1,3,19,18,58,57",
		"41,1,3,19,18,58","18,19,3,41", "18,19,3,1,41"
	};
	public static final byte[][] forbiddenStatesBytes = {{41,1,3,19,18},{41,1,3,19,18,7},{41,1,3,19,18,40},{41,1,3,19,18,39},
		{41,1,3,19,18,50},{41,1,3,19,18,8},{41,1,3,19,18,17},{41,1,3,19,18,16},{41,1,3,19,18,55},{41,1,3,19,18,27},{41,1,3,19,18,7,8},
		{41,3,19,18},{41,1,3,19,18,11},{41,1,19,18},{41,1,3,19,18,13,12},{41,1,3,19,18,7,15,14},{41,1,3,19,18,15},{41,1,3,18},
		{41,1,3,19,18,28},{41,1,3,19,18,29},{41,1,3,19,18,30},{41,1,3,19,18,31},{41,1,3,19,18,32},{41,1,3,19,18,33},{41,1,3,19,18,38,37,36},
		{41,1,3,19,18,37,36,35},{41,1,3,19,18,38,36,35},{41,1,3,19,18,38,37,35},{41,1,3,19,18,43},{41,1,3,19,18,47,46,44},{41,1,3,19,18,49},
		{41,1,3,19,18,58,57},{41,1,3,19,18,58}, {18,19,3,1,41}
	};
	public static final String[] requiredStates = {"[-1]", "[1],","[27],","[9],","[3],","[13],","[12],","[14],","[15],","[16],","[19],","[28],","[8],","[30],","[39],","[31],","[33],","[34],","[35],","[36],","[37],","[38],","[43],","[44],","[46],","[47],","[58],","[60],","[61],"};
	public static final byte[][] requiredStatesBytes = {null, {1}, {27}, {9}, {3}, {13}, {12}, {14}, {15}, {16}, {19}, {28}, {8}, {30}, {39}, {31}, {33}, {34}, {35}, {36}, {37}, {38}, {43}, {44}, {46}, {47}, {58}, {60}, {61}};
	
	//Elements 
	//public static final byte ELEMENT_NULL		=	-1;
	//public static final byte ELEMENT_NEUTRE		= 	0;
	//public static final byte ELEMENT_TERRE		= 	1;
	//public static final byte ELEMENT_EAU		= 	2;
	//public static final byte ELEMENT_FEU		= 	3;
	//public static final byte ELEMENT_AIR		= 	4;
	
	
	//SORTS SPÉCIAUX
	public static final short specialSpell_CAC = 0;
	public static final short elementarySpell_FLAMICHE = 350;
	public static final short specialSpell_MARTEAU_MOON = 366;
	public static final short invocationSpell_CAWOTTE = 367;
	public static final short elementarySpell_LIBERATION = 368;
	public static final short elementarySpell_FOUDROIEMENT = 369;
	public static final short invocationSpell_ARAKNE = 367;
	public static final short invocationSpell_CHAFERFU = 373;

	//SORTS DE MAITRISE
	public static final short maitriseSpell_BATON = 390;
	public static final short maitriseSpell_EPEE = 391;
	public static final short maitriseSpell_ARC = 392;
	public static final short maitriseSpell_MARTEAU = 393;
	public static final short maitriseSpell_BAGUETTE = 394;
	public static final short maitriseSpell_DAGUE = 395;
	public static final short maitriseSpell_PELLE = 396;
	public static final short maitriseSpell_HACHE = 397;

	//SORTS DE CLASSE
	public static final short classSpell_BROKLE = 410;//ou 417 ?, le 417 a écrit "test" dessus alors que 410 non 
	public static final short classSpell_Felintion = 412;
	public static final short classSpell_POISSE = 416;
	public static final short classSpell_FLECHE_DISPERSION = 418;
	public static final short classSpell_LAISSE_SPIRITUELLE = 420;
	public static final short classSpell_DOULEUR_PARTAGEE = 421;
	public static final short classSpell_MISE_GARDE = 422;
	public static final short classSpell_IVRESSE = 423;
	public static final short classSpell_RAULEBAQUE = 424;
	public static final short classSpell_RETRAITE_ANTICIPEE = 425;
	public static final short classSpell_ARBRE_VIE = 426;
	public static final short classSpell_MOT_LOTOF = 427;

	//SORTS DE PERCEPTEUR
	
	public static final short perceptorSpell_ARMURE_EAU = 451;
	public static final short perceptorSpell_ARMURE_FEU = 452;
	public static final short perceptorSpell_ARMURE_TERRE = 453;
	public static final short perceptorSpell_ARMURE_AIR = 454;
	public static final short perceptorSpell_FLAMME = 455;
	public static final short perceptorSpell_CYCLONE = 456;
	public static final short perceptorSpell_VAGUE = 457;
	public static final short perceptorSpell_ROCHER = 458;
	public static final short perceptorSpell_MOT_SOIGNANT = 459;
	public static final short perceptorSpell_DESENVOUTEMENT = 460;
	public static final short perceptorSpell_COMPULSION_MASSE = 461;
	public static final short perceptorSpell_DESTABILISATION = 462;
	
	
	
/*
//SORTS SPÉCIAUX
367	Cawotte
368	Libération
369	Foudroiement
370	Invocation d'Arakne
371	 Invocation de Flammèche [wip]
372	[@Ref sort utilisÃ© ?]
373	Invocation de Chaferfu

//SORTS DE MAITRISES
390	MaÃ®trise du BÃ¢ton
391	MaÃ®trise de l'EpÃ©e
392	MaÃ®trise des Arcs
393	MaÃ®trise des Marteaux
394	MaÃ®trise des Baguettes
395	MaÃ®trise des Dagues
396	MaÃ®trise des Pelles
397	MaÃ®trise des Haches



//SORTS DE CLASSE
416	Poisse	0	0,1,1	781;-1;-1;-1;2;0,-1, 3, 1, 1, 0, 100, false, true, false, false, 4, 0, 0, 10, Pa,-1,18; 19; 3; 1; 41, 0, false	781;-1;-1;-1;2;0,-1, 3, 1, 1, 0, 100, false, true, false, false, 4, 0, 0, 9, Pa,-1,18; 19; 3; 1; 41, 0, false	781;-1;-1;-1;2;0,-1, 3, 1, 1, 0, 100, false, true, false, false, 4, 0, 0, 8, Pa,-1,18; 19; 3; 1; 41, 0, false	781;-1;-1;-1;2;0,-1, 3, 1, 1, 0, 100, false, true, false, false, 4, 0, 0, 7, Pa,-1,18; 19; 3; 1; 41, 0, false	781;-1;-1;-1;2;0,-1, 3, 1, 1, 0, 100, false, true, false, false, 4, 0, 0, 6, Pa,-1,18; 19; 3; 1; 41, 0, false	781;-1;-1;-1;2;0,-1, 3, 1, 1, 0, 100, false, true, false, false, 4, 0, 0, 5, Pa,-1,18; 19; 3; 1; 41, 100, false	
417	[TEST]Brokle_test	-1	0,0,0	782;-1;-1;-1;2;0,782;-1;-1;-1;3;0, 3, 0, 0, 40, 100, true, true, false, false, 4, 0, 0, 10, XbXb,-1,18; 19; 3; 1; 41, 0, false	782;-1;-1;-1;2;0,782;-1;-1;-1;3;0, 3, 0, 0, 40, 100, true, true, false, false, 4, 0, 0, 9, XbXb,-1,18; 19; 3; 1; 41, 0, false	782;-1;-1;-1;2;0,782;-1;-1;-1;3;0, 3, 0, 0, 40, 100, true, true, false, false, 4, 0, 0, 8, XbXb,-1,18; 19; 3; 1; 41, 0, false	782;-1;-1;-1;2;0,782;-1;-1;-1;3;0, 3, 0, 0, 40, 100, true, true, false, false, 4, 0, 0, 7, XbXb,-1,18; 19; 3; 1; 41, 0, false	782;-1;-1;-1;2;0,782;-1;-1;-1;3;0, 3, 0, 0, 40, 100, true, true, false, false, 4, 0, 0, 6, XbXb,-1,18; 19; 3; 1; 41, 0, false	782;-1;-1;-1;2;0,782;-1;-1;-1;3;0, 3, 0, 0, 40, 100, true, true, false, false, 4, 0, 0, 5, XbXb,-1,18; 19; 3; 1; 41, 100, false	
418	FlÃ¨che de dispersion	0	30,2,1	5;2;-1;-1;0;0,-1, 3, 1, 7, 0, 100, false, true, false, true, 4, 0, 0, 7, Xc,-1,18; 19; 3; 1; 41, 0, false	5;2;-1;-1;0;0,-1, 3, 1, 8, 0, 100, false, true, false, true, 4, 0, 0, 6, Xc,-1,18; 19; 3; 1; 41, 0, false	5;2;-1;-1;0;0,-1, 3, 1, 9, 0, 100, false, true, false, true, 4, 0, 0, 5, Xc,-1,18; 19; 3; 1; 41, 0, false	5;2;-1;-1;0;0,-1, 3, 1, 10, 0, 100, false, true, false, true, 4, 0, 0, 4, Xc,-1,18; 19; 3; 1; 41, 0, false	5;2;-1;-1;0;0,-1, 3, 1, 11, 0, 100, false, true, false, true, 4, 0, 0, 3, Xc,-1,18; 19; 3; 1; 41, 0, false	5;2;-1;-1;0;0,-1, 3, 1, 12, 0, 100, false, true, false, true, 4, 0, 0, 2, Xc,-1,18; 19; 3; 1; 41, 100, false	
419	test[test]	-1	0,0,0	122;10;-1;-1;3;0;0d0+10,-1, 1, 0, 10, 0, 0, false, false, false, false, 4, 0, 0, 0, Pa,-1,18; 19; 3; 1; 41, 1, false	122;10;-1;-1;3;0;0d0+10,-1, 1, 0, 10, 0, 0, false, false, false, false, 4, 0, 0, 0, Pa,-1,18; 19; 3; 1; 41, 1, false	122;10;-1;-1;3;0;0d0+10,-1, 1, 0, 10, 0, 0, false, false, false, false, 4, 0, 0, 0, Pa,-1,18; 19; 3; 1; 41, 1, false	122;10;-1;-1;3;0;0d0+10,-1, 1, 0, 10, 0, 0, false, false, false, false, 4, 0, 0, 0, Pa,-1,18; 19; 3; 1; 41, 1, false	122;10;-1;-1;3;0;0d0+10,-1, 1, 0, 10, 0, 0, false, false, false, false, 4, 0, 0, 0, Pa,-1,18; 19; 3; 1; 41, 1, false	-1	
420	Laisse Spirituelle	-1	0,0,0	780;10;-1;-1;0;0;0d0+10,-1, 6, 1, 1, 0, 0, false, true, true, true, 4, 0, 0, 7, Pa,-1,18; 19; 3; 1; 41, 0, false	780;20;-1;-1;0;0;0d0+20,-1, 6, 1, 2, 0, 0, false, true, true, true, 4, 0, 0, 7, Pa,-1,18; 19; 3; 1; 41, 0, false	780;30;-1;-1;0;0;0d0+30,-1, 6, 1, 3, 0, 0, false, true, true, true, 4, 0, 0, 7, Pa,-1,18; 19; 3; 1; 41, 0, false	780;40;-1;-1;0;0;0d0+40,-1, 6, 1, 4, 0, 0, false, true, true, true, 4, 0, 0, 7, Pa,-1,18; 19; 3; 1; 41, 0, false	780;50;-1;-1;0;0;0d0+50,-1, 6, 1, 5, 0, 0, false, true, true, true, 4, 0, 0, 7, Pa,-1,18; 19; 3; 1; 41, 0, false	780;60;-1;-1;0;0;0d0+60,-1, 6, 1, 6, 0, 0, false, true, true, true, 4, 0, 0, 7, Pa,-1,18; 19; 3; 1; 41, 100, false	
421	Douleur partagÃ©e	0	0,1,1	788;138;60;5;5;0|776;10;-1;-1;5;0;0d0+10,788;138;70;5;5;0|776;10;-1;-1;5;0;0d0+10, 2, 0, 0, 50, 100, true, true, false, false, 4, 0, 0, 5, XbXbXbXb,-1,18; 19; 3; 1; 41, 0, false	788;138;70;5;5;0|776;10;-1;-1;5;0;0d0+10,788;138;80;5;5;0|776;10;-1;-1;5;0;0d0+10, 2, 0, 0, 50, 100, true, true, false, false, 4, 0, 0, 5, XbXbXbXb,-1,18; 19; 3; 1; 41, 0, false	788;138;80;5;5;0|776;10;-1;-1;5;0;0d0+10,788;138;90;5;5;0|776;10;-1;-1;5;0;0d0+10, 2, 0, 0, 50, 100, true, true, false, false, 4, 0, 0, 5, XbXbXbXb,-1,18; 19; 3; 1; 41, 0, false	788;138;90;5;5;0|776;10;-1;-1;5;0;0d0+10,788;138;100;5;5;0|776;10;-1;-1;5;0;0d0+10, 2, 0, 0, 50, 100, true, true, false, false, 4, 0, 0, 5, XbXbXbXb,-1,18; 19; 3; 1; 41, 0, false	788;138;100;5;5;0|776;10;-1;-1;5;0;0d0+10,788;138;110;5;5;0|776;10;-1;-1;5;0;0d0+10, 2, 0, 0, 50, 100, true, true, false, false, 4, 0, 0, 5, XbXbXbXb,-1,18; 19; 3; 1; 41, 0, false	788;138;120;5;5;0|776;10;-1;-1;5;0;0d0+10,788;138;130;5;5;0|776;10;-1;-1;5;0;0d0+10, 2, 0, 0, 50, 100, true, true, false, false, 4, 0, 0, 5, XbXbXbXb,-1,18; 19; 3; 1; 41, 100, false	
422	Mise en garde	0	0,1,1	212;20;-1;-1;1;0;0d0+20|211;20;-1;-1;1;0;0d0+20|213;20;-1;-1;1;0;0d0+20|210;20;-1;-1;1;0;0d0+20|214;20;-1;-1;1;0;0d0+20|950;-1;-1;42;1;0,212;25;-1;-1;1;0;0d0+25|211;25;-1;-1;1;0;0d0+25|213;25;-1;-1;1;0;0d0+25|210;25;-1;-1;1;0;0d0+25|214;25;-1;-1;1;0;0d0+25|950;-1;-1;42;1;0, 1, 0, 1, 40, 100, false, false, false, true, 4, 1, 1, 0, PaPaPaPaPaPaPaPaPaPaPaPa,-1,18; 19; 3; 1; 41, 0, false	212;21;-1;-1;1;0;0d0+21|211;21;-1;-1;1;0;0d0+21|213;21;-1;-1;1;0;0d0+21|210;21;-1;-1;1;0;0d0+21|214;21;-1;-1;1;0;0d0+21|950;-1;-1;42;1;0,212;26;-1;-1;1;0;0d0+26|211;26;-1;-1;1;0;0d0+26|213;26;-1;-1;1;0;0d0+26|210;26;-1;-1;1;0;0d0+26|214;26;-1;-1;1;0;0d0+26|950;-1;-1;42;1;0, 1, 0, 2, 40, 100, false, false, false, true, 4, 2, 1, 0, PaPaPaPaPaPaPaPaPaPaPaPa,-1,18; 19; 3; 1; 41, 0, false	212;22;-1;-1;1;0;0d0+22|211;22;-1;-1;1;0;0d0+22|213;22;-1;-1;1;0;0d0+22|210;22;-1;-1;1;0;0d0+22|214;22;-1;-1;1;0;0d0+22|950;-1;-1;42;1;0,212;27;-1;-1;1;0;0d0+27|211;27;-1;-1;1;0;0d0+27|213;27;-1;-1;1;0;0d0+27|210;27;-1;-1;1;0;0d0+27|214;27;-1;-1;1;0;0d0+27|950;-1;-1;42;1;0, 1, 0, 3, 40, 100, false, false, false, true, 4, 3, 1, 0, PaPaPaPaPaPaPaPaPaPaPaPa,-1,18; 19; 3; 1; 41, 0, false	212;23;-1;-1;1;0;0d0+23|211;23;-1;-1;1;0;0d0+23|213;23;-1;-1;1;0;0d0+23|210;23;-1;-1;1;0;0d0+23|214;23;-1;-1;1;0;0d0+23|950;-1;-1;42;1;0,212;28;-1;-1;1;0;0d0+28|211;28;-1;-1;1;0;0d0+28|213;28;-1;-1;1;0;0d0+28|210;28;-1;-1;1;0;0d0+28|214;28;-1;-1;1;0;0d0+28|950;-1;-1;42;1;0, 1, 0, 4, 40, 100, false, false, false, true, 4, 4, 1, 0, PaPaPaPaPaPaPaPaPaPaPaPa,-1,18; 19; 3; 1; 41, 0, false	212;24;-1;-1;1;0;0d0+24|211;24;-1;-1;1;0;0d0+24|213;24;-1;-1;1;0;0d0+24|210;24;-1;-1;1;0;0d0+24|214;24;-1;-1;1;0;0d0+24|950;-1;-1;42;1;0,212;29;-1;-1;1;0;0d0+29|211;29;-1;-1;1;0;0d0+29|213;29;-1;-1;1;0;0d0+29|210;29;-1;-1;1;0;0d0+29|214;29;-1;-1;1;0;0d0+29|950;-1;-1;42;1;0, 1, 0, 5, 40, 100, false, false, false, true, 4, 5, 1, 0, PaPaPaPaPaPaPaPaPaPaPaPa,-1,18; 19; 3; 1; 41, 0, false	212;25;-1;-1;1;0;0d0+25|211;25;-1;-1;1;0;0d0+25|213;25;-1;-1;1;0;0d0+25|210;25;-1;-1;1;0;0d0+25|214;25;-1;-1;1;0;0d0+25|950;-1;-1;42;1;0,212;30;-1;-1;1;0;0d0+30|211;30;-1;-1;1;0;0d0+30|213;30;-1;-1;1;0;0d0+30|210;30;-1;-1;1;0;0d0+30|214;30;-1;-1;1;0;0d0+30|950;-1;-1;42;1;0, 1, 0, 7, 40, 100, false, false, false, true, 4, 6, 1, 0, PaPaPaPaPaPaPaPaPaPaPaPa,-1,18; 19; 3; 1; 41, 100, false	4;4;4;4;4;4;
423	Ivresse	0	0,2,1	181;2727;1;-1;0;0,-1, 4, 1, 1, 0, 100, true, true, true, false, 4, 0, 0, 10, Pa,-1,18; 19; 3; 1; 41, 0, false	181;2727;2;-1;0;0,-1, 4, 1, 1, 0, 100, true, true, true, false, 4, 0, 0, 9, Pa,-1,18; 19; 3; 1; 41, 0, false	181;2727;3;-1;0;0,-1, 4, 1, 1, 0, 100, true, true, true, false, 4, 0, 0, 8, Pa,-1,18; 19; 3; 1; 41, 0, false	181;2727;4;-1;0;0,-1, 4, 1, 1, 0, 100, true, true, true, false, 4, 0, 0, 7, Pa,-1,18; 19; 3; 1; 41, 0, false	181;2727;5;-1;0;0,-1, 4, 1, 1, 0, 100, true, true, true, false, 4, 0, 0, 6, Pa,-1,18; 19; 3; 1; 41, 0, false	181;2727;6;-1;0;0,-1, 4, 1, 1, 0, 100, true, true, true, false, 4, 0, 0, 5, Pa,-1,18; 19; 3; 1; 41, 100, false	
424	Raulebaque	0	0,1,1	784;-1;-1;-1;0;0,-1, 6, 0, 0, 0, 100, true, true, false, false, 4, 0, 0, 12, C_,-1,7; 18; 19; 3; 1; 41, 0, false	784;-1;-1;-1;0;0,-1, 6, 0, 0, 0, 100, true, true, false, false, 4, 0, 0, 11, C_,-1,7; 18; 19; 3; 1; 41, 0, false	784;-1;-1;-1;0;0,-1, 6, 0, 0, 0, 100, true, true, false, false, 4, 0, 0, 10, C_,-1,7; 18; 19; 3; 1; 41, 0, false	784;-1;-1;-1;0;0,-1, 6, 0, 0, 0, 100, true, true, false, false, 4, 0, 0, 9, C_,-1,7; 18; 19; 3; 1; 41, 0, false	784;-1;-1;-1;0;0,-1, 6, 0, 0, 0, 100, true, true, false, false, 4, 0, 0, 8, C_,-1,7; 18; 19; 3; 1; 41, 0, false	784;-1;-1;-1;0;0,-1, 6, 0, 0, 0, 100, true, true, false, false, 4, 0, 0, 7, C_,-1,7; 18; 19; 3; 1; 41, 100, false	
425	Retraite anticipÃ©e	-1	0,0,0	169;100;-1;-1;1;0;0d0+100|950;-1;-1;7;1;0|950;-1;-1;55;5;0,-1, 4, 0, 0, 0, 100, true, true, false, false, 4, 0, 0, 12, C_C_C_,-1,55; 18; 19; 3; 1; 41, 0, false	169;100;-1;-1;1;0;0d0+100|950;-1;-1;7;1;0|950;-1;-1;55;5;0,-1, 4, 0, 0, 0, 100, true, true, false, false, 4, 0, 0, 11, C_C_C_,-1,55; 18; 19; 3; 1; 41, 0, false	169;100;-1;-1;1;0;0d0+100|950;-1;-1;7;1;0|950;-1;-1;55;5;0,-1, 4, 0, 0, 0, 100, true, true, false, false, 4, 0, 0, 10, C_C_C_,-1,55; 18; 19; 3; 1; 41, 0, false	169;100;-1;-1;1;0;0d0+100|950;-1;-1;7;1;0|950;-1;-1;55;5;0,-1, 4, 0, 0, 0, 100, true, true, false, false, 4, 0, 0, 9, C_C_C_,-1,55; 18; 19; 3; 1; 41, 0, false	169;100;-1;-1;1;0;0d0+100|950;-1;-1;7;1;0|950;-1;-1;55;5;0,-1, 4, 0, 0, 0, 100, true, true, false, false, 4, 0, 0, 8, C_C_C_,-1,55; 18; 19; 3; 1; 41, 0, false	169;100;-1;-1;1;0;0d0+100|950;-1;-1;7;1;0|950;-1;-1;55;5;0,-1, 4, 0, 0, 0, 100, true, true, false, false, 4, 0, 0, 7, C_C_C_,-1,55; 18; 19; 3; 1; 41, 100, false	
426	Arbre de vie	0	0,2,1	181;2750;1;-1;0;0,-1, 5, 6, 6, 0, 100, false, true, true, false, 4, 0, 0, 11, Pa,-1,18; 19; 3; 1; 41, 0, false	181;2750;2;-1;0;0,-1, 5, 6, 6, 0, 100, false, true, true, false, 4, 0, 0, 10, Pa,-1,18; 19; 3; 1; 41, 0, false	181;2750;3;-1;0;0,-1, 5, 6, 6, 0, 100, false, true, true, false, 4, 0, 0, 9, Pa,-1,18; 19; 3; 1; 41, 0, false	181;2750;4;-1;0;0,-1, 5, 6, 6, 0, 100, false, true, true, false, 4, 0, 0, 8, Pa,-1,18; 19; 3; 1; 41, 0, false	181;2750;5;-1;0;0,-1, 5, 6, 6, 0, 100, false, true, true, false, 4, 0, 0, 7, Pa,-1,18; 19; 3; 1; 41, 0, false	181;2750;6;-1;0;0,-1, 5, 6, 6, 0, 100, false, true, true, false, 4, 0, 0, 6, Pa,-1,18; 19; 3; 1; 41, 100, false	
427	Mot Lotof	0	11,1,1	787;1679;1;1;0;0|149;-1;-1;7032;1;0,-1, 6, 0, 2, 0, 100, false, false, false, true, 4, 1, 1, 10, PaPa,-1,18; 19; 3; 1; 41, 1, false	787;1679;2;1;0;0|149;-1;-1;7032;1;0,-1, 6, 0, 3, 0, 100, false, false, false, true, 4, 1, 1, 9, PaPa,-1,18; 19; 3; 1; 41, 1, false	787;1679;3;1;0;0|149;-1;-1;7032;1;0,-1, 6, 0, 4, 0, 100, false, false, false, true, 4, 1, 1, 8, PaPa,-1,18; 19; 3; 1; 41, 1, false	787;1679;4;1;0;0|149;-1;-1;7032;1;0,-1, 6, 0, 5, 0, 100, false, false, false, true, 4, 1, 1, 7, PaPa,-1,18; 19; 3; 1; 41, 1, false	787;1679;5;1;0;0|149;-1;-1;7032;1;0,-1, 6, 0, 6, 0, 100, false, false, false, true, 4, 1, 1, 6, PaPa,-1,18; 19; 3; 1; 41, 1, false	787;1679;6;1;0;0|149;-1;-1;7032;1;0,-1, 6, 0, 7, 0, 100, false, false, false, true, 4, 1, 1, 5, PaPa,-1,18; 19; 3; 1; 41, 100, false	4;4;5;5


//SORTS DE PERCEPTEUR
451	Armure Aqueuse	-1	0,0,0	105;15;-1;-1;-1;0;0d0+15,-1, 5, 0, 0, 0, 0, false, true, false, false, 5, 0, 0, 63, Pa,-1,18; 19; 3; 1; 41, 0, false	105;21;-1;-1;-1;0;0d0+21,-1, 4, 0, 0, 0, 0, false, true, false, false, 5, 0, 0, 63, Pa,-1,18; 19; 3; 1; 41, 0, false	105;24;-1;-1;-1;0;0d0+24,-1, 4, 0, 0, 0, 0, false, true, false, false, 5, 0, 0, 63, Pa,-1,18; 19; 3; 1; 41, 0, false	105;28;-1;-1;-1;0;0d0+28,-1, 3, 0, 0, 0, 0, false, true, false, false, 5, 0, 0, 63, Pa,-1,18; 19; 3; 1; 41, 0, false	105;35;-1;-1;-1;0;0d0+35,-1, 2, 0, 0, 0, 0, false, true, false, false, 5, 0, 0, 63, Pa,-1,18; 19; 3; 1; 41, 0, false	-1	
452	Armure Incandescente	-1	0,0,0	105;15;-1;-1;-1;0;0d0+15,-1, 5, 0, 0, 0, 0, true, true, false, false, 5, 0, 0, 63, Pa,-1,18; 19; 3; 1; 41, 0, true	105;21;-1;-1;-1;0;0d0+21,-1, 4, 0, 0, 0, 0, true, true, false, false, 5, 0, 0, 63, Pa,-1,18; 19; 3; 1; 41, 0, true	105;24;-1;-1;-1;0;0d0+24,-1, 4, 0, 0, 0, 0, true, true, false, false, 5, 0, 0, 63, Pa,-1,18; 19; 3; 1; 41, 0, true	105;28;-1;-1;-1;0;0d0+28,-1, 3, 0, 0, 0, 0, true, true, false, false, 5, 0, 0, 63, Pa,-1,18; 19; 3; 1; 41, 0, true	105;35;-1;-1;-1;0;0d0+35,-1, 2, 0, 0, 0, 0, true, true, false, false, 5, 0, 0, 63, Pa,-1,18; 19; 3; 1; 41, 0, true	-1	
453	Armure Terrestre	110	0,1,1	105;15;-1;-1;-1;0;0d0+15,-1, 5, 0, 0, 0, 0, true, true, false, false, 5, 0, 0, 63, Pa,-1,18; 19; 3; 1; 41, 0, false	105;21;-1;-1;-1;0;0d0+21,-1, 4, 0, 0, 0, 0, true, true, false, false, 5, 0, 0, 63, Pa,-1,18; 19; 3; 1; 41, 0, false	105;24;-1;-1;-1;0;0d0+24,-1, 4, 0, 0, 0, 0, true, true, false, false, 5, 0, 0, 63, Pa,-1,18; 19; 3; 1; 41, 0, false	105;28;-1;-1;-1;0;0d0+28,-1, 3, 0, 0, 0, 0, true, true, false, false, 5, 0, 0, 63, Pa,-1,18; 19; 3; 1; 41, 0, false	105;35;-1;-1;-1;0;0d0+35,-1, 2, 0, 0, 0, 0, true, true, false, false, 5, 0, 0, 63, Pa,-1,18; 19; 3; 1; 41, 0, false	-1	
454	Armure Venteuse	-1	0,0,0	105;15;-1;-1;-1;0;0d0+15,-1, 5, 0, 0, 0, 0, true, true, false, false, 5, 0, 0, 63, Pa,-1,18; 19; 3; 1; 41, 0, false	105;21;-1;-1;-1;0;0d0+21,-1, 4, 0, 0, 0, 0, true, true, false, false, 5, 0, 0, 63, Pa,-1,18; 19; 3; 1; 41, 0, false	105;24;-1;-1;-1;0;0d0+24,-1, 4, 0, 0, 0, 0, true, true, false, false, 5, 0, 0, 63, Pa,-1,18; 19; 3; 1; 41, 0, false	105;28;-1;-1;-1;0;0d0+28,-1, 3, 0, 0, 0, 0, true, true, false, false, 5, 0, 0, 63, Pa,-1,18; 19; 3; 1; 41, 0, false	105;35;-1;-1;-1;0;0d0+35,-1, 2, 0, 0, 0, 0, true, true, false, false, 5, 0, 0, 63, Pa,-1,18; 19; 3; 1; 41, 0, false	-1	
455	Flamme	-1	0,0,0	99;11;15;-1;0;0;1d5+10,99;13;17;-1;0;0;1d5+12, 4, 1, 8, 50, 50, true, true, false, true, 5, 0, 0, 0, PaPa,-1,18; 19; 3; 1; 41, 0, true	99;16;20;-1;0;0;1d5+15,99;21;25;-1;0;0;1d5+20, 4, 1, 8, 50, 50, true, true, false, true, 5, 0, 0, 0, PaPa,-1,18; 19; 3; 1; 41, 0, true	99;21;25;-1;0;0;1d5+20,99;26;30;-1;0;0;1d5+25, 4, 1, 8, 50, 50, true, true, false, true, 5, 0, 0, 0, PaPa,-1,18; 19; 3; 1; 41, 0, true	99;31;35;-1;0;0;1d5+30,99;36;40;-1;0;0;1d5+35, 4, 1, 9, 50, 50, true, true, false, true, 5, 0, 0, 0, PaPa,-1,18; 19; 3; 1; 41, 0, true	99;46;50;-1;0;0;1d5+45,99;51;55;-1;0;0;1d5+50, 4, 1, 9, 50, 50, true, true, false, true, 5, 0, 0, 0, PaPa,-1,18; 19; 3; 1; 41, 0, true	-1	
456	Cyclone	-1	0,0,0	98;11;20;-1;0;0;1d10+10,98;16;25;-1;0;0;1d10+15, 4, 2, 6, 50, 50, false, false, false, true, 5, 0, 0, 0, PaPa,-1,18; 19; 3; 1; 41, 0, true	98;11;23;-1;0;0;1d13+10,98;16;28;-1;0;0;1d13+15, 4, 2, 7, 50, 50, false, false, false, true, 5, 0, 0, 0, PaPa,-1,18; 19; 3; 1; 41, 0, true	98;11;27;-1;0;0;1d17+10,98;16;32;-1;0;0;1d17+15, 4, 2, 8, 50, 50, false, false, false, true, 5, 0, 0, 0, PaPa,-1,18; 19; 3; 1; 41, 0, true	98;11;33;-1;0;0;1d23+10,98;16;38;-1;0;0;1d23+15, 4, 2, 9, 50, 50, false, false, false, true, 5, 0, 0, 0, PaPa,-1,18; 19; 3; 1; 41, 0, true	98;11;40;-1;0;0;1d30+10,98;16;45;-1;0;0;1d30+15, 4, 2, 10, 50, 50, false, false, false, true, 5, 0, 0, 0, PaPa,-1,18; 19; 3; 1; 41, 0, true	-1	
457	Vague	-1	0,0,0	96;6;15;-1;0;0;1d10+5,96;11;20;-1;0;0;1d10+10, 5, 1, 5, 50, 50, true, true, false, false, 5, 0, 0, 0, LdLd,-1,18; 19; 3; 1; 41, 0, true	96;11;20;-1;0;0;1d10+10,96;16;25;-1;0;0;1d10+15, 5, 1, 5, 50, 50, true, true, false, false, 5, 0, 0, 0, LdLd,-1,18; 19; 3; 1; 41, 0, true	96;16;25;-1;0;0;1d10+15,96;21;30;-1;0;0;1d10+20, 5, 1, 5, 50, 50, true, true, false, false, 5, 0, 0, 0, LdLd,-1,18; 19; 3; 1; 41, 0, true	96;21;30;-1;0;0;1d10+20,96;26;35;-1;0;0;1d10+25, 5, 1, 5, 50, 50, true, true, false, false, 5, 0, 0, 0, LdLd,-1,18; 19; 3; 1; 41, 0, true	96;31;40;-1;0;0;1d10+30,96;36;45;-1;0;0;1d10+35, 5, 1, 6, 50, 50, true, true, false, false, 5, 0, 0, 0, LdLd,-1,18; 19; 3; 1; 41, 0, true	-1	
458	Rocher	2060	51,0,1	97;21;25;-1;0;0;1d5+20,97;26;30;-1;0;0;1d5+25, 5, 1, 5, 50, 50, false, true, false, true, 5, 0, 0, 0, CcCc,-1,18; 19; 3; 1; 41, 0, true	97;21;30;-1;0;0;1d10+20,97;26;35;-1;0;0;1d10+25, 5, 1, 5, 50, 50, false, true, false, true, 5, 0, 0, 0, CcCc,-1,18; 19; 3; 1; 41, 0, true	97;21;35;-1;0;0;1d15+20,97;26;40;-1;0;0;1d15+25, 5, 1, 6, 50, 50, false, true, false, true, 5, 0, 0, 0, CcCc,-1,18; 19; 3; 1; 41, 0, true	97;21;40;-1;0;0;1d20+20,97;26;45;-1;0;0;1d20+25, 5, 1, 6, 50, 50, false, true, false, true, 5, 0, 0, 0, CcCc,-1,18; 19; 3; 1; 41, 0, true	97;21;50;-1;0;0;1d30+20,97;26;55;-1;0;0;1d30+25, 5, 1, 7, 50, 50, false, true, false, true, 5, 0, 0, 0, CcCc,-1,18; 19; 3; 1; 41, 0, true	-1	
459	Mot soignant	-1	0,0,0	108;10;-1;-1;0;0;0d0+10,-1, 5, 0, 3, 0, 0, false, true, false, true, 5, 0, 0, 0, Pa,-1,18; 19; 3; 1; 41, 0, true	108;13;14;-1;0;0;1d2+12,-1, 5, 0, 3, 0, 0, false, true, false, true, 5, 0, 0, 0, Pa,-1,18; 19; 3; 1; 41, 0, true	108;15;17;-1;0;0;1d3+14,-1, 5, 0, 3, 0, 0, false, true, false, true, 5, 0, 0, 0, Pa,-1,18; 19; 3; 1; 41, 0, true	108;17;20;-1;0;0;1d4+16,-1, 5, 0, 3, 0, 0, false, true, false, true, 5, 0, 0, 0, Pa,-1,18; 19; 3; 1; 41, 0, true	108;21;25;-1;0;0;1d5+20,-1, 5, 0, 3, 0, 0, false, true, false, true, 5, 0, 0, 0, Pa,-1,18; 19; 3; 1; 41, 0, true	-1	
460	DÃ©senvoutement	102	11,1,1	132;-1;-1;-1;0;0,-1, 6, 1, 5, 0, 0, false, true, false, true, 5, 0, 1, 4, Pa,-1,18; 19; 3; 1; 41, 0, true	132;-1;-1;-1;0;0,-1, 6, 1, 6, 0, 0, false, true, false, true, 5, 0, 1, 4, Pa,-1,18; 19; 3; 1; 41, 0, true	132;-1;-1;-1;0;0,-1, 6, 1, 7, 0, 0, false, true, false, true, 5, 0, 1, 4, Pa,-1,18; 19; 3; 1; 41, 0, true	132;-1;-1;-1;0;0,-1, 6, 1, 8, 0, 0, false, true, false, true, 5, 0, 1, 4, Pa,-1,18; 19; 3; 1; 41, 0, true	132;-1;-1;-1;0;0,-1, 4, 1, 9, 0, 0, false, false, false, true, 5, 0, 1, 4, Pa,-1,18; 19; 3; 1; 41, 0, true	-1	
461	Compulsion de masse	-1	0,0,0	112;2;3;-1;10;0;1d2+1,112;3;4;-1;10;0;1d2+2, 4, 0, 0, 50, 50, false, false, false, false, 5, 0, 0, 20, CcCc,-1,18; 19; 3; 1; 41, 0, true	112;3;5;-1;10;0;1d3+2,112;4;6;-1;10;0;1d3+3, 4, 0, 0, 50, 50, false, false, false, false, 5, 0, 0, 20, CcCc,-1,18; 19; 3; 1; 41, 0, true	112;4;7;-1;10;0;1d4+3,112;5;8;-1;10;0;1d4+4, 4, 0, 0, 50, 50, false, false, false, false, 5, 0, 0, 20, CcCc,-1,18; 19; 3; 1; 41, 0, true	112;5;9;-1;10;0;1d5+4,112;6;10;-1;10;0;1d5+5, 4, 0, 0, 50, 50, false, false, false, false, 5, 0, 0, 20, CcCc,-1,18; 19; 3; 1; 41, 0, true	112;6;11;-1;10;0;1d6+5,112;7;12;-1;10;0;1d6+6, 4, 0, 0, 50, 50, false, false, false, false, 5, 0, 0, 20, CdCd,-1,18; 19; 3; 1; 41, 0, true	-1	
462	DÃ©stabilisation	-1	0,0,0	122;3;-1;-1;5;0;0d0+3,-1, 2, 1, 6, 0, 0, false, true, false, false, 5, 0, 0, 4, Pa,-1,18; 19; 3; 1; 41, 0, false	122;4;-1;-1;5;0;0d0+4,-1, 2, 1, 6, 0, 0, false, true, false, false, 5, 0, 0, 4, Pa,-1,18; 19; 3; 1; 41, 0, false	122;5;-1;-1;5;0;0d0+5,-1, 2, 1, 6, 0, 0, false, true, false, false, 5, 0, 0, 4, Pa,-1,18; 19; 3; 1; 41, 0, false	122;6;-1;-1;5;0;0d0+6,-1, 2, 1, 6, 0, 0, false, true, false, false, 5, 0, 0, 4, Pa,-1,18; 19; 3; 1; 41, 0, false	122;8;-1;-1;5;0;0d0+8,-1, 2, 1, 6, 0, 0, false, true, false, false, 5, 0, 0, 4, Pa,-1,18; 19; 3; 1; 41, 0, false	-1	



	 */
	
	
	
	
}
