package com.ankamagames.wakfu.client.ui.script;

import bYE;
import bcm;
import bxT;
import cSR;
import cag;
import dTv;
import dmn;
import dsg;
import hQ;
import org.apache.log4j.Logger;
import org.keplerproject.luajava.LuaState;

public class UIFunctionsLibrary extends hQ
{
  static final Logger K = Logger.getLogger(UIFunctionsLibrary.class);
  private static final bYE[] caP = { new bYE("dialogId", "Id du dialogue", bxT.gja, false), new bYE("sourceType", "1 pour protecteur, 2 pour NPC", bxT.gja, false), new bYE("sourceId", "L'id de la source (pour le protecteur, il ne s'agit pas du groupe de monstre associé)", bxT.giY, false) };

  private static final bYE[] caQ = { new bYE("landMarkId", "Id de la note", bxT.gja, false) };

  private static final bYE[] caR = { new bYE("translationKey", "Clé de traduction", bxT.giZ, false), new bYE("gfxId", "Id de l'icone", bxT.gja, false), new bYE("worldX", "Position x", bxT.gja, false), new bYE("worldY", "Position y", bxT.gja, false) };

  private static final bYE[] caS = { new bYE("titleTranslationKey", "Clef de traduction du titre", bxT.giZ, false), new bYE("textTranslationKey", "Clef de traduction du texte", bxT.giZ, false) };

  private static final bYE[] caT = { new bYE("positive", "true affiche un +1, false affiche un -1", bxT.gjc, true) };

  private static final bYE[] caU = { new bYE("landMarkId", "Id de la note", bxT.gja, false) };

  private static final bYE[] caV = { new bYE("frescoId", "Id de la fresque", bxT.gja, false) };

  private static final bYE[] caW = { new bYE("duration", "Durée du compte à rebours", bxT.gja, false), new bYE("startDate", "Date de départ du compte à rebours (date courante si non renseigné)", bxT.giY, true) };

  private static final bYE[] caX = { new bYE("fighterId", "Id du fighter", bxT.gja, false), new bYE("activated", "sélectionne si true, déselectionne si false", bxT.gjc, false) };

  private static final bYE[] caY = { new bYE("duration", "Durée du décompte (en secondes)", bxT.gjb, false), new bYE("decrement", "Interval entre deux 'tic' de countdown", bxT.gjb, true) };

  private static final bYE[] caZ = { new bYE("message", "Message à afficher", bxT.giZ, true), new bYE("duration", "Durée d'affichage du message", bxT.gjb, false) };

  private static final bYE[] cba = { new bYE("elementId", "Id de l'élément interactif sur lequel on ouvre le MRU", bxT.giY, false), new bYE("eventId", "Id de l'événement LUA généré par l'activation du MRU", bxT.gja, false), new bYE("gfxId", "gfxId de l'action de MRU", bxT.gja, false) };

  private static final bYE[] cbb = { new bYE("interactiveElementId", "Id de l'élément interactif sur lequel on ouvre le MRU", bxT.gjb, false) };

  private static final bYE[] cbc = { new bYE("skillVisualId", "Id de l'action", bxT.gjb, false), new bYE("usable", "Utilisable ou non", bxT.gjc, false) };

  private static final bYE[] cbd = { new bYE("actionId", "Id de l'action", bxT.gjb, false), new bYE("usable", "Utilisable ou non", bxT.gjc, false) };

  private static final bYE[] cbe = { new bYE("charaCcterId", "Id du personnage concerné", bxT.giY, false), new bYE("actionId", "Id de l'action MRU", bxT.gjb, false), new bYE("onlyOnce", "Spécifie qu'on ajoutera pas le MRU s'il existe déjà un avec le même id d'action sur ce personnage", bxT.gjc, true) };

  private static final bYE[] cbf = { new bYE("characterId", "Id du personnage concerné", bxT.giY, false), new bYE("actionId", "Id de l'action MRU concernée", bxT.gjb, false) };

  private static final bYE[] cbg = { new bYE("trainingActionIndex", "Id de l'action MRU concernée", bxT.gja, false), new bYE("shouldTeleport", "Indique si les fighters doivent être téléportés dans le combat ou pas", bxT.gjc, false), new bYE("fightType", "Indique le type de combat (pvp=1,pve=2,tuto=3,etc..cf FightModel)", bxT.gja, false), new bYE("hasBorders", "Indique si le combat doit avoir des bordures", bxT.gjc, false), new bYE("battlegroundType", "Indique le type de bordure du combat", bxT.gja, false), new bYE("bgParams", "Pattern du battleground", bxT.gje, true) };

