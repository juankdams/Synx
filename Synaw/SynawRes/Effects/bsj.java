package Effects;


public final class bsj extends avY  //class_4797_bsj
{
	
  private static final bsj fOz = new bsj();

  public static final Effect fOA = new Effect(-1, new cmB(), fOz, -1, "Effet Variable", null);

  public static final Effect fOB = new Effect(1, new bFw(bTI.heW, dnO.lnU), fOz, 1001, "Perte de PdV - non réductible!", cMe.krl);

  public static final Effect fOC = new Effect(2, new bFw(bTI.heX, dnO.lnU), fOz, 1001, "Perte de PdV - Feu", cMe.krl);

  public static final Effect fOD = new Effect(3, new bFw(bTI.heZ, dnO.lnU), fOz, 1001, "Perte de PdV - Terre", cMe.krl);

  public static final Effect fOE = new Effect(4, new bFw(bTI.heY, dnO.lnU), fOz, 1001, "Perte de PdV - Eau", cMe.krl);

  public static final Effect fOF = new Effect(5, new bFw(bTI.hfa, dnO.lnU), fOz, 1001, "Perte de PdV - Air", cMe.krl);

  public static final Effect fOG = new Effect(6, new aGJ(bTI.heY, dnO.lnU), fOz, 1001, "Perte de PdV à cause de Kamas - Eau", cMe.krl);

  public static final Effect fOH = new Effect(11, new aZw(bTI.heW, dnO.lnU), fOz, 1001, "Vol de Vie - non réductible", cMe.krl);

  public static final Effect fOI = new Effect(12, new aZw(bTI.heX, dnO.lnU), fOz, 1001, "Vol de Vie - Feu", cMe.krl);

  public static final Effect fOJ = new Effect(13, new aZw(bTI.heZ, dnO.lnU), fOz, 1001, "Vol de Vie - Terre", cMe.krl);

  public static final Effect fOK = new Effect(14, new aZw(bTI.heY, dnO.lnU), fOz, 1001, "Vol de Vie - Eau", cMe.krl);

  public static final Effect fOL = new Effect(15, new aZw(bTI.hfa, dnO.lnU), fOz, 1001, "Vol de Vie - Air", cMe.krl);

  public static final Effect fOM = new Effect(16, new dWw(eu.ayM), fOz, -1, "Force la valeur des PdV", cMe.krk);

  public static final Effect fON = new Effect(17, new QO(bTI.heW), fOz, 1013, "Don de PdV", cMe.krk);

  public static final Effect fOO = new Effect(20, new kM(eu.ayM), fOz, -1, "Boost de PdV", cMe.krk);

  public static final Effect fOP = new Effect(21, new cJc(eu.ayM), fOz, 1001, "DeBoost de PdV", cMe.krl);

  public static final Effect fOQ = new Effect(23, new dHK(), fOz, -1, "Accumulation des pertes de PdV", cMe.krk);

  public static final Effect fOR = new Effect(24, new bAH(), fOz, -1, "Copie le Max d'une charac", cMe.krm);

  public static final Effect fOS = new Effect(25, new aWl(bTI.heW), fOz, 1002, "Soin", cMe.krk);

  public static final Effect fOT = new Effect(26, new dqZ(eu.aza), fOz, -1, "Boost des Soins", cMe.krk);

  public static final Effect fOU = new Effect(27, new aYO(eu.aza), fOz, -1, "Deboost des Soins", cMe.krl);

  public static final Effect fOV = new Effect(28, new dkb(), fOz, -1, "Mort instantanée", cMe.krl);

  public static final Effect fOW = new Effect(29, new cdk(), fOz, 1002, "Soins (%)", cMe.krk);

  public static final Effect fOX = new Effect(30, new dRu(), fOz, 1000, "Utilisation de PA (à ne pas utiliser normalement)", cMe.krl);

  public static final Effect fOY = new Effect(31, new kM(eu.ayN), fOz, 1008, "Boost de PA", cMe.krk);

  public static final Effect fOZ = new Effect(32, new cJc(eu.ayN), fOz, 1007, "Deboost de PA", cMe.krl);

  public static final Effect fPa = new Effect(33, new dqZ(eu.ayN), fOz, 1008, "Gain de PA (attention : gain != boost)", cMe.krk);

  public static final Effect fPb = new Effect(35, new dqh(eu.ayN), fOz, 1007, "Vol de PA (gain pour le caster, Debuff pour l'autre)", cMe.krl);

  public static final Effect fPc = new Effect(36, new aHG(eu.ayN), fOz, 1008, "Don de PA (debuff pour le caster, Buff pour l'autre)", cMe.krl);

  public static final Effect fPd = new Effect(37, new aYO(eu.ayN), fOz, 1007, "Perte de PA (attention, perte != deboost)", cMe.krl);

  public static final Effect fPe = new Effect(38, new dqZ(eu.azy), fOz, -1, "Gain de résistance au deboost de PA", cMe.krk);

  public static final Effect fPf = new Effect(39, new dqZ(), fOz, -1, "Gain de charac générique", cMe.krk);

  public static final Effect fPg = new Effect(40, new aYO(), fOz, -1, "Perte de charac générique", cMe.krk);

  public static final Effect fPh = new Effect(41, new kM(eu.ayO), fOz, 1005, "Boost de PM", cMe.krk);

  public static final Effect fPi = new Effect(42, new cJc(eu.ayO), fOz, 1004, "Deboost de PM", cMe.krl);

  public static final Effect fPj = new Effect(43, new dqZ(eu.ayO), fOz, 1005, "Gain de PM (attention :gain != boost", cMe.krk);

  public static final Effect fPk = new Effect(44, new aYO(eu.ayO), fOz, 1004, "Perte de PM", cMe.krl);

  public static final Effect fPl = new Effect(45, new dqh(eu.ayO), fOz, 1004, "Vol de PM", cMe.krl);

  public static final Effect fPm = new Effect(46, new dqZ(eu.azx), fOz, -1, "Gain de résistance au deboost de PM", cMe.krk);

  public static final Effect fPn = new Effect(47, new vV(), fOz, -1, "Gain de niveau de sort", cMe.krk);

  public static final Effect fPo = new Effect(50, new cPE(bTI.heW, dnO.lnU), fOz, -1, "Perte de PdV avec rebond (sous-effet 1 nécessaire)", cMe.krl);

  public static final Effect fPp = new Effect(51, new cPE(bTI.heZ, dnO.lnU), fOz, -1, "Perte de PdV avec rebond - Terre (sous-effet 3 nécessaire)", cMe.krl);

  public static final Effect fPq = new Effect(52, new cPE(bTI.heX, dnO.lnU), fOz, -1, "Perte de PdV avec rebond - Feu (sous-effet 2 nécessaire)", cMe.krl);

  public static final Effect fPr = new Effect(53, new cPE(bTI.heY, dnO.lnU), fOz, -1, "Perte de PdV avec rebond - Eau (sous-effet 4 nécessaire)", cMe.krl);

  public static final Effect fPs = new Effect(54, new cPE(bTI.hfa, dnO.lnU), fOz, -1, "Perte de PdV avec rebond - Air (sous-effet 5 nécessaire)", cMe.krl);

  public static final Effect fPt = new Effect(59, new dGJ(), fOz, 1013, "Don de PdV (% de la vie max du caster)", cMe.krl);

  public static final Effect fPu = new Effect(60, new dFW(bTI.heY), fOz, -1, "Gain de PdV avec rebond", cMe.krk);

  public static final Effect fPv = new Effect(61, new kK(), fOz, -1, "Vol de Charac (perte pour la cible)", cMe.krl);

  public static final Effect fPw = new Effect(62, new cCG(eu.ayN), fOz, 1007, "Vol de PA (en %)", cMe.krl);

  public static final Effect fPx = new Effect(63, new cCG(eu.ayP), fOz, 1007, "Vol de WP (gain pour le caster, Debuff pour l'autre)", cMe.krl);

  public static final Effect fPy = new Effect(64, new dqh(eu.azc), fOz, -1, "Vol de Dégats (gain pour le caster, Debuff pour l'autre)", cMe.krl);

  public static final Effect fPz = new Effect(65, new dqh(eu.azj), fOz, -1, "Vol de Resist (gain pour le caster, Debuff pour l'autre)", cMe.krl);

  public static final Effect fPA = new Effect(66, new cCG(eu.ayO), fOz, 1004, "Vol de PM (en %)", cMe.krl);

  public static final Effect fPB = new Effect(70, new dqZ(eu.azo), fOz, -1, "Gain de la résistance aux Soins (%)", cMe.krl);

  public static final Effect fPC = new Effect(71, new dqZ(eu.ayZ), fOz, -1, "Augmente la résistance aux dégats pris de dos", cMe.krk);

  public static final Effect fPD = new Effect(72, new aYO(eu.azo), fOz, -1, "Perte de la résistance aux Soins (%)", cMe.krk);

  public static final Effect fPE = new Effect(73, new dqh(eu.ayP), fOz, 1007, "Vol de WP (gain pour le caster, Debuff pour l'autre)", cMe.krl);

  public static final Effect fPF = new Effect(74, new dqh(eu.azq), fOz, -1, "Vol d'Initiative (gain pour le caster, Debuff pour l'autre)", cMe.krl);

  public static final Effect fPG = new Effect(80, new dqZ(eu.azj), fOz, -1, "Gain de résistance à tous les Eléments (%)", cMe.krk);

  public static final Effect fPH = new Effect(82, new dqZ(eu.azk), fOz, -1, "Gain de la résistance Feu (%)", cMe.krk);

  public static final Effect fPI = new Effect(83, new dqZ(eu.azl), fOz, -1, "Gain de la résistance Eau (%)", cMe.krk);

  public static final Effect fPJ = new Effect(84, new dqZ(eu.azm), fOz, -1, "Gain de la résistance Terre (%)", cMe.krk);

  public static final Effect fPK = new Effect(85, new dqZ(eu.azn), fOz, -1, "Gain de la résistance Air (%)", cMe.krk);

  public static final Effect fPL = new Effect(90, new aYO(eu.azj), fOz, -1, "Perte de résistance à tous les éléments (%)", cMe.krl);

  public static final Effect fPM = new Effect(92, new aYO(eu.azm), fOz, -1, "Perte de la résistance Terre (%)", cMe.krl);

  public static final Effect fPN = new Effect(93, new aYO(eu.azk), fOz, -1, "Perte de la résistance Feu (%)", cMe.krl);

  public static final Effect fPO = new Effect(94, new aYO(eu.azl), fOz, -1, "Perte de la résistance Eau (%)", cMe.krl);

  public static final Effect fPP = new Effect(95, new aYO(eu.azn), fOz, -1, "Perte de la résistance Air (%)", cMe.krl);

  public static final Effect fPQ = new Effect(120, new dqZ(eu.azc), fOz, -1, "Gain aux dégâts (%)", cMe.krk);

