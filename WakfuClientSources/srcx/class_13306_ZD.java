import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

public class ZD extends cIX
  implements azn
{
  private eu cLj;
  private boolean cLk;
  private static ArrayList aAG = new ArrayList();

  public static eu dU(String paramString)
  {
    if (paramString.equalsIgnoreCase("hp"))
      return eu.ayM;
    if ((paramString.equalsIgnoreCase("trap")) || (paramString.equalsIgnoreCase("nbtrap")) || (paramString.equalsIgnoreCase("maxtrap")) || (paramString.equalsIgnoreCase("contrôle")) || (paramString.equalsIgnoreCase("control")))
    {
      return eu.ayV;
    }if ((paramString.equalsIgnoreCase("mp")) || (paramString.equalsIgnoreCase("pm")))
      return eu.ayO;
    if ((paramString.equalsIgnoreCase("wp")) || (paramString.equalsIgnoreCase("pw")))
      return eu.ayP;
    if ((paramString.equalsIgnoreCase("ap")) || (paramString.equalsIgnoreCase("pa")))
      return eu.ayN;
    if ((paramString.equalsIgnoreCase("summons")) || (paramString.equalsIgnoreCase("nbsummons")) || (paramString.equalsIgnoreCase("commandement")) || (paramString.equalsIgnoreCase("leadership")))
      return eu.ayV;
    if ((paramString.equalsIgnoreCase("for")) || (paramString.equalsIgnoreCase("strength")) || (paramString.equalsIgnoreCase("force")))
      return eu.azu;
    if (paramString.equalsIgnoreCase("agi"))
      return eu.azt;
    if (paramString.equalsIgnoreCase("int"))
      return eu.azv;
    if (paramString.equalsIgnoreCase("chan"))
      return eu.azs;
    if (paramString.equalsIgnoreCase("sag"))
      return eu.azr;
    if (paramString.equalsIgnoreCase("dmg_earth"))
      return eu.azf;
    if (paramString.equalsIgnoreCase("dmg_air"))
      return eu.azg;
    if (paramString.equalsIgnoreCase("dmg_fire"))
      return eu.azd;
    if (paramString.equalsIgnoreCase("dmg_water"))
      return eu.aze;
    if (paramString.equalsIgnoreCase("res_earth"))
      return eu.azm;
    if (paramString.equalsIgnoreCase("res_air"))
      return eu.azn;
    if (paramString.equalsIgnoreCase("res_fire"))
      return eu.azk;
    if (paramString.equalsIgnoreCase("res_water"))
      return eu.azl;
    if (paramString.equalsIgnoreCase("res_stasis"))
      return eu.aAi;
    if ((paramString.equalsIgnoreCase("sag")) && 
      (paramString.equalsIgnoreCase("vit")))
      return eu.azw;
    if (paramString.equalsIgnoreCase("init"))
      return eu.azq;
    if (paramString.equalsIgnoreCase("prosp"))
      return eu.azp;
    if (paramString.equalsIgnoreCase("chrage"))
      return eu.azE;
    if (paramString.equalsIgnoreCase("dmg_in_percent"))
      return eu.azc;
    if (paramString.equalsIgnoreCase("plate"))
      return eu.azS;
    if (paramString.equalsIgnoreCase("mechanics"))
      return eu.ayV;
    if (paramString.equalsIgnoreCase("virtual_hp"))
      return eu.aAj;
    if ((paramString.equalsIgnoreCase("osa_invocation_knowledge")) || (paramString.equalsIgnoreCase("invocation_knowledge")) || (paramString.equalsIgnoreCase("ik")) || (paramString.equalsIgnoreCase("InvocationKnowledge")))
    {
      return eu.aAn;
    }
    try
    {
      return eu.valueOf(paramString.toUpperCase());
    } catch (IllegalArgumentException localIllegalArgumentException) {
      K.error("GetCharacteristic criteria with invalid parameter : " + paramString + " : unknown characteristic");
    }return null;
  }

  public eu akK()
  {
    return this.cLj;
  }

  protected List kM()
  {
    return aAG;
  }

  public boolean pH() {
    return true;
  }

  public ZD(ArrayList paramArrayList) {
    int i = (short)J(paramArrayList);
    if (i == 0)
      this.cLj = dU(((cic)paramArrayList.get(0)).getValue());
    if (i == 1) {
      this.cLj = dU(((cic)paramArrayList.get(0)).getValue());
      if (((cic)paramArrayList.get(1)).getValue().equalsIgnoreCase("target"))
        this.cLk = true;
      else
        this.cLk = false;
    }
  }

  public long b(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    long l = 0L;
    Object localObject1 = this.cLk ? paramObject2 : paramObject1;
    Object localObject2;
    if (!(localObject1 instanceof axQ)) {
      if ((this.cLk) && ((paramObject2 instanceof cYk)) && ((paramObject4 instanceof dbE))) {
        localObject2 = (dbE)paramObject4;
        cYk localcYk = (cYk)paramObject2;
        for (dle localdle : ((dbE)localObject2).k(localcYk)) {
          if (localdle.b(this.cLj)) {
            localObject1 = localdle;
            break;
          }
        }
      }
      else
      {
        return -1L;
      }
    }

    if ((localObject1 instanceof axQ)) {
      localObject2 = (axQ)localObject1;
      if (!((axQ)localObject2).b(this.cLj))
        return -1L;
      l = ((axQ)localObject2).e(this.cLj);
      return super.cDu() * l;
    }
    return -1L;
  }

  public Enum gm()
  {
    return Bz.bxz;
  }

  public boolean akL() {
    return this.cLk;
  }

  static
  {
    Pq[] arrayOfPq = new Pq[1];
    arrayOfPq[0] = Pq.chu;
    aAG.add(arrayOfPq);
    arrayOfPq = new Pq[2];
    arrayOfPq[0] = Pq.chu;
    arrayOfPq[1] = Pq.chu;
    aAG.add(arrayOfPq);
  }
}