  private static final bYE[] cbh = { new bYE("trainingActionIndex", "Id de l'action MRU concernée", bxT.gja, false), new bYE("bgX", "x de la position centre du battleground", bxT.gja, false), new bYE("bgY", "y de la position centre du battleground", bxT.gja, false), new bYE("bgZ", "z de la position centre du battleground", bxT.gja, false) };

  private static final bYE[] cbi = { new bYE("trainingActionIndex", "Id de l'action MRU concernée", bxT.gja, false), new bYE("attackerX", "x de la position de départ des attaquants", bxT.gja, false), new bYE("attackerY", "y de la position de départ des attaquants", bxT.gja, false), new bYE("attackerZ", "z de la position de départ des attaquants", bxT.gja, false), new bYE("defenderX", "x de la position de départ des défenseurs", bxT.gja, false), new bYE("defenderY", "y de la position de départ des défenseurs", bxT.gja, false), new bYE("defenderZ", "z de la position de départ des défenseurs", bxT.gja, false) };

  private static final bYE[] cbj = { new bYE("frame", "Frame à activer", bxT.giZ, false), new bYE("push", "Active ou desactive la frame", bxT.gjc, false) };

  private static final bYE[] cbk = { new bYE("dialog", "Nom du dialogue", bxT.giZ, false), new bYE("id", "Nom du widget", bxT.giZ, false), new bYE("eventType", "Type d'événement", bxT.giZ, false), new bYE("funcName", "Fonction à appeler", bxT.giZ, false), new bYE("params", "Paramètres de la fonction à appeler", bxT.gje, true) };

  private static final bYE[] cbl = { new bYE("dialog", "Nom du dialogue", bxT.giZ, false), new bYE("id", "Nom du widget", bxT.giZ, false), new bYE("eventType", "Type d'evenement", bxT.giZ, false), new bYE("funcName", "Fonction qui devait être appelée", bxT.giZ, false) };

  private static final bYE[] cbm = { new bYE("dialog", "Nom du dialoque", bxT.giZ, false), new bYE("id", "Nom du widget", bxT.giZ, false), new bYE("button", "Bouton de la souris enfoncé", bxT.gjb, true), new bYE("clickCount", "Nombre de click", bxT.gjb, true) };

  private static final bYE[] cbn = { new bYE("dialog", "Nom du dialogue", bxT.giZ, false), new bYE("id", "Nom du widget", bxT.giZ, false), new bYE("enable", "Activation", bxT.gjc, false) };

  private static final bYE[] cbo = { new bYE("dialog", "Nom du dialogue", bxT.giZ, false), new bYE("id", "Nom du wdget", bxT.giZ, false), new bYE("eventType", "Type d'événement", bxT.giZ, false), new bYE("enable", "Activation", bxT.gjc, false) };

  private static final bYE[] cbp = { new bYE("fileName", "Nom du fichier à ouvrir", bxT.giZ, false), new bYE("linkageName", "Nom de l'anim à jouer dans l'interface", bxT.giZ, false), new bYE("align", "Alignement de la fenetre", bxT.giZ, false), new bYE("screenXoffset", "Décalage en pixel vers la droite", bxT.gja, false), new bYE("screenYoffset", "Décalage en pixel vers le haut", bxT.gja, false) };

  private static final bYE[] cbq = { new bYE("id", "Id de la fenetre d'interface", bxT.gja, false), new bYE("animName", "Nom de l'animation à jouer", bxT.giZ, false) };

  private static final bYE[] cbr = { new bYE("id", "Id de la fenetre d'interface", bxT.gja, false) };

  private static final bYE[] cbs = { new bYE("dialog", "Nom de la fenetre à ouvrir", bxT.giZ, false) };

  private static final bYE[] cbt = { new bYE("dialogName", "Nom du dialogue", bxT.giZ, false) };

  private static final bYE[] cbu = { new bYE("dialogName", "Nom du dialogue", bxT.giZ, false), new bYE("movable", "Vérouillé", bxT.gjc, false) };

  private static final bYE[] cbv = { new bYE("dialogName", "Nom du dialogue", bxT.giZ, false), new bYE("widgetId", "Nom du widget", bxT.giZ, false), new bYE("enabled", "Activation", bxT.gjc, false) };

