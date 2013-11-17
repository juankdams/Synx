package macroscipting.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import macroscipting.services.MacroGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMacroParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'false'", "'=='", "'!='", "'EMOTE'", "'DIRECTION'", "'MOVEMENT'", "'GOTO'", "'CHAT'", "'EFFET'", "'VAR'", "'IF'", "'TO_MAP'", "'TO_TARGET'", "'TO_SUBZONE'", "'TO_ZONE'", "'TO_SUPERZONE'", "'TO_ALL'", "'class'", "'{'", "'}'", "'extends'", "'onLoad'", "'filePath'", "'='", "';'", "'fileName'", "'characterID'", "'scope'", "'compatMicro'", "'bloc #'", "'dir'", "':'", "'('", "')'", "'true'", "'WAIT'", "'LOCK'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=5;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalMacroParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMacroParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMacroParser.tokenNames; }
    public String getGrammarFileName() { return "../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g"; }


     
     	private MacroGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MacroGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleDomain"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:60:1: entryRuleDomain : ruleDomain EOF ;
    public final void entryRuleDomain() throws RecognitionException {
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:61:1: ( ruleDomain EOF )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:62:1: ruleDomain EOF
            {
             before(grammarAccess.getDomainRule()); 
            pushFollow(FOLLOW_ruleDomain_in_entryRuleDomain61);
            ruleDomain();

            state._fsp--;

             after(grammarAccess.getDomainRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomain68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDomain"


    // $ANTLR start "ruleDomain"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:69:1: ruleDomain : ( ( rule__Domain__Group__0 ) ) ;
    public final void ruleDomain() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:73:2: ( ( ( rule__Domain__Group__0 ) ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:74:1: ( ( rule__Domain__Group__0 ) )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:74:1: ( ( rule__Domain__Group__0 ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:75:1: ( rule__Domain__Group__0 )
            {
             before(grammarAccess.getDomainAccess().getGroup()); 
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:76:1: ( rule__Domain__Group__0 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:76:2: rule__Domain__Group__0
            {
            pushFollow(FOLLOW_rule__Domain__Group__0_in_ruleDomain94);
            rule__Domain__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDomainAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDomain"


    // $ANTLR start "entryRuleClass"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:88:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:89:1: ( ruleClass EOF )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:90:1: ruleClass EOF
            {
             before(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_ruleClass_in_entryRuleClass121);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getClassRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:97:1: ruleClass : ( ( rule__Class__Group__0 ) ) ;
    public final void ruleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:101:2: ( ( ( rule__Class__Group__0 ) ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:102:1: ( ( rule__Class__Group__0 ) )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:102:1: ( ( rule__Class__Group__0 ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:103:1: ( rule__Class__Group__0 )
            {
             before(grammarAccess.getClassAccess().getGroup()); 
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:104:1: ( rule__Class__Group__0 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:104:2: rule__Class__Group__0
            {
            pushFollow(FOLLOW_rule__Class__Group__0_in_ruleClass154);
            rule__Class__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleonLoadBloc"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:116:1: entryRuleonLoadBloc : ruleonLoadBloc EOF ;
    public final void entryRuleonLoadBloc() throws RecognitionException {
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:117:1: ( ruleonLoadBloc EOF )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:118:1: ruleonLoadBloc EOF
            {
             before(grammarAccess.getOnLoadBlocRule()); 
            pushFollow(FOLLOW_ruleonLoadBloc_in_entryRuleonLoadBloc181);
            ruleonLoadBloc();

            state._fsp--;

             after(grammarAccess.getOnLoadBlocRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleonLoadBloc188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleonLoadBloc"


    // $ANTLR start "ruleonLoadBloc"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:125:1: ruleonLoadBloc : ( ( rule__OnLoadBloc__Group__0 ) ) ;
    public final void ruleonLoadBloc() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:129:2: ( ( ( rule__OnLoadBloc__Group__0 ) ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:130:1: ( ( rule__OnLoadBloc__Group__0 ) )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:130:1: ( ( rule__OnLoadBloc__Group__0 ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:131:1: ( rule__OnLoadBloc__Group__0 )
            {
             before(grammarAccess.getOnLoadBlocAccess().getGroup()); 
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:132:1: ( rule__OnLoadBloc__Group__0 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:132:2: rule__OnLoadBloc__Group__0
            {
            pushFollow(FOLLOW_rule__OnLoadBloc__Group__0_in_ruleonLoadBloc214);
            rule__OnLoadBloc__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOnLoadBlocAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleonLoadBloc"


    // $ANTLR start "entryRuleBloc"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:144:1: entryRuleBloc : ruleBloc EOF ;
    public final void entryRuleBloc() throws RecognitionException {
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:145:1: ( ruleBloc EOF )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:146:1: ruleBloc EOF
            {
             before(grammarAccess.getBlocRule()); 
            pushFollow(FOLLOW_ruleBloc_in_entryRuleBloc241);
            ruleBloc();

            state._fsp--;

             after(grammarAccess.getBlocRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBloc248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBloc"


    // $ANTLR start "ruleBloc"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:153:1: ruleBloc : ( ( rule__Bloc__Group__0 ) ) ;
    public final void ruleBloc() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:157:2: ( ( ( rule__Bloc__Group__0 ) ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:158:1: ( ( rule__Bloc__Group__0 ) )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:158:1: ( ( rule__Bloc__Group__0 ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:159:1: ( rule__Bloc__Group__0 )
            {
             before(grammarAccess.getBlocAccess().getGroup()); 
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:160:1: ( rule__Bloc__Group__0 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:160:2: rule__Bloc__Group__0
            {
            pushFollow(FOLLOW_rule__Bloc__Group__0_in_ruleBloc274);
            rule__Bloc__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBlocAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBloc"


    // $ANTLR start "entryRuleDirective"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:172:1: entryRuleDirective : ruleDirective EOF ;
    public final void entryRuleDirective() throws RecognitionException {
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:173:1: ( ruleDirective EOF )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:174:1: ruleDirective EOF
            {
             before(grammarAccess.getDirectiveRule()); 
            pushFollow(FOLLOW_ruleDirective_in_entryRuleDirective301);
            ruleDirective();

            state._fsp--;

             after(grammarAccess.getDirectiveRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDirective308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDirective"


    // $ANTLR start "ruleDirective"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:181:1: ruleDirective : ( ( rule__Directive__Group__0 ) ) ;
    public final void ruleDirective() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:185:2: ( ( ( rule__Directive__Group__0 ) ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:186:1: ( ( rule__Directive__Group__0 ) )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:186:1: ( ( rule__Directive__Group__0 ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:187:1: ( rule__Directive__Group__0 )
            {
             before(grammarAccess.getDirectiveAccess().getGroup()); 
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:188:1: ( rule__Directive__Group__0 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:188:2: rule__Directive__Group__0
            {
            pushFollow(FOLLOW_rule__Directive__Group__0_in_ruleDirective334);
            rule__Directive__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDirectiveAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDirective"


    // $ANTLR start "entryRuleconditionnalDirective"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:200:1: entryRuleconditionnalDirective : ruleconditionnalDirective EOF ;
    public final void entryRuleconditionnalDirective() throws RecognitionException {
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:201:1: ( ruleconditionnalDirective EOF )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:202:1: ruleconditionnalDirective EOF
            {
             before(grammarAccess.getConditionnalDirectiveRule()); 
            pushFollow(FOLLOW_ruleconditionnalDirective_in_entryRuleconditionnalDirective361);
            ruleconditionnalDirective();

            state._fsp--;

             after(grammarAccess.getConditionnalDirectiveRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleconditionnalDirective368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleconditionnalDirective"


    // $ANTLR start "ruleconditionnalDirective"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:209:1: ruleconditionnalDirective : ( ( rule__ConditionnalDirective__Alternatives ) ) ;
    public final void ruleconditionnalDirective() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:213:2: ( ( ( rule__ConditionnalDirective__Alternatives ) ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:214:1: ( ( rule__ConditionnalDirective__Alternatives ) )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:214:1: ( ( rule__ConditionnalDirective__Alternatives ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:215:1: ( rule__ConditionnalDirective__Alternatives )
            {
             before(grammarAccess.getConditionnalDirectiveAccess().getAlternatives()); 
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:216:1: ( rule__ConditionnalDirective__Alternatives )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:216:2: rule__ConditionnalDirective__Alternatives
            {
            pushFollow(FOLLOW_rule__ConditionnalDirective__Alternatives_in_ruleconditionnalDirective394);
            rule__ConditionnalDirective__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConditionnalDirectiveAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleconditionnalDirective"


    // $ANTLR start "entryRulestrDirective"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:228:1: entryRulestrDirective : rulestrDirective EOF ;
    public final void entryRulestrDirective() throws RecognitionException {
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:229:1: ( rulestrDirective EOF )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:230:1: rulestrDirective EOF
            {
             before(grammarAccess.getStrDirectiveRule()); 
            pushFollow(FOLLOW_rulestrDirective_in_entryRulestrDirective421);
            rulestrDirective();

            state._fsp--;

             after(grammarAccess.getStrDirectiveRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulestrDirective428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulestrDirective"


    // $ANTLR start "rulestrDirective"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:237:1: rulestrDirective : ( ( rule__StrDirective__Group__0 ) ) ;
    public final void rulestrDirective() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:241:2: ( ( ( rule__StrDirective__Group__0 ) ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:242:1: ( ( rule__StrDirective__Group__0 ) )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:242:1: ( ( rule__StrDirective__Group__0 ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:243:1: ( rule__StrDirective__Group__0 )
            {
             before(grammarAccess.getStrDirectiveAccess().getGroup()); 
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:244:1: ( rule__StrDirective__Group__0 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:244:2: rule__StrDirective__Group__0
            {
            pushFollow(FOLLOW_rule__StrDirective__Group__0_in_rulestrDirective454);
            rule__StrDirective__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStrDirectiveAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulestrDirective"


    // $ANTLR start "entryRuleintDirective"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:256:1: entryRuleintDirective : ruleintDirective EOF ;
    public final void entryRuleintDirective() throws RecognitionException {
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:257:1: ( ruleintDirective EOF )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:258:1: ruleintDirective EOF
            {
             before(grammarAccess.getIntDirectiveRule()); 
            pushFollow(FOLLOW_ruleintDirective_in_entryRuleintDirective481);
            ruleintDirective();

            state._fsp--;

             after(grammarAccess.getIntDirectiveRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleintDirective488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleintDirective"


    // $ANTLR start "ruleintDirective"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:265:1: ruleintDirective : ( ( rule__IntDirective__Group__0 ) ) ;
    public final void ruleintDirective() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:269:2: ( ( ( rule__IntDirective__Group__0 ) ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:270:1: ( ( rule__IntDirective__Group__0 ) )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:270:1: ( ( rule__IntDirective__Group__0 ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:271:1: ( rule__IntDirective__Group__0 )
            {
             before(grammarAccess.getIntDirectiveAccess().getGroup()); 
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:272:1: ( rule__IntDirective__Group__0 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:272:2: rule__IntDirective__Group__0
            {
            pushFollow(FOLLOW_rule__IntDirective__Group__0_in_ruleintDirective514);
            rule__IntDirective__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntDirectiveAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleintDirective"


    // $ANTLR start "entryRulevarDirective"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:284:1: entryRulevarDirective : rulevarDirective EOF ;
    public final void entryRulevarDirective() throws RecognitionException {
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:285:1: ( rulevarDirective EOF )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:286:1: rulevarDirective EOF
            {
             before(grammarAccess.getVarDirectiveRule()); 
            pushFollow(FOLLOW_rulevarDirective_in_entryRulevarDirective541);
            rulevarDirective();

            state._fsp--;

             after(grammarAccess.getVarDirectiveRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulevarDirective548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulevarDirective"


    // $ANTLR start "rulevarDirective"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:293:1: rulevarDirective : ( ( rule__VarDirective__Group__0 ) ) ;
    public final void rulevarDirective() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:297:2: ( ( ( rule__VarDirective__Group__0 ) ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:298:1: ( ( rule__VarDirective__Group__0 ) )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:298:1: ( ( rule__VarDirective__Group__0 ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:299:1: ( rule__VarDirective__Group__0 )
            {
             before(grammarAccess.getVarDirectiveAccess().getGroup()); 
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:300:1: ( rule__VarDirective__Group__0 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:300:2: rule__VarDirective__Group__0
            {
            pushFollow(FOLLOW_rule__VarDirective__Group__0_in_rulevarDirective574);
            rule__VarDirective__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVarDirectiveAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulevarDirective"


    // $ANTLR start "entryRuleifDirective"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:312:1: entryRuleifDirective : ruleifDirective EOF ;
    public final void entryRuleifDirective() throws RecognitionException {
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:313:1: ( ruleifDirective EOF )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:314:1: ruleifDirective EOF
            {
             before(grammarAccess.getIfDirectiveRule()); 
            pushFollow(FOLLOW_ruleifDirective_in_entryRuleifDirective601);
            ruleifDirective();

            state._fsp--;

             after(grammarAccess.getIfDirectiveRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleifDirective608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleifDirective"


    // $ANTLR start "ruleifDirective"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:321:1: ruleifDirective : ( ( rule__IfDirective__Group__0 ) ) ;
    public final void ruleifDirective() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:325:2: ( ( ( rule__IfDirective__Group__0 ) ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:326:1: ( ( rule__IfDirective__Group__0 ) )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:326:1: ( ( rule__IfDirective__Group__0 ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:327:1: ( rule__IfDirective__Group__0 )
            {
             before(grammarAccess.getIfDirectiveAccess().getGroup()); 
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:328:1: ( rule__IfDirective__Group__0 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:328:2: rule__IfDirective__Group__0
            {
            pushFollow(FOLLOW_rule__IfDirective__Group__0_in_ruleifDirective634);
            rule__IfDirective__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIfDirectiveAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleifDirective"


    // $ANTLR start "entryRulewaitDirective"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:340:1: entryRulewaitDirective : rulewaitDirective EOF ;
    public final void entryRulewaitDirective() throws RecognitionException {
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:341:1: ( rulewaitDirective EOF )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:342:1: rulewaitDirective EOF
            {
             before(grammarAccess.getWaitDirectiveRule()); 
            pushFollow(FOLLOW_rulewaitDirective_in_entryRulewaitDirective661);
            rulewaitDirective();

            state._fsp--;

             after(grammarAccess.getWaitDirectiveRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulewaitDirective668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulewaitDirective"


    // $ANTLR start "rulewaitDirective"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:349:1: rulewaitDirective : ( ( rule__WaitDirective__Group__0 ) ) ;
    public final void rulewaitDirective() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:353:2: ( ( ( rule__WaitDirective__Group__0 ) ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:354:1: ( ( rule__WaitDirective__Group__0 ) )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:354:1: ( ( rule__WaitDirective__Group__0 ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:355:1: ( rule__WaitDirective__Group__0 )
            {
             before(grammarAccess.getWaitDirectiveAccess().getGroup()); 
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:356:1: ( rule__WaitDirective__Group__0 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:356:2: rule__WaitDirective__Group__0
            {
            pushFollow(FOLLOW_rule__WaitDirective__Group__0_in_rulewaitDirective694);
            rule__WaitDirective__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWaitDirectiveAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulewaitDirective"


    // $ANTLR start "entryRulelockDirective"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:368:1: entryRulelockDirective : rulelockDirective EOF ;
    public final void entryRulelockDirective() throws RecognitionException {
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:369:1: ( rulelockDirective EOF )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:370:1: rulelockDirective EOF
            {
             before(grammarAccess.getLockDirectiveRule()); 
            pushFollow(FOLLOW_rulelockDirective_in_entryRulelockDirective721);
            rulelockDirective();

            state._fsp--;

             after(grammarAccess.getLockDirectiveRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulelockDirective728); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulelockDirective"


    // $ANTLR start "rulelockDirective"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:377:1: rulelockDirective : ( ( rule__LockDirective__Group__0 ) ) ;
    public final void rulelockDirective() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:381:2: ( ( ( rule__LockDirective__Group__0 ) ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:382:1: ( ( rule__LockDirective__Group__0 ) )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:382:1: ( ( rule__LockDirective__Group__0 ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:383:1: ( rule__LockDirective__Group__0 )
            {
             before(grammarAccess.getLockDirectiveAccess().getGroup()); 
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:384:1: ( rule__LockDirective__Group__0 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:384:2: rule__LockDirective__Group__0
            {
            pushFollow(FOLLOW_rule__LockDirective__Group__0_in_rulelockDirective754);
            rule__LockDirective__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLockDirectiveAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulelockDirective"


    // $ANTLR start "entryRuleoperator"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:396:1: entryRuleoperator : ruleoperator EOF ;
    public final void entryRuleoperator() throws RecognitionException {
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:397:1: ( ruleoperator EOF )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:398:1: ruleoperator EOF
            {
             before(grammarAccess.getOperatorRule()); 
            pushFollow(FOLLOW_ruleoperator_in_entryRuleoperator781);
            ruleoperator();

            state._fsp--;

             after(grammarAccess.getOperatorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleoperator788); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleoperator"


    // $ANTLR start "ruleoperator"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:405:1: ruleoperator : ( ( rule__Operator__Alternatives ) ) ;
    public final void ruleoperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:409:2: ( ( ( rule__Operator__Alternatives ) ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:410:1: ( ( rule__Operator__Alternatives ) )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:410:1: ( ( rule__Operator__Alternatives ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:411:1: ( rule__Operator__Alternatives )
            {
             before(grammarAccess.getOperatorAccess().getAlternatives()); 
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:412:1: ( rule__Operator__Alternatives )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:412:2: rule__Operator__Alternatives
            {
            pushFollow(FOLLOW_rule__Operator__Alternatives_in_ruleoperator814);
            rule__Operator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleoperator"


    // $ANTLR start "entryRuleIntegerDirective"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:424:1: entryRuleIntegerDirective : ruleIntegerDirective EOF ;
    public final void entryRuleIntegerDirective() throws RecognitionException {
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:425:1: ( ruleIntegerDirective EOF )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:426:1: ruleIntegerDirective EOF
            {
             before(grammarAccess.getIntegerDirectiveRule()); 
            pushFollow(FOLLOW_ruleIntegerDirective_in_entryRuleIntegerDirective841);
            ruleIntegerDirective();

            state._fsp--;

             after(grammarAccess.getIntegerDirectiveRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerDirective848); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntegerDirective"


    // $ANTLR start "ruleIntegerDirective"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:433:1: ruleIntegerDirective : ( ( rule__IntegerDirective__Alternatives ) ) ;
    public final void ruleIntegerDirective() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:437:2: ( ( ( rule__IntegerDirective__Alternatives ) ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:438:1: ( ( rule__IntegerDirective__Alternatives ) )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:438:1: ( ( rule__IntegerDirective__Alternatives ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:439:1: ( rule__IntegerDirective__Alternatives )
            {
             before(grammarAccess.getIntegerDirectiveAccess().getAlternatives()); 
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:440:1: ( rule__IntegerDirective__Alternatives )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:440:2: rule__IntegerDirective__Alternatives
            {
            pushFollow(FOLLOW_rule__IntegerDirective__Alternatives_in_ruleIntegerDirective874);
            rule__IntegerDirective__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getIntegerDirectiveAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntegerDirective"


    // $ANTLR start "entryRuleStringDirective"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:452:1: entryRuleStringDirective : ruleStringDirective EOF ;
    public final void entryRuleStringDirective() throws RecognitionException {
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:453:1: ( ruleStringDirective EOF )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:454:1: ruleStringDirective EOF
            {
             before(grammarAccess.getStringDirectiveRule()); 
            pushFollow(FOLLOW_ruleStringDirective_in_entryRuleStringDirective901);
            ruleStringDirective();

            state._fsp--;

             after(grammarAccess.getStringDirectiveRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringDirective908); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringDirective"


    // $ANTLR start "ruleStringDirective"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:461:1: ruleStringDirective : ( ( rule__StringDirective__Alternatives ) ) ;
    public final void ruleStringDirective() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:465:2: ( ( ( rule__StringDirective__Alternatives ) ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:466:1: ( ( rule__StringDirective__Alternatives ) )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:466:1: ( ( rule__StringDirective__Alternatives ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:467:1: ( rule__StringDirective__Alternatives )
            {
             before(grammarAccess.getStringDirectiveAccess().getAlternatives()); 
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:468:1: ( rule__StringDirective__Alternatives )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:468:2: rule__StringDirective__Alternatives
            {
            pushFollow(FOLLOW_rule__StringDirective__Alternatives_in_ruleStringDirective934);
            rule__StringDirective__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStringDirectiveAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringDirective"


    // $ANTLR start "entryRuleScopeType"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:480:1: entryRuleScopeType : ruleScopeType EOF ;
    public final void entryRuleScopeType() throws RecognitionException {
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:481:1: ( ruleScopeType EOF )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:482:1: ruleScopeType EOF
            {
             before(grammarAccess.getScopeTypeRule()); 
            pushFollow(FOLLOW_ruleScopeType_in_entryRuleScopeType961);
            ruleScopeType();

            state._fsp--;

             after(grammarAccess.getScopeTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScopeType968); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleScopeType"


    // $ANTLR start "ruleScopeType"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:489:1: ruleScopeType : ( ( rule__ScopeType__Alternatives ) ) ;
    public final void ruleScopeType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:493:2: ( ( ( rule__ScopeType__Alternatives ) ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:494:1: ( ( rule__ScopeType__Alternatives ) )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:494:1: ( ( rule__ScopeType__Alternatives ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:495:1: ( rule__ScopeType__Alternatives )
            {
             before(grammarAccess.getScopeTypeAccess().getAlternatives()); 
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:496:1: ( rule__ScopeType__Alternatives )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:496:2: rule__ScopeType__Alternatives
            {
            pushFollow(FOLLOW_rule__ScopeType__Alternatives_in_ruleScopeType994);
            rule__ScopeType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getScopeTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScopeType"


    // $ANTLR start "rule__OnLoadBloc__Alternatives_20"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:508:1: rule__OnLoadBloc__Alternatives_20 : ( ( ( rule__OnLoadBloc__CompactMicroAssignment_20_0 ) ) | ( 'false' ) );
    public final void rule__OnLoadBloc__Alternatives_20() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:512:1: ( ( ( rule__OnLoadBloc__CompactMicroAssignment_20_0 ) ) | ( 'false' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==45) ) {
                alt1=1;
            }
            else if ( (LA1_0==11) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:513:1: ( ( rule__OnLoadBloc__CompactMicroAssignment_20_0 ) )
                    {
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:513:1: ( ( rule__OnLoadBloc__CompactMicroAssignment_20_0 ) )
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:514:1: ( rule__OnLoadBloc__CompactMicroAssignment_20_0 )
                    {
                     before(grammarAccess.getOnLoadBlocAccess().getCompactMicroAssignment_20_0()); 
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:515:1: ( rule__OnLoadBloc__CompactMicroAssignment_20_0 )
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:515:2: rule__OnLoadBloc__CompactMicroAssignment_20_0
                    {
                    pushFollow(FOLLOW_rule__OnLoadBloc__CompactMicroAssignment_20_0_in_rule__OnLoadBloc__Alternatives_201030);
                    rule__OnLoadBloc__CompactMicroAssignment_20_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOnLoadBlocAccess().getCompactMicroAssignment_20_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:519:6: ( 'false' )
                    {
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:519:6: ( 'false' )
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:520:1: 'false'
                    {
                     before(grammarAccess.getOnLoadBlocAccess().getFalseKeyword_20_1()); 
                    match(input,11,FOLLOW_11_in_rule__OnLoadBloc__Alternatives_201049); 
                     after(grammarAccess.getOnLoadBlocAccess().getFalseKeyword_20_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnLoadBloc__Alternatives_20"


    // $ANTLR start "rule__Directive__Alternatives_1"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:532:1: rule__Directive__Alternatives_1 : ( ( ruleintDirective ) | ( rulestrDirective ) | ( rulevarDirective ) | ( ruleconditionnalDirective ) );
    public final void rule__Directive__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:536:1: ( ( ruleintDirective ) | ( rulestrDirective ) | ( rulevarDirective ) | ( ruleconditionnalDirective ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 14:
            case 15:
            case 16:
            case 17:
                {
                alt2=1;
                }
                break;
            case 18:
            case 19:
                {
                alt2=2;
                }
                break;
            case 20:
                {
                int LA2_3 = input.LA(2);

                if ( (LA2_3==42) ) {
                    int LA2_6 = input.LA(3);

                    if ( (LA2_6==RULE_ID) ) {
                        alt2=3;
                    }
                    else if ( (LA2_6==RULE_STRING) ) {
                        alt2=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 6, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 3, input);

                    throw nvae;
                }
                }
                break;
            case 21:
                {
                int LA2_4 = input.LA(2);

                if ( (LA2_4==43) ) {
                    alt2=4;
                }
                else if ( (LA2_4==42) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 4, input);

                    throw nvae;
                }
                }
                break;
            case 46:
            case 47:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:537:1: ( ruleintDirective )
                    {
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:537:1: ( ruleintDirective )
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:538:1: ruleintDirective
                    {
                     before(grammarAccess.getDirectiveAccess().getIntDirectiveParserRuleCall_1_0()); 
                    pushFollow(FOLLOW_ruleintDirective_in_rule__Directive__Alternatives_11083);
                    ruleintDirective();

                    state._fsp--;

                     after(grammarAccess.getDirectiveAccess().getIntDirectiveParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:543:6: ( rulestrDirective )
                    {
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:543:6: ( rulestrDirective )
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:544:1: rulestrDirective
                    {
                     before(grammarAccess.getDirectiveAccess().getStrDirectiveParserRuleCall_1_1()); 
                    pushFollow(FOLLOW_rulestrDirective_in_rule__Directive__Alternatives_11100);
                    rulestrDirective();

                    state._fsp--;

                     after(grammarAccess.getDirectiveAccess().getStrDirectiveParserRuleCall_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:549:6: ( rulevarDirective )
                    {
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:549:6: ( rulevarDirective )
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:550:1: rulevarDirective
                    {
                     before(grammarAccess.getDirectiveAccess().getVarDirectiveParserRuleCall_1_2()); 
                    pushFollow(FOLLOW_rulevarDirective_in_rule__Directive__Alternatives_11117);
                    rulevarDirective();

                    state._fsp--;

                     after(grammarAccess.getDirectiveAccess().getVarDirectiveParserRuleCall_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:555:6: ( ruleconditionnalDirective )
                    {
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:555:6: ( ruleconditionnalDirective )
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:556:1: ruleconditionnalDirective
                    {
                     before(grammarAccess.getDirectiveAccess().getConditionnalDirectiveParserRuleCall_1_3()); 
                    pushFollow(FOLLOW_ruleconditionnalDirective_in_rule__Directive__Alternatives_11134);
                    ruleconditionnalDirective();

                    state._fsp--;

                     after(grammarAccess.getDirectiveAccess().getConditionnalDirectiveParserRuleCall_1_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Directive__Alternatives_1"


    // $ANTLR start "rule__ConditionnalDirective__Alternatives"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:566:1: rule__ConditionnalDirective__Alternatives : ( ( ruleifDirective ) | ( rulewaitDirective ) | ( rulelockDirective ) );
    public final void rule__ConditionnalDirective__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:570:1: ( ( ruleifDirective ) | ( rulewaitDirective ) | ( rulelockDirective ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt3=1;
                }
                break;
            case 46:
                {
                alt3=2;
                }
                break;
            case 47:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:571:1: ( ruleifDirective )
                    {
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:571:1: ( ruleifDirective )
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:572:1: ruleifDirective
                    {
                     before(grammarAccess.getConditionnalDirectiveAccess().getIfDirectiveParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleifDirective_in_rule__ConditionnalDirective__Alternatives1166);
                    ruleifDirective();

                    state._fsp--;

                     after(grammarAccess.getConditionnalDirectiveAccess().getIfDirectiveParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:577:6: ( rulewaitDirective )
                    {
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:577:6: ( rulewaitDirective )
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:578:1: rulewaitDirective
                    {
                     before(grammarAccess.getConditionnalDirectiveAccess().getWaitDirectiveParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulewaitDirective_in_rule__ConditionnalDirective__Alternatives1183);
                    rulewaitDirective();

                    state._fsp--;

                     after(grammarAccess.getConditionnalDirectiveAccess().getWaitDirectiveParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:583:6: ( rulelockDirective )
                    {
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:583:6: ( rulelockDirective )
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:584:1: rulelockDirective
                    {
                     before(grammarAccess.getConditionnalDirectiveAccess().getLockDirectiveParserRuleCall_2()); 
                    pushFollow(FOLLOW_rulelockDirective_in_rule__ConditionnalDirective__Alternatives1200);
                    rulelockDirective();

                    state._fsp--;

                     after(grammarAccess.getConditionnalDirectiveAccess().getLockDirectiveParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionnalDirective__Alternatives"


    // $ANTLR start "rule__Operator__Alternatives"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:594:1: rule__Operator__Alternatives : ( ( '==' ) | ( '!=' ) );
    public final void rule__Operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:598:1: ( ( '==' ) | ( '!=' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            else if ( (LA4_0==13) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:599:1: ( '==' )
                    {
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:599:1: ( '==' )
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:600:1: '=='
                    {
                     before(grammarAccess.getOperatorAccess().getEqualsSignEqualsSignKeyword_0()); 
                    match(input,12,FOLLOW_12_in_rule__Operator__Alternatives1233); 
                     after(grammarAccess.getOperatorAccess().getEqualsSignEqualsSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:607:6: ( '!=' )
                    {
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:607:6: ( '!=' )
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:608:1: '!='
                    {
                     before(grammarAccess.getOperatorAccess().getExclamationMarkEqualsSignKeyword_1()); 
                    match(input,13,FOLLOW_13_in_rule__Operator__Alternatives1253); 
                     after(grammarAccess.getOperatorAccess().getExclamationMarkEqualsSignKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Alternatives"


    // $ANTLR start "rule__IntegerDirective__Alternatives"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:620:1: rule__IntegerDirective__Alternatives : ( ( 'EMOTE' ) | ( 'DIRECTION' ) | ( 'MOVEMENT' ) | ( 'GOTO' ) );
    public final void rule__IntegerDirective__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:624:1: ( ( 'EMOTE' ) | ( 'DIRECTION' ) | ( 'MOVEMENT' ) | ( 'GOTO' ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt5=1;
                }
                break;
            case 15:
                {
                alt5=2;
                }
                break;
            case 16:
                {
                alt5=3;
                }
                break;
            case 17:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:625:1: ( 'EMOTE' )
                    {
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:625:1: ( 'EMOTE' )
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:626:1: 'EMOTE'
                    {
                     before(grammarAccess.getIntegerDirectiveAccess().getEMOTEKeyword_0()); 
                    match(input,14,FOLLOW_14_in_rule__IntegerDirective__Alternatives1288); 
                     after(grammarAccess.getIntegerDirectiveAccess().getEMOTEKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:633:6: ( 'DIRECTION' )
                    {
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:633:6: ( 'DIRECTION' )
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:634:1: 'DIRECTION'
                    {
                     before(grammarAccess.getIntegerDirectiveAccess().getDIRECTIONKeyword_1()); 
                    match(input,15,FOLLOW_15_in_rule__IntegerDirective__Alternatives1308); 
                     after(grammarAccess.getIntegerDirectiveAccess().getDIRECTIONKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:641:6: ( 'MOVEMENT' )
                    {
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:641:6: ( 'MOVEMENT' )
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:642:1: 'MOVEMENT'
                    {
                     before(grammarAccess.getIntegerDirectiveAccess().getMOVEMENTKeyword_2()); 
                    match(input,16,FOLLOW_16_in_rule__IntegerDirective__Alternatives1328); 
                     after(grammarAccess.getIntegerDirectiveAccess().getMOVEMENTKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:649:6: ( 'GOTO' )
                    {
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:649:6: ( 'GOTO' )
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:650:1: 'GOTO'
                    {
                     before(grammarAccess.getIntegerDirectiveAccess().getGOTOKeyword_3()); 
                    match(input,17,FOLLOW_17_in_rule__IntegerDirective__Alternatives1348); 
                     after(grammarAccess.getIntegerDirectiveAccess().getGOTOKeyword_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerDirective__Alternatives"


    // $ANTLR start "rule__StringDirective__Alternatives"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:662:1: rule__StringDirective__Alternatives : ( ( 'CHAT' ) | ( 'EFFET' ) | ( 'VAR' ) | ( 'IF' ) );
    public final void rule__StringDirective__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:666:1: ( ( 'CHAT' ) | ( 'EFFET' ) | ( 'VAR' ) | ( 'IF' ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt6=1;
                }
                break;
            case 19:
                {
                alt6=2;
                }
                break;
            case 20:
                {
                alt6=3;
                }
                break;
            case 21:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:667:1: ( 'CHAT' )
                    {
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:667:1: ( 'CHAT' )
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:668:1: 'CHAT'
                    {
                     before(grammarAccess.getStringDirectiveAccess().getCHATKeyword_0()); 
                    match(input,18,FOLLOW_18_in_rule__StringDirective__Alternatives1383); 
                     after(grammarAccess.getStringDirectiveAccess().getCHATKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:675:6: ( 'EFFET' )
                    {
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:675:6: ( 'EFFET' )
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:676:1: 'EFFET'
                    {
                     before(grammarAccess.getStringDirectiveAccess().getEFFETKeyword_1()); 
                    match(input,19,FOLLOW_19_in_rule__StringDirective__Alternatives1403); 
                     after(grammarAccess.getStringDirectiveAccess().getEFFETKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:683:6: ( 'VAR' )
                    {
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:683:6: ( 'VAR' )
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:684:1: 'VAR'
                    {
                     before(grammarAccess.getStringDirectiveAccess().getVARKeyword_2()); 
                    match(input,20,FOLLOW_20_in_rule__StringDirective__Alternatives1423); 
                     after(grammarAccess.getStringDirectiveAccess().getVARKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:691:6: ( 'IF' )
                    {
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:691:6: ( 'IF' )
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:692:1: 'IF'
                    {
                     before(grammarAccess.getStringDirectiveAccess().getIFKeyword_3()); 
                    match(input,21,FOLLOW_21_in_rule__StringDirective__Alternatives1443); 
                     after(grammarAccess.getStringDirectiveAccess().getIFKeyword_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringDirective__Alternatives"


    // $ANTLR start "rule__ScopeType__Alternatives"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:704:1: rule__ScopeType__Alternatives : ( ( 'TO_MAP' ) | ( 'TO_TARGET' ) | ( 'TO_SUBZONE' ) | ( 'TO_ZONE' ) | ( 'TO_SUPERZONE' ) | ( 'TO_ALL' ) );
    public final void rule__ScopeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:708:1: ( ( 'TO_MAP' ) | ( 'TO_TARGET' ) | ( 'TO_SUBZONE' ) | ( 'TO_ZONE' ) | ( 'TO_SUPERZONE' ) | ( 'TO_ALL' ) )
            int alt7=6;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt7=1;
                }
                break;
            case 23:
                {
                alt7=2;
                }
                break;
            case 24:
                {
                alt7=3;
                }
                break;
            case 25:
                {
                alt7=4;
                }
                break;
            case 26:
                {
                alt7=5;
                }
                break;
            case 27:
                {
                alt7=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:709:1: ( 'TO_MAP' )
                    {
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:709:1: ( 'TO_MAP' )
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:710:1: 'TO_MAP'
                    {
                     before(grammarAccess.getScopeTypeAccess().getTO_MAPKeyword_0()); 
                    match(input,22,FOLLOW_22_in_rule__ScopeType__Alternatives1478); 
                     after(grammarAccess.getScopeTypeAccess().getTO_MAPKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:717:6: ( 'TO_TARGET' )
                    {
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:717:6: ( 'TO_TARGET' )
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:718:1: 'TO_TARGET'
                    {
                     before(grammarAccess.getScopeTypeAccess().getTO_TARGETKeyword_1()); 
                    match(input,23,FOLLOW_23_in_rule__ScopeType__Alternatives1498); 
                     after(grammarAccess.getScopeTypeAccess().getTO_TARGETKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:725:6: ( 'TO_SUBZONE' )
                    {
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:725:6: ( 'TO_SUBZONE' )
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:726:1: 'TO_SUBZONE'
                    {
                     before(grammarAccess.getScopeTypeAccess().getTO_SUBZONEKeyword_2()); 
                    match(input,24,FOLLOW_24_in_rule__ScopeType__Alternatives1518); 
                     after(grammarAccess.getScopeTypeAccess().getTO_SUBZONEKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:733:6: ( 'TO_ZONE' )
                    {
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:733:6: ( 'TO_ZONE' )
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:734:1: 'TO_ZONE'
                    {
                     before(grammarAccess.getScopeTypeAccess().getTO_ZONEKeyword_3()); 
                    match(input,25,FOLLOW_25_in_rule__ScopeType__Alternatives1538); 
                     after(grammarAccess.getScopeTypeAccess().getTO_ZONEKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:741:6: ( 'TO_SUPERZONE' )
                    {
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:741:6: ( 'TO_SUPERZONE' )
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:742:1: 'TO_SUPERZONE'
                    {
                     before(grammarAccess.getScopeTypeAccess().getTO_SUPERZONEKeyword_4()); 
                    match(input,26,FOLLOW_26_in_rule__ScopeType__Alternatives1558); 
                     after(grammarAccess.getScopeTypeAccess().getTO_SUPERZONEKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:749:6: ( 'TO_ALL' )
                    {
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:749:6: ( 'TO_ALL' )
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:750:1: 'TO_ALL'
                    {
                     before(grammarAccess.getScopeTypeAccess().getTO_ALLKeyword_5()); 
                    match(input,27,FOLLOW_27_in_rule__ScopeType__Alternatives1578); 
                     after(grammarAccess.getScopeTypeAccess().getTO_ALLKeyword_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopeType__Alternatives"


    // $ANTLR start "rule__Domain__Group__0"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:764:1: rule__Domain__Group__0 : rule__Domain__Group__0__Impl rule__Domain__Group__1 ;
    public final void rule__Domain__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:768:1: ( rule__Domain__Group__0__Impl rule__Domain__Group__1 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:769:2: rule__Domain__Group__0__Impl rule__Domain__Group__1
            {
            pushFollow(FOLLOW_rule__Domain__Group__0__Impl_in_rule__Domain__Group__01610);
            rule__Domain__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Domain__Group__1_in_rule__Domain__Group__01613);
            rule__Domain__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__0"


    // $ANTLR start "rule__Domain__Group__0__Impl"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:776:1: rule__Domain__Group__0__Impl : ( ( rule__Domain__ElementsAssignment_0 ) ) ;
    public final void rule__Domain__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:780:1: ( ( ( rule__Domain__ElementsAssignment_0 ) ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:781:1: ( ( rule__Domain__ElementsAssignment_0 ) )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:781:1: ( ( rule__Domain__ElementsAssignment_0 ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:782:1: ( rule__Domain__ElementsAssignment_0 )
            {
             before(grammarAccess.getDomainAccess().getElementsAssignment_0()); 
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:783:1: ( rule__Domain__ElementsAssignment_0 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:783:2: rule__Domain__ElementsAssignment_0
            {
            pushFollow(FOLLOW_rule__Domain__ElementsAssignment_0_in_rule__Domain__Group__0__Impl1640);
            rule__Domain__ElementsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDomainAccess().getElementsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__0__Impl"


    // $ANTLR start "rule__Domain__Group__1"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:793:1: rule__Domain__Group__1 : rule__Domain__Group__1__Impl rule__Domain__Group__2 ;
    public final void rule__Domain__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:797:1: ( rule__Domain__Group__1__Impl rule__Domain__Group__2 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:798:2: rule__Domain__Group__1__Impl rule__Domain__Group__2
            {
            pushFollow(FOLLOW_rule__Domain__Group__1__Impl_in_rule__Domain__Group__11670);
            rule__Domain__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Domain__Group__2_in_rule__Domain__Group__11673);
            rule__Domain__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__1"


    // $ANTLR start "rule__Domain__Group__1__Impl"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:805:1: rule__Domain__Group__1__Impl : ( ( rule__Domain__ElementsAssignment_1 )* ) ;
    public final void rule__Domain__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:809:1: ( ( ( rule__Domain__ElementsAssignment_1 )* ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:810:1: ( ( rule__Domain__ElementsAssignment_1 )* )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:810:1: ( ( rule__Domain__ElementsAssignment_1 )* )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:811:1: ( rule__Domain__ElementsAssignment_1 )*
            {
             before(grammarAccess.getDomainAccess().getElementsAssignment_1()); 
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:812:1: ( rule__Domain__ElementsAssignment_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==40) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:812:2: rule__Domain__ElementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Domain__ElementsAssignment_1_in_rule__Domain__Group__1__Impl1700);
            	    rule__Domain__ElementsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getDomainAccess().getElementsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__1__Impl"


    // $ANTLR start "rule__Domain__Group__2"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:822:1: rule__Domain__Group__2 : rule__Domain__Group__2__Impl ;
    public final void rule__Domain__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:826:1: ( rule__Domain__Group__2__Impl )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:827:2: rule__Domain__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Domain__Group__2__Impl_in_rule__Domain__Group__21731);
            rule__Domain__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__2"


    // $ANTLR start "rule__Domain__Group__2__Impl"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:833:1: rule__Domain__Group__2__Impl : ( ( rule__Domain__ElementsAssignment_2 )* ) ;
    public final void rule__Domain__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:837:1: ( ( ( rule__Domain__ElementsAssignment_2 )* ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:838:1: ( ( rule__Domain__ElementsAssignment_2 )* )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:838:1: ( ( rule__Domain__ElementsAssignment_2 )* )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:839:1: ( rule__Domain__ElementsAssignment_2 )*
            {
             before(grammarAccess.getDomainAccess().getElementsAssignment_2()); 
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:840:1: ( rule__Domain__ElementsAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==28) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:840:2: rule__Domain__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Domain__ElementsAssignment_2_in_rule__Domain__Group__2__Impl1758);
            	    rule__Domain__ElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getDomainAccess().getElementsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__2__Impl"


    // $ANTLR start "rule__Class__Group__0"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:856:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:860:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:861:2: rule__Class__Group__0__Impl rule__Class__Group__1
            {
            pushFollow(FOLLOW_rule__Class__Group__0__Impl_in_rule__Class__Group__01795);
            rule__Class__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__1_in_rule__Class__Group__01798);
            rule__Class__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__0"


    // $ANTLR start "rule__Class__Group__0__Impl"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:868:1: rule__Class__Group__0__Impl : ( 'class' ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:872:1: ( ( 'class' ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:873:1: ( 'class' )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:873:1: ( 'class' )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:874:1: 'class'
            {
             before(grammarAccess.getClassAccess().getClassKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__Class__Group__0__Impl1826); 
             after(grammarAccess.getClassAccess().getClassKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__0__Impl"


    // $ANTLR start "rule__Class__Group__1"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:887:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:891:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:892:2: rule__Class__Group__1__Impl rule__Class__Group__2
            {
            pushFollow(FOLLOW_rule__Class__Group__1__Impl_in_rule__Class__Group__11857);
            rule__Class__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__2_in_rule__Class__Group__11860);
            rule__Class__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__1"


    // $ANTLR start "rule__Class__Group__1__Impl"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:899:1: rule__Class__Group__1__Impl : ( ( rule__Class__NameAssignment_1 ) ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:903:1: ( ( ( rule__Class__NameAssignment_1 ) ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:904:1: ( ( rule__Class__NameAssignment_1 ) )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:904:1: ( ( rule__Class__NameAssignment_1 ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:905:1: ( rule__Class__NameAssignment_1 )
            {
             before(grammarAccess.getClassAccess().getNameAssignment_1()); 
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:906:1: ( rule__Class__NameAssignment_1 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:906:2: rule__Class__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Class__NameAssignment_1_in_rule__Class__Group__1__Impl1887);
            rule__Class__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__1__Impl"


    // $ANTLR start "rule__Class__Group__2"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:916:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:920:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:921:2: rule__Class__Group__2__Impl rule__Class__Group__3
            {
            pushFollow(FOLLOW_rule__Class__Group__2__Impl_in_rule__Class__Group__21917);
            rule__Class__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__3_in_rule__Class__Group__21920);
            rule__Class__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__2"


    // $ANTLR start "rule__Class__Group__2__Impl"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:928:1: rule__Class__Group__2__Impl : ( ( rule__Class__Group_2__0 )? ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:932:1: ( ( ( rule__Class__Group_2__0 )? ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:933:1: ( ( rule__Class__Group_2__0 )? )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:933:1: ( ( rule__Class__Group_2__0 )? )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:934:1: ( rule__Class__Group_2__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_2()); 
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:935:1: ( rule__Class__Group_2__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==31) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:935:2: rule__Class__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Class__Group_2__0_in_rule__Class__Group__2__Impl1947);
                    rule__Class__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__2__Impl"


    // $ANTLR start "rule__Class__Group__3"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:945:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:949:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:950:2: rule__Class__Group__3__Impl rule__Class__Group__4
            {
            pushFollow(FOLLOW_rule__Class__Group__3__Impl_in_rule__Class__Group__31978);
            rule__Class__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__4_in_rule__Class__Group__31981);
            rule__Class__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__3"


    // $ANTLR start "rule__Class__Group__3__Impl"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:957:1: rule__Class__Group__3__Impl : ( '{' ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:961:1: ( ( '{' ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:962:1: ( '{' )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:962:1: ( '{' )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:963:1: '{'
            {
             before(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,29,FOLLOW_29_in_rule__Class__Group__3__Impl2009); 
             after(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__3__Impl"


    // $ANTLR start "rule__Class__Group__4"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:976:1: rule__Class__Group__4 : rule__Class__Group__4__Impl ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:980:1: ( rule__Class__Group__4__Impl )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:981:2: rule__Class__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Class__Group__4__Impl_in_rule__Class__Group__42040);
            rule__Class__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__4"


    // $ANTLR start "rule__Class__Group__4__Impl"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:987:1: rule__Class__Group__4__Impl : ( '}' ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:991:1: ( ( '}' ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:992:1: ( '}' )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:992:1: ( '}' )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:993:1: '}'
            {
             before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_4()); 
            match(input,30,FOLLOW_30_in_rule__Class__Group__4__Impl2068); 
             after(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__4__Impl"


    // $ANTLR start "rule__Class__Group_2__0"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1016:1: rule__Class__Group_2__0 : rule__Class__Group_2__0__Impl rule__Class__Group_2__1 ;
    public final void rule__Class__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1020:1: ( rule__Class__Group_2__0__Impl rule__Class__Group_2__1 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1021:2: rule__Class__Group_2__0__Impl rule__Class__Group_2__1
            {
            pushFollow(FOLLOW_rule__Class__Group_2__0__Impl_in_rule__Class__Group_2__02109);
            rule__Class__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group_2__1_in_rule__Class__Group_2__02112);
            rule__Class__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_2__0"


    // $ANTLR start "rule__Class__Group_2__0__Impl"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1028:1: rule__Class__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__Class__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1032:1: ( ( 'extends' ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1033:1: ( 'extends' )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1033:1: ( 'extends' )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1034:1: 'extends'
            {
             before(grammarAccess.getClassAccess().getExtendsKeyword_2_0()); 
            match(input,31,FOLLOW_31_in_rule__Class__Group_2__0__Impl2140); 
             after(grammarAccess.getClassAccess().getExtendsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_2__0__Impl"


    // $ANTLR start "rule__Class__Group_2__1"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1047:1: rule__Class__Group_2__1 : rule__Class__Group_2__1__Impl ;
    public final void rule__Class__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1051:1: ( rule__Class__Group_2__1__Impl )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1052:2: rule__Class__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Class__Group_2__1__Impl_in_rule__Class__Group_2__12171);
            rule__Class__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_2__1"


    // $ANTLR start "rule__Class__Group_2__1__Impl"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1058:1: rule__Class__Group_2__1__Impl : ( ( rule__Class__SuperTypeAssignment_2_1 ) ) ;
    public final void rule__Class__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1062:1: ( ( ( rule__Class__SuperTypeAssignment_2_1 ) ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1063:1: ( ( rule__Class__SuperTypeAssignment_2_1 ) )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1063:1: ( ( rule__Class__SuperTypeAssignment_2_1 ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1064:1: ( rule__Class__SuperTypeAssignment_2_1 )
            {
             before(grammarAccess.getClassAccess().getSuperTypeAssignment_2_1()); 
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1065:1: ( rule__Class__SuperTypeAssignment_2_1 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1065:2: rule__Class__SuperTypeAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Class__SuperTypeAssignment_2_1_in_rule__Class__Group_2__1__Impl2198);
            rule__Class__SuperTypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getSuperTypeAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_2__1__Impl"


    // $ANTLR start "rule__OnLoadBloc__Group__0"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1079:1: rule__OnLoadBloc__Group__0 : rule__OnLoadBloc__Group__0__Impl rule__OnLoadBloc__Group__1 ;
    public final void rule__OnLoadBloc__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1083:1: ( rule__OnLoadBloc__Group__0__Impl rule__OnLoadBloc__Group__1 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1084:2: rule__OnLoadBloc__Group__0__Impl rule__OnLoadBloc__Group__1
            {
            pushFollow(FOLLOW_rule__OnLoadBloc__Group__0__Impl_in_rule__OnLoadBloc__Group__02232);
            rule__OnLoadBloc__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OnLoadBloc__Group__1_in_rule__OnLoadBloc__Group__02235);
            rule__OnLoadBloc__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnLoadBloc__Group__0"


    // $ANTLR start "rule__OnLoadBloc__Group__0__Impl"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1091:1: rule__OnLoadBloc__Group__0__Impl : ( 'onLoad' ) ;
    public final void rule__OnLoadBloc__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1095:1: ( ( 'onLoad' ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1096:1: ( 'onLoad' )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1096:1: ( 'onLoad' )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1097:1: 'onLoad'
            {
             before(grammarAccess.getOnLoadBlocAccess().getOnLoadKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__OnLoadBloc__Group__0__Impl2263); 
             after(grammarAccess.getOnLoadBlocAccess().getOnLoadKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnLoadBloc__Group__0__Impl"


    // $ANTLR start "rule__OnLoadBloc__Group__1"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1110:1: rule__OnLoadBloc__Group__1 : rule__OnLoadBloc__Group__1__Impl rule__OnLoadBloc__Group__2 ;
    public final void rule__OnLoadBloc__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1114:1: ( rule__OnLoadBloc__Group__1__Impl rule__OnLoadBloc__Group__2 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1115:2: rule__OnLoadBloc__Group__1__Impl rule__OnLoadBloc__Group__2
            {
            pushFollow(FOLLOW_rule__OnLoadBloc__Group__1__Impl_in_rule__OnLoadBloc__Group__12294);
            rule__OnLoadBloc__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OnLoadBloc__Group__2_in_rule__OnLoadBloc__Group__12297);
            rule__OnLoadBloc__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnLoadBloc__Group__1"


    // $ANTLR start "rule__OnLoadBloc__Group__1__Impl"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1122:1: rule__OnLoadBloc__Group__1__Impl : ( '{' ) ;
    public final void rule__OnLoadBloc__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1126:1: ( ( '{' ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1127:1: ( '{' )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1127:1: ( '{' )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1128:1: '{'
            {
             before(grammarAccess.getOnLoadBlocAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,29,FOLLOW_29_in_rule__OnLoadBloc__Group__1__Impl2325); 
             after(grammarAccess.getOnLoadBlocAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnLoadBloc__Group__1__Impl"


    // $ANTLR start "rule__OnLoadBloc__Group__2"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1141:1: rule__OnLoadBloc__Group__2 : rule__OnLoadBloc__Group__2__Impl rule__OnLoadBloc__Group__3 ;
    public final void rule__OnLoadBloc__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1145:1: ( rule__OnLoadBloc__Group__2__Impl rule__OnLoadBloc__Group__3 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1146:2: rule__OnLoadBloc__Group__2__Impl rule__OnLoadBloc__Group__3
            {
            pushFollow(FOLLOW_rule__OnLoadBloc__Group__2__Impl_in_rule__OnLoadBloc__Group__22356);
            rule__OnLoadBloc__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OnLoadBloc__Group__3_in_rule__OnLoadBloc__Group__22359);
            rule__OnLoadBloc__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnLoadBloc__Group__2"


    // $ANTLR start "rule__OnLoadBloc__Group__2__Impl"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1153:1: rule__OnLoadBloc__Group__2__Impl : ( 'filePath' ) ;
    public final void rule__OnLoadBloc__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1157:1: ( ( 'filePath' ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1158:1: ( 'filePath' )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1158:1: ( 'filePath' )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1159:1: 'filePath'
            {
             before(grammarAccess.getOnLoadBlocAccess().getFilePathKeyword_2()); 
            match(input,33,FOLLOW_33_in_rule__OnLoadBloc__Group__2__Impl2387); 
             after(grammarAccess.getOnLoadBlocAccess().getFilePathKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnLoadBloc__Group__2__Impl"


    // $ANTLR start "rule__OnLoadBloc__Group__3"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1172:1: rule__OnLoadBloc__Group__3 : rule__OnLoadBloc__Group__3__Impl rule__OnLoadBloc__Group__4 ;
    public final void rule__OnLoadBloc__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1176:1: ( rule__OnLoadBloc__Group__3__Impl rule__OnLoadBloc__Group__4 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1177:2: rule__OnLoadBloc__Group__3__Impl rule__OnLoadBloc__Group__4
            {
            pushFollow(FOLLOW_rule__OnLoadBloc__Group__3__Impl_in_rule__OnLoadBloc__Group__32418);
            rule__OnLoadBloc__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OnLoadBloc__Group__4_in_rule__OnLoadBloc__Group__32421);
            rule__OnLoadBloc__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnLoadBloc__Group__3"


    // $ANTLR start "rule__OnLoadBloc__Group__3__Impl"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1184:1: rule__OnLoadBloc__Group__3__Impl : ( '=' ) ;
    public final void rule__OnLoadBloc__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1188:1: ( ( '=' ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1189:1: ( '=' )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1189:1: ( '=' )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1190:1: '='
            {
             before(grammarAccess.getOnLoadBlocAccess().getEqualsSignKeyword_3()); 
            match(input,34,FOLLOW_34_in_rule__OnLoadBloc__Group__3__Impl2449); 
             after(grammarAccess.getOnLoadBlocAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnLoadBloc__Group__3__Impl"


    // $ANTLR start "rule__OnLoadBloc__Group__4"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1203:1: rule__OnLoadBloc__Group__4 : rule__OnLoadBloc__Group__4__Impl rule__OnLoadBloc__Group__5 ;
    public final void rule__OnLoadBloc__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1207:1: ( rule__OnLoadBloc__Group__4__Impl rule__OnLoadBloc__Group__5 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1208:2: rule__OnLoadBloc__Group__4__Impl rule__OnLoadBloc__Group__5
            {
            pushFollow(FOLLOW_rule__OnLoadBloc__Group__4__Impl_in_rule__OnLoadBloc__Group__42480);
            rule__OnLoadBloc__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OnLoadBloc__Group__5_in_rule__OnLoadBloc__Group__42483);
            rule__OnLoadBloc__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnLoadBloc__Group__4"


    // $ANTLR start "rule__OnLoadBloc__Group__4__Impl"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1215:1: rule__OnLoadBloc__Group__4__Impl : ( ( rule__OnLoadBloc__FilePathAssignment_4 ) ) ;
    public final void rule__OnLoadBloc__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1219:1: ( ( ( rule__OnLoadBloc__FilePathAssignment_4 ) ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1220:1: ( ( rule__OnLoadBloc__FilePathAssignment_4 ) )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1220:1: ( ( rule__OnLoadBloc__FilePathAssignment_4 ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1221:1: ( rule__OnLoadBloc__FilePathAssignment_4 )
            {
             before(grammarAccess.getOnLoadBlocAccess().getFilePathAssignment_4()); 
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1222:1: ( rule__OnLoadBloc__FilePathAssignment_4 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1222:2: rule__OnLoadBloc__FilePathAssignment_4
            {
            pushFollow(FOLLOW_rule__OnLoadBloc__FilePathAssignment_4_in_rule__OnLoadBloc__Group__4__Impl2510);
            rule__OnLoadBloc__FilePathAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getOnLoadBlocAccess().getFilePathAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnLoadBloc__Group__4__Impl"


    // $ANTLR start "rule__OnLoadBloc__Group__5"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1232:1: rule__OnLoadBloc__Group__5 : rule__OnLoadBloc__Group__5__Impl rule__OnLoadBloc__Group__6 ;
    public final void rule__OnLoadBloc__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1236:1: ( rule__OnLoadBloc__Group__5__Impl rule__OnLoadBloc__Group__6 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1237:2: rule__OnLoadBloc__Group__5__Impl rule__OnLoadBloc__Group__6
            {
            pushFollow(FOLLOW_rule__OnLoadBloc__Group__5__Impl_in_rule__OnLoadBloc__Group__52540);
            rule__OnLoadBloc__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OnLoadBloc__Group__6_in_rule__OnLoadBloc__Group__52543);
            rule__OnLoadBloc__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnLoadBloc__Group__5"


    // $ANTLR start "rule__OnLoadBloc__Group__5__Impl"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1244:1: rule__OnLoadBloc__Group__5__Impl : ( ';' ) ;
    public final void rule__OnLoadBloc__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1248:1: ( ( ';' ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1249:1: ( ';' )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1249:1: ( ';' )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1250:1: ';'
            {
             before(grammarAccess.getOnLoadBlocAccess().getSemicolonKeyword_5()); 
            match(input,35,FOLLOW_35_in_rule__OnLoadBloc__Group__5__Impl2571); 
             after(grammarAccess.getOnLoadBlocAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnLoadBloc__Group__5__Impl"


    // $ANTLR start "rule__OnLoadBloc__Group__6"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1263:1: rule__OnLoadBloc__Group__6 : rule__OnLoadBloc__Group__6__Impl rule__OnLoadBloc__Group__7 ;
    public final void rule__OnLoadBloc__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1267:1: ( rule__OnLoadBloc__Group__6__Impl rule__OnLoadBloc__Group__7 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1268:2: rule__OnLoadBloc__Group__6__Impl rule__OnLoadBloc__Group__7
            {
            pushFollow(FOLLOW_rule__OnLoadBloc__Group__6__Impl_in_rule__OnLoadBloc__Group__62602);
            rule__OnLoadBloc__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OnLoadBloc__Group__7_in_rule__OnLoadBloc__Group__62605);
            rule__OnLoadBloc__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnLoadBloc__Group__6"


    // $ANTLR start "rule__OnLoadBloc__Group__6__Impl"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1275:1: rule__OnLoadBloc__Group__6__Impl : ( 'fileName' ) ;
    public final void rule__OnLoadBloc__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1279:1: ( ( 'fileName' ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1280:1: ( 'fileName' )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1280:1: ( 'fileName' )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1281:1: 'fileName'
            {
             before(grammarAccess.getOnLoadBlocAccess().getFileNameKeyword_6()); 
            match(input,36,FOLLOW_36_in_rule__OnLoadBloc__Group__6__Impl2633); 
             after(grammarAccess.getOnLoadBlocAccess().getFileNameKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnLoadBloc__Group__6__Impl"


    // $ANTLR start "rule__OnLoadBloc__Group__7"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1294:1: rule__OnLoadBloc__Group__7 : rule__OnLoadBloc__Group__7__Impl rule__OnLoadBloc__Group__8 ;
    public final void rule__OnLoadBloc__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1298:1: ( rule__OnLoadBloc__Group__7__Impl rule__OnLoadBloc__Group__8 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1299:2: rule__OnLoadBloc__Group__7__Impl rule__OnLoadBloc__Group__8
            {
            pushFollow(FOLLOW_rule__OnLoadBloc__Group__7__Impl_in_rule__OnLoadBloc__Group__72664);
            rule__OnLoadBloc__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OnLoadBloc__Group__8_in_rule__OnLoadBloc__Group__72667);
            rule__OnLoadBloc__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnLoadBloc__Group__7"


    // $ANTLR start "rule__OnLoadBloc__Group__7__Impl"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1306:1: rule__OnLoadBloc__Group__7__Impl : ( '=' ) ;
    public final void rule__OnLoadBloc__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1310:1: ( ( '=' ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1311:1: ( '=' )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1311:1: ( '=' )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1312:1: '='
            {
             before(grammarAccess.getOnLoadBlocAccess().getEqualsSignKeyword_7()); 
            match(input,34,FOLLOW_34_in_rule__OnLoadBloc__Group__7__Impl2695); 
             after(grammarAccess.getOnLoadBlocAccess().getEqualsSignKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnLoadBloc__Group__7__Impl"


    // $ANTLR start "rule__OnLoadBloc__Group__8"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1325:1: rule__OnLoadBloc__Group__8 : rule__OnLoadBloc__Group__8__Impl rule__OnLoadBloc__Group__9 ;
    public final void rule__OnLoadBloc__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1329:1: ( rule__OnLoadBloc__Group__8__Impl rule__OnLoadBloc__Group__9 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1330:2: rule__OnLoadBloc__Group__8__Impl rule__OnLoadBloc__Group__9
            {
            pushFollow(FOLLOW_rule__OnLoadBloc__Group__8__Impl_in_rule__OnLoadBloc__Group__82726);
            rule__OnLoadBloc__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OnLoadBloc__Group__9_in_rule__OnLoadBloc__Group__82729);
            rule__OnLoadBloc__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnLoadBloc__Group__8"


    // $ANTLR start "rule__OnLoadBloc__Group__8__Impl"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1337:1: rule__OnLoadBloc__Group__8__Impl : ( ( rule__OnLoadBloc__FileNameAssignment_8 ) ) ;
    public final void rule__OnLoadBloc__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1341:1: ( ( ( rule__OnLoadBloc__FileNameAssignment_8 ) ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1342:1: ( ( rule__OnLoadBloc__FileNameAssignment_8 ) )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1342:1: ( ( rule__OnLoadBloc__FileNameAssignment_8 ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1343:1: ( rule__OnLoadBloc__FileNameAssignment_8 )
            {
             before(grammarAccess.getOnLoadBlocAccess().getFileNameAssignment_8()); 
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1344:1: ( rule__OnLoadBloc__FileNameAssignment_8 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1344:2: rule__OnLoadBloc__FileNameAssignment_8
            {
            pushFollow(FOLLOW_rule__OnLoadBloc__FileNameAssignment_8_in_rule__OnLoadBloc__Group__8__Impl2756);
            rule__OnLoadBloc__FileNameAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getOnLoadBlocAccess().getFileNameAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnLoadBloc__Group__8__Impl"


    // $ANTLR start "rule__OnLoadBloc__Group__9"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1354:1: rule__OnLoadBloc__Group__9 : rule__OnLoadBloc__Group__9__Impl rule__OnLoadBloc__Group__10 ;
    public final void rule__OnLoadBloc__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1358:1: ( rule__OnLoadBloc__Group__9__Impl rule__OnLoadBloc__Group__10 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1359:2: rule__OnLoadBloc__Group__9__Impl rule__OnLoadBloc__Group__10
            {
            pushFollow(FOLLOW_rule__OnLoadBloc__Group__9__Impl_in_rule__OnLoadBloc__Group__92786);
            rule__OnLoadBloc__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OnLoadBloc__Group__10_in_rule__OnLoadBloc__Group__92789);
            rule__OnLoadBloc__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnLoadBloc__Group__9"


    // $ANTLR start "rule__OnLoadBloc__Group__9__Impl"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1366:1: rule__OnLoadBloc__Group__9__Impl : ( ';' ) ;
    public final void rule__OnLoadBloc__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1370:1: ( ( ';' ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1371:1: ( ';' )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1371:1: ( ';' )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1372:1: ';'
            {
             before(grammarAccess.getOnLoadBlocAccess().getSemicolonKeyword_9()); 
            match(input,35,FOLLOW_35_in_rule__OnLoadBloc__Group__9__Impl2817); 
             after(grammarAccess.getOnLoadBlocAccess().getSemicolonKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnLoadBloc__Group__9__Impl"


    // $ANTLR start "rule__OnLoadBloc__Group__10"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1385:1: rule__OnLoadBloc__Group__10 : rule__OnLoadBloc__Group__10__Impl rule__OnLoadBloc__Group__11 ;
    public final void rule__OnLoadBloc__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1389:1: ( rule__OnLoadBloc__Group__10__Impl rule__OnLoadBloc__Group__11 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1390:2: rule__OnLoadBloc__Group__10__Impl rule__OnLoadBloc__Group__11
            {
            pushFollow(FOLLOW_rule__OnLoadBloc__Group__10__Impl_in_rule__OnLoadBloc__Group__102848);
            rule__OnLoadBloc__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OnLoadBloc__Group__11_in_rule__OnLoadBloc__Group__102851);
            rule__OnLoadBloc__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnLoadBloc__Group__10"


    // $ANTLR start "rule__OnLoadBloc__Group__10__Impl"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1397:1: rule__OnLoadBloc__Group__10__Impl : ( 'characterID' ) ;
    public final void rule__OnLoadBloc__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1401:1: ( ( 'characterID' ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1402:1: ( 'characterID' )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1402:1: ( 'characterID' )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1403:1: 'characterID'
            {
             before(grammarAccess.getOnLoadBlocAccess().getCharacterIDKeyword_10()); 
            match(input,37,FOLLOW_37_in_rule__OnLoadBloc__Group__10__Impl2879); 
             after(grammarAccess.getOnLoadBlocAccess().getCharacterIDKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnLoadBloc__Group__10__Impl"


    // $ANTLR start "rule__OnLoadBloc__Group__11"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1416:1: rule__OnLoadBloc__Group__11 : rule__OnLoadBloc__Group__11__Impl rule__OnLoadBloc__Group__12 ;
    public final void rule__OnLoadBloc__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1420:1: ( rule__OnLoadBloc__Group__11__Impl rule__OnLoadBloc__Group__12 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1421:2: rule__OnLoadBloc__Group__11__Impl rule__OnLoadBloc__Group__12
            {
            pushFollow(FOLLOW_rule__OnLoadBloc__Group__11__Impl_in_rule__OnLoadBloc__Group__112910);
            rule__OnLoadBloc__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OnLoadBloc__Group__12_in_rule__OnLoadBloc__Group__112913);
            rule__OnLoadBloc__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnLoadBloc__Group__11"


    // $ANTLR start "rule__OnLoadBloc__Group__11__Impl"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1428:1: rule__OnLoadBloc__Group__11__Impl : ( '=' ) ;
    public final void rule__OnLoadBloc__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1432:1: ( ( '=' ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1433:1: ( '=' )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1433:1: ( '=' )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1434:1: '='
            {
             before(grammarAccess.getOnLoadBlocAccess().getEqualsSignKeyword_11()); 
            match(input,34,FOLLOW_34_in_rule__OnLoadBloc__Group__11__Impl2941); 
             after(grammarAccess.getOnLoadBlocAccess().getEqualsSignKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnLoadBloc__Group__11__Impl"


    // $ANTLR start "rule__OnLoadBloc__Group__12"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1447:1: rule__OnLoadBloc__Group__12 : rule__OnLoadBloc__Group__12__Impl rule__OnLoadBloc__Group__13 ;
    public final void rule__OnLoadBloc__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1451:1: ( rule__OnLoadBloc__Group__12__Impl rule__OnLoadBloc__Group__13 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1452:2: rule__OnLoadBloc__Group__12__Impl rule__OnLoadBloc__Group__13
            {
            pushFollow(FOLLOW_rule__OnLoadBloc__Group__12__Impl_in_rule__OnLoadBloc__Group__122972);
            rule__OnLoadBloc__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OnLoadBloc__Group__13_in_rule__OnLoadBloc__Group__122975);
            rule__OnLoadBloc__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnLoadBloc__Group__12"


    // $ANTLR start "rule__OnLoadBloc__Group__12__Impl"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1459:1: rule__OnLoadBloc__Group__12__Impl : ( ( rule__OnLoadBloc__CharacterIDAssignment_12 ) ) ;
    public final void rule__OnLoadBloc__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1463:1: ( ( ( rule__OnLoadBloc__CharacterIDAssignment_12 ) ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1464:1: ( ( rule__OnLoadBloc__CharacterIDAssignment_12 ) )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1464:1: ( ( rule__OnLoadBloc__CharacterIDAssignment_12 ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1465:1: ( rule__OnLoadBloc__CharacterIDAssignment_12 )
            {
             before(grammarAccess.getOnLoadBlocAccess().getCharacterIDAssignment_12()); 
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1466:1: ( rule__OnLoadBloc__CharacterIDAssignment_12 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1466:2: rule__OnLoadBloc__CharacterIDAssignment_12
            {
            pushFollow(FOLLOW_rule__OnLoadBloc__CharacterIDAssignment_12_in_rule__OnLoadBloc__Group__12__Impl3002);
            rule__OnLoadBloc__CharacterIDAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getOnLoadBlocAccess().getCharacterIDAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnLoadBloc__Group__12__Impl"


    // $ANTLR start "rule__OnLoadBloc__Group__13"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1476:1: rule__OnLoadBloc__Group__13 : rule__OnLoadBloc__Group__13__Impl rule__OnLoadBloc__Group__14 ;
    public final void rule__OnLoadBloc__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1480:1: ( rule__OnLoadBloc__Group__13__Impl rule__OnLoadBloc__Group__14 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1481:2: rule__OnLoadBloc__Group__13__Impl rule__OnLoadBloc__Group__14
            {
            pushFollow(FOLLOW_rule__OnLoadBloc__Group__13__Impl_in_rule__OnLoadBloc__Group__133032);
            rule__OnLoadBloc__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OnLoadBloc__Group__14_in_rule__OnLoadBloc__Group__133035);
            rule__OnLoadBloc__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnLoadBloc__Group__13"


    // $ANTLR start "rule__OnLoadBloc__Group__13__Impl"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1488:1: rule__OnLoadBloc__Group__13__Impl : ( ';' ) ;
    public final void rule__OnLoadBloc__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1492:1: ( ( ';' ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1493:1: ( ';' )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1493:1: ( ';' )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1494:1: ';'
            {
             before(grammarAccess.getOnLoadBlocAccess().getSemicolonKeyword_13()); 
            match(input,35,FOLLOW_35_in_rule__OnLoadBloc__Group__13__Impl3063); 
             after(grammarAccess.getOnLoadBlocAccess().getSemicolonKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnLoadBloc__Group__13__Impl"


    // $ANTLR start "rule__OnLoadBloc__Group__14"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1507:1: rule__OnLoadBloc__Group__14 : rule__OnLoadBloc__Group__14__Impl rule__OnLoadBloc__Group__15 ;
    public final void rule__OnLoadBloc__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1511:1: ( rule__OnLoadBloc__Group__14__Impl rule__OnLoadBloc__Group__15 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1512:2: rule__OnLoadBloc__Group__14__Impl rule__OnLoadBloc__Group__15
            {
            pushFollow(FOLLOW_rule__OnLoadBloc__Group__14__Impl_in_rule__OnLoadBloc__Group__143094);
            rule__OnLoadBloc__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OnLoadBloc__Group__15_in_rule__OnLoadBloc__Group__143097);
            rule__OnLoadBloc__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnLoadBloc__Group__14"


    // $ANTLR start "rule__OnLoadBloc__Group__14__Impl"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1519:1: rule__OnLoadBloc__Group__14__Impl : ( 'scope' ) ;
    public final void rule__OnLoadBloc__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1523:1: ( ( 'scope' ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1524:1: ( 'scope' )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1524:1: ( 'scope' )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1525:1: 'scope'
            {
             before(grammarAccess.getOnLoadBlocAccess().getScopeKeyword_14()); 
            match(input,38,FOLLOW_38_in_rule__OnLoadBloc__Group__14__Impl3125); 
             after(grammarAccess.getOnLoadBlocAccess().getScopeKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnLoadBloc__Group__14__Impl"


    // $ANTLR start "rule__OnLoadBloc__Group__15"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1538:1: rule__OnLoadBloc__Group__15 : rule__OnLoadBloc__Group__15__Impl rule__OnLoadBloc__Group__16 ;
    public final void rule__OnLoadBloc__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1542:1: ( rule__OnLoadBloc__Group__15__Impl rule__OnLoadBloc__Group__16 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1543:2: rule__OnLoadBloc__Group__15__Impl rule__OnLoadBloc__Group__16
            {
            pushFollow(FOLLOW_rule__OnLoadBloc__Group__15__Impl_in_rule__OnLoadBloc__Group__153156);
            rule__OnLoadBloc__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OnLoadBloc__Group__16_in_rule__OnLoadBloc__Group__153159);
            rule__OnLoadBloc__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnLoadBloc__Group__15"


    // $ANTLR start "rule__OnLoadBloc__Group__15__Impl"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1550:1: rule__OnLoadBloc__Group__15__Impl : ( '=' ) ;
    public final void rule__OnLoadBloc__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1554:1: ( ( '=' ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1555:1: ( '=' )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1555:1: ( '=' )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1556:1: '='
            {
             before(grammarAccess.getOnLoadBlocAccess().getEqualsSignKeyword_15()); 
            match(input,34,FOLLOW_34_in_rule__OnLoadBloc__Group__15__Impl3187); 
             after(grammarAccess.getOnLoadBlocAccess().getEqualsSignKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnLoadBloc__Group__15__Impl"


    // $ANTLR start "rule__OnLoadBloc__Group__16"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1569:1: rule__OnLoadBloc__Group__16 : rule__OnLoadBloc__Group__16__Impl rule__OnLoadBloc__Group__17 ;
    public final void rule__OnLoadBloc__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1573:1: ( rule__OnLoadBloc__Group__16__Impl rule__OnLoadBloc__Group__17 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1574:2: rule__OnLoadBloc__Group__16__Impl rule__OnLoadBloc__Group__17
            {
            pushFollow(FOLLOW_rule__OnLoadBloc__Group__16__Impl_in_rule__OnLoadBloc__Group__163218);
            rule__OnLoadBloc__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OnLoadBloc__Group__17_in_rule__OnLoadBloc__Group__163221);
            rule__OnLoadBloc__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnLoadBloc__Group__16"


    // $ANTLR start "rule__OnLoadBloc__Group__16__Impl"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1581:1: rule__OnLoadBloc__Group__16__Impl : ( ( rule__OnLoadBloc__ScopeAssignment_16 ) ) ;
    public final void rule__OnLoadBloc__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1585:1: ( ( ( rule__OnLoadBloc__ScopeAssignment_16 ) ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1586:1: ( ( rule__OnLoadBloc__ScopeAssignment_16 ) )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1586:1: ( ( rule__OnLoadBloc__ScopeAssignment_16 ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1587:1: ( rule__OnLoadBloc__ScopeAssignment_16 )
            {
             before(grammarAccess.getOnLoadBlocAccess().getScopeAssignment_16()); 
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1588:1: ( rule__OnLoadBloc__ScopeAssignment_16 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1588:2: rule__OnLoadBloc__ScopeAssignment_16
            {
            pushFollow(FOLLOW_rule__OnLoadBloc__ScopeAssignment_16_in_rule__OnLoadBloc__Group__16__Impl3248);
            rule__OnLoadBloc__ScopeAssignment_16();

            state._fsp--;


            }

             after(grammarAccess.getOnLoadBlocAccess().getScopeAssignment_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnLoadBloc__Group__16__Impl"


    // $ANTLR start "rule__OnLoadBloc__Group__17"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1598:1: rule__OnLoadBloc__Group__17 : rule__OnLoadBloc__Group__17__Impl rule__OnLoadBloc__Group__18 ;
    public final void rule__OnLoadBloc__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1602:1: ( rule__OnLoadBloc__Group__17__Impl rule__OnLoadBloc__Group__18 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1603:2: rule__OnLoadBloc__Group__17__Impl rule__OnLoadBloc__Group__18
            {
            pushFollow(FOLLOW_rule__OnLoadBloc__Group__17__Impl_in_rule__OnLoadBloc__Group__173278);
            rule__OnLoadBloc__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OnLoadBloc__Group__18_in_rule__OnLoadBloc__Group__173281);
            rule__OnLoadBloc__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnLoadBloc__Group__17"


    // $ANTLR start "rule__OnLoadBloc__Group__17__Impl"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1610:1: rule__OnLoadBloc__Group__17__Impl : ( ';' ) ;
    public final void rule__OnLoadBloc__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1614:1: ( ( ';' ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1615:1: ( ';' )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1615:1: ( ';' )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1616:1: ';'
            {
             before(grammarAccess.getOnLoadBlocAccess().getSemicolonKeyword_17()); 
            match(input,35,FOLLOW_35_in_rule__OnLoadBloc__Group__17__Impl3309); 
             after(grammarAccess.getOnLoadBlocAccess().getSemicolonKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnLoadBloc__Group__17__Impl"


    // $ANTLR start "rule__OnLoadBloc__Group__18"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1629:1: rule__OnLoadBloc__Group__18 : rule__OnLoadBloc__Group__18__Impl rule__OnLoadBloc__Group__19 ;
    public final void rule__OnLoadBloc__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1633:1: ( rule__OnLoadBloc__Group__18__Impl rule__OnLoadBloc__Group__19 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1634:2: rule__OnLoadBloc__Group__18__Impl rule__OnLoadBloc__Group__19
            {
            pushFollow(FOLLOW_rule__OnLoadBloc__Group__18__Impl_in_rule__OnLoadBloc__Group__183340);
            rule__OnLoadBloc__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OnLoadBloc__Group__19_in_rule__OnLoadBloc__Group__183343);
            rule__OnLoadBloc__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnLoadBloc__Group__18"


    // $ANTLR start "rule__OnLoadBloc__Group__18__Impl"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1641:1: rule__OnLoadBloc__Group__18__Impl : ( 'compatMicro' ) ;
    public final void rule__OnLoadBloc__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1645:1: ( ( 'compatMicro' ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1646:1: ( 'compatMicro' )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1646:1: ( 'compatMicro' )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1647:1: 'compatMicro'
            {
             before(grammarAccess.getOnLoadBlocAccess().getCompatMicroKeyword_18()); 
            match(input,39,FOLLOW_39_in_rule__OnLoadBloc__Group__18__Impl3371); 
             after(grammarAccess.getOnLoadBlocAccess().getCompatMicroKeyword_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnLoadBloc__Group__18__Impl"


    // $ANTLR start "rule__OnLoadBloc__Group__19"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1660:1: rule__OnLoadBloc__Group__19 : rule__OnLoadBloc__Group__19__Impl rule__OnLoadBloc__Group__20 ;
    public final void rule__OnLoadBloc__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1664:1: ( rule__OnLoadBloc__Group__19__Impl rule__OnLoadBloc__Group__20 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1665:2: rule__OnLoadBloc__Group__19__Impl rule__OnLoadBloc__Group__20
            {
            pushFollow(FOLLOW_rule__OnLoadBloc__Group__19__Impl_in_rule__OnLoadBloc__Group__193402);
            rule__OnLoadBloc__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OnLoadBloc__Group__20_in_rule__OnLoadBloc__Group__193405);
            rule__OnLoadBloc__Group__20();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnLoadBloc__Group__19"


    // $ANTLR start "rule__OnLoadBloc__Group__19__Impl"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1672:1: rule__OnLoadBloc__Group__19__Impl : ( '=' ) ;
    public final void rule__OnLoadBloc__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1676:1: ( ( '=' ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1677:1: ( '=' )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1677:1: ( '=' )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1678:1: '='
            {
             before(grammarAccess.getOnLoadBlocAccess().getEqualsSignKeyword_19()); 
            match(input,34,FOLLOW_34_in_rule__OnLoadBloc__Group__19__Impl3433); 
             after(grammarAccess.getOnLoadBlocAccess().getEqualsSignKeyword_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnLoadBloc__Group__19__Impl"


    // $ANTLR start "rule__OnLoadBloc__Group__20"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1691:1: rule__OnLoadBloc__Group__20 : rule__OnLoadBloc__Group__20__Impl rule__OnLoadBloc__Group__21 ;
    public final void rule__OnLoadBloc__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1695:1: ( rule__OnLoadBloc__Group__20__Impl rule__OnLoadBloc__Group__21 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1696:2: rule__OnLoadBloc__Group__20__Impl rule__OnLoadBloc__Group__21
            {
            pushFollow(FOLLOW_rule__OnLoadBloc__Group__20__Impl_in_rule__OnLoadBloc__Group__203464);
            rule__OnLoadBloc__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OnLoadBloc__Group__21_in_rule__OnLoadBloc__Group__203467);
            rule__OnLoadBloc__Group__21();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnLoadBloc__Group__20"


    // $ANTLR start "rule__OnLoadBloc__Group__20__Impl"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1703:1: rule__OnLoadBloc__Group__20__Impl : ( ( rule__OnLoadBloc__Alternatives_20 ) ) ;
    public final void rule__OnLoadBloc__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1707:1: ( ( ( rule__OnLoadBloc__Alternatives_20 ) ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1708:1: ( ( rule__OnLoadBloc__Alternatives_20 ) )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1708:1: ( ( rule__OnLoadBloc__Alternatives_20 ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1709:1: ( rule__OnLoadBloc__Alternatives_20 )
            {
             before(grammarAccess.getOnLoadBlocAccess().getAlternatives_20()); 
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1710:1: ( rule__OnLoadBloc__Alternatives_20 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1710:2: rule__OnLoadBloc__Alternatives_20
            {
            pushFollow(FOLLOW_rule__OnLoadBloc__Alternatives_20_in_rule__OnLoadBloc__Group__20__Impl3494);
            rule__OnLoadBloc__Alternatives_20();

            state._fsp--;


            }

             after(grammarAccess.getOnLoadBlocAccess().getAlternatives_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnLoadBloc__Group__20__Impl"


    // $ANTLR start "rule__OnLoadBloc__Group__21"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1720:1: rule__OnLoadBloc__Group__21 : rule__OnLoadBloc__Group__21__Impl rule__OnLoadBloc__Group__22 ;
    public final void rule__OnLoadBloc__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1724:1: ( rule__OnLoadBloc__Group__21__Impl rule__OnLoadBloc__Group__22 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1725:2: rule__OnLoadBloc__Group__21__Impl rule__OnLoadBloc__Group__22
            {
            pushFollow(FOLLOW_rule__OnLoadBloc__Group__21__Impl_in_rule__OnLoadBloc__Group__213524);
            rule__OnLoadBloc__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OnLoadBloc__Group__22_in_rule__OnLoadBloc__Group__213527);
            rule__OnLoadBloc__Group__22();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnLoadBloc__Group__21"


    // $ANTLR start "rule__OnLoadBloc__Group__21__Impl"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1732:1: rule__OnLoadBloc__Group__21__Impl : ( ';' ) ;
    public final void rule__OnLoadBloc__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1736:1: ( ( ';' ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1737:1: ( ';' )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1737:1: ( ';' )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1738:1: ';'
            {
             before(grammarAccess.getOnLoadBlocAccess().getSemicolonKeyword_21()); 
            match(input,35,FOLLOW_35_in_rule__OnLoadBloc__Group__21__Impl3555); 
             after(grammarAccess.getOnLoadBlocAccess().getSemicolonKeyword_21()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnLoadBloc__Group__21__Impl"


    // $ANTLR start "rule__OnLoadBloc__Group__22"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1751:1: rule__OnLoadBloc__Group__22 : rule__OnLoadBloc__Group__22__Impl ;
    public final void rule__OnLoadBloc__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1755:1: ( rule__OnLoadBloc__Group__22__Impl )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1756:2: rule__OnLoadBloc__Group__22__Impl
            {
            pushFollow(FOLLOW_rule__OnLoadBloc__Group__22__Impl_in_rule__OnLoadBloc__Group__223586);
            rule__OnLoadBloc__Group__22__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnLoadBloc__Group__22"


    // $ANTLR start "rule__OnLoadBloc__Group__22__Impl"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1762:1: rule__OnLoadBloc__Group__22__Impl : ( '}' ) ;
    public final void rule__OnLoadBloc__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1766:1: ( ( '}' ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1767:1: ( '}' )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1767:1: ( '}' )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1768:1: '}'
            {
             before(grammarAccess.getOnLoadBlocAccess().getRightCurlyBracketKeyword_22()); 
            match(input,30,FOLLOW_30_in_rule__OnLoadBloc__Group__22__Impl3614); 
             after(grammarAccess.getOnLoadBlocAccess().getRightCurlyBracketKeyword_22()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnLoadBloc__Group__22__Impl"


    // $ANTLR start "rule__Bloc__Group__0"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1827:1: rule__Bloc__Group__0 : rule__Bloc__Group__0__Impl rule__Bloc__Group__1 ;
    public final void rule__Bloc__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1831:1: ( rule__Bloc__Group__0__Impl rule__Bloc__Group__1 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1832:2: rule__Bloc__Group__0__Impl rule__Bloc__Group__1
            {
            pushFollow(FOLLOW_rule__Bloc__Group__0__Impl_in_rule__Bloc__Group__03691);
            rule__Bloc__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Bloc__Group__1_in_rule__Bloc__Group__03694);
            rule__Bloc__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bloc__Group__0"


    // $ANTLR start "rule__Bloc__Group__0__Impl"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1839:1: rule__Bloc__Group__0__Impl : ( 'bloc #' ) ;
    public final void rule__Bloc__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1843:1: ( ( 'bloc #' ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1844:1: ( 'bloc #' )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1844:1: ( 'bloc #' )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1845:1: 'bloc #'
            {
             before(grammarAccess.getBlocAccess().getBlocKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__Bloc__Group__0__Impl3722); 
             after(grammarAccess.getBlocAccess().getBlocKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bloc__Group__0__Impl"


    // $ANTLR start "rule__Bloc__Group__1"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1858:1: rule__Bloc__Group__1 : rule__Bloc__Group__1__Impl rule__Bloc__Group__2 ;
    public final void rule__Bloc__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1862:1: ( rule__Bloc__Group__1__Impl rule__Bloc__Group__2 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1863:2: rule__Bloc__Group__1__Impl rule__Bloc__Group__2
            {
            pushFollow(FOLLOW_rule__Bloc__Group__1__Impl_in_rule__Bloc__Group__13753);
            rule__Bloc__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Bloc__Group__2_in_rule__Bloc__Group__13756);
            rule__Bloc__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bloc__Group__1"


    // $ANTLR start "rule__Bloc__Group__1__Impl"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1870:1: rule__Bloc__Group__1__Impl : ( ( rule__Bloc__NameAssignment_1 ) ) ;
    public final void rule__Bloc__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1874:1: ( ( ( rule__Bloc__NameAssignment_1 ) ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1875:1: ( ( rule__Bloc__NameAssignment_1 ) )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1875:1: ( ( rule__Bloc__NameAssignment_1 ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1876:1: ( rule__Bloc__NameAssignment_1 )
            {
             before(grammarAccess.getBlocAccess().getNameAssignment_1()); 
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1877:1: ( rule__Bloc__NameAssignment_1 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1877:2: rule__Bloc__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Bloc__NameAssignment_1_in_rule__Bloc__Group__1__Impl3783);
            rule__Bloc__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBlocAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bloc__Group__1__Impl"


    // $ANTLR start "rule__Bloc__Group__2"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1887:1: rule__Bloc__Group__2 : rule__Bloc__Group__2__Impl rule__Bloc__Group__3 ;
    public final void rule__Bloc__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1891:1: ( rule__Bloc__Group__2__Impl rule__Bloc__Group__3 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1892:2: rule__Bloc__Group__2__Impl rule__Bloc__Group__3
            {
            pushFollow(FOLLOW_rule__Bloc__Group__2__Impl_in_rule__Bloc__Group__23813);
            rule__Bloc__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Bloc__Group__3_in_rule__Bloc__Group__23816);
            rule__Bloc__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bloc__Group__2"


    // $ANTLR start "rule__Bloc__Group__2__Impl"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1899:1: rule__Bloc__Group__2__Impl : ( '{' ) ;
    public final void rule__Bloc__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1903:1: ( ( '{' ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1904:1: ( '{' )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1904:1: ( '{' )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1905:1: '{'
            {
             before(grammarAccess.getBlocAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,29,FOLLOW_29_in_rule__Bloc__Group__2__Impl3844); 
             after(grammarAccess.getBlocAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bloc__Group__2__Impl"


    // $ANTLR start "rule__Bloc__Group__3"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1918:1: rule__Bloc__Group__3 : rule__Bloc__Group__3__Impl rule__Bloc__Group__4 ;
    public final void rule__Bloc__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1922:1: ( rule__Bloc__Group__3__Impl rule__Bloc__Group__4 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1923:2: rule__Bloc__Group__3__Impl rule__Bloc__Group__4
            {
            pushFollow(FOLLOW_rule__Bloc__Group__3__Impl_in_rule__Bloc__Group__33875);
            rule__Bloc__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Bloc__Group__4_in_rule__Bloc__Group__33878);
            rule__Bloc__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bloc__Group__3"


    // $ANTLR start "rule__Bloc__Group__3__Impl"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1930:1: rule__Bloc__Group__3__Impl : ( ( rule__Bloc__DirectivesAssignment_3 )* ) ;
    public final void rule__Bloc__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1934:1: ( ( ( rule__Bloc__DirectivesAssignment_3 )* ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1935:1: ( ( rule__Bloc__DirectivesAssignment_3 )* )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1935:1: ( ( rule__Bloc__DirectivesAssignment_3 )* )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1936:1: ( rule__Bloc__DirectivesAssignment_3 )*
            {
             before(grammarAccess.getBlocAccess().getDirectivesAssignment_3()); 
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1937:1: ( rule__Bloc__DirectivesAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==41) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1937:2: rule__Bloc__DirectivesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Bloc__DirectivesAssignment_3_in_rule__Bloc__Group__3__Impl3905);
            	    rule__Bloc__DirectivesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getBlocAccess().getDirectivesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bloc__Group__3__Impl"


    // $ANTLR start "rule__Bloc__Group__4"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1947:1: rule__Bloc__Group__4 : rule__Bloc__Group__4__Impl ;
    public final void rule__Bloc__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1951:1: ( rule__Bloc__Group__4__Impl )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1952:2: rule__Bloc__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Bloc__Group__4__Impl_in_rule__Bloc__Group__43936);
            rule__Bloc__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bloc__Group__4"


    // $ANTLR start "rule__Bloc__Group__4__Impl"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1958:1: rule__Bloc__Group__4__Impl : ( '}' ) ;
    public final void rule__Bloc__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1962:1: ( ( '}' ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1963:1: ( '}' )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1963:1: ( '}' )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1964:1: '}'
            {
             before(grammarAccess.getBlocAccess().getRightCurlyBracketKeyword_4()); 
            match(input,30,FOLLOW_30_in_rule__Bloc__Group__4__Impl3964); 
             after(grammarAccess.getBlocAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bloc__Group__4__Impl"


    // $ANTLR start "rule__Directive__Group__0"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1987:1: rule__Directive__Group__0 : rule__Directive__Group__0__Impl rule__Directive__Group__1 ;
    public final void rule__Directive__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1991:1: ( rule__Directive__Group__0__Impl rule__Directive__Group__1 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1992:2: rule__Directive__Group__0__Impl rule__Directive__Group__1
            {
            pushFollow(FOLLOW_rule__Directive__Group__0__Impl_in_rule__Directive__Group__04005);
            rule__Directive__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Directive__Group__1_in_rule__Directive__Group__04008);
            rule__Directive__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Directive__Group__0"


    // $ANTLR start "rule__Directive__Group__0__Impl"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:1999:1: rule__Directive__Group__0__Impl : ( 'dir' ) ;
    public final void rule__Directive__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2003:1: ( ( 'dir' ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2004:1: ( 'dir' )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2004:1: ( 'dir' )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2005:1: 'dir'
            {
             before(grammarAccess.getDirectiveAccess().getDirKeyword_0()); 
            match(input,41,FOLLOW_41_in_rule__Directive__Group__0__Impl4036); 
             after(grammarAccess.getDirectiveAccess().getDirKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Directive__Group__0__Impl"


    // $ANTLR start "rule__Directive__Group__1"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2018:1: rule__Directive__Group__1 : rule__Directive__Group__1__Impl rule__Directive__Group__2 ;
    public final void rule__Directive__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2022:1: ( rule__Directive__Group__1__Impl rule__Directive__Group__2 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2023:2: rule__Directive__Group__1__Impl rule__Directive__Group__2
            {
            pushFollow(FOLLOW_rule__Directive__Group__1__Impl_in_rule__Directive__Group__14067);
            rule__Directive__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Directive__Group__2_in_rule__Directive__Group__14070);
            rule__Directive__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Directive__Group__1"


    // $ANTLR start "rule__Directive__Group__1__Impl"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2030:1: rule__Directive__Group__1__Impl : ( ( rule__Directive__Alternatives_1 ) ) ;
    public final void rule__Directive__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2034:1: ( ( ( rule__Directive__Alternatives_1 ) ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2035:1: ( ( rule__Directive__Alternatives_1 ) )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2035:1: ( ( rule__Directive__Alternatives_1 ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2036:1: ( rule__Directive__Alternatives_1 )
            {
             before(grammarAccess.getDirectiveAccess().getAlternatives_1()); 
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2037:1: ( rule__Directive__Alternatives_1 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2037:2: rule__Directive__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Directive__Alternatives_1_in_rule__Directive__Group__1__Impl4097);
            rule__Directive__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getDirectiveAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Directive__Group__1__Impl"


    // $ANTLR start "rule__Directive__Group__2"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2047:1: rule__Directive__Group__2 : rule__Directive__Group__2__Impl ;
    public final void rule__Directive__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2051:1: ( rule__Directive__Group__2__Impl )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2052:2: rule__Directive__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Directive__Group__2__Impl_in_rule__Directive__Group__24127);
            rule__Directive__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Directive__Group__2"


    // $ANTLR start "rule__Directive__Group__2__Impl"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2058:1: rule__Directive__Group__2__Impl : ( ';' ) ;
    public final void rule__Directive__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2062:1: ( ( ';' ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2063:1: ( ';' )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2063:1: ( ';' )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2064:1: ';'
            {
             before(grammarAccess.getDirectiveAccess().getSemicolonKeyword_2()); 
            match(input,35,FOLLOW_35_in_rule__Directive__Group__2__Impl4155); 
             after(grammarAccess.getDirectiveAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Directive__Group__2__Impl"


    // $ANTLR start "rule__StrDirective__Group__0"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2083:1: rule__StrDirective__Group__0 : rule__StrDirective__Group__0__Impl rule__StrDirective__Group__1 ;
    public final void rule__StrDirective__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2087:1: ( rule__StrDirective__Group__0__Impl rule__StrDirective__Group__1 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2088:2: rule__StrDirective__Group__0__Impl rule__StrDirective__Group__1
            {
            pushFollow(FOLLOW_rule__StrDirective__Group__0__Impl_in_rule__StrDirective__Group__04192);
            rule__StrDirective__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StrDirective__Group__1_in_rule__StrDirective__Group__04195);
            rule__StrDirective__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StrDirective__Group__0"


    // $ANTLR start "rule__StrDirective__Group__0__Impl"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2095:1: rule__StrDirective__Group__0__Impl : ( ( rule__StrDirective__NameAssignment_0 ) ) ;
    public final void rule__StrDirective__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2099:1: ( ( ( rule__StrDirective__NameAssignment_0 ) ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2100:1: ( ( rule__StrDirective__NameAssignment_0 ) )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2100:1: ( ( rule__StrDirective__NameAssignment_0 ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2101:1: ( rule__StrDirective__NameAssignment_0 )
            {
             before(grammarAccess.getStrDirectiveAccess().getNameAssignment_0()); 
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2102:1: ( rule__StrDirective__NameAssignment_0 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2102:2: rule__StrDirective__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__StrDirective__NameAssignment_0_in_rule__StrDirective__Group__0__Impl4222);
            rule__StrDirective__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStrDirectiveAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StrDirective__Group__0__Impl"


    // $ANTLR start "rule__StrDirective__Group__1"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2112:1: rule__StrDirective__Group__1 : rule__StrDirective__Group__1__Impl rule__StrDirective__Group__2 ;
    public final void rule__StrDirective__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2116:1: ( rule__StrDirective__Group__1__Impl rule__StrDirective__Group__2 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2117:2: rule__StrDirective__Group__1__Impl rule__StrDirective__Group__2
            {
            pushFollow(FOLLOW_rule__StrDirective__Group__1__Impl_in_rule__StrDirective__Group__14252);
            rule__StrDirective__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StrDirective__Group__2_in_rule__StrDirective__Group__14255);
            rule__StrDirective__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StrDirective__Group__1"


    // $ANTLR start "rule__StrDirective__Group__1__Impl"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2124:1: rule__StrDirective__Group__1__Impl : ( ':' ) ;
    public final void rule__StrDirective__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2128:1: ( ( ':' ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2129:1: ( ':' )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2129:1: ( ':' )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2130:1: ':'
            {
             before(grammarAccess.getStrDirectiveAccess().getColonKeyword_1()); 
            match(input,42,FOLLOW_42_in_rule__StrDirective__Group__1__Impl4283); 
             after(grammarAccess.getStrDirectiveAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StrDirective__Group__1__Impl"


    // $ANTLR start "rule__StrDirective__Group__2"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2143:1: rule__StrDirective__Group__2 : rule__StrDirective__Group__2__Impl ;
    public final void rule__StrDirective__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2147:1: ( rule__StrDirective__Group__2__Impl )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2148:2: rule__StrDirective__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__StrDirective__Group__2__Impl_in_rule__StrDirective__Group__24314);
            rule__StrDirective__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StrDirective__Group__2"


    // $ANTLR start "rule__StrDirective__Group__2__Impl"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2154:1: rule__StrDirective__Group__2__Impl : ( ( rule__StrDirective__ValueAssignment_2 ) ) ;
    public final void rule__StrDirective__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2158:1: ( ( ( rule__StrDirective__ValueAssignment_2 ) ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2159:1: ( ( rule__StrDirective__ValueAssignment_2 ) )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2159:1: ( ( rule__StrDirective__ValueAssignment_2 ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2160:1: ( rule__StrDirective__ValueAssignment_2 )
            {
             before(grammarAccess.getStrDirectiveAccess().getValueAssignment_2()); 
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2161:1: ( rule__StrDirective__ValueAssignment_2 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2161:2: rule__StrDirective__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__StrDirective__ValueAssignment_2_in_rule__StrDirective__Group__2__Impl4341);
            rule__StrDirective__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStrDirectiveAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StrDirective__Group__2__Impl"


    // $ANTLR start "rule__IntDirective__Group__0"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2177:1: rule__IntDirective__Group__0 : rule__IntDirective__Group__0__Impl rule__IntDirective__Group__1 ;
    public final void rule__IntDirective__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2181:1: ( rule__IntDirective__Group__0__Impl rule__IntDirective__Group__1 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2182:2: rule__IntDirective__Group__0__Impl rule__IntDirective__Group__1
            {
            pushFollow(FOLLOW_rule__IntDirective__Group__0__Impl_in_rule__IntDirective__Group__04377);
            rule__IntDirective__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IntDirective__Group__1_in_rule__IntDirective__Group__04380);
            rule__IntDirective__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntDirective__Group__0"


    // $ANTLR start "rule__IntDirective__Group__0__Impl"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2189:1: rule__IntDirective__Group__0__Impl : ( ( rule__IntDirective__NameAssignment_0 ) ) ;
    public final void rule__IntDirective__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2193:1: ( ( ( rule__IntDirective__NameAssignment_0 ) ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2194:1: ( ( rule__IntDirective__NameAssignment_0 ) )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2194:1: ( ( rule__IntDirective__NameAssignment_0 ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2195:1: ( rule__IntDirective__NameAssignment_0 )
            {
             before(grammarAccess.getIntDirectiveAccess().getNameAssignment_0()); 
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2196:1: ( rule__IntDirective__NameAssignment_0 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2196:2: rule__IntDirective__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__IntDirective__NameAssignment_0_in_rule__IntDirective__Group__0__Impl4407);
            rule__IntDirective__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getIntDirectiveAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntDirective__Group__0__Impl"


    // $ANTLR start "rule__IntDirective__Group__1"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2206:1: rule__IntDirective__Group__1 : rule__IntDirective__Group__1__Impl rule__IntDirective__Group__2 ;
    public final void rule__IntDirective__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2210:1: ( rule__IntDirective__Group__1__Impl rule__IntDirective__Group__2 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2211:2: rule__IntDirective__Group__1__Impl rule__IntDirective__Group__2
            {
            pushFollow(FOLLOW_rule__IntDirective__Group__1__Impl_in_rule__IntDirective__Group__14437);
            rule__IntDirective__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IntDirective__Group__2_in_rule__IntDirective__Group__14440);
            rule__IntDirective__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntDirective__Group__1"


    // $ANTLR start "rule__IntDirective__Group__1__Impl"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2218:1: rule__IntDirective__Group__1__Impl : ( ':' ) ;
    public final void rule__IntDirective__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2222:1: ( ( ':' ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2223:1: ( ':' )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2223:1: ( ':' )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2224:1: ':'
            {
             before(grammarAccess.getIntDirectiveAccess().getColonKeyword_1()); 
            match(input,42,FOLLOW_42_in_rule__IntDirective__Group__1__Impl4468); 
             after(grammarAccess.getIntDirectiveAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntDirective__Group__1__Impl"


    // $ANTLR start "rule__IntDirective__Group__2"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2237:1: rule__IntDirective__Group__2 : rule__IntDirective__Group__2__Impl ;
    public final void rule__IntDirective__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2241:1: ( rule__IntDirective__Group__2__Impl )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2242:2: rule__IntDirective__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__IntDirective__Group__2__Impl_in_rule__IntDirective__Group__24499);
            rule__IntDirective__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntDirective__Group__2"


    // $ANTLR start "rule__IntDirective__Group__2__Impl"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2248:1: rule__IntDirective__Group__2__Impl : ( ( rule__IntDirective__ValueAssignment_2 ) ) ;
    public final void rule__IntDirective__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2252:1: ( ( ( rule__IntDirective__ValueAssignment_2 ) ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2253:1: ( ( rule__IntDirective__ValueAssignment_2 ) )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2253:1: ( ( rule__IntDirective__ValueAssignment_2 ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2254:1: ( rule__IntDirective__ValueAssignment_2 )
            {
             before(grammarAccess.getIntDirectiveAccess().getValueAssignment_2()); 
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2255:1: ( rule__IntDirective__ValueAssignment_2 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2255:2: rule__IntDirective__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__IntDirective__ValueAssignment_2_in_rule__IntDirective__Group__2__Impl4526);
            rule__IntDirective__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIntDirectiveAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntDirective__Group__2__Impl"


    // $ANTLR start "rule__VarDirective__Group__0"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2271:1: rule__VarDirective__Group__0 : rule__VarDirective__Group__0__Impl rule__VarDirective__Group__1 ;
    public final void rule__VarDirective__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2275:1: ( rule__VarDirective__Group__0__Impl rule__VarDirective__Group__1 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2276:2: rule__VarDirective__Group__0__Impl rule__VarDirective__Group__1
            {
            pushFollow(FOLLOW_rule__VarDirective__Group__0__Impl_in_rule__VarDirective__Group__04562);
            rule__VarDirective__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VarDirective__Group__1_in_rule__VarDirective__Group__04565);
            rule__VarDirective__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDirective__Group__0"


    // $ANTLR start "rule__VarDirective__Group__0__Impl"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2283:1: rule__VarDirective__Group__0__Impl : ( ( rule__VarDirective__NameAssignment_0 ) ) ;
    public final void rule__VarDirective__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2287:1: ( ( ( rule__VarDirective__NameAssignment_0 ) ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2288:1: ( ( rule__VarDirective__NameAssignment_0 ) )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2288:1: ( ( rule__VarDirective__NameAssignment_0 ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2289:1: ( rule__VarDirective__NameAssignment_0 )
            {
             before(grammarAccess.getVarDirectiveAccess().getNameAssignment_0()); 
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2290:1: ( rule__VarDirective__NameAssignment_0 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2290:2: rule__VarDirective__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__VarDirective__NameAssignment_0_in_rule__VarDirective__Group__0__Impl4592);
            rule__VarDirective__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVarDirectiveAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDirective__Group__0__Impl"


    // $ANTLR start "rule__VarDirective__Group__1"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2300:1: rule__VarDirective__Group__1 : rule__VarDirective__Group__1__Impl rule__VarDirective__Group__2 ;
    public final void rule__VarDirective__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2304:1: ( rule__VarDirective__Group__1__Impl rule__VarDirective__Group__2 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2305:2: rule__VarDirective__Group__1__Impl rule__VarDirective__Group__2
            {
            pushFollow(FOLLOW_rule__VarDirective__Group__1__Impl_in_rule__VarDirective__Group__14622);
            rule__VarDirective__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VarDirective__Group__2_in_rule__VarDirective__Group__14625);
            rule__VarDirective__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDirective__Group__1"


    // $ANTLR start "rule__VarDirective__Group__1__Impl"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2312:1: rule__VarDirective__Group__1__Impl : ( ':' ) ;
    public final void rule__VarDirective__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2316:1: ( ( ':' ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2317:1: ( ':' )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2317:1: ( ':' )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2318:1: ':'
            {
             before(grammarAccess.getVarDirectiveAccess().getColonKeyword_1()); 
            match(input,42,FOLLOW_42_in_rule__VarDirective__Group__1__Impl4653); 
             after(grammarAccess.getVarDirectiveAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDirective__Group__1__Impl"


    // $ANTLR start "rule__VarDirective__Group__2"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2331:1: rule__VarDirective__Group__2 : rule__VarDirective__Group__2__Impl rule__VarDirective__Group__3 ;
    public final void rule__VarDirective__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2335:1: ( rule__VarDirective__Group__2__Impl rule__VarDirective__Group__3 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2336:2: rule__VarDirective__Group__2__Impl rule__VarDirective__Group__3
            {
            pushFollow(FOLLOW_rule__VarDirective__Group__2__Impl_in_rule__VarDirective__Group__24684);
            rule__VarDirective__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VarDirective__Group__3_in_rule__VarDirective__Group__24687);
            rule__VarDirective__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDirective__Group__2"


    // $ANTLR start "rule__VarDirective__Group__2__Impl"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2343:1: rule__VarDirective__Group__2__Impl : ( ( rule__VarDirective__LeftAssignment_2 ) ) ;
    public final void rule__VarDirective__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2347:1: ( ( ( rule__VarDirective__LeftAssignment_2 ) ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2348:1: ( ( rule__VarDirective__LeftAssignment_2 ) )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2348:1: ( ( rule__VarDirective__LeftAssignment_2 ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2349:1: ( rule__VarDirective__LeftAssignment_2 )
            {
             before(grammarAccess.getVarDirectiveAccess().getLeftAssignment_2()); 
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2350:1: ( rule__VarDirective__LeftAssignment_2 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2350:2: rule__VarDirective__LeftAssignment_2
            {
            pushFollow(FOLLOW_rule__VarDirective__LeftAssignment_2_in_rule__VarDirective__Group__2__Impl4714);
            rule__VarDirective__LeftAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVarDirectiveAccess().getLeftAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDirective__Group__2__Impl"


    // $ANTLR start "rule__VarDirective__Group__3"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2360:1: rule__VarDirective__Group__3 : rule__VarDirective__Group__3__Impl rule__VarDirective__Group__4 ;
    public final void rule__VarDirective__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2364:1: ( rule__VarDirective__Group__3__Impl rule__VarDirective__Group__4 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2365:2: rule__VarDirective__Group__3__Impl rule__VarDirective__Group__4
            {
            pushFollow(FOLLOW_rule__VarDirective__Group__3__Impl_in_rule__VarDirective__Group__34744);
            rule__VarDirective__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VarDirective__Group__4_in_rule__VarDirective__Group__34747);
            rule__VarDirective__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDirective__Group__3"


    // $ANTLR start "rule__VarDirective__Group__3__Impl"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2372:1: rule__VarDirective__Group__3__Impl : ( '=' ) ;
    public final void rule__VarDirective__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2376:1: ( ( '=' ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2377:1: ( '=' )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2377:1: ( '=' )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2378:1: '='
            {
             before(grammarAccess.getVarDirectiveAccess().getEqualsSignKeyword_3()); 
            match(input,34,FOLLOW_34_in_rule__VarDirective__Group__3__Impl4775); 
             after(grammarAccess.getVarDirectiveAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDirective__Group__3__Impl"


    // $ANTLR start "rule__VarDirective__Group__4"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2391:1: rule__VarDirective__Group__4 : rule__VarDirective__Group__4__Impl ;
    public final void rule__VarDirective__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2395:1: ( rule__VarDirective__Group__4__Impl )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2396:2: rule__VarDirective__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__VarDirective__Group__4__Impl_in_rule__VarDirective__Group__44806);
            rule__VarDirective__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDirective__Group__4"


    // $ANTLR start "rule__VarDirective__Group__4__Impl"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2402:1: rule__VarDirective__Group__4__Impl : ( ( rule__VarDirective__RightAssignment_4 ) ) ;
    public final void rule__VarDirective__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2406:1: ( ( ( rule__VarDirective__RightAssignment_4 ) ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2407:1: ( ( rule__VarDirective__RightAssignment_4 ) )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2407:1: ( ( rule__VarDirective__RightAssignment_4 ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2408:1: ( rule__VarDirective__RightAssignment_4 )
            {
             before(grammarAccess.getVarDirectiveAccess().getRightAssignment_4()); 
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2409:1: ( rule__VarDirective__RightAssignment_4 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2409:2: rule__VarDirective__RightAssignment_4
            {
            pushFollow(FOLLOW_rule__VarDirective__RightAssignment_4_in_rule__VarDirective__Group__4__Impl4833);
            rule__VarDirective__RightAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getVarDirectiveAccess().getRightAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDirective__Group__4__Impl"


    // $ANTLR start "rule__IfDirective__Group__0"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2429:1: rule__IfDirective__Group__0 : rule__IfDirective__Group__0__Impl rule__IfDirective__Group__1 ;
    public final void rule__IfDirective__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2433:1: ( rule__IfDirective__Group__0__Impl rule__IfDirective__Group__1 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2434:2: rule__IfDirective__Group__0__Impl rule__IfDirective__Group__1
            {
            pushFollow(FOLLOW_rule__IfDirective__Group__0__Impl_in_rule__IfDirective__Group__04873);
            rule__IfDirective__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfDirective__Group__1_in_rule__IfDirective__Group__04876);
            rule__IfDirective__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfDirective__Group__0"


    // $ANTLR start "rule__IfDirective__Group__0__Impl"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2441:1: rule__IfDirective__Group__0__Impl : ( ( rule__IfDirective__NameAssignment_0 ) ) ;
    public final void rule__IfDirective__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2445:1: ( ( ( rule__IfDirective__NameAssignment_0 ) ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2446:1: ( ( rule__IfDirective__NameAssignment_0 ) )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2446:1: ( ( rule__IfDirective__NameAssignment_0 ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2447:1: ( rule__IfDirective__NameAssignment_0 )
            {
             before(grammarAccess.getIfDirectiveAccess().getNameAssignment_0()); 
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2448:1: ( rule__IfDirective__NameAssignment_0 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2448:2: rule__IfDirective__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__IfDirective__NameAssignment_0_in_rule__IfDirective__Group__0__Impl4903);
            rule__IfDirective__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getIfDirectiveAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfDirective__Group__0__Impl"


    // $ANTLR start "rule__IfDirective__Group__1"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2458:1: rule__IfDirective__Group__1 : rule__IfDirective__Group__1__Impl rule__IfDirective__Group__2 ;
    public final void rule__IfDirective__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2462:1: ( rule__IfDirective__Group__1__Impl rule__IfDirective__Group__2 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2463:2: rule__IfDirective__Group__1__Impl rule__IfDirective__Group__2
            {
            pushFollow(FOLLOW_rule__IfDirective__Group__1__Impl_in_rule__IfDirective__Group__14933);
            rule__IfDirective__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfDirective__Group__2_in_rule__IfDirective__Group__14936);
            rule__IfDirective__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfDirective__Group__1"


    // $ANTLR start "rule__IfDirective__Group__1__Impl"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2470:1: rule__IfDirective__Group__1__Impl : ( '(' ) ;
    public final void rule__IfDirective__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2474:1: ( ( '(' ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2475:1: ( '(' )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2475:1: ( '(' )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2476:1: '('
            {
             before(grammarAccess.getIfDirectiveAccess().getLeftParenthesisKeyword_1()); 
            match(input,43,FOLLOW_43_in_rule__IfDirective__Group__1__Impl4964); 
             after(grammarAccess.getIfDirectiveAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfDirective__Group__1__Impl"


    // $ANTLR start "rule__IfDirective__Group__2"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2489:1: rule__IfDirective__Group__2 : rule__IfDirective__Group__2__Impl rule__IfDirective__Group__3 ;
    public final void rule__IfDirective__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2493:1: ( rule__IfDirective__Group__2__Impl rule__IfDirective__Group__3 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2494:2: rule__IfDirective__Group__2__Impl rule__IfDirective__Group__3
            {
            pushFollow(FOLLOW_rule__IfDirective__Group__2__Impl_in_rule__IfDirective__Group__24995);
            rule__IfDirective__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfDirective__Group__3_in_rule__IfDirective__Group__24998);
            rule__IfDirective__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfDirective__Group__2"


    // $ANTLR start "rule__IfDirective__Group__2__Impl"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2501:1: rule__IfDirective__Group__2__Impl : ( ( rule__IfDirective__LeftAssignment_2 ) ) ;
    public final void rule__IfDirective__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2505:1: ( ( ( rule__IfDirective__LeftAssignment_2 ) ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2506:1: ( ( rule__IfDirective__LeftAssignment_2 ) )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2506:1: ( ( rule__IfDirective__LeftAssignment_2 ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2507:1: ( rule__IfDirective__LeftAssignment_2 )
            {
             before(grammarAccess.getIfDirectiveAccess().getLeftAssignment_2()); 
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2508:1: ( rule__IfDirective__LeftAssignment_2 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2508:2: rule__IfDirective__LeftAssignment_2
            {
            pushFollow(FOLLOW_rule__IfDirective__LeftAssignment_2_in_rule__IfDirective__Group__2__Impl5025);
            rule__IfDirective__LeftAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIfDirectiveAccess().getLeftAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfDirective__Group__2__Impl"


    // $ANTLR start "rule__IfDirective__Group__3"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2518:1: rule__IfDirective__Group__3 : rule__IfDirective__Group__3__Impl rule__IfDirective__Group__4 ;
    public final void rule__IfDirective__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2522:1: ( rule__IfDirective__Group__3__Impl rule__IfDirective__Group__4 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2523:2: rule__IfDirective__Group__3__Impl rule__IfDirective__Group__4
            {
            pushFollow(FOLLOW_rule__IfDirective__Group__3__Impl_in_rule__IfDirective__Group__35055);
            rule__IfDirective__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfDirective__Group__4_in_rule__IfDirective__Group__35058);
            rule__IfDirective__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfDirective__Group__3"


    // $ANTLR start "rule__IfDirective__Group__3__Impl"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2530:1: rule__IfDirective__Group__3__Impl : ( ( rule__IfDirective__OperatorAssignment_3 ) ) ;
    public final void rule__IfDirective__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2534:1: ( ( ( rule__IfDirective__OperatorAssignment_3 ) ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2535:1: ( ( rule__IfDirective__OperatorAssignment_3 ) )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2535:1: ( ( rule__IfDirective__OperatorAssignment_3 ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2536:1: ( rule__IfDirective__OperatorAssignment_3 )
            {
             before(grammarAccess.getIfDirectiveAccess().getOperatorAssignment_3()); 
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2537:1: ( rule__IfDirective__OperatorAssignment_3 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2537:2: rule__IfDirective__OperatorAssignment_3
            {
            pushFollow(FOLLOW_rule__IfDirective__OperatorAssignment_3_in_rule__IfDirective__Group__3__Impl5085);
            rule__IfDirective__OperatorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getIfDirectiveAccess().getOperatorAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfDirective__Group__3__Impl"


    // $ANTLR start "rule__IfDirective__Group__4"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2547:1: rule__IfDirective__Group__4 : rule__IfDirective__Group__4__Impl rule__IfDirective__Group__5 ;
    public final void rule__IfDirective__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2551:1: ( rule__IfDirective__Group__4__Impl rule__IfDirective__Group__5 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2552:2: rule__IfDirective__Group__4__Impl rule__IfDirective__Group__5
            {
            pushFollow(FOLLOW_rule__IfDirective__Group__4__Impl_in_rule__IfDirective__Group__45115);
            rule__IfDirective__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfDirective__Group__5_in_rule__IfDirective__Group__45118);
            rule__IfDirective__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfDirective__Group__4"


    // $ANTLR start "rule__IfDirective__Group__4__Impl"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2559:1: rule__IfDirective__Group__4__Impl : ( ( rule__IfDirective__RightAssignment_4 ) ) ;
    public final void rule__IfDirective__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2563:1: ( ( ( rule__IfDirective__RightAssignment_4 ) ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2564:1: ( ( rule__IfDirective__RightAssignment_4 ) )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2564:1: ( ( rule__IfDirective__RightAssignment_4 ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2565:1: ( rule__IfDirective__RightAssignment_4 )
            {
             before(grammarAccess.getIfDirectiveAccess().getRightAssignment_4()); 
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2566:1: ( rule__IfDirective__RightAssignment_4 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2566:2: rule__IfDirective__RightAssignment_4
            {
            pushFollow(FOLLOW_rule__IfDirective__RightAssignment_4_in_rule__IfDirective__Group__4__Impl5145);
            rule__IfDirective__RightAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getIfDirectiveAccess().getRightAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfDirective__Group__4__Impl"


    // $ANTLR start "rule__IfDirective__Group__5"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2576:1: rule__IfDirective__Group__5 : rule__IfDirective__Group__5__Impl rule__IfDirective__Group__6 ;
    public final void rule__IfDirective__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2580:1: ( rule__IfDirective__Group__5__Impl rule__IfDirective__Group__6 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2581:2: rule__IfDirective__Group__5__Impl rule__IfDirective__Group__6
            {
            pushFollow(FOLLOW_rule__IfDirective__Group__5__Impl_in_rule__IfDirective__Group__55175);
            rule__IfDirective__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfDirective__Group__6_in_rule__IfDirective__Group__55178);
            rule__IfDirective__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfDirective__Group__5"


    // $ANTLR start "rule__IfDirective__Group__5__Impl"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2588:1: rule__IfDirective__Group__5__Impl : ( ')' ) ;
    public final void rule__IfDirective__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2592:1: ( ( ')' ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2593:1: ( ')' )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2593:1: ( ')' )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2594:1: ')'
            {
             before(grammarAccess.getIfDirectiveAccess().getRightParenthesisKeyword_5()); 
            match(input,44,FOLLOW_44_in_rule__IfDirective__Group__5__Impl5206); 
             after(grammarAccess.getIfDirectiveAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfDirective__Group__5__Impl"


    // $ANTLR start "rule__IfDirective__Group__6"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2607:1: rule__IfDirective__Group__6 : rule__IfDirective__Group__6__Impl rule__IfDirective__Group__7 ;
    public final void rule__IfDirective__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2611:1: ( rule__IfDirective__Group__6__Impl rule__IfDirective__Group__7 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2612:2: rule__IfDirective__Group__6__Impl rule__IfDirective__Group__7
            {
            pushFollow(FOLLOW_rule__IfDirective__Group__6__Impl_in_rule__IfDirective__Group__65237);
            rule__IfDirective__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfDirective__Group__7_in_rule__IfDirective__Group__65240);
            rule__IfDirective__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfDirective__Group__6"


    // $ANTLR start "rule__IfDirective__Group__6__Impl"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2619:1: rule__IfDirective__Group__6__Impl : ( ( '{' )? ) ;
    public final void rule__IfDirective__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2623:1: ( ( ( '{' )? ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2624:1: ( ( '{' )? )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2624:1: ( ( '{' )? )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2625:1: ( '{' )?
            {
             before(grammarAccess.getIfDirectiveAccess().getLeftCurlyBracketKeyword_6()); 
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2626:1: ( '{' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==29) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2627:2: '{'
                    {
                    match(input,29,FOLLOW_29_in_rule__IfDirective__Group__6__Impl5269); 

                    }
                    break;

            }

             after(grammarAccess.getIfDirectiveAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfDirective__Group__6__Impl"


    // $ANTLR start "rule__IfDirective__Group__7"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2638:1: rule__IfDirective__Group__7 : rule__IfDirective__Group__7__Impl rule__IfDirective__Group__8 ;
    public final void rule__IfDirective__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2642:1: ( rule__IfDirective__Group__7__Impl rule__IfDirective__Group__8 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2643:2: rule__IfDirective__Group__7__Impl rule__IfDirective__Group__8
            {
            pushFollow(FOLLOW_rule__IfDirective__Group__7__Impl_in_rule__IfDirective__Group__75302);
            rule__IfDirective__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfDirective__Group__8_in_rule__IfDirective__Group__75305);
            rule__IfDirective__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfDirective__Group__7"


    // $ANTLR start "rule__IfDirective__Group__7__Impl"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2650:1: rule__IfDirective__Group__7__Impl : ( ( rule__IfDirective__DirectivesAssignment_7 )* ) ;
    public final void rule__IfDirective__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2654:1: ( ( ( rule__IfDirective__DirectivesAssignment_7 )* ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2655:1: ( ( rule__IfDirective__DirectivesAssignment_7 )* )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2655:1: ( ( rule__IfDirective__DirectivesAssignment_7 )* )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2656:1: ( rule__IfDirective__DirectivesAssignment_7 )*
            {
             before(grammarAccess.getIfDirectiveAccess().getDirectivesAssignment_7()); 
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2657:1: ( rule__IfDirective__DirectivesAssignment_7 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==41) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2657:2: rule__IfDirective__DirectivesAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__IfDirective__DirectivesAssignment_7_in_rule__IfDirective__Group__7__Impl5332);
            	    rule__IfDirective__DirectivesAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getIfDirectiveAccess().getDirectivesAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfDirective__Group__7__Impl"


    // $ANTLR start "rule__IfDirective__Group__8"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2667:1: rule__IfDirective__Group__8 : rule__IfDirective__Group__8__Impl ;
    public final void rule__IfDirective__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2671:1: ( rule__IfDirective__Group__8__Impl )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2672:2: rule__IfDirective__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__IfDirective__Group__8__Impl_in_rule__IfDirective__Group__85363);
            rule__IfDirective__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfDirective__Group__8"


    // $ANTLR start "rule__IfDirective__Group__8__Impl"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2678:1: rule__IfDirective__Group__8__Impl : ( ( '}' )? ) ;
    public final void rule__IfDirective__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2682:1: ( ( ( '}' )? ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2683:1: ( ( '}' )? )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2683:1: ( ( '}' )? )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2684:1: ( '}' )?
            {
             before(grammarAccess.getIfDirectiveAccess().getRightCurlyBracketKeyword_8()); 
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2685:1: ( '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2686:2: '}'
                    {
                    match(input,30,FOLLOW_30_in_rule__IfDirective__Group__8__Impl5392); 

                    }
                    break;

            }

             after(grammarAccess.getIfDirectiveAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfDirective__Group__8__Impl"


    // $ANTLR start "rule__WaitDirective__Group__0"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2715:1: rule__WaitDirective__Group__0 : rule__WaitDirective__Group__0__Impl rule__WaitDirective__Group__1 ;
    public final void rule__WaitDirective__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2719:1: ( rule__WaitDirective__Group__0__Impl rule__WaitDirective__Group__1 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2720:2: rule__WaitDirective__Group__0__Impl rule__WaitDirective__Group__1
            {
            pushFollow(FOLLOW_rule__WaitDirective__Group__0__Impl_in_rule__WaitDirective__Group__05443);
            rule__WaitDirective__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WaitDirective__Group__1_in_rule__WaitDirective__Group__05446);
            rule__WaitDirective__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WaitDirective__Group__0"


    // $ANTLR start "rule__WaitDirective__Group__0__Impl"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2727:1: rule__WaitDirective__Group__0__Impl : ( ( rule__WaitDirective__NameAssignment_0 ) ) ;
    public final void rule__WaitDirective__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2731:1: ( ( ( rule__WaitDirective__NameAssignment_0 ) ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2732:1: ( ( rule__WaitDirective__NameAssignment_0 ) )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2732:1: ( ( rule__WaitDirective__NameAssignment_0 ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2733:1: ( rule__WaitDirective__NameAssignment_0 )
            {
             before(grammarAccess.getWaitDirectiveAccess().getNameAssignment_0()); 
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2734:1: ( rule__WaitDirective__NameAssignment_0 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2734:2: rule__WaitDirective__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__WaitDirective__NameAssignment_0_in_rule__WaitDirective__Group__0__Impl5473);
            rule__WaitDirective__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getWaitDirectiveAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WaitDirective__Group__0__Impl"


    // $ANTLR start "rule__WaitDirective__Group__1"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2744:1: rule__WaitDirective__Group__1 : rule__WaitDirective__Group__1__Impl rule__WaitDirective__Group__2 ;
    public final void rule__WaitDirective__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2748:1: ( rule__WaitDirective__Group__1__Impl rule__WaitDirective__Group__2 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2749:2: rule__WaitDirective__Group__1__Impl rule__WaitDirective__Group__2
            {
            pushFollow(FOLLOW_rule__WaitDirective__Group__1__Impl_in_rule__WaitDirective__Group__15503);
            rule__WaitDirective__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WaitDirective__Group__2_in_rule__WaitDirective__Group__15506);
            rule__WaitDirective__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WaitDirective__Group__1"


    // $ANTLR start "rule__WaitDirective__Group__1__Impl"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2756:1: rule__WaitDirective__Group__1__Impl : ( '(' ) ;
    public final void rule__WaitDirective__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2760:1: ( ( '(' ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2761:1: ( '(' )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2761:1: ( '(' )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2762:1: '('
            {
             before(grammarAccess.getWaitDirectiveAccess().getLeftParenthesisKeyword_1()); 
            match(input,43,FOLLOW_43_in_rule__WaitDirective__Group__1__Impl5534); 
             after(grammarAccess.getWaitDirectiveAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WaitDirective__Group__1__Impl"


    // $ANTLR start "rule__WaitDirective__Group__2"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2775:1: rule__WaitDirective__Group__2 : rule__WaitDirective__Group__2__Impl rule__WaitDirective__Group__3 ;
    public final void rule__WaitDirective__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2779:1: ( rule__WaitDirective__Group__2__Impl rule__WaitDirective__Group__3 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2780:2: rule__WaitDirective__Group__2__Impl rule__WaitDirective__Group__3
            {
            pushFollow(FOLLOW_rule__WaitDirective__Group__2__Impl_in_rule__WaitDirective__Group__25565);
            rule__WaitDirective__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__WaitDirective__Group__3_in_rule__WaitDirective__Group__25568);
            rule__WaitDirective__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WaitDirective__Group__2"


    // $ANTLR start "rule__WaitDirective__Group__2__Impl"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2787:1: rule__WaitDirective__Group__2__Impl : ( ( rule__WaitDirective__TimeAssignment_2 ) ) ;
    public final void rule__WaitDirective__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2791:1: ( ( ( rule__WaitDirective__TimeAssignment_2 ) ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2792:1: ( ( rule__WaitDirective__TimeAssignment_2 ) )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2792:1: ( ( rule__WaitDirective__TimeAssignment_2 ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2793:1: ( rule__WaitDirective__TimeAssignment_2 )
            {
             before(grammarAccess.getWaitDirectiveAccess().getTimeAssignment_2()); 
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2794:1: ( rule__WaitDirective__TimeAssignment_2 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2794:2: rule__WaitDirective__TimeAssignment_2
            {
            pushFollow(FOLLOW_rule__WaitDirective__TimeAssignment_2_in_rule__WaitDirective__Group__2__Impl5595);
            rule__WaitDirective__TimeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWaitDirectiveAccess().getTimeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WaitDirective__Group__2__Impl"


    // $ANTLR start "rule__WaitDirective__Group__3"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2804:1: rule__WaitDirective__Group__3 : rule__WaitDirective__Group__3__Impl ;
    public final void rule__WaitDirective__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2808:1: ( rule__WaitDirective__Group__3__Impl )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2809:2: rule__WaitDirective__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__WaitDirective__Group__3__Impl_in_rule__WaitDirective__Group__35625);
            rule__WaitDirective__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WaitDirective__Group__3"


    // $ANTLR start "rule__WaitDirective__Group__3__Impl"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2815:1: rule__WaitDirective__Group__3__Impl : ( ')' ) ;
    public final void rule__WaitDirective__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2819:1: ( ( ')' ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2820:1: ( ')' )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2820:1: ( ')' )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2821:1: ')'
            {
             before(grammarAccess.getWaitDirectiveAccess().getRightParenthesisKeyword_3()); 
            match(input,44,FOLLOW_44_in_rule__WaitDirective__Group__3__Impl5653); 
             after(grammarAccess.getWaitDirectiveAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WaitDirective__Group__3__Impl"


    // $ANTLR start "rule__LockDirective__Group__0"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2842:1: rule__LockDirective__Group__0 : rule__LockDirective__Group__0__Impl rule__LockDirective__Group__1 ;
    public final void rule__LockDirective__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2846:1: ( rule__LockDirective__Group__0__Impl rule__LockDirective__Group__1 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2847:2: rule__LockDirective__Group__0__Impl rule__LockDirective__Group__1
            {
            pushFollow(FOLLOW_rule__LockDirective__Group__0__Impl_in_rule__LockDirective__Group__05692);
            rule__LockDirective__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LockDirective__Group__1_in_rule__LockDirective__Group__05695);
            rule__LockDirective__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LockDirective__Group__0"


    // $ANTLR start "rule__LockDirective__Group__0__Impl"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2854:1: rule__LockDirective__Group__0__Impl : ( ( rule__LockDirective__NameAssignment_0 ) ) ;
    public final void rule__LockDirective__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2858:1: ( ( ( rule__LockDirective__NameAssignment_0 ) ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2859:1: ( ( rule__LockDirective__NameAssignment_0 ) )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2859:1: ( ( rule__LockDirective__NameAssignment_0 ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2860:1: ( rule__LockDirective__NameAssignment_0 )
            {
             before(grammarAccess.getLockDirectiveAccess().getNameAssignment_0()); 
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2861:1: ( rule__LockDirective__NameAssignment_0 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2861:2: rule__LockDirective__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__LockDirective__NameAssignment_0_in_rule__LockDirective__Group__0__Impl5722);
            rule__LockDirective__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLockDirectiveAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LockDirective__Group__0__Impl"


    // $ANTLR start "rule__LockDirective__Group__1"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2871:1: rule__LockDirective__Group__1 : rule__LockDirective__Group__1__Impl rule__LockDirective__Group__2 ;
    public final void rule__LockDirective__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2875:1: ( rule__LockDirective__Group__1__Impl rule__LockDirective__Group__2 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2876:2: rule__LockDirective__Group__1__Impl rule__LockDirective__Group__2
            {
            pushFollow(FOLLOW_rule__LockDirective__Group__1__Impl_in_rule__LockDirective__Group__15752);
            rule__LockDirective__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LockDirective__Group__2_in_rule__LockDirective__Group__15755);
            rule__LockDirective__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LockDirective__Group__1"


    // $ANTLR start "rule__LockDirective__Group__1__Impl"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2883:1: rule__LockDirective__Group__1__Impl : ( '(' ) ;
    public final void rule__LockDirective__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2887:1: ( ( '(' ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2888:1: ( '(' )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2888:1: ( '(' )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2889:1: '('
            {
             before(grammarAccess.getLockDirectiveAccess().getLeftParenthesisKeyword_1()); 
            match(input,43,FOLLOW_43_in_rule__LockDirective__Group__1__Impl5783); 
             after(grammarAccess.getLockDirectiveAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LockDirective__Group__1__Impl"


    // $ANTLR start "rule__LockDirective__Group__2"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2902:1: rule__LockDirective__Group__2 : rule__LockDirective__Group__2__Impl rule__LockDirective__Group__3 ;
    public final void rule__LockDirective__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2906:1: ( rule__LockDirective__Group__2__Impl rule__LockDirective__Group__3 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2907:2: rule__LockDirective__Group__2__Impl rule__LockDirective__Group__3
            {
            pushFollow(FOLLOW_rule__LockDirective__Group__2__Impl_in_rule__LockDirective__Group__25814);
            rule__LockDirective__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LockDirective__Group__3_in_rule__LockDirective__Group__25817);
            rule__LockDirective__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LockDirective__Group__2"


    // $ANTLR start "rule__LockDirective__Group__2__Impl"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2914:1: rule__LockDirective__Group__2__Impl : ( ( rule__LockDirective__VariableAssignment_2 ) ) ;
    public final void rule__LockDirective__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2918:1: ( ( ( rule__LockDirective__VariableAssignment_2 ) ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2919:1: ( ( rule__LockDirective__VariableAssignment_2 ) )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2919:1: ( ( rule__LockDirective__VariableAssignment_2 ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2920:1: ( rule__LockDirective__VariableAssignment_2 )
            {
             before(grammarAccess.getLockDirectiveAccess().getVariableAssignment_2()); 
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2921:1: ( rule__LockDirective__VariableAssignment_2 )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2921:2: rule__LockDirective__VariableAssignment_2
            {
            pushFollow(FOLLOW_rule__LockDirective__VariableAssignment_2_in_rule__LockDirective__Group__2__Impl5844);
            rule__LockDirective__VariableAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLockDirectiveAccess().getVariableAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LockDirective__Group__2__Impl"


    // $ANTLR start "rule__LockDirective__Group__3"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2931:1: rule__LockDirective__Group__3 : rule__LockDirective__Group__3__Impl ;
    public final void rule__LockDirective__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2935:1: ( rule__LockDirective__Group__3__Impl )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2936:2: rule__LockDirective__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__LockDirective__Group__3__Impl_in_rule__LockDirective__Group__35874);
            rule__LockDirective__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LockDirective__Group__3"


    // $ANTLR start "rule__LockDirective__Group__3__Impl"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2942:1: rule__LockDirective__Group__3__Impl : ( ')' ) ;
    public final void rule__LockDirective__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2946:1: ( ( ')' ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2947:1: ( ')' )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2947:1: ( ')' )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2948:1: ')'
            {
             before(grammarAccess.getLockDirectiveAccess().getRightParenthesisKeyword_3()); 
            match(input,44,FOLLOW_44_in_rule__LockDirective__Group__3__Impl5902); 
             after(grammarAccess.getLockDirectiveAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LockDirective__Group__3__Impl"


    // $ANTLR start "rule__Domain__ElementsAssignment_0"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2970:1: rule__Domain__ElementsAssignment_0 : ( ruleonLoadBloc ) ;
    public final void rule__Domain__ElementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2974:1: ( ( ruleonLoadBloc ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2975:1: ( ruleonLoadBloc )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2975:1: ( ruleonLoadBloc )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2976:1: ruleonLoadBloc
            {
             before(grammarAccess.getDomainAccess().getElementsOnLoadBlocParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleonLoadBloc_in_rule__Domain__ElementsAssignment_05946);
            ruleonLoadBloc();

            state._fsp--;

             after(grammarAccess.getDomainAccess().getElementsOnLoadBlocParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__ElementsAssignment_0"


    // $ANTLR start "rule__Domain__ElementsAssignment_1"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2985:1: rule__Domain__ElementsAssignment_1 : ( ruleBloc ) ;
    public final void rule__Domain__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2989:1: ( ( ruleBloc ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2990:1: ( ruleBloc )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2990:1: ( ruleBloc )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:2991:1: ruleBloc
            {
             before(grammarAccess.getDomainAccess().getElementsBlocParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBloc_in_rule__Domain__ElementsAssignment_15977);
            ruleBloc();

            state._fsp--;

             after(grammarAccess.getDomainAccess().getElementsBlocParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__ElementsAssignment_1"


    // $ANTLR start "rule__Domain__ElementsAssignment_2"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3000:1: rule__Domain__ElementsAssignment_2 : ( ruleClass ) ;
    public final void rule__Domain__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3004:1: ( ( ruleClass ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3005:1: ( ruleClass )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3005:1: ( ruleClass )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3006:1: ruleClass
            {
             before(grammarAccess.getDomainAccess().getElementsClassParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleClass_in_rule__Domain__ElementsAssignment_26008);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getDomainAccess().getElementsClassParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__ElementsAssignment_2"


    // $ANTLR start "rule__Class__NameAssignment_1"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3015:1: rule__Class__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Class__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3019:1: ( ( RULE_ID ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3020:1: ( RULE_ID )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3020:1: ( RULE_ID )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3021:1: RULE_ID
            {
             before(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Class__NameAssignment_16039); 
             after(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__NameAssignment_1"


    // $ANTLR start "rule__Class__SuperTypeAssignment_2_1"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3030:1: rule__Class__SuperTypeAssignment_2_1 : ( ruleClass ) ;
    public final void rule__Class__SuperTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3034:1: ( ( ruleClass ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3035:1: ( ruleClass )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3035:1: ( ruleClass )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3036:1: ruleClass
            {
             before(grammarAccess.getClassAccess().getSuperTypeClassParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleClass_in_rule__Class__SuperTypeAssignment_2_16070);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getClassAccess().getSuperTypeClassParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__SuperTypeAssignment_2_1"


    // $ANTLR start "rule__OnLoadBloc__FilePathAssignment_4"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3045:1: rule__OnLoadBloc__FilePathAssignment_4 : ( RULE_STRING ) ;
    public final void rule__OnLoadBloc__FilePathAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3049:1: ( ( RULE_STRING ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3050:1: ( RULE_STRING )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3050:1: ( RULE_STRING )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3051:1: RULE_STRING
            {
             before(grammarAccess.getOnLoadBlocAccess().getFilePathSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__OnLoadBloc__FilePathAssignment_46101); 
             after(grammarAccess.getOnLoadBlocAccess().getFilePathSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnLoadBloc__FilePathAssignment_4"


    // $ANTLR start "rule__OnLoadBloc__FileNameAssignment_8"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3060:1: rule__OnLoadBloc__FileNameAssignment_8 : ( RULE_STRING ) ;
    public final void rule__OnLoadBloc__FileNameAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3064:1: ( ( RULE_STRING ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3065:1: ( RULE_STRING )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3065:1: ( RULE_STRING )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3066:1: RULE_STRING
            {
             before(grammarAccess.getOnLoadBlocAccess().getFileNameSTRINGTerminalRuleCall_8_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__OnLoadBloc__FileNameAssignment_86132); 
             after(grammarAccess.getOnLoadBlocAccess().getFileNameSTRINGTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnLoadBloc__FileNameAssignment_8"


    // $ANTLR start "rule__OnLoadBloc__CharacterIDAssignment_12"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3075:1: rule__OnLoadBloc__CharacterIDAssignment_12 : ( RULE_INT ) ;
    public final void rule__OnLoadBloc__CharacterIDAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3079:1: ( ( RULE_INT ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3080:1: ( RULE_INT )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3080:1: ( RULE_INT )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3081:1: RULE_INT
            {
             before(grammarAccess.getOnLoadBlocAccess().getCharacterIDINTTerminalRuleCall_12_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__OnLoadBloc__CharacterIDAssignment_126163); 
             after(grammarAccess.getOnLoadBlocAccess().getCharacterIDINTTerminalRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnLoadBloc__CharacterIDAssignment_12"


    // $ANTLR start "rule__OnLoadBloc__ScopeAssignment_16"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3090:1: rule__OnLoadBloc__ScopeAssignment_16 : ( ruleScopeType ) ;
    public final void rule__OnLoadBloc__ScopeAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3094:1: ( ( ruleScopeType ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3095:1: ( ruleScopeType )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3095:1: ( ruleScopeType )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3096:1: ruleScopeType
            {
             before(grammarAccess.getOnLoadBlocAccess().getScopeScopeTypeParserRuleCall_16_0()); 
            pushFollow(FOLLOW_ruleScopeType_in_rule__OnLoadBloc__ScopeAssignment_166194);
            ruleScopeType();

            state._fsp--;

             after(grammarAccess.getOnLoadBlocAccess().getScopeScopeTypeParserRuleCall_16_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnLoadBloc__ScopeAssignment_16"


    // $ANTLR start "rule__OnLoadBloc__CompactMicroAssignment_20_0"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3105:1: rule__OnLoadBloc__CompactMicroAssignment_20_0 : ( ( 'true' ) ) ;
    public final void rule__OnLoadBloc__CompactMicroAssignment_20_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3109:1: ( ( ( 'true' ) ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3110:1: ( ( 'true' ) )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3110:1: ( ( 'true' ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3111:1: ( 'true' )
            {
             before(grammarAccess.getOnLoadBlocAccess().getCompactMicroTrueKeyword_20_0_0()); 
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3112:1: ( 'true' )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3113:1: 'true'
            {
             before(grammarAccess.getOnLoadBlocAccess().getCompactMicroTrueKeyword_20_0_0()); 
            match(input,45,FOLLOW_45_in_rule__OnLoadBloc__CompactMicroAssignment_20_06230); 
             after(grammarAccess.getOnLoadBlocAccess().getCompactMicroTrueKeyword_20_0_0()); 

            }

             after(grammarAccess.getOnLoadBlocAccess().getCompactMicroTrueKeyword_20_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnLoadBloc__CompactMicroAssignment_20_0"


    // $ANTLR start "rule__Bloc__NameAssignment_1"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3128:1: rule__Bloc__NameAssignment_1 : ( RULE_INT ) ;
    public final void rule__Bloc__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3132:1: ( ( RULE_INT ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3133:1: ( RULE_INT )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3133:1: ( RULE_INT )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3134:1: RULE_INT
            {
             before(grammarAccess.getBlocAccess().getNameINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Bloc__NameAssignment_16269); 
             after(grammarAccess.getBlocAccess().getNameINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bloc__NameAssignment_1"


    // $ANTLR start "rule__Bloc__DirectivesAssignment_3"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3143:1: rule__Bloc__DirectivesAssignment_3 : ( ruleDirective ) ;
    public final void rule__Bloc__DirectivesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3147:1: ( ( ruleDirective ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3148:1: ( ruleDirective )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3148:1: ( ruleDirective )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3149:1: ruleDirective
            {
             before(grammarAccess.getBlocAccess().getDirectivesDirectiveParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleDirective_in_rule__Bloc__DirectivesAssignment_36300);
            ruleDirective();

            state._fsp--;

             after(grammarAccess.getBlocAccess().getDirectivesDirectiveParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bloc__DirectivesAssignment_3"


    // $ANTLR start "rule__StrDirective__NameAssignment_0"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3158:1: rule__StrDirective__NameAssignment_0 : ( ruleStringDirective ) ;
    public final void rule__StrDirective__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3162:1: ( ( ruleStringDirective ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3163:1: ( ruleStringDirective )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3163:1: ( ruleStringDirective )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3164:1: ruleStringDirective
            {
             before(grammarAccess.getStrDirectiveAccess().getNameStringDirectiveParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleStringDirective_in_rule__StrDirective__NameAssignment_06331);
            ruleStringDirective();

            state._fsp--;

             after(grammarAccess.getStrDirectiveAccess().getNameStringDirectiveParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StrDirective__NameAssignment_0"


    // $ANTLR start "rule__StrDirective__ValueAssignment_2"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3173:1: rule__StrDirective__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__StrDirective__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3177:1: ( ( RULE_STRING ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3178:1: ( RULE_STRING )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3178:1: ( RULE_STRING )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3179:1: RULE_STRING
            {
             before(grammarAccess.getStrDirectiveAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StrDirective__ValueAssignment_26362); 
             after(grammarAccess.getStrDirectiveAccess().getValueSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StrDirective__ValueAssignment_2"


    // $ANTLR start "rule__IntDirective__NameAssignment_0"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3188:1: rule__IntDirective__NameAssignment_0 : ( ruleIntegerDirective ) ;
    public final void rule__IntDirective__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3192:1: ( ( ruleIntegerDirective ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3193:1: ( ruleIntegerDirective )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3193:1: ( ruleIntegerDirective )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3194:1: ruleIntegerDirective
            {
             before(grammarAccess.getIntDirectiveAccess().getNameIntegerDirectiveParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleIntegerDirective_in_rule__IntDirective__NameAssignment_06393);
            ruleIntegerDirective();

            state._fsp--;

             after(grammarAccess.getIntDirectiveAccess().getNameIntegerDirectiveParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntDirective__NameAssignment_0"


    // $ANTLR start "rule__IntDirective__ValueAssignment_2"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3203:1: rule__IntDirective__ValueAssignment_2 : ( RULE_INT ) ;
    public final void rule__IntDirective__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3207:1: ( ( RULE_INT ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3208:1: ( RULE_INT )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3208:1: ( RULE_INT )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3209:1: RULE_INT
            {
             before(grammarAccess.getIntDirectiveAccess().getValueINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntDirective__ValueAssignment_26424); 
             after(grammarAccess.getIntDirectiveAccess().getValueINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntDirective__ValueAssignment_2"


    // $ANTLR start "rule__VarDirective__NameAssignment_0"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3218:1: rule__VarDirective__NameAssignment_0 : ( ( 'VAR' ) ) ;
    public final void rule__VarDirective__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3222:1: ( ( ( 'VAR' ) ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3223:1: ( ( 'VAR' ) )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3223:1: ( ( 'VAR' ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3224:1: ( 'VAR' )
            {
             before(grammarAccess.getVarDirectiveAccess().getNameVARKeyword_0_0()); 
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3225:1: ( 'VAR' )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3226:1: 'VAR'
            {
             before(grammarAccess.getVarDirectiveAccess().getNameVARKeyword_0_0()); 
            match(input,20,FOLLOW_20_in_rule__VarDirective__NameAssignment_06460); 
             after(grammarAccess.getVarDirectiveAccess().getNameVARKeyword_0_0()); 

            }

             after(grammarAccess.getVarDirectiveAccess().getNameVARKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDirective__NameAssignment_0"


    // $ANTLR start "rule__VarDirective__LeftAssignment_2"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3241:1: rule__VarDirective__LeftAssignment_2 : ( RULE_ID ) ;
    public final void rule__VarDirective__LeftAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3245:1: ( ( RULE_ID ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3246:1: ( RULE_ID )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3246:1: ( RULE_ID )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3247:1: RULE_ID
            {
             before(grammarAccess.getVarDirectiveAccess().getLeftIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VarDirective__LeftAssignment_26499); 
             after(grammarAccess.getVarDirectiveAccess().getLeftIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDirective__LeftAssignment_2"


    // $ANTLR start "rule__VarDirective__RightAssignment_4"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3256:1: rule__VarDirective__RightAssignment_4 : ( RULE_ID ) ;
    public final void rule__VarDirective__RightAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3260:1: ( ( RULE_ID ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3261:1: ( RULE_ID )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3261:1: ( RULE_ID )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3262:1: RULE_ID
            {
             before(grammarAccess.getVarDirectiveAccess().getRightIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VarDirective__RightAssignment_46530); 
             after(grammarAccess.getVarDirectiveAccess().getRightIDTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDirective__RightAssignment_4"


    // $ANTLR start "rule__IfDirective__NameAssignment_0"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3271:1: rule__IfDirective__NameAssignment_0 : ( ( 'IF' ) ) ;
    public final void rule__IfDirective__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3275:1: ( ( ( 'IF' ) ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3276:1: ( ( 'IF' ) )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3276:1: ( ( 'IF' ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3277:1: ( 'IF' )
            {
             before(grammarAccess.getIfDirectiveAccess().getNameIFKeyword_0_0()); 
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3278:1: ( 'IF' )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3279:1: 'IF'
            {
             before(grammarAccess.getIfDirectiveAccess().getNameIFKeyword_0_0()); 
            match(input,21,FOLLOW_21_in_rule__IfDirective__NameAssignment_06566); 
             after(grammarAccess.getIfDirectiveAccess().getNameIFKeyword_0_0()); 

            }

             after(grammarAccess.getIfDirectiveAccess().getNameIFKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfDirective__NameAssignment_0"


    // $ANTLR start "rule__IfDirective__LeftAssignment_2"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3294:1: rule__IfDirective__LeftAssignment_2 : ( RULE_ID ) ;
    public final void rule__IfDirective__LeftAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3298:1: ( ( RULE_ID ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3299:1: ( RULE_ID )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3299:1: ( RULE_ID )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3300:1: RULE_ID
            {
             before(grammarAccess.getIfDirectiveAccess().getLeftIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__IfDirective__LeftAssignment_26605); 
             after(grammarAccess.getIfDirectiveAccess().getLeftIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfDirective__LeftAssignment_2"


    // $ANTLR start "rule__IfDirective__OperatorAssignment_3"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3309:1: rule__IfDirective__OperatorAssignment_3 : ( ruleoperator ) ;
    public final void rule__IfDirective__OperatorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3313:1: ( ( ruleoperator ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3314:1: ( ruleoperator )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3314:1: ( ruleoperator )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3315:1: ruleoperator
            {
             before(grammarAccess.getIfDirectiveAccess().getOperatorOperatorParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleoperator_in_rule__IfDirective__OperatorAssignment_36636);
            ruleoperator();

            state._fsp--;

             after(grammarAccess.getIfDirectiveAccess().getOperatorOperatorParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfDirective__OperatorAssignment_3"


    // $ANTLR start "rule__IfDirective__RightAssignment_4"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3324:1: rule__IfDirective__RightAssignment_4 : ( RULE_ID ) ;
    public final void rule__IfDirective__RightAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3328:1: ( ( RULE_ID ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3329:1: ( RULE_ID )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3329:1: ( RULE_ID )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3330:1: RULE_ID
            {
             before(grammarAccess.getIfDirectiveAccess().getRightIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__IfDirective__RightAssignment_46667); 
             after(grammarAccess.getIfDirectiveAccess().getRightIDTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfDirective__RightAssignment_4"


    // $ANTLR start "rule__IfDirective__DirectivesAssignment_7"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3339:1: rule__IfDirective__DirectivesAssignment_7 : ( ruleDirective ) ;
    public final void rule__IfDirective__DirectivesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3343:1: ( ( ruleDirective ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3344:1: ( ruleDirective )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3344:1: ( ruleDirective )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3345:1: ruleDirective
            {
             before(grammarAccess.getIfDirectiveAccess().getDirectivesDirectiveParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleDirective_in_rule__IfDirective__DirectivesAssignment_76698);
            ruleDirective();

            state._fsp--;

             after(grammarAccess.getIfDirectiveAccess().getDirectivesDirectiveParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfDirective__DirectivesAssignment_7"


    // $ANTLR start "rule__WaitDirective__NameAssignment_0"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3354:1: rule__WaitDirective__NameAssignment_0 : ( ( 'WAIT' ) ) ;
    public final void rule__WaitDirective__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3358:1: ( ( ( 'WAIT' ) ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3359:1: ( ( 'WAIT' ) )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3359:1: ( ( 'WAIT' ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3360:1: ( 'WAIT' )
            {
             before(grammarAccess.getWaitDirectiveAccess().getNameWAITKeyword_0_0()); 
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3361:1: ( 'WAIT' )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3362:1: 'WAIT'
            {
             before(grammarAccess.getWaitDirectiveAccess().getNameWAITKeyword_0_0()); 
            match(input,46,FOLLOW_46_in_rule__WaitDirective__NameAssignment_06734); 
             after(grammarAccess.getWaitDirectiveAccess().getNameWAITKeyword_0_0()); 

            }

             after(grammarAccess.getWaitDirectiveAccess().getNameWAITKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WaitDirective__NameAssignment_0"


    // $ANTLR start "rule__WaitDirective__TimeAssignment_2"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3377:1: rule__WaitDirective__TimeAssignment_2 : ( RULE_INT ) ;
    public final void rule__WaitDirective__TimeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3381:1: ( ( RULE_INT ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3382:1: ( RULE_INT )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3382:1: ( RULE_INT )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3383:1: RULE_INT
            {
             before(grammarAccess.getWaitDirectiveAccess().getTimeINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__WaitDirective__TimeAssignment_26773); 
             after(grammarAccess.getWaitDirectiveAccess().getTimeINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WaitDirective__TimeAssignment_2"


    // $ANTLR start "rule__LockDirective__NameAssignment_0"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3392:1: rule__LockDirective__NameAssignment_0 : ( ( 'LOCK' ) ) ;
    public final void rule__LockDirective__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3396:1: ( ( ( 'LOCK' ) ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3397:1: ( ( 'LOCK' ) )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3397:1: ( ( 'LOCK' ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3398:1: ( 'LOCK' )
            {
             before(grammarAccess.getLockDirectiveAccess().getNameLOCKKeyword_0_0()); 
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3399:1: ( 'LOCK' )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3400:1: 'LOCK'
            {
             before(grammarAccess.getLockDirectiveAccess().getNameLOCKKeyword_0_0()); 
            match(input,47,FOLLOW_47_in_rule__LockDirective__NameAssignment_06809); 
             after(grammarAccess.getLockDirectiveAccess().getNameLOCKKeyword_0_0()); 

            }

             after(grammarAccess.getLockDirectiveAccess().getNameLOCKKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LockDirective__NameAssignment_0"


    // $ANTLR start "rule__LockDirective__VariableAssignment_2"
    // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3415:1: rule__LockDirective__VariableAssignment_2 : ( RULE_ID ) ;
    public final void rule__LockDirective__VariableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3419:1: ( ( RULE_ID ) )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3420:1: ( RULE_ID )
            {
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3420:1: ( RULE_ID )
            // ../macroSDK.ui/src-gen/macroscipting/ui/contentassist/antlr/internal/InternalMacro.g:3421:1: RULE_ID
            {
             before(grammarAccess.getLockDirectiveAccess().getVariableIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__LockDirective__VariableAssignment_26848); 
             after(grammarAccess.getLockDirectiveAccess().getVariableIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LockDirective__VariableAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleDomain_in_entryRuleDomain61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomain68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__0_in_ruleDomain94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_entryRuleClass121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__0_in_ruleClass154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleonLoadBloc_in_entryRuleonLoadBloc181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleonLoadBloc188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OnLoadBloc__Group__0_in_ruleonLoadBloc214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBloc_in_entryRuleBloc241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBloc248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bloc__Group__0_in_ruleBloc274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirective_in_entryRuleDirective301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDirective308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Directive__Group__0_in_ruleDirective334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconditionnalDirective_in_entryRuleconditionnalDirective361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleconditionnalDirective368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConditionnalDirective__Alternatives_in_ruleconditionnalDirective394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestrDirective_in_entryRulestrDirective421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestrDirective428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StrDirective__Group__0_in_rulestrDirective454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleintDirective_in_entryRuleintDirective481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleintDirective488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntDirective__Group__0_in_ruleintDirective514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevarDirective_in_entryRulevarDirective541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevarDirective548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDirective__Group__0_in_rulevarDirective574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleifDirective_in_entryRuleifDirective601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleifDirective608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfDirective__Group__0_in_ruleifDirective634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulewaitDirective_in_entryRulewaitDirective661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulewaitDirective668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WaitDirective__Group__0_in_rulewaitDirective694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelockDirective_in_entryRulelockDirective721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulelockDirective728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LockDirective__Group__0_in_rulelockDirective754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleoperator_in_entryRuleoperator781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleoperator788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operator__Alternatives_in_ruleoperator814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerDirective_in_entryRuleIntegerDirective841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerDirective848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntegerDirective__Alternatives_in_ruleIntegerDirective874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringDirective_in_entryRuleStringDirective901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringDirective908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringDirective__Alternatives_in_ruleStringDirective934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScopeType_in_entryRuleScopeType961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScopeType968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScopeType__Alternatives_in_ruleScopeType994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OnLoadBloc__CompactMicroAssignment_20_0_in_rule__OnLoadBloc__Alternatives_201030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__OnLoadBloc__Alternatives_201049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleintDirective_in_rule__Directive__Alternatives_11083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestrDirective_in_rule__Directive__Alternatives_11100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevarDirective_in_rule__Directive__Alternatives_11117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconditionnalDirective_in_rule__Directive__Alternatives_11134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleifDirective_in_rule__ConditionnalDirective__Alternatives1166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulewaitDirective_in_rule__ConditionnalDirective__Alternatives1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelockDirective_in_rule__ConditionnalDirective__Alternatives1200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Operator__Alternatives1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Operator__Alternatives1253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__IntegerDirective__Alternatives1288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__IntegerDirective__Alternatives1308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__IntegerDirective__Alternatives1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__IntegerDirective__Alternatives1348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__StringDirective__Alternatives1383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__StringDirective__Alternatives1403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__StringDirective__Alternatives1423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__StringDirective__Alternatives1443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ScopeType__Alternatives1478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ScopeType__Alternatives1498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ScopeType__Alternatives1518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ScopeType__Alternatives1538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ScopeType__Alternatives1558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ScopeType__Alternatives1578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__0__Impl_in_rule__Domain__Group__01610 = new BitSet(new long[]{0x0000010010000000L});
    public static final BitSet FOLLOW_rule__Domain__Group__1_in_rule__Domain__Group__01613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__ElementsAssignment_0_in_rule__Domain__Group__0__Impl1640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__1__Impl_in_rule__Domain__Group__11670 = new BitSet(new long[]{0x0000010010000000L});
    public static final BitSet FOLLOW_rule__Domain__Group__2_in_rule__Domain__Group__11673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__ElementsAssignment_1_in_rule__Domain__Group__1__Impl1700 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__2__Impl_in_rule__Domain__Group__21731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__ElementsAssignment_2_in_rule__Domain__Group__2__Impl1758 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__Class__Group__0__Impl_in_rule__Class__Group__01795 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Class__Group__1_in_rule__Class__Group__01798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Class__Group__0__Impl1826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__1__Impl_in_rule__Class__Group__11857 = new BitSet(new long[]{0x00000000A0000000L});
    public static final BitSet FOLLOW_rule__Class__Group__2_in_rule__Class__Group__11860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__NameAssignment_1_in_rule__Class__Group__1__Impl1887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__2__Impl_in_rule__Class__Group__21917 = new BitSet(new long[]{0x00000000A0000000L});
    public static final BitSet FOLLOW_rule__Class__Group__3_in_rule__Class__Group__21920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_2__0_in_rule__Class__Group__2__Impl1947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__3__Impl_in_rule__Class__Group__31978 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Class__Group__4_in_rule__Class__Group__31981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Class__Group__3__Impl2009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__4__Impl_in_rule__Class__Group__42040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Class__Group__4__Impl2068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_2__0__Impl_in_rule__Class__Group_2__02109 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Class__Group_2__1_in_rule__Class__Group_2__02112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Class__Group_2__0__Impl2140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group_2__1__Impl_in_rule__Class__Group_2__12171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__SuperTypeAssignment_2_1_in_rule__Class__Group_2__1__Impl2198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OnLoadBloc__Group__0__Impl_in_rule__OnLoadBloc__Group__02232 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__OnLoadBloc__Group__1_in_rule__OnLoadBloc__Group__02235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__OnLoadBloc__Group__0__Impl2263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OnLoadBloc__Group__1__Impl_in_rule__OnLoadBloc__Group__12294 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__OnLoadBloc__Group__2_in_rule__OnLoadBloc__Group__12297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__OnLoadBloc__Group__1__Impl2325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OnLoadBloc__Group__2__Impl_in_rule__OnLoadBloc__Group__22356 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__OnLoadBloc__Group__3_in_rule__OnLoadBloc__Group__22359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__OnLoadBloc__Group__2__Impl2387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OnLoadBloc__Group__3__Impl_in_rule__OnLoadBloc__Group__32418 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__OnLoadBloc__Group__4_in_rule__OnLoadBloc__Group__32421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__OnLoadBloc__Group__3__Impl2449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OnLoadBloc__Group__4__Impl_in_rule__OnLoadBloc__Group__42480 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__OnLoadBloc__Group__5_in_rule__OnLoadBloc__Group__42483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OnLoadBloc__FilePathAssignment_4_in_rule__OnLoadBloc__Group__4__Impl2510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OnLoadBloc__Group__5__Impl_in_rule__OnLoadBloc__Group__52540 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__OnLoadBloc__Group__6_in_rule__OnLoadBloc__Group__52543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__OnLoadBloc__Group__5__Impl2571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OnLoadBloc__Group__6__Impl_in_rule__OnLoadBloc__Group__62602 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__OnLoadBloc__Group__7_in_rule__OnLoadBloc__Group__62605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__OnLoadBloc__Group__6__Impl2633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OnLoadBloc__Group__7__Impl_in_rule__OnLoadBloc__Group__72664 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__OnLoadBloc__Group__8_in_rule__OnLoadBloc__Group__72667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__OnLoadBloc__Group__7__Impl2695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OnLoadBloc__Group__8__Impl_in_rule__OnLoadBloc__Group__82726 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__OnLoadBloc__Group__9_in_rule__OnLoadBloc__Group__82729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OnLoadBloc__FileNameAssignment_8_in_rule__OnLoadBloc__Group__8__Impl2756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OnLoadBloc__Group__9__Impl_in_rule__OnLoadBloc__Group__92786 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__OnLoadBloc__Group__10_in_rule__OnLoadBloc__Group__92789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__OnLoadBloc__Group__9__Impl2817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OnLoadBloc__Group__10__Impl_in_rule__OnLoadBloc__Group__102848 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__OnLoadBloc__Group__11_in_rule__OnLoadBloc__Group__102851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__OnLoadBloc__Group__10__Impl2879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OnLoadBloc__Group__11__Impl_in_rule__OnLoadBloc__Group__112910 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__OnLoadBloc__Group__12_in_rule__OnLoadBloc__Group__112913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__OnLoadBloc__Group__11__Impl2941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OnLoadBloc__Group__12__Impl_in_rule__OnLoadBloc__Group__122972 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__OnLoadBloc__Group__13_in_rule__OnLoadBloc__Group__122975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OnLoadBloc__CharacterIDAssignment_12_in_rule__OnLoadBloc__Group__12__Impl3002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OnLoadBloc__Group__13__Impl_in_rule__OnLoadBloc__Group__133032 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__OnLoadBloc__Group__14_in_rule__OnLoadBloc__Group__133035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__OnLoadBloc__Group__13__Impl3063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OnLoadBloc__Group__14__Impl_in_rule__OnLoadBloc__Group__143094 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__OnLoadBloc__Group__15_in_rule__OnLoadBloc__Group__143097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__OnLoadBloc__Group__14__Impl3125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OnLoadBloc__Group__15__Impl_in_rule__OnLoadBloc__Group__153156 = new BitSet(new long[]{0x000000000FC00000L});
    public static final BitSet FOLLOW_rule__OnLoadBloc__Group__16_in_rule__OnLoadBloc__Group__153159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__OnLoadBloc__Group__15__Impl3187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OnLoadBloc__Group__16__Impl_in_rule__OnLoadBloc__Group__163218 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__OnLoadBloc__Group__17_in_rule__OnLoadBloc__Group__163221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OnLoadBloc__ScopeAssignment_16_in_rule__OnLoadBloc__Group__16__Impl3248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OnLoadBloc__Group__17__Impl_in_rule__OnLoadBloc__Group__173278 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__OnLoadBloc__Group__18_in_rule__OnLoadBloc__Group__173281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__OnLoadBloc__Group__17__Impl3309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OnLoadBloc__Group__18__Impl_in_rule__OnLoadBloc__Group__183340 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__OnLoadBloc__Group__19_in_rule__OnLoadBloc__Group__183343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__OnLoadBloc__Group__18__Impl3371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OnLoadBloc__Group__19__Impl_in_rule__OnLoadBloc__Group__193402 = new BitSet(new long[]{0x0000200000000800L});
    public static final BitSet FOLLOW_rule__OnLoadBloc__Group__20_in_rule__OnLoadBloc__Group__193405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__OnLoadBloc__Group__19__Impl3433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OnLoadBloc__Group__20__Impl_in_rule__OnLoadBloc__Group__203464 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__OnLoadBloc__Group__21_in_rule__OnLoadBloc__Group__203467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OnLoadBloc__Alternatives_20_in_rule__OnLoadBloc__Group__20__Impl3494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OnLoadBloc__Group__21__Impl_in_rule__OnLoadBloc__Group__213524 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__OnLoadBloc__Group__22_in_rule__OnLoadBloc__Group__213527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__OnLoadBloc__Group__21__Impl3555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OnLoadBloc__Group__22__Impl_in_rule__OnLoadBloc__Group__223586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__OnLoadBloc__Group__22__Impl3614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bloc__Group__0__Impl_in_rule__Bloc__Group__03691 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Bloc__Group__1_in_rule__Bloc__Group__03694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Bloc__Group__0__Impl3722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bloc__Group__1__Impl_in_rule__Bloc__Group__13753 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Bloc__Group__2_in_rule__Bloc__Group__13756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bloc__NameAssignment_1_in_rule__Bloc__Group__1__Impl3783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bloc__Group__2__Impl_in_rule__Bloc__Group__23813 = new BitSet(new long[]{0x0000020040000000L});
    public static final BitSet FOLLOW_rule__Bloc__Group__3_in_rule__Bloc__Group__23816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Bloc__Group__2__Impl3844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bloc__Group__3__Impl_in_rule__Bloc__Group__33875 = new BitSet(new long[]{0x0000020040000000L});
    public static final BitSet FOLLOW_rule__Bloc__Group__4_in_rule__Bloc__Group__33878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Bloc__DirectivesAssignment_3_in_rule__Bloc__Group__3__Impl3905 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_rule__Bloc__Group__4__Impl_in_rule__Bloc__Group__43936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Bloc__Group__4__Impl3964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Directive__Group__0__Impl_in_rule__Directive__Group__04005 = new BitSet(new long[]{0x0000C000003FC000L});
    public static final BitSet FOLLOW_rule__Directive__Group__1_in_rule__Directive__Group__04008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Directive__Group__0__Impl4036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Directive__Group__1__Impl_in_rule__Directive__Group__14067 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Directive__Group__2_in_rule__Directive__Group__14070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Directive__Alternatives_1_in_rule__Directive__Group__1__Impl4097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Directive__Group__2__Impl_in_rule__Directive__Group__24127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Directive__Group__2__Impl4155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StrDirective__Group__0__Impl_in_rule__StrDirective__Group__04192 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__StrDirective__Group__1_in_rule__StrDirective__Group__04195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StrDirective__NameAssignment_0_in_rule__StrDirective__Group__0__Impl4222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StrDirective__Group__1__Impl_in_rule__StrDirective__Group__14252 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__StrDirective__Group__2_in_rule__StrDirective__Group__14255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__StrDirective__Group__1__Impl4283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StrDirective__Group__2__Impl_in_rule__StrDirective__Group__24314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StrDirective__ValueAssignment_2_in_rule__StrDirective__Group__2__Impl4341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntDirective__Group__0__Impl_in_rule__IntDirective__Group__04377 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__IntDirective__Group__1_in_rule__IntDirective__Group__04380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntDirective__NameAssignment_0_in_rule__IntDirective__Group__0__Impl4407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntDirective__Group__1__Impl_in_rule__IntDirective__Group__14437 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__IntDirective__Group__2_in_rule__IntDirective__Group__14440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__IntDirective__Group__1__Impl4468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntDirective__Group__2__Impl_in_rule__IntDirective__Group__24499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntDirective__ValueAssignment_2_in_rule__IntDirective__Group__2__Impl4526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDirective__Group__0__Impl_in_rule__VarDirective__Group__04562 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__VarDirective__Group__1_in_rule__VarDirective__Group__04565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDirective__NameAssignment_0_in_rule__VarDirective__Group__0__Impl4592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDirective__Group__1__Impl_in_rule__VarDirective__Group__14622 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VarDirective__Group__2_in_rule__VarDirective__Group__14625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__VarDirective__Group__1__Impl4653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDirective__Group__2__Impl_in_rule__VarDirective__Group__24684 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__VarDirective__Group__3_in_rule__VarDirective__Group__24687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDirective__LeftAssignment_2_in_rule__VarDirective__Group__2__Impl4714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDirective__Group__3__Impl_in_rule__VarDirective__Group__34744 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VarDirective__Group__4_in_rule__VarDirective__Group__34747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__VarDirective__Group__3__Impl4775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDirective__Group__4__Impl_in_rule__VarDirective__Group__44806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDirective__RightAssignment_4_in_rule__VarDirective__Group__4__Impl4833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfDirective__Group__0__Impl_in_rule__IfDirective__Group__04873 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__IfDirective__Group__1_in_rule__IfDirective__Group__04876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfDirective__NameAssignment_0_in_rule__IfDirective__Group__0__Impl4903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfDirective__Group__1__Impl_in_rule__IfDirective__Group__14933 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__IfDirective__Group__2_in_rule__IfDirective__Group__14936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__IfDirective__Group__1__Impl4964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfDirective__Group__2__Impl_in_rule__IfDirective__Group__24995 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__IfDirective__Group__3_in_rule__IfDirective__Group__24998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfDirective__LeftAssignment_2_in_rule__IfDirective__Group__2__Impl5025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfDirective__Group__3__Impl_in_rule__IfDirective__Group__35055 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__IfDirective__Group__4_in_rule__IfDirective__Group__35058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfDirective__OperatorAssignment_3_in_rule__IfDirective__Group__3__Impl5085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfDirective__Group__4__Impl_in_rule__IfDirective__Group__45115 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__IfDirective__Group__5_in_rule__IfDirective__Group__45118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfDirective__RightAssignment_4_in_rule__IfDirective__Group__4__Impl5145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfDirective__Group__5__Impl_in_rule__IfDirective__Group__55175 = new BitSet(new long[]{0x0000020060000000L});
    public static final BitSet FOLLOW_rule__IfDirective__Group__6_in_rule__IfDirective__Group__55178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__IfDirective__Group__5__Impl5206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfDirective__Group__6__Impl_in_rule__IfDirective__Group__65237 = new BitSet(new long[]{0x0000020060000000L});
    public static final BitSet FOLLOW_rule__IfDirective__Group__7_in_rule__IfDirective__Group__65240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__IfDirective__Group__6__Impl5269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfDirective__Group__7__Impl_in_rule__IfDirective__Group__75302 = new BitSet(new long[]{0x0000020060000000L});
    public static final BitSet FOLLOW_rule__IfDirective__Group__8_in_rule__IfDirective__Group__75305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfDirective__DirectivesAssignment_7_in_rule__IfDirective__Group__7__Impl5332 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_rule__IfDirective__Group__8__Impl_in_rule__IfDirective__Group__85363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__IfDirective__Group__8__Impl5392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WaitDirective__Group__0__Impl_in_rule__WaitDirective__Group__05443 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__WaitDirective__Group__1_in_rule__WaitDirective__Group__05446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WaitDirective__NameAssignment_0_in_rule__WaitDirective__Group__0__Impl5473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WaitDirective__Group__1__Impl_in_rule__WaitDirective__Group__15503 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__WaitDirective__Group__2_in_rule__WaitDirective__Group__15506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__WaitDirective__Group__1__Impl5534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WaitDirective__Group__2__Impl_in_rule__WaitDirective__Group__25565 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__WaitDirective__Group__3_in_rule__WaitDirective__Group__25568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WaitDirective__TimeAssignment_2_in_rule__WaitDirective__Group__2__Impl5595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WaitDirective__Group__3__Impl_in_rule__WaitDirective__Group__35625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__WaitDirective__Group__3__Impl5653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LockDirective__Group__0__Impl_in_rule__LockDirective__Group__05692 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__LockDirective__Group__1_in_rule__LockDirective__Group__05695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LockDirective__NameAssignment_0_in_rule__LockDirective__Group__0__Impl5722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LockDirective__Group__1__Impl_in_rule__LockDirective__Group__15752 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LockDirective__Group__2_in_rule__LockDirective__Group__15755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__LockDirective__Group__1__Impl5783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LockDirective__Group__2__Impl_in_rule__LockDirective__Group__25814 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__LockDirective__Group__3_in_rule__LockDirective__Group__25817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LockDirective__VariableAssignment_2_in_rule__LockDirective__Group__2__Impl5844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LockDirective__Group__3__Impl_in_rule__LockDirective__Group__35874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__LockDirective__Group__3__Impl5902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleonLoadBloc_in_rule__Domain__ElementsAssignment_05946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBloc_in_rule__Domain__ElementsAssignment_15977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_rule__Domain__ElementsAssignment_26008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Class__NameAssignment_16039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_rule__Class__SuperTypeAssignment_2_16070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__OnLoadBloc__FilePathAssignment_46101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__OnLoadBloc__FileNameAssignment_86132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__OnLoadBloc__CharacterIDAssignment_126163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScopeType_in_rule__OnLoadBloc__ScopeAssignment_166194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__OnLoadBloc__CompactMicroAssignment_20_06230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Bloc__NameAssignment_16269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirective_in_rule__Bloc__DirectivesAssignment_36300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringDirective_in_rule__StrDirective__NameAssignment_06331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StrDirective__ValueAssignment_26362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerDirective_in_rule__IntDirective__NameAssignment_06393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntDirective__ValueAssignment_26424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__VarDirective__NameAssignment_06460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VarDirective__LeftAssignment_26499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VarDirective__RightAssignment_46530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__IfDirective__NameAssignment_06566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__IfDirective__LeftAssignment_26605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleoperator_in_rule__IfDirective__OperatorAssignment_36636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__IfDirective__RightAssignment_46667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirective_in_rule__IfDirective__DirectivesAssignment_76698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__WaitDirective__NameAssignment_06734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__WaitDirective__TimeAssignment_26773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__LockDirective__NameAssignment_06809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__LockDirective__VariableAssignment_26848 = new BitSet(new long[]{0x0000000000000002L});

}