  public static final Effect fPR = new Effect(122, new dqZ(eu.azd), fOz, -1, "Gain aux dégâts - Feu (%)", cMe.krk);

  public static final Effect fPS = new Effect(123, new dqZ(eu.azf), fOz, -1, "Gain aux dégâts - Terre (%)", cMe.krk);

  public static final Effect fPT = new Effect(124, new dqZ(eu.aze), fOz, -1, "Gain aux dégâts - Eau (%)", cMe.krk);

  public static final Effect fPU = new Effect(125, new dqZ(eu.azg), fOz, -1, "Gain aux dégâts - Air (%)", cMe.krk);

  public static final Effect fPV = new Effect(126, new dqZ(eu.azC), fOz, -1, "Gain de DMG appliqué à la valeur finale", cMe.krk);

  public static final Effect fPW = new Effect(127, new dqZ(eu.azD), fOz, -1, "Gain Res au DMG appliqué à la valeur finale", cMe.krk);

  public static final Effect fPX = new Effect(128, new aYO(eu.azD), fOz, -1, "Perte de Rés au DMG appliqué à la valeur finale", cMe.krk);

  public static final Effect fPY = new Effect(129, new aYO(eu.azC), fOz, -1, "Perte de DMG appliqué à la valeur finale", cMe.krl);

  public static final Effect fPZ = new Effect(130, new aYO(eu.azc), fOz, -1, "Perte aux dégâts (%)", cMe.krl);

  public static final Effect fQa = new Effect(132, new aYO(eu.azd), fOz, -1, "Perte aux dégâts - Feu (%)", cMe.krl);

  public static final Effect fQb = new Effect(133, new aYO(eu.azf), fOz, -1, "Perte aux dégâts - Terre (%)", cMe.krl);

  public static final Effect fQc = new Effect(134, new aYO(eu.aze), fOz, -1, "Perte aux dégâts - Eau (%)", cMe.krl);

  public static final Effect fQd = new Effect(135, new aYO(eu.azg), fOz, -1, "Perte aux dégâts - Air (%)", cMe.krl);

  public static final Effect fQe = new Effect(136, new Zn(), fOz, -1, "Perte de PdV feu en fonction des PdV manquant du caster, à partir d'un seuil", cMe.krl);

  public static final Effect fQf = new Effect(140, new dqZ(eu.azh), fOz, -1, "Renvoi de dégâts (%)", cMe.krk);

  public static final Effect fQg = new Effect(141, new dqZ(eu.azi), fOz, -1, "Absorption de dégâts (%)", cMe.krk);

  public static final Effect fQh = new Effect(148, new dqZ(eu.azG), fOz, -1, "Bonus au % de PdV volé sur un vol de PdV", cMe.krk);

  public static final Effect fQi = new Effect(149, new dqZ(eu.azF), fOz, -1, "Augmente le bonus aux degats des Coup Critique", cMe.krk);

  public static final Effect fQj = new Effect(150, new dqZ(eu.ayS), fOz, -1, "Augmente le taux de Coup Critique", cMe.krk);

  public static final Effect fQk = new Effect(151, new dqZ(eu.ayT), fOz, -1, "Augmente le taux d'Echec Critique", cMe.krl);

  public static final Effect fQl = new Effect(152, new dqZ(eu.aAb), fOz, -1, "Augmente l'Agilité", cMe.krk);

  public static final Effect fQm = new Effect(153, new aYO(eu.aAb), fOz, -1, "Diminue l'Agilité", cMe.krl);

  public static final Effect fQn = new Effect(154, new dqZ(eu.azZ), fOz, -1, "Augmente la Force", cMe.krk);

  public static final Effect fQo = new Effect(155, new aYO(eu.azZ), fOz, -1, "Diminue la Force", cMe.krl);

  public static final Effect fQp = new Effect(156, new dqZ(eu.aAa), fOz, -1, "Augmente l'Intelligence", cMe.krk);

  public static final Effect fQq = new Effect(157, new aYO(eu.aAa), fOz, -1, "Diminue l'Intelligence", cMe.krl);

  public static final Effect fQr = new Effect(158, new dqZ(eu.aAc), fOz, -1, "Augmente la Chance", cMe.krk);

  public static final Effect fQs = new Effect(159, new aYO(eu.aAc), fOz, -1, "Diminue la Chance", cMe.krl);

  public static final Effect fQt = new Effect(160, new dqZ(eu.ayU), fOz, 1011, "Augmente la Portée", cMe.krk);

  public static final Effect fQu = new Effect(161, new aYO(eu.ayU), fOz, 1012, "Diminue la Portée", cMe.krl);

  public static final Effect fQv = new Effect(162, new dqZ(eu.azp), fOz, -1, "Augmente la Prospection", cMe.krk);

  public static final Effect fQw = new Effect(163, new aYO(eu.azp), fOz, -1, "Diminue la Prospection", cMe.krl);

  public static final Effect fQx = new Effect(166, new dqZ(eu.azr), fOz, -1, "Augmente la Sagesse", cMe.krk);

  public static final Effect fQy = new Effect(167, new aYO(eu.azr), fOz, -1, "Diminue la Sagesse", cMe.krl);

  public static final Effect fQz = new Effect(168, new aYO(eu.ayS), fOz, -1, "Diminue le taux de Coup Critique", cMe.krk);

  public static final Effect fQA = new Effect(169, new aYO(eu.ayT), fOz, -1, "Diminue le taux d'Echec Critique", cMe.krl);

  public static final Effect fQB = new Effect(171, new dqZ(eu.azq), fOz, -1, "Gain d'Initiative", cMe.krk);

  public static final Effect fQC = new Effect(172, new aYO(eu.azq), fOz, -1, "Perte d'Initiative", cMe.krl);

  public static final Effect fQD = new Effect(173, new dqZ(eu.ayQ), fOz, -1, "Gain de Tacle", cMe.krk);

  public static final Effect fQE = new Effect(174, new aYO(eu.ayQ), fOz, -1, "Perte de Tacle", cMe.krl);

  public static final Effect fQF = new Effect(175, new dqZ(eu.ayR), fOz, -1, "Gain d'Esquive", cMe.krk);

  public static final Effect fQG = new Effect(176, new aYO(eu.ayR), fOz, -1, "Perte d'Esquive", cMe.krl);

  public static final Effect fQH = new Effect(180, new dqZ(eu.ayY), fOz, -1, "Gain en bonus de Backstab", cMe.krk);

  public static final Effect fQI = new Effect(181, new aYO(eu.ayY), fOz, -1, "Perte du bonus de Backstab", cMe.krl);

  public static final Effect fQJ = new Effect(182, new dqZ(eu.azI), fOz, -1, "Gain en maitrise des mécanismes (Obsolète - devient gain aux dégats de CMC (838))", cMe.krk);

  public static final Effect fQK = new Effect(183, new dqZ(eu.ayV), fOz, -1, "Gain en Mécanisme (Obsolète - devient gain en commandement (184))", cMe.krk);

  public static final Effect fQL = new Effect(184, new dqZ(eu.ayV), fOz, -1, "Gain en Controle", cMe.krk);

  public static final Effect fQM = new Effect(191, new kM(eu.ayP), fOz, -1, "Boost de WP", cMe.krk);

  public static final Effect fQN = new Effect(192, new cJc(eu.ayP), fOz, -1, "Deboost de WP", cMe.krl);

  public static final Effect fQO = new Effect(193, new dqZ(eu.ayP), fOz, 1032, "Gain de WP", cMe.krk);

  public static final Effect fQP = new Effect(194, new aYO(eu.ayP), fOz, 1035, "Perte de WP", cMe.krl);

  public static final Effect fQQ = new Effect(195, new kK(eu.ayP), fOz, 1012, "Vol de WP", cMe.krl);

  public static final Effect fQR = new Effect(196, new SL(), fOz, -1, "Resurrection", cMe.krk);

  public static final Effect fQS = new Effect(197, new dqZ(eu.azw), fOz, -1, "Augmente la Vitalité", cMe.krk);

  public static final Effect fQT = new Effect(198, new aYO(eu.azw), fOz, -1, "Diminue la Vitalité", cMe.krl);

  public static final Effect fQU = new Effect(200, new cNp(cfY.hBb), fOz, -1, "Passe son tour (propriété) (P)", cMe.krm);

  public static final Effect fQV = new Effect(201, new cNp(cfY.hBc), fOz, -1, "Reduit la Portée au CAC (P)", cMe.krm);

  public static final Effect fQW = new Effect(202, new cNp(cfY.hBd), fOz, -1, "Entravé (ne peut plus bouger) (P)", cMe.krm);

  public static final Effect fQX = new Effect(203, new cNp(cfY.hBe), fOz, -1, "Immunité à la perte de PM (sauf self) (P)", cMe.krm);

  public static final Effect fQY = new Effect(204, new cNp(cfY.hBf), fOz, -1, "Invisible (P)", cMe.krm);

  public static final Effect fQZ = new Effect(205, new cNp(cfY.hBq), fOz, -1, "Invisible Supérieur (unbreakable) (P)", cMe.krm);

  public static final Effect fRa = new Effect(206, new cNp(dKm.lWN), fOz, -1, "Ne peut pas déclencher un combat (P)", cMe.krm);

  public static final Effect fRb = new Effect(207, new dgp(), fOz, -1, "Change le controlleur d'un combattant par le caster", cMe.krm);

  public static final Effect fRc = new Effect(208, new cNp(cfY.hBi), fOz, -1, "Coward : ne peut attaquer plus gros que soi (FP)", cMe.krm);

  public static final Effect fRd = new Effect(209, new cNp(cfY.hBj), fOz, -1, "Hâte : premiere dans la timeline(FP)", cMe.krm);

  public static final Effect fRe = new Effect(210, new cNp(cfY.hBk), fOz, -1, "Stabilisé (ne peut pas etre bougé par autrui) (FP)", cMe.krm);

  public static final Effect fRf = new Effect(211, new cNp(dKm.lWP), fOz, -1, "Ne peut pas être attaqué (WP)", cMe.krm);

  public static final Effect fRg = new Effect(212, new cNp(cfY.hBn), fOz, -1, "Ne peut plus tacler (FP)", cMe.krm);

  public static final Effect fRh = new Effect(213, new hn(), fOz, -1, "Résistance aux etats", cMe.krm);

  public static final Effect fRi = new Effect(214, new cNp(dKm.lWS), fOz, -1, "Pas d'xp de combat (WP)", cMe.krm);

  public static final Effect fRj = new Effect(215, new cNp(cfY.hBp), fOz, -1, "Limite le coût en PA maximum utilisable", cMe.krm);

  public static final Effect fRk = new Effect(216, new cNp(aIm.egQ), fOz, -1, "Grip : La case arrête le joueur poussé / tiré", cMe.krm);

  public static final Effect fRl = new Effect(217, new cNp(cfY.hBg), fOz, -1, "Invisible révélé pour un temps (P) ", cMe.krm);

