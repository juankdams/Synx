import com.ankamagames.framework.graphics.engine.Anm2.Anm;
import java.util.ArrayList;
import java.util.Arrays;
import org.apache.log4j.Logger;

public class dCf extends bXI
{
  public static final String[] lKz = new String[0];
  private final String ki;
  private final String[] gCT;
  private final int dmf;
  private Anm lKA;

  public dCf(doA paramdoA, String paramString, int paramInt, String[] paramArrayOfString)
  {
    super((dpI)paramdoA.bkc());
    this.ki = paramString;
    this.dmf = paramInt;
    this.gCT = L(paramArrayOfString);
  }

  public dCf(dpI paramdpI, String paramString, int paramInt, String[] paramArrayOfString)
  {
    super(paramdpI);
    this.ki = paramString;
    this.dmf = paramInt;
    this.gCT = L(paramArrayOfString);
  }

  private String[] L(String[] paramArrayOfString)
  {
    if (paramArrayOfString == null) {
      return lKz;
    }
    int i = paramArrayOfString.length;
    ArrayList localArrayList = new ArrayList(i);
    for (int j = 0; j < i; j++) {
      for (String str : diq.ph(paramArrayOfString[j])) {
        if (!localArrayList.contains(str)) {
          localArrayList.add(str);
        }
      }
    }
    return (String[])localArrayList.toArray(new String[localArrayList.size()]);
  }

  private dCf(dCf paramdCf) {
    super(paramdCf.cwt);
    this.ki = paramdCf.ki;
    this.dmf = paramdCf.dmf;
    this.gCT = paramdCf.gCT;
  }

  public void a(cew paramcew)
  {
    b(paramcew, true);
  }

  public void b(dCb paramdCb, boolean paramBoolean) {
    try {
      int i = this.ki.indexOf('/');
      String str1 = i == -1 ? null : this.ki.substring(0, i);
      String str2 = i == -1 ? this.ki : this.ki.substring(i + 1);
      String str3 = bAF.y(str1, Integer.parseInt(str2));
      if (str3 == null) {
        dud.ch().error("dossier inconnu ( +" + str1 + ") pour le chargement de l'anm " + str2 + " [valeurs autorisées: equipment/, npc/, player/]");
        return;
      }
      this.lKA = ahm.eo(str3);
      if (paramBoolean) {
        if ((paramdCb instanceof cew))
          ((cew)paramdCb).cbD().aek();
      }
      else paramdCb.a(this.lKA, this.gCT); 
    }
    catch (bdh localbdh)
    {
      dud.ch().error("", localbdh);
    }
  }

  public boolean a(bXI parambXI)
  {
    if (!super.a(parambXI)) {
      return false;
    }
    if ((!bB) && (!(parambXI instanceof dCf))) throw new AssertionError();
    dCf localdCf = (dCf)parambXI;
    return (this.ki == null ? localdCf.ki == null : localdCf.ki.equals(this.ki)) && (Arrays.equals(this.gCT, localdCf.gCT));
  }

  public dCf deW()
  {
    return new dCf(this);
  }
}