import java.net.MalformedURLException;
import java.net.URL;
import java.util.Locale;
import org.apache.log4j.Logger;

public class ay extends cOH
{
  private static final float cz = 100.0F;
  private static final Logger K = Logger.getLogger(ay.class);
  public static final String cA = "config.properties";
  public static final String cB = "ANMEquipmentPath";
  public static final String cC = "ANMResourcePath";
  public static final String cD = "playerGfxPath";
  public static final String cE = "npcGfxPath";
  public static final String cF = "petGfxPath";
  public static final String cG = "gfxConfigFile";
  public static final String cH = "ANMInteractiveElementPath";
  public static final String cI = "ANMDynamicElementPath";
  public static final String cJ = "ANMIndexFile";
  public static final String cK = "ANMGUIPath";
  public static final String cL = "i18nPath";
  public static final String cM = "dialogsPath";
  public static final String cN = "useXmlTheme";
  public static final String cO = "useCompiledLua";
  public static final String cP = "langIconsPath";
  public static final String cQ = "worldPositionMarkerApsPath";
  public static final String cR = "mapsPoiPath";
  public static final String cS = "newPoiPath";
  public static final String cT = "zaapPoiPath";
  public static final String cU = "dragoPoiPath";
  public static final String cV = "cannonPoiPath";
  public static final String cW = "boatPoiPath";
  public static final String cX = "mapsTplgCoord";
  public static final String cY = "mapsGfxCoord";
  public static final String cZ = "mapsGfxPath";
  public static final String da = "mapsLightPath";
  public static final String db = "mapsTopologyPath";
  public static final String dc = "mapsEnvironmentPath";
  public static final String dd = "mapsAmbienceDataPath";
  public static final String de = "worldInfoFile";
  public static final String df = "ambienceBankFile";
  public static final String dg = "graphicalAmbienceFile";
  public static final String dh = "graphicalAmbienceEffectFile";
  public static final String di = "gfxPath";
  public static final String dj = "playListBankFile";
  public static final String dk = "soundSourceFlavor";
  public static final String dl = "useLuaAudio";
  public static final String dm = "soundPakIndexExtension";
  public static final String dn = "particlesAudioFile";
  public static final String jdField_do = "animatedElementsAudioFile";
  public static final String dp = "dynamicSoundAmbianceFile";
  public static final String dq = "sfxSoundPath";
  public static final String dr = "amb2DPath";
  public static final String ds = "amb3DPath";
  public static final String dt = "musicPath";
  public static final String du = "voicesPath";
  public static final String dv = "fightSoundPath";
  public static final String dw = "guiSoundPath";
  public static final String dx = "foleysSoundPath";
  public static final String dy = "particlesSoundPath";
  public static final String dz = "shadersPath";
  public static final String dA = "videosPath";
  public static final String dB = "highLightGfxPath";
  public static final String dC = "particlePath";
  public static final String dD = "scriptPath";
  public static final String dE = "scriptFunctionLibraryFile";
  public static final String dF = "defaultIconPath";
  public static final String dG = "spellsIconsPath";
  public static final String dH = "groupDifficultyIconsPath";
  public static final String dI = "ecosystemDifficultyIconsPath";
  public static final String dJ = "ecosystemProtectedIconPath";
  public static final String dK = "osamodasMonsterIconPath";
  public static final String dL = "groupDifficultyChallengeIconPath";
  public static final String dM = "frescoPath";
  public static final String dN = "itemsIconsPath";
  public static final String dO = "elementsIconsPath";
  public static final String dP = "elementsSmallIconsPath";
  public static final String dQ = "targetEffectIconsPath";
  public static final String dR = "areasIconsPath";
  public static final String dS = "areasBigIconsPath";
  public static final String dT = "statesIconsPath";
  public static final String dU = "timePointBonusIconsPath";
  public static final String dV = "effectAreasIconsPath";
  public static final String dW = "breedSmallBackgroundsPath";
  public static final String dX = "breedBigBackgroundsPath";
  public static final String dY = "breedIconPath";
  public static final String dZ = "popupIconPath";
  public static final String ea = "breedSmallIconPath";
  public static final String eb = "breedContactListIllustrationPath";
  public static final String ec = "breedIllustrationPath";
  public static final String ed = "breedPortraitIllustrationPath";
  public static final String ee = "breedCharacterChoiceIllustrationPath";
  public static final String ef = "monsterIllustrationPath";
  public static final String eg = "defaultMonsterIllustrationPath";
  public static final String eh = "defaultSmallMonsterIllustrationPath";
  public static final String ei = "shortcutBackgroundPath";
  public static final String ej = "skillsIconsPath";
  public static final String ek = "challengeCategoryIconsPath";
  public static final String el = "challengeUserTypeIconsPath";
  public static final String em = "challengeResultQualityIconsPath";
  public static final String en = "compassIconsPath";
  public static final String eo = "guildBlazonBackgroundPartPath";
  public static final String ep = "guildBlazonForegroundPartPath";
  public static final String eq = "guildRankIconsPath";
  public static final String er = "aptitudeIconsPath";
  public static final String es = "dimensionalBagPrimaryGemPath";
  public static final String et = "dimensionalBagSecondaryGemPath";
  public static final String eu = "calendarEventPath";
  public static final String ev = "lootTypeIconsPath";
  public static final String ew = "weatherIconsPath";
  public static final String ex = "windForceIconsPath";
  public static final String ey = "protectorBuffsIconsPath";
  public static final String ez = "nationFlagIconsPath";
  public static final String eA = "nationSelectionIconsPath";
  public static final String eB = "challengeFlyingImagePath";
  public static final String eC = "lawFlyingImagePath";
  public static final String eD = "craftPassportIconsPath";
  public static final String eE = "passportStampIconsPath";
  public static final String eF = "emoteIconsPath";
  public static final String eG = "breedEmoteIconsPath";
  public static final String eH = "emotePath";
  public static final String eI = "monstersFamily";
  public static final String eJ = "achievementCategoryPath";
  public static final String eK = "achievementPath";
  public static final String eL = "titlePath";
  public static final String eM = "currencyIconUrl";
  public static final String eN = "backgroundDisplayPath";
  public static final String eO = "backgroundDisplayBackgroundPath";
  public static final String eP = "interactiveDialogPortraitPath";
  public static final String eQ = "temperatureInfluenceIconUrl";
  public static final String eR = "protectorSecretIconUrl";
  public static final String eS = "effectDescPlotIconUrl";
  public static final String eT = "giftTypeIconPath";
  public static final String eU = "zaapTypeIconPath";
  public static final String eV = "governmentRankIconPath";
  public static final String eW = "itemTypeIconPath";
  public static final String eX = "messageBoxIconsPath";
  public static final String eY = "guildStorageTypeIconsPath";
  public static final String eZ = "antiAddictionIconsPath";
  public static final String fa = "hwBuidingIconGreenPath";
  public static final String fb = "hwBuidingIconOrangePath";
  public static final String fc = "hwBuidingIconRedPath";
  public static final String fd = "textIconsPath";
  public static final String fe = "activateMapParticles";
  public static final String ff = "appSkinPath";
  public static final String fg = "themeDirectory";
  public static final String fh = "themeFile";
  public static final String fi = "shortcutsFile";
  public static final String fj = "tutorialFile";
  public static final String fk = "dayLightFile";
  public static final String fl = "defaultShortcutsFile";
  public static final String fm = "defaultChatFile";
  public static final String fn = "defaultDayLightFile";
  public static final String fo = "soundBankFile";
  public static final String fp = "reverbPresetFile";
  public static final String fq = "rollOffPresetFile";
  public static final String fr = "lowPassPresetFile";
  public static final String fs = "barksFile";
  public static final String ft = "groundsFile";
  public static final String fu = "elementsFile";
  public static final String fv = "groupsFile";
  public static final String fw = "buildingFile";
  public static final String fx = "buildingImagePath";
  public static final String fy = "buildingImageOffsetFile";
  public static final String fz = "buildingMiniImagePath";
  public static final String fA = "partitionPatchFile";
  public static final String fB = "patchImagePath";
  public static final String fC = "patchImageOffsetFile";
  public static final String fD = "patchMiniImagePath";
  public static final String fE = "mapScrollDecoratorPath";
  public static final String fF = "fullSubMapPath";
  public static final String fG = "fullMapPath";
  public static final String fH = "completeMapPath";
  public static final String fI = "completeMapCoordsPath";
  public static final String fJ = "miniMapPointFile";
  public static final String fK = "miniMapPointBigFile";
  public static final String fL = "compassPointFile";
  public static final String fM = "pointsOfInterestIconPath";
  public static final String fN = "pointsOfInterestDefaultSmallIconPath";
  public static final String fO = "pointsOfInterestProtectorIconPath";
  public static final String fP = "pointsOfInterestProtectorinChaosIconPath";
  public static final String fQ = "partyMemberPoiPath";
  public static final String fR = "highLightGfxDefaultFile";
  public static final String fS = "contentStaticDataStorageDirectory";
  public static final String fT = "binaryDataFile";
  public static final String fU = "merchantDisplayIconPath";
  public static final String fV = "soundDevice";
  public static final String fW = "soundEnable";
  public static final String fX = "soundAmbianceEnable";
  public static final String fY = "amb2DMix";
  public static final String fZ = "amb3DMix";
  public static final String ga = "guiMix";
  public static final String gb = "musicMix";
  public static final String gc = "sfxMix";
  public static final String gd = "fightsMix";
  public static final String ge = "voicesMix";
  public static final String gf = "foleysMix";
  public static final String gg = "particlesMix";
  private static final String gh = "dynamicSpellMixFadeOut";
  private static final String gi = "dynamicSpellMix";
  public static final String gj = "connectionRetryCount";
  public static final String gk = "connectionRetryDelay";
  public static final String gl = "lastProxyGroupIndex";
  public static final String gm = "proxyGroup";
  public static final String gn = "proxyAddresses";
  public static final String go = "proxyCommunity";
  public static final String gp = "magicKey";
  public static final String gq = "bugReportActivate";
  public static final String gr = "bugReportPath";
  public static final String gs = "rssURL";
  public static final String gt = "loginNewsURL";
  public static final String gu = "loginNewsCacheDirectory";
  private static final String gv = "http://www.google.fr";
  private static final String gw = "./cache/news/";
  public static final String gx = "screenShotPath";
  public static final String gy = "autoLogin";
  public static final String gz = "autoLogin_login";
  public static final String gA = "autoLogin_password";
  public static final String gB = "autoLogin_proxyGroup";
  public static final String gC = "autoLogin_selectCharacter";
  public static final String gD = "climateBonusIconsPath";
  public static final String gE = "bannerAnmFilePath";
  public static final String gF = "fightBannerAnmFilePath";
  public static final String gG = "compassTypePath";
  public static final String gH = "dialogChoiceTypePath";
  public static final String gI = "rewardTypeIconsPath";
  public static final String gJ = "almanachCacheDirectory";
  public static final String gK = "webShopCacheDirectory";
  public static final String gL = "cacheTagDataFile";
  public static final String gM = "language.force";
  public static final String gN = "shopActivated";
  public static final String gO = "krosmozSOAPUrl";
  public static final String gP = "gameAuthentificationSOAPUrl";
  public static final String gQ = "gameAccountSOAPUrl";
  public static final String gR = "gameShopSOAPUrl";
  public static final String gS = "krosmoz.gameUrl.";
  public static final String gT = "krosmoz.gameResolution.";
  public static final String gU = "krosmoz.figureIconsPath";
  public static final String gV = "tutorialIconsPath";
  public static final String gW = "enableAsianCharacters";
  public static final String gX = "nationLawsIconsPath";
  public static final String gY = "cameraMinZoom";
  public static final String gZ = "cameraMaxZoom";
  public static final String ha = "resolution.min.width";
  public static final String hb = "resolution.min.height";
  public static final String hc = "enableRandomCharacterName";
  public static final String hd = "activateStuffPreview";
  private static final ay he = new ay();
  public static final String hf = ".xps";
  private final bcm hg = new bcm();