  public static final Effect fRm = new Effect(218, new cNp(cfY.hBs), fOz, -1, "Mort-Vivant (P) ", cMe.krl);

  public static final Effect fRn = new Effect(219, new cNp(cfY.hBt), fOz, -1, "Inciblable : ne peut pas être ciblé de manière directe (P) ", cMe.krl);

  public static final Effect fRo = new Effect(220, new cNp(cfY.hBu), fOz, -1, "Double le Focus : l'IA a deux fois plus envie de baffer le porteur de cette propriété (P) ", cMe.krl);

  public static final Effect fRp = new Effect(221, new cNp(cfY.hBv), fOz, -1, "Stasis 1 : Ajoute 1 au coût en WP du sort (P) ", cMe.krl);

  public static final Effect fRq = new Effect(222, new cNp(cfY.hBw), fOz, -1, "Stasis 2 : Ajoute 2 au coût en WP du sort (P) ", cMe.krl);

  public static final Effect fRr = new Effect(223, new cNp(cfY.hBx), fOz, -1, "Stasis 3 : Interdit les coûts en WP du sort (P) ", cMe.krl);

  public static final Effect fRs = new Effect(224, new cNp(cfY.hBy), fOz, -1, "Diminue au maximum le focus : l'ia choisira cette cible en dernier recours ", cMe.krl);

  public static final Effect fRt = new Effect(225, new dBa(), fOz, -1, "Résurection hors combat", cMe.krk);

  public static final Effect fRu = new Effect(226, new cNp(cfY.hBB), fOz, -1, "Sonné 1 : Ajoute 1 au coût des PA du sort (P)", cMe.krl);

  public static final Effect fRv = new Effect(227, new cNp(cfY.hBC), fOz, -1, "Sonné 2 : Ajoute 2 au coût des PA du sort (P)", cMe.krl);

  public static final Effect fRw = new Effect(228, new cNp(cfY.hBD), fOz, -1, "Sonné 3 : ne peut plus utiliser de PA (P)", cMe.krl);

  public static final Effect fRx = new Effect(229, new cNp(cfY.hBE), fOz, -1, "Boiteux 1 : Ajoute 1 au coût des PM du sort (P)", cMe.krl);

  public static final Effect fRy = new Effect(230, new cNp(cfY.hBF), fOz, -1, "Boiteux 2 : Ajoute 2 au coût des PM du sort (P)", cMe.krl);

  public static final Effect fRz = new Effect(231, new cNp(cfY.hBG), fOz, -1, "Boiteux 3 : ne peut plus utiliser de PM (P)", cMe.krl);

  public static final Effect fRA = new Effect(232, new cNp(cfY.hBH), fOz, -1, "Eclopé : 2 PM au lieu d'1 pour se déplacer (P)", cMe.krl);

  public static final Effect fRB = new Effect(234, new dqZ(eu.azz), fOz, -1, "Boost la Connaissance de l'Equipement", cMe.krk);

  public static final Effect fRC = new Effect(235, new dqZ(eu.azA), fOz, -1, "Augmente la probabilité de faire perdre des PA à une cible", cMe.krk);

  public static final Effect fRD = new Effect(236, new dqZ(eu.azB), fOz, -1, "Augmente la probabilité de faire perdre des PM à une cible", cMe.krk);

  public static final Effect fRE = new Effect(237, new cNp(cfY.hBJ), fOz, -1, "Extra-tour (P)", cMe.krk);

  public static final Effect fRF = new Effect(238, new cNp(cfY.hBl), fOz, -1, "Pas de mort en fin de combat", cMe.krk);

  public static final Effect fRG = new Effect(239, new aZP(), fOz, -1, "Ajoute un bonus d'application à un état", cMe.krk);

  public static final Effect fRH = new Effect(240, new cNp(cfY.hCa), fOz, -1, "Ne bloque pas les lignes de vue", cMe.krk);

  public static final Effect fRI = new Effect(241, new cNp(cfY.hCp), fOz, -1, "Ne peut pas etre taclé", cMe.krk);

  public static final Effect fRJ = new Effect(242, new cNp(cfY.hCd), fOz, -1, "Ne peut pas se téléporter", cMe.krk);

  public static final Effect fRK = new Effect(249, new fb(eu.ayM), fOz, -1, "Boost les PdV max de la cible en fct du nb d'alliés", cMe.krk);

  public static final Effect fRL = new Effect(250, new dgb(eu.ayM), fOz, -1, "Boost les PdV max de la cible (%) en fct des PdV max du caster", cMe.krk);

  public static final Effect fRM = new Effect(251, new aWl(bTI.hfa), fOz, 1002, "Soins - Air", cMe.krk);

  public static final Effect fRN = new Effect(253, new aWl(bTI.heZ), fOz, 1002, "Soins - Terre", cMe.krk);

  public static final Effect fRO = new Effect(258, new aWl(bTI.heY), fOz, 1002, "Soins - Eau", cMe.krk);

  public static final Effect fRP = new Effect(259, new aWl(bTI.heX), fOz, 1002, "Soins - Feu", cMe.krk);

  public static final Effect fRQ = new Effect(260, new kM(eu.azr), fOz, -1, "Boost la sagesse (augmente la valeur max)", cMe.krk);

  public static final Effect fRR = new Effect(261, new dWp(bTI.hfa), fOz, 1002, "Soins du caster par rapport aux PdV de la cible - Air", cMe.krk);

  public static final Effect fRS = new Effect(262, new dWp(bTI.heZ), fOz, 1002, "Soins du caster par rapport aux PdV de la cible - Terre", cMe.krk);

  public static final Effect fRT = new Effect(263, new dWp(bTI.heY), fOz, 1002, "Soins du caster par rapport aux PdV de la cible - Eau", cMe.krk);

  public static final Effect fRU = new Effect(264, new dWp(bTI.heX), fOz, 1002, "Soins du caster par rapport aux PdV de la cible - Feu", cMe.krk);

  public static final Effect fRV = new Effect(265, new dWp(bTI.heW), fOz, 1002, "Soins du caster par rapport aux PdV de la cible - Physique", cMe.krk);

  public static final Effect fRW = new Effect(270, new dqZ(eu.azq, true), fOz, -1, "Gain d'Initiative (%)", cMe.krk);

  public static final Effect fRX = new Effect(271, new aYO(eu.azq, true), fOz, -1, "Perte d'Initiative (%)", cMe.krl);

  public static final Effect fRY = new Effect(272, new wc(eu.ayO), fOz, -1, "Regen des MP au max", cMe.krk);

  public static final Effect fRZ = new Effect(300, new cfQ(), fOz, 1033, "Poussage", cMe.krm);

  public static final Effect fSa = new Effect(301, new chF(), fOz, 1033, "Tirage", cMe.krm);

  public static final Effect fSb = new Effect(302, new brt(), fOz, -1, "Téléport le caster de l'effet", cMe.krm);

  public static final Effect fSc = new Effect(303, new cMj(), fOz, -1, "Tourne le regard vers la cellule ou la direction ciblée, ou dans une direction aléatoire", cMe.krm);

  public static final Effect fSd = new Effect(304, new bZG(), fOz, 1015, "Applique un Etat", cMe.krm);

  public static final Effect fSe = new Effect(305, new bqe(), fOz, 1033, "Se rapproche de la cible", cMe.krm);

  public static final Effect fSf = new Effect(306, new bSg(), fOz, -1, "Balance la cible derriere son dos", cMe.krm);

  public static final Effect fSg = new Effect(307, new bJT(), fOz, -1, "Invoque une créature", cMe.krm);

  public static final Effect fSh = new Effect(308, new crx(), fOz, -1, "Pose un Piège", cMe.krm);

  public static final Effect fSi = new Effect(309, new clp(), fOz, -1, "Renvoi un sort entier (a utiliser avec les triggers spécifiques de lancement de sort)", cMe.krm);

  public static final Effect fSj = new Effect(310, new bPD(), fOz, -1, "Etat en lui même (ne pas utiliser)", cMe.krm);

  public static final Effect fSk = new Effect(311, new cvw(), fOz, -1, "Pose un Cadran sur le sol", cMe.krm);

  public static final Effect fSl = new Effect(312, new ciT(), fOz, -1, "Pose une Case Heure sur le sol", cMe.krm);

  public static final Effect fSm = new Effect(313, new auf(), fOz, -1, "Pose une Balise sur le sol", cMe.krm);

  public static final Effect fSn = new Effect(314, new bIL(false, true, true), fOz, -1, "Deploie une Aura autour de soi", cMe.krm);

  public static final Effect fSo = new Effect(315, new bIL(), fOz, -1, "Pose une Glyphe sur le sol", cMe.krm);

  public static final Effect fSp = new Effect(316, new cZo(), fOz, -1, "Désactive toutes les Auras de la cible", cMe.krm);

  public static final Effect fSq = new Effect(317, new cqU(), fOz, -1, "Pose une bombe", cMe.krm);

  public static final Effect fSr = new Effect(320, new Mg(), fOz, 1015, "Seduire un monstre", cMe.krm);

  public static final Effect fSs = new Effect(321, new ad(), fOz, -1, "Désapplique un  Etat", cMe.krm);

  public static final Effect fSt = new Effect(322, new Lm(), fOz, -1, "Invoque un Double Sram", cMe.krm);

  public static final Effect fSu = new Effect(323, new cBf(), fOz, -1, "Ramène la créature invoquée dans le symbiote", cMe.krk);

  public static final Effect fSv = new Effect(324, new gl(), fOz, -1, "Invoque une créature contenue dans le symbiote", cMe.krm);

  public static final Effect fSw = new Effect(325, new by(), fOz, -1, "Active/desactive l'IA d'une cible", cMe.krm);

  public static final Effect fSx = new Effect(326, new cEt(), fOz, -1, "Attaque avec l'arme en main, la cellule du perso qui trigger", cMe.krm);

  public static final Effect fSy = new Effect(327, new dzK(), fOz, -1, "Donne un ordre à l'IA lié à un personnage", cMe.krm);

  public static final Effect fSz = new Effect(328, new cVS(), fOz, -1, "Donne un ordre à l'IA lié à une cellule", cMe.krm);

  public static final Effect fSA = new Effect(330, new dQi(), fOz, -1, "Execute le groupe d'effets", cMe.krm);

  public static final Effect fSB = new Effect(331, new anU(), fOz, -1, "S'éloigne de la cible", cMe.krm);

  public static final Effect fSC = new Effect(332, new AO(), fOz, -1, "Désinvoque une créature", cMe.krm);

  public static final Effect fSD = new Effect(333, new cCX(), fOz, -1, "Jette le personnage porté", cMe.krm);

  public static final Effect fSE = new Effect(334, new cZz(), fOz, -1, "Porte le personnage ciblé", cMe.krm);