  private static final bYE[] cbw = { new bYE("propertyName", "Nom de la propriété", bxT.giZ, false), new bYE("value", "Valeur", bxT.gjc, false) };

  private static final bYE[] cbx = { new bYE("propertyName", "Nom de la propriété", bxT.giZ, false), new bYE("value", "Valeur", bxT.giZ, false) };

  private static final bYE[] cby = { new bYE("propertyName", "Nom de la propriété", bxT.giZ, false) };

  private static final bYE[] cbz = { new bYE("dialogName", "Nom du dialogue", bxT.giZ, false), new bYE("widgetId", "Nom du wodget", bxT.giZ, false), new bYE("propertyName", "Nom de la propriété concernée", bxT.giZ, false), new bYE("local", "True s'il s'agit d'une propriété locale (propre à un dialog)", bxT.gjc, true) };

  private static final bYE[] cbA = { new bYE("dialogName", "Nom du dialogue", bxT.giZ, false), new bYE("propertyName", "Nom de la propriété", bxT.giZ, false), new bYE("field", "Champ de la propriété", bxT.giZ, false), new bYE("local", "True s'il s'agit d'une propriété locale (propre à un dialog)", bxT.gjc, true) };

  private static final bYE[] cbB = { new bYE("dialogName", "Nom du dialogue", bxT.giZ, false), new bYE("widgetId", "Nom du widget", bxT.giZ, false), new bYE("visible", "Visibilité", bxT.gjc, false) };

  private static final bYE[] cbC = { new bYE("dialogName", "Nom du dialogue", bxT.giZ, false), new bYE("widgetId", "Nom du widget", bxT.giZ, false), new bYE("blocking", "true bloque, false ne bloque pas", bxT.gjc, false) };

  private static final bYE[] cbD = { new bYE("dialogName", "Nom du dialog ouvert", bxT.giZ, false) };

  private static final bYE[] cbE = { new bYE("slotNumber", "Numéro du slot", bxT.gja, false) };

  private static final bYE[] cbF = { new bYE("slotNumber", "Numéro de slot", bxT.gja, false) };

  private static final bYE[] cbG = { new bYE("dialogName", "Nom du dialog", bxT.giZ, false), new bYE("listId", "Id de la liste", bxT.giZ, false), new bYE("subId", "Id de l'élément concerné dans la liste", bxT.giZ, false), new bYE("duration", "Durée de tween", bxT.gjb, false), new bYE("repeat", "Nombre de répétitions du tween (-1 pour infinie)", bxT.gjb, false), new bYE("r1", "Valeur rouge de départ (blanc vers gris si non renseigné)", bxT.gjb, true), new bYE("g1", "Valeur vert de départ (blanc vers gris si non renseigné)", bxT.gjb, true), new bYE("b1", "Valeur bleu de départ (blanc vers gris si non renseigné)", bxT.gjb, true), new bYE("a1", "Valeur alpha de départ (blanc vers gris si non renseigné)", bxT.gjb, true), new bYE("r2", "Valeur rouge de fin (blanc vers gris si non renseigné)", bxT.gjb, true), new bYE("g2", "Valeur vert de fin (blanc vers gris si non renseigné)", bxT.gjb, true), new bYE("b2", "Valeur bleu de fin (blanc vers gris si non renseigné)", bxT.gjb, true), new bYE("a2", "Valeur alpha de fin (blanc vers gris si non renseigné)", bxT.gjb, true) };

  private static final bYE[] cbH = { new bYE("dialogName", "Nom du dialog", bxT.giZ, false), new bYE("widgetId", "Id de la liste", bxT.giZ, false), new bYE("subId", "Id de l'élément concerné dans la liste", bxT.giZ, false) };

  private static final bYE[] cbI = { new bYE("dialogName", "Nom du dialogue", bxT.giZ, false), new bYE("widgetId", "Nom du widget", bxT.giZ, false), new bYE("duration", "Temps du cycle du tween (en ms)", bxT.gjb, false), new bYE("repeat", "Nombre de cycles du tween (-1 = infini)", bxT.gjb, false), new bYE("r1", "Teinte 1 rouge", bxT.gjb, true), new bYE("g1", "Teinte 1 vert", bxT.gjb, true), new bYE("b1", "Teinte 1 bleu", bxT.gjb, true), new bYE("a1", "Teinte 1 alpha", bxT.gjb, true), new bYE("r2", "Teinte 2 rouge", bxT.gjb, true), new bYE("g2", "Teinte 2 vert", bxT.gjb, true), new bYE("b2", "Teinte 2 bleu", bxT.gjb, true), new bYE("a2", "Teinte 2 alpha", bxT.gjb, true) };