  public static ay bd()
  {
    return he;
  }

  public String be()
  {
    return getString("dialogsPath", "");
  }

  public boolean bf()
  {
    return load("");
  }

  public boolean load(String paramString)
  {
    K.info(String.format("Chargement de la configuration depuis le fichier : '%s'", new Object[] { paramString }));
    return super.load((paramString == null) || (paramString.length() == 0) ? "config.properties" : paramString);
  }

  public float bg() {
    return Math.min(1.0F, Math.max(0.0F, getFloat("foleysMix", 100.0F) / 100.0F));
  }

  public float bh() {
    return Math.min(1.0F, Math.max(0.0F, getFloat("particlesMix", 100.0F) / 100.0F));
  }

  public float bi() {
    return Math.min(1.0F, Math.max(0.0F, getFloat("sfxMix", 100.0F) / 100.0F));
  }

  public float bj() {
    return Math.min(1.0F, Math.max(0.0F, getFloat("amb2DMix", 100.0F) / 100.0F));
  }

  public float bk() {
    return Math.min(1.0F, Math.max(0.0F, getFloat("amb3DMix", 100.0F) / 100.0F));
  }

  public float bl() {
    return Math.min(1.0F, Math.max(0.0F, getFloat("fightsMix", 100.0F) / 100.0F));
  }