  public static final Effect fSF = new Effect(337, new cfS(), fOz, -1, "Change le nombre maximum de creatures que l'on peut seduire", cMe.krm);

  public static final Effect fSG = new Effect(338, new dBr(), fOz, -1, "Deploie une Aura autour de la cible", cMe.krm);

  public static final Effect fSH = new Effect(339, new bIL(), fOz, -1, "Pose une zone d'effet (mur, fakefighter ou warp, les autres zones ont leur propre effet)", cMe.krm);

  public static final Effect fSI = new Effect(340, new cE(), fOz, -1, "Téléport la cible de l'effet", cMe.krm);

  public static final Effect fSJ = new Effect(341, new aVk(), fOz, -1, "Execute aleatoirement des effets a l'interieur d'un groupe", cMe.krm);

  public static final Effect fSK = new Effect(342, new dpX(), fOz, -1, "Permet de faire fuir la cible", cMe.krm);

  public static final Effect fSL = new Effect(343, new qZ(), fOz, -1, "Applique un etat avec level fct des PA/PM/PW restants", cMe.krm);

  public static final Effect fSM = new Effect(344, new IN(), fOz, -1, "Permet d'interrompre le lancement d'un sort", cMe.krm);

  public static final Effect fSN = new Effect(345, new bdk(), fOz, -1, "Execute un groupe d'effet sur des cibles aléatoires (parmi les cibles valides)", cMe.krm);

  public static final Effect fSO = new Effect(346, new bZG(), fOz, 1015, "Applique un Tag (déclenché par la mort)", cMe.krm);

  public static final Effect fSP = new Effect(347, new bMQ(), fOz, -1, "Invoque une Image du caster", cMe.krm);

  public static final Effect fSQ = new Effect(348, new bis(), fOz, -1, "Pose une zone d'effet avec un niveau fonction d'un sort", cMe.krm);

  public static final Effect fSR = new Effect(349, new aWS(), fOz, -1, "Groupe d'effets aléatoire sur les cellules de la zone", cMe.krm);

  public static final Effect fSS = new Effect(350, new Ik(), fOz, -1, "Applique un état sans le notifier", cMe.krm);

  public static final Effect fST = new Effect(351, new aoJ(), fOz, -1, "Désapplique un état sans le notifier", cMe.krm);

  public static final Effect fSU = new Effect(352, new cXx(), fOz, -1, "Applique un etat avec level fonction d'un ActionCost", cMe.krm);

  public static final Effect fSV = new Effect(353, new afX(), fOz, -1, "Applique une armure Feca", cMe.krm);

  public static final Effect fSW = new Effect(354, new cUf(), fOz, -1, "Retire l'armure Feca", cMe.krm);

  public static final Effect fSX = new Effect(355, new bIL(), fOz, -1, "Pose un glyphe feca", cMe.krm);

  public static final Effect fSY = new Effect(356, new dqZ(eu.azX), fOz, -1, "Ajout de charges au cadran du Xelor", cMe.krk);

  public static final Effect fSZ = new Effect(357, new aYO(eu.azX), fOz, -1, "Retrait de charges au cadran du Xelor", cMe.krl);

  public static final Effect fTa = new Effect(358, new bVM(), fOz, -1, "Active/desactive l'IA d'une cible et envoie des sorts à l'ia", cMe.krl);

  public static final Effect fTb = new Effect(400, new ccB(), fOz, -1, "Effet Vide", cMe.krm);

  public static final Effect fTc = new Effect(401, new bJH(), fOz, -1, "Redirige une partie de l'effet déclencheur vers la triggering target de l'effet (caster de l'effet redirigé = triggering caster)", cMe.krm);

  public static final Effect fTd = new Effect(402, new iT(), fOz, -1, "Effet Vide sur cellule", cMe.krm);

  public static final Effect fTe = new Effect(403, new bWg(), fOz, -1, "Effet Vide notifié a l'ia", cMe.krm);

  public static final Effect fTf = new Effect(411, new bFw(bTI.heW, dnO.lnY), fOz, 1001, "Perte de PdV par rapport au MAX de la cible (%)", cMe.krl);

  public static final Effect fTg = new Effect(412, new bFw(bTI.heX, dnO.lnY), fOz, 1001, "Perte de PdV par rapport au MAX de la cible - Feu (%)", cMe.krl);

  public static final Effect fTh = new Effect(413, new bFw(bTI.heZ, dnO.lnY), fOz, 1001, "Perte de PdV par rapport au MAX de la cible - Terre (%)", cMe.krl);

  public static final Effect fTi = new Effect(414, new bFw(bTI.heY, dnO.lnY), fOz, 1001, "Perte de PdV par rapport au MAX de la cible- Eau (%)", cMe.krl);

  public static final Effect fTj = new Effect(415, new bFw(bTI.hfa, dnO.lnY), fOz, 1001, "Perte de PdV par rapport au MAX de la cible - Air (%)", cMe.krl);

  public static final Effect fTk = new Effect(416, new bFw(bTI.heW, dnO.loa), fOz, 1001, "Perte de PdV par rapport à la valeur courante de la cible (%)", cMe.krl);

  public static final Effect fTl = new Effect(417, new bFw(bTI.heX, dnO.loa), fOz, 1001, "Perte de PdV par rapport à la valeur courante de la cible - Feu (%)", cMe.krl);

  public static final Effect fTm = new Effect(418, new bFw(bTI.heZ, dnO.loa), fOz, 1001, "Perte de PdV par rapport à la valeur courante de la cible - Terre (%)", cMe.krl);

  public static final Effect fTn = new Effect(419, new bFw(bTI.heY, dnO.loa), fOz, 1001, "Perte de PdV par rapport à la valeur courante de la cible - Eau (%)", cMe.krl);

  public static final Effect fTo = new Effect(420, new bFw(bTI.hfa, dnO.loa), fOz, 1001, "Perte de PdV par rapport à la valeur courante de la cible - Air (%)", cMe.krl);

  public static final Effect fTp = new Effect(421, new bDS(), fOz, -1, "Désenvoutement", cMe.krm);

  public static final Effect fTq = new Effect(422, new ez(), fOz, -1, "Echange de position", cMe.krm);

  public static final Effect fTr = new Effect(426, new akX(), fOz, -1, "Attaque avec un sort passé en paramètre", cMe.krm);

  public static final Effect fTs = new Effect(430, new cSw(), fOz, -1, "Modifie la valeur de l'effet déclencheur", cMe.krm);

  public static final Effect fTt = new Effect(431, new gw(), fOz, -1, "Vol de Kamas", cMe.krm);

  public static final Effect fTu = new Effect(432, new dbX(), fOz, -1, "Tente de prendre un objet sur le sol", cMe.krm);

  public static final Effect fTv = new Effect(433, new ctn(), fOz, -1, "Boost le skill donné en param avec le level du sort qui lance cet effet", cMe.krk);

  public static final Effect fTw = new Effect(434, new alS(), fOz, -1, "Absorbe des dégâts subis et les converti en perte de Kamas", cMe.krk);

  public static final Effect fTx = new Effect(435, new bjm(), fOz, -1, "Met à jour la cible de l'effet déclenché. (par défaut par le caster de cet effet)", cMe.krm);

  public static final Effect fTy = new Effect(436, new aDS(), fOz, 1014, "Armure : absorbe une certaine quantité de dégats définie puis se retire", cMe.krk);

  public static final Effect fTz = new Effect(438, new azy(), fOz, -1, "Revèle l'invisibilité à tous (avec la petite fleche, n'enlève pas l'invisibilité)", cMe.krm);

  public static final Effect fTA = new Effect(440, new bZi(eu.ayN), fOz, 1001, "Poison sur PA : Perte de PdV relative au nombre de PA utilisé par l'action déclenchante", cMe.krl);

  public static final Effect fTB = new Effect(441, new bZi(eu.ayO), fOz, 1001, "Poison sur PM : Perte de PdV relative au nombre de PM utilisé par l'action déclenchante", cMe.krl);

  public static final Effect fTC = new Effect(442, new bZi(eu.ayP), fOz, 1001, "Poison sur PW : Perte de PdV relative au nombre de PW utilisé par l'action déclenchante", cMe.krl);

  public static final Effect fTD = new Effect(443, new cWB(), fOz, -1, "Met à jour le caster de l'effet déclenché. (par défaut par la cible de cet effet)", cMe.krm);

  public static final Effect fTE = new Effect(444, new cNp(cfY.hBK), fOz, -1, "Applique la propriété CONFUSED (=> la cible ciblera toutes les cellules à portée dans l'IA)", cMe.krl);

  public static final Effect fTF = new Effect(445, new cNp(cfY.hBO), fOz, -1, "Ne peut pas etre la cilbe d'un qcq effet", cMe.krm);

  public static final Effect fTG = new Effect(446, new aPX(), fOz, -1, "Retire une propriété de combat", cMe.krm);

  public static final Effect fTH = new Effect(447, new bZM(), fOz, -1, "Applique une propriété de combat", cMe.krm);

  public static final Effect fTI = new Effect(448, new cyN(), fOz, 1001, "Poison sur Triggering Value : Perte de PdV relative à la valeur de l'effet de l'action déclenchante", cMe.krl);

  public static final Effect fTJ = new Effect(449, new cra(), fOz, -1, "Applique une propriété de monde", cMe.krm);

  public static final Effect fTK = new Effect(550, new aWu(), fOz, -1, "Demande l'éxcution d'un Emote", cMe.krm);

  public static final Effect fTL = new Effect(560, new mY(eu.azg), fOz, -1, "Fixe la characteristique Bonus Dégâts - Air", cMe.krm);

  public static final Effect fTM = new Effect(561, new mY(eu.azf), fOz, -1, "Fixe la characteristique Bonus Dégâts - Terre", cMe.krm);

  public static final Effect fTN = new Effect(562, new mY(eu.aze), fOz, -1, "Fixe la characteristique Bonus Dégâts - Eau", cMe.krm);

  public static final Effect fTO = new Effect(563, new mY(eu.azd), fOz, -1, "Fixe la characteristique Bonus Dégâts - Feu", cMe.krm);

  public static final Effect fTP = new Effect(564, new Dh(), fOz, -1, "Boost le bonus de soin en % en fonction des Bonus Dégâts", cMe.krk);

  public static final Effect fTQ = new Effect(565, new aeU(), fOz, -1, "Boost des PdV de la cible en fonction des Bonus Dégâts élémentaires du caster", cMe.krk);

  public static final Effect fTR = new Effect(566, new mY(eu.azc), fOz, -1, "Fixe la characteristique Bonus Dégâts en %", cMe.krm);

  public static final Effect fTS = new Effect(567, new cPD(), fOz, -1, "Fixe la characteristique de régénaration de pdv hors combat", cMe.krm);

  public static final Effect fTT = new Effect(568, new mY(eu.azn), fOz, -1, "Fixe la characteristique Bonus Res - Air", cMe.krm);

