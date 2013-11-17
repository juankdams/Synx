import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;

public final class bWP
  implements dBv
{
  private static final boolean aRN = false;
  public static boolean hjj = false;
  public static boolean hjk = false;
  public static boolean hjl = false;

  private static final Logger K = Logger.getLogger(bWP.class);
  private long hjm = -1L;
  private static final String hjn = "uptime";
  private static final String hjo = "sessions";
  private static final String hjp = "sessions.allSessions.value";
  private static final String hjq = "sessions.allSessions.max";
  private static final String hjr = "sessions.allSessions.maxTime";
  private static final String hjs = "sessions.adminSessions.value";
  private static final String hjt = "sessions.adminSessions.max";
  private static final String hju = "sessions.adminSessions.maxTime";
  private static final String hjv = "instances";
  private static final String hjw = "activeInstances.value";
  private static final String hjx = "activeInstances.max";
  private static final String hjy = "activeInstances.maxTime";
  private static final String hjz = "createdInstances.value";
  private static final String hjA = "players.value";
  private static final String hjB = "players.max";
  private static final String hjC = "players.maxTime";
  private static final String hjD = "npcs.value";
  private static final String hjE = "npcs.max";
  private static final String hjF = "npcs.maxTime";
  private static final String hjG = "resources.value";
  private static final String hjH = "resources.max";
  private static final String hjI = "resources.maxTime";
  private static final String hjJ = "currentFights.value";
  private static final String hjK = "currentFights.max";
  private static final String hjL = "currentFights.maxTime";
  private static final String hjM = "fightsOverTime.overLastHour";
  private static final String hjN = "offlineFleas.value";
  private static final String hjO = "offlineFleas.max";
  private static final String hjP = "offlineFleas.maxTime";
  private static final String hjQ = "skills";
  private static final String hjR = "skills.collects.total";
  private static final String hjS = "skills.plants.failed";
  private static final String hjT = "skills.plants.total";
  private static final String hjU = "skills.plants.succeeded";
  private static final String hjV = "skills.monstersCollects.succeeded";
  private static final String hjW = "skills.monstersCollects.failed";
  private static final String hjX = "skills.monstersCollects.total";
  private static final String hjY = "skills.crafts.succeeded";
  private static final String hjZ = "skills.crafts.failed";
  private static final String hka = "skills.crafts.total";
  private static final String hkb = "skills.enchants.total";
  private static final String hkc = "skills.repairs.total";
  private static final String hkd = "ecozones";
  private static final String hke = "challenges";
  private static final String hkf = "currentChallenge";
  private static final String hkg = "proposed";
  private static final String hkh = "terminatedWithUser";
  private static final String hki = "terminatedWithoutUser";
  private static final String hkj = "win";
  private static final String hkk = "lost";
  private static final String hkl = "exchange";
  private static final String hkm = "exchange.doing.value";
  private static final String hkn = "exchange.doing.max";
  private static final String hko = "exchange.total";
  private static final String hkp = "exchange.cancelled";
  private static final String hkq = "exchange.accepted";
  private static final String hkr = "exchange.kama";
  private static final String hks = "exchange.kamamax";
  private static final String hkt = "environment";
  private static final String hku = "environment.total";
  private static final String hkv = "environment.lastDay";
  private static final String hkw = "environment.lastNight";
  private static final String hkx = "party";
  private static final String hky = "party.number.value";
  private static final String hkz = "party.number.max";
  private static final String hkA = "party.number.maxTime";
  private static final String hkB = "party.total";
  private Map hkC = new HashMap();
  public static final String bMU = "categories";
  public static final String hkD = "isDisplayingInstances";
  public static final String hkE = "isDisplayingChallenges";
  public static final String hkF = "isDisplayingEcozones";
  public static final String[] aOb = { "categories", "isDisplayingInstances", "isDisplayingChallenges", "isDisplayingEcozones" };

  private static final bWP hkG = new bWP();

  private final ArrayList hkH = new ArrayList();
  private final ArrayList hkI = new ArrayList();

  public static bWP cbM() {
    return hkG;
  }

  public bWP() {
    dNt.DEBUG = false;
    cbN();
  }

  public void cbN() {
    this.hkH.clear();
    if (hjk)
      this.hkH.add("challenges.?.currentChallenge");
    if (hjl)
      this.hkH.add("ecozones.?.?.?");
  }

  public void a(ae paramae)
  {
    this.hkI.add(paramae);
  }

  private ArrayList aQ() {
    ArrayList localArrayList = new ArrayList();
    localArrayList.addAll(this.hkH);
    for (ae localae : this.hkI) {
      boolean bool = D(localae.getName(), false);
      if (bool) {
        localArrayList.addAll(localae.aQ());
      }
    }
    return localArrayList;
  }

  public String[] getFields() {
    return aOb;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("categories"))
      return this.hkI;
    if (paramString.equals("isDisplayingInstances"))
      return Boolean.valueOf(hjj);
    if (paramString.equals("isDisplayingChallenges"))
      return Boolean.valueOf(hjk);
    if (paramString.equals("isDisplayingEcozones")) {
      return Boolean.valueOf(hjl);
    }
    return null;
  }

  public void a(String paramString, Object paramObject) {
  }

  public void b(String paramString, Object paramObject) {
  }

  public void c(String paramString, Object paramObject) {
  }

  public boolean l(String paramString) {
    return false;
  }

  protected void As() {
    for (ae localae : this.hkI) {
      localae.update();
    }
    dLE.doY().a(this, aOb);
  }

  public void cbO()
  {
    ae localae1 = new ae("Serveurs", D("Serveurs", false));
    asw localasw1 = new asw("Proxy", (byte)0);
    asw localasw2 = new asw("Connection", (byte)1);
    asw localasw3 = new asw("World", (byte)2);
    localasw3.a(new cxl("Démarré", "uptime.world.started"));
    asw localasw4 = new asw("Game", (byte)3);
    List localList = dAJ.def().deg().ry("uptime.game.?").iD(true);
    for (Object localObject1 = localList.iterator(); ((Iterator)localObject1).hasNext(); ) { localObject2 = (dNt)((Iterator)localObject1).next();
      localasw4.a(new cxl(((dNt)localObject2).getName() + " - démarré", "uptime.game." + ((dNt)localObject2).getName() + ".started"));
      localasw4.a(new cxl(((dNt)localObject2).getName() + " - connecté", "uptime.game." + ((dNt)localObject2).getName() + ".connected"));
    }
    localObject1 = new asw("Global", (byte)6);
    ((asw)localObject1).a(new cxl("Démarré", "uptime.global.started"));
    ((asw)localObject1).a(new cxl("Connecté", "uptime.global.connected"));
    Object localObject2 = new asw("Chat", (byte)4);
    localae1.k("uptime.*");
    localae1.a(localasw1);
    localae1.a(localasw2);
    localae1.a(localasw3);
    localae1.a(localasw4);
    localae1.a((dAD)localObject1);
    localae1.a((dAD)localObject2);

    ae localae2 = new ae("Général", D("Général", true));

    Ek localEk = new Ek("Dernière Maj des stats", Long.valueOf(this.hjm));

    aGT localaGT1 = new aGT("Nombre de joueurs connectés", "sessions.allSessions.value");
    localaGT1.a(new aGT("Max", "sessions.allSessions.max"));
    localaGT1.a(new cxl("Date Max", "sessions.allSessions.maxTime"));

    aGT localaGT2 = new aGT("Nombre d'admins connectés", "sessions.adminSessions.value");
    localaGT2.a(new aGT("Max", "sessions.adminSessions.max"));
    localaGT2.a(new cxl("Date Max", "sessions.adminSessions.maxTime"));

    localae2.a(localEk);
    localae2.a(localaGT1);
    localae2.a(localaGT2);

    localae2.k("sessions.*");

    ae localae3 = new ae("Communauté", D("Communauté", true));

    aGT localaGT3 = new aGT("Nombre de recoltes", "skills.collects.total");
    aGT localaGT4 = new aGT("Nombre de collectes sur monstres", "skills.monstersCollects.total");
    localaGT4.a(new aGT("Réussites", "skills.monstersCollects.succeeded"));
    localaGT4.a(new aGT("Echecs", "skills.monstersCollects.failed"));
    aGT localaGT5 = new aGT("Nombre de plantations", "skills.plants.total");
    localaGT5.a(new aGT("Réussites", "skills.plants.succeeded"));
    localaGT5.a(new aGT("Echecs", "skills.plants.failed"));
    aGT localaGT6 = new aGT("Nombre de crafts", "skills.crafts.total");
    localaGT6.a(new aGT("Réussites", "skills.crafts.succeeded"));
    localaGT6.a(new aGT("Echecs", "skills.crafts.failed"));
    aGT localaGT7 = new aGT("Nombre d'enchantements", "skills.enchants.total");
    aGT localaGT8 = new aGT("Nombre de reparations", "skills.repairs.total");

    aGT localaGT9 = new aGT("Groupes de joueurs", "party.number.value");
    localaGT9.a(new aGT("Total", "party.total"));
    localaGT9.a(new aGT("Max", "party.number.max"));
    localaGT9.a(new cxl("Date Max", "party.number.maxTime"));
    aGT localaGT10 = new aGT("Nombre d'échanges", "exchange.doing.value");
    localaGT10.a(new aGT("Max simultanés", "exchange.doing.max"));
    localaGT10.a(new aGT("Annulés", "exchange.cancelled"));
    localaGT10.a(new aGT("Acceptés", "exchange.accepted"));
    localaGT10.a(new aGT("Total", "exchange.total"));
    aGT localaGT11 = new aGT("Kama total échangés", "exchange.kama", null, "§");
    localaGT11.a(new aGT("Max échangé dans un echange", "exchange.kamamax", null, "§"));

    localae3.a(localaGT3);
    localae3.a(localaGT4);
    localae3.a(localaGT5);
    localae3.a(localaGT6);
    localae3.a(localaGT7);
    localae3.a(localaGT8);
    localae3.a(localaGT9);
    localae3.a(localaGT10);
    localae3.a(localaGT11);
    localae3.k("skills.*");
    localae3.k("exchange.*");
    localae3.k("party.*");

    ae localae4 = new ae("Environnement", D("Environnement", true));
    kt localkt1 = new kt("Nombre de changement jour/nuit", "environment.total", new cNx(this));

    localkt1.a(new cxl("Dernier jour", "environment.lastDay"));
    localkt1.a(new cxl("Dernière nuit", "environment.lastNight"));

    localae4.a(localkt1);
    localae4.k("environment.*");

    this.hkI.clear();
    this.hkI.add(localae1);
    this.hkI.add(localae2);
    this.hkI.add(localae3);
    this.hkI.add(localae4);
    Object localObject3;
    Object localObject4;
    Object localObject5;
    Object localObject6;
    Object localObject7;
    Object localObject8;
    Object localObject9;
    Object localObject11;
    Object localObject12;
    Object localObject13;
    Object localObject14;
    if (hjj)
    {
      localObject3 = new ae("Instances", D("Instances", true));

      localObject4 = new KK(new String[] { "key", "Nb", "Joueurs", "Monstres", "Ressources", "Combats", "Brocantes" });
      localObject5 = dAJ.def().deg().ry("instances.?");
      for (localObject6 = ((cNY)localObject5).iD(true).iterator(); ((Iterator)localObject6).hasNext(); ) { dNt localdNt1 = (dNt)((Iterator)localObject6).next();
        localObject7 = "instances." + localdNt1.getName() + ".";

        localObject8 = new kt("key", null);
        ((kt)localObject8).p(localdNt1.getName());
        try {
          int k = Integer.parseInt(localdNt1.getName());
          localObject10 = null;
          switch (k) {
          case 9:
            localObject10 = "Havre Sac";
            break;
          case 30:
            localObject10 = "Instance de test";
            break;
          case 31:
            localObject10 = "Donjon Larves";
            break;
          case 36:
            localObject10 = "Donjon Bouftous";
            break;
          case 43:
            localObject10 = "Donjon Vampyres";
            break;
          case 57:
            localObject10 = "Donjon Vénéneuse";
            break;
          case 59:
            localObject10 = "Ile de Sevamor";
            break;
          case 61:
            localObject10 = "Ile d'Ohm";
            break;
          case 66:
            localObject10 = "Ile de Mork";
            break;
          case 67:
            localObject10 = "Donjon Moskitos";
            break;
          case 68:
            localObject10 = "Donjon Araknes";
            break;
          case 69:
            localObject10 = "Donjon Abraknydes";
            break;
          case 70:
            localObject10 = "Donjon Tofu";
            break;
          case 71:
            localObject10 = "Donjon Bouftou Celeste";
            break;
          case 74:
            localObject10 = "Donjon Gostofs";
            break;
          case 77:
            localObject10 = "Donjon Vampyro";
            break;
          case 78:
            localObject10 = "Donjon Miss Moche";
            break;
          case 79:
            localObject10 = "Ile d'Emelka";
            break;
          case 82:
            localObject10 = "Sous sol d'Emelka";
            break;
          case 83:
            localObject10 = "Sous sol de Mork";
            break;
          case 10:
          case 11:
          case 12:
          case 13:
          case 14:
          case 15:
          case 16:
          case 17:
          case 18:
          case 19:
          case 20:
          case 21:
          case 22:
          case 23:
          case 24:
          case 25:
          case 26:
          case 27:
          case 28:
          case 29:
          case 32:
          case 33:
          case 34:
          case 35:
          case 37:
          case 38:
          case 39:
          case 40:
          case 41:
          case 42:
          case 44:
          case 45:
          case 46:
          case 47:
          case 48:
          case 49:
          case 50:
          case 51:
          case 52:
          case 53:
          case 54:
          case 55:
          case 56:
          case 58:
          case 60:
          case 62:
          case 63:
          case 64:
          case 65:
          case 72:
          case 73:
          case 75:
          case 76:
          case 80:
          case 81:
          default:
            localObject10 = "???";
          }

          ((kt)localObject8).a(new kt("Nom", null).p(localObject10));
        }
        catch (Exception localException) {
        }
        localObject9 = new kt("Courant", (String)localObject7 + "activeInstances.value");
        ((kt)localObject9).a(new kt("Max", (String)localObject7 + "activeInstances.max"));
        ((kt)localObject9).a(new cxl("Date Max", (String)localObject7 + "activeInstances.maxTime"));
        ((kt)localObject9).a(new kt("Total créées", (String)localObject7 + "createdInstances.value"));

        Object localObject10 = new aGT("Courant", (String)localObject7 + "players.value");
        ((kt)localObject10).a(new aGT("Max", (String)localObject7 + "players.max"));
        ((kt)localObject10).a(new cxl("Date Max", (String)localObject7 + "players.maxTime"));

        localObject11 = new aGT("Courant", (String)localObject7 + "npcs.value");
        ((kt)localObject11).a(new aGT("Max", (String)localObject7 + "npcs.max"));
        ((kt)localObject11).a(new cxl("Date Max", (String)localObject7 + "npcs.maxTime"));

        localObject12 = new aGT("Courant", (String)localObject7 + "resources.value");
        ((kt)localObject12).a(new aGT("Max", (String)localObject7 + "resources.max"));
        ((kt)localObject12).a(new cxl("Date Max", (String)localObject7 + "resources.maxTime"));

        localObject13 = new aGT("Courant", (String)localObject7 + "currentFights.value");
        ((kt)localObject13).a(new aGT("Max", (String)localObject7 + "currentFights.max"));
        ((kt)localObject13).a(new cxl("Date Max", (String)localObject7 + "currentFights.maxTime"));
        ((kt)localObject13).a(new aGT("Derniere heure", (String)localObject7 + "fightsOverTime.overLastHour"));

        localObject14 = new aGT("Courant", (String)localObject7 + "offlineFleas.value");
        ((kt)localObject14).a(new aGT("Max", (String)localObject7 + "offlineFleas.max"));
        ((kt)localObject14).a(new cxl("Date Max", (String)localObject7 + "offlineFleas.maxTime"));

        ((KK)localObject4).a(new kt[] { localObject8, localObject9, localObject10, localObject11, localObject12, localObject13, localObject14 });
      }
      ((ae)localObject3).a((dAD)localObject4);
      ((ae)localObject3).k("instances.*");
      this.hkI.add(localObject3);
    }
    Object localObject16;
    Object localObject17;
    Object localObject18;
    kt localkt4;
    kt localkt5;
    kt localkt6;
    kt localkt7;
    Object localObject19;
    Object localObject20;
    if (hjl)
    {
      localObject3 = dAJ.def().deg().ry("ecozones.?");
      localObject4 = new ArrayList();
      for (localObject5 = ((cNY)localObject3).iD(true).iterator(); ((Iterator)localObject5).hasNext(); ) { localObject6 = (dNt)((Iterator)localObject5).next();
        i = Integer.parseInt(((dNt)localObject6).getName());
        localObject7 = dAJ.def().deg().ry("ecozones." + i + ".?");
        for (localObject8 = ((cNY)localObject7).iD(true).iterator(); ((Iterator)localObject8).hasNext(); ) { localObject9 = (dNt)((Iterator)localObject8).next();
          int m = Integer.parseInt(((dNt)localObject9).getName());

          localObject11 = "Instance " + i + " - Ecozone " + m;

          localObject12 = new ae((String)localObject11, D((String)localObject11, false));
          ((ae)localObject12).k("ecozones." + i + "." + m + ".*");

          localObject13 = dAJ.def().deg().ry("ecozones." + i + "." + m + ".monsters.?");
          kt localkt2;
          if (!((cNY)localObject13).isEmpty()) {
            localObject14 = new KK(new String[] { "breed", "value", "min", "max", "quotaMin", "quotaMax" });
            for (localObject15 = ((cNY)localObject13).iD(true).iterator(); ((Iterator)localObject15).hasNext(); ) { localObject16 = (dNt)((Iterator)localObject15).next();

              localObject17 = "ecozones." + i + "." + m + ".monsters." + ((dNt)localObject16).getName() + ".";

              localObject18 = new kt(((dNt)localObject16).getName(), null);
              int i1 = Short.parseShort(((dNt)localObject16).getName());

              String str = bU.fH().b(38, i1, new Object[0]);
              ((kt)localObject18).p("null (" + i1 + ")");

              localkt2 = new kt(((dNt)localObject16).getName(), (String)localObject17 + "min");
              localkt4 = new kt(((dNt)localObject16).getName(), (String)localObject17 + "max");
              localkt5 = new kt(((dNt)localObject16).getName(), (String)localObject17 + "quotaMin");
              localkt6 = new kt(((dNt)localObject16).getName(), (String)localObject17 + "quotaMax");
              localkt7 = new kt(((dNt)localObject16).getName(), (String)localObject17 + "value", new cNy(this, localkt6, localkt5));

              ((KK)localObject14).a(new kt[] { localObject18, localkt7, localkt2, localkt4, localkt5, localkt6 });
            }
            ((ae)localObject12).a((dAD)localObject14);
          }

          localObject14 = dAJ.def().deg().ry("ecozones." + i + "." + m + ".monsterGroups.?");

          if (!((cNY)localObject14).isEmpty()) {
            localObject15 = new KK(new String[] { "monsterCount/group", "groupCount" });
            for (localObject16 = ((cNY)localObject14).iD(true).iterator(); ((Iterator)localObject16).hasNext(); ) { localObject17 = (dNt)((Iterator)localObject16).next();

              localObject18 = "ecozones." + i + "." + m + ".monsterGroups." + ((dNt)localObject17).getName() + ".";

              localObject19 = new kt(((dNt)localObject17).getName(), null);
              short s = Short.parseShort(((dNt)localObject17).getName());
              ((kt)localObject19).p(Short.valueOf(s));

              localkt2 = new kt(((dNt)localObject17).getName(), (String)localObject18 + "value");

              ((KK)localObject15).a(new kt[] { localObject19, localkt2 });
            }
            ((ae)localObject12).a((dAD)localObject15);
          }

          Object localObject15 = dAJ.def().deg().ry("ecozones." + i + "." + m + ".resources.?");
          if (!((cNY)localObject15).isEmpty()) {
            localObject16 = new KK(new String[] { "resource", "value", "min", "max", "quotaMin", "quotaMax" });
            for (localObject17 = ((cNY)localObject15).iD(true).iterator(); ((Iterator)localObject17).hasNext(); ) { localObject18 = (dNt)((Iterator)localObject17).next();

              localObject19 = "ecozones." + i + "." + m + ".resources." + ((dNt)localObject18).getName() + ".";

              localObject20 = new kt(((dNt)localObject18).getName(), null);
              int i2 = Short.parseShort(((dNt)localObject18).getName());
              ((kt)localObject20).p(bU.fH().b(37, i2, new Object[0]) + " (" + i2 + ")");

              localkt4 = new kt(((dNt)localObject18).getName(), (String)localObject19 + "min");
              localkt5 = new kt(((dNt)localObject18).getName(), (String)localObject19 + "max");
              localkt6 = new kt(((dNt)localObject18).getName(), (String)localObject19 + "quotaMin");
              localkt7 = new kt(((dNt)localObject18).getName(), (String)localObject19 + "quotaMax");
              kt localkt8 = new kt(((dNt)localObject18).getName(), (String)localObject19 + "value", new cNA(this, localkt7, localkt6));

              ((KK)localObject16).a(new kt[] { localObject20, localkt8, localkt4, localkt5, localkt6, localkt7 });
            }
            ((ae)localObject12).a((dAD)localObject16);
          }

          ((ArrayList)localObject4).add(localObject12);
        }
      }
      int i;
      this.hkI.addAll((Collection)localObject4);
    }

    if (hjk)
    {
      localObject3 = "Challenges - zone ";
      localObject4 = dAJ.def().deg().ry("challenges.?");
      localObject5 = new ArrayList();
      for (localObject6 = ((cNY)localObject4).iD(true).iterator(); ((Iterator)localObject6).hasNext(); ) { dNt localdNt2 = (dNt)((Iterator)localObject6).next();
        int j = Integer.parseInt(localdNt2.getName());
        localObject8 = "Challenges - zone " + j / 100;
        localObject9 = new ae((String)localObject8, D((String)localObject8, false));

        dNt localdNt3 = localdNt2.rx("currentChallenge");
        if (localdNt3 != null) {
          localObject11 = new kt("Challenge courant", null);
          localObject12 = aUi.eUP.nW((int)localdNt3.getValue());
          localObject13 = localObject12 != null ? ((ceQ)localObject12).getFieldValue("title").toString() : "???";
          ((kt)localObject11).p(localObject13);
          localObject14 = new kt("Id", null);
          ((kt)localObject14).p(localObject12 != null ? Integer.toString(((ceQ)localObject12).yC()) : "???");
          ((kt)localObject11).a((kt)localObject14);
          ((ae)localObject9).a((dAD)localObject11);
        }

        localObject11 = new KK(new String[] { "Challenge", "Terminé avec joueur", "Terminé sans joueur" });
        localObject12 = localdNt2.ry("?");
        for (localObject13 = ((cNY)localObject12).iD(true).iterator(); ((Iterator)localObject13).hasNext(); ) { localObject14 = (dNt)((Iterator)localObject13).next();
          try {
            int n = Integer.parseInt(((dNt)localObject14).getName());
            localObject16 = aUi.eUP.nW((int)localdNt3.getValue());
            localObject17 = localObject16 != null ? ((ceQ)localObject16).getFieldValue("title").toString() : "???";
            localObject18 = new kt("Challenge", null);
            ((kt)localObject18).p(localObject17);
            localObject19 = new kt("Id", null);
            ((kt)localObject19).p(Integer.valueOf(n));
            ((kt)localObject18).a((kt)localObject19);

            localObject20 = "challenges." + j + "." + n + ".";
            kt localkt3 = new kt("Terminé avec joueur", (String)localObject20 + "terminatedWithUser");
            localkt4 = new kt("# joueurs proposé", (String)localObject20 + "proposed");
            localkt3.a(localkt4);
            localkt5 = new kt("# joueurs ayant gagné", (String)localObject20 + "win");
            localkt3.a(localkt5);
            localkt6 = new kt("# joueurs ayant perdu", (String)localObject20 + "lost");
            localkt3.a(localkt6);

            localkt7 = new kt("Terminé sans joueur", (String)localObject20 + "terminatedWithoutUser");

            ((KK)localObject11).a(new kt[] { localObject18, localkt3, localkt7 });
          }
          catch (NumberFormatException localNumberFormatException)
          {
          } }
        ((ae)localObject9).a((dAD)localObject11);
        ((ae)localObject9).k("challenges." + j + ".*");
        ((ArrayList)localObject5).add(localObject9);
      }
      Collections.sort((List)localObject5, new cND(this));

      this.hkI.addAll((Collection)localObject5);
    }

    As();
  }

  public void clear() {
    this.hkI.clear();
  }

  public long cbP() {
    return this.hjm;
  }

  public void hc(long paramLong) {
    this.hjm = paramLong;
  }

  public boolean D(String paramString, boolean paramBoolean) {
    Boolean localBoolean = (Boolean)this.hkC.get(paramString);
    if (localBoolean == null) {
      localBoolean = Boolean.valueOf(paramBoolean);
      this.hkC.put(paramString, localBoolean);
    }

    return localBoolean.booleanValue();
  }

  public void E(String paramString, boolean paramBoolean) {
    this.hkC.put(paramString, Boolean.valueOf(paramBoolean));
  }

  public void cbQ()
  {
    cyx localcyx = byv.bFN().aJK();
    if (localcyx == null) {
      K.error("Il faut être connecté pour recevoir des messages de statistique.");
      return;
    }

    if ((this.hjm <= 0L) || (D("Serveurs", false))) {
      localcyx.d(new dIm((byte)0, 1));
      localcyx.d(new dIm((byte)2, 1));
      localcyx.d(new dIm((byte)3, 1));
      localcyx.d(new dIm((byte)1, 1));
      localcyx.d(new dIm((byte)4, 1));
      localcyx.d(new dIm((byte)6, 1));
    }

    int i = 900;
    long l = System.currentTimeMillis();

    int j = buO.bCG();
    int k = 0;
    buO localbuO = new buO();
    localbuO.setTimeStamp(l);
    for (String str : aQ())
    {
      byte[] arrayOfByte = dzp.qC(str);
      if (arrayOfByte.length + 4 + j > i)
      {
        k++;
        localcyx.d(localbuO);

        localbuO = new buO();
        localbuO.setTimeStamp(l);
        j = buO.bCG();
      }

      localbuO.ad(arrayOfByte);
      j += arrayOfByte.length + 4;
    }

    if (localbuO.bCH() >= 0)
    {
      k++;
      localcyx.d(localbuO);
    }
  }
}