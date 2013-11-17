import com.ankamagames.baseImpl.client.proxyclient.base.console.command.HelpCommand;
import com.ankamagames.baseImpl.client.proxyclient.base.console.command.NavigateToParentCommandSetCommand;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class cth extends caL
{
  private static final String icN = ";";
  private static final String dDS = "/";
  private static final String icO = "!";
  private static final String icP = ">";
  private static final Pattern icQ = Pattern.compile("^((/(\\w+))+/){1}|^(((\\w+)/)+){1}|^(/\\w+){1}");

  private static final aZi icR = new aZi("[.]{2}", null, new NavigateToParentCommandSetCommand(), false);
  private static final aZi icS = new aZi("/\\?", null, new HelpCommand(), false);

  private static final cth icT = new cth();
  private coq icU;
  private coq icV;
  private dnc icW = null;
  private List icX;
  private boolean icY = true;

  private boolean icZ = true;

  private byte ida = 127;

  public cth()
  {
    this.icU = new coq();
    this.icU.b(icR);
    this.icU.b(icS);

    this.icV = new coq();

    this.icX = new ArrayList();
  }

  public static cth cqP()
  {
    return icT;
  }

  public void a(dnc paramdnc)
  {
    this.icW = paramdnc;
  }

  public boolean cqQ()
  {
    return this.icY;
  }

  public void hv(boolean paramBoolean)
  {
    this.icY = paramBoolean;
  }

  public boolean cqR()
  {
    return this.icZ;
  }

  public void hw(boolean paramBoolean)
  {
    this.icZ = paramBoolean;
  }

  public byte cqS()
  {
    return this.ida;
  }

  public void dT(byte paramByte)
  {
    this.ida = paramByte;
  }

  public void a(awz paramawz)
  {
    this.icX.add(paramawz);
  }

  public boolean b(awz paramawz)
  {
    if (this.icX.contains(paramawz)) {
      this.icX.remove(paramawz);
      return true;
    }
    return false;
  }

  public coq cqT()
  {
    return this.icU;
  }

  public void cqU()
  {
    if ((this.icV != null) && (this.icV.cou() != null))
      b(this.icV.cou());
  }

  public void b(coq paramcoq)
  {
    String str;
    if ((paramcoq != null) && (paramcoq != this.icV)) {
      this.icV = paramcoq;
      str = getPrompt();
      for (awz localawz : this.icX)
        localawz.setPrompt(str);
    }
  }

  public boolean f(URL paramURL)
  {
    if (this.icV != null) {
      coq localcoq = this.icV.cov();
      if (localcoq != null) {
        return localcoq.f(paramURL);
      }
    }
    return false;
  }

  public coq cqV()
  {
    return this.icV;
  }

  public String getPrompt()
  {
    if (this.icV != null) {
      return this.icV.getPath() + ">";
    }
    return "";
  }

  public void mb(String paramString)
  {
    J(paramString, true);
  }

  public void J(String paramString, boolean paramBoolean)
  {
    if (paramBoolean) {
      kP(paramString);
    }

    String[] arrayOfString1 = null;
    if (cqQ())
      arrayOfString1 = paramString.split(";");
    else {
      arrayOfString1 = new String[] { paramString };
    }

    for (String str1 : arrayOfString1)
    {
      str1 = str1.trim();

      coq localcoq = null;
      if ((cqR()) && (str1.startsWith("!"))) {
        str1 = str1.substring(1);
        localcoq = this.icV;
      }
      Object localObject2;
      Object localObject4;
      Object localObject3;
      if (cqR()) {
        localObject1 = icQ.matcher(str1);
        if (((Matcher)localObject1).find())
        {
          localObject2 = ((Matcher)localObject1).group();

          boolean bool = ((String)localObject2).startsWith("/");

          if (bool) {
            localObject4 = ((String)localObject2).substring(1).split("/");
            localObject3 = this.icV.cov();
          } else {
            localObject4 = ((String)localObject2).split("/");
            localObject3 = this.icV;
          }

          if ((localObject4.length == 1) && (!((String)localObject2).endsWith("/"))) {
            str1 = str1.substring(1);
          }
          else {
            for (String str2 : localObject4) {
              ArrayList localArrayList2 = ((coq)localObject3).f(str2, this.ida);
              if (localArrayList2.isEmpty()) {
                err("Chemin " + str2 + " invalide");
                break;
              }if (localArrayList2.size() == 1) {
                aeF localaeF2 = (aeF)localArrayList2.get(0);
                if ((localaeF2 instanceof coq)) {
                  localObject3 = (coq)localArrayList2.get(0);
                } else {
                  err("Chemin " + str2 + " invalide");
                  break;
                }
              } else {
                err("Trop de possibilités");
                break;
              }

            }

            str1 = str1.substring(((String)localObject2).length());
          }

          b((coq)localObject3);
        }

      }

      Object localObject1 = new ArrayList();
      ((ArrayList)localObject1).addAll(this.icV.f(str1, this.ida));
      ((ArrayList)localObject1).addAll(this.icU.f(str1, this.ida));

      if (((ArrayList)localObject1).isEmpty()) {
        if (this.icW != null) {
          localObject2 = new ArrayList();
          ((ArrayList)localObject2).add(str1);
          this.icW.a(this, null, (ArrayList)localObject2);
        }
        else {
          err("Commande '" + str1 + "' invalide");
        }
      }
      else {
        for (localObject2 = ((ArrayList)localObject1).iterator(); ((Iterator)localObject2).hasNext(); ) { aeF localaeF1 = (aeF)((Iterator)localObject2).next();

          localObject3 = localaeF1.aqp();

          localObject4 = localaeF1.aqn();
          ??? = ((Pattern)localObject4).matcher(str1);
          if (((Matcher)???).matches())
          {
            ((Matcher)???).reset();
            ArrayList localArrayList1 = new ArrayList();
            while (((Matcher)???).find()) {
              for (??? = 0; ??? <= ((Matcher)???).groupCount(); ???++) {
                localArrayList1.add(((Matcher)???).group(???));
              }
            }

            try
            {
              ((dnc)localObject3).a(this, localaeF1, localArrayList1);
            } catch (Exception localException) {
              err("Exception dans l'exécution de la commande à la ligne : " + str1);
              localException.printStackTrace();
            }
          }
          else if (((Pattern)localObject4).pattern().length() != 0) {
            err("Les paramètres de commande ne correspondent pas !");
          }

          if (!((dnc)localObject3).X())
          {
            break;
          }

        }

      }

      if (localcoq != null)
        b(localcoq);
    }
  }

  public void log(String paramString)
  {
    for (awz localawz : this.icX)
      localawz.log(paramString);
  }

  public void trace(String paramString)
  {
    for (awz localawz : this.icX)
      localawz.trace(paramString);
  }

  public void s(String paramString, int paramInt)
  {
    for (awz localawz : this.icX)
      localawz.s(paramString, paramInt);
  }

  public void err(String paramString)
  {
    for (awz localawz : this.icX)
      localawz.err(paramString);
  }
}