  public static final Effect fTU = new Effect(569, new mY(eu.azm), fOz, -1, "Fixe la characteristique Bonus Res - Terre", cMe.krm);

  public static final Effect fTV = new Effect(570, new mY(eu.azl), fOz, -1, "Fixe la characteristique Bonus Res - Eau", cMe.krm);

  public static final Effect fTW = new Effect(571, new mY(eu.azk), fOz, -1, "Fixe la characteristique Bonus Res - Feu", cMe.krm);

  public static final Effect fTX = new Effect(572, new mY(eu.azj), fOz, -1, "Fixe la characteristique Bonus Res en %", cMe.krm);

  public static final Effect fTY = new Effect(573, new mY(eu.aza), fOz, -1, "Fixe la characteristique Bonus au soin", cMe.krm);

  public static final Effect fTZ = new Effect(574, new mY(eu.ayM), fOz, -1, "Fixe les Hps de la cible", cMe.krm);

  public static final Effect fUa = new Effect(575, new mY(eu.azA), fOz, -1, "Fixe la characteristique Bonus aux pertes de PA", cMe.krm);

  public static final Effect fUb = new Effect(620, new bFw(bTI.heW, dnO.lnV), fOz, 1001, "Perte de PdV par rapport au MAX du caster (%)", cMe.krl);

  public static final Effect fUc = new Effect(621, new bFw(bTI.heX, dnO.lnV), fOz, 1001, "Perte de PdV par rapport au MAX du caster - Feu (%)", cMe.krl);

  public static final Effect fUd = new Effect(622, new bFw(bTI.heZ, dnO.lnV), fOz, 1001, "Perte de PdV par rapport au MAX du caster - Terre (%)", cMe.krl);

  public static final Effect fUe = new Effect(623, new bFw(bTI.heY, dnO.lnV), fOz, 1001, "Perte de PdV% par rapport au MAX du caster- Eau (%)", cMe.krl);

  public static final Effect fUf = new Effect(624, new bFw(bTI.hfa, dnO.lnV), fOz, 1001, "Perte de PdV par rapport au MAX du caster - Air (%)", cMe.krl);

  public static final Effect fUg = new Effect(625, new bFw(bTI.heW, dnO.lnX), fOz, 1001, "Perte de PdV par rapport à la valeur courante du caster (%)", cMe.krl);

  public static final Effect fUh = new Effect(626, new bFw(bTI.heX, dnO.lnX), fOz, 1001, "Perte de PdV par rapport à la valeur courante du caster - Feu (%)", cMe.krl);

  public static final Effect fUi = new Effect(627, new bFw(bTI.heZ, dnO.lnX), fOz, 1001, "Perte de PdV par rapport à la valeur courante du caster - Terre (%)", cMe.krl);

  public static final Effect fUj = new Effect(628, new bFw(bTI.heY, dnO.lnX), fOz, 1001, "Perte de PdV par rapport à la valeur courante du caster - Eau (%)", cMe.krl);

  public static final Effect fUk = new Effect(629, new bFw(bTI.hfa, dnO.lnX), fOz, 1001, "Perte de PdV par rapport à la valeur courante du caster - Air (%)", cMe.krl);

  public static final Effect fUl = new Effect(630, new bFw(bTI.heW, dnO.lob), fOz, 1001, "Perte de PdV par rapport aux PdV perdus par le caster (%)", cMe.krl);

  public static final Effect fUm = new Effect(631, new bFw(bTI.heX, dnO.lob), fOz, 1001, "Perte de PdV par rapport aux PdV perdus par le caster - Feu (%)", cMe.krl);

  public static final Effect fUn = new Effect(632, new bFw(bTI.heZ, dnO.lob), fOz, 1001, "Perte de PdV par rapport aux PdV perdus par le caster - Terre (%)", cMe.krl);

  public static final Effect fUo = new Effect(633, new bFw(bTI.heY, dnO.lob), fOz, 1001, "Perte de PdV par rapport aux PdV perdus par le caster - Eau (%)", cMe.krl);

  public static final Effect fUp = new Effect(634, new bFw(bTI.hfa, dnO.lob), fOz, 1001, "Perte de PdV  par rapport aux PdV perdus par le caster  - Air (%)", cMe.krl);

  public static final Effect fUq = new Effect(635, new bNZ(bTI.hfa), fOz, -1, "Perte de PdV aléatoire - Air", cMe.krl);

  public static final Effect fUr = new Effect(636, new bNZ(bTI.heZ), fOz, 1001, "Perte de PdV aléatoire - Terre", cMe.krl);

  public static final Effect fUs = new Effect(637, new bNZ(bTI.heX), fOz, 1001, "Perte de PdV aléatoire - Feu", cMe.krl);

  public static final Effect fUt = new Effect(638, new bNZ(bTI.heY), fOz, 1001, "Perte de PdV aléatoire - Eau", cMe.krl);

  public static final Effect fUu = new Effect(639, new akf(), fOz, 1001, "Perte de PdV Fonction des PA PM restants", cMe.krl);

  public static final Effect fUv = new Effect(640, new dhj(), fOz, -1, "Ajoute un sort a l'inventaire de la cible", cMe.krm);

  public static final Effect fUw = new Effect(641, new bzX(eu.azq), fOz, -1, "Perte d'Initiative Fonction des PA PM restants", cMe.krl);

  public static final Effect fUx = new Effect(642, new bFw(bTI.heW, dnO.loc), fOz, 1001, "Perte de PdV par rapport aux PdV perdus de la cible (%)", cMe.krl);

  public static final Effect fUy = new Effect(643, new bFw(bTI.heX, dnO.loc), fOz, 1001, "Perte de PdV par rapport aux PdV perdus de la cible - Feu (%)", cMe.krl);

  public static final Effect fUz = new Effect(644, new bFw(bTI.heZ, dnO.loc), fOz, 1001, "Perte de PdV par rapport aux PdV perdus de la cible - Terre (%)", cMe.krl);

  public static final Effect fUA = new Effect(645, new bFw(bTI.heY, dnO.loc), fOz, 1001, "Perte de PdV par rapport aux PdV perdus de la cible - Eau (%)", cMe.krl);

  public static final Effect fUB = new Effect(646, new bFw(bTI.hfa, dnO.loc), fOz, 1001, "Perte de PdV  par rapport aux PdV perdus de la cible  - Air (%)", cMe.krl);

  public static final Effect fUC = new Effect(647, new aSq(bTI.heZ, dnO.lnU), fOz, 1001, "Perte de PdV Terre Fonction des PA PM restants sans les consommer", cMe.krl);

  public static final Effect fUD = new Effect(648, new aSq(bTI.heX, dnO.lnU), fOz, 1001, "Perte de PdV Feu Fonction des PA PM restants sans les consommer", cMe.krl);

  public static final Effect fUE = new Effect(700, new dqZ(eu.azK), fOz, -1, "Augmente la quantité de ressources récoltées", cMe.krk);
  public static final Effect fUF = new Effect(702, new dqZ(eu.azM), fOz, -1, "Réduit la durée de réalisation des recettes", cMe.krk);
  public static final Effect fUG = new Effect(705, new dqZ(eu.azN), fOz, -1, "Augmente l'expérience tirée des récoltes", cMe.krk);
  public static final Effect fUH = new Effect(706, new dqZ(eu.azO), fOz, -1, "Augmente l'expérience tirée de la réalisation de recettes", cMe.krk);
  public static final Effect fUI = new Effect(707, new dqZ(eu.azP), fOz, -1, "Augmente les chances de réussite des plantations", cMe.krk);

  public static final Effect fUJ = new Effect(708, new clV(), fOz, -1, "Modifie une charac lié au skill d'ecosysteme", cMe.krm);
  public static final Effect fUK = new Effect(709, new hE(), fOz, -1, "Modifie une charac lié au skill de craft", cMe.krm);

  public static final Effect fUL = new Effect(800, new XK(), fOz, -1, "Ajoute un titre au joueur", cMe.krm);

  public static final Effect fUM = new Effect(801, new Gh(), fOz, -1, "Inflige de degats et fait gagner des PdV aux poupées", cMe.krm);

  public static final Effect fUN = new Effect(802, new tE(), fOz, -1, "Lie le caster et la cible", cMe.krm);

  public static final Effect fUO = new Effect(803, new aRD(), fOz, -1, "Modifie la cellule ciblée par un sort", cMe.krm);

  public static final Effect fUP = new Effect(804, new aIz(), fOz, -1, "Pose un tunnel de sort", cMe.krm);

  public static final Effect fUQ = new Effect(805, new bSS(), fOz, -1, "Place les gisements de l'enutrof", cMe.krm);

  public static final Effect fUR = new Effect(807, new ajg(), fOz, -1, "Retire les gisements du caster sous la cellule ciblée", cMe.krm);

  public static final Effect fUS = new Effect(808, new JQ(), fOz, -1, "Transforme les PA en PM", cMe.krm);

  public static final Effect fUT = new Effect(809, new bzy(), fOz, -1, "Ko jusqu'a la desapplication", cMe.krm);

  public static final Effect fUU = new Effect(810, new ddw(bTI.heZ), fOz, 1001, "Perte de PdV Terre aléatoire selon une loi normale", cMe.krl);

  public static final Effect fUV = new Effect(812, new Ag(), fOz, -1, "Gain charac en fonction d'une autre", cMe.krm);

  public static final Effect fUW = new Effect(813, new cSM(), fOz, -1, "Pose une zone de loot", cMe.krm);

  public static final Effect fUX = new Effect(814, new cRX(), fOz, 1016, "Recupere un objet dans une zone de loot", cMe.krm);

  public static final Effect fUY = new Effect(815, new cJm(), fOz, 1016, "Perte de point de vie sur une zone de loot", cMe.krm);

  public static final Effect fUZ = new Effect(816, new bwQ(), fOz, -1, "Ramasse un objet pour son controller", cMe.krm);

  public static final Effect fVa = new Effect(817, new oy(), fOz, -1, "Remplace une zone d'effet sur la cellule par une autre", cMe.krm);

  public static final Effect fVb = new Effect(818, new cIs(), fOz, 1016, "Perte de point de vie en fonction d'un loot", cMe.krm);

  public static final Effect fVc = new Effect(819, new kM(eu.azE), fOz, -1, "Augmente le max de chrage", cMe.krm);

  public static final Effect fVd = new Effect(825, new cXv(), fOz, -1, "Fait perdre de Pdv apres un effet de deplacement", cMe.krl);

  public static final Effect fVe = new Effect(828, new anj(), fOz, -1, "Drop de bénédiction Enutrof", cMe.krk);

  public static final Effect fVf = new Effect(830, new dFp(), fOz, -1, "Ko Instantané", cMe.krl);

  public static final Effect fVg = new Effect(831, new bGe(), fOz, -1, "Effet de Blitzkriek", cMe.krl);

