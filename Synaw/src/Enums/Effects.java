package Enums;

public enum Effects {

	;

	// v prit dans dkF (de la version 1.28.2-101720)
	public static final int dFN = -1;
	public static final int lhN = 1000;//"Utilisation de PA (à ne pas utiliser normalement)"
	public static final int lhO = 1001;//Perte de PdV
	public static final int lhP = 1002;//Soin/Gain de Pdv
	public static final int lhQ = 1003;
	public static final int lhR = 1004;//Deboost/Perte/Vol de PM
	public static final int lhS = 1005;//"Boost de PM", "Gain de PM (attention :gain != boost", "Gain des PM utilisés pour le sort déclencheur"
	public static final int lhT = 1006;
	public static final int lhU = 1007;//Deboost/Perte/Vol de PA
	public static final int lhV = 1008;//Boost/Gain/Don de PA  "Don de PA (debuff pour le caster, Buff pour l'autre)", "Vol de PA (gain pour le caster, Debuff pour l'autre)"
	public static final int lhW = 1009;
	public static final int lhX = 1010;
	public static final int lhY = 1011;//"Augmente la Portée"
	public static final int lhZ = 1012;//"Vol de WP", "Diminue la Portée"
	public static final int lia = 1013;//"Don de PdV"
	public static final int lib = 1014;//"Armure : absorbe une certaine quantité de dégats définie puis se retire", "Armure : absorbe une quantité de dégats fixe ou élémentaire"
	public static final int lic = 1015;//"Applique un Etat", "Seduire un monstre", "Applique un Tag (déclenché par la mort)"
	public static final int lid = 1016;
	public static final int lie = 1017;
	public static final int lif = 1018;
	public static final int lig = 1029;
	public static final int lih = 1031;
	public static final int lii = 1032;//"Gain de WP"
	public static final int lij = 1033;
	public static final int lik = 1035;//"Perte de WP"

}