  public float bm() {
    return Math.min(1.0F, Math.max(0.0F, getFloat("guiMix", 100.0F) / 100.0F));
  }

  public float bn() {
    return Math.min(1.0F, Math.max(0.0F, getFloat("musicMix", 100.0F) / 100.0F));
  }

  public float bo() {
    return Math.min(1.0F, Math.max(0.0F, getFloat("voicesMix", 100.0F) / 100.0F));
  }

  public float bp() {
    return getFloat("dynamicSpellMixFadeOut", 1.0F);
  }

  public float bq() {
    return Math.min(1.0F, Math.max(0.0F, getFloat("dynamicSpellMix", 100.0F) / 100.0F));
  }

  public String s(int paramInt)
  {
    try
    {
      return getString("particlePath") + paramInt + ".xps";
    } catch (bdh localbdh) {
      K.warn(localbdh);
    }
    return null;
  }

  public String a(String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    try
    {
      String str = String.format(getString(paramString1), paramArrayOfObject);
      if ((str != null) && (bAy.jy(str))) {
        return str;
      }

      if (!this.hg.contains(str)) {
        K.warn("Impossible de trouver l'icone d'URL " + str);
        this.hg.add(str);
      }

      if (paramString2 != null) {
        return getString(paramString2, null);
      }
      return null;
    } catch (bdh localbdh) {
      K.warn(localbdh.getMessage());
    }return null;
  }