  public static final Effect fVh = new Effect(832, new aLt(), fOz, -1, "Gain de niveaux de sorts dans une branche", cMe.krl);

  public static final Effect fVi = new Effect(833, new dtR(), fOz, -1, "Quitte ou double", cMe.krm);

  public static final Effect fVj = new Effect(834, new dqZ(eu.azH), fOz, -1, "Booste les dmg via totem", cMe.krk);

  public static final Effect fVk = new Effect(835, new KS(), fOz, -1, "Redirige les dmg vers le perso lié au totem", cMe.krm);

  public static final Effect fVl = new Effect(836, new aBm(), fOz, -1, "Execute le boost de dmg lie au totem", cMe.krm);

  public static final Effect fVm = new Effect(837, new aEk(), fOz, -1, "Soin xdy+z", cMe.krm);

  public static final Effect fVn = new Effect(838, new dqZ(eu.azI), fOz, -1, "Gain aux dégats des CMC", cMe.krk);

  public static final Effect fVo = new Effect(839, new aVD(), fOz, -1, "Invocation de double pour les bellaphones", cMe.krk);

  public static final Effect fVp = new Effect(840, new aYO(eu.azR), fOz, -1, "Décremente le cooldown des bombes", cMe.krm);

  public static final Effect fVq = new Effect(841, new kM(eu.azR), fOz, -1, "Augmente le cooldown des bombes", cMe.krm);

  public static final Effect fVr = new Effect(842, new bIL(), fOz, -1, "Pose le tonneau", cMe.krm);

  public static final Effect fVs = new Effect(843, new Qo(), fOz, -1, "Retire une zone en sélectionnant la zone comme cible", cMe.krm);

  public static final Effect fVt = new Effect(844, new dxD(), fOz, -1, "Groupe d'effet avec niveau des enfants fonction de l'etat passé en parametre", cMe.krm);

  public static final Effect fVu = new Effect(845, new dqZ(eu.azU), fOz, -1, "Modifie les chances d'appliquer des états", cMe.krm);

  public static final Effect fVv = new Effect(846, new dqZ(eu.azV), fOz, -1, "Modifie la résistance aux états", cMe.krm);

  public static final Effect fVw = new Effect(847, new aXH(bTI.heZ, dnO.lnU), fOz, 1001, "Perte de Pdv + % des dégâts subis (terre)", cMe.krm);

  public static final Effect fVx = new Effect(849, new dqZ(eu.azT), fOz, -1, "Augmente le nombre de plaques des armures", cMe.krm);

  public static final Effect fVy = new Effect(850, new dqZ(eu.azW), fOz, -1, "Augmente le nombre de charge des glyphes", cMe.krm);

  public static final Effect fVz = new Effect(851, new TB(bTI.heW, dnO.lnU, eu.ayM), fOz, 1001, "Perte de pdv en fonction de Hp du caster", cMe.krm);

  public static final Effect fVA = new Effect(852, new cNp(cfY.hBZ), fOz, -1, "Inverse les dmg avec les resistances", cMe.krm);

  public static final Effect fVB = new Effect(853, new Ri(), fOz, 1001, "Perte de PdV en fonction de l'effet déclencheur", cMe.krl);

  public static final Effect fVC = new Effect(854, new cNp(cfY.hCc), fOz, -1, "Ne peux pas être poussé ou tiré", cMe.krm);

  public static final Effect fVD = new Effect(855, new ccg(), fOz, -1, "Groupe d'effet avec execution du dernier NullEffect si rien d'autre", cMe.krm);

  public static final Effect fVE = new Effect(856, new aCn(eu.ayO, fPh, fPk), fOz, -1, "Transfert de PM aux cibles", cMe.krm);
  public static final Effect fVF = new Effect(857, new aCn(eu.ayQ, fQD, fQE, true), fOz, -1, "Transfert de Tacle aux cibles", cMe.krm);
  public static final Effect fVG = new Effect(858, new aCn(eu.ayR, fQF, fQG, true), fOz, -1, "Transfert d'Esquive aux cibles", cMe.krm);

  public static final Effect fVH = new Effect(859, new Di(), fOz, -1, "Retourne la créature dans le symbiote du controleur", cMe.krm);
  public static final Effect fVI = new Effect(860, new bRX(), fOz, -1, "Change le level du gobgob en fonction de celui de la cible", cMe.krm);
  public static final Effect fVJ = new Effect(861, new brw(eu.azq), fOz, -1, "Gain d'init fct du level du gobgob", cMe.krm);
  public static final Effect fVK = new Effect(862, new brw(eu.ayS), fOz, -1, "Gain de cc fct du level du gobgob", cMe.krm);
  public static final Effect fVL = new Effect(863, new brw(eu.ayR), fOz, -1, "Gain d'esquive fct du level du gobgob", cMe.krm);
  public static final Effect fVM = new Effect(864, new brw(eu.ayQ), fOz, -1, "Gain de tacle fct du level du gobgob", cMe.krm);

  public static final Effect fVN = new Effect(865, new dFH(), fOz, -1, "Groupe d'effet : valeur du second effet fonction de celle du premier (2 effets maxi dans le groupe)", cMe.krm);
  public static final Effect fVO = new Effect(866, new dqZ(eu.azY), fOz, -1, "Gain de perception", cMe.krm);
  public static final Effect fVP = new Effect(867, new aYO(eu.azY), fOz, -1, "Perte de perception", cMe.krm);

  public static final Effect fVQ = new Effect(868, new UP(eu.azC), fOz, -1, "Gain aux dégâts finaux en fonction du niveau d'un état", cMe.krk);

  public static final Effect fVR = new Effect(869, new brw(eu.azc), fOz, -1, "Gain de dégats fct du level du gobgob", cMe.krm);
  public static final Effect fVS = new Effect(870, new arW(eu.ayO), fOz, -1, "Buff de PM fct du level du gobgob", cMe.krm);
  public static final Effect fVT = new Effect(871, new arW(eu.ayN), fOz, -1, "Buff de PA fct du level du gobgob", cMe.krm);

  public static final Effect fVU = new Effect(872, new dqZ(eu.aAd), fOz, -1, "Augmente la Volonté", cMe.krm);
  public static final Effect fVV = new Effect(873, new aYO(eu.aAd), fOz, -1, "Diminue la Volonté", cMe.krm);

  public static final Effect fVW = new Effect(874, new brw(eu.ayU), fOz, -1, "Gain de PO fct du level du gobgob", cMe.krm);

  public static final Effect fVX = new Effect(875, new dqZ(eu.aAe), fOz, -1, "Augmente la Parade", cMe.krm);
  public static final Effect fVY = new Effect(876, new aYO(eu.aAe), fOz, -1, "Diminue la Parade", cMe.krm);

  public static final Effect fVZ = new Effect(877, new aKu(eu.ayM), fOz, -1, "Modifie le min de Hp", cMe.krm);
  public static final Effect fWa = new Effect(878, new dLW(), fOz, 1033, "S'éloigne de la cellule ciblée", cMe.krm);

  public static final Effect fWb = new Effect(879, new dqZ(eu.aAf), fOz, -1, "Donne un bonus à l'armure (effet 436)", cMe.krm);
  public static final Effect fWc = new Effect(880, new aYO(eu.aAg), fOz, 1031, "Perte de PdV pour zone d'effet", cMe.krm);

  public static final Effect fWd = new Effect(881, new ceh(eu.azS), fOz, -1, "Groupe d'effet avec la valeur fonction du nombre de plaque", cMe.krm);
  public static final Effect fWe = new Effect(882, new ceh(eu.aAg), fOz, -1, "Groupe d'effet avec la valeur fonction du nombre de charge du glyphe", cMe.krm);

  public static final Effect fWf = new Effect(884, new aYO(eu.azy), fOz, -1, "Perte de résistance au deboost de PA", cMe.krl);
  public static final Effect fWg = new Effect(885, new aYO(eu.azx), fOz, -1, "Perte de résistance au deboost de PM", cMe.krk);

  public static final Effect fWh = new Effect(886, new cxv(), fOz, -1, "Groupe d'effet dont la proba globale d'exécution est fct des PA/PM/PW restants", cMe.krm);
  public static final Effect fWi = new Effect(887, new bBN(eu.aAg), fOz, -1, "Groupe d'effet dont la proba d'executer le groupe est fonction du nombre de charge", cMe.krm);

  public static final Effect fWj = new Effect(892, new bBN(eu.azS), fOz, -1, "Groupe d'effet dont la proba d'executer le groupe est fonction du nombre de plaque", cMe.krm);

  public static final Effect fWk = new Effect(894, new cMd(eu.aAg), fOz, -1, "Modifie en % la valeur du sous effet en fonction du nombre de charge", cMe.krm);
  public static final Effect fWl = new Effect(895, new bCl(eu.azS), fOz, -1, "Modifie en % la valeur du sous effet en fonction du nombre de plaque de la cible", cMe.krm);
  public static final Effect fWm = new Effect(896, new qL(), fOz, -1, "Groupe d'effets aléatoire sur les cellules de la zone * nombre de charge restantes ", cMe.krm);
  public static final Effect fWn = new Effect(897, new aST(), fOz, -1, "Applique un etat dont le % d'application est fontion du nombre de charge restantes", cMe.krm);

  public static final Effect fWo = new Effect(900, new xY(eu.azS, eu.aze), fOz, -1, "Dégâts eau modifiés par le nombre de plaque", cMe.krm);
  public static final Effect fWp = new Effect(901, new xY(eu.azS, eu.azg), fOz, -1, "Dégâts air modifiés par le nombre de plaque", cMe.krm);
  public static final Effect fWq = new Effect(902, new xY(eu.azS, eu.azf), fOz, -1, "Dégâts terre modifiés par le nombre de plaque", cMe.krm);
  public static final Effect fWr = new Effect(903, new xY(eu.azS, eu.azd), fOz, -1, "Dégâts feu modifiés par le nombre de plaque", cMe.krm);
  public static final Effect fWs = new Effect(904, new bRI(), fOz, -1, "Groupe d'effet dont la proba globale d'exécution est fct du niveau d'un état", cMe.krm);
  public static final Effect fWt = new Effect(905, new cMd(eu.azS), fOz, -1, "Modifie en % la valeur du sous effet en fonction du nombre de plaque", cMe.krm);
  public static final Effect fWu = new Effect(906, new hG(eu.aAg), fOz, -1, "Execute le groupe autant de fois que le caster a de AREA_HP", cMe.krm);
  public static final Effect fWv = new Effect(907, new kM(eu.aAg), fOz, -1, "Buff de AREA_HP", cMe.krm);
  public static final Effect fWw = new Effect(908, new xY(eu.azp, eu.azc), fOz, -1, "Modification des DMG en fonction de la prospection", cMe.krm);

