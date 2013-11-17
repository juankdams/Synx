import java.io.PrintStream;
import java.util.HashSet;

public final class diq
{
  private static final int lef = 1460857362;
  private static final int leg = 2571426;
  private static final int leh = 70353081;
  private static final int lei = 2455640;
  private static final int lej = 80097030;
  private static final int lek = 2047106;
  private static final int lel = -1157987650;
  private static final int lem = -514753261;
  private static final String[] len = { "CheveuxHaut", "CheveuxBas", "CheveuxArriere" };

  private static final String[] leo = { "BajouePeau", "Barbe", "Bouche", "Bouche01", "Bouche02", "Bouche03", "Bouche04", "Bouche05", "Bouche06", "Bouche07", "Bouche08", "Bouche09", "Bouche10", "Bouche11", "Bouche12", "Bouche13", "Bouche14", "CheveuxBas", "CheveuxHaut", "CheveuxArriere", "CheveuxNatteBasse", "CheuveuxNatteHaute", "Crane", "Oreille", "Joue_02", "Joue01", "Joue02", "Joue03", "Nez01", "Nez02", "Nez02Peau", "Oei02", "Oeil01", "Oeil02", "Oeil03", "Oeil04", "Oeil05", "Oeil06", "Oeil07", "Oeil08", "Oeil09", "Oeil10", "Oeil11", "Oeil12", "Oeil13", "Oeil14", "Oeil15", "Oeil16", "Pleur", "Pleur_2", "Pupille01", "Pupille02", "Pupille03", "Reflet", "Sourcil01", "Sourcil02", "Sourcil03" };

  private static final String[] lep = { "JambeVetement", "JambePeau", "CuisseVetement", "CuissePeau" };
  private static final String[] leq = { "Pied01Vetement", "Pied02Vetement", "Pied01Peau", "Pied02Peau" };
  private static final String[] ler = { "TroncVetement", "TroncPeau" };
  private static final String[] les = { "BrasVetement", "BrasPeau" };
  private static final String[] let = { "BrasVetement", "CuisseVetement", "EpauleVetement", "JambeVetement", "BassinVetement", "CorpsVetement", "JupeVetement", "Jupe2Vetement", "TroncVetement" };

  private static final String[] leu = { "Epaulette-G", "Epaulette-D", "CorpsHabit", "Ceinture", "CuisseHabit", "JambeHabit", "PiedHabit01", "PiedHabit02", "Bouclier", "Cape", "CapeBas" };
  private static final int lev = 855858226;
  private static final String[] lew = { "BrasBas", "Peau_BrasBas" };
  private static final int lex = -2026252917;
  private static final String[] ley = { "BrasMilieu", "Peau_BrasMilieu" };
  private static final int lez = 761980122;
  private static final String[] leA = { "BrasHaut", "Peau_BrasHaut" };
  private static final int leB = 2422137;
  private static final String[] leC = { "OeilAmovible-Blanc01", "OeilAmovible-Blanc02", "OeilAmovible-Blanc03", "OeilAmovible-Blanc04", "OeilAmovible-Blanc05", "OeilAmovible-Blanc06", "OeilAmovible-Blanc07", "OeilAmovible-Blanc08", "OeilAmovible-Blanc09", "OeilAmovible-Halo01", "OeilAmovible-Halo02", "OeilAmovible-Noir01", "OeilAmovible-Noir02", "OeilAmovible-Noir03", "OeilAmovible-Noir04", "OeilAmovible-Halo01", "OeilAmovible-Halo02", "OeilAmovible-Marque" };
  private static final int leD = -2027940606;
  private static final String[] leE = { "Marque" };
  private static final int leF = 525252987;
  private static final String[] leG = { "Oeil-Marque" };
  private static final int leH = -485157885;
  private static final String[] leI = { "Barbe", "Chapeau", "CheveuxBas", "CheveuxHaut", "CheveuxArriere", "CheveuxNatteBasse", "CheuveuxNatteHaute", "Oei02", "Oeil01", "Oeil02", "Oeil03", "Oeil04", "Oeil05", "Oeil06", "Oeil07", "Oeil08", "Oeil09", "Oeil10", "Oeil11", "Oeil12", "Oeil13", "Oeil14", "Oeil15", "Oeil16", "Pupille01", "Pupille02", "Pupille03", "Sourcil01", "Sourcil02", "Sourcil03", "Crane", "Oreille", "BassinPeau", "BrasPeau", "EpaulePeau", "JambePeau", "PiedPeau01", "PiedPeau02", "TroncPeau", "Nez02Peau", "CorpsPeau", "CuissePeau", "Main_01", "Main_02", "Main_Doigt_01", "Main_Doigt_02", "Main_Doigt_03", "Main_doigt_04", "Main_doigt_05", "Main_doigt_06", "Main_doigt_07", "Main_doigt_08", "Main_doigt_09", "Main_doigt_10", "Main_doigt_11", "Main_doigt_12", "Main_doigt_13", "Main_Paume_01", "Main_Paume_02", "Main_Paume_03", "Main_Paume_04", "Main_Paume_05", "Main_pouce_01", "Main_pouce_02", "Main_pouce_03", "Main_pouce_04", "Main_pouce_05", "Main_pouce_06", "Main_pouce_07", "Main_pouce_08", "Main_pouce_09", "Main_pouce_10", "Main_pouce_11", "Main_pouce_12", "Main_pouce_13", "Main_pouce_14", "Main_01", "Main_02", "Main_03", "Main_04", "Main_05" };
  private static final int leJ = -1147503697;
  private static final String[] leK = { "Barbe", "CuisseHabit", "JambeHabit", "PiedHabit01", "PiedHabit02", "Chapeau", "Epaulette-D", "Epaulette-G", "CorpsHabit", "BrasVetement", "EpauleVetement", "TroncVetement", "Jupe2Vetement", "JupeVetement", "CorpsVetement", "BassinVetement", "CuisseVetement", "JambeVetement", "Cape", "CapeBas", "CheveuxBas" };

