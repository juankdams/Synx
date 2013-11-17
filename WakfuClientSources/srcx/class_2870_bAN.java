public class bAN
  implements aAM
{
  public static final qM by = new cpQ(new ec[] { new dhX("standard", new dou[0]), new dhX("filtré", new dou[] { new dou("Coordonnées de partition quittée {x,y}"), new dou("Coordonnées de partition entrée {x,y}") }) });
  private final String gqG;
  private final String gqH;

  public bAN(cfb paramcfb1, cfb paramcfb2)
  {
    StringBuilder localStringBuilder1 = new StringBuilder("{").append(paramcfb1.getX()).append(",").append(paramcfb1.getY()).append("}");
    StringBuilder localStringBuilder2 = new StringBuilder("{").append(paramcfb2.getX()).append(",").append(paramcfb2.getY()).append("}");
    this.gqG = localStringBuilder1.toString();
    this.gqH = localStringBuilder2.toString();
  }

  public String[] mo() {
    return new String[] { this.gqG, this.gqH };
  }

  public qM aF() {
    return by;
  }

  public int getId() {
    return amb.doi.getId();
  }
}