  public static final Effect fWx = new Effect(909, new dbs(), fOz, -1, "Remplace une zone par une autre en sélectionnant la zone comme cible", cMe.krm);
  public static final Effect fWy = new Effect(910, new dqH(), fOz, -1, "Groupe d'effet avec niveau des enfants fonction du cout du sort déclencheur", cMe.krm);
  public static final Effect fWz = new Effect(911, new dLg(), fOz, -1, "Retire une zone d'effet sur la cellule", cMe.krm);
  public static final Effect fWA = new Effect(912, new crF(), fOz, -1, "Groupe d'effet avec niveau des enfants fonction de l'action cost déclencheur", cMe.krm);
  public static final Effect fWB = new Effect(913, new crJ(), fOz, -1, "Groupe d'effet avec niveau des enfants fonction de la carac passée en parametre", cMe.krm);

  public static final Effect fWC = new Effect(914, new bzX(eu.azR), fOz, -1, "Perte de cooldown fonction des PA PM restants", cMe.krm);
  public static final Effect fWD = new Effect(915, new dtB(), fOz, -1, "Recalcule l'effet déclencheur dans la zone de cet effet", cMe.krm);
  public static final Effect fWE = new Effect(916, new xY(eu.azq, eu.azc), fOz, -1, "Modification des DMG All en fonction de l'init", cMe.krm);

  public static final Effect fWF = new Effect(917, new bFw(bTI.hfb, dnO.lnU), fOz, 1001, "Perte de PdV - Stasis", cMe.krl);
  public static final Effect fWG = new Effect(918, new dqZ(eu.aAh), fOz, -1, "Gain aux dégâts - Stasis (%)", cMe.krk);
  public static final Effect fWH = new Effect(919, new Kr(eu.ayN), fOz, 1008, "Gain des PA utilisés pour le sort déclencheur", cMe.krk);
  public static final Effect fWI = new Effect(920, new Kr(eu.ayO), fOz, 1005, "Gain des PM utilisés pour le sort déclencheur", cMe.krk);
  public static final Effect fWJ = new Effect(921, new Kr(eu.ayP), fOz, -1, "Gain des PW utilisés pour le sort déclencheur", cMe.krk);

  public static final Effect fWK = new Effect(922, new bGV(), fOz, 1001, "Perte de PDV fonction de la valeur déclenchante (sans modificateurs) (%)", cMe.krl);

  public static final Effect fWL = new Effect(923, new cgO(), fOz, -1, "Execute un cout en PA/PM", cMe.krm);

  public static final Effect fWM = new Effect(924, new mY(eu.aAg), fOz, -1, "Fixe les Area Hps de la zone d'effet", cMe.krm);
  public static final Effect fWN = new Effect(925, new dqZ(eu.aAg), fOz, -1, "Gain de Area HP", cMe.krk);

  public static final Effect fWO = new Effect(926, new kM(eu.azq), fOz, -1, "Boost d'Init (attention,  boost != gain ! généralement, ne pas utiliser", cMe.krk);

  public static final Effect fWP = new Effect(927, new aYO(eu.aAi), fOz, -1, "Perte de la résistance Stasis (%)", cMe.krl);

  public static final Effect fWQ = new Effect(928, new aSJ(), fOz, -1, "Buff de charac en fonction d'une autre", cMe.krm);

  public static final Effect fWR = new Effect(929, new mY(eu.ayN), fOz, -1, "Fixe la characteristique PA", cMe.krm);
  public static final Effect fWS = new Effect(930, new mY(eu.azq), fOz, -1, "Fixe la characteristique INIT", cMe.krm);

  public static final Effect fWT = new Effect(931, new drJ(), fOz, -1, "Remplace la cible de l'effet déclencheur par son propriétaire", cMe.krm);
  public static final Effect fWU = new Effect(932, new cja(), fOz, -1, "Retire de la cible les effets qui appartiennent au caster", cMe.krm);
  public static final Effect fWV = new Effect(933, new cIV(), fOz, -1, "Modifie les sorts d'un joueur par ceux d'un monstre", cMe.krm);
  public static final Effect fWW = new Effect(934, new bTo(), fOz, -1, "Exclu la cible du combat", cMe.krm);
  public static final Effect fWX = new Effect(935, new bkO(), fOz, -1, "Retire toutes les zones d'id donné", cMe.krm);
  public static final Effect fWY = new Effect(936, new aPC(), fOz, -1, "Spawn un mob dans le combat", cMe.krm);
  public static final Effect fWZ = new Effect(937, new Tw(), fOz, -1, "Retire la cible de la fight jusqu'a son prochain mouvement", cMe.krm);

  public static final Effect fXa = new Effect(938, new dOv(), fOz, -1, "Execute le groupe x fois, en fonction du cout du sort", cMe.krm);

  public static final Effect fXb = new Effect(939, new ayZ(bTI.hfb), fOz, 1001, "Perte de PdV Stasis avec évolution exponentielle (hpLoss = a + b * level ^ c)", cMe.krl);
  public static final Effect fXc = new Effect(940, new ayZ(bTI.heX), fOz, 1001, "Perte de PdV Feu avec évolution exponentielle (hpLoss = a + b * level ^ c)", cMe.krl);
  public static final Effect fXd = new Effect(941, new ayZ(bTI.heZ), fOz, 1001, "Perte de PdV Terre avec évolution exponentielle (hpLoss = a + b * level ^ c)", cMe.krl);
  public static final Effect fXe = new Effect(942, new ayZ(bTI.hfa), fOz, 1001, "Perte de PdV Air avec évolution exponentielle (hpLoss = a + b * level ^ c)", cMe.krl);
  public static final Effect fXf = new Effect(943, new ayZ(bTI.heY), fOz, 1001, "Perte de Eau avec évolution exponentielle (hpLoss = a + b * level ^ c)", cMe.krl);

  public static final Effect fXg = new Effect(944, new xY(eu.azS, eu.azl), fOz, -1, "Resist eau modifiés par le nombre de plaque", cMe.krm);
  public static final Effect fXh = new Effect(945, new xY(eu.azS, eu.azn), fOz, -1, "Resist air modifiés par le nombre de plaque", cMe.krm);
  public static final Effect fXi = new Effect(946, new xY(eu.azS, eu.azm), fOz, -1, "Resist terre modifiés par le nombre de plaque", cMe.krm);
  public static final Effect fXj = new Effect(947, new xY(eu.azS, eu.azk), fOz, -1, "Resist feu modifiés par le nombre de plaque", cMe.krm);

  public static final Effect fXk = new Effect(948, new dvO(), fOz, -1, "Change la valeur du ratio chrage -> dmg", cMe.krm);

  public static final Effect fXl = new Effect(949, new bZR(), fOz, -1, "Execute le groupe x fois", cMe.krm);

  public static final Effect fXm = new Effect(950, new dWw(eu.ayN), fOz, -1, "Force la valeur des pa", cMe.krk);
  public static final Effect fXn = new Effect(951, new dWw(eu.ayO), fOz, -1, "Force la valeur des pm", cMe.krk);
  public static final Effect fXo = new Effect(952, new dWw(eu.ayP), fOz, -1, "Force la valeur des pw", cMe.krk);

  public static final Effect fXp = new Effect(953, new cJc(eu.ayT), fOz, -1, "Debuff de la carac d'Echec Critique", cMe.krk);

  public static final Effect fXq = new Effect(954, new dWw(eu.aAk), fOz, -1, "Définit le nombre max de rails entre 2 microbots", cMe.krk);

  public static final Effect fXr = new Effect(955, new fb(eu.aAj), fOz, -1, "Boost les PdV virtuel max de la cible en fct du nb d'alliés", cMe.krk);
  public static final Effect fXs = new Effect(956, new dgb(eu.aAj), fOz, -1, "Boost les PdV virtual max de la cible (%) en fct des PdV max du caster", cMe.krk);
  public static final Effect fXt = new Effect(957, new cDJ(), fOz, -1, "Initialise les VIRTUAL_HP en fonction du % de hp", cMe.krm);
  public static final Effect fXu = new Effect(958, new bFw(bTI.heW, dnO.lnZ), fOz, 1001, "Perte de PdV par rapport au MAX de la cible (%) avec pv virtuel", cMe.krl);
  public static final Effect fXv = new Effect(959, new bFw(bTI.heW, dnO.lnW), fOz, 1001, "Perte de PdV par rapport au MAX du caster (%) avec pv virtuel", cMe.krl);

  public static final Effect fXw = new Effect(960, new fl(bTI.heX, dnO.lnU, eu.ayM), fOz, 1001, "Perte de pdv Feu fonction du niveau du caster", cMe.krl);
  public static final Effect fXx = new Effect(961, new fl(bTI.heZ, dnO.lnU, eu.ayM), fOz, 1001, "Perte de pdv Terre fonction du niveau du caster", cMe.krl);
  public static final Effect fXy = new Effect(962, new fl(bTI.heY, dnO.lnU, eu.ayM), fOz, 1001, "Perte de pdv Eau fonction du niveau du caster", cMe.krl);
  public static final Effect fXz = new Effect(963, new fl(bTI.hfa, dnO.lnU, eu.ayM), fOz, 1001, "Perte de pdv Air fonction du niveau du caster", cMe.krl);
  public static final Effect fXA = new Effect(964, new fl(bTI.hfb, dnO.lnU, eu.ayM), fOz, 1001, "Perte de pdv Stasis fonction du niveau du caster", cMe.krl);

  public static final Effect fXB = new Effect(965, new aLm(), fOz, -1, "Ajout d'un sort à un inventaire de sorts temporaire", cMe.krk);

  public static final Effect fXC = new Effect(966, new clV(dEv.lNi, bcz.fmB), fOz, -1, "Ajoute un bonus aux chances de réussir une plantation de plante", cMe.krm);
  public static final Effect fXD = new Effect(967, new clV(dEv.lNi, bcz.fmz), fOz, -1, "Ajoute un bonus aux chances de réussir une plantation d'arbre", cMe.krm);
  public static final Effect fXE = new Effect(968, new clV(dEv.lNi, bcz.fmC), fOz, -1, "Ajoute un bonus aux chances de réussir une plantation de culture", cMe.krm);
  public static final Effect fXF = new Effect(969, new clV(dEv.lNi, bcz.fmD), fOz, -1, "Ajoute un bonus aux chances de réussir une plantation de semence", cMe.krm);

  public static final Effect fXG = new Effect(970, new hE(bG.kH), fOz, -1, "Ajoute un bonus a l'xp du craft d'un metier", cMe.krm);

