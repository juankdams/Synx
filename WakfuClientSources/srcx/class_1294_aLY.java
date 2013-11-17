public class aLY
{
  private static final String eqQ = "jna.library.path";
  private final btf[] eqR;

  public aLY(btf[] paramArrayOfbtf)
  {
    this.eqR = paramArrayOfbtf;
  }

  public aLY()
  {
    this(new btf[] { new arm(), new cAV(), new dmQ() });
  }

  public final boolean bdq()
  {
    aHA.debug("discover()", new Object[0]);

    String str1 = System.getProperty("jna.library.path");
    aHA.debug("jnaLibraryPath={}", new Object[] { str1 });

    if (str1 == null)
    {
      for (btf localbtf : this.eqR) {
        aHA.debug("discoveryStrategy={}", new Object[] { localbtf });

        boolean bool = localbtf.bBt();
        aHA.debug("supported={}", new Object[] { Boolean.valueOf(bool) });
        if (bool) {
          String str2 = localbtf.bBu();
          aHA.debug("path={}", new Object[] { str2 });
          if (str2 != null) {
            aHA.info("Discovery found libvlc at '{}'", new Object[] { str2 });

            bMB.an(cha.ciS(), str2);
            return true;
          }
        }
      }
      aHA.warn("Discovery did not find libvlc", new Object[0]);
    }
    else {
      aHA.info("Skipped discovery as system property '{}' already set to '{}'", new Object[] { "jna.library.path", str1 });
    }
    return false;
  }

  static
  {
    aiW.avG();
  }
}