  private static final bYE[] cbJ = { new bYE("dialogName", "Nom du dialogue", bxT.giZ, false), new bYE("widgetId", "Nom du widget", bxT.giZ, false) };

  private static final bYE[] cbK = { new bYE("dialogName", "Nom du dialogue", bxT.giZ, false), new bYE("widgetId", "Nom du widget", bxT.giZ, false), new bYE("particleFileName", "Nom du fichier de particule", bxT.giZ, false), new bYE("posX", "Position x", bxT.gjb, false), new bYE("posY", "Position y", bxT.gjb, false), new bYE("followBorder", "Active le systeme autours du widget", bxT.gjc, false), new bYE("alignment", "Alignement du systeme", bxT.giZ, true), new bYE("level", "Niveau du systeme", bxT.gjb, true) };

  private static final bYE[] cbL = { new bYE("particleId", "Id de l'APS", bxT.gja, false) };

  private static final bYE[] cbM = { new bYE("particleId", "Id de l'APS", bxT.gja, false), new bYE("time", "Temps avant disparition (en ms)", bxT.gja, true) };

  private static final bYE[] cbN = { new bYE("dialogId", "Id de l'interface", bxT.giZ, false), new bYE("widgetId", "Id du widget", bxT.giZ, false) };

  private static final bYE[] cbO = { new bYE("cursorState", "Etat du curseur", bxT.giZ, false) };

  private static final bYE[] cbP = { new bYE("cursorState", "Ancien état du curseur", bxT.giZ, false) };

  private static final bYE[] cbQ = { new bYE("show/hide", "Affiche ou masque les bandes", bxT.gjc, false), new bYE("percentOfScreen", "Pourcentage de l'écran en noir", bxT.gja, true), new bYE("duration", "Temps de transition (en ms)", bxT.gja, true) };

  private static final bYE[] cbR = { new bYE("referenceType", "Le type de paramètre qui définira l'objet (Pos,UID, refid)", bxT.giZ, false), new bYE("itemReference", "Suivant refType, soit la position, soit l'UID, soit l'id de reference", bxT.giY, false), new bYE("position", "Position à laquelle le raccourci doit être ajouté dans la barre", bxT.gja, true) };

  private static final bYE[] cbS = { new bYE("emoteId", "Id de l'emote concernée", bxT.gja, false), new bYE("position", "Position dans la barre de raccourci d'item courante (première place libre si non renseigné)", bxT.gja, true) };

  private static final bYE[] cbT = { new bYE("referenceId", "Id référent de l'élément qu'on souhaite enlever", bxT.gja, false), new bYE("shortcutType", "Typde de la barre de raccourci concernée (0: spell, 2: item, 3: slot)", bxT.gja, false) };

  private static final bYE[] cbU = { new bYE("referenceType", "Le type de paramètre qui définira l'objet (UID, refid)", bxT.giZ, false), new bYE("itemReference", "Suivant refType, soit la position, soit l'UID, soit l'id de reference", bxT.giY, false), new bYE("position", "Position à laquelle le raccourci doit être ajouté dans la barre", bxT.gja, true) };

  private static final bYE[] cbV = { new bYE("referenceType", "Le type de référence d'item en param2 (uid=l'unique id de l'item,refId=le refId de l'item)", bxT.giZ, false), new bYE("itemReference", "Id ou refId de l'item", bxT.giY, false), new bYE("position", "Position dans la barre courante (première position livre si non renseigné)", bxT.gja, true) };

  private static final bYE[] cbW = { new bYE("hasShortcut", "true si on trouve un raccourci, false sinon", bxT.gjc, false) };

  private static final bYE[] cbX = { new bYE("referenceId", "Id référent de l'élément qu'on souhaite vérifier", bxT.gja, true), new bYE("shortcutType", "Typde de la barre de raccourci concernée (0: spell, 2: item, 3: slot)", bxT.gja, true) };

  private static final bYE[] cbY = { new bYE("hasShortcut", "true si on trouve un raccourci, false sinon", bxT.gjc, false) };

