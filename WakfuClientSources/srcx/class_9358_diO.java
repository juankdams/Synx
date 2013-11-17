import java.util.Date;

public class diO
  implements eo
{
  private String cuv;
  private int leX;
  private int leY;
  private Date leZ;
  private String iwV;
  private boolean lfa;

  public diO()
  {
  }

  public diO(String paramString1, int paramInt1, int paramInt2, Date paramDate, String paramString2, boolean paramBoolean)
  {
    this.cuv = paramString1;
    this.leX = paramInt1;
    this.leY = paramInt2;
    this.leZ = paramDate;
    this.iwV = paramString2;
    this.lfa = paramBoolean;
  }

  public String aSq() {
    return this.cuv;
  }

  public int cRD() {
    return this.leX;
  }

  public int cRE() {
    return this.leY;
  }

  public Date cRF() {
    return this.leZ;
  }

  public String getNote() {
    return this.iwV;
  }

  public boolean isBound() {
    return this.lfa;
  }

  public boolean a(bwV parambwV) {
    parambwV.ght = this.cuv;
    parambwV.ghu = this.leX;
    parambwV.ghv = this.leY;
    parambwV.ghw = this.leZ.getTime();
    parambwV.note = this.iwV;
    parambwV.ghx = this.lfa;
    return true;
  }

  public boolean b(bwV parambwV) {
    this.cuv = parambwV.ght;
    this.leX = parambwV.ghu;
    this.leY = parambwV.ghv;
    this.leZ = new Date(parambwV.ghw);
    this.iwV = parambwV.note;
    this.lfa = parambwV.ghx;
    return true;
  }
}