public class bQX
{
  public static final byte gZu = 0;
  public static final byte gZv = 1;
  public static final byte gZw = 2;
  public static final byte gZx = 3;
  public static final byte gZy = 4;
  public static final byte gZz = 5;
  public static final byte gZA = 6;
  public static final byte gZB = 7;
  public static final byte gZC = 8;
  public static final byte gZD = 9;
  public static final byte gZE = 10;
  public static final byte gZF = 11;
  public static final byte gZG = 12;
  public static final byte gZH = 13;
  public static final byte gZI = 14;
  public static final byte gZJ = 15;
  public static final byte gZK = 16;
  public static final byte gZL = 17;
  public static final byte gZM = 18;
  public static final byte gZN = 19;
  public static final byte gZO = 20;
  public static final byte gZP = 21;
  public static final byte gZQ = 22;
  public static final byte gZR = 23;
  public static final byte gZS = 24;
  public static final byte gZT = 25;
  public static final byte gZU = 26;
  public static final byte gZV = 27;
  public static final byte gZW = 28;
  public static final byte gZX = 29;
  public static final byte gZY = 30;
  public static final byte gZZ = 31;
  public static final byte haa = 32;
  public static final byte hab = 33;

  public static String c(String paramString, byte paramByte)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("[EVENTS_CALENDAR] ");
    localStringBuilder.append(paramString).append(" : ");
    switch (paramByte) {
    case 0:
      localStringBuilder.append("Aucune erreur");
      break;
    case 1:
      localStringBuilder.append("Impossible a ajouter");
      break;
    case 2:
      localStringBuilder.append("Impossible de s'inscrire");
      break;
    case 9:
      localStringBuilder.append("Impossible de retirer l'evenement");
      break;
    case 10:
      localStringBuilder.append("Impossible de modifier la date de fin");
      break;
    case 12:
      localStringBuilder.append("Impossible de donner une date de fun precedant la date de debut");
      break;
    case 15:
      localStringBuilder.append("Date de debut obligatoire");
      break;
    case 4:
      localStringBuilder.append("Impossible d'annuler l'inscription");
      break;
    case 3:
      localStringBuilder.append("Impossible de valider l'inscription");
      break;
    case 16:
      localStringBuilder.append("Invite deha present pour l'evenement");
      break;
    case 5:
      localStringBuilder.append("Invité non connecté");
      break;
    case 6:
      localStringBuilder.append("L'invité a deja une demande en cours");
      break;
    case 11:
      localStringBuilder.append("L'evenement n'existe pas");
      break;
    case 8:
      localStringBuilder.append("Invitation acceptee");
      break;
    case 7:
      localStringBuilder.append("Incitation refusee");
      break;
    case 13:
      localStringBuilder.append("Pas le propriétaire de l'evenement");
      break;
    case 14:
      localStringBuilder.append("Les donnees du joueur n'existent pas sur le serveur");
      break;
    case 17:
      localStringBuilder.append("Trop de participants par rapport au max");
      break;
    case 18:
      localStringBuilder.append("Trop d'inscrits par rapport au max");
      break;
    case 19:
      localStringBuilder.append("Un evenement similaire existe deja");
      break;
    case 25:
      localStringBuilder.append("Exception levee");
      break;
    case 24:
      localStringBuilder.append("Type d'evenement inconnnu");
      break;
    case 22:
      localStringBuilder.append("Trop d'evenements pour le proprietaire");
      break;
    case 23:
      localStringBuilder.append("Le createur ne dispose pas des droits d'admin");
      break;
    case 20:
      localStringBuilder.append("Le createur n'a pas de guilde");
      break;
    case 21:
      localStringBuilder.append("Le createur n'a pas de nation");
      break;
    case 26:
      localStringBuilder.append("On n'a pas les droits pour modifier l'evenement");
      break;
    case 27:
      localStringBuilder.append("On n'a pas le droit d'ajouter un evenement a une date passée");
      break;
    case 28:
      localStringBuilder.append("Personnage deja inscrit a l'evenement");
      break;
    case 29:
      localStringBuilder.append("Evenement terminé");
      break;
    case 30:
      localStringBuilder.append("Personnage non inscrit");
      break;
    case 31:
      localStringBuilder.append("Nom du personnage null");
      break;
    case 32:
      localStringBuilder.append("Le personnage ne fait pas partie des participants");
      break;
    case 33:
      localStringBuilder.append("Trop d'evenements dans le calendrier concerné");
      break;
    default:
      localStringBuilder.append("Raison Inconnue ").append(paramByte);
    }
    return localStringBuilder.toString();
  }
}