  private static final bYE[] cbZ = { new bYE("referenceId", "Id référent de l'élément qu'on souhaite vérifier", bxT.gja, true), new bYE("shortcutType", "Typde de la barre de raccourci concernée (0: spell, 2: item, 3: slot)", bxT.gja, true) };

  private static final bYE[] cca = { new bYE("hasShortcut", "true si on trouve un raccourci, false sinon", bxT.gjc, false) };

  private static final bYE[] ccb = { new bYE("referenceId", "Id référent de l'élément qu'on souhaite vérifier", bxT.gja, true), new bYE("shortcutType", "Typde de la barre de raccourci concernée (0: spell, 2: item, 3: slot)", bxT.gja, true) };

  private static final bYE[] ccc = { new bYE("usable", "Active si true, désactive si false", bxT.gjc, false), new bYE("shortCutBarType", "Type de barre de raccourci concernée (HANDS, HANDS_AND_FIGHT, FIGHT ou WORLD, toutes les barres si non renseigné)", bxT.giZ, true), new bYE("barIndex", "Indice de la barre concernée", bxT.gja, true), new bYE("position", "Position dans la barre du raccourci concerné", bxT.gja, true) };

  private static final bYE[] ccd = { new bYE("dialog", "Nom du dialogue", bxT.giZ, false), new bYE("funcName", "Fonction à appeler", bxT.giZ, false), new bYE("params", "Paramètres de la fonction à appaler", bxT.gje, true) };

  private static final bYE[] cce = { new bYE("dialog", "Nom du dialogue", bxT.giZ, false) };

  private static final bYE[] ccf = { new bYE("dialog", "Nom du dialogue", bxT.giZ, false) };

  private static final bYE[] ccg = { new bYE("dialog", "Nom du dialogue", bxT.giZ, false), new bYE("funcName", "Fonction a appeler", bxT.giZ, false), new bYE("params", "Parametres de la fonction a appeler", bxT.gje, true) };

  private static final bYE[] cch = { new bYE("dialog", "Nom du dialogue", bxT.giZ, false) };

  private static final bYE[] cci = { new bYE("enabled", "Activation", bxT.gjc, false), new bYE("groupName", "Nom du groupe", bxT.giZ, true), new bYE("name", null, bxT.giZ, true) };

  private static final bYE[] ccj = { new bYE("visible", "true visible, false invisible", bxT.gjc, false) };

  private static final bYE[] cck = { new bYE("message", "La clef de traduction suivie d'éventuels paramètres", bxT.gje, true) };

  private static final bYE[] ccl = { new bYE("message", "La clef de traduction", bxT.giZ, false), new bYE("params", "Les paramètres éventuels du message", bxT.gje, true) };

  private static final bYE[] ccm = { new bYE("x", "x de la position du marqueur dans le monde", bxT.gja, false), new bYE("y", "y de la position du marqueur dans le monde", bxT.gja, false), new bYE("z", "z de la position du marqueur dans le monde", bxT.gja, false), new bYE("pointId", "Obsolète", bxT.gja, false) };

  private static final bYE[] ccn = { new bYE("pointId", "Obsolète", bxT.gja, false) };

  private static final bYE[] cco = { new bYE("message", "Un ou plusieurs messages séparés par des virgules", bxT.gje, true) };

  private static final bYE[] ccp = { new bYE("message", "Le message", bxT.giZ, false), new bYE("mobileId", "L'id du mobile concerné", bxT.giY, false), new bYE("params", "Paramètres éventuels du message", bxT.gje, true) };

  private static final bYE[] ccq = { new bYE("smileyId", "Id du smiley", bxT.gja, false), new bYE("mobileId", "Id du mobile concerné", bxT.giY, false), new bYE("familyId", "S'il s'agit d'un smiley de monstre, id de la famille de monstre", bxT.gja, true) };

  private static final bYE[] ccr = { new bYE("protectorId", "L'id du protecteur statique", bxT.gja, false) };

  private static final bYE[] ccs = { new bYE("monster", null, bxT.gjc, false), new bYE("familyId", null, bxT.gja, false), new bYE("minValue", null, bxT.gja, false), new bYE("maxValue", null, bxT.gja, false) };

  private static final bYE[] cct = { new bYE("iconUrl", "Url de l'image à afficher", bxT.giZ, false) };

  private static final bYE[] ccu = { new bYE("result", "true si l'interface est verouillée, false sinon", bxT.gjc, false) };