  private static final HashSet leL = new HashSet(50);

  public static String[] J(String[] paramArrayOfString) {
    for (String str1 : paramArrayOfString) {
      String[] arrayOfString2 = ph(str1);
      for (String str2 : arrayOfString2) {
        leL.add(str2);
      }
    }
    ??? = new String[leL.size()];
    leL.toArray(???);
    return ???;
  }

  public static String[] ph(String paramString) {
    int i = byn.jq(paramString);
    switch (i) {
    case 1460857362:
      return len;
    case 2571426:
      return leo;
    case 70353081:
      return lep;
    case 2455640:
      return leq;
    case 80097030:
      return ler;
    case 2047106:
      return les;
    case -1157987650:
      return let;
    case -514753261:
      return leu;
    case 855858226:
      return lew;
    case -2026252917:
      return ley;
    case 761980122:
      return leA;
    case 2422137:
      return leC;
    case -2027940606:
      return leE;
    case 525252987:
      return leG;
    case -485157885:
      return leI;
    case -1147503697:
      return leK;
    }
    return new String[] { paramString };
  }

  public static void main(String[] paramArrayOfString)
  {
    System.out.println(String.format("0x%X", new Object[] { Integer.valueOf(byn.jq("CHEVEUX")) }));
    System.out.println(String.format("0x%X", new Object[] { Integer.valueOf(byn.jq("TETE")) }));
    System.out.println(String.format("0x%X", new Object[] { Integer.valueOf(byn.jq("JAMBE")) }));
    System.out.println(String.format("0x%X", new Object[] { Integer.valueOf(byn.jq("PIED")) }));
    System.out.println(String.format("0x%X", new Object[] { Integer.valueOf(byn.jq("TRONC")) }));
    System.out.println(String.format("0x%X", new Object[] { Integer.valueOf(byn.jq("BRAS")) }));
    System.out.println(String.format("0x%X", new Object[] { Integer.valueOf(byn.jq("VETEMENT")) }));
    System.out.println(String.format("0x%X", new Object[] { Integer.valueOf(byn.jq("EQUIPEMENT")) }));

    System.out.println("-- gelutin :");
    System.out.println(String.format("0x%X", new Object[] { Integer.valueOf(byn.jq("BRASBAS")) }));
    System.out.println(String.format("0x%X", new Object[] { Integer.valueOf(byn.jq("BRASMILIEU")) }));
    System.out.println(String.format("0x%X", new Object[] { Integer.valueOf(byn.jq("BRASHAUT")) }));
    System.out.println(String.format("0x%X", new Object[] { Integer.valueOf(byn.jq("OEIL")) }));
    System.out.println(String.format("0x%X", new Object[] { Integer.valueOf(byn.jq("MASQUE")) }));
    System.out.println(String.format("0x%X", new Object[] { Integer.valueOf(byn.jq("MASQUEOEIL")) }));

    System.out.println("-- custom de perso :");
    System.out.println(String.format("0x%X", new Object[] { Integer.valueOf(byn.jq("CHEVEUXCUSTOM")) }));
    System.out.println(String.format("0x%X", new Object[] { Integer.valueOf(byn.jq("VETEMENTCUSTOM")) }));

    System.out.println("-- Anm color :");
    System.out.println(String.format("0x%X", new Object[] { Integer.valueOf(byn.jq("Peau")) }));
    System.out.println(String.format("0x%X", new Object[] { Integer.valueOf(byn.jq("Cheveux")) }));
    System.out.println(String.format("0x%X", new Object[] { Integer.valueOf(byn.jq("SymbolBg")) }));
    System.out.println(String.format("0x%X", new Object[] { Integer.valueOf(byn.jq("SymbolFg")) }));
    System.out.println(String.format("0x%X", new Object[] { Integer.valueOf(byn.jq("SymbolBorder")) }));
    System.out.println(String.format("0x%X", new Object[] { Integer.valueOf(byn.jq("Color_1")) }));
    System.out.println(String.format("0x%X", new Object[] { Integer.valueOf(byn.jq("Color_2")) }));
    System.out.println(String.format("0x%X", new Object[] { Integer.valueOf(byn.jq("Pupille")) }));
    System.out.println(String.format("0x%X", new Object[] { Integer.valueOf(byn.jq("Vetement")) }));

    System.out.println("--- ");
    System.out.println(String.format("0x%X", new Object[] { Integer.valueOf(byn.jq("LienClip")) }));
    System.out.println(String.format("0x%X", new Object[] { Integer.valueOf(byn.jq("Porteur")) }));
  }
}