  public static final Effect fXH = new Effect(971, new clV(dEv.lNj, bcz.fmB), fOz, -1, "Ajoute un bonus a la quantite collectée des plantes", cMe.krm);
  public static final Effect fXI = new Effect(972, new clV(dEv.lNj, bcz.fmz), fOz, -1, "Ajoute un bonus a la quantite collectée des arbres", cMe.krm);
  public static final Effect fXJ = new Effect(973, new clV(dEv.lNj, bcz.fmC), fOz, -1, "Ajoute un bonus a la quantite collectée des cultures", cMe.krm);
  public static final Effect fXK = new Effect(974, new clV(dEv.lNj, bcz.fmD), fOz, -1, "Ajoute un bonus a la quantite collectée des monstres", cMe.krm);
  public static final Effect fXL = new Effect(975, new clV(dEv.lNj, bcz.fmA), fOz, -1, "Ajoute un bonus a la quantite collectée des minerais", cMe.krm);
  public static final Effect fXM = new Effect(976, new clV(dEv.lNj, bcz.fmE), fOz, -1, "Ajoute un bonus a la quantite collectée des poissons", cMe.krm);

  public static final Effect fXN = new Effect(977, new hE(bG.kG), fOz, -1, "Ajoute un bonus a la rapidité de craft d'un metier", cMe.krm);
  public static final Effect fXO = new Effect(978, new clV(dEv.lNi, bcz.fmF), fOz, -1, "Ajoute un bonus aux chances de réussir une plantation de tresor", cMe.krm);

  public static final Effect fXP = new Effect(979, new ajh(), fOz, -1, "Gain de niveau de sort tous éléments (sauf support)", cMe.krm);
  public static final Effect fXQ = new Effect(980, new cwk(), fOz, -1, "Gain de niveau des sorts passifs", cMe.krm);
  public static final Effect fXR = new Effect(981, new RV(), fOz, -1, "Gain de niveau des sorts de support actifs", cMe.krm);
  public static final Effect fXS = new Effect(982, new asp(25), fOz, -1, "Retire les effets des sorts passifs", cMe.krm);
  public static final Effect fXT = new Effect(983, new wc(eu.ayN), fOz, -1, "Regen des AP au max", cMe.krk);
  public static final Effect fXU = new Effect(984, new dWw(eu.aAj), fOz, -1, "Force la valeur des VIRTUAL_HP", cMe.krk);
  public static final Effect fXV = new Effect(985, new wc(eu.aAj), fOz, -1, "Regen des VIRTUAL_HP au max", cMe.krk);

  public static final Effect fXW = new Effect(986, new bEI(eu.ayM), fOz, -1, "Change la valeur du modificateur en % des PdV", cMe.krm);
  public static final Effect fXX = new Effect(987, new Wy(), fOz, 1016, "Ajoute un objet bonus a la fin du combat a la cible", cMe.krk);
  public static final Effect fXY = new Effect(988, new dqZ(eu.aAm), fOz, -1, "Augmente la resist aux degats des Coup Critique", cMe.krk);

  public static final Effect fXZ = new Effect(989, new bEI(eu.aAj), fOz, -1, "Change la valeur du modificateur en % des PdV virtuels", cMe.krm);
  public static final Effect fYa = new Effect(990, new dz(), fOz, 1002, "Gain de PdV outrepasse Mort Vivant", cMe.krm);
  public static final Effect fYb = new Effect(991, new kM(eu.ayX), fOz, -1, "Boost de la durée du KO", cMe.krm);
  public static final Effect fYc = new Effect(992, new ahY(), fOz, -1, "Teleporte le caster derriere la cible", cMe.krm);
  public static final Effect fYd = new Effect(993, new apE(), fOz, -1, "Change la cible du sort par la position du caster de cet effet", cMe.krm);
  public static final Effect fYe = new Effect(994, new ceq(), fOz, -1, "Invoque un double statue de glace", cMe.krm);
  public static final Effect fYf = new Effect(995, new aEn(), fOz, -1, "Groupe d'effet avec niveau des enfants fonction du sort passé en parametre", cMe.krm);
  public static final Effect fYg = new Effect(996, new dqZ(eu.aAn), fOz, -1, "Augmente Art de l'invocation", cMe.krk);
  public static final Effect fYh = new Effect(997, new gP(), fOz, 1014, "Armure : absorbe une quantité de dégats fixe ou élémentaire", cMe.krk);
  public static final Effect fYi = new Effect(998, new bPX(eu.aze, new dSc[] { eu.azf, eu.azc }), fOz, -1, "Gain aux dégâts eau de la cible fct des dégâts terre et all du caster calculé a l'application", cMe.krk);
  public static final Effect fYj = new Effect(999, new abX(), fOz, -1, "Groupe d'effets avec niveau fonction du niveau du caster/cible", cMe.krm);
  public static final Effect fYk = new Effect(1000, new atd(), fOz, -1, "Change la cible de l'effet declencheur et modifie la valeur", cMe.krm);
  public static final Effect fYl = new Effect(1001, new tx(), fOz, -1, "Copie la valeur de la charac calculée a l'application (caster -> cible, pas de rollback)", cMe.krm);
  public static final Effect fYm = new Effect(1002, new dVj(), fOz, -1, "Invoque un Double Zobal", cMe.krm);
  public static final Effect fYn = new Effect(1003, new aKu(eu.ayX), fOz, -1, "Modifie le min de jauge de KO", cMe.krm);
  public static final Effect fYo = new Effect(1004, new xY(eu.ayR, eu.azc), fOz, -1, "Modification des DMG en fonction de l'esquive", cMe.krm);
  public static final Effect fYp = new Effect(1005, new LU(), fOz, -1, "Applique un etat en capant son niveau par le niveau d'un autre état", cMe.krm);
  public static final Effect fYq = new Effect(1006, new hB(new dSc[] { eu.ayN }), fOz, -1, "Groupe d'effets qui calcule une valeur pour les ss-effets fct des PA du caster", cMe.krm);
  public static final Effect fYr = new Effect(1007, new hB(new dSc[] { eu.ayO }), fOz, -1, "Groupe d'effets qui calcule une valeur pour les ss-effets fct des PM du caster", cMe.krm);
  public static final Effect fYs = new Effect(1008, new akV(), fOz, -1, "Pose une zone d'effet pour le controller original", cMe.krm);
  public static final Effect fYt = new Effect(1009, new xY(eu.ayR, eu.aza), fOz, -1, "Modification des BOnus aux Soins en fonction de l'esquive", cMe.krm);

  public static final Effect fYu = new Effect(1010, new dqZ(eu.aAo), fOz, -1, "Gain d'armure", cMe.krk);
  public static final Effect fYv = new Effect(1011, new aYO(eu.aAo), fOz, -1, "Perte d'armure", cMe.krl);
  public static final Effect fYw = new Effect(1012, new bIo(eu.aAo), fOz, -1, "Gain d'armure élémentaire (prend en compte le bonus au degats)", cMe.krk);

  public static final Effect fYx = new Effect(1013, new aec(), fOz, -1, "Reduit la valeur des effets de zones", cMe.krm);
  public static final Effect fYy = new Effect(1014, new csz(), fOz, -1, "Copie une charac en temps réel", cMe.krm);
  public static final Effect fYz = new Effect(1015, new drp(), fOz, 1001, "Perte de Pdv de meilleur élément", cMe.krl);
  public static final Effect fYA = new Effect(1016, new asB(), fOz, 1002, "Gain de Pdv de meilleur élément", cMe.krk);
  public static final Effect fYB = new Effect(1017, new dfa(), fOz, 1002, "Gain de Pdv de meilleur élément fonction des pa pm restants", cMe.krk);
  public static final Effect fYC = new Effect(1018, new ath(), fOz, -1, "Effet spécial pour le renvoi de degats sur armure (sous effets possibles)", cMe.krm);
  public static final Effect fYD = new Effect(1019, new cPq(), fOz, -1, "Buff PvP (vie et sorts)", cMe.krm);

  public static final Effect fYE = new Effect(1020, new ccx(), fOz, -1, "Groupe d'effets avec niveau des enfants fonction de la valeur de l'effet déclencheur", cMe.krm);
  public static final Effect fYF = new Effect(1021, new bBm(), fOz, -1, "Retire une zone bloquante en sélectionnant la zone comme cible", cMe.krm);
  public static final Effect fYG = new Effect(1022, new hE(bG.kI), fOz, -1, "Ajoute un bonus a l'xp d'action d'ecosysteme (plantation/récolte) d'un metier", cMe.krm);
  public static final Effect fYH = new Effect(1023, new dtW(), fOz, -1, "Ajoute un bonus a l'xp d'un metier (creation d'item/plantation/recolte)", cMe.krm);
  public static final Effect fYI = new Effect(1024, new Au(), fOz, -1, "Désapplication pour l'hyperaction (lvl * pa restant)", cMe.krm);

  public static final Effect fYJ = new Effect(1025, new aFZ(bTI.heZ), fOz, -1, "Soins de la cible par rapport aux PdV du caster - Terre", cMe.krm);
  public static final Effect fYK = new Effect(1026, new aFZ(bTI.hfa), fOz, -1, "Soins de la cible par rapport aux PdV du caster - Air", cMe.krm);
  public static final Effect fYL = new Effect(1027, new aFZ(bTI.heY), fOz, -1, "Soins de la cible par rapport aux PdV du caster - Water", cMe.krm);
  public static final Effect fYM = new Effect(1028, new aFZ(bTI.heX), fOz, -1, "Soins de la cible par rapport aux PdV du caster - Feu", cMe.krm);
  public static final Effect fYN = new Effect(1029, new aFZ(bTI.heW), fOz, -1, "Soins de la cible par rapport aux PdV du caster - Neutre", cMe.krm);

  public static final Effect fYO = new Effect(1030, new bBk(), fOz, -1, "Change la team de la cible", cMe.krm);

  public static final Effect fYP = new Effect(1031, new asp(12), fOz, -1, "Retire les effets des équipements (hors bonus de panoplie)", cMe.krm);
  public static final Effect fYQ = new Effect(1032, new asp(14), fOz, -1, "Retire les effets des panoplies", cMe.krm);

  public static final Effect fYR = new Effect(1033, new jx(), fOz, -1, "Pose une zone et l'initialise comme un bloc Steamer", cMe.krm);
  public static final Effect fYS = new Effect(1034, new dsa(), fOz, -1, "Bonus à la resist all des blocs Steamer", cMe.krm);
  public static final Effect fYT = new Effect(1035, new agK(), fOz, -1, "Redirection des dégats vers les blocs du steamer", cMe.krm);
  public static final Effect fYU = new Effect(1036, new cWI(), fOz, -1, "Gain pour la plus faible resist", cMe.krm);
  public static final Effect fYV = new Effect(1037, new aXB(), fOz, -1, "Redirection des dégâts vers le steamer", cMe.krm);
  public static final Effect fYW = new Effect(1038, new cyn(), fOz, -1, "Ajoute la valeur de la charac source à la charac cible en temps réel", cMe.krm);
  public static final Effect fYX = new Effect(1039, new mY(eu.ayV), fOz, -1, "Fixe la characteristique Controle", cMe.krm);
  public static final Effect fYY = new Effect(1040, new HT(), fOz, -1, "Le caster devient la reference pour les resistances de la cible", cMe.krm);

  public static bsj bAv()
  {
    return fOz;
  }
}