  public String t(int paramInt)
  {
    return a("monsterIllustrationPath", "defaultMonsterIllustrationPath", new Object[] { Integer.valueOf(paramInt) });
  }

  public String u(int paramInt) {
    return a("itemsIconsPath", "defaultIconPath", new Object[] { Integer.valueOf(paramInt) });
  }

  public String v(int paramInt) {
    return a("itemsIconsPath", "defaultIconPath", new Object[] { Integer.valueOf(paramInt) });
  }

  public String w(int paramInt) {
    return a("spellsIconsPath", "defaultIconPath", new Object[] { Integer.valueOf(paramInt) });
  }

  public String x(int paramInt) {
    return a("spellsIconsPath", "defaultIconPath", new Object[] { Integer.valueOf(paramInt) });
  }

  public String y(int paramInt) {
    return a("skillsIconsPath", "defaultIconPath", new Object[] { "c" + paramInt });
  }

  public String z(int paramInt) {
    return y(paramInt);
  }

  public String A(int paramInt) {
    return a("skillsIconsPath", "defaultIconPath", new Object[] { Integer.valueOf(paramInt) });
  }

  public String B(int paramInt) {
    return a("aptitudeIconsPath", "defaultIconPath", new Object[] { Integer.valueOf(paramInt) });
  }

