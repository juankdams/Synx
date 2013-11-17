import org.apache.log4j.Logger;

public enum ckh
{
  private static final Logger K;
  private static final bHa hLi;
  private static final EQ hLj;
  private final short cJY;
  public final String[] hLk;
  public final int[] hLl;

  private ckh(short arg3, String[] arg4)
  {
    short s;
    this.cJY = s;
    String[] arrayOfString;
    this.hLk = arrayOfString;
    this.hLl = byn.t(arrayOfString);
  }

  public static ckh de(short paramShort) {
    ckh localckh = (ckh)hLi.cx(paramShort);
    if (localckh != null) {
      return localckh;
    }

    if (!hLj.contains(paramShort)) {
      K.warn("la position " + paramShort + "ne possede pas de slot et ce n'est pas un equipment connu pour cela");
    }
    return null;
  }

  static
  {
    hKX = new ckh("HEAD", 0, (short)azO.dRx.hV, new String[] { "Chapeau", "CheveuxHaut" });
    hKY = new ckh("HAIR", 1, (short)azO.dRy.hV, new String[] { "Cheveux", "Natte" });
    hKZ = new ckh("FACE", 2, (short)azO.dRz.hV, new String[] { "Barbe" });
    hLa = new ckh("SHOULDERS", 3, (short)azO.dRA.hV, new String[] { "Epaulette-G", "Epaulette-D" });

    hLb = new ckh("CHEST", 4, (short)azO.dRC.hV, new String[] { "CorpsHabit", "Jupe", "CuisseHabit" });

    hLc = new ckh("TROUSERS", 5, (short)azO.dRI.hV, new String[] { "BassinPeau" });
    hLd = new ckh("LEGS", 6, (short)azO.dRJ.hV, new String[] { "JambeHabit", "PiedHabit01", "PiedHabit02", "CuisseHabit" });

    hLe = new ckh("BACK", 7, (short)azO.dRK.hV, new String[] { "Cape", "CapeBas" });

    hLf = new ckh("FIRST_WEAPON", 8, (short)azO.dRM.hV, new String[] { "Arme" });
    hLg = new ckh("SECOND_WEAPON", 9, (short)azO.dRN.hV, new String[] { "Bouclier" });

    hLh = new ckh("ACCESSORY", 10, (short)azO.dRO.hV, new String[] { "Accessoire", "Accessoire-0", "Accessoire-1", "Accessoire-2" });

    hLm = new ckh[] { hKX, hKY, hKZ, hLa, hLb, hLc, hLd, hLe, hLf, hLg, hLh };

    K = Logger.getLogger(ckh.class);
    hLi = new bHa();

    for (ckh localckh : values()) {
      if ((!bB) && (hLi.contains(localckh.cJY))) throw new AssertionError();
      hLi.b(localckh.cJY, localckh);
    }

    hLj = new EQ();

    hLj.add(azO.dRF.hV);
    hLj.add(azO.dRE.hV);
    hLj.add(azO.dRU.hV);
    hLj.add(azO.dRT.hV);
    hLj.add(azO.dRH.hV);
    hLj.add(azO.dRB.hV);
  }
}