  private static final bYE[] ccv = { new bYE("dialogName", "Nom du dialog", bxT.giZ, false) };

  private static final bYE[] ccw = { new bYE("result", "True si le dialog ouvert, false sinon", bxT.gjc, false) };

  private static final bYE[] ccx = { new bYE("messageParamCount", "Nombre de paramètres dans le message", bxT.gja, false), new bYE("message", "Clef de traduction du message", bxT.gje, false), new bYE("blocking", "Le message ne peut pas se fermer au clic", bxT.gjc, false), new bYE("displayTime", "Durée d'affichage du message (dynamique en fonction du message si non renseigné)", bxT.gja, true), new bYE("funcName", "Fonctione à appeler quand on ferme la bulle de dialogue", bxT.giZ, true), new bYE("params", "Les paramètres éventuels du message", bxT.gje, true) };

  private static final bYE[] ccy = { new bYE("displayId", "Id du background", bxT.gja, false) };

  private static final bYE[] ccz = { new bYE("position", "Position du groupe de joueurs sur le podium", bxT.gja, false) };

  private static final bYE[] ccA = { new bYE("text", "Clef de traduction du message", bxT.giZ, false), new bYE("params", "Les paramètres éventuels du message", bxT.gje, true) };

  private static final bYE[] ccB = { new bYE("blocking", "True empêche la sélection effective du sort, false sinon", bxT.gjc, false), new bYE("funcName", "Nom de la fonction à appeler quand un sort est sélectionné", bxT.giZ, false), new bYE("params", "Parmaètres éventuels de la fonction appelée quand un sort est sélectionné", bxT.gje, true) };

  private static final bYE[] ccC = { new bYE("funcName", "Nom de la fonction qui écoute la sélection d'un sort", bxT.giZ, false) };

  private static final bYE[] ccD = { new bYE("funcName", "La fonction à appeler quand le niveau de détail du jeu change", bxT.giZ, false) };

  private static final bYE[] ccE = { new bYE("lodLevel", "Le niveau de détails actuel du jeu (0,1 ou 2)", bxT.gja, false) };

  private static final bYE[] ccF = { new bYE("Nom", "Nom (inutilisé)", bxT.giZ, false), new bYE("x", "Position x", bxT.gjb, false), new bYE("y", "Position y", bxT.gjb, false), new bYE("z", "Position z", bxT.gjb, true), new bYE("type", "Le type de boussole (pour l'icone). Valeurs acceptées : 0 (personnage), 1 (havre-sac), 2 (autres), 3 (challenges), 6 (protecteurs)", bxT.gjb, true) };

  private static final bYE[] ccG = { new bYE("compassId", "Id de la boussole", bxT.giY, false) };

  private static final bYE[] ccH = { new bYE("id", "Id de la boussole", bxT.giY, false) };

  private static final bYE[] ccI = { new bYE("videoName", "Le nom de la vidéo à charger", bxT.giZ, false) };

  private static final bYE[] ccJ = { new bYE("translationKey", "Clef de traduction du texte à afficher", bxT.giZ, true), new bYE("params", "Les paramètres éventuels du message", bxT.gje, true) };

  private static final bYE[] ccK = { new bYE("titleTranslationKey", "Clef de trad du titre du popup", bxT.giZ, false), new bYE("translationKey", "Clef de trad du texte du popup", bxT.giZ, false), new bYE("params", "Params du texte du popup", bxT.gje, true) };

  private static final bYE[] ccL = { new bYE("item", "RefId de l'item offert", bxT.gjb, false), new bYE("translationKey", "clef de traduction du texte de la récompense", bxT.giZ, true), new bYE("params", "Les paramètres éventuels du texte", bxT.gje, true) };

  private static final bYE[] ccM = { new bYE("iconName", "Nom de l'image à afficher (cf dossier tutorial dans les assets)", bxT.giZ, false), new bYE("titleTranslationKey", "clef de traduction du titre du tuto", bxT.giZ, false), new bYE("descriptionTranslationKey", "clef de traduction du texte du tuto", bxT.giZ, false), new bYE("type", "Type de message d'info : (0=tuto, 1=tips, ...)", bxT.gja, true), new bYE("params", "Les paramètres éventuels du texte", bxT.gje, true) };

  private static final bcm ccN = new bcm();

  private static final UIFunctionsLibrary ccO = new UIFunctionsLibrary();

  private static int ccP = 0;
  private static int ccQ = 0;
  final cSR ccR = new cSR();