  public String b(byte paramByte) {
    return a("calendarEventPath", "defaultIconPath", new Object[] { Byte.valueOf(paramByte) });
  }

  public String C(int paramInt) {
    return a("nationFlagIconsPath", "defaultIconPath", new Object[] { Integer.valueOf(paramInt) });
  }

  public String D(int paramInt) {
    return a("nationSelectionIconsPath", "defaultIconPath", new Object[] { Integer.valueOf(paramInt) });
  }

  public String E(int paramInt) {
    return a("dialogChoiceTypePath", "defaultIconPath", new Object[] { Integer.valueOf(paramInt) });
  }

  public String F(int paramInt) {
    return a("emoteIconsPath", null, new Object[] { Integer.valueOf(paramInt) });
  }

  public String G(int paramInt) {
    return a("breedEmoteIconsPath", null, new Object[] { Integer.valueOf(paramInt) });
  }

  public String H(int paramInt) {
    return a("emotePath", null, new Object[] { Integer.valueOf(paramInt) });
  }

  public String m(String paramString) {
    return a("achievementCategoryPath", null, new Object[] { paramString });
  }

  public String I(int paramInt) {
    return a("achievementCategoryPath", null, new Object[] { Integer.valueOf(paramInt) });
  }

  public String J(int paramInt) {
    return a("achievementPath", null, new Object[] { Integer.valueOf(paramInt) });
  }

  public String K(int paramInt) {
    return a("titlePath", null, new Object[0]);
  }

  public String L(int paramInt) {
    return a("backgroundDisplayPath", null, new Object[] { Integer.valueOf(paramInt) });
  }

  public String M(int paramInt) {
    return a("backgroundDisplayBackgroundPath", null, new Object[] { Integer.valueOf(paramInt) });
  }

  public String n(String paramString) {
    return a("interactiveDialogPortraitPath", null, new Object[] { paramString });
  }

  public String o(String paramString) {
    return a("tutorialIconsPath", null, new Object[] { paramString });
  }

  public String f(long paramLong) {
    return a("nationLawsIconsPath", null, new Object[] { Long.valueOf(paramLong) });
  }

  public String b(short paramShort) {
    return a("itemTypeIconPath", null, new Object[] { Short.valueOf(paramShort) });
  }

  public URL br()
  {
    String str1;
    try {
      str1 = getString("loginNewsURL");
    } catch (bdh localbdh) {
      str1 = "http://www.google.fr";
    }
    if (str1 == null) {
      return null;
    }
    String str2 = bU.fH().ajJ().cAZ().getLanguage().toLowerCase();
    String str3 = String.format(str1, new Object[] { str2 });
    try {
      return new URL(str3);
    } catch (MalformedURLException localMalformedURLException) {
      K.error("While get loginNewsUrl", localMalformedURLException);
    }return null;
  }

  public String bs()
  {
    String str;
    try {
      str = getString("loginNewsCacheDirectory");
    } catch (bdh localbdh) {
      str = "./cache/news/";
    }
    return str;
  }

  public boolean bt() {
    return getBoolean("emailMode", false);
  }
}