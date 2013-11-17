public class bvp
  implements aAM
{
  public static final qM by = new cpQ(new ec[] { new dhX("standard", new dou[0]), new dhX("filtré", new dou[] { new dou("nom du rang de criminalité (clé de trad)"), new dou("Points de criminalité") }) });
  private final dkI gfl;
  private final int gfm;

  public bvp(dkI paramdkI, int paramInt)
  {
    this.gfl = paramdkI;
    this.gfm = paramInt;
  }

  public String[] mo() {
    return new String[] { this.gfl.agf(), String.valueOf(this.gfm) };
  }

  public qM aF() {
    return by;
  }

  public int getId() {
    return amb.dof.getId();
  }
}