  public final String getName()
  {
    return "UI";
  }

  public String getDescription()
  {
    return "NO Description<br/>Please Dev... implement me!";
  }

  public static UIFunctionsLibrary Xv()
  {
    return ccO;
  }

  public dsg[] b(LuaState paramLuaState)
  {
    return new dsg[] { new UIFunctionsLibrary.DisplayFresco(paramLuaState), new UIFunctionsLibrary.AddEventListener(paramLuaState), new UIFunctionsLibrary.RemoveEventListener(paramLuaState), new UIFunctionsLibrary.EnableEvent(paramLuaState), new UIFunctionsLibrary.AddColorTween(paramLuaState), new UIFunctionsLibrary.RemoveColorTween(paramLuaState), new UIFunctionsLibrary.AddListColorTween(paramLuaState), new UIFunctionsLibrary.RemoveListColorTween(paramLuaState), new UIFunctionsLibrary.AddParticle(paramLuaState), new UIFunctionsLibrary.RemoveParticle(paramLuaState), new UIFunctionsLibrary.ClearParticles(paramLuaState), new UIFunctionsLibrary.ClickButton(paramLuaState), new UIFunctionsLibrary.LoadDialog(paramLuaState), new UIFunctionsLibrary.UnloadDialog(paramLuaState), new UIFunctionsLibrary.ChangeCursor(paramLuaState), new UIFunctionsLibrary.ManageFrame(paramLuaState), new UIFunctionsLibrary.OpenMRU(paramLuaState), new UIFunctionsLibrary.OpenMRUWithAction(paramLuaState), new UIFunctionsLibrary.ManageSkillMRU(paramLuaState), new UIFunctionsLibrary.ManageMRU(paramLuaState), new UIFunctionsLibrary.AddMRU(paramLuaState), new UIFunctionsLibrary.SetTrainingFightParameters(paramLuaState), new UIFunctionsLibrary.SetTrainingFightBattleGroundCenter(paramLuaState), new UIFunctionsLibrary.SetTrainingFightStartPositions(paramLuaState), new UIFunctionsLibrary.DisplayWideScreenBand(paramLuaState), new UIFunctionsLibrary.CharacterDisplayerOpen(paramLuaState), new UIFunctionsLibrary.CharacterDisplayerClose(paramLuaState), new UIFunctionsLibrary.CharacterDisplayerChangeLinkage(paramLuaState), new UIFunctionsLibrary.AddEquipmentShortcut(paramLuaState), new UIFunctionsLibrary.AddEmoteShortcut(paramLuaState), new UIFunctionsLibrary.AddSpellShortcut(paramLuaState), new UIFunctionsLibrary.SetShortcutUsable(paramLuaState), new UIFunctionsLibrary.OpenBag(paramLuaState), new UIFunctionsLibrary.OpenAllBags(paramLuaState), new UIFunctionsLibrary.CloseBag(paramLuaState), new UIFunctionsLibrary.CloseAllBags(paramLuaState), new UIFunctionsLibrary.EnableDragNDrop(paramLuaState), new UIFunctionsLibrary.SetWindowMovable(paramLuaState), new UIFunctionsLibrary.AddDialogLoadedListener(paramLuaState), new UIFunctionsLibrary.RemoveDialogLoadedListener(paramLuaState), new UIFunctionsLibrary.AddDialogUnloadedListener(paramLuaState), new UIFunctionsLibrary.RemoveDialogUnloadedListener(paramLuaState), new UIFunctionsLibrary.GetWindowSize(paramLuaState), new UIFunctionsLibrary.SetWidgetEnabled(paramLuaState), new UIFunctionsLibrary.SetWidgetVisibility(paramLuaState), new UIFunctionsLibrary.RemovePropertyClient(paramLuaState), new UIFunctionsLibrary.SetShortcutEnabled(paramLuaState), new UIFunctionsLibrary.CloseMRU(paramLuaState), new UIFunctionsLibrary.WriteBloopsInChat(paramLuaState), new UIFunctionsLibrary.WriteInChat(paramLuaState), new UIFunctionsLibrary.RemoveMRU(paramLuaState), new UIFunctionsLibrary.RemoveShortCutWithId(paramLuaState), new UIFunctionsLibrary.DisplayCountDown(paramLuaState), new UIFunctionsLibrary.SetWidgetBlockability(paramLuaState), new UIFunctionsLibrary.SystemMessage(paramLuaState), new UIFunctionsLibrary.FollowOnMiniMap(paramLuaState), new UIFunctionsLibrary.RemoveFromMiniMap(paramLuaState), new UIFunctionsLibrary.SetUIVisible(paramLuaState), new UIFunctionsLibrary.DisplaySplashScreenImage(paramLuaState), new UIFunctionsLibrary.GetPropertyValueInt(paramLuaState), new UIFunctionsLibrary.IsBarLockedMode(paramLuaState), new UIFunctionsLibrary.IsDialogLoaded(paramLuaState), new UIFunctionsLibrary.AddItemShortcut(paramLuaState), new UIFunctionsLibrary.SetPropertyBooleanValue(paramLuaState), new UIFunctionsLibrary.SetPropertyStringValue(paramLuaState), new UIFunctionsLibrary.RemoveProperty(paramLuaState), new UIFunctionsLibrary.PushPetMessage(paramLuaState), new UIFunctionsLibrary.SetNextPetMessage(paramLuaState), new UIFunctionsLibrary.HasFightShortcut(paramLuaState), new UIFunctionsLibrary.HasWorldShortcut(paramLuaState), new UIFunctionsLibrary.HasShortcut(paramLuaState), new UIFunctionsLibrary.WriteInEmoteChat(paramLuaState), new UIFunctionsLibrary.WriteUnlocalisedInChat(paramLuaState), new UIFunctionsLibrary.DisplaySmiley(paramLuaState), new DisplayFlyingText(paramLuaState), new UIFunctionsLibrary.HighlightFighterInTimeline(paramLuaState), new UIFunctionsLibrary.DisplayBackground(paramLuaState), new UIFunctionsLibrary.DisplaySplashText(paramLuaState), new UIFunctionsLibrary.StopDungeonLadderTimer(paramLuaState), new UIFunctionsLibrary.DisplayDungeonLadderTimer(paramLuaState), new UIFunctionsLibrary.DisplayDungeonLadderMonsterCount(paramLuaState), new UIFunctionsLibrary.UnloadDungeonStatut(paramLuaState), new UIFunctionsLibrary.IncrementDungeonLadderMonsterCount(paramLuaState), new UIFunctionsLibrary.DisplayDungeonResultSplashText(paramLuaState), new UIFunctionsLibrary.AddSpellSelectionListener(paramLuaState), new UIFunctionsLibrary.RemoveSpellSelectionListener(paramLuaState), new UIFunctionsLibrary.PushStaticProtector(paramLuaState), new UIFunctionsLibrary.AddLODListener(paramLuaState), new UIFunctionsLibrary.GetLOD(paramLuaState), new UIFunctionsLibrary.DisplayChallengeVarUpdateFlyingImage(paramLuaState), new UIFunctionsLibrary.StartCountdown(paramLuaState), new UIFunctionsLibrary.StopScenarioCountdown(paramLuaState), new UIFunctionsLibrary.AddLandMarkNote(paramLuaState), new UIFunctionsLibrary.RemoveLandMarkNote(paramLuaState), new UIFunctionsLibrary.StartInteractiveDialog(paramLuaState), new UIFunctionsLibrary.SetStaticProtectorInterval(paramLuaState), new UIFunctionsLibrary.AddCompass(paramLuaState), new UIFunctionsLibrary.RemoveCompass(paramLuaState), new UIFunctionsLibrary.StartVideoLoading(paramLuaState), new UIFunctionsLibrary.DisplayTutorialMessage(paramLuaState), new UIFunctionsLibrary.OpenRewardsDialog(paramLuaState), new UIFunctionsLibrary.AddReward(paramLuaState), new UIFunctionsLibrary.OpenInfoDialog(paramLuaState), new UIFunctionsLibrary.LoadTutorialMessageDialog(paramLuaState), new UIFunctionsLibrary.UnloadTutorialMessageDialog(paramLuaState) };
  }

  public dsg[] c(LuaState paramLuaState)
  {
    return null;
  }

  private static String fQ(int paramInt) {
    return "characterDialog" + paramInt;
  }

  public void clear() {
    dmn localdmn = this.ccR.yF();
    for (int i = this.ccR.size(); i > 0; i--) {
      localdmn.fl();
      ((cag)localdmn.value()).setTimeToLive(0);
    }
    this.ccR.clear();
    ccP = 0;
    ccQ = 0;
    ccN.d(new dTv(this));
  }
}